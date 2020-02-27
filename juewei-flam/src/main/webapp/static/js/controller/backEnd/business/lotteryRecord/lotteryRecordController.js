require(['lotteryRecordService'], function () {})
define(
    ['app', 'layui', 'lotteryRecordService'],
    function (app, layui) {
        app.controller('lotteryRecordController', ['$scope', 'commonService', 'lotteryRecordService','$http', function ($scope, commonService, lotteryRecordService,$http) {
            let $this = this;
            $scope.config = {
                lotteryRecordTableInit: function () {
                    let layTable = layui.table.render({
                        id:'lotteryRecordTableId',
                        elem: '#lotteryRecordTable',
                        height: 'full-150',
                        even: true,
                        url: commonService.webName('/lotteryRecord/lotteryRecordList'),
                        method: 'post',
                        where: {},
                        page: true,
                        contentType: 'application/json',
                        toolbar: '#tableTools',
                        cols: [[
                            {field: 'checkbox', title: '选择', type: "radio"},
                            {field: 'id', title: 'ID', hide: true},
                            {field: 'xuhao', title: '序号', type: "numbers"},
                            {field: 'lotteryDate', title: '开奖时间', hide: false},
                            {field: 'lotteryPeriod', title: '开奖期数'},
                            {field: 'updatedTime', title: '更新时间', hide: true},
                            {field: 'predictionPics', title: '图片数量'},
                            {field: 'lotteryPeriod', title: '添加图片',toolbar:'#addImg'},
                        ]],
                        done: function(res, curr, count){
                        },
                        parseData: function (res) {
                            if (res.code != 0) {
                                return {
                                    "code": 500,
                                    "msg": JSON.stringify(res.msgs)
                                };
                            }
                            res.data = res.data.map(items => {
                                items.predictionPics = items.predictionPic?items.predictionPic.length:0;
                                return items;
                            })
                            return {
                                "code": res.code,
                                "msg": JSON.stringify(res.msgs),
                                "count": res.pageInfo.total,
                                "data": res.data
                            };
                        },
                        loading: true,
                        request: {
                            pageName: 'page'
                            , limitName: 'pageSize'
                        },
                        limits: [10, 20, 30, 40, 50, 60, 70, 80, 90],
                        title: "中奖记录",
                        defaultToolbar: ['filter', 'print', 'exports', {
                            title: '中奖记录列表信息',
                            layEvent: 'LAYTABLE_TIPS',
                            icon: 'layui-icon-tips',
                        }],
                    });
                    layui.table.on('tool(lotteryRecordListFilter)',function(obj){
                        let doEvent = obj.event;

                        if(doEvent === 'addimg'){
                            layui.layer.open({
                                type:1,
                                shadeClose:true,
                                area:['720px','500px'],
                                content:`<div id="clickAddImg" style="padding: 20px;">
                                <div id="uploader"></div>
                                <script src="js/lib/easyU.js"></script>
                            </div>`,
                                success:function(){
                                    let saveData = obj.data.predictionPic?obj.data.predictionPic:[];
                                    saveData = saveData.map((items,indexs) => {
                                        items.imgId = items.id;
                                        items.id = getRandomId();
                                        return items;
                                    })
                                    debugger
                                    var uploader = easyUploader({
                                        imageList:saveData,
                                        id: "uploader",
                                        accept: '.jpg,.png,',
                                        action: commonService.webName('/fileRecord/fileUpload'),
                                        dataFormat: 'formData',
                                        maxCount: 10,
                                        maxSize: 3,
                                        multiple: true,
                                        data: null,
                                        delImg:function(data){
                                            if(data.imgId){
                                                $.ajax({
                                                    url:commonService.webName('/fileRecord/delete')+"/"+data.imgId,
                                                    type:'DELETE',
                                                    async:false,
                                                    dataType:'json',
                                                    contentType:'application/json;charset=UTF-8',
                                                    success : function(data) {
                                                        if(data&&data.code==='0'){
                                                            layui.layer.msg("删除成功")
                                                        }else{
                                                            layui.layer.msg("删除失败")
                                                        }
                                                    },
                                                    error:function(data){
                                                        layui.layer.msg("删除失败")
                                                    }
                                                })

                                            }
                                        },
                                        beforeUpload: function(file, data, args) {

                                        },
                                        updateData:function(data){
                                            let urlAnd = "";
                                            let updateFormData = new FormData();
                                            data.map(filesList => {
                                                if(filesList.file){
                                                    updateFormData.append('uploadFile',filesList.file);
                                                    urlAnd+=("&titles="+filesList.name);
                                                }
                                            });
                                            $.ajax({
                                                url: commonService.webName('/fileRecord/fileUpload')+"?lotteryRecordId="+obj.data.id+urlAnd,
                                                type: "POST",
                                                contentType: false,
                                                data: updateFormData,
                                                async : false,
                                                processData: false,
                                                success: function (res) {
                                                    if(res&&res.code==='0'){
                                                        layui.layer.msg("保存成功")
                                                        $scope.lotteryRecordTable.reload({});
                                                        layui.layer.closeAll();
                                                    }else{
                                                        layui.layer.msg("保存失败")
                                                    }
                                                },
                                                error: function (err) {
                                                    layui.layer.message("保存失败")
                                                }
                                            });
                                        },
                                        onChange: function(fileList) {

                                        },
                                        onRemove: function(removedFiles, files) {
                                            console.log('onRemove', removedFiles);
                                        },
                                        onSuccess: function(res) {
                                            console.log('onSuccess', res);
                                        },
                                        onError: function(err) {
                                            console.log('onError', err);
                                        },
                                    });
                                },
                                cancel:function(){
                                    $scope.lotteryRecordTable.reload({});
                                }
                            });
                        }
                    });
                    return layTable;
                },
                lotteryRecordTableToolbarEvent:function(obj){
                    let layEvent = obj.event;
                    debugger
                    if(layEvent === 'add'){
                        layui.layer.ready(function () {
                            $scope.openAddDictionaryPageLayerIndex = layui.layer.open({
                                title: "添加中奖记录",
                                type: 1,
                                area: '350px',
                                offset: ['10%','40%'],
                                shade: [0.8, '#393D49'],
                                anim: 3,
                                scrollbar: true,
                                content: $('#lotteryRecordAddPage'),
                                cancel: function (index, layero) {
                                    layui.layer.close(index);
                                    $scope.lotteryRecordAddPageFlag = false;
                                    return false;
                                },
                                success: function (layero, index) {
                                    $scope.numberArray = lotteryRecordService.numberInit();
                                    $scope.typeArray = lotteryRecordService.TypesInit();
                                    $scope.lotteryRecord = {};
                                    $scope.lotteryRecord.lotteryRecordDetails=lotteryRecordService.lotteryRecordDetailInit();
                                    $scope.lotteryRecordAddPageFlag = true;
                                    let time = commonService.dateField();
                                    $scope.lotteryRecord.lotteryDate = time;
                                    layui.laydate.render({
                                        elem: '#lotteryDateAdd',
                                        type:'datetime',
                                        format:'yyyy-MM-dd HH:mm:ss',
                                        value: time,
                                        done: function(value, date, endDate){
                                            $scope.lotteryRecord.lotteryDate = value;
                                        }
                                    });

                                    $scope.$apply();
                                    let mask = $(".layui-layer-shade");
                                    mask.appendTo(layero.parent());
                                }
                            });
                        });
                    } else if(layEvent === 'edit'){
                        $scope.lotteryRecord = {};
                        layui.layer.ready(function () {
                            $scope.openUpdatlotteryRecordPageLayerIndex = layui.layer.open({
                                title: "修改中奖记录",
                                type: 1,
                                area: '350px',
                                offset: ['10%','40%'],
                                shade: [0.8, '#393D49'],
                                anim: 3,
                                scrollbar: true,
                                content: $('#lotteryRecordUpdatePage'),
                                cancel: function (index, layero) {
                                    layui.layer.close(index);
                                    $scope.lotteryRecordUpdatePageFlag = false;
                                    return false;
                                },
                                success: function (layero, index) {
                                    $scope.numberArray = lotteryRecordService.numberInit();
                                    $scope.typeArray = lotteryRecordService.TypesInit();
                                    let checkRow = layui.table.checkStatus('lotteryRecordTableId');
                                    if(checkRow==null||checkRow.data==null||checkRow.data.length!=1){
                                        layui.layer.close(index);
                                        layui.layer.msg('请勾选一个中奖记录', function () {});
                                        return;
                                    }
                                    $scope.lotteryRecordUpdatePageFlag = true;
                                    $scope.lotteryRecord=checkRow.data[0];
                                    layui.laydate.render({
                                        elem: '#lotteryDateUpdate',
                                        type:'datetime',
                                        format:'yyyy-MM-dd HH:mm:ss',
                                        value: $scope.lotteryRecord.lotteryDate,
                                        done: function(value, date, endDate){
                                            $scope.lotteryRecord.lotteryDate = value;
                                        }
                                    });
                                    $scope.$apply();
                                    let mask = $(".layui-layer-shade");
                                    mask.appendTo(layero.parent());
                                }
                            });
                        });
                    } else if(layEvent === 'delete'){
                        let checkRow = layui.table.checkStatus('lotteryRecordTableId');
                        if(checkRow==null||checkRow.data==null||checkRow.data.length!=1){
                            layui.layer.msg('请选择一个中奖记录', function () {});
                            return;
                        }
                        layer.confirm('确认删除?', function(index){
                            let data = lotteryRecordService.lotteryRecordDelete(checkRow.data[0].id);
                            if (data.code == 0) {
                                $scope.lotteryRecordTable.reload({});
                            } else {
                                layui.layer.msg('删除出错：'+JSON.stringify(data.msgs), function () {});
                                return;
                            }
                            layer.close(index);
                        });
                    } else if(layEvent === 'LAYTABLE_TIPS'){
                        layer.alert('这是中奖记录列表页面');
                    }
                },
                lotteryRecordAdd:function () {
                    if ($scope.lotteryRecord.lotteryDate == null || $scope.lotteryRecord.lotteryDate == '') {
                        layui.layer.msg('开奖时间不能为空', function () {});
                        return;
                    }
                    if ($scope.lotteryRecord.lotteryPeriod == null || $scope.lotteryRecord.lotteryPeriod == '') {
                        layui.layer.msg('开奖期数不能为空', function () {});
                        return;
                    }
                    for(let i=0;i<$scope.lotteryRecord.lotteryRecordDetails.length;i++){
                        let currEle = $scope.lotteryRecord.lotteryRecordDetails[i];
                        if (currEle.number == null || currEle.number == '') {
                            layui.layer.msg('中奖数不能为空', function () {});
                            return;
                        }
                        if (currEle.type == null || currEle.type == '') {
                            layui.layer.msg('类型不能为空', function () {});
                            return;
                        }
                        if(currEle.type!=0&&currEle.type!=1){
                            layui.layer.msg('类型存在错误数据只能为1或者0', function () {});
                            return;
                        }
                        if(currEle.seq==null||currEle.seq==''){
                            layui.layer.msg('序号不能为空', function () {});
                            return;
                        }
                        let seqFlag =currEle.seq!=1&&currEle.seq!=2&&currEle.seq!=3&&currEle.seq!=4&&currEle.seq!=5&&currEle.seq!=6&&currEle.seq!=7;
                        if(seqFlag){
                            layui.layer.msg('序号只能为空1,2,3,4,5,6,7', function () {});
                            return;
                        }
                    }
                    let data = lotteryRecordService.lotteryRecordAdd($scope.lotteryRecord);
                    if (data.code == 0) {
                        $scope.lotteryRecordAddPageFlag = false;
                        layui.layer.close($scope.openAddDictionaryPageLayerIndex);
                        $scope.lotteryRecordTable.reload({});
                    } else {
                        layui.layer.msg('添加出错：'+JSON.stringify(data.msgs), function () {});
                    }
                },
                lotteryRecordUpdate:function () {
                    if ($scope.lotteryRecord.id == null || $scope.lotteryRecord.id == '') {
                        layui.layer.msg('开奖记录ID不能为空', function () {});
                        return;
                    }
                    if ($scope.lotteryRecord.lotteryDate == null || $scope.lotteryRecord.lotteryDate == '') {
                        layui.layer.msg('开奖时间不能为空', function () {});
                        return;
                    }
                    if ($scope.lotteryRecord.lotteryPeriod == null || $scope.lotteryRecord.lotteryPeriod == '') {
                        layui.layer.msg('开奖期数不能为空', function () {});
                        return;
                    }
                    for(let i=0;i<$scope.lotteryRecord.lotteryRecordDetails.length;i++){
                        let currEle = $scope.lotteryRecord.lotteryRecordDetails[i];
                        if (currEle.id == null || currEle.id == '') {
                            layui.layer.msg('开奖记录详情ID不能为空', function () {});
                            return;
                        }
                        if (currEle.number == null || currEle.number == '') {
                            layui.layer.msg('中奖数不能为空', function () {});
                            return;
                        }
                        if (currEle.type == null || currEle.type == '') {
                            layui.layer.msg('类型不能为空', function () {});
                            return;
                        }
                        if(currEle.type!=0&&currEle.type!=1){
                            layui.layer.msg('类型存在错误数据只能为1或者0', function () {});
                            return;
                        }
                        if (currEle.lotteryRecordId == null || currEle.lotteryRecordId == ''||currEle.lotteryRecordId!=$scope.lotteryRecord.id) {
                            layui.layer.msg('开奖详情的开奖记录ID不能为空', function () {});
                            return;
                        }
                        if (currEle.seq == null || currEle.seq == '') {
                            layui.layer.msg('开奖详情的序号不能为空', function () {});
                            return;
                        }
                        let seqFlag =currEle.seq!=1&&currEle.seq!=2&&currEle.seq!=3&&currEle.seq!=4&&currEle.seq!=5&&currEle.seq!=6&&currEle.seq!=7;
                        if(seqFlag){
                            layui.layer.msg('序号只能为空1,2,3,4,5,6,7', function () {});
                            return;
                        }
                    }
                    let data = lotteryRecordService.lotteryRecordUpdate($scope.lotteryRecord);
                    if (data.code == 0) {
                        $scope.lotteryRecordUpdatePageFlag = false;
                        layui.layer.close($scope.openUpdatlotteryRecordPageLayerIndex);
                        $scope.lotteryRecordTable.reload({});
                    } else {
                        layui.layer.msg('添加出错：'+JSON.stringify(data.msgs), function () {});
                    }
                },
                lotteryRecordRandom:function(){
                   lotteryRecordService.lotteryRecordRandom($scope.lotteryRecord.lotteryRecordDetails,$scope.numberArray);
                },
                init: function () {
                    //初始化数据
                    $scope.lotteryRecordTable = this.lotteryRecordTableInit();
                    //监控工具条事件
                    layui.table.on('toolbar(lotteryRecordListFilter)', this.lotteryRecordTableToolbarEvent);
                },
            };
            $scope.config.init();
        }]);
    });
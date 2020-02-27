require(['dictionaryService'], function () {})
define(
    ['app', 'layui', 'dictionaryService'],
    function (app, layui) {
        app.controller('dictionaryController', ['$scope', 'commonService', 'dictionaryService', function ($scope, commonService, dictionaryService) {
            let $this = this;
            $scope.config = {
                dictionaryTypeTableInit: function () {
                    let layTable = layui.table.render({
                        id:'dictionaryTypeTableId',
                        elem: '#dictionaryTypeTable',
                        height: 'full-150',
                        toolbar: 'default',
                        title: "字典类型列表",
                        defaultToolbar:[],
                        loading: true,
                        request: {
                            pageName: 'page',
                            limitName: 'pageSize'
                        },
                        limits: [10, 20, 30, 40, 50, 60, 70, 80, 90],
                        url: commonService.webName('/dictionary/dictionaryTypeList') ,
                        method: 'post',
                        where: {},
                        page: true,
                        contentType: 'application/json',
                        /*headers: {token: 'sasasas'},*/
                        cols: [[
                            {field: 'checkbox', title: '选择', type: "radio"},
                            {field: 'id', title: 'ID', hide: true},
                            {field: 'name', title: '名称'},
                            {field: 'code', title: '编码', hide: true},
                            {field: 'desc', title: '描述', hide: true},
                            {field: 'createdId', title: '创建人', hide: true},
                            {field: 'updatedId', title: '更新人', hide: true},
                            {field: 'createdTime', title: '创建时间',hide: true},
                            {field: 'updatedTime', title: '更新时间', hide: true},
                        ]],
                        parseData: function (res) {
                            if (res.code != 0) {
                                return {
                                    "code": 500,
                                    "msg": JSON.stringify(res.msgs)
                                };
                            }
                            return {
                                "code": res.code,
                                "msg": JSON.stringify(res.msgs),
                                "count": res.pageInfo.total,
                                "data": res.data,
                            };
                        },
                    });
                    return layTable;
                },
                dictionaryTypeTableToolbarEvent:function(obj){
                    if('add'===obj.event){
                        layui.layer.ready(function () {
                            $scope.openAddDictionaryTypePageLayerIndex = layui.layer.open({
                                title: "添加字典类型",
                                type: 1,
                                area: '350px',
                                shade: [0.8, '#393D49'],
                                offset: ['10%','40%'],
                                anim: 3,
                                scrollbar: true,
                                content: $('#dictionaryTypeAddPage'), //这里content是一个DOM，注意：最好该元素要存放在body最外层，否则可能被其它的相对元素所影响
                                cancel: function (index, layero) {
                                    layui.layer.close(index)
                                    $scope.dictionaryTypeAddPageFlag = false;
                                    return false;
                                },
                                success: function (layero, index) {
                                    $scope.dictionaryType = {};
                                    $scope.dictionaryTypeAddPageFlag = true;
                                    $scope.$apply();
                                    let mask = $(".layui-layer-shade");
                                    mask.appendTo(layero.parent());
                                }
                            });
                        });
                    } else if('update'===obj.event){
                        layui.layer.ready(function () {
                            $scope.openUpdateDictionaryTypePageLayerIndex = layui.layer.open({
                                title: "修改字典类型",
                                type: 1,
                                area: '350px',
                                shade: [0.8, '#393D49'],
                                offset: ['10%','40%'],
                                anim: 3,
                                scrollbar: true,
                                content: $('#dictionaryTypeUpdatePage'), //这里content是一个DOM，注意：最好该元素要存放在body最外层，否则可能被其它的相对元素所影响
                                cancel: function (index, layero) {
                                    layui.layer.close(index)
                                    $scope.dictionaryTypeUpdatePageFlag = false;
                                    return false;
                                },
                                success: function (layero, index) {
                                    let checkData = layui.table.checkStatus('dictionaryTypeTableId');
                                    if(checkData==null||checkData.data==null||checkData.data.length!=1){
                                        layui.layer.close(index);
                                        layui.layer.msg('请选择一个字典类型', function () {});
                                        return;
                                    }
                                    $scope.dictionaryType = checkData.data[0];
                                    $scope.dictionaryTypeUpdatePageFlag = true;
                                    $scope.$apply();
                                    let mask = $(".layui-layer-shade");
                                    mask.appendTo(layero.parent());
                                }
                            });
                        });
                    } else if('delete'===obj.event){
                        let checkData = layui.table.checkStatus('dictionaryTypeTableId');
                        if(checkData==null||checkData.data==null||checkData.data.length!=1){
                            layui.layer.msg('请选择一个字典类型', function () {});
                            return;
                        }
                        layer.confirm('确认删除?', function(index){
                            let data = dictionaryService.dictionaryTypeDelete(checkData.data[0].id);
                            if (data.code == 0) {
                                layui.table.reload('dictionaryTypeTableId', {});
                            } else {
                                layui.layer.msg('删除出错：'+JSON.stringify(data.msgs), function () {});
                            }
                            layer.close(index);
                        });

                    } else if('LAYTABLE_TIPS'===obj.event){
                        layer.alert('这是字典列表页面');
                    }
                },
                dictionaryTypeCheckboxEvent:function(obj){
                    $scope.dictionaryTable.reload({
                        "where":{"dictionaryTypeId":obj.data.id}
                    });
                },
                dictionaryTypeAdd: function () {
                    if ($scope.dictionaryType.name == null || $scope.dictionaryType.name == '') {
                        layui.layer.msg('字典类型名字不能为空', function () {});
                        return;
                    }
                    let data = dictionaryService.dictionaryTypeAdd($scope.dictionaryType);
                    if (data.code == 0) {
                        $scope.dictionaryTypeAddPageFlag = false;
                        layui.layer.close($scope.openAddDictionaryTypePageLayerIndex);
                        layui.table.reload('dictionaryTypeTableId', {});
                    } else {
                        layui.layer.msg('添加出错：'+JSON.stringify(data.msgs), function () {});
                    }
                },
                dictionaryTypeUpdate: function () {
                    if ($scope.dictionaryType.id == null || $scope.dictionaryType.id == '') {
                        layui.layer.msg('字典类型ID不能为空', function () {});
                        return;
                    }
                    if ($scope.dictionaryType.name == null || $scope.dictionaryType.name == '') {
                        layui.layer.msg('字典类型名字不能为空', function () {});
                        return;
                    }
                    let data = dictionaryService.dictionaryTypeUpdate($scope.dictionaryType);
                    if (data.code == 0) {
                        $scope.dictionaryTypeAddPageFlag = false;
                        layui.layer.close($scope.openUpdateDictionaryTypePageLayerIndex);
                        layui.table.reload('dictionaryTypeTableId', {});
                        $scope.dictionaryTable.reload({});
                    } else {
                        layui.layer.msg('修改出错：'+JSON.stringify(data.msgs), function () {});
                    }
                },
                dictionaryTableInit: function () {
                    let layTable = layui.table.render({
                        id:'dictionaryTableId',
                        elem: '#dictionaryTable',
                        height: 'full-150',
                        even: true,
                        url: commonService.webName('/dictionary/dictionaryList'),
                        method: 'post',
                        where: {},
                        page: true,
                        contentType: 'application/json',
                        toolbar: '#tableTools',
                        /*headers: {token: 'sasasas'},*/
                        cols: [[
                            {field: 'checkbox', title: '选择', type: "checkbox"},
                            {field: 'xulie', title: '序列', type: "numbers"},
                            {field: 'id', title: 'ID', hide: true},
                            {field: 'name', title: '名称', sort: true},
                            {field: 'value', title: '值', sort: true},
                            {field: 'code', title: '编码', hide: true},
                            {field: 'desc', title: '描述'},
                            {field: 'dictionaryTypeId', title: '字典类型ID', hide: true},
                            {field: 'dictionaryTypeName', title: '字典类型', hide: false},
                            {field: 'createdId', title: '创建人', hide: true},
                            {field: 'updatedId', title: '更新人', hide: true},
                            {field: 'createdTime', title: '创建时间', hide: true},
                            {field: 'updatedTime', title: '更新时间', sort: true, hide: true},
                            {field: 'enabledFlag', title: '是否有效', hide: true},
                        ]],
                        parseData: function (res) {
                            if (res.code != 0) {
                                return {
                                    "code": 500,
                                    "msg": JSON.stringify(res.msgs)
                                };
                            }
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
                        title: "菜单",
                        defaultToolbar: ['filter', 'print', 'exports', {
                            title: '菜单列表信息' //标题
                            , layEvent: 'LAYTABLE_TIPS' //事件名，用于 toolbar 事件中使用
                            , icon: 'layui-icon-tips' //图标类名
                        }],
                    });
                    return layTable;
                },
                dictionaryTableToolbarEvent:function(obj){
                    let layEvent = obj.event;
                    if(layEvent === 'add'){
                        $scope.dictionary = {};
                        $scope.$apply();
                        layui.layer.ready(function () {
                            $scope.openAddDictionaryPageLayerIndex = layui.layer.open({
                                title: "添加字典",
                                type: 1,
                                area: '350px',
                                shade: [0.8, '#393D49'],
                                offset: ['10%','40%'],
                                //shadeClose:false,
                                anim: 3,
                                /*maxmin:true,*/
                                /*resize:false,*/
                                scrollbar: true,
                                content: $('#dictionaryAddPage'),
                                cancel: function (index, layero) {
                                    layui.layer.close(index);
                                    $scope.dictionaryAddPageFlag = false;
                                    return false;
                                },
                                success: function (layero, index) {
                                    let checkData = layui.table.checkStatus('dictionaryTypeTableId');
                                    if(checkData==null||checkData.data==null||checkData.data.length!=1){
                                        layui.layer.close(index);
                                        layui.layer.msg('请选择一个字典类型', function () {});
                                        return;
                                    }
                                    $scope.dictionaryAddPageFlag = true;
                                    $scope.dictionary.dictionaryTypeId=checkData.data[0].id;
                                    $scope.$apply();
                                    let mask = $(".layui-layer-shade");
                                    mask.appendTo(layero.parent());
                                }
                            });
                        });
                    } else if(layEvent === 'edit'){
                        $scope.dictionary = {};
                        $scope.$apply();
                        layui.layer.ready(function () {
                            $scope.openUpdatdictionaryPageLayerIndex = layui.layer.open({
                                title: "修改字典",
                                type: 1,
                                area: '350px',
                                shade: [0.8, '#393D49'],
                                offset: ['10%','40%'],
                                //shadeClose:false,
                                anim: 3,
                                /*maxmin:true,*/
                                /*resize:false,*/
                                scrollbar: true,
                                content: $('#dictionaryUpdatePage'),
                                cancel: function (index, layero) {
                                    layui.layer.close(index);
                                    $scope.dictionaryUpdatePageFlag = false;
                                    return false;
                                },
                                success: function (layero, index) {
                                    //设置字典类型ID
                                    let dictionaryTypes = layui.table.checkStatus('dictionaryTableId');
                                    if(dictionaryTypes==null||dictionaryTypes.data==null||dictionaryTypes.data.length!=1){
                                        layui.layer.close(index);
                                        layui.layer.msg('请勾选一个字典类型', function () {});
                                        return;
                                    }
                                    $scope.dictionaryUpdatePageFlag = true;
                                    $scope.dictionary=dictionaryTypes.data[0];
                                    let data = dictionaryService.dictionaryTypeList();
                                    if(data.code!=0){
                                        layui.layer.msg('获取字典类型出错：'+JSON.stringify(data.msgs), function () {});
                                        return;
                                    }
                                    $scope.dictionaryTypes = data.data;
                                    $scope.$apply();
                                    let mask = $(".layui-layer-shade");
                                    mask.appendTo(layero.parent());
                                }
                            });
                        });
                    } else if(layEvent === 'delete'){
                        let checkRow = layui.table.checkStatus('dictionaryTableId');
                        if(checkRow==null||checkRow.data==null||checkRow.data.length!=1){
                            layui.layer.msg('请选择一个字典', function () {});
                            return;
                        }
                        layer.confirm('确认删除?', function(index){
                            let data = dictionaryService.dictionaryDelete(checkRow.data[0].id);
                            if (data.code == 0) {
                                $scope.dictionaryTable.reload({});
                            } else {
                                layui.layer.msg('删除出错：'+JSON.stringify(data.msgs), function () {});
                                return;
                            }
                            layer.close(index);
                        });
                    } else if(layEvent === 'LAYTABLE_TIPS'){
                        layer.alert('这是字典列表页面');
                    }
                },
                dictionaryAdd:function () {
                    if ($scope.dictionary.name == null || $scope.dictionary.name == '') {
                        layui.layer.msg('字典名不能为空', function () {});
                        return;
                    }
                    if ($scope.dictionary.value == null || $scope.dictionary.value == '') {
                        layui.layer.msg('字典值不能为空', function () {});
                        return;
                    }
                    let data = dictionaryService.dictionaryAdd($scope.dictionary);
                    if (data.code == 0) {
                        $scope.dictionaryAddPageFlag = false;
                        layui.layer.close($scope.openAddDictionaryPageLayerIndex);
                        $scope.dictionaryTable.reload({});
                    } else {
                        layui.layer.msg('添加出错：'+JSON.stringify(data.msgs), function () {});
                    }
                },
                dictionaryUpdate:function () {
                    if ($scope.dictionary.id == null || $scope.dictionary.id == '') {
                        layui.layer.msg('字典ID不能为空', function () {});
                        return;
                    }
                    if ($scope.dictionary.name == null || $scope.dictionary.name == '') {
                        layui.layer.msg('字典名不能为空', function () {});
                        return;
                    }
                    if ($scope.dictionary.value == null || $scope.dictionary.value == '') {
                        layui.layer.msg('字典值不能为空', function () {});
                        return;
                    }
                    let data = dictionaryService.dictionaryUpdate($scope.dictionary);
                    if (data.code == 0) {
                        $scope.dictionaryUpdatePageFlag = false;
                        layui.layer.close($scope.openUpdatdictionaryPageLayerIndex);
                        $scope.dictionaryTable.reload({});
                    } else {
                        layui.layer.msg('添加出错：'+JSON.stringify(data.msgs), function () {});
                    }
                },
                init: function () {
                    //初始化数据
                    $scope.dictionaryTypeTable = this.dictionaryTypeTableInit();
                    $scope.dictionaryTable = this.dictionaryTableInit();
                    //监控工具条事件
                    layui.table.on('toolbar(dictionaryListFilter)', this.dictionaryTableToolbarEvent);
                    layui.table.on('toolbar(dictionaryTypeListFilter)', this.dictionaryTypeTableToolbarEvent);
                    //监控字典类型切换时间
                    layui.table.on('radio(dictionaryTypeListFilter)', this.dictionaryTypeCheckboxEvent);
                }
            };
            $scope.config.init();
        }]);
    });
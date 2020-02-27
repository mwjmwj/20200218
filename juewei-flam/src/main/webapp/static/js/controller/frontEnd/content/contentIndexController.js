define(
    ['app'],
    function(app){
        app.controller('contentIndexController', ['$scope','commonService','$http', function($scope,commonService,$http) {
            let getDateLotteryRecord = commonService.webName("/lotteryRecord/getNextLotteryResult");
            //window.$scope = $scope;
            $scope.numParseString = numParseString;
            $scope.numBallColor = numBallColor;
            $scope.openRecordList = [];

            //开始开奖
            $scope.startOpenRecord = function(){
                var ball = [$('#ball1')[0],$('#ball2')[0],$('#ball3')[0],$('#ball4')[0],$('#ball5')[0],$('#ball6')[0],$('#ball7')[0]];
                var stopball = [];
                setTimeout(() => {
                    ball.map(item => {
                    let gogogo1 = new BallAnim(item);
                gogogo1.play();
                stopball.push(gogogo1);
            })
            },100)

                setTimeout(() => {
                    let stopNum = 0;
                let mineTime = setInterval(() => {
                    if(stopball[stopNum]){
                    stopball[stopNum].stop($scope.openRecordList[stopNum].number,$scope.openRecordList[stopNum].zodiac);
                    stopNum++;
                }else{
                    clearInterval(mineTime)
                }
            },10000)
            },80000)

                /*let numList = 1;
                $scope.lotteryRecord.numList = [$scope.openRecordList[0]];
                $scope.lotteryRecord.tm = {number:'',zodiac:''};
                let openRecord = setInterval(function(){
                    if(numList<6){
                        $scope.lotteryRecord.numList.push($scope.openRecordList[numList]);
                    }
                    if(numList === 6){
                        $scope.lotteryRecord.tm = $scope.openRecordList[numList];
                    }
                    if(numList === 7){
                        clearInterval(openRecord);
                    }
                    $scope.$apply()
                    numList++;
                },10000)*/
            }

            //倒计时
            $scope.startTimeout = function(){
                let timeMove = setInterval(function(){
                    $scope.timeNextOpen = $scope.timeNextOpen?$scope.timeNextOpen:getNextDate();
                    $scope.timeNowOpen = new Date($scope.timeNowOpen);
                    $scope.timeNextOpen = new Date($scope.timeNextOpen);
                    let timeList = getRemainderTime($scope.timeNowOpen,$scope.timeNextOpen);
                    $scope.timeOpenDay = timeList.day;
                    $scope.timeOpenHour = timeList.hour;
                    $scope.timeOpenM = timeList.minute;
                    $scope.timeOpenS = timeList.second;
                    $scope.timeNowOpen = new Date(new Date($scope.timeNowOpen).getTime() + 1000);
                    if($scope.timeNowOpen.getTime() > $scope.timeNextOpen.getTime()){
                        /*clearInterval(timeMove);
                        $scope.timeOpenDay = "0";
                        $scope.timeOpenHour = "0";
                        $scope.timeOpenM = "0";
                        $scope.timeOpenS = "0";*/
                        $scope.timeNextOpen = getNextDate();
                        $scope.timeAfterPeriod = $scope.timeNextPeriod;
                        $.ajax({
                            url:getDateLotteryRecord+"?id="+$scope.nextOpenId,
                            type:'GET',
                            async:false,
                            dataType:'json',
                            contentType:'application/json;charset=UTF-8',
                            success : function(data) {
                                if(data&&data.code === '0'&&data.data&&data.data.lotteryRecordDetails){
                                    $scope.openRecordList = data.data.lotteryRecordDetails;
                                    $scope.startOpenRecord();
                                }
                            }
                        });
                        let getDateInt = setInterval(function(){
                            if($scope.openRecordList.length>0){
                                clearInterval(getDateInt)
                            }else{
                                $.ajax({
                                    url:getDateLotteryRecord+"?id="+$scope.nextOpenId,
                                    type:'GET',
                                    async:false,
                                    dataType:'json',
                                    contentType:'application/json;charset=UTF-8',
                                    success : function(data) {
                                        if(data&&data.code === '0'&&data.data&&data.data.lotteryRecordDetails){
                                            $scope.openRecordList = data.data.lotteryRecordDetails;
                                            $scope.startOpenRecord();
                                        }
                                    }
                                });
                            }
                        },5000);
                    }
                    $scope.$apply()
                },1000);
            }

            //初始化数据
            $scope.nextOpenId = "";
            $scope.timeNowOpen = "0000-00-00 00:00:00";
            $scope.timeAfterOpen = "0000-00-00 00:00:00";
            $scope.timeNextOpen = "";
            $scope.timeAfterOpen = "";
            $scope.timeAfterPeriod = "";
            $scope.timeNextPeriod = "";
            $scope.timeOpenDay = "0";
            $scope.timeOpenHour = "0";
            $scope.timeOpenM = "0";
            $scope.timeOpenS = "0";

            //初始化方法
            $scope.init = function(){
                $scope.isInit = true;
                let predictionPics = commonService.webName("/forepic/list")
                $scope.showPicList = [];
                $.ajax({
                    url:predictionPics,
                    type:'GET',
                    async:false,
                    dataType:'json',
                    contentType:'application/json;charset=UTF-8',
                    success : function(data) {
                        if(data&&data.code === '0'&&data.data){
                            $scope.showPicList = data.data;
                        }
                    },
                    error:function(data){
                        layui.layer.msg("获取图片列表失败")
                    }
                });

                let getLotteryRecord = commonService.webName("/lottery/getNextLottery");
                $scope.lotteryRecord = {numList:[],tm:''};
                $.ajax({
                    url:getLotteryRecord,
                    type:'GET',
                    async:false,
                    dataType:'json',
                    contentType:'application/json;charset=UTF-8',
                    success : function(data) {
                        if(data&&data.code === '0'&&data.data){
                            if(data.data.length>0){
                                let timeAfterOpen = data.data.find(item => {
                                    $scope.lotteryRecord.numList = [];
                                item.lotteryRecordDetails?item.lotteryRecordDetails.map(m => {
                                    if(m.codeType == 0){
                                    $scope.lotteryRecord.numList.push(m)
                                }else{
                                    $scope.lotteryRecord.tm = m;
                                }
                            }):[];
                                return item.endFlag == '1';
                            })
                                let timeNextOpen = data.data.find(item => {
                                    return item.endFlag == '-1';
                            })
                                $scope.nextOpenId = timeNextOpen?timeNextOpen.id:"";
                                $scope.timeAfterPeriod = timeAfterOpen?timeAfterOpen.period:"";
                                $scope.timeNextPeriod = timeNextOpen?timeNextOpen.period:"";
                                $scope.timeAfterOpen = timeAfterOpen?timeAfterOpen.endTm:"";
                                $scope.timeNextOpen = timeNextOpen?timeNextOpen.beginTm:"";
                                $scope.timeAfterOpen = timeAfterOpen?timeAfterOpen.endTm:"";
                                $scope.timeAfterOpen = new Date($scope.timeAfterOpen);
                                $scope.timeNowOpen = new Date();
                                //$scope.timeNowOpen = $scope.timeNowOpen?$scope.timeNowOpen:(timeNextOpen?timeNextOpen.beginTm:"");
                                $scope.timeOpen = (new Date($scope.timeNextOpen).getTime() - new Date($scope.timeNowOpen).getTime());
                                $scope.startTimeout();
                            }else{
                                layui.layer.msg("获取数据失败")
                            }
                        }
                    },
                    error:function(data){
                        layui.layer.msg("获取数据失败")
                    }
                });


                // 首页信息
                let noticeDetailUrl = commonService.webName("/notice/list");
                $scope.noticeDetail = {};
                $.ajax({
                    url:noticeDetailUrl,
                    type:'GET',
                    async:false,
                    dataType:'json',
                    contentType:'application/json;charset=UTF-8',
                    success : function(data) {
                        if(data&&data.code === '0'&&data.data){
                            $scope.noticeDetail = data.data;
                        }
                    },
                    error:function(data){
                        layui.layer.msg("获取图片列表失败")
                    }
                });






            }

            if(!$scope.isInit){
                $scope.init();
            }
            $scope.isDateNull = isDateNull;

            /*

            
            var initnum = "";
            for(let i = 1;i<50;i++){
                initnum+=`<audio id="numSound${i}" src="../static/sound/${i}.mp3"></audio>`;
            }
            $('.num_sound').append(initnum);

            var countList = ["one","two","three","four","five","six","seven"];
            var initcount = "";
            for(let i = 0;i<7;i++){
                initcount+=`<audio id="numSound_${countList[i]}" src="../static/sound/${countList[i]}.mp3"></audio>`;
            }
            $('.count_sound').append(initcount);
            $scope.trylucky = function(){
                $('.ball').empty();
                for(let i = 0;i<7;i++){
                    $('.ball').append(`<span class="ball_bg" style="transform: rotate(0deg);top: 188px;left: 298px;display: none;transform-origin: ${i==6?"-6px 109px":"-7px 107px"};"></span>`)
                }
                $('.movie_img').css({display:'none'});
                let promiseTeam = (params,index) => {
                    let ballone = $($('.ball').children()[index]);
                    ballone.addClass(params.colorClass);
                    ballone.css({display:'block'});
                    ballone.animate({top:'14px'},function(){
                        cssAnimate(params.start,params.end,5,function(animateNum){
                            ballone.css({transform: 'rotate('+animateNum+'deg)'});
                        });
                    })
                }
                let calldData = [
                    {start:0,end:-175},
                    {start:0,end:-165},
                    {start:0,end:-155},
                    {start:0,end:-145},
                    {start:0,end:-135},
                    {start:0,end:-125},
                    {start:0,end:149,type:'-6px 110px'}
                ];
                calldData = calldData.map(item => {
                    item.colorClass = "red_ball_bg";
                    return item;
                });
                cssAnimate(0,6,2000,function(animateNum){
                    promiseTeam(calldData[animateNum],animateNum);
                });
            }*/
        }]);
    }
);
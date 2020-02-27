define(
    ['app'],
    function(app){
        app.controller("mainController",['$scope','commonService',function($scope,commonService){
            $scope.config={
                remainLotterRecord:function(){
                    $.ajax({
                        url:commonService.webName('/lotteryRecord/remainLotterRecord'),
                        type:'GET',
                        async:false,
                        dataType:'json',
                        contentType:'application/json;charset=UTF-8',
                        success : function(data) {
                            $scope.lotteryRecord=data.data;
                        },
                        error:function(data){
                            $scope.lotteryRecord='?';
                        }
                    });
                },
                lotteryRecordHistoryInsert:function(){
                    $.ajax({
                        url:commonService.webName('/lotteryRecord/lotteryRecordHistoryInsert'),
                        type:'GET',
                        async:false,
                        dataType:'json',
                        contentType:'application/json;charset=UTF-8',
                        success : function(data) {

                        },
                        error:function(data){

                        }
                    });
                },
                init:function(){
                    this.remainLotterRecord();
                }
            }
            $scope.config.init();
        }]);
    }
);
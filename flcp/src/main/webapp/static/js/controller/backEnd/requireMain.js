require.config({
    baseUrl:"js/",
    //每次新加载js，为了避免缓存
    //urlArgs: "bust=" +  (new Date()).getTime(),
    paths : {
        "jQuery" : "lib/jquery-3.4.1",
        "angular":"lib/angular",
        "layui":"lib/layui/layui.all",
        "ngRoute":"lib/angular-route",
        "bootstrap":"lib/bootstrap-3.3.7",
        "domReady":"lib/domReady",
        "app":"controller/backEnd/app",
        "commonService":"service/commonService/commonService",
        "mainController":"controller/backEnd/mainController",
        "indexController":"controller/backEnd/indexController",

        "dictionaryController":"controller/backEnd/system/dictionary/dictionaryController",
        "dictionaryService":"service/backEnd/system/dictionary/dictionaryService",

        "lotteryRecordController":"controller/backEnd/business/lotteryRecord/lotteryRecordController",
        "lotteryRecordService":"service/backEnd/business/lotteryRecord/lotteryRecordService",
        
        "utils":"lib/utils",
    },
    shim:{
        'angular':{
            deps:['jQuery'],
            exports:'angular'
        },
        'ngRoute':{
            deps:['angular'],
            exports: 'ngRoute'
        },
        'layui':{
            exports: 'layui'
        },
        'bootstrap':{
            deps:['jQuery'],
            exports:'bootstrap'
        },
        'app':{
            deps:['angular','ngRoute'],
        },
        'commonService':{
            deps:['app'],
        },
        'indexController':{
            deps:['app','commonService'],
        }
    },
    deps: [
        'bootstrap'
    ]
});
require(
    [
        'angular','domReady','app','commonService','indexController','mainController',
        'dictionaryController','layui','lotteryRecordController',"utils",
    ],
    function(angular,domReady){
        domReady(function(){
            console.log("启动angular APP");
            angular.bootstrap(document,['app']);
        });
    }
);

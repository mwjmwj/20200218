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
        "app":"controller/frontEnd/app",
        "commonService":"service/commonService/commonService",

        "echarts":"lib/echarts.min",

        "utils":"lib/utils",
        "frontController":"controller/frontEnd/frontController",
        "headerController":"controller/frontEnd/common/headerController",
        "footerController":"controller/frontEnd/common/footerController",
        "contentIndexController":"controller/frontEnd/content/contentIndexController",
        "lotteryRecordContentController":"controller/frontEnd/content/lotteryRecordContentController",
        "predictionGalleryContentController":"controller/frontEnd/content/predictionGalleryContentController",
        "chineseZodiacController":"controller/frontEnd/content/chineseZodiacController",
        "chromaRankingController":"controller/frontEnd/content/chromaRankingController",
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
        'angular','domReady','app','commonService','layui',"frontController","utils","footerController",'echarts',
        'headerController','contentIndexController','lotteryRecordContentController',"predictionGalleryContentController",
        "chineseZodiacController","chromaRankingController",
    ],
    function(angular,domReady){
        domReady(function(){
            console.log("启动angular APP");
            angular.bootstrap(document,['app']);
        });
    }
);

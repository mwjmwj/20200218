define(
    ['angular','ngRoute'],
    function(angular) {
        console.log("初始化angular.module")
        let app = angular.module("app",['ngRoute']);
        app.config(['$routeProvider','$locationProvider',function($routeProvider, $locationProvider){
            $locationProvider.hashPrefix('');
            $routeProvider.
                when("/dictionary",{
                    templateUrl: "view/backEnd/system/dictionary/dictionary.html",
                    controller: "dictionaryController"
                }).
                when("/lotteryRecord",{
                    templateUrl: "view/backEnd/business/lotteryRecord/lotteryRecord.html",
                    controller: "lotteryRecordController"
                }).
                when("/main",{
                    templateUrl: "view/backEnd/main.html",
                    controller: "mainController"
                }).
                otherwise({
                    redirectTo:"/main"
                });
        }]);
        return app;
    }
);
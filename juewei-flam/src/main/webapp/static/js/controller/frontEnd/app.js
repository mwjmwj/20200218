define(
    ['angular','ngRoute'],
    function(angular) {
        let app = angular.module("app",['ngRoute']);
        app.config(['$routeProvider','$locationProvider',function($routeProvider, $locationProvider){
            $locationProvider.hashPrefix('');
            $routeProvider.
                when("/contentIndex",{
                    templateUrl: "view/front/content/contentIndex.html",
                    controller: "contentIndexController"
                }).
                when("/lotteryRecordContent",{
                    templateUrl: "view/front/content/lotteryRecordContent.html",
                    controller: "lotteryRecordContentController"
                }).
                when("/predictionGalleryContent",{
                    templateUrl: "view/front/content/predictionGalleryContent.html",
                    controller: "predictionGalleryContentController"
                }).
                when("/chineseZodiac",{
                    templateUrl: "view/front/content/chineseZodiac.html",
                    controller: "chineseZodiacController"
                }).
                when("/chromaRanking",{
                    templateUrl: "view/front/content/chromaRanking.html",
                    controller: "chromaRankingController"
                }).
                when("/bonusShares",{
                    templateUrl: "view/front/content/static/bonusShares.html",
                }).
                when("/bettingMethod",{
                    templateUrl: "view/front/content/static/bettingMethod.html",
                }).
                when("/introductionToLottery",{
                    templateUrl: "view/front/content/static/introductionToLottery.html",
                }).
                when("/boardOfDirectors",{
                    templateUrl: "view/front/content/static/boardOfDirectors.html",
                }).
                when("/law",{
                    templateUrl: "view/front/content/static/law.html",
                }).
                when("/sssq",{
                    templateUrl: "view/front/content/static/sssq.html",
                }).
                when("/privacyPolicy",{
                    templateUrl: "view/front/content/static/privacyPolicy.html",
                }).
                otherwise({
                    redirectTo:"/contentIndex"
                });
        }]);
        return app;
    }
);
define(
    ['app'],
    function(app){
        app.controller('headerController', ['$scope', function($scope) {
            $scope.tagList = [
                {'name':'公司概況','flag':'/contentIndex'},
                {'name':'組織架構','flag':'/boardOfDirectors'},
                {'name':'隱私條款','flag':'/privacyPolicy'},
                {'name':'設為首頁',click:function(e){
                        SetHome(this,window.location)
                }},
                {'name':'收藏本站',click:function(){
                        AddFavorite(window.location.href,document.title);
                }}];
            $scope.chooseTag = getHashName().replace('/','')
            $scope.menuList = [
                {type:'contentIndex',name:'首頁'},
                {type:'lotteryRecordContent',name:'開獎記錄'},
                {type:'predictionGalleryContent',name:'預測圖庫'},
                {type:'introductionToLottery',name:'彩票介紹'},
                {type:'chineseZodiac',name:'十二生肖'},
                {type:'chromaRanking',name:'波色排位'},
                {type:'bonusShares',name:'獎金分配'},
                {type:'bettingMethod',name:'投註方式'},
                {type:'boardOfDirectors',name:'公司董事'},
                {type:'law',name:'法律依據'}
            ];
            window.onhashchange = function(){
                $scope.chooseTag = getHashName().replace('/','');
                $scope.$apply()
            }
            $scope.clickMenu = function(type){
                $scope.chooseTag = type;
            }
        }]);
    }
);
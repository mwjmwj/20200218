define(
    ['app'],
    function(app){
        app.controller('chineseZodiacController', ['$scope','commonService','$http', function($scope,commonService,$http) {
            $scope.numParseString = numParseString;
            $scope.init = function(){
                $scope.isInit = true;
                $scope.showText = "";
                $scope.chineseList = [];
                console.log(window.color)
                for(let i in window.chineseList){
                    let zodiacNum = [];
                    for(let j in window.zodiac){
                        if(window.zodiac[j].value === i||i === window.zodiacList[window.zodiac[j].value]){
                            zodiacNum.push({num:window.zodiac[j].name,color:window.color.find(item => {return item.name == window.zodiac[j].name}).value});
                        }
                    }
                    $scope.textListZodiac = ['松樹 太監 游俠 宰相','葵花 貴妃 歌女 武士','菊花 管家 奴才 先鋒','桂花 太監 商價 丞相','梅花 國師 逆賊 神偷','荷花 員外 元帥 大將','桃花 都督 將軍 武士','蘭花 小姐 皇后 東宮','李花 狀元 玉帝 皇上','竹花 美女 宮女 太子','杏花 秀才 太子 元帥','櫻花 夫人 宰相 士兵'];
                    $scope.chineseList.push({
                        zodiac:i,
                        zodiacText:window.chineseList[i],
                        num:zodiacNum
                    });
                    if(i === '鼠'){
                        $scope.showZodiac = i;
                        $scope.showText = $scope.chineseList[0].zodiacText;
                        $scope.showNum = $scope.chineseList[0].num;
                        $scope.chooseNumIndex = 0;
                    }
                }
                $scope.clickZodiac = function(index){
                    $scope.showZodiac = window.zodiacList[$scope.chineseList[index].zodiac];
                    $scope.showText = $scope.chineseList[index].zodiacText;
                    $scope.showNum = $scope.chineseList[index].num;
                    $scope.chooseNumIndex = index;
                }
                $scope.showZo = function(index){
                    return index===$scope.chooseNumIndex
                }
            }

            if(!$scope.isInit){
                $scope.init();
            }
        }]);
    }
);
define(
    ['app'],
    function(app){
        app.controller('chromaRankingController', ['$scope','commonService', function($scope,commonService ) {
			$scope.numParseString = numParseString;
        	$scope.init = function(){
        		$scope.isInit = "1";
            	var colorList = commonService.dictionaryByDictionaryTypeId(commonService.constant.dictionaryTypeIds.color);
                if(colorList.code === "0"){
                	window.colorList = colorList.data;
                }else{
                	window.colorList = [];
                }
                let colorType = {};
                for(let i in window.colorList){
                	let colort = window.colorList[i];
                	if(colort&&colort.value&&colorType[colort.value]){
                		colorType[colort.value].push({num:colort.name,colorText:colort.desc});
                	}else{
                		if(colort.value){
                			colorType[colort.value] = [{num:colort.name,colorText:colort.desc}];
                		}
                	}
                }
                var colorList = [];
            	for(let i in colorType){
            		if(colorType[i]){
            			let colorTypes = {
                			color:i,
                			num:colorType[i]
                		}
            			colorList.push(colorTypes)
            		}
            	}
            	$scope.colorType = colorList;
        	}
        	if(!$scope.isInit){
        		$scope.init()
        	}
            /*$scope.redBall = [1,2,7,8,12,13,18,19,23,24,29,30,34,35,40,45,46];
            $scope.greenBall = [5,6,11,16,17,21,22,27,28,32,33,38,39,43,44,49];
            $scope.blueBall = [3,4,9,10,14,15,20,25,26,31,36,37,41,42,47,48];*/
        }]);
    }
);
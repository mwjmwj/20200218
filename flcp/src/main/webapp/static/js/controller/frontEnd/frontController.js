define(
    ['angular','app','commonService'],
    function(angular,app){
        app.controller("frontController",function ($scope,$http, commonService) {
            var jt = "鼠牛虎兔龍蛇馬羊猴雞狗豬".split("");
            var ft = "鼠牛虎兔龙蛇马羊猴鸡狗猪".split("");
            window.zodiacList = {}
            jt.map((item,index) => {
                window.zodiacList[ft[index]] = item;
            });
            jt.map((item,index) => {
                window.zodiacList[item] = ft[index];
            })
            var zodiac = commonService.dictionaryByDictionaryTypeId('/numColor/getNumColorOnAnimals');
            //var zodiac = {};
            if(zodiac.code === "0"){
                window.zodiac = zodiac.data;
            }else{
                window.zodiac = [];
            }
            var color = commonService.dictionaryByDictionaryTypeId('/numColor/getNumColors');
            //var color = {};
            if(color.code === "0"){
                window.color = color.data;
            }else{
                window.color = [];
            }

        	$('body').css('display','block');
        });
    }
);
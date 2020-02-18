define(
    ['app'],
    function (app) {
        app.service("commonService", function () {
            /**
             * 前段配置项的字典类型id
             * @type {{dictionaryTypeIds: {}}}
             */
            this.constant = {
                dictionaryTypeIds:{
                    pageConfig:"pageConfig",
                    color:"color",
                    zodiac:"zodiac"
                },
                predictionGallery:{ 
                    type:{"text":{"key":"1","value":"文本"},"pic":{"key":"0","value":"图片"}}
                }

            };
            /**
             * 获取菜单
             * @param $http
             * @param processData
             * @returns {Promise|PromiseLike<any>|Promise<any>}
             */
            this.getMenu = function ($http,processData) {
                let promise = $http({
                    method: "get",
                    url: "js/munus.json"
                });
                return promise.then(function successCallback(response) {
                    // 请求成功执行代码
                    processData(response.data)
                }, function errorCallback(response) {
                    // 请求失败执行代码
                    console.error("加载资源出错:"+response.message);
                });
            };
            /**
             * 获取后台服务器地址
             * @returns {string}
             */
            this.backEndUrl=function(subUrl){
                if(subUrl==null||subUrl==''){
                    return '';
                }
                let ip = "127.0.0.1";
                let port = "8081";
                let appName = "flcpBackEnd";
                if(subUrl.substring(0, 1) == "/"){
                    return 'http'+"://"+ip+":"+port+"/"+appName+subUrl;
                }
                return 'http'+"://"+ip+":"+port+"/"+appName+"/"+subUrl;
            };
            this.webName=function(subUrl){
                //获取当前网址，如：
                let curWwwPath=window.document.location.href;

                //获取主机地址之后的目录如：/Tmall/index.jsp
                let pathName=window.document.location.pathname;
                let pos=curWwwPath.indexOf(pathName);

                //获取主机地址，如：//localhost:8080
                let localhostPaht=curWwwPath.substring(0,pos);

                //获取带"/"的项目名，如：/Tmall
                let projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);
                let urlTmp = localhostPaht+projectName;

                if(subUrl.substring(0, 1) == "/"){
                    return urlTmp+subUrl;
                }
                return urlTmp +"/"+subUrl;
            }
            this.dateField=function(){
                let now = new Date();
                let year = now.getFullYear(); //得到年份
                let month = now.getMonth();//得到月份
                let date = now.getDate();//得到日期
                let hour = now.getHours();//得到小时
                let minu = now.getMinutes();//得到分钟
                let sec = now.getSeconds();//得到秒
                month = month + 1;
                if (month < 10) month = "0" + month;
                if (date < 10) date = "0" + date;
                if (hour < 10) hour = "0" + hour;
                if (minu < 10) minu = "0" + minu;
                if (sec < 10) sec = "0" + sec;
                return year + "-" + month + "-" + date + " " + hour + ":" + minu + ":" + sec;
            };
            this.dictionaryByDictionaryTypeId=function(dictionaryType){
                let result = {};
                $.ajax({
                    url:this.webName('/dictionary/dictionaryByDictionaryId?dictionaryTypeId='+dictionaryType),
                    type:'GET',
                    async:false,
                    dataType:'json',
                    contentType:'application/json;charset=UTF-8',
                    success : function(data) {
                        result = data;
                    },
                    error:function(data){
                        result.msgs=[data.statusText+"请配置页面配置，字典类型ID为pageConfig"];
                        result.code=-1;
                    }
                });
                return result;
            };
            this.fiveElement=function(zodic){
                if('猴'==zodic||'雞'==zodic){
                    return '金';
                }else if('虎'==zodic||'兔'==zodic){
                    return '木';
                }else if('鼠'==zodic||'豬'==zodic){
                    return '水';
                }else if('蛇'==zodic||'馬'==zodic){
                    return '火';
                }else if('牛'==zodic||'龍'==zodic||'羊'==zodic||'狗'==zodic){
                    return '土';
                }
                return '未知';
            };
            this.homeField=function(zodic){
                if('牛'==zodic||'馬'==zodic||'羊'==zodic||'雞'==zodic||'狗'==zodic||'豬'==zodic){
                    return '家';
                }else if('鼠'==zodic||'虎'==zodic||'兔'==zodic||'龍'==zodic||'蛇'==zodic||'猴'==zodic){
                    return '野';
                }
                return '未知';
            };
            this.heShuang=function(numStr){
                let result = 0;
                for(let i=0;i<numStr.length;i++){
                    let ch = numStr.substring(i,i+1);
                    result = result+parseInt(ch);
                }
                return result%2==0?'雙':'單';
            }
            this.manOrWoman=function(zodic){
                if('兔'==zodic||'羊'==zodic||'雞'==zodic||'蛇'==zodic||'豬'==zodic){
                    return '女';
                }else if('鼠'==zodic||'虎'==zodic||'龍'==zodic||'馬'==zodic||'牛'==zodic||'狗'==zodic||'猴'==zodic){
                    return '男';
                }
                return '未知';
            }
        });
    }
);
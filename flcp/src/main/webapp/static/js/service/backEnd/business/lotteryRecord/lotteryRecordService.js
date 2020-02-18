define(
    ['app','jQuery','commonService'],
    function(app){
        app.service("lotteryRecordService",['commonService',function(commonService){
            this.lotteryRecordRandom=function(lotteryRecordDetails,numberArray){
                //修改数据
                let tmp = [];
                while(tmp.length<7){
                    let randomInt = Math.floor(Math.random()*(numberArray.length)+1);
                    let flag = false;
                    for(let i=0;i<tmp.length;i++){
                        if(tmp[i]==randomInt){
                            flag = true;
                            break;
                        }
                    }
                    if(flag){
                        continue;
                    }
                    tmp.push(randomInt);
                }
                for(let i=0;i<lotteryRecordDetails.length;i++){
                    lotteryRecordDetails[i].number=tmp[i];
                }
            }
            this.TypesInit=function(){
                return [{'key':'1','value':'平码'},{'key':'0','value':'特码'},];
            };
            this.numberInit=function(){
                let numberArray = [];
                for(let i=1;i<=49;i++){
                    numberArray.push({'key':i,'value':i});
                }
                return numberArray;
            };
            this.lotteryRecordDetailInit=function(){
                return [
                        {number:1,type:'1',seq:1},
                        {number:2,type:'1',seq:2},
                        {number:3,type:'1',seq:3},
                        {number:4,type:'1',seq:4},
                        {number:5,type:'1',seq:5},
                        {number:6,type:'1',seq:6},
                        {number:7,type:'0',seq:7}
                    ];
            };
            this.lotteryRecordAdd=function(lotteryRecord){
                let result = {};
                $.ajax({
                    url:commonService.webName('/lotteryRecord/lotteryRecordInsert'),
                    type:'POST',
                    async:false,
                    data:JSON.stringify(lotteryRecord),
                    dataType:'json',
                    contentType:'application/json;charset=UTF-8',
                    success : function(data) {
                        result = data;
                    },
                    error:function(data){
                        result.msgs=[data.statusText]
                        result.code=-1;
                    }
                })
                return result;
            };
            this.lotteryRecordDelete=function(lotteryRecordId){
                let result = {};
                $.ajax({
                    url:commonService.webName('/lotteryRecord/lotteryRecordDelete/'+lotteryRecordId),
                    type:'delete',
                    async:false,
                    dataType:'json',
                    contentType:'application/json;charset=UTF-8',
                    success : function(data) {
                        result = data;
                    },
                    error:function(data){
                        result.msgs=[data.statusText]
                        result.code=-1;
                    }
                });
                return result;
            };
            this.lotteryRecordUpdate=function(lotteryRecord){
                let result = {};
                $.ajax({
                    url:commonService.webName('/lotteryRecord/lotteryRecordUpdate'),
                    type:'PUT',
                    async:false,
                    dataType:'json',
                    data:JSON.stringify(lotteryRecord),
                    contentType:'application/json;charset=UTF-8',
                    success : function(data) {
                        result = data;
                    },
                    error:function(data){
                        result.msgs=[data.statusText]
                        result.code=-1;
                    }
                });
                return result;
            };
        }]);
    }
);
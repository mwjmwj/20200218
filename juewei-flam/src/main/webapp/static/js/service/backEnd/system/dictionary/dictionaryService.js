define(
    ['app','jQuery','commonService'],
    function(app){
        app.service("dictionaryService",['commonService',function(commonService){
            this.dictionaryTypeAdd=function(dictionaryType){
                let result = {};
                $.ajax({
                    url:commonService.webName('/dictionary/dictionaryTypeInsert'),
                    type:'POST',
                    async:false,
                    data:JSON.stringify(dictionaryType),
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
            this.dictionaryAdd=function(dictionary){
                let result = {};
                $.ajax({
                    url:commonService.webName('/dictionary/dictionaryInsert'),
                    type:'POST',
                    async:false,
                    data:JSON.stringify(dictionary),
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
            this.dictionaryTypeList=function(){
                let result = {};
                $.ajax({
                    url:commonService.webName('/dictionary/dictionaryTypeList'),
                    type:'POST',
                    async:false,
                    dataType:'json',
                    data:JSON.stringify({}),
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
            this.dictionaryTypeUpdate=function(dictionaryType){
                let result = {};
                $.ajax({
                    url:commonService.webName('/dictionary/dictionaryTypeUpate'),
                    type:'PUT',
                    async:false,
                    dataType:'json',
                    data:JSON.stringify(dictionaryType),
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
            this.dictionaryTypeDelete=function(dictionaryTypeId){
                let result = {};
                $.ajax({
                    url:commonService.webName('/dictionary/dictionaryTypeDelete/'+dictionaryTypeId),
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
            this.dictionaryDelete=function(dictionaryId){
                let result = {};
                $.ajax({
                    url:commonService.webName('/dictionary/dictionaryDelete/'+dictionaryId),
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
            this.dictionaryUpdate=function(dictionary){
                let result = {};
                $.ajax({
                    url:commonService.webName('/dictionary/dictionaryUpdate'),
                    type:'PUT',
                    async:false,
                    dataType:'json',
                    data:JSON.stringify(dictionary),
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
            this.dictionaryByDictionaryId=function(dictionaryTypeId){
                let result = {};
                $.ajax({
                    url:commonService.webName('/dictionary/dictionaryByDictionaryId/'+dictionaryTypeId),
                    type:'GET',
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
        }]);
    }
);
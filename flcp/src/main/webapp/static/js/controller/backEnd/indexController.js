define(
    ['angular','app','commonService'],
    function(angular,app){
        app.controller("indexController",function ($scope,$http, commonService) {
            commonService.getMenu($http,function(data){
                $scope.menus = data;
            });
            $scope.fun1 = function (e) {
                if (!$('.nav').hasClass('nav-mini')) {
                    let target = e.target;
                    while(target.tagName.toLowerCase()!="a"){
                        target = $(target).parent()[0];
                    }
                    target = $(target);
                    if (target.next().css('display') == "none") {
                        $('.nav-item').children('ul').slideUp(100);
                        target.next('ul').slideDown(100);
                        target.parent('li').addClass('nav-show').siblings('li').removeClass('nav-show');
                    } else {
                        target.next('ul').slideUp(100);
                        $('.nav-item.nav-show').removeClass('nav-show');
                    }
                }
            };
            $scope.span = function (url) {
                $('#searchHContainer').load(url);
            }
            $scope.login=function(){
                $.ajax({
                    url:commonService.webName('/loginMager/login'),
                    type:'POST',
                    async:false,
                    dataType:'json',
                    data:JSON.stringify({"key":$scope.aa.aaaa,"value":'1111'}),
                    contentType:'application/json;charset=UTF-8',
                    success : function(data) {
                        if(data.code!=0){
                            layui.layer.msg('验证出错:'+JSON.stringify(data.msgs), function () {});
                            $scope.loginFlag=true;
                            $scope.pageSiganal=false;
                            return;
                        }
                        $scope.pageSiganal=true;
                        $scope.loginFlag=false;
                    },
                    error:function(data){
                        layui.layer.msg('验证出错:'+JSON.stringify(data.statusText), function () {});
                        $scope.pageSiganal=false;
                        $scope.loginFlag=true;
                        return;
                    }
                });
            }
            $scope.aa={};
            $.ajax({
                url:commonService.webName('/loginMager/checkLogin'),
                type:'GET',
                async:false,
                dataType:'json',
                contentType:'application/json;charset=UTF-8',
                success : function(data) {
                    if(data.data){
                        $scope.pageSiganal=true;
                        $scope.loginFlag=false;
                    }else{
                        $scope.pageSiganal=false;
                        $scope.loginFlag=true;
                    }
                },
                error:function(data){
                    $scope.pageSiganal=false;
                    $scope.loginFlag=true;
                }
            });
            $.ajaxSetup({
                //dataType: "json",
                cache: false,
                xhrFields: {
                    withCredentials: true
                },
                complete: function(xhr) {
                    //token过期，则跳转到登录页面
                    if(xhr.responseJSON.code&&xhr.responseJSON.code == 304){
                        $scope.pageSiganal=false;
                        $scope.loginFlag=true;
                    }
                }
            });
        });
    }
);
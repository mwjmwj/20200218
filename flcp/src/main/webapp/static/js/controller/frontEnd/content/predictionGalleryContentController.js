define(
    ['app'],
    function(app){
        app.controller('predictionGalleryContentController', ['$scope','commonService','$http','$sce', function($scope,commonService,$http,$sce) {

			$scope.init = () => {
				$scope.isInit = true;
				let predictionPics = commonService.webName("/forepic/listdetail")
				$scope.showList = [];

				layui.use(['laypage', 'layer'], function(){
					var laypage = layui.laypage;
					var layer = layui.layer;
					$scope.refreshTable = (page,rows,params,flag) => {
						if(page!=$scope.tablePage||rows!=$scope.tableRows||flag){
							$scope.tablePage = page;
							$scope.tableRows = rows;
						}else{
							return $scope.tableData;
						}
						let tharParams = {
							page:page,
							pageSize:rows
						}
						for(pa in params){
							tharParams[pa] = params[pa];
						}
						$http.post(predictionPics,tharParams).then(data => {
							//data = data != null ? JSON.parse(data) : null;
							if(data&&data.data){
								data = data.data;
								if(data.code === "0"){
									if(data.data){
										$scope.showList = data.data;
									}
									laypage.render({
										elem: 'pagePic',
										curr:page,
										count: data.pageInfo.total,
										limit:rows,
										//layout: ['count', 'prev', 'page', 'next', 'limit', 'skip'],
										layout: ['count', 'prev', 'page', 'next', 'skip'],
										jump: function(obj){
											$scope.refreshTable(obj.curr,obj.limit,$scope.tableParams);
										}
									});
								}else{
									$scope.tableData = [];
									laypage.render({
										elem: 'pagePic',
										curr:page,
										count: 0,
										limit:rows,
										//layout: ['count', 'prev', 'page', 'next', 'limit', 'skip'],
										layout: ['count', 'prev', 'page', 'next', 'skip'],
										jump: function(obj){
											$scope.refreshTable(obj.curr,obj.limit,$scope.tableParams);
										}
									});
								}
							}
						});
					}
					$scope.chooseYear = new Date().getFullYear(); //获取默认年份
					$scope.chooseYearChange = function(value){
						if(value){
							$scope.chooseYear = value;
						}else{

						}
						$scope.tableParams = {
							lotteryDateBegin:$scope.chooseYear+"-01-01 00:00:00",
							lotteryDateEnd:$scope.chooseYear+"-12-31 23:59:59"
						}
						$scope.refreshEcharts();
						$scope.refreshTable(1,4,$scope.tableParams,true);
					}
					$scope.tableParams = {
						lotteryDateBegin:$scope.chooseYear+"-01-01 00:00:00",
						lotteryDateEnd:$scope.chooseYear+"-12-31 23:59:59"
					}
					$scope.refreshTable(1,4,$scope.tableParams);
				});

				/*$.ajax({
					url:predictionPics,
					type:'GET',
					async:false,
					dataType:'json',
					contentType:'application/json;charset=UTF-8',
					success : function(data) {
                        if(data&&data.code === '0'&&data.data){
                            $scope.showList = data.data;
                        }
					},
					error:function(data){
						layui.layer.msg("获取图片列表失败")
					}
				});*/
			}
			$scope.clickPic = url => {
				$scope.seePic = url;
			}
			$scope.openPic = url => {
				window.open(url)
			}
			if(!$scope.isInit){
				$scope.init()
			}
			/*
        	let getOpenLuckList = commonService.webName("/predictionGallery/predictionGalleryList")
        	$scope.tableData = [];
        	$scope.chooseYear = new Date().getFullYear();
        	$scope.chooseYearChange = function(e){

        	}
        	window.openModel = function(itemId){
        		let chooseItem = $scope.tableData.find(fitem => {
        			return fitem.tableId === itemId;
        		});
        		if(chooseItem.type === "0"){
        			let imgUrl = commonService.backEndUrl(chooseItem.fileRecordUrl);

        			layer.open({
        				type: 1,
						shadeClose:true,
        				title:`<div>
        						<div style="float:left">
        							${chooseItem.title},${dateFormat(new Date(chooseItem.createdTime),'yyyy年MM月dd日')},第${chooseItem.lotteryPeriod}期
        						</div>
        						
        						<div class="clear"></div>
        					</div>`,
        				area:['auto', $(window).height()+"px"],
        				content: '<div><img src="'+imgUrl+'" /></div>'
        			});
        			//window.open(commonService.backEndUrl(chooseItem.fileRecordUrl));
        		}else{
        			layer.open({
        				type: 1, 
        				title:`<div>${chooseItem.title},${dateFormat(new Date(chooseItem.createdTime),'yyyy年MM月dd日')},第${chooseItem.lotteryPeriod}期</div>`,
        				area:[$(window).width()*0.4+"px", $(window).height()+"px"],
        				content: '<div style="padding: 10px;">'+chooseItem.content+'</div>'
        			});
        		}
        	}
        	$scope.yearList = Array.from(new Array(21),function(x,y){return y+2000;});
        	layui.use(['laypage', 'layer'], function(){
        		var laypage = layui.laypage;
        		var layer = layui.layer;
        		
        		$scope.refreshTable = (page,rows,params,flag) => {
        			if(page!=$scope.tablePage||rows!=$scope.tableRows||flag){
            			$scope.tablePage = page;
            			$scope.tableRows = rows;
        			}else{
        				return $scope.tableData;
        			}
        			let tharParams = {
        				page:page,
        				pageSize:rows
        			}
        			for(pa in params){
        				tharParams[pa] = params[pa];
        			}
        			$http.post(getOpenLuckList,tharParams).then(data => {
                		if(data&&data.data){
                			data = data.data;
                			if(data.code === "0"){
                				if(data.data){
                					$scope.tableData = data.data.map(item => {
                						item.createdTime = new Date(item.createdTime);
                						let tableId = getRandomId();
                						item.tableId = tableId;
                						item.doFnSomeThings = $sce.trustAsHtml(`<button class="layui-table-btn-center" onclick="openModel('${tableId}')"><i class="layui-icon layui-icon-search" /></button>`);
                						return item;
                					});
                				}
                				laypage.render({
                	        		elem: 'pagefy',
                	        		curr:page,
                	        		count: data.pageInfo.total,
                	        		limit:rows,
                	        		layout: ['count', 'prev', 'page', 'next', 'limit', 'skip'],
                	        		jump: function(obj){
                	        			$scope.refreshTable(obj.curr,obj.limit,$scope.tableParams);
                	        		}
                        		});
                			}else{
                				$scope.tableData = [];
                				laypage.render({
                	        		elem: 'pagefy',
                	        		curr:page,
                	        		count: 0,
                	        		limit:rows,
                	        		layout: ['count', 'prev', 'page', 'next', 'limit', 'skip'],
                	        		jump: function(obj){
                	        			$scope.refreshTable(obj.curr,obj.limit,$scope.tableParams);
                	        		}
                        		});
                			}
                		}
                	});
        		}
        		$scope.chooseYearChange = function(value){
        			if(value){
        				$scope.chooseYear = value;
        			}else{
        				
        			}
            		$scope.tableParams = {
						createdTimeBegin:$scope.chooseYear+"-01-01 00:00:00",
						createdTimeEnd:$scope.chooseYear+"-12-31 23:59:59"
            		}
            		$scope.refreshTable(1,10,$scope.tableParams,true);
            	}
        		$scope.tableParams = {
					createdTimeBegin:$scope.chooseYear+"-01-01 00:00:00",
					createdTimeEnd:$scope.chooseYear+"-12-31 23:59:59"
        		}
        		$scope.refreshTable(1,10,$scope.tableParams);
        	});*/
        }]);
    }
);
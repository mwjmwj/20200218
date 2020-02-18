define(
    ['app','echarts'],
    function(app,echarts){
        app.controller('lotteryRecordContentController', ['$scope','commonService','$http', function($scope,commonService,$http) {
			$scope.initTable = function(){
				$scope.isInit = true;
				let getOpenLuckList = commonService.webName("/lotteryRecord/lotteryRecordListCommon")
				$scope.tableData = [];
				$scope.numBallColor = numBallColor;
				$scope.numParseString = numParseString;
				$scope.chooseYear = new Date().getFullYear();
				$scope.chooseYearChange = function(e){

				}
				let nowYear = new Date().getFullYear();
				nowYear = nowYear - 2000 + 1
				$scope.yearList = Array.from(new Array(nowYear),function(x,y){return y+2000;});
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
											item.lotteryDate = new Date(item.lotteryDate)
											//设置其他特码数据
											for(let i=0;i<item.lotteryRecordDetails.length;i++){
												if(item.lotteryRecordDetails[i].type!='0'){
													continue;
												}
												let specialObject = item.lotteryRecordDetails[i];
												//特肖
												item.specialZodic=specialObject.zodiac;
												// 特波
												item.specialColor=specialObject.colorName;
												// 特头
												item.specialHeader=(specialObject.number+'').substring(0,1);
												// 单双
												item.singleAndDouble=specialObject.number%2==1?'單':'雙';
												// 五行
												item.fiveElements=commonService.fiveElement(specialObject.zodiac);
												// 家野
												item.homeField=commonService.homeField(specialObject.zodiac);
												// 大小
												item.bigOrSmall=specialObject.number<=24?'小':'大';
												// 尾数
												item.tailNum=(specialObject.number+'').substr((specialObject.number+'').length-1,1)+'尾';
												// 男女
												item.manOrWoman=commonService.manOrWoman(specialObject.zodiac);
												// 合数々单双
												item.heShuang=commonService.heShuang(specialObject.number+'');
												break;
											}
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
							lotteryDateBegin:$scope.chooseYear+"-01-01 00:00:00",
							lotteryDateEnd:$scope.chooseYear+"-12-31 23:59:59"
						}
						$scope.refreshEcharts();
						$scope.refreshTable(1,10,$scope.tableParams,true);
					}
					$scope.tableParams = {
						lotteryDateBegin:$scope.chooseYear+"-01-01 00:00:00",
						lotteryDateEnd:$scope.chooseYear+"-12-31 23:59:59"
					}
					$scope.refreshTable(1,10,$scope.tableParams);
				});
			}

			let getChartList = commonService.webName("/lotteryRecord/getSpecialCodeTrendChart")
			$scope.echartsData = [];
			// let nowYear = new Date().getFullYear();
			// nowYear = nowYear - 2000 + 1
			// $scope.yearList = Array.from(new Array(nowYear),function(x,y){return y+2000;});
			$scope.chooseYear = new Date().getFullYear();
			$scope.chooseYearChanges = function(value){
				if(value){
					$scope.chooseYear = value;
				}else{

				}
				$scope.tableParams = {
					lotteryDateBegin:$scope.chooseYear+"-01-01 00:00:00",
					lotteryDateEnd:$scope.chooseYear+"-12-31 23:59:59"
				}
				$scope.refreshTable(1,10,$scope.tableParams,true);
				$scope.refreshEcharts();
			}
			$scope.initEcharts = function(){
				var option = {
					backgroundColor: '#1b0b37',
					tooltip: {
						trigger: 'axis',
						formatter:"第{b}期</br>特码：{c}"
					},
					toolbox: {
						feature: {
							saveAsImage: {}
						}
					},
					xAxis: {
						type: 'category',
						name:'特码',
						nameTextStyle:{color:'#fff'},
						boundaryGap: false,
						axisLabel: {
							formatter: '{value}',
							color: '#fff',
							fontSize: 14
						},
						data: $scope.echartsData.map(item => {
							return item.lotteryPeriod;
						})//[350,351,352,353,354, 355, 356, 357, 358, 359, 360, 361, 362, 363, 364, 365, 366]
					},
					yAxis: {
						type: 'value',
						name:'期数',
						nameTextStyle:{color:'#fff'},
						axisLabel: {
							formatter: '{value}',
							color: '#fff',
							fontSize: 14
						},
						min:0,
						max:50
					},
					series: [
						{
							name:'',
							itemStyle: {
								normal: {
									borderWidth: 5,
									color: "#0696f9",
								}
							},
							type:'line',
							data:$scope.echartsData.map(item => {
								return item.specialCode;
							})//[0, 1, 2, 5, 6, 9, 10, 21, 22, 23, 24, 28, 29, 32, 33, 46, 48, 49]
						}
					]
				};
				var myChart = echarts.init($('#mainEcharts')[0]);
				myChart.setOption(option);
			}
			$scope.refreshEcharts = function(){
				$scope.isInit = true;
				$http.get(getChartList+"?lotteryYear="+$scope.chooseYear).then(data => {
					if(data&&data.data){
						data = data.data;
						if(data.code === "0"){
							if(data.data){
								$scope.echartsData = data.data.data.map(chartsData => {
									return chartsData;
								})
								$scope.initEcharts();
							}
						}else{
							$scope.echartsData = [];
							$scope.initEcharts();
						}
					}
				});
			}
			if(!$scope.isInit){
				$scope.initTable();
				$scope.refreshEcharts()
			}
        }]);
    }
);
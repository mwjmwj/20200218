function getHashName(){
	var hashLocation = window.location.hash;
	var hashSplit = hashLocation.split("#");
	var hashTitle = hashSplit[1]?hashSplit[1].split(/\?/):[''];//hashTitle[0]
	return hashTitle[0]?hashTitle[0]:''
}

function cssAnimate(startNum,endNum,timeof,cssFn,callback){
	let animateNum = startNum;
	let isAdd = true;
	if(startNum>=endNum){
		isAdd = false;
	}
	let animate = setInterval(() => {
		cssFn(animateNum);
		if(animateNum === endNum){
			callback?callback():'';
			clearInterval(animate);
		}
		if(isAdd){
			animateNum++;
		}else{
			animateNum--;
		}
	}, timeof);
}

function dateFormat(date,fmt){ //author: meizz
    var o = {
      "M+" : date.getMonth()+1,                 //月份
      "d+" : date.getDate(),                    //日
      "h+" : date.getHours(),                   //小时
      "m+" : date.getMinutes(),                 //分
      "s+" : date.getSeconds(),                 //秒
      "q+" : Math.floor((date.getMonth()+3)/3), //季度
      "S"  : date.getMilliseconds()             //毫秒
    };
    if(/(y+)/.test(fmt))
      fmt=fmt.replace(RegExp.$1, (date.getFullYear()+"").substr(4 - RegExp.$1.length));
    for(var k in o)
      if(new RegExp("("+ k +")").test(fmt))
        fmt = fmt.replace(RegExp.$1, (RegExp.$1.length===1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));
    return fmt;
}

function getRandomId(){
	return Math.random().toString(32).substr(2);
}
function getNextDate(){
	let dateList = [1,3,5];
	let nextDay = null;
	if(arguments[0]){
		nextDay = getNextDay(arguments[0]);
	}else{
		nextDay = getNextDay(new Date());
	}
	if(dateList.indexOf(nextDay.getDay())>-1){
		return new Date(dateFormat(nextDay,'yyyy-MM-dd 21:30:00'));
	}else{
		return getNextDate(nextDay);
	}
}
function getNextDay(date){
	if(date.getHours()>21&&date.getMinutes()>30){
		return new Date(date.getTime() + 24*60*60*1000);
	}else{
		return new Date(dateFormat(date,'yyyy-MM-dd 21:30:00'));
	}
}
function getRemainderTime (s1,s2){
	runTime = parseInt((s2.getTime() - s1.getTime()) / 1000);
	var day = Math.floor(runTime / 86400);
	runTime = runTime % 86400;
	var hour = Math.floor(runTime / 3600);
	runTime = runTime % 3600;
	var minute = Math.floor(runTime / 60);
	runTime = runTime % 60;
	var second = runTime;
	return {
		day,
		hour,
		minute,
		second
	};
}

function isDateNull(data){
	if(JSON.stringify(data) === 'null'){
		return false;
	}else{
		return true;
	}
}

window.colorBall = {
	red:['01','02','07','08','12','13','18','19','23','24','29','30','34','35','40','45','46'],
	green:['05','06','11','16','17','21','22','27','28','32','33','38','39','43','44','49'],
	blue:['03','04','09','10','14','15','20','25','26','31','36','37','41','42','47','48']
}
function numParseString(num){
	return typeof num!='undefined'&&num&&num<10?'0'+num:num+''
}
function numBallColor(num){
	let colorClassList = {red:'rball',green:'gball',blue:'bball'};
	let result = null;
	for(let i in window.colorBall){
		let findNum = window.colorBall[i].find(cn => {
			return cn == num||parseInt(cn) == num;
		})
		if(findNum){
			result = {
				number:findNum,
				color:i,
				colorClass:colorClassList[i]
			}
		}
	}
	if(result){
		return result;
	}else{
		return null;
	}
}




window.colorBall = {
	red:['01','02','07','08','12','13','18','19','23','24','29','30','34','35','40','45','46'],
	green:['05','06','11','16','17','21','22','27','28','32','33','38','39','43','44','49'],
	blue:['03','04','09','10','14','15','20','25','26','31','36','37','41','42','47','48']
}
function numBallColor(num){
	let colorClassList = {red:'rball',green:'gball',blue:'bball'};
	let result = null;
	for(let i in window.colorBall){
		let findNum = window.colorBall[i].find(cn => {
			return cn == num||parseInt(cn) == num;
		})
		if(findNum){
			result = {
				number:findNum,
				color:i,
				colorClass:colorClassList[i]
			}
		}
	}
	if(result){
		return result;
	}else{
		return null;
	}
}

function query$(dom){
	return document.querySelector(dom);
}

function BallAnim(ballDom){
	this.ballDom = ballDom;
	this.dataList = Array.from(new Array(49)).map((item,index) => {let data = index+1;return data<10?'0'+data:data+''});
	this.timeClick = null;
	this.classList = ['rball','bball','gball'];
}

BallAnim.prototype = {
	play:function(){
		let intervall = setInterval(() => {
			this.setNum(this.changeBall());
			this.changeClass();
			this.setZod(this.changeZods());
		},10);
		this.timeClick = intervall;
	},
	setNum:function(num){
		this.ballDom.querySelector('label').innerHTML = num;
	},
	setZod:function(zod){
		this.ballDom.parentNode.querySelector('.zod').innerHTML = zod;
	},
	setClass:function(type){
		this.clearAllClass(this.classList);
		this.ballDom.classList.add(type)
	},
	stop:function(num,zod){
		num = num<10?'0'+num:num+'';
		if(this.timeClick){
			clearInterval(this.timeClick);
			this.setNum(num);
			this.setZod(zod);
			let classData = numBallColor(num);
			if(classData){
				this.setClass(classData.colorClass);
			}
		}
	},
	changeBall(type){
		let data = this.dataList
		let max = data.length-1;
		return data[Math.round(Math.random()*max)];
	},
	changeZods(){
		let data = ['鼠','牛','虎','兔','龍','蛇','馬','羊','猴','雞','狗','豬'];
		let max = data.length-1;
		return data[Math.round(Math.random()*max)];
	},
	changeClass(){
		let data = this.classList;
		let max = data.length-1;
		this.clearAllClass(data);
		this.ballDom.classList.add(data[Math.round(Math.random()*max)]);
	},
	clearAllClass:function(data){
		data.map(item => {
			if(this.ballDom.classList.contains(item)){
				this.ballDom.classList.remove(item);
			}
		})
	}
}

function SetHome(obj, vrl) {
	try {
		obj.style.behavior = 'url(#default#homepage)';
		obj.setHomePage(vrl);
	} catch (e) {
		if (window.netscape) {
			try {
				netscape.security.PrivilegeManager.enablePrivilege("UniversalXPConnect");
			} catch (e) {
				alert(
					"此操作被浏览器拒绝！\n请在浏览器地址栏输入“about:config”并回车\n然后将 [signed.applets.codebase_principal_support]的值设置为'true',双击即可。"
				);
			}
			var prefs = Components.classes['@mozilla.org/preferences-service;1'].getService(Components.interfaces.nsIPrefBranch);
			prefs.setCharPref('browser.startup.homepage', vrl);
		} else {
			alert("您的浏览器不支持，请按照下面步骤操作：1.打开浏览器设置。2.点击设置网页。3.输入：" + vrl + "点击确定。");
		}
	}
}

function AddFavorite(url,title){
	try{
		if(document.all){
			window.external.AddFavorite(url,title);
		}
		else if(window.sidebar && window.sidebar.addPanel){
			window.sidebar.addPanel(title,url,"");
		}
		else if(window.external){
			window.external.AddFavorite(url,title);
		}
		else if(window.opera && window.print){
			return true;
		}
	}
	catch(e){
		alert("加入收藏失败，\n请使用Ctrl+D进行添加！");
	}
}
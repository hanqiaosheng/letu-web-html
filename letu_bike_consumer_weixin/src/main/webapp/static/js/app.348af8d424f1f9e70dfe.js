webpackJsonp([19],[,,,,,,,,,function(t,e,n){"use strict";function i(t){return t&&t.__esModule?t:{default:t}}Object.defineProperty(e,"__esModule",{value:!0}),e.toRefund=e.getUser=e.userPage=e.userBalance=e.userDetail=e.activityListApp=e.userTicketDetail=e.userTicket=e.userWallet=e.cardHold=e.scenicSelect=e.hotWordList=e.scenicMsg=e.packageContent=e.scenicDetail=e.guideList=e.bannerList=e.scenicList=e.getPointJson=void 0;var o=n(57),a=(i(o),n(69)),r=i(a);r.default.defaults.headers.common.platformtype="app";var s=function(t){var e,n=new RegExp("(^| )"+t+"=([^;]*)(;|$)");return(e=document.cookie.match(n))?unescape(e[2]):null}("token"),c=2;c="h5"==function(t){if(t)return window.localStorage.getItem(t)}("platform")?2:1;var u={fromFlag:c,token:s},l=function(t){return r.default.post("/orbit/getPointJson.action","rentInfoId="+t,{headers:{"content-type":"application/x-www-form-urlencoded"}})},d=function(t,e,n,i){return r.default.post("/scenicspot/scenicList.action","pageIndex="+t+"&cityCode="+e+"&lng="+n+"&lat="+i)},f=function(t){return r.default.post("/banner/bannerList.action","cityCode="+t)},p=function(t,e,n,i){return r.default.post("/scenicspot/guideList.action","pageIndex="+t+"&cityCode="+e+"&lng="+n+"&lat="+i)},h=function(t,e){return r.default.post("/scenicspot/scenicDetail.action","pageIndex="+t+"&scenicId="+e)},v=function(t){return r.default.post("/scenicspot/packageContent.action","packageId="+t)},m=function(t){return r.default.post("/scenicspot/scenicMsg.action","scenicId="+t)},g=function(){return r.default.post("/hotword/hotWordList.action")},_=function(t,e){return r.default.post("/scenicspot/scenicSelect.action","pageIndex="+t+"&scenicName="+e)},y=function(){return r.default.post("/wallet/cardHold.action",null,{headers:u})},w=function(){return r.default.post("/wallet/userWallet.action",null,{headers:u})},b=function(t){return r.default.post("/wallet/userTicket.action","pageIndex="+t,{headers:u})},A=function(t){return r.default.post("/wallet/userTicketDetail.action","ticketId="+t,{headers:u})},C=function(t,e){return r.default.post("/activity/activityListApp.action","pageIndex="+t+"&cityCode="+e)},M=function(t,e){return r.default.post("/wallet/userDetail.action","pageIndex="+t+"&logType="+e,{headers:u})},E=function(){return r.default.post("/wallet/userBalance.action",null,{headers:u})},T=function(){return r.default.post("/user/userPage.action",null,{headers:u})},S=function(){return r.default.post("/user/getUser.action",null,{headers:u})},x=function(){return r.default.post("/pay/toRefund.action",null,{headers:u})};e.getPointJson=l,e.scenicList=d,e.bannerList=f,e.guideList=p,e.scenicDetail=h,e.packageContent=v,e.scenicMsg=m,e.hotWordList=g,e.scenicSelect=_,e.cardHold=y,e.userWallet=w,e.userTicket=b,e.userTicketDetail=A,e.activityListApp=C,e.userDetail=M,e.userBalance=E,e.userPage=T,e.getUser=S,e.toRefund=x},,function(t,e,n){"use strict";function i(t){return t&&t.__esModule?t:{default:t}}function o(t,e,n){if(t=parseFloat(t),!isFinite(t)||!t&&0!==t)return"";e=null!=e?e:"$",n=null!=n?n:2;var i=Math.abs(t).toFixed(n),o=n?i.slice(0,-1-n):i,a=o.length%3,r=a>0?o.slice(0,a)+(o.length>3?",":""):"",s=n?i.slice(-1-n):"";return(t<0?"-":"")+e+r+o.slice(a).replace(p,"$1,")+s}Object.defineProperty(e,"__esModule",{value:!0}),e.setMetaTitle=e.isEmoji=e.toast=e.showBack=e.overscroll=e.rule=e.islength=e.getQueryString=e.delCookie=e.getCookie=e.setCookie=e.removeStore=e.getStore=e.setStore=void 0;var a=n(155),r=i(a);e.currency=o;var s=n(15),c=i(s),u=n(87),l=i(u),d=(e.setStore=function(t,e){t&&("string"!=typeof e&&(e=(0,r.default)(e)),window.localStorage.setItem(t,e))},e.getStore=function(t){if(t)return window.localStorage.getItem(t)},e.removeStore=function(t){t&&window.localStorage.removeItem(t)},e.setCookie=function(t,e,n){var i=n||30,o=new Date;o.setTime(o.getTime()+24*i*60*60*1e3),document.cookie=t+"="+escape(e)+";expires="+o.toGMTString()});window.setCookie=d;var f=e.getCookie=function(t){var e,n=new RegExp("(^| )"+t+"=([^;]*)(;|$)");return(e=document.cookie.match(n))?unescape(e[2]):null};e.delCookie=function(t){var e=new Date;e.setTime(e.getTime()-1);var n=f(t);null!=n&&(document.cookie=t+"="+n+";expires="+e.toGMTString())},e.getQueryString=function(t){var e=new RegExp("(^|&)"+t+"=([^&]*)(&|$)","i"),n=window.location.search.substr(1).match(e);return null!=n?decodeURI(n[2]):null},e.islength=function(t){return Number(t)<10?"0"+t:t},e.rule={alert:function(t){c.default.state.alertMessage=t,c.default.state.showAlert=!0},empty:function(t,e){return""!=t||(this.alert(e),!1)},phone:function(t){return!!/^(13[0-9]|15[012356789]|17[678]|18[0-9]|14[57])[0-9]{8}$/.test(t)||(this.alert("手机号码有误"),!1)}},e.overscroll=function(t){for(var e=0;e<t.length;++e){var n=t[e];n.addEventListener("touchstart",function(){var t=this.scrollTop,e=this.scrollHeight,n=t+this.offsetHeight;0===t?this.scrollTop=1:n===e&&(this.scrollTop=t-1)}),n.addEventListener("touchmove",function(t){this.offsetHeight<this.scrollHeight&&(t._isScroller=!0)})}};document.body.addEventListener("touchmove",function(t){t._isScroller||t.preventDefault()}),Array.prototype.remove=function(t){var e=this.indexOf(t);e>-1&&this.splice(e,1)},Date.prototype.format=function(t){var e={"M+":this.getMonth()+1,"d+":this.getDate(),"h+":this.getHours(),"m+":this.getMinutes(),"s+":this.getSeconds(),"q+":Math.floor((this.getMonth()+3)/3),S:this.getMilliseconds()},n=["星期日","星期一","星期二","星期三","星期四","星期五","星期六"];/(y+)/.test(t)&&(t=t.replace(RegExp.$1,(this.getFullYear()+"").substr(4-RegExp.$1.length))),/(w+)/.test(t)&&(t=t.replace(RegExp.$1,n[this.getDay()]));for(var i in e)new RegExp("("+i+")").test(t)&&(t=t.replace(RegExp.$1,1==RegExp.$1.length?e[i]:("00"+e[i]).substr((""+e[i]).length)));return t},Date.prototype.add=function(t,e){switch(e*=1,isNaN(e)&&(e=0),t){case"y":this.setFullYear(this.getFullYear()+e);break;case"m":this.setMonth(this.getMonth()+e);break;case"d":this.setDate(this.getDate()+e);break;case"h":this.setHours(this.getHours()+e);break;case"n":this.setMinutes(this.getMinutes()+e);break;case"s":this.setSeconds(this.getSeconds()+e)}return this};var p=(e.showBack=function(t,e){var n=void 0,i=void 0;document.addEventListener("scroll",function(){a()},!1),document.addEventListener("touchstart",function(){a()},{passive:!0}),document.addEventListener("touchmove",function(){a()},{passive:!0}),document.addEventListener("touchend",function(){i=t.getPosition().top,o()},{passive:!0});var o=function e(){n=requestAnimationFrame(function(){t.getPosition().top!=i?(i=t.getPosition().top,e()):cancelAnimationFrame(n),a()})},a=function(){e(t.getPosition().top>500?!0:!1)}},e.toast=function(){var t=arguments.length>0&&void 0!==arguments[0]?arguments[0]:"",e=arguments.length>1&&void 0!==arguments[1]?arguments[1]:1500,n=document.createElement("div");n.className="common-toast common-toast-show",n.innerHTML=t,document.body.appendChild(n),n.style.display="block",n.style.margin="-"+n.offsetHeight/2+"px 0 0 -"+n.offsetWidth/2+"px";var i=setTimeout(function(){n.className="common-toast common-toast-hide",clearTimeout(i);var t=setTimeout(function(){document.body.removeChild(n),clearTimeout(t)},200)},e)},/(\d{3})(?=\d)/g);e.isEmoji=function(t){return!!escape(t).toLocaleLowerCase().match(/(\%\ue[0-9a-f]{3})|(\%\ud[0-9a-f]{3})/)},e.setMetaTitle=function(t){if(document.title=t,/iphone|ipad|ipod/.test(navigator.userAgent.toLowerCase())){var e=document.createElement("iframe");e.style.visibility="hidden",e.setAttribute("src",l.default);var n=function t(){setTimeout(function(){e.removeEventListener("load",t),document.body.removeChild(e)},0)};e.addEventListener("load",n),document.body.appendChild(e)}}},,,,function(t,e,n){"use strict";function i(t){return t&&t.__esModule?t:{default:t}}Object.defineProperty(e,"__esModule",{value:!0});var o=n(21),a=i(o),r=n(10),s=i(r),c=n(172),u=i(c),l=n(170),d=i(l),f=n(171),p=i(f);a.default.use(s.default);var h=function(t){if(t)return window.localStorage.getItem(t)},v={activeLocation:JSON.parse(h("activeLocation"))||[120.1747,30.33467],locationCity:h("locationCity")||"杭州",locationCitycode:h("locationCitycode")||"0571",city:h("city")||"杭州",citycode:h("citycode")||"0571",platform:h("platform")||"h5",showAlert:!1,alertMessage:"提示",alertFn:function(){},title:"",href:"",norequiresAuth:"",searchKey:h("searchKey")||"",position:{},arrPageName:"index"};e.default=new s.default.Store({state:v,getters:p.default,actions:d.default,mutations:u.default})},,,,,,,function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var i=void 0,o=void 0,a=void 0,r=void 0;e.baseUrl=i="",e.routerMode=o="hash",e.imgCode=a="/api/code",e.path=r="//wechat.letulife.com",e.baseUrl=i,e.routerMode=o,e.imgCode=a,e.path=r},,,,,,,,,,,,,,,,,,function(t,e,n){n(107);var i=n(4)(n(168),n(99),"data-v-46a3c709",null);t.exports=i.exports},,,,,,,,,,,,,,,,,,function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});e.SET_POSITION="SET_POSITION",e.SAVE_PAGE="SAVE_PAGE",e.SET_LOCATION="SET_LOCATION",e.SET_LOCATIONCITY="SET_LOCATIONCITY",e.SET_SEARCHKEY="SET_SEARCHKEY"},function(t,e,n){n(106);var i=n(4)(n(163),n(97),null,null);t.exports=i.exports},,,function(t,e,n){"use strict";function i(t){return t&&t.__esModule?t:{default:t}}Object.defineProperty(e,"__esModule",{value:!0});var o=n(92),a=i(o),r=n(93),s=i(r),c=n(91),u=i(c),l=n(40),d=i(l),f=n(94),p=i(f);e.default={footer:a.default,header:s.default,alerttip:u.default,searchbar:d.default,rate:p.default}},function(t,e,n){"use strict";!function(t,e){var n=t.documentElement,i="orientationchange"in window?"orientationchange":"resize",o=function(){var t=n.clientWidth;t&&(n.style.fontSize=t/320*50+"px")};t.addEventListener&&(e.addEventListener(i,o,!1),t.addEventListener("DOMContentLoaded",o,!1))}(document,window)},function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var i=n(22),o=n(15),a=(function(t){t&&t.__esModule}(o),n(11));!function(t){if(t&&t.__esModule)return t;var e={};if(null!=t)for(var n in t)Object.prototype.hasOwnProperty.call(t,n)&&(e[n]=t[n]);e.default=t}(a);e.default={install:function(t,e){t.prototype.openUrl=function(t){t.indexOf("#")>=0?window.location.href=t:window.location.href=i.path+t}}}},function(t,e,n){"use strict";function i(t){return t&&t.__esModule?t:{default:t}}Object.defineProperty(e,"__esModule",{value:!0});var o=n(21),a=i(o),r=n(153),s=i(r),c=n(22),u=function(t){return n.e(4).then(function(){return t(n(180))}.bind(null,n)).catch(n.oe)},l=function(t){return n.e(11).then(function(){return t(n(181))}.bind(null,n)).catch(n.oe)},d=function(t){return n.e(2).then(function(){return t(n(182))}.bind(null,n)).catch(n.oe)},f=function(t){return n.e(7).then(function(){return t(n(184))}.bind(null,n)).catch(n.oe)},p=function(t){return n.e(13).then(function(){return t(n(188))}.bind(null,n)).catch(n.oe)},h=function(t){return n.e(0).then(function(){return t(n(176))}.bind(null,n)).catch(n.oe)},v=function(t){return n.e(14).then(function(){return t(n(189))}.bind(null,n)).catch(n.oe)},m=function(t){return n.e(1).then(function(){return t(n(190))}.bind(null,n)).catch(n.oe)},g=function(t){return n.e(17).then(function(){return t(n(187))}.bind(null,n)).catch(n.oe)},_=function(t){return n.e(10).then(function(){return t(n(186))}.bind(null,n)).catch(n.oe)},y=function(t){return n.e(8).then(function(){return t(n(178))}.bind(null,n)).catch(n.oe)},w=function(t){return n.e(15).then(function(){return t(n(179))}.bind(null,n)).catch(n.oe)},b=function(t){return n.e(16).then(function(){return t(n(177))}.bind(null,n)).catch(n.oe)},A=function(t){return n.e(12).then(function(){return t(n(192))}.bind(null,n)).catch(n.oe)},C=function(t){return n.e(5).then(function(){return t(n(183))}.bind(null,n)).catch(n.oe)},M=function(t){return n.e(9).then(function(){return t(n(175))}.bind(null,n)).catch(n.oe)},E=function(t){return n.e(3).then(function(){return t(n(191))}.bind(null,n)).catch(n.oe)},T=function(t){return n.e(6).then(function(){return t(n(185))}.bind(null,n)).catch(n.oe)};a.default.use(s.default),e.default=new s.default({mode:c.routerMode,saveScrollPosition:!0,strict:!1,routes:[{path:"",redirect:"/main"},{path:"/main",name:"main",meta:{norequiresAuth:!0,title:"首页",nopush:!0},component:d},{path:"/proDetail/:id",name:"proDetail",meta:{norequiresAuth:!0,title:"产品详情"},component:f},{path:"/strategy",name:"strategy",meta:{norequiresAuth:!0,title:"骑游攻略"},component:p},{path:"/cardBag",name:"cardBag",meta:{title:"卡包"},component:h},{path:"/ticket",name:"ticket",meta:{title:"门票"},component:v},{path:"/ticketDetail/:id",name:"ticketDetail",meta:{title:"取票详情"},component:m},{path:"/selectCity",name:"selectCity",meta:{norequiresAuth:!0,title:"选择城市",nokeepAlive:!0,nopush:!0},component:g},{path:"/search",name:"search",meta:{norequiresAuth:!0,title:"搜索",nokeepAlive:!0},component:_},{path:"/description/:id",name:"description",meta:{norequiresAuth:!0,title:"详细说明"},component:y},{path:"/descriptionGuide/:id",name:"descriptionGuide",meta:{norequiresAuth:!0,title:"信息须知"},component:w},{path:"/index",name:"index",meta:{norequiresAuth:!0,title:"行程详情",nokeepAlive:!0},component:u},{path:"/level",name:"level",meta:{norequiresAuth:!0,title:"等级规则",nokeepAlive:!0},component:l},{path:"/consumptionDetail",name:"consumptionDetail",meta:{title:"明细"},component:b},{path:"/wallet",name:"wallet",meta:{title:"我的钱包"},component:A},{path:"/mybalance",name:"mybalance",meta:{title:"余额"},component:C},{path:"/activity",name:"activity",meta:{norequiresAuth:!0,title:"活动中心"},component:M},{path:"/user",name:"user",meta:{title:"个人中心"},component:E},{path:"/proLocaltion",name:"proLocaltion",meta:{norequiresAuth:!0,title:"景点位置",showAmap:!0},component:T}]})},,,,,,,,,,,,,,,,,,,,,,function(t,e){t.exports="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAIAAACQd1PeAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyJpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNiAoV2luZG93cykiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6REE0MzBDQTg4OTZBMTFFN0ExMDZEMzY4M0ZEMzdFNDYiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6REE0MzBDQTk4OTZBMTFFN0ExMDZEMzY4M0ZEMzdFNDYiPiA8eG1wTU06RGVyaXZlZEZyb20gc3RSZWY6aW5zdGFuY2VJRD0ieG1wLmlpZDpEQTQzMENBNjg5NkExMUU3QTEwNkQzNjgzRkQzN0U0NiIgc3RSZWY6ZG9jdW1lbnRJRD0ieG1wLmRpZDpEQTQzMENBNzg5NkExMUU3QTEwNkQzNjgzRkQzN0U0NiIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/Po4dZkoAAAAPSURBVHjaYvr//z9AgAEABgYDACuJdK0AAAAASUVORK5CYII="},,function(t,e,n){var i=n(4)(n(161),n(96),null,null);t.exports=i.exports},function(t,e,n){var i=n(4)(n(162),n(98),null,null);t.exports=i.exports},function(t,e,n){n(105);var i=n(4)(n(164),n(95),"data-v-05b9fc11",null);t.exports=i.exports},function(t,e,n){n(110);var i=n(4)(n(165),n(102),"data-v-8933b9b0",null);t.exports=i.exports},function(t,e,n){n(108);var i=n(4)(n(166),n(100),"data-v-586c7551",null);t.exports=i.exports},function(t,e,n){n(109);var i=n(4)(n(167),n(101),"data-v-7fd8629e",null);t.exports=i.exports},function(t,e){t.exports={render:function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"alet_container flex-box",on:{click:t.closeTip}},[n("section",{staticClass:"tip_text_container"},[t._t("info"),t._v(" "),n("div",{staticClass:"btns-box flex-box"},[t.isconfirm?n("div",{staticClass:"btns-close btns",on:{click:t.closeTip}},[t._v("取消")]):t._e(),t._v(" "),n("div",{staticClass:"btns-sure btns",on:{click:t.sureTip}},[t._v("确认")])])],2)])},staticRenderFns:[]}},function(t,e){t.exports={render:function(){var t=this,e=t.$createElement;return(t._self._c||e)("div",{class:t.slideClass},[t._t("default")],2)},staticRenderFns:[]}},function(t,e){t.exports={render:function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{class:t.$store.state.platform,attrs:{id:"app"}},[t.$route.meta.nokeepAlive?n("router-view"):n("keep-alive",[n("router-view")],1),t._v(" "),n("el-amap",{staticClass:"amap",staticStyle:{display:"none"},attrs:{vid:"amap",zoom:16,plugin:t.plugin}}),t._v(" "),n("transition",{attrs:{name:"showalert"}},[t.showAlert?n("v-alerttip",{on:{sureTip:function(e){t.$store.state.alertFn(),t.$store.state.showAlert=!1}}},[n("div",{staticClass:"con",attrs:{slot:"info"},slot:"info"},[n("p",{staticClass:"tit"},[t._v(t._s(t.alertMessage))])])]):t._e()],1)],1)},staticRenderFns:[]}},function(t,e){t.exports={render:function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"swiper-container"},[t._t("parallax-bg"),t._v(" "),n("div",{class:t.defaultSwiperClasses.wrapperClass},[t._t("default")],2),t._v(" "),t._t("pagination"),t._v(" "),t._t("button-prev"),t._v(" "),t._t("button-next"),t._v(" "),t._t("scrollbar")],2)},staticRenderFns:[]}},function(t,e){t.exports={render:function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("form",{staticClass:"index-searchbox flex-box",attrs:{action:""}},[n("input",{directives:[{name:"model",rawName:"v-model",value:t.searchVal,expression:"searchVal"}],attrs:{type:"search",placeholder:"请输入景点..."},domProps:{value:t.searchVal},on:{keydown:function(e){if(!("button"in e)&&t._k(e.keyCode,"enter",13))return null;e.preventDefault(),t.searchTarget(e)},input:function(e){e.target.composing||(t.searchVal=e.target.value)}}}),t._v(" "),t.searchVal.length?n("i",{staticClass:"iconfont icon-guanbi",on:{click:function(e){e.preventDefault(),t.searchRemove(e)}}}):n("i",{staticClass:"iconfont icon-sousuo1",on:{click:function(e){e.preventDefault(),t.searchTarget(e)}}})])},staticRenderFns:[]}},function(t,e){t.exports={render:function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("header",{staticClass:"top-searchbar flex-box"},[t.goBack?n("div",{staticClass:"back",on:{click:function(e){t.$router.go(-1)}}},[n("i",{staticClass:"iconfont icon-fanhui"})]):t._e(),t._v(" "),t.searchKey?n("div",{staticClass:"searchbar-con"},[n("search-bar")],1):t._e(),t._v(" "),t.headTitle?n("div",{staticStyle:{flex:"1"}},[n("section",{staticClass:"title-head ellipsis"},[t._v("\n    "+t._s(t.headTitle)+"\n  ")])]):t._e(),t._v(" "),t._t("list"),t._v(" "),t._t("cartEdit"),t._v(" "),t._t("jifenrule")],2)},staticRenderFns:[]}},function(t,e){t.exports={render:function(){var t=this,e=t.$createElement,n=t._self._c||e;return t.length>0?n("div",{staticClass:"Rate"},[n("svg",{staticStyle:{position:"absolute",width:"0",height:"0"},attrs:{width:"0",height:"0",version:"1.1",xmlns:"http://www.w3.org/2000/svg","xmlns:xlink":"http://www.w3.org/1999/xlink"}},[n("defs",[n("symbol",{attrs:{id:"icon-star-empty",viewBox:"0 0 32 32"}},[n("title",[t._v("star-empty")]),t._v(" "),n("path",{attrs:{d:"M32 12.408l-11.056-1.607-4.944-10.018-4.944 10.018-11.056 1.607 8 7.798-1.889 11.011 9.889-5.199 9.889 5.199-1.889-11.011 8-7.798zM16 23.547l-6.983 3.671 1.334-7.776-5.65-5.507 7.808-1.134 3.492-7.075 3.492 7.075 7.807 1.134-5.65 5.507 1.334 7.776-6.983-3.671z"}})]),t._v(" "),n("symbol",{attrs:{id:"icon-star-full",viewBox:"0 0 32 32"}},[n("title",[t._v("star-full")]),t._v(" "),n("path",{attrs:{d:"M32 12.408l-11.056-1.607-4.944-10.018-4.944 10.018-11.056 1.607 8 7.798-1.889 11.011 9.889-5.199 9.889 5.199-1.889-11.011 8-7.798z"}})])])]),t._v(" "),n("input",{directives:[{name:"model",rawName:"v-model",value:t.rate,expression:"rate"}],attrs:{type:"hidden",name:t.name,required:t.required},domProps:{value:t.rate,value:t.rate},on:{input:function(e){e.target.composing||(t.rate=e.target.value)}}}),t._v(" "),t._l(t.length,function(e){return[n("button",{key:e,class:{Rate__star:!0,hover:e<=t.over,filled:e<=t.rate},attrs:{type:"button",disabled:t.disabled},on:{click:function(n){t.setRate(e)}}},[n("svg",{directives:[{name:"show",rawName:"v-show",value:t.isFilled(e),expression:"isFilled(n)"}],staticClass:"icon"},[n("use",{attrs:{"xlink:href":"#icon-star-full"}})]),t._v(" "),n("svg",{directives:[{name:"show",rawName:"v-show",value:t.isEmpty(e),expression:"isEmpty(n)"}],staticClass:"icon"},[n("use",{attrs:{"xlink:href":"#icon-star-empty"}})])])]}),t._v(" "),n("div",{staticClass:"Rate__view",class:{disabled:t.disabled}},[t.showcount?n("span",{staticClass:"count"},[t._v(t._s(t.over))]):t._e(),t._v(" "),t.ratedesc.length>0?n("span",{staticClass:"desc"},[t._v(t._s(t.ratedesc[t.over-1]))]):t._e()])],2):t._e()},staticRenderFns:[]}},function(t,e){t.exports={render:function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("section",{attrs:{id:"foot_guide"}},[n("section",{staticClass:"guide_item",class:t.active("main")?"active":"",on:{click:function(e){t.gotoAddress({path:"/main"})}}},[n("i",{staticClass:"iconfont icon-shouye"}),t._v(" "),n("span",[t._v("首页")])]),t._v(" "),n("section",{staticClass:"guide_item",class:t.active("activity")?"active":"",on:{click:function(e){t.gotoAddress({path:"/activity"})}}},[n("i",{staticClass:"iconfont icon-qihang-copy",staticStyle:{"font-size":".48rem"}}),t._v(" "),n("span",[t._v("活动中心")])]),t._v(" "),n("section",{staticClass:"guide_item",class:t.active("user")?"active":"",on:{click:function(e){t.gotoAddress({path:"/user"})}}},[n("i",{staticClass:"iconfont icon-wode"}),t._v(" "),n("span",[t._v("个人中心")])])])},staticRenderFns:[]}},,function(t,e){},function(t,e){},function(t,e){},function(t,e){},function(t,e){},function(t,e){},function(t,e){},,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0}),e.default={name:"swiper-slide",data:function(){return{slideClass:"swiper-slide"}},ready:function(){this.update()},mounted:function(){this.update(),this.$parent.options.slideClass&&(this.slideClass=this.$parent.options.slideClass)},updated:function(){this.update()},attached:function(){this.update()},methods:{update:function(){this.$parent&&this.$parent.swiper&&this.$parent.swiper.update&&(this.$parent.swiper.update(!0),this.$parent.options.loop&&this.$parent.swiper.reLoop())}}}},function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var i="undefined"!=typeof window;i&&(window.Swiper=n(55),n(104)),e.default={name:"swiper",props:{options:{type:Object,default:function(){return{autoplay:3500}}}},data:function(){return{defaultSwiperClasses:{wrapperClass:"swiper-wrapper"}}},ready:function(){!this.swiper&&i&&(this.swiper=new Swiper(this.$el,this.options))},mounted:function(){var t=this,e=function(){if(!t.swiper&&i){delete t.options.notNextTick;var e=!1;for(var n in t.defaultSwiperClasses)t.defaultSwiperClasses.hasOwnProperty(n)&&t.options[n]&&(e=!0,t.defaultSwiperClasses[n]=t.options[n]);var o=function(){t.swiper=new Swiper(t.$el,t.options)};e?t.$nextTick(o):o()}};this.options.notNextTick?e():this.$nextTick(e)},updated:function(){this.swiper&&this.swiper.update()},beforeDestroy:function(){this.swiper&&(this.swiper.destroy(),delete this.swiper)}}},function(t,e,n){"use strict";function i(t){if(t&&t.__esModule)return t;var e={};if(null!=t)for(var n in t)Object.prototype.hasOwnProperty.call(t,n)&&(e[n]=t[n]);return e.default=t,e}Object.defineProperty(e,"__esModule",{value:!0});var o=n(23),a=function(t){return t&&t.__esModule?t:{default:t}}(o),r=n(11),s=(i(r),n(9)),c=(i(s),n(10));n(24);e.default={name:"app",data:function(){var t=this;return{lng:"",lat:"",add:"",plugin:[{pName:"Geolocation",events:{init:function(e){e.getCurrentPosition(function(e,n){if(n&&n.position){t.$nextTick();var i;i=n.addressComponent.city+"-"+n.addressComponent.district+"-"+n.addressComponent.neighborhood,t.SET_LOCATION({locationCity:n.addressComponent.city,city:n.addressComponent.city,add:i,lng:n.position.lng,lat:n.position.lat,citycode:n.addressComponent.citycode}),t.SET_LOCATIONCITY({locationCity:n.addressComponent.city,locationCitycode:n.addressComponent.citycode})}})}}}]}},mounted:function(){},computed:(0,a.default)({},(0,c.mapState)(["activeCity","activeLocation","showAlert","alertMessage"])),methods:(0,a.default)({},(0,c.mapMutations)(["SET_LOCATION","SET_LOCATIONCITY"]),{appShow:function(){var t=window,e=t.PAGE_START_TIME,n=(new Date).getTime(),i=n-e,o=setTimeout(function(){clearTimeout(o),document.querySelector(".app-loading").className+=" app-loading-hide"},i>2e3?0:2e3-i)}})}},function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0}),e.default={data:function(){return{positionY:0,timer:null}},mounted:function(){},props:["isconfirm"],methods:{closeTip:function(){this.$emit("closeTip")},sureTip:function(){this.$emit("sureTip")}}}},function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});n(10);e.default={data:function(){return{}},created:function(){},activated:function(){},mounted:function(){},computed:{},methods:{gotoAddress:function(t){this.$router.push(t)},active:function(t){return-1!==this.$route.path.indexOf(t)}}}},function(t,e,n){"use strict";function i(t){return t&&t.__esModule?t:{default:t}}Object.defineProperty(e,"__esModule",{value:!0});var o=n(23),a=i(o),r=n(10),s=n(40),c=i(s),u=n(9);!function(t){if(t&&t.__esModule)return t;var e={};if(null!=t)for(var n in t)Object.prototype.hasOwnProperty.call(t,n)&&(e[n]=t[n]);e.default=t}(u);e.default={data:function(){return{}},created:function(){},props:["searchKey","headTitle","goBack"],computed:(0,a.default)({},(0,r.mapState)(["userInfo","activeCityOnce","showLoading"])),methods:(0,a.default)({},(0,r.mapActions)(["getUserInfo"]),(0,r.mapMutations)(["SAVE_ACTIVECITY"])),components:{searchBar:c.default}}},function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0}),e.default={name:"rate",props:{value:{type:[Number,String]},name:{type:String,default:"rate"},length:{type:Number},showcount:{type:Boolean},required:{type:Boolean},ratedesc:{type:Array,default:function(){return[]}},disabled:{type:Boolean,default:!1},readonly:{type:Boolean,default:!1}},data:function(){return{over:0,rate:0}},methods:{onOver:function(t){this.readonly||(this.over=t)},onOut:function(){this.readonly||(this.over=this.rate)},setRate:function(t){if(this.readonly)return!1;this.$emit("beforeRate",this.rate),this.over=this.rate=t,this.$emit("input",this.rate),this.$emit("afterRate",this.rate)},isFilled:function(t){return t<=this.over},isEmpty:function(t){return t>this.over||!this.value&&!this.over}},created:function(){this.value>=this.length?this.value=this.length:this.value<0&&(this.value=0),this.rate=this.value,this.over=this.value}}},function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var i=n(23),o=function(t){return t&&t.__esModule?t:{default:t}}(i),a=n(10);e.default={data:function(){return{searchVal:""}},activated:function(){},computed:(0,o.default)({},(0,a.mapState)([])),methods:(0,o.default)({},(0,a.mapMutations)(["SET_SEARCHKEY"]),{searchRemove:function(){this.searchVal=""},searchTarget:function(){this.SET_SEARCHKEY(this.searchVal),this.openUrl("#/search")}}),watch:{}}},function(t,e,n){"use strict";function i(t){if(t&&t.__esModule)return t;var e={};if(null!=t)for(var n in t)Object.prototype.hasOwnProperty.call(t,n)&&(e[n]=t[n]);return e.default=t,e}function o(t){return t&&t.__esModule?t:{default:t}}var a=n(56),r=o(a),s=n(21),c=o(s),u=n(59),l=o(u),d=n(65),f=o(d),p=n(24),h=o(p);n(63);var v=n(11),m=i(v),g=n(15),_=o(g),y=n(60),w=o(y),b=n(61),A=o(b),C=n(62),M=o(C),E=n(64),T=o(E),S=n(9),x=i(S),k=n(22);c.default.use(h.default),h.default.initAMapApiLoader({key:"f08316066bbed1f168a371a9368ca524",plugin:["AMap.Autocomplete","AMap.PlaceSearch","AMap.Scale","AMap.OverView","AMap.ToolBar","AMap.MapType","AMap.PolyEditor","AMap.CircleEditor","Geolocation"]}),c.default.use(T.default),_.default.state.platform=(m.getQueryString("platform")||"").slice(0,-1),m.setStore("platform",_.default.state.platform),(0,r.default)(M.default).forEach(function(t){var e=t.replace(/(\w)/,function(t){return t.toUpperCase()});c.default.component("v"+e,M.default[t])}),f.default.beforeEach(function(t,e,n){m.setMetaTitle(t.meta.title);var i=t.meta.title,o=window.location.href,a=t.meta.norequiresAuth?0:1;_.default.state.title=i,_.default.state.href=o,_.default.state.norequiresAuth=a,"iOS"!=_.default.state.platform||t.meta.nopush||(null==e.name?n(!0):(n(!1),window.webkit.messageHandlers.push.postMessage({title:i,href:o,norequiresAuth:a}))),"android"!=_.default.state.platform||t.meta.nopush||(null==e.name?n(!0):(window.android.push(i,o,a),n(!1))),("h5"==_.default.state.platform||t.meta.nopush||""==_.default.state.platform)&&(t.matched.some(function(t){return t.meta.norequiresAuth})||x.getUser().then(function(e){null==e.data.user?(m.toast("登录中..."),window.location.href=k.path+"/index/goIndex.action?tourl="+t.path):e.data.user.userTel?e.data.user.userIdcard||(window.location.href=k.path+"/html/realName.html"):window.location.href=k.path+"/html/regist.html"}),n(!0))}),c.default.use(w.default),c.default.use(A.default),new c.default({el:"#app",router:f.default,store:_.default,template:"<App/>",components:{App:l.default}})},function(t,e,n){"use strict";function i(t){if(t&&t.__esModule)return t;var e={};if(null!=t)for(var n in t)Object.prototype.hasOwnProperty.call(t,n)&&(e[n]=t[n]);return e.default=t,e}function o(t){return t&&t.__esModule?t:{default:t}}Object.defineProperty(e,"__esModule",{value:!0});var a=n(160),r=o(a),s=n(158),c=o(s),u=n(9),l=i(u),d=n(58),f=i(d),p=n(15);o(p);e.default={getCartlist:function(t){var e=this,n=t.commit;t.state;return(0,c.default)(r.default.mark(function t(){var i;return r.default.wrap(function(t){for(;;)switch(t.prev=t.next){case 0:return t.next=2,l.shoppingCartNum();case 2:i=t.sent,n(f.SAVE_CARTLIST,i.shoppingCartNum);case 4:case"end":return t.stop()}},t,e)}))()}}},function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0}),e.default={}},function(t,e,n){"use strict";function i(t){if(t&&t.__esModule)return t;var e={};if(null!=t)for(var n in t)Object.prototype.hasOwnProperty.call(t,n)&&(e[n]=t[n]);return e.default=t,e}Object.defineProperty(e,"__esModule",{value:!0});var o,a=n(159),r=function(t){return t&&t.__esModule?t:{default:t}}(a),s=n(58),c=i(s),u=n(11),l=i(u);e.default=(o={},(0,r.default)(o,c.SET_POSITION,function(t,e){t.arrPageName=e;for(var n in t.position)!function(n){e==n&&setTimeout(function(){t.position[n].scroller.scrollTo(t.position[n].pos.left,t.position[n].pos.top)},10)}(n)}),(0,r.default)(o,c.SAVE_PAGE,function(t,e){var n=e.pos,i=e.scroller;t.position[t.arrPageName]={pos:n,scroller:i}}),(0,r.default)(o,c.SET_LOCATION,function(t,e){var n=e.city,i=e.lng,o=e.lat,a=e.citycode;l.setStore("city",n),l.setStore("activeLocation",[i,o]),l.setStore("citycode",a),t.city=n,t.activeLocation=[i,o],t.citycode=a}),(0,r.default)(o,c.SET_LOCATIONCITY,function(t,e){var n=e.locationCity,i=e.locationCitycode;l.setStore("locationCity",n),l.setStore("locationCitycode",i),t.locationCity=n,t.locationCitycode=i}),(0,r.default)(o,c.SET_SEARCHKEY,function(t,e){l.setStore("searchKey",e),t.searchKey=e}),o)}],[169]);
//# sourceMappingURL=app.348af8d424f1f9e70dfe.js.map
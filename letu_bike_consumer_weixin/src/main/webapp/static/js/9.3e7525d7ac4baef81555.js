webpackJsonp([9],{175:function(t,i,e){e(253);var a=e(4)(e(257),e(235),"data-v-b9317e38",null);t.exports=a.exports},208:function(t,i,e){i=t.exports=e(173)(!0),i.push([t.i,".main-box[data-v-b9317e38]{background-color:#fff}.list li[data-v-b9317e38]{padding:0 .28rem;margin-top:.25rem}.list li .con[data-v-b9317e38]{border:1px solid #e1e1e1;border-radius:5px;overflow:hidden;padding-bottom:.2rem}.list li .imgbox[data-v-b9317e38]{width:100%;height:2.95rem;overflow:hidden;background-color:#eee}.list li .imgbox img[data-v-b9317e38]{width:100%}.list li .time[data-v-b9317e38]{text-align:center;font-size:.19rem;color:#b4b4ba;margin-bottom:.15rem}.list li .tit[data-v-b9317e38]{margin:.2rem;font-size:.256rem;color:#646471}.list li .info[data-v-b9317e38]{margin:0 .2rem;font-size:.239rem;color:#aeaeae}","",{version:3,sources:["G:/vue pro/letu-web/src/page/activity.vue"],names:[],mappings:"AACA,2BACE,qBAAuB,CACxB,AACD,0BACE,iBAAkB,AAClB,iBAAmB,CACpB,AACD,+BACI,yBAA0B,AAC1B,kBAAmB,AACnB,gBAAiB,AACjB,oBAAsB,CACzB,AACD,kCACI,WAAY,AACZ,eAAgB,AAChB,gBAAiB,AACjB,qBAAuB,CAC1B,AACD,sCACM,UAAY,CACjB,AACD,gCACI,kBAAmB,AACnB,iBAAmB,AACnB,cAAe,AACf,oBAAsB,CACzB,AACD,+BACI,aAAc,AACd,kBAAoB,AACpB,aAAe,CAClB,AACD,gCACI,eAAgB,AAChB,kBAAoB,AACpB,aAAe,CAClB",file:"activity.vue",sourcesContent:["\n.main-box[data-v-b9317e38] {\n  background-color: #fff;\n}\n.list li[data-v-b9317e38] {\n  padding: 0 .28rem;\n  margin-top: .25rem;\n}\n.list li .con[data-v-b9317e38] {\n    border: 1px solid #e1e1e1;\n    border-radius: 5px;\n    overflow: hidden;\n    padding-bottom: .2rem;\n}\n.list li .imgbox[data-v-b9317e38] {\n    width: 100%;\n    height: 2.95rem;\n    overflow: hidden;\n    background-color: #eee;\n}\n.list li .imgbox img[data-v-b9317e38] {\n      width: 100%;\n}\n.list li .time[data-v-b9317e38] {\n    text-align: center;\n    font-size: 0.19rem;\n    color: #b4b4ba;\n    margin-bottom: .15rem;\n}\n.list li .tit[data-v-b9317e38] {\n    margin: .2rem;\n    font-size: 0.256rem;\n    color: #646471;\n}\n.list li .info[data-v-b9317e38] {\n    margin: 0 .2rem;\n    font-size: 0.239rem;\n    color: #aeaeae;\n}\n"],sourceRoot:""}])},235:function(t,i){t.exports={render:function(){var t=this,i=t.$createElement,e=t._self._c||i;return e("div",{staticClass:"warp page1"},[e("div",{staticClass:"main-box main-box2"},[e("scroller",{ref:"my_scroller",attrs:{"on-refresh":t.refresh,"on-infinite":t.infinite}},[e("ul",{staticClass:"list"},t._l(t.activityList,function(i,a){return e("li",[e("a",{attrs:{href:i.activityUrl,target:"_blank"}},[e("div",{staticClass:"time"},[t._v(t._s(new Date(i.activityCreateTime).format("yyyy-MM-dd hh:mm")))]),t._v(" "),e("div",{staticClass:"con"},[e("div",{staticClass:"imgbox flex-box"},[e("img",{attrs:{src:i.activityImage,alt:""}})]),t._v(" "),e("div",{staticClass:"tit"},[t._v(t._s(i.activityName))]),t._v(" "),e("div",{staticClass:"info",domProps:{innerHTML:t._s(i.activityInstruction)}})])])])}))])],1),t._v(" "),e("v-footer")],1)},staticRenderFns:[]}},253:function(t,i,e){var a=e(208);"string"==typeof a&&(a=[[t.i,a,""]]),a.locals&&(t.exports=a.locals);e(174)("0b94bd32",a,!0)},257:function(t,i,e){"use strict";function a(t){if(t&&t.__esModule)return t;var i={};if(null!=t)for(var e in t)Object.prototype.hasOwnProperty.call(t,e)&&(i[e]=t[e]);return i.default=t,i}Object.defineProperty(i,"__esModule",{value:!0});var n=e(23),o=function(t){return t&&t.__esModule?t:{default:t}}(n),r=e(9),s=a(r),A=e(11),l=(a(A),e(10));i.default={data:function(){return{activityList:[],pageIndex:1,totalPage:1}},activated:function(){},mounted:function(){},components:{},computed:(0,o.default)({},(0,l.mapState)(["activeLocation","city","citycode"])),methods:{refresh:function(t){var i=this;s.activityListApp(1,this.citycode).then(function(e){i.activityList=e.data.data.activityList,i.totalPage=e.data.data.totalPage,i.pageIndex=2,t()})},infinite:function(t){var i=this;if(this.pageIndex>this.totalPage)return void t(!0);s.activityListApp(this.pageIndex,this.citycode).then(function(e){i.activityList=i.activityList.concat(e.data.data.activityList),i.totalPage=e.data.data.totalPage,i.pageIndex++,t()})}},watch:{},filters:{}}}});
//# sourceMappingURL=9.3e7525d7ac4baef81555.js.map
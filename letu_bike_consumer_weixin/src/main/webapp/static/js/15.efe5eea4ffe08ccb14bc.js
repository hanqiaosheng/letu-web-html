webpackJsonp([15],{179:function(t,e,a){a(242);var i=a(4)(a(261),a(224),"data-v-2a75d696",null);t.exports=i.exports},197:function(t,e,a){e=t.exports=a(173)(!0),e.push([t.i,".detail[data-v-2a75d696]{padding:.25rem}.detailbox .item[data-v-2a75d696]{margin-top:.3rem;border-bottom:1px solid #e5e5e5;padding-bottom:.3rem}.detailbox .item .label[data-v-2a75d696]{margin-bottom:.1rem;font-size:.25rem;color:#4b4b4b;position:relative}.detailbox .item p[data-v-2a75d696]{font-size:.23rem;color:#97969b;line-height:1.8}.detailbox .item p.danger[data-v-2a75d696]{color:#69b076}","",{version:3,sources:["G:/vue pro/letu-web/src/page/descriptionGuide.vue"],names:[],mappings:"AACA,yBACE,cAAgB,CACjB,AACD,kCACE,iBAAkB,AAClB,gCAAiC,AACjC,oBAAsB,CACvB,AACD,yCACI,oBAAqB,AACrB,iBAAmB,AACnB,cAAe,AACf,iBAAmB,CACtB,AACD,oCACI,iBAAmB,AACnB,cAAe,AACf,eAAiB,CACpB,AACD,2CACM,aAAe,CACpB",file:"descriptionGuide.vue",sourcesContent:["\n.detail[data-v-2a75d696] {\n  padding: .25rem;\n}\n.detailbox .item[data-v-2a75d696] {\n  margin-top: .3rem;\n  border-bottom: 1px solid #e5e5e5;\n  padding-bottom: .3rem;\n}\n.detailbox .item .label[data-v-2a75d696] {\n    margin-bottom: .1rem;\n    font-size: 0.25rem;\n    color: #4b4b4b;\n    position: relative;\n}\n.detailbox .item p[data-v-2a75d696] {\n    font-size: 0.23rem;\n    color: #97969b;\n    line-height: 1.8;\n}\n.detailbox .item p.danger[data-v-2a75d696] {\n      color: #69b076;\n}\n"],sourceRoot:""}])},224:function(t,e){t.exports={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"warp page1"},[a("div",{staticClass:"main-box"},[a("scroller",{ref:"my_scroller"},[a("div",{staticClass:"detail"},[t.detail?a("div",{staticClass:"detailbox"},[a("div",{staticClass:"item"},[a("div",{staticClass:"label"},[t._v("景区开放时间")]),t._v(" "),a("p",[t._v(t._s(t.detail.scenicSpotOpenTime))]),t._v(" "),a("p",[t._v("此门票下单后2小时生效，如当天游玩敬请注意游玩时 间，须知晓！")])]),t._v(" "),a("div",{staticClass:"item"},[a("div",{staticClass:"label"},[t._v("特殊人群政策")]),t._v(" "),a("p",[t._v(t._s(t.detail.scenicSpotPolicy))])]),t._v(" "),a("div",{staticClass:"item"},[a("div",{staticClass:"label"},[t._v("预订提醒")]),t._v(" "),a("p",[t._v(t._s(t.detail.scenicSpotMsg))])])]):t._e()])])],1)])},staticRenderFns:[]}},242:function(t,e,a){var i=a(197);"string"==typeof i&&(i=[[t.i,i,""]]),i.locals&&(t.exports=i.locals);a(174)("5a1e992d",i,!0)},261:function(t,e,a){"use strict";function i(t){if(t&&t.__esModule)return t;var e={};if(null!=t)for(var a in t)Object.prototype.hasOwnProperty.call(t,a)&&(e[a]=t[a]);return e.default=t,e}Object.defineProperty(e,"__esModule",{value:!0});var n=a(9),o=i(n),s=a(11);i(s),a(10);e.default={data:function(){return{swiperOption:{pagination:".swiper-pagination",loop:!0,paginationClickable:!0,autoplay:2e3,initialSlide:1,autoplayDisableOnInteraction:!1},detail:null}},activated:function(){var t=this;o.scenicMsg(this.$route.params.id).then(function(e){t.detail=e.data.data.scenicSpot})},deactivated:function(){},mounted:function(){},components:{},computed:{},methods:{},watch:{},filters:{}}}});
//# sourceMappingURL=15.efe5eea4ffe08ccb14bc.js.map
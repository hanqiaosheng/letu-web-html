webpackJsonp([8],{178:function(e,t,a){a(254);var n=a(4)(a(260),a(236),"data-v-cc1a6e92",null);e.exports=n.exports},209:function(e,t,a){t=e.exports=a(173)(!0),t.push([e.i,'.detail[data-v-cc1a6e92]{padding:.35rem .25rem}.detailbox .item[data-v-cc1a6e92]{padding-left:.2rem;margin-top:.2rem}.detailbox .item .label[data-v-cc1a6e92]{margin-bottom:.1rem;font-size:.25rem;color:#4b4b4b;position:relative}.detailbox .item .label[data-v-cc1a6e92]:before{content:"";width:.1rem;height:.1rem;border-radius:50%;background-color:#69b076;position:absolute;top:50%;-webkit-transform:translateY(-50%);transform:translateY(-50%);left:-.2rem}.detailbox .item p[data-v-cc1a6e92]{font-size:.23rem;color:#97969b;line-height:1.8}.detailbox .item p.danger[data-v-cc1a6e92]{color:#69b076}',"",{version:3,sources:["G:/vue pro/letu-web/src/page/description.vue"],names:[],mappings:"AACA,yBACE,qBAAuB,CACxB,AACD,kCACE,mBAAqB,AACrB,gBAAkB,CACnB,AACD,yCACI,oBAAqB,AACrB,iBAAmB,AACnB,cAAe,AACf,iBAAmB,CACtB,AACD,gDACM,WAAY,AAEZ,YAAa,AACb,aAAc,AACd,kBAAmB,AACnB,yBAA0B,AAC1B,kBAAmB,AACnB,QAAS,AACT,mCAAoC,AAC5B,2BAA4B,AACpC,WAAa,CAClB,AACD,oCACI,iBAAmB,AACnB,cAAe,AACf,eAAiB,CACpB,AACD,2CACM,aAAe,CACpB",file:"description.vue",sourcesContent:["\n.detail[data-v-cc1a6e92] {\n  padding: .35rem .25rem;\n}\n.detailbox .item[data-v-cc1a6e92] {\n  padding-left: .20rem;\n  margin-top: .2rem;\n}\n.detailbox .item .label[data-v-cc1a6e92] {\n    margin-bottom: .1rem;\n    font-size: 0.25rem;\n    color: #4b4b4b;\n    position: relative;\n}\n.detailbox .item .label[data-v-cc1a6e92]:before {\n      content: '';\n      position: absolute;\n      width: .1rem;\n      height: .1rem;\n      border-radius: 50%;\n      background-color: #69b076;\n      position: absolute;\n      top: 50%;\n      -webkit-transform: translateY(-50%);\n              transform: translateY(-50%);\n      left: -.2rem;\n}\n.detailbox .item p[data-v-cc1a6e92] {\n    font-size: 0.23rem;\n    color: #97969b;\n    line-height: 1.8;\n}\n.detailbox .item p.danger[data-v-cc1a6e92] {\n      color: #69b076;\n}\n"],sourceRoot:""}])},236:function(e,t){e.exports={render:function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{staticClass:"warp page1"},[a("div",{staticClass:"main-box"},[a("scroller",{ref:"my_scroller"},[a("div",{staticClass:"detail"},[e.detail?a("div",{staticClass:"detailbox",domProps:{innerHTML:e._s(e.detail.discountPackageDetail)}}):e._e()])])],1)])},staticRenderFns:[]}},254:function(e,t,a){var n=a(209);"string"==typeof n&&(n=[[e.i,n,""]]),n.locals&&(e.exports=n.locals);a(174)("2f058527",n,!0)},260:function(e,t,a){"use strict";function n(e){if(e&&e.__esModule)return e;var t={};if(null!=e)for(var a in e)Object.prototype.hasOwnProperty.call(e,a)&&(t[a]=e[a]);return t.default=e,t}Object.defineProperty(t,"__esModule",{value:!0});var i=a(9),o=n(i),r=a(11);n(r),a(10);t.default={data:function(){return{swiperOption:{pagination:".swiper-pagination",loop:!0,paginationClickable:!0,autoplay:2e3,initialSlide:1,autoplayDisableOnInteraction:!1},detail:null}},activated:function(){var e=this;o.packageContent(this.$route.params.id).then(function(t){e.detail=t.data.data.discountPackage})},deactivated:function(){},mounted:function(){},components:{},computed:{},methods:{},watch:{},filters:{}}}});
//# sourceMappingURL=8.a7499d32aa12d7ccee92.js.map
"use strict";var app={app:!1,isloaded:!1,header:!1,footer:!1,settings:{navDetectAuto:!0,navHorizontalDetectAuto:!0,screen_md:992,sidepanelMobileHeight:400,sidebarMobileHeight:400},accordion_settings:{titleHeight:50,noResize:!1},init:function(){this.app=$(".app"),this.header=$(".app > .app-header").length>0&&$(".app > .app-header"),this.footer=$(".app > .app-footer").length>0&&$(".app > .app-footer")},layout:function(){app.layoutSidebars(),1===$(".app-content > .app-header").length&&$(".app-container").addClass("app-header-inside-content"),$(".app-container").each(function(){var a=$(this).find(".app-content");$(this).find(".app-sidebar").each(function(){$(this).hasClass("dir-left")&&a.addClass("app-sidebar-left"),$(this).hasClass("dir-right")&&a.addClass("app-sidebar-right")})}),$(".app-sidebar-left-closed .app-sidebar, .app-sidebar-right-closed .app-sidebar").css("display","none"),$("[data-sidebar-toggle]").on("click",function(){var a=$($(this).data("sidebar-toggle")),e=a.hasClass("dir-left")?"left":"right",i=a.parent(".app-container");return i.hasClass("app-sidebar-"+e+"-closed")?(a.css("display","block"),setTimeout(function(){i.removeClass("app-sidebar-"+e+"-closed")},10)):(a.css("display","none"),i.addClass("app-sidebar-"+e+"-closed")),$(window).resize(),!1}),$("[data-sidebar-minimize]").on("click",function(){if($(window).width()<app.settings.screen_md)return!1;var a=$($(this).data("sidebar-minimize")),e=a.hasClass("dir-left")?"left":"right",i=a.parent(".app-container"),t="app-sidebar-"+e+"-minimized";return i.removeClass("app-sidebar-"+e+"-closed"),a.css("display","block"),i.hasClass(t)?(i.removeClass(t),a.removeClass("app-navigation-minimized").find("li.open").removeClass("open"),a.removeAttr("data-minimized").removeData("minimized"),a.hasClass("scroll")&&a.mCustomScrollbar("update")):(i.addClass(t),a.addClass("app-navigation-minimized").find("li.open").removeClass("open"),a.removeAttr("data-minimized").removeData("minimized"),a.hasClass("scroll")&&a.mCustomScrollbar("disable",!0)),$(window).resize(),!1}),$("[data-sidepanel-toggle]").on("click",function(){var a=$($(this).data("sidepanel-toggle"));return $(".app").hasClass("app-sidepanel-open")?($(".app").removeClass("app-sidepanel-open"),"show"===a.data("overlay")&&app.hideOverlay()):($(".app").addClass("app-sidepanel-open"),"show"===a.data("overlay")&&app.showOverlay(function(){$(".app-overlay").on("click",function(){$(".app").removeClass("app-sidepanel-open"),app.hideOverlay()})})),$(window).resize(),!1}),$("[data-separate-toggle-panel]").on("click",function(){$($(this).data("separate-toggle-panel")).toggleClass("open")})},layoutSidebars:function(){$(window).width()<app.settings.screen_md?($(".app-container").hasClass("app-sidebar-left-minimized")&&($(".app-container").removeClass("app-sidebar-left-minimized"),$(".app-sidebar.dir-left").removeClass("app-navigation-minimized"),$(".app-sidebar.dir-left").attr("data-minimized","minimized")),$(".app-container").hasClass("app-sidebar-right-minimized")&&($(".app-container").removeClass("app-sidebar-right-minimized"),$(".app-sidebar.dir-right").removeClass("app-navigation-minimized"),$(".app-sidebar.dir-right").attr("data-minimized","minimized"))):("minimized"===$(".app-sidebar.dir-left").data("minimized")&&($(".app-container").addClass("app-sidebar-left-minimized"),$(".app-sidebar.dir-left").addClass("app-navigation-minimized"),$(".app-sidebar.dir-left").mCustomScrollbar("disable",!0)),"minimized"===$(".app-sidebar.dir-right").data("minimized")&&($(".app-container").addClass("app-sidebar-right-minimized"),$(".app-sidebar.dir-right").addClass("app-navigation-minimized"),$(".app-sidebar.dir-right").mCustomScrollbar("disable",!0)))},navigation:function(){if($(".app-navigation nav > ul").find("ul").parent("li").addClass("openable"),app.settings.navDetectAuto&&!$(".app-navigation").hasClass("app-navigation-minimized")){i=(e=(a=window.location.pathname).split("/"))[e.length-1];$(".app-navigation a[href='"+i+"']").addClass("active").parents(".openable").addClass("open")}if($(".app-navigation .openable > a").on("click",function(a){a.stopPropagation();var e=$(this).parent(".openable");return e.hasClass("open")?(e.removeClass("open"),e.find("li.open").removeClass("open")):((e.parents(".app-navigation").hasClass("app-navigation-minimized")||"close-other"===e.parents(".app-navigation").data("type"))&&e.parent("ul").find("> li").not(e).removeClass("open"),e.addClass("open"),setTimeout(function(){$(".app-navigation").mCustomScrollbar("scrollTo",e)},200)),$(".app-navigation").hasClass("scroll")?$(".app-navigation").mCustomScrollbar("update"):$(window).resize(),!1}),$(".app-navigation-horizontal nav > ul > li > ul").each(function(){$(this).parent("li").addClass("openable")}),app.settings.navHorizontalDetectAuto){var a=window.location.pathname,e=a.split("/"),i=e[e.length-1];$(".app-navigation-horizontal a[href='"+i+"']").parent("li").addClass("active").parents(".openable").addClass("active")}$(".app-navigation-horizontal .openable > a").on("click",function(a){return a.stopPropagation(),$(this).parents(".app-navigation-horizontal").find(".openable").removeClass("active"),$(this).parent(".openable").addClass("active"),!1})},navigationMobile:function(){$(".app-navigation-moblie-wrapper").length>0&&($("[data-navigation-mobile-toggle]").on("click",function(a){return a.stopPropagation(),$(".app").toggleClass("app-navigation-moblie-open"),!1}),$(".app .app-navigation-mobile").on("click",function(a){a.stopPropagation()}),$(".app .app-content").on("click",function(){$(".app").removeClass("app-navigation-moblie-open")})),$(".app-header-navigation").length>0&&($("[data-header-navigation-toggle]").on("click",function(){return $(".app-header-navigation").toggleClass("show"),!1}),$(".app-header-navigation li > a").on("click",function(){var a=$(this).parent("li");if(a.find("ul").length>0||a.find(".app-header-navigation-megamenu").length>0)return a.toggleClass("open"),!1})),$(".app-navigation-horizontal").length>0&&$("[data-navigation-horizontal-toggle]").on("click",function(){return $(".app-navigation-horizontal").toggleClass("show"),!1})},spy:function(){app.layoutSidebars(),$(".app-content .container-full-size").length>0&&$(".app-content .container-full-size").removeAttr("style"),$(".block-flying").length>0&&($(".block-flying").removeAttr("style"),$(".block-flying .block-flying-content").removeAttr("style"));var a=$(window).height(),e=this._getHeaderHeight()+this._getFooterHeight()+this._getCustomOffset(),i=$(".app-container .app-sidebar.app-navigation-fixed").length>0,t=$(".app-container .app-sidebar"),n=$(".app-container .app-content"),o=$(".app-sidepanel").length>0&&$(".app-sidepanel");t.css({height:"auto"});var p=app._getTotalHeight(n.children()),s=this._getMaxHeight(t);if($(window).width()>app.settings.screen_md){if(p>=s&&0!==s?(0===s&&p+e<a?n.height(a-e):p+e<=a&&(n.height(a-e),p=n.height()),t.height(p)):(p+e<=a&&n.height(a-e),s+e<=a&&t.height(a-e)),t.each(function(){"true"===$(this).attr("data-control-height")&&$(this).height(s)}),$("[data-separate-control-height]").length>0){p=$(".app-container").height()-app._getTotalHeight($(".app-content > div").not(".app-content-separate"));$("[data-separate-control-height]").height(p)}if(i){var r=$(".app-container .app-sidebar.app-navigation-fixed");app.footer?(r.addClass("app-navigation-fixed-absolute"),r.height($(".app").height()-app.footer.height())):r.height(a)}o&&o.height(a)}else $("[data-separate-control-height]").length>0&&$("[data-separate-control-height]").css({height:"auto"}),t.each(function(){"true"===$(this).attr("data-control-height")?$(this).height(app.settings.sidebarMobileHeight):$(this).css({height:"auto"})}),o&&o.height($(window).height());return $(".app-content .container-full-size").length>0&&$(".app-content .container-full-size").height(a-$(".app-content .app-header").height()-1),$(".block-flying").length>0&&($(".block-flying").height($(".block-flying").height()),$(".block-flying .block-flying-content").height($(".block-flying").height()-app._getTotalHeight($(".block-flying > div").not(".block-flying-content"))),$(window).width()<app.settings.screen_md&&$(".block-flying").width($(".app-container").width()-30)),!1},block:{delete:function(a,e){return(a=$(a)).fadeOut(200,function(){$(this).remove()}),"function"==typeof e&&e(),app.spy(),!1},toggle:function(a,e){return(a=$(a)).toggleClass("block-toggled"),"function"==typeof e&&e(),app.spy(),!1},expand:function(a,e){return(a=$(a)).toggleClass("block-expanded"),"function"==typeof e&&e(),!1},loading:{start:function(a){return $(a).append('<div class="block-loading-layer"><div class="app-spinner loading loading-primary"></div></div>'),!0},finish:function(a){return $(a).find(".block-loading-layer").remove(),!0}}},panel:{delete:function(a,e){return(a=$(a)).fadeOut(200,function(){$(this).remove()}),"function"==typeof e&&e(),app.spy(),!1},toggle:function(a,e){return(a=$(a)).toggleClass("panel-toggled"),"function"==typeof e&&e(),app.spy(),!1},expand:function(a,e){return(a=$(a)).toggleClass("panel-expanded"),"function"==typeof e&&e(),!1}},resizableLayout:function(){if(0===$(".app-content-resizable").length)return!1;var a=$(".app-content-resizable"),e=a.children(".app-content-resizable-column");$(".app-content-resizable-column").not(":last-child").resizable({handles:"e",minWidth:300,start:function(a,i){e.each(function(){$(this).width($(this).width())})},resize:function(e,i){var t=$(this).next(".app-content-resizable-column"),n=$(".app-content-resizable-column").not(t).not($(this)),o=app._getMaxWidth(n),p=a.width()-o-i.size.width;if(p<300)return p=300,$(this).width(a.width()-o-300),t.width(p),!1;t.width(p)},stop:function(i,t){e.each(function(){$(this).width(Math.round($(this).width()/a.width()*100)+"%")})}})},features:{gallery:{init:function(){this.controlHeight(),$(".app-feature-gallery").on("click","> li:first",function(){var a=$(this).parents(".app-feature-gallery");$(this).appendTo(a)})},controlHeight:function(){$(".app-feature-gallery").each(function(){var a=$(this).find("> li:first");$(this).height(app._getTotalHeight(a.children()))})}},preview:{init:function(){var a=$("#preview"),e=a.find(".modal-dialog"),i=a.find(".modal-body");$(".preview").on("click",function(){return i.html(""),e.removeClass("modal-lg modal-sm modal-fw"),$(this).data("preview-image")&&i.append(app.features.preview.build.image($(this).data("preview-image"))),$(this).data("preview-video")&&i.append(app.features.preview.build.video($(this).data("preview-video"))),$(this).data("preview-href")&&(i.html(app.features.preview.build.href($(this).data("preview-href"))),app_plugins.loaded()),$(this).data("preview-size")&&e.addClass($(this).data("preview-size")),$(this).data("preview-title")&&$(this).data("preview-description")&&i.prepend(app.features.preview.build.text($(this).data("preview-title"),$(this).data("preview-description"))),a.modal("show"),!1}),a.on("hidden.bs.modal",function(){i.html("")})},build:{image:function(a){return $("<img>").attr("src",a).addClass("img-responsive")},video:function(a){return $('<div class="app-preview-video"><iframe src="'+a+'" width="100%" frameborder="0" allowfullscreen></iframe></div>')},href:function(a){var e=null;return $.ajax({url:a,type:"get",dataType:"html",async:!1,success:function(a){e=a}}),e},text:function(a,e){return $("<div></div>").addClass("app-heading app-heading-small app-heading-condensed").append($("<div></div>").addClass("title").html("<h5>"+a+"</h5><p>"+e+"</p>"))}}}},accordion:function(){$(".app-accordion").length>0&&$(".app-accordion").each(function(){var a=$(this);a.find(".item").each(function(){var e=$(this);a.data("type")||a.addClass("app-accordion-simple"),e.find(".heading").on("click",function(){e.hasClass("open")?e.removeClass("open").removeAttr("style"):e.addClass("open"),"close-other"===a.data("open")&&a.find(".item").not(e).removeClass("open").removeAttr("style"),"full-height"===a.data("type")&&app.accordionFullHeight(a)})})})},accordionFullHeight:function(a){if(a.hasClass("app-accordion-simple"))return!1;var e=a.parent("div"),i=a.find(".item"),t=i.length,n=i.filter(".open").length;a.height(e.height()),(i=i.filter(".open")).removeAttr("style");var o=e.height()-(t-n)*app.accordion_settings.titleHeight,p=Math.floor(o/n);i.each(function(){$(this).height(p),$(this).find(".content").height(p-app.accordion_settings.titleHeight)})},accordionFullHeightSpy:function(){$(".app-accordion").each(function(){app.accordionFullHeight($(this))})},accordionFullHeightResize:function(){$(".app-accordion").removeAttr("style").find(".item.open").removeAttr("style"),delayBeforeFire(function(){app.accordionFullHeightSpy()},200)},contentTabs:function(){$(".app-content-tabs").length>0&&($(".app-content-tabs a .close-tab").on("click",function(a){a.stopPropagation();var e=$(this).parents(".app-content-tabs");$($(this).parent("a").attr("href")).remove(),$(this).parents("li").remove(),e.find("li:first > a").trigger("click")}),$(".app-content-tabs a").on("click",function(){return $(".app-content-tabs a, .app-content-tab").removeClass("active"),$(this).addClass("active"),$($(this).attr("href")).addClass("active"),!1}))},showOverlay:function(a){$(".app-overlay").addClass("show"),"function"==typeof a&&a()},hideOverlay:function(){$(".app-overlay").removeClass("show")},formsFile:function(){$("input.file").each(function(){var a=void 0===$(this).attr("title")?"Browse":$(this).attr("title"),e=$(this).attr("class").replace("file","");e=""===e?" btn-default":e,e=$(this).is(":disabled")?e+" disabled":e,$(this).wrap('<a href="#" class="file-input btn'+e+'"></a>').parent("a").append(a),$(this).parent("a").after('<span class="file-input-name"></span>')}),$("input.file").on("change",function(){for(var a=$(this)[0].files,e="",i=a.length>1?i=", ":"",t=0;t<a.length;t++)e+=a[t].name.split("/").pop().split("\\").pop()+(t!==a.length-1?i:"");$(this).parent("a").next(".file-input-name").html(e)})},misc:function(){$(document).on("click",".app-header .dropdown-menu",function(a){a.stopPropagation()}),$(".panel-collapse").on("shown.bs.collapse",function(){$(window).resize()}),$(".alert-dismissible").on("closed.bs.alert",function(){$(window).resize()}),$("a[data-toggle='tab']").on("shown.bs.tab",function(){$(window).resize()}),$(".icons-preview > li").on("click",function(){var a=$(this).find(".name").html();$("#modal-icon-preview .modal-icon-preview-name").html(a),$("#modal-icon-preview .modal-icon-preview-span").val('<span class="'+a+'"></span>'),$("#modal-icon-preview .modal-icon-preview-value").val(a),$("#modal-icon-preview .modal-icon-preview-icon span").removeAttr("class").addClass(a),$("#modal-icon-preview").modal("show")}),$(".modal-icon-preview-value, .modal-icon-preview-span").on("click",function(){$(this).select()}),$(".app-lock .app-lock-user").on("click",function(){$(".app-lock").addClass("app-lock-open"),$(".app-lock .app-lock-form").show().addClass("animated bounceIn"),$(".app-lock .app-lock-form .form-control").focus()}),$.expr[":"].containsi=function(a,e,i){return jQuery(a).text().toUpperCase().indexOf(i[3].toUpperCase())>=0}},doc_nav:function(){var a=$(window).height(),e=$(".doc_fix_nav"),i=e.parent("div").width()-27;e.length>0&&(e.width(i),e.height()>a&&(e.height(a-60),e.mCustomScrollbar({axis:"y",autoHideScrollbar:!0,scrollInertia:200,advanced:{autoScrollOnFocus:!1}})),$(window).scroll(function(){var a=$(window).scrollTop(),i=$(document).height()-397-e.outerHeight(!0);a>175?(e.addClass("fixed"),a>i?e.addClass("stack"):e.removeClass("stack")):e.removeClass("fixed")}))},loading:function(a,e){var i=$.extend({state:"",value:[0,0],position:"",speed:20,complete:null},e);if("show"==a||"update"==a){if("show"==a){$(".app-loading").remove();var t='<div class="app-loading '+i.position+'">\n                               <div class="app-loading-progress'+(""!=i.state?" app-loading-"+i.state:"")+'" style="width:'+i.value[0]+'%;"></div>\n                           </div>';$("body").append(t)}var n=$.isArray(i.value)?i.value[0]:$(".app-loading .app-loading-progress").width(),o=$.isArray(i.value)?i.value[1]:i.value,p=setInterval(function(){$(".app-loading .app-loading-progress").css("width",n+"%"),++n>o&&(clearInterval(p),$.isFunction(i.complete)&&i.complete.call(this))},i.speed)}"destroy"==a&&$(".app-loading").remove()},statusbar:{init:function(){$(".app-statusbar-open, .app-statusbar-close").on("click",function(){return app.statusbar.open($(this).attr("href")),!1})},open:function(a){$(".app-statusbar").hide(),$(a).is(":hidden")&&$(a).fadeIn()}},search:function(){$(".app-header-search").on("click",function(){$(".app-header-search > input").focus()})},checkAll:function(){$("table .checkall").on("change",function(){var a=!!$(this).is(":checked");$(this).parents("table").find("tbody").find("tr").each(function(){$(this).find("input:checkbox").prop("checked",a).attr("checked",a)})})},_getTotalHeight:function(a){var e=0;return a.each(function(){e+=$(this).outerHeight(!0)}),e},_getMaxHeight:function(a){var e=0;return a.each(function(){e=$(this).height()>e?$(this).height():e}),e},_getMaxWidth:function(a){var e=0;return a.each(function(){e=$(this).width()>e?$(this).width():e}),e},_getHeaderHeight:function(){return this.header?this.header.outerHeight(!0):0},_getFooterHeight:function(){return this.footer?this.footer.outerHeight(!0):0},_getCustomOffset:function(){return this.app.data("offset-height")?this.app.data("offset-height"):0},_delayBeforeFire:function(){var a=0;return function(e,i){clearTimeout(a),a=setTimeout(e,i)}},_toggleClass:function(a,e){return $(a).toggleClass(e),app.spy(),!1},_addClass:function(a,e){return $(a).addClass(e),app.spy(),!1},_removeClass:function(a,e){return $(a).removeClass(e),app.spy(),!1},loaded:function(){app.spy(),app.app.addClass("app-loaded"),app.accordion(),app.accordionFullHeightSpy(),setTimeout(function(){$("body").scrollTop(0)},500),app.isloaded=!0}};$(function(){app.init(),app.layout(),app.resizableLayout(),app.navigation(),app.navigationMobile(),app.contentTabs(),app.formsFile(),app.checkAll(),app.features.gallery.init(),app.features.preview.init(),app.statusbar.init(),app.search(),app.misc(),app.doc_nav()}),$(window).resize(function(){delayBeforeFire(function(){app.accordionFullHeightResize(),app.features.gallery.controlHeight(),app.spy()},100)});var delayBeforeFire=function(){var a=0;return function(e,i){clearTimeout(a),a=setTimeout(e,i)}}();
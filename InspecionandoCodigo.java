package AprendendoJavaScript;
//Acesse pelo menos dois sites de sua preferência e 
//os inspecione com o botão direito do mouse na página web.
//Com o código fonte aberto você deve: 

//1) Verificar no código algum elemento que utilize JavaScript; 
//2) Marcar alguns elementos do site; 
//3) Explicar como ele se comporta. Exemplo: entrar no 
//4) site do Google, inspecionar o botão de pesquisa, verificar o código e explicar qual a finalidade do botão. 

//Resposta:
//1) e 2) <script type="text/javascript" id="contact-form-7-js-extra">
//* <![CDATA[ */ var wpcf7 = {"api":{"root":"https:\/\/grandediaturismo.com.br\/wp-json\/","namespace":"contact-form-7\/v1"},"cached":"1"};
// /* ]]> */ </script>
//3) e 4) Esse elemento do JavaScript é um formulário que pode ser 
//   preenchido pelo usuário afim de receber informações sobre viagens.



public class InspecionandoCodigo {
	<!DOCTYPE html> 
	<html lang="pt-BR">
	<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalabe=no">
	<link rel="profile" href="https://gmpg.org/xfn/11">
	<link rel="pingback" href="https://grandediaturismo.com.br/xmlrpc.php">


		<!-- This site is optimized with the Yoast SEO plugin v15.8 - https://yoast.com/wordpress/plugins/seo/ -->
		<title>Grande Dia Turismo - Viaje conosco!</title>
		<meta name="description" content="Viaje conosco!" />
		<meta name="robots" content="index, follow, max-snippet:-1, max-image-preview:large, max-video-preview:-1" />
		<link rel="canonical" href="https://grandediaturismo.com.br/" />
		<meta property="og:locale" content="pt_BR" />
		<meta property="og:type" content="website" />
		<meta property="og:title" content="Grande Dia Turismo - Viaje conosco!" />
		<meta property="og:description" content="Viaje conosco!" />
		<meta property="og:url" content="https://grandediaturismo.com.br/" />
		<meta property="og:site_name" content="Grande Dia Turismo" />
		<meta name="twitter:card" content="summary" />
		<script type="application/ld+json" class="yoast-schema-graph">{"@context":"https://schema.org","@graph":[{"@type":"WebSite","@id":"https://grandediaturismo.com.br/#website","url":"https://grandediaturismo.com.br/","name":"Grande Dia Turismo","description":"Viaje conosco!","potentialAction":[{"@type":"SearchAction","target":"https://grandediaturismo.com.br/?s={search_term_string}","query-input":"required name=search_term_string"}],"inLanguage":"pt-BR"},{"@type":"CollectionPage","@id":"https://grandediaturismo.com.br/#webpage","url":"https://grandediaturismo.com.br/","name":"Grande Dia Turismo - Viaje conosco!","isPartOf":{"@id":"https://grandediaturismo.com.br/#website"},"description":"Viaje conosco!","breadcrumb":{"@id":"https://grandediaturismo.com.br/#breadcrumb"},"inLanguage":"pt-BR","potentialAction":[{"@type":"ReadAction","target":["https://grandediaturismo.com.br/"]}]},{"@type":"BreadcrumbList","@id":"https://grandediaturismo.com.br/#breadcrumb","itemListElement":[{"@type":"ListItem","position":1,"item":{"@type":"WebPage","@id":"https://grandediaturismo.com.br/","url":"https://grandediaturismo.com.br/","name":"In\u00edcio"}}]}]}</script>
		<!-- / Yoast SEO plugin. -->


	<link rel='dns-prefetch' href='//fonts.googleapis.com' />
	<link rel='dns-prefetch' href='//s.w.org' />
	<link rel="alternate" type="application/rss+xml" title="Feed para Grande Dia Turismo &raquo;" href="https://grandediaturismo.com.br/feed/" />
	<link rel="alternate" type="application/rss+xml" title="Feed de comentários para Grande Dia Turismo &raquo;" href="https://grandediaturismo.com.br/comments/feed/" />
			<!-- This site uses the Google Analytics by ExactMetrics plugin v7.2.1 - Using Analytics tracking - https://www.exactmetrics.com/ -->
								<script src="//www.googletagmanager.com/gtag/js?id=UA-99564378-17"  type="text/javascript" data-cfasync="false" async></script>
				<script type="text/javascript" data-cfasync="false">
					var em_version = '7.2.1';
					var em_track_user = true;
					var em_no_track_reason = '';
					
									var disableStrs = [
																'ga-disable-UA-99564378-17',
										];

					/* Function to detect opted out users */
					function __gtagTrackerIsOptedOut() {
						for ( var index = 0; index < disableStrs.length; index++ ) {
							if ( document.cookie.indexOf( disableStrs[ index ] + '=true' ) > -1 ) {
								return true;
							}
						}

						return false;
					}

					/* Disable tracking if the opt-out cookie exists. */
					if ( __gtagTrackerIsOptedOut() ) {
						for ( var index = 0; index < disableStrs.length; index++ ) {
							window[ disableStrs[ index ] ] = true;
						}
					}

					/* Opt-out function */
					function __gtagTrackerOptout() {
						for ( var index = 0; index < disableStrs.length; index++ ) {
							document.cookie = disableStrs[ index ] + '=true; expires=Thu, 31 Dec 2099 23:59:59 UTC; path=/';
							window[ disableStrs[ index ] ] = true;
						}
					}

					if ( 'undefined' === typeof gaOptout ) {
						function gaOptout() {
							__gtagTrackerOptout();
						}
					}
									window.dataLayer = window.dataLayer || [];

					window.ExactMetricsDualTracker = {
						helpers: {},
						trackers: {},
					};
					if ( em_track_user ) {
						function __gtagDataLayer() {
							dataLayer.push( arguments );
						}

						function __gtagTracker( type, name, parameters ) {
							if (!parameters) {
								parameters = {};
							}

							if (parameters.send_to) {
								__gtagDataLayer.apply( null, arguments );
								return;
							}

							if ( type === 'event' ) {
								
																parameters.send_to = exactmetrics_frontend.ua;
									__gtagDataLayer( type, name, parameters );
														} else {
								__gtagDataLayer.apply( null, arguments );
							}
						}
						__gtagTracker( 'js', new Date() );
						__gtagTracker( 'set', {
							'developer_id.dNDMyYj' : true,
												} );
																__gtagTracker( 'config', 'UA-99564378-17', {"forceSSL":"true"} );
											window.gtag = __gtagTracker;										(
							function () {
								/* https://developers.google.com/analytics/devguides/collection/analyticsjs/ */
								/* ga and __gaTracker compatibility shim. */
								var noopfn = function () {
									return null;
								};
								var newtracker = function () {
									return new Tracker();
								};
								var Tracker = function () {
									return null;
								};
								var p = Tracker.prototype;
								p.get = noopfn;
								p.set = noopfn;
								p.send = function (){
									var args = Array.prototype.slice.call(arguments);
									args.unshift( 'send' );
									__gaTracker.apply(null, args);
								};
								var __gaTracker = function () {
									var len = arguments.length;
									if ( len === 0 ) {
										return;
									}
									var f = arguments[len - 1];
									if ( typeof f !== 'object' || f === null || typeof f.hitCallback !== 'function' ) {
										if ( 'send' === arguments[0] ) {
											var hitConverted, hitObject = false, action;
											if ( 'event' === arguments[1] ) {
												if ( 'undefined' !== typeof arguments[3] ) {
													hitObject = {
														'eventAction': arguments[3],
														'eventCategory': arguments[2],
														'eventLabel': arguments[4],
														'value': arguments[5] ? arguments[5] : 1,
													}
												}
											}
											if ( 'pageview' === arguments[1] ) {
												if ( 'undefined' !== typeof arguments[2] ) {
													hitObject = {
														'eventAction': 'page_view',
														'page_path' : arguments[2],
													}
												}
											}
											if ( typeof arguments[2] === 'object' ) {
												hitObject = arguments[2];
											}
											if ( typeof arguments[5] === 'object' ) {
												Object.assign( hitObject, arguments[5] );
											}
											if ( 'undefined' !== typeof arguments[1].hitType ) {
												hitObject = arguments[1];
												if ( 'pageview' === hitObject.hitType ) {
													hitObject.eventAction = 'page_view';
												}
											}
											if ( hitObject ) {
												action = 'timing' === arguments[1].hitType ? 'timing_complete' : hitObject.eventAction;
												hitConverted = mapArgs( hitObject );
												__gtagTracker( 'event', action, hitConverted );
											}
										}
										return;
									}

									function mapArgs( args ) {
										var arg, hit = {};
										var gaMap = {
											'eventCategory': 'event_category',
											'eventAction': 'event_action',
											'eventLabel': 'event_label',
											'eventValue': 'event_value',
											'nonInteraction': 'non_interaction',
											'timingCategory': 'event_category',
											'timingVar': 'name',
											'timingValue': 'value',
											'timingLabel': 'event_label',
											'page' : 'page_path',
											'location' : 'page_location',
											'title' : 'page_title',
										};
										for ( arg in args ) {
																					if ( ! ( ! args.hasOwnProperty(arg) || ! gaMap.hasOwnProperty(arg) ) ) {
												hit[gaMap[arg]] = args[arg];
											} else {
												hit[arg] = args[arg];
											}
										}
										return hit;
									}

									try {
										f.hitCallback();
									} catch ( ex ) {
									}
								};
								__gaTracker.create = newtracker;
								__gaTracker.getByName = newtracker;
								__gaTracker.getAll = function () {
									return [];
								};
								__gaTracker.remove = noopfn;
								__gaTracker.loaded = true;
								window['__gaTracker'] = __gaTracker;
							}
						)();
										} else {
											console.log( "" );
						( function () {
								function __gtagTracker() {
									return null;
								}
								window['__gtagTracker'] = __gtagTracker;
								window['gtag'] = __gtagTracker;
						} )();
										}
				</script>
					<!-- / Google Analytics by ExactMetrics -->
					<script type="text/javascript">
				window._wpemojiSettings = {"baseUrl":"https:\/\/s.w.org\/images\/core\/emoji\/13.0.0\/72x72\/","ext":".png","svgUrl":"https:\/\/s.w.org\/images\/core\/emoji\/13.0.0\/svg\/","svgExt":".svg","source":{"concatemoji":"https:\/\/grandediaturismo.com.br\/wp-includes\/js\/wp-emoji-release.min.js?ver=5.5.9"}};
				!function(e,a,t){var n,r,o,i=a.createElement("canvas"),p=i.getContext&&i.getContext("2d");function s(e,t){var a=String.fromCharCode;p.clearRect(0,0,i.width,i.height),p.fillText(a.apply(this,e),0,0);e=i.toDataURL();return p.clearRect(0,0,i.width,i.height),p.fillText(a.apply(this,t),0,0),e===i.toDataURL()}function c(e){var t=a.createElement("script");t.src=e,t.defer=t.type="text/javascript",a.getElementsByTagName("head")[0].appendChild(t)}for(o=Array("flag","emoji"),t.supports={everything:!0,everythingExceptFlag:!0},r=0;r<o.length;r++)t.supports[o[r]]=function(e){if(!p||!p.fillText)return!1;switch(p.textBaseline="top",p.font="600 32px Arial",e){case"flag":return s([127987,65039,8205,9895,65039],[127987,65039,8203,9895,65039])?!1:!s([55356,56826,55356,56819],[55356,56826,8203,55356,56819])&&!s([55356,57332,56128,56423,56128,56418,56128,56421,56128,56430,56128,56423,56128,56447],[55356,57332,8203,56128,56423,8203,56128,56418,8203,56128,56421,8203,56128,56430,8203,56128,56423,8203,56128,56447]);case"emoji":return!s([55357,56424,8205,55356,57212],[55357,56424,8203,55356,57212])}return!1}(o[r]),t.supports.everything=t.supports.everything&&t.supports[o[r]],"flag"!==o[r]&&(t.supports.everythingExceptFlag=t.supports.everythingExceptFlag&&t.supports[o[r]]);t.supports.everythingExceptFlag=t.supports.everythingExceptFlag&&!t.supports.flag,t.DOMReady=!1,t.readyCallback=function(){t.DOMReady=!0},t.supports.everything||(n=function(){t.readyCallback()},a.addEventListener?(a.addEventListener("DOMContentLoaded",n,!1),e.addEventListener("load",n,!1)):(e.attachEvent("onload",n),a.attachEvent("onreadystatechange",function(){"complete"===a.readyState&&t.readyCallback()})),(n=t.source||{}).concatemoji?c(n.concatemoji):n.wpemoji&&n.twemoji&&(c(n.twemoji),c(n.wpemoji)))}(window,document,window._wpemojiSettings);
			</script>
			<style type="text/css">
	img.wp-smiley,
	img.emoji {
		display: inline !important;
		border: none !important;
		box-shadow: none !important;
		height: 1em !important;
		width: 1em !important;
		margin: 0 .07em !important;
		vertical-align: -0.1em !important;
		background: none !important;
		padding: 0 !important;
	}
	</style>
		<link rel='stylesheet' id='wp-block-library-css'  href='https://grandediaturismo.com.br/wp-includes/css/dist/block-library/style.min.css?ver=5.5.9' type='text/css' media='all' />
	<link rel='stylesheet' id='wp-block-library-theme-css'  href='https://grandediaturismo.com.br/wp-includes/css/dist/block-library/theme.min.css?ver=5.5.9' type='text/css' media='all' />
	<link rel='stylesheet' id='wc-block-vendors-style-css'  href='https://grandediaturismo.com.br/wp-content/plugins/woocommerce/packages/woocommerce-blocks/build/vendors-style.css?ver=5.3.3' type='text/css' media='all' />
	<link rel='stylesheet' id='wc-block-style-css'  href='https://grandediaturismo.com.br/wp-content/plugins/woocommerce/packages/woocommerce-blocks/build/style.css?ver=5.3.3' type='text/css' media='all' />
	<link rel='stylesheet' id='contact-form-7-css'  href='https://grandediaturismo.com.br/wp-content/plugins/contact-form-7/includes/css/styles.css?ver=5.4.2' type='text/css' media='all' />
	<link rel='stylesheet' id='email-subscribers-css'  href='https://grandediaturismo.com.br/wp-content/plugins/email-subscribers/lite/public/css/email-subscribers-public.css?ver=5.0.0' type='text/css' media='all' />
	<link rel='stylesheet' id='woocommerce-layout-css'  href='https://grandediaturismo.com.br/wp-content/plugins/woocommerce/assets/css/woocommerce-layout.css?ver=5.5.4' type='text/css' media='all' />
	<link rel='stylesheet' id='woocommerce-smallscreen-css'  href='https://grandediaturismo.com.br/wp-content/plugins/woocommerce/assets/css/woocommerce-smallscreen.css?ver=5.5.4' type='text/css' media='only screen and (max-width: 768px)' />
	<link rel='stylesheet' id='woocommerce-general-css'  href='https://grandediaturismo.com.br/wp-content/plugins/woocommerce/assets/css/woocommerce.css?ver=5.5.4' type='text/css' media='all' />
	<style id='woocommerce-inline-inline-css' type='text/css'>
	.woocommerce form .form-row .required { visibility: visible; }
	</style>
	<link rel='stylesheet' id='accesspress-ray-font-css-css'  href='https://grandediaturismo.com.br/wp-content/themes/accesspress-ray/css/fonts.css?ver=5.5.9' type='text/css' media='all' />
	<link rel='stylesheet' id='accesspress-ray-google-fonts-css'  href='//fonts.googleapis.com/css?family=Open+Sans%3A400%2C400italic%2C300italic%2C300%2C600%2C600italic%7CLato%3A400%2C100%2C300%2C700%7CJosefin+Slab%3A400%2C100%2C100italic%2C300%2C300italic%2C400italic%2C600%2C600italic%2C700%2C700italic%7CRoboto%3A400%2C100%2C100italic%2C300%2C300italic%2C400italic%2C500%2C500italic%2C700italic%2C700%2C900%2C900italic&#038;ver=5.5.9' type='text/css' media='all' />
	<link rel='stylesheet' id='accesspress-ray-font-awesome-css'  href='https://grandediaturismo.com.br/wp-content/themes/accesspress-ray/css/fontawesome/css/font-awesome.min.css?ver=5.5.9' type='text/css' media='all' />
	<link rel='stylesheet' id='accesspress-ray-fancybox-css-css'  href='https://grandediaturismo.com.br/wp-content/themes/accesspress-ray/css/nivo-lightbox.css?ver=5.5.9' type='text/css' media='all' />
	<link rel='stylesheet' id='accesspress-ray-bx-slider-style-css'  href='https://grandediaturismo.com.br/wp-content/themes/accesspress-ray/css/jquery.bxslider.css?ver=5.5.9' type='text/css' media='all' />
	<link rel='stylesheet' id='accesspress-ray-lightslider-style-css'  href='https://grandediaturismo.com.br/wp-content/themes/accesspress-ray/css/lightslider.css?ver=5.5.9' type='text/css' media='all' />
	<link rel='stylesheet' id='accesspress_ray_woocommerce_style-css'  href='https://grandediaturismo.com.br/wp-content/themes/accesspress-ray/woocommerce/woocommerce-style.css?ver=5.5.9' type='text/css' media='all' />
	<link rel='stylesheet' id='accesspress-ray-style-css'  href='https://grandediaturismo.com.br/wp-content/themes/accesspress-ray/style.css?ver=5.5.9' type='text/css' media='all' />
	<link rel='stylesheet' id='accesspress-ray-responsive-css'  href='https://grandediaturismo.com.br/wp-content/themes/accesspress-ray/css/responsive.css?ver=5.5.9' type='text/css' media='all' />
	<script type='text/javascript' id='exactmetrics-frontend-script-js-extra'>
	/* <![CDATA[ */
	var exactmetrics_frontend = {"js_events_tracking":"true","download_extensions":"zip,mp3,mpeg,pdf,docx,pptx,xlsx,rar","inbound_paths":"[{\"path\":\"\\\/go\\\/\",\"label\":\"affiliate\"},{\"path\":\"\\\/recommend\\\/\",\"label\":\"affiliate\"}]","home_url":"https:\/\/grandediaturismo.com.br","hash_tracking":"false","ua":"UA-99564378-17","v4_id":""};
	/* ]]> */
	</script>
	<script type='text/javascript' src='https://grandediaturismo.com.br/wp-content/plugins/google-analytics-dashboard-for-wp/assets/js/frontend-gtag.min.js?ver=7.2.1' id='exactmetrics-frontend-script-js'></script>
	<script type='text/javascript' src='https://grandediaturismo.com.br/wp-includes/js/jquery/jquery.js?ver=1.12.4-wp' id='jquery-core-js'></script>
	<script type='text/javascript' id='email-subscribers-js-extra'>
	/* <![CDATA[ */
	var es_data = {"messages":{"es_empty_email_notice":"Please enter email address","es_rate_limit_notice":"You need to wait for sometime before subscribing again","es_single_optin_success_message":"Successfully Subscribed.","es_email_exists_notice":"Email Address already exists!","es_unexpected_error_notice":"Oops.. Unexpected error occurred.","es_invalid_email_notice":"Invalid email address","es_try_later_notice":"Please try after some time"},"es_ajax_url":"https:\/\/grandediaturismo.com.br\/wp-admin\/admin-ajax.php"};
	/* ]]> */
	</script>
	<script type='text/javascript' src='https://grandediaturismo.com.br/wp-content/plugins/email-subscribers/lite/public/js/email-subscribers-public.js?ver=5.0.0' id='email-subscribers-js'></script>
	<link rel="https://api.w.org/" href="https://grandediaturismo.com.br/wp-json/" /><link rel="EditURI" type="application/rsd+xml" title="RSD" href="https://grandediaturismo.com.br/xmlrpc.php?rsd" />
	<link rel="wlwmanifest" type="application/wlwmanifest+xml" href="https://grandediaturismo.com.br/wp-includes/wlwmanifest.xml" /> 
	<meta name="generator" content="WordPress 5.5.9" />
	<meta name="generator" content="WooCommerce 5.5.4" />
	<style type="text/css"></style>	<style type="text/css">
			header.site-header {
				border-top:5px solid #a8cf45;
			}
			#site-navigation .menu > ul > li > a, #site-navigation .menu ul ul li > a:hover, #site-navigation .menu ul ul li.current_page_item > a, .featured-post .view-more, .footer-wrap a:hover, .sidebar ul li a:hover, a, .sidebar ul li:before {
				color: #a8cf45;
			}
			#site-navigation .menu ul ul {
				border-bottom:2px solid #a8cf45;
				border-top:2px solid #a8cf45;
			}
			.featured-section, .featured-post .view-more:hover, .events-section .view-all, .business-section, #top-footer, .sidebar .widget-title, #comments h3, .read-more-btn .read-icon-wrap, #comments h2.comments-title, .comment-author .fn .url:hover, .sidebar .tagcloud a {
				background:#a8cf45;
			}
			.read-more-btn, .read-more-btn:hover .read-icon-wrap, .events-section .bx-wrapper .bx-pager.bx-default-pager a,
			.event-list-wrapper .lSSlideOuter .lSPager.lSpg > li a {
				background: #b1d458;
			}
			.featured-post .view-more {
				border: 1px solid #a8cf45;
			}
			.slider-caption .caption-title, .slider-caption .caption-description {
				background: rgba(168,207,69,0.5);
			}
			.events-section .view-all:hover, #top-footer input, #top-footer textarea, #top-footer input[type="submit"], footer #middle-footer, .footer-socials a {
				background: #97ba3e ;
			}
			.clients-say-section .bx-wrapper .bx-pager.bx-default-pager a, .sidebar .widget_search .searchsubmit, .read-more-btn:hover {
				background: none repeat scroll 0 0 #a8cf45;
			}
			.sidebar .widget-title:after{
				border-color: transparent #97ba3e #97ba3e transparent;
			}

			#site-navigation .menu > ul > li:hover > a:before, #site-navigation .menu > ul > li.current_page_item > a:before, #site-navigation .menu > ul > li.current-menu-item > a:before, #site-navigation .menu > ul > li.current_page_ancestor > a:before, #site-navigation .menu > ul > li.current-menu-ancestor > a:before, 
			#slider-banner .bx-wrapper .bx-pager.bx-default-pager a:after,
			.navigation .nav-links a, .slider-caption br + a, .bttn, button, input[type="button"], input[type="reset"], input[type="submit"],
			.events-section .bx-wrapper .bx-pager.bx-default-pager a:hover, .events-section .bx-wrapper .bx-pager.bx-default-pager a.active,
			.clients-say-section .bx-wrapper .bx-pager.bx-default-pager a.active, .clients-say-section .bx-wrapper .bx-pager.bx-default-pager a:hover,.footer-socials a:hover,
			.event-list-wrapper .lSSlideOuter .lSPager.lSpg > li.active a,
			.event-list-wrapper .lSSlideOuter .lSPager.lSpg > li:hover a {
				background: #f58634;
			}
			#slider-banner .bx-wrapper .bx-pager.bx-default-pager a {
				box-shadow:0 0 0 2px #f58634 inset;
			}
			.navigation .nav-links a:hover, .bttn:hover, button, input[type="button"]:hover, input[type="reset"]:hover, input[type="submit"]:hover, .slider-caption br + a:hover {
				background: #dd792f ;
			}
			.events-section .event-list .event-date {
				background: none repeat scroll 0 0 #f58634;
			}

			@media screen and (max-width: 992px){
				.menu-toggle{
					background-color: #a8cf45;
				}
			}

		</style>
		<noscript><style>.woocommerce-product-gallery{ opacity: 1 !important; }</style></noscript>
		<style type="text/css">.recentcomments a{display:inline !important;padding:0 !important;margin:0 !important;}</style><link rel="icon" href="https://grandediaturismo.com.br/wp-content/uploads/2017/09/cropped-logofy-1-32x32.png" sizes="32x32" />
	<link rel="icon" href="https://grandediaturismo.com.br/wp-content/uploads/2017/09/cropped-logofy-1-192x192.png" sizes="192x192" />
	<link rel="apple-touch-icon" href="https://grandediaturismo.com.br/wp-content/uploads/2017/09/cropped-logofy-1-180x180.png" />
	<meta name="msapplication-TileImage" content="https://grandediaturismo.com.br/wp-content/uploads/2017/09/cropped-logofy-1-270x270.png" />
			<style type="text/css" id="wp-custom-css">
				.search-icon{
		display:none;
	}

	.header-wrap ul {
	    margin: 0 0 0px 130px;
	}

	#site-navigation .menu > ul > li > a {
	    font-size: 14px;
	}

	.newsletter .es-field-wrap {
	    display: inline-block;
	}

	.newsletter{
		width: 100vw;
	 height: 30vh;
	background: #a8cf45;
	display: flex;
	flex-direction: row;
	justify-content: center;
	align-items: center
	}

	.newsletter input[type="submit"]{
		margin-left: 4em;
	}
	.newsletter input[type="text"]{
		margin-right: 4em;
	}

	.newsletter input[type="text"], .newsletterinput [type="email"]{
	    color: #666;
	    border: none;
	    height: 36px;
	}

	.newsletter h3, .newsletter label{
		color:#ffffff;
	}

	@media screen and (max-width: 400px) {
		
		.newsletter h3, .newsletter label{
		    margin-top: 0px;
	}
	}
	@media screen and (max-width: 400px) {
	.emaillist {
	    margin-bottom: 0.6em;
	    text-align: center !important;
	}
	}
	@media screen and (max-width: 400px) {
	.newsletter input[type="email"], .newsletter input[type="text"]{
		margin-left: auto;
		margin-right: auto;
		padding: 3px 60px;
	}
	}

	@media screen and (max-width: 400px) {
	.newsletter input[type="submit"]{
		margin-left: auto;
		margin-right: auto;
	}
	}

	@media screen and (max-width: 400px) {
	.newsletter {
	    height: 50vh;
	}
		}

	.owl-item .product_container{
		background-color:#fff;
		padding-bottom:1em;
	}

	.featured-post{
		display:none;
	}

	.featured-section .sub-desc {
	    margin-bottom: 20px;
	}

	.another_carousel_header .title{
		display:none;
	}

	.fa-angle-left, .fa-angle-right {
	    background-color: #dd792f !important;
	    color: #FFFFFF;
	}

	.wpcs_product_carousel_slider .another_carousel_header i.fa-angle-right {
	    right: 0px !important;
	}

	.wpcs_product_carousel_slider .another_carousel_header i.fa-angle-left {
	    left: 0px !important;
	}

	@media screen and (max-width: 400px) {
	.header-wrap ul {
	    margin: 0 0 0px 0px;
	}
		}

	#site-navigation .menu > ul > li > a, #site-navigation .menu ul ul li > a:hover, #site-navigation .menu ul ul li.current_page_item > a, .featured-post .view-more, .footer-wrap a:hover, .sidebar ul li a:hover, a, .sidebar ul li:before {
	    color: #dd792f;
	}

	#billing_country_field{
	display:none;
	}

	#billing_cellphone_field{
		display:none;
	}

	.company{
		display:none;
	}		</style>
			</head>

	<body data-rsssl=1 class="home blog wp-embed-responsive theme-accesspress-ray woocommerce-no-js group-blog default-template-design site-logo-left right-sidebar columns-3">
	<div id="page" class="site">
	<header id="masthead" class="site-header">
	    <div id="top-header">
			<div class="ak-container">

				<div class="header-wrap clearfix logo-left">
					<div class="site-branding main-logo">
						<a href="https://grandediaturismo.com.br/">				
												<img src="https://grandediaturismo.com.br/wp-content/uploads/2020/10/cropped-Nova-Logo-GD-Turismo_Sem-hachura_png-1-1.png" alt="Grande Dia Turismo">
								
						</a>		
					</div><!-- .site-branding -->        		

					<nav id="site-navigation" class="main-navigation">
						<h1 class="menu-toggle">Menu</h1>

							<div class="menu"><ul class="clearfix" id="menu-222"><li id="menu-item-178" class="hvr-fade menu-item menu-item-type-custom menu-item-object-custom menu-item-178"><a href="https://www.grandediaturismo.com.br/">HOME</a></li>
	<li id="menu-item-179" class="hvr-fade menu-item menu-item-type-post_type menu-item-object-page menu-item-179"><a href="https://grandediaturismo.com.br/grande-dia-turismo/">SOBRE NÓS</a></li>
	<li id="menu-item-182" class="hvr-fade menu-item menu-item-type-post_type menu-item-object-page menu-item-182"><a href="https://grandediaturismo.com.br/pacotes-de-viagens-agencia-de-viagens-em-recife/">VIAGENS E PASSEIOS</a></li>
	<li id="menu-item-183" class="hvr-fade menu-item menu-item-type-post_type menu-item-object-page menu-item-183"><a href="https://grandediaturismo.com.br/termo-e-condicoes/">TERMOS E CONDIÇÕES</a></li>
	<li id="menu-item-181" class="hvr-fade menu-item menu-item-type-post_type menu-item-object-page menu-item-181"><a href="https://grandediaturismo.com.br/fale-conosco/">FALE CONOSCO</a></li>
	<li id="menu-item-361" class="hvr-fade menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-361"><a href="https://grandediaturismo.com.br/promocoes-pacote-de-viagens/">PROMOÇÕES</a>
	<ul class="sub-menu">
		<li id="menu-item-367" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-367"><a href="https://grandediaturismo.com.br/aniversariante-do-dia/">Aniversariante do Dia</a></li>
		<li id="menu-item-357" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-357"><a href="https://grandediaturismo.com.br/promocoes-pacote-de-viagens/promocao-gdteleva/">Promoção #GDteleva</a></li>
	</ul>
	</li>
	<li id="menu-item-230" class="hvr-fade menu-item menu-item-type-post_type menu-item-object-page menu-item-230"><a href="https://grandediaturismo.com.br/grande-dia-solidario-gd-turismo/">GRANDE DIA SOLIDÁRIO</a></li>
	</ul></div>
					</nav><!-- #site-navigation -->
				</div><!-- .header-wrap -->

			</div><!-- .ak-container -->
	  </div><!-- #top-header -->
	</header><!-- #masthead -->

	<section id="slider-banner">	
		<div class="slider-wrap">
				<script type="text/javascript">
	        jQuery(function(){
				jQuery('.bx-slider').bxSlider({
					adaptiveHeight:true,
					pager:true,
					controls:true,
					mode:'horizontal',
					auto :true,
					pause: '4000',
									speed:'500',
													prevText:'Prev',
					nextText:'Next'
								});
			});
	    </script>
	        	<div class="bx-slider">
								<div class="slides">
							
							<img src="https://grandediaturismo.com.br/wp-content/uploads/2017/09/Praia-de-Genipabu-1536x860.jpg">
								
													<div class="slider-caption">
								<div class="ak-container">
									<h1 class="caption-title">Pacote para NATAL/RN</h1><br />
									<h2 class="caption-description"><p>Pacote com hotel, transporte, passeio de buggy por todo litoral norte de Potiguar e muito mais</p>

	<!-- wp:paragraph -->
	<p></p>
	<!-- /wp:paragraph --></h2><br />
								</div>
							</div>
										
			        </div>
									<div class="slides">
							
							<img src="https://grandediaturismo.com.br/wp-content/uploads/2017/09/Praia-dos-carneiros2-2-1582x860.jpg">
								
													<div class="slider-caption">
								<div class="ak-container">
									<h1 class="caption-title">Viaje conosco Tamandaré</h1><br />
									<h2 class="caption-description"><p>Venha conosco conhecer uma das mais belas praias do Litoral Pernambucano</p>

	<!-- wp:paragraph -->
	<p></p>
	<!-- /wp:paragraph --></h2><br />
								</div>
							</div>
										
			        </div>
								</div>
	        	</div>
	</section><!-- #slider-banner -->

		

	<div id="home-content" class="site-content">

		<div class="newsletter">
		<div>
			<h3 class="roboto-light main-title">Cadastre-se e receba nossas ofertas</h3>	

			<div class="emaillist" id="es_form_f1-n1">
							<form action="/#es_form_f1-n1" method="post" class="es_subscription_form es_shortcode_form" id="es_subscription_form_62d6b6aa17ebb" data-source="ig-es">
									<div class="es-field-wrap"><label>Name*<br /><input type="text" name="esfpx_name" class="ig_es_form_field_name" placeholder="" value="" required="required" /></label></div><div class="es-field-wrap"><label>Email*<br /><input class="es_required_field es_txt_email ig_es_form_field_email" type="email" name="esfpx_email" value="" placeholder="" required="required" /></label></div><input type="hidden" name="esfpx_lists[]" value="3b8df269d54c" /><input type="hidden" name="esfpx_form_id" value="1" />				<input type="hidden" name="es" value="subscribe" />
					<input type="hidden" name="esfpx_es_form_identifier" value="f1-n1" />
					<input type="hidden" name="esfpx_es_email_page" value="1"/>
					<input type="hidden" name="esfpx_es_email_page_url" value="https://grandediaturismo.com.br/hello-world/"/>
					<input type="hidden" name="esfpx_status" value="Unconfirmed"/>
					<input type="hidden" name="esfpx_es-subscribe" id="es-subscribe-62d6b6aa17ebb" value="77b9244083"/>
					<label style="position:absolute;top:-99999px;left:-99999px;z-index:-99;"><input type="email" name="esfpx_es_hp_email" class="es_required_field" tabindex="-1" autocomplete="-1" value=""/></label>
									<input type="submit" name="submit" class="es_subscription_form_submit es_submit_button es_textbox_button" id="es_subscription_form_submit_62d6b6aa17ebb" value="Receber ofertas"/>

					
					<span class="es_spinner_image" id="spinner-image"><img src="https://grandediaturismo.com.br/wp-content/plugins/email-subscribers/lite/public/images/spinner.gif" alt="Loading"/></span>

				</form>
							<span class="es_subscription_message " id="es_subscription_message_62d6b6aa17ebb">
							</span>
			</div>

				
		</div>

	</div>
	<section id="about-section">
		<div class="ak-container clearfix">
							 
						<h1 class="roboto-light main-title"><a href="https://grandediaturismo.com.br/confira-nossos-roteiros/">Confira nossos roteiros</a></h1>
							
						<div class="welcome-detail">
						
						
	<p>Temos roteiros day tour e com diária em Pernambuco e no Nordeste </p>
						
						</div>
						
						</div>
	</section>


	<section id="mid-section" class="featured-section clearfix">
		<div class="ak-container">
					<h3 class="roboto-light main-title">Descubra o Nordeste com a GD Turismo</h3>
			
					<div class="sub-desc">Conheça vários roteiros pelo nordeste!!!</div>
			
			<div class="featured-post-wrapper clearfix">
				        <div class="wpcs_product_carousel_slider">
	                
	            <style type="text/css">

	                .wpcs_product_carousel_slider .another_carousel_header i.prev-1122549283,
	                .wpcs_product_carousel_slider .another_carousel_header i.next-1122549283 {
	                background-color:#BBBBBB;
	                color:#FFFFFF;
	                }
	                .wpcs_product_carousel_slider .another_carousel_header i.fa-angle-left.prev-1122549283:hover,
	                .wpcs_product_carousel_slider .another_carousel_header i.fa-angle-right.next-1122549283:hover {
	                background-color:#9A9A9A;
	                color:#FFFFFF;
	                }

	                #woo-product-carousel-wrapper-1122549283 .owl-item .item h4.product_name {
	                font-size:16px;
	                }
	                #woo-product-carousel-wrapper-1122549283 .owl-item .item h4.product_name a {
	                color:#444444;

	                }
	                #woo-product-carousel-wrapper-1122549283 .owl-item .item h4.product_name a:hover {
	                color:#000;

	                }
	                #woo-product-carousel-wrapper-1122549283 .owl-item .item .price {
	                font-size:18px;

	                }
	                #woo-product-carousel-wrapper-1122549283 .price,
	                #woo-product-carousel-wrapper-1122549283 .price ins {
	                color:#444444;

	                }

	                #woo-product-carousel-wrapper-1122549283 .wpcs_rating .woocommerce-product-rating {
	                color:#FFC500;

	                }
	                #woo-product-carousel-wrapper-1122549283 .woocommerce .star-rating {
	                font-size:1em;

	                }
	                #woo-product-carousel-wrapper-1122549283 .owl-item .item .cart .add_to_cart_button,
	                #woo-product-carousel-wrapper-1122549283 .owl-item .item .cart a.added_to_cart.wc-forward {
	                color:#ffffff;

	                background-color:#BBBBBB;

	                border-color:#BBBBBB;

	                font-size:14px;

	                }
	                #woo-product-carousel-wrapper-1122549283 .owl-item .item .cart .add_to_cart_button:hover,
	                #woo-product-carousel-wrapper-1122549283 .owl-item .item .cart a.added_to_cart.wc-forward:hover {
	                background-color:#9A9A9A;
	                border-color:#9A9A9A;
	                color:#ffffff;

	                }

	                .wpcs_product_carousel_slider .owl-item .item h4.product_name a {
	                    font-weight: 600;
	                    text-decoration: none;
	                    border: 0;
	                    box-shadow: none;
	                    white-space: nowrap;
	                    overflow: hidden;
	                    text-overflow: ellipsis;
	                    display: block;
	                    color: #444444;
	                    webkit-transition: all 0.4s linear;
	                    -moz-transition: all 0.4s linear;
	                    -ms-transition: all 0.4s linear;
	                    -o-transition: all 0.4s linear;
	                    transition: all 0.4s linear;
	                }

	            </style>

	                            <div class="another_carousel_header">
	                    <div class="title"
	                         style="
	                         ;
	                         color:#303030;
	                                 "
	                    >
	                        Latest Product                    </div>
	                                            <i class="fa fa-angle-left prev-1122549283"></i>
	                        <i class="fa fa-angle-right next-1122549283"></i>
	                                    </div>
	                
	            <div id="woo-product-carousel-wrapper-1122549283" class="owl-carousel owl-theme">
	                                    <div class="item">
	                                                <div class="product_container">
	                            <div class="product_image_container">
	                                <a id="id-1936" class="product_thumb_link" href="https://grandediaturismo.com.br/produto/triunfope-2/" title="São João em Triunfo/PE">
	                                    <img src="https://grandediaturismo.com.br/wp-content/uploads/2017/12/WhatsApp-Image-2019-04-08-at-13.04.30-1-300x300.jpeg" class="wpcs-thum" alt="São João em Triunfo/PE" />                                </a>
	                            </div>
	                            <div class="caption">
	                                                                    <h4 class="product_name"><a id="id-1936" href="https://grandediaturismo.com.br/produto/triunfope-2/" title="São João em Triunfo/PE">São João em Triunfo/PE</a></h4>
	                                                                    <span class="price"><span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>765,00</bdi></span> &ndash; <span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>850,00</bdi></span></span>
	                                                                    <div class="wpcs_rating woocommerce"><div class="woocommerce-product-rating"><div class="star-rating" title="0%"><span style="width: 0%;"></span></div></div></div>
	                                                                    <div class="cart"><p class="product woocommerce add_to_cart_inline " style="border:4px solid #ccc; padding: 12px;"><span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>765,00</bdi></span> &ndash; <span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>850,00</bdi></span><a href="https://grandediaturismo.com.br/produto/triunfope-2/" data-quantity="1" class="button product_type_variable add_to_cart_button" data-product_id="1936" data-product_sku="" aria-label="Selecione as opções para &ldquo;São João em Triunfo/PE&rdquo;" rel="nofollow">Ver opções</a></p></div>
	                                                            </div>
	                        </div>

	                    </div>
	                                    <div class="item">
	                                                <div class="product_container">
	                            <div class="product_image_container">
	                                <a id="id-1929" class="product_thumb_link" href="https://grandediaturismo.com.br/produto/litoral-pernambucano-e-por-do-sol-praia-do-jacare/" title="Litoral Paraibano e Pôr do Sol Praia do Jacaré">
	                                    <img src="https://grandediaturismo.com.br/wp-content/uploads/2021/10/Praia-de-Tambaba-300x300.jpeg" class="wpcs-thum" alt="Litoral Paraibano e Pôr do Sol Praia do Jacaré" />                                </a>
	                            </div>
	                            <div class="caption">
	                                                                    <h4 class="product_name"><a id="id-1929" href="https://grandediaturismo.com.br/produto/litoral-pernambucano-e-por-do-sol-praia-do-jacare/" title="Litoral Paraibano e Pôr do Sol Praia do Jacaré">Litoral Paraibano e Pôr do Sol Praia do Jacaré</a></h4>
	                                                                    <span class="price"><span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>150,00</bdi></span> &ndash; <span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>160,00</bdi></span></span>
	                                                                    <div class="wpcs_rating woocommerce"><div class="woocommerce-product-rating"><div class="star-rating" title="0%"><span style="width: 0%;"></span></div></div></div>
	                                                                    <div class="cart"><p class="product woocommerce add_to_cart_inline " style="border:4px solid #ccc; padding: 12px;"><span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>150,00</bdi></span> &ndash; <span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>160,00</bdi></span><a href="https://grandediaturismo.com.br/produto/litoral-pernambucano-e-por-do-sol-praia-do-jacare/" data-quantity="1" class="button product_type_variable add_to_cart_button" data-product_id="1929" data-product_sku="" aria-label="Selecione as opções para &ldquo;Litoral Paraibano e Pôr do Sol Praia do Jacaré&rdquo;" rel="nofollow">Ver opções</a></p></div>
	                                                            </div>
	                        </div>

	                    </div>
	                                    <div class="item">
	                                                <div class="product_container">
	                            <div class="product_image_container">
	                                <a id="id-1902" class="product_thumb_link" href="https://grandediaturismo.com.br/produto/costa-conde-pb/" title="Costa do Conde/PB">
	                                    <img src="https://grandediaturismo.com.br/wp-content/uploads/2021/10/Castelo-da-Princesa-300x300.jpeg" class="wpcs-thum" alt="Costa do Conde/PB" />                                </a>
	                            </div>
	                            <div class="caption">
	                                                                    <h4 class="product_name"><a id="id-1902" href="https://grandediaturismo.com.br/produto/costa-conde-pb/" title="Costa do Conde/PB">Costa do Conde/PB</a></h4>
	                                                                    <span class="price"><span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>171,00</bdi></span> &ndash; <span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>190,00</bdi></span></span>
	                                                                    <div class="wpcs_rating woocommerce"><div class="woocommerce-product-rating"><div class="star-rating" title="0%"><span style="width: 0%;"></span></div></div></div>
	                                                                    <div class="cart"><p class="product woocommerce add_to_cart_inline " style="border:4px solid #ccc; padding: 12px;"><span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>171,00</bdi></span> &ndash; <span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>190,00</bdi></span><a href="https://grandediaturismo.com.br/produto/costa-conde-pb/" data-quantity="1" class="button product_type_variable add_to_cart_button" data-product_id="1902" data-product_sku="" aria-label="Selecione as opções para &ldquo;Costa do Conde/PB&rdquo;" rel="nofollow">Ver opções</a></p></div>
	                                                            </div>
	                        </div>

	                    </div>
	                                    <div class="item">
	                                                <div class="product_container">
	                            <div class="product_image_container">
	                                <a id="id-1831" class="product_thumb_link" href="https://grandediaturismo.com.br/produto/pipaeshuibrasil/" title="Pipa | Natal e Shui Brasil">
	                                    <img src="https://grandediaturismo.com.br/wp-content/uploads/2020/12/Shui-300x300.jpeg" class="wpcs-thum" alt="Pipa | Natal e Shui Brasil" />                                </a>
	                            </div>
	                            <div class="caption">
	                                                                    <h4 class="product_name"><a id="id-1831" href="https://grandediaturismo.com.br/produto/pipaeshuibrasil/" title="Pipa | Natal e Shui Brasil">Pipa | Natal e Shui Brasil</a></h4>
	                                                                    <span class="price"><span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>85,00</bdi></span> &ndash; <span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>690,00</bdi></span></span>
	                                                                    <div class="wpcs_rating woocommerce"><div class="woocommerce-product-rating"><div class="star-rating" title="0%"><span style="width: 0%;"></span></div></div></div>
	                                                                    <div class="cart"><p class="product woocommerce add_to_cart_inline " style="border:4px solid #ccc; padding: 12px;"><span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>85,00</bdi></span> &ndash; <span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>690,00</bdi></span><a href="https://grandediaturismo.com.br/produto/pipaeshuibrasil/" data-quantity="1" class="button product_type_variable add_to_cart_button" data-product_id="1831" data-product_sku="" aria-label="Selecione as opções para &ldquo;Pipa | Natal e Shui Brasil&rdquo;" rel="nofollow">Ver opções</a></p></div>
	                                                            </div>
	                        </div>

	                    </div>
	                                    <div class="item">
	                                                <div class="product_container">
	                            <div class="product_image_container">
	                                <a id="id-1797" class="product_thumb_link" href="https://grandediaturismo.com.br/produto/day-tour-natal-luz-de-garanhuns/" title="Day tour Natal Luz de Garanhuns">
	                                    <img src="https://grandediaturismo.com.br/wp-content/uploads/2017/09/Natal-Luz-300x300.jpg" class="wpcs-thum" alt="Day tour Natal Luz de Garanhuns" />                                </a>
	                            </div>
	                            <div class="caption">
	                                                                    <h4 class="product_name"><a id="id-1797" href="https://grandediaturismo.com.br/produto/day-tour-natal-luz-de-garanhuns/" title="Day tour Natal Luz de Garanhuns">Day tour Natal Luz de Garanhuns</a></h4>
	                                                                    <span class="price"><span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>135,00</bdi></span> &ndash; <span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>150,00</bdi></span></span>
	                                                                    <div class="wpcs_rating woocommerce"><div class="woocommerce-product-rating"><div class="star-rating" title="0%"><span style="width: 0%;"></span></div></div></div>
	                                                                    <div class="cart"><p class="product woocommerce add_to_cart_inline " style="border:4px solid #ccc; padding: 12px;"><span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>135,00</bdi></span> &ndash; <span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>150,00</bdi></span><a href="https://grandediaturismo.com.br/produto/day-tour-natal-luz-de-garanhuns/" data-quantity="1" class="button product_type_variable add_to_cart_button" data-product_id="1797" data-product_sku="" aria-label="Selecione as opções para &ldquo;Day tour Natal Luz de Garanhuns&rdquo;" rel="nofollow">Ver opções</a></p></div>
	                                                            </div>
	                        </div>

	                    </div>
	                                    <div class="item">
	                                                <div class="product_container">
	                            <div class="product_image_container">
	                                <a id="id-1782" class="product_thumb_link" href="https://grandediaturismo.com.br/produto/day-tour-pipa/" title="Day tour Pipa/RN">
	                                    <img src="https://grandediaturismo.com.br/wp-content/uploads/2020/11/f2f475fabd3ef7016e95570739a8d2ba-300x300.jpg" class="wpcs-thum" alt="Day tour Pipa/RN" />                                </a>
	                            </div>
	                            <div class="caption">
	                                                                    <h4 class="product_name"><a id="id-1782" href="https://grandediaturismo.com.br/produto/day-tour-pipa/" title="Day tour Pipa/RN">Day tour Pipa/RN</a></h4>
	                                                                    <span class="price"><span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>170,00</bdi></span></span>
	                                                                    <div class="wpcs_rating woocommerce"><div class="woocommerce-product-rating"><div class="star-rating" title="0%"><span style="width: 0%;"></span></div></div></div>
	                                                                    <div class="cart"><p class="product woocommerce add_to_cart_inline " style="border:4px solid #ccc; padding: 12px;"><span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>170,00</bdi></span><a href="https://grandediaturismo.com.br/produto/day-tour-pipa/" data-quantity="1" class="button product_type_variable add_to_cart_button" data-product_id="1782" data-product_sku="" aria-label="Selecione as opções para &ldquo;Day tour Pipa/RN&rdquo;" rel="nofollow">Ver opções</a></p></div>
	                                                            </div>
	                        </div>

	                    </div>
	                                    <div class="item">
	                                                <div class="product_container">
	                            <div class="product_image_container">
	                                <a id="id-1737" class="product_thumb_link" href="https://grandediaturismo.com.br/produto/chapada-diamantina-2/" title="CHAPADA DIAMANTINA &#8211; 24 DE FEVEREIRO A 02 DE MARÇO">
	                                    <img src="https://grandediaturismo.com.br/wp-content/uploads/2017/10/WhatsApp-Image-2017-10-04-at-21.18.48-300x300.jpeg" class="wpcs-thum" alt="CHAPADA DIAMANTINA &#8211; 24 DE FEVEREIRO A 02 DE MARÇO" />                                </a>
	                            </div>
	                            <div class="caption">
	                                                                    <h4 class="product_name"><a id="id-1737" href="https://grandediaturismo.com.br/produto/chapada-diamantina-2/" title="CHAPADA DIAMANTINA &#8211; 24 DE FEVEREIRO A 02 DE MARÇO">CHAPADA DIAMANTINA &#8211; 24 DE FEVEREIRO A 02 DE MARÇO</a></h4>
	                                                                    <span class="price"><span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>1.600,00</bdi></span></span>
	                                                                    <div class="wpcs_rating woocommerce"><div class="woocommerce-product-rating"><div class="star-rating" title="0%"><span style="width: 0%;"></span></div></div></div>
	                                                                    <div class="cart"><p class="product woocommerce add_to_cart_inline " style="border:4px solid #ccc; padding: 12px;"><span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>1.600,00</bdi></span><a href="https://grandediaturismo.com.br/produto/chapada-diamantina-2/" data-quantity="1" class="button product_type_variable add_to_cart_button" data-product_id="1737" data-product_sku="" aria-label="Selecione as opções para &ldquo;CHAPADA DIAMANTINA - 24 DE FEVEREIRO A 02 DE MARÇO&rdquo;" rel="nofollow">Ver opções</a></p></div>
	                                                            </div>
	                        </div>

	                    </div>
	                                    <div class="item">
	                                                <div class="product_container">
	                            <div class="product_image_container">
	                                <a id="id-1713" class="product_thumb_link" href="https://grandediaturismo.com.br/produto/cachoeiras-de-bonito/" title="Cachoeiras de Bonito/PE">
	                                    <img src="https://grandediaturismo.com.br/wp-content/uploads/2020/09/38C540E4-1EC6-478B-A4F5-6BCF3EA63BEF-300x300.jpeg" class="wpcs-thum" alt="Cachoeiras de Bonito/PE" />                                </a>
	                            </div>
	                            <div class="caption">
	                                                                    <h4 class="product_name"><a id="id-1713" href="https://grandediaturismo.com.br/produto/cachoeiras-de-bonito/" title="Cachoeiras de Bonito/PE">Cachoeiras de Bonito/PE</a></h4>
	                                                                    <span class="price"><span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>150,00</bdi></span> &ndash; <span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>170,00</bdi></span></span>
	                                                                    <div class="wpcs_rating woocommerce"><div class="woocommerce-product-rating"><div class="star-rating" title="0%"><span style="width: 0%;"></span></div></div></div>
	                                                                    <div class="cart"><p class="product woocommerce add_to_cart_inline " style="border:4px solid #ccc; padding: 12px;"><span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>150,00</bdi></span> &ndash; <span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>170,00</bdi></span><a href="https://grandediaturismo.com.br/produto/cachoeiras-de-bonito/" data-quantity="1" class="button product_type_variable add_to_cart_button" data-product_id="1713" data-product_sku="" aria-label="Selecione as opções para &ldquo;Cachoeiras de Bonito/PE&rdquo;" rel="nofollow">Ver opções</a></p></div>
	                                                            </div>
	                        </div>

	                    </div>
	                                    <div class="item">
	                                                <div class="product_container">
	                            <div class="product_image_container">
	                                <a id="id-1627" class="product_thumb_link" href="https://grandediaturismo.com.br/produto/serra-da-capivara-pi/" title="Roteiro Arqueológico Serra da Capivara/PI">
	                                    <img src="https://grandediaturismo.com.br/wp-content/uploads/2020/01/Pedra-Capivara-300x300.jpg" class="wpcs-thum" alt="Roteiro Arqueológico Serra da Capivara/PI" />                                </a>
	                            </div>
	                            <div class="caption">
	                                                                    <h4 class="product_name"><a id="id-1627" href="https://grandediaturismo.com.br/produto/serra-da-capivara-pi/" title="Roteiro Arqueológico Serra da Capivara/PI">Roteiro Arqueológico Serra da Capivara/PI</a></h4>
	                                                                    <span class="price"><del aria-hidden="true"><span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>1.100,00</bdi></span></del> <ins><span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>1.020,00</bdi></span></ins></span>
	                                                                    <div class="wpcs_rating woocommerce"><div class="woocommerce-product-rating"><div class="star-rating" title="0%"><span style="width: 0%;"></span></div></div></div>
	                                                                    <div class="cart"><p class="product woocommerce add_to_cart_inline " style="border:4px solid #ccc; padding: 12px;"><del aria-hidden="true"><span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>1.100,00</bdi></span></del> <ins><span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>1.020,00</bdi></span></ins><a href="https://grandediaturismo.com.br/produto/serra-da-capivara-pi/" data-quantity="1" class="button product_type_variable add_to_cart_button" data-product_id="1627" data-product_sku="" aria-label="Selecione as opções para &ldquo;Roteiro Arqueológico Serra da Capivara/PI&rdquo;" rel="nofollow">Ver opções</a></p></div>
	                                                            </div>
	                        </div>

	                    </div>
	                                    <div class="item">
	                                                <div class="product_container">
	                            <div class="product_image_container">
	                                <a id="id-1584" class="product_thumb_link" href="https://grandediaturismo.com.br/produto/carnaval-em-maragogi/" title="Daytour Maragogi/AL">
	                                    <img src="https://grandediaturismo.com.br/wp-content/uploads/2019/12/PONTAL-DE-MARAGOGI-300x300.jpg" class="wpcs-thum" alt="Daytour Maragogi/AL" />                                </a>
	                            </div>
	                            <div class="caption">
	                                                                    <h4 class="product_name"><a id="id-1584" href="https://grandediaturismo.com.br/produto/carnaval-em-maragogi/" title="Daytour Maragogi/AL">Daytour Maragogi/AL</a></h4>
	                                                                    <span class="price"><span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>130,00</bdi></span></span>
	                                                                    <div class="wpcs_rating woocommerce"><div class="woocommerce-product-rating"><div class="star-rating" title="0%"><span style="width: 0%;"></span></div></div></div>
	                                                                    <div class="cart"><p class="product woocommerce add_to_cart_inline " style="border:4px solid #ccc; padding: 12px;"><span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>130,00</bdi></span><a href="https://grandediaturismo.com.br/produto/carnaval-em-maragogi/" data-quantity="1" class="button product_type_variable add_to_cart_button" data-product_id="1584" data-product_sku="" aria-label="Selecione as opções para &ldquo;Daytour Maragogi/AL&rdquo;" rel="nofollow">Ver opções</a></p></div>
	                                                            </div>
	                        </div>

	                    </div>
	                                    <div class="item">
	                                                <div class="product_container">
	                            <div class="product_image_container">
	                                <a id="id-1516" class="product_thumb_link" href="https://grandediaturismo.com.br/produto/day-tour-praia-do-patacho/" title="Day tour Praia do Patacho/AL">
	                                    <img src="https://grandediaturismo.com.br/wp-content/uploads/2019/11/90914BEA-2183-4D5D-91FF-B767C8D2283E-300x300.jpeg" class="wpcs-thum" alt="Day tour Praia do Patacho/AL" />                                </a>
	                            </div>
	                            <div class="caption">
	                                                                    <h4 class="product_name"><a id="id-1516" href="https://grandediaturismo.com.br/produto/day-tour-praia-do-patacho/" title="Day tour Praia do Patacho/AL">Day tour Praia do Patacho/AL</a></h4>
	                                                                    <span class="price"><span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>135,00</bdi></span> &ndash; <span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>150,00</bdi></span></span>
	                                                                    <div class="wpcs_rating woocommerce"><div class="woocommerce-product-rating"><div class="star-rating" title="0%"><span style="width: 0%;"></span></div></div></div>
	                                                                    <div class="cart"><p class="product woocommerce add_to_cart_inline " style="border:4px solid #ccc; padding: 12px;"><span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>135,00</bdi></span> &ndash; <span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>150,00</bdi></span><a href="https://grandediaturismo.com.br/produto/day-tour-praia-do-patacho/" data-quantity="1" class="button product_type_variable add_to_cart_button" data-product_id="1516" data-product_sku="" aria-label="Selecione as opções para &ldquo;Day tour Praia do Patacho/AL&rdquo;" rel="nofollow">Ver opções</a></p></div>
	                                                            </div>
	                        </div>

	                    </div>
	                                    <div class="item">
	                                                <div class="product_container">
	                            <div class="product_image_container">
	                                <a id="id-632" class="product_thumb_link" href="https://grandediaturismo.com.br/produto/jericoacorace/" title="Jericoacora/CE">
	                                    <img src="https://grandediaturismo.com.br/wp-content/uploads/2018/01/24eccff8-c779-46f5-9203-38d0aa5c8c60-300x300.jpg" class="wpcs-thum" alt="Jericoacora/CE" />                                </a>
	                            </div>
	                            <div class="caption">
	                                                                    <h4 class="product_name"><a id="id-632" href="https://grandediaturismo.com.br/produto/jericoacorace/" title="Jericoacora/CE">Jericoacora/CE</a></h4>
	                                                                    <span class="price"><del aria-hidden="true"><span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>1.500,00</bdi></span></del> <ins><span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>1.200,00</bdi></span></ins></span>
	                                                                    <div class="wpcs_rating woocommerce"><div class="woocommerce-product-rating"><div class="star-rating" title="0%"><span style="width: 0%;"></span></div></div></div>
	                                                                    <div class="cart"><p class="product woocommerce add_to_cart_inline " style="border:4px solid #ccc; padding: 12px;"><del aria-hidden="true"><span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>1.500,00</bdi></span></del> <ins><span class="woocommerce-Price-amount amount"><bdi><span class="woocommerce-Price-currencySymbol">&#82;&#36;</span>1.200,00</bdi></span></ins><a href="https://grandediaturismo.com.br/produto/jericoacorace/" data-quantity="1" class="button product_type_variable add_to_cart_button" data-product_id="632" data-product_sku="" aria-label="Selecione as opções para &ldquo;Jericoacora/CE&rdquo;" rel="nofollow">Ver opções</a></p></div>
	                                                            </div>
	                        </div>

	                    </div>
	                            </div> <!-- End woo-product-carousel-wrapper -->
	                    </div> <!-- End wpcs_product_carousel_slider -->

	        <script type="text/javascript">
	            jQuery(document).ready(function($) {

	                var $wpcs = $("#woo-product-carousel-wrapper-1122549283");

	                $wpcs.owlCarousel({

	                    /*updated code of the carousel for the version 2.2.1*/
	                    rewind:false,
	                    loop:true,
	                    autoWidth:false,
	                    responsiveClass:true,
	                    autoplayHoverPause:false,
	                    autoplay:true,

	                    dots:false,
	                    autoplayTimeout: 4000,
	                    dotData:true,
	                    dotsEach:false,
	                    rtl:false,
	                    slideBy:1,
	                    nav:false, // we are using custom navigation arrow, so lets turn the default navigation off
	                    navText:['‹','›'],
	                    smartSpeed: 1000, // it smooths the transition, and it should be lower than the speed of the auto play
	                    responsive:{
	                        0 : {
	                            items:1
	                        },
	                        350: {
	                            items:1                        },
	                        480: {
	                            items:1                        },
	                        600 : {
	                            items:2                        },
	                        768:{
	                            items:2                        },
	                        978:{
	                            items:4                        },
	                        1198:{
	                            items:4                        }
	                    }


	                });


	                // stop on hover but play after hover out
	                                $wpcs.hover(
	                    function(){
	                        $wpcs.trigger('stop.owl.autoplay');
	                    },
	                    function(){
	                        $wpcs.trigger('play.owl.autoplay');
	                    }
	                );
	                
	                // custom navigation for the owl carousel
	                $(".next-1122549283").click(function(){
	                    $wpcs.trigger("next.owl.carousel");
	                });

	                $(".prev-1122549283").click(function(){
	                    $wpcs.trigger("prev.owl.carousel");
	                });

	            });
	        </script>
	        		
							<div id="featured-post-1" class="featured-post">

					<figure class="featured-image">
					<a href="#"><img src="https://grandediaturismo.com.br/wp-content/themes/accesspress-ray/images/demo/featuredimage-1.jpg"></a>
					</figure>

					<div class="featured-content">
						<h2 class="featured-title"><a href="#">Featured Post 1</a></h2>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi cursus, purus id ultrices tristique, velit ante accumsan metus, non porttitor tortor elit pellentesque felis...</p>
						<a href="#" class="view-more">Read More</a>
					</div>
				</div>
							<div id="featured-post-2" class="featured-post">

					<figure class="featured-image">
					<a href="#"><img src="https://grandediaturismo.com.br/wp-content/themes/accesspress-ray/images/demo/featuredimage-2.jpg"></a>
					</figure>

					<div class="featured-content">
						<h2 class="featured-title"><a href="#">Featured Post 2</a></h2>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi cursus, purus id ultrices tristique, velit ante accumsan metus, non porttitor tortor elit pellentesque felis...</p>
						<a href="#" class="view-more">Read More</a>
					</div>
				</div>
							<div id="featured-post-3" class="featured-post">

					<figure class="featured-image">
					<a href="#"><img src="https://grandediaturismo.com.br/wp-content/themes/accesspress-ray/images/demo/featuredimage-3.jpg"></a>
					</figure>

					<div class="featured-content">
						<h2 class="featured-title"><a href="#">Featured Post 3</a></h2>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi cursus, purus id ultrices tristique, velit ante accumsan metus, non porttitor tortor elit pellentesque felis...</p>
						<a href="#" class="view-more">Read More</a>
					</div>
				</div>
							<div id="featured-post-4" class="featured-post">

					<figure class="featured-image">
					<a href="#"><img src="https://grandediaturismo.com.br/wp-content/themes/accesspress-ray/images/demo/featuredimage-4.jpg"></a>
					</figure>

					<div class="featured-content">
						<h2 class="featured-title"><a href="#">Featured Post 4</a></h2>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi cursus, purus id ultrices tristique, velit ante accumsan metus, non porttitor tortor elit pellentesque felis...</p>
						<a href="#" class="view-more">Read More</a>
					</div>
				</div>
						</div>	
		</div>
	</section>

	<section id="top-section" class="events-section clearfix">
		<div id="latest-events" class="ak-container clearfix">

				
		        <h1 class="roboto-light main-title"><a href="https://grandediaturismo.com.br/category/blog/">blog</a></h1>
				<div class="event-list-wrapper clearfix">
				<div class="event-slider">
		        
		        	<div class="event-list clearfix">
		        		
		        		<figure class="event-thumbnail clearfix">
							<a href="https://grandediaturismo.com.br/chapada-diamantina-noturna/">
													<img src="https://grandediaturismo.com.br/wp-content/uploads/2020/03/Lençóis-Chapada-Diamantina-350x245.jpg" alt="Chapada Diamantina Noturna">
													</a>
						</figure>	

						<div class="event-detail clearfix">
			        		<h4 class="event-title">
			        			<a href="https://grandediaturismo.com.br/chapada-diamantina-noturna/">Chapada Diamantina Noturna</a>
			        		</h4>

			        		<div class="event-excerpt">
			        			


	 Sobre a Noite Em Lençóis-BA





	Podemos dizer que Lençóis é a capital da Chapada Diamantina. Uma cidadezinha pequena e com aquela cara típica de cidade do interior. Uma das principais ruas é a Rua Da Bader...		        		</div>

							<a class="read-more-btn" href="https://grandediaturismo.com.br/chapada-diamantina-noturna/">VER MAIS<span class="read-icon-wrap"><i class="fa fa-angle-right"></i></span></a>

		        		</div>
		        	</div>
		        
		        
		        	<div class="event-list clearfix">
		        		
		        		<figure class="event-thumbnail clearfix">
							<a href="https://grandediaturismo.com.br/maragogi/">
													<img src="https://grandediaturismo.com.br/wp-content/uploads/2019/05/WhatsApp-Image-2019-03-04-at-15.10.32-350x245.jpeg" alt="Maragogi saiba mais sobre esta bela praia">
													</a>
						</figure>	

						<div class="event-detail clearfix">
			        		<h4 class="event-title">
			        			<a href="https://grandediaturismo.com.br/maragogi/">Maragogi saiba mais sobre esta bela praia</a>
			        		</h4>

			        		<div class="event-excerpt">
			        			
	 Maragogi está localizado no litoral norte de Alagoas, fica entre os municípios de Japaratinga (AL) e São José da Coroa Grande (PE), em um dos trechos mais bonitos e bem preservados do litoral nordestino. Dist...		        		</div>

							<a class="read-more-btn" href="https://grandediaturismo.com.br/maragogi/">VER MAIS<span class="read-icon-wrap"><i class="fa fa-angle-right"></i></span></a>

		        		</div>
		        	</div>
		        
		        
		        	<div class="event-list clearfix">
		        		
		        		<figure class="event-thumbnail clearfix">
							<a href="https://grandediaturismo.com.br/piranhas-um-paraiso-no-sertao-alagoano/">
													<img src="https://grandediaturismo.com.br/wp-content/uploads/2017/09/post3-7-350x245.png" alt="PIRANHAS, UM PARAÍSO NO SERTÃO ALAGOANO">
													</a>
						</figure>	

						<div class="event-detail clearfix">
			        		<h4 class="event-title">
			        			<a href="https://grandediaturismo.com.br/piranhas-um-paraiso-no-sertao-alagoano/">PIRANHAS, UM PARAÍSO NO SERTÃO ALAGOANO</a>
			        		</h4>

			        		<div class="event-excerpt">
			        			Piranhas localizada às margens do Rio São Francisco, a 280 km de Maceió, Piranhas tem encantado visitantes com sua arquitetura barroca, o charme das casas coloridas, a exposição exuberante do Rio e dos montes, ...		        		</div>

							<a class="read-more-btn" href="https://grandediaturismo.com.br/piranhas-um-paraiso-no-sertao-alagoano/">VER MAIS<span class="read-icon-wrap"><i class="fa fa-angle-right"></i></span></a>

		        		</div>
		        	</div>
		        
		        			</div>
					        <a href="https://grandediaturismo.com.br/category/blog/" class="view-all clearfix">VER MAIS</a>
							</div>

		        	
		</div>
	</section>


	<section id="bottom1-section" class="business-section clearfix">
		<div class="ak-container">
			<div class="business-activities-wrapper clearfix">
		        <div class="business-wrapper clearfix">
							  <aside id="custom_html-5" class="widget_text widget widget_custom_html"><div class="textwidget custom-html-widget"></div></aside>				
				</div>
		        
		        <div class="business-wrapper clearfix">
		        	
				</div>    
		        

		        <div class="business-wrapper clearfix">
								</div>
			</div>
		</div>
	</section>

	<section id="bottom2-section" class="clients-say-section clearfix">
		<div class="ak-container">
						 		<h3 class="roboto-light main-title">Nossos Clientes</h3>
											        <div class="testimonial-wrap">
						        <div class="testimonial-slider">
						        
						        	<div class="testimonial-slide">
							        	<div class="testimonial-list clearfix">
							        		<div class="testimonial-thumbnail">
							        		<img width="150" height="150" src="https://grandediaturismo.com.br/wp-content/uploads/2017/09/juliana.jpg" class="attachment-thumbnail size-thumbnail wp-post-image" alt="" loading="lazy" srcset="https://grandediaturismo.com.br/wp-content/uploads/2017/09/juliana.jpg 150w, https://grandediaturismo.com.br/wp-content/uploads/2017/09/juliana-100x100.jpg 100w" sizes="(max-width: 150px) 100vw, 150px" />						        		</div>

							        		<div class="testimonial-excerpt">
							        			


	&quot;Quero desde já agradecer por um domingo espetacular ba companhia dessa galera maravilhosa. Vocês estão de parabéns!&quot;
							        		</div>
							        	</div>
									<div class="testimoinal-client-name">Juliana Andrade</div>
									</div>
				                
						        	<div class="testimonial-slide">
							        	<div class="testimonial-list clearfix">
							        		<div class="testimonial-thumbnail">
							        		<img width="150" height="150" src="https://grandediaturismo.com.br/wp-content/uploads/2017/09/gabriel.jpg" class="attachment-thumbnail size-thumbnail wp-post-image" alt="" loading="lazy" srcset="https://grandediaturismo.com.br/wp-content/uploads/2017/09/gabriel.jpg 150w, https://grandediaturismo.com.br/wp-content/uploads/2017/09/gabriel-100x100.jpg 100w" sizes="(max-width: 150px) 100vw, 150px" />						        		</div>

							        		<div class="testimonial-excerpt">
							        			


	&quot;Super recomendo, agência super atenciosa aos clientes, sempre presando o melhor atendimento e nos levando a viver diversas aventuras. Pa...						        		</div>
							        	</div>
									<div class="testimoinal-client-name">Gabriel Sales</div>
									</div>
				                
						        	<div class="testimonial-slide">
							        	<div class="testimonial-list clearfix">
							        		<div class="testimonial-thumbnail">
							        		<img width="150" height="150" src="https://grandediaturismo.com.br/wp-content/uploads/2017/09/shirley.jpg" class="attachment-thumbnail size-thumbnail wp-post-image" alt="" loading="lazy" srcset="https://grandediaturismo.com.br/wp-content/uploads/2017/09/shirley.jpg 150w, https://grandediaturismo.com.br/wp-content/uploads/2017/09/shirley-100x100.jpg 100w" sizes="(max-width: 150px) 100vw, 150px" />						        		</div>

							        		<div class="testimonial-excerpt">
							        			
	&quot;A Agência GD Turismo está de parabéns! Amei a viagem! O destino perfeito com passeios excelentes e um guia de turismo magnífico! Foi uma e...						        		</div>
							        	</div>
									<div class="testimoinal-client-name">Shirley Malta</div>
									</div>
				                
						        	<div class="testimonial-slide">
							        	<div class="testimonial-list clearfix">
							        		<div class="testimonial-thumbnail">
							        		<img width="150" height="150" src="https://grandediaturismo.com.br/wp-content/uploads/2017/09/emeline.jpg" class="attachment-thumbnail size-thumbnail wp-post-image" alt="" loading="lazy" srcset="https://grandediaturismo.com.br/wp-content/uploads/2017/09/emeline.jpg 150w, https://grandediaturismo.com.br/wp-content/uploads/2017/09/emeline-100x100.jpg 100w" sizes="(max-width: 150px) 100vw, 150px" />						        		</div>

							        		<div class="testimonial-excerpt">
							        			


	&quot;Super organizado, preços acessíveis, pessoas competentes e passeios maravilhosos. Destaque para Natal/RN. Quem não foi precisa ir.&quot;


							        		</div>
							        	</div>
									<div class="testimoinal-client-name">Emeline Araujo</div>
									</div>
				                							</div>
							</div>

					        		 
		</div>			
	</section>


		
		</div><!-- #content -->

		<footer id="colophon">
				<div id="top-footer">
			<div class="ak-container">
				<div class="footer1 footer">
										<aside id="text-2" class="widget widget_text">			<div class="textwidget"><p><img loading="lazy" class="alignnone size-full wp-image-224" src="https://www.svmais.com.br/grandedia/wp-content/uploads/2017/09/logo-cadastur.jpg" alt="" width="177" height="60" /></p>
	<p>Grande Dia Turismo – GD Turismo CNPJ: 24.579.370/0001-93 CADASTUR:16.078177.10.0001-0 Endereço: Rua Ernesto Nazareth, 108, Areias-Recife/PE.<br />
	Contatos: (81) 9 8534-3852 / 9 9704-4339<img loading="lazy" class="alignnone size-full wp-image-225" src="https://www.svmais.com.br/grandedia/wp-content/uploads/2017/09/pagseguro-1.png" alt="" width="234" height="190" /></p>
	</div>
			</aside>					
				</div>

				<div class="footer2 footer">
										<aside id="custom_html-2" class="widget_text widget widget_custom_html"><div class="textwidget custom-html-widget">     <div class="four columns">
	<p>Siga-nos no Facebook!</p>   
	     <div class="textwidget">
	<div id="fb-root">
	</div>
	<script>(function(d, s, id) {
	  var js, fjs = d.getElementsByTagName(s)[0];
	  if (d.getElementById(id)) return;
	  js = d.createElement(s); js.id = id;
	  js.src = "//connect.facebook.net/pt_BR/sdk.js#xfbml=1&version=v2.6";
	  fjs.parentNode.insertBefore(js, fjs);
	}(document, 'script', 'facebook-jssdk'));</script>
	<div class="fb-page" data-href="https://www.facebook.com/gdturismo/" data-width="230" data-small-header="false" data-adapt-container-width="false" data-hide-cover="false" data-show-facepile="true"><div class="fb-xfbml-parse-ignore"><blockquote cite="https://www.facebook.com/gdturismo/"><a href="https://www.facebook.com/gdturismo/">GD Turismo</a></blockquote>
	</div>


	</div>
	</div>

	 </div> 
	</div></aside>					
				</div>

				<div class="clearfix hide"></div>

				<div class="footer3 footer">
										<aside id="text-3" class="widget widget_text">			<div class="textwidget">    <div id="wdi_feed_0" class="wdi_feed_main_container wdi_layout_th wdi_feed_theme_1 wdi_feed_thumbnail_1"  >
	      <div  class="wdi_js_error">Something is wrong.<br/></div><div  class="wdi_token_error wdi_hidden">Instagram token error.</div><div  class="wdi_private_feed_error wdi_hidden"><span></span></div><div class="wdi_check_fontawesome wdi_hidden"><i class="tenweb-i tenweb-i-instagram""></i></div>      <div id="wdi_spider_popup_loading_0" class="wdi_spider_popup_loading"></div>
	      <div id="wdi_spider_popup_overlay_0" class="wdi_spider_popup_overlay" onclick="wdi_spider_destroypopup(1000)"></div>
	      <div class="wdi_feed_container">
	        <div class="wdi_feed_info">
	          <div id="wdi_feed_0_header" class='wdi_feed_header'></div>
	          <div id="wdi_feed_0_users" class='wdi_feed_users'>
	                  <div class="wdi_single_user">
	        <div class="wdi_header_user_text ">
	                                  <h3 onclick="window.open('//instagram.com/grandediaturismo','_blank')">grandediaturismo</h3>
	                                <div class="wdi_user_controls">
	              <div class="wdi_follow_btn"
	                   onclick="window.open('//instagram.com/grandediaturismo','_blank')">
	                <span>Follow</span>
	              </div>
	            </div>
	                                      </div>
	      </div>
	      <div class="wdi_clear"></div>
	                </div>
	        </div>
	                <div class="wdi_feed_wrapper wdi_col_3" wdi-res='wdi_col_3'></div>
	        <div class="wdi_clear"></div>
	              </div>
	      <div class="wdi_front_overlay"></div>
	    </div>
	        <style></style>
	        <script></script>
	    
	</div>
			</aside>					
				</div>

				<div class="footer4 footer">
										<aside id="text-4" class="widget widget_text">			<div class="textwidget"><p style="text-align: center;">Caso esteja no celular clique abaixo</p>
	<p><a href="https://api.whatsapp.com/send?phone=5581997044339"><br />
	<img class="alignnone wp-image-227 aligncenter" src="https://grandediaturismo.com.br/wp-content/uploads/2017/09/qrcode.jpg" /><br />
	</a></p>
	<p style="text-align: center;">Leia o Código pelo seu celular</p>
	<p><img loading="lazy" class="alignnone wp-image-226 aligncenter" src="https://www.svmais.com.br/grandedia/wp-content/uploads/2017/09/qrcode.jpg" alt="" width="98" height="104" /></p>
	</div>
			</aside>					
				</div>
			</div>
			</div>
			
			<div id="middle-footer" class="footer-menu">
				<div class="ak-container">
					<div class="menu-222-container"><ul id="menu-223" class="menu"><li class="hvr-fade menu-item menu-item-type-custom menu-item-object-custom menu-item-178"><a href="https://www.grandediaturismo.com.br/">HOME</a></li>
	<li class="hvr-fade menu-item menu-item-type-post_type menu-item-object-page menu-item-179"><a href="https://grandediaturismo.com.br/grande-dia-turismo/">SOBRE NÓS</a></li>
	<li class="hvr-fade menu-item menu-item-type-post_type menu-item-object-page menu-item-182"><a href="https://grandediaturismo.com.br/pacotes-de-viagens-agencia-de-viagens-em-recife/">VIAGENS E PASSEIOS</a></li>
	<li class="hvr-fade menu-item menu-item-type-post_type menu-item-object-page menu-item-183"><a href="https://grandediaturismo.com.br/termo-e-condicoes/">TERMOS E CONDIÇÕES</a></li>
	<li class="hvr-fade menu-item menu-item-type-post_type menu-item-object-page menu-item-181"><a href="https://grandediaturismo.com.br/fale-conosco/">FALE CONOSCO</a></li>
	<li class="hvr-fade menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-361"><a href="https://grandediaturismo.com.br/promocoes-pacote-de-viagens/">PROMOÇÕES</a></li>
	<li class="menu-item menu-item-type-post_type menu-item-object-page menu-item-367"><a href="https://grandediaturismo.com.br/aniversariante-do-dia/">Aniversariante do Dia</a></li>
	<li class="menu-item menu-item-type-post_type menu-item-object-page menu-item-357"><a href="https://grandediaturismo.com.br/promocoes-pacote-de-viagens/promocao-gdteleva/">Promoção #GDteleva</a></li>
	<li class="hvr-fade menu-item menu-item-type-post_type menu-item-object-page menu-item-230"><a href="https://grandediaturismo.com.br/grande-dia-solidario-gd-turismo/">GRANDE DIA SOLIDÁRIO</a></li>
	</ul></div>			</div>
			</div>

			<div id="bottom-footer">
			<div class="ak-container">
				<div class="footer-wrap clearfix">
					<div class="copyright">
						<p>Copyright © 2019 Grande Dia Turismo. Desenvolvido pela <a href="https://www.w7mktdigital.com.br">Agência W7.</a></p>
					</div><!-- .copyright -->
				</div><!-- .footer-wrap -->

							<div class="footer-socials clearfix">
		            	<div class="socials">
			<a href="https://www.facebook.com/gdturismo/" class="facebook" title="Facebook" target="_blank"><span class="font-icon-social-facebook"></span></a>
		
		
		
		
		
		
		
		
		
			<a href="https://www.instagram.com/grandediaturismo/" class="instagram" title="instagram" target="_blank"><span class="fa fa-instagram"></span></a>
		
		
		
			</div>
				</div>
						</div>
			</div>
		</footer><!-- #colophon -->
	</div><!-- #page -->
	<div class="multi-border">
		<ul>
			<li class="dark-green"></li>
			<li class="yellow"></li>
			<li class="cream"></li>
			<li class="orange"></li>
			<li class="light-green"></li>				
		</ul>
	</div>
		<script type="text/javascript">
			(function () {
				var c = document.body.className;
				c = c.replace(/woocommerce-no-js/, 'woocommerce-js');
				document.body.className = c;
			})();
		</script>
		<link rel='stylesheet' id='wpcs-owl-carousel-style-css'  href='https://grandediaturismo.com.br/wp-content/plugins/product-carousel-slider-for-woocommerce/css/owl.carousel.min.css?ver=2.2.1' type='text/css' media='all' />
	<link rel='stylesheet' id='wpcs-owl-theme-style-css'  href='https://grandediaturismo.com.br/wp-content/plugins/product-carousel-slider-for-woocommerce/css/owl.theme.default.css?ver=2.2.1' type='text/css' media='all' />
	<link rel='stylesheet' id='wpcs-font-awesome-css'  href='https://grandediaturismo.com.br/wp-content/plugins/product-carousel-slider-for-woocommerce/css/font-awesome.min.css?ver=5.5.9' type='text/css' media='all' />
	<link rel='stylesheet' id='wpcs-custom-style-css'  href='https://grandediaturismo.com.br/wp-content/plugins/product-carousel-slider-for-woocommerce/css/wpcs-styles.css?ver=5.5.9' type='text/css' media='all' />
	<link rel='stylesheet' id='wdi_font-tenweb-css'  href='https://grandediaturismo.com.br/wp-content/plugins/wd-instagram-feed/css/tenweb-fonts/fonts.css?ver=2.4.24' type='text/css' media='all' />
	<link rel='stylesheet' id='wdi_frontend-css'  href='https://grandediaturismo.com.br/wp-content/plugins/wd-instagram-feed/css/wdi_frontend.min.css?ver=2.4.24' type='text/css' media='all' />
	<link rel='stylesheet' id='wdi_mCustomScrollbar-css'  href='https://grandediaturismo.com.br/wp-content/plugins/wd-instagram-feed/css/gallerybox/jquery.mCustomScrollbar.min.css?ver=2.4.24' type='text/css' media='all' />
	<link rel='stylesheet' id='wdi_theme_1.css-css'  href='https://grandediaturismo.com.br/wp-content/uploads/wd-instagram-feed/wdi_theme_1.css?key=6177f4e2065d5&#038;ver=5.5.9' type='text/css' media='all' />
	<style id='generate_feed_styles-inline-css' type='text/css'>
	      #wdi_feed_0 .wdi_feed_header {
	        display: none; /*if display-header is true display:block*/
	      }
	            #wdi_feed_0 .wdi_header_user_text {
	        padding-top: 5.5px;
	      }

	      #wdi_feed_0 .wdi_header_user_text h3 {
	        margin-top: 5.5px;
	      }

	      #wdi_feed_0 .wdi_media_info {
	        display: block      }

	      #wdi_feed_0 .wdi_feed_item {
	        width: 33.333333333333%; /*thumbnail_size*/
	        line-height: 0;
	      }

	            @media screen and (min-width: 800px) and (max-width: 1024px) {
	        #wdi_feed_0 .wdi_feed_item {
	          width: 33.333333333333%; /*thumbnail_size*/
	          margin: 0;
	          display: inline-block;
	          vertical-align: top;
	          overflow: hidden;
	        }

	        #wdi_feed_0 .wdi_feed_container {
	          width: 100%;
	          margin: 0 auto;
	          background-color: #FFFFFF; /*feed_container_bg_color*/
	        }

	      }

	      @media screen and (min-width: 480px) and (max-width: 800px) {
	        #wdi_feed_0 .wdi_feed_item {
	          width: 50%; /*thumbnail_size*/
	          margin: 0;
	          display: inline-block;
	          vertical-align: top;
	          overflow: hidden;
	        }

	        #wdi_feed_0 .wdi_feed_container {
	          width: 100%;
	          margin: 0 auto;
	          background-color: #FFFFFF; /*feed_container_bg_color*/
	        }
	      }

	      @media screen and (max-width: 480px) {
	        #wdi_feed_0 .wdi_feed_item {
	          width: 100%; /*thumbnail_size*/
	          margin: 0;
	          display: inline-block;
	          vertical-align: top;
	          overflow: hidden;
	        }

	        #wdi_feed_0 .wdi_feed_container {
	          width: 100%;
	          margin: 0 auto;
	          background-color: #FFFFFF; /*feed_container_bg_color*/
	        }
	      }
	    
	</style>
	<script type='text/javascript' src='https://grandediaturismo.com.br/wp-includes/js/dist/vendor/wp-polyfill.min.js?ver=7.4.4' id='wp-polyfill-js'></script>
	<script type='text/javascript' id='wp-polyfill-js-after'>
	( 'fetch' in window ) || document.write( '<script src="https://grandediaturismo.com.br/wp-includes/js/dist/vendor/wp-polyfill-fetch.min.js?ver=3.0.0"></scr' + 'ipt>' );( document.contains ) || document.write( '<script src="https://grandediaturismo.com.br/wp-includes/js/dist/vendor/wp-polyfill-node-contains.min.js?ver=3.42.0"></scr' + 'ipt>' );( window.DOMRect ) || document.write( '<script src="https://grandediaturismo.com.br/wp-includes/js/dist/vendor/wp-polyfill-dom-rect.min.js?ver=3.42.0"></scr' + 'ipt>' );( window.URL && window.URL.prototype && window.URLSearchParams ) || document.write( '<script src="https://grandediaturismo.com.br/wp-includes/js/dist/vendor/wp-polyfill-url.min.js?ver=3.6.4"></scr' + 'ipt>' );( window.FormData && window.FormData.prototype.keys ) || document.write( '<script src="https://grandediaturismo.com.br/wp-includes/js/dist/vendor/wp-polyfill-formdata.min.js?ver=3.0.12"></scr' + 'ipt>' );( Element.prototype.matches && Element.prototype.closest ) || document.write( '<script src="https://grandediaturismo.com.br/wp-includes/js/dist/vendor/wp-polyfill-element-closest.min.js?ver=2.0.2"></scr' + 'ipt>' );
	</script>
	<script type='text/javascript' id='contact-form-7-js-extra'>
	/* <![CDATA[ */
	var wpcf7 = {"api":{"root":"https:\/\/grandediaturismo.com.br\/wp-json\/","namespace":"contact-form-7\/v1"},"cached":"1"};
	/* ]]> */
	</script>
	<script type='text/javascript' src='https://grandediaturismo.com.br/wp-content/plugins/contact-form-7/includes/js/index.js?ver=5.4.2' id='contact-form-7-js'></script>
	<script type='text/javascript' src='https://grandediaturismo.com.br/wp-content/plugins/woocommerce/assets/js/jquery-blockui/jquery.blockUI.min.js?ver=2.70' id='jquery-blockui-js'></script>
	<script type='text/javascript' id='wc-add-to-cart-js-extra'>
	/* <![CDATA[ */
	var wc_add_to_cart_params = {"ajax_url":"\/wp-admin\/admin-ajax.php","wc_ajax_url":"\/?wc-ajax=%%endpoint%%","i18n_view_cart":"Ver carrinho","cart_url":"https:\/\/grandediaturismo.com.br\/carrinho\/","is_cart":"","cart_redirect_after_add":"no"};
	/* ]]> */
	</script>
	<script type='text/javascript' src='https://grandediaturismo.com.br/wp-content/plugins/woocommerce/assets/js/frontend/add-to-cart.min.js?ver=5.5.4' id='wc-add-to-cart-js'></script>
	<script type='text/javascript' src='https://grandediaturismo.com.br/wp-content/plugins/woocommerce/assets/js/js-cookie/js.cookie.min.js?ver=2.1.4' id='js-cookie-js'></script>
	<script type='text/javascript' id='woocommerce-js-extra'>
	/* <![CDATA[ */
	var woocommerce_params = {"ajax_url":"\/wp-admin\/admin-ajax.php","wc_ajax_url":"\/?wc-ajax=%%endpoint%%"};
	/* ]]> */
	</script>
	<script type='text/javascript' src='https://grandediaturismo.com.br/wp-content/plugins/woocommerce/assets/js/frontend/woocommerce.min.js?ver=5.5.4' id='woocommerce-js'></script>
	<script type='text/javascript' id='wc-cart-fragments-js-extra'>
	/* <![CDATA[ */
	var wc_cart_fragments_params = {"ajax_url":"\/wp-admin\/admin-ajax.php","wc_ajax_url":"\/?wc-ajax=%%endpoint%%","cart_hash_key":"wc_cart_hash_e679ad8b8fbd24c1f85d02a04e9a2459","fragment_name":"wc_fragments_e679ad8b8fbd24c1f85d02a04e9a2459","request_timeout":"5000"};
	/* ]]> */
	</script>
	<script type='text/javascript' src='https://grandediaturismo.com.br/wp-content/plugins/woocommerce/assets/js/frontend/cart-fragments.min.js?ver=5.5.4' id='wc-cart-fragments-js'></script>
	<script type='text/javascript' src='https://grandediaturismo.com.br/wp-content/themes/accesspress-ray/js/jquery.bxslider.min.js?ver=4.1' id='accesspress-ray-bx-slider-js'></script>
	<script type='text/javascript' src='https://grandediaturismo.com.br/wp-content/themes/accesspress-ray/js/lightslider.js?ver=1.1.3' id='accesspress-ray-lightslider-js'></script>
	<script type='text/javascript' src='https://grandediaturismo.com.br/wp-content/themes/accesspress-ray/js/nivo-lightbox.min.js?ver=2.1' id='accesspress-ray-fancybox-js'></script>
	<script type='text/javascript' src='https://grandediaturismo.com.br/wp-content/themes/accesspress-ray/js/jquery.actual.min.js?ver=1.0.16' id='accesspress-ray-jquery-actual-js'></script>
	<script type='text/javascript' src='https://grandediaturismo.com.br/wp-content/themes/accesspress-ray/js/skip-link-focus-fix.js?ver=20130115' id='accesspress-ray--skip-link-focus-fix-js'></script>
	<script type='text/javascript' src='https://grandediaturismo.com.br/wp-content/themes/accesspress-ray/js/custom.js?ver=1.1' id='accesspress-ray-custom-js-js'></script>
	<script type='text/javascript' src='https://grandediaturismo.com.br/wp-includes/js/wp-embed.min.js?ver=5.5.9' id='wp-embed-js'></script>
	<script type='text/javascript' src='https://grandediaturismo.com.br/wp-content/plugins/product-carousel-slider-for-woocommerce/js/owl.carousel.min.js?ver=2.2.1' id='wpcs-owl-carousel-js-js'></script>
	<script type='text/javascript' src='https://grandediaturismo.com.br/wp-content/plugins/product-carousel-slider-for-woocommerce/js/custom.js?ver=3.0' id='wpcs-custom-js-js'></script>
	<script type='text/javascript' src='https://grandediaturismo.com.br/wp-includes/js/underscore.min.js?ver=1.8.3' id='underscore-js'></script>
	<script type='text/javascript' src='https://grandediaturismo.com.br/wp-content/plugins/wd-instagram-feed/js/jquery.lazyload.min.js?ver=2.4.24' id='wdi_lazy_load-js'></script>
	<script type='text/javascript' src='https://grandediaturismo.com.br/wp-content/plugins/wd-instagram-feed/js/wdi_instagram.min.js?ver=2.4.24' id='wdi_instagram-js'></script>
	<script type='text/javascript' id='wdi_frontend-js-extra'>
	/* <![CDATA[ */
	var wdi_ajax = {"ajax_url":"https:\/\/grandediaturismo.com.br\/wp-admin\/admin-ajax.php","wdi_nonce":"53da785192","WDI_MINIFY":"true","feed_id":"1","number_of_photos":"3","wdi_cache_request_count":"10"};
	var wdi_url = {"plugin_url":"https:\/\/grandediaturismo.com.br\/wp-content\/plugins\/wd-instagram-feed\/","ajax_url":"https:\/\/grandediaturismo.com.br\/wp-admin\/admin-ajax.php"};
	var wdi_front_messages = {"connection_error":"Connection Error, try again later :(","user_not_found":"Username not found","network_error":"Network error, please try again later :(","hashtag_nodata":"There is no data for that hashtag","filter_title":"Click to filter images by this user","invalid_users_format":"Provided feed users are invalid or obsolete for this version of plugin","feed_nomedia":"There is no media in this feed","expired_token":"Error: Access token session has expired, please reauthorize access token","follow":"Follow","show_alerts":"","wdi_token_flag_nonce":"9fce23c79f","wdi_token_error_flag":"1"};
	var wdi_object = {"user":{"type":"personal","user_id":"","user_name":"grandediaturismo","access_token":"3271663073.1677ed0.9199534f759e45fca14f0ad9c87ae743","start_in":null,"expires_in":null}};
	var wdi_feed_0 = {"feed_row":{"thumb_user":"grandediaturismo","feed_name":"Sample Feed","feed_thumb":"https:\/\/scontent.cdninstagram.com\/t51.2885-19\/s150x150\/13256904_254883434872847_1246106135_a.jpg","published":"1","theme_id":"1","feed_users":"[{\"username\":\"grandediaturismo\",\"id\":\"3271663073\"}]","feed_display_view":"none","sort_images_by":"date","display_order":"desc","follow_on_instagram_btn":"1","display_header":"0","number_of_photos":"3","load_more_number":"3","pagination_per_page_number":"12","pagination_preload_number":"10","image_browser_preload_number":"10","image_browser_load_number":"10","number_of_columns":"3","resort_after_load_more":"0","show_likes":"0","show_description":"0","show_comments":"0","show_usernames":"1","display_user_info":"1","display_user_post_follow_number":"1","show_full_description":"1","disable_mobile_layout":"0","feed_type":"thumbnails","feed_item_onclick":"lightbox","popup_fullscreen":"0","popup_width":"640","popup_height":"640","popup_type":"none","popup_autoplay":"0","popup_interval":"5","popup_enable_filmstrip":"0","popup_filmstrip_height":"70","autohide_lightbox_navigation":"1","popup_enable_ctrl_btn":"1","popup_enable_fullscreen":"1","popup_enable_info":"0","popup_info_always_show":"0","popup_info_full_width":"0","popup_enable_comment":"0","popup_enable_fullsize_image":"1","popup_enable_download":"0","popup_enable_share_buttons":"0","popup_enable_facebook":"0","popup_enable_twitter":"0","popup_enable_google":"0","popup_enable_pinterest":"0","popup_enable_tumblr":"0","show_image_counts":"0","enable_loop":"1","popup_image_right_click":"1","conditional_filters":"","conditional_filter_type":"none","show_username_on_thumb":"0","conditional_filter_enable":"0","liked_feed":"userhash","mobile_breakpoint":"640","redirect_url":"","feed_resolution":"optimal","hashtag_top_recent":"1","id":"1","nothing_to_display":"0","username":"grandediaturismo","widget":false,"access_token":"3271663073.1677ed0.9199534f759e45fca14f0ad9c87ae743","wdi_feed_counter":0},"data":[],"usersData":[],"dataCount":"0"};
	var wdi_theme_1 = {"theme_name":"Instagram","default_theme":"1","feed_container_bg_color":"#FFFFFF","feed_wrapper_width":"100%","feed_container_width":"100%","feed_wrapper_bg_color":"#FFFFFF","active_filter_bg_color":"#429fff","header_margin":"0px","header_padding":"5px","header_border_size":"0px","header_border_color":"#DDDDDD","header_position":"left","header_img_width":"40","header_border_radius":"0","header_text_padding":"5px","header_text_color":"#0f4973","header_font_weight":"400","header_text_font_size":"18px","header_text_font_style":"normal","follow_btn_border_radius":"3","follow_btn_padding":"25","follow_btn_margin":"10","follow_btn_bg_color":"#ffffff","follow_btn_border_color":"#0f4973","follow_btn_text_color":"#0f4973","follow_btn_font_size":"18","follow_btn_border_hover_color":"#0f4973","follow_btn_text_hover_color":"#0f4973","follow_btn_background_hover_color":"#ffffff","user_padding":"5px","user_horizontal_margin":"","user_border_size":"0px","user_border_color":"","user_img_width":"40","user_border_radius":"40","user_background_color":"","users_border_size":"0px","users_border_color":"","users_background_color":"","users_text_color":"#0f4973","users_font_weight":"400","users_text_font_size":"18px","users_text_font_style":"normal","user_description_font_size":"14px","lightbox_overlay_bg_color":"#25292c","lightbox_overlay_bg_transparent":"90","lightbox_bg_color":"#ffffff","lightbox_ctrl_btn_height":"20","lightbox_ctrl_btn_margin_top":"10","lightbox_ctrl_btn_margin_left":"7","lightbox_ctrl_btn_pos":"bottom","lightbox_ctrl_cont_bg_color":"#2a5b83","lightbox_ctrl_cont_border_radius":"4","lightbox_ctrl_cont_transparent":"80","lightbox_ctrl_btn_align":"center","lightbox_ctrl_btn_color":"#FFFFFF","lightbox_ctrl_btn_transparent":"100","lightbox_toggle_btn_height":"14","lightbox_toggle_btn_width":"100","lightbox_close_btn_border_radius":"16","lightbox_close_btn_border_width":"2","lightbox_close_btn_border_style":"none","lightbox_close_btn_border_color":"#FFFFFF","lightbox_close_btn_box_shadow":"none","lightbox_close_btn_bg_color":"#2a5b83","lightbox_close_btn_transparent":"100","lightbox_close_btn_width":"20","lightbox_close_btn_height":"20","lightbox_close_btn_top":"-10","lightbox_close_btn_right":"-10","lightbox_close_btn_size":"15","lightbox_close_btn_color":"#FFFFFF","lightbox_close_btn_full_color":"#000000","lightbox_close_btn_hover_color":"#000000","lightbox_comment_share_button_color":"#ffffff","lightbox_rl_btn_style":"fa-chevron","lightbox_rl_btn_bg_color":"#2a5b83","lightbox_rl_btn_transparent":"80","lightbox_rl_btn_box_shadow":"none","lightbox_rl_btn_height":"40","lightbox_rl_btn_width":"40","lightbox_rl_btn_size":"20","lightbox_close_rl_btn_hover_color":"#25292c","lightbox_rl_btn_color":"#FFFFFF","lightbox_rl_btn_border_radius":"20","lightbox_rl_btn_border_width":"0","lightbox_rl_btn_border_style":"none","lightbox_rl_btn_border_color":"#FFFFFF","lightbox_filmstrip_pos":"top","lightbox_filmstrip_thumb_margin":"0 1px","lightbox_filmstrip_thumb_border_width":"1","lightbox_filmstrip_thumb_border_style":"solid","lightbox_filmstrip_thumb_border_color":"#25292c","lightbox_filmstrip_thumb_border_radius":"0","lightbox_filmstrip_thumb_active_border_width":"0","lightbox_filmstrip_thumb_active_border_color":"#FFFFFF","lightbox_filmstrip_thumb_deactive_transparent":"70","lightbox_filmstrip_rl_btn_size":"20","lightbox_filmstrip_rl_btn_color":"#FFFFFF","lightbox_filmstrip_rl_bg_color":"#3B3B3B","lightbox_info_pos":"top","lightbox_info_align":"right","lightbox_info_bg_color":"#3b3b3b","lightbox_info_bg_transparent":"80","lightbox_info_border_width":"1","lightbox_info_border_style":"none","lightbox_info_border_color":"#3b3b3b","lightbox_info_border_radius":"5","lightbox_info_padding":"5px","lightbox_info_margin":"15px","lightbox_title_color":"#FFFFFF","lightbox_title_font_style":"segoe ui","lightbox_title_font_weight":"bold","lightbox_title_font_size":"13","lightbox_description_color":"#FFFFFF","lightbox_description_font_style":"segoe ui","lightbox_description_font_weight":"normal","lightbox_description_font_size":"14","lightbox_info_height":"30","lightbox_comment_width":"400","lightbox_comment_pos":"right","lightbox_comment_bg_color":"#ffffff","lightbox_comment_font_size":"12","lightbox_comment_font_color":"#000000","lightbox_comment_font_style":"segoe ui","lightbox_comment_author_font_size":"14","lightbox_comment_author_font_color":"#125688","lightbox_comment_author_font_color_hover":"#002160","lightbox_comment_date_font_size":"10","lightbox_comment_body_font_size":"12","lightbox_comment_input_border_width":"1","lightbox_comment_input_border_style":"none","lightbox_comment_input_border_color":"#666666","lightbox_comment_input_border_radius":"0","lightbox_comment_input_padding":"2px","lightbox_comment_input_bg_color":"#333333","lightbox_comment_button_bg_color":"#616161","lightbox_comment_button_padding":"3px 10px","lightbox_comment_button_border_width":"1","lightbox_comment_button_border_style":"none","lightbox_comment_button_border_color":"#666666","lightbox_comment_button_border_radius":"3","lightbox_comment_separator_width":"1","lightbox_comment_separator_style":"solid","lightbox_comment_separator_color":"#125688","lightbox_comment_load_more_color":"#125688","lightbox_comment_load_more_color_hover":"#000000","th_photo_wrap_padding":"5px","th_photo_wrap_border_size":"5px","th_photo_wrap_border_color":"#ffffff","th_photo_img_border_radius":"0px","th_photo_wrap_bg_color":"#FFFFFF","th_photo_meta_bg_color":"#FFFFFF","th_photo_meta_one_line":"1","th_like_text_color":"#8a8d8e","th_comment_text_color":"#8a8d8e","th_photo_caption_font_size":"14px","th_photo_caption_color":"#125688","th_feed_item_margin":"0","th_photo_caption_hover_color":"#8e8e8e","th_like_comm_font_size":"13px","th_overlay_hover_color":"#125688","th_overlay_hover_transparent":"50","th_overlay_hover_icon_color":"#FFFFFF","th_overlay_hover_icon_font_size":"25px","th_photo_img_hover_effect":"","mas_photo_wrap_padding":"5px","mas_photo_wrap_border_size":"0px","mas_photo_wrap_border_color":"gray","mas_photo_img_border_radius":"0px","mas_photo_wrap_bg_color":"#FFFFFF","mas_photo_meta_bg_color":"#FFFFFF","mas_photo_meta_one_line":"1","mas_like_text_color":"#8a8d8e","mas_comment_text_color":"#8a8d8e","mas_photo_caption_font_size":"14px","mas_photo_caption_color":"#125688","mas_feed_item_margin":"0","mas_photo_caption_hover_color":"#8e8e8e","mas_like_comm_font_size":"13px","mas_overlay_hover_color":"#125688","mas_overlay_hover_transparent":"50","mas_overlay_hover_icon_color":"#FFFFFF","mas_overlay_hover_icon_font_size":"25px","mas_photo_img_hover_effect":"","blog_style_photo_wrap_padding":"5px","blog_style_photo_wrap_border_size":"0px","blog_style_photo_wrap_border_color":"gray","blog_style_photo_img_border_radius":"0px","blog_style_photo_wrap_bg_color":"#FFFFFF","blog_style_photo_meta_bg_color":"#FFFFFF","blog_style_photo_meta_one_line":"1","blog_style_like_text_color":"#8a8d8e","blog_style_comment_text_color":"#8a8d8e","blog_style_photo_caption_font_size":"16px","blog_style_photo_caption_color":"#125688","blog_style_feed_item_margin":"0","blog_style_photo_caption_hover_color":"#8e8e8e","blog_style_like_comm_font_size":"20px","image_browser_photo_wrap_padding":"5px","image_browser_photo_wrap_border_size":"0px","image_browser_photo_wrap_border_color":"gray","image_browser_photo_img_border_radius":"0px","image_browser_photo_wrap_bg_color":"#FFFFFF","image_browser_photo_meta_bg_color":"#FFFFFF","image_browser_photo_meta_one_line":"1","image_browser_like_text_color":"#8a8d8e","image_browser_comment_text_color":"#8a8d8e","image_browser_photo_caption_font_size":"16px","image_browser_photo_caption_color":"#125688","image_browser_feed_item_margin":"0","image_browser_photo_caption_hover_color":"#8e8e8e","image_browser_like_comm_font_size":"20px","load_more_position":"center","load_more_padding":"4px","load_more_bg_color":"#ffffff","load_more_border_radius":"500px","load_more_height":"90px","load_more_width":"90px","load_more_border_size":"1px","load_more_border_color":"#0f4973","load_more_text_color":"#1e73be","load_more_text_font_size":"14px","load_more_wrap_hover_color":"transparent","pagination_ctrl_color":"#0f4973","pagination_size":"36px","pagination_ctrl_margin":"15px","pagination_ctrl_hover_color":"#25292c","pagination_position":"center","pagination_position_vert":"top","th_thumb_user_bg_color":"","th_thumb_user_color":"","mas_thumb_user_bg_color":"","mas_thumb_user_color":"","id":"1"};
	var wdi_front = {"feed_counter":"0"};
	/* ]]> */
	</script>
	<script type='text/javascript' src='https://grandediaturismo.com.br/wp-content/plugins/wd-instagram-feed/js/wdi_frontend.min.js?ver=2.4.24' id='wdi_frontend-js'></script>
	<script type='text/javascript' src='https://grandediaturismo.com.br/wp-content/plugins/wd-instagram-feed/js/wdi_responsive.min.js?ver=2.4.24' id='wdi_responsive-js'></script>
	<script type='text/javascript' id='wdi_gallery_box-js-extra'>
	/* <![CDATA[ */
	var wdi_objectL10n = {"wdi_field_required":"Field is required.","wdi_mail_validation":"This is not a valid email address.","wdi_search_result":"There are no images matching your search."};
	/* ]]> */
	</script>
	<script type='text/javascript' src='https://grandediaturismo.com.br/wp-content/plugins/wd-instagram-feed/js/gallerybox/wdi_gallery_box.min.js?ver=2.4.24' id='wdi_gallery_box-js'></script>
	<script type='text/javascript' src='https://grandediaturismo.com.br/wp-content/plugins/wd-instagram-feed/js/gallerybox/jquery.mobile.min.js?ver=2.4.24' id='jquery-mobile-js'></script>
	<script type='text/javascript' src='https://grandediaturismo.com.br/wp-content/plugins/wd-instagram-feed/js/gallerybox/jquery.mCustomScrollbar.concat.min.js?ver=2.4.24' id='jquery-mCustomScrollbar-js'></script>
	<script type='text/javascript' src='https://grandediaturismo.com.br/wp-content/plugins/wd-instagram-feed/js/gallerybox/jquery.fullscreen-0.4.0.min.js?ver=2.4.24' id='jquery-fullscreen-js'></script>
	</body>
	</html>

	<!-- Dynamic page generated in 1.117 seconds. -->
	<!-- Cached page generated by WP-Super-Cache on 2022-07-19 13:50:34 -->

	<!-- super cache -->
}

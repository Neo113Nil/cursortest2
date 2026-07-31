package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.mediation.MaxAd;
import com.applovin.sdk.AppLovinAdSize;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.AppLovinCreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends d {
    private static final String V = "AppLovinDiscovery";
    private static final String W = "json_v3!";
    private static final String X = "ad_size";
    private static final String Y = "ad_format";
    private static final String Z = "REWARD";
    private static final String aA = "HOSTED_HTML_UNIVERSAL";
    private static final String aB = "res1.applovin.com";
    private static final String aC = "/collage";
    private static final String aE = "server_parameters";
    private static final String aF = "ortb_response";
    private static final String aG = "version";
    private static final String aH = "value";
    private static final String aI = "native";
    private static final String aJ = "link";
    private static final String aK = "assets";
    private static final String aL = "title";
    private static final String aM = "text";
    private static final String aN = "img";
    private static final String aO = "id";
    private static final String aP = "type";
    private static final String aQ = "url";
    private static final String aR = "w";
    private static final String aS = "h";
    private static final String aT = "video";
    private static final String aU = "vasttag";
    private static final String aV = "data";
    private static final String aW = "fallback";
    private static final String aX = "clicktrackers";
    private static final String aY = "imptrackers";
    private static final String aZ = "eventtrackers";
    private static final String aa = "ad_type";
    private static final String ab = "REGULAR";
    private static final String ac = "VIDEOA";
    private static final String ad = "zone_id";
    private static final String ae = "event_id";
    private static final String af = "clcodes";
    private static final String ag = "dsp_name";
    private static final String ah = "is_js_tag_ad";
    private static final String ai = "html";
    private static final String aj = "html_template";
    private static final String ak = "status";
    private static final String al = "ads";
    private static final String am = "click_url";
    private static final String an = "&listing=";
    private static final String ao = "video";
    private static final String ap = "ad_id";
    private static final String aq = "clcode";
    private static final String ar = "bid_response";
    private static final String as = "creative_id";
    private static final String at = "adomain";
    private static final String au = "third_party_ad_placement_id";
    private static final String av = "xml";
    private static final String aw = "stream_url";
    private static final String ax = "network_name";
    private static final String ay = "HOSTED_HTML_UNIVERSAL_VIDEO";
    private static final String az = "HOSTED_HTML_UNIVERSAL_REWARD";
    public static final String b = "video";
    private static final String bA = "endcard";
    private static final String bB = "productCatalog";
    private static final String bC = "productCatalogBannerImageUrl";
    private static final String bD = "imageUrl";
    private static MessageDigest bG = null;
    private static final String ba = "click_tracking_urls";
    private static final String bb = "manual";
    private static final String bc = "ad_info";
    private static final String bd = "ad_unit_id";
    private static final String be = "name";
    private static final int bf = 200;
    private static final String bh = "event_type=skip";
    private static final String bi = "exchange=APPLOVIN";
    private static String bj = null;
    private static final int bk = 15;
    private static final String bq = "&current_retry_attempt=";
    private static final String br = "(function(){var sdkId=\"{{SDK_ID}}\";var address=\"{{ADDRESS}}\";var log=function(message){try{if(typeof window.SafeDKWebAppInterface.logMessage===\"function\"){window.SafeDKWebAppInterface.logMessage(message)}else{console.log(\"SafeDKWebApInterface log object missing\")}}catch(error){}};var isElementOnTop=function(element){var rect=element.getBoundingClientRect();var x=rect.left+rect.width/2;var y=rect.top+rect.height/2;var topElement=document.elementFromPoint(x,y);var result=element===topElement||element.contains(topElement);log(\"is element on top: \"+result);return result};var addObservers=function(){try{var isContainerExpanded=false;var privacyElements=[];var isContainerExpanded=false;var elementBigAd=document.getElementById(\"al_bigAdInfo\");if(elementBigAd){privacyElements.push(elementBigAd)}var elementOutput=document.getElementById(\"al_optout_container_expanded\");if(elementOutput){privacyElements.push(elementOutput);isContainerExpanded=true}var backgroundElements=document.querySelectorAll('div[class^=\"_background_\"]');if(backgroundElements.length>0){for(var i=0;i<backgroundElements.length;i++){privacyElements.push(backgroundElements[i])}}for(var j=0;j<privacyElements.length;j++){var privacyElement=privacyElements[j];if(privacyElement&&privacyElement.style){var displayState=privacyElement.style.display;var visibility=getComputedStyle(privacyElement).visibility;var isVisible=visibility==\"visible\";if(isContainerExpanded&&isVisible){isVisible=privacyElement.offsetWidth!=0&&privacyElement.offsetHeight!=0}var privacyElementText=privacyElement.textContent.trim();var isInstallText=privacyElementText!=null&&privacyElementText.toLowerCase().includes(\"install\");var isSingleWord=privacyElementText.trim().split(/\\s+/).length===1;if((!isSingleWord||!isInstallText)&&(displayState!=\"none\"&&displayState!=\"\"||isVisible)){if(typeof window.SafeDKWebAppInterface.requestNoSampling===\"function\"){window.SafeDKWebAppInterface.requestNoSampling(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface safedkNoSampling object missing\")}}else{if(privacyElement.safedkPrivacyDialogObserver!=true){privacyElement.safedkPrivacyDialogObserver=true;try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){switch(mutation.type){case\"attributes\":var isVisible=getComputedStyle(mutation.target).visibility==\"visible\";if(mutation.target.id==\"al_optout_container_expanded\"){isVisible=mutation.target.offsetWidth!=0&&mutation.target.offsetHeight!=0}var composedStyle=getComputedStyle(mutation.target).display;var privacyElementText=privacyElement.textContent.trim();var isInstallText=privacyElementText!=null&&privacyElementText.toLowerCase().includes(\"install\");var isSingleWord=privacyElementText.trim().split(/\\s+/).length===1;if((!isSingleWord||!isInstallText)&&(isVisible||composedStyle==\"block\"||composedStyle!=\"none\"&&displayState!=\"\")){if(typeof window.SafeDKWebAppInterface.requestNoSampling===\"function\"){window.SafeDKWebAppInterface.requestNoSampling(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface safedkNoSampling object missing\")}}break}})});var config={attributes:true,attributeOldValue:true,attributeFilter:[\"style\",\"class\"]};observer.observe(privacyElement,config)}catch(error){if(typeof window.SafeDKWebAppInterface.postMessage===\"function\"){window.SafeDKWebAppInterface.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface SafeDKWebAppInterface object missing\")}}}}}}}catch(error){if(typeof window.SafeDKWebAppInterface.postMessage===\"function\"){window.SafeDKWebAppInterface.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface SafeDKWebAppInterface object missing\")}}};addObservers();try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){for(var i=0;i<mutation.addedNodes.length;i++){var node=mutation.addedNodes[i];if(node&&node.nodeName!=\"#text\"){addObservers()}}})});var config={childList:true,subtree:true};observer.observe(document,config)}catch(error){if(typeof window.SafeDKWebAppInterface.postMessage===\"function\"){window.SafeDKWebAppInterface.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface SafeDKWebAppInterface object missing\")}}})();\n";
    private static final String bs = "{PLACEMENT}";
    private static final String bt = "(\\/)([A-Za-z0-9]{8}_)([^'\"\\?]*?['\"\\?])";
    private static final String bu = "(ad[-_A-Za-z_\\/]+[0-9]*[_\\/])(index\\.js)";
    private static final String bv = "(?:file|http[s]?):\\/{2,3}.*?([^\\/'\\\"\\?]*)(['\\\"\\?])";
    private static final String bw = "[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}";
    private static final String bx = "(<head>\\s*)(<script.*?</script>)";
    private static final String by = "open";
    private static final String bz = "redirectUrl";
    public static final String c = "playable";
    public static final String d = "metaData";
    public static final String e = "creativeSetId";
    public static final String f = "ah_parameters";
    public static final String g = "ad.package_name";
    public static final String h = "template";
    public static final String i = ".applovin.com/redirect";
    public static final String j = "n";
    public static final String k = "applovin://com.applovin.sdk/adservice/expand_ad";
    public static final String l = "SSP_MRAID";
    public static final String n = "APPLOVIN_EXCHANGE";
    public static final String o = "APPLOVIN_NETWORK";
    public static final String p = "APPLOVIN_DIRECTSOLD";
    private final ConcurrentHashMap<String, CreativeInfo> bn;
    private final Map<String, a> bo;
    private final LimitedConcurrentHashMap<String, String> bp;
    private static final String[] aD = {"jpeg", "jpg", "png", "gif", "raw"};
    public static final String[] m = {"applovin://com.applovin.sdk/webview_event", "applovin://com.applovin.sdk/save_template_state"};
    private static final LimitedConcurrentHashMap<String, WeakReference<WebView>> bl = new LimitedConcurrentHashMap<>(15);
    private static final LimitedConcurrentHashMap<String, String> bm = new LimitedConcurrentHashMap<>(15);
    private static final List<String> bE = Arrays.asList("a.applovin.com/4.0/ad", "a.applvn.com/4.0/ad", "a4.applovin.com/4.0/ad", "a4.applvn.com/4.0/ad");
    private static boolean bF = false;
    private static final String bg = "BANNER_NATIVE";
    public static List<String> q = Arrays.asList("BANNER_GRAPHIC_BLANK_UNIFIED", "BANNER_STOREKIT", bg, "BANNER_STOREASSETS");

    static {
        try {
            bG = MessageDigest.getInstance("SHA-256");
        } catch (Throwable th) {
        }
    }

    private static class b {
        private static final int a = 1;
        private static final int b = 2;
        private static final int c = 3;
        private static final int d = 4;
        private static final int e = 5;
        private static final int f = 6;
        private static final int g = 7;
        private static final int h = 8;
        private static final int i = 1;
        private static final int j = 3;
        private static final int k = 1;
        private static final int l = 2;
        private static final int m = 12;
        private static final int n = -1;

        private b() {
        }
    }

    public static void h() {
        bF = true;
    }

    public c() {
        super(com.safedk.android.utils.h.a, V);
        this.bn = new ConcurrentHashMap<>();
        this.bo = new HashMap();
        this.bp = new LimitedConcurrentHashMap<>(15);
        bj = com.safedk.android.utils.n.a();
        this.E.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_NATIVE_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_FULLSCREEN_ADS, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_MRECS, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_BANNERS, true);
        this.E.b(AdNetworkConfiguration.JS_PRIVACY_BUTTON_CLICK_DETECTION_SCRIPT, br);
        this.E.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION_BY_MAX_EVENT, true);
        this.E.b(AdNetworkConfiguration.REPLACE_PREFETCH_CREATIVE_ID_WITH_MAX_CREATIVE_ID, true);
        this.E.b(AdNetworkConfiguration.REPLACE_PREFETCH_CREATIVE_ID_WITH_MAX_CREATIVE_ID_MAX_NETWORK_NAMES, "APPLOVIN_EXCHANGE");
        this.E.b(AdNetworkConfiguration.DONT_USE_PLACEMENT_ID_IN_BANNER_AD_INFO_KEY, "APPLOVIN_NETWORK_&_APPLOVIN_DIRECTSOLD");
        this.E.a(AdNetworkConfiguration.FULL_SCREEN_CI_MAX_AGE, 4800000L);
        this.E.a(AdNetworkConfiguration.BANNER_CI_MAX_AGE, 4800000L);
        AsyncTask.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.discoveries.c.1
            @Override // java.lang.Runnable
            public void run() {
                com.safedk.android.analytics.brandsafety.creatives.h.a("<vast><ad id=\"stam\"></ad></vast>", false, "");
            }
        });
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<CreativeInfo> a(String str, String str2, byte[] bArr, Map<String, List<String>> map, a aVar) {
        String str3;
        int indexOf = str.indexOf(bq);
        if (indexOf <= -1) {
            str3 = str;
        } else {
            str3 = str.substring(0, indexOf);
        }
        return super.a(str3, str2, bArr, map, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0279, code lost:
    
        if (r3 != false) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0152 A[Catch: all -> 0x0485, TryCatch #2 {all -> 0x0485, blocks: (B:34:0x00ef, B:36:0x0108, B:39:0x010f, B:41:0x0115, B:42:0x012d, B:44:0x0152, B:45:0x0159, B:46:0x0201, B:48:0x0208, B:49:0x020e, B:52:0x023b, B:109:0x0254, B:152:0x011a, B:154:0x0120, B:155:0x0125, B:156:0x0129, B:157:0x0162, B:159:0x0168, B:161:0x0180, B:164:0x0187, B:166:0x018d, B:167:0x01c5, B:168:0x01e4, B:169:0x0192, B:171:0x0198, B:172:0x019d, B:174:0x01a3, B:175:0x01a8, B:177:0x01ae, B:178:0x01b3, B:180:0x01b9, B:182:0x01c1, B:183:0x01d5), top: B:32:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x044f  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List<com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo>] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map, a aVar, byte[] bArr) throws JSONException {
        String str3;
        BrandSafetyUtils.AdType adType;
        BrandSafetyEvent.AdFormatType adFormatType;
        String str4;
        String str5;
        String str6;
        BrandSafetyUtils.AdType adType2;
        BrandSafetyEvent.AdFormatType adFormatType2;
        BrandSafetyUtils.AdType adType3;
        String str7;
        String str8;
        String str9;
        int i2;
        ArrayList arrayList;
        CreativeInfo creativeInfo;
        String str10;
        ArrayList arrayList2;
        a aVar2;
        ?? r11 = aVar;
        int i3 = "ads";
        Logger.d(V, "generate info, url: ", str);
        ArrayList arrayList3 = new ArrayList();
        try {
            if (!com.safedk.android.utils.n.l(str2)) {
                return new ArrayList();
            }
            JSONObject jSONObject = new JSONObject(str2);
            if (!jSONObject.has("ads")) {
                return new ArrayList();
            }
            try {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("ads");
                    if (jSONArray.length() == 0 || jSONObject.getInt("status") != 200) {
                        return null;
                    }
                    String optString = jSONObject.optString(aq);
                    Logger.d(V, "adId = ", optString);
                    if (TextUtils.isEmpty(optString) && !bF) {
                        JSONArray optJSONArray = jSONObject.optJSONArray(af);
                        if (optJSONArray != null && optJSONArray.length() > 0) {
                            str3 = optJSONArray.getString(0);
                        } else {
                            String optString2 = jSONObject.optString("ad_format", null);
                            String optString3 = jSONObject.optString("event_id");
                            if (optString2 != null) {
                                try {
                                    aVar2 = new a(this, optString3, BrandSafetyEvent.AdFormatType.valueOf(optString2));
                                } catch (IllegalArgumentException e2) {
                                    Logger.d(V, "generate info, Max prefetch parameters: unsupported ad format=", optString2);
                                    return null;
                                }
                            } else {
                                aVar2 = new a(optString3);
                            }
                            Logger.d(V, "generate info, Max prefetch parameters: eventId=", aVar2.a, ", adFormat=", aVar2.b);
                            a(str, map, jSONArray, aVar2);
                            return null;
                        }
                    } else {
                        str3 = optString;
                    }
                    ArrayList arrayList4 = arrayList3;
                    JSONArray jSONArray2 = jSONArray;
                    String str11 = str3;
                    try {
                        if (jSONObject.has("ad_size")) {
                            String string = jSONObject.getString("ad_size");
                            Logger.d(V, "generate info, json ad_size is ", string);
                            if (!"BANNER".equals(string) && !BrandSafetyUtils.n.equals(string)) {
                                if (BrandSafetyUtils.o.equals(string)) {
                                    adFormatType = BrandSafetyEvent.AdFormatType.MREC;
                                    adType = BrandSafetyUtils.AdType.MREC;
                                } else if ("NATIVE".equals(string)) {
                                    adFormatType = BrandSafetyEvent.AdFormatType.NATIVE;
                                    adType = BrandSafetyUtils.AdType.NATIVE;
                                } else {
                                    adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                                    adFormatType = null;
                                }
                                Object[] objArr = new Object[6];
                                objArr[0] = "generate info, json ad_size : ad format = ";
                                objArr[1] = adFormatType;
                                objArr[2] = ", ad type = ";
                                objArr[3] = adType;
                                objArr[4] = ", ad_format = ";
                                objArr[5] = !jSONObject.has("ad_format") ? jSONObject.get("ad_format") : "NA";
                                Logger.d(V, objArr);
                            }
                            adFormatType = BrandSafetyEvent.AdFormatType.BANNER;
                            adType = BrandSafetyUtils.AdType.BANNER;
                            Object[] objArr2 = new Object[6];
                            objArr2[0] = "generate info, json ad_size : ad format = ";
                            objArr2[1] = adFormatType;
                            objArr2[2] = ", ad type = ";
                            objArr2[3] = adType;
                            objArr2[4] = ", ad_format = ";
                            objArr2[5] = !jSONObject.has("ad_format") ? jSONObject.get("ad_format") : "NA";
                            Logger.d(V, objArr2);
                        } else {
                            if (jSONObject.has("ad_format")) {
                                String string2 = jSONObject.getString("ad_format");
                                Logger.d(V, "generate info, json ad_format is ", string2);
                                if (!string2.equals("BANNER") && !string2.equals(BrandSafetyUtils.n)) {
                                    if (string2.equals(BrandSafetyUtils.o)) {
                                        adFormatType = BrandSafetyEvent.AdFormatType.MREC;
                                        adType = BrandSafetyUtils.AdType.MREC;
                                    } else if (string2.equals("NATIVE")) {
                                        adFormatType = BrandSafetyEvent.AdFormatType.NATIVE;
                                        adType = BrandSafetyUtils.AdType.NATIVE;
                                    } else if (string2.equals(BrandSafetyUtils.j)) {
                                        adFormatType = BrandSafetyEvent.AdFormatType.INTER;
                                        adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                                    } else if (string2.equals(Z)) {
                                        adFormatType = BrandSafetyEvent.AdFormatType.REWARD;
                                        adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                                    } else if (!string2.equals(BrandSafetyUtils.l)) {
                                        adFormatType = null;
                                        adType = null;
                                    } else {
                                        adFormatType = BrandSafetyEvent.AdFormatType.APPOPEN;
                                        adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                                    }
                                    Logger.d(V, "generate info, prefetch parameters adFormat: ", adFormatType);
                                }
                                adFormatType = BrandSafetyEvent.AdFormatType.BANNER;
                                adType = BrandSafetyUtils.AdType.BANNER;
                                Logger.d(V, "generate info, prefetch parameters adFormat: ", adFormatType);
                            } else {
                                Logger.d(V, "generate info, json ad_format has no value, setting ad type to default : INTERSTITIAL ");
                                adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                                adFormatType = null;
                            }
                            Logger.d(V, "generate info, json ad_format result : ad format = ", adFormatType, " , ad type = ", adType.name());
                        }
                        if (!jSONObject.has("ad_type")) {
                            str4 = null;
                        } else {
                            str4 = jSONObject.getString("ad_type");
                        }
                        String b2 = b(jSONObject);
                        BrandSafetyEvent.AdFormatType adFormatType3 = adFormatType;
                        Logger.d(V, "generate info, placementId = ", b2);
                        String optString4 = jSONObject.optString("event_id", null);
                        Logger.d(V, "generate info, eventId = ", optString4);
                        try {
                            if (aVar != null) {
                                Logger.d(V, "generate info, got MAX prefetch parameters: ", aVar);
                                adFormatType2 = aVar.b;
                                str5 = str11;
                                adType3 = adType;
                                str7 = b2;
                                str8 = aVar.a;
                            } else {
                                str5 = str11;
                                try {
                                    a remove = this.bo.remove(str5);
                                    if (remove == null) {
                                        Object[] objArr3 = new Object[4];
                                        objArr3[0] = "generate info, no MAX prefetch parameters found for adId: ";
                                        objArr3[1] = str5;
                                        objArr3[2] = ", eventId: ";
                                        objArr3[3] = optString4;
                                        Logger.d(V, objArr3);
                                        return arrayList4;
                                    }
                                    BrandSafetyUtils.AdType adType4 = adType;
                                    Logger.d(V, "generate info, find MAX prefetch parameters: ", remove);
                                    String str12 = remove.a;
                                    if (b2 != null) {
                                        boolean isEmpty = b2.isEmpty();
                                        str6 = b2;
                                    }
                                    str6 = remove.c;
                                    if (remove.b != null) {
                                        if (!remove.b.name().equals("BANNER") && !remove.b.name().equals(BrandSafetyUtils.n)) {
                                            if (remove.b.name().equals(BrandSafetyUtils.o)) {
                                                adFormatType2 = BrandSafetyEvent.AdFormatType.MREC;
                                                adType2 = BrandSafetyUtils.AdType.MREC;
                                            } else if (remove.b.name().equals("NATIVE")) {
                                                adFormatType2 = BrandSafetyEvent.AdFormatType.NATIVE;
                                                adType2 = BrandSafetyUtils.AdType.NATIVE;
                                            } else if (remove.b.name().equals(BrandSafetyUtils.j)) {
                                                adFormatType2 = BrandSafetyEvent.AdFormatType.INTER;
                                                adType2 = BrandSafetyUtils.AdType.INTERSTITIAL;
                                            } else if (remove.b.name().equals(Z)) {
                                                adFormatType2 = BrandSafetyEvent.AdFormatType.REWARD;
                                                adType2 = BrandSafetyUtils.AdType.INTERSTITIAL;
                                            } else if (remove.b.name().equals(BrandSafetyUtils.l)) {
                                                adFormatType2 = BrandSafetyEvent.AdFormatType.APPOPEN;
                                                adType2 = BrandSafetyUtils.AdType.INTERSTITIAL;
                                            }
                                            Logger.d(V, "generate info, MAX prefetch parameters adFormat: ", adFormatType2);
                                            adType3 = adType2;
                                            str7 = str6;
                                            str8 = str12;
                                        }
                                        adFormatType2 = BrandSafetyEvent.AdFormatType.BANNER;
                                        adType2 = BrandSafetyUtils.AdType.BANNER;
                                        Logger.d(V, "generate info, MAX prefetch parameters adFormat: ", adFormatType2);
                                        adType3 = adType2;
                                        str7 = str6;
                                        str8 = str12;
                                    }
                                    adType2 = adType4;
                                    adFormatType2 = adFormatType3;
                                    Logger.d(V, "generate info, MAX prefetch parameters adFormat: ", adFormatType2);
                                    adType3 = adType2;
                                    str7 = str6;
                                    str8 = str12;
                                } catch (Throwable th) {
                                    th = th;
                                    r11 = arrayList4;
                                    i3 = 3;
                                    Object[] objArr4 = new Object[i3];
                                    objArr4[0] = "generate info, exception parsing prefetch: ";
                                    objArr4[1] = th.getMessage();
                                    objArr4[2] = th;
                                    Logger.d(V, objArr4);
                                    return r11;
                                }
                            }
                            Logger.d(V, "generate info, adTypeJson = ", str4);
                            if (adFormatType2 == null && str4 != null && str4.equals(ac)) {
                                adFormatType2 = BrandSafetyEvent.AdFormatType.REWARD;
                            }
                            Logger.d(V, "generate info, ad format = ", adFormatType2);
                            String optString5 = jSONObject.optString("dsp_name");
                            Logger.d(V, "generate info, dsp name = ", optString5);
                            Logger.d(V, "generate info, network name = ", jSONObject.optString("network_name"));
                            int i4 = 0;
                            while (i4 < jSONArray2.length()) {
                                JSONArray jSONArray3 = jSONArray2;
                                JSONObject jSONObject2 = jSONArray3.getJSONObject(i4);
                                Logger.printFullVerboseLog(V, "generate info, json object is ", jSONObject2.toString());
                                try {
                                    if (jSONObject2.has("html")) {
                                        jSONArray2 = jSONArray3;
                                    } else if (jSONObject2.has(aj)) {
                                        jSONArray2 = jSONArray3;
                                    } else {
                                        if (!jSONObject2.has(aF)) {
                                            jSONArray2 = jSONArray3;
                                            str9 = str8;
                                            creativeInfo = null;
                                            arrayList = arrayList4;
                                            i2 = i4;
                                        } else {
                                            jSONArray2 = jSONArray3;
                                            creativeInfo = a(str5, adType3, adFormatType2, str7, optString5, str8, jSONObject2);
                                            str9 = str8;
                                            arrayList = arrayList4;
                                            i2 = i4;
                                        }
                                        if (creativeInfo != null) {
                                            if (aVar != null) {
                                                if (aVar.e != null) {
                                                    creativeInfo.i(aVar.e);
                                                    Logger.d(V, "generate info, setting adDomain : ", aVar.e);
                                                }
                                                if (aVar.f != null && creativeInfo.K() == BrandSafetyUtils.AdType.NATIVE) {
                                                    String h2 = creativeInfo.h();
                                                    if (TextUtils.isEmpty(h2)) {
                                                        creativeInfo.e(aVar.f);
                                                    } else {
                                                        creativeInfo.e(h2 + "/" + aVar.f);
                                                    }
                                                    Logger.d(V, "generate info, setting native template: ", aVar.f);
                                                }
                                            }
                                            e(creativeInfo);
                                            arrayList.add(creativeInfo);
                                            Logger.printFullVerboseLog(V, "generate info, added CI: ", creativeInfo);
                                        }
                                        i4 = i2 + 1;
                                        arrayList4 = arrayList;
                                        str8 = str9;
                                    }
                                    creativeInfo = a(str5, adType3, adFormatType2, str7, str10, optString5, jSONObject2, str);
                                    arrayList = arrayList2;
                                    if (creativeInfo != null) {
                                    }
                                    i4 = i2 + 1;
                                    arrayList4 = arrayList;
                                    str8 = str9;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r11 = arrayList2;
                                    i3 = 3;
                                    Object[] objArr42 = new Object[i3];
                                    objArr42[0] = "generate info, exception parsing prefetch: ";
                                    objArr42[1] = th.getMessage();
                                    objArr42[2] = th;
                                    Logger.d(V, objArr42);
                                    return r11;
                                }
                                str10 = str8;
                                str9 = str8;
                                arrayList2 = arrayList4;
                                i2 = i4;
                            }
                            return arrayList4;
                        } catch (Throwable th3) {
                            th = th3;
                            r11 = b2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (JSONException e3) {
                    Logger.d(V, "Cannot parse json, skipping.");
                    return new ArrayList();
                }
            } catch (Throwable th5) {
                th = th5;
                Object[] objArr422 = new Object[i3];
                objArr422[0] = "generate info, exception parsing prefetch: ";
                objArr422[1] = th.getMessage();
                objArr422[2] = th;
                Logger.d(V, objArr422);
                return r11;
            }
        } catch (Throwable th6) {
            th = th6;
            r11 = arrayList3;
        }
    }

    private void e(CreativeInfo creativeInfo) {
        int i2;
        HashSet<String> r = creativeInfo.r();
        if (r == null) {
            i2 = 0;
        } else {
            Iterator<String> it = r.iterator();
            i2 = 0;
            while (it.hasNext()) {
                String next = it.next();
                if (next.contains(aB)) {
                    for (String str : aD) {
                        if (next.endsWith(str)) {
                            i2++;
                        }
                    }
                }
            }
        }
        Logger.d(V, "set e-commerce collage ad - counter= ", Integer.valueOf(i2));
        if (i2 >= 3) {
            creativeInfo.c(true);
            creativeInfo.f(aC);
        }
    }

    private String a(JSONObject jSONObject, String str, String str2, String str3) {
        String str4 = null;
        if (!(str2 != null && str2.startsWith(l))) {
            String optString = jSONObject.optString("click_url", null);
            if (optString != null && optString.startsWith(an)) {
                Logger.d(V, "extract clickUrl - clickUrl extraction from json is invalid, will be set to null. clickUrl= ", optString);
            } else {
                str4 = optString;
            }
            if (str4 == null && !TextUtils.isEmpty(str)) {
                str4 = F(str);
                if (str4 == null) {
                    str4 = a(com.safedk.android.utils.g.a("(market:[^'\"]+)['\"]"), str);
                }
                if (str4 == null) {
                    str4 = a(com.safedk.android.utils.g.a("clickUrl: '([^']+)'"), str);
                }
                if (str4 == null && (str4 = a(com.safedk.android.utils.g.a("\"URL over\"[ ]href=\"(.*?)\"", 2), str)) != null && str4.startsWith("javascript:")) {
                    str4 = h(str4, str);
                }
                if (str4 == null && str3 != null && q.contains(str3.trim().split(" ")[0])) {
                    str4 = a(com.safedk.android.analytics.brandsafety.creatives.e.f(), str);
                    Logger.d(V, "extract clickUrl - clickUrl ad, ", str3, " = ", str4);
                }
            }
            if (str4 == null && !TextUtils.isEmpty(str)) {
                Logger.d(V, "extract clickUrl - click_url attempting extracting Mraid click url on html ", str);
                Matcher matcher = com.safedk.android.utils.g.a("trackingUrl = (\\'|\\\\\\\"|\\\")(.*?)(\\'|\\\\\\\"|\\\")(;| \\+)", 2).matcher(str);
                if (matcher.find() && matcher.group(2) != null) {
                    try {
                        str4 = matcher.group(2).replace("\\/", "/");
                        Logger.d(V, "extract clickUrl - click_url extracting via Mraid click url regex : ", str4);
                    } catch (Throwable th) {
                        Logger.d(V, "Exception extracting Mraid click url : ", th.getMessage(), th);
                    }
                }
            }
            Logger.d(V, "extract clickUrl - downstream struct: ", str2, " click url is: ", str4);
            return str4;
        }
        Logger.d(V, "extract clickUrl - SSP Mraid - not extracting click url from prefetch");
        return null;
    }

    public static Pattern C(String str) {
        return com.safedk.android.utils.g.a("function\\s+" + str + ".*?\\{.*?targetUrl\\s*=\\s*\\\\?\\\"(.*?)\\\\?\\\"", 32);
    }

    private String h(String str, String str2) {
        Logger.d(V, "resolve click url started with click url: ", str);
        String substring = str.substring("javascript:".length());
        if (substring.endsWith(";")) {
            substring = substring.substring(0, substring.length() - 1);
        }
        if (substring.endsWith("()")) {
            substring = substring.substring(0, substring.length() - 2);
        }
        Matcher matcher = C(substring).matcher(str2);
        if (matcher.find() && matcher.group(1) != null) {
            try {
                str = matcher.group(1);
                Logger.d(V, "resolve click url - click_url extracting via target url regex : ", str);
                return str;
            } catch (Throwable th) {
                Logger.d(V, "Exception extracting resolve click url: ", th.getMessage(), th);
                return str;
            }
        }
        return str;
    }

    private void b(String str, CreativeInfo creativeInfo) {
        try {
            Matcher matcher = com.safedk.android.utils.g.a("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)script\\s+type=\"application/json\"\\s+id=\"ad-context\"(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)(.*?)(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)/script").matcher(str);
            if (matcher.find() && matcher.groupCount() > 0) {
                String trim = matcher.group(1).trim();
                Logger.d(V, trim);
                JSONObject jSONObject = new JSONObject(trim);
                if (jSONObject.has("open")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("open");
                    if (jSONObject2.has(bz)) {
                        String string = jSONObject2.getString(bz);
                        Logger.d(V, "extract applovin catalog data - found redirect url: ", string);
                        if (TextUtils.isEmpty(creativeInfo.M())) {
                            creativeInfo.a(string, true);
                        }
                    }
                }
                if (jSONObject.has("endcard")) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject("endcard");
                    if (jSONObject3.has(bB)) {
                        JSONArray jSONArray = jSONObject3.getJSONArray(bB);
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            String string2 = jSONArray.getJSONObject(i2).getString("imageUrl");
                            Logger.d(V, "extract applovin catalog data - found image url: ", string2);
                            creativeInfo.y(string2);
                        }
                    }
                    if (jSONObject3.has(bC)) {
                        String string3 = jSONObject3.getString(bC);
                        Logger.d(V, "extract applovin catalog data - found product catalog: ", string3);
                        creativeInfo.y(string3);
                    }
                }
            }
        } catch (Exception e2) {
            Logger.d(V, "extract applovin catalog data - exception occurred: ", e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v7 */
    private CreativeInfo a(String str, BrandSafetyUtils.AdType adType, BrandSafetyEvent.AdFormatType adFormatType, String str2, String str3, String str4, JSONObject jSONObject, String str5) throws JSONException {
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        boolean z;
        String str11;
        String str12;
        String str13;
        boolean z2;
        int i2;
        ?? r7;
        int i3;
        String optString = jSONObject.optString("html");
        ArrayList<String> arrayList = null;
        if (adType == BrandSafetyUtils.AdType.BANNER || adType == BrandSafetyUtils.AdType.MREC) {
            String D = D(optString);
            String a2 = a(com.safedk.android.analytics.brandsafety.creatives.e.h(), optString);
            Logger.printFullVerboseLog(V, "parse ad, prefetch bannerType = ", a2, ", html hash = ", D, ", content = ", optString);
            str6 = D;
            str7 = a2;
        } else {
            str7 = null;
            str6 = null;
        }
        if (!TextUtils.isEmpty(optString)) {
            str8 = optString;
        } else {
            str8 = jSONObject.optString(aj);
        }
        jSONObject.optString(aw);
        String optString2 = jSONObject.optString("video");
        if (optString2.isEmpty()) {
            optString2 = a(com.safedk.android.analytics.brandsafety.creatives.e.g(), str8);
        }
        String a3 = a(com.safedk.android.utils.g.a("<script .*id=\"ad-context\">(.*?)</script>"), str8);
        if (a3 != null && com.safedk.android.utils.k.n(a3)) {
            JSONObject jSONObject2 = new JSONObject(a3);
            JSONObject optJSONObject = jSONObject2.optJSONObject("video");
            if (optJSONObject != null && TextUtils.isEmpty(optString2)) {
                optString2 = optJSONObject.optString("url");
            }
            boolean has = jSONObject2.has("playable");
            if (jSONObject2.has(d) && jSONObject2.getJSONObject(d).has(e)) {
                str10 = jSONObject2.getJSONObject(d).getString(e);
            } else {
                str10 = null;
            }
            Logger.d(V, "parse ad, new template, video: ", optString2, ", is playable? ", Boolean.valueOf(has), ", creativeId: ", str10);
            str9 = optString2;
            z = has;
        } else {
            str9 = optString2;
            str10 = null;
            z = false;
        }
        String a4 = a(com.safedk.android.analytics.brandsafety.creatives.e.h(), str8);
        if (a4 != null) {
            str11 = a4.trim() + "/";
        } else if (!z) {
            str11 = a4;
        } else {
            str11 = "playable/";
        }
        String a5 = a(jSONObject, str8, str11, str7);
        String G = G(str8);
        if (!TextUtils.isEmpty(G)) {
            str12 = G;
        } else {
            str12 = a(jSONObject);
        }
        if (str10 != null) {
            str13 = str10;
        } else {
            str13 = jSONObject.optString("ad_id");
        }
        if (jSONObject.has("network_name") && jSONObject.getString("network_name").equals(CreativeInfoManager.h) && jSONObject.has(ah)) {
            boolean optBoolean = jSONObject.optBoolean(ah);
            Logger.d(V, "parse ad, field ", ah, " value is ", Boolean.valueOf(optBoolean));
            z2 = optBoolean;
        } else {
            z2 = false;
        }
        String str14 = str8;
        String str15 = str9;
        String str16 = str7;
        String str17 = str6;
        AppLovinCreativeInfo appLovinCreativeInfo = new AppLovinCreativeInfo(adType, str, str13, a5, str15, adFormatType, str2, bj, str11, str4, str3, str12, z, z2);
        b(str14, (CreativeInfo) appLovinCreativeInfo);
        if (this.bp.containsKey(str5)) {
            String remove = this.bp.remove(str5);
            i2 = 4;
            r7 = 1;
            i3 = 2;
            Logger.d(V, "parse ad - found ad unit id: ", remove, ", urlToAdUnitId contains the key url: ", str5);
            appLovinCreativeInfo.g(remove);
        } else {
            i2 = 4;
            r7 = 1;
            i3 = 2;
            Logger.printFullVerboseLog(V, "parse ad - urlToAdUnitId contains the key url: ", str5, " the keys are: ", this.bp.keySet());
        }
        Object[] objArr = new Object[i2];
        objArr[0] = "parse ad, adding CI id: ";
        objArr[r7] = str;
        objArr[i3] = ", CI: ";
        objArr[3] = appLovinCreativeInfo;
        Logger.d(V, objArr);
        if (adType.equals(BrandSafetyUtils.AdType.BANNER) || adType.equals(BrandSafetyUtils.AdType.MREC)) {
            String str18 = str2 + "_" + str3 + "_" + com.safedk.android.utils.h.a;
            synchronized (this.bn) {
                this.bn.put(str18, appLovinCreativeInfo);
                if (str17 != null) {
                    bm.put(str, str17);
                    this.bn.put(str17, appLovinCreativeInfo);
                }
            }
        }
        String optString3 = jSONObject.optString(av);
        if (!TextUtils.isEmpty(optString3)) {
            a(appLovinCreativeInfo, str5, optString3, (boolean) r7);
        }
        appLovinCreativeInfo.b((List<String>) com.safedk.android.utils.n.f(str14));
        if (!TextUtils.isEmpty(str14)) {
            appLovinCreativeInfo.a(str.hashCode());
        }
        if (com.safedk.android.utils.n.a(str5, bE) || (str16 != null && str16.contains(bg))) {
            arrayList = O(str14);
        }
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                Object[] objArr2 = new Object[i3];
                objArr2[0] = "parse ad, json object text ";
                objArr2[r7] = next;
                Logger.d(V, objArr2);
                appLovinCreativeInfo.z(next);
            }
        }
        return appLovinCreativeInfo;
    }

    private String b(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("zone_id")) {
            String string = jSONObject.getString("zone_id");
            Logger.d(V, "generate info - found placement id in zone id - ", string);
            return string;
        }
        return "";
    }

    private CreativeInfo a(String str, BrandSafetyUtils.AdType adType, BrandSafetyEvent.AdFormatType adFormatType, String str2, String str3, String str4, JSONObject jSONObject) throws JSONException {
        String str5;
        String str6;
        JSONArray jSONArray;
        String str7;
        String optString = jSONObject.optString("ad_id");
        JSONObject jSONObject2 = jSONObject.getJSONObject(aF);
        String optString2 = jSONObject2.optString("version");
        JSONObject jSONObject3 = jSONObject2.getJSONObject("value");
        int i2 = 2;
        char c2 = 0;
        Logger.d(V, "parse native ad, rendering native ad for oRTB version: ", optString2);
        JSONObject optJSONObject = jSONObject3.optJSONObject("native");
        if (optJSONObject != null) {
            jSONObject3 = optJSONObject;
        } else {
            Logger.d(V, "parse native ad, no native object, continue...");
        }
        String str8 = "link";
        JSONObject optJSONObject2 = jSONObject3.optJSONObject("link");
        JSONArray jSONArray2 = jSONObject3.getJSONArray("assets");
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        String str9 = null;
        while (i3 < jSONArray2.length()) {
            JSONObject jSONObject4 = jSONArray2.getJSONObject(i3);
            if (jSONObject4.has("title")) {
                JSONObject optJSONObject3 = jSONObject4.optJSONObject("title");
                if (optJSONObject3 != null) {
                    String optString3 = optJSONObject3.optString("text");
                    if (!optString3.isEmpty()) {
                        arrayList.add(CreativeInfo.aK + optString3);
                        Object[] objArr = new Object[i2];
                        objArr[c2] = "parse native ad, processed title: ";
                        objArr[1] = optString3;
                        Logger.d(V, objArr);
                    }
                }
                str6 = str8;
                jSONArray = jSONArray2;
                str7 = str9;
            } else {
                if (jSONObject4.has(str8)) {
                    optJSONObject2 = jSONObject4.optJSONObject(str8);
                    str6 = str8;
                    jSONArray = jSONArray2;
                } else {
                    str6 = str8;
                    if (jSONObject4.has("img")) {
                        int optInt = jSONObject4.optInt("id", -1);
                        JSONObject optJSONObject4 = jSONObject4.optJSONObject("img");
                        if (optJSONObject4 == null) {
                            jSONArray = jSONArray2;
                            str7 = str9;
                        } else {
                            int optInt2 = optJSONObject4.optInt("type", -1);
                            String optString4 = optJSONObject4.optString("url");
                            if (optString4.isEmpty()) {
                                jSONArray = jSONArray2;
                                str7 = str9;
                            } else {
                                jSONArray = jSONArray2;
                                if (3 == optInt) {
                                    str7 = str9;
                                } else if (optInt2 == 1) {
                                    str7 = str9;
                                } else {
                                    str7 = str9;
                                    if (2 == optInt || optInt2 == 3) {
                                        arrayList.add(CreativeInfo.aL + optString4);
                                        Logger.d(V, "parse native ad, processed main image URL: ", optString4);
                                    } else {
                                        Logger.d(V, "parse native ad, unrecognized image: ", jSONObject4);
                                        int optInt3 = optJSONObject4.optInt("w", -1);
                                        int optInt4 = optJSONObject4.optInt("h", -1);
                                        if (optInt3 <= 0 || optInt4 <= 0) {
                                            Logger.d(V, "parse native ad, skipping...");
                                        } else if (optInt3 / optInt4 > 1.0d) {
                                            Logger.d(V, "parse native ad, inferring main image from ", Integer.valueOf(optInt3), VastAttributes.HORIZONTAL_POSITION, Integer.valueOf(optInt4), ", processed main image URL: ", optString4);
                                            arrayList.add(CreativeInfo.aL + optString4);
                                        } else {
                                            Logger.d(V, "parse native ad, inferring icon image from ", Integer.valueOf(optInt3), VastAttributes.HORIZONTAL_POSITION, Integer.valueOf(optInt4), ", processed icon URL: ", optString4);
                                            arrayList.add(CreativeInfo.aM + optString4);
                                        }
                                    }
                                }
                                arrayList.add(CreativeInfo.aM + optString4);
                                Logger.d(V, "parse native ad, processed icon URL: ", optString4);
                            }
                        }
                    } else {
                        jSONArray = jSONArray2;
                        str7 = str9;
                        if (jSONObject4.has("video")) {
                            JSONObject optJSONObject5 = jSONObject4.optJSONObject("video");
                            if (optJSONObject5 == null) {
                                str9 = str7;
                            } else {
                                str9 = optJSONObject5.optString("vasttag");
                                Logger.d(V, "parse native ad, processed VAST video: ", str9);
                            }
                        } else if (jSONObject4.has("data")) {
                            int optInt5 = jSONObject4.optInt("id", -1);
                            JSONObject optJSONObject6 = jSONObject4.optJSONObject("data");
                            if (optJSONObject6 != null) {
                                int optInt6 = optJSONObject6.optInt("type", -1);
                                String optString5 = optJSONObject6.optString("value");
                                if (!optString5.isEmpty()) {
                                    if (optInt5 == 8 || optInt6 == 1) {
                                        arrayList.add(CreativeInfo.aQ + optString5);
                                        Logger.d(V, "parse native ad, processed advertiser: ", optString5);
                                    } else if (optInt5 == 4 || optInt6 == 2) {
                                        arrayList.add(CreativeInfo.aN + optString5);
                                        Logger.d(V, "parse native ad, processed body: ", optString5);
                                    } else if (optInt5 == 5 || optInt6 == 12) {
                                        arrayList.add(CreativeInfo.aO + optString5);
                                        Logger.d(V, "parse native ad, processed cta: ", optString5);
                                    } else if (optInt5 == 6 || optInt6 == -1) {
                                        arrayList.add(CreativeInfo.aP + optString5);
                                        Logger.d(V, "parse native ad, processed star rating: ", optString5);
                                    } else {
                                        Logger.d(V, "parse native ad, skipping unsupported data: ", jSONObject4);
                                    }
                                }
                            }
                        } else {
                            Logger.d(V, "parse native ad, unsupported asset object: ", jSONObject4);
                        }
                    }
                }
                i3++;
                str8 = str6;
                jSONArray2 = jSONArray;
                c2 = 0;
                i2 = 2;
            }
            str9 = str7;
            i3++;
            str8 = str6;
            jSONArray2 = jSONArray;
            c2 = 0;
            i2 = 2;
        }
        String str10 = str9;
        ArrayList arrayList2 = new ArrayList();
        if (optJSONObject2 == null) {
            str5 = null;
        } else {
            String optString6 = optJSONObject2.optString("url");
            Logger.d(V, "parse native ad, processed click destination URL: ", optString6);
            Logger.d(V, "parse native ad, processed click destination backup URL: ", optJSONObject2.optString("fallback"));
            JSONArray optJSONArray = optJSONObject2.optJSONArray("clicktrackers");
            if (optJSONArray != null) {
                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                    arrayList2.add(optJSONArray.optString(i4));
                }
                Logger.d(V, "parse native ad, processed click trackers: ", arrayList2);
            }
            str5 = optString6;
        }
        JSONArray optJSONArray2 = jSONObject3.optJSONArray("imptrackers");
        if (optJSONArray2 != null) {
            for (int i5 = 0; i5 < optJSONArray2.length(); i5++) {
                arrayList2.add(optJSONArray2.optString(i5));
            }
            Logger.d(V, "parse native ad, processed imp trackers: ", arrayList2);
        }
        JSONArray optJSONArray3 = jSONObject3.optJSONArray("eventtrackers");
        if (optJSONArray3 != null) {
            for (int i6 = 0; i6 < optJSONArray3.length(); i6++) {
                if (optJSONArray3.get(i6) instanceof JSONObject) {
                    JSONObject jSONObject5 = optJSONArray3.getJSONObject(i6);
                    if (jSONObject5.has("url")) {
                        arrayList2.add(jSONObject5.getString("url"));
                    }
                } else {
                    arrayList2.add(optJSONArray3.getString(i6));
                }
            }
            Logger.d(V, "parse native ad, processed event trackers: ", arrayList2);
        }
        if (jSONObject.has(ba)) {
            arrayList2.add(jSONObject.getString(ba));
            Logger.d(V, "parse native ad, processed click tracking URLs: ", arrayList2);
        }
        AppLovinCreativeInfo appLovinCreativeInfo = new AppLovinCreativeInfo(adType, str, optString, str5, null, adFormatType, str2, bj, null, str3, str4, null, false, false);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            appLovinCreativeInfo.A((String) it.next());
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            appLovinCreativeInfo.x((String) it2.next());
        }
        if (!TextUtils.isEmpty(str10)) {
            a((CreativeInfo) appLovinCreativeInfo, (String) null, str10, false);
            appLovinCreativeInfo.e("vast");
        }
        Logger.d(V, "parse native ad, new CI detected, ad ID: ", appLovinCreativeInfo.L(), ", event ID: ", appLovinCreativeInfo.n(), ", CI: ", appLovinCreativeInfo);
        return appLovinCreativeInfo;
    }

    private String D(String str) {
        return com.safedk.android.utils.n.a(bG.digest(com.safedk.android.utils.n.a(str, com.safedk.android.utils.g.a("(src\\s*=\\s*['\\\"].*?\\/)([A-Za-z0-9]{8}_)(.*?['\\\"\\?])|(url\\(.*?\\/)([A-Za-z0-9]{8}_)(.*?[)\\?])", 2), 2, "").replace(bs, "").replaceAll(bt, "$1$3").replaceAll(bu, "$2").replaceAll(bv, "$1$2").replaceAll(bw, "").replaceAll(bx, "$1").getBytes(Charset.defaultCharset())));
    }

    private ArrayList<String> O(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        String a2 = a(com.safedk.android.utils.g.a("<span class=\"banner-title\">(.*?)</span>"), str);
        String a3 = a(com.safedk.android.utils.g.a("<span class=\"banner-description\">(.*?)</span>"), str);
        Logger.d(V, "found ad text: title=", a2, ", description=", a3);
        arrayList.add(a2);
        arrayList.add(a3);
        return arrayList;
    }

    private void a(String str, Map<String, List<String>> map, JSONArray jSONArray, a aVar) throws JSONException {
        String str2;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            String optString = jSONObject.optString("name");
            String optString2 = jSONObject.optString(ar, null);
            String optString3 = jSONObject.optString("creative_id", null);
            String optString4 = jSONObject.optString("third_party_ad_placement_id");
            String optString5 = jSONObject.optString("adomain", null);
            JSONObject optJSONObject = jSONObject.optJSONObject(aE);
            if (optJSONObject == null) {
                str2 = bb;
            } else {
                String optString6 = optJSONObject.optString("template");
                if (!TextUtils.isEmpty(optString6)) {
                    str2 = optString6;
                } else {
                    str2 = bb;
                }
            }
            Logger.d(V, "parse Max prefetch response started url=", str, " ,max params = ", aVar.toString());
            a aVar2 = new a(aVar.a, aVar.b, optString4, optString3, optString5, str2);
            if (CreativeInfoManager.a().contains(optString)) {
                String P = P(optString2);
                if (P != null) {
                    Logger.d(V, "parse Max prefetch response ", optString, " ", aVar2.b, " base64 bid response is ", optString2);
                    CreativeInfoManager.a(optString, str, P, map, aVar2);
                } else {
                    Logger.d(V, "parse Max prefetch response ", optString, " bidder ", aVar2.b, ", bid response is clcode ", optString2);
                    this.bo.put(optString2, aVar2);
                }
            } else if (optString2 == null) {
                Logger.d(V, "parse Max prefetch response ", optString, " ", aVar2.b, " bid response empty.");
            } else {
                if (CreativeInfoManager.a(CreativeInfoManager.c(optString), AdNetworkConfiguration.SHOULD_DECODE_BASE64_PREFECT_RECEIVED_BY_APPLOVIN, false)) {
                    try {
                        optString2 = new String(Base64.decode(optString2, 0));
                    } catch (Throwable th) {
                        Logger.d(V, "Exception decoding payload : ", th.getMessage(), th);
                    }
                }
                Logger.d(V, "parse Max prefetch response ", optString, " ", aVar2.b, " bid response is ", optString2);
                CreativeInfoManager.a(optString, str, optString2, map, aVar2);
            }
        }
    }

    private static String P(String str) {
        if (str != null) {
            String[] split = str.split("!");
            if (split.length == 2) {
                return new String(Base64.decode(split[1], 0));
            }
            return null;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean B(String str) {
        Logger.d(V, "should follow get url: ", str);
        return str.contains("4.0/ad");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        boolean z;
        int indexOf = str.indexOf(bq);
        if (indexOf <= -1) {
            z = false;
        } else {
            str = J(str.substring(0, indexOf));
            if (!this.F.containsKey(new com.safedk.android.analytics.brandsafety.creatives.i(str))) {
                z = false;
            } else {
                z = true;
            }
        }
        boolean z2 = z || str.contains("4.0/ad") || CreativeInfoManager.i(str);
        if (z2) {
            Logger.d(V, "should follow input stream: ", str);
        }
        return z2;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(String str, String str2) {
        return a(str, str2, (WeakReference<WebView>) null);
    }

    private String Q(String str) {
        Logger.d(V, "get ad ID from resource: url is an html doc");
        Matcher matcher = com.safedk.android.utils.g.a("window.al_clcode\\s*=\\s*'(.*?)'").matcher(str);
        if (matcher.find() && matcher.groupCount() >= 1) {
            String group = matcher.group(1);
            Logger.d(V, Logger.FeatureTag.CI_MATCHING, "get ad ID from resource: found ad id using applovin window clcode pattern in html, adId = ", group);
            return group;
        }
        Matcher matcher2 = com.safedk.android.utils.g.a("\"clcode\"\\s*:\\s*\"(.*?)\"").matcher(str);
        if (matcher2.find() && matcher2.groupCount() >= 1) {
            String group2 = matcher2.group(1);
            Logger.d(V, Logger.FeatureTag.CI_MATCHING, "get ad ID from resource: found ad id using applovin json clcode pattern in html, adId = ", group2);
            return group2;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, WeakReference<WebView> weakReference) {
        String Q;
        Logger.printFullVerboseLog(V, "get ad ID from resource started, url: ", str2, ", value: ", str);
        if (str2 != null) {
            try {
                if (com.safedk.android.utils.k.k(str2)) {
                    String Q2 = Q(str2);
                    if (Q2 != null) {
                        return Q2;
                    }
                } else {
                    String[] split = str2.split("clcode=");
                    if (split.length > 1) {
                        String[] split2 = split[1].split("\"|\\&|&");
                        if (split2.length > 0) {
                            String str3 = split2[0];
                            Logger.d(V, Logger.FeatureTag.CI_MATCHING, "get ad ID from resource: CI MATCH, adId = ", str3);
                            return str3;
                        }
                    } else {
                        Logger.d(V, "get ad ID from resource: cant split string by clcode, url: ", str2);
                    }
                }
            } catch (Exception e2) {
                Logger.d(V, "get ad ID from resource: cant extract ad id from: ", str2, e2);
            }
        }
        if (str != null && !str.equals(str2) && com.safedk.android.utils.k.k(str) && (Q = Q(str)) != null) {
            return Q;
        }
        if (com.safedk.android.utils.k.k(str)) {
            String D = D(str);
            Logger.d(V, "get ad ID from resource: the banner hash is: ", D);
            if (bl.containsKey(D)) {
                Logger.d(V, "get ad ID from resource: bannerHtmlHash already in sourceToWebviewRef map - bannerHtmlHash=", D);
            }
            if (com.safedk.android.utils.n.a((Reference<?>) weakReference)) {
                bl.put(D, weakReference);
            } else {
                Logger.d(V, "get ad id from resource - webview is null, not storing bannerHtmlHash in sourceToWebviewRef");
            }
            if (this.bn.containsKey(D)) {
                CreativeInfo creativeInfo = this.bn.get(D);
                if (creativeInfo != null) {
                    String L = creativeInfo.L();
                    Logger.d(V, Logger.FeatureTag.CI_MATCHING, "get ad ID from resource: CI MATCH! : id = ", L, ", ci : ", creativeInfo.aa());
                    if (bm.containsKey(L)) {
                        Logger.d(V, "get ad ID from resource: ad id already in adIdToSource map - adId=", L);
                    }
                    bm.put(L, D);
                    return L;
                }
                Logger.d(V, "get ad ID from resource: failed to mach by html hash. will try to extract ad id...");
                String a2 = a(com.safedk.android.utils.g.a("\\\"clcode\\\":\\\"(\\S*?)\\\""), str);
                if (a2 != null) {
                    Logger.d(V, Logger.FeatureTag.CI_MATCHING, "get ad ID from resource: CI MATCH! : id = ", a2);
                    return a2;
                }
                Logger.d(V, "get ad ID from resource: NO MATCH, can't extract clcode from html");
                return null;
            }
            Logger.d(V, "get ad ID from resource: NO MATCH, putting the banner hash into the sourceToWebviewRef");
            return null;
        }
        Logger.d(V, "get ad ID from resource: NO MATCH, putting the value into sourceToWebviewRef");
        if (com.safedk.android.utils.n.a((Reference<?>) weakReference)) {
            bl.put(str, weakReference);
            return null;
        }
        Logger.d(V, "get ad id from resource - webview is null, not storing value in sourceToWebviewRef");
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public int i(String str) {
        String c2 = c(str, str);
        if (c2 == null) {
            return 0;
        }
        Logger.d(V, String.format("ad id %s, hash code: %s, from webview html: %s, ", c2, Integer.valueOf(c2.hashCode()), str));
        return c2.hashCode();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> c() {
        return new HashSet();
    }

    public class a {
        public String a;
        public BrandSafetyEvent.AdFormatType b;
        public String c;
        public String d;
        public String e;
        public String f;

        public a(String str, BrandSafetyEvent.AdFormatType adFormatType, String str2, String str3, String str4, String str5) {
            this.a = str;
            this.b = adFormatType;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
        }

        public a(c cVar, String str, BrandSafetyEvent.AdFormatType adFormatType, String str2) {
            this(str, adFormatType, str2, null, null, null);
        }

        public a(c cVar, String str, BrandSafetyEvent.AdFormatType adFormatType) {
            this(str, adFormatType, null, null, null, null);
        }

        public a(String str) {
            this.a = str;
        }

        public String toString() {
            return "{eventId=" + this.a + ", adFormat=" + this.b + ", placementId=" + this.c + ", creativeId=" + this.d + ", adDomain=" + this.e + '}';
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo b(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (this.bn.containsKey(str)) {
                Logger.d(V, "match info started, complex key = ", str, " , banner CIs key set = ", this.bn.keySet());
                CreativeInfo creativeInfo = this.bn.get(str);
                if (creativeInfo == null) {
                    return creativeInfo;
                }
                Logger.d(V, "match info found, banner CI: ", creativeInfo.aa());
                return creativeInfo;
            }
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        super.i();
        com.safedk.android.utils.e.a(this.bn, "AppLovinDiscovery:bannerCreativeInfos");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(View view) {
        return g(view);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean b(View view) {
        return h(view);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public RedirectDetails.RedirectType l(String str) {
        if (str != null) {
            if (str.contains(i)) {
                return RedirectDetails.RedirectType.REDIRECT;
            }
            if (str.contains(k)) {
                return RedirectDetails.RedirectType.EXPAND;
            }
            for (String str2 : m) {
                if (str.startsWith(str2)) {
                    return null;
                }
            }
        }
        return RedirectDetails.RedirectType.REDIRECT;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String m(String str) {
        if (str != null) {
            if (str.contains(i)) {
                return com.safedk.android.utils.k.d(str, "n");
            }
            if (str.contains(k)) {
                return null;
            }
        }
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public BrandSafetyUtils.AdType f(View view) {
        if (view instanceof AppLovinAdView) {
            AppLovinAdSize size = ((AppLovinAdView) view).getSize();
            if (size.equals(AppLovinAdSize.BANNER) || size.equals(AppLovinAdSize.LEADER)) {
                return BrandSafetyUtils.AdType.BANNER;
            }
            if (size.equals(AppLovinAdSize.MREC)) {
                return BrandSafetyUtils.AdType.MREC;
            }
            if (size.equals(AppLovinAdSize.INTERSTITIAL)) {
                return BrandSafetyUtils.AdType.INTERSTITIAL;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static Bundle a(MaxAd maxAd) {
        Class<?> cls = maxAd.getClass();
        ArrayList<Field> arrayList = new ArrayList();
        do {
            arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
            cls = cls.getSuperclass();
            if (cls == null) {
                break;
            }
        } while (cls.getName().startsWith(com.safedk.android.utils.h.a));
        String str = null;
        String str2 = null;
        String str3 = null;
        for (Field field : arrayList) {
            field.setAccessible(true);
            try {
                Object obj = field.get(maxAd);
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("event_id")) {
                        str = jSONObject.getString("event_id");
                    }
                    if (jSONObject.has(ar)) {
                        str2 = CreativeInfoManager.c(jSONObject.getString("name"));
                        str3 = jSONObject.getString(ar);
                    } else if (jSONObject.has("name")) {
                        String optString = jSONObject.optString("name");
                        if (!TextUtils.isEmpty(optString)) {
                            String c2 = CreativeInfoManager.c(optString);
                            if (CreativeInfoManager.a(c2, AdNetworkConfiguration.SHOULD_SCAN_OBJECT_USING_REFLECTION, false)) {
                                str3 = "";
                                str2 = c2;
                            }
                        }
                    }
                }
                if (str != null && str2 != null && str3 != null) {
                    Logger.d(V, "extract data from Max ad, event ID: ", str, ", sdk: ", str2, ", bid response: ", str3);
                    Bundle bundle = new Bundle();
                    bundle.putString("eventId", str);
                    bundle.putString("sdk", str2);
                    bundle.putString("bidResponse", str3);
                    return bundle;
                }
            } catch (IllegalAccessException e2) {
                Logger.e(V, "extract data from Max ad exception: ", e2.getMessage(), e2);
            } catch (Throwable th) {
                Logger.e(V, "extract data from Max ad exception: ", th.getMessage(), th);
            }
        }
        return null;
    }

    protected String a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.getJSONObject(f).getString(g);
        } catch (JSONException e2) {
            return null;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean g(String str) {
        Iterator<String> it = CreativeInfoManager.j.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, byte[] bArr) {
        if (!g(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            if (com.safedk.android.utils.k.n(str2)) {
                JSONObject jSONObject = new JSONObject(str2);
                Logger.printFullVerboseLog(V, "handle on request sent - parsing json. url: ", str, ", content: ", str2);
                if (jSONObject.has(bc)) {
                    Logger.d(V, "handle on request sent - applovin request json has ad info");
                    JSONObject jSONObject2 = jSONObject.getJSONObject(bc);
                    if (jSONObject2.has(bd)) {
                        String string = jSONObject2.getString(bd);
                        Logger.d(V, "handle on request sent - found ad unit id ", string, " inside the request");
                        this.bp.put(str, string);
                        return null;
                    }
                }
            } else {
                Logger.d(V, "handle on request sent - content is not json. content = ", str2);
            }
        } catch (Throwable th) {
            Logger.printFullVerboseLog(V, "handle on request sent - exception occurred: ", th.getMessage());
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean n(String str) {
        if (!bm.containsKey(str)) {
            Logger.d(V, "try reverse matching with ad id - ad id ", str, " is not in the ad id to source keys: ", bm.keySet());
            return false;
        }
        return a(bm.get(str), com.safedk.android.utils.h.a, bl, this.bn, d.s);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void o(String str) {
        String remove = bm.remove(str);
        Logger.d(V, "clean resources started with ad id: ", str, ", and source is: ", remove);
        if (remove != null) {
            bl.remove(remove);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void e(String str) {
        try {
            Logger.d(V, "on json object detected started ", ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            if (str.contains("\"ads\"")) {
                CreativeInfoManager.a(this.U, "@!1:ad_fetch@!", str, (Map<String, List<String>>) null);
            }
        } catch (Throwable th) {
            Logger.e(V, "Exception in json object detected", th);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void b(WebView webView, String str) {
        if (!TextUtils.isEmpty(str) && str.contains(bi) && str.contains(bh)) {
            Logger.d(V, "handle webview response - webview= ", webView, ", calling setOnEndcardDisplayed");
            CreativeInfoManager.a(this.U, BrandSafetyUtils.a((Object) webView), true, "url");
            CreativeInfoManager.f(this.U);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String h(String str) {
        return P(str);
    }
}

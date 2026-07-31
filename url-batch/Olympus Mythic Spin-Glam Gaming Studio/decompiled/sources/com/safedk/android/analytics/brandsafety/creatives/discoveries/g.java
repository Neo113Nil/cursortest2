package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.h;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.InMobiCreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g extends d {
    private static final String V = "landingUrl";
    private static final String W = "landingPageUrl";
    private static final String X = "mainLink";
    private static final String Y = "onClick";
    private static final String Z = "markupType";
    private static final String aA = "star";
    private static final String aB = "impressionTrackers";
    private static final String aC = "com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL";
    private static final String aD = "com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX";
    private static final String aE = "text";
    private static final String aF = "url";
    private static final String aG = "media";
    private static final String aH = "image";
    private static final String aI = "assets";
    private static final String aJ = "video";
    private static final String aK = "type";
    private static final String aL = "vastTag";
    private static final String aM = "itemUrl";
    private static final float aN = 0.3f;
    private static final int aV = 50;
    private static final String aY = "(function(){var sdkId=\"{{SDK_ID}}\";var address=\"{{ADDRESS}}\";var log=function(message){try{if(typeof window.webkit.messageHandlers.safedkDebug.postMessage===\"function\"){window.webkit.messageHandlers.safedkDebug.postMessage(message)}else{console.log(\"SafeDKWebApInterface safedkDebug object missing\")}}catch(error){}};var lookForPrivacyPolicy=function(){try{var isPrivacyPolicy=document.querySelectorAll('[class^=\"overlay svelte-\"]').length>0;isPrivacyPolicy=isPrivacyPolicy||document.querySelectorAll('[class^=\"rate-ad svelte-\"]').length>0;isPrivacyPolicy=isPrivacyPolicy||document.querySelectorAll('[class*=\"reporting-container\"]').length>0;isPrivacyPolicy=isPrivacyPolicy||document.querySelectorAll('main.overlay.full-screen-ad-report[class*=\"svelte-\"]').length>0;if(isPrivacyPolicy&&!isPrivacyPolicyReported){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,0,0);isPrivacyPolicyReported=true}else{console.log(\"SafeDKWebApInterface safedkNoSampling object missing\")}}}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface safedkNoSamplingExc object missing\")}}};var isPrivacyPolicyReported=false;lookForPrivacyPolicy();try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){for(var i=0;i<mutation.addedNodes.length;i++){var node=mutation.addedNodes[i];if(node&&node.nodeName!=\"#text\"){lookForPrivacyPolicy()}}})});var config={childList:true,subtree:true};observer.observe(document,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface safedkNoSamplingExc object missing\")}}})();\n";
    private static final String aa = "inmobiJson";
    private static final String ab = "requestId";
    private static final String ac = ".w.inmobi.com/c.asm/";
    private static final String ad = "banner";
    private static final String ae = "mrec";
    private static final String af = "ads.inmobi.com/sdk";
    private static final String ag = "client-request-id";
    private static final String ah = "mk-ad-slot";
    private static final String ai = "im-plid";
    private static final String aj = "adtype";
    private static final String ak = "creativeType";
    private static final String al = "metaInfo";
    private static final String am = "omsdkInfo";
    private static final String an = "macros";
    private static final String ao = "$PLACEMENT_DIMENSION";
    private static final String ap = "content";
    private static final String aq = "trackers";
    private static final String ar = "title";
    private static final String as = "screenshots";
    private static final String at = "url";
    private static final String au = "icon";
    private static final String av = "iconUrl";
    private static final String aw = "description";
    private static final String ax = "cta";
    private static final String ay = "ctaText";
    private static final String az = "rating";
    public static final String b = "contextData";
    public static final String c = "advertisedContent";
    private static final String d = "InMobiDiscovery";
    private static final String e = "rootContainer";
    private static final String f = "assetValue";
    private static final String g = "placementId";
    private static final String h = "ads";
    private static final String i = "adSets";
    private static final String j = "creativeId";
    private static final String k = "impressionId";
    private static final String l = "bidBundle";
    private static final String m = "pubContent";
    private static final String n = "passThroughJson";
    private static final String o = "adContent";
    private static final String p = "trackingInfo";
    private static final String q = "assetsObject";
    private static final Map<String, com.safedk.android.analytics.brandsafety.creatives.i> aO = new HashMap();
    private static final Map<String, CreativeInfo> aP = new ConcurrentHashMap();
    private static final Map<String, CreativeInfo> aQ = new ConcurrentHashMap();
    private static final Map<String, CreativeInfo> aR = new ConcurrentHashMap();
    private static final Map<String, CreativeInfo> aS = new ConcurrentHashMap();
    private static final Map<String, String> aT = new ConcurrentHashMap();
    private static final Map<String, String> aU = new ConcurrentHashMap();
    private static final Map<String, String> aW = new LimitedConcurrentHashMap(50);
    private static final Map<String, WeakReference<WebView>> aX = new LimitedConcurrentHashMap(50);

    public g() {
        super(com.safedk.android.utils.h.i, d);
        this.E.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.E.b(AdNetworkConfiguration.SHOULD_UPDATE_CREATIVE_INFO_FROM_VAST, false);
        this.E.b(AdNetworkConfiguration.SUPPORTS_GZIP_CONTENT, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, true);
        this.E.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE, true);
        this.E.a(AdNetworkConfiguration.BITMAP_SCAN_BOTTOM_MARGIN_PERCENT, aN);
        this.E.b(AdNetworkConfiguration.BITMAP_SCAN_SHOULD_CHECK_FOR_GREYSCALE, true);
        this.E.b(AdNetworkConfiguration.ENFORCE_CLOSE_INPUT_STREAM_VAST_IN_VAST, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.AVOID_CLEANING_PENDING_CI_LIST_ON_AD_END, true);
        this.E.b(AdNetworkConfiguration.AD_NETWORK_INTERNAL_BROWSER_OPENS_IN_SAME_ACTIVITY, true);
        this.E.b(AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, true);
        this.E.b(AdNetworkConfiguration.SHOULD_USE_EARLY_VAST_AD_TAG_URI_PARSING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_NATIVE_BANNERS_USING_BANNER_KEY, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_NATIVE_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.DOWNLOAD_INNER_VAST_URL_IF_NOT_LOADED, true);
        this.E.b(AdNetworkConfiguration.SHOULD_CALL_RESOURCE_LOADED_FROM_SHOULD_INTERCEPT_REQUEST, true);
        this.E.b(AdNetworkConfiguration.INJECT_SCRIPTS_IF_URL_IS_NULL, true);
        this.E.b(AdNetworkConfiguration.JS_PRIVACY_BUTTON_CLICK_DETECTION_SCRIPT, aY);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map, c.a aVar, byte[] bArr) {
        InMobiCreativeInfo inMobiCreativeInfo;
        Object[] objArr = new Object[6];
        objArr[0] = "generate info started, url: ";
        objArr[1] = str;
        objArr[2] = ", event id: ";
        objArr[3] = aVar == null ? "" : aVar.a;
        objArr[4] = ", buffer size: ";
        objArr[5] = str2 == null ? POBCommonConstants.NULL_VALUE : Integer.valueOf(str2.length());
        Logger.d(d, objArr);
        if (com.safedk.android.utils.n.n(str2)) {
            if (O(str2)) {
                Logger.d(d, "generate info - InMobi prefetch");
                return a(str, str2, map, aVar);
            }
            return h(str, str2);
        }
        Logger.d(d, "generate info - InMobi pubContent, url: ", str);
        synchronized (aP) {
            inMobiCreativeInfo = (InMobiCreativeInfo) aP.remove(str);
        }
        if (inMobiCreativeInfo != null) {
            return a(str, str2, inMobiCreativeInfo, "", true);
        }
        Logger.d(d, "generate info - not a valid JSON string");
        return new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0550 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x045b A[Catch: all -> 0x057d, TryCatch #5 {all -> 0x057d, blocks: (B:3:0x000f, B:5:0x001c, B:7:0x0024, B:10:0x002e, B:12:0x003a, B:15:0x0046, B:17:0x004f, B:18:0x0065, B:20:0x006e, B:21:0x0084, B:23:0x0096, B:24:0x009d, B:27:0x00b1, B:29:0x00cb, B:31:0x00f0, B:33:0x0104, B:35:0x0124, B:37:0x012a, B:39:0x0158, B:41:0x0166, B:43:0x016e, B:45:0x0195, B:47:0x019b, B:49:0x01f4, B:51:0x01ff, B:52:0x0206, B:57:0x0225, B:59:0x024f, B:60:0x0278, B:64:0x027f, B:66:0x03b5, B:68:0x03b9, B:69:0x03f6, B:74:0x0403, B:75:0x041a, B:79:0x0421, B:83:0x0452, B:85:0x051a, B:87:0x0520, B:89:0x0526, B:91:0x0532, B:92:0x0535, B:94:0x0547, B:96:0x054d, B:98:0x0550, B:104:0x045a, B:105:0x045b, B:107:0x045f, B:114:0x046f, B:116:0x0473, B:118:0x047a, B:119:0x04d2, B:123:0x04d9, B:127:0x0518, B:132:0x029b, B:133:0x029c, B:135:0x02a2, B:137:0x02a9, B:138:0x02e2, B:140:0x02f0, B:141:0x0301, B:142:0x0327, B:150:0x0332, B:152:0x02cb, B:156:0x0342, B:158:0x0362, B:160:0x038a, B:163:0x0399, B:164:0x03a8, B:165:0x0221, B:166:0x0218, B:168:0x019e, B:170:0x01a6, B:171:0x01a9, B:173:0x01af, B:175:0x01b5, B:177:0x01bb, B:179:0x01c1, B:181:0x01c7, B:183:0x01cd, B:185:0x01d3, B:187:0x01d9, B:189:0x01df, B:191:0x01e5, B:192:0x01e9, B:194:0x01ef, B:200:0x010b, B:202:0x0113, B:204:0x011d, B:205:0x0561, B:207:0x00f5, B:210:0x00a9, B:214:0x056f, B:144:0x0328, B:145:0x032d, B:77:0x041b, B:78:0x0420, B:121:0x04d3, B:122:0x04d8, B:71:0x03f7, B:72:0x0400, B:62:0x0279, B:63:0x027e), top: B:2:0x000f, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03b9 A[Catch: all -> 0x057d, TryCatch #5 {all -> 0x057d, blocks: (B:3:0x000f, B:5:0x001c, B:7:0x0024, B:10:0x002e, B:12:0x003a, B:15:0x0046, B:17:0x004f, B:18:0x0065, B:20:0x006e, B:21:0x0084, B:23:0x0096, B:24:0x009d, B:27:0x00b1, B:29:0x00cb, B:31:0x00f0, B:33:0x0104, B:35:0x0124, B:37:0x012a, B:39:0x0158, B:41:0x0166, B:43:0x016e, B:45:0x0195, B:47:0x019b, B:49:0x01f4, B:51:0x01ff, B:52:0x0206, B:57:0x0225, B:59:0x024f, B:60:0x0278, B:64:0x027f, B:66:0x03b5, B:68:0x03b9, B:69:0x03f6, B:74:0x0403, B:75:0x041a, B:79:0x0421, B:83:0x0452, B:85:0x051a, B:87:0x0520, B:89:0x0526, B:91:0x0532, B:92:0x0535, B:94:0x0547, B:96:0x054d, B:98:0x0550, B:104:0x045a, B:105:0x045b, B:107:0x045f, B:114:0x046f, B:116:0x0473, B:118:0x047a, B:119:0x04d2, B:123:0x04d9, B:127:0x0518, B:132:0x029b, B:133:0x029c, B:135:0x02a2, B:137:0x02a9, B:138:0x02e2, B:140:0x02f0, B:141:0x0301, B:142:0x0327, B:150:0x0332, B:152:0x02cb, B:156:0x0342, B:158:0x0362, B:160:0x038a, B:163:0x0399, B:164:0x03a8, B:165:0x0221, B:166:0x0218, B:168:0x019e, B:170:0x01a6, B:171:0x01a9, B:173:0x01af, B:175:0x01b5, B:177:0x01bb, B:179:0x01c1, B:181:0x01c7, B:183:0x01cd, B:185:0x01d3, B:187:0x01d9, B:189:0x01df, B:191:0x01e5, B:192:0x01e9, B:194:0x01ef, B:200:0x010b, B:202:0x0113, B:204:0x011d, B:205:0x0561, B:207:0x00f5, B:210:0x00a9, B:214:0x056f, B:144:0x0328, B:145:0x032d, B:77:0x041b, B:78:0x0420, B:121:0x04d3, B:122:0x04d8, B:71:0x03f7, B:72:0x0400, B:62:0x0279, B:63:0x027e), top: B:2:0x000f, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0520 A[Catch: all -> 0x057d, TryCatch #5 {all -> 0x057d, blocks: (B:3:0x000f, B:5:0x001c, B:7:0x0024, B:10:0x002e, B:12:0x003a, B:15:0x0046, B:17:0x004f, B:18:0x0065, B:20:0x006e, B:21:0x0084, B:23:0x0096, B:24:0x009d, B:27:0x00b1, B:29:0x00cb, B:31:0x00f0, B:33:0x0104, B:35:0x0124, B:37:0x012a, B:39:0x0158, B:41:0x0166, B:43:0x016e, B:45:0x0195, B:47:0x019b, B:49:0x01f4, B:51:0x01ff, B:52:0x0206, B:57:0x0225, B:59:0x024f, B:60:0x0278, B:64:0x027f, B:66:0x03b5, B:68:0x03b9, B:69:0x03f6, B:74:0x0403, B:75:0x041a, B:79:0x0421, B:83:0x0452, B:85:0x051a, B:87:0x0520, B:89:0x0526, B:91:0x0532, B:92:0x0535, B:94:0x0547, B:96:0x054d, B:98:0x0550, B:104:0x045a, B:105:0x045b, B:107:0x045f, B:114:0x046f, B:116:0x0473, B:118:0x047a, B:119:0x04d2, B:123:0x04d9, B:127:0x0518, B:132:0x029b, B:133:0x029c, B:135:0x02a2, B:137:0x02a9, B:138:0x02e2, B:140:0x02f0, B:141:0x0301, B:142:0x0327, B:150:0x0332, B:152:0x02cb, B:156:0x0342, B:158:0x0362, B:160:0x038a, B:163:0x0399, B:164:0x03a8, B:165:0x0221, B:166:0x0218, B:168:0x019e, B:170:0x01a6, B:171:0x01a9, B:173:0x01af, B:175:0x01b5, B:177:0x01bb, B:179:0x01c1, B:181:0x01c7, B:183:0x01cd, B:185:0x01d3, B:187:0x01d9, B:189:0x01df, B:191:0x01e5, B:192:0x01e9, B:194:0x01ef, B:200:0x010b, B:202:0x0113, B:204:0x011d, B:205:0x0561, B:207:0x00f5, B:210:0x00a9, B:214:0x056f, B:144:0x0328, B:145:0x032d, B:77:0x041b, B:78:0x0420, B:121:0x04d3, B:122:0x04d8, B:71:0x03f7, B:72:0x0400, B:62:0x0279, B:63:0x027e), top: B:2:0x000f, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0532 A[Catch: all -> 0x057d, TryCatch #5 {all -> 0x057d, blocks: (B:3:0x000f, B:5:0x001c, B:7:0x0024, B:10:0x002e, B:12:0x003a, B:15:0x0046, B:17:0x004f, B:18:0x0065, B:20:0x006e, B:21:0x0084, B:23:0x0096, B:24:0x009d, B:27:0x00b1, B:29:0x00cb, B:31:0x00f0, B:33:0x0104, B:35:0x0124, B:37:0x012a, B:39:0x0158, B:41:0x0166, B:43:0x016e, B:45:0x0195, B:47:0x019b, B:49:0x01f4, B:51:0x01ff, B:52:0x0206, B:57:0x0225, B:59:0x024f, B:60:0x0278, B:64:0x027f, B:66:0x03b5, B:68:0x03b9, B:69:0x03f6, B:74:0x0403, B:75:0x041a, B:79:0x0421, B:83:0x0452, B:85:0x051a, B:87:0x0520, B:89:0x0526, B:91:0x0532, B:92:0x0535, B:94:0x0547, B:96:0x054d, B:98:0x0550, B:104:0x045a, B:105:0x045b, B:107:0x045f, B:114:0x046f, B:116:0x0473, B:118:0x047a, B:119:0x04d2, B:123:0x04d9, B:127:0x0518, B:132:0x029b, B:133:0x029c, B:135:0x02a2, B:137:0x02a9, B:138:0x02e2, B:140:0x02f0, B:141:0x0301, B:142:0x0327, B:150:0x0332, B:152:0x02cb, B:156:0x0342, B:158:0x0362, B:160:0x038a, B:163:0x0399, B:164:0x03a8, B:165:0x0221, B:166:0x0218, B:168:0x019e, B:170:0x01a6, B:171:0x01a9, B:173:0x01af, B:175:0x01b5, B:177:0x01bb, B:179:0x01c1, B:181:0x01c7, B:183:0x01cd, B:185:0x01d3, B:187:0x01d9, B:189:0x01df, B:191:0x01e5, B:192:0x01e9, B:194:0x01ef, B:200:0x010b, B:202:0x0113, B:204:0x011d, B:205:0x0561, B:207:0x00f5, B:210:0x00a9, B:214:0x056f, B:144:0x0328, B:145:0x032d, B:77:0x041b, B:78:0x0420, B:121:0x04d3, B:122:0x04d8, B:71:0x03f7, B:72:0x0400, B:62:0x0279, B:63:0x027e), top: B:2:0x000f, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0547 A[Catch: all -> 0x057d, TryCatch #5 {all -> 0x057d, blocks: (B:3:0x000f, B:5:0x001c, B:7:0x0024, B:10:0x002e, B:12:0x003a, B:15:0x0046, B:17:0x004f, B:18:0x0065, B:20:0x006e, B:21:0x0084, B:23:0x0096, B:24:0x009d, B:27:0x00b1, B:29:0x00cb, B:31:0x00f0, B:33:0x0104, B:35:0x0124, B:37:0x012a, B:39:0x0158, B:41:0x0166, B:43:0x016e, B:45:0x0195, B:47:0x019b, B:49:0x01f4, B:51:0x01ff, B:52:0x0206, B:57:0x0225, B:59:0x024f, B:60:0x0278, B:64:0x027f, B:66:0x03b5, B:68:0x03b9, B:69:0x03f6, B:74:0x0403, B:75:0x041a, B:79:0x0421, B:83:0x0452, B:85:0x051a, B:87:0x0520, B:89:0x0526, B:91:0x0532, B:92:0x0535, B:94:0x0547, B:96:0x054d, B:98:0x0550, B:104:0x045a, B:105:0x045b, B:107:0x045f, B:114:0x046f, B:116:0x0473, B:118:0x047a, B:119:0x04d2, B:123:0x04d9, B:127:0x0518, B:132:0x029b, B:133:0x029c, B:135:0x02a2, B:137:0x02a9, B:138:0x02e2, B:140:0x02f0, B:141:0x0301, B:142:0x0327, B:150:0x0332, B:152:0x02cb, B:156:0x0342, B:158:0x0362, B:160:0x038a, B:163:0x0399, B:164:0x03a8, B:165:0x0221, B:166:0x0218, B:168:0x019e, B:170:0x01a6, B:171:0x01a9, B:173:0x01af, B:175:0x01b5, B:177:0x01bb, B:179:0x01c1, B:181:0x01c7, B:183:0x01cd, B:185:0x01d3, B:187:0x01d9, B:189:0x01df, B:191:0x01e5, B:192:0x01e9, B:194:0x01ef, B:200:0x010b, B:202:0x0113, B:204:0x011d, B:205:0x0561, B:207:0x00f5, B:210:0x00a9, B:214:0x056f, B:144:0x0328, B:145:0x032d, B:77:0x041b, B:78:0x0420, B:121:0x04d3, B:122:0x04d8, B:71:0x03f7, B:72:0x0400, B:62:0x0279, B:63:0x027e), top: B:2:0x000f, inners: #0, #1, #2, #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map, c.a aVar) {
        JSONObject jSONObject;
        String str3;
        String str4;
        JSONObject jSONObject2;
        JSONArray jSONArray;
        String str5;
        BrandSafetyUtils.AdType adType;
        JSONArray jSONArray2;
        String str6;
        String str7;
        JSONObject jSONObject3;
        int i2;
        String str8;
        String str9;
        int i3;
        List<CreativeInfo> a;
        JSONObject jSONObject4;
        String str10;
        String optString;
        BrandSafetyUtils.AdType adType2;
        ArrayList arrayList = new ArrayList();
        char c2 = 2;
        char c3 = 0;
        char c4 = 1;
        try {
            jSONObject = new JSONObject(str2);
        } catch (Throwable th) {
            Logger.e(d, "error: ", th.getMessage(), th);
        }
        if (jSONObject.has(ab) && (jSONObject.has(i) || jSONObject.has("ads"))) {
            if (jSONObject.getJSONArray(i).length() == 0) {
                Logger.d(d, "generate info - ad sets array is empty, skipping");
                return arrayList;
            }
            if (!jSONObject.has(ab)) {
                str3 = null;
            } else {
                String string = jSONObject.getString(ab);
                Logger.d(d, "generate info - request id: ", string);
                str3 = string;
            }
            if (!jSONObject.has("placementId")) {
                str4 = null;
            } else {
                String string2 = jSONObject.getString("placementId");
                Logger.d(d, "generate info - placement id: ", string2);
                str4 = string2;
            }
            Object[] objArr = new Object[8];
            objArr[0] = "generate info - url: ";
            objArr[1] = str;
            objArr[2] = " , Headers: ";
            objArr[3] = map != null ? map.toString() : POBCommonConstants.NULL_VALUE;
            int i4 = 4;
            objArr[4] = ", buffer size: ";
            objArr[5] = str2 == null ? "0" : Integer.valueOf(str2.length());
            objArr[6] = " , buffer: ";
            objArr[7] = str2;
            Logger.printFullVerboseLog(d, objArr);
            if (!jSONObject.has(i)) {
                jSONObject2 = null;
            } else {
                JSONArray jSONArray3 = jSONObject.getJSONArray(i);
                Logger.d(d, "generate info - ad sets : ", Integer.valueOf(jSONArray3.length()), " items");
                if (jSONArray3.length() > 0) {
                    jSONObject2 = jSONArray3.getJSONObject(0);
                } else {
                    Logger.d(d, "generate info - ad sets element has no items");
                    return arrayList;
                }
            }
            if (jSONObject2 != null) {
                jSONArray = jSONObject2.getJSONArray("ads");
            } else if (jSONObject.has("ads") && (jSONObject.get("ads") instanceof JSONArray)) {
                jSONArray = jSONObject.getJSONArray("ads");
            } else {
                Logger.d(d, "generate info - ads element has no items or is not an array");
                return arrayList;
            }
            int i5 = 0;
            while (i5 < jSONArray.length()) {
                JSONObject jSONObject5 = jSONArray.getJSONObject(i5);
                String string3 = jSONObject5.getString("creativeId");
                String string4 = jSONObject5.getString(k);
                Object[] objArr2 = new Object[i4];
                objArr2[c3] = "generate info - impression id: ";
                objArr2[c4] = string4;
                objArr2[c2] = ", creative id: ";
                objArr2[3] = string3;
                Logger.d(d, objArr2);
                JSONObject optJSONObject = jSONObject5.optJSONObject(b);
                if (optJSONObject == null) {
                    str5 = null;
                } else {
                    str5 = optJSONObject.optString(c);
                }
                if (str3 != null && aU.containsKey(str4)) {
                    String str11 = aU.get(str4);
                    Object[] objArr3 = new Object[i4];
                    objArr3[c3] = "generate info - placement id to ad type list contains ad type ";
                    objArr3[c4] = str11;
                    objArr3[2] = " for placement id ";
                    objArr3[3] = str4;
                    Logger.d(d, objArr3);
                    if (str11.equals("banner")) {
                        adType2 = c(jSONObject5);
                        if (adType2 == null) {
                            adType2 = BrandSafetyUtils.AdType.BANNER;
                        }
                    } else if (str11.equals(ae)) {
                        adType2 = BrandSafetyUtils.AdType.MREC;
                    } else {
                        adType2 = BrandSafetyUtils.AdType.INTERSTITIAL;
                    }
                    adType = adType2;
                } else if (aVar != null && (aVar.b == BrandSafetyEvent.AdFormatType.BANNER || aVar.b == BrandSafetyEvent.AdFormatType.LEADER)) {
                    adType = BrandSafetyUtils.AdType.BANNER;
                } else if (aVar != null && aVar.b == BrandSafetyEvent.AdFormatType.MREC) {
                    adType = BrandSafetyUtils.AdType.MREC;
                } else if (aVar != null && aVar.b == BrandSafetyEvent.AdFormatType.NATIVE) {
                    adType = BrandSafetyUtils.AdType.NATIVE;
                } else if (aVar != null && (aVar.b == BrandSafetyEvent.AdFormatType.INTER || aVar.b == BrandSafetyEvent.AdFormatType.REWARD)) {
                    adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                } else {
                    BrandSafetyUtils.AdType c5 = c(jSONObject5);
                    if (c5 != null) {
                        adType = c5;
                    } else {
                        adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                    }
                }
                Object[] objArr4 = new Object[2];
                objArr4[c3] = "generate info - ad type: ";
                objArr4[c4] = adType != null ? adType.name() : POBCommonConstants.NULL_VALUE;
                Logger.d(d, objArr4);
                InMobiCreativeInfo inMobiCreativeInfo = new InMobiCreativeInfo(string4, string3, str4, this.I, adType, jSONArray.length(), aVar == null ? null : aVar.b, aVar == null ? null : aVar.a, str5);
                boolean a2 = a(jSONObject5);
                String string5 = jSONObject5.getString(m);
                String C = C(string5);
                ArrayList arrayList2 = new ArrayList();
                if (com.safedk.android.utils.n.a((Object) string5)) {
                    inMobiCreativeInfo.u("pubContentUrl=" + string5);
                    jSONArray2 = jSONArray;
                    Logger.d(d, "generate info - adding pubContent URL to follow: ", string5);
                    synchronized (aP) {
                        aP.put(string5, inMobiCreativeInfo);
                    }
                    aW.put(string5, inMobiCreativeInfo.L());
                    arrayList2.add(inMobiCreativeInfo);
                    str6 = string4;
                    jSONObject3 = jSONObject5;
                    i2 = i5;
                    str8 = str4;
                    a = arrayList2;
                    str9 = str3;
                    i3 = 8;
                    str7 = string3;
                    if (adType != BrandSafetyUtils.AdType.INTERSTITIAL) {
                        String a3 = BrandSafetyUtils.a(string5.replace("\\/", "/").getBytes());
                        Logger.d(d, "generate info - added interstitial CI. # of cis is ", Integer.valueOf(aT.size()), ", content hash: ", a3);
                        aT.put(a3, inMobiCreativeInfo.L());
                        synchronized (aQ) {
                            aQ.put(inMobiCreativeInfo.L(), inMobiCreativeInfo);
                        }
                        if (aVar == null) {
                            Logger.d(d, "generate info - adding interstitial ci with creative id as key (", str7, ")");
                            synchronized (aQ) {
                                aQ.put(str7, inMobiCreativeInfo);
                            }
                            Object[] objArr5 = new Object[i3];
                            objArr5[0] = "generate info - added interstitial CI. # of cis is ";
                            objArr5[1] = Integer.valueOf(aQ.size());
                            objArr5[2] = ", impression id: ";
                            objArr5[3] = str6;
                            objArr5[4] = ", creative id: ";
                            objArr5[5] = str7;
                            objArr5[6] = ", CI: ";
                            objArr5[7] = inMobiCreativeInfo;
                            Logger.printFullVerboseLog(d, objArr5);
                        }
                        str10 = str8;
                        if (inMobiCreativeInfo.p() == null && inMobiCreativeInfo.H() == null) {
                            optString = jSONObject3.optString(l);
                            if (!TextUtils.isEmpty(optString)) {
                                inMobiCreativeInfo.q(optString);
                            }
                        }
                        Logger.d(d, "recent creative IDs array item added. Key = ", str7);
                        if (a == null && a.size() > 0) {
                            arrayList.addAll(a);
                        }
                        i5 = i2 + 1;
                        jSONArray = jSONArray2;
                        str4 = str10;
                        str3 = str9;
                        c2 = 2;
                        c3 = 0;
                        c4 = 1;
                        i4 = 4;
                    } else {
                        if (adType != BrandSafetyUtils.AdType.BANNER && adType != BrandSafetyUtils.AdType.MREC) {
                            str10 = str8;
                            if (inMobiCreativeInfo.p() == null) {
                                optString = jSONObject3.optString(l);
                                if (!TextUtils.isEmpty(optString)) {
                                }
                            }
                            Logger.d(d, "recent creative IDs array item added. Key = ", str7);
                            if (a == null) {
                                arrayList.addAll(a);
                            }
                            i5 = i2 + 1;
                            jSONArray = jSONArray2;
                            str4 = str10;
                            str3 = str9;
                            c2 = 2;
                            c3 = 0;
                            c4 = 1;
                            i4 = 4;
                        }
                        str10 = str8;
                        if (str10 != null && aVar != null && aVar.a != null && inMobiCreativeInfo.at() == 1) {
                            String replaceAll = string5.replaceAll("\\s+|\\\\n", "");
                            Logger.d(d, "adding ci with pubContent key: ", replaceAll);
                            aW.put(replaceAll, inMobiCreativeInfo.L());
                            String str12 = str10 + "_" + aVar.a + "_" + com.safedk.android.utils.h.i;
                            Logger.d(d, "adding banner ci with complex key (", str12, ")");
                            synchronized (aR) {
                                aR.put(str12, inMobiCreativeInfo);
                            }
                            Object[] objArr6 = new Object[10];
                            objArr6[0] = "added banner CI. # of cis is ";
                            objArr6[1] = Integer.valueOf(aR.size());
                            objArr6[2] = ", impression id: ";
                            objArr6[3] = str6;
                            objArr6[4] = ", adType = ";
                            objArr6[5] = adType;
                            objArr6[6] = ", complex key: ";
                            objArr6[7] = str12;
                            objArr6[i3] = ", CI: ";
                            objArr6[9] = inMobiCreativeInfo.aa();
                            Logger.printFullVerboseLog(d, objArr6);
                        }
                        if (inMobiCreativeInfo.p() == null) {
                        }
                        Logger.d(d, "recent creative IDs array item added. Key = ", str7);
                        if (a == null) {
                        }
                        i5 = i2 + 1;
                        jSONArray = jSONArray2;
                        str4 = str10;
                        str3 = str9;
                        c2 = 2;
                        c3 = 0;
                        c4 = 1;
                        i4 = 4;
                    }
                } else {
                    jSONArray2 = jSONArray;
                    if (adType == BrandSafetyUtils.AdType.NATIVE) {
                        String a4 = a(inMobiCreativeInfo, jSONObject5, true);
                        if (C != null) {
                            i2 = i5;
                            str9 = str3;
                            i3 = 8;
                            str7 = string3;
                            str8 = str4;
                            a = a(str, C, inMobiCreativeInfo, a4, true);
                            str6 = string4;
                            jSONObject4 = jSONObject5;
                        } else {
                            str6 = string4;
                            i2 = i5;
                            str8 = str4;
                            a = arrayList2;
                            str9 = str3;
                            i3 = 8;
                            str7 = string3;
                            jSONObject4 = jSONObject5;
                            inMobiCreativeInfo.a(b(jSONObject4), true);
                        }
                        a(inMobiCreativeInfo, jSONObject4);
                        String a5 = a(new JSONObject(string5), (CreativeInfo) inMobiCreativeInfo);
                        if (a5 == null) {
                            jSONObject3 = jSONObject4;
                        } else {
                            jSONObject3 = jSONObject4;
                            a = a(str, a5, inMobiCreativeInfo, a4, true);
                        }
                        String str13 = str7 + "_" + str6;
                        Logger.d(d, "generate info - adding native ci with creative id as key: ", str13);
                        synchronized (aQ) {
                            aQ.put(str13, inMobiCreativeInfo);
                        }
                    } else {
                        str6 = string4;
                        str7 = string3;
                        jSONObject3 = jSONObject5;
                        i2 = i5;
                        str8 = str4;
                        str9 = str3;
                        i3 = 8;
                        if (a2 && C != null) {
                            Logger.printFullVerboseLog(d, "generate info - found native vast inside pubContent");
                            a = a(str, C, inMobiCreativeInfo, a(inMobiCreativeInfo, jSONObject3, false), true);
                        } else if (a2) {
                            String a6 = a(inMobiCreativeInfo, jSONObject3, false);
                            a = a(str, string5, inMobiCreativeInfo, a6, true);
                            inMobiCreativeInfo.a(b(jSONObject3), true);
                            a(inMobiCreativeInfo, jSONObject3);
                            String a7 = a(new JSONObject(string5), (CreativeInfo) inMobiCreativeInfo);
                            if (a7 != null) {
                                a = a(str, a7, inMobiCreativeInfo, a6, false);
                            }
                        } else {
                            a = C != null ? a(str, C, inMobiCreativeInfo, "", true) : a(str, string5, inMobiCreativeInfo, "", true);
                        }
                    }
                    if (adType != BrandSafetyUtils.AdType.INTERSTITIAL) {
                    }
                }
            }
            return arrayList;
        }
        Logger.d(d, "generate info - not a JSON prefetch");
        return arrayList;
    }

    private static String a(JSONObject jSONObject, CreativeInfo creativeInfo) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3 = jSONObject.optJSONObject(n);
        JSONObject optJSONObject4 = jSONObject.optJSONObject(o);
        String str6 = null;
        if (optJSONObject3 == null) {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
        } else {
            str2 = optJSONObject3.optString("title");
            JSONObject optJSONObject5 = optJSONObject3.optJSONObject(as);
            str3 = optJSONObject5 != null ? optJSONObject5.optString("url") : null;
            str4 = optJSONObject3.optJSONObject("icon") != null ? optJSONObject3.optString("url") : null;
            str5 = optJSONObject3.optString("description");
            str = optJSONObject3.optString("cta");
        }
        if (optJSONObject4 != null) {
            if (TextUtils.isEmpty(str2)) {
                str2 = optJSONObject4.optString("title");
            }
            if (TextUtils.isEmpty(str4)) {
                str4 = optJSONObject4.optString("iconUrl");
            }
            if (TextUtils.isEmpty(str5)) {
                str5 = optJSONObject4.optString("description");
            }
            if (TextUtils.isEmpty(str)) {
                str = optJSONObject4.optString(ay);
            }
        }
        if (jSONObject.has(q) && (optJSONObject = jSONObject.optJSONObject(q)) != null) {
            JSONObject optJSONObject6 = optJSONObject.optJSONObject("title");
            if (optJSONObject6 != null) {
                str2 = optJSONObject6.optString("text");
            }
            JSONObject optJSONObject7 = optJSONObject.optJSONObject("description");
            if (optJSONObject7 != null) {
                str5 = optJSONObject7.optString("text");
            }
            JSONObject optJSONObject8 = optJSONObject.optJSONObject("cta");
            if (optJSONObject8 != null) {
                str = optJSONObject8.optString("text");
            }
            JSONObject optJSONObject9 = optJSONObject.optJSONObject("icon");
            if (optJSONObject9 != null) {
                str4 = optJSONObject9.optString("url");
            }
            JSONObject optJSONObject10 = optJSONObject.optJSONObject("media");
            if (optJSONObject10 != null) {
                if ("video".equals(optJSONObject10.optString("type"))) {
                    JSONObject optJSONObject11 = optJSONObject10.optJSONObject("video");
                    if (optJSONObject11 != null) {
                        str6 = optJSONObject11.optString(aL);
                    }
                } else {
                    JSONObject optJSONObject12 = optJSONObject10.optJSONObject("image");
                    if (optJSONObject12 != null && (optJSONArray = optJSONObject12.optJSONArray("assets")) != null && optJSONArray.length() > 0 && (optJSONObject2 = optJSONArray.optJSONObject(0)) != null) {
                        str3 = optJSONObject2.optString("url");
                    }
                }
            }
        }
        if (creativeInfo.K() == BrandSafetyUtils.AdType.NATIVE) {
            if (!TextUtils.isEmpty(str2)) {
                creativeInfo.A(CreativeInfo.aK + str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                creativeInfo.A(CreativeInfo.aL + str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                creativeInfo.A(CreativeInfo.aM + str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                creativeInfo.A(CreativeInfo.aN + str5);
            }
            if (!TextUtils.isEmpty(str)) {
                creativeInfo.A(CreativeInfo.aO + str);
            }
        } else {
            if (!TextUtils.isEmpty(str2)) {
                creativeInfo.z(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                creativeInfo.y(str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                creativeInfo.y(str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                creativeInfo.z(str5);
            }
            if (!TextUtils.isEmpty(str)) {
                creativeInfo.z(str);
            }
        }
        return str6;
    }

    private String C(String str) {
        try {
        } catch (JSONException e2) {
            Logger.d(d, "check vast format prefetch - exception occurred: ", e2.getMessage());
        }
        if (!com.safedk.android.utils.n.n(str)) {
            Logger.d(d, "check vast format prefetch - pubContent is not a JSON");
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        if (!jSONObject.has(e)) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(e);
        if (!jSONObject2.has(f)) {
            return null;
        }
        JSONArray jSONArray = jSONObject2.getJSONArray(f);
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
            if (jSONObject3.has(f)) {
                JSONArray jSONArray2 = jSONObject3.getJSONArray(f);
                for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                    if ((jSONArray2.get(i3) instanceof String) && com.safedk.android.analytics.brandsafety.creatives.h.b(jSONArray2.getString(i3))) {
                        Logger.d(d, "check vast format prefetch - found vast value inside");
                        return jSONArray2.getString(i3);
                    }
                }
            }
        }
        return null;
    }

    private void a(List<String> list, JSONArray jSONArray, boolean z) {
        if (jSONArray == null) {
            return;
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            if (z) {
                try {
                    list.add(jSONArray.getJSONObject(i2).optString("url"));
                } catch (JSONException e2) {
                }
            } else {
                list.add(jSONArray.getString(i2));
            }
        }
    }

    private void a(InMobiCreativeInfo inMobiCreativeInfo, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONObject optJSONObject = jSONObject.optJSONObject(m);
        if (optJSONObject != null) {
            a((List<String>) arrayList, optJSONObject.optJSONArray("trackers"), true);
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(n);
            if (optJSONObject2 != null) {
                a((List<String>) arrayList, optJSONObject2.optJSONArray(aB), false);
            }
            JSONObject optJSONObject3 = optJSONObject.optJSONObject(e);
            if (optJSONObject3 != null) {
                a((List<String>) arrayList, optJSONObject3.optJSONArray("trackers"), true);
                JSONObject optJSONObject4 = optJSONObject3.optJSONObject(f);
                if (optJSONObject4 != null) {
                    a((List<String>) arrayList, optJSONObject4.optJSONArray("trackers"), true);
                }
            }
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(p);
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                try {
                    JSONArray optJSONArray2 = optJSONArray.getJSONObject(i2).optJSONArray("trackers");
                    if (optJSONArray2 != null) {
                        for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                            a((List<String>) arrayList, optJSONArray2.getJSONObject(i3).optJSONArray("url"), false);
                        }
                    }
                } catch (JSONException e2) {
                }
            }
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            inMobiCreativeInfo.w(it.next());
        }
    }

    private String a(InMobiCreativeInfo inMobiCreativeInfo, JSONObject jSONObject, boolean z) {
        String str = z ? "" : CreativeInfo.aF;
        try {
            String str2 = str + "/" + jSONObject.getString(Z);
            if (!jSONObject.has(al)) {
                Logger.d(d, "set downstreamStruct failed because there is no metaInfo in ad object");
                return str2;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(al);
            if (!jSONObject2.has("creativeType")) {
                Logger.d(d, "set downstreamStruct failed because there is no creativeType in metaInfo");
                return str2;
            }
            String str3 = str2 + "/" + jSONObject2.getString("creativeType");
            inMobiCreativeInfo.e(str3);
            return str3;
        } catch (JSONException e2) {
            Logger.d(d, "set downstreamStruct - failed because of jsonException ", e2.getMessage());
            return str;
        }
    }

    private boolean a(JSONObject jSONObject) {
        try {
            boolean z = jSONObject.has(Z) && jSONObject.getString(Z).equals(aa);
            boolean z2 = jSONObject.has(m) && com.safedk.android.utils.n.n(jSONObject.getString(m));
            boolean z3 = z2 && jSONObject.getJSONObject(m).has(o) && jSONObject.getJSONObject(m).getJSONObject(o).length() > 0;
            boolean z4 = z2 && jSONObject.getJSONObject(m).has(q) && jSONObject.getJSONObject(m).getJSONObject(q).length() > 0;
            if (z && z2 && (z3 || z4)) {
                Logger.d(d, "is native ad - adObj is indeed an inmobi native ad");
                return true;
            }
        } catch (JSONException e2) {
            Logger.d(d, "not a native ad");
        }
        return false;
    }

    private String b(JSONObject jSONObject) {
        if (jSONObject.has(m)) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject(m);
                if (jSONObject2.has(n)) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(n);
                    if (jSONObject3.has(V)) {
                        String string = jSONObject3.getString(V);
                        Logger.d(d, "get native ad click url from ", V, ": ", string);
                        return string;
                    }
                }
                if (jSONObject2.has(o)) {
                    JSONObject jSONObject4 = jSONObject2.getJSONObject(o);
                    if (jSONObject4.has(W)) {
                        String string2 = jSONObject4.getString(W);
                        Logger.d(d, "get native ad click url from ", W, ": ", string2);
                        return string2;
                    }
                }
                if (jSONObject2.has(X)) {
                    JSONObject jSONObject5 = jSONObject2.getJSONObject(X);
                    if (jSONObject5.has("url")) {
                        String string3 = jSONObject5.getString("url");
                        Logger.d(d, "get native ad click url from ", X, ": ", string3);
                        return string3;
                    }
                }
                if (jSONObject2.has(Y)) {
                    JSONObject jSONObject6 = jSONObject2.getJSONObject(Y);
                    if (jSONObject6.has(aM)) {
                        String string4 = jSONObject6.getString(aM);
                        Logger.d(d, "get native ad click url from ", Y, ": ", string4);
                        return string4;
                    }
                    return null;
                }
                return null;
            } catch (JSONException e2) {
                Logger.d(d, "get native ad click url, not a native ad (", e2.getMessage(), ")");
                return null;
            }
        }
        Logger.d(d, "get native ad click url did not find pub_content");
        return null;
    }

    private BrandSafetyUtils.AdType c(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has(al) && jSONObject.getJSONObject(al).has(am)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(al).getJSONObject(am);
            if (jSONObject2.has(an)) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(an);
                if (jSONObject3.has(ao)) {
                    String string = jSONObject3.getString(ao);
                    Logger.d(d, "generate info - placementDimension = ", string);
                    if (string.contains("X")) {
                        String[] split = string.split("X");
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt != 0 && parseInt2 != 0 && com.safedk.android.utils.n.a(parseInt, parseInt2)) {
                            BrandSafetyUtils.AdType adType = BrandSafetyUtils.AdType.BANNER;
                            Logger.d(d, "generate info - adtype set to BANNER : placementDimension is ", string);
                            return adType;
                        }
                        if (parseInt != 0 && parseInt2 != 0 && com.safedk.android.utils.n.b(parseInt, parseInt2)) {
                            BrandSafetyUtils.AdType adType2 = BrandSafetyUtils.AdType.MREC;
                            Logger.d(d, "generate info - adtype set to MREC : placementDimension is ", string);
                            return adType2;
                        }
                    }
                }
            }
        }
        return null;
    }

    private List<CreativeInfo> a(String str, String str2, InMobiCreativeInfo inMobiCreativeInfo, String str3, boolean z) {
        String G;
        String F;
        ArrayList arrayList = new ArrayList();
        if (str2 == null) {
            arrayList.add(inMobiCreativeInfo);
            return arrayList;
        }
        BrandSafetyUtils.AdType K = inMobiCreativeInfo.K();
        ArrayList<h.a> arrayList2 = null;
        String g2 = com.safedk.android.utils.k.g(str2);
        if (com.safedk.android.analytics.brandsafety.creatives.h.b(g2)) {
            arrayList2 = com.safedk.android.analytics.brandsafety.creatives.h.a(g2, true, com.safedk.android.utils.h.i, z);
            Object[] objArr = new Object[2];
            objArr[0] = "vast ad infos: ";
            objArr[1] = arrayList2 != null ? arrayList2.toString() : POBCommonConstants.NULL_VALUE;
            Logger.printFullVerboseLog(d, objArr);
        }
        if (arrayList2 != null && arrayList2.size() > 0 && !str3.startsWith("vast")) {
            str3 = TextUtils.isEmpty(str3) ? "vast" : "vast/" + str3;
        }
        Logger.d(d, "is prefetch multi ad? ", Boolean.valueOf(inMobiCreativeInfo.at() > 1 || Q(g2)));
        if (arrayList2 == null || arrayList2.size() == 0) {
            Logger.d(d, "no vast info detected in prefetch");
            if (TextUtils.isEmpty(str3)) {
                str3 = "mraid";
                if (inMobiCreativeInfo.at() > 1) {
                    str3 = "mraid" + CreativeInfo.aG + inMobiCreativeInfo.at();
                }
            }
            if (inMobiCreativeInfo.M() == null && (F = F(g2)) != null) {
                inMobiCreativeInfo.a(F, true);
            }
            if (inMobiCreativeInfo.p() == null && (G = G(g2)) != null) {
                inMobiCreativeInfo.q(G);
            }
            arrayList.add(inMobiCreativeInfo);
        } else if (arrayList2.size() == 1) {
            Logger.d(d, "prefetch has vast info");
            a(inMobiCreativeInfo, arrayList2.get(0), str);
            if (inMobiCreativeInfo.at() > 1) {
                str3 = str3 + CreativeInfo.aG + inMobiCreativeInfo.at();
            }
            Logger.d(d, "downstream struct set to ", str3);
            inMobiCreativeInfo.b(true);
            arrayList.add(inMobiCreativeInfo);
        } else {
            Logger.d(d, "prefetch has multiple vast infos");
            Iterator<h.a> it = arrayList2.iterator();
            while (it.hasNext()) {
                h.a next = it.next();
                InMobiCreativeInfo au2 = inMobiCreativeInfo.au();
                au2.ao();
                a(au2, next, str);
                inMobiCreativeInfo.b(true);
                arrayList.add(au2);
            }
        }
        if (str3.endsWith("/")) {
            str3 = str3.substring(0, str3.length() - 1);
        }
        Logger.d(d, "downstream struct set to ", str3);
        if (inMobiCreativeInfo.h() == null || str3.contains(inMobiCreativeInfo.h())) {
            inMobiCreativeInfo.e(str3);
        }
        ArrayList<String> f2 = com.safedk.android.utils.n.f(g2);
        try {
            f2.addAll(com.safedk.android.utils.n.f(str2));
        } catch (Exception e2) {
            Logger.d(d, "handlePubContent - could not extract urls from encoded pubContent: ", e2);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((CreativeInfo) it2.next()).b((List<String>) f2);
        }
        if (inMobiCreativeInfo.K() != BrandSafetyUtils.AdType.NATIVE && f2.size() > 0) {
            for (String str4 : f2) {
                if (str4.contains(ac)) {
                    Logger.d(d, "adding ", K.name().toLowerCase(), " ci with url as key (", str4, ")");
                    synchronized (aS) {
                        aS.put(str4, inMobiCreativeInfo);
                    }
                }
            }
        }
        return arrayList;
    }

    private static List<String> d(CreativeInfo creativeInfo, String str) {
        Logger.d(d, "extracting urls");
        new ArrayList();
        ArrayList<String> f2 = com.safedk.android.utils.n.f(str);
        Logger.d(d, "prefetch resources list after impression beacons urls removal : ", f2);
        creativeInfo.b((List<String>) f2);
        return f2;
    }

    private List<CreativeInfo> h(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        try {
            if (!TextUtils.isEmpty(str2)) {
                Logger.d(d, "generate info - InMobi vast proxy prefetch. vast ad tag proxy urls to follow: ", aO.toString());
                CreativeInfo creativeInfo = null;
                if (aO.containsKey(str)) {
                    Logger.d(d, "vasts proxy redirect url found: ", str);
                    creativeInfo = this.F.remove(aO.remove(str));
                }
                String J = J(str);
                Logger.d(d, "decodedUrl : ", J);
                if (creativeInfo == null && aO.containsKey(J)) {
                    Logger.d(d, "vasts proxy redirect url found: ", str);
                    com.safedk.android.analytics.brandsafety.creatives.i remove = aO.remove(J);
                    synchronized (this.F) {
                        creativeInfo = this.F.remove(remove);
                    }
                }
                if (creativeInfo != null) {
                    Logger.printFullVerboseLog(d, "found vast proxy url: ", str, ", ci: ", creativeInfo, ", content: ", str2);
                    a(creativeInfo, str, str2, true);
                    Logger.d(d, "vast processing was done in BaseDiscovery.");
                    arrayList.add(creativeInfo);
                    return arrayList;
                }
            } else {
                Logger.d(d, "generate info - buffer value cannot be empty, skipping.");
            }
        } catch (Throwable th) {
            Logger.e(d, "generate info exception: ", th.getMessage(), th);
        }
        return arrayList;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected void a(String str, com.safedk.android.analytics.brandsafety.creatives.i iVar) {
        if (str != null) {
            String[] split = str.split("://");
            if (split.length == 2) {
                aO.put("http://vastproxy.brand.inmobi.com/g/" + split[1], iVar);
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected synchronized void a(com.safedk.android.analytics.brandsafety.creatives.i iVar) {
        if (iVar != null) {
            Iterator<Map.Entry<String, com.safedk.android.analytics.brandsafety.creatives.i>> it = aO.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, com.safedk.android.analytics.brandsafety.creatives.i> next = it.next();
                if (next.getValue().equals(iVar)) {
                    Logger.d(d, "remove vast ad tag proxy uri from url to follow list: ", next.getValue());
                    it.remove();
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> c() {
        Set<String> c2 = super.c();
        c2.add("$TS");
        return c2;
    }

    private static String D(String str) {
        JSONArray optJSONArray;
        try {
            JSONArray optJSONArray2 = new JSONObject(str).optJSONArray(i);
            if (optJSONArray2 != null && optJSONArray2.length() > 0 && (optJSONArray = optJSONArray2.getJSONObject(0).optJSONArray("ads")) != null && optJSONArray.length() > 0) {
                JSONObject jSONObject = optJSONArray.getJSONObject(0);
                String optString = jSONObject.optString("creativeId");
                String optString2 = jSONObject.optString(k);
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                    String str2 = optString + "_" + optString2;
                    Logger.d(d, "get creative id json - found creative id= ", str2);
                    return str2;
                }
                return null;
            }
            return null;
        } catch (JSONException e2) {
            Logger.d(d, "get creative id json - exception: ", e2);
            return null;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo b(Object obj) {
        try {
            Logger.d(d, "match info ad instance: ", obj);
        } catch (Throwable th) {
            Logger.d(d, "exception in match info ad instance", th);
        }
        if (obj == null) {
            Logger.d(d, "match info ad instance is null");
            return null;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (com.safedk.android.utils.n.n(str)) {
                String D = D(str);
                if (!TextUtils.isEmpty(D)) {
                    Logger.d(d, "match info ad instance - updated ad instance key to= ", D);
                    str = D;
                }
            }
            Logger.printFullVerboseLog(d, "match info ad instance ", str, ", interstitial CIs map keys: ", aQ.keySet());
            if (aQ.containsKey(str)) {
                CreativeInfo creativeInfo = aQ.get(str);
                Logger.d(d, Logger.FeatureTag.CI_MATCHING, "match info ad instance - CI found by key ", str, ", ci = ", creativeInfo);
                return creativeInfo;
            }
            Logger.printFullVerboseLog(d, "match info ad instance ", str, ", banner CIs map keys: ", aR.keySet());
            if (aR.containsKey(str)) {
                CreativeInfo creativeInfo2 = aR.get(str);
                Logger.d(d, Logger.FeatureTag.CI_MATCHING, "match info ad instance - CI found by key: ", str, ", CI: ", creativeInfo2);
                return creativeInfo2;
            }
            Logger.d(d, "match info ad instance - cannot find CI");
        }
        return null;
    }

    private boolean O(String str) {
        return str.contains(ab) && str.contains("placementId") && str.contains(i) && str.contains("creativeId");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public boolean b(String str, Bundle bundle) {
        String z = com.safedk.android.utils.n.z(str);
        boolean containsKey = aP.containsKey(z);
        if (containsKey && bundle != null) {
            bundle.putString(CreativeInfoManager.a, POBCommonConstants.CONTENT_TYPE_HTML);
            bundle.putString(CreativeInfoManager.b, "UTF-8");
        }
        com.safedk.android.analytics.brandsafety.creatives.i iVar = new com.safedk.android.analytics.brandsafety.creatives.i(z);
        boolean z2 = this.F.containsKey(iVar) || com.safedk.android.analytics.brandsafety.creatives.h.p.contains(iVar) || aO.containsKey(z);
        if (z.contains("action=skip-btn-clicked")) {
            Logger.d(d, "video skipped event identified: ", z);
            CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.h.i, "view-click");
        }
        if (!z.contains(af) && !containsKey && !z2) {
            return false;
        }
        Logger.d(d, "should follow input stream returned true for: ", z);
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, WeakReference<WebView> weakReference) {
        String str3;
        CreativeInfo creativeInfo;
        String c2 = com.safedk.android.utils.k.c(str2);
        Logger.d(d, "get ad id from resource started, resource: ", str2, ", resource key: ", c2, ", content size: ", Integer.valueOf(str.length()));
        CreativeInfo creativeInfo2 = aS.get(c2);
        if (creativeInfo2 != null) {
            Logger.printFullVerboseLog(d, "get ad id from resource - CI identified, # of CIs: ", Integer.valueOf(aS.size()), ", CI: ", creativeInfo2);
            return creativeInfo2.L();
        }
        String remove = aW.remove(str2);
        if (remove != null) {
            str3 = "URL";
        } else {
            String replaceAll = str.replaceAll("\\s+|\\\\n", "");
            Logger.d(d, "get ad id from resource started, content: ", replaceAll);
            remove = aW.remove(replaceAll);
            if (remove == null && com.safedk.android.utils.n.a((Reference<?>) weakReference)) {
                aX.put(replaceAll, weakReference);
            }
            str3 = "CONTENT";
        }
        if (remove != null && (creativeInfo = this.J.get(remove)) != null) {
            Logger.d(d, Logger.FeatureTag.CI_MATCHING, "get ad id from resource - match found ad id using pubContent, ad id: ", remove);
            creativeInfo.u("MBPC:" + str3);
            return remove;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean k(String str) {
        if (!str.contains(ac)) {
            return false;
        }
        Logger.d(d, "should ignore redirect url - tracking url detected");
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean B(String str) {
        String c2 = com.safedk.android.utils.k.c(str);
        if (!(str.contains(af) || aS.containsKey(c2))) {
            return false;
        }
        Logger.d(d, "should follow get url key: ", c2);
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    private String P(String str) {
        Map<String, String> a;
        String str2 = null;
        if (str == null || (a = com.safedk.android.utils.k.a(str, false)) == null || a.size() <= 0) {
            return null;
        }
        Iterator<String> it = a.values().iterator();
        while (it.hasNext()) {
            str2 = it.next();
        }
        return str2;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(String str, String str2, String str3, String str4) {
        CreativeInfo creativeInfo;
        if (str4.equals(BrandSafetyEvent.AdFormatType.APPOPEN.name())) {
            Logger.d(d, "ignoring creative info details from Max, adFormat = ", str4, ", creativeId = ", str2, ", placementId = ", str);
            return;
        }
        if (str2 != null && str3 != null) {
            BrandSafetyEvent.AdFormatType adFormatType = null;
            if (str4.equals(BrandSafetyUtils.j)) {
                CreativeInfo creativeInfo2 = aQ.get(str2);
                adFormatType = BrandSafetyEvent.AdFormatType.INTER;
                creativeInfo = creativeInfo2;
            } else if (str4.equals(BrandSafetyUtils.k)) {
                CreativeInfo creativeInfo3 = aQ.get(str2);
                adFormatType = BrandSafetyEvent.AdFormatType.REWARD;
                creativeInfo = creativeInfo3;
            } else if (str4.equals("BANNER") || str4.equals(BrandSafetyUtils.n)) {
                CreativeInfo creativeInfo4 = aR.get(str + "_" + str3 + "_" + com.safedk.android.utils.h.i);
                adFormatType = BrandSafetyEvent.AdFormatType.BANNER;
                creativeInfo = creativeInfo4;
            } else if (!str4.equals(BrandSafetyUtils.o)) {
                creativeInfo = null;
            } else {
                CreativeInfo creativeInfo5 = aR.get(str + "_" + str3 + "_" + com.safedk.android.utils.h.i);
                adFormatType = BrandSafetyEvent.AdFormatType.MREC;
                creativeInfo = creativeInfo5;
            }
            if (adFormatType != null && creativeInfo != null) {
                creativeInfo.a(adFormatType);
                Logger.d(d, "update CI details from Max, creative id: ", str2, ", ID: ", creativeInfo.L(), ", placement id: ", creativeInfo.F(), ", ad format type: ", adFormatType);
            } else {
                Logger.d(d, "failed to update CI details from Max, creative id: ", str2, ", ad format: ", str4, ", ad format type: ", adFormatType, ", CI: ", creativeInfo);
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean g(String str) {
        if (!str.contains(af)) {
            return false;
        }
        Logger.d(d, "should follow output stream returned true for url ", str);
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, byte[] bArr) {
        Logger.d(d, "handle on request sent url: ", str, ", content: ", str2);
        String d2 = com.safedk.android.utils.k.d(str + "?" + str2, ai);
        if (d2 != null) {
            String d3 = com.safedk.android.utils.k.d(str + "?" + str2, aj);
            if (d3 != null) {
                if (d3.equals("banner")) {
                    String d4 = com.safedk.android.utils.k.d(str + "?" + str2, ah);
                    if (d4 != null && d4.contains(VastAttributes.HORIZONTAL_POSITION)) {
                        String[] split = d4.split(VastAttributes.HORIZONTAL_POSITION);
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt != 0 && parseInt2 != 0 && com.safedk.android.utils.n.b(parseInt, parseInt2)) {
                            Logger.d(d, "handle on request sent - adtype is MREC : mkAdSlot is ", d4);
                            d3 = ae;
                        }
                    }
                }
                Logger.d(d, "adding to placement id to ad type list - size: ", Integer.valueOf(aU.size()), ", placement id: ", d2, ", ad type: ", d3);
                aU.put(d2, d3);
                return null;
            }
            return null;
        }
        return null;
    }

    private boolean Q(String str) {
        List<String> a = com.safedk.android.utils.n.a(com.safedk.android.utils.g.a("VAST ", 16), str);
        List<String> a2 = com.safedk.android.utils.n.a(com.safedk.android.utils.g.a("pod.vast", 16), str);
        if ((a != null && a.size() > 1) || (a2 != null && a2.size() > 1)) {
            return true;
        }
        return false;
    }

    private void e(CreativeInfo creativeInfo, String str) {
        List<String> a = com.safedk.android.utils.n.a(com.safedk.android.utils.g.a("........VAST .*?AdSystem", 32), str);
        if (a != null && a.size() > 1) {
            for (String str2 : a) {
                Logger.d(d, "adding vast clause ", str2, " to ci debug info");
                creativeInfo.u(str2);
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<String> e() {
        List<String> e2 = super.e();
        e2.add(aC);
        return e2;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(Bundle bundle) {
        int i2;
        if (bundle != null && (i2 = bundle.getInt(aD)) > 0) {
            String hexString = Integer.toHexString(i2);
            Logger.d(d, "found expanded ad webview address in intent extra: ", hexString);
            return hexString;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void c(View view) {
        a(view, Y);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void d(View view) {
        a(view, "onSource");
    }

    public static void a(View view, String str) {
        com.safedk.android.analytics.brandsafety.a aVar;
        List<CreativeInfo> a;
        Logger.d(d, "redirect potential source: ", view);
        if (com.safedk.android.utils.n.a(view.getWidth(), view.getHeight())) {
            aVar = SafeDK.getInstance().a(BrandSafetyUtils.AdType.BANNER);
        } else if (!com.safedk.android.utils.n.b(view.getWidth(), view.getHeight())) {
            aVar = null;
        } else {
            aVar = SafeDK.getInstance().a(BrandSafetyUtils.AdType.MREC);
        }
        if (aVar != null && (a = aVar.a(com.safedk.android.utils.h.i, BrandSafetyUtils.a(view))) != null) {
            Iterator<CreativeInfo> it = a.iterator();
            while (it.hasNext()) {
                it.next().u("redirectPotentialSource=" + str + ",view=" + view);
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean e(View view) {
        if (!super.e(view) && !view.getClass().getName().startsWith("com.inmobi.media")) {
            return false;
        }
        Logger.d(d, "is ad view: ", view.getClass().getName());
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<String> j() {
        return Arrays.asList(com.safedk.android.utils.h.i);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(BrandSafetyUtils.AdType adType, Object obj, String str) {
        if (obj instanceof JSONObject) {
            String optString = ((JSONObject) obj).optString(m);
            if (!optString.isEmpty()) {
                String a = BrandSafetyUtils.a(optString.replace("\\/", "/").getBytes());
                String remove = aT.remove(a);
                if (remove != null) {
                    Logger.d(d, "extract ad info impl - get interstitial CI. # of cis is ", Integer.valueOf(aT.size()), ", content hash: ", a, ", id: ", remove);
                    return remove;
                }
                Logger.d(d, "extract ad info impl - failed to get interstitial CI. # of cis is ", Integer.valueOf(aT.size()), ", content hash: ", a);
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean n(String str) {
        String str2;
        synchronized (aW) {
            str2 = null;
            for (String str3 : aW.keySet()) {
                String str4 = aW.get(str3);
                if (str4 != null && str4.equals(str) && !com.safedk.android.utils.n.a((Object) str2)) {
                    Logger.d(d, "try reverse matching: found content for ad id: ", str, ", content: ", str3);
                    str2 = str3;
                }
            }
        }
        if (str2 != null) {
            WeakReference<WebView> weakReference = aX.get(str2);
            if (!com.safedk.android.utils.n.a((Reference<?>) weakReference)) {
                Logger.d(d, "try reverse matching: webViewRef is null or points to null - webviewRef: ", weakReference);
                return false;
            }
            List<CreativeInfo> a = a(weakReference.get(), str);
            if (!a.isEmpty()) {
                Logger.d(d, "try reverse matching: found a match using reverse! adId=", str);
                Iterator<CreativeInfo> it = a.iterator();
                while (it.hasNext()) {
                    it.next().u("MBPC:CONTENT");
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void o(String str) {
        String remove = aW.remove(str);
        Logger.d(d, "clean resources started with ad id: ", str, ", and source is: ", remove);
        if (remove != null) {
            aX.remove(remove);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        super.i();
        com.safedk.android.utils.e.a(aQ, "InMobiDiscovery:creativeToIdMap");
        com.safedk.android.utils.e.a(aR, "InMobiDiscovery:bannerCreativeToIdMap");
        com.safedk.android.utils.e.a(aS, "InMobiDiscovery:creativeToUrlMap");
        com.safedk.android.utils.e.a(aP, "InMobiDiscovery:pubContentUrlsToFollow");
    }
}

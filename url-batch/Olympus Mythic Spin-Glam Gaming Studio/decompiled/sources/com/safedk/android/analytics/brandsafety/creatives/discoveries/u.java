package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.YandexCreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class u extends d {
    private static final String V = "target";
    private static final String W = "ad";
    private static final String X = "assets";
    private static final String Y = "value";
    private static final String Z = "video";
    private static final String aA = "native";
    private static final String aB = "open_bidding_data";
    private static final String aC = "Ad-AnalyticsParameters";
    private static final String aD = "banner_size_type";
    private static final String aE = "mrec";
    private static final String aF = "bid_req_id";
    private static final String aG = "Ad-ProductType";
    private static final String aH = "mobile.yandexadexchange.net/v4/ad";
    private static final String aI = "yandex.ru/ads/v4/ad";
    private static final String aJ = "yandex.com/ads/v4/ad";
    private static final String aK = "yastatic.net/partner-code-bundles";
    private static final String aL = "ad_count_";
    private static final String aM = "doa_count_";
    private static final String aN = "dia_count_";
    private static final Map<String, YandexCreativeInfo> aO = new LimitedConcurrentHashMap(50);
    private static final Map<String, YandexCreativeInfo> aP = new LimitedConcurrentHashMap(50);
    private static final Map<String, Pair<String, Object>> aQ = new LimitedConcurrentHashMap(50);
    private static final String aR = "imageUrl";
    private static final String aS = "requestId";
    private static final String aT = "ad_unit_id";
    private static final String aU = "request_id";
    private static final String aV = "title";
    private static final String aW = "string";
    private static final String aX = "image";
    private static final String aY = "adType";
    private static final String aZ = "content";
    private static final String aa = "type";
    private static final String ab = "name";
    private static final String ac = "domain";
    private static final String ad = "sponsored";
    private static final String ae = "impressionData";
    private static final String af = "media";
    private static final String ag = "image";
    private static final String ah = "icon";
    private static final String ai = "images";
    private static final String aj = "vast";
    private static final String ak = "preview";
    private static final String al = "id";
    private static final String am = "link";
    private static final String an = "info";
    private static final String ao = "store_app_id";
    private static final String ap = "actions";
    private static final String aq = "renderTrackingUrls";
    private static final String ar = "preferredPackages";
    private static final String as = "preferredLinks";
    private static final String at = "url";
    private static final String au = "media html";
    private static final String av = "html";
    private static final String aw = "Ad-Type";
    private static final String ax = "interstitial";
    private static final String ay = "rewarded";
    private static final String az = "banner";
    public static final String b = "yandexadexchange.net";
    private static final String ba = "string";
    private static final String bb = "skip_button";
    private static final String bc = "mac_media_image_,mac_clickable_container_,mac_icon_,mac_call_to_action_";
    private static final String bd = "mraid://open";
    private static final String be = "url";
    private static final String bf = "mraid://expand";
    public static final String c = "com.yandex";
    public static final String d = "yads.";
    public static final String e = "com.monetization";
    private static final String f = "YandexDiscovery";
    private static final String g = "cache_id";
    private static final String h = "response";
    private static final String i = "headers";
    private static final String j = "body";
    private static final String k = "call_to_action";
    private static final String l = "native";
    private static final String m = "ads";
    private static final String n = "designs";
    private static final String o = "items";
    private static final String p = "ad_pod";
    private static final String q = "closable_ad_position";

    public u() {
        super(com.safedk.android.utils.h.y, f);
        Logger.d(f, "ctor started");
        this.E.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.E.b(AdNetworkConfiguration.SET_AD_FORMAT_FROM_APPLOVIN_BUNDLE, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, true);
        this.E.b(AdNetworkConfiguration.SHOULD_SCAN_OBJECT_USING_REFLECTION, true);
        this.E.b(AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW, true);
        this.E.b(AdNetworkConfiguration.SHOULD_ALLOW_CI_MATCHING_WITH_INCOMPATIBLE_EVENT_IDS, true);
        this.E.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE, true);
        this.E.b(AdNetworkConfiguration.SHOULD_ALLOW_REFLECTION_ON_OS_CLASSES, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_NATIVE_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.ALLOW_FULL_SCREEN_MULTI_CLICK_URL_UPDATES, true);
        this.E.b(AdNetworkConfiguration.FULLSCREEN_NEXT_BUTTON_TAG, bb);
        this.E.b(AdNetworkConfiguration.FULL_SCREEN_MULTI_VIEW_TAG_AD_SPECIFIC, bc);
        this.E.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map, c.a aVar, byte[] bArr) throws JSONException {
        String str3;
        BrandSafetyEvent.AdFormatType a;
        String str4;
        String str5;
        JSONObject jSONObject;
        String str6;
        String str7;
        BrandSafetyEvent.AdFormatType adFormatType;
        String str8;
        JSONArray jSONArray;
        String str9;
        JSONObject jSONObject2;
        String str10;
        Map<String, List<String>> map2 = map;
        String str11 = aq;
        String str12 = "assets";
        if (str2 == null) {
            return null;
        }
        try {
            Logger.printFullVerboseLog(f, "generate info started, url=", str, ", headers = ", map2, ", maxParams = ", aVar);
            if (com.safedk.android.utils.n.l(str2)) {
                str3 = str2;
            } else {
                str3 = new String(Base64.decode(str2, 0));
                Logger.d(f, "generate info, prefetch decoded : ", str3);
            }
            JSONObject jSONObject3 = new JSONObject(str3);
            if (jSONObject3.has("response")) {
                String optString = jSONObject3.optString("response");
                if (optString == null) {
                    Logger.d(f, "generate info, ms4 Not a valid prefetch, skipping");
                    return new ArrayList();
                }
                String a2 = com.safedk.android.utils.c.a(optString);
                try {
                    jSONObject2 = new JSONObject(a2);
                } catch (JSONException e2) {
                    jSONObject2 = new JSONObject(com.safedk.android.utils.c.a(a2));
                }
                JSONObject optJSONObject = jSONObject2.optJSONObject(i);
                JSONObject jSONObject4 = new JSONObject(jSONObject2.getString("body"));
                Logger.printFullVerboseLog(f, "generate info, headers = ", optJSONObject);
                BrandSafetyEvent.AdFormatType e3 = e(optJSONObject);
                if (optJSONObject.has(aG)) {
                    str10 = optJSONObject.getString(aG);
                } else {
                    str10 = "";
                }
                a = e3;
                jSONObject3 = jSONObject4;
                str5 = str10;
                str4 = optString;
            } else {
                if (jSONObject3.has(g) && !jSONObject3.has("native") && !jSONObject3.has("response")) {
                    String C = C(jSONObject3.getString(g));
                    if (C != null) {
                        if (!aQ.containsKey(C)) {
                            Pair<String, Object> pair = new Pair<>(jSONObject3.toString(), aVar);
                            aQ.put(C, pair);
                            Logger.d(f, "added to openBiddingCacheIdToCi, key : ", C, ", pair : ", pair);
                            return null;
                        }
                        Pair<String, Object> pair2 = aQ.get(C);
                        aQ.put(C, new Pair<>(pair2.first, aVar));
                        Logger.d(f, "update openBiddingCacheIdToCi, key : ", C, ", pair : ", pair2);
                        return null;
                    }
                    return null;
                }
                if (jSONObject3.has("native")) {
                    a = a(map2);
                    if (map2.containsKey(aG) && map2.get(aG) != null) {
                        str5 = map2.get(aG).get(0);
                        str4 = null;
                    } else {
                        str4 = null;
                        str5 = null;
                    }
                } else {
                    Logger.d(f, "generate info, json does not contain prefetch, skipping ");
                    return new ArrayList();
                }
            }
            JSONObject jSONObject5 = jSONObject3.getJSONObject("native");
            boolean b2 = b(jSONObject5);
            boolean d2 = d(jSONObject5);
            boolean z = d2 && b2;
            Logger.printFullVerboseLog(f, "generate info, multi ad isMultiDesign :  ", Boolean.valueOf(d2), ", isMultiImpressionData : ", Boolean.valueOf(b2), ", isMulti : ", Boolean.valueOf(z));
            if (z) {
                Logger.printFullVerboseLog(f, "generate info, multi ad identified");
            }
            Logger.printFullVerboseLog(f, "generate info, headers ad format type = ", a, ", body=", jSONObject3);
            JSONArray jSONArray2 = jSONObject5.getJSONArray("ads");
            Logger.d(f, "number of ad objects : ", Integer.valueOf(jSONArray2.length()));
            List<CreativeInfo> arrayList = new ArrayList<>();
            int i2 = 0;
            while (i2 < jSONArray2.length()) {
                YandexCreativeInfo a3 = a(a, jSONArray2.getJSONObject(i2), str5);
                String str13 = str5;
                if (a != BrandSafetyEvent.AdFormatType.NATIVE) {
                    adFormatType = a;
                    str8 = str4;
                    jSONArray = jSONArray2;
                } else {
                    if (str4 != null) {
                        adFormatType = a;
                        str9 = str4;
                        str8 = str9;
                        jSONArray = jSONArray2;
                    } else {
                        String b3 = b(map2);
                        if (b3 == null || aQ.get(b3) == null) {
                            adFormatType = a;
                            str8 = str4;
                            jSONArray = jSONArray2;
                        } else {
                            Pair<String, Object> pair3 = aQ.get(b3);
                            adFormatType = a;
                            if (pair3.second instanceof c.a) {
                                String str14 = (String) pair3.first;
                                c.a aVar2 = (c.a) pair3.second;
                                str8 = str4;
                                jSONArray = jSONArray2;
                                Logger.d(f, "found in openBiddingCacheIdToCi by key ", b3, ", first : ", str14, ", max params : ", aVar2);
                                a3.h(aVar2.a);
                                a3.a(BrandSafetyEvent.AdFormatType.NATIVE);
                                str9 = str14;
                            } else {
                                str8 = str4;
                                jSONArray = jSONArray2;
                                Logger.d(f, "openBiddingCacheIdToCi item ", b3, ", does not contina max params");
                            }
                        }
                        str9 = null;
                    }
                    Logger.printFullVerboseLog(f, "generate info, string to be hashed : ", str9);
                }
                aO.put(a3.L(), a3);
                Logger.d(f, "added ci creativeIdToCI, to ad id is ", a3.L(), ", keyset : ", aO.keySet());
                arrayList.add(a3);
                i2++;
                str5 = str13;
                map2 = map;
                a = adFormatType;
                str4 = str8;
                jSONArray2 = jSONArray;
            }
            if (!z || arrayList.size() <= 1) {
                jSONObject = jSONObject3;
                str6 = aq;
                str7 = "assets";
            } else {
                Logger.d(f, "generate info, setting multi ad");
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    CreativeInfo creativeInfo = arrayList.get(i3);
                    creativeInfo.ao();
                    int a4 = a(jSONObject5);
                    String str15 = str11;
                    String str16 = str12;
                    int a5 = a(jSONObject5.getJSONArray("ads").getJSONObject(0));
                    StringBuilder sb = new StringBuilder();
                    sb.append(aL);
                    JSONObject jSONObject6 = jSONObject3;
                    sb.append(jSONObject5.getJSONArray("ads").length());
                    sb.append("/");
                    sb.append(aM);
                    sb.append(a4);
                    sb.append("/");
                    sb.append(aN);
                    sb.append(a5);
                    creativeInfo.e(creativeInfo.h() + "/" + CreativeInfo.aI + "/" + sb.toString());
                    Logger.d(f, "downstream struct updated to ", creativeInfo.h());
                    if (i3 > 0 && arrayList.get(0).an()) {
                        Logger.d(f, "generate info, setting adId of CI (", Integer.valueOf(i3), ") ", creativeInfo.L(), " to ", arrayList.get(0).L());
                        creativeInfo.r(arrayList.get(0).L());
                    }
                    i3++;
                    jSONObject3 = jSONObject6;
                    str11 = str15;
                    str12 = str16;
                }
                jSONObject = jSONObject3;
                str6 = str11;
                str7 = str12;
            }
            String str17 = str7;
            Logger.d(f, "DPA check, #cis : ", Integer.valueOf(arrayList.size()), " , nativeObj.has( JSON_KEY_ASSETS ) : ", Boolean.valueOf(jSONObject5.has(str17)));
            if (arrayList.size() > 1 && jSONObject5.has(str17)) {
                Logger.printFullVerboseLog(f, "DPA gallery identified creativeInfos (", Integer.valueOf(arrayList.size()), ") : ", arrayList);
                String str18 = aL + jSONObject5.getJSONArray("ads").length() + "/" + aM + a(jSONObject5) + "/" + aN + a(jSONObject5.getJSONArray("ads").getJSONObject(0));
                arrayList = a(arrayList);
                if (arrayList != null && !arrayList.isEmpty()) {
                    CreativeInfo creativeInfo2 = arrayList.get(0);
                    creativeInfo2.e(creativeInfo2.h() + "/" + str18);
                    Logger.d(f, "downstream struct updated to ", creativeInfo2.h());
                }
            }
            AtomicReference<String> atomicReference = new AtomicReference<>();
            if (a(jSONObject, atomicReference)) {
                Logger.printFullVerboseLog(f, "Multi Ad gallery identified, creativeInfos (", Integer.valueOf(arrayList.size()), ") : ", arrayList);
                String str19 = aL + jSONObject5.getJSONArray("ads").length() + "/" + aM + a(jSONObject5) + "/" + aN + a(jSONObject5.getJSONArray("ads").getJSONObject(0));
                arrayList = a(arrayList);
                if (arrayList != null && !arrayList.isEmpty()) {
                    CreativeInfo creativeInfo3 = arrayList.get(0);
                    creativeInfo3.e(creativeInfo3.h() + "/" + str19);
                    creativeInfo3.i(atomicReference.get());
                    Logger.d(f, "downstream struct updated to ", creativeInfo3.h(), ", domain set to ", atomicReference.get());
                }
            }
            if (!z && arrayList != null && arrayList.size() < 4) {
                if (arrayList.size() > 1) {
                    arrayList = b(arrayList);
                    Logger.printFullVerboseLog(f, "creatives merged , ci : ", arrayList);
                }
                if (arrayList != null && arrayList.size() == 1) {
                    String str20 = aL + arrayList.size() + "/" + aM + a(jSONObject5) + "/" + aN + a(jSONObject5.getJSONArray("ads").getJSONObject(0));
                    CreativeInfo creativeInfo4 = arrayList.get(0);
                    creativeInfo4.e(creativeInfo4.h() + "/" + str20);
                    Logger.d(f, "downstream struct updated to ", creativeInfo4.h());
                }
            }
            String str21 = str6;
            if (jSONObject5.has(str21)) {
                JSONArray jSONArray3 = jSONObject5.getJSONArray(str21);
                for (int i4 = 0; i4 < jSONArray3.length(); i4++) {
                    String string = jSONArray3.getString(i4);
                    if (arrayList != null) {
                        Iterator<CreativeInfo> it = arrayList.iterator();
                        while (it.hasNext()) {
                            YandexCreativeInfo yandexCreativeInfo = (YandexCreativeInfo) it.next();
                            yandexCreativeInfo.K(string);
                            Logger.d(f, "generate info, added renderTrackingUrl ", string, ",  to ci ", yandexCreativeInfo.L());
                        }
                    }
                }
            }
            if (aVar != null && aVar.a != null && arrayList != null && !arrayList.isEmpty()) {
                for (CreativeInfo creativeInfo5 : arrayList) {
                    if (creativeInfo5.K() == BrandSafetyUtils.AdType.NATIVE) {
                        creativeInfo5.h(aVar.a);
                    }
                }
            }
            Logger.printFullVerboseLog(f, "generate info, multi ? ", Boolean.valueOf(z), ", cis created : ", arrayList);
            return arrayList;
        } catch (Throwable th) {
            Logger.d(f, "Exception in generate info: ", th.getMessage(), th);
            return null;
        }
    }

    private boolean a(JSONObject jSONObject, AtomicReference<String> atomicReference) throws JSONException {
        JSONObject jSONObject2;
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        String str;
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("native")) == null || d(jSONObject2) || (jSONObject2.opt("assets") instanceof JSONArray) || (optJSONArray = jSONObject2.optJSONArray("ads")) == null || optJSONArray.length() < 2) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
            if (optJSONObject == null || (optJSONArray2 = optJSONObject.optJSONArray("assets")) == null || optJSONArray2.length() == 0) {
                return false;
            }
            int i3 = 0;
            while (true) {
                str = null;
                if (i3 >= optJSONArray2.length()) {
                    break;
                }
                JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i3);
                if (optJSONObject2 == null || !"domain".equals(optJSONObject2.optString("name", null))) {
                    i3++;
                } else {
                    str = optJSONObject2.optString("value");
                    if (str == null) {
                        return false;
                    }
                    if (optJSONObject.has(aY) && optJSONObject.getString(aY).equals("content") && atomicReference.get() == null) {
                        atomicReference.set(str);
                        Logger.d(f, "isMultiAdGallery domain ", str);
                    }
                    if (optJSONObject.has(aY) && optJSONObject.getString(aY).equals("content") && atomicReference.get() == null) {
                        atomicReference.set(str);
                        Logger.d(f, "isMultiAdGallery domain ", str);
                    }
                }
            }
            if (str == null || !hashSet.add(str)) {
                return false;
            }
        }
        return true;
    }

    private List<CreativeInfo> a(List<CreativeInfo> list) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (!list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                arrayList.addAll(new ArrayList(list.get(i2).r()));
            }
            Logger.d(f, "mergeDPAGalleryCreativeInfos ", arrayList);
            CreativeInfo creativeInfo = list.get(0);
            creativeInfo.b(arrayList);
            list.clear();
            list.add(creativeInfo);
            return list;
        }
        return null;
    }

    private List<CreativeInfo> b(List<CreativeInfo> list) {
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() > 1) {
            YandexCreativeInfo yandexCreativeInfo = (YandexCreativeInfo) list.get(0);
            for (int i2 = 1; i2 < list.size(); i2++) {
                YandexCreativeInfo yandexCreativeInfo2 = (YandexCreativeInfo) list.get(i2);
                yandexCreativeInfo.r().addAll(yandexCreativeInfo2.r());
                yandexCreativeInfo.q().addAll(yandexCreativeInfo2.q());
                Iterator<String> it = yandexCreativeInfo2.as().iterator();
                while (it.hasNext()) {
                    yandexCreativeInfo.a(it.next());
                }
            }
            list.clear();
            list.add(yandexCreativeInfo);
            return list;
        }
        return null;
    }

    private int a(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("assets")) {
            return 0;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("assets");
        int i2 = 0;
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
            if (jSONObject2.has("name") && jSONObject2.getString("name").equals("domain")) {
                i2++;
            }
        }
        return i2;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, byte[] bArr) {
        if (D(str)) {
            String d2 = com.safedk.android.utils.k.d(str + "?" + str2, aB);
            String C = C(d2);
            if (C != null && !aQ.containsKey(C)) {
                Pair<String, Object> pair = new Pair<>(d2, null);
                aQ.put(C, pair);
                Logger.d(f, "handleOnRequestSent added to openBiddingCacheIdToCi : ", C, ", ", pair);
            }
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean g(String str) {
        return D(str);
    }

    private boolean b(JSONObject jSONObject) throws JSONException {
        HashSet hashSet = new HashSet();
        if (jSONObject.has("ads")) {
            JSONArray jSONArray = jSONObject.getJSONArray("ads");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                if (jSONObject2.has(ae)) {
                    hashSet.add(jSONObject2.getString(ae));
                }
            }
        }
        return hashSet.size() != 1;
    }

    private boolean c(JSONObject jSONObject) throws JSONException {
        int i2;
        if (!jSONObject.has(p)) {
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(p);
        if (!jSONObject2.has(q)) {
            i2 = 0;
        } else {
            i2 = jSONObject2.getInt(q);
        }
        return i2 > 1 && jSONObject2.getJSONArray(o).length() > 1;
    }

    private String C(String str) {
        Matcher matcher = com.safedk.android.utils.g.a("openbidding_(.*)_(.*)").matcher(str);
        if (matcher.find() && matcher.group(1) != null) {
            return matcher.group(1);
        }
        return null;
    }

    private BrandSafetyEvent.AdFormatType a(Map<String, List<String>> map) throws JSONException {
        List<String> list;
        if (map.containsKey(aw) && (list = map.get(aw)) != null && list.size() > 0) {
            String str = list.get(0);
            if (str.equals("interstitial")) {
                return BrandSafetyEvent.AdFormatType.INTER;
            }
            if (str.equals("rewarded")) {
                return BrandSafetyEvent.AdFormatType.REWARD;
            }
            if (str.equals("banner")) {
                if (map.containsKey(aC)) {
                    JSONObject jSONObject = new JSONObject(map.get(aC).get(0));
                    if (jSONObject.has(aD)) {
                        if (jSONObject.getString(aD).equals(aE)) {
                            return BrandSafetyEvent.AdFormatType.MREC;
                        }
                        return BrandSafetyEvent.AdFormatType.BANNER;
                    }
                    return BrandSafetyEvent.AdFormatType.BANNER;
                }
            } else if (str.equals("native")) {
                return BrandSafetyEvent.AdFormatType.NATIVE;
            }
        }
        return null;
    }

    private String b(Map<String, List<String>> map) throws JSONException {
        String str;
        if (map.containsKey(aC)) {
            JSONObject jSONObject = new JSONObject(map.get(aC).get(0));
            if (jSONObject.has(aF)) {
                str = jSONObject.getString(aF);
                Logger.printFullVerboseLog(f, "getOpenBiddingCacheIdFromResponseHeaders returned ", str);
                return str;
            }
        }
        str = null;
        Logger.printFullVerboseLog(f, "getOpenBiddingCacheIdFromResponseHeaders returned ", str);
        return str;
    }

    private boolean d(JSONObject jSONObject) throws JSONException {
        int i2;
        if (!jSONObject.has(n)) {
            i2 = 0;
        } else {
            JSONArray jSONArray = jSONObject.getJSONArray(n);
            i2 = 0;
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                if (jSONObject2.has(V) && jSONObject2.getString(V).equals("ad")) {
                    i2++;
                }
            }
        }
        return i2 > 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private BrandSafetyEvent.AdFormatType e(JSONObject jSONObject) throws JSONException {
        BrandSafetyEvent.AdFormatType adFormatType;
        if (jSONObject.has(aw)) {
            String string = jSONObject.getString(aw);
            if (string.equals("interstitial")) {
                adFormatType = BrandSafetyEvent.AdFormatType.INTER;
            } else if (string.equals("rewarded")) {
                adFormatType = BrandSafetyEvent.AdFormatType.REWARD;
            } else if (string.equals("banner")) {
                if (jSONObject.has(aC)) {
                    JSONObject jSONObject2 = new JSONObject(jSONObject.getString(aC));
                    if (jSONObject2.has(aD)) {
                        if (jSONObject2.getString(aD).equals(aE)) {
                            adFormatType = BrandSafetyEvent.AdFormatType.MREC;
                        } else {
                            adFormatType = BrandSafetyEvent.AdFormatType.BANNER;
                        }
                    } else {
                        adFormatType = BrandSafetyEvent.AdFormatType.BANNER;
                    }
                }
            } else if (string.equals("native")) {
                adFormatType = BrandSafetyEvent.AdFormatType.NATIVE;
            }
            if (adFormatType == null) {
                Logger.printFullVerboseLog(f, "cannot determine ad format type from ", jSONObject);
            }
            return adFormatType;
        }
        adFormatType = null;
        if (adFormatType == null) {
        }
        return adFormatType;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        Logger.d(f, "handleVastMediaFile started , mediaUrl = ", str, ", ci id = ", creativeInfo.L());
        ((YandexCreativeInfo) creativeInfo).J(str);
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean B(String str) {
        if (str.contains(aK)) {
            Logger.d(f, "Privacy policy url opened : ", str);
            CreativeInfoManager.a(com.safedk.android.utils.h.y);
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        return D(str);
    }

    private boolean D(String str) {
        return str.toLowerCase().contains(aH) || str.toLowerCase().contains(aI) || str.toLowerCase().contains(aJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private YandexCreativeInfo a(BrandSafetyEvent.AdFormatType adFormatType, JSONObject jSONObject, String str) throws JSONException {
        String str2;
        String str3;
        String str4;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        int i2;
        String str5;
        char c2;
        String string;
        String optString = jSONObject.optString("id", "");
        String uuid = UUID.randomUUID().toString();
        Logger.d(f, "processAd id : ", optString, ", adId = ", uuid);
        String str6 = null;
        if (jSONObject.has(an) && jSONObject.getString(an) != null) {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString(an));
            if (jSONObject2.has(ao)) {
                String string2 = jSONObject2.getString(ao);
                Logger.d(f, "processAd packageName : ", string2);
                str2 = string2;
                String f2 = f(jSONObject);
                Logger.d(f, "processAd clickUrl : ", f2);
                YandexCreativeInfo yandexCreativeInfo = new YandexCreativeInfo(BrandSafetyUtils.a(adFormatType), uuid, optString, f2, null, str2, this.I, str);
                yandexCreativeInfo.a(adFormatType);
                if (jSONObject.has(ae)) {
                    str3 = f;
                    str4 = null;
                } else {
                    str4 = jSONObject.getString(ae);
                    yandexCreativeInfo.L(str4);
                    str3 = f;
                    Logger.d(str3, "processAd impressionData : ", str4);
                    JSONObject jSONObject3 = new JSONObject(str4);
                    if (jSONObject3.has(aS)) {
                        String string3 = jSONObject3.getString(aS);
                        aP.put(string3, yandexCreativeInfo);
                        str6 = string3;
                    }
                    if (jSONObject3.has(aT) && (string = jSONObject3.getString(aT)) != null) {
                        yandexCreativeInfo.j(string);
                        Logger.d(str3, "processAd placementId : ", string);
                    }
                }
                Logger.d(str3, "processing ad, CI created , adFormatType : ", adFormatType, ", creativeId :  ", optString, ", clickUrl : ", f2, ", requestId = ", str6, ", placementId : ", yandexCreativeInfo.F(), ", impressionData : ", str4);
                jSONArray = jSONObject.getJSONArray("assets");
                if (jSONArray != null) {
                    int i3 = 0;
                    while (i3 < jSONArray.length()) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i3);
                        if (optJSONObject == null) {
                            jSONArray2 = jSONArray;
                            i2 = i3;
                        } else {
                            if (!optJSONObject.has("type") || !optJSONObject.getString("type").equals("media")) {
                                jSONArray2 = jSONArray;
                                i2 = i3;
                                str5 = "type";
                                if (optJSONObject.has("name") && optJSONObject.getString("name").equals("domain")) {
                                    if (optJSONObject.has("value")) {
                                        String string4 = optJSONObject.getString("value");
                                        yandexCreativeInfo.i(string4);
                                        Logger.d(str3, "set Ad Domain to ", string4);
                                    }
                                } else if (optJSONObject.has("name") && optJSONObject.getString("name").equals(ad) && optJSONObject.has("value")) {
                                    String string5 = optJSONObject.getString("value");
                                    yandexCreativeInfo.m(string5);
                                    Logger.d(str3, "set buyer id to ", string5);
                                }
                            } else {
                                Object opt = optJSONObject.opt("value");
                                if (!(opt instanceof JSONObject) || opt == JSONObject.NULL) {
                                    jSONArray2 = jSONArray;
                                    i2 = i3;
                                    str5 = "type";
                                } else {
                                    JSONObject jSONObject4 = (JSONObject) opt;
                                    if (!jSONObject4.has("video")) {
                                        jSONArray2 = jSONArray;
                                        i2 = i3;
                                        str5 = "type";
                                    } else {
                                        JSONObject jSONObject5 = jSONObject4.getJSONObject("video");
                                        if (!jSONObject5.has("vast")) {
                                            jSONArray2 = jSONArray;
                                            i2 = i3;
                                            str5 = "type";
                                        } else {
                                            String string6 = jSONObject5.getString("vast");
                                            if (com.safedk.android.analytics.brandsafety.creatives.h.b(string6)) {
                                                jSONArray2 = jSONArray;
                                                i2 = i3;
                                                c2 = 0;
                                            } else {
                                                jSONArray2 = jSONArray;
                                                i2 = i3;
                                                c2 = 0;
                                                string6 = new String(Base64.decode(string6, 0));
                                            }
                                            if (com.safedk.android.analytics.brandsafety.creatives.h.b(string6)) {
                                                str5 = "type";
                                                Object[] objArr = new Object[2];
                                                objArr[c2] = "vast ad identified, vast : ";
                                                objArr[1] = string6;
                                                Logger.d(str3, objArr);
                                                a(string6, yandexCreativeInfo);
                                                yandexCreativeInfo.e(yandexCreativeInfo.h() + "/vast");
                                                Logger.d(str3, "vast ad updated, downstreamStruct : ", yandexCreativeInfo.h(), ", creativeInfo : ", yandexCreativeInfo);
                                            } else {
                                                str5 = "type";
                                                Logger.d(str3, "vast  block is not a vast block : ", string6);
                                            }
                                        }
                                        if (jSONObject5.has(ak)) {
                                            JSONObject jSONObject6 = jSONObject5.getJSONObject(ak);
                                            if (jSONObject6.has("url")) {
                                                String string7 = jSONObject6.getString("url");
                                                if (!yandexCreativeInfo.r().contains(string7)) {
                                                    yandexCreativeInfo.y(string7);
                                                    Logger.d(str3, "added prefetch resource from assets[] type: “media” > value > video > preview > url: ", string7);
                                                    yandexCreativeInfo.a(string7);
                                                    Logger.d(str3, "avatar image added: ", string7);
                                                }
                                            }
                                        }
                                    }
                                    if (jSONObject4.has("image")) {
                                        JSONObject jSONObject7 = jSONObject4.getJSONObject("image");
                                        if (jSONObject7.has("url")) {
                                            String string8 = jSONObject7.getString("url");
                                            if (!yandexCreativeInfo.r().contains(string8)) {
                                                yandexCreativeInfo.y(string8);
                                                Logger.d(str3, "added prefetch resource 1: ", string8);
                                                yandexCreativeInfo.a(string8);
                                                Logger.d(str3, "avatar image added: ", string8);
                                            }
                                        }
                                        if (jSONObject7.has(au)) {
                                            String str7 = new String(Base64.decode(jSONObject7.getString(au), 0));
                                            if (!yandexCreativeInfo.r().contains(str7)) {
                                                yandexCreativeInfo.y(str7);
                                                Logger.d(str3, "added prefetch resource from assets[] type: “media” > value > image > media html : ", str7);
                                            }
                                        }
                                    }
                                    if (jSONObject4.has(ai)) {
                                        JSONArray jSONArray3 = jSONObject4.getJSONArray(ai);
                                        for (int i4 = 0; i4 < jSONArray3.length(); i4++) {
                                            JSONObject jSONObject8 = jSONArray3.getJSONObject(i4);
                                            if (jSONObject8.has("url")) {
                                                String string9 = jSONObject8.getString("url");
                                                if (!yandexCreativeInfo.r().contains(string9)) {
                                                    yandexCreativeInfo.y(string9);
                                                    Logger.d(str3, "added prefetch resource from images array: ", string9);
                                                }
                                            }
                                        }
                                    }
                                    if (jSONObject4.has("media")) {
                                        JSONObject jSONObject9 = jSONObject4.getJSONObject("media");
                                        if (jSONObject9.has("html")) {
                                            String string10 = jSONObject9.getString("html");
                                            Logger.printFullVerboseLog(str3, "found html : ", string10);
                                            yandexCreativeInfo.b((List<String>) com.safedk.android.utils.n.f(string10));
                                        }
                                    }
                                }
                            }
                            if (yandexCreativeInfo.K() == BrandSafetyUtils.AdType.NATIVE) {
                                String str8 = str5;
                                if (optJSONObject.has(str8) && optJSONObject.getString(str8).equals("string") && optJSONObject.has("name") && optJSONObject.getString("name").equals("title") && optJSONObject.has("value")) {
                                    String string11 = optJSONObject.getString("value");
                                    yandexCreativeInfo.A(CreativeInfo.aK + string11);
                                    Logger.d(str3, "added native ad prefetch resource (element:title) ", string11);
                                }
                                if (optJSONObject.has(str8) && optJSONObject.getString(str8).equals("media") && optJSONObject.has("name") && optJSONObject.getString("name").equals("media")) {
                                    Object opt2 = optJSONObject.opt("value");
                                    if ((opt2 instanceof JSONObject) && opt2 != JSONObject.NULL) {
                                        JSONObject jSONObject10 = (JSONObject) opt2;
                                        if (jSONObject10.has("image")) {
                                            JSONObject jSONObject11 = jSONObject10.getJSONObject("image");
                                            if (jSONObject11.has("url")) {
                                                String string12 = jSONObject11.getString("url");
                                                yandexCreativeInfo.A(CreativeInfo.aL + string12);
                                                Logger.d(str3, "added native ad prefetch resource (element:mainImg) ", string12);
                                            }
                                        }
                                    }
                                }
                                if (optJSONObject.has(str8) && optJSONObject.getString(str8).equals("image") && optJSONObject.has("name") && optJSONObject.getString("name").equals("icon")) {
                                    Object opt3 = optJSONObject.opt("value");
                                    if ((opt3 instanceof JSONObject) && opt3 != JSONObject.NULL) {
                                        JSONObject jSONObject12 = (JSONObject) opt3;
                                        if (jSONObject12.has("url")) {
                                            String string13 = jSONObject12.getString("url");
                                            yandexCreativeInfo.A(CreativeInfo.aM + string13);
                                            Logger.d(str3, "added native ad prefetch resource (element:icon) ", string13);
                                        }
                                    }
                                }
                                if (optJSONObject.has(str8) && optJSONObject.getString(str8).equals("string") && optJSONObject.has("name") && optJSONObject.getString("name").equals("body") && optJSONObject.has("value")) {
                                    String string14 = optJSONObject.getString("value");
                                    yandexCreativeInfo.A(CreativeInfo.aN + string14);
                                    Logger.d(str3, "added native ad prefetch resource (element:body) ", string14);
                                }
                                if (optJSONObject.has(str8) && optJSONObject.getString(str8).equals("string")) {
                                    if (optJSONObject.has("name") && optJSONObject.getString("name").equals(k)) {
                                        if (optJSONObject.has("value")) {
                                            String string15 = optJSONObject.getString("value");
                                            yandexCreativeInfo.A(CreativeInfo.aO + string15);
                                            Logger.d(str3, "added native ad prefetch resource (element:cta) ", string15);
                                        }
                                    }
                                }
                            }
                        }
                        i3 = i2 + 1;
                        jSONArray = jSONArray2;
                    }
                }
                return yandexCreativeInfo;
            }
        }
        str2 = null;
        String f22 = f(jSONObject);
        Logger.d(f, "processAd clickUrl : ", f22);
        YandexCreativeInfo yandexCreativeInfo2 = new YandexCreativeInfo(BrandSafetyUtils.a(adFormatType), uuid, optString, f22, null, str2, this.I, str);
        yandexCreativeInfo2.a(adFormatType);
        if (jSONObject.has(ae)) {
        }
        Logger.d(str3, "processing ad, CI created , adFormatType : ", adFormatType, ", creativeId :  ", optString, ", clickUrl : ", f22, ", requestId = ", str6, ", placementId : ", yandexCreativeInfo2.F(), ", impressionData : ", str4);
        jSONArray = jSONObject.getJSONArray("assets");
        if (jSONArray != null) {
        }
        return yandexCreativeInfo2;
    }

    private static String f(JSONObject jSONObject) throws JSONException {
        String str;
        if (jSONObject.has("link") && jSONObject.getJSONObject("link").has("url")) {
            str = jSONObject.getJSONObject("link").getString("url");
            Logger.d(f, "getClickUrl link > url : ", str);
        } else {
            str = null;
        }
        if (str == null && jSONObject.has("link") && jSONObject.getJSONObject("link").has(ap)) {
            JSONArray jSONArray = jSONObject.getJSONObject("link").getJSONArray(ap);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                if (jSONObject2.has(ar)) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray(ar);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= jSONArray2.length()) {
                            break;
                        }
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
                        if (!jSONObject3.has("url")) {
                            i3++;
                        } else {
                            str = jSONObject3.getString("url");
                            Logger.d(f, "getClickUrl from native > ads[] > link > actions > preferredPackages[] > url : ", str);
                            break;
                        }
                    }
                }
                if (str == null && jSONObject2.has(as)) {
                    JSONArray jSONArray3 = jSONObject2.getJSONArray(as);
                    int i4 = 0;
                    while (true) {
                        if (i4 < jSONArray3.length()) {
                            JSONObject jSONObject4 = jSONArray3.getJSONObject(i4);
                            if (!jSONObject4.has("url")) {
                                i4++;
                            } else {
                                str = jSONObject4.getString("url");
                                Logger.d(f, "getClickUrl from native > ads[] > link > actions > preferredLinks[] > url : ", str);
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (str != null && str.contains(b)) {
            Logger.d(f, "getClickUrl contains yandexadexchange.net, skipping");
            return null;
        }
        return str;
    }

    private YandexCreativeInfo a(String str, YandexCreativeInfo yandexCreativeInfo) {
        a((CreativeInfo) yandexCreativeInfo, (String) null, str, true);
        return yandexCreativeInfo;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<String> j() {
        return Arrays.asList(c, d, e);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo b(Object obj) {
        if (obj != null && (obj instanceof String)) {
            String str = (String) obj;
            if (aO.containsKey(str)) {
                Logger.printFullVerboseLog(f, "match info, found key by id : ", str);
                return aO.remove(str);
            }
            Logger.printFullVerboseLog(f, "match info, value : ", str);
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean k(String str) {
        Logger.d(f, "should ignore redirect url started. url: ", str);
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean e(View view) {
        if (super.e(view) || view.getClass().getCanonicalName().toLowerCase().contains(c) || view.getClass().getCanonicalName().toLowerCase().contains(e) || view.getClass().getCanonicalName().toLowerCase().startsWith(d)) {
            return true;
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(BrandSafetyUtils.AdType adType, Object obj, String str) {
        if (obj == null) {
            return null;
        }
        try {
            if (!obj.getClass().getName().equals("java.lang.Boolean") && !obj.getClass().getName().equals("java.lang.Integer") && !obj.getClass().getName().equals("java.lang.Long") && !obj.getClass().getName().equals("android.util.SparseArray") && !obj.getClass().getName().equals("java.util.Collections$EmptyList") && !obj.getClass().getName().equals("android.util.SparseBooleanArray") && !obj.getClass().getName().equals("java.lang.Float") && !obj.getClass().getName().startsWith(MBridgeConstans.APPLICATION_STACK_ANDROID_OS) && !obj.getClass().getName().equals("java.util.ArrayDeque")) {
                if (obj instanceof HashMap) {
                    HashMap hashMap = (HashMap) obj;
                    Logger.printFullVerboseLog(f, "extract ad info (impl), found HashMap  : ", hashMap);
                    if (hashMap.containsKey("request_id")) {
                        String str2 = (String) hashMap.get("request_id");
                        if (aP.get(str2) != null) {
                            CreativeInfo creativeInfo = aP.get(str2);
                            b(creativeInfo, "request_id");
                            Logger.printFullVerboseLog(f, "extract ad info (impl), found ci ", creativeInfo.L(), " by requestId  : ", str2);
                            return creativeInfo.L();
                        }
                    }
                }
                if (obj instanceof String) {
                    String str3 = (String) obj;
                    if (str3.length() < 15) {
                        return null;
                    }
                    Logger.printFullVerboseLog(f, "extract ad info (impl), found stringInfo : ", str3, ", fieldName : ", str);
                    if (aO.containsKey(str3)) {
                        CreativeInfo creativeInfo2 = aO.get(str3);
                        b(creativeInfo2, "creative_id");
                        Logger.printFullVerboseLog(f, "extract ad info (impl), found ci ", creativeInfo2.L(), " by id : ", str3);
                        return creativeInfo2.L();
                    }
                    if (com.safedk.android.utils.n.a((Object) str3) && O(str3)) {
                        for (YandexCreativeInfo yandexCreativeInfo : aO.values()) {
                            if (yandexCreativeInfo != null && yandexCreativeInfo.at() != null && yandexCreativeInfo.at().contains(str3)) {
                                b((CreativeInfo) yandexCreativeInfo, "media_file");
                                Logger.printFullVerboseLog(f, "extract ad info (impl), found ci ", yandexCreativeInfo.L(), " by media file : ", str3);
                                return yandexCreativeInfo.L();
                            }
                        }
                    }
                }
                if (obj.getClass().getName().equals("android.net.Uri$StringUri") && str != null && str.equals("imageUrl")) {
                    Logger.printFullVerboseLog(f, "extract ad info (impl) Uri,  obj : ", obj, ", obj class : ", obj.getClass().getCanonicalName(), ", fieldName : ", str);
                    String uri = ((Uri) obj).toString();
                    Logger.d(f, "extract ad info (impl) checking by imageUrl : ", uri);
                    boolean P = P(uri);
                    boolean Q = Q(uri);
                    for (YandexCreativeInfo yandexCreativeInfo2 : aO.values()) {
                        if (P && yandexCreativeInfo2 != null && yandexCreativeInfo2.H() != null && yandexCreativeInfo2.H().equals(uri)) {
                            b((CreativeInfo) yandexCreativeInfo2, "video_url");
                            Logger.printFullVerboseLog(f, "extract ad info (impl), found ci ", yandexCreativeInfo2.L(), " by video url : ", uri, ", ad id : ", yandexCreativeInfo2.L());
                            return yandexCreativeInfo2.L();
                        }
                        if (Q && yandexCreativeInfo2 != null && yandexCreativeInfo2.as() != null && yandexCreativeInfo2.as().contains(uri)) {
                            b((CreativeInfo) yandexCreativeInfo2, "avatar_image");
                            Logger.printFullVerboseLog(f, "extract ad info (impl), found ci ", yandexCreativeInfo2.L(), " by avatar image : ", uri, ", ad id : ", yandexCreativeInfo2.L());
                            return yandexCreativeInfo2.L();
                        }
                    }
                }
                if (obj instanceof ArrayList) {
                    Logger.printFullVerboseLog(f, "extract ad info (impl), found ArrayList : ", obj);
                    ArrayList arrayList = (ArrayList) obj;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Logger.printFullVerboseLog(f, "extract ad info (impl), ArrayList item : ", arrayList);
                        if ((next instanceof String) && com.safedk.android.utils.n.a(next)) {
                            String str4 = (String) next;
                            Logger.printFullVerboseLog(f, "extract ad info (impl), ArrayList item : ", str4);
                            for (YandexCreativeInfo yandexCreativeInfo3 : aO.values()) {
                                Logger.printFullVerboseLog(f, "extract ad info (impl), checking by renderTrackingUrl. ci avatar images : ", yandexCreativeInfo3.au());
                                if (yandexCreativeInfo3.au() != null && yandexCreativeInfo3.au().contains(str4)) {
                                    b((CreativeInfo) yandexCreativeInfo3, "tracking_url");
                                    Logger.printFullVerboseLog(f, "extract ad info (impl), found ci ", yandexCreativeInfo3.L(), " by renderTrackingUrl : ", str4, ", ad id : ", yandexCreativeInfo3.L());
                                    return yandexCreativeInfo3.L();
                                }
                            }
                        }
                    }
                    return null;
                }
                return null;
            }
            return null;
        } catch (Throwable th) {
            Logger.d(f, "extract ad info (impl) exception : ", th.getMessage(), th);
            return null;
        }
    }

    private boolean O(String str) {
        YandexCreativeInfo next;
        Iterator<YandexCreativeInfo> it = aO.values().iterator();
        int i2 = 0;
        while (it.hasNext() && ((next = it.next()) == null || next.at() == null || !next.at().contains(str) || (i2 = i2 + 1) <= 1)) {
        }
        if (i2 > 0) {
            Logger.d(f, "uniqueness check, media file count: ", Integer.valueOf(i2), ", url: ", str);
        }
        return i2 == 1;
    }

    private boolean P(String str) {
        YandexCreativeInfo next;
        Iterator<YandexCreativeInfo> it = aO.values().iterator();
        int i2 = 0;
        while (it.hasNext() && ((next = it.next()) == null || next.H() == null || !next.H().equals(str) || (i2 = i2 + 1) <= 1)) {
        }
        if (i2 > 0) {
            Logger.d(f, "uniqueness check, video url count: ", Integer.valueOf(i2), ", url: ", str);
        }
        return i2 == 1;
    }

    private boolean Q(String str) {
        YandexCreativeInfo next;
        Iterator<YandexCreativeInfo> it = aO.values().iterator();
        int i2 = 0;
        while (it.hasNext() && ((next = it.next()) == null || next.as() == null || !next.as().contains(str) || (i2 = i2 + 1) <= 1)) {
        }
        if (i2 > 0) {
            Logger.d(f, "uniqueness check, avatar image count: ", Integer.valueOf(i2), ", url: ", str);
        }
        return i2 == 1;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<CreativeInfo> a(WeakReference<View> weakReference, String str, BrandSafetyUtils.AdType adType) {
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            Logger.d(f, "generate info started, view: ", weakReference.get(), " with ad type: ", adType, ", maxCreativeId = ", str);
            Logger.d(f, "generate info View check. adInstance is a View, visibility = ", Integer.valueOf(weakReference.get().getVisibility()), ", dimensions (height= ", Long.valueOf(weakReference.get().getMeasuredHeight()), ", width=", Long.valueOf(weakReference.get().getMeasuredWidth()), ")");
            String a = a(BrandSafetyUtils.AdType.NATIVE, weakReference.get(), new ArrayList(), new HashSet());
            if (a != null) {
                Logger.d(f, "generate info found adId , view: ", weakReference.get(), " with ad type: ", adType, ", maxCreativeId = ", str);
                arrayList.add(a((Object) a));
                Logger.d(f, "generate info ci : ", arrayList);
            } else {
                Logger.d(f, "generate info did not find adId :( ");
            }
        } catch (Throwable th) {
            Logger.e(f, "Exception in generate info: ", th.getMessage(), th);
        }
        return arrayList;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        super.i();
        com.safedk.android.utils.e.a(aO, "YandexDiscovery:creativeIdToCI");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String m(String str) {
        Logger.d(f, "extract mraid redirect target url - url= ", str);
        if (str != null && (str.contains(bd) || str.contains(bf))) {
            return com.safedk.android.utils.k.d(str, "url");
        }
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public RedirectDetails.RedirectType l(String str) {
        Logger.d(f, "extract mraid redirect type - url= ", str);
        if (str != null) {
            if (str.contains(bd)) {
                return RedirectDetails.RedirectType.REDIRECT;
            }
            if (str.contains(bf)) {
                return RedirectDetails.RedirectType.EXPAND;
            }
        }
        return RedirectDetails.RedirectType.REDIRECT;
    }
}

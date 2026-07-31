package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.InterstitialFinder;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.MintegralCreativeInfo;
import com.safedk.android.analytics.brandsafety.m;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* loaded from: classes14.dex */
public class l {
    private static final String A = "ext_data";
    private static final String B = "par_dspid";
    private static final String C = "slot_id";
    private static final String D = "{";
    private static final String E = "}";
    private static final String F = "ad_type";
    private static final String G = "execute_c_config";
    private static final String H = "execute_e_config";
    private static final String I = "e_output";
    private static final String J = "loadArray";
    private static final String K = "other";
    private static final String L = "lrid";
    private static final String M = "l_cfg";
    private static final String N = "creative_info";
    private static final String O = "creative_id";
    private static final String P = "c_cfg";
    private static final String Q = "clickThrough";
    private static final String R = "c_t";
    private static final String S = "tracking";
    private static final String T = "i_tracking";
    private static final String U = "imp_url";
    private static final String V = "e_tracking";
    private static final String W = "impression_links";
    private static final int X = -1;
    private static final String Y = "mof_template_url";
    public static final String a = "status";
    private static final String aA = "icon_url";
    private static final String aB = "desc";
    private static final String aC = "ctatext";
    private static final Map<String, String> aD;
    private static final String ab = "choose_from_two";
    private static final String ac = "multi_ad_mintegral_dsp";
    private static final String ad = "rks";
    private static final String ae = "a";
    private static final String af = "b";
    private static final String ag = "c";
    private static final String ah = "aks";
    private static final String ai = "k";
    private static final String aj = "q";
    private static final String ak = "r";
    private static final String al = "al";
    private static final String am = "csp";
    private static final String an = "mp";
    private static final String ao = "drp";
    private static final String ap = "ap";
    private static final String aq = "srp";
    private static final String ar = "sdkId";
    private static final String as = "webviewAddress";
    private static final String at = "direction";
    private static final String au = "recommendation-images";
    private static final String av = "recommendations";
    private static final String aw = "url";
    private static final String ax = "responseText";
    private static final String ay = "image_url";
    private static final String az = "title";
    public static final int b = 1;
    public static final String c = "data";
    public static final String d = "ads";
    public static final int e = 287;
    public static final int f = 94;
    public static final int g = 296;
    public static final int h = 42;
    public static final int i = 295;
    private static final String n = "MintegralDiscoveryHelper";
    private static final String o = "id";
    private static final String p = "video_url";
    private static final String q = "image_url";
    private static final String r = "end_screen_url";
    private static final String s = "unit_id";
    private static final String t = "package_name";
    private static final String u = "click_url";
    private static final String v = "cam_html";
    private static final String w = "ad_tracking";
    private static final String x = "impression";
    private static final String y = "impression_url";
    private static final String z = "adv_id";
    private static final String[] Z = {"mbridge_same_choice_one_layout", "bigTplChoseFromTwo"};
    private static final String[] aa = {"mbridge_order_layout_list", "big-template-501"};
    public static final String j = ".rayjump.com/openapi/moreoffer";
    public static final String k = "mtgglobals.com/openapi/moreoffer";
    public static final String l = ".rayjump.com//openapi/moreoffer";
    public static final List<String> m = Arrays.asList(j, k, l);

    public static class b {
        public String a;
        public HashSet<String> b = new HashSet<>();
    }

    static {
        HashMap hashMap = new HashMap();
        aD = hashMap;
        hashMap.put(Marker.ANY_NON_NULL_MARKER, "X");
        aD.put("/", "u");
        aD.put("0", "i");
        aD.put("1", "6");
        aD.put("2", "1");
        aD.put("3", "k");
        aD.put("4", EidRequestBuilder.REQUEST_FIELD_EMAIL);
        aD.put("5", "V");
        aD.put("6", InneractiveMediationDefs.GENDER_FEMALE);
        aD.put("7", "G");
        aD.put("8", "r");
        aD.put("9", "4");
        aD.put("A", "z");
        aD.put("B", VastAttributes.VERTICAL_POSITION);
        aD.put("C", "/");
        aD.put("D", "Y");
        aD.put("E", "o");
        aD.put("F", "2");
        aD.put("G", "O");
        aD.put("H", "Z");
        aD.put("I", "8");
        aD.put("J", "d");
        aD.put("K", "9");
        aD.put("L", "a");
        aD.put("M", "w");
        aD.put("N", "Q");
        aD.put("O", "7");
        aD.put("P", "5");
        aD.put("Q", "l");
        aD.put("R", "I");
        aD.put("S", "B");
        aD.put("T", "0");
        aD.put("U", com.mbridge.msdk.foundation.same.report.j.b);
        aD.put("V", "U");
        aD.put("W", "L");
        aD.put("X", "v");
        aD.put("Y", "b");
        aD.put("Z", "S");
        aD.put("a", "D");
        aD.put("b", "3");
        aD.put(ag, "F");
        aD.put("d", "H");
        aD.put(EidRequestBuilder.REQUEST_FIELD_EMAIL, VastAttributes.HORIZONTAL_POSITION);
        aD.put(InneractiveMediationDefs.GENDER_FEMALE, "N");
        aD.put("g", "n");
        aD.put("h", ag);
        aD.put("i", "M");
        aD.put(com.mbridge.msdk.foundation.same.report.j.b, "E");
        aD.put("k", "W");
        aD.put("l", "g");
        aD.put("m", Marker.ANY_NON_NULL_MARKER);
        aD.put("n", "T");
        aD.put("o", "C");
        aD.put("p", "K");
        aD.put("q", "q");
        aD.put("r", "m");
        aD.put("s", "s");
        aD.put("t", "h");
        aD.put("u", "p");
        aD.put("v", "A");
        aD.put("w", "t");
        aD.put(VastAttributes.HORIZONTAL_POSITION, "R");
        aD.put(VastAttributes.VERTICAL_POSITION, "P");
        aD.put("z", "J");
        aD.put("=", "=");
    }

    public static class a {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;

        public String toString() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            StringBuilder sb = new StringBuilder();
            String str9 = "";
            if (this.a != null) {
                str = this.a + " ";
            } else {
                str = "";
            }
            sb.append(str);
            if (this.b != null) {
                str2 = this.b + " ";
            } else {
                str2 = "";
            }
            sb.append(str2);
            if (this.c != null) {
                str3 = this.c + " ";
            } else {
                str3 = "";
            }
            sb.append(str3);
            if (this.d != null) {
                str4 = this.d + " ";
            } else {
                str4 = "";
            }
            sb.append(str4);
            if (this.e != null) {
                str5 = this.e + " ";
            } else {
                str5 = "";
            }
            sb.append(str5);
            if (this.f != null) {
                str6 = this.f + " ";
            } else {
                str6 = "";
            }
            sb.append(str6);
            if (this.g != null) {
                str7 = this.g + " ";
            } else {
                str7 = "";
            }
            sb.append(str7);
            if (this.h != null) {
                str8 = this.h + " ";
            } else {
                str8 = "";
            }
            sb.append(str8);
            if (this.i != null) {
                str9 = this.i + " ";
            }
            sb.append(str9);
            return sb.toString();
        }
    }

    public static void a(String str, String str2, String str3) {
        if (!str.equals(com.safedk.android.utils.h.o) && b(str3)) {
            Logger.d(n, "add multiple ads downstream struct started, sdkPackageName= ", str, ", webViewAddress= ", str2, ", url= ", str3);
            BannerFinder A2 = SafeDK.getInstance().A();
            if (A2 != null) {
                List<CreativeInfo> a2 = A2.a(str, str2);
                if (a2 != null && !a2.isEmpty()) {
                    Logger.d(n, "add multiple ads downstream struct - found CIs by webView= ", a2);
                    for (CreativeInfo creativeInfo : a2) {
                        synchronized (creativeInfo) {
                            if (creativeInfo.an()) {
                                Logger.d(n, "add multiple ads downstream struct - CI is already multi, not adding ", CreativeInfo.aH, " to CI= ", creativeInfo.aa());
                            } else if (creativeInfo.h() != null && creativeInfo.h().contains(CreativeInfo.aH)) {
                                Logger.d(n, "add multiple ads downstream struct - already added ", CreativeInfo.aH, " to CI= ", creativeInfo.aa());
                            } else {
                                Logger.d(n, "add multiple ads downstream struct - adding ", CreativeInfo.aH, " to CI= ", creativeInfo.aa());
                                creativeInfo.a(CreativeInfo.aH, "");
                            }
                        }
                    }
                    return;
                }
                Logger.d(n, "add multiple ads downstream struct - CI list is null or empty. sdkPackageName = ", str, ", webViewAddress = ", str2);
            }
        }
    }

    public static boolean a(String str) {
        return str != null && str.contains(".rayjump.com") && str.contains("openapi/ad");
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator<String> it = m.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static void b(String str, String str2, String str3) {
        com.safedk.android.analytics.brandsafety.o r2;
        CreativeInfo j2;
        if (a(str2)) {
            Logger.d(n, "handle DSP recommendations prefetch, URL:", str2);
            InterstitialFinder z2 = SafeDK.getInstance().z();
            if (z2 != null && (r2 = z2.r(str)) != null && (j2 = r2.j()) != null) {
                Logger.d(n, "handle DSP recommendations prefetch, CI: ", j2.aa());
                a(j2, str2, str3);
            }
        }
    }

    private static void a(CreativeInfo creativeInfo, String str, String str2) {
        JSONObject optJSONObject;
        Logger.d(n, "handle dsp recommendations prefetch - started, url= ", str);
        Logger.d(n, "handle dsp recommendations prefetch - bufferValue= ", str2);
        if (creativeInfo != null && str != null && str2 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                if (jSONObject.getInt("status") == 1 && (optJSONObject = jSONObject.optJSONObject("data")) != null && a(optJSONObject)) {
                    Logger.d(n, "handle dsp recommendations prefetch - buffer is recommendations prefetch, calling handleRecommendationsPrefetch");
                    a(creativeInfo, optJSONObject);
                }
            } catch (JSONException e2) {
                Logger.d(n, "handle dsp recommendations prefetch - not a valid JSON string, exception: ", e2);
            } catch (Throwable th) {
                Logger.d(n, "handle dsp recommendations prefetch - encountered exception: ", th);
            }
        }
    }

    public static CreativeInfo a(CreativeInfo creativeInfo, JSONObject jSONObject) {
        Logger.d(n, "handle recommendations prefetch - started");
        if (creativeInfo.Q().equals(com.safedk.android.utils.h.o)) {
            creativeInfo = b(creativeInfo);
        }
        ArrayList<b> b2 = b(jSONObject);
        Iterator<b> it = b2.iterator();
        while (it.hasNext()) {
            b next = it.next();
            creativeInfo.a(next.a, next.b);
            Logger.printFullVerboseLog(n, "handle recommendations prefetch - added recommendation= ", next.a, ", resource list= ", next.b);
        }
        creativeInfo.d();
        creativeInfo.u("added_recs (" + com.safedk.android.utils.n.e() + "):" + b2.size());
        return creativeInfo;
    }

    public static CreativeInfo b(CreativeInfo creativeInfo, JSONObject jSONObject) {
        Logger.d(n, "handle inter second prefetch - started");
        if (creativeInfo.Q().equals(com.safedk.android.utils.h.o)) {
            creativeInfo = b(creativeInfo);
        }
        Iterator<b> it = b(jSONObject).iterator();
        while (it.hasNext()) {
            b next = it.next();
            creativeInfo.a(next.a, new HashSet());
            Logger.printFullVerboseLog(n, "handle inter second prefetch - added recommendation= ", next.a);
        }
        creativeInfo.d();
        String h2 = creativeInfo.h() != null ? creativeInfo.h() : "";
        if (!h2.contains(CreativeInfo.aH)) {
            creativeInfo.e(h2 + CreativeInfo.aH);
        }
        return creativeInfo;
    }

    public static void c(String str) {
        Logger.d(n, "handle dsp complementary prefetch - started. message= ", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            Logger.d(n, "handle dsp complementary prefetch - jsonObject= ", jSONObject);
            String optString = jSONObject.optString("sdkId");
            Logger.d(n, "handle dsp complementary prefetch - sdk= ", optString);
            String optString2 = jSONObject.optString(as);
            Logger.d(n, "handle dsp complementary prefetch - webViewAddress= ", optString2);
            if (!TextUtils.isEmpty(optString) && !optString.equals(com.safedk.android.utils.h.o) && !TextUtils.isEmpty(optString2)) {
                String string = jSONObject.getString(at);
                Logger.d(n, "handle dsp complementary prefetch - direction= ", string);
                if (!TextUtils.isEmpty(string) && string.equals(au)) {
                    Logger.d(n, "handle dsp complementary prefetch - full screen recommendations");
                    a(jSONObject, optString, optString2);
                } else {
                    Logger.d(n, "handle dsp complementary prefetch - banner complementary");
                    b(jSONObject, optString, optString2);
                }
            }
        } catch (JSONException e2) {
            Logger.d(n, "handle dsp complementary prefetch - message is not a valid JSON. exception= ", e2);
        } catch (Exception e3) {
            Logger.d(n, "handle dsp complementary prefetch - encountered exception= ", e3);
        }
    }

    public static void a(CreativeInfo creativeInfo) {
        String h2 = creativeInfo.h();
        if (h2 != null) {
            creativeInfo.e(h2.replace(CreativeInfo.aH, ""));
        }
    }

    private static void a(JSONObject jSONObject, String str, String str2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(av);
            Logger.d(n, "handle dsp fullScreen recommendations - jsonArray= ", optJSONArray);
            if (optJSONArray != null) {
                List<CreativeInfo> a2 = a(str, str2);
                Logger.d(n, "handle dsp fullScreen recommendations - found CIs= ", a2);
                for (CreativeInfo creativeInfo : a2) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        String str3 = (String) optJSONArray.get(i2);
                        Logger.d(n, "handle dsp fullScreen recommendations - removing image from webView resources: ", str3);
                        creativeInfo.G(str3);
                    }
                }
            }
        } catch (JSONException e2) {
            Logger.d(n, "handle dsp fullScreen recommendations - exception= ", e2);
        }
    }

    private static void b(JSONObject jSONObject, String str, String str2) {
        try {
            String optString = jSONObject.optString("url");
            Logger.d(n, "handle dsp banner complementary prefetch - url is dsp complementary url= ", optString);
            if (!b(optString)) {
                Logger.d(n, "handle dsp banner complementary prefetch - sdk field is empty or is Mintegral sdk, returning. sdk= ", str);
                return;
            }
            String optString2 = jSONObject.optString(ax);
            if (TextUtils.isEmpty(optString2)) {
                Logger.d(n, "handle dsp banner complementary prefetch - adsData field is null or empty, returning. adsDataString= ", optString2);
            } else {
                JSONObject jSONObject2 = new JSONObject(optString2);
                Logger.d(n, "handle dsp banner complementary prefetch - responsePrefetch= ", jSONObject2);
                JSONObject optJSONObject = jSONObject2.optJSONObject("data");
                Logger.d(n, "handle dsp banner complementary prefetch - adsData= ", optJSONObject);
                if (optJSONObject != null) {
                    for (CreativeInfo creativeInfo : a(str, str2)) {
                        if (c(optJSONObject)) {
                            Logger.d(n, "handle dsp banner complementary prefetch - ads data is recommendation, calling handleRecommendationsPrefetch");
                            creativeInfo = a(creativeInfo, optJSONObject);
                        } else {
                            Logger.d(n, "handle dsp banner complementary prefetch - ads data is second (multi) ad, calling handleSecondMultiAd");
                            c(creativeInfo, optJSONObject);
                        }
                        a(creativeInfo);
                    }
                }
            }
        } catch (JSONException e2) {
            Logger.d(n, "handle dsp banner complementary prefetch - message is not a valid JSON. exception= ", e2);
        } catch (Exception e3) {
            Logger.d(n, "handle dsp banner complementary prefetch - encountered exception= ", e3);
        }
    }

    public static void c(CreativeInfo creativeInfo, JSONObject jSONObject) {
        Logger.d(n, "handle second multi ad - started, firstCI= ", creativeInfo);
        List<CreativeInfo> a2 = a(jSONObject, creativeInfo, creativeInfo.Q, (c.a) null);
        if (!a2.isEmpty()) {
            Logger.d(n, "handle second multi ad - CIs generated= ", a2);
            creativeInfo.a(com.safedk.android.analytics.brandsafety.m.b, new m.a[0]);
            creativeInfo.ao();
            a(creativeInfo);
            StringBuilder sb = new StringBuilder();
            sb.append(creativeInfo.h() != null ? creativeInfo.h() : "");
            sb.append(creativeInfo.Q().equals(com.safedk.android.utils.h.o) ? CreativeInfo.aI : ac);
            String str = sb.toString() + CreativeInfo.aG + (a2.size() + 1);
            creativeInfo.e(str);
            Logger.d(n, "handle second multi ad - updating downstream struct of first CI to= ", str);
            SafeDK.getInstance().A().a(creativeInfo);
            for (CreativeInfo creativeInfo2 : a2) {
                creativeInfo2.h(creativeInfo.n());
                creativeInfo2.ao();
                creativeInfo2.e(creativeInfo.h());
                creativeInfo2.j(creativeInfo.F());
                if (creativeInfo.X() != null) {
                    creativeInfo2.b(creativeInfo.ak(), creativeInfo.aj());
                    Logger.printFullVerboseLog(n, "handle second multi ad - finished updating second CI, calling setCreativeInAdFinder. second CI= ", creativeInfo2);
                    CreativeInfoManager.a(creativeInfo2, creativeInfo.X(), creativeInfo.Y(), creativeInfo.W());
                } else {
                    Logger.d(n, "handle second multi ad - not matched yet, adding CI to multi ad list");
                    AdNetworkDiscovery j2 = CreativeInfoManager.j(creativeInfo.Q());
                    if (j2 != null) {
                        j2.a(creativeInfo, creativeInfo.L());
                        j2.a(creativeInfo2, creativeInfo.L());
                    }
                }
            }
            return;
        }
        Logger.d(n, "handle second multi ad - could not generate second CI");
    }

    public static List<CreativeInfo> a(JSONObject jSONObject, CreativeInfo creativeInfo, String str, c.a aVar) {
        BrandSafetyEvent.AdFormatType valueOf;
        BrandSafetyUtils.AdType K2;
        int i2 = 1;
        Logger.d(n, "generate CI - started");
        ArrayList arrayList = new ArrayList();
        Map<String, String> i3 = i(jSONObject);
        int i4 = 2;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("ads");
            Logger.d(n, "generate CI - ads size= ", Integer.valueOf(jSONArray.length()));
            int i5 = 0;
            while (i5 < jSONArray.length()) {
                Object[] objArr = new Object[i4];
                objArr[0] = "generate CI - Looping over ad index= ";
                objArr[i2] = Integer.valueOf(i5);
                Logger.d(n, objArr);
                JSONObject jSONObject2 = jSONArray.getJSONObject(i5);
                JSONObject optJSONObject = jSONObject2.optJSONObject("aks");
                Map<String, String> g2 = g(optJSONObject);
                String optString = jSONObject2.optString("impression_url", null);
                Object[] objArr2 = new Object[i4];
                objArr2[0] = "generate CI - impression url template: ";
                objArr2[i2] = optString;
                Logger.d(n, objArr2);
                a a2 = a(optJSONObject, optString, i3, g2);
                String a3 = a(a2);
                if (a3 == null) {
                    Object[] objArr3 = new Object[i2];
                    objArr3[0] = "generate CI - adId is null, skipping this ad";
                    Logger.d(n, objArr3);
                } else {
                    Object[] objArr4 = new Object[i4];
                    objArr4[0] = "generate CI - adId= ";
                    objArr4[i2] = a3;
                    Logger.d(n, objArr4);
                    if (creativeInfo == null) {
                        Pair<BrandSafetyEvent.AdFormatType, BrandSafetyUtils.AdType> f2 = f(jSONObject);
                        valueOf = (BrandSafetyEvent.AdFormatType) f2.first;
                        K2 = (BrandSafetyUtils.AdType) f2.second;
                    } else {
                        valueOf = BrandSafetyEvent.AdFormatType.valueOf(creativeInfo.I());
                        K2 = creativeInfo.K();
                    }
                    Object[] objArr5 = new Object[4];
                    objArr5[0] = "generate CI - adFormat= ";
                    objArr5[i2] = valueOf;
                    objArr5[2] = " BrandSafety adType= ";
                    objArr5[3] = K2;
                    Logger.d(n, objArr5);
                    String string = jSONObject2.getString("id");
                    String a4 = a(jSONObject2, i3, g2);
                    String f3 = f(jSONObject2.getString("video_url"));
                    String string2 = jSONObject2.getString("image_url");
                    MintegralCreativeInfo mintegralCreativeInfo = new MintegralCreativeInfo(a3, K2, string, a4, f3, string2, valueOf, com.safedk.android.utils.k.d(jSONObject.getString("end_screen_url"), "unit_id"), str, a(jSONObject, jSONArray, K2), false, jSONObject2.getString("package_name"));
                    Logger.d(n, "generate CI - creativeInfo created= ", mintegralCreativeInfo);
                    mintegralCreativeInfo.a(a2.a);
                    Logger.d(n, "generate CI - setting creativeInfo k field= ", a2.a);
                    if (K2 == BrandSafetyUtils.AdType.NATIVE && aVar != null) {
                        Logger.d(n, "generate CI - creativeInfo is native, updating its elements");
                        a(mintegralCreativeInfo, jSONObject2, aVar.b == BrandSafetyEvent.AdFormatType.NATIVE);
                    }
                    if (creativeInfo != null) {
                        Logger.d(n, "generate CI - Mintegral dsp, updating sdk to: ", creativeInfo.Q());
                        mintegralCreativeInfo.s(creativeInfo.Q());
                        mintegralCreativeInfo.n(com.safedk.android.utils.h.o);
                    }
                    a(mintegralCreativeInfo, jSONObject2, string2);
                    arrayList.add(mintegralCreativeInfo);
                    a(mintegralCreativeInfo, K2, jSONObject, jSONArray);
                    a(mintegralCreativeInfo, jSONObject, i5);
                    d(mintegralCreativeInfo, jSONObject2);
                    e(mintegralCreativeInfo, jSONObject2);
                    if (jSONObject2.has("adv_id") && jSONObject2.getInt("adv_id") == 0) {
                        mintegralCreativeInfo.e(mintegralCreativeInfo.h() + "/adv_id_0");
                        Logger.d(n, "downstream struct added programmatic indicator");
                    }
                }
                i5++;
                i2 = 1;
                i4 = 2;
            }
        } catch (JSONException e2) {
            Logger.d(n, "generate CI - could not extract ads array, exception= ", e2);
        }
        return arrayList;
    }

    private static void d(CreativeInfo creativeInfo, JSONObject jSONObject) {
        try {
            if (jSONObject.has("ad_tracking")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("ad_tracking");
                if (jSONObject2.has("impression")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("impression");
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        creativeInfo.x(jSONArray.getString(i2));
                    }
                }
            }
        } catch (JSONException e2) {
            Logger.d(n, "add impression tracking URLs - could not extract impression urls, exception= ", e2);
        }
    }

    private static void e(CreativeInfo creativeInfo, JSONObject jSONObject) {
        try {
            String str = "";
            if (jSONObject.has("ext_data")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("ext_data");
                if (jSONObject2.has(B)) {
                    str = "|par_dspid=" + jSONObject2.getInt(B);
                }
                if (jSONObject2.has(C)) {
                    str = str + "|slot_id=" + jSONObject2.getInt(C);
                }
            }
            if (!TextUtils.isEmpty(str)) {
                creativeInfo.u(str);
            }
        } catch (JSONException e2) {
            Logger.d(n, "parsing exception= ", e2.getMessage());
        }
    }

    private static CreativeInfo b(CreativeInfo creativeInfo) {
        CreativeInfo j2;
        com.safedk.android.analytics.brandsafety.o r2 = SafeDK.getInstance().z().r(creativeInfo.Q());
        if (r2 != null && (j2 = r2.j()) != null && creativeInfo != j2 && creativeInfo.L().equals(j2.L())) {
            Logger.d(n, "get current displaying Ci - found currently displayed instance= ", creativeInfo.aa());
            return j2;
        }
        return creativeInfo;
    }

    public static boolean a(JSONObject jSONObject) {
        boolean z2 = d(jSONObject) == 295;
        Logger.d(n, "is complementary prefetch - returning= ", Boolean.valueOf(z2));
        return z2;
    }

    public static ArrayList<b> b(JSONObject jSONObject) {
        ArrayList<b> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("ads");
            Logger.d(n, "generate recommendations - number of recommendations= ", Integer.valueOf(jSONArray.length()));
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                b bVar = new b();
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                bVar.a = jSONObject2.getString("package_name");
                bVar.b.addAll(com.safedk.android.utils.n.f(jSONObject2.toString().replace("\\/", "/")));
                Logger.d(n, "generate recommendations - generating recommendation num ", Integer.valueOf(i2), ". packageName= ", bVar.a, ", resources= ", bVar.b);
                arrayList.add(bVar);
            }
        } catch (JSONException e2) {
            Logger.d(n, "generate recommendations - exception while generating recommendations. exception= ", e2);
        }
        return arrayList;
    }

    public static boolean c(JSONObject jSONObject) {
        boolean z2;
        if (jSONObject != null) {
            try {
                z2 = jSONObject.getJSONArray("ads").length() > 2;
            } catch (JSONException e2) {
            }
            Logger.d(n, "is recommendations prefetch - returning= ", Boolean.valueOf(z2));
            return z2;
        }
        z2 = false;
        Logger.d(n, "is recommendations prefetch - returning= ", Boolean.valueOf(z2));
        return z2;
    }

    private static List<CreativeInfo> a(String str, String str2) {
        List<CreativeInfo> a2;
        for (com.safedk.android.analytics.brandsafety.b bVar : SafeDK.getInstance().y()) {
            if (bVar != null && (a2 = bVar.a(str, str2)) != null && !a2.isEmpty()) {
                return a2;
            }
        }
        return new ArrayList();
    }

    private static void a(MintegralCreativeInfo mintegralCreativeInfo, JSONObject jSONObject, int i2) {
        ArrayList<b> b2;
        if (e(jSONObject.optString("mof_template_url", null)) && (b2 = b(jSONObject)) != null && b2.size() == 2) {
            b bVar = b2.get(1 - i2);
            mintegralCreativeInfo.b(bVar.a, bVar.b);
            Logger.d(n, "add choose ad recommendations - updating creative info recommendations: ", bVar);
        }
    }

    private static void a(CreativeInfo creativeInfo, BrandSafetyUtils.AdType adType, JSONObject jSONObject, JSONArray jSONArray) {
        if (adType.equals(BrandSafetyUtils.AdType.INTERSTITIAL) && jSONArray.length() > 1) {
            String optString = jSONObject.optString("mof_template_url");
            if (!TextUtils.isEmpty(optString)) {
                Logger.d(n, "set mof template url - adding mofTemplateYrl to debug info= ", optString);
                creativeInfo.u("mofTemplateUrl:" + optString);
            }
        }
    }

    private static void a(CreativeInfo creativeInfo, JSONObject jSONObject, String str) {
        Logger.d(n, "extract and classify urls - started");
        ArrayList<String> f2 = com.safedk.android.utils.n.f(jSONObject.toString().replace("\\/", "/"));
        f2.remove(d.I(str));
        Logger.d(n, "extract and classify urls - prefetchResourcesList= ", f2);
        creativeInfo.b((List<String>) f2);
    }

    private static String a(JSONObject jSONObject, Map<String, String> map, Map<String, String> map2) {
        Logger.d(n, "get click url - started");
        String str = null;
        try {
            String string = jSONObject.getString("click_url");
            Logger.d(n, "get click url - click url from ad object= ", string);
            if (string.isEmpty() && jSONObject.has("cam_html")) {
                String F2 = d.F(jSONObject.getString("cam_html"));
                if (F2 != null) {
                    string = F2;
                }
                Logger.d(n, "get click url - click url from dsp ad= ", string);
            }
            if (string.contains(D) && string.contains(E)) {
                str = a(map2, a(map, string));
                Logger.d(n, "get click url - click url after replacing place holders= ", str);
                return str;
            }
            return string;
        } catch (JSONException e2) {
            Logger.d(n, "get click url - exception while extracting click url. exception= ", e2);
            return str;
        }
    }

    private static String a(JSONObject jSONObject, JSONArray jSONArray, BrandSafetyUtils.AdType adType) {
        Logger.d(n, "generate downstream struct - started");
        String optString = jSONObject.optString("mof_template_url", null);
        String str = "";
        if (e(optString)) {
            String str2 = "" + ab;
            Logger.d(n, "generate downstream struct - downstream struct added: ", ab);
            str = str2;
        }
        if (a(optString, jSONArray, adType)) {
            str = str + CreativeInfo.aH;
            Logger.d(n, "generate downstream struct - downstream struct added: ", CreativeInfo.aH);
        }
        Logger.d(n, "generate downstream struct - final downstream struct: ", str);
        return str;
    }

    private static boolean e(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : Z) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(String str, JSONArray jSONArray, BrandSafetyUtils.AdType adType) {
        if (adType != null && adType.equals(BrandSafetyUtils.AdType.INTERSTITIAL) && jSONArray.length() > 1 && !TextUtils.isEmpty(str)) {
            for (String str2 : aa) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static Pair<BrandSafetyEvent.AdFormatType, BrandSafetyUtils.AdType> f(JSONObject jSONObject) {
        BrandSafetyUtils.AdType adType;
        Logger.d(n, "generate brandSafety ad type and format - started");
        int d2 = d(jSONObject);
        BrandSafetyEvent.AdFormatType adFormatType = null;
        if (d2 != 287) {
            adType = null;
        } else {
            adFormatType = BrandSafetyEvent.AdFormatType.INTER;
            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
        }
        if (d2 == 94) {
            adFormatType = BrandSafetyEvent.AdFormatType.REWARD;
            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
        }
        if (d2 == 296) {
            adFormatType = BrandSafetyEvent.AdFormatType.BANNER;
            adType = BrandSafetyUtils.AdType.BANNER;
        }
        if (d2 == 42) {
            adFormatType = BrandSafetyEvent.AdFormatType.NATIVE;
            adType = BrandSafetyUtils.AdType.NATIVE;
        }
        return new Pair<>(adFormatType, adType);
    }

    private static String f(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = 0;
        while (i2 < str.length()) {
            int i3 = i2 + 1;
            stringBuffer.append(aD.get(str.substring(i2, i3)));
            i2 = i3;
        }
        return new String(Base64.decode(stringBuffer.toString(), 0));
    }

    public static String a(a aVar) {
        int i2;
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(aVar.a)) {
            i2 = 0;
        } else {
            sb.append(aVar.a);
            i2 = 1;
        }
        sb.append(com.safedk.android.analytics.brandsafety.m.ad);
        if (!TextUtils.isEmpty(aVar.c)) {
            sb.append(aVar.c);
            i2++;
        }
        sb.append(com.safedk.android.analytics.brandsafety.m.ad);
        if (!TextUtils.isEmpty(aVar.b)) {
            sb.append(aVar.b);
            i2++;
        }
        sb.append(com.safedk.android.analytics.brandsafety.m.ad);
        if (!TextUtils.isEmpty(aVar.d)) {
            sb.append(aVar.d);
            i2++;
        }
        sb.append(com.safedk.android.analytics.brandsafety.m.ad);
        if (!TextUtils.isEmpty(aVar.e)) {
            sb.append(aVar.e);
            i2++;
        }
        sb.append(com.safedk.android.analytics.brandsafety.m.ad);
        if (!TextUtils.isEmpty(aVar.f)) {
            sb.append(aVar.f);
            i2++;
        }
        sb.append(com.safedk.android.analytics.brandsafety.m.ad);
        if (!TextUtils.isEmpty(aVar.g)) {
            sb.append(aVar.g);
            i2++;
        }
        sb.append(com.safedk.android.analytics.brandsafety.m.ad);
        if (!TextUtils.isEmpty(aVar.h)) {
            sb.append(aVar.h);
            i2++;
        }
        sb.append(com.safedk.android.analytics.brandsafety.m.ad);
        if (!TextUtils.isEmpty(aVar.i)) {
            sb.append(aVar.i);
            i2++;
        }
        if (i2 < 2) {
            Logger.d(n, "generate ad id AKS - not enough params to generate a valid ID: ", sb);
            return null;
        }
        Logger.d(n, "generate ad id AKS - generated ad id = ", sb);
        return sb.toString();
    }

    private static a a(JSONObject jSONObject, String str, Map<String, String> map, Map<String, String> map2) {
        a aVar;
        if (jSONObject == null) {
            aVar = null;
        } else {
            aVar = new a();
            aVar.a = jSONObject.optString("k");
            aVar.c = jSONObject.optString("q");
            aVar.b = jSONObject.optString("r");
            aVar.d = jSONObject.optString("al");
            aVar.e = jSONObject.optString("csp");
            aVar.f = jSONObject.optString("mp");
            aVar.g = jSONObject.optString(ao);
            aVar.h = jSONObject.optString("ap");
            aVar.i = jSONObject.optString(aq);
        }
        if (aVar == null || a(aVar) == null) {
            if (str != null && str.contains(D) && str.contains(E)) {
                str = a(map2, a(map, str));
            }
            return d(str);
        }
        return aVar;
    }

    private static Map<String, String> g(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            try {
                if (jSONObject.has("k")) {
                    hashMap.put("k", jSONObject.getString("k"));
                }
                if (jSONObject.has("q")) {
                    hashMap.put("q", jSONObject.getString("q"));
                }
                if (jSONObject.has("r")) {
                    hashMap.put("r", jSONObject.getString("r"));
                }
                if (jSONObject.has("al")) {
                    hashMap.put("al", jSONObject.getString("al"));
                }
                if (jSONObject.has("csp")) {
                    hashMap.put("csp", jSONObject.getString("csp"));
                }
                if (jSONObject.has("mp")) {
                    hashMap.put("mp", jSONObject.getString("mp"));
                }
                if (jSONObject.has(ao)) {
                    hashMap.put(ao, jSONObject.getString(ao));
                }
                if (jSONObject.has("ap")) {
                    hashMap.put("ap", jSONObject.getString("ap"));
                }
                if (jSONObject.has(aq)) {
                    hashMap.put(aq, jSONObject.getString(aq));
                }
            } catch (JSONException e2) {
                Logger.d(n, "generate ad level place holders map - exception while generating adLevelPlaceHoldersMap. exception= ", e2);
            }
        }
        return hashMap;
    }

    private static Map<String, String> h(JSONObject jSONObject) {
        Map<String, String> hashMap = new HashMap<>();
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("other");
            if (optJSONObject != null && optJSONObject.has("rks")) {
                Object obj = optJSONObject.get("rks");
                if (obj instanceof JSONObject) {
                    hashMap = com.safedk.android.utils.d.a((JSONObject) obj);
                }
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject(M);
            if (optJSONObject2 != null) {
                if (optJSONObject2.has("a")) {
                    hashMap.put("a", optJSONObject2.getString("a"));
                }
                if (optJSONObject2.has("b")) {
                    hashMap.put("b", optJSONObject2.getString("b"));
                }
                if (optJSONObject2.has(ag)) {
                    hashMap.put(ag, optJSONObject2.getString(ag));
                }
            }
        } catch (JSONException e2) {
            Logger.d(n, "generate new format prefetch level place holders map - exception= ", e2);
        }
        return hashMap;
    }

    private static Map<String, String> i(JSONObject jSONObject) {
        Map<String, String> hashMap = new HashMap<>();
        try {
            if (jSONObject.has("rks")) {
                hashMap = com.safedk.android.utils.d.a(jSONObject.getJSONObject("rks"));
                if (jSONObject.has("a")) {
                    hashMap.put("a", jSONObject.getString("a"));
                }
                if (jSONObject.has("b")) {
                    hashMap.put("b", jSONObject.getString("b"));
                }
                if (jSONObject.has(ag)) {
                    hashMap.put(ag, jSONObject.getString(ag));
                }
            }
        } catch (JSONException e2) {
            Logger.d(n, "generate prefetch level place holders map - exception while generating prefetchLevelPlaceHoldersMap. exception= ", e2);
        }
        return hashMap;
    }

    public static a d(String str) {
        try {
            a aVar = new a();
            Map<String, String> a2 = com.safedk.android.utils.k.a(str, false);
            aVar.a = a2.get("k");
            aVar.c = a2.get("q");
            aVar.b = a2.get("r");
            aVar.d = a2.get("al");
            aVar.e = a2.get("csp");
            aVar.f = a2.get("mp");
            aVar.g = a2.get(ao);
            aVar.h = a2.get("ap");
            aVar.i = a2.get(aq);
            Logger.d(n, "generate AKS from impression url - generated AKS data= ", aVar);
            return aVar;
        } catch (Throwable th) {
            Logger.d(n, "generate AKS from impression url - exception while generating AKS from url ", str, ",  exception= ", th.getMessage());
            return null;
        }
    }

    public static int d(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optInt("ad_type", -1);
        }
        return -1;
    }

    private static String a(Map<String, String> map, String str) {
        for (String str2 : map.keySet()) {
            str = str.replace(D + str2 + E, map.get(str2));
        }
        return str;
    }

    private static void a(CreativeInfo creativeInfo, JSONObject jSONObject, boolean z2) {
        String optString = jSONObject.optString("image_url");
        if (z2) {
            creativeInfo.r().remove(optString);
            creativeInfo.A(CreativeInfo.aL + optString);
        } else {
            creativeInfo.y(optString);
        }
        Logger.d(n, "update native prefetch elements - adding main image element= ", optString);
        String optString2 = jSONObject.optString("title");
        if (z2) {
            creativeInfo.A(CreativeInfo.aK + optString2);
        } else {
            creativeInfo.z(optString2);
        }
        Logger.d(n, "update native prefetch elements - adding title element= ", optString2);
        String optString3 = jSONObject.optString("icon_url");
        if (z2) {
            creativeInfo.A(CreativeInfo.aM + optString3);
        } else {
            creativeInfo.y(optString3);
        }
        Logger.d(n, "update native prefetch elements - adding icon url element= ", optString3);
        String optString4 = jSONObject.optString("desc");
        if (z2) {
            creativeInfo.A(CreativeInfo.aN + optString4);
        } else {
            creativeInfo.z(optString4);
        }
        Logger.d(n, "update native prefetch elements - adding body element= ", optString4);
        String optString5 = jSONObject.optString("ctatext");
        if (z2) {
            creativeInfo.A(CreativeInfo.aO + optString5);
        } else {
            creativeInfo.z(optString5);
        }
        Logger.d(n, "update native prefetch elements - adding cta element= ", optString5);
        if (!z2) {
            creativeInfo.f("/native");
        }
    }

    public static boolean e(JSONObject jSONObject) {
        int d2 = d(jSONObject);
        boolean z2 = d2 == 287 || d2 == 94 || d2 == 296 || d2 == 295;
        Logger.d(n, "is supported ad type - returning= ", Boolean.valueOf(z2));
        return z2;
    }

    public static List<CreativeInfo> b(JSONObject jSONObject, CreativeInfo creativeInfo, String str, c.a aVar) {
        StringBuilder sb;
        ArrayList arrayList;
        int i2;
        String str2;
        a aVar2;
        BrandSafetyEvent.AdFormatType valueOf;
        BrandSafetyUtils.AdType K2;
        Iterator it;
        Map<String, String> map;
        char c2 = 1;
        char c3 = 0;
        Logger.d(n, "generate CI from new prefetch - started");
        ArrayList arrayList2 = new ArrayList();
        int i3 = 2;
        try {
            sb = new StringBuilder("root");
            arrayList = new ArrayList();
            String[] strArr = {I, H, G};
            int i4 = 0;
            while (true) {
                i2 = 3;
                if (i4 >= 3) {
                    break;
                }
                String str3 = strArr[i4];
                if (jSONObject.has(str3)) {
                    Object obj = jSONObject.get(str3);
                    if (obj instanceof JSONObject) {
                        JSONObject jSONObject2 = (JSONObject) obj;
                        if (jSONObject2.length() > 0) {
                            sb.append(">");
                            sb.append(str3);
                            a(jSONObject2, sb, arrayList);
                            if (!arrayList.isEmpty()) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                i4++;
            }
            if (arrayList.isEmpty()) {
                sb = new StringBuilder("root");
                a(jSONObject, sb, arrayList);
            }
        } catch (JSONException e2) {
            Logger.d(n, "generate CI from new prefetch - exception= ", e2);
        }
        if (arrayList.isEmpty()) {
            Logger.d(n, "generate CI from new prefetch - no ads root object");
            return arrayList2;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            JSONObject jSONObject3 = (JSONObject) it2.next();
            JSONObject optJSONObject = jSONObject3.optJSONObject("other");
            if (optJSONObject != null && e(optJSONObject)) {
                JSONArray jSONArray = jSONObject3.getJSONArray("ads");
                jSONObject3.optString(L);
                Map<String, String> h2 = h(jSONObject3);
                Object[] objArr = new Object[i3];
                objArr[c3] = "generate CI from new prefetch - ads size= ";
                objArr[c2] = Integer.valueOf(jSONArray.length());
                Logger.d(n, objArr);
                int i5 = 0;
                while (i5 < jSONArray.length()) {
                    Object[] objArr2 = new Object[i3];
                    objArr2[c3] = "generate CI from new prefetch - looping over ad index= ";
                    objArr2[c2] = Integer.valueOf(i5);
                    Logger.d(n, objArr2);
                    JSONObject jSONObject4 = jSONArray.getJSONObject(i5);
                    JSONObject optJSONObject2 = jSONObject4.optJSONObject(N);
                    if (optJSONObject2 == null) {
                        Object[] objArr3 = new Object[i2];
                        objArr3[c3] = "generate CI from new prefetch - no creative_info object at index= ";
                        objArr3[c2] = Integer.valueOf(i5);
                        objArr3[i3] = ", skipping";
                        Logger.d(n, objArr3);
                        it = it2;
                        map = h2;
                    } else {
                        JSONObject optJSONObject3 = jSONObject4.optJSONObject("aks");
                        Map<String, String> g2 = g(optJSONObject3);
                        List<String> j2 = j(jSONObject4);
                        Object[] objArr4 = new Object[i3];
                        objArr4[c3] = "generate CI from new prefetch - impression url templates: ";
                        objArr4[1] = j2;
                        Logger.d(n, objArr4);
                        Iterator<String> it3 = j2.iterator();
                        String str4 = null;
                        a aVar3 = null;
                        while (true) {
                            if (!it3.hasNext()) {
                                str2 = str4;
                                aVar2 = aVar3;
                                break;
                            }
                            aVar3 = a(optJSONObject3, it3.next(), h2, g2);
                            str4 = a(aVar3);
                            if (str4 != null) {
                                Object[] objArr5 = new Object[i3];
                                objArr5[0] = "generate CI from new prefetch - adId: ";
                                objArr5[1] = str4;
                                Logger.d(n, objArr5);
                                str2 = str4;
                                aVar2 = aVar3;
                                break;
                            }
                            Logger.d(n, "generate CI from new prefetch - adId is null, skipping this ad");
                            i3 = 2;
                        }
                        if (creativeInfo == null) {
                            Pair<BrandSafetyEvent.AdFormatType, BrandSafetyUtils.AdType> f2 = f(optJSONObject);
                            BrandSafetyEvent.AdFormatType adFormatType = (BrandSafetyEvent.AdFormatType) f2.first;
                            K2 = (BrandSafetyUtils.AdType) f2.second;
                            valueOf = adFormatType;
                        } else {
                            valueOf = BrandSafetyEvent.AdFormatType.valueOf(creativeInfo.I());
                            K2 = creativeInfo.K();
                        }
                        Logger.d(n, "generate CI from new prefetch - adFormat= ", valueOf, " BrandSafety adType= ", K2);
                        String optString = optJSONObject2.optString("creative_id");
                        String optString2 = optJSONObject2.optString("image_url");
                        MintegralCreativeInfo mintegralCreativeInfo = new MintegralCreativeInfo(str2, K2, optString, k(jSONObject4), f(optJSONObject2.getString("video_url")), optString2, valueOf, null, str, "", false, jSONObject4.getString("package_name"));
                        it = it2;
                        StringBuilder sb2 = new StringBuilder();
                        map = h2;
                        sb2.append("generate CI from new prefetch - path: ");
                        sb2.append((Object) sb);
                        sb2.append(", created CI: ");
                        Logger.d(n, sb2.toString(), mintegralCreativeInfo);
                        mintegralCreativeInfo.u("NFP|adsPath=" + ((Object) sb));
                        if (aVar2 != null) {
                            mintegralCreativeInfo.a(aVar2.a);
                            Logger.d(n, "generate CI from new prefetch - setting creativeInfo k field= ", aVar2.a);
                        }
                        if (K2 == BrandSafetyUtils.AdType.NATIVE && aVar != null) {
                            Logger.d(n, "generate CI from new prefetch - creativeInfo is native, updating its elements");
                            a(mintegralCreativeInfo, optJSONObject2, aVar.b == BrandSafetyEvent.AdFormatType.NATIVE);
                        }
                        if (creativeInfo != null) {
                            Logger.d(n, "generate CI from new prefetch - Mintegral dsp, updating sdk to: ", creativeInfo.Q());
                            mintegralCreativeInfo.s(creativeInfo.Q());
                            mintegralCreativeInfo.n(com.safedk.android.utils.h.o);
                        }
                        a(mintegralCreativeInfo, jSONObject4, optString2);
                        f(mintegralCreativeInfo, jSONObject4);
                        arrayList2.add(mintegralCreativeInfo);
                    }
                    i5++;
                    it2 = it;
                    h2 = map;
                    c2 = 1;
                    c3 = 0;
                    i3 = 2;
                    i2 = 3;
                }
                c2 = 1;
                c3 = 0;
                i3 = 2;
                i2 = 3;
            }
            Logger.d(n, "generate CI from new prefetch - invalid ad type= ", Integer.valueOf(d(optJSONObject)));
            return arrayList2;
        }
        return arrayList2;
    }

    private static void a(JSONObject jSONObject, StringBuilder sb, List<JSONObject> list) throws JSONException {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject = jSONObject.optJSONObject(next);
            if (optJSONObject != null) {
                if (optJSONObject.has("ads")) {
                    sb.append(">");
                    sb.append(next);
                    sb.append(">");
                    sb.append("ads");
                    list.add(optJSONObject);
                    return;
                }
                if (optJSONObject.has(J)) {
                    JSONArray jSONArray = optJSONObject.getJSONArray(J);
                    Logger.d(n, "generate CI from new prefetch - load array size: ", Integer.valueOf(jSONArray.length()));
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        Logger.d(n, "generate CI from new prefetch - load array ", Integer.valueOf(i2), " object detected: ", jSONObject2);
                        if (jSONObject2.has("ads")) {
                            sb.append(">");
                            sb.append(next);
                            sb.append(">");
                            sb.append(J);
                            sb.append(">");
                            sb.append(i2);
                            sb.append(">");
                            sb.append("ads");
                            list.add(jSONObject2);
                        }
                    }
                    return;
                }
            }
        }
    }

    private static List<String> j(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject optJSONObject2 = jSONObject.optJSONObject(S);
            if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject(T)) != null && (optJSONArray = optJSONObject.optJSONArray(U)) != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    arrayList.add(optJSONArray.getString(i2));
                }
            }
        } catch (JSONException e2) {
            Logger.d(n, "extract new format impression urls - exception= ", e2);
        }
        return arrayList;
    }

    private static String k(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject(P);
        if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject(Q)) != null) {
            return optJSONObject.optString(R);
        }
        return null;
    }

    private static void f(CreativeInfo creativeInfo, JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        try {
            JSONObject optJSONObject2 = jSONObject.optJSONObject(S);
            if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject(V)) != null && (optJSONArray = optJSONObject.optJSONArray(W)) != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    creativeInfo.x(optJSONArray.getString(i2));
                }
            }
        } catch (JSONException e2) {
            Logger.d(n, "add new format impression tracking URLs - exception= ", e2);
        }
    }
}

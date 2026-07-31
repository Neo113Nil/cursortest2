package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.ProtobufMessageParser;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.BidMachineCreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends d {
    private static final String V = "events";
    private static final String W = "html";
    private static final String X = "image";
    private static final String Y = "internalProtobuf";
    private static final String Z = "name";
    private static final String aa = "native";
    private static final String ab = "phases";
    private static final String ac = "ads";
    private static final String ad = "source";
    private static final String ae = "tasks";
    private static final String af = "text";
    private static final String ag = "title";
    private static final String ah = "type";
    private static final String ai = "value";
    private static final String aj = "vast";
    private static final String ak = "version";
    private static final String al = "response_cache_url";
    private static final String am = "text";
    private static final String an = "xml";
    private static final String ao = "html";
    private static final String ap = "fragmented_video_template/";
    private static final String aq = "mraid2";
    private static final String ar = "[\\n\\s'\"\\/]";
    private static final String as = ".mp4";
    private static final String at = "mraid://open";
    private static final String au = "url";
    private static final String av = "mraid://expand";
    private static final String aw = "bidmachine.io/bid-context/";
    private static final String ax = "/track/";
    private static final String ay = "{\"2\":[\"contextId\",\"string\"]}";
    public static final String b = "{\"1\":[\"version\",\"string\"],\"5\":{\"6\":{\"1\":[\"buyerId\",\"string\"],\"3\":{\"1\":[\"adId\",\"string\"],\"13\":{\"2\":{\"1\":[\"creativeId\",\"string\"],\"2\":[\"adDomain\",\"string\"],\"3\":[\"advertisedContent\",\"string\"],\"13\":{\"8\":[\"html\",\"string\"],\"11\":{\"1\":{\"1\":[\"clickUrl\",\"string\"],\"3\":[\"dspDomains\",\"array\",\"string\"]},\"2\":[\"native\",\"array\",{\"1\":[\"type\",\"i32\"],\"3\":{\"1\":[\"title\",\"string\"]},\"4\":{\"1\":[\"image\",\"string\"]},\"6\":{\"1\":[\"text\",\"string\"]}}]}},\"14\":{\"4\":[\"vast\",\"string\"]},\"17\":{\"2\":{\"29\":{\"2\":[\"internalProtobuf\",\"string\"]},\"33\":{\"3\":[\"phases\",\"array\",{\"3\":[\"ads\",\"array\",{\"1\":[\"name\",\"string\"],\"2\":[\"type\",\"i32\"],\"3\":[\"source\",\"string\"]}],\"6\":[\"events\",\"array\",{\"3\":[\"tasks\",\"array\",{\"1\":[\"name\",\"i32\"],\"3\":[\"value\",\"string\"]}]}]}]}}}}}}}}}";
    private static final String c = "BidMachineDiscovery";
    private static final String h = "{\"2\":[\"response_cache_url\",\"string\"]}";
    private static final String i = "{\"3\":{\"1\":[\"version\",\"string\"],\"5\":{\"6\":{\"1\":[\"buyerId\",\"string\"],\"3\":{\"1\":[\"adId\",\"string\"],\"13\":{\"2\":{\"1\":[\"creativeId\",\"string\"],\"2\":[\"adDomain\",\"string\"],\"3\":[\"advertisedContent\",\"string\"],\"13\":{\"8\":[\"html\",\"string\"],\"11\":{\"1\":{\"1\":[\"clickUrl\",\"string\"],\"3\":[\"dspDomains\",\"array\",\"string\"]},\"2\":[\"native\",\"array\",{\"1\":[\"type\",\"i32\"],\"3\":{\"1\":[\"title\",\"string\"]},\"4\":{\"1\":[\"image\",\"string\"]},\"6\":{\"1\":[\"text\",\"string\"]}}]}},\"14\":{\"4\":[\"vast\",\"string\"]},\"17\":{\"2\":{\"29\":{\"2\":[\"internalProtobuf\",\"string\"]},\"33\":{\"3\":[\"phases\",\"array\",{\"3\":[\"ads\",\"array\",{\"1\":[\"name\",\"string\"],\"2\":[\"type\",\"i32\"],\"3\":[\"source\",\"string\"]}],\"6\":[\"events\",\"array\",{\"3\":[\"tasks\",\"array\",{\"1\":[\"name\",\"i32\"],\"3\":[\"value\",\"string\"]}]}]}]}}}}}}}}}}";
    private static final String j = "{\"2\":{\"6\":{\"9\":{\"8\":{\"3\":[\"trackingURLs3\",\"array\",\"string\"],\"5\":[\"trackingURLs5\",\"array\",\"string\"],\"6\":[\"trackingURLs6\",\"array\",\"string\"]},\"19\":{\"1\":[\"trackingURLs1\",\"array\",\"string\"]}}}}}";
    private static final String k = "adDomain";
    private static final String l = "advertisedContent";
    private static final String m = "adId";
    private static final String n = "buyerId";
    private static final String o = "clickUrl";
    private static final String p = "creativeId";
    private static final String q = "dspDomains";
    private static final String d = "bidmachine.io";
    private static final String e = "lazybumblebee.com";
    private static final String f = "bm-ads.io";
    private static final List<String> g = Arrays.asList(d, e, f);
    private static final Map<String, Set<CreativeInfo>> az = new HashMap();
    private static final Map<Integer, Set<CreativeInfo>> aA = new HashMap();
    private static final Map<String, CreativeInfo> aB = new HashMap();
    private static final Map<String, CreativeInfo> aC = new HashMap();
    private static final Map<String, c.a> aD = new HashMap();
    private static final Map<String, CreativeInfo> aE = new HashMap();

    public e() {
        super("io.bidmachine", c);
        this.E.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_NATIVE_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MEDIA_PLAYER_RELEASE_EOV, true);
        this.E.b(AdNetworkConfiguration.USE_INPUT_STREAM_EVENT_AS_RESOURCE_LOADED_INDICATION, true);
        this.E.b(AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT_FULLSCREEN, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, true);
        this.E.b(AdNetworkConfiguration.SHOULD_ADD_BYTE_ARRAY_AS_PARAM_ON_AD_FETCHED, true);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map, c.a aVar, byte[] bArr) throws JSONException {
        Logger.printFullVerboseLog(c, "generate info impl - started. url: ", str, ", maxParams: ", aVar);
        if (aVar != null) {
            JSONObject a = ProtobufMessageParser.a(Base64.decode(str2, 0), h);
            Logger.printFullVerboseLog(c, "generate info impl - response cache url json extracted: \n", a.toString(4));
            if (a.has(al)) {
                String string = a.getString(al);
                Logger.d(c, "generate info impl - saving max params= ", aVar, ",        response cache url= ", string);
                aD.put(string, aVar);
                return null;
            }
            Logger.d(c, "generate info impl - old protobuf message, use old protobuf message template");
            return a(str, Base64.decode(str2, 0), i, aVar);
        }
        Logger.d(c, "generate info impl - new protobuf message, use new protobuf message template");
        return a(str, bArr, b, aD.remove(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0082 A[Catch: JSONException -> 0x02f8, TryCatch #1 {JSONException -> 0x02f8, blocks: (B:9:0x001e, B:11:0x0030, B:13:0x0040, B:15:0x004b, B:17:0x0053, B:19:0x0082, B:20:0x00a6, B:24:0x00ad, B:26:0x00bd, B:27:0x00d0, B:29:0x00df, B:30:0x0105, B:32:0x010d, B:33:0x013c, B:35:0x0144, B:37:0x0172, B:38:0x017c, B:40:0x0184, B:41:0x0197, B:43:0x019d, B:44:0x01ed, B:46:0x0206, B:47:0x0221, B:49:0x0229, B:50:0x0244, B:52:0x024c, B:53:0x0267, B:55:0x026f, B:56:0x028a, B:58:0x0292, B:59:0x029f, B:60:0x02a3, B:62:0x02a9, B:64:0x02bb, B:66:0x02df, B:67:0x02eb, B:69:0x01c5, B:71:0x01cd, B:75:0x02f6, B:22:0x00a7, B:23:0x00ac), top: B:8:0x001e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<CreativeInfo> a(String str, byte[] bArr, String str2, c.a aVar) {
        List<CreativeInfo> list;
        int i2;
        String str3;
        String optString;
        Logger.d(c, "generate ci impl - max params= ", aVar);
        if (bArr == null) {
            list = null;
            i2 = 1;
        } else if (aVar == null) {
            list = null;
            i2 = 1;
        } else {
            try {
                JSONObject a = ProtobufMessageParser.a(bArr, str2);
                JSONObject jSONObject = new JSONObject();
                if (a.has(Y)) {
                    str3 = a.getString(Y);
                    byte[] decode = Base64.decode(str3, 0);
                    if (!TextUtils.isEmpty(str3)) {
                        if (!com.safedk.android.utils.n.n(new String(decode))) {
                            jSONObject = ProtobufMessageParser.a(decode, j);
                        }
                        Logger.printFullVerboseLog(c, "generate ci impl - outer json extracted: \n", a.toString(4));
                        Logger.printFullVerboseLog(c, "generate ci impl - inner json extracted: \n", jSONObject.toString(4));
                        optString = a.optString("adId");
                        if (TextUtils.isEmpty(optString)) {
                            BidMachineCreativeInfo bidMachineCreativeInfo = new BidMachineCreativeInfo(BrandSafetyUtils.b(aVar.b.name()), "io.bidmachine", optString, this.I, aVar.c, aVar.a);
                            synchronized (this.J) {
                                this.J.put(optString, bidMachineCreativeInfo);
                            }
                            Logger.d(c, "generate info impl - ci saved early by ad id= ", optString);
                            if (str3 != null) {
                                Logger.d(c, "generate ci impl - saving ci by context id= ", str3);
                                aB.put(str3, bidMachineCreativeInfo);
                            }
                            bidMachineCreativeInfo.a(aVar.b);
                            String str4 = "";
                            if (a.has("html")) {
                                str4 = "mraid";
                                Logger.d(c, "generate ci impl - media value is mraid!");
                                f(bidMachineCreativeInfo, a.optString("html"));
                            }
                            if (a.has("vast")) {
                                str4 = str4 + "vast";
                                Logger.d(c, "generate ci impl - media value is vast!");
                                a((CreativeInfo) bidMachineCreativeInfo, (String) null, a.getString("vast"), true);
                                e(bidMachineCreativeInfo, bidMachineCreativeInfo.H());
                            }
                            if (a.has("native")) {
                                str4 = str4 + "native";
                                Logger.d(c, "generate ci impl - media value is native!");
                                a((CreativeInfo) bidMachineCreativeInfo, a.getJSONArray("native"));
                                if (a.has("clickUrl")) {
                                    bidMachineCreativeInfo.a(a.getString("clickUrl"), true);
                                }
                                if (str.contains(aw)) {
                                    Logger.d(c, "generate ci impl - saving native ci by url= ", str);
                                    aE.put(str, bidMachineCreativeInfo);
                                }
                            }
                            if (a(a)) {
                                Logger.d(c, "generate ci impl - media value is spread vast!");
                                str4 = str4 + ap;
                                b((CreativeInfo) bidMachineCreativeInfo, a);
                                e(bidMachineCreativeInfo, bidMachineCreativeInfo.H());
                            } else if (a.has(ab)) {
                                Logger.d(c, "generate ci impl - media value is spread mraid!");
                                str4 = str4 + aq;
                                a((CreativeInfo) bidMachineCreativeInfo, a);
                            }
                            bidMachineCreativeInfo.e(str4);
                            Logger.d(c, "generate ci impl - setting downstream struct to= ", str4);
                            if (a.has(n)) {
                                bidMachineCreativeInfo.m(a.getString(n));
                                Logger.d(c, "generate ci impl - setting buyer id to= ", bidMachineCreativeInfo.P());
                            }
                            if (a.has("creativeId")) {
                                bidMachineCreativeInfo.k(a.getString("creativeId"));
                                Logger.d(c, "generate ci impl - setting creative id to= ", bidMachineCreativeInfo.N());
                            }
                            if (a.has(k)) {
                                bidMachineCreativeInfo.i(a.getString(k));
                                Logger.d(c, "generate ci impl - setting ad domain to= ", bidMachineCreativeInfo.o());
                            }
                            if (a.has("advertisedContent")) {
                                bidMachineCreativeInfo.a(a.getString("advertisedContent"));
                                Logger.d(c, "generate ci impl - setting advertised content to= ", bidMachineCreativeInfo.P());
                            }
                            if (a.has(q)) {
                                f(bidMachineCreativeInfo, a.getJSONArray(q).toString());
                            }
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                f(bidMachineCreativeInfo, jSONObject.getJSONArray(keys.next()).toString());
                            }
                            String F = F(a.toString().replaceAll("\\\\\"", "\""));
                            Logger.d(c, "generate ci impl - found dsp click url?= ", F);
                            if (!TextUtils.isEmpty(F)) {
                                bidMachineCreativeInfo.a(F.replaceAll("\\\\/", "/"), true);
                            }
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(bidMachineCreativeInfo);
                            return arrayList;
                        }
                        return null;
                    }
                }
                str3 = null;
                Logger.printFullVerboseLog(c, "generate ci impl - outer json extracted: \n", a.toString(4));
                Logger.printFullVerboseLog(c, "generate ci impl - inner json extracted: \n", jSONObject.toString(4));
                optString = a.optString("adId");
                if (TextUtils.isEmpty(optString)) {
                }
            } catch (JSONException e2) {
                Logger.d(c, "generate ci impl - json exception: ", e2);
                return null;
            }
        }
        Object[] objArr = new Object[i2];
        objArr[0] = "generate ci impl - max params or byte array are null, skipping";
        Logger.d(c, objArr);
        return list;
    }

    private static boolean a(JSONObject jSONObject) {
        JSONArray optJSONArray;
        JSONArray optJSONArray2 = jSONObject.optJSONArray(ab);
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                JSONObject optJSONObject = optJSONArray2.optJSONObject(i2);
                if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ads")) != null) {
                    for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                        JSONObject optJSONObject2 = optJSONArray.optJSONObject(i3);
                        if (optJSONObject2 != null) {
                            String optString = optJSONObject2.optString("name");
                            boolean z = !TextUtils.isEmpty(optString) && optString.equals("vast");
                            boolean z2 = optJSONObject2.optInt("type") == 1;
                            boolean z3 = !TextUtils.isEmpty(optJSONObject2.optString("source"));
                            if (z && z2 && z3) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private void a(CreativeInfo creativeInfo, JSONObject jSONObject) {
        JSONArray optJSONArray;
        JSONArray optJSONArray2 = jSONObject.optJSONArray(ab);
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                JSONObject optJSONObject = optJSONArray2.optJSONObject(i2);
                if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ads")) != null) {
                    for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                        JSONObject optJSONObject2 = optJSONArray.optJSONObject(i3);
                        if (optJSONObject2 != null) {
                            int optInt = optJSONObject2.optInt("type");
                            String optString = optJSONObject2.optString("source");
                            if (optInt == 2) {
                                f(creativeInfo, optString);
                            }
                        }
                    }
                }
            }
        }
    }

    private static void b(CreativeInfo creativeInfo, JSONObject jSONObject) {
        JSONArray optJSONArray;
        JSONArray optJSONArray2 = jSONObject.optJSONArray(ab);
        ArrayList<String> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 1;
        char c2 = 0;
        if (optJSONArray2 != null) {
            int i3 = 0;
            boolean z = false;
            while (i3 < optJSONArray2.length()) {
                JSONObject optJSONObject = optJSONArray2.optJSONObject(i3);
                if (optJSONObject != null) {
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("ads");
                    if (optJSONArray3 != null) {
                        for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                            JSONObject optJSONObject2 = optJSONArray3.optJSONObject(i4);
                            if (optJSONObject2 != null) {
                                int optInt = optJSONObject2.optInt("type");
                                String optString = optJSONObject2.optString("source");
                                if (optInt == i2) {
                                    arrayList.add(optString);
                                } else if (optInt == 2) {
                                    arrayList2.add(optString);
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray4 = optJSONObject.optJSONArray("events");
                    if (optJSONArray4 != null) {
                        int i5 = 0;
                        while (i5 < optJSONArray4.length()) {
                            JSONObject optJSONObject3 = optJSONArray4.optJSONObject(i5);
                            if (optJSONObject3 != null && (optJSONArray = optJSONObject3.optJSONArray(ae)) != null) {
                                int i6 = 0;
                                while (i6 < optJSONArray.length()) {
                                    JSONObject optJSONObject4 = optJSONArray.optJSONObject(i6);
                                    if (optJSONObject4 != null) {
                                        int optInt2 = optJSONObject4.optInt("name");
                                        String optString2 = optJSONObject4.optString("value");
                                        if (optInt2 == 4) {
                                            Object[] objArr = new Object[2];
                                            objArr[c2] = "update spread vast dsp domains - adding dsp domain= ";
                                            objArr[1] = optString2;
                                            Logger.d(c, objArr);
                                            creativeInfo.w(optString2);
                                        } else if (optInt2 == 16 && !z) {
                                            creativeInfo.a(optString2, true);
                                            Logger.printFullVerboseLog(c, "update spread vast dsp domains - adding click url= ", optString2);
                                            z = true;
                                        }
                                    }
                                    i6++;
                                    c2 = 0;
                                }
                            }
                            i5++;
                            c2 = 0;
                        }
                    }
                }
                i3++;
                i2 = 1;
                c2 = 0;
            }
        }
        boolean z2 = false;
        for (String str : arrayList) {
            if (str.endsWith(as)) {
                Logger.printFullVerboseLog(c, "handle spread vast video url - adding video url with mp4 extension= ", str);
                creativeInfo.p(str);
                z2 = true;
            }
        }
        if (!z2 && !arrayList.isEmpty()) {
            Logger.printFullVerboseLog(c, "handle spread vast video url - adding first video url (without extension)= ", arrayList.get(0));
            creativeInfo.p((String) arrayList.get(0));
        }
        b(creativeInfo, (List<String>) arrayList);
        c(creativeInfo, (List<String>) arrayList2);
    }

    private static void a(CreativeInfo creativeInfo, JSONObject jSONObject, String str) {
        if (creativeInfo != null && jSONObject != null) {
            String optString = jSONObject.optString("text");
            if (!TextUtils.isEmpty(optString)) {
                Logger.d(c, "update native element from dataAsset - adding as ", str, " prefix. data= ", optString);
                creativeInfo.A(str + optString);
            }
        }
    }

    private static void b(CreativeInfo creativeInfo, JSONObject jSONObject, String str) {
        if (creativeInfo != null && jSONObject != null) {
            String optString = jSONObject.optString("title");
            if (!TextUtils.isEmpty(optString)) {
                Logger.d(c, "update native element from TitleAsset - adding as ", str, " prefix. title= ", optString);
                creativeInfo.A(str + optString);
            }
        }
    }

    private static void c(CreativeInfo creativeInfo, JSONObject jSONObject, String str) {
        if (creativeInfo != null && jSONObject != null) {
            String optString = jSONObject.optString("image");
            if (!TextUtils.isEmpty(optString)) {
                Logger.d(c, "update native element from ImageAsset - adding as ", str, " prefix. image= ", optString);
                creativeInfo.A(str + optString);
            }
        }
    }

    private static void a(CreativeInfo creativeInfo, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i2);
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("type");
                if (optInt == 8) {
                    arrayList.add(optJSONObject);
                } else if (optInt == 123) {
                    b(creativeInfo, optJSONObject, CreativeInfo.aK);
                } else if (optInt == 124) {
                    c(creativeInfo, optJSONObject, CreativeInfo.aM);
                } else if (optInt == 127) {
                    a(creativeInfo, optJSONObject, CreativeInfo.aN);
                } else if (optInt == 128) {
                    c(creativeInfo, optJSONObject, CreativeInfo.aL);
                } else {
                    Logger.d(c, "update native elements - discarded asset= ", optJSONObject);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            a(creativeInfo, (JSONObject) arrayList.get(arrayList.size() - 1), CreativeInfo.aO);
        }
    }

    private static Pattern h() {
        return com.safedk.android.utils.g.a("(?:lazybumblebee\\.com|bidmachine\\.io|bm-ads\\.io)\\/track[^\\?]*?\\?.*?context[^=]*?=([^&]+?)&");
    }

    private static Pattern k() {
        return com.safedk.android.utils.g.a("(?:lazybumblebee\\.com|bidmachine\\.io|bm-ads\\.io)\\/track[^\\?]*?\\?.*?context[^=]*?=([^&]+)");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, WeakReference<WebView> weakReference) {
        CreativeInfo creativeInfo;
        boolean z;
        Logger.d(c, "get ad id from resource - value= ", str);
        if (!TextUtils.isEmpty(str)) {
            String a = a(h(), str);
            Logger.d(c, "get ad id from resource - extracted contextId= ", a);
            if (TextUtils.isEmpty(a)) {
                a = a(k(), str);
                Logger.d(c, "get ad id from resource - extracted contextId (second pattern)= ", a);
            }
            if (!TextUtils.isEmpty(a)) {
                creativeInfo = aB.get(a);
                z = true;
            } else {
                String replaceAll = str.replaceAll(ar, "");
                CreativeInfo creativeInfo2 = null;
                for (String str3 : aC.keySet()) {
                    if (replaceAll.contains(str3)) {
                        creativeInfo2 = aC.get(str3);
                    }
                }
                creativeInfo = creativeInfo2;
                z = false;
            }
            if (creativeInfo != null) {
                Logger.d(c, Logger.FeatureTag.CI_MATCHING, "get ad id from resource - found? ci= ", creativeInfo.aa());
                if ((creativeInfo.z() && !a(c, creativeInfo, aA) && z) || (!creativeInfo.z() && (weakReference == null || weakReference.get() == null))) {
                    Logger.d(c, "get ad id from resource - ci found is vast, but not matched by media player previously, discarding.: ", creativeInfo.aa());
                    return null;
                }
                e(creativeInfo);
                return creativeInfo.L();
            }
        }
        return null;
    }

    private static String C(String str) {
        try {
            return new BigInteger(MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes())).abs().toString(36);
        } catch (Exception e2) {
            Logger.d(c, "get fragmented vast video identifier - exception: ", e2);
            return str;
        }
    }

    public static void b(CreativeInfo creativeInfo, List<String> list) {
        for (String str : list) {
            String C = C(str);
            Logger.d(c, "save fragmented vast video identifier to ci - video url= ", str, ",    video identifier= ", C, ",    ci= ", creativeInfo.aa());
            d(creativeInfo, C);
        }
    }

    public static void c(CreativeInfo creativeInfo, List<String> list) {
        Logger.d(c, "save vast html resources to ci - ci= ", creativeInfo.aa());
        Logger.printFullVerboseLog(c, "save vast html resources to ci - htmlResourceList= ", list);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            Iterator<String> it2 = com.safedk.android.analytics.brandsafety.creatives.h.a(com.safedk.android.analytics.brandsafety.creatives.e.a(), it.next(), 1, false).iterator();
            while (it2.hasNext()) {
                List<String> a = com.safedk.android.analytics.brandsafety.creatives.h.a(com.safedk.android.analytics.brandsafety.creatives.e.c(), it2.next(), 1, false);
                if (!a.isEmpty()) {
                    String str = a.get(0);
                    if (!TextUtils.isEmpty(str)) {
                        aC.put(str.replaceAll(ar, ""), creativeInfo);
                    }
                }
            }
        }
    }

    private static void d(CreativeInfo creativeInfo, String str) {
        Set<CreativeInfo> set = az.get(str);
        if (set == null) {
            set = new HashSet<>();
            az.put(str, set);
        }
        set.add(creativeInfo);
        Logger.d(c, "save vast video identifier to ci - saving to videoIdToCiMap.  videoUrl= ", str, ",    ci= ", creativeInfo.aa());
    }

    private static void e(CreativeInfo creativeInfo, String str) {
        if (!TextUtils.isEmpty(str)) {
            String replaceAll = str.replaceAll("/", "").replaceAll(":", "");
            Logger.d(c, "save vast video url to ci - videoUrl= ", replaceAll);
            if (!TextUtils.isEmpty(replaceAll)) {
                d(creativeInfo, replaceAll);
            }
        }
    }

    private void f(CreativeInfo creativeInfo, String str) {
        ArrayList<String> f2 = com.safedk.android.utils.n.f(str);
        creativeInfo.b((List<String>) f2);
        Iterator<String> it = f2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String a = a(h(), it.next());
            if (!TextUtils.isEmpty(a) && !aB.containsKey(a)) {
                Logger.d(c, "classify resources and save ci by context id - saving to contextIdToCiMap by url, contextId= ", a, ",     ci= ", creativeInfo.aa());
                aB.put(a, creativeInfo);
                break;
            }
        }
        String a2 = a(com.safedk.android.utils.g.a("\\\"&context=([^&]+?)\\\""), str);
        if (!TextUtils.isEmpty(a2) && !aB.containsKey(a2)) {
            Logger.d(c, "classify resources and save ci by context id - saving to contextIdToCiMap by html, contextId= ", a2, ",     ci= ", creativeInfo.aa());
            aB.put(a2, creativeInfo);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(Object obj) {
        int identityHashCode = System.identityHashCode(obj);
        Logger.d(c, "get creative info after media player start call - mediaPlayer= ", obj, ",    player id= ", Integer.valueOf(identityHashCode));
        Set<CreativeInfo> set = aA.get(Integer.valueOf(identityHashCode));
        Logger.d(c, "get creative info after media player start call - found? ci set= ", set);
        if (set != null) {
            if (set.size() == 1) {
                CreativeInfo next = set.iterator().next();
                if (next != null) {
                    Logger.d(c, "get creative info after media player start call - found ci= ", next.aa());
                    e(next);
                    return next.L();
                }
                return null;
            }
            Logger.d(c, "get creative info after media player start call - = could not find ci. ci set= ", set);
            return null;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        Logger.d(c, "handle vast media file - ci id= ", creativeInfo.L(), ",    video url= ", str);
        e(creativeInfo, str);
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected void a(CreativeInfo creativeInfo, List<String> list) {
        c(creativeInfo, list);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean B(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator<String> it = g.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected boolean b(String str, Bundle bundle) {
        boolean z;
        if (aD.containsKey(str)) {
            Logger.d(c, "should follow input stream impl - this is a response cache url, return true");
            return true;
        }
        boolean z2 = H(str) || H(com.safedk.android.utils.k.c(str));
        ArrayList<String> stringArrayList = bundle.getStringArrayList("Content-Type");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            String str2 = stringArrayList.get(0);
            if (!TextUtils.isEmpty(str2)) {
                z = str2.contains("text") || str2.contains(an) || str2.contains("html");
                if (!z2 && z) {
                    StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                    Logger.printFullVerboseLog(c, "should follow input stream impl - thread stack trace= ", Arrays.toString(stackTrace));
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        if (stackTraceElement.getMethodName() != null && stackTraceElement.getMethodName().equals("loadVideoWithDataSync")) {
                            Logger.d(c, "should follow input stream impl - this is inner VastAdTagUri. returning true");
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        z = false;
        if (!z2) {
            StackTraceElement[] stackTrace2 = Thread.currentThread().getStackTrace();
            Logger.printFullVerboseLog(c, "should follow input stream impl - thread stack trace= ", Arrays.toString(stackTrace2));
            while (r0 < r8) {
            }
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean g(String str) {
        for (String str2 : g) {
            if (!TextUtils.isEmpty(str) && str.contains(str2) && str.contains(ax)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, byte[] bArr) {
        byte[] b2;
        if (bArr == null || bArr.length == 0 || !g(str)) {
            return null;
        }
        try {
            b2 = com.safedk.android.utils.c.b(bArr);
        } catch (Throwable th) {
            Logger.e(c, "handle on request sent bytes - error: ", th.getMessage());
        }
        if (b2 == null) {
            Logger.d(c, "handle on request sent bytes - decompression failed");
            return null;
        }
        JSONObject a = ProtobufMessageParser.a(b2, ay);
        String optString = a != null ? a.optString("contextId") : null;
        Logger.d(c, "handle on request sent bytes - url= ", str, ",    extracted context id= ", optString);
        if (!TextUtils.isEmpty(optString)) {
            CreativeInfo creativeInfo = aB.get(optString);
            if (creativeInfo != null) {
                Logger.d(c, Logger.FeatureTag.CI_MATCHING, "handle on request sent bytes - found ci by context id= ", creativeInfo.aa());
                String L = creativeInfo.L();
                e(creativeInfo);
                return L;
            }
            Logger.d(c, "handle on request sent bytes - context id not found in contextIdToCiMap. map size= ", Integer.valueOf(aB.size()));
        }
        return null;
    }

    private static Set<CreativeInfo> D(String str) {
        Logger.d(c, "find ci by video url - videoUrlToCiSetMap size= ", Integer.valueOf(az.size()), ",   keys= ", az.keySet());
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : az.keySet()) {
                if (str2.contains(str)) {
                    Set<CreativeInfo> set = az.get(str2);
                    Logger.d(c, "find ci by video url - creative info set found= ", set);
                    return set;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void b(Object obj, Object obj2) {
        Logger.d(c, "handle media player set data source call - mediaPlayer= ", obj, ",    videoFile= ", obj2);
        try {
            if (obj2 instanceof Uri) {
                String path = ((Uri) obj2).getPath();
                Logger.d(c, "handle media player set data source call - uri.getPath= ", path);
                if (!TextUtils.isEmpty(path)) {
                    String[] split = path.split("/");
                    if (split.length > 0) {
                        String str = split[split.length - 1];
                        Logger.d(c, "handle media player set data source call - videoUrl= ", str);
                        Set<CreativeInfo> D = D(str);
                        Logger.d(c, "handle media player set data source call - found? ci set= ", D);
                        if (D != null) {
                            int identityHashCode = System.identityHashCode(obj);
                            Logger.d(c, "handle media player set data source call - PUTTING mediaPlayerHashToCiSetMap playerId= ", Integer.valueOf(identityHashCode));
                            aA.put(Integer.valueOf(identityHashCode), D);
                        }
                    }
                }
            }
        } catch (Exception e2) {
            Logger.e(c, "exception when trying to add mediaPlayer id and VungleCreativeInfo ", e2.getMessage());
        }
    }

    private static void e(CreativeInfo creativeInfo) {
        if (creativeInfo != null) {
            Logger.d(c, "remove matched ci from all collections - removing ci from collection contextIdToCiMap");
            b(c, creativeInfo, aB);
            Logger.d(c, "remove matched ci from all collections - removing ci from collection htmlResourceToCiMap");
            b(c, creativeInfo, aC);
            Logger.d(c, "remove matched ci from all collections - removing ci from collection mediaPlayerHashToCiSetMap");
            c(c, creativeInfo, aA);
            Logger.d(c, "remove matched ci from all collections - removing ci from collection videoUrlToCiListMap");
            c(c, creativeInfo, az);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String m(String str) {
        Logger.d(c, "extract mraid redirect target url - url= ", str);
        if (str != null && (str.contains(at) || str.contains(av))) {
            return com.safedk.android.utils.k.d(str, "url");
        }
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public RedirectDetails.RedirectType l(String str) {
        Logger.d(c, "extract mraid redirect type - url= ", str);
        if (str != null) {
            if (str.contains(at)) {
                return RedirectDetails.RedirectType.REDIRECT;
            }
            if (str.contains(av)) {
                return RedirectDetails.RedirectType.EXPAND;
            }
        }
        return RedirectDetails.RedirectType.REDIRECT;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        super.i();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo b(Object obj) {
        if (obj instanceof String) {
            JSONObject a = ProtobufMessageParser.a(Base64.decode((String) obj, 0), h);
            Logger.printFullVerboseLog(c, "match info impl - response cache url json extracted: ", a);
            if (a != null) {
                String optString = a.optString(al);
                if (!TextUtils.isEmpty(optString)) {
                    CreativeInfo creativeInfo = aE.get(optString);
                    Logger.printFullVerboseLog(c, "match info impl - ci found?= ", creativeInfo);
                    return creativeInfo;
                }
            }
        }
        return null;
    }
}

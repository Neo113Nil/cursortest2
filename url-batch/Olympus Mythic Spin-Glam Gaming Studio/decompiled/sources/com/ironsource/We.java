package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4702id;
import com.ironsource.M7;
import com.ironsource.N3;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class We {
    protected static final boolean A = false;
    protected static final String A0 = "waitUntilAllProvidersFinishInit";
    protected static final String A1 = "providerNetworkKey";
    protected static final int B = 60;
    protected static final String B0 = "sharedManagersThread";
    protected static final String B1 = "spId";
    protected static final int C = 10000;
    protected static final String C0 = "parallelLoad";
    protected static final String C1 = "mpis";
    protected static final int D = 10000;
    protected static final String D0 = "bidderExclusive";
    protected static final String D1 = "auction";
    protected static final int E = -1;
    protected static final String E0 = "adapterTimeOutInSeconds";
    protected static final String E1 = "auctionData";
    protected static final int F = 5000;
    protected static final String F0 = "atim";
    protected static final String F1 = "auctioneerURL";
    protected static final int G = 3;
    protected static final String G0 = "bannerInterval";
    protected static final String G1 = "extAuctioneerURL";
    protected static final int H = 3;
    protected static final String H0 = "isOneFlow";
    protected static final String H1 = "objectPerWaterfall";
    protected static final int I = 3;
    protected static final String I0 = "expiredDurationInMinutes";
    protected static final String I1 = "minTimeBeforeFirstAuction";
    protected static final int J = 0;
    protected static final String J0 = "server";
    protected static final String J1 = "timeToWaitBeforeAuction";
    protected static final int K = 2;
    protected static final String K0 = "publisher";
    protected static final String K1 = "timeToWaitBeforeLoad";
    protected static final int L = 15;
    protected static final String L0 = "console";
    protected static final String L1 = "auctionRetryInterval";
    protected static final long M = 10000;
    protected static final String M0 = "sendUltraEvents";
    protected static final String M1 = "isLoadWhileShow";
    protected static final long N = 3000;
    protected static final String N0 = "sendEventsToggle";
    protected static final String N1 = "auctionTrials";
    protected static final boolean O = false;
    protected static final String O0 = "eventsCompression";
    protected static final String O1 = "auctionTimeout";
    protected static final boolean P = false;
    protected static final String P0 = "eventsCompressionLevel";
    protected static final String P1 = "auctionSavedHistory";
    protected static final int Q = 30000;
    protected static final String Q0 = "serverEventsURL";
    protected static final String Q1 = "disableLoadWhileShowSupportFor";
    protected static final int R = -1;
    protected static final String R0 = "serverEventsType";
    protected static final String R1 = "tokenPerAdapter";
    protected static final int S = 5000;
    protected static final String S0 = "backupThreshold";
    protected static final String S1 = "enableAuctionFallback";
    protected static final int T = 1;
    protected static final String T0 = "maxNumberOfEvents";
    protected static final String T1 = "timeToDeleteOldWaterfallAfterAuction";
    protected static final boolean U = false;
    protected static final String U0 = "maxEventsPerBatch";
    protected static final String U1 = "compressAuctionRequest";
    protected static final int V = 15000;
    protected static final String V0 = "optOut";
    protected static final String V1 = "compressAuctionResponse";
    protected static final int W = 15000;
    protected static final String W0 = "optIn";
    protected static final String W1 = "encryptionVersion";
    protected static final String X = "providerOrder";
    protected static final String X0 = "triggerEvents";
    protected static final String X1 = "shouldSendBannerBURLFromImpression";
    protected static final String Y = "providerSettings";
    protected static final String Y0 = "nonConnectivityEvents";
    protected static final String Y1 = "impressionTimeout";
    protected static final String Z = "configurations";
    protected static final String Z0 = "shouldSendPublisherLogsOnUIThread";
    protected static final String Z1 = "optInKeys";
    protected static final String a0 = "genericParams";
    protected static final String a1 = "pixel";
    protected static final String a2 = "tokenGenericParams";
    protected static final String b0 = "adUnits";
    protected static final String b1 = "pixelEventsUrl";
    protected static final String b2 = "compressToken";
    protected static final String c0 = "providerLoadName";
    protected static final String c1 = "pixelEventsEnabled";
    protected static final String c2 = "compressExternalToken";
    protected static final String d0 = "application";
    protected static final String d1 = "placements";
    protected static final String d2 = "instanceType";
    protected static final String e0 = "rewardedVideo";
    protected static final String e1 = "placementId";
    protected static final String e2 = "maxAdsPerSession";
    protected static final String f0 = "interstitial";
    protected static final String f1 = "placementName";
    protected static final String f2 = "reward";
    protected static final String g0 = "banner";
    protected static final String g1 = "delivery";
    protected static final String g2 = "name";
    protected static final String h0 = "nativeAd";
    protected static final String h1 = "isDefault";
    protected static final String h2 = "amount";
    protected static final String i0 = "integration";
    protected static final String i1 = "capping";
    protected static final String i2 = "bannerRefreshRate";
    protected static final String j0 = "loggers";
    protected static final String j1 = "pacing";
    protected static final String j2 = "protocolVersion";
    protected static final String k0 = "segment";
    protected static final String k1 = "enabled";
    protected static final String k2 = "adFormats";
    public static final String l = "appKey";
    protected static final String l0 = "events";
    protected static final String l1 = "maxImpressions";
    protected static final String l2 = "adUnits";
    public static final String m = "userId";
    protected static final String m0 = "crashReporter";
    protected static final String m1 = "numOfSeconds";
    protected static final String m2 = "rewarded";
    public static final String n = "response";
    protected static final String n0 = "token";
    protected static final String n1 = "unit";
    public static final String n2 = "preload";
    protected static final String o = "error";
    protected static final String o0 = "external";
    protected static final String o1 = "virtualItemName";
    protected static final int p = 3;
    protected static final String p0 = "mediationTypes";
    protected static final String p1 = "virtualItemCount";
    protected static final boolean q = false;
    protected static final String q0 = "providerDefaultInstance";
    protected static final String q1 = "uuidEnabled";
    protected static final boolean r = true;
    protected static final String r0 = "testSuite";
    protected static final String r1 = "abt";
    protected static final boolean s = true;
    protected static final String s0 = "controllerUrl";
    protected static final String s1 = "delayLoadFailure";
    protected static final int t = 2;
    protected static final String t0 = "AdQuality";
    protected static final String t1 = "keysToInclude";
    protected static final int u = 2;
    protected static final String u0 = "initMode";
    protected static final String u1 = "reporterURL";
    protected static final int v = 1;
    protected static final String v0 = "adq_init_blob";
    protected static final String v1 = "reporterKeyword";
    protected static final int w = 1;
    protected static final String w0 = "settings";
    protected static final String w1 = "includeANR";
    protected static final boolean x = true;
    protected static final String x0 = "collectBiddingDataTimeout";
    protected static final String x1 = "timeout";
    protected static final boolean y = false;
    protected static final String y0 = "providers";
    protected static final String y1 = "setIgnoreDebugger";
    protected static final boolean z = false;
    protected static final String z0 = "parallelInit";
    protected static final String z1 = "adSourceName";
    private Jd a;
    private Md b;
    private N3 c;
    private String d;
    private String e;
    private JSONObject f;
    private Context g;
    private a h;
    private M7.a i;
    private boolean j;
    private N5 k;

    public enum a {
        NOT_SET("0"),
        CACHE("1"),
        SERVER("2");

        private final String a;

        a(String str) {
            this.a = str;
        }

        public String b() {
            return this.a;
        }
    }

    public We(Context context, String str, String str2, String str3) {
        this.h = a.NOT_SET;
        this.j = false;
        this.g = context;
        this.i = Kb.Q().x();
        try {
            if (TextUtils.isEmpty(str3)) {
                this.f = IronSourceNetworkBridge.jsonObjectInit();
            } else {
                this.f = IronSourceNetworkBridge.jsonObjectInit(str3);
            }
            this.j = o();
            t();
            r();
            s();
            this.d = TextUtils.isEmpty(str) ? "" : str;
            this.e = TextUtils.isEmpty(str2) ? "" : str2;
            b(this.f);
        } catch (JSONException e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            a();
        }
    }

    public static a a(We we) {
        return we != null ? we.i() : a.NOT_SET;
    }

    private void b(@NotNull JSONObject jSONObject) {
        this.k = new N5(jSONObject.optJSONObject(C4993ye.d));
    }

    @Nullable
    private JSONObject c(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    private C4620e3 d(JSONObject jSONObject) {
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("placementId", -1);
            String optString = jSONObject.optString("placementName", "");
            boolean optBoolean = jSONObject.optBoolean(h1, false);
            C4702id a3 = a(jSONObject);
            if (optInt >= 0 && !TextUtils.isEmpty(optString)) {
                C4620e3 c4620e3 = new C4620e3(optInt, optString, optBoolean, a3);
                if (a3 == null) {
                    return c4620e3;
                }
                this.i.b(this.g, c4620e3, IronSource.a.BANNER);
                return c4620e3;
            }
        }
        return null;
    }

    private C4593cc f(JSONObject jSONObject) {
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("placementId", -1);
            String optString = jSONObject.optString("placementName", "");
            boolean optBoolean = jSONObject.optBoolean(h1, false);
            C4702id a3 = a(jSONObject);
            if (optInt >= 0 && !TextUtils.isEmpty(optString)) {
                C4593cc c4593cc = new C4593cc(optInt, optString, optBoolean, a3);
                if (a3 == null) {
                    return c4593cc;
                }
                this.i.b(this.g, c4593cc, IronSource.a.NATIVE_AD);
                return c4593cc;
            }
        }
        return null;
    }

    private String m() {
        return this.j ? "rewarded" : "rewardedVideo";
    }

    private boolean n() {
        JSONObject c;
        JSONArray optJSONArray;
        JSONObject c3 = c(this.f, "providerOrder");
        JSONArray names = c3.names();
        if (names == null) {
            return true;
        }
        JSONObject c4 = c(c(this.f, "configurations"), b());
        for (int i = 0; i < names.length(); i++) {
            String optString = names.optString(i);
            JSONArray optJSONArray2 = c3.optJSONArray(optString);
            if (optJSONArray2 != null && optJSONArray2.length() != 0 && (c = c(c4, optString)) != null && ((optJSONArray = c.optJSONArray("placements")) == null || optJSONArray.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    private boolean o() {
        int i;
        try {
            i = this.f.optInt(j2, 0);
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            i = 0;
        }
        return i == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x06dd A[Catch: Exception -> 0x0229, TryCatch #2 {Exception -> 0x0229, blocks: (B:19:0x0103, B:21:0x0161, B:24:0x0219, B:26:0x021f, B:29:0x0246, B:32:0x0250, B:34:0x0256, B:36:0x0262, B:38:0x0265, B:42:0x028c, B:44:0x02ea, B:45:0x0382, B:48:0x038c, B:50:0x0392, B:52:0x039c, B:54:0x039f, B:59:0x03ba, B:61:0x0456, B:63:0x045e, B:64:0x0524, B:67:0x0534, B:69:0x053a, B:71:0x0544, B:73:0x0547, B:78:0x0571, B:80:0x05de, B:82:0x05e6, B:83:0x066b, B:86:0x067b, B:88:0x0681, B:90:0x068b, B:92:0x068e, B:95:0x069d, B:97:0x06a4, B:100:0x06af, B:102:0x06b5, B:104:0x06bf, B:106:0x06c7, B:107:0x06ca, B:108:0x06d4, B:110:0x06dd, B:111:0x06f2, B:113:0x06f7, B:114:0x071d, B:116:0x0747, B:119:0x078b, B:121:0x0791, B:124:0x079d, B:125:0x07bd, B:128:0x07c9, B:130:0x07d5, B:132:0x07e2, B:133:0x07e6, B:134:0x07eb, B:136:0x07f4, B:137:0x0802, B:139:0x085b, B:141:0x0863, B:143:0x0885, B:149:0x07c4, B:152:0x0655, B:154:0x0661, B:156:0x04f6, B:158:0x050e, B:160:0x036f, B:162:0x022f), top: B:18:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x06f7 A[Catch: Exception -> 0x0229, TryCatch #2 {Exception -> 0x0229, blocks: (B:19:0x0103, B:21:0x0161, B:24:0x0219, B:26:0x021f, B:29:0x0246, B:32:0x0250, B:34:0x0256, B:36:0x0262, B:38:0x0265, B:42:0x028c, B:44:0x02ea, B:45:0x0382, B:48:0x038c, B:50:0x0392, B:52:0x039c, B:54:0x039f, B:59:0x03ba, B:61:0x0456, B:63:0x045e, B:64:0x0524, B:67:0x0534, B:69:0x053a, B:71:0x0544, B:73:0x0547, B:78:0x0571, B:80:0x05de, B:82:0x05e6, B:83:0x066b, B:86:0x067b, B:88:0x0681, B:90:0x068b, B:92:0x068e, B:95:0x069d, B:97:0x06a4, B:100:0x06af, B:102:0x06b5, B:104:0x06bf, B:106:0x06c7, B:107:0x06ca, B:108:0x06d4, B:110:0x06dd, B:111:0x06f2, B:113:0x06f7, B:114:0x071d, B:116:0x0747, B:119:0x078b, B:121:0x0791, B:124:0x079d, B:125:0x07bd, B:128:0x07c9, B:130:0x07d5, B:132:0x07e2, B:133:0x07e6, B:134:0x07eb, B:136:0x07f4, B:137:0x0802, B:139:0x085b, B:141:0x0863, B:143:0x0885, B:149:0x07c4, B:152:0x0655, B:154:0x0661, B:156:0x04f6, B:158:0x050e, B:160:0x036f, B:162:0x022f), top: B:18:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0747 A[Catch: Exception -> 0x0229, TryCatch #2 {Exception -> 0x0229, blocks: (B:19:0x0103, B:21:0x0161, B:24:0x0219, B:26:0x021f, B:29:0x0246, B:32:0x0250, B:34:0x0256, B:36:0x0262, B:38:0x0265, B:42:0x028c, B:44:0x02ea, B:45:0x0382, B:48:0x038c, B:50:0x0392, B:52:0x039c, B:54:0x039f, B:59:0x03ba, B:61:0x0456, B:63:0x045e, B:64:0x0524, B:67:0x0534, B:69:0x053a, B:71:0x0544, B:73:0x0547, B:78:0x0571, B:80:0x05de, B:82:0x05e6, B:83:0x066b, B:86:0x067b, B:88:0x0681, B:90:0x068b, B:92:0x068e, B:95:0x069d, B:97:0x06a4, B:100:0x06af, B:102:0x06b5, B:104:0x06bf, B:106:0x06c7, B:107:0x06ca, B:108:0x06d4, B:110:0x06dd, B:111:0x06f2, B:113:0x06f7, B:114:0x071d, B:116:0x0747, B:119:0x078b, B:121:0x0791, B:124:0x079d, B:125:0x07bd, B:128:0x07c9, B:130:0x07d5, B:132:0x07e2, B:133:0x07e6, B:134:0x07eb, B:136:0x07f4, B:137:0x0802, B:139:0x085b, B:141:0x0863, B:143:0x0885, B:149:0x07c4, B:152:0x0655, B:154:0x0661, B:156:0x04f6, B:158:0x050e, B:160:0x036f, B:162:0x022f), top: B:18:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x079d A[Catch: Exception -> 0x0229, TryCatch #2 {Exception -> 0x0229, blocks: (B:19:0x0103, B:21:0x0161, B:24:0x0219, B:26:0x021f, B:29:0x0246, B:32:0x0250, B:34:0x0256, B:36:0x0262, B:38:0x0265, B:42:0x028c, B:44:0x02ea, B:45:0x0382, B:48:0x038c, B:50:0x0392, B:52:0x039c, B:54:0x039f, B:59:0x03ba, B:61:0x0456, B:63:0x045e, B:64:0x0524, B:67:0x0534, B:69:0x053a, B:71:0x0544, B:73:0x0547, B:78:0x0571, B:80:0x05de, B:82:0x05e6, B:83:0x066b, B:86:0x067b, B:88:0x0681, B:90:0x068b, B:92:0x068e, B:95:0x069d, B:97:0x06a4, B:100:0x06af, B:102:0x06b5, B:104:0x06bf, B:106:0x06c7, B:107:0x06ca, B:108:0x06d4, B:110:0x06dd, B:111:0x06f2, B:113:0x06f7, B:114:0x071d, B:116:0x0747, B:119:0x078b, B:121:0x0791, B:124:0x079d, B:125:0x07bd, B:128:0x07c9, B:130:0x07d5, B:132:0x07e2, B:133:0x07e6, B:134:0x07eb, B:136:0x07f4, B:137:0x0802, B:139:0x085b, B:141:0x0863, B:143:0x0885, B:149:0x07c4, B:152:0x0655, B:154:0x0661, B:156:0x04f6, B:158:0x050e, B:160:0x036f, B:162:0x022f), top: B:18:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x07d5 A[Catch: Exception -> 0x0229, TryCatch #2 {Exception -> 0x0229, blocks: (B:19:0x0103, B:21:0x0161, B:24:0x0219, B:26:0x021f, B:29:0x0246, B:32:0x0250, B:34:0x0256, B:36:0x0262, B:38:0x0265, B:42:0x028c, B:44:0x02ea, B:45:0x0382, B:48:0x038c, B:50:0x0392, B:52:0x039c, B:54:0x039f, B:59:0x03ba, B:61:0x0456, B:63:0x045e, B:64:0x0524, B:67:0x0534, B:69:0x053a, B:71:0x0544, B:73:0x0547, B:78:0x0571, B:80:0x05de, B:82:0x05e6, B:83:0x066b, B:86:0x067b, B:88:0x0681, B:90:0x068b, B:92:0x068e, B:95:0x069d, B:97:0x06a4, B:100:0x06af, B:102:0x06b5, B:104:0x06bf, B:106:0x06c7, B:107:0x06ca, B:108:0x06d4, B:110:0x06dd, B:111:0x06f2, B:113:0x06f7, B:114:0x071d, B:116:0x0747, B:119:0x078b, B:121:0x0791, B:124:0x079d, B:125:0x07bd, B:128:0x07c9, B:130:0x07d5, B:132:0x07e2, B:133:0x07e6, B:134:0x07eb, B:136:0x07f4, B:137:0x0802, B:139:0x085b, B:141:0x0863, B:143:0x0885, B:149:0x07c4, B:152:0x0655, B:154:0x0661, B:156:0x04f6, B:158:0x050e, B:160:0x036f, B:162:0x022f), top: B:18:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x07f4 A[Catch: Exception -> 0x0229, TryCatch #2 {Exception -> 0x0229, blocks: (B:19:0x0103, B:21:0x0161, B:24:0x0219, B:26:0x021f, B:29:0x0246, B:32:0x0250, B:34:0x0256, B:36:0x0262, B:38:0x0265, B:42:0x028c, B:44:0x02ea, B:45:0x0382, B:48:0x038c, B:50:0x0392, B:52:0x039c, B:54:0x039f, B:59:0x03ba, B:61:0x0456, B:63:0x045e, B:64:0x0524, B:67:0x0534, B:69:0x053a, B:71:0x0544, B:73:0x0547, B:78:0x0571, B:80:0x05de, B:82:0x05e6, B:83:0x066b, B:86:0x067b, B:88:0x0681, B:90:0x068b, B:92:0x068e, B:95:0x069d, B:97:0x06a4, B:100:0x06af, B:102:0x06b5, B:104:0x06bf, B:106:0x06c7, B:107:0x06ca, B:108:0x06d4, B:110:0x06dd, B:111:0x06f2, B:113:0x06f7, B:114:0x071d, B:116:0x0747, B:119:0x078b, B:121:0x0791, B:124:0x079d, B:125:0x07bd, B:128:0x07c9, B:130:0x07d5, B:132:0x07e2, B:133:0x07e6, B:134:0x07eb, B:136:0x07f4, B:137:0x0802, B:139:0x085b, B:141:0x0863, B:143:0x0885, B:149:0x07c4, B:152:0x0655, B:154:0x0661, B:156:0x04f6, B:158:0x050e, B:160:0x036f, B:162:0x022f), top: B:18:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0885 A[Catch: Exception -> 0x0229, TRY_LEAVE, TryCatch #2 {Exception -> 0x0229, blocks: (B:19:0x0103, B:21:0x0161, B:24:0x0219, B:26:0x021f, B:29:0x0246, B:32:0x0250, B:34:0x0256, B:36:0x0262, B:38:0x0265, B:42:0x028c, B:44:0x02ea, B:45:0x0382, B:48:0x038c, B:50:0x0392, B:52:0x039c, B:54:0x039f, B:59:0x03ba, B:61:0x0456, B:63:0x045e, B:64:0x0524, B:67:0x0534, B:69:0x053a, B:71:0x0544, B:73:0x0547, B:78:0x0571, B:80:0x05de, B:82:0x05e6, B:83:0x066b, B:86:0x067b, B:88:0x0681, B:90:0x068b, B:92:0x068e, B:95:0x069d, B:97:0x06a4, B:100:0x06af, B:102:0x06b5, B:104:0x06bf, B:106:0x06c7, B:107:0x06ca, B:108:0x06d4, B:110:0x06dd, B:111:0x06f2, B:113:0x06f7, B:114:0x071d, B:116:0x0747, B:119:0x078b, B:121:0x0791, B:124:0x079d, B:125:0x07bd, B:128:0x07c9, B:130:0x07d5, B:132:0x07e2, B:133:0x07e6, B:134:0x07eb, B:136:0x07f4, B:137:0x0802, B:139:0x085b, B:141:0x0863, B:143:0x0885, B:149:0x07c4, B:152:0x0655, B:154:0x0661, B:156:0x04f6, B:158:0x050e, B:160:0x036f, B:162:0x022f), top: B:18:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x07c4 A[Catch: Exception -> 0x0229, TryCatch #2 {Exception -> 0x0229, blocks: (B:19:0x0103, B:21:0x0161, B:24:0x0219, B:26:0x021f, B:29:0x0246, B:32:0x0250, B:34:0x0256, B:36:0x0262, B:38:0x0265, B:42:0x028c, B:44:0x02ea, B:45:0x0382, B:48:0x038c, B:50:0x0392, B:52:0x039c, B:54:0x039f, B:59:0x03ba, B:61:0x0456, B:63:0x045e, B:64:0x0524, B:67:0x0534, B:69:0x053a, B:71:0x0544, B:73:0x0547, B:78:0x0571, B:80:0x05de, B:82:0x05e6, B:83:0x066b, B:86:0x067b, B:88:0x0681, B:90:0x068b, B:92:0x068e, B:95:0x069d, B:97:0x06a4, B:100:0x06af, B:102:0x06b5, B:104:0x06bf, B:106:0x06c7, B:107:0x06ca, B:108:0x06d4, B:110:0x06dd, B:111:0x06f2, B:113:0x06f7, B:114:0x071d, B:116:0x0747, B:119:0x078b, B:121:0x0791, B:124:0x079d, B:125:0x07bd, B:128:0x07c9, B:130:0x07d5, B:132:0x07e2, B:133:0x07e6, B:134:0x07eb, B:136:0x07f4, B:137:0x0802, B:139:0x085b, B:141:0x0863, B:143:0x0885, B:149:0x07c4, B:152:0x0655, B:154:0x0661, B:156:0x04f6, B:158:0x050e, B:160:0x036f, B:162:0x022f), top: B:18:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x028c A[Catch: Exception -> 0x0229, TryCatch #2 {Exception -> 0x0229, blocks: (B:19:0x0103, B:21:0x0161, B:24:0x0219, B:26:0x021f, B:29:0x0246, B:32:0x0250, B:34:0x0256, B:36:0x0262, B:38:0x0265, B:42:0x028c, B:44:0x02ea, B:45:0x0382, B:48:0x038c, B:50:0x0392, B:52:0x039c, B:54:0x039f, B:59:0x03ba, B:61:0x0456, B:63:0x045e, B:64:0x0524, B:67:0x0534, B:69:0x053a, B:71:0x0544, B:73:0x0547, B:78:0x0571, B:80:0x05de, B:82:0x05e6, B:83:0x066b, B:86:0x067b, B:88:0x0681, B:90:0x068b, B:92:0x068e, B:95:0x069d, B:97:0x06a4, B:100:0x06af, B:102:0x06b5, B:104:0x06bf, B:106:0x06c7, B:107:0x06ca, B:108:0x06d4, B:110:0x06dd, B:111:0x06f2, B:113:0x06f7, B:114:0x071d, B:116:0x0747, B:119:0x078b, B:121:0x0791, B:124:0x079d, B:125:0x07bd, B:128:0x07c9, B:130:0x07d5, B:132:0x07e2, B:133:0x07e6, B:134:0x07eb, B:136:0x07f4, B:137:0x0802, B:139:0x085b, B:141:0x0863, B:143:0x0885, B:149:0x07c4, B:152:0x0655, B:154:0x0661, B:156:0x04f6, B:158:0x050e, B:160:0x036f, B:162:0x022f), top: B:18:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03ba A[Catch: Exception -> 0x0229, TryCatch #2 {Exception -> 0x0229, blocks: (B:19:0x0103, B:21:0x0161, B:24:0x0219, B:26:0x021f, B:29:0x0246, B:32:0x0250, B:34:0x0256, B:36:0x0262, B:38:0x0265, B:42:0x028c, B:44:0x02ea, B:45:0x0382, B:48:0x038c, B:50:0x0392, B:52:0x039c, B:54:0x039f, B:59:0x03ba, B:61:0x0456, B:63:0x045e, B:64:0x0524, B:67:0x0534, B:69:0x053a, B:71:0x0544, B:73:0x0547, B:78:0x0571, B:80:0x05de, B:82:0x05e6, B:83:0x066b, B:86:0x067b, B:88:0x0681, B:90:0x068b, B:92:0x068e, B:95:0x069d, B:97:0x06a4, B:100:0x06af, B:102:0x06b5, B:104:0x06bf, B:106:0x06c7, B:107:0x06ca, B:108:0x06d4, B:110:0x06dd, B:111:0x06f2, B:113:0x06f7, B:114:0x071d, B:116:0x0747, B:119:0x078b, B:121:0x0791, B:124:0x079d, B:125:0x07bd, B:128:0x07c9, B:130:0x07d5, B:132:0x07e2, B:133:0x07e6, B:134:0x07eb, B:136:0x07f4, B:137:0x0802, B:139:0x085b, B:141:0x0863, B:143:0x0885, B:149:0x07c4, B:152:0x0655, B:154:0x0661, B:156:0x04f6, B:158:0x050e, B:160:0x036f, B:162:0x022f), top: B:18:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0571 A[Catch: Exception -> 0x0229, TryCatch #2 {Exception -> 0x0229, blocks: (B:19:0x0103, B:21:0x0161, B:24:0x0219, B:26:0x021f, B:29:0x0246, B:32:0x0250, B:34:0x0256, B:36:0x0262, B:38:0x0265, B:42:0x028c, B:44:0x02ea, B:45:0x0382, B:48:0x038c, B:50:0x0392, B:52:0x039c, B:54:0x039f, B:59:0x03ba, B:61:0x0456, B:63:0x045e, B:64:0x0524, B:67:0x0534, B:69:0x053a, B:71:0x0544, B:73:0x0547, B:78:0x0571, B:80:0x05de, B:82:0x05e6, B:83:0x066b, B:86:0x067b, B:88:0x0681, B:90:0x068b, B:92:0x068e, B:95:0x069d, B:97:0x06a4, B:100:0x06af, B:102:0x06b5, B:104:0x06bf, B:106:0x06c7, B:107:0x06ca, B:108:0x06d4, B:110:0x06dd, B:111:0x06f2, B:113:0x06f7, B:114:0x071d, B:116:0x0747, B:119:0x078b, B:121:0x0791, B:124:0x079d, B:125:0x07bd, B:128:0x07c9, B:130:0x07d5, B:132:0x07e2, B:133:0x07e6, B:134:0x07eb, B:136:0x07f4, B:137:0x0802, B:139:0x085b, B:141:0x0863, B:143:0x0885, B:149:0x07c4, B:152:0x0655, B:154:0x0661, B:156:0x04f6, B:158:0x050e, B:160:0x036f, B:162:0x022f), top: B:18:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x06a4 A[Catch: Exception -> 0x0229, TryCatch #2 {Exception -> 0x0229, blocks: (B:19:0x0103, B:21:0x0161, B:24:0x0219, B:26:0x021f, B:29:0x0246, B:32:0x0250, B:34:0x0256, B:36:0x0262, B:38:0x0265, B:42:0x028c, B:44:0x02ea, B:45:0x0382, B:48:0x038c, B:50:0x0392, B:52:0x039c, B:54:0x039f, B:59:0x03ba, B:61:0x0456, B:63:0x045e, B:64:0x0524, B:67:0x0534, B:69:0x053a, B:71:0x0544, B:73:0x0547, B:78:0x0571, B:80:0x05de, B:82:0x05e6, B:83:0x066b, B:86:0x067b, B:88:0x0681, B:90:0x068b, B:92:0x068e, B:95:0x069d, B:97:0x06a4, B:100:0x06af, B:102:0x06b5, B:104:0x06bf, B:106:0x06c7, B:107:0x06ca, B:108:0x06d4, B:110:0x06dd, B:111:0x06f2, B:113:0x06f7, B:114:0x071d, B:116:0x0747, B:119:0x078b, B:121:0x0791, B:124:0x079d, B:125:0x07bd, B:128:0x07c9, B:130:0x07d5, B:132:0x07e2, B:133:0x07e6, B:134:0x07eb, B:136:0x07f4, B:137:0x0802, B:139:0x085b, B:141:0x0863, B:143:0x0885, B:149:0x07c4, B:152:0x0655, B:154:0x0661, B:156:0x04f6, B:158:0x050e, B:160:0x036f, B:162:0x022f), top: B:18:0x0103 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void r() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        JSONObject jSONObject3;
        String str7;
        JSONObject jSONObject4;
        String str8;
        String str9;
        We we;
        JSONObject jSONObject5;
        String str10;
        C4649fe c4649fe;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        JSONObject jSONObject6;
        String str16;
        String str17;
        E9 e9;
        C4649fe c4649fe2;
        String str18;
        JSONObject jSONObject7;
        String str19;
        JSONObject jSONObject8;
        JSONObject jSONObject9;
        JSONObject jSONObject10;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        E9 e92;
        String str26;
        JSONObject jSONObject11;
        String str27;
        U2 u2;
        String str28;
        U2 u22;
        JSONObject jSONObject12;
        String str29;
        String str30;
        JSONObject jSONObject13;
        Rb rb;
        JSONObject jSONObject14;
        boolean z2;
        JSONObject jSONObject15;
        JSONObject jSONObject16;
        JSONObject c;
        String str31;
        JSONObject c3;
        C4869s2 c4869s2;
        C4869s2 c4869s22;
        C4869s2 c4869s23;
        C4869s2 c4869s24;
        C4869s2 c4869s25;
        JSONArray optJSONArray;
        C4869s2 c4869s26;
        try {
            JSONObject c4 = c(this.f, "configurations");
            JSONObject c5 = c(c4, b());
            JSONObject c6 = c(c4, "application");
            JSONObject c7 = c(c5, m());
            JSONObject c8 = c(c5, "interstitial");
            JSONObject c9 = c(c5, "banner");
            JSONObject c10 = c(c5, "nativeAd");
            JSONObject c11 = c(c6, "events");
            JSONObject c12 = c(c6, "loggers");
            JSONObject c13 = c(c6, "token");
            JSONObject c14 = c(c6, "segment");
            JSONObject c15 = c(c6, "auction");
            JSONObject c16 = c(c6, "crashReporter");
            JSONObject c17 = c(c6, "settings");
            JSONObject c18 = c(c6, "external");
            JSONObject c19 = c(c11, a1);
            if (c6 != null) {
                jSONObject = c19;
                jSONObject2 = c18;
                IronSourceUtils.b(this.g, "uuidEnabled", c6.optBoolean("uuidEnabled", true));
            } else {
                jSONObject = c19;
                jSONObject2 = c18;
            }
            if (c11 != null) {
                String optString = c11.optString("abt");
                if (!TextUtils.isEmpty(optString)) {
                    Kb.Y().q().a(optString);
                    G9.i().a(optString);
                    C4685he.i().a(optString);
                    str = optString;
                    J1 a3 = a(c11, Boolean.valueOf(c11.optBoolean("sendUltraEvents", false)));
                    String str32 = P1;
                    String str33 = O1;
                    if (c7 == null) {
                        str6 = G1;
                        try {
                            optJSONArray = c7.optJSONArray("placements");
                            str7 = "placements";
                            we = this;
                        } catch (Exception e) {
                            e = e;
                            C4782n4.d().a(e);
                            IronLog.INTERNAL.error(e.toString());
                            return;
                        }
                        try {
                            JSONObject c20 = we.c(c7, "events");
                            str2 = "events";
                            JSONObject d = we.d(c7, y0);
                            str4 = y0;
                            long optLong = c7.optLong(x0, 3000L);
                            boolean optBoolean = d.optBoolean(z0, false);
                            boolean optBoolean2 = d.optBoolean(A0, false);
                            boolean optBoolean3 = c7.optBoolean(B0, true);
                            int a4 = we.a(c7, c6, "parallelLoad", 2);
                            boolean a5 = we.a(c7, c6, "bidderExclusive", true);
                            int a6 = we.a(c7, c6, E0, 60);
                            int a7 = we.a(c7, c6, "expiredDurationInMinutes", -1);
                            int a8 = we.a(c7, c6, s1, 3);
                            boolean a9 = we.a(c7, c6, "isOneFlow", false);
                            JSONObject b = IronSourceUtils.b(c20, c11);
                            J1 a10 = we.a(b, Boolean.valueOf(b.optBoolean("sendUltraEvents", false)));
                            if (c15 != null) {
                                JSONObject c21 = we.c(c15, m());
                                String optString2 = c15.optString(E1, "");
                                String optString3 = c15.optString(F1, "");
                                String optString4 = c15.optString(str6, "");
                                int optInt = c15.optInt("auctionTrials", 2);
                                str6 = str6;
                                str10 = F1;
                                long optLong2 = c15.optLong(str33, 10000L);
                                int optInt2 = c15.optInt(str32, 15);
                                str33 = str33;
                                boolean optBoolean4 = c15.optBoolean(U1, false);
                                boolean optBoolean5 = c15.optBoolean(V1, false);
                                int optInt3 = c15.optInt(W1, 1);
                                boolean optBoolean6 = c15.optBoolean(R1, true);
                                boolean optBoolean7 = c21.optBoolean(S1, true);
                                int optInt4 = c21.optInt(I1, 2000);
                                str32 = str32;
                                int optInt5 = c21.optInt(L1, 30000);
                                str9 = "auctionTrials";
                                int optInt6 = c21.optInt(J1, 5000);
                                str3 = E1;
                                int optInt7 = c21.optInt(K1, 50);
                                str5 = "";
                                boolean optBoolean8 = c21.optBoolean(H1, false);
                                boolean optBoolean9 = c21.optBoolean("isLoadWhileShow", true);
                                int optInt8 = c21.optInt(T1, 30000);
                                jSONObject3 = c6;
                                jSONObject4 = c11;
                                str8 = B0;
                                long j = optInt5;
                                jSONObject5 = c15;
                                C4869s2 c4869s27 = new C4869s2(optString2, optString3, optString4, optInt, optInt2, optLong2, optInt4, j, optInt6, optInt7, optBoolean9, optInt8, optBoolean4, optBoolean5, optBoolean8, optInt3, false, optBoolean6, optBoolean7);
                                JSONArray optJSONArray2 = c21.optJSONArray(Q1);
                                if (optJSONArray2 != null) {
                                    for (int i = 0; i < optJSONArray2.length(); i++) {
                                        c4869s27.a(optJSONArray2.optString(i));
                                    }
                                }
                                c4869s26 = c4869s27;
                            } else {
                                str3 = E1;
                                str5 = "";
                                jSONObject3 = c6;
                                jSONObject4 = c11;
                                str8 = B0;
                                jSONObject5 = c15;
                                str9 = "auctionTrials";
                                str10 = F1;
                                c4869s26 = new C4869s2();
                            }
                            c4649fe = new C4649fe(a4, a5, a6, a7, a10, c4869s26, a8, a9, optLong, optBoolean, optBoolean2, optBoolean3);
                            if (optJSONArray != null) {
                                int i3 = 0;
                                while (i3 < optJSONArray.length()) {
                                    JSONArray jSONArray = optJSONArray;
                                    C4684hd g = we.g(jSONArray.optJSONObject(i3));
                                    if (g != null) {
                                        c4649fe.a(g);
                                    }
                                    i3++;
                                    optJSONArray = jSONArray;
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                            C4782n4.d().a(e);
                            IronLog.INTERNAL.error(e.toString());
                            return;
                        }
                    } else {
                        str2 = "events";
                        str3 = E1;
                        str4 = y0;
                        str5 = "";
                        str6 = G1;
                        jSONObject3 = c6;
                        str7 = "placements";
                        jSONObject4 = c11;
                        str8 = B0;
                        str9 = "auctionTrials";
                        we = this;
                        jSONObject5 = c15;
                        str10 = F1;
                        c4649fe = null;
                    }
                    if (c8 == null) {
                        str13 = str7;
                        JSONArray optJSONArray3 = c8.optJSONArray(str13);
                        str14 = str2;
                        JSONObject c22 = we.c(c8, str14);
                        str15 = str4;
                        JSONObject d3 = we.d(c8, str15);
                        long optLong3 = c8.optLong(x0, 3000L);
                        boolean optBoolean10 = d3.optBoolean(z0, false);
                        boolean optBoolean11 = d3.optBoolean(A0, false);
                        String str34 = str8;
                        boolean optBoolean12 = c8.optBoolean(str34, true);
                        str11 = x0;
                        jSONObject6 = jSONObject3;
                        int a11 = we.a(c8, jSONObject6, "parallelLoad", 2);
                        boolean a12 = we.a(c8, jSONObject6, "bidderExclusive", false);
                        int a13 = we.a(c8, jSONObject6, E0, 60);
                        int a14 = we.a(c8, jSONObject6, s1, 3);
                        boolean a15 = we.a(c8, jSONObject6, "isOneFlow", false);
                        JSONObject jSONObject17 = jSONObject4;
                        J1 a16 = we.a(IronSourceUtils.b(c22, jSONObject17), Boolean.FALSE);
                        if (jSONObject5 != null) {
                            JSONObject c23 = we.c(jSONObject5, "interstitial");
                            String str35 = str3;
                            String str36 = str5;
                            String optString5 = jSONObject5.optString(str35, str36);
                            jSONObject4 = jSONObject17;
                            String str37 = str10;
                            String optString6 = jSONObject5.optString(str37, str36);
                            str10 = str37;
                            String str38 = str6;
                            String optString7 = jSONObject5.optString(str38, str36);
                            str5 = str36;
                            str6 = str38;
                            String str39 = str9;
                            int optInt9 = jSONObject5.optInt(str39, 2);
                            str9 = str39;
                            String str40 = str32;
                            int optInt10 = jSONObject5.optInt(str40, 15);
                            str8 = str34;
                            str16 = A0;
                            str12 = str33;
                            str3 = str35;
                            str17 = str40;
                            c4869s25 = new C4869s2(optString5, optString6, optString7, optInt9, optInt10, jSONObject5.optLong(str12, 10000L), c23.optInt(I1, 2000), 0L, 0L, 0L, true, 0, jSONObject5.optBoolean(U1, false), jSONObject5.optBoolean(V1, false), true, jSONObject5.optInt(W1, 1), false, jSONObject5.optBoolean(R1, true), c23.optBoolean(S1, true));
                        } else {
                            jSONObject4 = jSONObject17;
                            str8 = str34;
                            str12 = str33;
                            String str41 = str32;
                            str16 = A0;
                            str17 = str41;
                            c4869s25 = new C4869s2();
                        }
                        E9 e93 = new E9(a11, a12, a13, a16, c4869s25, a14, a15, optLong3, optBoolean10, optBoolean11, optBoolean12);
                        if (optJSONArray3 != null) {
                            for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                                I9 e4 = we.e(optJSONArray3.optJSONObject(i4));
                                if (e4 != null) {
                                    e93.a(e4);
                                }
                            }
                        }
                        e9 = e93;
                    } else {
                        str11 = x0;
                        str12 = str33;
                        str13 = str7;
                        str14 = str2;
                        str15 = str4;
                        jSONObject6 = jSONObject3;
                        String str42 = str32;
                        str16 = A0;
                        str17 = str42;
                        e9 = null;
                    }
                    if (c9 == null) {
                        JSONArray optJSONArray4 = c9.optJSONArray(str13);
                        JSONObject c24 = we.c(c9, str14);
                        JSONObject d4 = we.d(c9, str15);
                        str18 = str12;
                        JSONObject jSONObject18 = jSONObject;
                        str23 = str3;
                        String str43 = str11;
                        String str44 = str9;
                        String str45 = str5;
                        JSONObject jSONObject19 = jSONObject5;
                        String str46 = str17;
                        E9 e94 = e9;
                        str27 = str15;
                        JSONObject jSONObject20 = jSONObject2;
                        e92 = e94;
                        c4649fe2 = c4649fe;
                        jSONObject10 = jSONObject20;
                        jSONObject9 = jSONObject18;
                        str19 = str14;
                        jSONObject8 = c16;
                        String str47 = str10;
                        str21 = str6;
                        str25 = str13;
                        long a17 = a(c9, jSONObject6, F0, 10000L);
                        int a18 = we.a(c9, jSONObject6, s1, 3);
                        int optInt11 = c9.optInt(G0, 60);
                        long optLong4 = c9.optLong(Y1, 15000L);
                        boolean a19 = we.a(c9, jSONObject6, "isOneFlow", false);
                        long optLong5 = c9.optLong(str43, 3000L);
                        boolean optBoolean13 = d4.optBoolean(z0, false);
                        String str48 = str16;
                        boolean optBoolean14 = d4.optBoolean(str48, false);
                        String str49 = str8;
                        boolean optBoolean15 = c9.optBoolean(str49, true);
                        jSONObject11 = jSONObject4;
                        J1 a20 = we.a(IronSourceUtils.b(c24, jSONObject11), Boolean.FALSE);
                        if (jSONObject19 != null) {
                            JSONObject c25 = we.c(jSONObject19, "banner");
                            if (c25 != null) {
                                str24 = str45;
                                str10 = str47;
                                str8 = str49;
                                str16 = str48;
                                str20 = str43;
                                jSONObject7 = jSONObject19;
                                str18 = str18;
                                str26 = str46;
                                str22 = str44;
                                c4869s24 = new C4869s2(jSONObject19.optString(str23, str24), jSONObject19.optString(str47, str24), jSONObject19.optString(str21, str24), jSONObject19.optInt(str44, 2), jSONObject19.optInt(str46, 15), jSONObject19.optLong(str18, 10000L), c25.optInt(I1, 2000), c25.optInt(L1, 15000), c25.optInt(J1, 50), 0L, c25.optBoolean("isLoadWhileShow", false), 0, jSONObject19.optBoolean(U1, false), jSONObject19.optBoolean(V1, false), c25.optBoolean(H1, true), jSONObject19.optInt(W1, 1), c25.optBoolean(X1, true), jSONObject19.optBoolean(R1, true), c25.optBoolean(S1, true));
                                U2 u23 = new U2(1, a17, false, a20, optInt11, c4869s24, a18, a19, optLong5, optBoolean13, optBoolean14, optBoolean15, optLong4);
                                if (optJSONArray4 != null) {
                                    for (int i5 = 0; i5 < optJSONArray4.length(); i5++) {
                                        C4620e3 d5 = we.d(optJSONArray4.optJSONObject(i5));
                                        if (d5 != null) {
                                            u23.a(d5);
                                        }
                                    }
                                }
                                u2 = u23;
                            } else {
                                str8 = str49;
                                str16 = str48;
                                str20 = str43;
                                jSONObject7 = jSONObject19;
                                str26 = str46;
                                str22 = str44;
                                str10 = str47;
                                str24 = str45;
                                c4869s23 = new C4869s2();
                            }
                        } else {
                            str8 = str49;
                            str16 = str48;
                            str20 = str43;
                            jSONObject7 = jSONObject19;
                            str26 = str46;
                            str22 = str44;
                            str10 = str47;
                            str24 = str45;
                            c4869s23 = new C4869s2();
                        }
                        c4869s24 = c4869s23;
                        U2 u232 = new U2(1, a17, false, a20, optInt11, c4869s24, a18, a19, optLong5, optBoolean13, optBoolean14, optBoolean15, optLong4);
                        if (optJSONArray4 != null) {
                        }
                        u2 = u232;
                    } else {
                        c4649fe2 = c4649fe;
                        str18 = str12;
                        jSONObject7 = jSONObject5;
                        str19 = str14;
                        jSONObject8 = c16;
                        jSONObject9 = jSONObject;
                        jSONObject10 = jSONObject2;
                        str20 = str11;
                        str21 = str6;
                        str22 = str9;
                        str23 = str3;
                        str24 = str5;
                        str25 = str13;
                        e92 = e9;
                        str26 = str17;
                        jSONObject11 = jSONObject4;
                        str27 = str15;
                        u2 = null;
                    }
                    if (c10 == null) {
                        JSONArray optJSONArray5 = c10.optJSONArray(str25);
                        String str50 = str19;
                        JSONObject c26 = we.c(c10, str50);
                        JSONObject d6 = we.d(c10, str27);
                        u22 = u2;
                        String str51 = str21;
                        String str52 = str24;
                        str29 = str50;
                        String str53 = str10;
                        String str54 = str18;
                        String str55 = str23;
                        jSONObject13 = jSONObject7;
                        long a21 = a(c10, jSONObject6, F0, 10000L);
                        int a22 = we.a(c10, jSONObject6, s1, 0);
                        long optLong6 = c10.optLong(str20, 3000L);
                        boolean optBoolean16 = d6.optBoolean(z0, false);
                        boolean optBoolean17 = d6.optBoolean(str16, false);
                        boolean optBoolean18 = c10.optBoolean(str8, true);
                        jSONObject12 = jSONObject11;
                        J1 a23 = we.a(IronSourceUtils.b(c26, jSONObject12), Boolean.FALSE);
                        if (jSONObject13 != null) {
                            JSONObject c27 = we.c(jSONObject13, "nativeAd");
                            if (c27 != null) {
                                str28 = str52;
                                str30 = str55;
                                c4869s22 = new C4869s2(jSONObject13.optString(str30, str28), jSONObject13.optString(str53, str28), jSONObject13.optString(str51, str28), jSONObject13.optInt(str22, 2), jSONObject13.optInt(str26, 15), jSONObject13.optLong(str54, 10000L), c27.optInt(I1, 2000), 0L, 0L, 0L, true, 0, jSONObject13.optBoolean(U1, false), jSONObject13.optBoolean(V1, false), true, jSONObject13.optInt(W1, 1), false, jSONObject13.optBoolean(R1, true), c27.optBoolean(S1, true));
                                rb = new Rb(1, a21, false, a23, c4869s22, a22, optLong6, optBoolean16, optBoolean17, optBoolean18);
                                if (optJSONArray5 != null) {
                                    for (int i6 = 0; i6 < optJSONArray5.length(); i6++) {
                                        C4593cc f = we.f(optJSONArray5.optJSONObject(i6));
                                        if (f != null) {
                                            rb.a(f);
                                        }
                                    }
                                }
                            } else {
                                str28 = str52;
                                str30 = str55;
                                c4869s2 = new C4869s2();
                            }
                        } else {
                            str28 = str52;
                            str30 = str55;
                            c4869s2 = new C4869s2();
                        }
                        c4869s22 = c4869s2;
                        rb = new Rb(1, a21, false, a23, c4869s22, a22, optLong6, optBoolean16, optBoolean17, optBoolean18);
                        if (optJSONArray5 != null) {
                        }
                    } else {
                        str28 = str24;
                        u22 = u2;
                        jSONObject12 = jSONObject11;
                        str29 = str19;
                        str30 = str23;
                        jSONObject13 = jSONObject7;
                        rb = null;
                    }
                    C4848qg c4848qg = new C4848qg();
                    if (c13 != null) {
                        JSONArray optJSONArray6 = c13.optJSONArray(Z1);
                        if (optJSONArray6 != null) {
                            for (int i7 = 0; i7 < optJSONArray6.length(); i7++) {
                                c4848qg.a(optJSONArray6.optString(i7));
                            }
                        }
                        JSONObject optJSONObject = c13.optJSONObject(a2);
                        if (optJSONObject != null) {
                            c4848qg.a(optJSONObject);
                        }
                        c4848qg.a(c13.optBoolean(b2, true));
                    }
                    C4648fd c4648fd = new C4648fd();
                    jSONObject14 = jSONObject9;
                    if (jSONObject14 == null) {
                        String optString8 = jSONObject14.optString(b1, C4666gd.a);
                        z2 = jSONObject14.optBoolean(c1, true);
                        c4648fd.a(optString8);
                    } else {
                        z2 = true;
                    }
                    c4648fd.b(z2);
                    if (z2) {
                        c4648fd.b(we.a(jSONObject12, "optOut"));
                        c4648fd.a(we.a(jSONObject12, "optIn"));
                        c4648fd.a(jSONObject12.optBoolean("eventsCompression", false));
                        c4648fd.a(jSONObject12.optInt("eventsCompressionLevel", -1));
                    }
                    Q1 q12 = new Q1(c12.optInt("server", 3), c12.optInt("publisher", 3), c12.optInt("console", 3), c12.optBoolean("shouldSendPublisherLogsOnUIThread", false));
                    G1 g12 = new G1();
                    jSONObject15 = jSONObject8;
                    if (jSONObject15 != null) {
                        g12.a(jSONObject15.optBoolean("enabled", false));
                        g12.c(jSONObject15.optString("reporterURL", str28));
                        g12.b(jSONObject15.optString("reporterKeyword", str28));
                        g12.c(jSONObject15.optBoolean("includeANR", false));
                        g12.a(jSONObject15.optInt("timeout", 5000));
                        g12.b(jSONObject15.optBoolean("setIgnoreDebugger", false));
                        JSONArray optJSONArray7 = jSONObject15.optJSONArray("keysToInclude");
                        if (optJSONArray7 != null) {
                            for (int i8 = 0; i8 < optJSONArray7.length(); i8++) {
                                g12.a(optJSONArray7.optString(i8));
                            }
                        }
                    }
                    Xe xe = c14 == null ? new Xe(c14.optString("name", str28), c14.optString("id", C4538a2.f), c14.optJSONObject("custom")) : null;
                    if (c17 == null) {
                        c17 = IronSourceNetworkBridge.jsonObjectInit();
                    }
                    M1 m12 = new M1(c17);
                    L1 l12 = new L1();
                    jSONObject16 = jSONObject10;
                    if (jSONObject16 != null) {
                        JSONObject optJSONObject2 = jSONObject16.optJSONObject(p0);
                        Map hashMap = new HashMap();
                        if (optJSONObject2 != null) {
                            hashMap = IronSourceUtils.b(optJSONObject2);
                        }
                        l12 = new L1(hashMap);
                    }
                    C1 c110 = new C1(q12, xe, c4848qg, jSONObject6.optBoolean("integration", false), g12, m12, l12, c4648fd, jSONObject13 == null ? new A1(jSONObject13.optString(str30)) : new A1(), str, a3);
                    C4579bg h = we.h(c4);
                    com.ironsource.mediationsdk.adquality.a c28 = we.c(c4);
                    N3.a aVar = new N3.a();
                    aVar.a(c4649fe2);
                    aVar.a(e92);
                    aVar.a(u22);
                    aVar.a(rb);
                    aVar.a(c110);
                    aVar.b(h);
                    aVar.a(c28);
                    N3 a24 = aVar.a();
                    we.c = a24;
                    IronLog.INTERNAL.verbose(a24.toString());
                    c = we.c(jSONObject12, "genericParams");
                    if (c != null && (c3 = we.c(c, (str31 = str29))) != null) {
                        c.remove(str31);
                        Map<String, String> b3 = IronSourceUtils.b(c3);
                        Kb.Y().q().b(b3);
                        C4685he.i().b(b3);
                        G9.i().b(b3);
                    }
                    if (c == null) {
                        Map<String, String> b4 = IronSourceUtils.b(c);
                        Kb.Y().q().a(b4);
                        C4685he.i().a(b4);
                        G9.i().a(b4);
                        return;
                    }
                    return;
                }
            }
            str = null;
            J1 a32 = a(c11, Boolean.valueOf(c11.optBoolean("sendUltraEvents", false)));
            String str322 = P1;
            String str332 = O1;
            if (c7 == null) {
            }
            if (c8 == null) {
            }
            if (c9 == null) {
            }
            if (c10 == null) {
            }
            C4848qg c4848qg2 = new C4848qg();
            if (c13 != null) {
            }
            C4648fd c4648fd2 = new C4648fd();
            jSONObject14 = jSONObject9;
            if (jSONObject14 == null) {
            }
            c4648fd2.b(z2);
            if (z2) {
            }
            Q1 q122 = new Q1(c12.optInt("server", 3), c12.optInt("publisher", 3), c12.optInt("console", 3), c12.optBoolean("shouldSendPublisherLogsOnUIThread", false));
            G1 g122 = new G1();
            jSONObject15 = jSONObject8;
            if (jSONObject15 != null) {
            }
            if (c14 == null) {
            }
            if (c17 == null) {
            }
            M1 m122 = new M1(c17);
            L1 l122 = new L1();
            jSONObject16 = jSONObject10;
            if (jSONObject16 != null) {
            }
            C1 c1102 = new C1(q122, xe, c4848qg2, jSONObject6.optBoolean("integration", false), g122, m122, l122, c4648fd2, jSONObject13 == null ? new A1(jSONObject13.optString(str30)) : new A1(), str, a32);
            C4579bg h3 = we.h(c4);
            com.ironsource.mediationsdk.adquality.a c282 = we.c(c4);
            N3.a aVar2 = new N3.a();
            aVar2.a(c4649fe2);
            aVar2.a(e92);
            aVar2.a(u22);
            aVar2.a(rb);
            aVar2.a(c1102);
            aVar2.b(h3);
            aVar2.a(c282);
            N3 a242 = aVar2.a();
            we.c = a242;
            IronLog.INTERNAL.verbose(a242.toString());
            c = we.c(jSONObject12, "genericParams");
            if (c != null) {
                c.remove(str31);
                Map<String, String> b32 = IronSourceUtils.b(c3);
                Kb.Y().q().b(b32);
                C4685he.i().b(b32);
                G9.i().b(b32);
            }
            if (c == null) {
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    private void s() {
        try {
            JSONObject c = c(this.f, "providerOrder");
            JSONArray b = b(c, m());
            JSONArray b3 = b(c, "interstitial");
            JSONArray b4 = b(c, "banner");
            JSONArray b5 = b(c, "nativeAd");
            this.a = new Jd();
            if (b != null && c() != null && c().f() != null) {
                for (int i = 0; i < b.length(); i++) {
                    String optString = b.optString(i);
                    this.a.d(optString);
                    NetworkSettings b6 = Md.c().b(optString);
                    if (b6 != null) {
                        b6.setRewardedVideoPriority(i);
                    }
                }
            }
            if (b3 != null && c() != null && c().d() != null) {
                for (int i3 = 0; i3 < b3.length(); i3++) {
                    String optString2 = b3.optString(i3);
                    this.a.b(optString2);
                    NetworkSettings b7 = Md.c().b(optString2);
                    if (b7 != null) {
                        b7.setInterstitialPriority(i3);
                    }
                }
            }
            if (b4 != null) {
                for (int i4 = 0; i4 < b4.length(); i4++) {
                    String optString3 = b4.optString(i4);
                    this.a.a(optString3);
                    NetworkSettings b8 = Md.c().b(optString3);
                    if (b8 != null) {
                        b8.setBannerPriority(i4);
                    }
                }
            }
            if (b5 != null) {
                for (int i5 = 0; i5 < b5.length(); i5++) {
                    String optString4 = b5.optString(i5);
                    this.a.c(optString4);
                    NetworkSettings b9 = Md.c().b(optString4);
                    if (b9 != null) {
                        b9.setNativeAdPriority(i5);
                    }
                }
            }
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private void t() {
        JSONObject jSONObject;
        Iterator<String> it;
        We we;
        NetworkSettings networkSettings;
        We we2 = this;
        try {
            we2.b = Md.c();
            JSONObject c = we2.c(we2.f, "providerSettings");
            Iterator<String> keys = c.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = c.optJSONObject(next);
                if (optJSONObject != null) {
                    boolean optBoolean = optJSONObject.optBoolean("mpis", false);
                    String optString = optJSONObject.optString("spId", "0");
                    String optString2 = optJSONObject.optString("adSourceName", null);
                    String optString3 = optJSONObject.optString("providerNetworkKey", null);
                    String optString4 = optJSONObject.optString("providerLoadName", next);
                    String optString5 = optJSONObject.optString("providerDefaultInstance", optString4);
                    JSONObject c3 = we2.c(optJSONObject, b());
                    JSONObject c4 = we2.c(optJSONObject, "application");
                    JSONObject c5 = we2.c(c3, m());
                    JSONObject c6 = we2.c(c3, "interstitial");
                    JSONObject c7 = we2.c(c3, "banner");
                    JSONObject c8 = we2.c(c3, "nativeAd");
                    JSONObject b = IronSourceUtils.b(c5, c4);
                    JSONObject b3 = IronSourceUtils.b(c6, c4);
                    JSONObject b4 = IronSourceUtils.b(c7, c4);
                    JSONObject b5 = IronSourceUtils.b(c8, c4);
                    if (we2.b.a(next)) {
                        Kb.Y().q().a(new C4966x5(EnumC4984y5.TROUBLESHOOTING_MERGE_LOCAL_SETTINGS, (JSONObject) null));
                        NetworkSettings b6 = we2.b.b(next);
                        JSONObject rewardedVideoSettings = b6.getRewardedVideoSettings();
                        JSONObject interstitialSettings = b6.getInterstitialSettings();
                        JSONObject bannerSettings = b6.getBannerSettings();
                        JSONObject nativeAdSettings = b6.getNativeAdSettings();
                        b6.setRewardedVideoSettings(IronSourceUtils.b(rewardedVideoSettings, b));
                        b6.setInterstitialSettings(IronSourceUtils.b(interstitialSettings, b3));
                        b6.setBannerSettings(IronSourceUtils.b(bannerSettings, b4));
                        b6.setNativeAdSettings(IronSourceUtils.b(nativeAdSettings, b5));
                        b6.setIsMultipleInstances(optBoolean);
                        b6.setSubProviderId(optString);
                        b6.setAdSourceNameForEvents(optString2);
                        b6.setProviderNetworkKey(optString3);
                    } else {
                        if (we2.b(optString4)) {
                            jSONObject = c;
                            NetworkSettings b7 = we2.b.b("Mediation");
                            JSONObject rewardedVideoSettings2 = b7.getRewardedVideoSettings();
                            JSONObject interstitialSettings2 = b7.getInterstitialSettings();
                            JSONObject bannerSettings2 = b7.getBannerSettings();
                            JSONObject nativeAdSettings2 = b7.getNativeAdSettings();
                            it = keys;
                            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(rewardedVideoSettings2.toString());
                            JSONObject jsonObjectInit2 = IronSourceNetworkBridge.jsonObjectInit(interstitialSettings2.toString());
                            try {
                                networkSettings = new NetworkSettings(next, optString4, optString5, optString3, c4, IronSourceUtils.b(jsonObjectInit, b), IronSourceUtils.b(jsonObjectInit2, b3), IronSourceUtils.b(IronSourceNetworkBridge.jsonObjectInit(bannerSettings2.toString()), b4), IronSourceUtils.b(IronSourceNetworkBridge.jsonObjectInit(nativeAdSettings2.toString()), b5));
                                networkSettings.setIsMultipleInstances(optBoolean);
                                networkSettings.setSubProviderId(optString);
                                networkSettings.setAdSourceNameForEvents(optString2);
                                we = this;
                            } catch (Exception e) {
                                e = e;
                                C4782n4.d().a(e);
                                IronLog.INTERNAL.error(e.toString());
                                return;
                            }
                            try {
                                we.b.a(networkSettings);
                            } catch (Exception e3) {
                                e = e3;
                                C4782n4.d().a(e);
                                IronLog.INTERNAL.error(e.toString());
                                return;
                            }
                        } else {
                            jSONObject = c;
                            it = keys;
                            we = we2;
                            NetworkSettings networkSettings2 = new NetworkSettings(next, optString4, optString5, optString3, c4, b, b3, b4, b5);
                            networkSettings2.setIsMultipleInstances(optBoolean);
                            networkSettings2.setSubProviderId(optString);
                            networkSettings2.setAdSourceNameForEvents(optString2);
                            we.b.a(networkSettings2);
                        }
                        we2 = we;
                        c = jSONObject;
                        keys = it;
                    }
                }
            }
            we2.b.b();
        } catch (Exception e4) {
            e = e4;
        }
    }

    @Nullable
    public String e() {
        JSONObject jSONObject = this.f;
        if (jSONObject == null || !jSONObject.has("error")) {
            return null;
        }
        return this.f.optString("error");
    }

    public Y8 g() {
        return new Y8(this.d, this.e);
    }

    public List<IronSource.a> h() {
        Jd jd;
        Jd jd2;
        Jd jd3;
        Jd jd4;
        if (this.f == null || this.c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.c.f() != null && (jd4 = this.a) != null && !jd4.d().isEmpty()) {
            arrayList.add(IronSource.a.REWARDED_VIDEO);
        }
        if (this.c.d() != null && (jd3 = this.a) != null && !jd3.b().isEmpty()) {
            arrayList.add(IronSource.a.INTERSTITIAL);
        }
        if (this.c.c() != null && (jd2 = this.a) != null && !jd2.a().isEmpty()) {
            arrayList.add(IronSource.a.BANNER);
        }
        if (this.c.e() != null && (jd = this.a) != null && !jd.c().isEmpty()) {
            arrayList.add(IronSource.a.NATIVE_AD);
        }
        return arrayList;
    }

    public a i() {
        return this.h;
    }

    public JSONObject j() {
        return this.f;
    }

    public Jd k() {
        return this.a;
    }

    public Md l() {
        return this.b;
    }

    public boolean p() {
        return !TextUtils.isEmpty(c().g().b());
    }

    public boolean q() {
        JSONObject jSONObject = this.f;
        return (jSONObject == null || jSONObject.has("error") || this.a == null || this.b == null || this.c == null || !n()) ? false : true;
    }

    public String toString() {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jsonObjectInit.put("appKey", this.d);
            jsonObjectInit.put("userId", this.e);
            jsonObjectInit.put("response", this.f);
        } catch (JSONException e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jsonObjectInit.toString();
    }

    private String b() {
        return this.j ? "adFormats" : C4537a1.c;
    }

    private C4684hd g(JSONObject jSONObject) {
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("placementId", -1);
            String optString = jSONObject.optString("placementName", "");
            boolean optBoolean = jSONObject.optBoolean(h1, false);
            String optString2 = jSONObject.optString("virtualItemName", "");
            int optInt2 = jSONObject.optInt("virtualItemCount", -1);
            C4702id a3 = a(jSONObject);
            if (optInt >= 0 && !TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && optInt2 > 0) {
                C4684hd c4684hd = new C4684hd(optInt, optString, optBoolean, optString2, optInt2, a3);
                if (a3 == null) {
                    return c4684hd;
                }
                this.i.b(this.g, c4684hd, IronSource.a.REWARDED_VIDEO);
                return c4684hd;
            }
        }
        return null;
    }

    public N3 c() {
        return this.c;
    }

    private JSONArray b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        if (!this.j) {
            return jSONObject.optJSONArray(str);
        }
        JSONObject c = c(jSONObject, str);
        String a3 = a(str);
        if (c == null || a3 == null) {
            return null;
        }
        return c.optJSONArray(a3);
    }

    private com.ironsource.mediationsdk.adquality.a c(JSONObject jSONObject) {
        com.ironsource.mediationsdk.adquality.a aVar = new com.ironsource.mediationsdk.adquality.a();
        JSONObject c = c(jSONObject, "AdQuality");
        if (c != null) {
            aVar.a(c.optInt("initMode", 0));
            new U9().b(c.optString("adq_init_blob"));
        }
        return aVar;
    }

    private I9 e(JSONObject jSONObject) {
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("placementId", -1);
            String optString = jSONObject.optString("placementName", "");
            boolean optBoolean = jSONObject.optBoolean(h1, false);
            C4702id a3 = a(jSONObject);
            if (optInt >= 0 && !TextUtils.isEmpty(optString)) {
                I9 i9 = new I9(optInt, optString, optBoolean, a3);
                if (a3 == null) {
                    return i9;
                }
                this.i.b(this.g, i9, IronSource.a.INTERSTITIAL);
                return i9;
            }
        }
        return null;
    }

    public void a(a aVar) {
        this.h = aVar;
    }

    private void a() {
        this.f = IronSourceNetworkBridge.jsonObjectInit();
        this.d = "";
        this.e = "";
        this.a = new Jd();
        this.b = Md.c();
        this.c = new N3.a().a();
        this.i = Kb.Q().x();
        b(this.f);
    }

    @NotNull
    private JSONObject d(JSONObject jSONObject, String str) {
        JSONObject c = c(jSONObject, str);
        return c != null ? c : IronSourceNetworkBridge.jsonObjectInit();
    }

    private boolean b(String str) {
        return this.b.a("Mediation") && StringUtils.toLowerCase("IronSource").equals(StringUtils.toLowerCase(str));
    }

    public N5 f() {
        return this.k;
    }

    private Context d() {
        return this.g;
    }

    private String a(String str) {
        try {
            JSONObject c = c(c(c(c(this.f, "configurations"), "adFormats"), str), C4537a1.c);
            if (c == null) {
                return null;
            }
            Iterator<String> keys = c.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject c3 = c(c, next);
                if (c3 != null && c3.optBoolean(h1)) {
                    return next;
                }
            }
            return null;
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return null;
        }
    }

    @NotNull
    public static C4848qg b(@Nullable We we) {
        if (we != null && we.q()) {
            return we.c().b().k();
        }
        return C4848qg.a();
    }

    private C4579bg h(JSONObject jSONObject) {
        C4579bg c4579bg = new C4579bg();
        JSONObject c = c(jSONObject, "testSuite");
        if (c != null) {
            c4579bg.b(c.optString("controllerUrl"));
        }
        return c4579bg;
    }

    public We(We we) {
        this.h = a.NOT_SET;
        this.j = false;
        try {
            this.g = we.d();
            this.f = IronSourceNetworkBridge.jsonObjectInit(we.f.toString());
            this.d = we.d;
            this.e = we.e;
            this.j = we.j;
            this.a = we.k();
            this.b = we.l();
            this.c = we.c();
            this.h = we.i();
            this.i = Kb.Q().x();
            b(this.f);
        } catch (Exception e) {
            C4782n4.d().a(e);
            a();
        }
    }

    private J1 a(JSONObject jSONObject, Boolean bool) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        boolean optBoolean = jSONObject.optBoolean("sendEventsToggle", false);
        boolean optBoolean2 = jSONObject.optBoolean("eventsCompression", false);
        int optInt = jSONObject.optInt("eventsCompressionLevel", -1);
        String optString = jSONObject.optString("serverEventsURL", "");
        String optString2 = jSONObject.optString("serverEventsType", "");
        int optInt2 = jSONObject.optInt("backupThreshold", -1);
        int optInt3 = jSONObject.optInt("maxNumberOfEvents", -1);
        int optInt4 = jSONObject.optInt("maxEventsPerBatch", 5000);
        JSONArray optJSONArray = jSONObject.optJSONArray("optOut");
        if (optJSONArray != null) {
            int[] iArr5 = new int[optJSONArray.length()];
            for (int i = 0; i < optJSONArray.length(); i++) {
                iArr5[i] = optJSONArray.optInt(i);
            }
            iArr = iArr5;
        } else {
            iArr = null;
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("optIn");
        if (optJSONArray2 != null) {
            int[] iArr6 = new int[optJSONArray2.length()];
            for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                iArr6[i3] = optJSONArray2.optInt(i3);
            }
            iArr2 = iArr6;
        } else {
            iArr2 = null;
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("triggerEvents");
        if (optJSONArray3 != null) {
            int[] iArr7 = new int[optJSONArray3.length()];
            for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                iArr7[i4] = optJSONArray3.optInt(i4);
            }
            iArr3 = iArr7;
        } else {
            iArr3 = null;
        }
        JSONArray optJSONArray4 = jSONObject.optJSONArray("nonConnectivityEvents");
        if (optJSONArray4 != null) {
            int[] iArr8 = new int[optJSONArray4.length()];
            for (int i5 = 0; i5 < optJSONArray4.length(); i5++) {
                iArr8[i5] = optJSONArray4.optInt(i5);
            }
            iArr4 = iArr8;
        } else {
            iArr4 = null;
        }
        return new J1(bool.booleanValue(), optBoolean, optBoolean2, optInt, optString, optString2, optInt2, optInt3, optInt4, iArr, iArr2, iArr3, iArr4);
    }

    private int[] a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int[] iArr = new int[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            iArr[i] = optJSONArray.optInt(i);
        }
        return iArr;
    }

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str, boolean z2) {
        return jSONObject.has(str) ? jSONObject.optBoolean(str, z2) : jSONObject2.has(str) ? jSONObject2.optBoolean(str, z2) : z2;
    }

    private int a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i) {
        int i3 = 0;
        if (jSONObject.has(str)) {
            i3 = jSONObject.optInt(str, 0);
        } else if (jSONObject2.has(str)) {
            i3 = jSONObject2.optInt(str, 0);
        }
        return i3 == 0 ? i : i3;
    }

    private long a(JSONObject jSONObject, JSONObject jSONObject2, String str, long j) {
        long optLong;
        if (jSONObject.has(str)) {
            optLong = jSONObject.optLong(str, 0L);
        } else {
            optLong = jSONObject2.has(str) ? jSONObject2.optLong(str, 0L) : 0L;
        }
        return optLong == 0 ? j : optLong;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r7.toString().equals(r6) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C4702id a(JSONObject jSONObject) {
        EnumC4773md enumC4773md = null;
        if (jSONObject == null) {
            return null;
        }
        C4702id.a aVar = new C4702id.a();
        aVar.a(jSONObject.optBoolean("delivery", true));
        JSONObject optJSONObject = jSONObject.optJSONObject("capping");
        if (optJSONObject != null) {
            String optString = optJSONObject.optString(n1);
            if (!TextUtils.isEmpty(optString)) {
                EnumC4773md enumC4773md2 = EnumC4773md.PER_DAY;
                if (!enumC4773md2.toString().equals(optString)) {
                    enumC4773md2 = EnumC4773md.PER_HOUR;
                }
                enumC4773md = enumC4773md2;
            }
            int optInt = optJSONObject.optInt(l1, 0);
            aVar.a(optJSONObject.optBoolean("enabled", false) && optInt > 0, enumC4773md, optInt);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("pacing");
        if (optJSONObject2 != null) {
            int optInt2 = optJSONObject2.optInt(m1, 0);
            aVar.a(optJSONObject2.optBoolean("enabled", false) && optInt2 > 0, optInt2);
        }
        return aVar.a();
    }
}

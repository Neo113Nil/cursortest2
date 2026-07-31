package com.safedk.android.internal;

import android.os.Bundle;
import com.ironsource.V2;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d {
    public static final String A = "disableWebViewTracking";
    public static final String B = "imageMimeTypesList";
    public static final String C = "videoMimeTypesList";
    public static final String D = "audioMimeTypesList";
    public static final String E = "maxBannerUniformPixelsPercentageToStopSampling";
    public static final String F = "minBannerUniformPixelsPercentageForUniformImage";
    public static final String G = "maxAttemptsToCaptureBannerImage";
    public static final String H = "bannerImageSamplingInterval";
    public static final String I = "bannerDimensionsMaxSize";
    public static final String J = "isBannersEnabled";
    public static final String L = "https://edge.safedk.com";
    public static final String M = "https://edge.safedk.com";
    public static final long N = 1200000;
    public static final int O = 20;
    public static final String P = "apng;bmp;gif;x-icon;x-icon;png;svg+xml;tiff";
    public static final String Q = "wave;wav;x-wav;x-pn-wav;webm;ogg;";
    public static final String R = "webViewAnalysisIntervals";
    public static final String S = "webViewVideoObserverIntervals";
    public static final List<Integer> T;
    public static List<Integer> U = null;
    public static final String V = "bannersWebViewAnalysisIntervals";
    public static final List<Integer> W;
    public static List<Integer> X = null;
    public static final List<Integer> Y;
    public static List<Integer> Z = null;
    public static final int a = 300;
    private static final int aH = 8192;
    private static final int aJ = 540;
    private static final float aL = 2.5f;
    private static final float aN = 40.0f;
    private static final float aP = 90.0f;
    private static final int aR = 5;
    private static final int aT = 25000;
    private static final boolean aV = false;
    private static final int aX = 10000;
    private static final int aZ = 15000;
    public static List<Integer> aa = null;
    public static final String ab = "webViewMergeNetworkResources";
    private static final String ac = "SafeDKConfiguration";
    private static final String ad = "settings";
    private static final String ae = "android";
    private static final String af = "images";
    private static final String ag = "banners";
    private static final String ah = "adCaching";
    private static final String ai = "general";
    private static final String aj = "timers";
    private static final String ak = "redirectClickTimeout";
    private static final String al = "sdkSpecificMinUniformPixelsPercentageForUniformImage";
    private static final String am = "sdkSpecificCachedCIMaxAge";
    private static final String an = "sdkSpecificCachedCIExpiration";
    private static final String ao = "handleSVForPC";
    private static final int ap = 30000;
    private static final int aq = 30000;
    private static final int ar = 15000;
    public static final int b = 5000;
    private static final boolean bA = true;
    private static final boolean bC = true;
    private static final boolean bG = true;
    private static final String bI = "maxFileItemsToStoreOnDevice";
    private static final int bJ = 40;
    private static int bK = 0;
    private static final String bL = "mur";
    private static boolean bM = false;
    private static final int bb = 15000;
    private static final boolean bd = true;
    private static final int bn = 100;
    private static final float bq = 40.0f;
    private static final float bs = 90.0f;
    private static final int bu = 5;
    private static final int bw = 2;
    private static final int by = 480;
    public static final int c = 500;
    public static final String d = "minValidImageSize";
    public static final String e = "interstitialDimensionsMaxSize";
    public static final String f = "idsf";
    public static final String g = "maxUniformPixelsPercentageToStopSampling";
    public static final String h = "maxImagesToStoreOnDevice";
    public static final String i = "minImageSizeToStopSampling";
    public static final String j = "minUniformPixelsPercentageForUniformImage";
    public static final String k = "awsUploadTimeout";
    public static final String l = "resolveUrlTimeout";
    public static final String m = "clickValidityTimeout";
    public static final String n = "interstitialActivitiesToInclude";
    public static final String o = "interstitialActivitiesToExclude";
    public static final String p = "edgeServerUrl";
    public static final String q = "backupEdgeServerUrl";
    public static final String r = "devicesWithDebugLog";
    public static final String s = "cachedCreativeInfoMaxAge";
    public static final String t = "cachedMaxNumberOfItems";
    public static final String u = "cachedNumberOfItemsThreshold";
    public static final String v = "cacheSupportingSdkUUIDs";
    public static final String w = "safeDKDeactivation";
    public static final String x = "activePercentage";
    public static final String y = "deactivated";
    public static final String z = "alwaysTakeScreenshot";
    private boolean as = false;
    private int at = 300;
    private boolean au = false;
    private int av = 5000;
    private int aw = 500;
    public int K = 30000;
    private int ax = 30000;
    private int ay = 15000;
    private boolean az = false;
    private boolean aA = true;
    private boolean aB = false;
    private boolean aC = false;
    private JSONObject aD = new JSONObject();
    private JSONObject aE = new JSONObject();
    private ArrayList<String> aF = new ArrayList<>(Arrays.asList(com.safedk.android.utils.h.d, com.safedk.android.utils.h.b, com.safedk.android.utils.h.u, "com.five_corp.ad", com.safedk.android.utils.h.o));
    private boolean aG = false;
    private int aI = 8192;
    private int aK = aJ;
    private float aM = aL;
    private float aO = 40.0f;
    private float aQ = 90.0f;
    private int aS = 5;
    private long aU = V2.h;
    private boolean aW = false;
    private int aY = 10000;
    private int ba = 15000;
    private int bc = 15000;
    private boolean be = true;
    private ArrayList<String> bf = new ArrayList<>();
    private ArrayList<String> bg = new ArrayList<>();
    private String bh = "https://edge.safedk.com";
    private String bi = "https://edge.safedk.com";
    private ArrayList<String> bj = new ArrayList<>();
    private ArrayList<String> bk = new ArrayList<>();
    private long bl = 1200000;
    private int bm = 20;
    private int bo = 100;
    private final boolean bp = false;
    private float br = 40.0f;
    private float bt = 90.0f;
    private int bv = 5;
    private int bx = 2;
    private int bz = by;
    private boolean bB = true;
    private boolean bD = true;
    private List<String> bE = Arrays.asList(P.split(";"));
    private List<String> bF = Arrays.asList(Q.split(";"));
    private boolean bH = true;
    private boolean bN = false;

    public int a() {
        return this.K;
    }

    public int b() {
        return this.ax;
    }

    public int c() {
        return this.ay;
    }

    public boolean d() {
        return this.aG;
    }

    public int e() {
        return this.aI;
    }

    public int f() {
        return this.aK;
    }

    public float g() {
        return this.aM;
    }

    public float h() {
        return this.aO;
    }

    public float i() {
        return this.aQ;
    }

    public boolean j() {
        return this.aW;
    }

    public int k() {
        return this.aS;
    }

    public long l() {
        return this.aU;
    }

    public int m() {
        return this.aY;
    }

    public int n() {
        return this.ba;
    }

    public boolean o() {
        return this.bH;
    }

    public int p() {
        return this.bc;
    }

    public boolean q() {
        return this.be;
    }

    public float r() {
        return this.br;
    }

    public float s() {
        return this.bt;
    }

    public int t() {
        return this.bv;
    }

    public int u() {
        return this.bx;
    }

    public int v() {
        return this.bz;
    }

    public boolean w() {
        return this.bB;
    }

    public boolean x() {
        return this.bD;
    }

    public List<String> y() {
        return this.bE;
    }

    public List<String> z() {
        return this.bF;
    }

    static {
        List<Integer> asList = Arrays.asList(0, 2, 4, 8, 16, 32, 64);
        T = asList;
        U = asList;
        List<Integer> asList2 = Arrays.asList(0, 2, 4, 8, 16, 32, 64);
        W = asList2;
        X = asList2;
        List<Integer> asList3 = Arrays.asList(0, 2, 4, 8, 16, 32, 64);
        Y = asList3;
        Z = T;
        aa = asList3;
        bK = 40;
        bM = false;
    }

    public static int A() {
        return bK;
    }

    public static List<Integer> B() {
        return U;
    }

    public static List<Integer> C() {
        return X;
    }

    public static List<Integer> D() {
        return Z;
    }

    public static List<Integer> E() {
        return aa;
    }

    public void a(boolean z2) {
        this.bN = z2;
    }

    public boolean F() {
        return this.aC;
    }

    public boolean G() {
        return !this.bN;
    }

    public void b(boolean z2) {
        this.as = z2;
    }

    public boolean H() {
        return this.as;
    }

    public int I() {
        return this.at;
    }

    public void a(int i2) {
        this.av = i2;
    }

    public void b(int i2) {
        this.aw = i2;
    }

    public boolean J() {
        return this.az;
    }

    public boolean K() {
        return this.au;
    }

    public int L() {
        return this.av;
    }

    public int M() {
        return this.aw;
    }

    public JSONObject N() {
        return this.aD;
    }

    public JSONObject O() {
        return this.aE;
    }

    public Set<String> P() {
        return new HashSet(this.bj);
    }

    public boolean Q() {
        return this.aB;
    }

    public int R() {
        return this.bo;
    }

    public boolean S() {
        return bM;
    }

    public boolean a(Bundle bundle, boolean z2) {
        ArrayList<String> arrayList;
        Object[] objArr = new Object[2];
        objArr[0] = "parseSettings started , bundle : ";
        objArr[1] = bundle == null ? POBCommonConstants.NULL_VALUE : bundle.toString();
        Logger.d(ac, objArr);
        Bundle bundle2 = bundle.getBundle("settings");
        if (bundle2 == null) {
            if (z2) {
                Logger.e(ac, "Settings bundle is null, cannot parse settings. Saved settings will be used");
            }
            return false;
        }
        Logger.d(ac, "parseSettings starting DEACTIVATION");
        if (bundle2.containsKey(w)) {
            Bundle bundle3 = bundle2.getBundle(w);
            if (bundle3.containsKey(y)) {
                boolean z3 = bundle3.getBoolean(y, false);
                this.bN = z3;
                Logger.d(ac, "parseSettings deactivated ", Boolean.valueOf(z3));
            } else {
                this.bN = false;
            }
            if (bundle3.containsKey(x)) {
                int i2 = (int) bundle3.getDouble(x, 100.0d);
                this.bo = i2;
                Logger.d(ac, "parseSettings activePercentage ", Integer.valueOf(i2));
            } else {
                this.bo = 100;
            }
            if (!this.bN && this.bo != 100) {
                Logger.d(ac, "Checking active percentage");
                boolean z4 = !a(Double.valueOf(this.bo), SafeDK.getInstance().getUserId());
                this.bN = z4;
                Logger.d(ac, "After active percentage deactivated=", Boolean.valueOf(z4));
            }
        } else {
            this.bN = false;
            this.bo = 100;
            Logger.d(ac, "parseSettings SAFE_DK_DEACTIVATION settings block does not exist. Default configuration values will be used.");
        }
        float f2 = aL;
        int i3 = 4;
        char c2 = 3;
        if (bundle2 != null && bundle2.containsKey(af)) {
            Bundle bundle4 = bundle2.getBundle(af);
            Logger.d(ac, "parseSettings starting IMAGES : ", bundle4.toString());
            if (bundle4.containsKey(d)) {
                int i4 = bundle4.getInt(d, 8192);
                this.aI = i4;
                Logger.d(ac, "parseSettings minValidImageSize ", Integer.valueOf(i4));
            } else {
                this.aI = 8192;
            }
            if (bundle4.containsKey(e)) {
                int i5 = bundle4.getInt(e, aJ);
                this.aK = i5;
                Logger.d(ac, "parseSettings interstitialDimensionsMaxSize ", Integer.valueOf(i5));
            } else {
                this.aK = aJ;
            }
            if (bundle4.containsKey(f)) {
                Object obj = bundle4.get(f);
                if (obj instanceof Number) {
                    f2 = ((Number) obj).floatValue();
                }
                this.aM = f2;
                Logger.d(ac, "parseSettings ", f, " ", Float.valueOf(f2));
            } else {
                this.aM = aL;
            }
            if (!bundle4.containsKey(g)) {
                this.aO = 40.0f;
            } else {
                float f3 = (float) bundle4.getDouble(g, 40.0d);
                this.aO = f3;
                Logger.d(ac, "parseSettings maxUniformPixelsPercentageToStopSampling ", Float.valueOf(f3));
            }
            if (!bundle4.containsKey(h)) {
                this.aS = 5;
            } else {
                int i6 = bundle4.getInt(h, 5);
                this.aS = i6;
                Logger.d(ac, "parseSettings maxImagesToStoreOnDevice ", Integer.valueOf(i6));
            }
            if (!bundle4.containsKey(i)) {
                this.aU = V2.h;
            } else {
                long j2 = bundle4.getInt(i, 25000);
                this.aU = j2;
                Logger.d(ac, "parseSettings minImageSizeToStopSampling ", Long.valueOf(j2));
            }
            if (bundle4.containsKey(j)) {
                float f4 = (float) bundle4.getDouble(j, 90.0d);
                this.aQ = f4;
                Logger.d(ac, "parseSettings minUniformPixelsPercentageForUniformImage ", Float.valueOf(f4));
                CreativeInfoManager.a(AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE, this.aQ);
            }
            if (bundle4.containsKey(z)) {
                boolean z5 = bundle4.getBoolean(z, false);
                this.aW = z5;
                Logger.d(ac, "parseSettings alwaysTakeScreenshot ", Boolean.valueOf(z5));
            } else {
                this.aW = false;
            }
            if (bundle4.containsKey(ao)) {
                boolean z6 = bundle4.getBoolean(ao, true);
                this.be = z6;
                Logger.d(ac, "parseSettings handleSVForPC ", Boolean.valueOf(z6));
            } else {
                this.be = true;
            }
            try {
                if (bundle4.containsKey(al)) {
                    Logger.d(ac, "parseSettings sdkSpecificMinUniformPixelsPercentageForUniformImage ", bundle4.getBundle(al));
                    Bundle bundle5 = bundle4.getBundle(al);
                    for (String str : bundle5.keySet()) {
                        Object[] objArr2 = new Object[i3];
                        objArr2[0] = "parseSettings sdkSpecificMinUniformPixelsPercentageForUniformImage key = ";
                        objArr2[1] = str;
                        objArr2[2] = ", value = ";
                        objArr2[c2] = Double.valueOf(bundle5.getDouble(str));
                        Logger.d(ac, objArr2);
                        double d2 = bundle5.getDouble(str);
                        String sdkPackageByPackageUUID = SdksMapping.getSdkPackageByPackageUUID(str);
                        if (sdkPackageByPackageUUID != null) {
                            Logger.d(ac, "parseSettings sdkSpecificMinUniformPixelsPercentageForUniformImage identified UUID = ", str, ", sdkPackageName = ", sdkPackageByPackageUUID, ", value = ", Double.valueOf(d2));
                            com.safedk.android.analytics.brandsafety.creatives.b k2 = CreativeInfoManager.k(sdkPackageByPackageUUID);
                            if (k2 != null) {
                                float f5 = (float) d2;
                                k2.a(AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE, f5);
                                Logger.d(ac, "parseSettings sdkSpecificMinUniformPixelsPercentageForUniformImage UUID = ", str, ", sdkPackageName = ", sdkPackageByPackageUUID, ", value = ", Float.valueOf(f5));
                            }
                        }
                        c2 = 3;
                        i3 = 4;
                    }
                }
            } catch (Throwable th) {
                Logger.d(ac, "parseSettings sdkSpecificMinUniformPixelsPercentageForUniformImage Exception : ", th.getMessage(), th);
            }
        } else {
            this.aI = 8192;
            this.aK = aJ;
            this.aM = aL;
            this.aO = 40.0f;
            this.aS = 5;
            this.aU = V2.h;
            Logger.d(ac, "minUniformPixelsPercentageForUniformImage set to ", Float.valueOf(this.aQ));
            this.aW = false;
            Logger.d(ac, "parseSettings IMAGES settings block does not exist. Default configuration values will be used.");
        }
        Logger.d(ac, "parseSettings starting BANNERS");
        if (bundle2 == null || !bundle2.containsKey(ag)) {
            this.br = 40.0f;
            this.bt = 90.0f;
            this.bv = 5;
            this.bx = 2;
            this.bz = by;
            this.bB = true;
            Logger.d(ac, "parseSettings BANNERS settings block does not exist. Default configuration values will be used.");
        } else {
            Bundle bundle6 = bundle2.getBundle(ag);
            if (!bundle6.containsKey(E)) {
                this.br = 40.0f;
            } else {
                float f6 = (float) bundle6.getDouble(E, 40.0d);
                this.br = f6;
                Logger.d(ac, "parseSettings maxBannerUniformPixelsPercentageToStopSampling ", Float.valueOf(f6));
            }
            if (!bundle6.containsKey(F)) {
                this.bt = 90.0f;
            } else {
                float f7 = (float) bundle6.getDouble(F, 90.0d);
                this.bt = f7;
                Logger.d(ac, "parseSettings minBannerUniformPixelsPercentageForUniformImage ", Float.valueOf(f7));
            }
            if (!bundle6.containsKey(G)) {
                this.bv = 5;
            } else {
                int i7 = bundle6.getInt(G, 5);
                this.bv = i7;
                Logger.d(ac, "parseSettings maxAttemptsToCaptureBannerImage ", Integer.valueOf(i7));
            }
            if (bundle6.containsKey(H)) {
                int i8 = bundle6.getInt(H, 2);
                this.bx = i8;
                Logger.d(ac, "parseSettings bannerImageSamplingInterval ", Integer.valueOf(i8));
            } else {
                this.bx = 2;
            }
            if (bundle6.containsKey(I)) {
                int i9 = bundle6.getInt(I, by);
                this.bz = i9;
                Logger.d(ac, "parseSettings bannerDimensionsMaxSize ", Integer.valueOf(i9));
            } else {
                this.bz = by;
            }
            if (bundle6.containsKey(J)) {
                boolean z7 = bundle6.getBoolean(J, true);
                this.bB = z7;
                Logger.d(ac, "parseSettings bannerIsEnabled ", Boolean.valueOf(z7));
            } else {
                this.bB = true;
            }
        }
        Logger.d(ac, "parseSettings starting TIMERS");
        if (!bundle2.containsKey(aj)) {
            this.aY = 10000;
            this.ba = 15000;
            this.bc = 15000;
            this.K = 30000;
            Logger.d(ac, "parseSettings TIMERS settings block does not exist. Default configuration values will be used.");
        } else {
            Bundle bundle7 = bundle2.getBundle(aj);
            if (!bundle7.containsKey(k)) {
                this.aY = 10000;
            } else {
                int i10 = (int) bundle7.getDouble(k, 10000.0d);
                this.aY = i10;
                if (z2) {
                    this.aY = i10 * 1000;
                }
                Logger.d(ac, "parseSettings awsUploadTimeout (ms) ", Integer.valueOf(this.aY));
            }
            if (bundle7.containsKey(l)) {
                int i11 = (int) bundle7.getDouble(l, 15000.0d);
                this.ba = i11;
                if (z2) {
                    this.ba = i11 * 1000;
                }
                Logger.d(ac, "parseSettings resolveUrlTimeout (ms) ", Integer.valueOf(this.ba));
            } else {
                this.ba = 15000;
            }
            if (bundle7.containsKey(m)) {
                int i12 = ((int) bundle7.getDouble(m, 15000.0d)) * 1000;
                this.bc = i12;
                if (z2) {
                    this.bc = i12 * 1000;
                }
                Logger.d(ac, "parseSettings clickValidityTimeout (ms) ", Integer.valueOf(this.bc));
            } else {
                this.bc = 15000;
            }
            if (!bundle7.containsKey(ak)) {
                this.K = 30000;
            } else {
                int i13 = bundle7.getInt(ak, 30) * 1000;
                this.K = i13;
                Logger.d(ac, "parseSettings redirectClickTimeout (ms) value is ", Integer.valueOf(i13), ", isFromServer=", Boolean.valueOf(z2));
            }
        }
        Logger.d(ac, "parseSettings starting ANDROID");
        if (bundle2.containsKey("android")) {
            Bundle bundle8 = bundle2.getBundle("android");
            if (bundle8.containsKey(n)) {
                ArrayList<String> stringArrayList = bundle8.getStringArrayList(n);
                this.bf = stringArrayList;
                Logger.d(ac, "parseSettings interstitialActivitiesToInclude ", stringArrayList);
            }
            if (bundle8.containsKey(o)) {
                ArrayList<String> stringArrayList2 = bundle8.getStringArrayList(o);
                this.bg = stringArrayList2;
                Logger.d(ac, "parseSettings interstitialActivitiesToExclude ", stringArrayList2);
            }
            ArrayList<String> arrayList2 = this.bf;
            if ((arrayList2 != null && arrayList2.size() > 0) || ((arrayList = this.bg) != null && arrayList.size() > 0)) {
                Iterator<String> it = this.bf.iterator();
                while (it.hasNext()) {
                    BrandSafetyUtils.m(it.next());
                }
                Iterator<String> it2 = this.bg.iterator();
                while (it2.hasNext()) {
                    BrandSafetyUtils.n(it2.next());
                }
            }
            if (bundle8.containsKey(A)) {
                boolean z8 = bundle8.getBoolean(A, false);
                this.aG = z8;
                Logger.d(ac, "parseSettings disableWebViewTracking ", Boolean.valueOf(z8));
            }
            if (bundle8.containsKey(S)) {
                try {
                    ArrayList<String> stringArrayList3 = bundle8.getStringArrayList(S);
                    if (stringArrayList3 != null && stringArrayList3.size() > 0) {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator<String> it3 = stringArrayList3.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(Integer.valueOf(Integer.parseInt(it3.next())));
                        }
                        Z = new ArrayList(arrayList3);
                    }
                } catch (Exception e2) {
                    Logger.d(ac, "caught exception: ", e2);
                }
                Logger.d(ac, "parseSettings chosen interstitial video observer intervals: ", Z);
            }
            if (bundle8.containsKey(R)) {
                try {
                    ArrayList<String> stringArrayList4 = bundle8.getStringArrayList(R);
                    if (stringArrayList4 != null && stringArrayList4.size() > 0) {
                        ArrayList arrayList4 = new ArrayList();
                        Iterator<String> it4 = stringArrayList4.iterator();
                        while (it4.hasNext()) {
                            arrayList4.add(Integer.valueOf(Integer.parseInt(it4.next())));
                        }
                        U = new ArrayList(arrayList4);
                    }
                } catch (Exception e3) {
                    Logger.d(ac, "caught exception: ", e3);
                }
                Logger.d(ac, "parseSettings chosen interstitial resource scanning intervals: ", U);
            } else {
                Logger.d(ac, "parseSettings chosen default interstitial resource scanning intervals: ");
            }
            if (bundle8.containsKey(V)) {
                try {
                    ArrayList<String> stringArrayList5 = bundle8.getStringArrayList(V);
                    if (stringArrayList5 != null && stringArrayList5.size() > 0) {
                        ArrayList arrayList5 = new ArrayList();
                        Iterator<String> it5 = stringArrayList5.iterator();
                        while (it5.hasNext()) {
                            arrayList5.add(Integer.valueOf(Integer.parseInt(it5.next())));
                        }
                        X = new ArrayList(arrayList5);
                    }
                } catch (Exception e4) {
                    Logger.d(ac, "caught exception: ", e4);
                }
                Logger.d(ac, "parseSettings chosen banner resource scanning intervals: ", X);
            } else {
                Logger.d(ac, "parseSettings chosen default banner resource scanning intervals: ");
            }
            if (bundle8.containsKey(ab)) {
                try {
                    this.bH = bundle8.getBoolean(ab);
                } catch (Exception e5) {
                    Logger.d(ac, "caught exception: ", e5);
                }
            }
        } else {
            Logger.d(ac, "parseSettings ANDROID settings block does not exist. Default configuration values will be used.");
        }
        Logger.d(ac, "parseSettings starting GENERAL");
        if (bundle2.containsKey(ai)) {
            Bundle bundle9 = bundle2.getBundle(ai);
            if (bundle9.containsKey(p)) {
                String string = bundle9.getString(p, "https://edge.safedk.com");
                this.bh = string;
                String a2 = a(string);
                this.bh = a2;
                Logger.d(ac, "parseSettings edgeServerUrl ", a2);
            } else {
                this.bh = "https://edge.safedk.com";
            }
            if (bundle9.containsKey(q)) {
                String string2 = bundle9.getString(q, "https://edge.safedk.com");
                this.bi = string2;
                String a3 = a(string2);
                this.bi = a3;
                Logger.d(ac, "parseSettings backupEdgeServerUrl ", a3);
            } else {
                this.bi = "https://edge.safedk.com";
            }
            AppLovinBridge.receiveEdgeUrls(this.bh, this.bi);
            if (bundle9.containsKey(r)) {
                ArrayList<String> stringArrayList6 = bundle9.getStringArrayList(r);
                this.bj = stringArrayList6;
                Logger.d(ac, "parseSettings devicesWithDebugLog ", stringArrayList6);
            }
            if (bundle9.containsKey(bI)) {
                int i14 = bundle9.getInt(bI);
                bK = i14;
                Logger.d(ac, "parseSettings fileStorageMaxSize ", Integer.valueOf(i14));
            }
            if (bundle9.containsKey(bL)) {
                boolean z9 = bundle9.getBoolean(bL);
                bM = z9;
                Logger.d(ac, "parseSettings shouldIncludeMintegralRedirectData ", Boolean.valueOf(z9));
            }
        } else {
            Logger.d(ac, "parseSettings GENERAL settings block does not exist. Default configuration values will be used.");
        }
        Logger.d(ac, "parseSettings starting Ad CACHING");
        if (!bundle2.containsKey(ah)) {
            this.bl = 1200000L;
            this.bm = 20;
            Logger.d(ac, "parseSettings AD_CACHING settings block does not exist. Default configuration values will be used.");
        } else {
            Bundle bundle10 = bundle2.getBundle(ah);
            if (!bundle10.containsKey(s)) {
                this.bl = 1200000L;
            } else {
                long j3 = (int) bundle10.getDouble(s, 1200000.0d);
                this.bl = j3;
                Logger.d(ac, "parseSettings cachedCreativeInfoMaxAge ", Long.valueOf(j3));
            }
            CreativeInfoManager.a(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE, this.bl);
            if (!bundle10.containsKey(t)) {
                this.bm = 20;
            } else {
                int i15 = bundle10.getInt(t);
                this.bm = i15;
                Logger.d(ac, "parseSettings cachedMaxNumberOfItems ", Integer.valueOf(i15));
            }
            if (bundle10.containsKey(v)) {
                ArrayList<String> stringArrayList7 = bundle10.getStringArrayList(v);
                this.bk = stringArrayList7;
                Logger.d(ac, "parseSettings cacheSupportingSdkUUIDs ", stringArrayList7);
            }
            ArrayList<String> arrayList6 = this.bk;
            if (arrayList6 != null && arrayList6.size() > 0) {
                a(this.bk);
            }
            try {
                if (bundle10.containsKey(am)) {
                    Logger.d(ac, "parseSettings sdkSpecificCachedCIMaxAge ", bundle10.getBundle(am));
                    Bundle bundle11 = bundle10.getBundle(am);
                    for (String str2 : bundle11.keySet()) {
                        Logger.d(ac, "parseSettings sdkSpecificCachedCIMaxAge key = ", str2, ", value = ", Double.valueOf(bundle11.getDouble(str2)));
                        long j4 = (long) bundle11.getDouble(str2);
                        String sdkPackageByPackageUUID2 = SdksMapping.getSdkPackageByPackageUUID(str2);
                        if (sdkPackageByPackageUUID2 != null) {
                            Logger.d(ac, "parseSettings sdkSpecificCachedCIMaxAge identified UUID = ", str2, ", sdkPackageName = ", sdkPackageByPackageUUID2, ", value = ", Long.valueOf(j4));
                            com.safedk.android.analytics.brandsafety.creatives.b k3 = CreativeInfoManager.k(sdkPackageByPackageUUID2);
                            if (k3 != null) {
                                k3.a(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE, j4);
                                Logger.d(ac, "parseSettings sdkSpecificCachedCIMaxAge UUID = ", str2, ", sdkPackageName = ", sdkPackageByPackageUUID2, ", value = ", Long.valueOf(j4));
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                Logger.d(ac, "parseSettings sdkSpecificCachedCreativeInfoMaxAge Exception : ", th2.getMessage(), th2);
            }
            try {
                if (bundle10.containsKey(an)) {
                    Logger.d(ac, "parseSettings sdkSpecificCachedCreativeInfoMaxAge ", bundle10.getBundle(an));
                    Bundle bundle12 = bundle10.getBundle(an);
                    for (String str3 : bundle12.keySet()) {
                        Logger.d(ac, "parseSettings sdkSpecificCachedCIExpirationBundle key = ", str3, ", value = ", Boolean.valueOf(bundle12.getBoolean(str3)));
                        boolean z10 = bundle12.getBoolean(str3);
                        String sdkPackageByPackageUUID3 = SdksMapping.getSdkPackageByPackageUUID(str3);
                        if (sdkPackageByPackageUUID3 != null) {
                            Logger.d(ac, "parseSettings sdkSpecificCachedCIExpirationBundle identified UUID = ", str3, ", sdkPackageName = ", sdkPackageByPackageUUID3, ", value = ", Boolean.valueOf(z10));
                            com.safedk.android.analytics.brandsafety.creatives.b k4 = CreativeInfoManager.k(sdkPackageByPackageUUID3);
                            if (k4 != null) {
                                k4.b(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_EXPIRATION, z10);
                                Logger.d(ac, "parseSettings sdkSpecificCachedCIExpirationBundle UUID = ", str3, ", sdkPackageName = ", sdkPackageByPackageUUID3, ", value = ", Boolean.valueOf(z10));
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                Logger.d(ac, "parseSettings sdkSpecificCachedCIExpirationBundle Exception : ", th3.getMessage(), th3);
            }
        }
        return true;
    }

    private void a(JSONObject jSONObject) throws JSONException {
        Logger.d(ac, "Attempting to parse sdk specific uniformity threshold. setting : ", jSONObject);
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                int i2 = jSONObject.getInt(next);
                String sdkPackageByPackageUUID = SdksMapping.getSdkPackageByPackageUUID(next);
                if (sdkPackageByPackageUUID != null) {
                    Logger.d(ac, "Parse sdk specific uniformity threshold setting identified, UUID = ", next, ", sdkPackageName = ", sdkPackageByPackageUUID, ", value = ", Integer.valueOf(i2));
                    com.safedk.android.analytics.brandsafety.creatives.b k2 = CreativeInfoManager.k(sdkPackageByPackageUUID);
                    if (k2 != null) {
                        k2.a(AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE, i2);
                        Logger.d(ac, "Parse sdk specific uniformity threshold set, UUID = ", next, ", sdkPackageName = ", sdkPackageByPackageUUID, ", value = ", Integer.valueOf(i2));
                    }
                }
            }
            return;
        }
        Logger.d(ac, "Cannot parse sdk specific uniformity setting, json is null");
    }

    private void a(Bundle bundle) {
        Logger.d(ac, "processSdkVersionsBundle started, bundle=", bundle.toString());
    }

    private void a(ArrayList<String> arrayList) {
        this.aF.clear();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            Logger.d(ac, "Adding cacheSupportingSDKUUID ", next, " to cacheSupportedSdk List");
            this.aF.add(next);
        }
    }

    private String a(String str) {
        if (str != null && str.length() > 0) {
            try {
                URL url = new URL(str);
                String protocol = url.getProtocol();
                String host = url.getHost();
                int port = url.getPort();
                if (port == -1) {
                    return String.format("%s://%s", protocol, host);
                }
                return String.format("%s://%s:%d", protocol, host, Integer.valueOf(port));
            } catch (MalformedURLException e2) {
                Logger.e(ac, "Exception sanitizing server url:", e2.getMessage(), e2);
            }
        }
        return str;
    }

    private boolean a(Double d2, String str) {
        Logger.d(ac, "checkActivePercent started, activePercent=", d2, ", userId=", str);
        float a2 = DeviceData.a("", str);
        Logger.d(ac, "checkActivePercent hashValue ==", Float.valueOf(a2));
        return ((double) a2) <= d2.doubleValue();
    }

    public long T() {
        return this.bl;
    }

    public int U() {
        return this.bm;
    }

    public ArrayList<String> V() {
        return this.aF;
    }
}

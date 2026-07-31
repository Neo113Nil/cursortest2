package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.b;
import com.safedk.android.analytics.brandsafety.creatives.g;
import com.safedk.android.analytics.brandsafety.m;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.internal.d;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistableBase;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.k;
import com.safedk.android.utils.n;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.bidmachine.unified.UnifiedMediationParams;
import java.net.URLEncoder;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class CreativeInfo extends PersistableBase {
    public static final String A = "details?id=";
    public static final String B = "isVideoAd";
    public static final String C = "isPlayable";
    public static final String D = "campaign_id";
    public static final String L = "buyer_id";
    public static final String O = "exact_webview_prefetch";
    public static final String S = "ad_system";
    public static final String T = "text_ad";
    public static final String V = "image_ad";
    private static final String a = "CreativeInfo";
    public static final String aF = "native_banner";
    public static final String aG = "/ad_count_";
    public static final String aH = "/multiple_ads";
    public static final String aI = "/multi_ad";
    public static final String aJ = "matchingMethodAddress";
    public static final String aK = "title:";
    public static final String aL = "mainImg:";
    public static final String aM = "icon:";
    public static final String aN = "body:";
    public static final String aO = "cta:";
    public static final String aP = "star:";
    public static final String aQ = "advertiser:";
    public static final String aR = "element:";
    public static final String aS = "comment:";
    public static final String aT = "ad_domain";
    public static final String ak = "end_card_url";
    public static final String al = "html";
    public static final String am = "vast_ad_tag_uris";
    public static final String an = "text_ad_gradient";
    public static final String ao = "event_id";
    public static final String ap = "text:";
    public static final String aq = "video:";
    public static final String aw = "native";
    public static final String b = "prefetchTimestamp";
    public static final String c = "ad_id";
    public static final String d = "creative_id";
    public static final String e = "video_url";
    public static final String f = "log";
    public static final String g = "ci_debug_info";
    public static final String h = "exact_";
    public static final String i = "exact_fbLabel";
    public static final String j = "exact_markup";
    public static final String k = "exact_video";
    public static final String l = "exact_resource";
    public static final String m = "exact_ad_id";
    public static final String n = "exact_ad_object";
    public static final String o = "heuristic_mediation";
    public static final String p = "heuristic_pending";
    public static final String q = "downstream_struct";
    public static final String r = "vast";
    public static final String s = "survey";
    private static final long serialVersionUID = 2;
    public static final String t = "text";
    public static final String u = "playable";
    public static final String v = "image";
    public static final String w = "mraid";
    public static final String x = "dsp_creative_id";
    public static final String y = "exact_event_id";
    public static final String z = "prefetch_resource_urls";
    private BrandSafetyUtils.AdType E;
    protected String F;
    protected boolean G;
    protected boolean H;
    protected boolean I;
    protected String J;
    protected String K;
    protected String M;
    protected final HashSet<String> N;
    protected final HashSet<String> P;
    public String Q;
    Timestamp R;
    boolean U;
    boolean W;
    protected String X;
    private String Y;
    private boolean Z;
    private String aA;
    private String aB;
    private boolean aC;
    private String aD;
    private String aE;
    protected String aU;
    protected String aV;
    protected String aW;
    protected String aX;
    protected final HashSet<String> aY;
    long aZ;
    private String aa;
    private long ab;
    private String ac;
    protected String ad;
    private int ae;
    private final List<String> af;
    private boolean ag;
    private String ah;
    private String ai;
    private List<String> aj;
    protected String ar;
    protected String as;
    protected String at;
    protected final HashSet<String> au;
    boolean av;
    public final Set<String> ax;
    public boolean ay;
    private transient View az;
    boolean ba;
    boolean bb;
    boolean bc;
    boolean bd;
    protected boolean be;
    protected final m bf;
    public final List<String> bg;
    private boolean bh;
    private String bi;
    private boolean bj;
    private boolean bk;
    private List<String> bl;

    public CreativeInfo() {
        this.af = new ArrayList();
        this.az = null;
        this.Z = false;
        this.aU = null;
        this.G = false;
        this.H = false;
        this.ab = 0L;
        this.aC = false;
        this.ag = false;
        this.bh = true;
        this.ah = null;
        this.bi = null;
        this.N = new HashSet<>();
        this.P = new HashSet<>();
        this.aY = new HashSet<>();
        this.au = new LinkedHashSet();
        this.U = false;
        this.ba = false;
        this.bb = false;
        this.bc = false;
        this.av = false;
        this.W = false;
        this.bd = false;
        this.be = false;
        this.bf = new m();
        this.bg = new ArrayList();
        this.ax = new HashSet();
        this.ay = false;
        this.bk = false;
        this.bl = new ArrayList();
    }

    public CreativeInfo(BrandSafetyUtils.AdType adType, String sdk, String id, String creativeId, String clickUrl, String videoUrl, String downstreamStruct, String sdkVersion) {
        this.af = new ArrayList();
        this.az = null;
        this.Z = false;
        this.aU = null;
        this.G = false;
        this.H = false;
        this.ab = 0L;
        this.aC = false;
        this.ag = false;
        this.bh = true;
        this.ah = null;
        this.bi = null;
        this.N = new HashSet<>();
        this.P = new HashSet<>();
        this.aY = new HashSet<>();
        this.au = new LinkedHashSet();
        this.U = false;
        this.ba = false;
        this.bb = false;
        this.bc = false;
        this.av = false;
        this.W = false;
        this.bd = false;
        this.be = false;
        this.bf = new m();
        this.bg = new ArrayList();
        this.ax = new HashSet();
        this.ay = false;
        this.bk = false;
        this.bl = new ArrayList();
        this.aa = sdk;
        this.E = adType;
        this.aa = sdk;
        this.Y = id;
        k(creativeId);
        a(clickUrl, true);
        p(videoUrl);
        this.ag = true;
        this.ab = n.b(SystemClock.elapsedRealtime());
        this.F = downstreamStruct;
        this.bf.a(m.a, new m.a[0]);
        ah();
        ad();
        Logger.d(a, "creative info ctor: expirationTimestamp=", this.R, ", lastAccessTimeMillis=", Long.valueOf(this.aZ));
        if (sdkVersion != null) {
            this.Q = sdkVersion;
            return;
        }
        String sdkVersionByPackage = SdksMapping.getSdkVersionByPackage(sdk);
        this.Q = sdkVersionByPackage;
        Logger.d(a, "package version updated, package : ", sdk, ", sdkVersion : ", sdkVersionByPackage);
    }

    public boolean c(String str) {
        return this.ax.contains(str);
    }

    public boolean d(String str) {
        boolean contains;
        synchronized (this.af) {
            contains = this.af.contains(str);
        }
        return contains;
    }

    public boolean c() {
        return this.ay;
    }

    public void d() {
        this.ay = true;
    }

    public List<String> e() {
        return this.bg;
    }

    public View f() {
        return this.az;
    }

    public void a(View view) {
        this.az = view;
    }

    public boolean g() {
        return this.Z;
    }

    public String h() {
        return this.F;
    }

    public void e(String str) {
        this.F = str;
    }

    public void f(String str) {
        a(str, "");
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        if (TextUtils.isEmpty(this.F)) {
            this.F = str;
            return;
        }
        this.F += str2 + str;
    }

    public String j() {
        Logger.d(a, "getAdUnitId started with the stored value: ", this.aU);
        return this.aU;
    }

    public void g(String str) {
        Logger.d(a, "setAdUnitId started with ad unit id: ", str);
        this.aU = str;
    }

    public boolean k() {
        return this.I;
    }

    public String l() {
        return this.as;
    }

    public void a(boolean z2) {
        this.aC = z2;
    }

    public boolean m() {
        return this.aC;
    }

    public String n() {
        return this.aD;
    }

    public void h(String str) {
        this.aD = str;
    }

    public void i(String str) {
        this.aX = str;
    }

    public String o() {
        return this.aX;
    }

    public void j(String str) {
        this.K = str;
    }

    public String p() {
        return this.M;
    }

    public HashSet<String> q() {
        return this.N;
    }

    public HashSet<String> r() {
        return this.P;
    }

    public HashSet<String> s() {
        return this.aY;
    }

    public String t() {
        return this.Q;
    }

    public HashSet<String> u() {
        return this.au;
    }

    public void b(boolean z2) {
        this.av = z2;
    }

    public void c(boolean z2) {
        this.bb = z2;
    }

    public boolean v() {
        return this.bb;
    }

    public void d(boolean z2) {
        this.bc = z2;
    }

    public boolean w() {
        return this.bc;
    }

    public boolean x() {
        return this.W;
    }

    public boolean y() {
        return this.U;
    }

    public void e(boolean z2) {
        this.U = z2;
    }

    public boolean z() {
        return this.av;
    }

    public String A() {
        return this.X;
    }

    public boolean B() {
        return this.be;
    }

    public void f(boolean z2) {
        this.be = z2;
    }

    public void C() {
        this.bj = true;
    }

    public boolean D() {
        return this.bj;
    }

    public m E() {
        return this.bf;
    }

    public void k(String str) {
        this.ac = str;
    }

    public void l(String str) {
        Logger.d(a, "set Dsp Creative Id - set to value: ", str);
        this.aB = str;
    }

    public void m(String str) {
        this.ar = str;
    }

    public void n(String str) {
        this.aA = str;
    }

    public void o(String str) {
        this.as = str;
    }

    public String F() {
        return this.K;
    }

    public String G() {
        StringBuilder sb = new StringBuilder();
        if (this.G) {
            sb.append(this.Y);
        }
        sb.append(this.ac);
        sb.append(this.J);
        return sb.toString();
    }

    public String H() {
        return this.J;
    }

    public void p(String str) {
        String D2 = D(str);
        this.J = D2;
        Logger.d(a, "setting video url to: ", D2);
        y(this.J);
    }

    public String I() {
        return this.aE;
    }

    public void a(BrandSafetyEvent.AdFormatType adFormatType) {
        if (adFormatType == null) {
            Logger.d(a, "adFormat is null , existing");
        } else if (adFormatType == BrandSafetyEvent.AdFormatType.LEADER) {
            this.aE = BrandSafetyEvent.AdFormatType.BANNER.name();
        } else {
            this.aE = adFormatType.name();
        }
    }

    public void q(String str) {
        Logger.d(a, "setPackageName: ", str);
        this.M = str;
    }

    public void a(String str, Set<String> set) {
        a(Arrays.asList(str), set);
    }

    public void a(List<String> list, Set<String> set) {
        Logger.d(a, "add recommendations: ", list, ", resources list: ", set);
        if (list != null) {
            synchronized (this.bg) {
                this.bg.addAll(list);
            }
            Logger.d(a, "add recommendations added : ", list);
        }
        if (set != null) {
            synchronized (this.ax) {
                this.ax.addAll(set);
            }
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                String D2 = D(it.next());
                if (!TextUtils.isEmpty(D2)) {
                    synchronized (this.ax) {
                        this.ax.add(D2);
                    }
                }
            }
        }
    }

    public Bundle b() {
        List<String> list;
        Bundle bundle = new Bundle();
        boolean a2 = CreativeInfoManager.a(this.aa, AdNetworkConfiguration.SHOULD_REPORT_AD_ID_ON_CI_CREATION, true);
        if (!TextUtils.isEmpty(this.Y) && a2) {
            bundle.putString(c, this.Y);
        }
        if (this.H) {
            bundle.putLong(b, this.ab);
        }
        if (!TextUtils.isEmpty(this.ac)) {
            bundle.putString("creative_id", this.ac);
        }
        if (!TextUtils.isEmpty(this.aB)) {
            bundle.putString(x, this.aB);
        }
        if (!TextUtils.isEmpty(this.ar)) {
            bundle.putString(L, this.ar);
        }
        if (!TextUtils.isEmpty(this.as)) {
            bundle.putString(S, this.as);
        }
        if (!TextUtils.isEmpty(this.J)) {
            bundle.putString("video_url", this.J);
        }
        if (!TextUtils.isEmpty(this.at)) {
            bundle.putString(ak, this.at);
        }
        if (!TextUtils.isEmpty(this.ai)) {
            bundle.putString(g, this.ai);
        }
        if (!TextUtils.isEmpty(this.F)) {
            bundle.putString(q, this.F);
        }
        if (!TextUtils.isEmpty(this.K)) {
            bundle.putString("zone_id", this.K);
        }
        bundle.putString("ad_format_type", this.aE);
        if (!TextUtils.isEmpty(this.M)) {
            bundle.putString(BrandSafetyEvent.g, this.M);
        }
        bundle.putString("sdk_version", this.Q);
        if (!TextUtils.isEmpty(this.aX)) {
            bundle.putString(aT, this.aX);
        }
        HashSet<String> hashSet = this.N;
        if (hashSet != null && !hashSet.isEmpty()) {
            synchronized (this.N) {
                bundle.putStringArrayList(BrandSafetyEvent.h, new ArrayList<>(this.N));
            }
        }
        HashSet<String> hashSet2 = this.P;
        if (hashSet2 != null && !hashSet2.isEmpty()) {
            synchronized (this.P) {
                bundle.putStringArrayList(z, new ArrayList<>(this.P));
            }
        }
        HashSet<String> hashSet3 = this.au;
        if (hashSet3 != null && !hashSet3.isEmpty()) {
            synchronized (this.au) {
                bundle.putStringArrayList(am, new ArrayList<>(this.au));
            }
        }
        if (this.ay && (list = this.bg) != null && !list.isEmpty()) {
            synchronized (this.bg) {
                bundle.putStringArrayList(BrandSafetyEvent.u, new ArrayList<>(this.bg));
            }
        }
        HashSet<FileUploadManager.FileUploadData> a3 = FileUploadManager.a().a(this);
        if (a3 != null && a3.size() > 0) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<FileUploadManager.FileUploadData> it = a3.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().h());
            }
            bundle.putParcelableArrayList(FileUploadManager.i, arrayList);
        }
        return bundle;
    }

    public boolean a() {
        return this.ac == null;
    }

    public boolean J() {
        return !this.ag;
    }

    public BrandSafetyUtils.AdType K() {
        return this.E;
    }

    public void a(BrandSafetyUtils.AdType adType) {
        if (adType == null) {
            Logger.d(a, "setAdType - ad type is null, not setting");
            return;
        }
        Logger.d(a, "setAdType - set to ad type: ", adType, " for ci with id: ", this.Y);
        this.E = adType;
        ad();
    }

    public String L() {
        return this.Y;
    }

    public void r(String str) {
        this.Y = str;
    }

    public String M() {
        return this.ad;
    }

    public String N() {
        return this.ac;
    }

    public String O() {
        return this.aB;
    }

    public String P() {
        return this.ar;
    }

    public String Q() {
        return this.aa;
    }

    public void s(String str) {
        this.aa = str;
    }

    public String R() {
        return this.aA;
    }

    public int S() {
        return this.ae;
    }

    public void a(int i2) {
        this.ae = i2;
    }

    public void T() {
        Logger.d(a, "resetting click url");
        this.ad = null;
    }

    public void a(String str, boolean z2) {
        Logger.d(a, "setting click url to: ", str);
        this.ad = str;
        this.bk = z2;
    }

    public void g(boolean z2) {
        this.I = z2;
    }

    public void a(String str, String str2, String str3) {
        this.ah = str;
        if (str2 != null) {
            this.bi = str2;
        }
        if (str3 != null) {
            u("mi=" + str3);
        }
    }

    public void t(String str) {
        this.bi = str;
    }

    public void U() {
        this.ah = null;
        this.bi = null;
    }

    public void u(String str) {
        if (str != null) {
            String str2 = this.ai;
            if (str2 == null) {
                this.ai = str;
                return;
            }
            if (!str2.contains(str)) {
                this.ai += m.ac + str;
                return;
            }
            Logger.d(a, "setDebugInfo ci debug info already contains the string. skipping. content : ", str);
        }
    }

    public void V() {
        this.ai = null;
    }

    public String W() {
        return this.ai;
    }

    public String X() {
        return this.ah;
    }

    public String Y() {
        return this.bi;
    }

    public boolean a(Map<Integer, CreativeInfo> map) {
        if (this.ae == 0) {
            return false;
        }
        synchronized (map) {
            map.put(Integer.valueOf(this.ae), this);
        }
        return true;
    }

    public boolean b(Map<Integer, CreativeInfo> map) {
        CreativeInfo remove;
        if (this.ae == 0) {
            return false;
        }
        synchronized (map) {
            remove = map.remove(Integer.valueOf(this.ae));
        }
        return remove != null;
    }

    public boolean c(Map<String, CreativeInfo> map) {
        CreativeInfo remove;
        if (!WebView.class.getCanonicalName().equals(this.aV)) {
            return false;
        }
        synchronized (map) {
            remove = map.remove(this.aV);
        }
        return remove != null;
    }

    public void a(List<String> list) {
        this.aj = list;
    }

    public List<String> Z() {
        return this.aj;
    }

    public void b(List<String> list) {
        if (list != null) {
            for (String str : list) {
                if (str != null) {
                    String D2 = D(str);
                    String E = E(str);
                    if (!TextUtils.isEmpty(D2)) {
                        if (b(str) || b(D2) || b(E) || str.startsWith(aR)) {
                            Logger.d(a, "classifyPrefetchUrl ", this.aa, " url is a prefetch url ", str);
                            y(D2);
                        } else if (v(D2) && !D2.equals(this.ad)) {
                            Logger.d(a, "classifyPrefetchUrl ", this.aa, " url is a dsp url ", str);
                            x(D2);
                        } else {
                            Logger.d(a, "classifyPrefetchUrl ", this.aa, " url is not a prefetch nor a dsp url and will be discarded : ", str);
                        }
                    }
                }
            }
        }
    }

    public void c(List<String> list) {
        if (list != null) {
            Logger.printFullVerboseLog(a, "add prefetch urls : ", list);
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                y(it.next());
            }
        }
    }

    protected boolean v(String str) {
        return g.a(this.aa, str);
    }

    protected boolean b(String str) {
        return n.a(str, (Map<String, String>) null);
    }

    public void w(String str) {
        if (v(str)) {
            x(str);
        }
    }

    public void a(ArrayList<String> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                x(it.next());
            }
        }
    }

    public void x(String str) {
        String D2 = D(str);
        if (!TextUtils.isEmpty(D2) && !this.au.contains(D2)) {
            if (!this.ax.contains(D2)) {
                Logger.d(a, "add dsp domain url - adding the following url: ", D2);
                synchronized (this.N) {
                    this.N.add(D2);
                }
                return;
            }
            Logger.d(a, "add dsp domain url: avoid adding a recommendation resource", D2);
            this.ay = true;
        }
    }

    public void y(String str) {
        String D2 = D(str);
        if (!TextUtils.isEmpty(D2)) {
            if (this.af != null) {
                synchronized (this.P) {
                    if (!this.af.contains(D2)) {
                        this.P.add(D2);
                    }
                }
                return;
            }
            Logger.d(a, "add prefetch Url: Url is in the WebView urls exclusion list , will not be added : ", D2);
        }
    }

    public void b(ArrayList<String> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                y(it.next());
            }
        }
    }

    public void z(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (this.af != null) {
                synchronized (this.P) {
                    if (!this.af.contains(str)) {
                        Logger.d(a, "adding prefetch text: ", str.trim());
                        this.P.add("text:" + str.trim());
                    }
                }
                return;
            }
            Logger.d(a, "add prefetch text: already in the list, will not be added: ", str);
        }
    }

    public void A(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (this.af != null) {
                synchronized (this.P) {
                    if (!this.af.contains(str)) {
                        this.P.add(aR + str);
                    }
                }
                return;
            }
            Logger.d(a, "add prefetch element: already in the list, will not be added: ", str);
        }
    }

    public void B(String str) {
        if (str != null && !str.isEmpty()) {
            synchronized (this.aY) {
                this.aY.add(str);
            }
        }
    }

    public void C(String str) {
        String D2 = D(str);
        if (!TextUtils.isEmpty(D2)) {
            synchronized (this.au) {
                this.au.add(D2);
            }
        }
        synchronized (this.N) {
            this.N.remove(D2);
        }
    }

    public String toString() {
        Bundle b2 = b();
        b2.putBoolean(C, this.W);
        return "ci hash=" + hashCode() + ", matchingObjectAddress=" + this.aV + ", event id=" + this.aD + ", id=" + this.Y + ", stopCollectingResources=" + this.aC + ", " + b2;
    }

    public String aa() {
        Bundle bundle = new Bundle();
        bundle.putString(c, this.Y);
        String str = this.aV;
        if (str != null) {
            bundle.putString(aJ, str);
        }
        String str2 = this.aD;
        if (str2 != null) {
            bundle.putString("event_id", str2);
        }
        return "ci hash=" + hashCode() + ", " + bundle;
    }

    public Timestamp ab() {
        return this.R;
    }

    public long ac() {
        return this.aZ;
    }

    public void ad() {
        this.aZ = SystemClock.elapsedRealtime();
    }

    public static String D(String str) {
        return TextUtils.isEmpty(str) ? str : k.g(n.z(str));
    }

    protected String E(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Throwable th) {
            Logger.d(a, "Failure in encode url. This url will be sent as is in the next event. ", th.getMessage(), ". Url=", str);
            return str;
        }
    }

    public void ae() {
        this.Z = true;
    }

    public void F(String str) {
        this.X = str;
    }

    public String af() {
        return this.ac;
    }

    public long ag() {
        return this.ab;
    }

    public void ah() {
        b k2 = CreativeInfoManager.k(this.aa);
        if (k2 != null) {
            this.R = new Timestamp(System.currentTimeMillis() + k2.e(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE));
        } else {
            this.R = new Timestamp(System.currentTimeMillis() + new d().T());
        }
        Logger.d(a, "set expiration time - sdk: ", this.aa, ", max age: ", this.R);
    }

    public boolean ai() {
        return this.bh;
    }

    public void h(boolean z2) {
        this.bh = z2;
    }

    public String aj() {
        return this.aW;
    }

    public String ak() {
        return this.aV;
    }

    public void a(Object obj) {
        if (obj != null) {
            this.aW = obj.getClass().getCanonicalName();
            this.aV = BrandSafetyUtils.a(obj);
        } else {
            this.aW = null;
            this.aV = null;
        }
        Logger.d(a, "set matching object - type: ", this.aW, ", address: ", this.aV, ", ad id: ", this.Y);
    }

    public void b(String str, String str2) {
        this.aV = str;
        this.aW = str2;
    }

    public void al() {
        long j2 = this.ab;
        this.ab = n.b(SystemClock.elapsedRealtime());
        Logger.d(a, "prefetch timestamp reset. old value = ", Long.valueOf(j2), ", new value = ", Long.valueOf(this.ab));
    }

    public void G(String str) {
        String D2 = D(str);
        synchronized (this.af) {
            this.af.add(D2);
        }
    }

    public List<String> am() {
        return this.af;
    }

    public boolean an() {
        return this.bd;
    }

    public void ao() {
        this.bd = true;
    }

    public void a(CreativeInfo creativeInfo) {
    }

    public void a(String str, m.a... aVarArr) {
        try {
            this.bf.a(str, aVarArr);
        } catch (NullPointerException e2) {
            Logger.d(a, "add impression log event failed: type=", str, ", impressionLog=", this.bf);
        }
    }

    public void a(Long l2, Long l3, String str, m.a... aVarArr) {
        try {
            this.bf.a(l2, l3, str, aVarArr);
        } catch (NullPointerException e2) {
            Logger.d(a, "add impression log event failed: type=", str, ", impressionLog=", this.bf);
        }
    }

    public boolean ap() {
        return this.bk;
    }

    public void H(String str) {
        this.at = str;
    }

    public boolean aq() {
        return this.ba;
    }

    public void a(Boolean bool) {
        this.ba = bool.booleanValue();
    }

    public void I(String str) {
        if (str != null) {
            this.bl.add(str);
        }
    }

    public List<String> ar() {
        return this.bl;
    }

    @Override // com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        BrandSafetyUtils.AdType adType = this.E;
        if (adType != null) {
            jSONObject.put("adType", adType.name());
        }
        if (!TextUtils.isEmpty(this.Y)) {
            jSONObject.put("id", this.Y);
        }
        if (!this.af.isEmpty()) {
            synchronized (this.af) {
                jSONObject.put("excludedWebViewResourceUrlsList", com.safedk.android.utils.d.a(this.af));
            }
        }
        jSONObject.put("mediaFileWithJsAppAttributeExists", this.Z);
        if (!TextUtils.isEmpty(this.F)) {
            jSONObject.put("downstreamStruct", this.F);
        }
        if (!TextUtils.isEmpty(this.aU)) {
            jSONObject.put("adUnitId", this.aU);
        }
        jSONObject.put("shouldReportId", this.G);
        jSONObject.put("shouldReportPrefetchTimestamp", this.H);
        jSONObject.put("isPortraitOrientation", this.I);
        if (!TextUtils.isEmpty(this.aa)) {
            jSONObject.put("sdk", this.aa);
        }
        if (!TextUtils.isEmpty(this.aA)) {
            jSONObject.put("actualSdk", this.aA);
        }
        jSONObject.put(b, this.ab);
        if (!TextUtils.isEmpty(this.ac)) {
            jSONObject.put("creativeId", this.ac);
        }
        if (!TextUtils.isEmpty(this.aB)) {
            jSONObject.put("dspCreativeId", this.aB);
        }
        if (!TextUtils.isEmpty(this.ar)) {
            jSONObject.put("buyerId", this.ar);
        }
        if (!TextUtils.isEmpty(this.as)) {
            jSONObject.put("adSystem", this.as);
        }
        if (!TextUtils.isEmpty(this.ad)) {
            jSONObject.put(UnifiedMediationParams.KEY_CLICK_URL, this.ad);
        }
        if (!TextUtils.isEmpty(this.J)) {
            jSONObject.put(UnifiedMediationParams.KEY_VIDEO_URL, this.J);
        }
        if (!TextUtils.isEmpty(this.at)) {
            jSONObject.put("endCardUrl", this.at);
        }
        jSONObject.put("stopCollectingResources", this.aC);
        jSONObject.put("contentHashCode", this.ae);
        if (!TextUtils.isEmpty(this.aD)) {
            jSONObject.put("eventId", this.aD);
        }
        jSONObject.put("fill", this.ag);
        jSONObject.put("fresh", this.bh);
        if (!TextUtils.isEmpty(this.ah)) {
            jSONObject.put("matchingMethod", this.ah);
        }
        if (!TextUtils.isEmpty(this.bi)) {
            jSONObject.put("matchingMethodDetails", this.bi);
        }
        if (!TextUtils.isEmpty(this.aV)) {
            jSONObject.put("matchingObjectAddress", this.aV);
        }
        if (!TextUtils.isEmpty(this.aW)) {
            jSONObject.put("matchingObjectType", this.aW);
        }
        if (!TextUtils.isEmpty(this.ai)) {
            jSONObject.put("ciDebugInfo", this.ai);
        }
        if (!TextUtils.isEmpty(this.aE)) {
            jSONObject.put("adFormat", this.aE);
        }
        if (!TextUtils.isEmpty(this.K)) {
            jSONObject.put("placementId", this.K);
        }
        if (!TextUtils.isEmpty(this.M)) {
            jSONObject.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, this.M);
        }
        if (!TextUtils.isEmpty(this.aX)) {
            jSONObject.put("adDomain", this.aX);
        }
        List<String> list = this.aj;
        if (list != null) {
            jSONObject.put("adText", com.safedk.android.utils.d.a(list));
        }
        jSONObject.put("dspUrlList", com.safedk.android.utils.d.a(this.N));
        jSONObject.put("prefetchUrlList", com.safedk.android.utils.d.a(this.P));
        if (!TextUtils.isEmpty(this.Q)) {
            jSONObject.put("sdkVersion", this.Q);
        }
        if (!this.au.isEmpty()) {
            jSONObject.put("vastAdTagUriList", com.safedk.android.utils.d.a(this.au));
        }
        Timestamp timestamp = this.R;
        jSONObject.put("expirationTimestamp", timestamp != null ? Long.valueOf(timestamp.getTime()) : null);
        jSONObject.put("lastAccessTimeMillis", this.aZ);
        jSONObject.put("isVideoEndCard", this.U);
        jSONObject.put("isWebsiteEndCard", this.ba);
        jSONObject.put("isEcommerceCollageAd", this.bb);
        jSONObject.put("adHasVideoLoadingScreen", this.bc);
        jSONObject.put("isVastAd", this.av);
        jSONObject.put(C, this.W);
        jSONObject.put("isMultipleAds", this.bd);
        if (!TextUtils.isEmpty(this.X)) {
            jSONObject.put("vastAdParameters", this.X);
        }
        jSONObject.put("isEventIDUpdated", this.be);
        jSONObject.put("isShoppingCollageCreative", this.bj);
        jSONObject.put("impressionLog", this.bf.i());
        if (!this.bg.isEmpty()) {
            jSONObject.put("recommendations", com.safedk.android.utils.d.a(this.bg));
        }
        if (!this.ax.isEmpty()) {
            jSONObject.put("recommendationsResources", com.safedk.android.utils.d.a(this.ax));
        }
        jSONObject.put("recommendationDisplayed", this.ay);
        jSONObject.put("isClickUrlFromPrefetch", this.bk);
        HashSet<String> hashSet = this.aY;
        if (hashSet != null && !hashSet.isEmpty()) {
            jSONObject.put("prefetchUrlSha256List", com.safedk.android.utils.d.a(this.aY));
        }
        jSONObject.put("vastDocVersionList", com.safedk.android.utils.d.a(this.bl));
        return jSONObject;
    }

    @Override // com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            long currentTimeMillis = System.currentTimeMillis();
            long a2 = CreativeInfoManager.a(this.aa, AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE, 1200000L) + currentTimeMillis;
            String optString = jSONObject.optString("adType", "");
            this.E = optString.isEmpty() ? null : BrandSafetyUtils.AdType.valueOf(optString);
            this.Y = jSONObject.optString("id", "");
            this.af.addAll(com.safedk.android.utils.d.b(jSONObject.optJSONArray("excludedWebViewResourceUrlsList")));
            this.Z = jSONObject.optBoolean("mediaFileWithJsAppAttributeExists", false);
            this.F = jSONObject.optString("downstreamStruct", "");
            this.aU = jSONObject.optString("adUnitId", "");
            this.G = jSONObject.optBoolean("shouldReportId", false);
            this.H = jSONObject.optBoolean("shouldReportPrefetchTimestamp", false);
            this.I = jSONObject.optBoolean("isPortraitOrientation", false);
            this.aa = jSONObject.optString("sdk", "");
            this.aA = jSONObject.optString("actualSdk", "");
            this.ab = jSONObject.optLong(b, currentTimeMillis);
            this.ac = jSONObject.optString("creativeId", "");
            this.aB = jSONObject.optString("dspCreativeId", "");
            this.ar = jSONObject.optString("buyerId", "");
            this.as = jSONObject.optString("adSystem", "");
            this.ad = jSONObject.optString(UnifiedMediationParams.KEY_CLICK_URL, "");
            this.J = jSONObject.optString(UnifiedMediationParams.KEY_VIDEO_URL, "");
            this.at = jSONObject.optString("endCardUrl", "");
            this.aC = jSONObject.optBoolean("stopCollectingResources", false);
            this.ae = jSONObject.optInt("contentHashCode", 0);
            this.aD = jSONObject.optString("eventId", "");
            this.ag = jSONObject.optBoolean("fill", false);
            this.bh = jSONObject.optBoolean("fresh", true);
            this.ah = jSONObject.optString("matchingMethod", "");
            this.bi = jSONObject.optString("matchingMethodDetails", "");
            this.aV = jSONObject.optString("matchingObjectAddress", "");
            this.aW = jSONObject.optString("matchingObjectType", "");
            this.ai = jSONObject.optString("ciDebugInfo", "");
            this.aE = jSONObject.optString("adFormat", "");
            this.K = jSONObject.optString("placementId", "");
            this.M = jSONObject.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "");
            this.aX = jSONObject.optString("adDomain", "");
            this.aj = com.safedk.android.utils.d.b(jSONObject.optJSONArray("adText"));
            this.N.addAll(com.safedk.android.utils.d.b(jSONObject.optJSONArray("dspUrlList")));
            this.P.addAll(com.safedk.android.utils.d.b(jSONObject.optJSONArray("prefetchUrlList")));
            this.Q = jSONObject.optString("sdkVersion", "");
            this.au.addAll(com.safedk.android.utils.d.b(jSONObject.optJSONArray("vastAdTagUriList")));
            this.R = new Timestamp(jSONObject.optLong("expirationTimestamp", a2));
            this.aZ = jSONObject.optLong("lastAccessTimeMillis", currentTimeMillis);
            this.U = jSONObject.optBoolean("isVideoEndCard", false);
            this.ba = jSONObject.optBoolean("isWebsiteEndCard", false);
            this.bb = jSONObject.optBoolean("isEcommerceCollageAd", false);
            this.bc = jSONObject.optBoolean("adHasVideoLoadingScreen", false);
            this.av = jSONObject.optBoolean("isVastAd", false);
            this.W = jSONObject.optBoolean(C, false);
            this.bd = jSONObject.optBoolean("isMultipleAds", false);
            this.X = jSONObject.optString("vastAdParameters", "");
            this.be = jSONObject.optBoolean("isEventIDUpdated", false);
            this.bj = jSONObject.optBoolean("isShoppingCollageCreative", false);
            this.bf.a(jSONObject.optJSONObject("impressionLog"));
            this.bg.addAll(com.safedk.android.utils.d.b(jSONObject.optJSONArray("recommendations")));
            this.ax.addAll(com.safedk.android.utils.d.b(jSONObject.optJSONArray("recommendationsResources")));
            this.ay = jSONObject.optBoolean("recommendationDisplayed", false);
            this.bk = jSONObject.optBoolean("isClickUrlFromPrefetch", false);
            this.aY.addAll(com.safedk.android.utils.d.b(jSONObject.optJSONArray("prefetchUrlSha256List")));
            this.bl.addAll(com.safedk.android.utils.d.b(jSONObject.optJSONArray("vastDocVersionList")));
        }
    }
}

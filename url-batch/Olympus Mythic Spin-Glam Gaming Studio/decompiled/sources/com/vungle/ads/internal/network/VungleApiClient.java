package com.vungle.ads.internal.network;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.URLUtil;
import androidx.annotation.Keep;
import androidx.core.content.ContextCompat;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.ironsource.B5;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleCSBData;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.a3;
import com.vungle.ads.internal.model.b3;
import com.vungle.ads.internal.model.c1;
import com.vungle.ads.internal.model.c3;
import com.vungle.ads.internal.model.g1;
import com.vungle.ads.internal.model.i0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.model.j1;
import com.vungle.ads.internal.model.l0;
import com.vungle.ads.internal.model.m1;
import com.vungle.ads.internal.model.p1;
import com.vungle.ads.internal.model.s1;
import com.vungle.ads.internal.model.t0;
import com.vungle.ads.internal.model.t1;
import com.vungle.ads.internal.model.w0;
import com.vungle.ads.internal.model.z0;
import com.vungle.ads.internal.n2;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.privacy.COPPA;
import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.ads.networks.nast.NastAdapter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiClient;", "", "com/vungle/ads/internal/network/u", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes12.dex */
public final class VungleApiClient {

    @Keep
    @NotNull
    private static final String BASE_URL = "https://config.ads.vungle.com/";

    @Keep
    private static final boolean interceptorEnabled = false;
    public final Context a;
    public final com.vungle.ads.internal.platform.f b;
    public final FilePreferences c;
    public c0 d;
    public c0 e;
    public b3 f;
    public i0 g;
    public l0 h;
    public String i;
    public Boolean j;
    public final Lazy k;
    public ConcurrentHashMap l;
    public Interceptor m;

    @Keep
    @NotNull
    private static final Set<Interceptor> networkInterceptors = new HashSet();

    @Keep
    @NotNull
    private static final Set<Interceptor> logInterceptors = new HashSet();
    public static final Json n = JsonKt.Json$default(null, s.a, 1, null);

    public VungleApiClient(Context applicationContext, com.vungle.ads.internal.platform.f platform, FilePreferences filePreferences) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(filePreferences, "filePreferences");
        this.a = applicationContext;
        this.b = platform;
        this.c = filePreferences;
        this.i = System.getProperty("http.agent");
        this.k = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new a0(applicationContext));
        this.l = new ConcurrentHashMap();
        this.m = new Interceptor() { // from class: com.vungle.ads.internal.network.VungleApiClient$$ExternalSyntheticLambda0
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                return VungleApiClient.a(VungleApiClient.this, chain);
            }
        };
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder proxySelector = builder.readTimeout(60L, timeUnit).connectTimeout(60L, timeUnit).addInterceptor(this.m).proxySelector(new v());
        if (interceptorEnabled) {
            Iterator<Interceptor> it = logInterceptors.iterator();
            while (it.hasNext()) {
                proxySelector.addInterceptor(it.next());
            }
            Iterator<Interceptor> it2 = networkInterceptors.iterator();
            while (it2.hasNext()) {
                proxySelector.addNetworkInterceptor(it2.next());
            }
        }
        OkHttpClient build = proxySelector.build();
        OkHttpClient build2 = proxySelector.addInterceptor(new u()).build();
        this.e = new c0(build);
        this.d = new c0(build2);
    }

    public static final Response a(VungleApiClient this$0, Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        try {
            try {
                Response proceed = chain.proceed(request);
                String str = proceed.headers().get(CommonGatewayClient.HEADER_RETRY_AFTER);
                if (str == null || str.length() == 0) {
                    return proceed;
                }
                try {
                    long parseLong = Long.parseLong(str);
                    if (parseLong <= 0) {
                        return proceed;
                    }
                    String encodedPath = request.url().encodedPath();
                    long currentTimeMillis = (parseLong * 1000) + System.currentTimeMillis();
                    if (!StringsKt.endsWith$default(encodedPath, "ads", false, 2, (Object) null)) {
                        return proceed;
                    }
                    RequestBody body = request.body();
                    this$0.getClass();
                    String a = a(body);
                    if (a.length() <= 0) {
                        return proceed;
                    }
                    this$0.l.put(a, Long.valueOf(currentTimeMillis));
                    return proceed;
                } catch (Exception unused) {
                    boolean z = com.vungle.ads.internal.util.u.a;
                    com.vungle.ads.internal.util.t.a("VungleApiClient", "Retry-After value is not an valid value");
                    return proceed;
                }
            } catch (OutOfMemoryError unused2) {
                boolean z2 = com.vungle.ads.internal.util.u.a;
                StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("OOM for ");
                a2.append(request.url());
                com.vungle.ads.internal.util.t.b("VungleApiClient", a2.toString());
                this$0.getClass();
                return new Response.Builder().request(request).code(500).protocol(Protocol.HTTP_1_1).message("OOM").body(ResponseBody.INSTANCE.create(new byte[0], (MediaType) null)).build();
            }
        } catch (Exception e) {
            boolean z3 = com.vungle.ads.internal.util.u.a;
            StringBuilder a3 = com.iab.omid.library.vungle.internal.l.a("Exception: ");
            a3.append(e.getMessage());
            a3.append(" for ");
            a3.append(request.url());
            com.vungle.ads.internal.util.t.b("VungleApiClient", a3.toString());
            this$0.getClass();
            return new Response.Builder().request(request).code(500).protocol(Protocol.HTTP_1_1).message("Server is busy").body(ResponseBody.INSTANCE.create("{\"Error\":\"Server is busy\"}", MediaType.INSTANCE.parse("application/json"))).build();
        }
    }

    public final long b(String placementID) {
        Intrinsics.checkNotNullParameter(placementID, "placementID");
        Long l = (Long) this.l.get(placementID);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final synchronized void c(String appId) {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        try {
            Intrinsics.checkNotNullParameter(appId, "appId");
            d0.a(appId);
            String str = NastAdapter.ADAPTER_SDK_VERSION_NAME;
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    PackageManager packageManager = this.a.getPackageManager();
                    String packageName = this.a.getPackageName();
                    of = PackageManager.PackageInfoFlags.of(0L);
                    packageInfo = packageManager.getPackageInfo(packageName, of);
                    Intrinsics.checkNotNullExpressionValue(packageInfo, "{\n                    ap…      )\n                }");
                } else {
                    packageInfo = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0);
                    Intrinsics.checkNotNullExpressionValue(packageInfo, "{\n                    ap…      )\n                }");
                }
                String str2 = packageInfo.versionName;
                Intrinsics.checkNotNullExpressionValue(str2, "packageInfo.versionName");
                str = str2;
            } catch (Exception unused) {
            }
            d0.b(str);
            this.f = a(this.a);
            String packageName2 = this.a.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName2, "applicationContext.packageName");
            this.h = new l0(packageName2, str, appId);
            this.j = d();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d(String adMarkup) {
        Intrinsics.checkNotNullParameter(adMarkup, "adMarkup");
        Intrinsics.checkNotNullParameter("https://events.ads.vungle.com/rtadebugging", B5.r);
        this.e.a(RequestBody.INSTANCE.create(adMarkup, MediaType.INSTANCE.parse("application/json"))).a(new z());
    }

    public final m1 b(boolean z) {
        String a;
        String configExtension = ConfigManager.INSTANCE.getConfigExtension();
        if (configExtension != null && configExtension.length() == 0) {
            configExtension = this.c.getString("config_extension");
        }
        if (z) {
            try {
                a = ((com.vungle.ads.internal.signals.j) this.k.getValue()).a();
            } catch (Exception e) {
                boolean z2 = com.vungle.ads.internal.util.u.a;
                StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Couldn't convert signals for sending. Error: ");
                a2.append(e.getMessage());
                com.vungle.ads.internal.util.t.b("VungleApiClient", a2.toString());
            }
            if ((configExtension != null || configExtension.length() == 0) && (a == null || a.length() == 0)) {
                return null;
            }
            ConfigManager.INSTANCE.getClass();
            return new m1(configExtension, a, Long.valueOf(ConfigManager.a()));
        }
        a = null;
        if (configExtension != null) {
        }
        return null;
    }

    public final Boolean d() {
        Boolean bool;
        boolean z;
        try {
            try {
                GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
                Intrinsics.checkNotNullExpressionValue(googleApiAvailabilityLight, "getInstance()");
                z = googleApiAvailabilityLight.isGooglePlayServicesAvailable(this.a) == 0;
                bool = Boolean.valueOf(z);
            } catch (NoClassDefFoundError unused) {
                boolean z2 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("VungleApiClient", "Play services Not available");
                bool = Boolean.FALSE;
                try {
                    this.c.a(false, "isPlaySvcAvailable").b();
                } catch (Exception unused2) {
                    boolean z3 = com.vungle.ads.internal.util.u.a;
                    com.vungle.ads.internal.util.t.c("VungleApiClient", "Failure to write GPS availability to DB");
                }
            }
            try {
                this.c.a(z, "isPlaySvcAvailable").b();
            } catch (Exception unused3) {
                boolean z4 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("VungleApiClient", "Unexpected exception from Play services lib.");
                return bool;
            }
        } catch (Exception unused4) {
            bool = null;
        }
        return bool;
    }

    public static s1 c(boolean z) {
        String value;
        s1 s1Var = new s1(null, null, null, null, null);
        PrivacyManager.INSTANCE.getClass();
        String b = PrivacyManager.b();
        String str = PrivacyManager.e;
        if (str == null) {
            str = "no_interaction";
        }
        String str2 = str;
        String str3 = PrivacyManager.f;
        String str4 = str3 == null ? "" : str3;
        Long l = PrivacyManager.g;
        s1Var.a = new g1(l != null ? l.longValue() : 0L, b, str2, str4);
        PrivacyConsent privacyConsent = PrivacyManager.h;
        if (privacyConsent == null || (value = privacyConsent.getValue()) == null) {
            value = PrivacyConsent.UNKNOWN.getValue();
        }
        s1Var.b = new w0(value);
        if (PrivacyManager.c() != COPPA.COPPA_NOTSET) {
            s1Var.c = new z0(PrivacyManager.c().getValue());
        }
        if (PrivacyManager.f()) {
            SharedPreferences sharedPreferences = PrivacyManager.j;
            String string = sharedPreferences != null ? sharedPreferences.getString("IABTCF_TCString", "") : null;
            s1Var.e = new j1(string != null ? string : "");
        }
        if (z) {
            s1Var.d = VungleAds.firstPartyData;
        }
        return s1Var;
    }

    public final String c() {
        if (ContextCompat.checkSelfPermission(this.a, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        Object systemService = this.a.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "unknown";
        }
        int subtype = activeNetworkInfo.getSubtype();
        if (subtype == 1) {
            return "gprs";
        }
        if (subtype == 2) {
            return "edge";
        }
        if (subtype == 20) {
            return "5g";
        }
        switch (subtype) {
            case 4:
                return "wcdma";
            case 5:
                return "cdma_evdo_0";
            case 6:
                return "cdma_evdo_a";
            case 7:
                return "cdma_1xrtt";
            case 8:
                return "hsdpa";
            case 9:
                return "hsupa";
            default:
                switch (subtype) {
                    case 12:
                        return "cdma_evdo_b";
                    case 13:
                        return "lte";
                    case 14:
                        return "hrpd";
                    default:
                        return "unknown";
                }
        }
    }

    public static String a(RequestBody requestBody) {
        String str;
        p1 c;
        List a;
        Buffer buffer;
        try {
            Json json = n;
            try {
                buffer = new Buffer();
            } catch (Exception unused) {
            }
            if (requestBody != null) {
                requestBody.writeTo(buffer);
                str = buffer.readUtf8();
                KSerializer serializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(t1.class));
                Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                c = ((t1) json.decodeFromString(serializer, str)).c();
                if (c == null && (a = c.a()) != null) {
                    String str2 = (String) a.get(0);
                    return str2 == null ? "" : str2;
                }
            }
            str = "";
            KSerializer serializer2 = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(t1.class));
            Intrinsics.checkNotNull(serializer2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            c = ((t1) json.decodeFromString(serializer2, str)).c();
            return c == null ? "" : "";
        } catch (Exception unused2) {
            return "";
        }
    }

    public final boolean a(String placementID) {
        Intrinsics.checkNotNullParameter(placementID, "placementID");
        Long l = (Long) this.l.get(placementID);
        if ((l != null ? l.longValue() : 0L) > System.currentTimeMillis()) {
            return true;
        }
        this.l.remove(placementID);
        return false;
    }

    public final m a() {
        l0 l0Var = this.h;
        if (l0Var == null) {
            return null;
        }
        t1 t1Var = new t1(a(true), l0Var, c(false));
        m1 b = b(false);
        if (b != null) {
            t1Var.a(b);
        }
        com.vungle.ads.internal.util.m mVar = com.vungle.ads.internal.util.n.a;
        String str = BASE_URL;
        if (!com.vungle.ads.internal.util.n.a(str)) {
            str = BASE_URL;
        }
        if (!StringsKt.endsWith$default(str, "/", false, 2, (Object) null)) {
            str = str + '/';
        }
        return this.e.b(d0.d(), str + "config", t1Var);
    }

    public final m a(String placement, VungleAdSize vungleAdSize) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        String adsEndpoint = ConfigManager.INSTANCE.getAdsEndpoint();
        t1 a = a(!ConfigManager.r(), ConfigManager.b());
        p1 p1Var = new p1(CollectionsKt.listOf(placement), (Long) null, (String) null, (String) null, (String) null, (c1) null, 126);
        if (vungleAdSize != null) {
            p1Var.a(new t0(vungleAdSize.getWidth(), vungleAdSize.getHeight()));
        }
        a.a(p1Var);
        return this.d.a(d0.d(), adsEndpoint, a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m a(String placement, VungleAdSize vungleAdSize, VungleCSBData vungleCSBData) {
        c1 c1Var;
        JsonObject jsonObject;
        Intrinsics.checkNotNullParameter(placement, "placement");
        ConfigManager.INSTANCE.getClass();
        String c = ConfigManager.c();
        t1 a = a(!ConfigManager.r(), ConfigManager.b());
        if (vungleCSBData != null) {
            Map<String, String> extras = vungleCSBData.getExtras();
            if (extras != null) {
                if (extras.isEmpty()) {
                    extras = null;
                }
                if (extras != null) {
                    JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
                    for (Map.Entry<String, String> entry : extras.entrySet()) {
                        jsonObjectBuilder.put(entry.getKey(), JsonElementKt.JsonPrimitive(entry.getValue()));
                    }
                    jsonObject = jsonObjectBuilder.build();
                    c1Var = new c1(vungleCSBData.getBidFloor(), vungleCSBData.getPhase(), vungleCSBData.getIsVXWinner(), vungleCSBData.getAuctionId(), vungleCSBData.getCreativeId(), vungleCSBData.getAdUnitId(), jsonObject != null ? jsonObject.toString() : null);
                }
            }
            jsonObject = null;
            c1Var = new c1(vungleCSBData.getBidFloor(), vungleCSBData.getPhase(), vungleCSBData.getIsVXWinner(), vungleCSBData.getAuctionId(), vungleCSBData.getCreativeId(), vungleCSBData.getAdUnitId(), jsonObject != null ? jsonObject.toString() : null);
        } else {
            c1Var = null;
        }
        p1 p1Var = new p1(CollectionsKt.listOf(placement), (Long) null, (String) null, (String) null, (String) null, c1Var, 62);
        if (vungleAdSize != null) {
            p1Var.a(new t0(vungleAdSize.getWidth(), vungleAdSize.getHeight()));
        }
        a.a(p1Var);
        return this.d.a(d0.d(), c, a);
    }

    public final String b() {
        if (ContextCompat.checkSelfPermission(this.a, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        Object systemService = this.a.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                return "MOBILE";
            }
            if (type == 1 || type == 6) {
                return "WIFI";
            }
            if (type == 7) {
                return "BLUETOOTH";
            }
            if (type != 9) {
                return "UNKNOWN";
            }
            return "ETHERNET";
        }
        return "NONE";
    }

    public final m a(p1 request) {
        l0 l0Var;
        Intrinsics.checkNotNullParameter(request, "request");
        ConfigManager.INSTANCE.getClass();
        String m = ConfigManager.m();
        if (m == null || m.length() == 0 || (l0Var = this.h) == null) {
            return null;
        }
        t1 t1Var = new t1(a(false), l0Var, c(false));
        t1Var.a(request);
        m1 b = b(false);
        if (b != null) {
            t1Var.a(b);
        }
        return this.e.c(d0.d(), m, t1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        r3 = r2.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (r3 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        r3 = java.lang.Integer.valueOf(r3.code());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c3 a(String url, Map map, String str, g requestType, com.vungle.ads.internal.util.s sVar) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        if (!com.vungle.ads.internal.util.n.a(url)) {
            return new c3("Invalid URL", true, false, 4);
        }
        try {
            if (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(new URL(url).getHost()) && URLUtil.isHttpUrl(url)) {
                return new c3("Clear Text Traffic is blocked", false, false, 6);
            }
            try {
                String str2 = this.i;
                if (str2 == null) {
                    str2 = "";
                }
                o a = this.e.a(str2, url, requestType, map, str != null ? RequestBody.INSTANCE.create(str, MediaType.INSTANCE.parse("application/json")) : null).a();
                if (a != null && a.c()) {
                    return null;
                }
                Integer num = null;
                if (CollectionsKt.contains(CollectionsKt.listOf((Object[]) new Integer[]{301, 302, 307, 308}), num)) {
                    AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.NOTIFICATION_REDIRECT, 0L, sVar, url, 2);
                    return null;
                }
                boolean z = num != null && new IntRange(500, CommonGatewayClient.CODE_599).contains(num.intValue());
                StringBuilder sb = new StringBuilder();
                sb.append("unsuccessful response, error code: ");
                sb.append(num);
                sb.append(", message: ");
                sb.append(a != null ? a.d() : null);
                return new c3(sb.toString(), false, z, 2);
            } catch (Throwable th) {
                String localizedMessage = th.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "IOException";
                }
                return new c3(localizedMessage, false, true, 2);
            }
        } catch (MalformedURLException e) {
            String localizedMessage2 = e.getLocalizedMessage();
            if (localizedMessage2 == null) {
                localizedMessage2 = "MalformedURLException";
            }
            return new c3(localizedMessage2, true, false, 4);
        }
    }

    public final void a(LinkedBlockingQueue metrics, com.vungle.ads.internal.y requestListener) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        ConfigManager.INSTANCE.getClass();
        String l = ConfigManager.l();
        if (l.length() == 0) {
            requestListener.a();
            return;
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        Iterator it = metrics.iterator();
        while (it.hasNext()) {
            Sdk.SDKMetric.Builder builder = (Sdk.SDKMetric.Builder) it.next();
            builder.setSessionId(((com.vungle.ads.internal.signals.j) this.k.getValue()).d());
            ConfigManager configManager = ConfigManager.INSTANCE;
            String placementReferenceId = builder.getPlacementReferenceId();
            configManager.getClass();
            i3 a = ConfigManager.a(placementReferenceId);
            if (a != null) {
                String c = a.c();
                if (c == null) {
                    c = "";
                }
                builder.setPlacementType(c);
            }
            String b = b();
            if (b != null) {
                builder.setConnectionType(b);
            }
            String c2 = c();
            if (c2 != null) {
                builder.setConnectionTypeDetail(c2);
            }
            Sdk.SDKMetric build = builder.build();
            boolean z = com.vungle.ads.internal.util.u.a;
            StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Sending Metric: ");
            a2.append(build.getType());
            com.vungle.ads.internal.util.t.b("VungleApiClient", a2.toString());
            linkedBlockingQueue.add(build);
        }
        Sdk.MetricBatch build2 = Sdk.MetricBatch.newBuilder().addAllMetrics(linkedBlockingQueue).build();
        RequestBody.Companion companion = RequestBody.INSTANCE;
        MediaType parse = MediaType.INSTANCE.parse(CommonGatewayClient.HEADER_PROTOBUF);
        byte[] byteArray = build2.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "batch.toByteArray()");
        this.e.b(d0.d(), l, RequestBody.Companion.create$default(companion, parse, byteArray, 0, 0, 12, (Object) null)).a(new y(requestListener));
    }

    public final void a(LinkedBlockingQueue errors, com.vungle.ads.internal.x requestListener) {
        Intrinsics.checkNotNullParameter(errors, "errors");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        ConfigManager.INSTANCE.getClass();
        String f = ConfigManager.f();
        if (f.length() == 0) {
            requestListener.a();
            return;
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        Iterator it = errors.iterator();
        while (it.hasNext()) {
            Sdk.SDKError.Builder builder = (Sdk.SDKError.Builder) it.next();
            builder.setSessionId(((com.vungle.ads.internal.signals.j) this.k.getValue()).d());
            ConfigManager configManager = ConfigManager.INSTANCE;
            String placementReferenceId = builder.getPlacementReferenceId();
            configManager.getClass();
            i3 a = ConfigManager.a(placementReferenceId);
            if (a != null) {
                String c = a.c();
                if (c == null) {
                    c = "";
                }
                builder.setPlacementType(c);
            }
            String b = b();
            if (b != null) {
                builder.setConnectionType(b);
            }
            String c2 = c();
            if (c2 != null) {
                builder.setConnectionTypeDetail(c2);
            }
            Sdk.SDKError build = builder.build();
            boolean z = com.vungle.ads.internal.util.u.a;
            StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Sending Error: ");
            a2.append(build.getReason());
            com.vungle.ads.internal.util.t.b("VungleApiClient", a2.toString());
            linkedBlockingQueue.add(build);
        }
        Sdk.SDKErrorBatch build2 = Sdk.SDKErrorBatch.newBuilder().addAllErrors(linkedBlockingQueue).build();
        RequestBody.Companion companion = RequestBody.INSTANCE;
        byte[] byteArray = build2.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "batch.toByteArray()");
        this.e.a(d0.d(), f, companion.create(byteArray, MediaType.INSTANCE.parse(CommonGatewayClient.HEADER_PROTOBUF), 0, build2.toByteArray().length)).a(new x(requestListener));
    }

    public final b3 a(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        b3 b3Var = new b3(MANUFACTURER, MODEL, RELEASE, com.vungle.ads.internal.platform.a.a(context), Intrinsics.areEqual("Amazon", MANUFACTURER) ? "amazon" : "android", displayMetrics.widthPixels, displayMetrics.heightPixels, this.i);
        try {
            String j = ((com.vungle.ads.internal.platform.c) this.b).j();
            this.i = j;
            b3Var.b(j);
            n2 n2Var = new n2(Sdk.SDKMetric.SDKMetricType.USER_AGENT_LOAD_DURATION_MS);
            n2Var.e();
            ((com.vungle.ads.internal.platform.c) this.b).a(new w(this, n2Var));
            i0 i0Var = this.g;
            if (i0Var == null) {
                i0Var = ((com.vungle.ads.internal.platform.c) this.b).a();
            }
            this.g = i0Var;
        } catch (Exception e) {
            boolean z = com.vungle.ads.internal.util.u.a;
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Cannot Get UserAgent. Setting Default Device UserAgent.");
            a.append(e.getLocalizedMessage());
            com.vungle.ads.internal.util.t.b("VungleApiClient", a.toString());
        }
        return b3Var;
    }

    public final t1 a(boolean z, boolean z2) {
        t1 t1Var = new t1(a(false), this.h, c(z2), null, null);
        m1 b = b(z);
        if (b != null) {
            t1Var.d = b;
        }
        return t1Var;
    }

    public final synchronized b3 a(boolean z) {
        b3 a;
        String str;
        try {
            b3 b3Var = this.f;
            if (b3Var == null) {
                b3Var = a(this.a);
                this.f = b3Var;
            }
            a = b3.a(b3Var);
            a3 a3Var = new a3();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Object systemService = this.a.getSystemService("window");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            a.a(displayMetrics.heightPixels);
            a.b(displayMetrics.widthPixels);
            i0 i0Var = this.g;
            if (i0Var == null) {
                i0Var = ((com.vungle.ads.internal.platform.c) this.b).a();
            }
            this.g = i0Var;
            String a2 = i0Var.a();
            i0 i0Var2 = this.g;
            Boolean valueOf = i0Var2 != null ? Boolean.valueOf(i0Var2.b()) : null;
            PrivacyManager.INSTANCE.getClass();
            if (PrivacyManager.e()) {
                if (a2 != null) {
                    if (Intrinsics.areEqual("Amazon", Build.MANUFACTURER)) {
                        a3Var.a(a2);
                    } else {
                        a3Var.f(a2);
                    }
                    a.a(a2);
                } else {
                    a.a("");
                }
            }
            if (z || !PrivacyManager.e()) {
                a.a((String) null);
                a3Var.f(null);
                a3Var.a((String) null);
            }
            Boolean bool = Boolean.TRUE;
            boolean areEqual = Intrinsics.areEqual(valueOf, bool);
            boolean z2 = false;
            a.a(areEqual ? 1 : 0);
            if (this.j == null) {
                this.j = this.c.a("isPlaySvcAvailable");
            }
            if (this.j == null) {
                this.j = d();
            }
            a3Var.a(Intrinsics.areEqual(bool, this.j));
            if (PrivacyManager.a() != 2) {
                String b = ((com.vungle.ads.internal.platform.c) this.b).b();
                if (b != null) {
                    a3Var.b(b);
                }
                Integer c = ((com.vungle.ads.internal.platform.c) this.b).c();
                if (c != null) {
                    a3Var.a(Integer.valueOf(c.intValue()));
                }
            }
            Intent registerReceiver = this.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                int intExtra2 = registerReceiver.getIntExtra("scale", -1);
                if (intExtra > 0 && intExtra2 > 0) {
                    a3Var.a(intExtra / intExtra2);
                }
                int intExtra3 = registerReceiver.getIntExtra("status", -1);
                if (intExtra3 == -1) {
                    str = "UNKNOWN";
                } else if (intExtra3 != 2 && intExtra3 != 5) {
                    str = "NOT_CHARGING";
                } else {
                    int intExtra4 = registerReceiver.getIntExtra("plugged", -1);
                    if (intExtra4 == 1) {
                        str = "BATTERY_PLUGGED_AC";
                    } else if (intExtra4 == 2) {
                        str = "BATTERY_PLUGGED_USB";
                    } else if (intExtra4 != 4) {
                        str = "BATTERY_PLUGGED_OTHERS";
                    } else {
                        str = "BATTERY_PLUGGED_WIRELESS";
                    }
                }
            } else {
                str = "UNKNOWN";
            }
            a3Var.c(str);
            a3Var.a(((com.vungle.ads.internal.platform.c) this.b).l() ? 1 : 0);
            String b2 = b();
            if (b2 != null) {
                a3Var.d(b2);
            }
            String c2 = c();
            if (c2 != null) {
                a3Var.e(c2);
            }
            a3Var.i(Locale.getDefault().toString());
            a3Var.h(Locale.getDefault().getLanguage());
            a3Var.j(TimeZone.getDefault().getID());
            a3Var.b(((com.vungle.ads.internal.platform.c) this.b).k());
            a3Var.c(((com.vungle.ads.internal.platform.c) this.b).p() ? 1 : 0);
            if (Intrinsics.areEqual("Amazon", Build.MANUFACTURER)) {
                z2 = this.a.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
            } else {
                Object systemService2 = this.a.getSystemService("uimode");
                Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.app.UiModeManager");
                if (((UiModeManager) systemService2).getCurrentModeType() == 4) {
                    z2 = true;
                }
            }
            a3Var.b(z2);
            this.b.getClass();
            a3Var.a();
            a3Var.b(((com.vungle.ads.internal.platform.c) this.b).n() ? 1 : 0);
            ConfigManager.INSTANCE.getClass();
            if (ConfigManager.p()) {
                a3Var.d(Long.valueOf(((com.vungle.ads.internal.platform.c) this.b).i()));
                a3Var.b(Long.valueOf(((com.vungle.ads.internal.platform.c) this.b).h()));
                a3Var.c(Long.valueOf(((com.vungle.ads.internal.platform.c) this.b).g()));
                a3Var.a(Long.valueOf(((com.vungle.ads.internal.platform.c) this.b).d()));
            }
            a3Var.g(((com.vungle.ads.internal.platform.c) this.b).f());
            a.b(this.i);
            a.a(a3Var);
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }
}

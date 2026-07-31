package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.profile.UserProfile;
import io.appmetrica.analytics.profile.UserProfileUpdate;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public abstract class V2 implements InterfaceC5254cb {
    public static final HashSet n = new HashSet(Arrays.asList(1, 13));
    public static final T2 o = new T2();
    protected final Context a;
    protected final Sh b;

    @NonNull
    protected final PublicLogger c;

    @NonNull
    protected final C5447jo d;

    @NonNull
    protected final Ng e;

    @NonNull
    protected final N6 f;
    public final C5320f0 g;
    protected final Ji h;
    public Kb i;
    public final Xf j;
    public final C5382ha k;
    public final C5309ef l;
    public final C5758vn m;

    public V2(Context context, Ji ji, Sh sh, C5382ha c5382ha, J6 j6, C5447jo c5447jo, Ng ng, N6 n6, C5320f0 c5320f0, C5309ef c5309ef) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.h = ji;
        this.b = sh;
        this.k = c5382ha;
        this.d = c5447jo;
        this.e = ng;
        this.f = n6;
        this.g = c5320f0;
        this.l = c5309ef;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(sh.b().getApiKey());
        this.c = orCreatePublicLogger;
        if (AbstractC5478l3.a(sh.b().isLogEnabled())) {
            orCreatePublicLogger.setEnabled(true);
        }
        this.j = j6;
        this.m = new C5758vn(applicationContext);
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            this.c.warning("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.c.info("Put error environment pair <%s, %s>", str, str2);
        Sh sh = this.b;
        synchronized (sh) {
            W8 w8 = sh.c;
            w8.b.b(w8.a, str, str2);
        }
    }

    public final void b(Map<String, String> map) {
        if (Do.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    public final void c(String str) {
        if (this.b.f()) {
            return;
        }
        this.h.d.c();
        Kb kb = this.i;
        kb.a.removeCallbacks(kb.c, kb.b.b.b.getApiKey());
        this.b.e = true;
        Ji ji = this.h;
        PublicLogger publicLogger = this.c;
        Set set = Q9.a;
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        C5273d4 c5273d4 = new C5273d4("", str, 3, 0, publicLogger);
        Sh sh = this.b;
        ji.getClass();
        ji.a(Ji.a(c5273d4, sh), sh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        String str;
        this.c.info("Clear app environment", new Object[0]);
        Ji ji = this.h;
        Sh sh = this.b;
        ji.getClass();
        C5326f6 n2 = C5273d4.n();
        Wf wf = new Wf(sh.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(sh.b);
        W8 w8 = sh.c;
        synchronized (sh) {
            str = sh.f;
        }
        ji.a(new Ih(n2, false, 1, null, new Sh(wf, counterConfiguration, w8, str)));
    }

    public final void d(String str) {
        this.h.d.b();
        Kb kb = this.i;
        Kb.a(kb.a, kb.b, kb.c);
        Ji ji = this.h;
        PublicLogger publicLogger = this.c;
        Set set = Q9.a;
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        C5273d4 c5273d4 = new C5273d4("", str, 6400, 0, publicLogger);
        Sh sh = this.b;
        ji.getClass();
        ji.a(Ji.a(c5273d4, sh), sh, 1, (Map) null);
        this.b.e = false;
    }

    @Override // io.appmetrica.analytics.IReporter
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this;
    }

    public String j() {
        return "[BaseReporter]";
    }

    public void k() {
        String str;
        Kf kf;
        Ji ji = this.h;
        Sh sh = this.b;
        ji.getClass();
        Of of = sh.d;
        synchronized (sh) {
            str = sh.f;
        }
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(sh.b.getApiKey());
        Set set = Q9.a;
        JSONObject jSONObject = new JSONObject();
        if (of != null && (kf = of.a) != null) {
            try {
                jSONObject.put("preloadInfo", kf.c());
            } catch (Throwable unused) {
            }
        }
        String jSONObject2 = jSONObject.toString();
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        C5273d4 c5273d4 = new C5273d4(jSONObject2, "", 6144, 0, orCreatePublicLogger);
        c5273d4.c(str);
        ji.a(Ji.a(c5273d4, sh), sh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.c.info("Pause session", new Object[0]);
        c(null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            this.c.warning("Invalid App Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.c.info("Put app environment: <%s, %s>", str, str2);
        Ji ji = this.h;
        Sh sh = this.b;
        ji.getClass();
        C5326f6 b = C5273d4.b(str, str2);
        Wf wf = new Wf(sh.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(sh.b);
        W8 w8 = sh.c;
        synchronized (sh) {
            str3 = sh.f;
        }
        ji.a(new Ih(b, false, 1, null, new Sh(wf, counterConfiguration, w8, str3)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, false);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        StackTraceElement[] stackTraceElementArr;
        C5346g0 c5346g0 = new C5346g0(new C5372h0(this, map));
        Ia ia = new Ia();
        J6 j6 = C5661s4.l().a;
        Thread a = c5346g0.a();
        Map map2 = null;
        try {
            stackTraceElementArr = c5346g0.b();
            if (stackTraceElementArr == null) {
                try {
                    stackTraceElementArr = a.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArr = null;
        }
        On on = (On) ia.apply(a, stackTraceElementArr);
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new Tn());
        try {
            map2 = c5346g0.c();
        } catch (SecurityException unused3) {
        }
        if (map2 != null) {
            treeMap.putAll(map2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            if (thread != a && thread != null) {
                arrayList.add((On) ia.apply(thread, (StackTraceElement[]) entry.getValue()));
            }
        }
        a(new X(on, arrayList, j6.a()));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        String str;
        this.c.info("E-commerce event received: " + eCommerceEvent.getPublicDescription(), new Object[0]);
        Ji ji = this.h;
        Sh sh = this.b;
        ji.getClass();
        for (Qi qi : eCommerceEvent.toProto()) {
            C5273d4 c5273d4 = new C5273d4(LoggerStorage.getOrCreatePublicLogger(sh.b.getApiKey()));
            EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
            c5273d4.d = 41000;
            c5273d4.b = c5273d4.e(Base64Utils.compressBase64(MessageNano.toByteArray((MessageNano) qi.a)));
            c5273d4.g = qi.b.getBytesTruncated();
            Wf wf = new Wf(sh.a);
            CounterConfiguration counterConfiguration = new CounterConfiguration(sh.b);
            W8 w8 = sh.c;
            synchronized (sh) {
                str = sh.f;
            }
            ji.a(new Ih(c5273d4, false, 1, null, new Sh(wf, counterConfiguration, w8, str)));
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable Throwable th) {
        Mg mg = new Mg(str, a(th));
        Ji ji = this.h;
        byte[] byteArray = MessageNano.toByteArray(this.e.fromModel(mg));
        PublicLogger publicLogger = this.c;
        Set set = Q9.a;
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        C5273d4 c5273d4 = new C5273d4(byteArray, str, 5892, publicLogger);
        Sh sh = this.b;
        ji.getClass();
        ji.a(Ji.a(c5273d4, sh), sh, 1, (Map) null);
        this.c.info("Error received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str) {
        this.c.info("Event received: " + WrapUtils.wrapToTag(str), new Object[0]);
        Ji ji = this.h;
        PublicLogger publicLogger = this.c;
        Set set = Q9.a;
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        C5273d4 c5273d4 = new C5273d4("", str, 1, 0, publicLogger);
        Sh sh = this.b;
        ji.getClass();
        ji.a(Ji.a(c5273d4, sh), sh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(@NonNull Revenue revenue) {
        String str;
        C5236bj c5236bj = U2.a;
        c5236bj.getClass();
        Io a = c5236bj.a(revenue);
        if (!a.a) {
            this.c.warning("Passed revenue is not valid. Reason: " + a.b, new Object[0]);
            return;
        }
        Ji ji = this.h;
        C5262cj c5262cj = new C5262cj(revenue, this.c);
        Sh sh = this.b;
        ji.getClass();
        C5273d4 a2 = C5273d4.a(LoggerStorage.getOrCreatePublicLogger(sh.b.getApiKey()), c5262cj);
        Wf wf = new Wf(sh.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(sh.b);
        W8 w8 = sh.c;
        synchronized (sh) {
            str = sh.f;
        }
        ji.a(new Ih(a2, false, 1, null, new Sh(wf, counterConfiguration, w8, str)));
        this.c.info("Revenue received for productID: " + WrapUtils.wrapToTag(revenue.productID) + " of quantity: " + WrapUtils.wrapToTag(revenue.quantity) + " with price (in micros): " + revenue.priceMicros + " " + revenue.currency, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(@NonNull Throwable th) {
        C5421io a = AbstractC5499lo.a(th, new X(null, null, this.j.a()), null, (String) this.k.b.a(), (Boolean) this.k.c.a());
        Ji ji = this.h;
        ji.a(ji.a(a, this.b));
        this.c.info("Unhandled exception received: " + a, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
        String str;
        C5759vo c5759vo = new C5759vo(C5759vo.c);
        Iterator<UserProfileUpdate<? extends InterfaceC5785wo>> it = userProfile.getUserProfileUpdates().iterator();
        while (it.hasNext()) {
            InterfaceC5785wo userProfileUpdatePatcher = it.next().getUserProfileUpdatePatcher();
            userProfileUpdatePatcher.a(this.c);
            userProfileUpdatePatcher.a(c5759vo);
        }
        Ao ao = new Ao();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c5759vo.a.size(); i++) {
            SparseArray sparseArray = c5759vo.a;
            Iterator it2 = ((HashMap) sparseArray.get(sparseArray.keyAt(i))).values().iterator();
            while (it2.hasNext()) {
                arrayList.add((C5811xo) it2.next());
            }
        }
        ao.a = (C5811xo[]) arrayList.toArray(new C5811xo[arrayList.size()]);
        Io a = o.a(ao);
        if (!a.a) {
            this.c.warning("UserInfo wasn't sent because " + a.b, new Object[0]);
            return;
        }
        Ji ji = this.h;
        Sh sh = this.b;
        ji.getClass();
        C5326f6 a2 = C5273d4.a(ao);
        Wf wf = new Wf(sh.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(sh.b);
        W8 w8 = sh.c;
        synchronized (sh) {
            str = sh.f;
        }
        ji.a(new Ih(a2, false, 1, null, new Sh(wf, counterConfiguration, w8, str)));
        this.c.info("User profile received", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        d(null);
        this.c.info("Resume session", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.c.info("Send event buffer", new Object[0]);
        Ji ji = this.h;
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        PublicLogger publicLogger = this.c;
        Set set = Q9.a;
        C5273d4 c5273d4 = new C5273d4("", "", 256, 0, publicLogger);
        Sh sh = this.b;
        ji.getClass();
        ji.a(Ji.a(c5273d4, sh), sh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
        this.b.b.setDataSendingEnabled(z);
        this.c.info("Updated data sending enabled: %s", Boolean.valueOf(z));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(@NonNull String str, @Nullable byte[] bArr) {
        Ji ji = this.h;
        PublicLogger publicLogger = this.c;
        Set set = Q9.a;
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        C5273d4 c5273d4 = new C5273d4("", (String) null, 8193, 0, publicLogger);
        if (bArr == null) {
            bArr = new byte[0];
        }
        c5273d4.p = Collections.singletonMap(str, bArr);
        Sh sh = this.b;
        ji.getClass();
        ji.a(Ji.a(c5273d4, sh), sh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(@Nullable String str) {
        String str2;
        Ji ji = this.h;
        Sh sh = this.b;
        ji.getClass();
        C5273d4 c5273d4 = new C5273d4(LoggerStorage.getOrCreatePublicLogger(sh.b.getApiKey()));
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        c5273d4.d = 40962;
        c5273d4.c(str);
        c5273d4.b = c5273d4.e(str);
        Wf wf = new Wf(sh.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(sh.b);
        W8 w8 = sh.c;
        synchronized (sh) {
            str2 = sh.f;
        }
        ji.a(new Ih(c5273d4, false, 1, null, new Sh(wf, counterConfiguration, w8, str2)));
        this.c.info("Set user profile ID: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z) {
        String str;
        Ji ji = this.h;
        F f = new F(adRevenue, z, this.m, this.c);
        Sh sh = this.b;
        ji.getClass();
        C5273d4 a = C5273d4.a(LoggerStorage.getOrCreatePublicLogger(sh.b.getApiKey()), f);
        Wf wf = new Wf(sh.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(sh.b);
        W8 w8 = sh.c;
        synchronized (sh) {
            str = sh.f;
        }
        ji.a(new Ih(a, false, 1, null, new Sh(wf, counterConfiguration, w8, str)));
        this.c.info("AdRevenue Received: AdRevenue{adRevenue=" + adRevenue.adRevenue + ", currency='" + WrapUtils.wrapToTag(adRevenue.currency.getCurrencyCode()) + "', adType=" + WrapUtils.wrapToTag(adRevenue.adType) + ", adNetwork='" + WrapUtils.wrapToTag(adRevenue.adNetwork) + "', adUnitId='" + WrapUtils.wrapToTag(adRevenue.adUnitId) + "', adUnitName='" + WrapUtils.wrapToTag(adRevenue.adUnitName) + "', adPlacementId='" + WrapUtils.wrapToTag(adRevenue.adPlacementId) + "', adPlacementName='" + WrapUtils.wrapToTag(adRevenue.adPlacementName) + "', precision='" + WrapUtils.wrapToTag(adRevenue.precision) + "', payload=" + Cb.b(adRevenue.payload) + ", autoCollected=" + z + "}", new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5254cb
    public final void b(@NonNull String str, @Nullable String str2) {
        this.c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        Ji ji = this.h;
        PublicLogger publicLogger = this.c;
        Set set = Q9.a;
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        C5273d4 c5273d4 = new C5273d4(str2, str, 1, 0, publicLogger);
        c5273d4.l = G9.JS;
        Sh sh = this.b;
        ji.getClass();
        ji.a(Ji.a(c5273d4, sh), sh, 1, (Map) null);
    }

    public final void a(Map<String, String> map) {
        if (Do.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            putAppEnvironmentValue(entry.getKey(), entry.getValue());
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, String str2) {
        this.c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        Ji ji = this.h;
        PublicLogger publicLogger = this.c;
        Set set = Q9.a;
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        C5273d4 c5273d4 = new C5273d4(str2, str, 1, 0, publicLogger);
        Sh sh = this.b;
        ji.getClass();
        ji.a(Ji.a(c5273d4, sh), sh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2) {
        reportError(str, str2, (Throwable) null);
    }

    public final C5421io a(Throwable th) {
        Throwable th2;
        StackTraceElement[] stackTraceElementArr;
        if (th == null) {
            stackTraceElementArr = null;
            th2 = null;
        } else if (th instanceof C5193a2) {
            stackTraceElementArr = th.getStackTrace();
            th2 = null;
        } else {
            th2 = th;
            stackTraceElementArr = null;
        }
        return AbstractC5499lo.a(th2, new X(null, null, this.j.a()), stackTraceElementArr != null ? Arrays.asList(stackTraceElementArr) : null, (String) this.k.b.a(), (Boolean) this.k.c.a());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th) {
        M6 m6 = new M6(new Mg(str2, a(th)), str);
        Ji ji = this.h;
        byte[] byteArray = MessageNano.toByteArray(this.f.fromModel(m6));
        PublicLogger publicLogger = this.c;
        Set set = Q9.a;
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        C5273d4 c5273d4 = new C5273d4(byteArray, str2, 5896, publicLogger);
        Sh sh = this.b;
        ji.getClass();
        ji.a(Ji.a(c5273d4, sh), sh, 1, (Map) null);
        this.c.info("Error received: id: %s, message: %s", WrapUtils.wrapToTag(str), WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5254cb
    public final void b(@NonNull String str) {
        Ji ji = this.h;
        C5326f6 a = C5326f6.a(str);
        Sh sh = this.b;
        ji.getClass();
        ji.a(Ji.a(a, sh), sh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        C5421io a = this.l.a(pluginErrorDetails);
        Ji ji = this.h;
        Yn yn = a.a;
        String str = yn != null ? (String) WrapUtils.getOrDefault(yn.a, "") : "";
        byte[] byteArray = MessageNano.toByteArray(this.d.fromModel(a));
        PublicLogger publicLogger = this.c;
        Set set = Q9.a;
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        C5273d4 c5273d4 = new C5273d4(byteArray, str, 5891, publicLogger);
        Sh sh = this.b;
        ji.getClass();
        ji.a(Ji.a(c5273d4, sh), sh, 1, (Map) null);
        this.c.info("Crash from plugin received: %s", WrapUtils.wrapToTag(pluginErrorDetails.getMessage()));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5254cb
    public final boolean b() {
        return this.b.f();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
        Ji ji = this.h;
        PublicLogger publicLogger = this.c;
        Set set = Q9.a;
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        ji.a(new C5273d4("", str, 1, 0, publicLogger), this.b, 1, map);
        PublicLogger publicLogger2 = this.c;
        StringBuilder sb = new StringBuilder("Event received: ");
        sb.append(WrapUtils.wrapToTag(str));
        sb.append(". With value: ");
        sb.append(WrapUtils.wrapToTag(map == null ? null : map.toString()));
        publicLogger2.info(sb.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5512mb, io.appmetrica.analytics.impl.InterfaceC5617qb
    public final void a(@NonNull C5421io c5421io) {
        pauseSession();
        Ji ji = this.h;
        Ih a = ji.a(c5421io, this.b);
        Sh sh = a.e;
        InterfaceC5368gm interfaceC5368gm = ji.e;
        if (interfaceC5368gm != null) {
            sh.b.setUuid(((C5342fm) interfaceC5368gm).g());
        } else {
            sh.getClass();
        }
        ji.c.b(a);
        this.c.info("Unhandled exception received: " + c5421io, new Object[0]);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
        C5421io c5421io;
        C5309ef c5309ef = this.l;
        if (pluginErrorDetails != null) {
            c5421io = c5309ef.a(pluginErrorDetails);
        } else {
            c5309ef.getClass();
            c5421io = null;
        }
        Mg mg = new Mg(str, c5421io);
        Ji ji = this.h;
        byte[] byteArray = MessageNano.toByteArray(this.e.fromModel(mg));
        PublicLogger publicLogger = this.c;
        Set set = Q9.a;
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        C5273d4 c5273d4 = new C5273d4(byteArray, str, 5896, publicLogger);
        Sh sh = this.b;
        ji.getClass();
        ji.a(Ji.a(c5273d4, sh), sh, 1, (Map) null);
        this.c.info("Error from plugin received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
        G9 g9;
        if (n.contains(Integer.valueOf(moduleEvent.getType()))) {
            return;
        }
        PublicLogger publicLogger = this.c;
        Set set = Q9.a;
        String value = moduleEvent.getValue();
        String name = moduleEvent.getName();
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        C5273d4 c5273d4 = new C5273d4(value, name, 8192, moduleEvent.getType(), publicLogger);
        int i = Y8.a[moduleEvent.getCategory().ordinal()];
        if (i == 1) {
            g9 = G9.NATIVE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            g9 = G9.SYSTEM;
        }
        c5273d4.l = g9;
        c5273d4.c = Cb.b(moduleEvent.getEnvironment());
        if (moduleEvent.getExtras() != null) {
            c5273d4.p = moduleEvent.getExtras();
        }
        this.h.a(c5273d4, this.b, moduleEvent.getServiceDataReporterType(), moduleEvent.getAttributes());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5512mb, io.appmetrica.analytics.impl.InterfaceC5398i0
    public final void a(@NonNull X x) {
        C5294e0 c5294e0 = new C5294e0(x, (String) this.k.b.a(), (Boolean) this.k.c.a());
        Ji ji = this.h;
        byte[] byteArray = MessageNano.toByteArray(this.g.fromModel(c5294e0));
        PublicLogger publicLogger = this.c;
        Set set = Q9.a;
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        C5273d4 c5273d4 = new C5273d4(byteArray, "", 5968, publicLogger);
        Sh sh = this.b;
        ji.getClass();
        String str = null;
        ji.a(Ji.a(c5273d4, sh), sh, 1, (Map) null);
        PublicLogger publicLogger2 = this.c;
        StringBuilder sb = new StringBuilder("ANR was reported ");
        On on = x.a;
        if (on != null) {
            str = "Thread[name=" + on.a + ",tid={" + on.c + ", priority=" + on.b + ", group=" + on.d + "}] at " + CollectionsKt.joinToString$default(on.f, "\n", null, null, 0, null, null, 62, null);
        }
        sb.append(str);
        publicLogger2.info(sb.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
        C5421io c5421io;
        C5309ef c5309ef = this.l;
        if (pluginErrorDetails != null) {
            c5421io = c5309ef.a(pluginErrorDetails);
        } else {
            c5309ef.getClass();
            c5421io = null;
        }
        M6 m6 = new M6(new Mg(str2, c5421io), str);
        Ji ji = this.h;
        byte[] byteArray = MessageNano.toByteArray(this.f.fromModel(m6));
        PublicLogger publicLogger = this.c;
        Set set = Q9.a;
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        C5273d4 c5273d4 = new C5273d4(byteArray, str2, 5896, publicLogger);
        Sh sh = this.b;
        ji.getClass();
        ji.a(Ji.a(c5273d4, sh), sh, 1, (Map) null);
        this.c.info("Error with identifier: %s from plugin received: %s", str, WrapUtils.wrapToTag(str2));
    }
}

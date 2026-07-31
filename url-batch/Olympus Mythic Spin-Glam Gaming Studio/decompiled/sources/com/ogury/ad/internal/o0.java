package com.ogury.ad.internal;

import android.content.Context;
import android.net.Uri;
import com.ironsource.X3;
import com.ogury.ad.OguryAdError;
import com.ogury.ad.common.OguryMediation;
import com.ogury.ad.viewer.AdsCallback;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.SourceTag;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class o0 implements q8 {
    public int A;
    public final v2 B;
    public final Context a;
    public final c b;
    public final ne c;
    public final g5 d;
    public final u5 e;
    public final s7 f;
    public final v7 g;
    public final o h;
    public final b0 i;
    public final ke j;
    public final x k;
    public final a0 l;
    public final String m;
    public final OguryMediation n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public List s;
    public AdsCallback t;
    public final h9 u;
    public g9 v;
    public da w;
    public boolean x;
    public String y;
    public int z;

    public o0(Context context, String sessionId, OguryMediation oguryMediation, c adConfig, x adType, boolean z) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        s0 s0Var = new s0();
        t3 t3Var = new t3();
        v6 v6Var = v6.a;
        b0 adsConditionsChecker = new b0(applicationContext, s0Var, t3Var, adType, sessionId, oguryMediation);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(adsConditionsChecker, "adsConditionsChecker");
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        ne a = ne.g.a(context);
        g5 g5Var = g5.a;
        r5 r5Var = u5.e;
        Context applicationContext3 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext3, "getApplicationContext(...)");
        u5 a2 = r5Var.a(applicationContext3);
        s7 s7Var = s7.a;
        Intrinsics.checkNotNullParameter(context, "context");
        v7 v7Var = new v7(context);
        o oVar = new o(context);
        ke a3 = ke.d.a(context);
        a0 a0Var = new a0();
        this.a = applicationContext2;
        this.b = adConfig;
        this.c = a;
        this.d = g5Var;
        this.e = a2;
        this.f = s7Var;
        this.g = v7Var;
        this.h = oVar;
        this.i = adsConditionsChecker;
        this.j = a3;
        this.k = adType;
        this.l = a0Var;
        this.m = sessionId;
        this.n = oguryMediation;
        this.o = z;
        this.r = true;
        this.s = new ArrayList();
        this.u = h9.a;
        this.B = new v2(adConfig.f);
    }

    public final void a(b ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        b("Ad " + ad.f + " expired");
        this.s.remove(ad);
        int size = this.s.size();
        int i = 0;
        while (i < size) {
            b bVar = (b) this.s.get(i);
            i++;
            bVar.getClass();
        }
    }

    public final void b(b ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        b("Unload ad " + ad.f);
        int i = 0;
        this.o = false;
        this.s.remove(ad);
        int size = this.s.size();
        while (i < size) {
            b bVar = (b) this.s.get(i);
            i++;
            bVar.getClass();
        }
    }

    public final void c(String str) {
        IntegrationLogger.e(LogTag.REQUESTS, SourceTag.ADS, X3.j.d + this.k.b + "][Load][" + this.b.a + "] " + str);
    }

    public final void a(String str) {
        this.q = true;
        this.p = this.o;
        b("Loading ad unit [" + this.b.a + "]...");
        this.y = str;
        this.e.a(ob.c, this.b.a, this.m, this.n, pb.a(TuplesKt.to("from_ad_markup", Boolean.valueOf(str != null)), TuplesKt.to("reload", Boolean.valueOf(this.p))), this.B);
        b("Waiting for module setup...");
        h9 h9Var = this.u;
        d0 ogurySdkInitCallback = new d0(this);
        h9Var.getClass();
        Intrinsics.checkNotNullParameter(ogurySdkInitCallback, "ogurySdkInitCallback");
        n9 n9Var = h9.b;
        n9Var.getClass();
        Intrinsics.checkNotNullParameter(ogurySdkInitCallback, "ogurySdkInitCallback");
        int i = n9Var.h;
        if (i == 2) {
            ogurySdkInitCallback.a();
            return;
        }
        if (i == 3) {
            n9Var.j.add(ogurySdkInitCallback);
            return;
        }
        if (i != 1) {
            if (i == 4) {
                ogurySdkInitCallback.a(n9Var.i);
                return;
            }
            return;
        }
        if (this.j.a().length() == 0) {
            c("Impossible to set up module (no asset key found)");
            u5 u5Var = this.e;
            nb nbVar = nb.i;
            String str2 = this.b.a;
            String str3 = this.m;
            OguryMediation oguryMediation = this.n;
            Pair pair = TuplesKt.to("from_ad_markup", Boolean.valueOf(this.y != null));
            Pair pair2 = TuplesKt.to("reload", Boolean.valueOf(this.p));
            int i2 = this.z;
            u5Var.a(nbVar, str2, str3, oguryMediation, pb.a(pair, pair2, TuplesKt.to("webview_termination", i2 > 0 ? Integer.valueOf(i2) : null)), null, this.B);
            a(new OguryAdError(OguryAdError.Type.LOAD_ERROR, 2000, "The load could not proceed because the SDK appears to have not been started."));
            return;
        }
        c("SDK not initialized. Please initialize the SDK before attempting to load an Ad.");
        u5 u5Var2 = this.e;
        nb nbVar2 = nb.j;
        String str4 = this.b.a;
        String str5 = this.m;
        OguryMediation oguryMediation2 = this.n;
        Pair pair3 = TuplesKt.to("from_ad_markup", Boolean.valueOf(this.y != null));
        Pair pair4 = TuplesKt.to("reload", Boolean.valueOf(this.p));
        int i3 = this.z;
        u5Var2.a(nbVar2, str4, str5, oguryMediation2, pb.a(pair3, pair4, TuplesKt.to("webview_termination", i3 > 0 ? Integer.valueOf(i3) : null)), null, this.B);
        a(new OguryAdError(OguryAdError.Type.LOAD_ERROR, 2000, "The load could not proceed because the SDK appears to have not been started."));
    }

    public final void b(String str) {
        IntegrationLogger.d(LogTag.REQUESTS, SourceTag.ADS, X3.j.d + this.k.b + "][Load][" + this.b.a + "] " + str);
    }

    public final void c() {
        a(new OguryAdError(OguryAdError.Type.LOAD_ERROR, 2300, "The ad could not be loaded due to a failure in ad precaching."));
    }

    public final void b() {
        u5 u5Var = this.e;
        nb nbVar = nb.x;
        String str = this.b.a;
        String str2 = this.m;
        OguryMediation oguryMediation = this.n;
        Pair pair = TuplesKt.to("from_ad_markup", Boolean.valueOf(this.y != null));
        Pair pair2 = TuplesKt.to("reload", Boolean.valueOf(this.p));
        int i = this.z;
        u5Var.a(nbVar, str, str2, oguryMediation, pb.a(pair, pair2, TuplesKt.to("webview_termination", i > 0 ? Integer.valueOf(i) : null)), null, this.B);
    }

    public final void a(List ads) {
        y4 r3Var;
        Object obj;
        a5 a5Var;
        b5 b5Var;
        b("Precaching available ads...");
        int i = this.z;
        String str = POBConstants.KEY_FORMAT;
        if (i == 0) {
            u5 u5Var = this.e;
            ob obVar = ob.f;
            b bVar = (b) CollectionsKt.first(ads);
            Pair pair = TuplesKt.to("from_ad_markup", Boolean.valueOf(this.y != null));
            b bVar2 = (b) CollectionsKt.firstOrNull(ads);
            if (bVar2 == null || (a5Var = bVar2.A) == null || (b5Var = a5Var.a) == null) {
                obj = null;
            } else {
                Intrinsics.checkNotNullParameter(b5Var, "<this>");
                int ordinal = b5Var.ordinal();
                if (ordinal == 0) {
                    obj = POBConstants.KEY_FORMAT;
                } else {
                    if (ordinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj = "sdk";
                }
            }
            Pair pair2 = TuplesKt.to("loaded_source", obj);
            Pair pair3 = TuplesKt.to("reload", Boolean.valueOf(this.p));
            int i2 = this.z;
            u5Var.a(obVar, bVar, pb.a(pair, pair2, pair3, TuplesKt.to("webview_termination", i2 > 0 ? Integer.valueOf(i2) : null)));
        }
        Iterator it = ads.iterator();
        while (it.hasNext()) {
            b bVar3 = (b) it.next();
            this.A = bVar3.L;
            if (bVar3.c.length() == 0) {
                c("Failed to load (invalid ad)");
                b("Triggering onAdError() callback");
                if (this.t == null) {
                    b("No ad listener registered");
                }
                u5 u5Var2 = this.e;
                nb nbVar = nb.p;
                Pair pair4 = TuplesKt.to("from_ad_markup", Boolean.valueOf(bVar3.H));
                Pair pair5 = TuplesKt.to("reload", Boolean.valueOf(bVar3.J));
                b5 b5Var2 = bVar3.A.a;
                Intrinsics.checkNotNullParameter(b5Var2, "<this>");
                int ordinal2 = b5Var2.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "sdk";
                }
                Pair pair6 = TuplesKt.to("loaded_source", str);
                int i3 = this.z;
                u5Var2.a(nbVar, bVar3, pb.a(pair4, pair5, pair6, TuplesKt.to("webview_termination", i3 > 0 ? Integer.valueOf(i3) : null)), null);
                this.q = false;
                c();
                return;
            }
        }
        this.s = CollectionsKt.toMutableList((Collection) ads);
        v7 v7Var = this.g;
        l0 preCacheListener = new l0(this);
        int i4 = this.z;
        v7Var.getClass();
        Intrinsics.checkNotNullParameter(this, "oguryAdGateway");
        Intrinsics.checkNotNullParameter(ads, "ads");
        Intrinsics.checkNotNullParameter(preCacheListener, "preCacheListener");
        ui uiVar = v7Var.b;
        uiVar.l = preCacheListener;
        uiVar.h.removeCallbacksAndMessages(null);
        Iterator it2 = uiVar.a.iterator();
        while (it2.hasNext()) {
            ((ri) it2.next()).destroy();
        }
        uiVar.a.clear();
        uiVar.e = 0;
        uiVar.f = 0;
        uiVar.g = false;
        v7Var.a.getClass();
        Intrinsics.checkNotNullParameter(this, "oguryAdGateway");
        Iterator it3 = v6.b.entrySet().iterator();
        while (it3.hasNext()) {
            if (Intrinsics.areEqual(((u6) ((Map.Entry) it3.next()).getValue()).a.get(), this)) {
                it3.remove();
            }
        }
        Iterator it4 = ads.iterator();
        while (it4.hasNext()) {
            b bVar4 = (b) it4.next();
            Context context = v7Var.e;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            y7 a = b8.a(context, bVar4);
            if (a != null) {
                v7Var.c.a(a);
                zi.c(a);
                ui uiVar2 = v7Var.b;
                v6 v6Var = v7Var.a;
                r5 r5Var = u5.e;
                Context applicationContext = v7Var.e.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                t4 command = new t4(a, bVar4, v6Var, this, r5Var.a(applicationContext));
                uiVar2.getClass();
                Intrinsics.checkNotNullParameter(command, "command");
                uiVar2.a.add(command);
                if (bVar4.s.length() > 0) {
                    Context context2 = v7Var.e;
                    Intrinsics.checkNotNullExpressionValue(context2, "context");
                    y7 a2 = b8.a(context2, bVar4);
                    if (a2 != null) {
                        zi.c(a2);
                    }
                    if (a2 != null) {
                        w1.a(a2);
                        ui uiVar3 = v7Var.b;
                        x4 command2 = new x4(bVar4, a2);
                        uiVar3.getClass();
                        Intrinsics.checkNotNullParameter(command2, "command");
                        uiVar3.a.add(command2);
                    }
                }
            } else {
                kb.a(preCacheListener, bVar4, lb.b, null, 60);
                return;
            }
        }
        ui uiVar4 = v7Var.b;
        y1 chromeVersionHelper = v7Var.c;
        v7Var.d.getClass();
        long millis = TimeUnit.SECONDS.toMillis(le.b.d.f.c);
        uiVar4.getClass();
        Intrinsics.checkNotNullParameter(chromeVersionHelper, "chromeVersionHelper");
        uiVar4.k = Long.valueOf(System.currentTimeMillis());
        uiVar4.d = uiVar4.a.size();
        uiVar4.e = 0;
        uiVar4.f = 0;
        ti loadCallback = uiVar4.b;
        Intrinsics.checkNotNullParameter(loadCallback, "loadCallback");
        Intrinsics.checkNotNullParameter(chromeVersionHelper, "chromeVersionHelper");
        if (chromeVersionHelper.b <= 57) {
            r3Var = new yg(loadCallback);
        } else {
            r3Var = new r3(loadCallback);
        }
        uiVar4.i = r3Var;
        r3Var.a(uiVar4.a, i4);
        uiVar4.a(millis);
    }

    public final void a(ah showAction) {
        Object obj;
        Object obj2;
        Object obj3;
        boolean z;
        Object obj4;
        a5 a5Var;
        b5 b5Var;
        a5 a5Var2;
        b5 b5Var2;
        Intrinsics.checkNotNullParameter(showAction, "showAction");
        LogTag logTag = LogTag.REQUESTS;
        SourceTag sourceTag = SourceTag.ADS;
        IntegrationLogger.d(logTag, sourceTag, X3.j.d + this.k.b + "][Show] Showing ad unit [" + this.b.a + "]...");
        Pair pair = TuplesKt.to("from_ad_markup", Boolean.valueOf(this.y != null));
        b bVar = (b) CollectionsKt.firstOrNull(this.s);
        if (bVar == null || (a5Var2 = bVar.A) == null || (b5Var2 = a5Var2.a) == null) {
            obj = null;
        } else {
            Intrinsics.checkNotNullParameter(b5Var2, "<this>");
            int ordinal = b5Var2.ordinal();
            if (ordinal == 0) {
                obj = POBConstants.KEY_FORMAT;
            } else {
                if (ordinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                obj = "sdk";
            }
        }
        Pair pair2 = TuplesKt.to("loaded_source", obj);
        Pair pair3 = TuplesKt.to("reload", Boolean.valueOf(this.p));
        int i = this.z;
        JSONObject a = pb.a(pair, pair2, pair3, TuplesKt.to("webview_termination", i > 0 ? Integer.valueOf(i) : null));
        if (this.s.isEmpty()) {
            u5 u5Var = this.e;
            ob obVar = ob.q;
            String str = this.b.a;
            String str2 = this.m;
            obj2 = POBConstants.KEY_FORMAT;
            obj3 = "sdk";
            u5Var.a(obVar, str, str2, this.n, a, this.B);
        } else {
            obj2 = POBConstants.KEY_FORMAT;
            obj3 = "sdk";
            this.e.a(ob.q, (b) CollectionsKt.first(this.s), a);
        }
        if (this.i.a(this.t, this.o, this.b, this.s, this.y != null, this.p, this.z, this.A)) {
            this.r = false;
            u5 u5Var2 = this.e;
            ob obVar2 = ob.r;
            b bVar2 = (b) CollectionsKt.first(this.s);
            Pair pair4 = TuplesKt.to("from_ad_markup", Boolean.valueOf(this.y != null));
            b bVar3 = (b) CollectionsKt.firstOrNull(this.s);
            if (bVar3 == null || (a5Var = bVar3.A) == null || (b5Var = a5Var.a) == null) {
                z = true;
                obj4 = null;
            } else {
                Intrinsics.checkNotNullParameter(b5Var, "<this>");
                int ordinal2 = b5Var.ordinal();
                if (ordinal2 != 0) {
                    z = true;
                    if (ordinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj4 = obj3;
                } else {
                    z = true;
                    obj4 = obj2;
                }
            }
            Pair pair5 = TuplesKt.to("loaded_source", obj4);
            Pair pair6 = TuplesKt.to("reload", Boolean.valueOf(this.p));
            int i2 = this.z;
            u5Var2.a(obVar2, bVar2, pb.a(pair4, pair5, pair6, TuplesKt.to("webview_termination", i2 > 0 ? Integer.valueOf(i2) : null)));
            IntegrationLogger.d(logTag, sourceTag, X3.j.d + this.k.b + "][Show][" + this.b.a + "] SHOW event");
            g5 g5Var = this.d;
            b bVar4 = (b) CollectionsKt.firstOrNull(this.s);
            jb jbVar = new jb("SHOW", bVar4 != null ? bVar4.D : null);
            g5Var.getClass();
            g5.a(jbVar);
            this.o = false;
            List<b> list = this.s;
            this.l.b = list.size();
            this.l.a = new m0(this);
            for (b bVar5 : list) {
                bVar5.H = this.y != null ? z : false;
                bVar5.I = this.n;
                s7 s7Var = this.f;
                String adId = bVar5.b;
                n0 listener = new n0(this);
                s7Var.getClass();
                Intrinsics.checkNotNullParameter(adId, "adId");
                Intrinsics.checkNotNullParameter(listener, "listener");
                Map listeners = s7.b;
                Intrinsics.checkNotNullExpressionValue(listeners, "listeners");
                listeners.put(adId, listener);
                bVar5.K = this.z;
            }
            showAction.a(this.a, CollectionsKt.toMutableList((Collection) list));
            return;
        }
        if (this.z > this.A) {
            this.o = false;
        }
    }

    public final void a() {
        b("Reset existing cache");
        this.x = true;
        for (b bVar : this.s) {
            s7 s7Var = this.f;
            String adId = bVar.b;
            s7Var.getClass();
            Intrinsics.checkNotNullParameter(adId, "adId");
            s7.b.remove(adId);
        }
        v7 v7Var = this.g;
        v7Var.getClass();
        Intrinsics.checkNotNullParameter(this, "oguryAdGateway");
        ui uiVar = v7Var.b;
        uiVar.l = null;
        uiVar.h.removeCallbacksAndMessages(null);
        Iterator it = uiVar.a.iterator();
        while (it.hasNext()) {
            ((ri) it.next()).destroy();
        }
        uiVar.a.clear();
        uiVar.e = 0;
        uiVar.f = 0;
        uiVar.g = false;
        v7Var.a.getClass();
        Intrinsics.checkNotNullParameter(this, "oguryAdGateway");
        Iterator it2 = v6.b.entrySet().iterator();
        while (it2.hasNext()) {
            if (Intrinsics.areEqual(((u6) ((Map.Entry) it2.next()).getValue()).a.get(), this)) {
                it2.remove();
            }
        }
        this.t = null;
        this.v = null;
    }

    public final void a(OguryAdError oguryAdError) {
        b("Triggering onAdError() callback");
        if (this.t == null) {
            b("No ad listener registered");
        }
        AdsCallback adsCallback = this.t;
        if (adsCallback != null) {
            adsCallback.onAdError(oguryAdError);
        }
        this.q = false;
        this.o = false;
    }

    public final void a(b bVar, boolean z, Uri uri) {
        String str;
        this.z++;
        u5 u5Var = this.e;
        ob obVar = ob.m;
        Pair pair = TuplesKt.to("from_ad_markup", Boolean.valueOf(bVar.H));
        b5 b5Var = bVar.A.a;
        Intrinsics.checkNotNullParameter(b5Var, "<this>");
        int ordinal = b5Var.ordinal();
        if (ordinal == 0) {
            str = POBConstants.KEY_FORMAT;
        } else if (ordinal == 1) {
            str = "sdk";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Pair pair2 = TuplesKt.to("loaded_source", str);
        Pair pair3 = TuplesKt.to("reload", Boolean.valueOf(bVar.J));
        Pair pair4 = TuplesKt.to("maxReloadAttemptsReached", Boolean.valueOf(this.z > this.A));
        int i = this.z;
        Uri uri2 = null;
        Pair pair5 = TuplesKt.to("webview_termination", i > 0 ? Integer.valueOf(i) : null);
        Pair pair6 = TuplesKt.to("cause", z ? "WebView crash" : "WebView removed");
        if (z) {
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(uri.getScheme());
            builder.authority(uri.getAuthority());
            builder.path(uri.getPath());
            Unit unit = Unit.INSTANCE;
            uri2 = builder.build();
        }
        u5Var.a(obVar, bVar, pb.a(pair, pair2, pair3, pair4, pair5, pair6, TuplesKt.to("failing_url", uri2)));
        if (this.z <= bVar.L && !this.s.isEmpty()) {
            c("Render process gone. Did crash: " + z + ", Failing URI: " + uri + ". Trying to reload ad...");
            ((b) CollectionsKt.first(this.s)).K = this.z;
            a(this.s);
            return;
        }
        a(bVar, z, uri, true);
    }

    public final void a(b bVar, boolean z, Uri uri, boolean z2) {
        String str;
        String str2;
        this.q = false;
        if (z2) {
            if (!this.s.isEmpty()) {
                str = "Maximum reached after " + bVar.L + " tries. ";
            } else {
                str = "Ads list is empty before reaching max attempts.";
            }
        } else {
            str = "Removing ad from cache.";
        }
        c("Render process gone. Did crash: " + z + ", Failing URI: " + uri + ". " + str);
        if (z2) {
            return;
        }
        u5 u5Var = this.e;
        nb nbVar = nb.w;
        Pair pair = TuplesKt.to("from_ad_markup", Boolean.valueOf(bVar.H));
        Pair pair2 = TuplesKt.to("reload", Boolean.valueOf(bVar.J));
        b5 b5Var = bVar.A.a;
        Intrinsics.checkNotNullParameter(b5Var, "<this>");
        int ordinal = b5Var.ordinal();
        if (ordinal == 0) {
            str2 = POBConstants.KEY_FORMAT;
        } else if (ordinal == 1) {
            str2 = "sdk";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Pair pair3 = TuplesKt.to("loaded_source", str2);
        int i = this.z;
        u5Var.a(nbVar, bVar, pb.a(pair, pair2, pair3, TuplesKt.to("webview_termination", i > 0 ? Integer.valueOf(i) : null)), null);
        c();
    }
}

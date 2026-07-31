package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.nm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5549nm {
    public final HashSet a;
    public final HashMap b;
    public final C5471km c;
    public List d;
    public HashMap e;
    public long f;
    public boolean g;
    public long h;
    public final C5594pf i;
    public final Q j;
    public final T3 k;
    public final P6 l;
    public final C5563oa m;
    public final C5537na n;
    public final Ho o;

    public C5549nm(Context context, C5594pf c5594pf) {
        this(c5594pf, new Q(), new T3(), C5661s4.l().a(context), new P6(), new C5563oa(), new C5537na(), new Ho());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r8.g != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean a(List list) {
        boolean z;
        boolean z2;
        try {
            boolean a = a(CollectionsKt.intersect(list, AbstractC5705tm.a));
            Iterator it = list.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                if (this.a.contains((String) it.next())) {
                    z2 = true;
                    break;
                }
            }
            boolean z3 = AbstractC5705tm.b.currentTimeSeconds() > this.h;
            if (a && !z2 && !z3) {
            }
            z = true;
        } finally {
        }
        return z;
    }

    public final void b(IdentifiersResult identifiersResult) {
        if (a(identifiersResult)) {
            return;
        }
        this.b.put("appmetrica_clids", identifiersResult);
    }

    public final void c() {
        C5616qa c5616qa;
        C5594pf d = this.i.i((IdentifiersResult) this.b.get(StartupParamsCallback.APPMETRICA_UUID)).e((IdentifiersResult) this.b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID)).d((IdentifiersResult) this.b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)).a((IdentifiersResult) this.b.get("appmetrica_get_ad_url")).b((IdentifiersResult) this.b.get("appmetrica_report_ad_url")).e(this.f).h((IdentifiersResult) this.b.get("appmetrica_clids")).j(Wm.a((Map) this.e)).f((IdentifiersResult) this.b.get("appmetrica_google_adv_id")).g((IdentifiersResult) this.b.get("appmetrica_huawei_oaid")).j((IdentifiersResult) this.b.get("appmetrica_yandex_adv_id")).b(this.g).c(this.l.d).d(this.h);
        C5563oa c5563oa = this.m;
        synchronized (c5563oa) {
            c5616qa = c5563oa.b;
        }
        d.a(c5616qa);
    }

    public final synchronized boolean b() {
        return a(Arrays.asList("appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID));
    }

    public C5549nm(C5594pf c5594pf, Q q, T3 t3, Pd pd, P6 p6, C5563oa c5563oa, C5537na c5537na, Ho ho) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = new HashMap();
        this.c = new C5471km();
        hashSet.add("appmetrica_google_adv_id");
        hashSet.add("appmetrica_huawei_oaid");
        hashSet.add("appmetrica_yandex_adv_id");
        this.i = c5594pf;
        this.j = q;
        this.k = t3;
        this.l = p6;
        this.m = c5563oa;
        this.n = c5537na;
        this.o = ho;
        a(pd.a(), c5594pf.q());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID, c5594pf.j());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, c5594pf.i());
        a("appmetrica_get_ad_url", c5594pf.d());
        a("appmetrica_report_ad_url", c5594pf.e());
        b(c5594pf.o());
        a("appmetrica_google_adv_id", c5594pf.l());
        a("appmetrica_huawei_oaid", c5594pf.m());
        a("appmetrica_yandex_adv_id", c5594pf.r());
        p6.a(c5594pf.h());
        c5563oa.a(c5594pf.k());
        this.d = c5594pf.g();
        String i = c5594pf.i((String) null);
        this.e = i != null ? Wm.a(i) : null;
        this.g = c5594pf.a(true);
        this.f = c5594pf.b(0L);
        this.h = c5594pf.n();
        c();
    }

    public final boolean a() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.b.get("appmetrica_clids");
        if (!a(identifiersResult) && identifiersResult.id.isEmpty()) {
            return Do.a((Map) this.e);
        }
        return true;
    }

    public final void a(IdentifiersResult identifiersResult, IdentifiersResult identifiersResult2) {
        if (identifiersResult != null) {
            Ho ho = this.o;
            String str = identifiersResult.id;
            ho.getClass();
            if (Ho.a(str)) {
                this.b.put(StartupParamsCallback.APPMETRICA_UUID, identifiersResult);
            }
        }
        String str2 = identifiersResult == null ? null : identifiersResult.id;
        String str3 = identifiersResult2.id;
        if (str2 == null || !(str3 == null || str2.equals(str3))) {
            C5340fk c5340fk = Dj.a;
            c5340fk.reportError((str2 == null ? "null_uuid" : "wrong_uuid").concat("_on_client"), "The only true uuid: " + str2 + "; backup uuid: " + str3);
        }
    }

    public static boolean a(IdentifiersResult identifiersResult) {
        return identifiersResult == null || identifiersResult.id == null;
    }

    public final void a(String str, IdentifiersResult identifiersResult) {
        if (identifiersResult == null || StringUtils.isNullOrEmpty(identifiersResult.id)) {
            return;
        }
        this.b.put(str, identifiersResult);
    }

    public final synchronized boolean a(Collection collection) {
        Boolean bool;
        String str;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                IdentifiersResult identifiersResult = (IdentifiersResult) this.b.get(str2);
                if (identifiersResult == null) {
                    identifiersResult = (IdentifiersResult) this.l.c.get(str2);
                }
                if (identifiersResult == null) {
                    C5616qa c5616qa = this.m.b;
                    if (!Intrinsics.areEqual(str2, "appmetrica_lib_ssl_enabled") || (bool = c5616qa.a) == null) {
                        identifiersResult = null;
                    } else {
                        boolean booleanValue = bool.booleanValue();
                        IdentifierStatus identifierStatus = c5616qa.b;
                        String str3 = c5616qa.c;
                        if (booleanValue) {
                            str = "true";
                        } else if (!booleanValue) {
                            str = "false";
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        identifiersResult = new IdentifiersResult(str, identifierStatus, str3);
                    }
                }
                if ("appmetrica_clids".equals(str2)) {
                    if (this.g || a(identifiersResult) || (identifiersResult.id.isEmpty() && !Do.a((Map) this.e))) {
                        return false;
                    }
                } else if ("appmetrica_lib_ssl_enabled".equals(str2)) {
                    if (identifiersResult == null) {
                        return false;
                    }
                } else if (identifiersResult == null || StringUtils.isNullOrEmpty(identifiersResult.id)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}

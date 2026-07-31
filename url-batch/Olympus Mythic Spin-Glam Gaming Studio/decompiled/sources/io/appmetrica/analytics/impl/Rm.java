package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes9.dex */
public final class Rm {
    public final Sm a;
    public final Object b = new Object();
    public volatile NetworkTask c;

    public Rm(@NotNull Sm sm) {
        this.a = sm;
    }

    @NotNull
    public final Context b() {
        return this.a.a;
    }

    @Nullable
    public final NetworkTask c() {
        NetworkTask networkTask;
        synchronized (this.b) {
            try {
                if (g()) {
                    networkTask = this.c;
                    if (networkTask != null) {
                        if (networkTask.isRemoved()) {
                        }
                    }
                    networkTask = C5620qe.a(this, d());
                    this.c = networkTask;
                } else {
                    networkTask = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return networkTask;
    }

    @NotNull
    public final C5679sm d() {
        return (C5679sm) this.a.l.a();
    }

    @NotNull
    public final C5783wm e() {
        C5783wm c5783wm;
        Zl zl = this.a.l;
        synchronized (zl) {
            c5783wm = zl.c.a;
        }
        return c5783wm;
    }

    public final void f() {
        C5783wm c5783wm;
        Zl zl = this.a.l;
        synchronized (zl) {
            c5783wm = zl.c.a;
        }
        Am am = c5783wm.c;
        C5861zm a = am.a(am.m);
        String str = c5783wm.a;
        String str2 = c5783wm.b;
        String str3 = this.a.m.a().id;
        if (str3 == null || (StringUtils.isNotNullOrEmpty(c5783wm.d) && !Intrinsics.areEqual(str3, c5783wm.d))) {
            String str4 = c5783wm.d;
            C5340fk c5340fk = Dj.a;
            c5340fk.reportError((str3 == null ? "null_uuid" : "wrong_uuid").concat("_on_service"), "The only true uuid: " + str3 + "; backup uuid: " + str4);
        }
        if (str3 == null) {
            str3 = c5783wm.d;
        }
        a.a = str3;
        String str5 = c5783wm.a;
        if (str5 == null || str5.length() == 0) {
            str = this.a.h.a();
            str2 = "";
        }
        List<String> list = this.a.c.e;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        a.g = list;
        C5783wm c5783wm2 = new C5783wm(str, str2, new Am(a));
        b(c5783wm2);
        a(c5783wm2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g() {
        boolean z;
        boolean z2 = false;
        if (Ka.I.h().isRestrictedForSdk()) {
            return false;
        }
        C5783wm e = e();
        Set set = AbstractC5705tm.a;
        if (!e.w) {
            if (AbstractC5705tm.b.currentTimeSeconds() <= e.o + e.z.a) {
                z = false;
                if (!z) {
                    if (AbstractC5705tm.a(e.d) && AbstractC5705tm.a(e.a) && AbstractC5705tm.a(e.b)) {
                        z2 = true;
                    }
                    z = !z2;
                    T3 t3 = this.a.k;
                    Map map = d().h;
                    Q3 q3 = this.a.j;
                    t3.getClass();
                    boolean a = T3.a(map, e, q3);
                    if (z2 && !a) {
                        return true;
                    }
                }
                return z;
            }
        }
        z = true;
        if (!z) {
        }
        return z;
    }

    @NotNull
    public final C5351g5 a() {
        return this.a.f;
    }

    public final void b(C5783wm c5783wm) {
        this.a.l.a(c5783wm);
        C5757vm c5757vm = this.a.g;
        c5757vm.b.a(c5783wm.a);
        c5757vm.b.b(c5783wm.b);
        Qo qo = c5757vm.b.a;
        Qo.a(qo.a);
        Qo.a(qo.b);
        c5757vm.a.save(c5783wm.c);
        this.a.e.a(c5783wm);
    }

    public final boolean a(@Nullable List<String> list, @NotNull Map<String, String> map) {
        return !AbstractC5705tm.a(e(), list, map, new Qm(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r5 == null) goto L15;
     */
    @VisibleForTesting
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C5783wm a(@NotNull C5731um c5731um, @NotNull C5679sm c5679sm, long j) {
        String str;
        boolean equals;
        String a = Wm.a(c5679sm.h);
        Map map = c5679sm.i.a;
        String str2 = c5731um.j;
        String str3 = e().k;
        if (!Wm.a(Wm.a(str2))) {
            str2 = Wm.a(Wm.a(str3)) ? str3 : null;
        }
        String str4 = e().a;
        if (str4 != null) {
            str = StringsKt.isBlank(str4) ? null : str4;
        }
        str = c5731um.h;
        C5861zm c5861zm = new C5861zm(c5731um.b);
        String str5 = c5731um.i;
        c5861zm.o = this.a.i.currentTimeSeconds();
        c5861zm.a = e().d;
        c5861zm.c = c5731um.d;
        c5861zm.f = c5731um.c;
        c5861zm.g = c5679sm.e;
        c5861zm.b = c5731um.e;
        c5861zm.d = c5731um.f;
        c5861zm.e = c5731um.g;
        c5861zm.h = c5731um.n;
        c5861zm.i = c5731um.o;
        c5861zm.j = str2;
        c5861zm.k = a;
        this.a.k.getClass();
        HashMap a2 = Wm.a(str2);
        if (Do.a(map)) {
            equals = Do.a((Map) a2);
        } else {
            equals = a2.equals(map);
        }
        c5861zm.q = equals;
        c5861zm.l = Wm.a(map);
        c5861zm.r = c5731um.m;
        c5861zm.n = c5731um.k;
        c5861zm.s = c5731um.p;
        c5861zm.p = true;
        c5861zm.t = j;
        C5679sm d = d();
        if (d.n == 0) {
            d.n = j;
        }
        c5861zm.u = d.n;
        c5861zm.v = false;
        c5861zm.w = c5731um.q;
        c5861zm.x = c5731um.r;
        c5861zm.y = c5731um.s;
        c5861zm.z = c5731um.t;
        c5861zm.A = c5731um.u;
        c5861zm.B = c5731um.v;
        return new C5783wm(str, str5, new Am(c5861zm));
    }

    public final void a(C5783wm c5783wm) {
        ArrayList arrayList;
        Sm sm = this.a;
        Wl wl = sm.d;
        String str = sm.b;
        synchronized (wl.a.b) {
            try {
                Yl yl = wl.a;
                yl.c = c5783wm;
                Collection collection = (Collection) yl.a.a.get(str);
                if (collection == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(collection);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC5394hm) it.next()).a(c5783wm);
        }
    }

    public final void a(@NotNull EnumC5213am enumC5213am) {
        ArrayList arrayList;
        this.c = null;
        Sm sm = this.a;
        Wl wl = sm.d;
        String str = sm.f.a;
        C5783wm e = e();
        synchronized (wl.a.b) {
            try {
                Collection collection = (Collection) wl.a.a.a.get(str);
                if (collection == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(collection);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC5394hm) it.next()).a(enumC5213am, e);
        }
    }

    public final void a(@NotNull C5628qm c5628qm) {
        this.a.l.a(c5628qm);
        C5679sm d = d();
        if (d.k) {
            List list = d.j;
            if (list != null && !list.isEmpty()) {
                if (Do.a(list, d.e)) {
                    return;
                }
                C5783wm e = e();
                Am am = e.c;
                C5861zm a = am.a(am.m);
                String str = e.a;
                String str2 = e.b;
                a.g = list;
                C5783wm c5783wm = new C5783wm(str, str2, new Am(a));
                b(c5783wm);
                a(c5783wm);
                return;
            }
            if (d.e == null || !(!r5.isEmpty())) {
                return;
            }
            C5783wm e2 = e();
            Am am2 = e2.c;
            C5861zm a2 = am2.a(am2.m);
            String str3 = e2.a;
            String str4 = e2.b;
            a2.g = null;
            C5783wm c5783wm2 = new C5783wm(str3, str4, new Am(a2));
            b(c5783wm2);
            a(c5783wm2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(@NotNull C5731um c5731um, @NotNull C5679sm c5679sm, @Nullable Map<String, ? extends List<String>> map) {
        Long l;
        if (!Do.a((Map) map)) {
            List list = (List) CollectionUtils.getFromMapIgnoreCase(map, "Date");
            if (!Do.a((Collection) list)) {
                try {
                    l = Long.valueOf(new SimpleDateFormat("E, d MMM yyyy HH:mm:ss z", Locale.US).parse((String) list.get(0)).getTime());
                } catch (Throwable unused) {
                }
                long longValue = l == null ? l.longValue() : 0L;
                AbstractC5547nk.a.a(longValue, c5731um.l);
                C5783wm a = a(c5731um, c5679sm, longValue);
                this.c = null;
                b(a);
                a(a);
            }
        }
        l = null;
        if (l == null) {
        }
        AbstractC5547nk.a.a(longValue, c5731um.l);
        C5783wm a2 = a(c5731um, c5679sm, longValue);
        this.c = null;
        b(a2);
        a(a2);
    }
}

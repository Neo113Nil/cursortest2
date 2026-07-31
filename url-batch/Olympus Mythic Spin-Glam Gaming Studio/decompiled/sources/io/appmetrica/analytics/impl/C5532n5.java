package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4538a2;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.n5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C5532n5 implements InterfaceC5460kb, InterfaceC5280db, InterfaceC5778wh {
    public final Context a;
    public final C5351g5 b;
    public final C5621qf c;
    public final C5698tf d;
    public final C5250c7 e;
    public final Gi f;
    public final C5640r9 g;
    public final C5475l0 h;
    public final C5501m0 i;
    public final C5470kl j;
    public final Zg k;
    public final C5355g9 l;
    public final PublicLogger m;
    public final E9 n;
    public final C5403i5 o;
    public final K9 p;
    public final D3 q;
    public final TimePassedChecker r;
    public final Nf s;
    public final Po t;
    public final C5238bl u;
    public final C2 v;

    public C5532n5(@NonNull Context context, @NonNull C5783wm c5783wm, @NonNull C5351g5 c5351g5, @NonNull F4 f4, @NonNull InterfaceC5726uh interfaceC5726uh, @NonNull AbstractC5480l5 abstractC5480l5) {
        this(context, c5351g5, new C5501m0(), new TimePassedChecker(), new C5662s5(context, c5351g5, f4, abstractC5480l5, c5783wm, interfaceC5726uh, Ka.k().w().d(), PackageManagerUtils.getAppVersionCodeInt(context), Ka.k().l(), new C5325f5()), f4);
    }

    public final boolean A() {
        C5804xh c5804xh = (C5804xh) this.k.a();
        return c5804xh.n && this.r.didTimePassSeconds(this.n.k, c5804xh.t, "should force send permissions");
    }

    public final boolean B() {
        C5783wm c5783wm;
        Nf nf = this.s;
        nf.h.a(nf.a);
        boolean z = ((Kf) nf.c()).d;
        Zg zg = this.k;
        synchronized (zg) {
            c5783wm = zg.c.a;
        }
        return !(z && c5783wm.q);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5460kb, io.appmetrica.analytics.impl.InterfaceC5394hm
    public final void a(@NonNull EnumC5213am enumC5213am, @Nullable C5783wm c5783wm) {
    }

    public final void b(C5326f6 c5326f6) {
        this.h.a(c5326f6.f);
        C5449k0 a = this.h.a();
        C5501m0 c5501m0 = this.i;
        C5621qf c5621qf = this.c;
        synchronized (c5501m0) {
            if (a.b > c5621qf.d().b) {
                c5621qf.a(a);
                this.m.info("Save new app environment for %s. Value: %s", this.b, a.a);
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5280db
    public final void c() {
        Qo qo = this.t.a;
        Qo.a(qo.a);
        Qo.a(qo.b);
        this.e.j.b.flushAsync();
    }

    public final void d() {
        C5475l0 c5475l0 = this.h;
        synchronized (c5475l0) {
            c5475l0.a = new C5204ad();
        }
        this.i.a(this.h.a(), this.c);
    }

    public final synchronized void e() {
        ((A5) this.p).d();
    }

    @NonNull
    public final C2 f() {
        return this.v;
    }

    @NonNull
    public final D3 g() {
        return this.q;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5280db
    @NonNull
    public final Context getContext() {
        return this.a;
    }

    @NonNull
    public final C5621qf h() {
        return this.c;
    }

    @NonNull
    public final C5250c7 i() {
        return this.e;
    }

    @NonNull
    public final C5355g9 j() {
        return this.l;
    }

    @NonNull
    public final C5640r9 k() {
        return this.g;
    }

    @NonNull
    public final E9 l() {
        return this.n;
    }

    @NonNull
    public final K9 m() {
        return this.p;
    }

    @NonNull
    public final C5804xh n() {
        return (C5804xh) this.k.a();
    }

    @Nullable
    public final String o() {
        return this.c.j();
    }

    @NonNull
    public final PublicLogger p() {
        return this.m;
    }

    @NonNull
    public final C5698tf q() {
        return this.d;
    }

    @NonNull
    public final C5238bl r() {
        return this.u;
    }

    @NonNull
    public final C5470kl s() {
        return this.j;
    }

    @NonNull
    public final C5783wm t() {
        C5783wm c5783wm;
        Zg zg = this.k;
        synchronized (zg) {
            c5783wm = zg.c.a;
        }
        return c5783wm;
    }

    @NonNull
    public final Po u() {
        return this.t;
    }

    public final void v() {
        E9 e9 = this.n;
        int i = e9.j;
        e9.l = i;
        e9.a.a(i);
    }

    public final void w() {
        int optInt;
        int libraryApiLevel = AppMetrica.getLibraryApiLevel();
        Po po = this.t;
        synchronized (po) {
            optInt = po.a.a().optInt("last_migration_api_level", 0);
        }
        if (optInt < libraryApiLevel) {
            this.o.getClass();
            Iterator it = CollectionsKt.listOf(new C5454k5(this)).iterator();
            while (it.hasNext()) {
                ((AbstractC5428j5) it.next()).a(optInt);
            }
            this.t.b(libraryApiLevel);
        }
    }

    public final boolean x() {
        C5804xh c5804xh = (C5804xh) this.k.a();
        return c5804xh.n && c5804xh.isIdentifiersValid() && this.r.didTimePassSeconds(this.n.k, c5804xh.s, "need to check permissions");
    }

    public final boolean y() {
        E9 e9 = this.n;
        return e9.l < e9.j && ((C5804xh) this.k.a()).o && ((C5804xh) this.k.a()).isIdentifiersValid();
    }

    public final void z() {
        Zg zg = this.k;
        synchronized (zg) {
            zg.a = null;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5460kb
    public final void a(@NonNull C5326f6 c5326f6) {
        String a = AbstractC5491lg.a("Event received on service", EnumC5798xb.a(c5326f6.d), c5326f6.getName(), c5326f6.getValue());
        if (a != null) {
            this.m.info(a, new Object[0]);
        }
        String str = this.b.b;
        if (TextUtils.isEmpty(str) || C4538a2.f.equals(str)) {
            return;
        }
        this.f.a(c5326f6, new Fi());
    }

    @NonNull
    public CounterConfigurationReporterType b() {
        return CounterConfigurationReporterType.MANUAL;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5460kb, io.appmetrica.analytics.impl.InterfaceC5280db
    public synchronized void a(@NonNull F4 f4) {
        long j;
        try {
            this.k.a(f4);
            boolean z = false;
            if (Boolean.TRUE.equals(f4.h)) {
                this.m.setEnabled(true);
            } else {
                if (Boolean.FALSE.equals(f4.h)) {
                    this.m.setEnabled(false);
                }
            }
            C2 c2 = this.v;
            Set<String> set = f4.o;
            long currentTimeMillis = c2.d.currentTimeMillis();
            boolean z2 = false;
            for (String str : set) {
                Long l = (Long) c2.e.get(str);
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = -1;
                    z2 = true;
                }
                if (currentTimeMillis - j > c2.b) {
                    c2.e.put(str, Long.valueOf(currentTimeMillis));
                    z = true;
                }
            }
            if (z) {
                c2.a(c2.e);
                c2.a.a(c2.e);
            }
            if (z2) {
                this.k.e();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C5532n5(Context context, C5351g5 c5351g5, C5501m0 c5501m0, TimePassedChecker timePassedChecker, C5662s5 c5662s5, F4 f4) {
        this.a = context.getApplicationContext();
        this.b = c5351g5;
        this.i = c5501m0;
        this.r = timePassedChecker;
        Po f = c5662s5.f();
        this.t = f;
        this.s = Ka.k().t();
        C5621qf a = c5662s5.e().a();
        this.c = a;
        this.v = c5662s5.a(a);
        Zg a2 = c5662s5.a(this);
        this.k = a2;
        PublicLogger a3 = c5662s5.d().a();
        this.m = a3;
        this.d = Ka.k().y();
        C5475l0 a4 = c5501m0.a(c5351g5, a3, a);
        this.h = a4;
        this.l = c5662s5.a();
        C5250c7 b = c5662s5.b(this);
        this.e = b;
        Ii d = c5662s5.d(this);
        this.o = C5662s5.b();
        w();
        C5470kl a5 = C5662s5.a(this, f, new C5506m5(this));
        this.j = a5;
        a3.info("Read app environment for component %s. Value: %s", c5351g5.toString(), a4.a().a);
        C5238bl c = c5662s5.c();
        this.u = c;
        this.n = c5662s5.a(a, f, a5, b, a4, c, d);
        C5640r9 c2 = C5662s5.c(this);
        this.g = c2;
        this.f = C5662s5.a(this, c2);
        this.q = c5662s5.b(a);
        this.p = c5662s5.a(d, b, a2, f4, c5351g5, a);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5280db
    @NonNull
    public final C5351g5 a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5460kb, io.appmetrica.analytics.impl.InterfaceC5394hm
    public final synchronized void a(@NonNull C5783wm c5783wm) {
        this.k.a(c5783wm);
        ((A5) this.p).e();
    }

    public final void a(@Nullable String str) {
        this.c.j(str).a.flushAsync();
    }
}

package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.ReferenceHolder;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes11.dex */
public final class Ka {
    public static volatile Ka I;
    public volatile C5382ha C;
    public Pk H;
    public final Context a;
    public volatile C5855zg b;
    public volatile W6 c;
    public volatile C5297e3 e;
    public volatile Bj f;
    public volatile W g;
    public volatile C5529n2 h;
    public volatile PlatformIdentifiers i;
    public volatile Nf j;
    public volatile Q3 k;
    public volatile C5698tf l;
    public volatile So m;
    public volatile C5728uj n;
    public volatile C5229bc o;
    public Rl p;
    public volatile Ok r;
    public volatile InterfaceC5358gc w;
    public volatile En x;
    public volatile Nl y;
    public volatile Pd z;
    public final Ja q = new Ja();
    public final C5514md s = new C5514md();
    public final C5566od t = new C5566od();
    public final C5835ym u = new C5835ym();
    public final C5755vk v = new C5755vk();
    public final C5412ie A = new C5412ie();
    public final UtilityServiceProvider B = new UtilityServiceProvider();
    public final Dk D = new Dk();
    public final ReferenceHolder E = new ReferenceHolder();
    public final Nk F = new Nk();
    public final C5422j G = new C5422j();
    public final Bk d = new Bk();

    public Ka(Context context) {
        this.a = context;
    }

    public static void a(Context context) {
        if (I == null) {
            synchronized (Ka.class) {
                try {
                    if (I == null) {
                        I = new Ka(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
    }

    public static Ka k() {
        return I;
    }

    public final C5835ym A() {
        return this.u;
    }

    public final Pk B() {
        File file;
        Pk pk = this.H;
        if (pk == null) {
            synchronized (this) {
                pk = this.H;
                if (pk == null) {
                    Context context = this.a;
                    String readSystemProperty = SystemPropertiesHelper.readSystemProperty("ro.yndx.metrica.db.dir");
                    String readSystemProperty2 = SystemPropertiesHelper.readSystemProperty("debug.yndx.iaa.db.dir");
                    if (StringsKt.isBlank(readSystemProperty)) {
                        readSystemProperty = readSystemProperty2;
                    }
                    if (!StringsKt.isBlank(readSystemProperty)) {
                        file = new File(readSystemProperty, context.getPackageName());
                        try {
                            file.mkdirs();
                        } catch (Exception unused) {
                        }
                        pk = new Pk(file);
                        this.H = pk;
                    }
                    file = null;
                    pk = new Pk(file);
                    this.H = pk;
                }
            }
        }
        return pk;
    }

    public final En C() {
        En en = this.x;
        if (en == null) {
            synchronized (this) {
                try {
                    en = this.x;
                    if (en == null) {
                        en = new En(this.a);
                        this.x = en;
                    }
                } finally {
                }
            }
        }
        return en;
    }

    public final synchronized So D() {
        try {
            if (this.m == null) {
                this.m = new So(this.a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.m;
    }

    public final void E() {
        if (this.j == null) {
            synchronized (this) {
                try {
                    if (this.j == null) {
                        InterfaceC5395hn a = C5369gn.a(C5802xf.class);
                        Context context = this.a;
                        AbstractC5420in abstractC5420in = (AbstractC5420in) a;
                        ProtobufStateStorage<Object> a2 = abstractC5420in.a(context, abstractC5420in.a(context));
                        C5802xf c5802xf = (C5802xf) a2.read();
                        this.j = new Nf(this.a, a2, new Ef(), new C5750vf(c5802xf), new Mf(), new Df(this.a), new If(k().y()), new C5828yf(), c5802xf, "[PreloadInfoStorage]");
                    }
                } finally {
                }
            }
        }
    }

    public final C5422j b() {
        return this.G;
    }

    public final W c() {
        W w = this.g;
        if (w == null) {
            synchronized (this) {
                try {
                    w = this.g;
                    if (w == null) {
                        w = new W(this.a, this.d.g(), this.u.a());
                        this.u.a(w);
                        this.g = w;
                    }
                } finally {
                }
            }
        }
        return w;
    }

    public final C5529n2 d() {
        C5529n2 c5529n2 = this.h;
        if (c5529n2 == null) {
            synchronized (this) {
                try {
                    c5529n2 = this.h;
                    if (c5529n2 == null) {
                        c5529n2 = new C5529n2(this.a, AbstractC5555o2.a());
                        this.h = c5529n2;
                    }
                } finally {
                }
            }
        }
        return c5529n2;
    }

    public final C5685t2 e() {
        return l().b;
    }

    public final Q3 f() {
        if (this.k == null) {
            synchronized (this) {
                try {
                    if (this.k == null) {
                        InterfaceC5395hn a = C5369gn.a(J3.class);
                        Context context = this.a;
                        AbstractC5420in abstractC5420in = (AbstractC5420in) a;
                        ProtobufStateStorage<Object> a2 = abstractC5420in.a(context, abstractC5420in.a(context));
                        this.k = new Q3(this.a, a2, new R3(), new E3(), new U3(), new C5442jj(this.a), new S3(y()), new F3(), (J3) a2.read(), "[ClidsInfoStorage]");
                    }
                } finally {
                }
            }
        }
        return this.k;
    }

    public final Context g() {
        return this.a;
    }

    public final W6 h() {
        if (this.c == null) {
            synchronized (this) {
                try {
                    if (this.c == null) {
                        this.c = new W6(new V6(y()));
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final C5382ha i() {
        C5382ha c5382ha = this.C;
        if (c5382ha == null) {
            synchronized (this) {
                try {
                    c5382ha = this.C;
                    if (c5382ha == null) {
                        c5382ha = new C5382ha(this.a);
                        this.C = c5382ha;
                    }
                } finally {
                }
            }
        }
        return c5382ha;
    }

    public final PermissionExtractor j() {
        Nl nl = this.y;
        if (nl != null) {
            return nl;
        }
        synchronized (this) {
            try {
                Nl nl2 = this.y;
                if (nl2 != null) {
                    return nl2;
                }
                Nl nl3 = new Nl(p().c.getAskForPermissionStrategy());
                this.y = nl3;
                return nl3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C5229bc l() {
        C5229bc c5229bc = this.o;
        if (c5229bc == null) {
            synchronized (this) {
                try {
                    c5229bc = this.o;
                    if (c5229bc == null) {
                        c5229bc = new C5229bc(new C5220b3(this.a, this.d.a()), new C5685t2());
                        this.o = c5229bc;
                    }
                } finally {
                }
            }
        }
        return c5229bc;
    }

    public final InterfaceC5358gc m() {
        InterfaceC5358gc interfaceC5358gc = this.w;
        if (interfaceC5358gc == null) {
            synchronized (this) {
                try {
                    interfaceC5358gc = this.w;
                    if (interfaceC5358gc == null) {
                        Context context = this.a;
                        LocationClient locationClient = (LocationClient) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.location.internal.LocationClientImpl", LocationClient.class);
                        interfaceC5358gc = locationClient == null ? new C5410ic() : new C5384hc(context, new C5565oc(), locationClient);
                        this.w = interfaceC5358gc;
                    }
                } finally {
                }
            }
        }
        return interfaceC5358gc;
    }

    public final InterfaceC5358gc n() {
        return m();
    }

    public final C5566od o() {
        return this.t;
    }

    public final Ok p() {
        Ok ok = this.r;
        if (ok == null) {
            synchronized (this) {
                try {
                    ok = this.r;
                    if (ok == null) {
                        ok = new Ok();
                        this.r = ok;
                    }
                } finally {
                }
            }
        }
        return ok;
    }

    public final Pd q() {
        Pd pd = this.z;
        if (pd == null) {
            synchronized (this) {
                try {
                    pd = this.z;
                    if (pd == null) {
                        pd = new Pd(this.a, new Fo());
                        this.z = pd;
                    }
                } finally {
                }
            }
        }
        return pd;
    }

    public final C5412ie r() {
        return this.A;
    }

    public final PlatformIdentifiers s() {
        PlatformIdentifiers platformIdentifiers = this.i;
        if (platformIdentifiers == null) {
            synchronized (this) {
                try {
                    platformIdentifiers = this.i;
                    if (platformIdentifiers == null) {
                        platformIdentifiers = new PlatformIdentifiers(c(), d());
                        this.i = platformIdentifiers;
                    }
                } finally {
                }
            }
        }
        return platformIdentifiers;
    }

    public final Nf t() {
        E();
        return this.j;
    }

    public final C5855zg u() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        Context context = this.a;
                        SafePackageManager safePackageManager = new SafePackageManager();
                        Ka ka = I;
                        IHandlerExecutor g = ka.d.g();
                        Oo oo = ka.D().c;
                        String installerPackageName = safePackageManager.getInstallerPackageName(context, context.getPackageName());
                        this.b = new C5855zg(new T9(new C5339fj(new C5790x3(Intrinsics.areEqual(installerPackageName, "com.android.vending") ? new Na(context, g) : Intrinsics.areEqual(installerPackageName, "com.huawei.appmarket") ? new Ya(context) : new C5827ye(installerPackageName), new Uo(oo))), g));
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    public final C5728uj v() {
        C5728uj c5728uj = this.n;
        if (c5728uj == null) {
            synchronized (this) {
                try {
                    c5728uj = this.n;
                    if (c5728uj == null) {
                        c5728uj = new C5728uj(this.a);
                        this.n = c5728uj;
                    }
                } finally {
                }
            }
        }
        return c5728uj;
    }

    public final Bk w() {
        return this.d;
    }

    public final Nk x() {
        return this.F;
    }

    public final C5698tf y() {
        if (this.l == null) {
            synchronized (this) {
                try {
                    if (this.l == null) {
                        this.l = new C5698tf(B().d(this.a));
                    }
                } finally {
                }
            }
        }
        return this.l;
    }

    public final synchronized X2 z() {
        try {
            if (this.p == null) {
                Rl rl = new Rl(this.a);
                this.p = rl;
                this.u.a(rl);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.p;
    }

    public final WaitForActivationDelayBarrier a() {
        return this.B.getActivationBarrier();
    }
}

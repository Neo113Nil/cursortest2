package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: o.cn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0862cn implements InterfaceC1402l00 {
    public static long y = 1;
    public static final HashMap z = new HashMap();
    public final FlutterJNI a;
    public final io.flutter.embedding.engine.renderer.e b;
    public final C1183hf c;
    public final C0928dn d;
    public final LA e;
    public final C0950e6 f;
    public final C0158Fz g;
    public final C1590ns h;
    public final P7 i;
    public final P7 j;
    public final Q4 k;
    public final C0208Hx l;
    public final C1818rJ m;
    public final C1818rJ n;

    /* renamed from: o, reason: collision with root package name */
    public final ZQ f153o;
    public final C1818rJ p;
    public final C0104Dx q;
    public final C0208Hx r;
    public final DI s;
    public final CI t;
    public final C0208Hx u;
    public final long w;
    public final HashSet v = new HashSet();
    public final C0731an x = new C0731an(this);

    public C0862cn(Context context, FlutterJNI flutterJNI, DI di, boolean z2, boolean z3) {
        AssetManager assets;
        long j = y;
        y = 1 + j;
        this.w = j;
        z.put(Long.valueOf(j), this);
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        C0950e6 D = C0950e6.D();
        if (flutterJNI == null) {
            Object obj = D.j;
            flutterJNI = new FlutterJNI();
        }
        this.a = flutterJNI;
        C1183hf c1183hf = new C1183hf(flutterJNI, assets, this.w);
        this.c = c1183hf;
        flutterJNI.setPlatformMessageHandler((C1577nf) c1183hf.l);
        C0950e6.D().getClass();
        this.f = new C0950e6(c1183hf, flutterJNI);
        new C1097gL(c1183hf, 28);
        this.g = new C0158Fz(c1183hf);
        C0208Hx c0208Hx = new C0208Hx(c1183hf, 1);
        this.h = new C1590ns(c1183hf, 14);
        this.i = new P7(c1183hf, 1);
        this.j = new P7(c1183hf, 0);
        this.l = new C0208Hx(c1183hf, 15);
        C0208Hx c0208Hx2 = new C0208Hx(c1183hf, context.getPackageManager());
        C0950e6 c0950e6 = new C0950e6(c1183hf, "flutter/restoration", C1367kT.h, 16);
        Q4 q4 = new Q4();
        q4.d = false;
        q4.e = false;
        C1818rJ c1818rJ = new C1818rJ(4, q4);
        q4.a = c0950e6;
        q4.c = z3;
        c0950e6.Q(c1818rJ);
        this.k = q4;
        this.m = new C1818rJ(c1183hf, 11);
        this.n = new C1818rJ(c1183hf, 13);
        ZQ zq = new ZQ(c1183hf);
        this.f153o = zq;
        this.p = new C1818rJ(c1183hf, 17);
        this.q = new C0104Dx(c1183hf);
        this.r = new C0208Hx(c1183hf, 26);
        LA la = new LA(context, c0208Hx);
        this.e = la;
        C1717pn c1717pn = (C1717pn) D.i;
        if (!flutterJNI.isAttached()) {
            c1717pn.c(context.getApplicationContext());
            c1717pn.a(context, null);
        }
        CI ci = new CI();
        ci.h = di.h;
        ci.k = flutterJNI;
        di.k = flutterJNI;
        flutterJNI.addEngineLifecycleListener(this.x);
        flutterJNI.setPlatformViewsController(di);
        flutterJNI.setPlatformViewsController2(ci);
        flutterJNI.setLocalizationPlugin(la);
        D.getClass();
        flutterJNI.setDeferredComponentManager(null);
        flutterJNI.setSettingsChannel(zq);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.b = new io.flutter.embedding.engine.renderer.e(flutterJNI);
        this.s = di;
        this.t = ci;
        C0208Hx c0208Hx3 = new C0208Hx(16);
        c0208Hx3.i = di;
        c0208Hx3.j = ci;
        this.u = c0208Hx3;
        context.getApplicationContext();
        C0928dn c0928dn = new C0928dn(this);
        this.d = c0928dn;
        la.b(context.getResources().getConfiguration());
        if (z2 && c1717pn.d.a) {
            AbstractC1807r8.S(this);
        }
        AbstractC2219xO.e(context, this);
        C1950tJ c1950tJ = new C1950tJ(c0208Hx2);
        HashMap hashMap = (HashMap) c0928dn.b;
        AbstractC1568nW.c("FlutterEngineConnectionRegistry#add ".concat(C1950tJ.class.getSimpleName()));
        try {
            if (hashMap.containsKey(C1950tJ.class)) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + c1950tJ + ") but it was already registered with this FlutterEngine (" + ((C0862cn) c0928dn.d) + ").");
            } else {
                hashMap.put(C1950tJ.class, c1950tJ);
                ((HashMap) c0928dn.c).put(C1950tJ.class, c1950tJ);
                if (c0928dn.e()) {
                    C1343k5 c1343k5 = (C1343k5) c0928dn.f;
                    c1950tJ.b = c1343k5;
                    ((HashSet) c1343k5.j).add(c1950tJ);
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

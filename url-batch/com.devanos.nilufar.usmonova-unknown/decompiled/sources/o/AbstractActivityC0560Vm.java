package o;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.provider.Settings;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.view.textservice.TextServicesManager;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: o.Vm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0560Vm extends Activity implements InterfaceC0638Ym, InterfaceC0365Nz {
    public static final int l = View.generateViewId();
    public boolean h = false;
    public C0664Zm i;
    public final C0417Pz j;
    public final OnBackInvokedCallback k;

    public AbstractActivityC0560Vm() {
        int i = Build.VERSION.SDK_INT;
        this.k = i < 33 ? null : i >= 34 ? new C0534Um(this) : new C0753b5(1, this);
        this.j = new C0417Pz(this);
    }

    public final String a() {
        String dataString;
        if ((getApplicationInfo().flags & 2) == 0 || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    public final int b() {
        if (!getIntent().hasExtra("background_mode")) {
            return 1;
        }
        String stringExtra = getIntent().getStringExtra("background_mode");
        if (stringExtra == null) {
            throw new NullPointerException("Name is null");
        }
        if (stringExtra.equals("opaque")) {
            return 1;
        }
        if (stringExtra.equals("transparent")) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.".concat(stringExtra));
    }

    public final String c() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public final String d() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle f = f();
            String string = f != null ? f.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    public final String e() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle f = f();
            if (f != null) {
                return f.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final Bundle f() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public final void g(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedDispatcher onBackInvokedDispatcher2;
        if (z && !this.h) {
            if (Build.VERSION.SDK_INT >= 33) {
                onBackInvokedDispatcher2 = getOnBackInvokedDispatcher();
                onBackInvokedDispatcher2.registerOnBackInvokedCallback(0, this.k);
                this.h = true;
                return;
            }
            return;
        }
        if (z || !this.h || Build.VERSION.SDK_INT < 33) {
            return;
        }
        onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.k);
        this.h = false;
    }

    @Override // o.InterfaceC0365Nz
    public final AbstractC0106Dz getLifecycle() {
        return this.j;
    }

    public final boolean h() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (c() != null || this.i.g) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    public final boolean i() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : c() == null;
    }

    public final boolean j(String str) {
        C0664Zm c0664Zm = this.i;
        if (c0664Zm == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (c0664Zm.j) {
            return true;
        }
        Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (j("onActivityResult")) {
            C0664Zm c0664Zm = this.i;
            c0664Zm.c();
            if (c0664Zm.b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Objects.toString(intent);
            C0928dn c0928dn = c0664Zm.b.d;
            if (!c0928dn.e()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
                return;
            }
            AbstractC1568nW.c("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                ((C1343k5) c0928dn.f).B(i, i2, intent);
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

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (j("onBackPressed")) {
            C0664Zm c0664Zm = this.i;
            c0664Zm.c();
            C0862cn c0862cn = c0664Zm.b;
            if (c0862cn != null) {
                c0862cn.i.a.E("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(36:117|118|(1:120)|121|122|(1:124)|125|(1:127)(1:256)|128|(2:130|(1:132)(2:133|(1:135)(1:136)))|137|(4:139|140|141|(1:143)(2:241|(1:243)(2:244|245)))(1:255)|144|(1:146)|147|(1:149)|(1:151)(1:240)|152|(3:154|(1:156)(1:234)|157)(3:235|(1:237)(1:239)|238)|158|(8:160|(1:162)|163|(2:165|(3:167|(1:169)|170)(2:171|172))|173|(1:175)|176|177)|178|(1:180)|181|182|183|184|(2:(1:230)(1:188)|189)(1:231)|190|(2:193|191)|194|195|(3:198|(1:200)(3:201|202|203)|196)|204|205|(5:207|(3:210|(1:212)(3:213|214|215)|208)|216|217|(2:219|(8:221|(1:223)|163|(0)|173|(0)|176|177)(2:224|225))(2:226|227))(2:228|229)) */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x046f, code lost:
    
        android.util.Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x05f1  */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.view.View, o.oN] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        byte[] bArr;
        int i;
        try {
            Bundle f = f();
            if (f != null && (i = f.getInt("io.flutter.embedding.android.NormalTheme", -1)) != -1) {
                setTheme(i);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
        super.onCreate(bundle);
        if (bundle != null) {
            g(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        C0664Zm c0664Zm = new C0664Zm(this);
        this.i = c0664Zm;
        c0664Zm.c();
        if (c0664Zm.b == null) {
            String c = c0664Zm.a.c();
            if (c != null) {
                if (C1125gn.c == null) {
                    C1125gn.c = new C1125gn(1);
                }
                C0862cn c0862cn = (C0862cn) C1125gn.c.a.get(c);
                c0664Zm.b = c0862cn;
                c0664Zm.g = true;
                if (c0862cn == null) {
                    throw new IllegalStateException(AbstractC1888sN.k("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '", c, "'"));
                }
            } else {
                c0664Zm.a.getClass();
                c0664Zm.b = null;
                String stringExtra = c0664Zm.a.getIntent().getStringExtra("cached_engine_group_id");
                if (stringExtra != null) {
                    if (C1125gn.b == null) {
                        synchronized (C1125gn.class) {
                            try {
                                if (C1125gn.b == null) {
                                    C1125gn.b = new C1125gn(0);
                                }
                            } finally {
                            }
                        }
                    }
                    C1059fn c1059fn = (C1059fn) C1125gn.b.a.get(stringExtra);
                    if (c1059fn == null) {
                        throw new IllegalStateException(AbstractC1888sN.k("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '", stringExtra, "'"));
                    }
                    AbstractActivityC0560Vm abstractActivityC0560Vm = c0664Zm.a;
                    abstractActivityC0560Vm.getClass();
                    C0584Wk c0584Wk = new C0584Wk(abstractActivityC0560Vm);
                    c0664Zm.a(c0584Wk);
                    c0664Zm.b = c1059fn.a(c0584Wk);
                    c0664Zm.g = false;
                } else {
                    AbstractActivityC0560Vm abstractActivityC0560Vm2 = c0664Zm.a;
                    abstractActivityC0560Vm2.getClass();
                    Intent intent = c0664Zm.a.getIntent();
                    ArrayList arrayList = new ArrayList();
                    if (intent.getBooleanExtra("trace-startup", false)) {
                        arrayList.add("--trace-startup");
                    }
                    if (intent.getBooleanExtra("start-paused", false)) {
                        arrayList.add("--start-paused");
                    }
                    int intExtra = intent.getIntExtra("vm-service-port", 0);
                    if (intExtra > 0) {
                        arrayList.add("--vm-service-port=" + Integer.toString(intExtra));
                    }
                    if (intent.getBooleanExtra("disable-service-auth-codes", false)) {
                        arrayList.add("--disable-service-auth-codes");
                    }
                    if (intent.getBooleanExtra("endless-trace-buffer", false)) {
                        arrayList.add("--endless-trace-buffer");
                    }
                    if (intent.getBooleanExtra("use-test-fonts", false)) {
                        arrayList.add("--use-test-fonts");
                    }
                    if (intent.getBooleanExtra("enable-dart-profiling", false)) {
                        arrayList.add("--enable-dart-profiling");
                    }
                    if (intent.getBooleanExtra("profile-startup", false)) {
                        arrayList.add("--profile-startup");
                    }
                    if (intent.getBooleanExtra("enable-software-rendering", false)) {
                        arrayList.add("--enable-software-rendering");
                    }
                    if (intent.getBooleanExtra("skia-deterministic-rendering", false)) {
                        arrayList.add("--skia-deterministic-rendering");
                    }
                    if (intent.getBooleanExtra("trace-skia", false)) {
                        arrayList.add("--trace-skia");
                    }
                    String stringExtra2 = intent.getStringExtra("trace-skia-allowlist");
                    if (stringExtra2 != null) {
                        arrayList.add("--trace-skia-allowlist=".concat(stringExtra2));
                    }
                    if (intent.getBooleanExtra("trace-systrace", false)) {
                        arrayList.add("--trace-systrace");
                    }
                    if (intent.hasExtra("trace-to-file")) {
                        arrayList.add("--trace-to-file=" + intent.getStringExtra("trace-to-file"));
                    }
                    if (intent.hasExtra("profile-microtasks")) {
                        arrayList.add("--profile-microtasks");
                    }
                    if (intent.hasExtra("enable-impeller")) {
                        if (intent.getBooleanExtra("enable-impeller", false)) {
                            arrayList.add("--enable-impeller=true");
                        } else {
                            arrayList.add("--enable-impeller=false");
                        }
                    }
                    if (intent.getBooleanExtra("enable-vulkan-validation", false)) {
                        arrayList.add("--enable-vulkan-validation");
                    }
                    if (intent.getBooleanExtra("dump-skp-on-shader-compilation", false)) {
                        arrayList.add("--dump-skp-on-shader-compilation");
                    }
                    if (intent.getBooleanExtra("cache-sksl", false)) {
                        arrayList.add("--cache-sksl");
                    }
                    if (intent.getBooleanExtra("purge-persistent-cache", false)) {
                        arrayList.add("--purge-persistent-cache");
                    }
                    if (intent.getBooleanExtra("verbose-logging", false)) {
                        arrayList.add("--verbose-logging");
                    }
                    if (intent.hasExtra("dart-flags")) {
                        arrayList.add("--dart-flags=" + intent.getStringExtra("dart-flags"));
                    }
                    HashSet hashSet = new HashSet(arrayList);
                    C1059fn c1059fn2 = new C1059fn(abstractActivityC0560Vm2, (String[]) hashSet.toArray(new String[hashSet.size()]));
                    AbstractActivityC0560Vm abstractActivityC0560Vm3 = c0664Zm.a;
                    abstractActivityC0560Vm3.getClass();
                    C0584Wk c0584Wk2 = new C0584Wk(abstractActivityC0560Vm3);
                    c0584Wk2.a = false;
                    c0584Wk2.b = c0664Zm.a.i();
                    c0664Zm.a(c0584Wk2);
                    c0664Zm.b = c1059fn2.a(c0584Wk2);
                    c0664Zm.g = false;
                }
            }
        }
        c0664Zm.a.getClass();
        C0928dn c0928dn = c0664Zm.b.d;
        C0417Pz c0417Pz = c0664Zm.a.j;
        c0928dn.getClass();
        AbstractC1568nW.c("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            C0664Zm c0664Zm2 = (C0664Zm) c0928dn.e;
            if (c0664Zm2 != null) {
                c0664Zm2.b();
            }
            c0928dn.d();
            c0928dn.e = c0664Zm;
            AbstractActivityC0560Vm abstractActivityC0560Vm4 = c0664Zm.a;
            abstractActivityC0560Vm4.getClass();
            c0928dn.a(abstractActivityC0560Vm4, c0417Pz);
            Trace.endSection();
            AbstractActivityC0560Vm abstractActivityC0560Vm5 = c0664Zm.a;
            abstractActivityC0560Vm5.getClass();
            AbstractActivityC0560Vm abstractActivityC0560Vm6 = c0664Zm.a;
            C0862cn c0862cn2 = c0664Zm.b;
            abstractActivityC0560Vm6.getClass();
            c0664Zm.d = new C1333jz(abstractActivityC0560Vm6, c0862cn2.l, abstractActivityC0560Vm6);
            AbstractActivityC0560Vm abstractActivityC0560Vm7 = c0664Zm.a;
            C0862cn c0862cn3 = c0664Zm.b;
            abstractActivityC0560Vm7.getClass();
            int i2 = l;
            c0664Zm.e = new C1739q5(i2, abstractActivityC0560Vm5, c0862cn3.n);
            AbstractActivityC0560Vm abstractActivityC0560Vm8 = c0664Zm.a;
            C0862cn c0862cn4 = c0664Zm.b;
            if (!abstractActivityC0560Vm8.i.g) {
                AbstractC1807r8.S(c0862cn4);
            }
            c0664Zm.j = true;
            C0664Zm c0664Zm3 = this.i;
            c0664Zm3.c();
            if (bundle != null) {
                bundle.getBundle("plugins");
                bArr = bundle.getByteArray("framework");
            } else {
                bArr = null;
            }
            if (c0664Zm3.a.i()) {
                Q4 q4 = c0664Zm3.b.k;
                q4.d = true;
                NC nc = (NC) q4.b;
                if (nc != null) {
                    nc.d(Q4.d(bArr));
                    q4.b = null;
                    q4.f = bArr;
                } else if (q4.e) {
                    ((C0950e6) q4.a).E("push", Q4.d(bArr), new NC(q4, 1, bArr));
                } else {
                    q4.f = bArr;
                }
            }
            c0664Zm3.a.getClass();
            C0928dn c0928dn2 = c0664Zm3.b.d;
            if (c0928dn2.e()) {
                AbstractC1568nW.c("FlutterEngineConnectionRegistry#onRestoreInstanceState");
                try {
                    Iterator it = ((HashSet) ((C1343k5) c0928dn2.f).m).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    Trace.endSection();
                } finally {
                    try {
                        Trace.endSection();
                        throw th;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            }
            this.j.e(EnumC0054Bz.ON_CREATE);
            if (b() == 2) {
                getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            C0664Zm c0664Zm4 = this.i;
            boolean z = (b() == 1 ? (char) 1 : (char) 2) == 1;
            c0664Zm4.c();
            if (c0664Zm4.a.b() == 1) {
                AbstractActivityC0560Vm abstractActivityC0560Vm9 = c0664Zm4.a;
                abstractActivityC0560Vm9.getClass();
                C2046un c2046un = new C2046un(abstractActivityC0560Vm9, c0664Zm4.a.b() != 1);
                c0664Zm4.a.getClass();
                AbstractActivityC0560Vm abstractActivityC0560Vm10 = c0664Zm4.a;
                abstractActivityC0560Vm10.getClass();
                c0664Zm4.c = new C0068Cn(abstractActivityC0560Vm10, c2046un);
            } else {
                AbstractActivityC0560Vm abstractActivityC0560Vm11 = c0664Zm4.a;
                abstractActivityC0560Vm11.getClass();
                C2178wn c2178wn = new C2178wn(abstractActivityC0560Vm11);
                c2178wn.setOpaque(c0664Zm4.a.b() == 1);
                c0664Zm4.a.getClass();
                AbstractActivityC0560Vm abstractActivityC0560Vm12 = c0664Zm4.a;
                abstractActivityC0560Vm12.getClass();
                c0664Zm4.c = new C0068Cn(abstractActivityC0560Vm12, c2178wn);
            }
            c0664Zm4.c.f24o.add(c0664Zm4.l);
            c0664Zm4.a.getClass();
            C0068Cn c0068Cn = c0664Zm4.c;
            C0862cn c0862cn5 = c0664Zm4.b;
            C0586Wm c0586Wm = c0068Cn.F;
            Objects.toString(c0862cn5);
            if (c0068Cn.c()) {
                if (c0862cn5 != c0068Cn.q) {
                    c0068Cn.a();
                }
                c0664Zm4.c.setId(i2);
                if (z) {
                    C0068Cn c0068Cn2 = c0664Zm4.c;
                    if (c0664Zm4.a.b() != 1) {
                        throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
                    }
                    if (c0664Zm4.f != null) {
                        c0068Cn2.getViewTreeObserver().removeOnPreDrawListener(c0664Zm4.f);
                    }
                    c0664Zm4.f = new ViewTreeObserverOnPreDrawListenerC0612Xm(c0664Zm4, c0068Cn2);
                    c0068Cn2.getViewTreeObserver().addOnPreDrawListener(c0664Zm4.f);
                }
                setContentView(c0664Zm4.c);
                Window window = getWindow();
                window.addFlags(Integer.MIN_VALUE);
                if (Build.VERSION.SDK_INT < 35) {
                    window.setStatusBarColor(1073741824);
                }
                window.getDecorView().setSystemUiVisibility(1280);
            }
            c0068Cn.q = c0862cn5;
            io.flutter.embedding.engine.renderer.e eVar = c0862cn5.b;
            c0068Cn.p = eVar.c;
            c0068Cn.m.b(eVar);
            eVar.a(c0586Wm);
            if (c0068Cn.i) {
                eVar.a.addResizingFlutterUiListener(c0068Cn.E);
            }
            c0068Cn.s = new C0208Hx(c0068Cn, c0068Cn.q.h);
            C0862cn c0862cn6 = c0068Cn.q;
            c0068Cn.t = new io.flutter.plugin.editing.b(c0068Cn, c0862cn6.r, c0862cn6.m, c0862cn6.s, c0862cn6.t);
            TextServicesManager textServicesManager = (TextServicesManager) c0068Cn.getContext().getSystemService("textservices");
            c0068Cn.z = textServicesManager;
            c0068Cn.u = new ZS(textServicesManager, c0068Cn.q.p);
            new C0208Hx(c0068Cn, c0068Cn.t.b, c0068Cn.q.m);
            c0068Cn.v = c0068Cn.q.e;
            c0068Cn.w = new C0950e6(c0068Cn);
            c0068Cn.x = new J3(c0068Cn.q.b, false);
            io.flutter.view.b bVar = new io.flutter.view.b(c0068Cn, c0862cn5.f, (AccessibilityManager) c0068Cn.getContext().getSystemService("accessibility"), c0068Cn.getContext().getContentResolver(), c0862cn5.u);
            c0068Cn.y = bVar;
            bVar.r = c0068Cn.C;
            boolean isEnabled = bVar.c.isEnabled();
            boolean isTouchExplorationEnabled = c0068Cn.y.c.isTouchExplorationEnabled();
            if (c0068Cn.q.b.a.getIsSoftwareRenderingEnabled()) {
                c0068Cn.setWillNotDraw(false);
            } else {
                c0068Cn.setWillNotDraw((isEnabled || isTouchExplorationEnabled) ? false : true);
            }
            C0862cn c0862cn7 = c0068Cn.q;
            c0862cn7.s.f29o.a = c0068Cn.y;
            new J3(c0862cn7.b, true);
            C0862cn c0862cn8 = c0068Cn.q;
            c0862cn8.t.m.a = c0068Cn.y;
            new J3(c0862cn8.b, true);
            c0068Cn.t.b.restartInput(c0068Cn);
            c0068Cn.d();
            c0068Cn.getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, c0068Cn.D);
            c0068Cn.e();
            DI di = c0862cn5.s;
            SparseArray sparseArray = di.r;
            SparseArray sparseArray2 = di.s;
            SparseArray sparseArray3 = di.u;
            di.j = c0068Cn;
            for (int i3 = 0; i3 < sparseArray3.size(); i3++) {
                di.j.addView((AbstractC2213xI) sparseArray3.valueAt(i3));
            }
            for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
                if (sparseArray2.valueAt(i4) != null) {
                    throw new ClassCastException();
                }
                di.j.addView(null);
            }
            if (sparseArray.size() > 0) {
                sparseArray.valueAt(0).getClass();
                throw new ClassCastException();
            }
            CI ci = c0862cn5.t;
            SparseArray sparseArray4 = ci.n;
            SparseArray sparseArray5 = ci.f20o;
            ci.j = c0068Cn;
            for (int i5 = 0; i5 < sparseArray5.size(); i5++) {
                if (sparseArray5.valueAt(i5) != null) {
                    throw new ClassCastException();
                }
                ci.j.addView(null);
            }
            if (sparseArray4.size() > 0) {
                sparseArray4.valueAt(0).getClass();
                throw new ClassCastException();
            }
            Iterator it2 = c0068Cn.r.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
            if (c0068Cn.p) {
                c0586Wm.b();
            }
            c0664Zm4.c.setId(i2);
            if (z) {
            }
            setContentView(c0664Zm4.c);
            Window window2 = getWindow();
            window2.addFlags(Integer.MIN_VALUE);
            if (Build.VERSION.SDK_INT < 35) {
            }
            window2.getDecorView().setSystemUiVisibility(1280);
        } catch (Throwable th2) {
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onDestroy();
        if (j("onDestroy")) {
            this.i.e();
            this.i.f();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.k);
            this.h = false;
        }
        C0664Zm c0664Zm = this.i;
        if (c0664Zm != null) {
            c0664Zm.a = null;
            c0664Zm.b = null;
            c0664Zm.c = null;
            c0664Zm.d = null;
            c0664Zm.e = null;
            this.i = null;
        }
        this.j.e(EnumC0054Bz.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (j("onNewIntent")) {
            C0664Zm c0664Zm = this.i;
            c0664Zm.c();
            C0862cn c0862cn = c0664Zm.b;
            if (c0862cn == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            C0928dn c0928dn = c0862cn.d;
            if (c0928dn.e()) {
                AbstractC1568nW.c("FlutterEngineConnectionRegistry#onNewIntent");
                try {
                    Iterator it = ((HashSet) ((C1343k5) c0928dn.f).k).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
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
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            }
            String d = c0664Zm.d(intent);
            if (d == null || d.isEmpty()) {
                return;
            }
            P7 p7 = c0664Zm.b.i;
            p7.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("location", d);
            p7.a.E("pushRouteInformation", hashMap, null);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (j("onPause")) {
            C0664Zm c0664Zm = this.i;
            c0664Zm.c();
            c0664Zm.a.getClass();
            C0862cn c0862cn = c0664Zm.b;
            if (c0862cn != null) {
                C0158Fz c0158Fz = c0862cn.g;
                c0158Fz.a(3, c0158Fz.c);
            }
        }
        this.j.e(EnumC0054Bz.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (j("onPostResume")) {
            C0664Zm c0664Zm = this.i;
            c0664Zm.c();
            if (c0664Zm.b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            C1333jz c1333jz = c0664Zm.d;
            if (c1333jz != null) {
                c1333jz.b();
            }
            Iterator it = c0664Zm.b.s.p.values().iterator();
            if (it.hasNext()) {
                ((AbstractC1600o00) it.next()).getClass();
                throw null;
            }
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (j("onRequestPermissionsResult")) {
            C0664Zm c0664Zm = this.i;
            c0664Zm.c();
            if (c0664Zm.b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Arrays.toString(strArr);
            Arrays.toString(iArr);
            C0928dn c0928dn = c0664Zm.b.d;
            if (!c0928dn.e()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                return;
            }
            AbstractC1568nW.c("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                Iterator it = ((HashSet) ((C1343k5) c0928dn.f).i).iterator();
                if (!it.hasNext()) {
                    Trace.endSection();
                } else {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
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

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        this.j.e(EnumC0054Bz.ON_RESUME);
        if (j("onResume")) {
            C0664Zm c0664Zm = this.i;
            c0664Zm.c();
            c0664Zm.b.b.d();
            c0664Zm.a.getClass();
            C0862cn c0862cn = c0664Zm.b;
            if (c0862cn != null) {
                C0158Fz c0158Fz = c0862cn.g;
                c0158Fz.a(2, c0158Fz.c);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (j("onSaveInstanceState")) {
            C0664Zm c0664Zm = this.i;
            c0664Zm.c();
            if (c0664Zm.a.i()) {
                bundle.putByteArray("framework", (byte[]) c0664Zm.b.k.f);
            }
            c0664Zm.a.getClass();
            Bundle bundle2 = new Bundle();
            C0928dn c0928dn = c0664Zm.b.d;
            if (c0928dn.e()) {
                AbstractC1568nW.c("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it = ((HashSet) ((C1343k5) c0928dn.f).m).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
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
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            }
            bundle.putBundle("plugins", bundle2);
            if (c0664Zm.a.c() == null || c0664Zm.a.h()) {
                return;
            }
            bundle.putBoolean("enableOnBackInvokedCallbackState", c0664Zm.a.h);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onStart() {
        String str;
        String a;
        Bundle f;
        super.onStart();
        this.j.e(EnumC0054Bz.ON_START);
        if (j("onStart")) {
            C0664Zm c0664Zm = this.i;
            c0664Zm.c();
            if (c0664Zm.a.c() == null && !c0664Zm.b.c.i) {
                String e = c0664Zm.a.e();
                if (e == null) {
                    AbstractActivityC0560Vm abstractActivityC0560Vm = c0664Zm.a;
                    abstractActivityC0560Vm.getClass();
                    e = c0664Zm.d(abstractActivityC0560Vm.getIntent());
                    if (e == null) {
                        e = "/";
                    }
                }
                AbstractActivityC0560Vm abstractActivityC0560Vm2 = c0664Zm.a;
                abstractActivityC0560Vm2.getClass();
                try {
                    f = abstractActivityC0560Vm2.f();
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (f != null) {
                    str = f.getString("io.flutter.EntrypointUri");
                    c0664Zm.a.d();
                    c0664Zm.b.i.a.E("setInitialRoute", e, null);
                    a = c0664Zm.a.a();
                    if (a != null || a.isEmpty()) {
                        a = (String) ((C1717pn) C0950e6.D().i).d.c;
                    }
                    c0664Zm.b.c.b(str != null ? new C1117gf(a, c0664Zm.a.d()) : new C1117gf(a, str, c0664Zm.a.d()), (List) c0664Zm.a.getIntent().getSerializableExtra("dart_entrypoint_args"));
                }
                str = null;
                c0664Zm.a.d();
                c0664Zm.b.i.a.E("setInitialRoute", e, null);
                a = c0664Zm.a.a();
                if (a != null) {
                }
                a = (String) ((C1717pn) C0950e6.D().i).d.c;
                c0664Zm.b.c.b(str != null ? new C1117gf(a, c0664Zm.a.d()) : new C1117gf(a, str, c0664Zm.a.d()), (List) c0664Zm.a.getIntent().getSerializableExtra("dart_entrypoint_args"));
            }
            Integer num = c0664Zm.k;
            if (num != null) {
                c0664Zm.c.setVisibility(num.intValue());
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (j("onStop")) {
            C0664Zm c0664Zm = this.i;
            c0664Zm.c();
            c0664Zm.a.getClass();
            C0862cn c0862cn = c0664Zm.b;
            if (c0862cn != null) {
                C0158Fz c0158Fz = c0862cn.g;
                c0158Fz.a(5, c0158Fz.c);
            }
            c0664Zm.k = Integer.valueOf(c0664Zm.c.getVisibility());
            c0664Zm.c.setVisibility(8);
            C0862cn c0862cn2 = c0664Zm.b;
            if (c0862cn2 != null) {
                c0862cn2.b.b(40);
            }
        }
        this.j.e(EnumC0054Bz.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (j("onTrimMemory")) {
            C0664Zm c0664Zm = this.i;
            c0664Zm.c();
            C0862cn c0862cn = c0664Zm.b;
            if (c0862cn != null) {
                if (c0664Zm.i && i >= 10) {
                    FlutterJNI flutterJNI = (FlutterJNI) c0862cn.c.j;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    C0104Dx c0104Dx = c0664Zm.b.q;
                    c0104Dx.getClass();
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("type", "memoryPressure");
                    c0104Dx.a.M(hashMap, null);
                }
                c0664Zm.b.b.b(i);
                DI di = c0664Zm.b.s;
                if (i < 40) {
                    di.getClass();
                    return;
                }
                Iterator it = di.p.values().iterator();
                if (it.hasNext()) {
                    ((AbstractC1600o00) it.next()).getClass();
                    throw null;
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        if (j("onUserLeaveHint")) {
            C0664Zm c0664Zm = this.i;
            c0664Zm.c();
            C0862cn c0862cn = c0664Zm.b;
            if (c0862cn == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            C0928dn c0928dn = c0862cn.d;
            if (!c0928dn.e()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            AbstractC1568nW.c("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                Iterator it = ((HashSet) ((C1343k5) c0928dn.f).l).iterator();
                if (!it.hasNext()) {
                    Trace.endSection();
                } else {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
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

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (j("onWindowFocusChanged")) {
            C0664Zm c0664Zm = this.i;
            c0664Zm.c();
            c0664Zm.a.getClass();
            C0862cn c0862cn = c0664Zm.b;
            if (c0862cn != null) {
                C0158Fz c0158Fz = c0862cn.g;
                if (z) {
                    c0158Fz.a(c0158Fz.a, true);
                } else {
                    c0158Fz.a(c0158Fz.a, false);
                }
            }
        }
    }
}

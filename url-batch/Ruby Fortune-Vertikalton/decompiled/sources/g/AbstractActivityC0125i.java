package g;

import X.AbstractComponentCallbacksC0048q;
import X.C0050t;
import X.C0051u;
import X.Q;
import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.EnumC0068l;
import androidx.lifecycle.EnumC0069m;
import g.AbstractActivityC0125i;
import j.C0139c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import l.C0264v;
import l.N0;
import l.d1;
import l.f1;

/* renamed from: g.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0125i extends a.l implements InterfaceC0126j {

    /* renamed from: u, reason: collision with root package name */
    public boolean f2320u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2321v;

    /* renamed from: x, reason: collision with root package name */
    public LayoutInflaterFactory2C0109A f2323x;

    /* renamed from: s, reason: collision with root package name */
    public final B0.d f2318s = new B0.d(18, new C0051u(this));

    /* renamed from: t, reason: collision with root package name */
    public final androidx.lifecycle.t f2319t = new androidx.lifecycle.t(this);

    /* renamed from: w, reason: collision with root package name */
    public boolean f2322w = true;

    public AbstractActivityC0125i() {
        this.d.f2373b.e("android:support:lifecycle", new X.r(0, this));
        final int i = 0;
        g(new J.a(this) { // from class: X.s

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0125i f988b;

            {
                this.f988b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        this.f988b.f2318s.w();
                        break;
                    default:
                        this.f988b.f2318s.w();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.f1061k.add(new J.a(this) { // from class: X.s

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0125i f988b;

            {
                this.f988b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        this.f988b.f2318s.w();
                        break;
                    default:
                        this.f988b.f2318s.w();
                        break;
                }
            }
        });
        h(new C0050t(this, 0));
    }

    public static boolean n(X.I i) {
        boolean z2 = false;
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : i.f807c.k()) {
            if (abstractComponentCallbacksC0048q != null) {
                C0051u c0051u = abstractComponentCallbacksC0048q.f977s;
                if ((c0051u == null ? null : c0051u.i) != null) {
                    z2 |= n(abstractComponentCallbacksC0048q.g());
                }
                Q q2 = abstractComponentCallbacksC0048q.f957N;
                EnumC0069m enumC0069m = EnumC0069m.d;
                if (q2 != null && q2.d().f1367c.compareTo(enumC0069m) >= 0) {
                    abstractComponentCallbacksC0048q.f957N.f862c.g();
                    z2 = true;
                }
                if (abstractComponentCallbacksC0048q.f956M.f1367c.compareTo(enumC0069m) >= 0) {
                    abstractComponentCallbacksC0048q.f956M.g();
                    z2 = true;
                }
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        LayoutInflaterFactory2C0109A layoutInflaterFactory2C0109A = (LayoutInflaterFactory2C0109A) l();
        layoutInflaterFactory2C0109A.v();
        ((ViewGroup) layoutInflaterFactory2C0109A.f2189B.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0109A.f2224m.a(layoutInflaterFactory2C0109A.f2223l.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        LayoutInflaterFactory2C0109A layoutInflaterFactory2C0109A = (LayoutInflaterFactory2C0109A) l();
        layoutInflaterFactory2C0109A.f2202P = true;
        int i = layoutInflaterFactory2C0109A.f2206T;
        if (i == -100) {
            i = o.f2328b;
        }
        int B2 = layoutInflaterFactory2C0109A.B(context, i);
        if (o.b(context) && o.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (o.i) {
                    try {
                        G.f fVar = o.f2329c;
                        if (fVar == null) {
                            if (o.d == null) {
                                o.d = G.f.a(z.c.e(context));
                            }
                            if (!o.d.f192a.f193a.isEmpty()) {
                                o.f2329c = o.d;
                            }
                        } else if (!fVar.equals(o.d)) {
                            G.f fVar2 = o.f2329c;
                            o.d = fVar2;
                            z.c.d(context, fVar2.f192a.f193a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!o.f2331f) {
                o.f2327a.execute(new d0.g(context, 2));
            }
        }
        G.f o2 = LayoutInflaterFactory2C0109A.o(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C0109A.s(context, B2, o2, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C0139c) {
            try {
                ((C0139c) context).a(LayoutInflaterFactory2C0109A.s(context, B2, o2, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (LayoutInflaterFactory2C0109A.f2187k0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f2 = configuration3.fontScale;
                    float f3 = configuration4.fontScale;
                    if (f2 != f3) {
                        configuration.fontScale = f3;
                    }
                    int i2 = configuration3.mcc;
                    int i3 = configuration4.mcc;
                    if (i2 != i3) {
                        configuration.mcc = i3;
                    }
                    int i4 = configuration3.mnc;
                    int i5 = configuration4.mnc;
                    if (i4 != i5) {
                        configuration.mnc = i5;
                    }
                    t.a(configuration3, configuration4, configuration);
                    int i6 = configuration3.touchscreen;
                    int i7 = configuration4.touchscreen;
                    if (i6 != i7) {
                        configuration.touchscreen = i7;
                    }
                    int i8 = configuration3.keyboard;
                    int i9 = configuration4.keyboard;
                    if (i8 != i9) {
                        configuration.keyboard = i9;
                    }
                    int i10 = configuration3.keyboardHidden;
                    int i11 = configuration4.keyboardHidden;
                    if (i10 != i11) {
                        configuration.keyboardHidden = i11;
                    }
                    int i12 = configuration3.navigation;
                    int i13 = configuration4.navigation;
                    if (i12 != i13) {
                        configuration.navigation = i13;
                    }
                    int i14 = configuration3.navigationHidden;
                    int i15 = configuration4.navigationHidden;
                    if (i14 != i15) {
                        configuration.navigationHidden = i15;
                    }
                    int i16 = configuration3.orientation;
                    int i17 = configuration4.orientation;
                    if (i16 != i17) {
                        configuration.orientation = i17;
                    }
                    int i18 = configuration3.screenLayout & 15;
                    int i19 = configuration4.screenLayout & 15;
                    if (i18 != i19) {
                        configuration.screenLayout |= i19;
                    }
                    int i20 = configuration3.screenLayout & 192;
                    int i21 = configuration4.screenLayout & 192;
                    if (i20 != i21) {
                        configuration.screenLayout |= i21;
                    }
                    int i22 = configuration3.screenLayout & 48;
                    int i23 = configuration4.screenLayout & 48;
                    if (i22 != i23) {
                        configuration.screenLayout |= i23;
                    }
                    int i24 = configuration3.screenLayout & 768;
                    int i25 = configuration4.screenLayout & 768;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    int i26 = configuration3.colorMode & 3;
                    int i27 = configuration4.colorMode & 3;
                    if (i26 != i27) {
                        configuration.colorMode |= i27;
                    }
                    int i28 = configuration3.colorMode & 12;
                    int i29 = configuration4.colorMode & 12;
                    if (i28 != i29) {
                        configuration.colorMode |= i29;
                    }
                    int i30 = configuration3.uiMode & 15;
                    int i31 = configuration4.uiMode & 15;
                    if (i30 != i31) {
                        configuration.uiMode |= i31;
                    }
                    int i32 = configuration3.uiMode & 48;
                    int i33 = configuration4.uiMode & 48;
                    if (i32 != i33) {
                        configuration.uiMode |= i33;
                    }
                    int i34 = configuration3.screenWidthDp;
                    int i35 = configuration4.screenWidthDp;
                    if (i34 != i35) {
                        configuration.screenWidthDp = i35;
                    }
                    int i36 = configuration3.screenHeightDp;
                    int i37 = configuration4.screenHeightDp;
                    if (i36 != i37) {
                        configuration.screenHeightDp = i37;
                    }
                    int i38 = configuration3.smallestScreenWidthDp;
                    int i39 = configuration4.smallestScreenWidthDp;
                    if (i38 != i39) {
                        configuration.smallestScreenWidthDp = i39;
                    }
                    int i40 = configuration3.densityDpi;
                    int i41 = configuration4.densityDpi;
                    if (i40 != i41) {
                        configuration.densityDpi = i41;
                    }
                }
            }
            Configuration s2 = LayoutInflaterFactory2C0109A.s(context, B2, o2, configuration, true);
            C0139c c0139c = new C0139c(context, com.punchtowin.balls.R.style.Theme_AppCompat_Empty);
            c0139c.a(s2);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = c0139c.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        B.q.a(theme);
                    } else {
                        synchronized (B.b.f13e) {
                            if (!B.b.f15g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    B.b.f14f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e2) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                                }
                                B.b.f15g = true;
                            }
                            Method method = B.b.f14f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e3) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                                    B.b.f14f = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = c0139c;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((LayoutInflaterFactory2C0109A) l()).z();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // a.l, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((LayoutInflaterFactory2C0109A) l()).z();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r1.equals("--list-dumpables") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        if (r1.equals("--dump-dumpable") == false) goto L34;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return;
                    }
                    break;
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                        return;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill")) {
                        return;
                    }
                    break;
            }
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.f2320u);
        printWriter.print(" mResumed=");
        printWriter.print(this.f2321v);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2322w);
        if (getApplication() != null) {
            o.l lVar = ((c0.a) new B0.d(c(), c0.a.f1512c).u(c0.a.class)).f1513b;
            if (lVar.f3350c > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (lVar.f3350c > 0) {
                    if (lVar.f3349b[0] != null) {
                        throw new ClassCastException();
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(lVar.f3348a[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((C0051u) this.f2318s.f59b).h.v(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        LayoutInflaterFactory2C0109A layoutInflaterFactory2C0109A = (LayoutInflaterFactory2C0109A) l();
        layoutInflaterFactory2C0109A.v();
        return layoutInflaterFactory2C0109A.f2223l.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C0109A layoutInflaterFactory2C0109A = (LayoutInflaterFactory2C0109A) l();
        if (layoutInflaterFactory2C0109A.f2227p == null) {
            layoutInflaterFactory2C0109A.z();
            K k2 = layoutInflaterFactory2C0109A.f2226o;
            layoutInflaterFactory2C0109A.f2227p = new j.h(k2 != null ? k2.e0() : layoutInflaterFactory2C0109A.f2222k);
        }
        return layoutInflaterFactory2C0109A.f2227p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = f1.f2982a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C0109A layoutInflaterFactory2C0109A = (LayoutInflaterFactory2C0109A) l();
        if (layoutInflaterFactory2C0109A.f2226o != null) {
            layoutInflaterFactory2C0109A.z();
            layoutInflaterFactory2C0109A.f2226o.getClass();
            layoutInflaterFactory2C0109A.A(0);
        }
    }

    public final o l() {
        if (this.f2323x == null) {
            m mVar = o.f2327a;
            this.f2323x = new LayoutInflaterFactory2C0109A(this, null, this, this);
        }
        return this.f2323x;
    }

    public final void m() {
        androidx.lifecycle.H.f(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        X0.e.e(decorView, "<this>");
        decorView.setTag(com.punchtowin.balls.R.id.view_tree_view_model_store_owner, this);
        q1.d.j0(getWindow().getDecorView(), this);
        q1.l.T(getWindow().getDecorView(), this);
    }

    public final void o() {
        super.onDestroy();
        ((C0051u) this.f2318s.f59b).h.k();
        this.f2319t.d(EnumC0068l.ON_DESTROY);
    }

    @Override // a.l, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f2318s.w();
        super.onActivityResult(i, i2, intent);
    }

    @Override // a.l, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C0109A layoutInflaterFactory2C0109A = (LayoutInflaterFactory2C0109A) l();
        if (layoutInflaterFactory2C0109A.f2193G && layoutInflaterFactory2C0109A.f2188A) {
            layoutInflaterFactory2C0109A.z();
            K k2 = layoutInflaterFactory2C0109A.f2226o;
            if (k2 != null) {
                k2.h0(k2.f2262a.getResources().getBoolean(com.punchtowin.balls.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C0264v a2 = C0264v.a();
        Context context = layoutInflaterFactory2C0109A.f2222k;
        synchronized (a2) {
            N0 n02 = a2.f3071a;
            synchronized (n02) {
                o.e eVar = (o.e) n02.f2903b.get(context);
                if (eVar != null) {
                    eVar.a();
                }
            }
        }
        layoutInflaterFactory2C0109A.f2205S = new Configuration(layoutInflaterFactory2C0109A.f2222k.getResources().getConfiguration());
        layoutInflaterFactory2C0109A.m(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // a.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2319t.d(EnumC0068l.ON_CREATE);
        X.I i = ((C0051u) this.f2318s.f59b).h;
        i.f797E = false;
        i.F = false;
        i.f803L.f839g = false;
        i.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0051u) this.f2318s.f59b).h.f809f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        o();
        l().d();
    }

    @Override // a.l, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent a2;
        if (p(i, menuItem)) {
            return true;
        }
        LayoutInflaterFactory2C0109A layoutInflaterFactory2C0109A = (LayoutInflaterFactory2C0109A) l();
        layoutInflaterFactory2C0109A.z();
        K k2 = layoutInflaterFactory2C0109A.f2226o;
        if (menuItem.getItemId() == 16908332 && k2 != null && (((d1) k2.f2265e).f2971b & 4) != 0 && (a2 = z.c.a(this)) != null) {
            if (!shouldUpRecreateTask(a2)) {
                navigateUpTo(a2);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent a3 = z.c.a(this);
            if (a3 == null) {
                a3 = z.c.a(this);
            }
            if (a3 != null) {
                ComponentName component = a3.getComponent();
                if (component == null) {
                    component = a3.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent b2 = z.c.b(this, component);
                    while (b2 != null) {
                        arrayList.add(size, b2);
                        b2 = z.c.b(this, b2.getComponent());
                    }
                    arrayList.add(a3);
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e2);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f2321v = false;
        ((C0051u) this.f2318s.f59b).h.t(5);
        this.f2319t.d(EnumC0068l.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C0109A) l()).v();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        q();
        LayoutInflaterFactory2C0109A layoutInflaterFactory2C0109A = (LayoutInflaterFactory2C0109A) l();
        layoutInflaterFactory2C0109A.z();
        K k2 = layoutInflaterFactory2C0109A.f2226o;
        if (k2 != null) {
            k2.f2278t = true;
        }
    }

    @Override // a.l, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f2318s.w();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        B0.d dVar = this.f2318s;
        dVar.w();
        super.onResume();
        this.f2321v = true;
        ((C0051u) dVar.f59b).h.y(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        r();
        ((LayoutInflaterFactory2C0109A) l()).m(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f2318s.w();
    }

    @Override // android.app.Activity
    public void onStop() {
        s();
        LayoutInflaterFactory2C0109A layoutInflaterFactory2C0109A = (LayoutInflaterFactory2C0109A) l();
        layoutInflaterFactory2C0109A.z();
        K k2 = layoutInflaterFactory2C0109A.f2226o;
        if (k2 != null) {
            k2.f2278t = false;
            j.j jVar = k2.f2277s;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        l().l(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((LayoutInflaterFactory2C0109A) l()).z();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final boolean p(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((C0051u) this.f2318s.f59b).h.i();
        }
        return false;
    }

    public final void q() {
        super.onPostResume();
        this.f2319t.d(EnumC0068l.ON_RESUME);
        X.I i = ((C0051u) this.f2318s.f59b).h;
        i.f797E = false;
        i.F = false;
        i.f803L.f839g = false;
        i.t(7);
    }

    public final void r() {
        B0.d dVar = this.f2318s;
        dVar.w();
        super.onStart();
        this.f2322w = false;
        boolean z2 = this.f2320u;
        C0051u c0051u = (C0051u) dVar.f59b;
        if (!z2) {
            this.f2320u = true;
            X.I i = c0051u.h;
            i.f797E = false;
            i.F = false;
            i.f803L.f839g = false;
            i.t(4);
        }
        c0051u.h.y(true);
        this.f2319t.d(EnumC0068l.ON_START);
        X.I i2 = c0051u.h;
        i2.f797E = false;
        i2.F = false;
        i2.f803L.f839g = false;
        i2.t(5);
    }

    public final void s() {
        B0.d dVar;
        super.onStop();
        this.f2322w = true;
        do {
            dVar = this.f2318s;
        } while (n(((C0051u) dVar.f59b).h));
        X.I i = ((C0051u) dVar.f59b).h;
        i.F = true;
        i.f803L.f839g = true;
        i.t(4);
        this.f2319t.d(EnumC0068l.ON_STOP);
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        m();
        l().i(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C0109A) l()).f2207U = i;
    }

    @Override // a.l, android.app.Activity
    public void setContentView(View view) {
        m();
        l().j(view);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0051u) this.f2318s.f59b).h.f809f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        l().k(view, layoutParams);
    }
}

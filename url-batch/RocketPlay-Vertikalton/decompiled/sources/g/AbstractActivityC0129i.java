package g;

import Y.AbstractComponentCallbacksC0055q;
import Y.C0057t;
import Y.C0058u;
import Y.Q;
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
import androidx.lifecycle.EnumC0079l;
import androidx.lifecycle.EnumC0080m;
import androidx.recyclerview.widget.RecyclerView;
import c1.AbstractC0104b;
import d0.C0105a;
import g.AbstractActivityC0129i;
import j.C0177c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import l.C0279u;
import l.N0;
import l.e1;
import l.g1;
import z.AbstractC0385c;

/* renamed from: g.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0129i extends a.l implements InterfaceC0130j {

    /* renamed from: u, reason: collision with root package name */
    public boolean f2676u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2677v;

    /* renamed from: x, reason: collision with root package name */
    public z f2679x;

    /* renamed from: s, reason: collision with root package name */
    public final A1.d f2674s = new A1.d(18, new C0058u(this));

    /* renamed from: t, reason: collision with root package name */
    public final androidx.lifecycle.v f2675t = new androidx.lifecycle.v(this);

    /* renamed from: w, reason: collision with root package name */
    public boolean f2678w = true;

    public AbstractActivityC0129i() {
        this.d.f3037b.e("android:support:lifecycle", new Y.r(0, this));
        final int i = 0;
        g(new J.a(this) { // from class: Y.s

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0129i f1525b;

            {
                this.f1525b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        this.f1525b.f2674s.u();
                        break;
                    default:
                        this.f1525b.f2674s.u();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.f1590k.add(new J.a(this) { // from class: Y.s

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0129i f1525b;

            {
                this.f1525b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        this.f1525b.f2674s.u();
                        break;
                    default:
                        this.f1525b.f2674s.u();
                        break;
                }
            }
        });
        h(new C0057t(this, 0));
        this.d.f3037b.e("androidx:appcompat", new C0127g(this));
        h(new C0128h(this));
    }

    public static boolean n(Y.I i) {
        boolean z2 = false;
        for (AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q : i.f1344c.j()) {
            if (abstractComponentCallbacksC0055q != null) {
                C0058u c0058u = abstractComponentCallbacksC0055q.f1514s;
                if ((c0058u == null ? null : c0058u.f1531e) != null) {
                    z2 |= n(abstractComponentCallbacksC0055q.g());
                }
                Q q2 = abstractComponentCallbacksC0055q.f1494N;
                EnumC0080m enumC0080m = EnumC0080m.d;
                if (q2 != null && q2.e().d.compareTo(enumC0080m) >= 0) {
                    abstractComponentCallbacksC0055q.f1494N.f1399c.g();
                    z2 = true;
                }
                if (abstractComponentCallbacksC0055q.f1493M.d.compareTo(enumC0080m) >= 0) {
                    abstractComponentCallbacksC0055q.f1493M.g();
                    z2 = true;
                }
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        z zVar = (z) l();
        zVar.v();
        ((ViewGroup) zVar.f2715A.findViewById(R.id.content)).addView(view, layoutParams);
        zVar.f2750m.a(zVar.f2749l.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        z zVar = (z) l();
        zVar.f2728O = true;
        int i = zVar.f2732S;
        if (i == -100) {
            i = n.f2681b;
        }
        int B2 = zVar.B(context, i);
        if (n.b(context) && n.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (n.i) {
                    try {
                        G.f fVar = n.f2682c;
                        if (fVar == null) {
                            if (n.d == null) {
                                n.d = G.f.a(AbstractC0385c.e(context));
                            }
                            if (!n.d.f431a.f432a.isEmpty()) {
                                n.f2682c = n.d;
                            }
                        } else if (!fVar.equals(n.d)) {
                            G.f fVar2 = n.f2682c;
                            n.d = fVar2;
                            AbstractC0385c.d(context, fVar2.f431a.f432a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!n.f2684f) {
                n.f2680a.execute(new e0.g(context, 2));
            }
        }
        G.f o2 = z.o(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(z.s(context, B2, o2, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C0177c) {
            try {
                ((C0177c) context).a(z.s(context, B2, o2, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (z.f2714j0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = RecyclerView.f1949A0;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = RecyclerView.f1949A0;
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
                    s.a(configuration3, configuration4, configuration);
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
            Configuration s2 = z.s(context, B2, o2, configuration, true);
            C0177c c0177c = new C0177c(context, com.luckycounter.drinkwater.R.style.Theme_AppCompat_Empty);
            c0177c.a(s2);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = c0177c.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        B.q.a(theme);
                    } else {
                        synchronized (B.b.f55e) {
                            if (!B.b.f57g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    B.b.f56f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e2) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                                }
                                B.b.f57g = true;
                            }
                            Method method = B.b.f56f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e3) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                                    B.b.f56f = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = c0177c;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((z) l()).z();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // a.l, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((z) l()).z();
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
        printWriter.print(this.f2676u);
        printWriter.print(" mResumed=");
        printWriter.print(this.f2677v);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2678w);
        if (getApplication() != null) {
            o.l lVar = ((C0105a) new A1.d(c(), C0105a.f2520c).s(C0105a.class)).f2521b;
            if (lVar.f3615c > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (lVar.f3615c > 0) {
                    if (lVar.f3614b[0] != null) {
                        throw new ClassCastException();
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(lVar.f3613a[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((C0058u) this.f2674s.f38b).d.v(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        z zVar = (z) l();
        zVar.v();
        return zVar.f2749l.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        z zVar = (z) l();
        if (zVar.f2753p == null) {
            zVar.z();
            J j2 = zVar.f2752o;
            zVar.f2753p = new j.h(j2 != null ? j2.x() : zVar.f2748k);
        }
        return zVar.f2753p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = g1.f3428a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        z zVar = (z) l();
        if (zVar.f2752o != null) {
            zVar.z();
            zVar.f2752o.getClass();
            zVar.A(0);
        }
    }

    public final n l() {
        if (this.f2679x == null) {
            androidx.room.A a2 = n.f2680a;
            this.f2679x = new z(this, null, this, this);
        }
        return this.f2679x;
    }

    public final void m() {
        androidx.lifecycle.J.g(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        i1.f.e(decorView, "<this>");
        decorView.setTag(com.luckycounter.drinkwater.R.id.view_tree_view_model_store_owner, this);
        AbstractC0104b.w(getWindow().getDecorView(), this);
        F1.l.g0(getWindow().getDecorView(), this);
    }

    public final void o() {
        super.onDestroy();
        ((C0058u) this.f2674s.f38b).d.k();
        this.f2675t.d(EnumC0079l.ON_DESTROY);
    }

    @Override // a.l, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f2674s.u();
        super.onActivityResult(i, i2, intent);
    }

    @Override // a.l, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        z zVar = (z) l();
        if (zVar.F && zVar.f2763z) {
            zVar.z();
            J j2 = zVar.f2752o;
            if (j2 != null) {
                j2.A(j2.d.getResources().getBoolean(com.luckycounter.drinkwater.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C0279u a2 = C0279u.a();
        Context context = zVar.f2748k;
        synchronized (a2) {
            N0 n0 = a2.f3510a;
            synchronized (n0) {
                o.e eVar = (o.e) n0.f3348b.get(context);
                if (eVar != null) {
                    eVar.a();
                }
            }
        }
        zVar.f2731R = new Configuration(zVar.f2748k.getResources().getConfiguration());
        zVar.m(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // a.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2675t.d(EnumC0079l.ON_CREATE);
        Y.I i = ((C0058u) this.f2674s.f38b).d;
        i.f1334E = false;
        i.F = false;
        i.f1340L.f1376g = false;
        i.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0058u) this.f2674s.f38b).d.f1346f.onCreateView(view, str, context, attributeSet);
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
        z zVar = (z) l();
        zVar.z();
        J j2 = zVar.f2752o;
        if (menuItem.getItemId() == 16908332 && j2 != null && (((e1) j2.h).f3415b & 4) != 0 && (a2 = AbstractC0385c.a(this)) != null) {
            if (!shouldUpRecreateTask(a2)) {
                navigateUpTo(a2);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent a3 = AbstractC0385c.a(this);
            if (a3 == null) {
                a3 = AbstractC0385c.a(this);
            }
            if (a3 != null) {
                ComponentName component = a3.getComponent();
                if (component == null) {
                    component = a3.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent b2 = AbstractC0385c.b(this, component);
                    while (b2 != null) {
                        arrayList.add(size, b2);
                        b2 = AbstractC0385c.b(this, b2.getComponent());
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
        this.f2677v = false;
        ((C0058u) this.f2674s.f38b).d.t(5);
        this.f2675t.d(EnumC0079l.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((z) l()).v();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        q();
        z zVar = (z) l();
        zVar.z();
        J j2 = zVar.f2752o;
        if (j2 != null) {
            j2.f2624w = true;
        }
    }

    @Override // a.l, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f2674s.u();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        A1.d dVar = this.f2674s;
        dVar.u();
        super.onResume();
        this.f2677v = true;
        ((C0058u) dVar.f38b).d.y(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        r();
        ((z) l()).m(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f2674s.u();
    }

    @Override // android.app.Activity
    public final void onStop() {
        s();
        z zVar = (z) l();
        zVar.z();
        J j2 = zVar.f2752o;
        if (j2 != null) {
            j2.f2624w = false;
            j.j jVar = j2.f2623v;
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
        ((z) l()).z();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final boolean p(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((C0058u) this.f2674s.f38b).d.i();
        }
        return false;
    }

    public final void q() {
        super.onPostResume();
        this.f2675t.d(EnumC0079l.ON_RESUME);
        Y.I i = ((C0058u) this.f2674s.f38b).d;
        i.f1334E = false;
        i.F = false;
        i.f1340L.f1376g = false;
        i.t(7);
    }

    public final void r() {
        A1.d dVar = this.f2674s;
        dVar.u();
        super.onStart();
        this.f2678w = false;
        boolean z2 = this.f2676u;
        C0058u c0058u = (C0058u) dVar.f38b;
        if (!z2) {
            this.f2676u = true;
            Y.I i = c0058u.d;
            i.f1334E = false;
            i.F = false;
            i.f1340L.f1376g = false;
            i.t(4);
        }
        c0058u.d.y(true);
        this.f2675t.d(EnumC0079l.ON_START);
        Y.I i2 = c0058u.d;
        i2.f1334E = false;
        i2.F = false;
        i2.f1340L.f1376g = false;
        i2.t(5);
    }

    public final void s() {
        A1.d dVar;
        super.onStop();
        this.f2678w = true;
        do {
            dVar = this.f2674s;
        } while (n(((C0058u) dVar.f38b).d));
        Y.I i = ((C0058u) dVar.f38b).d;
        i.F = true;
        i.f1340L.f1376g = true;
        i.t(4);
        this.f2675t.d(EnumC0079l.ON_STOP);
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        m();
        l().i(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((z) l()).f2733T = i;
    }

    @Override // a.l, android.app.Activity
    public void setContentView(View view) {
        m();
        l().j(view);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0058u) this.f2674s.f38b).d.f1346f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        l().k(view, layoutParams);
    }
}

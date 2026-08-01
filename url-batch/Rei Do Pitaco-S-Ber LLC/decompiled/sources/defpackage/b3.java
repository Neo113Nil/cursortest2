package defpackage;

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
import androidx.lifecycle.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class b3 extends pb implements e3 {
    public boolean B;
    public boolean C;
    public c4 E;
    public final j0 z = new j0(20, new fk(this));
    public final a A = new a(this);
    public boolean D = true;

    public b3() {
        this.i.b.e("android:support:lifecycle", new jb(1, this));
        final int i = 0;
        this.n.add(new wc(this) { // from class: ek
            public final /* synthetic */ b3 b;

            {
                this.b = this;
            }

            @Override // defpackage.wc
            public final void accept(Object obj) {
                int i2 = i;
                b3 b3Var = this.b;
                switch (i2) {
                    case 0:
                        b3Var.z.C();
                        break;
                    default:
                        b3Var.z.C();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.p.add(new wc(this) { // from class: ek
            public final /* synthetic */ b3 b;

            {
                this.b = this;
            }

            @Override // defpackage.wc
            public final void accept(Object obj) {
                int i22 = i2;
                b3 b3Var = this.b;
                switch (i22) {
                    case 0:
                        b3Var.z.C();
                        break;
                    default:
                        b3Var.z.C();
                        break;
                }
            }
        });
        g(new kb(this, 1));
        this.i.b.e("androidx:appcompat", new z2(this));
        g(new a3(this));
    }

    public static boolean k(sk skVar) {
        boolean z = false;
        for (dk dkVar : skVar.c.n()) {
            if (dkVar != null) {
                fk fkVar = dkVar.x;
                if ((fkVar == null ? null : fkVar.y) != null) {
                    z |= k(dkVar.g());
                }
                bl blVar = dkVar.S;
                gp gpVar = gp.h;
                gp gpVar2 = gp.i;
                if (blVar != null) {
                    blVar.f();
                    if (blVar.h.c.compareTo(gpVar2) >= 0) {
                        a aVar = dkVar.S.h;
                        aVar.c("setCurrentState");
                        aVar.e(gpVar);
                        z = true;
                    }
                }
                if (dkVar.R.c.compareTo(gpVar2) >= 0) {
                    a aVar2 = dkVar.R;
                    aVar2.c("setCurrentState");
                    aVar2.e(gpVar);
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        c4 c4Var = (c4) j();
        c4Var.v();
        ((ViewGroup) c4Var.E.findViewById(R.id.content)).addView(view, layoutParams);
        c4Var.r.a(c4Var.q.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        c4 c4Var = (c4) j();
        c4Var.S = true;
        int i = c4Var.W;
        if (i == -100) {
            i = o3.g;
        }
        int B = c4Var.B(context, i);
        int i2 = 0;
        if (o3.b(context) && o3.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (o3.n) {
                    try {
                        oq oqVar = o3.h;
                        if (oqVar == null) {
                            if (o3.i == null) {
                                o3.i = oq.a(vv.I(context));
                            }
                            if (!o3.i.a.a.isEmpty()) {
                                o3.h = o3.i;
                            }
                        } else if (!oqVar.equals(o3.i)) {
                            oq oqVar2 = o3.h;
                            o3.i = oqVar2;
                            vv.F(context, oqVar2.a.a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!o3.k) {
                o3.f.execute(new i3(context, i2));
            }
        }
        oq o = c4.o(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(c4.s(context, B, o, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof dd) {
            try {
                ((dd) context).a(c4.s(context, B, o, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (c4.n0) {
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
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i3 = configuration3.mcc;
                    int i4 = configuration4.mcc;
                    if (i3 != i4) {
                        configuration.mcc = i4;
                    }
                    int i5 = configuration3.mnc;
                    int i6 = configuration4.mnc;
                    if (i5 != i6) {
                        configuration.mnc = i6;
                    }
                    t3.a(configuration3, configuration4, configuration);
                    int i7 = configuration3.touchscreen;
                    int i8 = configuration4.touchscreen;
                    if (i7 != i8) {
                        configuration.touchscreen = i8;
                    }
                    int i9 = configuration3.keyboard;
                    int i10 = configuration4.keyboard;
                    if (i9 != i10) {
                        configuration.keyboard = i10;
                    }
                    int i11 = configuration3.keyboardHidden;
                    int i12 = configuration4.keyboardHidden;
                    if (i11 != i12) {
                        configuration.keyboardHidden = i12;
                    }
                    int i13 = configuration3.navigation;
                    int i14 = configuration4.navigation;
                    if (i13 != i14) {
                        configuration.navigation = i14;
                    }
                    int i15 = configuration3.navigationHidden;
                    int i16 = configuration4.navigationHidden;
                    if (i15 != i16) {
                        configuration.navigationHidden = i16;
                    }
                    int i17 = configuration3.orientation;
                    int i18 = configuration4.orientation;
                    if (i17 != i18) {
                        configuration.orientation = i18;
                    }
                    int i19 = configuration3.screenLayout & 15;
                    int i20 = configuration4.screenLayout & 15;
                    if (i19 != i20) {
                        configuration.screenLayout |= i20;
                    }
                    int i21 = configuration3.screenLayout & 192;
                    int i22 = configuration4.screenLayout & 192;
                    if (i21 != i22) {
                        configuration.screenLayout |= i22;
                    }
                    int i23 = configuration3.screenLayout & 48;
                    int i24 = configuration4.screenLayout & 48;
                    if (i23 != i24) {
                        configuration.screenLayout |= i24;
                    }
                    int i25 = configuration3.screenLayout & 768;
                    int i26 = configuration4.screenLayout & 768;
                    if (i25 != i26) {
                        configuration.screenLayout |= i26;
                    }
                    int i27 = configuration3.colorMode & 3;
                    int i28 = configuration4.colorMode & 3;
                    if (i27 != i28) {
                        configuration.colorMode |= i28;
                    }
                    int i29 = configuration3.colorMode & 12;
                    int i30 = configuration4.colorMode & 12;
                    if (i29 != i30) {
                        configuration.colorMode |= i30;
                    }
                    int i31 = configuration3.uiMode & 15;
                    int i32 = configuration4.uiMode & 15;
                    if (i31 != i32) {
                        configuration.uiMode |= i32;
                    }
                    int i33 = configuration3.uiMode & 48;
                    int i34 = configuration4.uiMode & 48;
                    if (i33 != i34) {
                        configuration.uiMode |= i34;
                    }
                    int i35 = configuration3.screenWidthDp;
                    int i36 = configuration4.screenWidthDp;
                    if (i35 != i36) {
                        configuration.screenWidthDp = i36;
                    }
                    int i37 = configuration3.screenHeightDp;
                    int i38 = configuration4.screenHeightDp;
                    if (i37 != i38) {
                        configuration.screenHeightDp = i38;
                    }
                    int i39 = configuration3.smallestScreenWidthDp;
                    int i40 = configuration4.smallestScreenWidthDp;
                    if (i39 != i40) {
                        configuration.smallestScreenWidthDp = i40;
                    }
                    int i41 = configuration3.densityDpi;
                    int i42 = configuration4.densityDpi;
                    if (i41 != i42) {
                        configuration.densityDpi = i42;
                    }
                }
            }
            Configuration s = c4.s(context, B, o, configuration, true);
            dd ddVar = new dd(context, com.ionia.reidopitaco.libya.R.style.Theme_AppCompat_Empty);
            ddVar.a(s);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = ddVar.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        b6.d(theme);
                    } else {
                        synchronized (g8.e) {
                            if (!g8.g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    g8.f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                }
                                g8.g = true;
                            }
                            Method method = g8.f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e2) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                    g8.f = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = ddVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((c4) j()).z();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // defpackage.ob, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((c4) j()).z();
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
        printWriter.print(this.B);
        printWriter.print(" mResumed=");
        printWriter.print(this.C);
        printWriter.print(" mStopped=");
        printWriter.print(this.D);
        if (getApplication() != null) {
            y5 y5Var = new y5(d(), nq.d);
            String canonicalName = nq.class.getCanonicalName();
            if (canonicalName == null) {
                l8.l("Local and anonymous classes can not be ViewModels");
                return;
            }
            s20 s20Var = ((nq) y5Var.d("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), nq.class)).c;
            if (s20Var.h > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (s20Var.h > 0) {
                    if (s20Var.g[0] != null) {
                        l8.c();
                        return;
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(s20Var.f[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((fk) this.z.g).x.v(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        c4 c4Var = (c4) j();
        c4Var.v();
        return c4Var.q.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        c4 c4Var = (c4) j();
        if (c4Var.t == null) {
            c4Var.z();
            ca0 ca0Var = c4Var.s;
            c4Var.t = new a40(ca0Var != null ? ca0Var.b() : c4Var.p);
        }
        return c4Var.t;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = k70.a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        c4 c4Var = (c4) j();
        if (c4Var.s != null) {
            c4Var.z();
            c4Var.s.getClass();
            c4Var.A(0);
        }
    }

    public final o3 j() {
        if (this.E == null) {
            m3 m3Var = o3.f;
            this.E = new c4(this, null, this, this);
        }
        return this.E;
    }

    public final void l() {
        super.onDestroy();
        ((fk) this.z.g).x.k();
        this.A.d(fp.ON_DESTROY);
    }

    public final boolean m(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((fk) this.z.g).x.i();
        }
        return false;
    }

    public final void n() {
        super.onPostResume();
        this.A.d(fp.ON_RESUME);
        sk skVar = ((fk) this.z.g).x;
        skVar.E = false;
        skVar.F = false;
        skVar.L.h = false;
        skVar.t(7);
    }

    public final void o() {
        j0 j0Var = this.z;
        j0Var.C();
        fk fkVar = (fk) j0Var.g;
        super.onStart();
        this.D = false;
        if (!this.B) {
            this.B = true;
            sk skVar = fkVar.x;
            skVar.E = false;
            skVar.F = false;
            skVar.L.h = false;
            skVar.t(4);
        }
        fkVar.x.y(true);
        this.A.d(fp.ON_START);
        sk skVar2 = fkVar.x;
        skVar2.E = false;
        skVar2.F = false;
        skVar2.L.h = false;
        skVar2.t(5);
    }

    @Override // defpackage.pb, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.z.C();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.pb, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c4 c4Var = (c4) j();
        if (c4Var.J && c4Var.D) {
            c4Var.z();
            ca0 ca0Var = c4Var.s;
            if (ca0Var != null) {
                ca0Var.e(ca0Var.a.getResources().getBoolean(com.ionia.reidopitaco.libya.R.bool.abc_action_bar_embed_tabs));
            }
        }
        f4 a = f4.a();
        Context context = c4Var.p;
        synchronized (a) {
            tz tzVar = a.a;
            synchronized (tzVar) {
                rq rqVar = (rq) tzVar.b.get(context);
                if (rqVar != null) {
                    rqVar.a();
                }
            }
        }
        c4Var.V = new Configuration(c4Var.p.getResources().getConfiguration());
        c4Var.l(false, false);
    }

    @Override // defpackage.pb, defpackage.ob, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A.d(fp.ON_CREATE);
        sk skVar = ((fk) this.z.g).x;
        skVar.E = false;
        skVar.F = false;
        skVar.L.h = false;
        skVar.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((fk) this.z.g).x.f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        l();
        j().d();
    }

    @Override // defpackage.pb, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent H;
        if (!m(i, menuItem)) {
            c4 c4Var = (c4) j();
            c4Var.z();
            ca0 ca0Var = c4Var.s;
            if (menuItem.getItemId() != 16908332 || ca0Var == null || (((r50) ca0Var.e).b & 4) == 0 || (H = g8.H(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(H)) {
                navigateUpTo(H);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent H2 = g8.H(this);
            if (H2 == null) {
                H2 = g8.H(this);
            }
            if (H2 != null) {
                ComponentName component = H2.getComponent();
                if (component == null) {
                    component = H2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent I = g8.I(this, component);
                    while (I != null) {
                        arrayList.add(size, I);
                        I = g8.I(this, I.getComponent());
                    }
                    arrayList.add(H2);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            if (arrayList.isEmpty()) {
                l8.u("No intents added to TaskStackBuilder; cannot startActivities");
                return false;
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.C = false;
        ((fk) this.z.g).x.t(5);
        this.A.d(fp.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((c4) j()).v();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        n();
        c4 c4Var = (c4) j();
        c4Var.z();
        ca0 ca0Var = c4Var.s;
        if (ca0Var != null) {
            ca0Var.t = true;
        }
    }

    @Override // defpackage.pb, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.z.C();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        j0 j0Var = this.z;
        j0Var.C();
        super.onResume();
        this.C = true;
        ((fk) j0Var.g).x.y(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        o();
        ((c4) j()).l(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.z.C();
    }

    @Override // android.app.Activity
    public void onStop() {
        p();
        c4 c4Var = (c4) j();
        c4Var.z();
        ca0 ca0Var = c4Var.s;
        if (ca0Var != null) {
            ca0Var.t = false;
            w80 w80Var = ca0Var.s;
            if (w80Var != null) {
                w80Var.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        j().k(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((c4) j()).z();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final void p() {
        j0 j0Var;
        super.onStop();
        this.D = true;
        do {
            j0Var = this.z;
        } while (k(((fk) j0Var.g).x));
        sk skVar = ((fk) j0Var.g).x;
        skVar.F = true;
        skVar.L.h = true;
        skVar.t(4);
        this.A.d(fp.ON_STOP);
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        i();
        j().h(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((c4) j()).X = i;
    }

    @Override // defpackage.pb, android.app.Activity
    public void setContentView(View view) {
        i();
        j().i(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        j().j(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((fk) this.z.g).x.f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}

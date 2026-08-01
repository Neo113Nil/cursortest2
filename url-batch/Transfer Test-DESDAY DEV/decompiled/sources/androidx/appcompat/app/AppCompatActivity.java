package androidx.appcompat.app;

import B.b;
import B.q;
import G.f;
import T.e;
import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.A;
import e0.g;
import g.C0106g;
import g.C0107h;
import g.I;
import g.InterfaceC0108i;
import g.m;
import g.r;
import g.y;
import j.C0146c;
import j.h;
import j.j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import l.C0236t;
import l.L0;
import l.c1;
import l.e1;
import z.AbstractC0353c;

/* loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements InterfaceC0108i {

    /* renamed from: y, reason: collision with root package name */
    public y f1253y;

    public AppCompatActivity() {
        this.d.f2617b.e("androidx:appcompat", new C0106g(this));
        h(new C0107h(this));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        y yVar = (y) l();
        yVar.v();
        ((ViewGroup) yVar.f2276B.findViewById(R.id.content)).addView(view, layoutParams);
        yVar.f2311m.a(yVar.f2310l.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        y yVar = (y) l();
        yVar.f2289P = true;
        int i = yVar.f2293T;
        if (i == -100) {
            i = m.f2241b;
        }
        int B2 = yVar.B(context, i);
        if (m.b(context) && m.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (m.i) {
                    try {
                        f fVar = m.f2242c;
                        if (fVar == null) {
                            if (m.d == null) {
                                m.d = f.a(AbstractC0353c.e(context));
                            }
                            if (!m.d.f209a.f210a.isEmpty()) {
                                m.f2242c = m.d;
                            }
                        } else if (!fVar.equals(m.d)) {
                            f fVar2 = m.f2242c;
                            m.d = fVar2;
                            AbstractC0353c.d(context, fVar2.f209a.f210a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!m.f2244f) {
                m.f2240a.execute(new g(context, 2));
            }
        }
        f m2 = y.m(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(y.s(context, B2, m2, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C0146c) {
            try {
                ((C0146c) context).a(y.s(context, B2, m2, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (y.f2274k0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = RecyclerView.f1570A0;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = RecyclerView.f1570A0;
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
                    r.a(configuration3, configuration4, configuration);
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
            Configuration s2 = y.s(context, B2, m2, configuration, true);
            C0146c c0146c = new C0146c(context, com.football.transfertrivia.R.style.Theme_AppCompat_Empty);
            c0146c.a(s2);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = c0146c.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        q.a(theme);
                    } else {
                        synchronized (b.f39e) {
                            if (!b.f41g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    b.f40f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e2) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                                }
                                b.f41g = true;
                            }
                            Method method = b.f40f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e3) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                                    b.f40f = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = c0146c;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((y) l()).z();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((y) l()).z();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        y yVar = (y) l();
        yVar.v();
        return yVar.f2310l.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        y yVar = (y) l();
        if (yVar.f2314p == null) {
            yVar.z();
            I i = yVar.f2313o;
            yVar.f2314p = new h(i != null ? i.a0() : yVar.f2309k);
        }
        return yVar.f2314p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = e1.f2994a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        y yVar = (y) l();
        if (yVar.f2313o != null) {
            yVar.z();
            yVar.f2313o.getClass();
            yVar.A(0);
        }
    }

    public final m l() {
        if (this.f1253y == null) {
            A a2 = m.f2240a;
            this.f1253y = new y(this, null, this, this);
        }
        return this.f1253y;
    }

    public final void m() {
        J.g(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        g1.f.e(decorView, "<this>");
        decorView.setTag(com.football.transfertrivia.R.id.view_tree_view_model_store_owner, this);
        h0.f.m(getWindow().getDecorView(), this);
        e.T(getWindow().getDecorView(), this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        y yVar = (y) l();
        if (yVar.f2280G && yVar.f2275A) {
            yVar.z();
            I i = yVar.f2313o;
            if (i != null) {
                i.d0(i.f2184a.getResources().getBoolean(com.football.transfertrivia.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C0236t a2 = C0236t.a();
        Context context = yVar.f2309k;
        synchronized (a2) {
            L0 l02 = a2.f3079a;
            synchronized (l02) {
                o.e eVar = (o.e) l02.f2913b.get(context);
                if (eVar != null) {
                    eVar.a();
                }
            }
        }
        yVar.f2292S = new Configuration(yVar.f2309k.getResources().getConfiguration());
        yVar.k(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        l().d();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent a2;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        y yVar = (y) l();
        yVar.z();
        I i2 = yVar.f2313o;
        if (menuItem.getItemId() == 16908332 && i2 != null && (((c1) i2.f2187e).f2983b & 4) != 0 && (a2 = AbstractC0353c.a(this)) != null) {
            if (!shouldUpRecreateTask(a2)) {
                navigateUpTo(a2);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent a3 = AbstractC0353c.a(this);
            if (a3 == null) {
                a3 = AbstractC0353c.a(this);
            }
            if (a3 != null) {
                ComponentName component = a3.getComponent();
                if (component == null) {
                    component = a3.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent b2 = AbstractC0353c.b(this, component);
                    while (b2 != null) {
                        arrayList.add(size, b2);
                        b2 = AbstractC0353c.b(this, b2.getComponent());
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
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((y) l()).v();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        y yVar = (y) l();
        yVar.z();
        I i = yVar.f2313o;
        if (i != null) {
            i.f2200t = true;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((y) l()).k(true, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        y yVar = (y) l();
        yVar.z();
        I i = yVar.f2313o;
        if (i != null) {
            i.f2200t = false;
            j jVar = i.f2199s;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        l().j(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((y) l()).z();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i) {
        m();
        l().g(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((y) l()).f2294U = i;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        m();
        l().h(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        l().i(view, layoutParams);
    }
}

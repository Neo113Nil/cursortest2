package o;

import android.R;
import android.app.Activity;
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
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.google.firebase.database.core.ValidationPath;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class J4 extends AbstractActivityC0199Ho implements N4, SU {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private V4 mDelegate;
    private Resources mResources;

    public J4() {
        getSavedStateRegistry().c(DELEGATE_TAG, new H4(this));
        addOnContextAvailableListener(new I4(this));
    }

    @Override // o.AbstractActivityC0446Rc, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5 = (LayoutInflaterFactory2C1213i5) getDelegate();
        layoutInflaterFactory2C1213i5.v();
        ((ViewGroup) layoutInflaterFactory2C1213i5.H.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C1213i5.t.a(layoutInflaterFactory2C1213i5.s.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration configuration;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5 = (LayoutInflaterFactory2C1213i5) getDelegate();
        layoutInflaterFactory2C1213i5.V = true;
        int i9 = layoutInflaterFactory2C1213i5.Z;
        if (i9 == -100) {
            i9 = V4.i;
        }
        int B = layoutInflaterFactory2C1213i5.B(context, i9);
        int i10 = 0;
        if (V4.c(context) && V4.c(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (V4.p) {
                    try {
                        IA ia = V4.j;
                        if (ia == null) {
                            if (V4.k == null) {
                                V4.k = IA.a(AbstractC1052fg.L(context));
                            }
                            if (!V4.k.a.a.isEmpty()) {
                                V4.j = V4.k;
                            }
                        } else if (!ia.equals(V4.k)) {
                            IA ia2 = V4.j;
                            V4.k = ia2;
                            AbstractC1052fg.J(context, ia2.a.a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!V4.m) {
                V4.h.execute(new R4(context, i10));
            }
        }
        IA o2 = LayoutInflaterFactory2C1213i5.o(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C1213i5.s(context, B, o2, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C2169we) {
            try {
                ((C2169we) context).a(LayoutInflaterFactory2C1213i5.s(context, B, o2, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (LayoutInflaterFactory2C1213i5.q0) {
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
                    int i11 = configuration3.mcc;
                    int i12 = configuration4.mcc;
                    if (i11 != i12) {
                        configuration.mcc = i12;
                    }
                    int i13 = configuration3.mnc;
                    int i14 = configuration4.mnc;
                    if (i13 != i14) {
                        configuration.mnc = i14;
                    }
                    int i15 = Build.VERSION.SDK_INT;
                    AbstractC0687a5.a(configuration3, configuration4, configuration);
                    int i16 = configuration3.touchscreen;
                    int i17 = configuration4.touchscreen;
                    if (i16 != i17) {
                        configuration.touchscreen = i17;
                    }
                    int i18 = configuration3.keyboard;
                    int i19 = configuration4.keyboard;
                    if (i18 != i19) {
                        configuration.keyboard = i19;
                    }
                    int i20 = configuration3.keyboardHidden;
                    int i21 = configuration4.keyboardHidden;
                    if (i20 != i21) {
                        configuration.keyboardHidden = i21;
                    }
                    int i22 = configuration3.navigation;
                    int i23 = configuration4.navigation;
                    if (i22 != i23) {
                        configuration.navigation = i23;
                    }
                    int i24 = configuration3.navigationHidden;
                    int i25 = configuration4.navigationHidden;
                    if (i24 != i25) {
                        configuration.navigationHidden = i25;
                    }
                    int i26 = configuration3.orientation;
                    int i27 = configuration4.orientation;
                    if (i26 != i27) {
                        configuration.orientation = i27;
                    }
                    int i28 = configuration3.screenLayout & 15;
                    int i29 = configuration4.screenLayout & 15;
                    if (i28 != i29) {
                        configuration.screenLayout |= i29;
                    }
                    int i30 = configuration3.screenLayout & 192;
                    int i31 = configuration4.screenLayout & 192;
                    if (i30 != i31) {
                        configuration.screenLayout |= i31;
                    }
                    int i32 = configuration3.screenLayout & 48;
                    int i33 = configuration4.screenLayout & 48;
                    if (i32 != i33) {
                        configuration.screenLayout |= i33;
                    }
                    int i34 = configuration3.screenLayout & ValidationPath.MAX_PATH_LENGTH_BYTES;
                    int i35 = configuration4.screenLayout & ValidationPath.MAX_PATH_LENGTH_BYTES;
                    if (i34 != i35) {
                        configuration.screenLayout |= i35;
                    }
                    if (i15 >= 26) {
                        i = configuration3.colorMode;
                        int i36 = i & 3;
                        i2 = configuration4.colorMode;
                        if (i36 != (i2 & 3)) {
                            i7 = configuration.colorMode;
                            i8 = configuration4.colorMode;
                            configuration.colorMode = i7 | (i8 & 3);
                        }
                        i3 = configuration3.colorMode;
                        int i37 = i3 & 12;
                        i4 = configuration4.colorMode;
                        if (i37 != (i4 & 12)) {
                            i5 = configuration.colorMode;
                            i6 = configuration4.colorMode;
                            configuration.colorMode = i5 | (i6 & 12);
                        }
                    }
                    int i38 = configuration3.uiMode & 15;
                    int i39 = configuration4.uiMode & 15;
                    if (i38 != i39) {
                        configuration.uiMode |= i39;
                    }
                    int i40 = configuration3.uiMode & 48;
                    int i41 = configuration4.uiMode & 48;
                    if (i40 != i41) {
                        configuration.uiMode |= i41;
                    }
                    int i42 = configuration3.screenWidthDp;
                    int i43 = configuration4.screenWidthDp;
                    if (i42 != i43) {
                        configuration.screenWidthDp = i43;
                    }
                    int i44 = configuration3.screenHeightDp;
                    int i45 = configuration4.screenHeightDp;
                    if (i44 != i45) {
                        configuration.screenHeightDp = i45;
                    }
                    int i46 = configuration3.smallestScreenWidthDp;
                    int i47 = configuration4.smallestScreenWidthDp;
                    if (i46 != i47) {
                        configuration.smallestScreenWidthDp = i47;
                    }
                    int i48 = configuration3.densityDpi;
                    int i49 = configuration4.densityDpi;
                    if (i48 != i49) {
                        configuration.densityDpi = i49;
                    }
                }
            }
            Configuration s = LayoutInflaterFactory2C1213i5.s(context, B, o2, configuration, true);
            C2169we c2169we = new C2169we(context, com.devanos.nilufar.usmonova.R.style.Theme_AppCompat_Empty);
            c2169we.a(s);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = c2169we.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        ZN.a(theme);
                    } else {
                        synchronized (AbstractC1473m3.h) {
                            if (!AbstractC1473m3.j) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    AbstractC1473m3.i = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                }
                                AbstractC1473m3.j = true;
                            }
                            Method method = AbstractC1473m3.i;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e2) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                    AbstractC1473m3.i = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = c2169we;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC1075g1 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // o.AbstractActivityC0420Qc, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC1075g1 supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        ON.q(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        AbstractC0048Bt.n(decorView, "<this>");
        decorView.setTag(com.devanos.nilufar.usmonova.R.id.view_tree_view_model_store_owner, this);
        AbstractC1494mO.k(getWindow().getDecorView(), this);
        AbstractC0772bO.y(getWindow().getDecorView(), this);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5 = (LayoutInflaterFactory2C1213i5) getDelegate();
        layoutInflaterFactory2C1213i5.v();
        return (T) layoutInflaterFactory2C1213i5.s.findViewById(i);
    }

    public V4 getDelegate() {
        if (this.mDelegate == null) {
            U4 u4 = V4.h;
            this.mDelegate = new LayoutInflaterFactory2C1213i5(this, null, this, this);
        }
        return this.mDelegate;
    }

    public InterfaceC1271j1 getDrawerToggleDelegate() {
        ((LayoutInflaterFactory2C1213i5) getDelegate()).getClass();
        return new C1097gL(18);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5 = (LayoutInflaterFactory2C1213i5) getDelegate();
        if (layoutInflaterFactory2C1213i5.w == null) {
            layoutInflaterFactory2C1213i5.z();
            AbstractC1075g1 abstractC1075g1 = layoutInflaterFactory2C1213i5.v;
            layoutInflaterFactory2C1213i5.w = new C1764qU(abstractC1075g1 != null ? abstractC1075g1.e() : layoutInflaterFactory2C1213i5.r);
        }
        return layoutInflaterFactory2C1213i5.w;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i = XY.a;
        }
        return resources == null ? super.getResources() : resources;
    }

    public AbstractC1075g1 getSupportActionBar() {
        LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5 = (LayoutInflaterFactory2C1213i5) getDelegate();
        layoutInflaterFactory2C1213i5.z();
        return layoutInflaterFactory2C1213i5.v;
    }

    @Override // o.SU
    public Intent getSupportParentActivityIntent() {
        return AbstractC0868ct.y(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().b();
    }

    @Override // o.AbstractActivityC0446Rc, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5 = (LayoutInflaterFactory2C1213i5) getDelegate();
        if (layoutInflaterFactory2C1213i5.M && layoutInflaterFactory2C1213i5.G) {
            layoutInflaterFactory2C1213i5.z();
            AbstractC1075g1 abstractC1075g1 = layoutInflaterFactory2C1213i5.v;
            if (abstractC1075g1 != null) {
                abstractC1075g1.g();
            }
        }
        C1409l5 a = C1409l5.a();
        Context context = layoutInflaterFactory2C1213i5.r;
        synchronized (a) {
            VN vn = a.a;
            synchronized (vn) {
                C1219iB c1219iB = (C1219iB) vn.b.get(context);
                if (c1219iB != null) {
                    c1219iB.a();
                }
            }
        }
        layoutInflaterFactory2C1213i5.Y = new Configuration(layoutInflaterFactory2C1213i5.r.getResources().getConfiguration());
        layoutInflaterFactory2C1213i5.m(false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(TU tu) {
        ArrayList arrayList = tu.h;
        J4 j4 = tu.i;
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = AbstractC0868ct.y(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(j4.getPackageManager());
            }
            int size = arrayList.size();
            try {
                for (Intent z = AbstractC0868ct.z(j4, component); z != null; z = AbstractC0868ct.z(j4, z.getComponent())) {
                    arrayList.add(size, z);
                }
                arrayList.add(supportParentActivityIntent);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e);
            }
        }
    }

    @Override // o.AbstractActivityC0199Ho, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // o.AbstractActivityC0199Ho, o.AbstractActivityC0446Rc, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC1075g1 supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // o.AbstractActivityC0446Rc, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C1213i5) getDelegate()).v();
    }

    @Override // o.AbstractActivityC0199Ho, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5 = (LayoutInflaterFactory2C1213i5) getDelegate();
        layoutInflaterFactory2C1213i5.z();
        AbstractC1075g1 abstractC1075g1 = layoutInflaterFactory2C1213i5.v;
        if (abstractC1075g1 != null) {
            abstractC1075g1.m(true);
        }
    }

    @Override // o.AbstractActivityC0199Ho, android.app.Activity
    public void onStart() {
        super.onStart();
        ((LayoutInflaterFactory2C1213i5) getDelegate()).m(true, false);
    }

    @Override // o.AbstractActivityC0199Ho, android.app.Activity
    public void onStop() {
        super.onStop();
        LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5 = (LayoutInflaterFactory2C1213i5) getDelegate();
        layoutInflaterFactory2C1213i5.z();
        AbstractC1075g1 abstractC1075g1 = layoutInflaterFactory2C1213i5.v;
        if (abstractC1075g1 != null) {
            abstractC1075g1.m(false);
        }
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        TU tu = new TU(this);
        onCreateSupportNavigateUpTaskStack(tu);
        onPrepareSupportNavigateUpTaskStack(tu);
        ArrayList arrayList = tu.h;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        tu.i.startActivities(intentArr, null);
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().k(charSequence);
    }

    @Override // o.N4
    public B1 onWindowStartingSupportActionMode(A1 a1) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC1075g1 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // o.AbstractActivityC0446Rc, android.app.Activity
    public void setContentView(int i) {
        e();
        getDelegate().h(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5 = (LayoutInflaterFactory2C1213i5) getDelegate();
        if (layoutInflaterFactory2C1213i5.q instanceof Activity) {
            layoutInflaterFactory2C1213i5.z();
            AbstractC1075g1 abstractC1075g1 = layoutInflaterFactory2C1213i5.v;
            if (abstractC1075g1 instanceof P00) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            layoutInflaterFactory2C1213i5.w = null;
            if (abstractC1075g1 != null) {
                abstractC1075g1.h();
            }
            layoutInflaterFactory2C1213i5.v = null;
            if (toolbar != null) {
                Object obj = layoutInflaterFactory2C1213i5.q;
                C0911dW c0911dW = new C0911dW(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : layoutInflaterFactory2C1213i5.x, layoutInflaterFactory2C1213i5.t);
                layoutInflaterFactory2C1213i5.v = c0911dW;
                layoutInflaterFactory2C1213i5.t.i = c0911dW.c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                layoutInflaterFactory2C1213i5.t.i = null;
            }
            layoutInflaterFactory2C1213i5.b();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C1213i5) getDelegate()).a0 = i;
    }

    public B1 startSupportActionMode(A1 a1) {
        return getDelegate().l(a1);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().b();
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().g(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    @Override // o.AbstractActivityC0446Rc, android.app.Activity
    public void setContentView(View view) {
        e();
        getDelegate().i(view);
    }

    @Override // o.AbstractActivityC0446Rc, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        getDelegate().j(view, layoutParams);
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public void onLocalesChanged(IA ia) {
    }

    public void onNightModeChanged(int i) {
    }

    public void onPrepareSupportNavigateUpTaskStack(TU tu) {
    }

    @Override // o.N4
    public void onSupportActionModeFinished(B1 b1) {
    }

    @Override // o.N4
    public void onSupportActionModeStarted(B1 b1) {
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }
}

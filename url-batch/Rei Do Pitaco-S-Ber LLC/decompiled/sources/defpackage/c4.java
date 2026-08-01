package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class c4 extends o3 implements qs, LayoutInflater.Factory2 {
    public static final e20 l0 = new e20(0);
    public static final int[] m0 = {R.attr.windowBackground};
    public static final boolean n0 = !"robolectric".equals(Build.FINGERPRINT);
    public PopupWindow A;
    public p3 B;
    public boolean D;
    public ViewGroup E;
    public TextView F;
    public View G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public b4[] P;
    public b4 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public Configuration V;
    public final int W;
    public int X;
    public int Y;
    public boolean Z;
    public x3 a0;
    public x3 b0;
    public boolean c0;
    public int d0;
    public boolean f0;
    public Rect g0;
    public Rect h0;
    public x5 i0;
    public OnBackInvokedDispatcher j0;
    public OnBackInvokedCallback k0;
    public final Object o;
    public final Context p;
    public Window q;
    public w3 r;
    public ca0 s;
    public a40 t;
    public CharSequence u;
    public ActionBarOverlayLayout v;
    public q3 w;
    public q3 x;
    public o1 y;
    public ActionBarContextView z;
    public v80 C = null;
    public final p3 e0 = new p3(this, 0);

    public c4(Context context, Window window, e3 e3Var, Object obj) {
        b3 b3Var = null;
        this.W = -100;
        this.p = context;
        this.o = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof b3)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        b3Var = (b3) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (b3Var != null) {
                this.W = ((c4) b3Var.j()).W;
            }
        }
        if (this.W == -100) {
            String name = this.o.getClass().getName();
            e20 e20Var = l0;
            Integer num = (Integer) e20Var.get(name);
            if (num != null) {
                this.W = num.intValue();
                e20Var.remove(this.o.getClass().getName());
            }
        }
        if (window != null) {
            m(window);
        }
        f4.d();
    }

    public static oq o(Context context) {
        oq oqVar;
        oq oqVar2;
        if (Build.VERSION.SDK_INT >= 33 || (oqVar = o3.h) == null) {
            return null;
        }
        pq pqVar = oqVar.a;
        oq b = t3.b(context.getApplicationContext().getResources().getConfiguration());
        if (pqVar.a.isEmpty()) {
            oqVar2 = oq.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b.a.a.size() + pqVar.a.size()) {
                Locale locale = i < pqVar.a.size() ? pqVar.a.get(i) : b.a.a.get(i - pqVar.a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            oqVar2 = new oq(new pq(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return oqVar2.a.a.isEmpty() ? b : oqVar2;
    }

    public static Configuration s(Context context, int i, oq oqVar, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (oqVar != null) {
            t3.d(configuration2, oqVar);
        }
        return configuration2;
    }

    public final void A(int i) {
        this.d0 = (1 << i) | this.d0;
        if (this.c0) {
            return;
        }
        View decorView = this.q.getDecorView();
        WeakHashMap weakHashMap = f80.a;
        decorView.postOnAnimation(this.e0);
        this.c0 = true;
    }

    public final int B(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            l8.u("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        if (this.b0 == null) {
                            this.b0 = new x3(this, context);
                        }
                        return this.b0.f();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return x(context).f();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean C() {
        ae aeVar;
        m50 m50Var;
        boolean z = this.R;
        this.R = false;
        b4 y = y(0);
        if (!y.m) {
            o1 o1Var = this.y;
            if (o1Var != null) {
                o1Var.a();
                return true;
            }
            z();
            ca0 ca0Var = this.s;
            if (ca0Var == null || (aeVar = ca0Var.e) == null || (m50Var = ((r50) aeVar).a.Q) == null || m50Var.g == null) {
                return false;
            }
            m50 m50Var2 = ((r50) aeVar).a.Q;
            vs vsVar = m50Var2 == null ? null : m50Var2.g;
            if (vsVar != null) {
                vsVar.collapseActionView();
            }
        } else if (!z) {
            r(y, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0176, code lost:
    
        if (r2.k.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0156, code lost:
    
        if (r2 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(b4 b4Var, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = b4Var.m;
        int i2 = b4Var.a;
        if (z || this.U) {
            return;
        }
        Context context = this.p;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.q.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, b4Var.h)) {
            r(b4Var, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !F(b4Var, keyEvent)) {
            return;
        }
        a4 a4Var = b4Var.e;
        if (a4Var == null || b4Var.n) {
            if (a4Var == null) {
                z();
                ca0 ca0Var = this.s;
                Context b = ca0Var != null ? ca0Var.b() : null;
                if (b != null) {
                    context = b;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.ionia.reidopitaco.libya.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    newTheme.applyStyle(i3, true);
                }
                newTheme.resolveAttribute(com.ionia.reidopitaco.libya.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                } else {
                    newTheme.applyStyle(com.ionia.reidopitaco.libya.R.style.Theme_AppCompat_CompactMenu, true);
                }
                dd ddVar = new dd(context, 0);
                ddVar.getTheme().setTo(newTheme);
                b4Var.j = ddVar;
                TypedArray obtainStyledAttributes = ddVar.obtainStyledAttributes(kx.j);
                b4Var.b = obtainStyledAttributes.getResourceId(86, 0);
                b4Var.d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                b4Var.e = new a4(this, b4Var.j);
                b4Var.c = 81;
            } else if (b4Var.n && a4Var.getChildCount() > 0) {
                b4Var.e.removeAllViews();
            }
            View view = b4Var.g;
            if (view == null) {
                if (b4Var.h != null) {
                    if (this.x == null) {
                        this.x = new q3(this, 3);
                    }
                    q3 q3Var = this.x;
                    if (b4Var.i == null) {
                        bq bqVar = new bq(b4Var.j);
                        b4Var.i = bqVar;
                        bqVar.j = q3Var;
                        ss ssVar = b4Var.h;
                        ssVar.b(bqVar, ssVar.a);
                    }
                    bq bqVar2 = b4Var.i;
                    a4 a4Var2 = b4Var.e;
                    if (bqVar2.i == null) {
                        bqVar2.i = (ExpandedMenuView) bqVar2.g.inflate(com.ionia.reidopitaco.libya.R.layout.abc_expanded_menu_layout, (ViewGroup) a4Var2, false);
                        if (bqVar2.k == null) {
                            bqVar2.k = new aq(bqVar2);
                        }
                        bqVar2.i.setAdapter((ListAdapter) bqVar2.k);
                        bqVar2.i.setOnItemClickListener(bqVar2);
                    }
                    ExpandedMenuView expandedMenuView = bqVar2.i;
                    b4Var.f = expandedMenuView;
                }
                b4Var.n = true;
                return;
            }
            b4Var.f = view;
            if (b4Var.f != null) {
                if (b4Var.g == null) {
                    bq bqVar3 = b4Var.i;
                    if (bqVar3.k == null) {
                        bqVar3.k = new aq(bqVar3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = b4Var.f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                b4Var.e.setBackgroundResource(b4Var.b);
                ViewParent parent = b4Var.f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(b4Var.f);
                }
                b4Var.e.addView(b4Var.f, layoutParams2);
                if (!b4Var.f.hasFocus()) {
                    b4Var.f.requestFocus();
                }
            }
            b4Var.n = true;
            return;
        }
        View view2 = b4Var.g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            b4Var.l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = b4Var.c;
            layoutParams3.windowAnimations = b4Var.d;
            windowManager.addView(b4Var.e, layoutParams3);
            b4Var.m = true;
            if (i2 != 0) {
                H();
                return;
            }
            return;
        }
        i = -2;
        b4Var.l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = b4Var.c;
        layoutParams32.windowAnimations = b4Var.d;
        windowManager.addView(b4Var.e, layoutParams32);
        b4Var.m = true;
        if (i2 != 0) {
        }
    }

    public final boolean E(b4 b4Var, int i, KeyEvent keyEvent) {
        ss ssVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((b4Var.k || F(b4Var, keyEvent)) && (ssVar = b4Var.h) != null) {
            return ssVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cb, code lost:
    
        if (r13.h == null) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F(b4 b4Var, KeyEvent keyEvent) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        Resources.Theme theme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.U) {
            boolean z = b4Var.k;
            int i = b4Var.a;
            if (z) {
                return true;
            }
            b4 b4Var2 = this.Q;
            if (b4Var2 != null && b4Var2 != b4Var) {
                r(b4Var2, false);
            }
            Window.Callback callback = this.q.getCallback();
            if (callback != null) {
                b4Var.g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.v) != null) {
                actionBarOverlayLayout4.k();
                ((r50) actionBarOverlayLayout4.j).l = true;
            }
            if (b4Var.g == null) {
                ss ssVar = b4Var.h;
                if (ssVar == null || b4Var.o) {
                    if (ssVar == null) {
                        Context context = this.p;
                        if ((i == 0 || i == 108) && this.v != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(com.ionia.reidopitaco.libya.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(com.ionia.reidopitaco.libya.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(com.ionia.reidopitaco.libya.R.attr.actionBarWidgetTheme, typedValue, true);
                                theme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (theme == null) {
                                    theme = context.getResources().newTheme();
                                    theme.setTo(theme2);
                                }
                                theme.applyStyle(typedValue.resourceId, true);
                            }
                            if (theme != null) {
                                dd ddVar = new dd(context, 0);
                                ddVar.getTheme().setTo(theme);
                                context = ddVar;
                            }
                        }
                        ss ssVar2 = new ss(context);
                        ssVar2.e = this;
                        ss ssVar3 = b4Var.h;
                        if (ssVar2 != ssVar3) {
                            if (ssVar3 != null) {
                                ssVar3.r(b4Var.i);
                            }
                            b4Var.h = ssVar2;
                            bq bqVar = b4Var.i;
                            if (bqVar != null) {
                                ssVar2.b(bqVar, ssVar2.a);
                            }
                        }
                    }
                    if (z2 && (actionBarOverlayLayout2 = this.v) != null) {
                        if (this.w == null) {
                            this.w = new q3(this, 2);
                        }
                        actionBarOverlayLayout2.l(b4Var.h, this.w);
                    }
                    b4Var.h.w();
                    if (callback.onCreatePanelMenu(i, b4Var.h)) {
                        b4Var.o = false;
                    } else {
                        ss ssVar4 = b4Var.h;
                        if (ssVar4 != null) {
                            if (ssVar4 != null) {
                                ssVar4.r(b4Var.i);
                            }
                            b4Var.h = null;
                        }
                        if (z2 && (actionBarOverlayLayout = this.v) != null) {
                            actionBarOverlayLayout.l(null, this.w);
                        }
                    }
                }
                b4Var.h.w();
                Bundle bundle = b4Var.p;
                if (bundle != null) {
                    b4Var.h.s(bundle);
                    b4Var.p = null;
                }
                if (!callback.onPreparePanel(0, b4Var.g, b4Var.h)) {
                    if (z2 && (actionBarOverlayLayout3 = this.v) != null) {
                        actionBarOverlayLayout3.l(null, this.w);
                    }
                    b4Var.h.v();
                    return false;
                }
                b4Var.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                b4Var.h.v();
            }
            b4Var.k = true;
            b4Var.l = false;
            this.Q = b4Var;
            return true;
        }
        return false;
    }

    public final void G() {
        if (this.D) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.j0 != null && (y(0).m || this.y != null)) {
                z = true;
            }
            if (z && this.k0 == null) {
                this.k0 = v3.b(this.j0, this);
            } else {
                if (z || (onBackInvokedCallback = this.k0) == null) {
                    return;
                }
                v3.c(this.j0, onBackInvokedCallback);
                this.k0 = null;
            }
        }
    }

    @Override // defpackage.o3
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.p);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof c4) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.o3
    public final void c() {
        String str;
        this.S = true;
        l(false, true);
        w();
        Object obj = this.o;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = g8.J(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                ca0 ca0Var = this.s;
                if (ca0Var == null) {
                    this.f0 = true;
                } else {
                    ca0Var.d(true);
                }
            }
            synchronized (o3.m) {
                o3.e(this);
                o3.l.add(new WeakReference(this));
            }
        }
        this.V = new Configuration(this.p.getResources().getConfiguration());
        this.T = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.o3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        x3 x3Var;
        x3 x3Var2;
        if (this.o instanceof Activity) {
            synchronized (o3.m) {
                o3.e(this);
            }
        }
        if (this.c0) {
            this.q.getDecorView().removeCallbacks(this.e0);
        }
        this.U = true;
        if (this.W != -100) {
            Object obj = this.o;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                l0.put(this.o.getClass().getName(), Integer.valueOf(this.W));
                x3Var = this.a0;
                if (x3Var != null) {
                    x3Var.c();
                }
                x3Var2 = this.b0;
                if (x3Var2 == null) {
                    x3Var2.c();
                    return;
                }
                return;
            }
        }
        l0.remove(this.o.getClass().getName());
        x3Var = this.a0;
        if (x3Var != null) {
        }
        x3Var2 = this.b0;
        if (x3Var2 == null) {
        }
    }

    @Override // defpackage.qs
    public final boolean f(ss ssVar, MenuItem menuItem) {
        b4 b4Var;
        Window.Callback callback = this.q.getCallback();
        if (callback != null && !this.U) {
            ss k = ssVar.k();
            b4[] b4VarArr = this.P;
            int length = b4VarArr != null ? b4VarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    b4Var = b4VarArr[i];
                    if (b4Var != null && b4Var.h == k) {
                        break;
                    }
                    i++;
                } else {
                    b4Var = null;
                    break;
                }
            }
            if (b4Var != null) {
                return callback.onMenuItemSelected(b4Var.a, menuItem);
            }
        }
        return false;
    }

    @Override // defpackage.o3
    public final boolean g(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.N && i == 108) {
            return false;
        }
        if (this.J && i == 1) {
            this.J = false;
        }
        if (i == 1) {
            G();
            this.N = true;
            return true;
        }
        if (i == 2) {
            G();
            this.H = true;
            return true;
        }
        if (i == 5) {
            G();
            this.I = true;
            return true;
        }
        if (i == 10) {
            G();
            this.L = true;
            return true;
        }
        if (i == 108) {
            G();
            this.J = true;
            return true;
        }
        if (i != 109) {
            return this.q.requestFeature(i);
        }
        G();
        this.K = true;
        return true;
    }

    @Override // defpackage.o3
    public final void h(int i) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.p).inflate(i, viewGroup);
        this.r.a(this.q.getCallback());
    }

    @Override // defpackage.o3
    public final void i(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.r.a(this.q.getCallback());
    }

    @Override // defpackage.o3
    public final void j(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.r.a(this.q.getCallback());
    }

    @Override // defpackage.o3
    public final void k(CharSequence charSequence) {
        this.u = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.v;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        ca0 ca0Var = this.s;
        if (ca0Var == null) {
            TextView textView = this.F;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        r50 r50Var = (r50) ca0Var.e;
        if (r50Var.g) {
            return;
        }
        Toolbar toolbar = r50Var.a;
        r50Var.h = charSequence;
        if ((r50Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (r50Var.g) {
                f80.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(boolean z, boolean z2) {
        int i;
        Configuration configuration;
        oq b;
        int i2;
        boolean z3;
        Activity activity;
        if (this.U) {
            return false;
        }
        int i3 = this.W;
        if (i3 == -100) {
            i3 = o3.g;
        }
        Context context = this.p;
        int B = B(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        oq o = i4 < 33 ? o(context) : null;
        if (!z2 && o != null) {
            o = t3.b(context.getResources().getConfiguration());
        }
        Configuration s = s(context, B, o, null, false);
        boolean z4 = this.Z;
        boolean z5 = true;
        Object obj = this.o;
        if (!z4 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.V;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i5 = configuration.uiMode & 48;
                int i6 = s.uiMode & 48;
                oq b2 = t3.b(configuration);
                b = o != null ? null : t3.b(s);
                i2 = i5 == i6 ? 512 : 0;
                if (b != null && !b2.equals(b)) {
                    i2 |= 8196;
                }
                if (((~i) & i2) != 0 && z && this.S && ((n0 || this.T) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31 && (i2 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(s.getLayoutDirection());
                        }
                        if (i7 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new p1(r1, activity));
                        }
                        z3 = true;
                        if (!z3 || i2 == 0) {
                            z5 = z3;
                        } else {
                            r1 = (i2 & i) == i2 ? 1 : 0;
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i6;
                            if (b != null) {
                                t3.d(configuration2, b);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i8 = this.X;
                            if (i8 != 0) {
                                context.setTheme(i8);
                                context.getTheme().applyStyle(this.X, true);
                            }
                            if (r1 != 0 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof lp) {
                                    if (((lp) activity2).e().c.compareTo(gp.h) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.T && !this.U) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (b != null) {
                            t3.c(t3.b(context.getResources().getConfiguration()));
                        }
                        if (i3 == 0) {
                            x(context).i();
                        } else {
                            x3 x3Var = this.a0;
                            if (x3Var != null) {
                                x3Var.c();
                            }
                        }
                        x3 x3Var2 = this.b0;
                        if (i3 == 3) {
                            if (x3Var2 == null) {
                                this.b0 = new x3(this, context);
                            }
                            this.b0.i();
                        } else if (x3Var2 != null) {
                            x3Var2.c();
                        }
                        return z5;
                    }
                }
                z3 = false;
                if (z3) {
                }
                z5 = z3;
                if (b != null) {
                }
                if (i3 == 0) {
                }
                x3 x3Var22 = this.b0;
                if (i3 == 3) {
                }
                return z5;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i4 >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.Y = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.Y = 0;
            }
        }
        this.Z = true;
        i = this.Y;
        configuration = this.V;
        if (configuration == null) {
        }
        int i52 = configuration.uiMode & 48;
        int i62 = s.uiMode & 48;
        oq b22 = t3.b(configuration);
        if (o != null) {
        }
        if (i52 == i62) {
        }
        if (b != null) {
            i2 |= 8196;
        }
        if (((~i) & i2) != 0) {
            activity = (Activity) obj;
            if (!activity.isChild()) {
            }
        }
        z3 = false;
        if (z3) {
        }
        z5 = z3;
        if (b != null) {
        }
        if (i3 == 0) {
        }
        x3 x3Var222 = this.b0;
        if (i3 == 3) {
        }
        return z5;
    }

    public final void m(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.q != null) {
            l8.u("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof w3) {
            l8.u("AppCompat has already installed itself into the Window");
            return;
        }
        w3 w3Var = new w3(this, callback);
        this.r = w3Var;
        window.setCallback(w3Var);
        Context context = this.p;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, m0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            f4 a = f4.a();
            synchronized (a) {
                drawable = a.a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.q = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.j0) != null) {
            return;
        }
        Object obj = this.o;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.k0) != null) {
            v3.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.k0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.j0 = v3.a(activity);
                H();
            }
        }
        this.j0 = null;
        H();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r6.h() != false) goto L20;
     */
    @Override // defpackage.qs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(ss ssVar) {
        ActionMenuView actionMenuView;
        k1 k1Var;
        k1 k1Var2;
        k1 k1Var3;
        ActionBarOverlayLayout actionBarOverlayLayout = this.v;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((r50) actionBarOverlayLayout.j).a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f) != null && actionMenuView.x) {
                if (ViewConfiguration.get(this.p).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = this.v;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((r50) actionBarOverlayLayout2.j).a.f;
                    if (actionMenuView2 != null) {
                        k1 k1Var4 = actionMenuView2.y;
                        if (k1Var4 != null) {
                            if (k1Var4.A == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.q.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = this.v;
                actionBarOverlayLayout3.k();
                ActionMenuView actionMenuView3 = ((r50) actionBarOverlayLayout3.j).a.f;
                if (actionMenuView3 != null && (k1Var2 = actionMenuView3.y) != null && k1Var2.h()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.v;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView4 = ((r50) actionBarOverlayLayout4.j).a.f;
                    if (actionMenuView4 != null && (k1Var3 = actionMenuView4.y) != null) {
                        k1Var3.d();
                    }
                    if (this.U) {
                        return;
                    }
                    callback.onPanelClosed(108, y(0).h);
                    return;
                }
                if (callback == null || this.U) {
                    return;
                }
                if (this.c0 && (1 & this.d0) != 0) {
                    View decorView = this.q.getDecorView();
                    p3 p3Var = this.e0;
                    decorView.removeCallbacks(p3Var);
                    p3Var.run();
                }
                b4 y = y(0);
                ss ssVar2 = y.h;
                if (ssVar2 == null || y.o || !callback.onPreparePanel(0, y.g, ssVar2)) {
                    return;
                }
                callback.onMenuOpened(108, y.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = this.v;
                actionBarOverlayLayout5.k();
                ActionMenuView actionMenuView5 = ((r50) actionBarOverlayLayout5.j).a.f;
                if (actionMenuView5 == null || (k1Var = actionMenuView5.y) == null) {
                    return;
                }
                k1Var.n();
                return;
            }
        }
        b4 y2 = y(0);
        y2.n = true;
        r(y2, false);
        D(y2, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x010e, code lost:
    
        if (r10.equals("ImageButton") == false) goto L24;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View q4Var;
        View view2 = null;
        if (this.i0 == null) {
            int[] iArr = kx.j;
            Context context2 = this.p;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.i0 = new x5();
            } else {
                try {
                    this.i0 = (x5) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.i0 = new x5();
                }
            }
        }
        x5 x5Var = this.i0;
        int i = k70.a;
        x5Var.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, kx.x, 0, 0);
        char c = 4;
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context ddVar = (resourceId == 0 || ((context instanceof dd) && ((dd) context).a == resourceId)) ? context : new dd(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -937446323:
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                q4Var = new q4(ddVar, attributeSet);
                break;
            case 1:
                q4Var = new g3(ddVar, attributeSet);
                break;
            case 2:
                q4Var = new m4(ddVar, attributeSet);
                break;
            case 3:
                q4Var = x5Var.e(ddVar, attributeSet);
                break;
            case 4:
                q4Var = new j4(ddVar, attributeSet, com.ionia.reidopitaco.libya.R.attr.imageButtonStyle);
                break;
            case 5:
                q4Var = new s4(ddVar, attributeSet);
                break;
            case 6:
                q4Var = new e5(ddVar, attributeSet);
                break;
            case 7:
                q4Var = x5Var.d(ddVar, attributeSet);
                break;
            case '\b':
                q4Var = new v5(ddVar, attributeSet);
                break;
            case '\t':
                q4Var = new l4(ddVar, attributeSet, 0);
                break;
            case '\n':
                q4Var = x5Var.a(ddVar, attributeSet);
                break;
            case 11:
                q4Var = x5Var.c(ddVar, attributeSet);
                break;
            case '\f':
                q4Var = new h4(ddVar, attributeSet);
                break;
            case '\r':
                q4Var = x5Var.b(ddVar, attributeSet);
                break;
            default:
                q4Var = null;
                break;
        }
        if (q4Var == null && context != ddVar) {
            Object[] objArr = x5Var.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = ddVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = x5.g;
                        if (i2 < 3) {
                            View f = x5Var.f(ddVar, str, strArr[i2]);
                            if (f != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = f;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View f2 = x5Var.f(ddVar, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = f2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            q4Var = view2;
        }
        if (q4Var != null) {
            Context context3 = q4Var.getContext();
            if ((context3 instanceof ContextWrapper) && q4Var.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, x5.c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    q4Var.setOnClickListener(new w5(q4Var, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = ddVar.obtainStyledAttributes(attributeSet, x5.d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = f80.a;
                    new t70(com.ionia.reidopitaco.libya.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(q4Var, Boolean.valueOf(z));
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = ddVar.obtainStyledAttributes(attributeSet, x5.e);
                if (obtainStyledAttributes5.hasValue(0)) {
                    f80.n(q4Var, obtainStyledAttributes5.getString(0));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = ddVar.obtainStyledAttributes(attributeSet, x5.f);
                if (obtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = f80.a;
                    new t70(com.ionia.reidopitaco.libya.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).d(q4Var, Boolean.valueOf(z2));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return q4Var;
    }

    public final void p(int i, b4 b4Var, ss ssVar) {
        if (ssVar == null) {
            if (b4Var == null && i >= 0) {
                b4[] b4VarArr = this.P;
                if (i < b4VarArr.length) {
                    b4Var = b4VarArr[i];
                }
            }
            if (b4Var != null) {
                ssVar = b4Var.h;
            }
        }
        if ((b4Var == null || b4Var.m) && !this.U) {
            w3 w3Var = this.r;
            Window.Callback callback = this.q.getCallback();
            w3Var.getClass();
            try {
                w3Var.i = true;
                callback.onPanelClosed(i, ssVar);
            } finally {
                w3Var.i = false;
            }
        }
    }

    public final void q(ss ssVar) {
        k1 k1Var;
        if (this.O) {
            return;
        }
        this.O = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.v;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((r50) actionBarOverlayLayout.j).a.f;
        if (actionMenuView != null && (k1Var = actionMenuView.y) != null) {
            k1Var.d();
            e1 e1Var = k1Var.z;
            if (e1Var != null && e1Var.b()) {
                e1Var.j.dismiss();
            }
        }
        Window.Callback callback = this.q.getCallback();
        if (callback != null && !this.U) {
            callback.onPanelClosed(108, ssVar);
        }
        this.O = false;
    }

    public final void r(b4 b4Var, boolean z) {
        a4 a4Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        k1 k1Var;
        if (z && b4Var.a == 0 && (actionBarOverlayLayout = this.v) != null) {
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((r50) actionBarOverlayLayout.j).a.f;
            if (actionMenuView != null && (k1Var = actionMenuView.y) != null && k1Var.h()) {
                q(b4Var.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.p.getSystemService("window");
        if (windowManager != null && b4Var.m && (a4Var = b4Var.e) != null) {
            windowManager.removeView(a4Var);
            if (z) {
                p(b4Var.a, b4Var, null);
            }
        }
        b4Var.k = false;
        b4Var.l = false;
        b4Var.m = false;
        b4Var.f = null;
        b4Var.n = true;
        if (this.Q == b4Var) {
            this.Q = null;
        }
        if (b4Var.a == 0) {
            H();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
    
        if (r6.d() != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00fa, code lost:
    
        if (r6.n() != false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(KeyEvent keyEvent) {
        View decorView;
        boolean z;
        boolean z2;
        ActionMenuView actionMenuView;
        k1 k1Var;
        Object obj = this.o;
        if ((!(obj instanceof xo) && !(obj instanceof h2)) || (decorView = this.q.getDecorView()) == null || !vv.m(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                w3 w3Var = this.r;
                Window.Callback callback = this.q.getCallback();
                w3Var.getClass();
                try {
                    w3Var.h = true;
                } finally {
                    w3Var.h = false;
                }
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode == 4) {
                    this.R = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        b4 y = y(0);
                        if (!y.m) {
                            F(y, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.y == null) {
                        b4 y2 = y(0);
                        ActionBarOverlayLayout actionBarOverlayLayout = this.v;
                        Context context = this.p;
                        if (actionBarOverlayLayout != null) {
                            actionBarOverlayLayout.k();
                            Toolbar toolbar = ((r50) actionBarOverlayLayout.j).a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f) != null && actionMenuView.x && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = this.v;
                                actionBarOverlayLayout2.k();
                                ActionMenuView actionMenuView2 = ((r50) actionBarOverlayLayout2.j).a.f;
                                if (actionMenuView2 == null || (k1Var = actionMenuView2.y) == null || !k1Var.h()) {
                                    if (!this.U && F(y2, keyEvent)) {
                                        ActionBarOverlayLayout actionBarOverlayLayout3 = this.v;
                                        actionBarOverlayLayout3.k();
                                        ActionMenuView actionMenuView3 = ((r50) actionBarOverlayLayout3.j).a.f;
                                        if (actionMenuView3 != null) {
                                            k1 k1Var2 = actionMenuView3.y;
                                            if (k1Var2 != null) {
                                            }
                                        }
                                    }
                                    z = false;
                                } else {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.v;
                                    actionBarOverlayLayout4.k();
                                    ActionMenuView actionMenuView4 = ((r50) actionBarOverlayLayout4.j).a.f;
                                    if (actionMenuView4 != null) {
                                        k1 k1Var3 = actionMenuView4.y;
                                        if (k1Var3 != null) {
                                        }
                                    }
                                    z = false;
                                }
                                if (z) {
                                    AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                    if (audioManager != null) {
                                        audioManager.playSoundEffect(0);
                                        return true;
                                    }
                                    Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                    return true;
                                }
                            }
                        }
                        boolean z3 = y2.m;
                        if (z3 || y2.l) {
                            r(y2, true);
                            z = z3;
                            if (z) {
                            }
                        } else {
                            if (y2.k) {
                                if (y2.o) {
                                    y2.k = false;
                                    z2 = F(y2, keyEvent);
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    D(y2, keyEvent);
                                    z = true;
                                    if (z) {
                                    }
                                }
                            }
                            z = false;
                            if (z) {
                            }
                        }
                    }
                }
                return false;
            }
            if (!C()) {
                return false;
            }
        }
        return true;
    }

    public final void u(int i) {
        b4 y = y(i);
        if (y.h != null) {
            Bundle bundle = new Bundle();
            y.h.t(bundle);
            if (bundle.size() > 0) {
                y.p = bundle;
            }
            y.h.w();
            y.h.clear();
        }
        y.o = true;
        y.n = true;
        if ((i == 108 || i == 0) && this.v != null) {
            b4 y2 = y(0);
            y2.k = false;
            F(y2, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        if (this.D) {
            return;
        }
        Context context = this.p;
        int[] iArr = kx.j;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            l8.u("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        int i = 0;
        int i2 = 1;
        if (obtainStyledAttributes.getBoolean(126, false)) {
            g(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            g(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            g(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            g(10);
        }
        this.M = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        w();
        this.q.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.N) {
            viewGroup = this.L ? (ViewGroup) from.inflate(com.ionia.reidopitaco.libya.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.ionia.reidopitaco.libya.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.M) {
            viewGroup = (ViewGroup) from.inflate(com.ionia.reidopitaco.libya.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.K = false;
            this.J = false;
        } else if (this.J) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.ionia.reidopitaco.libya.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new dd(context, typedValue.resourceId) : context).inflate(com.ionia.reidopitaco.libya.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(com.ionia.reidopitaco.libya.R.id.decor_content_parent);
            this.v = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.q.getCallback());
            if (this.K) {
                this.v.j(109);
            }
            if (this.H) {
                this.v.j(2);
            }
            if (this.I) {
                this.v.j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.J + ", windowActionBarOverlay: " + this.K + ", android:windowIsFloating: " + this.M + ", windowActionModeOverlay: " + this.L + ", windowNoTitle: " + this.N + " }");
        }
        q3 q3Var = new q3(this, i);
        WeakHashMap weakHashMap = f80.a;
        x70.c(viewGroup, q3Var);
        if (this.v == null) {
            this.F = (TextView) viewGroup.findViewById(com.ionia.reidopitaco.libya.R.id.title);
        }
        boolean z = h90.a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.ionia.reidopitaco.libya.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.q.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.q.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new q3(this, i2));
        this.E = viewGroup;
        Object obj = this.o;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.u;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.v;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                ca0 ca0Var = this.s;
                if (ca0Var != null) {
                    r50 r50Var = (r50) ca0Var.e;
                    if (!r50Var.g) {
                        Toolbar toolbar = r50Var.a;
                        r50Var.h = title;
                        if ((r50Var.b & 8) != 0) {
                            toolbar.setTitle(title);
                            if (r50Var.g) {
                                f80.n(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.F;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.E.findViewById(R.id.content);
        View decorView = this.q.getDecorView();
        contentFrameLayout2.l.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(122)) {
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.D = true;
        b4 y = y(0);
        if (this.U || y.h != null) {
            return;
        }
        A(108);
    }

    public final void w() {
        if (this.q == null) {
            Object obj = this.o;
            if (obj instanceof Activity) {
                m(((Activity) obj).getWindow());
            }
        }
        if (this.q != null) {
            return;
        }
        l8.u("We have not been given a Window");
    }

    public final z3 x(Context context) {
        if (this.a0 == null) {
            if (y5.f == null) {
                Context applicationContext = context.getApplicationContext();
                LocationManager locationManager = (LocationManager) applicationContext.getSystemService("location");
                y5 y5Var = new y5();
                y5Var.b = new l60();
                y5Var.c = applicationContext;
                y5Var.a = locationManager;
                y5.f = y5Var;
            }
            this.a0 = new x3(this, y5.f);
        }
        return this.a0;
    }

    public final b4 y(int i) {
        b4[] b4VarArr = this.P;
        if (b4VarArr == null || b4VarArr.length <= i) {
            b4[] b4VarArr2 = new b4[i + 1];
            if (b4VarArr != null) {
                System.arraycopy(b4VarArr, 0, b4VarArr2, 0, b4VarArr.length);
            }
            this.P = b4VarArr2;
            b4VarArr = b4VarArr2;
        }
        b4 b4Var = b4VarArr[i];
        if (b4Var != null) {
            return b4Var;
        }
        b4 b4Var2 = new b4();
        b4Var2.a = i;
        b4Var2.n = false;
        b4VarArr[i] = b4Var2;
        return b4Var2;
    }

    public final void z() {
        v();
        if (this.J && this.s == null) {
            Object obj = this.o;
            if (obj instanceof Activity) {
                this.s = new ca0((Activity) obj, this.K);
            } else if (obj instanceof Dialog) {
                this.s = new ca0((Dialog) obj);
            }
            ca0 ca0Var = this.s;
            if (ca0Var != null) {
                ca0Var.d(this.f0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}

package o;

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
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
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
import androidx.appcompat.widget.ViewStubCompat;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* renamed from: o.i5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C1213i5 extends V4 implements InterfaceC0694aC, LayoutInflater.Factory2 {
    public static final GR o0 = new GR(0);
    public static final int[] p0 = {R.attr.windowBackground};
    public static final boolean q0 = !"robolectric".equals(Build.FINGERPRINT);
    public X4 A;
    public B1 B;
    public ActionBarContextView C;
    public PopupWindow D;
    public W4 E;
    public boolean G;
    public ViewGroup H;
    public TextView I;
    public View J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public C1147h5[] S;
    public C1147h5 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public Configuration Y;
    public final int Z;
    public int a0;
    public int b0;
    public boolean c0;
    public C0949e5 d0;
    public C0949e5 e0;
    public boolean f0;
    public int g0;
    public boolean i0;
    public Rect j0;
    public Rect k0;
    public C0885d6 l0;
    public OnBackInvokedDispatcher m0;
    public OnBackInvokedCallback n0;
    public final Object q;
    public final Context r;
    public Window s;
    public WindowCallbackC0884d5 t;
    public final Object u;
    public AbstractC1075g1 v;
    public C1764qU w;
    public CharSequence x;
    public InterfaceC1644og y;
    public X4 z;
    public C0942e00 F = null;
    public final W4 h0 = new W4(this, 0);

    public LayoutInflaterFactory2C1213i5(Context context, Window window, N4 n4, Object obj) {
        J4 j4 = null;
        this.Z = -100;
        this.r = context;
        this.u = n4;
        this.q = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof J4)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        j4 = (J4) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (j4 != null) {
                this.Z = ((LayoutInflaterFactory2C1213i5) j4.getDelegate()).Z;
            }
        }
        if (this.Z == -100) {
            String name = this.q.getClass().getName();
            GR gr = o0;
            Integer num = (Integer) gr.get(name);
            if (num != null) {
                this.Z = num.intValue();
                gr.remove(this.q.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        C1409l5.c();
    }

    public static IA o(Context context) {
        IA ia;
        IA ia2;
        if (Build.VERSION.SDK_INT >= 33 || (ia = V4.j) == null) {
            return null;
        }
        KA ka = ia.a;
        IA b = AbstractC0687a5.b(context.getApplicationContext().getResources().getConfiguration());
        if (ka.a.isEmpty()) {
            ia2 = IA.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b.a.a.size() + ka.a.size()) {
                Locale locale = i < ka.a.size() ? ka.a.get(i) : b.a.a.get(i - ka.a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            ia2 = new IA(new KA(HA.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return ia2.a.a.isEmpty() ? b : ia2;
    }

    public static Configuration s(Context context, int i, IA ia, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (ia != null) {
            AbstractC0687a5.d(configuration2, ia);
        }
        return configuration2;
    }

    public final void A(int i) {
        this.g0 = (1 << i) | this.g0;
        if (this.f0) {
            return;
        }
        View decorView = this.s.getDecorView();
        WeakHashMap weakHashMap = AZ.a;
        decorView.postOnAnimation(this.h0);
        this.f0 = true;
    }

    public final int B(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.e0 == null) {
                            this.e0 = new C0949e5(this, context);
                        }
                        return this.e0.f();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return x(context).f();
                }
            }
            return i;
        }
        return -1;
    }

    @Override // o.InterfaceC0694aC
    public final boolean C(MenuC0825cC menuC0825cC, MenuItem menuItem) {
        C1147h5 c1147h5;
        Window.Callback callback = this.s.getCallback();
        if (callback != null && !this.X) {
            MenuC0825cC k = menuC0825cC.k();
            C1147h5[] c1147h5Arr = this.S;
            int length = c1147h5Arr != null ? c1147h5Arr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    c1147h5 = c1147h5Arr[i];
                    if (c1147h5 != null && c1147h5.h == k) {
                        break;
                    }
                    i++;
                } else {
                    c1147h5 = null;
                    break;
                }
            }
            if (c1147h5 != null) {
                return callback.onMenuItemSelected(c1147h5.a, menuItem);
            }
        }
        return false;
    }

    public final boolean D() {
        boolean z = this.U;
        this.U = false;
        C1147h5 y = y(0);
        if (!y.m) {
            B1 b1 = this.B;
            if (b1 != null) {
                b1.a();
                return true;
            }
            z();
            AbstractC1075g1 abstractC1075g1 = this.v;
            if (abstractC1075g1 == null || !abstractC1075g1.b()) {
                return false;
            }
        } else if (!z) {
            r(y, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0176, code lost:
    
        if (r2.m.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0156, code lost:
    
        if (r2 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(C1147h5 c1147h5, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = c1147h5.m;
        int i2 = c1147h5.a;
        if (z || this.X) {
            return;
        }
        Context context = this.r;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.s.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, c1147h5.h)) {
            r(c1147h5, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !G(c1147h5, keyEvent)) {
            return;
        }
        C1081g5 c1081g5 = c1147h5.e;
        if (c1081g5 == null || c1147h5.n) {
            if (c1081g5 == null) {
                z();
                AbstractC1075g1 abstractC1075g1 = this.v;
                Context e = abstractC1075g1 != null ? abstractC1075g1.e() : null;
                if (e != null) {
                    context = e;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.devanos.nilufar.usmonova.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    newTheme.applyStyle(i3, true);
                }
                newTheme.resolveAttribute(com.devanos.nilufar.usmonova.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                } else {
                    newTheme.applyStyle(com.devanos.nilufar.usmonova.R.style.Theme_AppCompat_CompactMenu, true);
                }
                C2169we c2169we = new C2169we(context, 0);
                c2169we.getTheme().setTo(newTheme);
                c1147h5.j = c2169we;
                TypedArray obtainStyledAttributes = c2169we.obtainStyledAttributes(AbstractC1886sL.j);
                c1147h5.b = obtainStyledAttributes.getResourceId(86, 0);
                c1147h5.d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                c1147h5.e = new C1081g5(this, c1147h5.j);
                c1147h5.c = 81;
            } else if (c1147h5.n && c1081g5.getChildCount() > 0) {
                c1147h5.e.removeAllViews();
            }
            View view = c1147h5.g;
            if (view == null) {
                if (c1147h5.h != null) {
                    if (this.A == null) {
                        this.A = new X4(this, 3);
                    }
                    X4 x4 = this.A;
                    if (c1147h5.i == null) {
                        C1282jA c1282jA = new C1282jA(c1147h5.j);
                        c1147h5.i = c1282jA;
                        c1282jA.l = x4;
                        MenuC0825cC menuC0825cC = c1147h5.h;
                        menuC0825cC.b(c1282jA, menuC0825cC.a);
                    }
                    C1282jA c1282jA2 = c1147h5.i;
                    C1081g5 c1081g52 = c1147h5.e;
                    if (c1282jA2.k == null) {
                        c1282jA2.k = (ExpandedMenuView) c1282jA2.i.inflate(com.devanos.nilufar.usmonova.R.layout.abc_expanded_menu_layout, (ViewGroup) c1081g52, false);
                        if (c1282jA2.m == null) {
                            c1282jA2.m = new C1218iA(c1282jA2);
                        }
                        c1282jA2.k.setAdapter((ListAdapter) c1282jA2.m);
                        c1282jA2.k.setOnItemClickListener(c1282jA2);
                    }
                    ExpandedMenuView expandedMenuView = c1282jA2.k;
                    c1147h5.f = expandedMenuView;
                }
                c1147h5.n = true;
                return;
            }
            c1147h5.f = view;
            if (c1147h5.f != null) {
                if (c1147h5.g == null) {
                    C1282jA c1282jA3 = c1147h5.i;
                    if (c1282jA3.m == null) {
                        c1282jA3.m = new C1218iA(c1282jA3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = c1147h5.f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                c1147h5.e.setBackgroundResource(c1147h5.b);
                ViewParent parent = c1147h5.f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(c1147h5.f);
                }
                c1147h5.e.addView(c1147h5.f, layoutParams2);
                if (!c1147h5.f.hasFocus()) {
                    c1147h5.f.requestFocus();
                }
            }
            c1147h5.n = true;
            return;
        }
        View view2 = c1147h5.g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            c1147h5.l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = c1147h5.c;
            layoutParams3.windowAnimations = c1147h5.d;
            windowManager.addView(c1147h5.e, layoutParams3);
            c1147h5.m = true;
            if (i2 != 0) {
                I();
                return;
            }
            return;
        }
        i = -2;
        c1147h5.l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = c1147h5.c;
        layoutParams32.windowAnimations = c1147h5.d;
        windowManager.addView(c1147h5.e, layoutParams32);
        c1147h5.m = true;
        if (i2 != 0) {
        }
    }

    public final boolean F(C1147h5 c1147h5, int i, KeyEvent keyEvent) {
        MenuC0825cC menuC0825cC;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c1147h5.k || G(c1147h5, keyEvent)) && (menuC0825cC = c1147h5.h) != null) {
            return menuC0825cC.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d5, code lost:
    
        if (r13.h == null) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G(C1147h5 c1147h5, KeyEvent keyEvent) {
        InterfaceC1644og interfaceC1644og;
        InterfaceC1644og interfaceC1644og2;
        Resources.Theme theme;
        InterfaceC1644og interfaceC1644og3;
        InterfaceC1644og interfaceC1644og4;
        if (!this.X) {
            boolean z = c1147h5.k;
            int i = c1147h5.a;
            if (z) {
                return true;
            }
            C1147h5 c1147h52 = this.T;
            if (c1147h52 != null && c1147h52 != c1147h5) {
                r(c1147h52, false);
            }
            Window.Callback callback = this.s.getCallback();
            if (callback != null) {
                c1147h5.g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (interfaceC1644og4 = this.y) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1644og4;
                actionBarOverlayLayout.k();
                ((C1108gW) actionBarOverlayLayout.l).l = true;
            }
            if (c1147h5.g == null && (!z2 || !(this.v instanceof C0911dW))) {
                MenuC0825cC menuC0825cC = c1147h5.h;
                if (menuC0825cC == null || c1147h5.f172o) {
                    if (menuC0825cC == null) {
                        Context context = this.r;
                        if ((i == 0 || i == 108) && this.y != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(com.devanos.nilufar.usmonova.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(com.devanos.nilufar.usmonova.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(com.devanos.nilufar.usmonova.R.attr.actionBarWidgetTheme, typedValue, true);
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
                                C2169we c2169we = new C2169we(context, 0);
                                c2169we.getTheme().setTo(theme);
                                context = c2169we;
                            }
                        }
                        MenuC0825cC menuC0825cC2 = new MenuC0825cC(context);
                        menuC0825cC2.e = this;
                        MenuC0825cC menuC0825cC3 = c1147h5.h;
                        if (menuC0825cC2 != menuC0825cC3) {
                            if (menuC0825cC3 != null) {
                                menuC0825cC3.r(c1147h5.i);
                            }
                            c1147h5.h = menuC0825cC2;
                            C1282jA c1282jA = c1147h5.i;
                            if (c1282jA != null) {
                                menuC0825cC2.b(c1282jA, menuC0825cC2.a);
                            }
                        }
                    }
                    if (z2 && (interfaceC1644og2 = this.y) != null) {
                        if (this.z == null) {
                            this.z = new X4(this, 2);
                        }
                        ((ActionBarOverlayLayout) interfaceC1644og2).l(c1147h5.h, this.z);
                    }
                    c1147h5.h.w();
                    if (callback.onCreatePanelMenu(i, c1147h5.h)) {
                        c1147h5.f172o = false;
                    } else {
                        MenuC0825cC menuC0825cC4 = c1147h5.h;
                        if (menuC0825cC4 != null) {
                            if (menuC0825cC4 != null) {
                                menuC0825cC4.r(c1147h5.i);
                            }
                            c1147h5.h = null;
                        }
                        if (z2 && (interfaceC1644og = this.y) != null) {
                            ((ActionBarOverlayLayout) interfaceC1644og).l(null, this.z);
                        }
                    }
                }
                c1147h5.h.w();
                Bundle bundle = c1147h5.p;
                if (bundle != null) {
                    c1147h5.h.s(bundle);
                    c1147h5.p = null;
                }
                if (!callback.onPreparePanel(0, c1147h5.g, c1147h5.h)) {
                    if (z2 && (interfaceC1644og3 = this.y) != null) {
                        ((ActionBarOverlayLayout) interfaceC1644og3).l(null, this.z);
                    }
                    c1147h5.h.v();
                    return false;
                }
                c1147h5.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                c1147h5.h.v();
            }
            c1147h5.k = true;
            c1147h5.l = false;
            this.T = c1147h5;
            return true;
        }
        return false;
    }

    public final void H() {
        if (this.G) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void I() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.m0 != null && (y(0).m || this.B != null)) {
                z = true;
            }
            if (z && this.n0 == null) {
                this.n0 = AbstractC0818c5.b(this.m0, this);
            } else {
                if (z || (onBackInvokedCallback = this.n0) == null) {
                    return;
                }
                AbstractC0818c5.c(this.m0, onBackInvokedCallback);
                this.n0 = null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.f() != false) goto L20;
     */
    @Override // o.InterfaceC0694aC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q(MenuC0825cC menuC0825cC) {
        ActionMenuView actionMenuView;
        C2128w1 c2128w1;
        InterfaceC1644og interfaceC1644og = this.y;
        if (interfaceC1644og != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1644og;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((C1108gW) actionBarOverlayLayout.l).a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.h) != null && actionMenuView.z) {
                if (ViewConfiguration.get(this.r).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.y;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((C1108gW) actionBarOverlayLayout2.l).a.h;
                    if (actionMenuView2 != null) {
                        C2128w1 c2128w12 = actionMenuView2.A;
                        if (c2128w12 != null) {
                            if (c2128w12.B == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.s.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.y;
                actionBarOverlayLayout3.k();
                if (((C1108gW) actionBarOverlayLayout3.l).a.o()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.y;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView3 = ((C1108gW) actionBarOverlayLayout4.l).a.h;
                    if (actionMenuView3 != null && (c2128w1 = actionMenuView3.A) != null) {
                        c2128w1.d();
                    }
                    if (this.X) {
                        return;
                    }
                    callback.onPanelClosed(108, y(0).h);
                    return;
                }
                if (callback == null || this.X) {
                    return;
                }
                if (this.f0 && (1 & this.g0) != 0) {
                    View decorView = this.s.getDecorView();
                    W4 w4 = this.h0;
                    decorView.removeCallbacks(w4);
                    w4.run();
                }
                C1147h5 y = y(0);
                MenuC0825cC menuC0825cC2 = y.h;
                if (menuC0825cC2 == null || y.f172o || !callback.onPreparePanel(0, y.g, menuC0825cC2)) {
                    return;
                }
                callback.onMenuOpened(108, y.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.y;
                actionBarOverlayLayout5.k();
                ((C1108gW) actionBarOverlayLayout5.l).a.u();
                return;
            }
        }
        C1147h5 y2 = y(0);
        y2.n = true;
        r(y2, false);
        E(y2, null);
    }

    @Override // o.V4
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.r);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C1213i5) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // o.V4
    public final void b() {
        if (this.v != null) {
            z();
            if (this.v.f()) {
                return;
            }
            A(0);
        }
    }

    @Override // o.V4
    public final void d() {
        String str;
        this.V = true;
        m(false, true);
        w();
        Object obj = this.q;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = AbstractC0868ct.A(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                AbstractC1075g1 abstractC1075g1 = this.v;
                if (abstractC1075g1 == null) {
                    this.i0 = true;
                } else {
                    abstractC1075g1.l(true);
                }
            }
            synchronized (V4.f118o) {
                V4.f(this);
                V4.n.add(new WeakReference(this));
            }
        }
        this.Y = new Configuration(this.r.getResources().getConfiguration());
        this.W = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // o.V4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        AbstractC1075g1 abstractC1075g1;
        C0949e5 c0949e5;
        C0949e5 c0949e52;
        if (this.q instanceof Activity) {
            synchronized (V4.f118o) {
                V4.f(this);
            }
        }
        if (this.f0) {
            this.s.getDecorView().removeCallbacks(this.h0);
        }
        this.X = true;
        if (this.Z != -100) {
            Object obj = this.q;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                o0.put(this.q.getClass().getName(), Integer.valueOf(this.Z));
                abstractC1075g1 = this.v;
                if (abstractC1075g1 != null) {
                    abstractC1075g1.h();
                }
                c0949e5 = this.d0;
                if (c0949e5 != null) {
                    c0949e5.c();
                }
                c0949e52 = this.e0;
                if (c0949e52 == null) {
                    c0949e52.c();
                    return;
                }
                return;
            }
        }
        o0.remove(this.q.getClass().getName());
        abstractC1075g1 = this.v;
        if (abstractC1075g1 != null) {
        }
        c0949e5 = this.d0;
        if (c0949e5 != null) {
        }
        c0949e52 = this.e0;
        if (c0949e52 == null) {
        }
    }

    @Override // o.V4
    public final boolean g(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.Q && i == 108) {
            return false;
        }
        if (this.M && i == 1) {
            this.M = false;
        }
        if (i == 1) {
            H();
            this.Q = true;
            return true;
        }
        if (i == 2) {
            H();
            this.K = true;
            return true;
        }
        if (i == 5) {
            H();
            this.L = true;
            return true;
        }
        if (i == 10) {
            H();
            this.O = true;
            return true;
        }
        if (i == 108) {
            H();
            this.M = true;
            return true;
        }
        if (i != 109) {
            return this.s.requestFeature(i);
        }
        H();
        this.N = true;
        return true;
    }

    @Override // o.V4
    public final void h(int i) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.H.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.r).inflate(i, viewGroup);
        this.t.a(this.s.getCallback());
    }

    @Override // o.V4
    public final void i(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.H.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.t.a(this.s.getCallback());
    }

    @Override // o.V4
    public final void j(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.H.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.t.a(this.s.getCallback());
    }

    @Override // o.V4
    public final void k(CharSequence charSequence) {
        this.x = charSequence;
        InterfaceC1644og interfaceC1644og = this.y;
        if (interfaceC1644og != null) {
            interfaceC1644og.setWindowTitle(charSequence);
            return;
        }
        AbstractC1075g1 abstractC1075g1 = this.v;
        if (abstractC1075g1 != null) {
            abstractC1075g1.n(charSequence);
            return;
        }
        TextView textView = this.I;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o.N4] */
    @Override // o.V4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final B1 l(A1 a1) {
        B1 onWindowStartingSupportActionMode;
        ViewGroup viewGroup;
        B1 b1;
        if (a1 == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        B1 b12 = this.B;
        if (b12 != null) {
            b12.a();
        }
        C2002u5 c2002u5 = new C2002u5(this, 6, a1);
        z();
        AbstractC1075g1 abstractC1075g1 = this.v;
        ?? r1 = this.u;
        if (abstractC1075g1 != null) {
            B1 o2 = abstractC1075g1.o(c2002u5);
            this.B = o2;
            if (o2 != null) {
                r1.onSupportActionModeStarted(o2);
            }
        }
        if (this.B == null) {
            C0942e00 c0942e00 = this.F;
            if (c0942e00 != null) {
                c0942e00.b();
            }
            B1 b13 = this.B;
            if (b13 != null) {
                b13.a();
            }
            if (!this.X) {
                try {
                    onWindowStartingSupportActionMode = r1.onWindowStartingSupportActionMode(c2002u5);
                } catch (AbstractMethodError unused) {
                }
                if (onWindowStartingSupportActionMode == null) {
                    this.B = onWindowStartingSupportActionMode;
                } else {
                    int i = 1;
                    if (this.C == null) {
                        boolean z = this.P;
                        Context context = this.r;
                        if (z) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.devanos.nilufar.usmonova.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                Resources.Theme newTheme = context.getResources().newTheme();
                                newTheme.setTo(theme);
                                newTheme.applyStyle(typedValue.resourceId, true);
                                C2169we c2169we = new C2169we(context, 0);
                                c2169we.getTheme().setTo(newTheme);
                                context = c2169we;
                            }
                            this.C = new ActionBarContextView(context, null);
                            PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, com.devanos.nilufar.usmonova.R.attr.actionModePopupWindowStyle);
                            this.D = popupWindow;
                            MI.d(popupWindow, 2);
                            this.D.setContentView(this.C);
                            this.D.setWidth(-1);
                            context.getTheme().resolveAttribute(com.devanos.nilufar.usmonova.R.attr.actionBarSize, typedValue, true);
                            this.C.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                            this.D.setHeight(-2);
                            this.E = new W4(this, i);
                        } else {
                            ViewStubCompat viewStubCompat = (ViewStubCompat) this.H.findViewById(com.devanos.nilufar.usmonova.R.id.action_mode_bar_stub);
                            if (viewStubCompat != null) {
                                z();
                                AbstractC1075g1 abstractC1075g12 = this.v;
                                Context e = abstractC1075g12 != null ? abstractC1075g12.e() : null;
                                if (e != null) {
                                    context = e;
                                }
                                viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                                this.C = (ActionBarContextView) viewStubCompat.a();
                            }
                        }
                    }
                    if (this.C != null) {
                        C0942e00 c0942e002 = this.F;
                        if (c0942e002 != null) {
                            c0942e002.b();
                        }
                        this.C.e();
                        Context context2 = this.C.getContext();
                        ActionBarContextView actionBarContextView = this.C;
                        C0842cT c0842cT = new C0842cT();
                        c0842cT.j = context2;
                        c0842cT.k = actionBarContextView;
                        c0842cT.l = c2002u5;
                        MenuC0825cC menuC0825cC = new MenuC0825cC(actionBarContextView.getContext());
                        menuC0825cC.l = 1;
                        c0842cT.f149o = menuC0825cC;
                        menuC0825cC.e = c0842cT;
                        if (((A1) c2002u5.i).a(c0842cT, menuC0825cC)) {
                            c0842cT.g();
                            this.C.c(c0842cT);
                            this.B = c0842cT;
                            if (this.G && (viewGroup = this.H) != null && viewGroup.isLaidOut()) {
                                this.C.setAlpha(0.0f);
                                C0942e00 a = AZ.a(this.C);
                                a.a(1.0f);
                                this.F = a;
                                a.d(new Y4(i, this));
                            } else {
                                this.C.setAlpha(1.0f);
                                this.C.setVisibility(0);
                                if (this.C.getParent() instanceof View) {
                                    View view = (View) this.C.getParent();
                                    WeakHashMap weakHashMap = AZ.a;
                                    AbstractC1637oZ.c(view);
                                }
                            }
                            if (this.D != null) {
                                this.s.getDecorView().post(this.E);
                            }
                        } else {
                            this.B = null;
                        }
                    }
                }
                b1 = this.B;
                if (b1 != null) {
                    r1.onSupportActionModeStarted(b1);
                }
                I();
                this.B = this.B;
            }
            onWindowStartingSupportActionMode = null;
            if (onWindowStartingSupportActionMode == null) {
            }
            b1 = this.B;
            if (b1 != null) {
            }
            I();
            this.B = this.B;
        }
        I();
        return this.B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(boolean z, boolean z2) {
        int i;
        Configuration configuration;
        IA b;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        Object obj;
        Object obj2;
        LongSparseArray longSparseArray;
        Activity activity;
        if (this.X) {
            return false;
        }
        int i3 = this.Z;
        if (i3 == -100) {
            i3 = V4.i;
        }
        Context context = this.r;
        int B = B(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        IA o2 = i4 < 33 ? o(context) : null;
        if (!z2 && o2 != null) {
            o2 = AbstractC0687a5.b(context.getResources().getConfiguration());
        }
        Configuration s = s(context, B, o2, null, false);
        boolean z6 = this.c0;
        Object obj3 = this.q;
        if (!z6 && (obj3 instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.Y;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i5 = configuration.uiMode & 48;
                int i6 = s.uiMode & 48;
                IA b2 = AbstractC0687a5.b(configuration);
                b = o2 != null ? null : AbstractC0687a5.b(s);
                i2 = i5 == i6 ? 512 : 0;
                if (b != null && !b2.equals(b)) {
                    i2 |= 8196;
                }
                if (((~i) & i2) != 0 && z && this.V && ((q0 || this.W) && (obj3 instanceof Activity))) {
                    activity = (Activity) obj3;
                    if (!activity.isChild()) {
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31 && (i2 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(s.getLayoutDirection());
                        }
                        if (i7 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new D1(r2, activity));
                        }
                        z3 = true;
                        if (!z3 || i2 == 0) {
                            z4 = z3;
                        } else {
                            r2 = (i & i2) == i2 ? 1 : 0;
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i6;
                            if (b != null) {
                                AbstractC0687a5.d(configuration2, b);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i8 = Build.VERSION.SDK_INT;
                            if (i8 < 26 && i8 < 28) {
                                if (!AbstractC0772bO.h) {
                                    try {
                                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                                        AbstractC0772bO.g = declaredField;
                                        declaredField.setAccessible(true);
                                    } catch (NoSuchFieldException e) {
                                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
                                    }
                                    AbstractC0772bO.h = true;
                                }
                                Field field = AbstractC0772bO.g;
                                if (field != null) {
                                    try {
                                        obj = field.get(resources);
                                    } catch (IllegalAccessException e2) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
                                        obj = null;
                                    }
                                    if (obj != null) {
                                        if (!AbstractC0772bO.b) {
                                            try {
                                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                                AbstractC0772bO.a = declaredField2;
                                                declaredField2.setAccessible(true);
                                            } catch (NoSuchFieldException e3) {
                                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                                            }
                                            AbstractC0772bO.b = true;
                                        }
                                        Field field2 = AbstractC0772bO.a;
                                        if (field2 != null) {
                                            try {
                                                obj2 = field2.get(obj);
                                            } catch (IllegalAccessException e4) {
                                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                                            }
                                            if (obj2 != null) {
                                                if (!AbstractC0772bO.d) {
                                                    try {
                                                        AbstractC0772bO.c = Class.forName("android.content.res.ThemedResourceCache");
                                                    } catch (ClassNotFoundException e5) {
                                                        Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e5);
                                                    }
                                                    AbstractC0772bO.d = true;
                                                }
                                                Class cls = AbstractC0772bO.c;
                                                if (cls != null) {
                                                    if (!AbstractC0772bO.f) {
                                                        try {
                                                            Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                                            AbstractC0772bO.e = declaredField3;
                                                            declaredField3.setAccessible(true);
                                                        } catch (NoSuchFieldException e6) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e6);
                                                        }
                                                        AbstractC0772bO.f = true;
                                                    }
                                                    Field field3 = AbstractC0772bO.e;
                                                    if (field3 != null) {
                                                        try {
                                                            longSparseArray = (LongSparseArray) field3.get(obj2);
                                                        } catch (IllegalAccessException e7) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e7);
                                                            longSparseArray = null;
                                                        }
                                                        if (longSparseArray != null) {
                                                            longSparseArray.clear();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        obj2 = null;
                                        if (obj2 != null) {
                                        }
                                    }
                                }
                            }
                            int i9 = this.a0;
                            if (i9 != 0) {
                                context.setTheme(i9);
                                z5 = true;
                                context.getTheme().applyStyle(this.a0, true);
                            } else {
                                z5 = true;
                            }
                            if (r2 != 0 && (obj3 instanceof Activity)) {
                                Activity activity2 = (Activity) obj3;
                                if (activity2 instanceof InterfaceC0365Nz) {
                                    if (((C0417Pz) ((InterfaceC0365Nz) activity2).getLifecycle()).d.compareTo(EnumC0080Cz.j) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.W && !this.X) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                            z4 = z5;
                        }
                        if (z4 && (obj3 instanceof J4)) {
                            if ((i2 & 512) != 0) {
                                ((J4) obj3).onNightModeChanged(B);
                            }
                            if ((i2 & 4) != 0) {
                                ((J4) obj3).onLocalesChanged(o2);
                            }
                        }
                        if (b != null) {
                            AbstractC0687a5.c(AbstractC0687a5.b(context.getResources().getConfiguration()));
                        }
                        if (i3 == 0) {
                            x(context).l();
                        } else {
                            C0949e5 c0949e5 = this.d0;
                            if (c0949e5 != null) {
                                c0949e5.c();
                            }
                        }
                        if (i3 == 3) {
                            if (this.e0 == null) {
                                this.e0 = new C0949e5(this, context);
                            }
                            this.e0.l();
                        } else {
                            C0949e5 c0949e52 = this.e0;
                            if (c0949e52 != null) {
                                c0949e52.c();
                            }
                        }
                        return z4;
                    }
                }
                z3 = false;
                if (z3) {
                }
                z4 = z3;
                if (z4) {
                    if ((i2 & 512) != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                }
                if (b != null) {
                }
                if (i3 == 0) {
                }
                if (i3 == 3) {
                }
                return z4;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i4 >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.b0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e8) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e8);
                this.b0 = 0;
            }
        }
        this.c0 = true;
        i = this.b0;
        configuration = this.Y;
        if (configuration == null) {
        }
        int i52 = configuration.uiMode & 48;
        int i62 = s.uiMode & 48;
        IA b22 = AbstractC0687a5.b(configuration);
        if (o2 != null) {
        }
        if (i52 == i62) {
        }
        if (b != null) {
            i2 |= 8196;
        }
        if (((~i) & i2) != 0) {
            activity = (Activity) obj3;
            if (!activity.isChild()) {
            }
        }
        z3 = false;
        if (z3) {
        }
        z4 = z3;
        if (z4) {
        }
        if (b != null) {
        }
        if (i3 == 0) {
        }
        if (i3 == 3) {
        }
        return z4;
    }

    public final void n(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.s != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof WindowCallbackC0884d5) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        WindowCallbackC0884d5 windowCallbackC0884d5 = new WindowCallbackC0884d5(this, callback);
        this.t = windowCallbackC0884d5;
        window.setCallback(windowCallbackC0884d5);
        Context context = this.r;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, p0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            C1409l5 a = C1409l5.a();
            synchronized (a) {
                drawable = a.a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.s = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.m0) != null) {
            return;
        }
        Object obj = this.q;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.n0) != null) {
            AbstractC0818c5.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.n0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.m0 = AbstractC0818c5.a(activity);
                I();
            }
        }
        this.m0 = null;
        I();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:68:0x01e8
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.LayoutInflaterFactory2C1213i5.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p(int i, C1147h5 c1147h5, MenuC0825cC menuC0825cC) {
        if (menuC0825cC == null) {
            if (c1147h5 == null && i >= 0) {
                C1147h5[] c1147h5Arr = this.S;
                if (i < c1147h5Arr.length) {
                    c1147h5 = c1147h5Arr[i];
                }
            }
            if (c1147h5 != null) {
                menuC0825cC = c1147h5.h;
            }
        }
        if ((c1147h5 == null || c1147h5.m) && !this.X) {
            WindowCallbackC0884d5 windowCallbackC0884d5 = this.t;
            Window.Callback callback = this.s.getCallback();
            windowCallbackC0884d5.getClass();
            try {
                windowCallbackC0884d5.l = true;
                callback.onPanelClosed(i, menuC0825cC);
            } finally {
                windowCallbackC0884d5.l = false;
            }
        }
    }

    public final void q(MenuC0825cC menuC0825cC) {
        C2128w1 c2128w1;
        if (this.R) {
            return;
        }
        this.R = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.y;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((C1108gW) actionBarOverlayLayout.l).a.h;
        if (actionMenuView != null && (c2128w1 = actionMenuView.A) != null) {
            c2128w1.d();
            C1864s1 c1864s1 = c2128w1.A;
            if (c1864s1 != null && c1864s1.b()) {
                c1864s1.i.dismiss();
            }
        }
        Window.Callback callback = this.s.getCallback();
        if (callback != null && !this.X) {
            callback.onPanelClosed(108, menuC0825cC);
        }
        this.R = false;
    }

    public final void r(C1147h5 c1147h5, boolean z) {
        C1081g5 c1081g5;
        InterfaceC1644og interfaceC1644og;
        if (z && c1147h5.a == 0 && (interfaceC1644og = this.y) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1644og;
            actionBarOverlayLayout.k();
            if (((C1108gW) actionBarOverlayLayout.l).a.o()) {
                q(c1147h5.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.r.getSystemService("window");
        if (windowManager != null && c1147h5.m && (c1081g5 = c1147h5.e) != null) {
            windowManager.removeView(c1081g5);
            if (z) {
                p(c1147h5.a, c1147h5, null);
            }
        }
        c1147h5.k = false;
        c1147h5.l = false;
        c1147h5.m = false;
        c1147h5.f = null;
        c1147h5.n = true;
        if (this.T == c1147h5) {
            this.T = null;
        }
        if (c1147h5.a == 0) {
            I();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f0, code lost:
    
        if (r7.d() != false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(KeyEvent keyEvent) {
        View decorView;
        boolean z;
        boolean z2;
        ActionMenuView actionMenuView;
        Object obj = this.q;
        if ((!(obj instanceof InterfaceC0130Ex) && !(obj instanceof DialogInterfaceC1209i2)) || (decorView = this.s.getDecorView()) == null || !AbstractC1305jX.p(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                WindowCallbackC0884d5 windowCallbackC0884d5 = this.t;
                Window.Callback callback = this.s.getCallback();
                windowCallbackC0884d5.getClass();
                try {
                    windowCallbackC0884d5.k = true;
                } finally {
                    windowCallbackC0884d5.k = false;
                }
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode == 4) {
                    this.U = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        C1147h5 y = y(0);
                        if (!y.m) {
                            G(y, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.B == null) {
                        C1147h5 y2 = y(0);
                        InterfaceC1644og interfaceC1644og = this.y;
                        Context context = this.r;
                        if (interfaceC1644og != null) {
                            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1644og;
                            actionBarOverlayLayout.k();
                            Toolbar toolbar = ((C1108gW) actionBarOverlayLayout.l).a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.h) != null && actionMenuView.z && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.y;
                                actionBarOverlayLayout2.k();
                                if (((C1108gW) actionBarOverlayLayout2.l).a.o()) {
                                    ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.y;
                                    actionBarOverlayLayout3.k();
                                    ActionMenuView actionMenuView2 = ((C1108gW) actionBarOverlayLayout3.l).a.h;
                                    if (actionMenuView2 != null) {
                                        C2128w1 c2128w1 = actionMenuView2.A;
                                        if (c2128w1 != null) {
                                        }
                                    }
                                } else if (!this.X && G(y2, keyEvent)) {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.y;
                                    actionBarOverlayLayout4.k();
                                    z = ((C1108gW) actionBarOverlayLayout4.l).a.u();
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
                                z = false;
                                if (z) {
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
                                if (y2.f172o) {
                                    y2.k = false;
                                    z2 = G(y2, keyEvent);
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    E(y2, keyEvent);
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
            if (!D()) {
                return false;
            }
        }
        return true;
    }

    public final void u(int i) {
        C1147h5 y = y(i);
        if (y.h != null) {
            Bundle bundle = new Bundle();
            y.h.t(bundle);
            if (bundle.size() > 0) {
                y.p = bundle;
            }
            y.h.w();
            y.h.clear();
        }
        y.f172o = true;
        y.n = true;
        if ((i == 108 || i == 0) && this.y != null) {
            C1147h5 y2 = y(0);
            y2.k = false;
            G(y2, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        if (this.G) {
            return;
        }
        Context context = this.r;
        int[] iArr = AbstractC1886sL.j;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
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
        this.P = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        w();
        this.s.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.Q) {
            viewGroup = this.O ? (ViewGroup) from.inflate(com.devanos.nilufar.usmonova.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.devanos.nilufar.usmonova.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.P) {
            viewGroup = (ViewGroup) from.inflate(com.devanos.nilufar.usmonova.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.N = false;
            this.M = false;
        } else if (this.M) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.devanos.nilufar.usmonova.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C2169we(context, typedValue.resourceId) : context).inflate(com.devanos.nilufar.usmonova.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC1644og interfaceC1644og = (InterfaceC1644og) viewGroup.findViewById(com.devanos.nilufar.usmonova.R.id.decor_content_parent);
            this.y = interfaceC1644og;
            interfaceC1644og.setWindowCallback(this.s.getCallback());
            if (this.N) {
                ((ActionBarOverlayLayout) this.y).j(109);
            }
            if (this.K) {
                ((ActionBarOverlayLayout) this.y).j(2);
            }
            if (this.L) {
                ((ActionBarOverlayLayout) this.y).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.M + ", windowActionBarOverlay: " + this.N + ", android:windowIsFloating: " + this.P + ", windowActionModeOverlay: " + this.O + ", windowNoTitle: " + this.Q + " }");
        }
        X4 x4 = new X4(this, i);
        WeakHashMap weakHashMap = AZ.a;
        AbstractC1769qZ.u(viewGroup, x4);
        if (this.y == null) {
            this.I = (TextView) viewGroup.findViewById(com.devanos.nilufar.usmonova.R.id.title);
        }
        boolean z = AbstractC1468m00.a;
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
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.devanos.nilufar.usmonova.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.s.findViewById(R.id.content);
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
        this.s.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new X4(this, i2));
        this.H = viewGroup;
        Object obj = this.q;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.x;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC1644og interfaceC1644og2 = this.y;
            if (interfaceC1644og2 != null) {
                interfaceC1644og2.setWindowTitle(title);
            } else {
                AbstractC1075g1 abstractC1075g1 = this.v;
                if (abstractC1075g1 != null) {
                    abstractC1075g1.n(title);
                } else {
                    TextView textView = this.I;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.H.findViewById(R.id.content);
        View decorView = this.s.getDecorView();
        contentFrameLayout2.n.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.G = true;
        C1147h5 y = y(0);
        if (this.X || y.h != null) {
            return;
        }
        A(108);
    }

    public final void w() {
        if (this.s == null) {
            Object obj = this.q;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.s == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final E0 x(Context context) {
        if (this.d0 == null) {
            if (C0950e6.p == null) {
                Context applicationContext = context.getApplicationContext();
                C0950e6.p = new C0950e6(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.d0 = new C0949e5(this, C0950e6.p);
        }
        return this.d0;
    }

    public final C1147h5 y(int i) {
        C1147h5[] c1147h5Arr = this.S;
        if (c1147h5Arr == null || c1147h5Arr.length <= i) {
            C1147h5[] c1147h5Arr2 = new C1147h5[i + 1];
            if (c1147h5Arr != null) {
                System.arraycopy(c1147h5Arr, 0, c1147h5Arr2, 0, c1147h5Arr.length);
            }
            this.S = c1147h5Arr2;
            c1147h5Arr = c1147h5Arr2;
        }
        C1147h5 c1147h5 = c1147h5Arr[i];
        if (c1147h5 != null) {
            return c1147h5;
        }
        C1147h5 c1147h52 = new C1147h5();
        c1147h52.a = i;
        c1147h52.n = false;
        c1147h5Arr[i] = c1147h52;
        return c1147h52;
    }

    public final void z() {
        v();
        if (this.M && this.v == null) {
            Object obj = this.q;
            if (obj instanceof Activity) {
                this.v = new P00((Activity) obj, this.N);
            } else if (obj instanceof Dialog) {
                this.v = new P00((Dialog) obj);
            }
            AbstractC1075g1 abstractC1075g1 = this.v;
            if (abstractC1075g1 != null) {
                abstractC1075g1.l(this.i0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}

package g;

import K.C0014m;
import K.InterfaceC0013l;
import K.T;
import K.c0;
import Y.AbstractC0039g;
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
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.EnumC0072m;
import androidx.recyclerview.widget.RecyclerView;
import j.AbstractC0144a;
import j.C0146c;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.C0159h;
import k.C0160i;
import k.C0166o;
import k.InterfaceC0162k;
import k.MenuC0164m;
import l.C0182D;
import l.C0184F;
import l.C0194P;
import l.C0210g;
import l.C0213h0;
import l.C0218k;
import l.C0232r;
import l.C0236t;
import l.C0240v;
import l.C0244x;
import l.C0246y;
import l.C0248z;
import l.InterfaceC0217j0;
import l.InterfaceC0219k0;
import l.X0;
import l.c1;
import l.e1;
import l.h1;
import z.AbstractC0353c;

/* loaded from: classes.dex */
public final class y extends m implements InterfaceC0162k, LayoutInflater.Factory2 {

    /* renamed from: i0, reason: collision with root package name */
    public static final o.k f2272i0 = new o.k();

    /* renamed from: j0, reason: collision with root package name */
    public static final int[] f2273j0 = {R.attr.windowBackground};

    /* renamed from: k0, reason: collision with root package name */
    public static final boolean f2274k0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    public boolean f2275A;

    /* renamed from: B, reason: collision with root package name */
    public ViewGroup f2276B;

    /* renamed from: C, reason: collision with root package name */
    public TextView f2277C;

    /* renamed from: D, reason: collision with root package name */
    public View f2278D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2279E;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f2280G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f2281H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2282I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2283J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f2284K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f2285L;

    /* renamed from: M, reason: collision with root package name */
    public x[] f2286M;

    /* renamed from: N, reason: collision with root package name */
    public x f2287N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f2288O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2289P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f2290Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f2291R;

    /* renamed from: S, reason: collision with root package name */
    public Configuration f2292S;

    /* renamed from: T, reason: collision with root package name */
    public final int f2293T;

    /* renamed from: U, reason: collision with root package name */
    public int f2294U;

    /* renamed from: V, reason: collision with root package name */
    public int f2295V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f2296W;

    /* renamed from: X, reason: collision with root package name */
    public u f2297X;

    /* renamed from: Y, reason: collision with root package name */
    public u f2298Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f2299Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f2300a0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f2302c0;

    /* renamed from: d0, reason: collision with root package name */
    public Rect f2303d0;

    /* renamed from: e0, reason: collision with root package name */
    public Rect f2304e0;

    /* renamed from: f0, reason: collision with root package name */
    public C0093B f2305f0;

    /* renamed from: g0, reason: collision with root package name */
    public OnBackInvokedDispatcher f2306g0;

    /* renamed from: h0, reason: collision with root package name */
    public OnBackInvokedCallback f2307h0;

    /* renamed from: j, reason: collision with root package name */
    public final Object f2308j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f2309k;

    /* renamed from: l, reason: collision with root package name */
    public Window f2310l;

    /* renamed from: m, reason: collision with root package name */
    public t f2311m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f2312n;

    /* renamed from: o, reason: collision with root package name */
    public I f2313o;

    /* renamed from: p, reason: collision with root package name */
    public j.h f2314p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2315q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0217j0 f2316r;

    /* renamed from: s, reason: collision with root package name */
    public o f2317s;

    /* renamed from: t, reason: collision with root package name */
    public o f2318t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC0144a f2319u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f2320v;

    /* renamed from: w, reason: collision with root package name */
    public PopupWindow f2321w;

    /* renamed from: x, reason: collision with root package name */
    public n f2322x;

    /* renamed from: y, reason: collision with root package name */
    public c0 f2323y = null;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f2324z = true;

    /* renamed from: b0, reason: collision with root package name */
    public final n f2301b0 = new n(this, 0);

    public y(Context context, Window window, InterfaceC0108i interfaceC0108i, Object obj) {
        AppCompatActivity appCompatActivity;
        this.f2293T = -100;
        this.f2309k = context;
        this.f2308j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AppCompatActivity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    appCompatActivity = (AppCompatActivity) context;
                    break;
                }
            }
            appCompatActivity = null;
            if (appCompatActivity != null) {
                this.f2293T = ((y) appCompatActivity.l()).f2293T;
            }
        }
        if (this.f2293T == -100) {
            o.k kVar = f2272i0;
            Integer num = (Integer) kVar.getOrDefault(this.f2308j.getClass().getName(), null);
            if (num != null) {
                this.f2293T = num.intValue();
                kVar.remove(this.f2308j.getClass().getName());
            }
        }
        if (window != null) {
            l(window);
        }
        C0236t.d();
    }

    public static G.f m(Context context) {
        G.f fVar;
        G.f fVar2;
        if (Build.VERSION.SDK_INT >= 33 || (fVar = m.f2242c) == null) {
            return null;
        }
        G.f b2 = r.b(context.getApplicationContext().getResources().getConfiguration());
        G.g gVar = fVar.f209a;
        if (gVar.f210a.isEmpty()) {
            fVar2 = G.f.f208b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b2.f209a.f210a.size() + gVar.f210a.size()) {
                Locale locale = i < gVar.f210a.size() ? gVar.f210a.get(i) : b2.f209a.f210a.get(i - gVar.f210a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            fVar2 = new G.f(new G.g(G.e.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return fVar2.f209a.f210a.isEmpty() ? b2 : fVar2;
    }

    public static Configuration s(Context context, int i, G.f fVar, Configuration configuration, boolean z2) {
        int i2 = i != 1 ? i != 2 ? z2 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = RecyclerView.f1570A0;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (fVar != null) {
            r.d(configuration2, fVar);
        }
        return configuration2;
    }

    public final void A(int i) {
        this.f2300a0 = (1 << i) | this.f2300a0;
        if (this.f2299Z) {
            return;
        }
        View decorView = this.f2310l.getDecorView();
        n nVar = this.f2301b0;
        WeakHashMap weakHashMap = T.f372a;
        decorView.postOnAnimation(nVar);
        this.f2299Z = true;
    }

    public final int B(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return x(context).f();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.f2298Y == null) {
                    this.f2298Y = new u(this, context);
                }
                return this.f2298Y.f();
            }
        }
        return i;
    }

    public final boolean C() {
        InterfaceC0219k0 interfaceC0219k0;
        X0 x02;
        boolean z2 = this.f2288O;
        this.f2288O = false;
        x y2 = y(0);
        if (y2.f2268m) {
            if (!z2) {
                r(y2, true);
            }
            return true;
        }
        AbstractC0144a abstractC0144a = this.f2319u;
        if (abstractC0144a != null) {
            abstractC0144a.a();
            return true;
        }
        z();
        I i = this.f2313o;
        if (i == null || (interfaceC0219k0 = i.f2187e) == null || (x02 = ((c1) interfaceC0219k0).f2982a.f1367L) == null || x02.f2962b == null) {
            return false;
        }
        X0 x03 = ((c1) interfaceC0219k0).f2982a.f1367L;
        C0166o c0166o = x03 == null ? null : x03.f2962b;
        if (c0166o != null) {
            c0166o.collapseActionView();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0173, code lost:
    
        if (r3.f2749f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0153, code lost:
    
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(x xVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (xVar.f2268m || this.f2291R) {
            return;
        }
        int i2 = xVar.f2259a;
        Context context = this.f2309k;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f2310l.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, xVar.h)) {
            r(xVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !F(xVar, keyEvent)) {
            return;
        }
        w wVar = xVar.f2262e;
        if (wVar == null || xVar.f2269n) {
            if (wVar == null) {
                z();
                I i3 = this.f2313o;
                Context a02 = i3 != null ? i3.a0() : null;
                if (a02 != null) {
                    context = a02;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.football.transfertrivia.R.attr.actionBarPopupTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                }
                newTheme.resolveAttribute(com.football.transfertrivia.R.attr.panelMenuListTheme, typedValue, true);
                int i5 = typedValue.resourceId;
                if (i5 != 0) {
                    newTheme.applyStyle(i5, true);
                } else {
                    newTheme.applyStyle(com.football.transfertrivia.R.style.Theme_AppCompat_CompactMenu, true);
                }
                C0146c c0146c = new C0146c(context, 0);
                c0146c.getTheme().setTo(newTheme);
                xVar.f2265j = c0146c;
                TypedArray obtainStyledAttributes = c0146c.obtainStyledAttributes(f.a.f2143j);
                xVar.f2260b = obtainStyledAttributes.getResourceId(86, 0);
                xVar.d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                xVar.f2262e = new w(this, xVar.f2265j);
                xVar.f2261c = 81;
            } else if (xVar.f2269n && wVar.getChildCount() > 0) {
                xVar.f2262e.removeAllViews();
            }
            View view = xVar.f2264g;
            if (view == null) {
                if (xVar.h != null) {
                    if (this.f2318t == null) {
                        this.f2318t = new o(this, 3);
                    }
                    o oVar = this.f2318t;
                    if (xVar.i == null) {
                        C0160i c0160i = new C0160i(xVar.f2265j);
                        xVar.i = c0160i;
                        c0160i.f2748e = oVar;
                        MenuC0164m menuC0164m = xVar.h;
                        menuC0164m.b(c0160i, menuC0164m.f2756a);
                    }
                    C0160i c0160i2 = xVar.i;
                    w wVar2 = xVar.f2262e;
                    if (c0160i2.d == null) {
                        c0160i2.d = (ExpandedMenuView) c0160i2.f2746b.inflate(com.football.transfertrivia.R.layout.abc_expanded_menu_layout, (ViewGroup) wVar2, false);
                        if (c0160i2.f2749f == null) {
                            c0160i2.f2749f = new C0159h(c0160i2);
                        }
                        c0160i2.d.setAdapter((ListAdapter) c0160i2.f2749f);
                        c0160i2.d.setOnItemClickListener(c0160i2);
                    }
                    ExpandedMenuView expandedMenuView = c0160i2.d;
                    xVar.f2263f = expandedMenuView;
                }
                xVar.f2269n = true;
                return;
            }
            xVar.f2263f = view;
            if (xVar.f2263f != null) {
                if (xVar.f2264g == null) {
                    C0160i c0160i3 = xVar.i;
                    if (c0160i3.f2749f == null) {
                        c0160i3.f2749f = new C0159h(c0160i3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = xVar.f2263f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                xVar.f2262e.setBackgroundResource(xVar.f2260b);
                ViewParent parent = xVar.f2263f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(xVar.f2263f);
                }
                xVar.f2262e.addView(xVar.f2263f, layoutParams2);
                if (!xVar.f2263f.hasFocus()) {
                    xVar.f2263f.requestFocus();
                }
            }
            xVar.f2269n = true;
            return;
        }
        View view2 = xVar.f2264g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            xVar.f2267l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = xVar.f2261c;
            layoutParams3.windowAnimations = xVar.d;
            windowManager.addView(xVar.f2262e, layoutParams3);
            xVar.f2268m = true;
            if (i2 != 0) {
                H();
                return;
            }
            return;
        }
        i = -2;
        xVar.f2267l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = xVar.f2261c;
        layoutParams32.windowAnimations = xVar.d;
        windowManager.addView(xVar.f2262e, layoutParams32);
        xVar.f2268m = true;
        if (i2 != 0) {
        }
    }

    public final boolean E(x xVar, int i, KeyEvent keyEvent) {
        MenuC0164m menuC0164m;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((xVar.f2266k || F(xVar, keyEvent)) && (menuC0164m = xVar.h) != null) {
            return menuC0164m.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final boolean F(x xVar, KeyEvent keyEvent) {
        InterfaceC0217j0 interfaceC0217j0;
        InterfaceC0217j0 interfaceC0217j02;
        Resources.Theme theme;
        InterfaceC0217j0 interfaceC0217j03;
        InterfaceC0217j0 interfaceC0217j04;
        if (this.f2291R) {
            return false;
        }
        if (xVar.f2266k) {
            return true;
        }
        x xVar2 = this.f2287N;
        if (xVar2 != null && xVar2 != xVar) {
            r(xVar2, false);
        }
        Window.Callback callback = this.f2310l.getCallback();
        int i = xVar.f2259a;
        if (callback != null) {
            xVar.f2264g = callback.onCreatePanelView(i);
        }
        boolean z2 = i == 0 || i == 108;
        if (z2 && (interfaceC0217j04 = this.f2316r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0217j04;
            actionBarOverlayLayout.k();
            ((c1) actionBarOverlayLayout.f1310e).f2990l = true;
        }
        if (xVar.f2264g == null) {
            MenuC0164m menuC0164m = xVar.h;
            if (menuC0164m == null || xVar.f2270o) {
                if (menuC0164m == null) {
                    Context context = this.f2309k;
                    if ((i == 0 || i == 108) && this.f2316r != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.football.transfertrivia.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.football.transfertrivia.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.football.transfertrivia.R.attr.actionBarWidgetTheme, typedValue, true);
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
                            C0146c c0146c = new C0146c(context, 0);
                            c0146c.getTheme().setTo(theme);
                            context = c0146c;
                        }
                    }
                    MenuC0164m menuC0164m2 = new MenuC0164m(context);
                    menuC0164m2.f2759e = this;
                    MenuC0164m menuC0164m3 = xVar.h;
                    if (menuC0164m2 != menuC0164m3) {
                        if (menuC0164m3 != null) {
                            menuC0164m3.r(xVar.i);
                        }
                        xVar.h = menuC0164m2;
                        C0160i c0160i = xVar.i;
                        if (c0160i != null) {
                            menuC0164m2.b(c0160i, menuC0164m2.f2756a);
                        }
                    }
                    if (xVar.h == null) {
                        return false;
                    }
                }
                if (z2 && (interfaceC0217j02 = this.f2316r) != null) {
                    if (this.f2317s == null) {
                        this.f2317s = new o(this, 2);
                    }
                    ((ActionBarOverlayLayout) interfaceC0217j02).l(xVar.h, this.f2317s);
                }
                xVar.h.w();
                if (!callback.onCreatePanelMenu(i, xVar.h)) {
                    MenuC0164m menuC0164m4 = xVar.h;
                    if (menuC0164m4 != null) {
                        if (menuC0164m4 != null) {
                            menuC0164m4.r(xVar.i);
                        }
                        xVar.h = null;
                    }
                    if (z2 && (interfaceC0217j0 = this.f2316r) != null) {
                        ((ActionBarOverlayLayout) interfaceC0217j0).l(null, this.f2317s);
                    }
                    return false;
                }
                xVar.f2270o = false;
            }
            xVar.h.w();
            Bundle bundle = xVar.f2271p;
            if (bundle != null) {
                xVar.h.s(bundle);
                xVar.f2271p = null;
            }
            if (!callback.onPreparePanel(0, xVar.f2264g, xVar.h)) {
                if (z2 && (interfaceC0217j03 = this.f2316r) != null) {
                    ((ActionBarOverlayLayout) interfaceC0217j03).l(null, this.f2317s);
                }
                xVar.h.v();
                return false;
            }
            xVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            xVar.h.v();
        }
        xVar.f2266k = true;
        xVar.f2267l = false;
        this.f2287N = xVar;
        return true;
    }

    public final void G() {
        if (this.f2275A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f2306g0 != null && (y(0).f2268m || this.f2319u != null)) {
                z2 = true;
            }
            if (z2 && this.f2307h0 == null) {
                this.f2307h0 = s.b(this.f2306g0, this);
            } else {
                if (z2 || (onBackInvokedCallback = this.f2307h0) == null) {
                    return;
                }
                s.c(this.f2306g0, onBackInvokedCallback);
                this.f2307h0 = null;
            }
        }
    }

    @Override // g.m
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f2309k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof y) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // g.m
    public final void c() {
        String str;
        this.f2289P = true;
        k(false, true);
        w();
        Object obj = this.f2308j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = AbstractC0353c.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                I i = this.f2313o;
                if (i == null) {
                    this.f2302c0 = true;
                } else {
                    i.c0(true);
                }
            }
            synchronized (m.h) {
                m.e(this);
                m.f2245g.add(new WeakReference(this));
            }
        }
        this.f2292S = new Configuration(this.f2309k.getResources().getConfiguration());
        this.f2290Q = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // g.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        u uVar;
        u uVar2;
        if (this.f2308j instanceof Activity) {
            synchronized (m.h) {
                m.e(this);
            }
        }
        if (this.f2299Z) {
            this.f2310l.getDecorView().removeCallbacks(this.f2301b0);
        }
        this.f2291R = true;
        if (this.f2293T != -100) {
            Object obj = this.f2308j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f2272i0.put(this.f2308j.getClass().getName(), Integer.valueOf(this.f2293T));
                uVar = this.f2297X;
                if (uVar != null) {
                    uVar.c();
                }
                uVar2 = this.f2298Y;
                if (uVar2 == null) {
                    uVar2.c();
                    return;
                }
                return;
            }
        }
        f2272i0.remove(this.f2308j.getClass().getName());
        uVar = this.f2297X;
        if (uVar != null) {
        }
        uVar2 = this.f2298Y;
        if (uVar2 == null) {
        }
    }

    @Override // g.m
    public final boolean f(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f2284K && i == 108) {
            return false;
        }
        if (this.f2280G && i == 1) {
            this.f2280G = false;
        }
        if (i == 1) {
            G();
            this.f2284K = true;
            return true;
        }
        if (i == 2) {
            G();
            this.f2279E = true;
            return true;
        }
        if (i == 5) {
            G();
            this.F = true;
            return true;
        }
        if (i == 10) {
            G();
            this.f2282I = true;
            return true;
        }
        if (i == 108) {
            G();
            this.f2280G = true;
            return true;
        }
        if (i != 109) {
            return this.f2310l.requestFeature(i);
        }
        G();
        this.f2281H = true;
        return true;
    }

    @Override // g.m
    public final void g(int i) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2276B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2309k).inflate(i, viewGroup);
        this.f2311m.a(this.f2310l.getCallback());
    }

    @Override // g.m
    public final void h(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2276B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2311m.a(this.f2310l.getCallback());
    }

    @Override // g.m
    public final void i(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2276B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2311m.a(this.f2310l.getCallback());
    }

    @Override // g.m
    public final void j(CharSequence charSequence) {
        this.f2315q = charSequence;
        InterfaceC0217j0 interfaceC0217j0 = this.f2316r;
        if (interfaceC0217j0 != null) {
            interfaceC0217j0.setWindowTitle(charSequence);
            return;
        }
        I i = this.f2313o;
        if (i == null) {
            TextView textView = this.f2277C;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        c1 c1Var = (c1) i.f2187e;
        if (c1Var.f2987g) {
            return;
        }
        c1Var.h = charSequence;
        if ((c1Var.f2983b & 8) != 0) {
            Toolbar toolbar = c1Var.f2982a;
            toolbar.setTitle(charSequence);
            if (c1Var.f2987g) {
                T.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(boolean z2, boolean z3) {
        int i;
        Configuration configuration;
        G.f b2;
        int i2;
        boolean z4;
        Activity activity;
        if (this.f2291R) {
            return false;
        }
        int i3 = this.f2293T;
        if (i3 == -100) {
            i3 = m.f2241b;
        }
        Context context = this.f2309k;
        int B2 = B(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        G.f m2 = i4 < 33 ? m(context) : null;
        if (!z3 && m2 != null) {
            m2 = r.b(context.getResources().getConfiguration());
        }
        Configuration s2 = s(context, B2, m2, null, false);
        boolean z5 = this.f2296W;
        Object obj = this.f2308j;
        boolean z6 = true;
        if (!z5 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.f2292S;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i5 = configuration.uiMode & 48;
                int i6 = s2.uiMode & 48;
                G.f b3 = r.b(configuration);
                b2 = m2 != null ? null : r.b(s2);
                i2 = i5 == i6 ? 512 : 0;
                if (b2 != null && !b3.equals(b2)) {
                    i2 |= 8196;
                }
                if (((~i) & i2) != 0 && z2 && this.f2289P && ((f2274k0 || this.f2290Q) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31 && (i2 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(s2.getLayoutDirection());
                        }
                        if (i7 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new B0.b(11, activity));
                        }
                        z4 = true;
                        if (!z4 || i2 == 0) {
                            z6 = z4;
                        } else {
                            boolean z7 = (i2 & i) == i2;
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i6;
                            if (b2 != null) {
                                r.d(configuration2, b2);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i8 = this.f2294U;
                            if (i8 != 0) {
                                context.setTheme(i8);
                                context.getTheme().applyStyle(this.f2294U, true);
                            }
                            if (z7 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof androidx.lifecycle.t) {
                                    if (((androidx.lifecycle.t) activity2).d().d.compareTo(EnumC0072m.f1519c) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f2290Q && !this.f2291R) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (z6 && (obj instanceof AppCompatActivity)) {
                            if ((i2 & 512) != 0) {
                            }
                            if ((i2 & 4) != 0) {
                            }
                        }
                        if (b2 != null) {
                            r.c(r.b(context.getResources().getConfiguration()));
                        }
                        if (i3 == 0) {
                            x(context).i();
                        } else {
                            u uVar = this.f2297X;
                            if (uVar != null) {
                                uVar.c();
                            }
                        }
                        if (i3 == 3) {
                            if (this.f2298Y == null) {
                                this.f2298Y = new u(this, context);
                            }
                            this.f2298Y.i();
                        } else {
                            u uVar2 = this.f2298Y;
                            if (uVar2 != null) {
                                uVar2.c();
                            }
                        }
                        return z6;
                    }
                }
                z4 = false;
                if (z4) {
                }
                z6 = z4;
                if (z6) {
                    if ((i2 & 512) != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                }
                if (b2 != null) {
                }
                if (i3 == 0) {
                }
                if (i3 == 3) {
                }
                return z6;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i4 >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f2295V = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.f2295V = 0;
            }
        }
        this.f2296W = true;
        i = this.f2295V;
        configuration = this.f2292S;
        if (configuration == null) {
        }
        int i52 = configuration.uiMode & 48;
        int i62 = s2.uiMode & 48;
        G.f b32 = r.b(configuration);
        if (m2 != null) {
        }
        if (i52 == i62) {
        }
        if (b2 != null) {
            i2 |= 8196;
        }
        if (((~i) & i2) != 0) {
            activity = (Activity) obj;
            if (!activity.isChild()) {
            }
        }
        z4 = false;
        if (z4) {
        }
        z6 = z4;
        if (z6) {
        }
        if (b2 != null) {
        }
        if (i3 == 0) {
        }
        if (i3 == 3) {
        }
        return z6;
    }

    public final void l(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f2310l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof t) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        t tVar = new t(this, callback);
        this.f2311m = tVar;
        window.setCallback(tVar);
        int[] iArr = f2273j0;
        Context context = this.f2309k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            C0236t a2 = C0236t.a();
            synchronized (a2) {
                drawable = a2.f3079a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f2310l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f2306g0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f2307h0) != null) {
            s.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2307h0 = null;
        }
        Object obj = this.f2308j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f2306g0 = s.a(activity);
                H();
            }
        }
        this.f2306g0 = null;
        H();
    }

    public final void n(int i, x xVar, MenuC0164m menuC0164m) {
        if (menuC0164m == null) {
            if (xVar == null && i >= 0) {
                x[] xVarArr = this.f2286M;
                if (i < xVarArr.length) {
                    xVar = xVarArr[i];
                }
            }
            if (xVar != null) {
                menuC0164m = xVar.h;
            }
        }
        if ((xVar == null || xVar.f2268m) && !this.f2291R) {
            t tVar = this.f2311m;
            Window.Callback callback = this.f2310l.getCallback();
            tVar.getClass();
            try {
                tVar.d = true;
                callback.onPanelClosed(i, menuC0164m);
            } finally {
                tVar.d = false;
            }
        }
    }

    public final void o(MenuC0164m menuC0164m) {
        C0218k c0218k;
        if (this.f2285L) {
            return;
        }
        this.f2285L = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2316r;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((c1) actionBarOverlayLayout.f1310e).f2982a.f1373a;
        if (actionMenuView != null && (c0218k = actionMenuView.f1334t) != null) {
            c0218k.e();
            C0210g c0210g = c0218k.f3032t;
            if (c0210g != null && c0210g.b()) {
                c0210g.i.dismiss();
            }
        }
        Window.Callback callback = this.f2310l.getCallback();
        if (callback != null && !this.f2291R) {
            callback.onPanelClosed(108, menuC0164m);
        }
        this.f2285L = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0115, code lost:
    
        if (r2.equals("ImageButton") == false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View c0182d;
        int i;
        String str2 = str;
        char c2 = 4;
        View view2 = null;
        if (this.f2305f0 == null) {
            int[] iArr = f.a.f2143j;
            Context context2 = this.f2309k;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f2305f0 = new C0093B();
            } else {
                try {
                    this.f2305f0 = (C0093B) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f2305f0 = new C0093B();
                }
            }
        }
        C0093B c0093b = this.f2305f0;
        int i2 = e1.f2994a;
        c0093b.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f2157x, 0, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context c0146c = (resourceId == 0 || ((context instanceof C0146c) && ((C0146c) context).f2625a == resourceId)) ? context : new C0146c(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (str2.equals("RatingBar")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1455429095:
                if (str2.equals("CheckedTextView")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1346021293:
                if (str2.equals("MultiAutoCompleteTextView")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -938935918:
                if (str2.equals("TextView")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -937446323:
                break;
            case -658531749:
                if (str2.equals("SeekBar")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -339785223:
                if (str2.equals("Spinner")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 776382189:
                if (str2.equals("RadioButton")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 799298502:
                if (str2.equals("ToggleButton")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 1125864064:
                if (str2.equals("ImageView")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 1413872058:
                if (str2.equals("AutoCompleteTextView")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 1601505219:
                if (str2.equals("CheckBox")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 1666676343:
                if (str2.equals("EditText")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 2001146706:
                if (str2.equals("Button")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                c0182d = new C0182D(c0146c, attributeSet);
                break;
            case 1:
                c0182d = new C0232r(c0146c, attributeSet);
                break;
            case 2:
                c0182d = new C0248z(c0146c, attributeSet);
                break;
            case 3:
                c0182d = c0093b.e(c0146c, attributeSet);
                break;
            case 4:
                c0182d = new C0244x(c0146c, attributeSet, com.football.transfertrivia.R.attr.imageButtonStyle);
                break;
            case 5:
                c0182d = new C0184F(c0146c, attributeSet);
                break;
            case 6:
                c0182d = new C0194P(c0146c, attributeSet);
                break;
            case 7:
                c0182d = c0093b.d(c0146c, attributeSet);
                break;
            case '\b':
                c0182d = new C0213h0(c0146c, attributeSet);
                break;
            case '\t':
                c0182d = new C0246y(c0146c, attributeSet, 0);
                break;
            case '\n':
                c0182d = c0093b.a(c0146c, attributeSet);
                break;
            case 11:
                c0182d = c0093b.c(c0146c, attributeSet);
                break;
            case '\f':
                c0182d = new C0240v(c0146c, attributeSet);
                break;
            case '\r':
                c0182d = c0093b.b(c0146c, attributeSet);
                break;
            default:
                c0182d = null;
                break;
        }
        if (c0182d == null && context != c0146c) {
            Object[] objArr = c0093b.f2169a;
            if (str2.equals("view")) {
                str2 = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c0146c;
                objArr[1] = attributeSet;
                if (-1 == str2.indexOf(46)) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr = C0093B.f2168g;
                        if (i3 < 3) {
                            View f2 = c0093b.f(c0146c, str2, strArr[i3]);
                            if (f2 != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = f2;
                            } else {
                                i3++;
                            }
                        }
                    }
                } else {
                    View f3 = c0093b.f(c0146c, str2, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = f3;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            c0182d = view2;
        }
        if (c0182d != null) {
            Context context3 = c0182d.getContext();
            if ((context3 instanceof ContextWrapper) && c0182d.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C0093B.f2165c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c0182d.setOnClickListener(new ViewOnClickListenerC0092A(c0182d, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = c0146c.obtainStyledAttributes(attributeSet, C0093B.d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = T.f372a;
                    i = 0;
                    new K.C(com.football.transfertrivia.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).f(c0182d, Boolean.valueOf(z2));
                } else {
                    i = 0;
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = c0146c.obtainStyledAttributes(attributeSet, C0093B.f2166e);
                if (obtainStyledAttributes5.hasValue(i)) {
                    T.m(c0182d, obtainStyledAttributes5.getString(i));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = c0146c.obtainStyledAttributes(attributeSet, C0093B.f2167f);
                if (obtainStyledAttributes6.hasValue(i)) {
                    boolean z3 = obtainStyledAttributes6.getBoolean(i, i);
                    WeakHashMap weakHashMap2 = T.f372a;
                    new K.C(com.football.transfertrivia.R.id.tag_screen_reader_focusable, Boolean.class, i, 28, 0).f(c0182d, Boolean.valueOf(z3));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return c0182d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.i() != false) goto L20;
     */
    @Override // k.InterfaceC0162k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(MenuC0164m menuC0164m) {
        ActionMenuView actionMenuView;
        C0218k c0218k;
        C0218k c0218k2;
        C0218k c0218k3;
        InterfaceC0217j0 interfaceC0217j0 = this.f2316r;
        if (interfaceC0217j0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0217j0;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((c1) actionBarOverlayLayout.f1310e).f2982a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1373a) != null && actionMenuView.f1333s) {
                if (ViewConfiguration.get(this.f2309k).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2316r;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((c1) actionBarOverlayLayout2.f1310e).f2982a.f1373a;
                    if (actionMenuView2 != null) {
                        C0218k c0218k4 = actionMenuView2.f1334t;
                        if (c0218k4 != null) {
                            if (c0218k4.f3033u == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f2310l.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2316r;
                actionBarOverlayLayout3.k();
                ActionMenuView actionMenuView3 = ((c1) actionBarOverlayLayout3.f1310e).f2982a.f1373a;
                if ((actionMenuView3 == null || (c0218k3 = actionMenuView3.f1334t) == null || !c0218k3.i()) ? false : true) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2316r;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView4 = ((c1) actionBarOverlayLayout4.f1310e).f2982a.f1373a;
                    if (actionMenuView4 != null && (c0218k2 = actionMenuView4.f1334t) != null) {
                        c0218k2.e();
                    }
                    if (this.f2291R) {
                        return;
                    }
                    callback.onPanelClosed(108, y(0).h);
                    return;
                }
                if (callback == null || this.f2291R) {
                    return;
                }
                if (this.f2299Z && (1 & this.f2300a0) != 0) {
                    View decorView = this.f2310l.getDecorView();
                    n nVar = this.f2301b0;
                    decorView.removeCallbacks(nVar);
                    nVar.run();
                }
                x y2 = y(0);
                MenuC0164m menuC0164m2 = y2.h;
                if (menuC0164m2 == null || y2.f2270o || !callback.onPreparePanel(0, y2.f2264g, menuC0164m2)) {
                    return;
                }
                callback.onMenuOpened(108, y2.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f2316r;
                actionBarOverlayLayout5.k();
                ActionMenuView actionMenuView5 = ((c1) actionBarOverlayLayout5.f1310e).f2982a.f1373a;
                if (actionMenuView5 == null || (c0218k = actionMenuView5.f1334t) == null) {
                    return;
                }
                c0218k.l();
                return;
            }
        }
        x y3 = y(0);
        y3.f2269n = true;
        r(y3, false);
        D(y3, null);
    }

    @Override // k.InterfaceC0162k
    public final boolean q(MenuC0164m menuC0164m, MenuItem menuItem) {
        x xVar;
        Window.Callback callback = this.f2310l.getCallback();
        if (callback != null && !this.f2291R) {
            MenuC0164m k2 = menuC0164m.k();
            x[] xVarArr = this.f2286M;
            int length = xVarArr != null ? xVarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    xVar = xVarArr[i];
                    if (xVar != null && xVar.h == k2) {
                        break;
                    }
                    i++;
                } else {
                    xVar = null;
                    break;
                }
            }
            if (xVar != null) {
                return callback.onMenuItemSelected(xVar.f2259a, menuItem);
            }
        }
        return false;
    }

    public final void r(x xVar, boolean z2) {
        w wVar;
        InterfaceC0217j0 interfaceC0217j0;
        C0218k c0218k;
        if (z2 && xVar.f2259a == 0 && (interfaceC0217j0 = this.f2316r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0217j0;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((c1) actionBarOverlayLayout.f1310e).f2982a.f1373a;
            if (actionMenuView != null && (c0218k = actionMenuView.f1334t) != null && c0218k.i()) {
                o(xVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f2309k.getSystemService("window");
        if (windowManager != null && xVar.f2268m && (wVar = xVar.f2262e) != null) {
            windowManager.removeView(wVar);
            if (z2) {
                n(xVar.f2259a, xVar, null);
            }
        }
        xVar.f2266k = false;
        xVar.f2267l = false;
        xVar.f2268m = false;
        xVar.f2263f = null;
        xVar.f2269n = true;
        if (this.f2287N == xVar) {
            this.f2287N = null;
        }
        if (xVar.f2259a == 0) {
            H();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00db, code lost:
    
        if (r7.e() != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0101, code lost:
    
        if (r7.l() != false) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(KeyEvent keyEvent) {
        View decorView;
        boolean z2;
        boolean z3;
        ActionMenuView actionMenuView;
        C0218k c0218k;
        Object obj = this.f2308j;
        if (((obj instanceof InterfaceC0013l) || (obj instanceof DialogInterfaceC0105f)) && (decorView = this.f2310l.getDecorView()) != null && A.c.z(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            t tVar = this.f2311m;
            Window.Callback callback = this.f2310l.getCallback();
            tVar.getClass();
            try {
                tVar.f2254c = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                tVar.f2254c = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f2288O = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                x y2 = y(0);
                if (y2.f2268m) {
                    return true;
                }
                F(y2, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f2319u != null) {
                    return true;
                }
                x y3 = y(0);
                InterfaceC0217j0 interfaceC0217j0 = this.f2316r;
                Context context = this.f2309k;
                if (interfaceC0217j0 != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0217j0;
                    actionBarOverlayLayout.k();
                    Toolbar toolbar = ((c1) actionBarOverlayLayout.f1310e).f2982a;
                    if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1373a) != null && actionMenuView.f1333s && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2316r;
                        actionBarOverlayLayout2.k();
                        ActionMenuView actionMenuView2 = ((c1) actionBarOverlayLayout2.f1310e).f2982a.f1373a;
                        if (actionMenuView2 == null || (c0218k = actionMenuView2.f1334t) == null || !c0218k.i()) {
                            if (!this.f2291R && F(y3, keyEvent)) {
                                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2316r;
                                actionBarOverlayLayout3.k();
                                ActionMenuView actionMenuView3 = ((c1) actionBarOverlayLayout3.f1310e).f2982a.f1373a;
                                if (actionMenuView3 != null) {
                                    C0218k c0218k2 = actionMenuView3.f1334t;
                                    if (c0218k2 != null) {
                                    }
                                }
                            }
                            z2 = false;
                        } else {
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2316r;
                            actionBarOverlayLayout4.k();
                            ActionMenuView actionMenuView4 = ((c1) actionBarOverlayLayout4.f1310e).f2982a.f1373a;
                            if (actionMenuView4 != null) {
                                C0218k c0218k3 = actionMenuView4.f1334t;
                                if (c0218k3 != null) {
                                }
                            }
                            z2 = false;
                        }
                        if (z2) {
                            return true;
                        }
                        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                        if (audioManager != null) {
                            audioManager.playSoundEffect(0);
                            return true;
                        }
                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                        return true;
                    }
                }
                boolean z4 = y3.f2268m;
                if (z4 || y3.f2267l) {
                    r(y3, true);
                    z2 = z4;
                    if (z2) {
                    }
                } else {
                    if (y3.f2266k) {
                        if (y3.f2270o) {
                            y3.f2266k = false;
                            z3 = F(y3, keyEvent);
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            D(y3, keyEvent);
                            z2 = true;
                            if (z2) {
                            }
                        }
                    }
                    z2 = false;
                    if (z2) {
                    }
                }
            }
        } else if (C()) {
            return true;
        }
        return false;
    }

    public final void u(int i) {
        x y2 = y(i);
        if (y2.h != null) {
            Bundle bundle = new Bundle();
            y2.h.t(bundle);
            if (bundle.size() > 0) {
                y2.f2271p = bundle;
            }
            y2.h.w();
            y2.h.clear();
        }
        y2.f2270o = true;
        y2.f2269n = true;
        if ((i == 108 || i == 0) && this.f2316r != null) {
            x y3 = y(0);
            y3.f2266k = false;
            F(y3, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        int i = 1;
        int i2 = 0;
        if (this.f2275A) {
            return;
        }
        int[] iArr = f.a.f2143j;
        Context context = this.f2309k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            f(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            f(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            f(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            f(10);
        }
        this.f2283J = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        w();
        this.f2310l.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f2284K) {
            viewGroup = this.f2282I ? (ViewGroup) from.inflate(com.football.transfertrivia.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.football.transfertrivia.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f2283J) {
            viewGroup = (ViewGroup) from.inflate(com.football.transfertrivia.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f2281H = false;
            this.f2280G = false;
        } else if (this.f2280G) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.football.transfertrivia.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0146c(context, typedValue.resourceId) : context).inflate(com.football.transfertrivia.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0217j0 interfaceC0217j0 = (InterfaceC0217j0) viewGroup.findViewById(com.football.transfertrivia.R.id.decor_content_parent);
            this.f2316r = interfaceC0217j0;
            interfaceC0217j0.setWindowCallback(this.f2310l.getCallback());
            if (this.f2281H) {
                ((ActionBarOverlayLayout) this.f2316r).j(109);
            }
            if (this.f2279E) {
                ((ActionBarOverlayLayout) this.f2316r).j(2);
            }
            if (this.F) {
                ((ActionBarOverlayLayout) this.f2316r).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f2280G + ", windowActionBarOverlay: " + this.f2281H + ", android:windowIsFloating: " + this.f2283J + ", windowActionModeOverlay: " + this.f2282I + ", windowNoTitle: " + this.f2284K + " }");
        }
        o oVar = new o(this, i2);
        WeakHashMap weakHashMap = T.f372a;
        K.H.u(viewGroup, oVar);
        if (this.f2316r == null) {
            this.f2277C = (TextView) viewGroup.findViewById(com.football.transfertrivia.R.id.title);
        }
        boolean z2 = h1.f3011a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e3) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.football.transfertrivia.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f2310l.findViewById(R.id.content);
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
        this.f2310l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new o(this, i));
        this.f2276B = viewGroup;
        Object obj = this.f2308j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2315q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0217j0 interfaceC0217j02 = this.f2316r;
            if (interfaceC0217j02 != null) {
                interfaceC0217j02.setWindowTitle(title);
            } else {
                I i3 = this.f2313o;
                if (i3 != null) {
                    c1 c1Var = (c1) i3.f2187e;
                    if (!c1Var.f2987g) {
                        c1Var.h = title;
                        if ((c1Var.f2983b & 8) != 0) {
                            Toolbar toolbar = c1Var.f2982a;
                            toolbar.setTitle(title);
                            if (c1Var.f2987g) {
                                T.m(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f2277C;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f2276B.findViewById(R.id.content);
        View decorView = this.f2310l.getDecorView();
        contentFrameLayout2.f1353g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.f2275A = true;
        x y2 = y(0);
        if (this.f2291R || y2.h != null) {
            return;
        }
        A(108);
    }

    public final void w() {
        if (this.f2310l == null) {
            Object obj = this.f2308j;
            if (obj instanceof Activity) {
                l(((Activity) obj).getWindow());
            }
        }
        if (this.f2310l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final AbstractC0039g x(Context context) {
        if (this.f2297X == null) {
            if (C0014m.d == null) {
                Context applicationContext = context.getApplicationContext();
                LocationManager locationManager = (LocationManager) applicationContext.getSystemService("location");
                C0014m c0014m = new C0014m();
                c0014m.f426c = new C0097F();
                c0014m.f424a = applicationContext;
                c0014m.f425b = locationManager;
                C0014m.d = c0014m;
            }
            this.f2297X = new u(this, C0014m.d);
        }
        return this.f2297X;
    }

    public final x y(int i) {
        x[] xVarArr = this.f2286M;
        if (xVarArr == null || xVarArr.length <= i) {
            x[] xVarArr2 = new x[i + 1];
            if (xVarArr != null) {
                System.arraycopy(xVarArr, 0, xVarArr2, 0, xVarArr.length);
            }
            this.f2286M = xVarArr2;
            xVarArr = xVarArr2;
        }
        x xVar = xVarArr[i];
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = new x();
        xVar2.f2259a = i;
        xVar2.f2269n = false;
        xVarArr[i] = xVar2;
        return xVar2;
    }

    public final void z() {
        v();
        if (this.f2280G && this.f2313o == null) {
            Object obj = this.f2308j;
            if (obj instanceof Activity) {
                this.f2313o = new I((Activity) obj, this.f2281H);
            } else if (obj instanceof Dialog) {
                this.f2313o = new I((Dialog) obj);
            }
            I i = this.f2313o;
            if (i != null) {
                i.c0(this.f2302c0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}

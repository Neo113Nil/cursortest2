package g;

import K.C0010c0;
import K.C0019l;
import K.InterfaceC0018k;
import K.T;
import Y.AbstractC0045g;
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
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.EnumC0080m;
import androidx.recyclerview.widget.RecyclerView;
import j.AbstractC0175a;
import j.C0177c;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.C0197h;
import k.C0198i;
import k.C0204o;
import k.InterfaceC0200k;
import k.MenuC0202m;
import l.C0221A;
import l.C0225E;
import l.C0227G;
import l.C0237Q;
import l.C0251g;
import l.C0258j0;
import l.C0259k;
import l.C0277t;
import l.C0279u;
import l.C0283w;
import l.C0287y;
import l.C0289z;
import l.InterfaceC0262l0;
import l.InterfaceC0264m0;
import l.Z0;
import l.e1;
import l.g1;
import l.j1;
import z.AbstractC0385c;

/* loaded from: classes.dex */
public final class z extends n implements InterfaceC0200k, LayoutInflater.Factory2 {

    /* renamed from: h0, reason: collision with root package name */
    public static final o.k f2712h0 = new o.k();

    /* renamed from: i0, reason: collision with root package name */
    public static final int[] f2713i0 = {R.attr.windowBackground};

    /* renamed from: j0, reason: collision with root package name */
    public static final boolean f2714j0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    public ViewGroup f2715A;

    /* renamed from: B, reason: collision with root package name */
    public TextView f2716B;

    /* renamed from: C, reason: collision with root package name */
    public View f2717C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2718D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2719E;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f2720G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f2721H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2722I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2723J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f2724K;

    /* renamed from: L, reason: collision with root package name */
    public y[] f2725L;

    /* renamed from: M, reason: collision with root package name */
    public y f2726M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f2727N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f2728O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2729P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f2730Q;

    /* renamed from: R, reason: collision with root package name */
    public Configuration f2731R;

    /* renamed from: S, reason: collision with root package name */
    public final int f2732S;

    /* renamed from: T, reason: collision with root package name */
    public int f2733T;

    /* renamed from: U, reason: collision with root package name */
    public int f2734U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f2735V;

    /* renamed from: W, reason: collision with root package name */
    public v f2736W;

    /* renamed from: X, reason: collision with root package name */
    public v f2737X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f2738Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f2739Z;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f2741b0;

    /* renamed from: c0, reason: collision with root package name */
    public Rect f2742c0;

    /* renamed from: d0, reason: collision with root package name */
    public Rect f2743d0;

    /* renamed from: e0, reason: collision with root package name */
    public C0115C f2744e0;

    /* renamed from: f0, reason: collision with root package name */
    public OnBackInvokedDispatcher f2745f0;

    /* renamed from: g0, reason: collision with root package name */
    public OnBackInvokedCallback f2746g0;

    /* renamed from: j, reason: collision with root package name */
    public final Object f2747j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f2748k;

    /* renamed from: l, reason: collision with root package name */
    public Window f2749l;

    /* renamed from: m, reason: collision with root package name */
    public u f2750m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f2751n;

    /* renamed from: o, reason: collision with root package name */
    public J f2752o;

    /* renamed from: p, reason: collision with root package name */
    public j.h f2753p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2754q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0262l0 f2755r;

    /* renamed from: s, reason: collision with root package name */
    public p f2756s;

    /* renamed from: t, reason: collision with root package name */
    public p f2757t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC0175a f2758u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f2759v;

    /* renamed from: w, reason: collision with root package name */
    public PopupWindow f2760w;

    /* renamed from: x, reason: collision with root package name */
    public o f2761x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2763z;

    /* renamed from: y, reason: collision with root package name */
    public C0010c0 f2762y = null;

    /* renamed from: a0, reason: collision with root package name */
    public final o f2740a0 = new o(this, 0);

    public z(Context context, Window window, InterfaceC0130j interfaceC0130j, Object obj) {
        AbstractActivityC0129i abstractActivityC0129i;
        this.f2732S = -100;
        this.f2748k = context;
        this.f2747j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC0129i)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC0129i = (AbstractActivityC0129i) context;
                    break;
                }
            }
            abstractActivityC0129i = null;
            if (abstractActivityC0129i != null) {
                this.f2732S = ((z) abstractActivityC0129i.l()).f2732S;
            }
        }
        if (this.f2732S == -100) {
            o.k kVar = f2712h0;
            Integer num = (Integer) kVar.getOrDefault(this.f2747j.getClass().getName(), null);
            if (num != null) {
                this.f2732S = num.intValue();
                kVar.remove(this.f2747j.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        C0279u.d();
    }

    public static G.f o(Context context) {
        G.f fVar;
        G.f fVar2;
        if (Build.VERSION.SDK_INT >= 33 || (fVar = n.f2682c) == null) {
            return null;
        }
        G.f b2 = s.b(context.getApplicationContext().getResources().getConfiguration());
        G.g gVar = fVar.f431a;
        if (gVar.f432a.isEmpty()) {
            fVar2 = G.f.f430b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b2.f431a.f432a.size() + gVar.f432a.size()) {
                Locale locale = i < gVar.f432a.size() ? gVar.f432a.get(i) : b2.f431a.f432a.get(i - gVar.f432a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            fVar2 = new G.f(new G.g(G.e.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return fVar2.f431a.f432a.isEmpty() ? b2 : fVar2;
    }

    public static Configuration s(Context context, int i, G.f fVar, Configuration configuration, boolean z2) {
        int i2 = i != 1 ? i != 2 ? z2 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = RecyclerView.f1949A0;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (fVar != null) {
            s.d(configuration2, fVar);
        }
        return configuration2;
    }

    public final void A(int i) {
        this.f2739Z = (1 << i) | this.f2739Z;
        if (this.f2738Y) {
            return;
        }
        View decorView = this.f2749l.getDecorView();
        o oVar = this.f2740a0;
        WeakHashMap weakHashMap = T.f633a;
        decorView.postOnAnimation(oVar);
        this.f2738Y = true;
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
                if (this.f2737X == null) {
                    this.f2737X = new v(this, context);
                }
                return this.f2737X.f();
            }
        }
        return i;
    }

    public final boolean C() {
        InterfaceC0264m0 interfaceC0264m0;
        Z0 z02;
        boolean z2 = this.f2727N;
        this.f2727N = false;
        y y2 = y(0);
        if (y2.f2708m) {
            if (!z2) {
                r(y2, true);
            }
            return true;
        }
        AbstractC0175a abstractC0175a = this.f2758u;
        if (abstractC0175a != null) {
            abstractC0175a.a();
            return true;
        }
        z();
        J j2 = this.f2752o;
        if (j2 == null || (interfaceC0264m0 = j2.h) == null || (z02 = ((e1) interfaceC0264m0).f3414a.f1753L) == null || z02.f3393b == null) {
            return false;
        }
        Z0 z03 = ((e1) interfaceC0264m0).f3414a.f1753L;
        C0204o c0204o = z03 == null ? null : z03.f3393b;
        if (c0204o != null) {
            c0204o.collapseActionView();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0173, code lost:
    
        if (r3.f3180f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0153, code lost:
    
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(y yVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (yVar.f2708m || this.f2730Q) {
            return;
        }
        int i2 = yVar.f2699a;
        Context context = this.f2748k;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f2749l.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, yVar.h)) {
            r(yVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !F(yVar, keyEvent)) {
            return;
        }
        x xVar = yVar.f2702e;
        if (xVar == null || yVar.f2709n) {
            if (xVar == null) {
                z();
                J j2 = this.f2752o;
                Context x2 = j2 != null ? j2.x() : null;
                if (x2 != null) {
                    context = x2;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.luckycounter.drinkwater.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    newTheme.applyStyle(i3, true);
                }
                newTheme.resolveAttribute(com.luckycounter.drinkwater.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                } else {
                    newTheme.applyStyle(com.luckycounter.drinkwater.R.style.Theme_AppCompat_CompactMenu, true);
                }
                C0177c c0177c = new C0177c(context, 0);
                c0177c.getTheme().setTo(newTheme);
                yVar.f2705j = c0177c;
                TypedArray obtainStyledAttributes = c0177c.obtainStyledAttributes(f.a.f2565j);
                yVar.f2700b = obtainStyledAttributes.getResourceId(86, 0);
                yVar.d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                yVar.f2702e = new x(this, yVar.f2705j);
                yVar.f2701c = 81;
            } else if (yVar.f2709n && xVar.getChildCount() > 0) {
                yVar.f2702e.removeAllViews();
            }
            View view = yVar.f2704g;
            if (view == null) {
                if (yVar.h != null) {
                    if (this.f2757t == null) {
                        this.f2757t = new p(this, 3);
                    }
                    p pVar = this.f2757t;
                    if (yVar.i == null) {
                        C0198i c0198i = new C0198i(yVar.f2705j);
                        yVar.i = c0198i;
                        c0198i.f3179e = pVar;
                        MenuC0202m menuC0202m = yVar.h;
                        menuC0202m.b(c0198i, menuC0202m.f3187a);
                    }
                    C0198i c0198i2 = yVar.i;
                    x xVar2 = yVar.f2702e;
                    if (c0198i2.d == null) {
                        c0198i2.d = (ExpandedMenuView) c0198i2.f3177b.inflate(com.luckycounter.drinkwater.R.layout.abc_expanded_menu_layout, (ViewGroup) xVar2, false);
                        if (c0198i2.f3180f == null) {
                            c0198i2.f3180f = new C0197h(c0198i2);
                        }
                        c0198i2.d.setAdapter((ListAdapter) c0198i2.f3180f);
                        c0198i2.d.setOnItemClickListener(c0198i2);
                    }
                    ExpandedMenuView expandedMenuView = c0198i2.d;
                    yVar.f2703f = expandedMenuView;
                }
                yVar.f2709n = true;
                return;
            }
            yVar.f2703f = view;
            if (yVar.f2703f != null) {
                if (yVar.f2704g == null) {
                    C0198i c0198i3 = yVar.i;
                    if (c0198i3.f3180f == null) {
                        c0198i3.f3180f = new C0197h(c0198i3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = yVar.f2703f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                yVar.f2702e.setBackgroundResource(yVar.f2700b);
                ViewParent parent = yVar.f2703f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(yVar.f2703f);
                }
                yVar.f2702e.addView(yVar.f2703f, layoutParams2);
                if (!yVar.f2703f.hasFocus()) {
                    yVar.f2703f.requestFocus();
                }
            }
            yVar.f2709n = true;
            return;
        }
        View view2 = yVar.f2704g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            yVar.f2707l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = yVar.f2701c;
            layoutParams3.windowAnimations = yVar.d;
            windowManager.addView(yVar.f2702e, layoutParams3);
            yVar.f2708m = true;
            if (i2 != 0) {
                H();
                return;
            }
            return;
        }
        i = -2;
        yVar.f2707l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = yVar.f2701c;
        layoutParams32.windowAnimations = yVar.d;
        windowManager.addView(yVar.f2702e, layoutParams32);
        yVar.f2708m = true;
        if (i2 != 0) {
        }
    }

    public final boolean E(y yVar, int i, KeyEvent keyEvent) {
        MenuC0202m menuC0202m;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((yVar.f2706k || F(yVar, keyEvent)) && (menuC0202m = yVar.h) != null) {
            return menuC0202m.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final boolean F(y yVar, KeyEvent keyEvent) {
        InterfaceC0262l0 interfaceC0262l0;
        InterfaceC0262l0 interfaceC0262l02;
        Resources.Theme theme;
        InterfaceC0262l0 interfaceC0262l03;
        InterfaceC0262l0 interfaceC0262l04;
        if (this.f2730Q) {
            return false;
        }
        if (yVar.f2706k) {
            return true;
        }
        y yVar2 = this.f2726M;
        if (yVar2 != null && yVar2 != yVar) {
            r(yVar2, false);
        }
        Window.Callback callback = this.f2749l.getCallback();
        int i = yVar.f2699a;
        if (callback != null) {
            yVar.f2704g = callback.onCreatePanelView(i);
        }
        boolean z2 = i == 0 || i == 108;
        if (z2 && (interfaceC0262l04 = this.f2755r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0262l04;
            actionBarOverlayLayout.k();
            ((e1) actionBarOverlayLayout.f1699e).f3422l = true;
        }
        if (yVar.f2704g == null) {
            MenuC0202m menuC0202m = yVar.h;
            if (menuC0202m == null || yVar.f2710o) {
                if (menuC0202m == null) {
                    Context context = this.f2748k;
                    if ((i == 0 || i == 108) && this.f2755r != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.luckycounter.drinkwater.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.luckycounter.drinkwater.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.luckycounter.drinkwater.R.attr.actionBarWidgetTheme, typedValue, true);
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
                            C0177c c0177c = new C0177c(context, 0);
                            c0177c.getTheme().setTo(theme);
                            context = c0177c;
                        }
                    }
                    MenuC0202m menuC0202m2 = new MenuC0202m(context);
                    menuC0202m2.f3190e = this;
                    MenuC0202m menuC0202m3 = yVar.h;
                    if (menuC0202m2 != menuC0202m3) {
                        if (menuC0202m3 != null) {
                            menuC0202m3.r(yVar.i);
                        }
                        yVar.h = menuC0202m2;
                        C0198i c0198i = yVar.i;
                        if (c0198i != null) {
                            menuC0202m2.b(c0198i, menuC0202m2.f3187a);
                        }
                    }
                    if (yVar.h == null) {
                        return false;
                    }
                }
                if (z2 && (interfaceC0262l02 = this.f2755r) != null) {
                    if (this.f2756s == null) {
                        this.f2756s = new p(this, 2);
                    }
                    ((ActionBarOverlayLayout) interfaceC0262l02).l(yVar.h, this.f2756s);
                }
                yVar.h.w();
                if (!callback.onCreatePanelMenu(i, yVar.h)) {
                    MenuC0202m menuC0202m4 = yVar.h;
                    if (menuC0202m4 != null) {
                        if (menuC0202m4 != null) {
                            menuC0202m4.r(yVar.i);
                        }
                        yVar.h = null;
                    }
                    if (z2 && (interfaceC0262l0 = this.f2755r) != null) {
                        ((ActionBarOverlayLayout) interfaceC0262l0).l(null, this.f2756s);
                    }
                    return false;
                }
                yVar.f2710o = false;
            }
            yVar.h.w();
            Bundle bundle = yVar.f2711p;
            if (bundle != null) {
                yVar.h.s(bundle);
                yVar.f2711p = null;
            }
            if (!callback.onPreparePanel(0, yVar.f2704g, yVar.h)) {
                if (z2 && (interfaceC0262l03 = this.f2755r) != null) {
                    ((ActionBarOverlayLayout) interfaceC0262l03).l(null, this.f2756s);
                }
                yVar.h.v();
                return false;
            }
            yVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            yVar.h.v();
        }
        yVar.f2706k = true;
        yVar.f2707l = false;
        this.f2726M = yVar;
        return true;
    }

    public final void G() {
        if (this.f2763z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f2745f0 != null && (y(0).f2708m || this.f2758u != null)) {
                z2 = true;
            }
            if (z2 && this.f2746g0 == null) {
                this.f2746g0 = t.b(this.f2745f0, this);
            } else {
                if (z2 || (onBackInvokedCallback = this.f2746g0) == null) {
                    return;
                }
                t.c(this.f2745f0, onBackInvokedCallback);
                this.f2746g0 = null;
            }
        }
    }

    @Override // g.n
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f2748k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof z) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // g.n
    public final void c() {
        String str;
        this.f2728O = true;
        m(false, true);
        w();
        Object obj = this.f2747j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = AbstractC0385c.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                J j2 = this.f2752o;
                if (j2 == null) {
                    this.f2741b0 = true;
                } else {
                    j2.z(true);
                }
            }
            synchronized (n.h) {
                n.g(this);
                n.f2685g.add(new WeakReference(this));
            }
        }
        this.f2731R = new Configuration(this.f2748k.getResources().getConfiguration());
        this.f2729P = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // g.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        v vVar;
        v vVar2;
        if (this.f2747j instanceof Activity) {
            synchronized (n.h) {
                n.g(this);
            }
        }
        if (this.f2738Y) {
            this.f2749l.getDecorView().removeCallbacks(this.f2740a0);
        }
        this.f2730Q = true;
        if (this.f2732S != -100) {
            Object obj = this.f2747j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f2712h0.put(this.f2747j.getClass().getName(), Integer.valueOf(this.f2732S));
                vVar = this.f2736W;
                if (vVar != null) {
                    vVar.c();
                }
                vVar2 = this.f2737X;
                if (vVar2 == null) {
                    vVar2.c();
                    return;
                }
                return;
            }
        }
        f2712h0.remove(this.f2747j.getClass().getName());
        vVar = this.f2736W;
        if (vVar != null) {
        }
        vVar2 = this.f2737X;
        if (vVar2 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.i() != false) goto L20;
     */
    @Override // k.InterfaceC0200k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(MenuC0202m menuC0202m) {
        ActionMenuView actionMenuView;
        C0259k c0259k;
        C0259k c0259k2;
        C0259k c0259k3;
        InterfaceC0262l0 interfaceC0262l0 = this.f2755r;
        if (interfaceC0262l0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0262l0;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((e1) actionBarOverlayLayout.f1699e).f3414a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1759a) != null && actionMenuView.f1722s) {
                if (ViewConfiguration.get(this.f2748k).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2755r;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((e1) actionBarOverlayLayout2.f1699e).f3414a.f1759a;
                    if (actionMenuView2 != null) {
                        C0259k c0259k4 = actionMenuView2.f1723t;
                        if (c0259k4 != null) {
                            if (c0259k4.f3465u == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f2749l.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2755r;
                actionBarOverlayLayout3.k();
                ActionMenuView actionMenuView3 = ((e1) actionBarOverlayLayout3.f1699e).f3414a.f1759a;
                if ((actionMenuView3 == null || (c0259k3 = actionMenuView3.f1723t) == null || !c0259k3.i()) ? false : true) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2755r;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView4 = ((e1) actionBarOverlayLayout4.f1699e).f3414a.f1759a;
                    if (actionMenuView4 != null && (c0259k2 = actionMenuView4.f1723t) != null) {
                        c0259k2.f();
                    }
                    if (this.f2730Q) {
                        return;
                    }
                    callback.onPanelClosed(108, y(0).h);
                    return;
                }
                if (callback == null || this.f2730Q) {
                    return;
                }
                if (this.f2738Y && (1 & this.f2739Z) != 0) {
                    View decorView = this.f2749l.getDecorView();
                    o oVar = this.f2740a0;
                    decorView.removeCallbacks(oVar);
                    oVar.run();
                }
                y y2 = y(0);
                MenuC0202m menuC0202m2 = y2.h;
                if (menuC0202m2 == null || y2.f2710o || !callback.onPreparePanel(0, y2.f2704g, menuC0202m2)) {
                    return;
                }
                callback.onMenuOpened(108, y2.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f2755r;
                actionBarOverlayLayout5.k();
                ActionMenuView actionMenuView5 = ((e1) actionBarOverlayLayout5.f1699e).f3414a.f1759a;
                if (actionMenuView5 == null || (c0259k = actionMenuView5.f1723t) == null) {
                    return;
                }
                c0259k.l();
                return;
            }
        }
        y y3 = y(0);
        y3.f2709n = true;
        r(y3, false);
        D(y3, null);
    }

    @Override // k.InterfaceC0200k
    public final boolean f(MenuC0202m menuC0202m, MenuItem menuItem) {
        y yVar;
        Window.Callback callback = this.f2749l.getCallback();
        if (callback != null && !this.f2730Q) {
            MenuC0202m k2 = menuC0202m.k();
            y[] yVarArr = this.f2725L;
            int length = yVarArr != null ? yVarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    yVar = yVarArr[i];
                    if (yVar != null && yVar.h == k2) {
                        break;
                    }
                    i++;
                } else {
                    yVar = null;
                    break;
                }
            }
            if (yVar != null) {
                return callback.onMenuItemSelected(yVar.f2699a, menuItem);
            }
        }
        return false;
    }

    @Override // g.n
    public final boolean h(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f2723J && i == 108) {
            return false;
        }
        if (this.F && i == 1) {
            this.F = false;
        }
        if (i == 1) {
            G();
            this.f2723J = true;
            return true;
        }
        if (i == 2) {
            G();
            this.f2718D = true;
            return true;
        }
        if (i == 5) {
            G();
            this.f2719E = true;
            return true;
        }
        if (i == 10) {
            G();
            this.f2721H = true;
            return true;
        }
        if (i == 108) {
            G();
            this.F = true;
            return true;
        }
        if (i != 109) {
            return this.f2749l.requestFeature(i);
        }
        G();
        this.f2720G = true;
        return true;
    }

    @Override // g.n
    public final void i(int i) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2715A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2748k).inflate(i, viewGroup);
        this.f2750m.a(this.f2749l.getCallback());
    }

    @Override // g.n
    public final void j(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2715A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2750m.a(this.f2749l.getCallback());
    }

    @Override // g.n
    public final void k(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2715A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2750m.a(this.f2749l.getCallback());
    }

    @Override // g.n
    public final void l(CharSequence charSequence) {
        this.f2754q = charSequence;
        InterfaceC0262l0 interfaceC0262l0 = this.f2755r;
        if (interfaceC0262l0 != null) {
            interfaceC0262l0.setWindowTitle(charSequence);
            return;
        }
        J j2 = this.f2752o;
        if (j2 == null) {
            TextView textView = this.f2716B;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        e1 e1Var = (e1) j2.h;
        if (e1Var.f3419g) {
            return;
        }
        e1Var.h = charSequence;
        if ((e1Var.f3415b & 8) != 0) {
            Toolbar toolbar = e1Var.f3414a;
            toolbar.setTitle(charSequence);
            if (e1Var.f3419g) {
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
    public final boolean m(boolean z2, boolean z3) {
        int i;
        Configuration configuration;
        G.f b2;
        int i2;
        boolean z4;
        Activity activity;
        if (this.f2730Q) {
            return false;
        }
        int i3 = this.f2732S;
        if (i3 == -100) {
            i3 = n.f2681b;
        }
        Context context = this.f2748k;
        int B2 = B(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        G.f o2 = i4 < 33 ? o(context) : null;
        if (!z3 && o2 != null) {
            o2 = s.b(context.getResources().getConfiguration());
        }
        Configuration s2 = s(context, B2, o2, null, false);
        boolean z5 = this.f2735V;
        Object obj = this.f2747j;
        boolean z6 = true;
        if (!z5 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.f2731R;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i5 = configuration.uiMode & 48;
                int i6 = s2.uiMode & 48;
                G.f b3 = s.b(configuration);
                b2 = o2 != null ? null : s.b(s2);
                i2 = i5 == i6 ? 512 : 0;
                if (b2 != null && !b3.equals(b2)) {
                    i2 |= 8196;
                }
                if (((~i) & i2) != 0 && z2 && this.f2728O && ((f2714j0 || this.f2729P) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31 && (i2 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(s2.getLayoutDirection());
                        }
                        if (i7 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new G0.o(12, activity));
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
                                s.d(configuration2, b2);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i8 = this.f2733T;
                            if (i8 != 0) {
                                context.setTheme(i8);
                                context.getTheme().applyStyle(this.f2733T, true);
                            }
                            if (z7 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof androidx.lifecycle.t) {
                                    if (((androidx.lifecycle.t) activity2).e().d.compareTo(EnumC0080m.f1898c) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f2729P && !this.f2730Q) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (z6 && (obj instanceof AbstractActivityC0129i)) {
                            if ((i2 & 512) != 0) {
                            }
                            if ((i2 & 4) != 0) {
                            }
                        }
                        if (b2 != null) {
                            s.c(s.b(context.getResources().getConfiguration()));
                        }
                        if (i3 == 0) {
                            x(context).i();
                        } else {
                            v vVar = this.f2736W;
                            if (vVar != null) {
                                vVar.c();
                            }
                        }
                        if (i3 == 3) {
                            if (this.f2737X == null) {
                                this.f2737X = new v(this, context);
                            }
                            this.f2737X.i();
                        } else {
                            v vVar2 = this.f2737X;
                            if (vVar2 != null) {
                                vVar2.c();
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
                    this.f2734U = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.f2734U = 0;
            }
        }
        this.f2735V = true;
        i = this.f2734U;
        configuration = this.f2731R;
        if (configuration == null) {
        }
        int i52 = configuration.uiMode & 48;
        int i62 = s2.uiMode & 48;
        G.f b32 = s.b(configuration);
        if (o2 != null) {
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

    public final void n(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f2749l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof u) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        u uVar = new u(this, callback);
        this.f2750m = uVar;
        window.setCallback(uVar);
        int[] iArr = f2713i0;
        Context context = this.f2748k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            C0279u a2 = C0279u.a();
            synchronized (a2) {
                drawable = a2.f3510a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f2749l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f2745f0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f2746g0) != null) {
            t.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2746g0 = null;
        }
        Object obj = this.f2747j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f2745f0 = t.a(activity);
                H();
            }
        }
        this.f2745f0 = null;
        H();
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
        View c0225e;
        int i;
        String str2 = str;
        char c2 = 4;
        View view2 = null;
        if (this.f2744e0 == null) {
            int[] iArr = f.a.f2565j;
            Context context2 = this.f2748k;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f2744e0 = new C0115C();
            } else {
                try {
                    this.f2744e0 = (C0115C) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f2744e0 = new C0115C();
                }
            }
        }
        C0115C c0115c = this.f2744e0;
        int i2 = g1.f3428a;
        c0115c.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f2579x, 0, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context c0177c = (resourceId == 0 || ((context instanceof C0177c) && ((C0177c) context).f3056a == resourceId)) ? context : new C0177c(context, resourceId);
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
                c0225e = new C0225E(c0177c, attributeSet);
                break;
            case 1:
                c0225e = new C0277t(c0177c, attributeSet);
                break;
            case 2:
                c0225e = new C0221A(c0177c, attributeSet);
                break;
            case 3:
                c0225e = c0115c.e(c0177c, attributeSet);
                break;
            case 4:
                c0225e = new C0287y(c0177c, attributeSet, com.luckycounter.drinkwater.R.attr.imageButtonStyle);
                break;
            case 5:
                c0225e = new C0227G(c0177c, attributeSet);
                break;
            case 6:
                c0225e = new C0237Q(c0177c, attributeSet);
                break;
            case 7:
                c0225e = c0115c.d(c0177c, attributeSet);
                break;
            case '\b':
                c0225e = new C0258j0(c0177c, attributeSet);
                break;
            case '\t':
                c0225e = new C0289z(c0177c, attributeSet, 0);
                break;
            case '\n':
                c0225e = c0115c.a(c0177c, attributeSet);
                break;
            case 11:
                c0225e = c0115c.c(c0177c, attributeSet);
                break;
            case '\f':
                c0225e = new C0283w(c0177c, attributeSet);
                break;
            case '\r':
                c0225e = c0115c.b(c0177c, attributeSet);
                break;
            default:
                c0225e = null;
                break;
        }
        if (c0225e == null && context != c0177c) {
            Object[] objArr = c0115c.f2592a;
            if (str2.equals("view")) {
                str2 = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c0177c;
                objArr[1] = attributeSet;
                if (-1 == str2.indexOf(46)) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr = C0115C.f2591g;
                        if (i3 < 3) {
                            View f2 = c0115c.f(c0177c, str2, strArr[i3]);
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
                    View f3 = c0115c.f(c0177c, str2, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = f3;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            c0225e = view2;
        }
        if (c0225e != null) {
            Context context3 = c0225e.getContext();
            if ((context3 instanceof ContextWrapper) && c0225e.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C0115C.f2588c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c0225e.setOnClickListener(new ViewOnClickListenerC0114B(c0225e, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = c0177c.obtainStyledAttributes(attributeSet, C0115C.d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = T.f633a;
                    i = 0;
                    new K.C(com.luckycounter.drinkwater.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).f(c0225e, Boolean.valueOf(z2));
                } else {
                    i = 0;
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = c0177c.obtainStyledAttributes(attributeSet, C0115C.f2589e);
                if (obtainStyledAttributes5.hasValue(i)) {
                    T.m(c0225e, obtainStyledAttributes5.getString(i));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = c0177c.obtainStyledAttributes(attributeSet, C0115C.f2590f);
                if (obtainStyledAttributes6.hasValue(i)) {
                    boolean z3 = obtainStyledAttributes6.getBoolean(i, i);
                    WeakHashMap weakHashMap2 = T.f633a;
                    new K.C(com.luckycounter.drinkwater.R.id.tag_screen_reader_focusable, Boolean.class, i, 28, 0).f(c0225e, Boolean.valueOf(z3));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return c0225e;
    }

    public final void p(int i, y yVar, MenuC0202m menuC0202m) {
        if (menuC0202m == null) {
            if (yVar == null && i >= 0) {
                y[] yVarArr = this.f2725L;
                if (i < yVarArr.length) {
                    yVar = yVarArr[i];
                }
            }
            if (yVar != null) {
                menuC0202m = yVar.h;
            }
        }
        if ((yVar == null || yVar.f2708m) && !this.f2730Q) {
            u uVar = this.f2750m;
            Window.Callback callback = this.f2749l.getCallback();
            uVar.getClass();
            try {
                uVar.d = true;
                callback.onPanelClosed(i, menuC0202m);
            } finally {
                uVar.d = false;
            }
        }
    }

    public final void q(MenuC0202m menuC0202m) {
        C0259k c0259k;
        if (this.f2724K) {
            return;
        }
        this.f2724K = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2755r;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((e1) actionBarOverlayLayout.f1699e).f3414a.f1759a;
        if (actionMenuView != null && (c0259k = actionMenuView.f1723t) != null) {
            c0259k.f();
            C0251g c0251g = c0259k.f3464t;
            if (c0251g != null && c0251g.b()) {
                c0251g.i.dismiss();
            }
        }
        Window.Callback callback = this.f2749l.getCallback();
        if (callback != null && !this.f2730Q) {
            callback.onPanelClosed(108, menuC0202m);
        }
        this.f2724K = false;
    }

    public final void r(y yVar, boolean z2) {
        x xVar;
        InterfaceC0262l0 interfaceC0262l0;
        C0259k c0259k;
        if (z2 && yVar.f2699a == 0 && (interfaceC0262l0 = this.f2755r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0262l0;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((e1) actionBarOverlayLayout.f1699e).f3414a.f1759a;
            if (actionMenuView != null && (c0259k = actionMenuView.f1723t) != null && c0259k.i()) {
                q(yVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f2748k.getSystemService("window");
        if (windowManager != null && yVar.f2708m && (xVar = yVar.f2702e) != null) {
            windowManager.removeView(xVar);
            if (z2) {
                p(yVar.f2699a, yVar, null);
            }
        }
        yVar.f2706k = false;
        yVar.f2707l = false;
        yVar.f2708m = false;
        yVar.f2703f = null;
        yVar.f2709n = true;
        if (this.f2726M == yVar) {
            this.f2726M = null;
        }
        if (yVar.f2699a == 0) {
            H();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00db, code lost:
    
        if (r7.f() != false) goto L90;
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
        C0259k c0259k;
        Object obj = this.f2747j;
        if (((obj instanceof InterfaceC0018k) || (obj instanceof DialogInterfaceC0126f)) && (decorView = this.f2749l.getDecorView()) != null && F1.l.w(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            u uVar = this.f2750m;
            Window.Callback callback = this.f2749l.getCallback();
            uVar.getClass();
            try {
                uVar.f2694c = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                uVar.f2694c = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f2727N = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                y y2 = y(0);
                if (y2.f2708m) {
                    return true;
                }
                F(y2, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f2758u != null) {
                    return true;
                }
                y y3 = y(0);
                InterfaceC0262l0 interfaceC0262l0 = this.f2755r;
                Context context = this.f2748k;
                if (interfaceC0262l0 != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0262l0;
                    actionBarOverlayLayout.k();
                    Toolbar toolbar = ((e1) actionBarOverlayLayout.f1699e).f3414a;
                    if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1759a) != null && actionMenuView.f1722s && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2755r;
                        actionBarOverlayLayout2.k();
                        ActionMenuView actionMenuView2 = ((e1) actionBarOverlayLayout2.f1699e).f3414a.f1759a;
                        if (actionMenuView2 == null || (c0259k = actionMenuView2.f1723t) == null || !c0259k.i()) {
                            if (!this.f2730Q && F(y3, keyEvent)) {
                                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2755r;
                                actionBarOverlayLayout3.k();
                                ActionMenuView actionMenuView3 = ((e1) actionBarOverlayLayout3.f1699e).f3414a.f1759a;
                                if (actionMenuView3 != null) {
                                    C0259k c0259k2 = actionMenuView3.f1723t;
                                    if (c0259k2 != null) {
                                    }
                                }
                            }
                            z2 = false;
                        } else {
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2755r;
                            actionBarOverlayLayout4.k();
                            ActionMenuView actionMenuView4 = ((e1) actionBarOverlayLayout4.f1699e).f3414a.f1759a;
                            if (actionMenuView4 != null) {
                                C0259k c0259k3 = actionMenuView4.f1723t;
                                if (c0259k3 != null) {
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
                boolean z4 = y3.f2708m;
                if (z4 || y3.f2707l) {
                    r(y3, true);
                    z2 = z4;
                    if (z2) {
                    }
                } else {
                    if (y3.f2706k) {
                        if (y3.f2710o) {
                            y3.f2706k = false;
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
        y y2 = y(i);
        if (y2.h != null) {
            Bundle bundle = new Bundle();
            y2.h.t(bundle);
            if (bundle.size() > 0) {
                y2.f2711p = bundle;
            }
            y2.h.w();
            y2.h.clear();
        }
        y2.f2710o = true;
        y2.f2709n = true;
        if ((i == 108 || i == 0) && this.f2755r != null) {
            y y3 = y(0);
            y3.f2706k = false;
            F(y3, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        int i = 1;
        int i2 = 0;
        if (this.f2763z) {
            return;
        }
        int[] iArr = f.a.f2565j;
        Context context = this.f2748k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            h(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            h(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            h(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            h(10);
        }
        this.f2722I = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        w();
        this.f2749l.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f2723J) {
            viewGroup = this.f2721H ? (ViewGroup) from.inflate(com.luckycounter.drinkwater.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.luckycounter.drinkwater.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f2722I) {
            viewGroup = (ViewGroup) from.inflate(com.luckycounter.drinkwater.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f2720G = false;
            this.F = false;
        } else if (this.F) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.luckycounter.drinkwater.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0177c(context, typedValue.resourceId) : context).inflate(com.luckycounter.drinkwater.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0262l0 interfaceC0262l0 = (InterfaceC0262l0) viewGroup.findViewById(com.luckycounter.drinkwater.R.id.decor_content_parent);
            this.f2755r = interfaceC0262l0;
            interfaceC0262l0.setWindowCallback(this.f2749l.getCallback());
            if (this.f2720G) {
                ((ActionBarOverlayLayout) this.f2755r).j(109);
            }
            if (this.f2718D) {
                ((ActionBarOverlayLayout) this.f2755r).j(2);
            }
            if (this.f2719E) {
                ((ActionBarOverlayLayout) this.f2755r).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.F + ", windowActionBarOverlay: " + this.f2720G + ", android:windowIsFloating: " + this.f2722I + ", windowActionModeOverlay: " + this.f2721H + ", windowNoTitle: " + this.f2723J + " }");
        }
        p pVar = new p(this, i2);
        WeakHashMap weakHashMap = T.f633a;
        K.H.u(viewGroup, pVar);
        if (this.f2755r == null) {
            this.f2716B = (TextView) viewGroup.findViewById(com.luckycounter.drinkwater.R.id.title);
        }
        boolean z2 = j1.f3445a;
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
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.luckycounter.drinkwater.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f2749l.findViewById(R.id.content);
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
        this.f2749l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new p(this, i));
        this.f2715A = viewGroup;
        Object obj = this.f2747j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2754q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0262l0 interfaceC0262l02 = this.f2755r;
            if (interfaceC0262l02 != null) {
                interfaceC0262l02.setWindowTitle(title);
            } else {
                J j2 = this.f2752o;
                if (j2 != null) {
                    e1 e1Var = (e1) j2.h;
                    if (!e1Var.f3419g) {
                        e1Var.h = title;
                        if ((e1Var.f3415b & 8) != 0) {
                            Toolbar toolbar = e1Var.f3414a;
                            toolbar.setTitle(title);
                            if (e1Var.f3419g) {
                                T.m(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f2716B;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f2715A.findViewById(R.id.content);
        View decorView = this.f2749l.getDecorView();
        contentFrameLayout2.f1739g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.f2763z = true;
        y y2 = y(0);
        if (this.f2730Q || y2.h != null) {
            return;
        }
        A(108);
    }

    public final void w() {
        if (this.f2749l == null) {
            Object obj = this.f2747j;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.f2749l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final AbstractC0045g x(Context context) {
        if (this.f2736W == null) {
            if (C0019l.d == null) {
                Context applicationContext = context.getApplicationContext();
                LocationManager locationManager = (LocationManager) applicationContext.getSystemService("location");
                C0019l c0019l = new C0019l();
                c0019l.f685c = new C0119G();
                c0019l.f683a = applicationContext;
                c0019l.f684b = locationManager;
                C0019l.d = c0019l;
            }
            this.f2736W = new v(this, C0019l.d);
        }
        return this.f2736W;
    }

    public final y y(int i) {
        y[] yVarArr = this.f2725L;
        if (yVarArr == null || yVarArr.length <= i) {
            y[] yVarArr2 = new y[i + 1];
            if (yVarArr != null) {
                System.arraycopy(yVarArr, 0, yVarArr2, 0, yVarArr.length);
            }
            this.f2725L = yVarArr2;
            yVarArr = yVarArr2;
        }
        y yVar = yVarArr[i];
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y();
        yVar2.f2699a = i;
        yVar2.f2709n = false;
        yVarArr[i] = yVar2;
        return yVar2;
    }

    public final void z() {
        v();
        if (this.F && this.f2752o == null) {
            Object obj = this.f2747j;
            if (obj instanceof Activity) {
                this.f2752o = new J((Activity) obj, this.f2720G);
            } else if (obj instanceof Dialog) {
                this.f2752o = new J((Dialog) obj);
            }
            J j2 = this.f2752o;
            if (j2 != null) {
                j2.z(this.f2741b0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}

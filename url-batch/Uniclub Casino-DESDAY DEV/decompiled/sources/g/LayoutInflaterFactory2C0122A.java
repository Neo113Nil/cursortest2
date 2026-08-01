package g;

import K.C0011l;
import K.InterfaceC0010k;
import K.S;
import K.Z;
import X.AbstractC0038g;
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
import androidx.lifecycle.EnumC0069m;
import j.AbstractC0148a;
import j.C0150c;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.C0163h;
import k.C0164i;
import k.C0170o;
import k.InterfaceC0166k;
import k.MenuC0168m;
import l.C0194A;
import l.C0195B;
import l.C0199F;
import l.C0201H;
import l.C0211S;
import l.C0224g;
import l.C0231j0;
import l.C0232k;
import l.C0250t;
import l.C0254v;
import l.C0258x;
import l.C0262z;
import l.InterfaceC0235l0;
import l.InterfaceC0237m0;
import l.Y0;
import l.d1;
import l.f1;
import l.i1;

/* renamed from: g.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0122A extends o implements InterfaceC0166k, LayoutInflater.Factory2 {

    /* renamed from: i0, reason: collision with root package name */
    public static final o.k f2194i0 = new o.k();
    public static final int[] j0 = {R.attr.windowBackground};

    /* renamed from: k0, reason: collision with root package name */
    public static final boolean f2195k0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    public boolean f2196A;

    /* renamed from: B, reason: collision with root package name */
    public ViewGroup f2197B;

    /* renamed from: C, reason: collision with root package name */
    public TextView f2198C;

    /* renamed from: D, reason: collision with root package name */
    public View f2199D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2200E;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f2201G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f2202H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2203I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2204J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f2205K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f2206L;

    /* renamed from: M, reason: collision with root package name */
    public z[] f2207M;

    /* renamed from: N, reason: collision with root package name */
    public z f2208N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f2209O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2210P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f2211Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f2212R;

    /* renamed from: S, reason: collision with root package name */
    public Configuration f2213S;

    /* renamed from: T, reason: collision with root package name */
    public final int f2214T;

    /* renamed from: U, reason: collision with root package name */
    public int f2215U;

    /* renamed from: V, reason: collision with root package name */
    public int f2216V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f2217W;

    /* renamed from: X, reason: collision with root package name */
    public w f2218X;

    /* renamed from: Y, reason: collision with root package name */
    public w f2219Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f2220Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f2221a0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f2223c0;

    /* renamed from: d0, reason: collision with root package name */
    public Rect f2224d0;

    /* renamed from: e0, reason: collision with root package name */
    public Rect f2225e0;

    /* renamed from: f0, reason: collision with root package name */
    public C0125D f2226f0;

    /* renamed from: g0, reason: collision with root package name */
    public OnBackInvokedDispatcher f2227g0;

    /* renamed from: h0, reason: collision with root package name */
    public OnBackInvokedCallback f2228h0;

    /* renamed from: j, reason: collision with root package name */
    public final Object f2229j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f2230k;

    /* renamed from: l, reason: collision with root package name */
    public Window f2231l;

    /* renamed from: m, reason: collision with root package name */
    public v f2232m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f2233n;

    /* renamed from: o, reason: collision with root package name */
    public K f2234o;

    /* renamed from: p, reason: collision with root package name */
    public j.h f2235p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2236q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0235l0 f2237r;

    /* renamed from: s, reason: collision with root package name */
    public q f2238s;

    /* renamed from: t, reason: collision with root package name */
    public q f2239t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC0148a f2240u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f2241v;

    /* renamed from: w, reason: collision with root package name */
    public PopupWindow f2242w;

    /* renamed from: x, reason: collision with root package name */
    public p f2243x;

    /* renamed from: y, reason: collision with root package name */
    public Z f2244y = null;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f2245z = true;

    /* renamed from: b0, reason: collision with root package name */
    public final p f2222b0 = new p(this, 0);

    public LayoutInflaterFactory2C0122A(Context context, Window window, InterfaceC0139j interfaceC0139j, Object obj) {
        AbstractActivityC0138i abstractActivityC0138i;
        this.f2214T = -100;
        this.f2230k = context;
        this.f2229j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC0138i)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC0138i = (AbstractActivityC0138i) context;
                    break;
                }
            }
            abstractActivityC0138i = null;
            if (abstractActivityC0138i != null) {
                this.f2214T = ((LayoutInflaterFactory2C0122A) abstractActivityC0138i.l()).f2214T;
            }
        }
        if (this.f2214T == -100) {
            o.k kVar = f2194i0;
            Integer num = (Integer) kVar.getOrDefault(this.f2229j.getClass().getName(), null);
            if (num != null) {
                this.f2214T = num.intValue();
                kVar.remove(this.f2229j.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        C0254v.d();
    }

    public static G.f o(Context context) {
        G.f fVar;
        G.f fVar2;
        if (Build.VERSION.SDK_INT >= 33 || (fVar = o.f2338c) == null) {
            return null;
        }
        G.f b2 = t.b(context.getApplicationContext().getResources().getConfiguration());
        G.g gVar = fVar.f177a;
        if (gVar.f178a.isEmpty()) {
            fVar2 = G.f.f176b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b2.f177a.f178a.size() + gVar.f178a.size()) {
                Locale locale = i < gVar.f178a.size() ? gVar.f178a.get(i) : b2.f177a.f178a.get(i - gVar.f178a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            fVar2 = new G.f(new G.g(G.e.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return fVar2.f177a.f178a.isEmpty() ? b2 : fVar2;
    }

    public static Configuration s(Context context, int i, G.f fVar, Configuration configuration, boolean z2) {
        int i2 = i != 1 ? i != 2 ? z2 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (fVar != null) {
            t.d(configuration2, fVar);
        }
        return configuration2;
    }

    public final void A(int i) {
        this.f2221a0 = (1 << i) | this.f2221a0;
        if (this.f2220Z) {
            return;
        }
        View decorView = this.f2231l.getDecorView();
        p pVar = this.f2222b0;
        WeakHashMap weakHashMap = S.f360a;
        decorView.postOnAnimation(pVar);
        this.f2220Z = true;
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
                if (this.f2219Y == null) {
                    this.f2219Y = new w(this, context);
                }
                return this.f2219Y.f();
            }
        }
        return i;
    }

    public final boolean C() {
        InterfaceC0237m0 interfaceC0237m0;
        Y0 y02;
        boolean z2 = this.f2209O;
        this.f2209O = false;
        z y2 = y(0);
        if (y2.f2364m) {
            if (!z2) {
                r(y2, true);
            }
            return true;
        }
        AbstractC0148a abstractC0148a = this.f2240u;
        if (abstractC0148a != null) {
            abstractC0148a.a();
            return true;
        }
        z();
        K k2 = this.f2234o;
        if (k2 == null || (interfaceC0237m0 = k2.i) == null || (y02 = ((d1) interfaceC0237m0).f2979a.f1219L) == null || y02.f2948b == null) {
            return false;
        }
        Y0 y03 = ((d1) interfaceC0237m0).f2979a.f1219L;
        C0170o c0170o = y03 == null ? null : y03.f2948b;
        if (c0170o != null) {
            c0170o.collapseActionView();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0173, code lost:
    
        if (r3.f2684f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0153, code lost:
    
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(z zVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (zVar.f2364m || this.f2212R) {
            return;
        }
        int i2 = zVar.f2355a;
        Context context = this.f2230k;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f2231l.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, zVar.h)) {
            r(zVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !F(zVar, keyEvent)) {
            return;
        }
        y yVar = zVar.f2358e;
        if (yVar == null || zVar.f2365n) {
            if (yVar == null) {
                z();
                K k2 = this.f2234o;
                Context c02 = k2 != null ? k2.c0() : null;
                if (c02 != null) {
                    context = c02;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.fortuneodd.shadegrid.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    newTheme.applyStyle(i3, true);
                }
                newTheme.resolveAttribute(com.fortuneodd.shadegrid.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                } else {
                    newTheme.applyStyle(com.fortuneodd.shadegrid.R.style.Theme_AppCompat_CompactMenu, true);
                }
                C0150c c0150c = new C0150c(context, 0);
                c0150c.getTheme().setTo(newTheme);
                zVar.f2361j = c0150c;
                TypedArray obtainStyledAttributes = c0150c.obtainStyledAttributes(f.a.f1934j);
                zVar.f2356b = obtainStyledAttributes.getResourceId(86, 0);
                zVar.d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                zVar.f2358e = new y(this, zVar.f2361j);
                zVar.f2357c = 81;
            } else if (zVar.f2365n && yVar.getChildCount() > 0) {
                zVar.f2358e.removeAllViews();
            }
            View view = zVar.f2360g;
            if (view == null) {
                if (zVar.h != null) {
                    if (this.f2239t == null) {
                        this.f2239t = new q(this, 3);
                    }
                    q qVar = this.f2239t;
                    if (zVar.i == null) {
                        C0164i c0164i = new C0164i(zVar.f2361j);
                        zVar.i = c0164i;
                        c0164i.f2683e = qVar;
                        MenuC0168m menuC0168m = zVar.h;
                        menuC0168m.b(c0164i, menuC0168m.f2691a);
                    }
                    C0164i c0164i2 = zVar.i;
                    y yVar2 = zVar.f2358e;
                    if (c0164i2.d == null) {
                        c0164i2.d = (ExpandedMenuView) c0164i2.f2681b.inflate(com.fortuneodd.shadegrid.R.layout.abc_expanded_menu_layout, (ViewGroup) yVar2, false);
                        if (c0164i2.f2684f == null) {
                            c0164i2.f2684f = new C0163h(c0164i2);
                        }
                        c0164i2.d.setAdapter((ListAdapter) c0164i2.f2684f);
                        c0164i2.d.setOnItemClickListener(c0164i2);
                    }
                    ExpandedMenuView expandedMenuView = c0164i2.d;
                    zVar.f2359f = expandedMenuView;
                }
                zVar.f2365n = true;
                return;
            }
            zVar.f2359f = view;
            if (zVar.f2359f != null) {
                if (zVar.f2360g == null) {
                    C0164i c0164i3 = zVar.i;
                    if (c0164i3.f2684f == null) {
                        c0164i3.f2684f = new C0163h(c0164i3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = zVar.f2359f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                zVar.f2358e.setBackgroundResource(zVar.f2356b);
                ViewParent parent = zVar.f2359f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(zVar.f2359f);
                }
                zVar.f2358e.addView(zVar.f2359f, layoutParams2);
                if (!zVar.f2359f.hasFocus()) {
                    zVar.f2359f.requestFocus();
                }
            }
            zVar.f2365n = true;
            return;
        }
        View view2 = zVar.f2360g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            zVar.f2363l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = zVar.f2357c;
            layoutParams3.windowAnimations = zVar.d;
            windowManager.addView(zVar.f2358e, layoutParams3);
            zVar.f2364m = true;
            if (i2 != 0) {
                H();
                return;
            }
            return;
        }
        i = -2;
        zVar.f2363l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = zVar.f2357c;
        layoutParams32.windowAnimations = zVar.d;
        windowManager.addView(zVar.f2358e, layoutParams32);
        zVar.f2364m = true;
        if (i2 != 0) {
        }
    }

    public final boolean E(z zVar, int i, KeyEvent keyEvent) {
        MenuC0168m menuC0168m;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((zVar.f2362k || F(zVar, keyEvent)) && (menuC0168m = zVar.h) != null) {
            return menuC0168m.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final boolean F(z zVar, KeyEvent keyEvent) {
        InterfaceC0235l0 interfaceC0235l0;
        InterfaceC0235l0 interfaceC0235l02;
        Resources.Theme theme;
        InterfaceC0235l0 interfaceC0235l03;
        InterfaceC0235l0 interfaceC0235l04;
        if (this.f2212R) {
            return false;
        }
        if (zVar.f2362k) {
            return true;
        }
        z zVar2 = this.f2208N;
        if (zVar2 != null && zVar2 != zVar) {
            r(zVar2, false);
        }
        Window.Callback callback = this.f2231l.getCallback();
        int i = zVar.f2355a;
        if (callback != null) {
            zVar.f2360g = callback.onCreatePanelView(i);
        }
        boolean z2 = i == 0 || i == 108;
        if (z2 && (interfaceC0235l04 = this.f2237r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0235l04;
            actionBarOverlayLayout.k();
            ((d1) actionBarOverlayLayout.f1165e).f2987l = true;
        }
        if (zVar.f2360g == null) {
            MenuC0168m menuC0168m = zVar.h;
            if (menuC0168m == null || zVar.f2366o) {
                if (menuC0168m == null) {
                    Context context = this.f2230k;
                    if ((i == 0 || i == 108) && this.f2237r != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.fortuneodd.shadegrid.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.fortuneodd.shadegrid.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.fortuneodd.shadegrid.R.attr.actionBarWidgetTheme, typedValue, true);
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
                            C0150c c0150c = new C0150c(context, 0);
                            c0150c.getTheme().setTo(theme);
                            context = c0150c;
                        }
                    }
                    MenuC0168m menuC0168m2 = new MenuC0168m(context);
                    menuC0168m2.f2694e = this;
                    MenuC0168m menuC0168m3 = zVar.h;
                    if (menuC0168m2 != menuC0168m3) {
                        if (menuC0168m3 != null) {
                            menuC0168m3.r(zVar.i);
                        }
                        zVar.h = menuC0168m2;
                        C0164i c0164i = zVar.i;
                        if (c0164i != null) {
                            menuC0168m2.b(c0164i, menuC0168m2.f2691a);
                        }
                    }
                    if (zVar.h == null) {
                        return false;
                    }
                }
                if (z2 && (interfaceC0235l02 = this.f2237r) != null) {
                    if (this.f2238s == null) {
                        this.f2238s = new q(this, 2);
                    }
                    ((ActionBarOverlayLayout) interfaceC0235l02).l(zVar.h, this.f2238s);
                }
                zVar.h.w();
                if (!callback.onCreatePanelMenu(i, zVar.h)) {
                    MenuC0168m menuC0168m4 = zVar.h;
                    if (menuC0168m4 != null) {
                        if (menuC0168m4 != null) {
                            menuC0168m4.r(zVar.i);
                        }
                        zVar.h = null;
                    }
                    if (z2 && (interfaceC0235l0 = this.f2237r) != null) {
                        ((ActionBarOverlayLayout) interfaceC0235l0).l(null, this.f2238s);
                    }
                    return false;
                }
                zVar.f2366o = false;
            }
            zVar.h.w();
            Bundle bundle = zVar.f2367p;
            if (bundle != null) {
                zVar.h.s(bundle);
                zVar.f2367p = null;
            }
            if (!callback.onPreparePanel(0, zVar.f2360g, zVar.h)) {
                if (z2 && (interfaceC0235l03 = this.f2237r) != null) {
                    ((ActionBarOverlayLayout) interfaceC0235l03).l(null, this.f2238s);
                }
                zVar.h.v();
                return false;
            }
            zVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            zVar.h.v();
        }
        zVar.f2362k = true;
        zVar.f2363l = false;
        this.f2208N = zVar;
        return true;
    }

    public final void G() {
        if (this.f2196A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f2227g0 != null && (y(0).f2364m || this.f2240u != null)) {
                z2 = true;
            }
            if (z2 && this.f2228h0 == null) {
                this.f2228h0 = u.b(this.f2227g0, this);
            } else {
                if (z2 || (onBackInvokedCallback = this.f2228h0) == null) {
                    return;
                }
                u.c(this.f2227g0, onBackInvokedCallback);
                this.f2228h0 = null;
            }
        }
    }

    @Override // g.o
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f2230k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C0122A) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // g.o
    public final void c() {
        String str;
        this.f2210P = true;
        m(false, true);
        w();
        Object obj = this.f2229j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = z.c.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                K k2 = this.f2234o;
                if (k2 == null) {
                    this.f2223c0 = true;
                } else {
                    k2.e0(true);
                }
            }
            synchronized (o.h) {
                o.g(this);
                o.f2341g.add(new WeakReference(this));
            }
        }
        this.f2213S = new Configuration(this.f2230k.getResources().getConfiguration());
        this.f2211Q = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // g.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        w wVar;
        w wVar2;
        if (this.f2229j instanceof Activity) {
            synchronized (o.h) {
                o.g(this);
            }
        }
        if (this.f2220Z) {
            this.f2231l.getDecorView().removeCallbacks(this.f2222b0);
        }
        this.f2212R = true;
        if (this.f2214T != -100) {
            Object obj = this.f2229j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f2194i0.put(this.f2229j.getClass().getName(), Integer.valueOf(this.f2214T));
                wVar = this.f2218X;
                if (wVar != null) {
                    wVar.c();
                }
                wVar2 = this.f2219Y;
                if (wVar2 == null) {
                    wVar2.c();
                    return;
                }
                return;
            }
        }
        f2194i0.remove(this.f2229j.getClass().getName());
        wVar = this.f2218X;
        if (wVar != null) {
        }
        wVar2 = this.f2219Y;
        if (wVar2 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.i() != false) goto L20;
     */
    @Override // k.InterfaceC0166k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(MenuC0168m menuC0168m) {
        ActionMenuView actionMenuView;
        C0232k c0232k;
        C0232k c0232k2;
        C0232k c0232k3;
        InterfaceC0235l0 interfaceC0235l0 = this.f2237r;
        if (interfaceC0235l0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0235l0;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((d1) actionBarOverlayLayout.f1165e).f2979a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1225a) != null && actionMenuView.f1188s) {
                if (ViewConfiguration.get(this.f2230k).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2237r;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((d1) actionBarOverlayLayout2.f1165e).f2979a.f1225a;
                    if (actionMenuView2 != null) {
                        C0232k c0232k4 = actionMenuView2.f1189t;
                        if (c0232k4 != null) {
                            if (c0232k4.f3030u == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f2231l.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2237r;
                actionBarOverlayLayout3.k();
                ActionMenuView actionMenuView3 = ((d1) actionBarOverlayLayout3.f1165e).f2979a.f1225a;
                if ((actionMenuView3 == null || (c0232k3 = actionMenuView3.f1189t) == null || !c0232k3.i()) ? false : true) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2237r;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView4 = ((d1) actionBarOverlayLayout4.f1165e).f2979a.f1225a;
                    if (actionMenuView4 != null && (c0232k2 = actionMenuView4.f1189t) != null) {
                        c0232k2.f();
                    }
                    if (this.f2212R) {
                        return;
                    }
                    callback.onPanelClosed(108, y(0).h);
                    return;
                }
                if (callback == null || this.f2212R) {
                    return;
                }
                if (this.f2220Z && (1 & this.f2221a0) != 0) {
                    View decorView = this.f2231l.getDecorView();
                    p pVar = this.f2222b0;
                    decorView.removeCallbacks(pVar);
                    pVar.run();
                }
                z y2 = y(0);
                MenuC0168m menuC0168m2 = y2.h;
                if (menuC0168m2 == null || y2.f2366o || !callback.onPreparePanel(0, y2.f2360g, menuC0168m2)) {
                    return;
                }
                callback.onMenuOpened(108, y2.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f2237r;
                actionBarOverlayLayout5.k();
                ActionMenuView actionMenuView5 = ((d1) actionBarOverlayLayout5.f1165e).f2979a.f1225a;
                if (actionMenuView5 == null || (c0232k = actionMenuView5.f1189t) == null) {
                    return;
                }
                c0232k.l();
                return;
            }
        }
        z y3 = y(0);
        y3.f2365n = true;
        r(y3, false);
        D(y3, null);
    }

    @Override // k.InterfaceC0166k
    public final boolean f(MenuC0168m menuC0168m, MenuItem menuItem) {
        z zVar;
        Window.Callback callback = this.f2231l.getCallback();
        if (callback != null && !this.f2212R) {
            MenuC0168m k2 = menuC0168m.k();
            z[] zVarArr = this.f2207M;
            int length = zVarArr != null ? zVarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    zVar = zVarArr[i];
                    if (zVar != null && zVar.h == k2) {
                        break;
                    }
                    i++;
                } else {
                    zVar = null;
                    break;
                }
            }
            if (zVar != null) {
                return callback.onMenuItemSelected(zVar.f2355a, menuItem);
            }
        }
        return false;
    }

    @Override // g.o
    public final boolean h(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f2205K && i == 108) {
            return false;
        }
        if (this.f2201G && i == 1) {
            this.f2201G = false;
        }
        if (i == 1) {
            G();
            this.f2205K = true;
            return true;
        }
        if (i == 2) {
            G();
            this.f2200E = true;
            return true;
        }
        if (i == 5) {
            G();
            this.F = true;
            return true;
        }
        if (i == 10) {
            G();
            this.f2203I = true;
            return true;
        }
        if (i == 108) {
            G();
            this.f2201G = true;
            return true;
        }
        if (i != 109) {
            return this.f2231l.requestFeature(i);
        }
        G();
        this.f2202H = true;
        return true;
    }

    @Override // g.o
    public final void i(int i) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2197B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2230k).inflate(i, viewGroup);
        this.f2232m.a(this.f2231l.getCallback());
    }

    @Override // g.o
    public final void j(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2197B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2232m.a(this.f2231l.getCallback());
    }

    @Override // g.o
    public final void k(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2197B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2232m.a(this.f2231l.getCallback());
    }

    @Override // g.o
    public final void l(CharSequence charSequence) {
        this.f2236q = charSequence;
        InterfaceC0235l0 interfaceC0235l0 = this.f2237r;
        if (interfaceC0235l0 != null) {
            interfaceC0235l0.setWindowTitle(charSequence);
            return;
        }
        K k2 = this.f2234o;
        if (k2 == null) {
            TextView textView = this.f2198C;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        d1 d1Var = (d1) k2.i;
        if (d1Var.f2984g) {
            return;
        }
        d1Var.h = charSequence;
        if ((d1Var.f2980b & 8) != 0) {
            Toolbar toolbar = d1Var.f2979a;
            toolbar.setTitle(charSequence);
            if (d1Var.f2984g) {
                S.m(toolbar.getRootView(), charSequence);
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
        if (this.f2212R) {
            return false;
        }
        int i3 = this.f2214T;
        if (i3 == -100) {
            i3 = o.f2337b;
        }
        Context context = this.f2230k;
        int B2 = B(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        G.f o2 = i4 < 33 ? o(context) : null;
        if (!z3 && o2 != null) {
            o2 = t.b(context.getResources().getConfiguration());
        }
        Configuration s2 = s(context, B2, o2, null, false);
        boolean z5 = this.f2217W;
        Object obj = this.f2229j;
        boolean z6 = true;
        if (!z5 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.f2213S;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i5 = configuration.uiMode & 48;
                int i6 = s2.uiMode & 48;
                G.f b3 = t.b(configuration);
                b2 = o2 != null ? null : t.b(s2);
                i2 = i5 == i6 ? 512 : 0;
                if (b2 != null && !b3.equals(b2)) {
                    i2 |= 8196;
                }
                if (((~i) & i2) != 0 && z2 && this.f2210P && ((f2195k0 || this.f2211Q) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31 && (i2 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(s2.getLayoutDirection());
                        }
                        if (i7 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new D0.p(12, activity));
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
                                t.d(configuration2, b2);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i8 = this.f2215U;
                            if (i8 != 0) {
                                context.setTheme(i8);
                                context.getTheme().applyStyle(this.f2215U, true);
                            }
                            if (z7 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof androidx.lifecycle.r) {
                                    if (((androidx.lifecycle.r) activity2).e().f1372c.compareTo(EnumC0069m.f1364c) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f2211Q && !this.f2212R) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (z6 && (obj instanceof AbstractActivityC0138i)) {
                            if ((i2 & 512) != 0) {
                            }
                            if ((i2 & 4) != 0) {
                            }
                        }
                        if (b2 != null) {
                            t.c(t.b(context.getResources().getConfiguration()));
                        }
                        if (i3 == 0) {
                            x(context).i();
                        } else {
                            w wVar = this.f2218X;
                            if (wVar != null) {
                                wVar.c();
                            }
                        }
                        if (i3 == 3) {
                            if (this.f2219Y == null) {
                                this.f2219Y = new w(this, context);
                            }
                            this.f2219Y.i();
                        } else {
                            w wVar2 = this.f2219Y;
                            if (wVar2 != null) {
                                wVar2.c();
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
                    this.f2216V = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.f2216V = 0;
            }
        }
        this.f2217W = true;
        i = this.f2216V;
        configuration = this.f2213S;
        if (configuration == null) {
        }
        int i52 = configuration.uiMode & 48;
        int i62 = s2.uiMode & 48;
        G.f b32 = t.b(configuration);
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
        if (this.f2231l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof v) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        v vVar = new v(this, callback);
        this.f2232m = vVar;
        window.setCallback(vVar);
        int[] iArr = j0;
        Context context = this.f2230k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            C0254v a2 = C0254v.a();
            synchronized (a2) {
                drawable = a2.f3080a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f2231l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f2227g0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f2228h0) != null) {
            u.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2228h0 = null;
        }
        Object obj = this.f2229j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f2227g0 = u.a(activity);
                H();
            }
        }
        this.f2227g0 = null;
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
        View c0199f;
        int i;
        String str2 = str;
        char c2 = 4;
        View view2 = null;
        if (this.f2226f0 == null) {
            int[] iArr = f.a.f1934j;
            Context context2 = this.f2230k;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f2226f0 = new C0125D();
            } else {
                try {
                    this.f2226f0 = (C0125D) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f2226f0 = new C0125D();
                }
            }
        }
        C0125D c0125d = this.f2226f0;
        int i2 = f1.f2991a;
        c0125d.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f1948x, 0, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context c0150c = (resourceId == 0 || ((context instanceof C0150c) && ((C0150c) context).f2553a == resourceId)) ? context : new C0150c(context, resourceId);
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
                c0199f = new C0199F(c0150c, attributeSet);
                break;
            case 1:
                c0199f = new C0250t(c0150c, attributeSet);
                break;
            case 2:
                c0199f = new C0195B(c0150c, attributeSet);
                break;
            case 3:
                c0199f = c0125d.e(c0150c, attributeSet);
                break;
            case 4:
                c0199f = new C0262z(c0150c, attributeSet, com.fortuneodd.shadegrid.R.attr.imageButtonStyle);
                break;
            case 5:
                c0199f = new C0201H(c0150c, attributeSet);
                break;
            case 6:
                c0199f = new C0211S(c0150c, attributeSet);
                break;
            case 7:
                c0199f = c0125d.d(c0150c, attributeSet);
                break;
            case '\b':
                c0199f = new C0231j0(c0150c, attributeSet);
                break;
            case '\t':
                c0199f = new C0194A(c0150c, attributeSet, 0);
                break;
            case '\n':
                c0199f = c0125d.a(c0150c, attributeSet);
                break;
            case 11:
                c0199f = c0125d.c(c0150c, attributeSet);
                break;
            case '\f':
                c0199f = new C0258x(c0150c, attributeSet);
                break;
            case '\r':
                c0199f = c0125d.b(c0150c, attributeSet);
                break;
            default:
                c0199f = null;
                break;
        }
        if (c0199f == null && context != c0150c) {
            Object[] objArr = c0125d.f2255a;
            if (str2.equals("view")) {
                str2 = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c0150c;
                objArr[1] = attributeSet;
                if (-1 == str2.indexOf(46)) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr = C0125D.f2254g;
                        if (i3 < 3) {
                            View f2 = c0125d.f(c0150c, str2, strArr[i3]);
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
                    View f3 = c0125d.f(c0150c, str2, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = f3;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            c0199f = view2;
        }
        if (c0199f != null) {
            Context context3 = c0199f.getContext();
            if ((context3 instanceof ContextWrapper) && c0199f.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C0125D.f2251c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c0199f.setOnClickListener(new ViewOnClickListenerC0124C(c0199f, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = c0150c.obtainStyledAttributes(attributeSet, C0125D.d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = S.f360a;
                    i = 0;
                    new K.B(com.fortuneodd.shadegrid.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(c0199f, Boolean.valueOf(z2));
                } else {
                    i = 0;
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = c0150c.obtainStyledAttributes(attributeSet, C0125D.f2252e);
                if (obtainStyledAttributes5.hasValue(i)) {
                    S.m(c0199f, obtainStyledAttributes5.getString(i));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = c0150c.obtainStyledAttributes(attributeSet, C0125D.f2253f);
                if (obtainStyledAttributes6.hasValue(i)) {
                    boolean z3 = obtainStyledAttributes6.getBoolean(i, i);
                    WeakHashMap weakHashMap2 = S.f360a;
                    new K.B(com.fortuneodd.shadegrid.R.id.tag_screen_reader_focusable, Boolean.class, i, 28, 0).d(c0199f, Boolean.valueOf(z3));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return c0199f;
    }

    public final void p(int i, z zVar, MenuC0168m menuC0168m) {
        if (menuC0168m == null) {
            if (zVar == null && i >= 0) {
                z[] zVarArr = this.f2207M;
                if (i < zVarArr.length) {
                    zVar = zVarArr[i];
                }
            }
            if (zVar != null) {
                menuC0168m = zVar.h;
            }
        }
        if ((zVar == null || zVar.f2364m) && !this.f2212R) {
            v vVar = this.f2232m;
            Window.Callback callback = this.f2231l.getCallback();
            vVar.getClass();
            try {
                vVar.d = true;
                callback.onPanelClosed(i, menuC0168m);
            } finally {
                vVar.d = false;
            }
        }
    }

    public final void q(MenuC0168m menuC0168m) {
        C0232k c0232k;
        if (this.f2206L) {
            return;
        }
        this.f2206L = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2237r;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((d1) actionBarOverlayLayout.f1165e).f2979a.f1225a;
        if (actionMenuView != null && (c0232k = actionMenuView.f1189t) != null) {
            c0232k.f();
            C0224g c0224g = c0232k.f3029t;
            if (c0224g != null && c0224g.b()) {
                c0224g.i.dismiss();
            }
        }
        Window.Callback callback = this.f2231l.getCallback();
        if (callback != null && !this.f2212R) {
            callback.onPanelClosed(108, menuC0168m);
        }
        this.f2206L = false;
    }

    public final void r(z zVar, boolean z2) {
        y yVar;
        InterfaceC0235l0 interfaceC0235l0;
        C0232k c0232k;
        if (z2 && zVar.f2355a == 0 && (interfaceC0235l0 = this.f2237r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0235l0;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((d1) actionBarOverlayLayout.f1165e).f2979a.f1225a;
            if (actionMenuView != null && (c0232k = actionMenuView.f1189t) != null && c0232k.i()) {
                q(zVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f2230k.getSystemService("window");
        if (windowManager != null && zVar.f2364m && (yVar = zVar.f2358e) != null) {
            windowManager.removeView(yVar);
            if (z2) {
                p(zVar.f2355a, zVar, null);
            }
        }
        zVar.f2362k = false;
        zVar.f2363l = false;
        zVar.f2364m = false;
        zVar.f2359f = null;
        zVar.f2365n = true;
        if (this.f2208N == zVar) {
            this.f2208N = null;
        }
        if (zVar.f2355a == 0) {
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
        C0232k c0232k;
        Object obj = this.f2229j;
        if (((obj instanceof InterfaceC0010k) || (obj instanceof DialogInterfaceC0135f)) && (decorView = this.f2231l.getDecorView()) != null && q1.d.m(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            v vVar = this.f2232m;
            Window.Callback callback = this.f2231l.getCallback();
            vVar.getClass();
            try {
                vVar.f2350c = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                vVar.f2350c = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f2209O = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                z y2 = y(0);
                if (y2.f2364m) {
                    return true;
                }
                F(y2, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f2240u != null) {
                    return true;
                }
                z y3 = y(0);
                InterfaceC0235l0 interfaceC0235l0 = this.f2237r;
                Context context = this.f2230k;
                if (interfaceC0235l0 != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0235l0;
                    actionBarOverlayLayout.k();
                    Toolbar toolbar = ((d1) actionBarOverlayLayout.f1165e).f2979a;
                    if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1225a) != null && actionMenuView.f1188s && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2237r;
                        actionBarOverlayLayout2.k();
                        ActionMenuView actionMenuView2 = ((d1) actionBarOverlayLayout2.f1165e).f2979a.f1225a;
                        if (actionMenuView2 == null || (c0232k = actionMenuView2.f1189t) == null || !c0232k.i()) {
                            if (!this.f2212R && F(y3, keyEvent)) {
                                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2237r;
                                actionBarOverlayLayout3.k();
                                ActionMenuView actionMenuView3 = ((d1) actionBarOverlayLayout3.f1165e).f2979a.f1225a;
                                if (actionMenuView3 != null) {
                                    C0232k c0232k2 = actionMenuView3.f1189t;
                                    if (c0232k2 != null) {
                                    }
                                }
                            }
                            z2 = false;
                        } else {
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2237r;
                            actionBarOverlayLayout4.k();
                            ActionMenuView actionMenuView4 = ((d1) actionBarOverlayLayout4.f1165e).f2979a.f1225a;
                            if (actionMenuView4 != null) {
                                C0232k c0232k3 = actionMenuView4.f1189t;
                                if (c0232k3 != null) {
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
                boolean z4 = y3.f2364m;
                if (z4 || y3.f2363l) {
                    r(y3, true);
                    z2 = z4;
                    if (z2) {
                    }
                } else {
                    if (y3.f2362k) {
                        if (y3.f2366o) {
                            y3.f2362k = false;
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
        z y2 = y(i);
        if (y2.h != null) {
            Bundle bundle = new Bundle();
            y2.h.t(bundle);
            if (bundle.size() > 0) {
                y2.f2367p = bundle;
            }
            y2.h.w();
            y2.h.clear();
        }
        y2.f2366o = true;
        y2.f2365n = true;
        if ((i == 108 || i == 0) && this.f2237r != null) {
            z y3 = y(0);
            y3.f2362k = false;
            F(y3, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        int i = 1;
        int i2 = 0;
        if (this.f2196A) {
            return;
        }
        int[] iArr = f.a.f1934j;
        Context context = this.f2230k;
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
        this.f2204J = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        w();
        this.f2231l.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f2205K) {
            viewGroup = this.f2203I ? (ViewGroup) from.inflate(com.fortuneodd.shadegrid.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.fortuneodd.shadegrid.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f2204J) {
            viewGroup = (ViewGroup) from.inflate(com.fortuneodd.shadegrid.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f2202H = false;
            this.f2201G = false;
        } else if (this.f2201G) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.fortuneodd.shadegrid.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0150c(context, typedValue.resourceId) : context).inflate(com.fortuneodd.shadegrid.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0235l0 interfaceC0235l0 = (InterfaceC0235l0) viewGroup.findViewById(com.fortuneodd.shadegrid.R.id.decor_content_parent);
            this.f2237r = interfaceC0235l0;
            interfaceC0235l0.setWindowCallback(this.f2231l.getCallback());
            if (this.f2202H) {
                ((ActionBarOverlayLayout) this.f2237r).j(109);
            }
            if (this.f2200E) {
                ((ActionBarOverlayLayout) this.f2237r).j(2);
            }
            if (this.F) {
                ((ActionBarOverlayLayout) this.f2237r).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f2201G + ", windowActionBarOverlay: " + this.f2202H + ", android:windowIsFloating: " + this.f2204J + ", windowActionModeOverlay: " + this.f2203I + ", windowNoTitle: " + this.f2205K + " }");
        }
        q qVar = new q(this, i2);
        WeakHashMap weakHashMap = S.f360a;
        K.G.u(viewGroup, qVar);
        if (this.f2237r == null) {
            this.f2198C = (TextView) viewGroup.findViewById(com.fortuneodd.shadegrid.R.id.title);
        }
        boolean z2 = i1.f3007a;
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
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.fortuneodd.shadegrid.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f2231l.findViewById(R.id.content);
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
        this.f2231l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new q(this, i));
        this.f2197B = viewGroup;
        Object obj = this.f2229j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2236q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0235l0 interfaceC0235l02 = this.f2237r;
            if (interfaceC0235l02 != null) {
                interfaceC0235l02.setWindowTitle(title);
            } else {
                K k2 = this.f2234o;
                if (k2 != null) {
                    d1 d1Var = (d1) k2.i;
                    if (!d1Var.f2984g) {
                        d1Var.h = title;
                        if ((d1Var.f2980b & 8) != 0) {
                            Toolbar toolbar = d1Var.f2979a;
                            toolbar.setTitle(title);
                            if (d1Var.f2984g) {
                                S.m(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f2198C;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f2197B.findViewById(R.id.content);
        View decorView = this.f2231l.getDecorView();
        contentFrameLayout2.f1205g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.f2196A = true;
        z y2 = y(0);
        if (this.f2212R || y2.h != null) {
            return;
        }
        A(108);
    }

    public final void w() {
        if (this.f2231l == null) {
            Object obj = this.f2229j;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.f2231l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final AbstractC0038g x(Context context) {
        if (this.f2218X == null) {
            if (C0011l.f411e == null) {
                Context applicationContext = context.getApplicationContext();
                C0011l.f411e = new C0011l(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f2218X = new w(this, C0011l.f411e);
        }
        return this.f2218X;
    }

    public final z y(int i) {
        z[] zVarArr = this.f2207M;
        if (zVarArr == null || zVarArr.length <= i) {
            z[] zVarArr2 = new z[i + 1];
            if (zVarArr != null) {
                System.arraycopy(zVarArr, 0, zVarArr2, 0, zVarArr.length);
            }
            this.f2207M = zVarArr2;
            zVarArr = zVarArr2;
        }
        z zVar = zVarArr[i];
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z();
        zVar2.f2355a = i;
        zVar2.f2365n = false;
        zVarArr[i] = zVar2;
        return zVar2;
    }

    public final void z() {
        v();
        if (this.f2201G && this.f2234o == null) {
            Object obj = this.f2229j;
            if (obj instanceof Activity) {
                this.f2234o = new K((Activity) obj, this.f2202H);
            } else if (obj instanceof Dialog) {
                this.f2234o = new K((Dialog) obj);
            }
            K k2 = this.f2234o;
            if (k2 != null) {
                k2.e0(this.f2223c0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}

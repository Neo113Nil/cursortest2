package g;

import K.C0001a0;
import K.C0012l;
import K.InterfaceC0011k;
import K.T;
import X.AbstractC0039g;
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
import androidx.lifecycle.EnumC0070m;
import j.AbstractC0138a;
import j.C0140c;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.C0153h;
import k.C0154i;
import k.C0160o;
import k.InterfaceC0156k;
import k.MenuC0158m;
import l.C0205A;
import l.C0206B;
import l.C0210F;
import l.C0212H;
import l.C0222S;
import l.C0235g;
import l.C0242j0;
import l.C0243k;
import l.C0261t;
import l.C0265v;
import l.C0269x;
import l.C0273z;
import l.InterfaceC0246l0;
import l.InterfaceC0248m0;
import l.Y0;
import l.d1;
import l.f1;
import l.i1;

/* renamed from: g.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0110A extends o implements InterfaceC0156k, LayoutInflater.Factory2 {

    /* renamed from: i0, reason: collision with root package name */
    public static final o.k f2189i0 = new o.k();
    public static final int[] j0 = {R.attr.windowBackground};

    /* renamed from: k0, reason: collision with root package name */
    public static final boolean f2190k0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    public boolean f2191A;

    /* renamed from: B, reason: collision with root package name */
    public ViewGroup f2192B;

    /* renamed from: C, reason: collision with root package name */
    public TextView f2193C;

    /* renamed from: D, reason: collision with root package name */
    public View f2194D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2195E;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f2196G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f2197H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2198I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2199J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f2200K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f2201L;

    /* renamed from: M, reason: collision with root package name */
    public z[] f2202M;

    /* renamed from: N, reason: collision with root package name */
    public z f2203N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f2204O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2205P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f2206Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f2207R;

    /* renamed from: S, reason: collision with root package name */
    public Configuration f2208S;

    /* renamed from: T, reason: collision with root package name */
    public final int f2209T;

    /* renamed from: U, reason: collision with root package name */
    public int f2210U;

    /* renamed from: V, reason: collision with root package name */
    public int f2211V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f2212W;

    /* renamed from: X, reason: collision with root package name */
    public w f2213X;

    /* renamed from: Y, reason: collision with root package name */
    public w f2214Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f2215Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f2216a0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f2218c0;

    /* renamed from: d0, reason: collision with root package name */
    public Rect f2219d0;

    /* renamed from: e0, reason: collision with root package name */
    public Rect f2220e0;

    /* renamed from: f0, reason: collision with root package name */
    public C0113D f2221f0;

    /* renamed from: g0, reason: collision with root package name */
    public OnBackInvokedDispatcher f2222g0;

    /* renamed from: h0, reason: collision with root package name */
    public OnBackInvokedCallback f2223h0;

    /* renamed from: j, reason: collision with root package name */
    public final Object f2224j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f2225k;

    /* renamed from: l, reason: collision with root package name */
    public Window f2226l;

    /* renamed from: m, reason: collision with root package name */
    public v f2227m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f2228n;

    /* renamed from: o, reason: collision with root package name */
    public K f2229o;

    /* renamed from: p, reason: collision with root package name */
    public j.h f2230p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2231q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0246l0 f2232r;

    /* renamed from: s, reason: collision with root package name */
    public q f2233s;

    /* renamed from: t, reason: collision with root package name */
    public q f2234t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC0138a f2235u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f2236v;

    /* renamed from: w, reason: collision with root package name */
    public PopupWindow f2237w;

    /* renamed from: x, reason: collision with root package name */
    public p f2238x;

    /* renamed from: y, reason: collision with root package name */
    public C0001a0 f2239y = null;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f2240z = true;

    /* renamed from: b0, reason: collision with root package name */
    public final p f2217b0 = new p(this, 0);

    public LayoutInflaterFactory2C0110A(Context context, Window window, InterfaceC0127j interfaceC0127j, Object obj) {
        AbstractActivityC0126i abstractActivityC0126i;
        this.f2209T = -100;
        this.f2225k = context;
        this.f2224j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC0126i)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC0126i = (AbstractActivityC0126i) context;
                    break;
                }
            }
            abstractActivityC0126i = null;
            if (abstractActivityC0126i != null) {
                this.f2209T = ((LayoutInflaterFactory2C0110A) abstractActivityC0126i.l()).f2209T;
            }
        }
        if (this.f2209T == -100) {
            o.k kVar = f2189i0;
            Integer num = (Integer) kVar.getOrDefault(this.f2224j.getClass().getName(), null);
            if (num != null) {
                this.f2209T = num.intValue();
                kVar.remove(this.f2224j.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        C0265v.d();
    }

    public static G.f o(Context context) {
        G.f fVar;
        G.f fVar2;
        if (Build.VERSION.SDK_INT >= 33 || (fVar = o.f2332c) == null) {
            return null;
        }
        G.f b2 = t.b(context.getApplicationContext().getResources().getConfiguration());
        G.g gVar = fVar.f192a;
        if (gVar.f193a.isEmpty()) {
            fVar2 = G.f.f191b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b2.f192a.f193a.size() + gVar.f193a.size()) {
                Locale locale = i < gVar.f193a.size() ? gVar.f193a.get(i) : b2.f192a.f193a.get(i - gVar.f193a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            fVar2 = new G.f(new G.g(G.e.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return fVar2.f192a.f193a.isEmpty() ? b2 : fVar2;
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
        this.f2216a0 = (1 << i) | this.f2216a0;
        if (this.f2215Z) {
            return;
        }
        View decorView = this.f2226l.getDecorView();
        p pVar = this.f2217b0;
        WeakHashMap weakHashMap = T.f381a;
        decorView.postOnAnimation(pVar);
        this.f2215Z = true;
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
                if (this.f2214Y == null) {
                    this.f2214Y = new w(this, context);
                }
                return this.f2214Y.f();
            }
        }
        return i;
    }

    public final boolean C() {
        InterfaceC0248m0 interfaceC0248m0;
        Y0 y02;
        boolean z2 = this.f2204O;
        this.f2204O = false;
        z y2 = y(0);
        if (y2.f2358m) {
            if (!z2) {
                r(y2, true);
            }
            return true;
        }
        AbstractC0138a abstractC0138a = this.f2235u;
        if (abstractC0138a != null) {
            abstractC0138a.a();
            return true;
        }
        z();
        K k2 = this.f2229o;
        if (k2 == null || (interfaceC0248m0 = k2.f2268e) == null || (y02 = ((d1) interfaceC0248m0).f2954a.f1217L) == null || y02.f2923b == null) {
            return false;
        }
        Y0 y03 = ((d1) interfaceC0248m0).f2954a.f1217L;
        C0160o c0160o = y03 == null ? null : y03.f2923b;
        if (c0160o != null) {
            c0160o.collapseActionView();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0173, code lost:
    
        if (r3.f2659f.getCount() > 0) goto L88;
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
        if (zVar.f2358m || this.f2207R) {
            return;
        }
        int i2 = zVar.f2349a;
        Context context = this.f2225k;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f2226l.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, zVar.h)) {
            r(zVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !F(zVar, keyEvent)) {
            return;
        }
        y yVar = zVar.f2352e;
        if (yVar == null || zVar.f2359n) {
            if (yVar == null) {
                z();
                K k2 = this.f2229o;
                Context e02 = k2 != null ? k2.e0() : null;
                if (e02 != null) {
                    context = e02;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.ratebook.luckyconvert.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    newTheme.applyStyle(i3, true);
                }
                newTheme.resolveAttribute(com.ratebook.luckyconvert.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                } else {
                    newTheme.applyStyle(com.ratebook.luckyconvert.R.style.Theme_AppCompat_CompactMenu, true);
                }
                C0140c c0140c = new C0140c(context, 0);
                c0140c.getTheme().setTo(newTheme);
                zVar.f2355j = c0140c;
                TypedArray obtainStyledAttributes = c0140c.obtainStyledAttributes(f.a.f1929j);
                zVar.f2350b = obtainStyledAttributes.getResourceId(86, 0);
                zVar.d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                zVar.f2352e = new y(this, zVar.f2355j);
                zVar.f2351c = 81;
            } else if (zVar.f2359n && yVar.getChildCount() > 0) {
                zVar.f2352e.removeAllViews();
            }
            View view = zVar.f2354g;
            if (view == null) {
                if (zVar.h != null) {
                    if (this.f2234t == null) {
                        this.f2234t = new q(this, 3);
                    }
                    q qVar = this.f2234t;
                    if (zVar.i == null) {
                        C0154i c0154i = new C0154i(zVar.f2355j);
                        zVar.i = c0154i;
                        c0154i.f2658e = qVar;
                        MenuC0158m menuC0158m = zVar.h;
                        menuC0158m.b(c0154i, menuC0158m.f2666a);
                    }
                    C0154i c0154i2 = zVar.i;
                    y yVar2 = zVar.f2352e;
                    if (c0154i2.d == null) {
                        c0154i2.d = (ExpandedMenuView) c0154i2.f2656b.inflate(com.ratebook.luckyconvert.R.layout.abc_expanded_menu_layout, (ViewGroup) yVar2, false);
                        if (c0154i2.f2659f == null) {
                            c0154i2.f2659f = new C0153h(c0154i2);
                        }
                        c0154i2.d.setAdapter((ListAdapter) c0154i2.f2659f);
                        c0154i2.d.setOnItemClickListener(c0154i2);
                    }
                    ExpandedMenuView expandedMenuView = c0154i2.d;
                    zVar.f2353f = expandedMenuView;
                }
                zVar.f2359n = true;
                return;
            }
            zVar.f2353f = view;
            if (zVar.f2353f != null) {
                if (zVar.f2354g == null) {
                    C0154i c0154i3 = zVar.i;
                    if (c0154i3.f2659f == null) {
                        c0154i3.f2659f = new C0153h(c0154i3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = zVar.f2353f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                zVar.f2352e.setBackgroundResource(zVar.f2350b);
                ViewParent parent = zVar.f2353f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(zVar.f2353f);
                }
                zVar.f2352e.addView(zVar.f2353f, layoutParams2);
                if (!zVar.f2353f.hasFocus()) {
                    zVar.f2353f.requestFocus();
                }
            }
            zVar.f2359n = true;
            return;
        }
        View view2 = zVar.f2354g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            zVar.f2357l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = zVar.f2351c;
            layoutParams3.windowAnimations = zVar.d;
            windowManager.addView(zVar.f2352e, layoutParams3);
            zVar.f2358m = true;
            if (i2 != 0) {
                H();
                return;
            }
            return;
        }
        i = -2;
        zVar.f2357l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = zVar.f2351c;
        layoutParams32.windowAnimations = zVar.d;
        windowManager.addView(zVar.f2352e, layoutParams32);
        zVar.f2358m = true;
        if (i2 != 0) {
        }
    }

    public final boolean E(z zVar, int i, KeyEvent keyEvent) {
        MenuC0158m menuC0158m;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((zVar.f2356k || F(zVar, keyEvent)) && (menuC0158m = zVar.h) != null) {
            return menuC0158m.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final boolean F(z zVar, KeyEvent keyEvent) {
        InterfaceC0246l0 interfaceC0246l0;
        InterfaceC0246l0 interfaceC0246l02;
        Resources.Theme theme;
        InterfaceC0246l0 interfaceC0246l03;
        InterfaceC0246l0 interfaceC0246l04;
        if (this.f2207R) {
            return false;
        }
        if (zVar.f2356k) {
            return true;
        }
        z zVar2 = this.f2203N;
        if (zVar2 != null && zVar2 != zVar) {
            r(zVar2, false);
        }
        Window.Callback callback = this.f2226l.getCallback();
        int i = zVar.f2349a;
        if (callback != null) {
            zVar.f2354g = callback.onCreatePanelView(i);
        }
        boolean z2 = i == 0 || i == 108;
        if (z2 && (interfaceC0246l04 = this.f2232r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0246l04;
            actionBarOverlayLayout.k();
            ((d1) actionBarOverlayLayout.f1163e).f2962l = true;
        }
        if (zVar.f2354g == null) {
            MenuC0158m menuC0158m = zVar.h;
            if (menuC0158m == null || zVar.f2360o) {
                if (menuC0158m == null) {
                    Context context = this.f2225k;
                    if ((i == 0 || i == 108) && this.f2232r != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.ratebook.luckyconvert.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.ratebook.luckyconvert.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.ratebook.luckyconvert.R.attr.actionBarWidgetTheme, typedValue, true);
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
                            C0140c c0140c = new C0140c(context, 0);
                            c0140c.getTheme().setTo(theme);
                            context = c0140c;
                        }
                    }
                    MenuC0158m menuC0158m2 = new MenuC0158m(context);
                    menuC0158m2.f2669e = this;
                    MenuC0158m menuC0158m3 = zVar.h;
                    if (menuC0158m2 != menuC0158m3) {
                        if (menuC0158m3 != null) {
                            menuC0158m3.r(zVar.i);
                        }
                        zVar.h = menuC0158m2;
                        C0154i c0154i = zVar.i;
                        if (c0154i != null) {
                            menuC0158m2.b(c0154i, menuC0158m2.f2666a);
                        }
                    }
                    if (zVar.h == null) {
                        return false;
                    }
                }
                if (z2 && (interfaceC0246l02 = this.f2232r) != null) {
                    if (this.f2233s == null) {
                        this.f2233s = new q(this, 2);
                    }
                    ((ActionBarOverlayLayout) interfaceC0246l02).l(zVar.h, this.f2233s);
                }
                zVar.h.w();
                if (!callback.onCreatePanelMenu(i, zVar.h)) {
                    MenuC0158m menuC0158m4 = zVar.h;
                    if (menuC0158m4 != null) {
                        if (menuC0158m4 != null) {
                            menuC0158m4.r(zVar.i);
                        }
                        zVar.h = null;
                    }
                    if (z2 && (interfaceC0246l0 = this.f2232r) != null) {
                        ((ActionBarOverlayLayout) interfaceC0246l0).l(null, this.f2233s);
                    }
                    return false;
                }
                zVar.f2360o = false;
            }
            zVar.h.w();
            Bundle bundle = zVar.f2361p;
            if (bundle != null) {
                zVar.h.s(bundle);
                zVar.f2361p = null;
            }
            if (!callback.onPreparePanel(0, zVar.f2354g, zVar.h)) {
                if (z2 && (interfaceC0246l03 = this.f2232r) != null) {
                    ((ActionBarOverlayLayout) interfaceC0246l03).l(null, this.f2233s);
                }
                zVar.h.v();
                return false;
            }
            zVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            zVar.h.v();
        }
        zVar.f2356k = true;
        zVar.f2357l = false;
        this.f2203N = zVar;
        return true;
    }

    public final void G() {
        if (this.f2191A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f2222g0 != null && (y(0).f2358m || this.f2235u != null)) {
                z2 = true;
            }
            if (z2 && this.f2223h0 == null) {
                this.f2223h0 = u.b(this.f2222g0, this);
            } else {
                if (z2 || (onBackInvokedCallback = this.f2223h0) == null) {
                    return;
                }
                u.c(this.f2222g0, onBackInvokedCallback);
                this.f2223h0 = null;
            }
        }
    }

    @Override // g.o
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f2225k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C0110A) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // g.o
    public final void c() {
        String str;
        this.f2205P = true;
        m(false, true);
        w();
        Object obj = this.f2224j;
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
                K k2 = this.f2229o;
                if (k2 == null) {
                    this.f2218c0 = true;
                } else {
                    k2.g0(true);
                }
            }
            synchronized (o.h) {
                o.g(this);
                o.f2335g.add(new WeakReference(this));
            }
        }
        this.f2208S = new Configuration(this.f2225k.getResources().getConfiguration());
        this.f2206Q = true;
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
        if (this.f2224j instanceof Activity) {
            synchronized (o.h) {
                o.g(this);
            }
        }
        if (this.f2215Z) {
            this.f2226l.getDecorView().removeCallbacks(this.f2217b0);
        }
        this.f2207R = true;
        if (this.f2209T != -100) {
            Object obj = this.f2224j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f2189i0.put(this.f2224j.getClass().getName(), Integer.valueOf(this.f2209T));
                wVar = this.f2213X;
                if (wVar != null) {
                    wVar.c();
                }
                wVar2 = this.f2214Y;
                if (wVar2 == null) {
                    wVar2.c();
                    return;
                }
                return;
            }
        }
        f2189i0.remove(this.f2224j.getClass().getName());
        wVar = this.f2213X;
        if (wVar != null) {
        }
        wVar2 = this.f2214Y;
        if (wVar2 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.i() != false) goto L20;
     */
    @Override // k.InterfaceC0156k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(MenuC0158m menuC0158m) {
        ActionMenuView actionMenuView;
        C0243k c0243k;
        C0243k c0243k2;
        C0243k c0243k3;
        InterfaceC0246l0 interfaceC0246l0 = this.f2232r;
        if (interfaceC0246l0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0246l0;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((d1) actionBarOverlayLayout.f1163e).f2954a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1223a) != null && actionMenuView.f1186s) {
                if (ViewConfiguration.get(this.f2225k).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2232r;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((d1) actionBarOverlayLayout2.f1163e).f2954a.f1223a;
                    if (actionMenuView2 != null) {
                        C0243k c0243k4 = actionMenuView2.f1187t;
                        if (c0243k4 != null) {
                            if (c0243k4.f3005u == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f2226l.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2232r;
                actionBarOverlayLayout3.k();
                ActionMenuView actionMenuView3 = ((d1) actionBarOverlayLayout3.f1163e).f2954a.f1223a;
                if ((actionMenuView3 == null || (c0243k3 = actionMenuView3.f1187t) == null || !c0243k3.i()) ? false : true) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2232r;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView4 = ((d1) actionBarOverlayLayout4.f1163e).f2954a.f1223a;
                    if (actionMenuView4 != null && (c0243k2 = actionMenuView4.f1187t) != null) {
                        c0243k2.f();
                    }
                    if (this.f2207R) {
                        return;
                    }
                    callback.onPanelClosed(108, y(0).h);
                    return;
                }
                if (callback == null || this.f2207R) {
                    return;
                }
                if (this.f2215Z && (1 & this.f2216a0) != 0) {
                    View decorView = this.f2226l.getDecorView();
                    p pVar = this.f2217b0;
                    decorView.removeCallbacks(pVar);
                    pVar.run();
                }
                z y2 = y(0);
                MenuC0158m menuC0158m2 = y2.h;
                if (menuC0158m2 == null || y2.f2360o || !callback.onPreparePanel(0, y2.f2354g, menuC0158m2)) {
                    return;
                }
                callback.onMenuOpened(108, y2.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f2232r;
                actionBarOverlayLayout5.k();
                ActionMenuView actionMenuView5 = ((d1) actionBarOverlayLayout5.f1163e).f2954a.f1223a;
                if (actionMenuView5 == null || (c0243k = actionMenuView5.f1187t) == null) {
                    return;
                }
                c0243k.l();
                return;
            }
        }
        z y3 = y(0);
        y3.f2359n = true;
        r(y3, false);
        D(y3, null);
    }

    @Override // k.InterfaceC0156k
    public final boolean f(MenuC0158m menuC0158m, MenuItem menuItem) {
        z zVar;
        Window.Callback callback = this.f2226l.getCallback();
        if (callback != null && !this.f2207R) {
            MenuC0158m k2 = menuC0158m.k();
            z[] zVarArr = this.f2202M;
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
                return callback.onMenuItemSelected(zVar.f2349a, menuItem);
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
        if (this.f2200K && i == 108) {
            return false;
        }
        if (this.f2196G && i == 1) {
            this.f2196G = false;
        }
        if (i == 1) {
            G();
            this.f2200K = true;
            return true;
        }
        if (i == 2) {
            G();
            this.f2195E = true;
            return true;
        }
        if (i == 5) {
            G();
            this.F = true;
            return true;
        }
        if (i == 10) {
            G();
            this.f2198I = true;
            return true;
        }
        if (i == 108) {
            G();
            this.f2196G = true;
            return true;
        }
        if (i != 109) {
            return this.f2226l.requestFeature(i);
        }
        G();
        this.f2197H = true;
        return true;
    }

    @Override // g.o
    public final void i(int i) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2192B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2225k).inflate(i, viewGroup);
        this.f2227m.a(this.f2226l.getCallback());
    }

    @Override // g.o
    public final void j(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2192B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2227m.a(this.f2226l.getCallback());
    }

    @Override // g.o
    public final void k(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2192B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2227m.a(this.f2226l.getCallback());
    }

    @Override // g.o
    public final void l(CharSequence charSequence) {
        this.f2231q = charSequence;
        InterfaceC0246l0 interfaceC0246l0 = this.f2232r;
        if (interfaceC0246l0 != null) {
            interfaceC0246l0.setWindowTitle(charSequence);
            return;
        }
        K k2 = this.f2229o;
        if (k2 == null) {
            TextView textView = this.f2193C;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        d1 d1Var = (d1) k2.f2268e;
        if (d1Var.f2959g) {
            return;
        }
        d1Var.h = charSequence;
        if ((d1Var.f2955b & 8) != 0) {
            Toolbar toolbar = d1Var.f2954a;
            toolbar.setTitle(charSequence);
            if (d1Var.f2959g) {
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
        if (this.f2207R) {
            return false;
        }
        int i3 = this.f2209T;
        if (i3 == -100) {
            i3 = o.f2331b;
        }
        Context context = this.f2225k;
        int B2 = B(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        G.f o2 = i4 < 33 ? o(context) : null;
        if (!z3 && o2 != null) {
            o2 = t.b(context.getResources().getConfiguration());
        }
        Configuration s2 = s(context, B2, o2, null, false);
        boolean z5 = this.f2212W;
        Object obj = this.f2224j;
        boolean z6 = true;
        if (!z5 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.f2208S;
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
                if (((~i) & i2) != 0 && z2 && this.f2205P && ((f2190k0 || this.f2206Q) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31 && (i2 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(s2.getLayoutDirection());
                        }
                        if (i7 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new B0.q(12, activity));
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
                            int i8 = this.f2210U;
                            if (i8 != 0) {
                                context.setTheme(i8);
                                context.getTheme().applyStyle(this.f2210U, true);
                            }
                            if (z7 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof androidx.lifecycle.r) {
                                    if (((androidx.lifecycle.r) activity2).d().f1370c.compareTo(EnumC0070m.f1362c) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f2206Q && !this.f2207R) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (z6 && (obj instanceof AbstractActivityC0126i)) {
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
                            w wVar = this.f2213X;
                            if (wVar != null) {
                                wVar.c();
                            }
                        }
                        if (i3 == 3) {
                            if (this.f2214Y == null) {
                                this.f2214Y = new w(this, context);
                            }
                            this.f2214Y.i();
                        } else {
                            w wVar2 = this.f2214Y;
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
                    this.f2211V = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.f2211V = 0;
            }
        }
        this.f2212W = true;
        i = this.f2211V;
        configuration = this.f2208S;
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
        if (this.f2226l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof v) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        v vVar = new v(this, callback);
        this.f2227m = vVar;
        window.setCallback(vVar);
        int[] iArr = j0;
        Context context = this.f2225k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            C0265v a2 = C0265v.a();
            synchronized (a2) {
                drawable = a2.f3055a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f2226l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f2222g0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f2223h0) != null) {
            u.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2223h0 = null;
        }
        Object obj = this.f2224j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f2222g0 = u.a(activity);
                H();
            }
        }
        this.f2222g0 = null;
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
        View c0210f;
        int i;
        String str2 = str;
        char c2 = 4;
        View view2 = null;
        if (this.f2221f0 == null) {
            int[] iArr = f.a.f1929j;
            Context context2 = this.f2225k;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f2221f0 = new C0113D();
            } else {
                try {
                    this.f2221f0 = (C0113D) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f2221f0 = new C0113D();
                }
            }
        }
        C0113D c0113d = this.f2221f0;
        int i2 = f1.f2966a;
        c0113d.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f1943x, 0, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context c0140c = (resourceId == 0 || ((context instanceof C0140c) && ((C0140c) context).f2528a == resourceId)) ? context : new C0140c(context, resourceId);
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
                c0210f = new C0210F(c0140c, attributeSet);
                break;
            case 1:
                c0210f = new C0261t(c0140c, attributeSet);
                break;
            case 2:
                c0210f = new C0206B(c0140c, attributeSet);
                break;
            case 3:
                c0210f = c0113d.e(c0140c, attributeSet);
                break;
            case 4:
                c0210f = new C0273z(c0140c, attributeSet, com.ratebook.luckyconvert.R.attr.imageButtonStyle);
                break;
            case 5:
                c0210f = new C0212H(c0140c, attributeSet);
                break;
            case 6:
                c0210f = new C0222S(c0140c, attributeSet);
                break;
            case 7:
                c0210f = c0113d.d(c0140c, attributeSet);
                break;
            case '\b':
                c0210f = new C0242j0(c0140c, attributeSet);
                break;
            case '\t':
                c0210f = new C0205A(c0140c, attributeSet, 0);
                break;
            case '\n':
                c0210f = c0113d.a(c0140c, attributeSet);
                break;
            case 11:
                c0210f = c0113d.c(c0140c, attributeSet);
                break;
            case '\f':
                c0210f = new C0269x(c0140c, attributeSet);
                break;
            case '\r':
                c0210f = c0113d.b(c0140c, attributeSet);
                break;
            default:
                c0210f = null;
                break;
        }
        if (c0210f == null && context != c0140c) {
            Object[] objArr = c0113d.f2250a;
            if (str2.equals("view")) {
                str2 = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c0140c;
                objArr[1] = attributeSet;
                if (-1 == str2.indexOf(46)) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr = C0113D.f2249g;
                        if (i3 < 3) {
                            View f2 = c0113d.f(c0140c, str2, strArr[i3]);
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
                    View f3 = c0113d.f(c0140c, str2, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = f3;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            c0210f = view2;
        }
        if (c0210f != null) {
            Context context3 = c0210f.getContext();
            if ((context3 instanceof ContextWrapper) && c0210f.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C0113D.f2246c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c0210f.setOnClickListener(new ViewOnClickListenerC0112C(c0210f, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = c0140c.obtainStyledAttributes(attributeSet, C0113D.d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = T.f381a;
                    i = 0;
                    new K.C(com.ratebook.luckyconvert.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(c0210f, Boolean.valueOf(z2));
                } else {
                    i = 0;
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = c0140c.obtainStyledAttributes(attributeSet, C0113D.f2247e);
                if (obtainStyledAttributes5.hasValue(i)) {
                    T.m(c0210f, obtainStyledAttributes5.getString(i));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = c0140c.obtainStyledAttributes(attributeSet, C0113D.f2248f);
                if (obtainStyledAttributes6.hasValue(i)) {
                    boolean z3 = obtainStyledAttributes6.getBoolean(i, i);
                    WeakHashMap weakHashMap2 = T.f381a;
                    new K.C(com.ratebook.luckyconvert.R.id.tag_screen_reader_focusable, Boolean.class, i, 28, 0).d(c0210f, Boolean.valueOf(z3));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return c0210f;
    }

    public final void p(int i, z zVar, MenuC0158m menuC0158m) {
        if (menuC0158m == null) {
            if (zVar == null && i >= 0) {
                z[] zVarArr = this.f2202M;
                if (i < zVarArr.length) {
                    zVar = zVarArr[i];
                }
            }
            if (zVar != null) {
                menuC0158m = zVar.h;
            }
        }
        if ((zVar == null || zVar.f2358m) && !this.f2207R) {
            v vVar = this.f2227m;
            Window.Callback callback = this.f2226l.getCallback();
            vVar.getClass();
            try {
                vVar.d = true;
                callback.onPanelClosed(i, menuC0158m);
            } finally {
                vVar.d = false;
            }
        }
    }

    public final void q(MenuC0158m menuC0158m) {
        C0243k c0243k;
        if (this.f2201L) {
            return;
        }
        this.f2201L = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2232r;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((d1) actionBarOverlayLayout.f1163e).f2954a.f1223a;
        if (actionMenuView != null && (c0243k = actionMenuView.f1187t) != null) {
            c0243k.f();
            C0235g c0235g = c0243k.f3004t;
            if (c0235g != null && c0235g.b()) {
                c0235g.i.dismiss();
            }
        }
        Window.Callback callback = this.f2226l.getCallback();
        if (callback != null && !this.f2207R) {
            callback.onPanelClosed(108, menuC0158m);
        }
        this.f2201L = false;
    }

    public final void r(z zVar, boolean z2) {
        y yVar;
        InterfaceC0246l0 interfaceC0246l0;
        C0243k c0243k;
        if (z2 && zVar.f2349a == 0 && (interfaceC0246l0 = this.f2232r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0246l0;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((d1) actionBarOverlayLayout.f1163e).f2954a.f1223a;
            if (actionMenuView != null && (c0243k = actionMenuView.f1187t) != null && c0243k.i()) {
                q(zVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f2225k.getSystemService("window");
        if (windowManager != null && zVar.f2358m && (yVar = zVar.f2352e) != null) {
            windowManager.removeView(yVar);
            if (z2) {
                p(zVar.f2349a, zVar, null);
            }
        }
        zVar.f2356k = false;
        zVar.f2357l = false;
        zVar.f2358m = false;
        zVar.f2353f = null;
        zVar.f2359n = true;
        if (this.f2203N == zVar) {
            this.f2203N = null;
        }
        if (zVar.f2349a == 0) {
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
        C0243k c0243k;
        Object obj = this.f2224j;
        if (((obj instanceof InterfaceC0011k) || (obj instanceof DialogInterfaceC0123f)) && (decorView = this.f2226l.getDecorView()) != null && q1.d.u(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            v vVar = this.f2227m;
            Window.Callback callback = this.f2226l.getCallback();
            vVar.getClass();
            try {
                vVar.f2344c = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                vVar.f2344c = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f2204O = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                z y2 = y(0);
                if (y2.f2358m) {
                    return true;
                }
                F(y2, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f2235u != null) {
                    return true;
                }
                z y3 = y(0);
                InterfaceC0246l0 interfaceC0246l0 = this.f2232r;
                Context context = this.f2225k;
                if (interfaceC0246l0 != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0246l0;
                    actionBarOverlayLayout.k();
                    Toolbar toolbar = ((d1) actionBarOverlayLayout.f1163e).f2954a;
                    if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1223a) != null && actionMenuView.f1186s && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2232r;
                        actionBarOverlayLayout2.k();
                        ActionMenuView actionMenuView2 = ((d1) actionBarOverlayLayout2.f1163e).f2954a.f1223a;
                        if (actionMenuView2 == null || (c0243k = actionMenuView2.f1187t) == null || !c0243k.i()) {
                            if (!this.f2207R && F(y3, keyEvent)) {
                                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2232r;
                                actionBarOverlayLayout3.k();
                                ActionMenuView actionMenuView3 = ((d1) actionBarOverlayLayout3.f1163e).f2954a.f1223a;
                                if (actionMenuView3 != null) {
                                    C0243k c0243k2 = actionMenuView3.f1187t;
                                    if (c0243k2 != null) {
                                    }
                                }
                            }
                            z2 = false;
                        } else {
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2232r;
                            actionBarOverlayLayout4.k();
                            ActionMenuView actionMenuView4 = ((d1) actionBarOverlayLayout4.f1163e).f2954a.f1223a;
                            if (actionMenuView4 != null) {
                                C0243k c0243k3 = actionMenuView4.f1187t;
                                if (c0243k3 != null) {
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
                boolean z4 = y3.f2358m;
                if (z4 || y3.f2357l) {
                    r(y3, true);
                    z2 = z4;
                    if (z2) {
                    }
                } else {
                    if (y3.f2356k) {
                        if (y3.f2360o) {
                            y3.f2356k = false;
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
                y2.f2361p = bundle;
            }
            y2.h.w();
            y2.h.clear();
        }
        y2.f2360o = true;
        y2.f2359n = true;
        if ((i == 108 || i == 0) && this.f2232r != null) {
            z y3 = y(0);
            y3.f2356k = false;
            F(y3, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        int i = 1;
        int i2 = 0;
        if (this.f2191A) {
            return;
        }
        int[] iArr = f.a.f1929j;
        Context context = this.f2225k;
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
        this.f2199J = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        w();
        this.f2226l.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f2200K) {
            viewGroup = this.f2198I ? (ViewGroup) from.inflate(com.ratebook.luckyconvert.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.ratebook.luckyconvert.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f2199J) {
            viewGroup = (ViewGroup) from.inflate(com.ratebook.luckyconvert.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f2197H = false;
            this.f2196G = false;
        } else if (this.f2196G) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.ratebook.luckyconvert.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0140c(context, typedValue.resourceId) : context).inflate(com.ratebook.luckyconvert.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0246l0 interfaceC0246l0 = (InterfaceC0246l0) viewGroup.findViewById(com.ratebook.luckyconvert.R.id.decor_content_parent);
            this.f2232r = interfaceC0246l0;
            interfaceC0246l0.setWindowCallback(this.f2226l.getCallback());
            if (this.f2197H) {
                ((ActionBarOverlayLayout) this.f2232r).j(109);
            }
            if (this.f2195E) {
                ((ActionBarOverlayLayout) this.f2232r).j(2);
            }
            if (this.F) {
                ((ActionBarOverlayLayout) this.f2232r).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f2196G + ", windowActionBarOverlay: " + this.f2197H + ", android:windowIsFloating: " + this.f2199J + ", windowActionModeOverlay: " + this.f2198I + ", windowNoTitle: " + this.f2200K + " }");
        }
        q qVar = new q(this, i2);
        WeakHashMap weakHashMap = T.f381a;
        K.H.u(viewGroup, qVar);
        if (this.f2232r == null) {
            this.f2193C = (TextView) viewGroup.findViewById(com.ratebook.luckyconvert.R.id.title);
        }
        boolean z2 = i1.f2982a;
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
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.ratebook.luckyconvert.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f2226l.findViewById(R.id.content);
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
        this.f2226l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new q(this, i));
        this.f2192B = viewGroup;
        Object obj = this.f2224j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2231q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0246l0 interfaceC0246l02 = this.f2232r;
            if (interfaceC0246l02 != null) {
                interfaceC0246l02.setWindowTitle(title);
            } else {
                K k2 = this.f2229o;
                if (k2 != null) {
                    d1 d1Var = (d1) k2.f2268e;
                    if (!d1Var.f2959g) {
                        d1Var.h = title;
                        if ((d1Var.f2955b & 8) != 0) {
                            Toolbar toolbar = d1Var.f2954a;
                            toolbar.setTitle(title);
                            if (d1Var.f2959g) {
                                T.m(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f2193C;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f2192B.findViewById(R.id.content);
        View decorView = this.f2226l.getDecorView();
        contentFrameLayout2.f1203g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.f2191A = true;
        z y2 = y(0);
        if (this.f2207R || y2.h != null) {
            return;
        }
        A(108);
    }

    public final void w() {
        if (this.f2226l == null) {
            Object obj = this.f2224j;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.f2226l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final AbstractC0039g x(Context context) {
        if (this.f2213X == null) {
            if (C0012l.f429e == null) {
                Context applicationContext = context.getApplicationContext();
                C0012l.f429e = new C0012l(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f2213X = new w(this, C0012l.f429e);
        }
        return this.f2213X;
    }

    public final z y(int i) {
        z[] zVarArr = this.f2202M;
        if (zVarArr == null || zVarArr.length <= i) {
            z[] zVarArr2 = new z[i + 1];
            if (zVarArr != null) {
                System.arraycopy(zVarArr, 0, zVarArr2, 0, zVarArr.length);
            }
            this.f2202M = zVarArr2;
            zVarArr = zVarArr2;
        }
        z zVar = zVarArr[i];
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z();
        zVar2.f2349a = i;
        zVar2.f2359n = false;
        zVarArr[i] = zVar2;
        return zVar2;
    }

    public final void z() {
        v();
        if (this.f2196G && this.f2229o == null) {
            Object obj = this.f2224j;
            if (obj instanceof Activity) {
                this.f2229o = new K((Activity) obj, this.f2197H);
            } else if (obj instanceof Dialog) {
                this.f2229o = new K((Dialog) obj);
            }
            K k2 = this.f2229o;
            if (k2 != null) {
                k2.g0(this.f2218c0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}

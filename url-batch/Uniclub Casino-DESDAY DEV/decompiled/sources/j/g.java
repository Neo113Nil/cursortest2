package j;

import K.AbstractC0012m;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import k.ActionProviderVisibilityListenerC0171p;
import k.C0170o;
import k.MenuItemC0175t;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f2566A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f2567B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ h f2570E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f2571a;
    public boolean h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2577j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f2578k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f2579l;

    /* renamed from: m, reason: collision with root package name */
    public int f2580m;

    /* renamed from: n, reason: collision with root package name */
    public char f2581n;

    /* renamed from: o, reason: collision with root package name */
    public int f2582o;

    /* renamed from: p, reason: collision with root package name */
    public char f2583p;

    /* renamed from: q, reason: collision with root package name */
    public int f2584q;

    /* renamed from: r, reason: collision with root package name */
    public int f2585r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2586s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2587t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2588u;

    /* renamed from: v, reason: collision with root package name */
    public int f2589v;

    /* renamed from: w, reason: collision with root package name */
    public int f2590w;

    /* renamed from: x, reason: collision with root package name */
    public String f2591x;

    /* renamed from: y, reason: collision with root package name */
    public String f2592y;

    /* renamed from: z, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0171p f2593z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f2568C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f2569D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f2572b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f2573c = 0;
    public int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2574e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2575f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2576g = true;

    public g(h hVar, Menu menu) {
        this.f2570E = hVar;
        this.f2571a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f2570E.f2598c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f2586s).setVisible(this.f2587t).setEnabled(this.f2588u).setCheckable(this.f2585r >= 1).setTitleCondensed(this.f2579l).setIcon(this.f2580m);
        int i = this.f2589v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f2592y;
        h hVar = this.f2570E;
        if (str != null) {
            if (hVar.f2598c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.d == null) {
                hVar.d = h.a(hVar.f2598c);
            }
            Object obj = hVar.d;
            String str2 = this.f2592y;
            f fVar = new f();
            fVar.f2564a = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.f2565b = cls.getMethod(str2, f.f2563c);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        if (this.f2585r >= 2) {
            if (menuItem instanceof C0170o) {
                C0170o c0170o = (C0170o) menuItem;
                c0170o.f2738x = (c0170o.f2738x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC0175t) {
                MenuItemC0175t menuItemC0175t = (MenuItemC0175t) menuItem;
                try {
                    Method method = menuItemC0175t.d;
                    E.a aVar = menuItemC0175t.f2749c;
                    if (method == null) {
                        menuItemC0175t.d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC0175t.d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e3) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e3);
                }
            }
        }
        String str3 = this.f2591x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, h.f2594e, hVar.f2596a));
            z2 = true;
        }
        int i2 = this.f2590w;
        if (i2 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ActionProviderVisibilityListenerC0171p actionProviderVisibilityListenerC0171p = this.f2593z;
        if (actionProviderVisibilityListenerC0171p != null) {
            if (menuItem instanceof E.a) {
                ((E.a) menuItem).b(actionProviderVisibilityListenerC0171p);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f2566A;
        boolean z3 = menuItem instanceof E.a;
        if (z3) {
            ((E.a) menuItem).setContentDescription(charSequence);
        } else {
            AbstractC0012m.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f2567B;
        if (z3) {
            ((E.a) menuItem).setTooltipText(charSequence2);
        } else {
            AbstractC0012m.m(menuItem, charSequence2);
        }
        char c2 = this.f2581n;
        int i3 = this.f2582o;
        if (z3) {
            ((E.a) menuItem).setAlphabeticShortcut(c2, i3);
        } else {
            AbstractC0012m.g(menuItem, c2, i3);
        }
        char c3 = this.f2583p;
        int i4 = this.f2584q;
        if (z3) {
            ((E.a) menuItem).setNumericShortcut(c3, i4);
        } else {
            AbstractC0012m.k(menuItem, c3, i4);
        }
        PorterDuff.Mode mode = this.f2569D;
        if (mode != null) {
            if (z3) {
                ((E.a) menuItem).setIconTintMode(mode);
            } else {
                AbstractC0012m.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f2568C;
        if (colorStateList != null) {
            if (z3) {
                ((E.a) menuItem).setIconTintList(colorStateList);
            } else {
                AbstractC0012m.i(menuItem, colorStateList);
            }
        }
    }
}

package j;

import K.AbstractC0013m;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import k.ActionProviderVisibilityListenerC0161p;
import k.C0160o;
import k.MenuItemC0165t;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f2541A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f2542B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ h f2545E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f2546a;
    public boolean h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2552j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f2553k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f2554l;

    /* renamed from: m, reason: collision with root package name */
    public int f2555m;

    /* renamed from: n, reason: collision with root package name */
    public char f2556n;

    /* renamed from: o, reason: collision with root package name */
    public int f2557o;

    /* renamed from: p, reason: collision with root package name */
    public char f2558p;

    /* renamed from: q, reason: collision with root package name */
    public int f2559q;

    /* renamed from: r, reason: collision with root package name */
    public int f2560r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2561s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2562t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2563u;

    /* renamed from: v, reason: collision with root package name */
    public int f2564v;

    /* renamed from: w, reason: collision with root package name */
    public int f2565w;

    /* renamed from: x, reason: collision with root package name */
    public String f2566x;

    /* renamed from: y, reason: collision with root package name */
    public String f2567y;

    /* renamed from: z, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0161p f2568z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f2543C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f2544D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f2547b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f2548c = 0;
    public int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2549e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2550f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2551g = true;

    public g(h hVar, Menu menu) {
        this.f2545E = hVar;
        this.f2546a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f2545E.f2573c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f2561s).setVisible(this.f2562t).setEnabled(this.f2563u).setCheckable(this.f2560r >= 1).setTitleCondensed(this.f2554l).setIcon(this.f2555m);
        int i = this.f2564v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f2567y;
        h hVar = this.f2545E;
        if (str != null) {
            if (hVar.f2573c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.d == null) {
                hVar.d = h.a(hVar.f2573c);
            }
            Object obj = hVar.d;
            String str2 = this.f2567y;
            f fVar = new f();
            fVar.f2539a = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.f2540b = cls.getMethod(str2, f.f2538c);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        if (this.f2560r >= 2) {
            if (menuItem instanceof C0160o) {
                C0160o c0160o = (C0160o) menuItem;
                c0160o.f2713x = (c0160o.f2713x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC0165t) {
                MenuItemC0165t menuItemC0165t = (MenuItemC0165t) menuItem;
                try {
                    Method method = menuItemC0165t.d;
                    E.a aVar = menuItemC0165t.f2724c;
                    if (method == null) {
                        menuItemC0165t.d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC0165t.d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e3) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e3);
                }
            }
        }
        String str3 = this.f2566x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, h.f2569e, hVar.f2571a));
            z2 = true;
        }
        int i2 = this.f2565w;
        if (i2 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ActionProviderVisibilityListenerC0161p actionProviderVisibilityListenerC0161p = this.f2568z;
        if (actionProviderVisibilityListenerC0161p != null) {
            if (menuItem instanceof E.a) {
                ((E.a) menuItem).b(actionProviderVisibilityListenerC0161p);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f2541A;
        boolean z3 = menuItem instanceof E.a;
        if (z3) {
            ((E.a) menuItem).setContentDescription(charSequence);
        } else {
            AbstractC0013m.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f2542B;
        if (z3) {
            ((E.a) menuItem).setTooltipText(charSequence2);
        } else {
            AbstractC0013m.m(menuItem, charSequence2);
        }
        char c2 = this.f2556n;
        int i3 = this.f2557o;
        if (z3) {
            ((E.a) menuItem).setAlphabeticShortcut(c2, i3);
        } else {
            AbstractC0013m.g(menuItem, c2, i3);
        }
        char c3 = this.f2558p;
        int i4 = this.f2559q;
        if (z3) {
            ((E.a) menuItem).setNumericShortcut(c3, i4);
        } else {
            AbstractC0013m.k(menuItem, c3, i4);
        }
        PorterDuff.Mode mode = this.f2544D;
        if (mode != null) {
            if (z3) {
                ((E.a) menuItem).setIconTintMode(mode);
            } else {
                AbstractC0013m.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f2543C;
        if (colorStateList != null) {
            if (z3) {
                ((E.a) menuItem).setIconTintList(colorStateList);
            } else {
                AbstractC0013m.i(menuItem, colorStateList);
            }
        }
    }
}

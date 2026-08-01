package j;

import K.AbstractC0015n;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import k.ActionProviderVisibilityListenerC0167p;
import k.C0166o;
import k.MenuItemC0171t;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f2638A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f2639B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ h f2642E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f2643a;
    public boolean h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2649j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f2650k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f2651l;

    /* renamed from: m, reason: collision with root package name */
    public int f2652m;

    /* renamed from: n, reason: collision with root package name */
    public char f2653n;

    /* renamed from: o, reason: collision with root package name */
    public int f2654o;

    /* renamed from: p, reason: collision with root package name */
    public char f2655p;

    /* renamed from: q, reason: collision with root package name */
    public int f2656q;

    /* renamed from: r, reason: collision with root package name */
    public int f2657r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2658s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2659t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2660u;

    /* renamed from: v, reason: collision with root package name */
    public int f2661v;

    /* renamed from: w, reason: collision with root package name */
    public int f2662w;

    /* renamed from: x, reason: collision with root package name */
    public String f2663x;

    /* renamed from: y, reason: collision with root package name */
    public String f2664y;

    /* renamed from: z, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0167p f2665z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f2640C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f2641D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f2644b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f2645c = 0;
    public int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2646e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2647f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2648g = true;

    public g(h hVar, Menu menu) {
        this.f2642E = hVar;
        this.f2643a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f2642E.f2670c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f2658s).setVisible(this.f2659t).setEnabled(this.f2660u).setCheckable(this.f2657r >= 1).setTitleCondensed(this.f2651l).setIcon(this.f2652m);
        int i = this.f2661v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f2664y;
        h hVar = this.f2642E;
        if (str != null) {
            if (hVar.f2670c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.d == null) {
                hVar.d = h.a(hVar.f2670c);
            }
            Object obj = hVar.d;
            String str2 = this.f2664y;
            f fVar = new f();
            fVar.f2636a = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.f2637b = cls.getMethod(str2, f.f2635c);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        if (this.f2657r >= 2) {
            if (menuItem instanceof C0166o) {
                C0166o c0166o = (C0166o) menuItem;
                c0166o.f2803x = (c0166o.f2803x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC0171t) {
                MenuItemC0171t menuItemC0171t = (MenuItemC0171t) menuItem;
                try {
                    Method method = menuItemC0171t.d;
                    E.a aVar = menuItemC0171t.f2814c;
                    if (method == null) {
                        menuItemC0171t.d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC0171t.d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e3) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e3);
                }
            }
        }
        String str3 = this.f2663x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, h.f2666e, hVar.f2668a));
            z2 = true;
        }
        int i2 = this.f2662w;
        if (i2 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ActionProviderVisibilityListenerC0167p actionProviderVisibilityListenerC0167p = this.f2665z;
        if (actionProviderVisibilityListenerC0167p != null) {
            if (menuItem instanceof E.a) {
                ((E.a) menuItem).b(actionProviderVisibilityListenerC0167p);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f2638A;
        boolean z3 = menuItem instanceof E.a;
        if (z3) {
            ((E.a) menuItem).setContentDescription(charSequence);
        } else {
            AbstractC0015n.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f2639B;
        if (z3) {
            ((E.a) menuItem).setTooltipText(charSequence2);
        } else {
            AbstractC0015n.m(menuItem, charSequence2);
        }
        char c2 = this.f2653n;
        int i3 = this.f2654o;
        if (z3) {
            ((E.a) menuItem).setAlphabeticShortcut(c2, i3);
        } else {
            AbstractC0015n.g(menuItem, c2, i3);
        }
        char c3 = this.f2655p;
        int i4 = this.f2656q;
        if (z3) {
            ((E.a) menuItem).setNumericShortcut(c3, i4);
        } else {
            AbstractC0015n.k(menuItem, c3, i4);
        }
        PorterDuff.Mode mode = this.f2641D;
        if (mode != null) {
            if (z3) {
                ((E.a) menuItem).setIconTintMode(mode);
            } else {
                AbstractC0015n.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f2640C;
        if (colorStateList != null) {
            if (z3) {
                ((E.a) menuItem).setIconTintList(colorStateList);
            } else {
                AbstractC0015n.i(menuItem, colorStateList);
            }
        }
    }
}

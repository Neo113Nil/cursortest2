package j;

import K.AbstractC0020m;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import k.ActionProviderVisibilityListenerC0205p;
import k.C0204o;
import k.MenuItemC0209t;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f3069A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f3070B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ h f3073E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f3074a;
    public boolean h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3080j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f3081k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f3082l;

    /* renamed from: m, reason: collision with root package name */
    public int f3083m;

    /* renamed from: n, reason: collision with root package name */
    public char f3084n;

    /* renamed from: o, reason: collision with root package name */
    public int f3085o;

    /* renamed from: p, reason: collision with root package name */
    public char f3086p;

    /* renamed from: q, reason: collision with root package name */
    public int f3087q;

    /* renamed from: r, reason: collision with root package name */
    public int f3088r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3089s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3090t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3091u;

    /* renamed from: v, reason: collision with root package name */
    public int f3092v;

    /* renamed from: w, reason: collision with root package name */
    public int f3093w;

    /* renamed from: x, reason: collision with root package name */
    public String f3094x;

    /* renamed from: y, reason: collision with root package name */
    public String f3095y;

    /* renamed from: z, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0205p f3096z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f3071C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f3072D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f3075b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f3076c = 0;
    public int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f3077e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3078f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3079g = true;

    public g(h hVar, Menu menu) {
        this.f3073E = hVar;
        this.f3074a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f3073E.f3101c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f3089s).setVisible(this.f3090t).setEnabled(this.f3091u).setCheckable(this.f3088r >= 1).setTitleCondensed(this.f3082l).setIcon(this.f3083m);
        int i = this.f3092v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f3095y;
        h hVar = this.f3073E;
        if (str != null) {
            if (hVar.f3101c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.d == null) {
                hVar.d = h.a(hVar.f3101c);
            }
            Object obj = hVar.d;
            String str2 = this.f3095y;
            f fVar = new f();
            fVar.f3067a = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.f3068b = cls.getMethod(str2, f.f3066c);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        if (this.f3088r >= 2) {
            if (menuItem instanceof C0204o) {
                C0204o c0204o = (C0204o) menuItem;
                c0204o.f3234x = (c0204o.f3234x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC0209t) {
                MenuItemC0209t menuItemC0209t = (MenuItemC0209t) menuItem;
                try {
                    Method method = menuItemC0209t.d;
                    E.a aVar = menuItemC0209t.f3245c;
                    if (method == null) {
                        menuItemC0209t.d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC0209t.d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e3) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e3);
                }
            }
        }
        String str3 = this.f3094x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, h.f3097e, hVar.f3099a));
            z2 = true;
        }
        int i2 = this.f3093w;
        if (i2 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ActionProviderVisibilityListenerC0205p actionProviderVisibilityListenerC0205p = this.f3096z;
        if (actionProviderVisibilityListenerC0205p != null) {
            if (menuItem instanceof E.a) {
                ((E.a) menuItem).b(actionProviderVisibilityListenerC0205p);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f3069A;
        boolean z3 = menuItem instanceof E.a;
        if (z3) {
            ((E.a) menuItem).setContentDescription(charSequence);
        } else {
            AbstractC0020m.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f3070B;
        if (z3) {
            ((E.a) menuItem).setTooltipText(charSequence2);
        } else {
            AbstractC0020m.m(menuItem, charSequence2);
        }
        char c2 = this.f3084n;
        int i3 = this.f3085o;
        if (z3) {
            ((E.a) menuItem).setAlphabeticShortcut(c2, i3);
        } else {
            AbstractC0020m.g(menuItem, c2, i3);
        }
        char c3 = this.f3086p;
        int i4 = this.f3087q;
        if (z3) {
            ((E.a) menuItem).setNumericShortcut(c3, i4);
        } else {
            AbstractC0020m.k(menuItem, c3, i4);
        }
        PorterDuff.Mode mode = this.f3072D;
        if (mode != null) {
            if (z3) {
                ((E.a) menuItem).setIconTintMode(mode);
            } else {
                AbstractC0020m.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f3071C;
        if (colorStateList != null) {
            if (z3) {
                ((E.a) menuItem).setIconTintList(colorStateList);
            } else {
                AbstractC0020m.i(menuItem, colorStateList);
            }
        }
    }
}

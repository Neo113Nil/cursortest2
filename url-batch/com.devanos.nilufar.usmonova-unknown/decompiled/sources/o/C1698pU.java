package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;

/* renamed from: o.pU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1698pU {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ C1764qU E;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;

    /* renamed from: o, reason: collision with root package name */
    public int f211o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public ActionProviderVisibilityListenerC1350kC z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public C1698pU(C1764qU c1764qU, Menu menu) {
        this.E = c1764qU;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.y;
        C1764qU c1764qU = this.E;
        if (str != null) {
            if (c1764qU.c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c1764qU.d == null) {
                c1764qU.d = C1764qU.a(c1764qU.c);
            }
            Object obj = c1764qU.d;
            String str2 = this.y;
            MenuItemOnMenuItemClickListenerC1632oU menuItemOnMenuItemClickListenerC1632oU = new MenuItemOnMenuItemClickListenerC1632oU();
            menuItemOnMenuItemClickListenerC1632oU.b = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC1632oU.c = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC1632oU.d);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC1632oU);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof C1284jC) {
                C1284jC c1284jC = (C1284jC) menuItem;
                c1284jC.x = (c1284jC.x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC1548nC) {
                MenuItemC1548nC menuItemC1548nC = (MenuItemC1548nC) menuItem;
                InterfaceMenuItemC1829rU interfaceMenuItemC1829rU = menuItemC1548nC.c;
                try {
                    if (menuItemC1548nC.d == null) {
                        menuItemC1548nC.d = interfaceMenuItemC1829rU.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC1548nC.d.invoke(interfaceMenuItemC1829rU, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str3 = this.x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C1764qU.e, c1764qU.a));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ActionProviderVisibilityListenerC1350kC actionProviderVisibilityListenerC1350kC = this.z;
        if (actionProviderVisibilityListenerC1350kC != null) {
            if (menuItem instanceof InterfaceMenuItemC1829rU) {
                ((InterfaceMenuItemC1829rU) menuItem).b(actionProviderVisibilityListenerC1350kC);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z2 = menuItem instanceof InterfaceMenuItemC1829rU;
        if (z2) {
            ((InterfaceMenuItemC1829rU) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1154hC.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z2) {
            ((InterfaceMenuItemC1829rU) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1154hC.m(menuItem, charSequence2);
        }
        char c = this.n;
        int i3 = this.f211o;
        if (z2) {
            ((InterfaceMenuItemC1829rU) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1154hC.g(menuItem, c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((InterfaceMenuItemC1829rU) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1154hC.k(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z2) {
                ((InterfaceMenuItemC1829rU) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC1154hC.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z2) {
                ((InterfaceMenuItemC1829rU) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC1154hC.i(menuItem, colorStateList);
            }
        }
    }
}

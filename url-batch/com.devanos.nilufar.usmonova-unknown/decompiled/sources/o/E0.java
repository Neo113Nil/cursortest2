package o;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;

/* loaded from: classes.dex */
public abstract class E0 {
    public Object a;
    public Object b;

    public E0(Context context) {
        this.a = context;
    }

    public void c() {
        C1015f5 c1015f5 = (C1015f5) this.a;
        if (c1015f5 != null) {
            try {
                ((LayoutInflaterFactory2C1213i5) this.b).r.unregisterReceiver(c1015f5);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int[] e(int i);

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC1829rU)) {
            return menuItem;
        }
        InterfaceMenuItemC1829rU interfaceMenuItemC1829rU = (InterfaceMenuItemC1829rU) menuItem;
        if (((GR) this.b) == null) {
            this.b = new GR(0);
        }
        MenuItem menuItem2 = (MenuItem) ((GR) this.b).get(interfaceMenuItemC1829rU);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC1548nC menuItemC1548nC = new MenuItemC1548nC((Context) this.a, interfaceMenuItemC1829rU);
        ((GR) this.b).put(interfaceMenuItemC1829rU, menuItemC1548nC);
        return menuItemC1548nC;
    }

    public int[] h(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public String i() {
        String str = (String) this.a;
        if (str != null) {
            return str;
        }
        AbstractC0048Bt.i0("text");
        throw null;
    }

    public abstract void j();

    public abstract int[] k(int i);

    public void l() {
        c();
        IntentFilter d = d();
        if (d.countActions() == 0) {
            return;
        }
        if (((C1015f5) this.a) == null) {
            this.a = new C1015f5(this);
        }
        ((LayoutInflaterFactory2C1213i5) this.b).r.registerReceiver((C1015f5) this.a, d);
    }

    public E0() {
        this.b = new int[2];
    }

    public E0(LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5) {
        this.b = layoutInflaterFactory2C1213i5;
    }
}

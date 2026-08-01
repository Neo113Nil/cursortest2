package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.HashSet;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class z3 {
    public Object a;
    public Object b;

    public z3(u20 u20Var, a9 a9Var) {
        this.a = u20Var;
        this.b = a9Var;
    }

    public void c() {
        y3 y3Var = (y3) this.a;
        if (y3Var != null) {
            try {
                ((c4) this.b).p.unregisterReceiver(y3Var);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public void d() {
        u20 u20Var = (u20) this.a;
        a9 a9Var = (a9) this.b;
        HashSet hashSet = u20Var.e;
        if (hashSet.remove(a9Var) && hashSet.isEmpty()) {
            u20Var.b();
        }
    }

    public abstract IntentFilter e();

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof b40)) {
            return menuItem;
        }
        b40 b40Var = (b40) menuItem;
        if (((e20) this.b) == null) {
            this.b = new e20(0);
        }
        MenuItem menuItem2 = (MenuItem) ((e20) this.b).get(b40Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        zs zsVar = new zs((Context) this.a, b40Var);
        ((e20) this.b).put(b40Var, zsVar);
        return zsVar;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter e = e();
        if (e.countActions() == 0) {
            return;
        }
        if (((y3) this.a) == null) {
            this.a = new y3(this);
        }
        ((c4) this.b).p.registerReceiver((y3) this.a, e);
    }

    public z3(Context context) {
        this.a = context;
    }

    public z3(c4 c4Var) {
        this.b = c4Var;
    }
}

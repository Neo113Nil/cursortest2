package Y;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.HashSet;
import k.MenuItemC0171t;

/* renamed from: Y.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0039g {

    /* renamed from: a, reason: collision with root package name */
    public Object f1067a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1068b;

    public AbstractC0039g(Context context) {
        this.f1067a = context;
    }

    public void c() {
        g.v vVar = (g.v) this.f1067a;
        if (vVar != null) {
            try {
                ((g.y) this.f1068b).f2309k.unregisterReceiver(vVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f1067a = null;
        }
    }

    public void d() {
        U u2 = (U) this.f1067a;
        HashSet hashSet = u2.f1027e;
        if (hashSet.remove((G.c) this.f1068b) && hashSet.isEmpty()) {
            u2.b();
        }
    }

    public abstract IntentFilter e();

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof E.a)) {
            return menuItem;
        }
        E.a aVar = (E.a) menuItem;
        if (((o.k) this.f1068b) == null) {
            this.f1068b = new o.k();
        }
        MenuItem menuItem2 = (MenuItem) ((o.k) this.f1068b).getOrDefault(aVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0171t menuItemC0171t = new MenuItemC0171t((Context) this.f1067a, aVar);
        ((o.k) this.f1068b).put(aVar, menuItemC0171t);
        return menuItemC0171t;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter e2 = e();
        if (e2.countActions() == 0) {
            return;
        }
        if (((g.v) this.f1067a) == null) {
            this.f1067a = new g.v(this);
        }
        ((g.y) this.f1068b).f2309k.registerReceiver((g.v) this.f1067a, e2);
    }

    public AbstractC0039g(U u2, G.c cVar) {
        this.f1067a = u2;
        this.f1068b = cVar;
    }

    public AbstractC0039g(g.y yVar) {
        this.f1068b = yVar;
    }
}

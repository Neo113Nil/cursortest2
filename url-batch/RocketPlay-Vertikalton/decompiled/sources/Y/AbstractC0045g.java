package Y;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.HashSet;
import k.MenuItemC0209t;

/* renamed from: Y.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0045g {

    /* renamed from: a, reason: collision with root package name */
    public Object f1448a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1449b;

    public AbstractC0045g(Context context) {
        this.f1448a = context;
    }

    public void c() {
        g.w wVar = (g.w) this.f1448a;
        if (wVar != null) {
            try {
                ((g.z) this.f1449b).f2748k.unregisterReceiver(wVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f1448a = null;
        }
    }

    public void d() {
        U u2 = (U) this.f1448a;
        HashSet hashSet = u2.f1408e;
        if (hashSet.remove((G.c) this.f1449b) && hashSet.isEmpty()) {
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
        if (((o.k) this.f1449b) == null) {
            this.f1449b = new o.k();
        }
        MenuItem menuItem2 = (MenuItem) ((o.k) this.f1449b).getOrDefault(aVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0209t menuItemC0209t = new MenuItemC0209t((Context) this.f1448a, aVar);
        ((o.k) this.f1449b).put(aVar, menuItemC0209t);
        return menuItemC0209t;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter e2 = e();
        if (e2.countActions() == 0) {
            return;
        }
        if (((g.w) this.f1448a) == null) {
            this.f1448a = new g.w(this);
        }
        ((g.z) this.f1449b).f2748k.registerReceiver((g.w) this.f1448a, e2);
    }

    public AbstractC0045g(U u2, G.c cVar) {
        this.f1448a = u2;
        this.f1449b = cVar;
    }

    public AbstractC0045g(g.z zVar) {
        this.f1449b = zVar;
    }
}

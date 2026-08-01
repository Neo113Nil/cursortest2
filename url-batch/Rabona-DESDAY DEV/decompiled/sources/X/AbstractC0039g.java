package X;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import g.LayoutInflaterFactory2C0110A;
import java.util.HashSet;
import k.MenuItemC0165t;

/* renamed from: X.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0039g {

    /* renamed from: a, reason: collision with root package name */
    public Object f920a;

    /* renamed from: b, reason: collision with root package name */
    public Object f921b;

    public AbstractC0039g(Context context) {
        this.f920a = context;
    }

    public void c() {
        g.x xVar = (g.x) this.f920a;
        if (xVar != null) {
            try {
                ((LayoutInflaterFactory2C0110A) this.f921b).f2228k.unregisterReceiver(xVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f920a = null;
        }
    }

    public void d() {
        U u2 = (U) this.f920a;
        HashSet hashSet = u2.f880e;
        if (hashSet.remove((G.c) this.f921b) && hashSet.isEmpty()) {
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
        if (((o.k) this.f921b) == null) {
            this.f921b = new o.k();
        }
        MenuItem menuItem2 = (MenuItem) ((o.k) this.f921b).getOrDefault(aVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0165t menuItemC0165t = new MenuItemC0165t((Context) this.f920a, aVar);
        ((o.k) this.f921b).put(aVar, menuItemC0165t);
        return menuItemC0165t;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter e2 = e();
        if (e2.countActions() == 0) {
            return;
        }
        if (((g.x) this.f920a) == null) {
            this.f920a = new g.x(this);
        }
        ((LayoutInflaterFactory2C0110A) this.f921b).f2228k.registerReceiver((g.x) this.f920a, e2);
    }

    public AbstractC0039g(U u2, G.c cVar) {
        this.f920a = u2;
        this.f921b = cVar;
    }

    public AbstractC0039g(LayoutInflaterFactory2C0110A layoutInflaterFactory2C0110A) {
        this.f921b = layoutInflaterFactory2C0110A;
    }
}

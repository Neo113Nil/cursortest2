package o;

import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class KP {
    public boolean b;
    public Bundle c;
    public boolean d;
    public H4 e;
    public final C2088vP a = new C2088vP();
    public boolean f = true;

    public final Bundle a(String str) {
        AbstractC0048Bt.n(str, "key");
        if (!this.d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.c = null;
        return bundle2;
    }

    public final JP b() {
        String str;
        JP jp;
        Iterator it = this.a.iterator();
        do {
            C1824rP c1824rP = (C1824rP) it;
            if (!c1824rP.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) c1824rP.next();
            AbstractC0048Bt.m(entry, "components");
            str = (String) entry.getKey();
            jp = (JP) entry.getValue();
        } while (!AbstractC0048Bt.h(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return jp;
    }

    public final void c(String str, JP jp) {
        Object obj;
        AbstractC0048Bt.n(jp, "provider");
        C2088vP c2088vP = this.a;
        C1890sP j = c2088vP.j(str);
        if (j != null) {
            obj = j.i;
        } else {
            C1890sP c1890sP = new C1890sP(str, jp);
            c2088vP.k++;
            C1890sP c1890sP2 = c2088vP.i;
            if (c1890sP2 == null) {
                c2088vP.h = c1890sP;
                c2088vP.i = c1890sP;
            } else {
                c1890sP2.j = c1890sP;
                c1890sP.k = c1890sP2;
                c2088vP.i = c1890sP;
            }
            obj = null;
        }
        if (((JP) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() {
        if (!this.f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        H4 h4 = this.e;
        if (h4 == null) {
            h4 = new H4(this);
        }
        this.e = h4;
        try {
            C2322yz.class.getDeclaredConstructor(null);
            H4 h42 = this.e;
            if (h42 != null) {
                ((LinkedHashSet) h42.b).add(C2322yz.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + C2322yz.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}

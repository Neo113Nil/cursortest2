package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class a80 {
    public final ReentrantLock a;
    public final et0 b;
    public final et0 c;
    public boolean d;
    public final pi0 e;
    public final pi0 f;
    public final p90 g;
    public final /* synthetic */ s80 h;

    public a80(s80 s80Var, p90 p90Var) {
        p90Var.getClass();
        this.h = s80Var;
        this.a = new ReentrantLock(true);
        et0 b = nk.b(wp.d);
        this.b = b;
        et0 b2 = nk.b(bq.d);
        this.c = b2;
        this.e = new pi0(b);
        this.f = new pi0(b2);
        this.g = p90Var;
    }

    public final void a(y70 y70Var) {
        y70Var.getClass();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            et0 et0Var = this.b;
            ArrayList k0 = zd.k0((Collection) et0Var.getValue(), y70Var);
            et0Var.getClass();
            et0Var.k(null, k0);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(y70 y70Var) {
        e80 e80Var;
        y70Var.getClass();
        String str = y70Var.i;
        s80 s80Var = this.h;
        et0 et0Var = s80Var.i;
        h8 h8Var = s80Var.g;
        LinkedHashMap linkedHashMap = s80Var.z;
        boolean l = nz.l(linkedHashMap.get(y70Var), Boolean.TRUE);
        et0 et0Var2 = this.c;
        Set set = (Set) et0Var2.getValue();
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(x40.J(set.size()));
        boolean z = false;
        for (Object obj : set) {
            boolean z2 = true;
            if (!z && nz.l(obj, y70Var)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj);
            }
        }
        et0Var2.k(null, linkedHashSet);
        linkedHashMap.remove(y70Var);
        if (h8Var.contains(y70Var)) {
            if (this.d) {
                return;
            }
            s80Var.s();
            et0 et0Var3 = s80Var.h;
            ArrayList p0 = zd.p0(h8Var);
            et0Var3.getClass();
            et0Var3.k(null, p0);
            ArrayList p = s80Var.p();
            et0Var.getClass();
            et0Var.k(null, p);
            return;
        }
        s80Var.r(y70Var);
        if (y70Var.k.c.compareTo(f20.f) >= 0) {
            y70Var.n = f20.d;
            y70Var.b();
        }
        if (h8Var == null || !h8Var.isEmpty()) {
            Iterator it = h8Var.iterator();
            while (it.hasNext()) {
                if (nz.l(((y70) it.next()).i, str)) {
                    break;
                }
            }
        }
        if (!l && (e80Var = s80Var.p) != null) {
            str.getClass();
            q01 q01Var = (q01) e80Var.a.remove(str);
            if (q01Var != null) {
                q01Var.a();
            }
        }
        s80Var.s();
        ArrayList p2 = s80Var.p();
        et0Var.getClass();
        et0Var.k(null, p2);
    }

    public final void c(y70 y70Var, boolean z) {
        y70Var.getClass();
        s80 s80Var = this.h;
        p90 b = s80Var.v.b(y70Var.e.d);
        s80Var.z.put(y70Var, Boolean.valueOf(z));
        if (!b.equals(this.g)) {
            Object obj = s80Var.w.get(b);
            obj.getClass();
            ((a80) obj).c(y70Var, z);
            return;
        }
        b80 b80Var = s80Var.y;
        if (b80Var != null) {
            b80Var.c(y70Var);
            d(y70Var);
            return;
        }
        h8 h8Var = s80Var.g;
        int indexOf = h8Var.indexOf(y70Var);
        if (indexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + y70Var + " as it was not found on the current back stack");
            return;
        }
        int i = indexOf + 1;
        if (i != h8Var.f) {
            s80Var.m(((y70) h8Var.get(i)).e.i, true, false);
        }
        s80.o(s80Var, y70Var);
        d(y70Var);
        s80Var.t();
        s80Var.b();
    }

    public final void d(y70 y70Var) {
        y70Var.getClass();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            et0 et0Var = this.b;
            Iterable iterable = (Iterable) et0Var.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (nz.l((y70) obj, y70Var)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            et0Var.getClass();
            et0Var.k(null, arrayList);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(y70 y70Var, boolean z) {
        Object obj;
        y70Var.getClass();
        et0 et0Var = this.c;
        Iterable iterable = (Iterable) et0Var.getValue();
        boolean z2 = iterable instanceof Collection;
        pi0 pi0Var = this.e;
        if (!z2 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((y70) it.next()) == y70Var) {
                    Iterable iterable2 = (Iterable) pi0Var.d.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((y70) it2.next()) == y70Var) {
                        }
                    }
                    return;
                }
            }
        }
        et0Var.k(null, mq0.t((Set) et0Var.getValue(), y70Var));
        et0 et0Var2 = pi0Var.d;
        et0 et0Var3 = pi0Var.d;
        List list = (List) et0Var2.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            y70 y70Var2 = (y70) obj;
            if (!nz.l(y70Var2, y70Var) && ((List) et0Var3.getValue()).lastIndexOf(y70Var2) < ((List) et0Var3.getValue()).lastIndexOf(y70Var)) {
                break;
            }
        }
        y70 y70Var3 = (y70) obj;
        if (y70Var3 != null) {
            et0Var.k(null, mq0.t((Set) et0Var.getValue(), y70Var3));
        }
        c(y70Var, z);
    }

    public final void f(y70 y70Var) {
        y70Var.getClass();
        s80 s80Var = this.h;
        p90 b = s80Var.v.b(y70Var.e.d);
        if (!b.equals(this.g)) {
            Object obj = s80Var.w.get(b);
            if (obj != null) {
                ((a80) obj).f(y70Var);
                return;
            } else {
                g8.h("NavigatorBackStack for ", y70Var.e.d, " should already be created");
                return;
            }
        }
        mu muVar = s80Var.x;
        if (muVar != null) {
            muVar.c(y70Var);
            a(y70Var);
        } else {
            Log.i("NavController", "Ignoring add of destination " + y70Var.e + " outside of the call to navigate(). ");
        }
    }
}

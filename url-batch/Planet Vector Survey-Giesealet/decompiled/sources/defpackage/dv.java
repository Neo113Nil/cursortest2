package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class dv implements Iterator, j00 {
    public final /* synthetic */ int d;
    public int e;
    public Object f;
    public final Object g;

    public dv(d70 d70Var) {
        this.d = 1;
        this.g = d70Var;
        this.e = -1;
        this.f = od0.p(new c70(d70Var, this, null));
    }

    public void a() {
        Object c;
        int i = this.e;
        dr drVar = (dr) this.g;
        if (i == -2) {
            c = ((bu) drVar.b).a();
        } else {
            mu muVar = drVar.c;
            Object obj = this.f;
            obj.getClass();
            c = muVar.c(obj);
        }
        this.f = c;
        this.e = c == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.d) {
            case 0:
                if (this.e < 0) {
                    a();
                }
                return this.e == 1;
            case 1:
                return ((jq0) this.f).hasNext();
            default:
                return this.e < ((Map) this.g).size();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = null;
        switch (this.d) {
            case 0:
                if (this.e < 0) {
                    a();
                }
                if (this.e == 0) {
                    g8.k();
                    return null;
                }
                Object obj2 = this.f;
                obj2.getClass();
                this.e = -1;
                return obj2;
            case 1:
                return ((jq0) this.f).next();
            default:
                if (hasNext()) {
                    obj = this.f;
                    this.e++;
                    Object obj3 = ((Map) this.g).get(obj);
                    if (obj3 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                    }
                    this.f = ((h30) obj3).b;
                } else {
                    g8.k();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i = this.e;
                if (i != -1) {
                    ((d70) this.g).e.l(i);
                    this.e = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public dv(dr drVar) {
        this.d = 0;
        this.g = drVar;
        this.e = -2;
    }

    public dv(Object obj, Map map) {
        this.d = 2;
        this.f = obj;
        this.g = map;
    }
}

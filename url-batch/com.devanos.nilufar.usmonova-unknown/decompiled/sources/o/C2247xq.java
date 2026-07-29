package o;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: o.xq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2247xq implements Iterator, InterfaceC1594nw {
    public final /* synthetic */ int h;
    public int i;
    public Object j;
    public final Object k;

    public C2247xq(Object obj, Map map) {
        this.h = 2;
        this.j = obj;
        this.k = map;
    }

    public void a() {
        Object invoke;
        C0987eh c0987eh = (C0987eh) this.k;
        if (this.i == -2) {
            invoke = ((InterfaceC1455lp) c0987eh.b).invoke();
        } else {
            InterfaceC2114vp interfaceC2114vp = (InterfaceC2114vp) c0987eh.c;
            Object obj = this.j;
            AbstractC0048Bt.k(obj);
            invoke = interfaceC2114vp.invoke(obj);
        }
        this.j = invoke;
        this.i = invoke == null ? 0 : 1;
    }

    public void b() {
        Iterator it = (Iterator) this.k;
        if (it.hasNext()) {
            Object next = it.next();
            InterfaceC1118gg interfaceC1118gg = (InterfaceC1118gg) next;
            AbstractC0048Bt.n(interfaceC1118gg, "it");
            if (interfaceC1118gg instanceof InterfaceC2072v9) {
                this.i = 1;
                this.j = next;
                return;
            }
        }
        this.i = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.h) {
            case 0:
                if (this.i < 0) {
                    a();
                }
                return this.i == 1;
            case 1:
                return ((OQ) this.j).hasNext();
            case 2:
                return this.i < ((Map) this.k).size();
            default:
                if (this.i == -1) {
                    b();
                }
                return this.i == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.h) {
            case 0:
                if (this.i < 0) {
                    a();
                }
                if (this.i == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.j;
                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.i = -1;
                return obj;
            case 1:
                return ((OQ) this.j).next();
            case 2:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.j;
                this.i++;
                Object obj3 = ((Map) this.k).get(obj2);
                if (obj3 != null) {
                    this.j = ((C0758bA) obj3).b;
                    return obj2;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
            default:
                if (this.i == -1) {
                    b();
                }
                if (this.i == 0) {
                    throw new NoSuchElementException();
                }
                Object obj4 = this.j;
                this.j = null;
                this.i = -1;
                return obj4;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i = this.i;
                if (i != -1) {
                    ((QD) this.k).k(i);
                    this.i = -1;
                    return;
                }
                return;
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2247xq(T6 t6) {
        this.h = 3;
        this.k = ((NQ) t6.b).iterator();
        this.i = -1;
    }

    public C2247xq(C0987eh c0987eh) {
        this.h = 0;
        this.k = c0987eh;
        this.i = -2;
    }

    public C2247xq(QD qd) {
        this.h = 1;
        this.k = qd;
        this.i = -1;
        this.j = PO.i(new OD(qd, this, null));
    }
}

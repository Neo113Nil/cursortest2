package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.Zl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0663Zl implements Iterator, InterfaceC1594nw {
    public final /* synthetic */ int h;
    public final Iterator i;
    public int j;
    public Object k;
    public final /* synthetic */ NQ l;

    public C0663Zl(C0730am c0730am) {
        this.h = 0;
        this.l = c0730am;
        this.i = c0730am.a.iterator();
        this.j = -1;
    }

    public void a() {
        Object next;
        C0730am c0730am = (C0730am) this.l;
        do {
            Iterator it = this.i;
            if (!it.hasNext()) {
                this.j = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) c0730am.c.invoke(next)).booleanValue() != c0730am.b);
        this.k = next;
        this.j = 1;
    }

    public boolean b() {
        Iterator it;
        Iterator it2 = (Iterator) this.k;
        if (it2 != null && it2.hasNext()) {
            this.j = 1;
            return true;
        }
        do {
            Iterator it3 = this.i;
            if (!it3.hasNext()) {
                this.j = 2;
                this.k = null;
                return false;
            }
            Object next = it3.next();
            C1716pm c1716pm = (C1716pm) this.l;
            it = (Iterator) c1716pm.c.invoke(c1716pm.b.invoke(next));
        } while (!it.hasNext());
        this.k = it;
        this.j = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.h) {
            case 0:
                if (this.j == -1) {
                    a();
                }
                return this.j == 1;
            default:
                int i = this.j;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return b();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.h) {
            case 0:
                if (this.j == -1) {
                    a();
                }
                if (this.j == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.k;
                this.k = null;
                this.j = -1;
                return obj;
            default:
                int i = this.j;
                if (i == 2) {
                    throw new NoSuchElementException();
                }
                if (i == 0 && !b()) {
                    throw new NoSuchElementException();
                }
                this.j = 0;
                Iterator it = (Iterator) this.k;
                AbstractC0048Bt.k(it);
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0663Zl(C1716pm c1716pm) {
        this.h = 1;
        this.l = c1716pm;
        this.i = c1716pm.a.iterator();
    }
}

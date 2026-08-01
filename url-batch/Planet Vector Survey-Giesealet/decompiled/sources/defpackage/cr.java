package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class cr implements Iterator, j00 {
    public final Iterator e;
    public Object g;
    public final /* synthetic */ iq0 h;
    public final /* synthetic */ int d = 0;
    public int f = -1;

    public cr(dr drVar) {
        this.h = drVar;
        this.e = new vw0((tu0) drVar.b);
    }

    public void a() {
        Object next;
        dr drVar = (dr) this.h;
        do {
            Iterator it = this.e;
            if (!it.hasNext()) {
                this.f = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ((tn0) drVar.c).c(next)).booleanValue());
        this.g = next;
        this.f = 1;
    }

    public void b() {
        Iterator it = this.e;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((tu0) this.h).c.c(next)).booleanValue()) {
                this.f = 1;
                this.g = next;
                return;
            }
        }
        this.f = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.d) {
            case 0:
                if (this.f == -1) {
                    a();
                }
                if (this.f == 1) {
                }
                break;
            default:
                if (this.f == -1) {
                    b();
                }
                if (this.f == 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case 0:
                if (this.f == -1) {
                    a();
                }
                if (this.f == 0) {
                    g8.k();
                    break;
                } else {
                    Object obj = this.g;
                    this.g = null;
                    this.f = -1;
                    break;
                }
            default:
                if (this.f == -1) {
                    b();
                }
                if (this.f == 0) {
                    g8.k();
                    break;
                } else {
                    Object obj2 = this.g;
                    this.g = null;
                    this.f = -1;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public cr(tu0 tu0Var) {
        this.h = tu0Var;
        this.e = tu0Var.b.iterator();
    }
}

package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class xk0 implements ListIterator, j00 {
    public final /* synthetic */ int d = 1;
    public final Object e;
    public final /* synthetic */ Object f;

    public xk0(yk0 yk0Var, int i) {
        this.f = yk0Var;
        List list = yk0Var.d;
        if (i >= 0 && i <= yk0Var.a()) {
            this.e = list.listIterator(yk0Var.a() - i);
            return;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new ez(0, yk0Var.a(), 1) + "].");
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasPrevious();
            default:
                return ((ej0) obj).d < ((vt0) this.f).g - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasNext();
            default:
                return ((ej0) obj).d >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                return ((ListIterator) obj).previous();
            default:
                ej0 ej0Var = (ej0) obj;
                int i2 = ej0Var.d + 1;
                vt0 vt0Var = (vt0) this.f;
                px0.f(i2, vt0Var.g);
                ej0Var.d = i2;
                return vt0Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                yk0 yk0Var = (yk0) this.f;
                return (yk0Var.size() - 1) - ((ListIterator) obj).previousIndex();
            default:
                return ((ej0) obj).d + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                return ((ListIterator) obj).next();
            default:
                ej0 ej0Var = (ej0) obj;
                int i2 = ej0Var.d;
                vt0 vt0Var = (vt0) this.f;
                px0.f(i2, vt0Var.g);
                ej0Var.d = i2 - 1;
                return vt0Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                yk0 yk0Var = (yk0) this.f;
                return (yk0Var.size() - 1) - ((ListIterator) obj).nextIndex();
            default:
                return ((ej0) obj).d;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public xk0(ej0 ej0Var, vt0 vt0Var) {
        this.e = ej0Var;
        this.f = vt0Var;
    }
}

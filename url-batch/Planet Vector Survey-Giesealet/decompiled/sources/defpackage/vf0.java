package defpackage;

import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class vf0 extends s {
    public final tf0 f;
    public int g;
    public jx0 h;
    public int i;

    public vf0(tf0 tf0Var, int i) {
        super(i, tf0Var.k);
        this.f = tf0Var;
        this.g = tf0Var.e();
        this.i = -1;
        b();
    }

    public final void a() {
        if (this.g != this.f.e()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // defpackage.s, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.d;
        tf0 tf0Var = this.f;
        tf0Var.add(i, obj);
        this.d++;
        this.e = tf0Var.a();
        this.g = tf0Var.e();
        this.i = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        tf0 tf0Var = this.f;
        Object[] objArr = tf0Var.i;
        if (objArr == null) {
            this.h = null;
            return;
        }
        int i = (tf0Var.k - 1) & (-32);
        int i2 = this.d;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (tf0Var.g / 5) + 1;
        jx0 jx0Var = this.h;
        if (jx0Var == null) {
            this.h = new jx0(objArr, i2, i, i3);
            return;
        }
        jx0Var.d = i2;
        jx0Var.e = i;
        jx0Var.f = i3;
        if (jx0Var.g.length < i3) {
            jx0Var.g = new Object[i3];
        }
        jx0Var.g[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        jx0Var.h = r0;
        jx0Var.b(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            g8.k();
            return null;
        }
        int i = this.d;
        this.i = i;
        jx0 jx0Var = this.h;
        tf0 tf0Var = this.f;
        if (jx0Var == null) {
            Object[] objArr = tf0Var.j;
            this.d = i + 1;
            return objArr[i];
        }
        if (jx0Var.hasNext()) {
            this.d++;
            return jx0Var.next();
        }
        Object[] objArr2 = tf0Var.j;
        int i2 = this.d;
        this.d = i2 + 1;
        return objArr2[i2 - jx0Var.e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            g8.k();
            return null;
        }
        int i = this.d;
        this.i = i - 1;
        jx0 jx0Var = this.h;
        tf0 tf0Var = this.f;
        if (jx0Var == null) {
            Object[] objArr = tf0Var.j;
            int i2 = i - 1;
            this.d = i2;
            return objArr[i2];
        }
        int i3 = jx0Var.e;
        if (i <= i3) {
            this.d = i - 1;
            return jx0Var.previous();
        }
        Object[] objArr2 = tf0Var.j;
        int i4 = i - 1;
        this.d = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.s, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.i;
        if (i == -1) {
            throw new IllegalStateException();
        }
        tf0 tf0Var = this.f;
        tf0Var.b(i);
        int i2 = this.i;
        if (i2 < this.d) {
            this.d = i2;
        }
        this.e = tf0Var.a();
        this.g = tf0Var.e();
        this.i = -1;
        b();
    }

    @Override // defpackage.s, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.i;
        if (i == -1) {
            throw new IllegalStateException();
        }
        tf0 tf0Var = this.f;
        tf0Var.set(i, obj);
        this.g = tf0Var.e();
        b();
    }
}

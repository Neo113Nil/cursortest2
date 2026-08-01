package defpackage;

import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class r40 {
    public int d;
    public int e;
    public int f;
    public Object g;

    public r40() {
        if (pg0.e == null) {
            pg0.e = new pg0(18);
        }
    }

    public int a(int i) {
        if (i < this.f) {
            return ((ByteBuffer) this.g).getShort(this.e + i);
        }
        return 0;
    }

    public void b() {
        if (((s40) this.g).k != this.f) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        while (true) {
            int i = this.d;
            s40 s40Var = (s40) this.g;
            if (i >= s40Var.i || s40Var.f[i] >= 0) {
                return;
            } else {
                this.d = i + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.d < ((s40) this.g).i;
    }

    public void remove() {
        s40 s40Var = (s40) this.g;
        b();
        if (this.e == -1) {
            g8.s("Call next() before removing element from the iterator.");
            return;
        }
        s40Var.b();
        s40Var.j(this.e);
        this.e = -1;
        this.f = s40Var.k;
    }
}

package yads;

/* loaded from: classes4.dex */
public final class pm1 extends im1 {
    public pm1(Object obj) {
        super(obj, -1, -1, -1L, -1);
    }

    public final pm1 a(Object obj) {
        return new pm1(this.a.equals(obj) ? this : new im1(obj, this.b, this.c, this.d, this.e));
    }

    public pm1(Object obj, long j) {
        super(obj, -1, -1, j, -1);
    }

    public pm1(Object obj, long j, int i) {
        super(obj, -1, -1, j, i);
    }

    public pm1(Object obj, int i, int i2, long j) {
        super(obj, i, i2, j, -1);
    }

    public pm1(im1 im1Var) {
        super(im1Var);
    }
}

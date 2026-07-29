package o;

/* loaded from: classes.dex */
public class BA extends UZ {
    public static final C0666Zo c = new C0666Zo(2);
    public final PS b = new PS(0);

    @Override // o.UZ
    public final void d() {
        PS ps = this.b;
        int i = ps.j;
        if (i > 0) {
            ps.i[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = ps.i;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        ps.j = 0;
    }
}

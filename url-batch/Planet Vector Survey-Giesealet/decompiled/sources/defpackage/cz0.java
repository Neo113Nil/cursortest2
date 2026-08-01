package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class cz0 extends v00 implements mu {
    public static final cz0 f;
    public static final cz0 g;
    public static final cz0 h;
    public static final cz0 i;
    public static final cz0 j;
    public static final cz0 k;
    public static final cz0 l;
    public static final cz0 m;
    public static final cz0 n;
    public static final cz0 o;
    public static final cz0 p;
    public static final cz0 q;
    public static final cz0 r;
    public static final cz0 s;
    public static final cz0 t;
    public final /* synthetic */ int e;

    static {
        int i2 = 1;
        f = new cz0(i2, 0);
        g = new cz0(i2, 1);
        h = new cz0(i2, 2);
        i = new cz0(i2, 3);
        j = new cz0(i2, 4);
        k = new cz0(i2, 5);
        l = new cz0(i2, 6);
        m = new cz0(i2, 7);
        n = new cz0(i2, 8);
        o = new cz0(i2, 9);
        p = new cz0(i2, 10);
        q = new cz0(i2, 11);
        r = new cz0(i2, 12);
        s = new cz0(i2, 13);
        t = new cz0(i2, 14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz0(int i2) {
        super(1);
        this.e = 17;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        switch (this.e) {
            case 0:
                return new jn(((e7) obj).a);
            case 1:
                return new e7(((Number) obj).floatValue());
            case 2:
                return Float.valueOf(((e7) obj).a);
            case 3:
                long j2 = ((bz) obj).a;
                return new f7((int) (j2 >> 32), (int) (j2 & 4294967295L));
            case 4:
                f7 f7Var = (f7) obj;
                return new bz(nz.e(Math.round(f7Var.a), Math.round(f7Var.b)));
            case 5:
                long j3 = ((iz) obj).a;
                return new f7((int) (j3 >> 32), (int) (j3 & 4294967295L));
            case 6:
                f7 f7Var2 = (f7) obj;
                int round = Math.round(f7Var2.a);
                if (round < 0) {
                    round = 0;
                }
                int round2 = Math.round(f7Var2.b);
                return new iz(px0.c(round, round2 >= 0 ? round2 : 0));
            case 7:
                return new e7(((Number) obj).intValue());
            case 8:
                return Integer.valueOf((int) ((e7) obj).a);
            case 9:
                long j4 = ((ra0) obj).a;
                return new f7(ra0.d(j4), ra0.e(j4));
            case 10:
                f7 f7Var3 = (f7) obj;
                return new ra0(mz.o(f7Var3.a, f7Var3.b));
            case 11:
                zi0 zi0Var = (zi0) obj;
                return new h7(zi0Var.a, zi0Var.b, zi0Var.c, zi0Var.d);
            case 12:
                h7 h7Var = (h7) obj;
                return new zi0(h7Var.a, h7Var.b, h7Var.c, h7Var.d);
            case 13:
                long j5 = ((fr0) obj).a;
                return new f7(fr0.e(j5), fr0.c(j5));
            case 14:
                f7 f7Var4 = (f7) obj;
                return new fr0(rg0.a(f7Var4.a, f7Var4.b));
            case 15:
                return Boolean.valueOf(((ts) obj).n0());
            case 16:
                return Boolean.valueOf(((ts) obj).n0());
            case 17:
                return Boolean.valueOf(((ts) obj).n0());
            case 18:
                np0 np0Var = (np0) obj;
                n00[] n00VarArr = xp0.a;
                np0Var.d(vp0.a, px0.H("Back"));
                xp0.a(np0Var, 5);
                return ky0.a;
            default:
                m80 m80Var = ((y70) ((p6) obj).c()).e;
                m80Var.getClass();
                int i2 = m80.l;
                for (m80 m80Var2 : kq0.z((qg) m80Var, j80.f)) {
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cz0(int i2, int i3) {
        super(i2);
        this.e = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cz0(bs bsVar, int i2) {
        super(1);
        this.e = i2;
    }
}

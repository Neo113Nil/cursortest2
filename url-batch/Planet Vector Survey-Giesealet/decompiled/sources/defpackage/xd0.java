package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class xd0 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        gw0[] gw0VarArr = fw0.b;
        a = fw0.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0024, code lost:
    
        if (r1 == r18.a) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final wd0 a(wd0 wd0Var, int i, int i2, long j, mv0 mv0Var, lg0 lg0Var, z20 z20Var, int i3, int i4, wv0 wv0Var) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        mv0 mv0Var2 = mv0Var;
        lg0 lg0Var2 = lg0Var;
        z20 z20Var2 = z20Var;
        int i7 = i3;
        int i8 = i4;
        wv0 wv0Var2 = wv0Var;
        if (i5 == Integer.MIN_VALUE) {
            j2 = 0;
        } else {
            j2 = 0;
        }
        gw0[] gw0VarArr = fw0.b;
        if (((j3 & 1095216660480L) == j2 || fw0.a(j3, wd0Var.c)) && ((mv0Var2 == null || mv0Var2.equals(wd0Var.d)) && ((i6 == Integer.MIN_VALUE || i6 == wd0Var.b) && ((lg0Var2 == null || lg0Var2.equals(wd0Var.e)) && ((z20Var2 == null || z20Var2.equals(wd0Var.f)) && ((i7 == 0 || i7 == wd0Var.g) && ((i8 == Integer.MIN_VALUE || i8 == wd0Var.h) && (wv0Var2 == null || wv0Var2.equals(wd0Var.i))))))))) {
            return wd0Var;
        }
        gw0[] gw0VarArr2 = fw0.b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = wd0Var.c;
        }
        if (mv0Var2 == null) {
            mv0Var2 = wd0Var.d;
        }
        if (i5 == Integer.MIN_VALUE) {
            i5 = wd0Var.a;
        }
        if (i6 == Integer.MIN_VALUE) {
            i6 = wd0Var.b;
        }
        lg0 lg0Var3 = wd0Var.e;
        if (lg0Var3 != null && lg0Var2 == null) {
            lg0Var2 = lg0Var3;
        }
        if (z20Var2 == null) {
            z20Var2 = wd0Var.f;
        }
        if (i7 == 0) {
            i7 = wd0Var.g;
        }
        if (i8 == Integer.MIN_VALUE) {
            i8 = wd0Var.h;
        }
        if (wv0Var2 == null) {
            wv0Var2 = wd0Var.i;
        }
        return new wd0(i5, i6, j3, mv0Var2, lg0Var2, z20Var2, i7, i8, wv0Var2);
    }
}

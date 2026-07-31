package yads;

/* loaded from: classes15.dex */
public abstract class ba3 {
    public static long a(xb2 xb2Var, int i, int i2) {
        xb2Var.e(i);
        if (xb2Var.c - xb2Var.b < 5) {
            return -9223372036854775807L;
        }
        int a = xb2Var.a();
        if ((8388608 & a) != 0 || ((2096896 & a) >> 8) != i2 || (a & 32) == 0 || xb2Var.k() < 7 || xb2Var.c - xb2Var.b < 7 || (xb2Var.k() & 16) != 16) {
            return -9223372036854775807L;
        }
        xb2Var.a(new byte[6], 0, 6);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }
}

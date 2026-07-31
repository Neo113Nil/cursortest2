package yads;

/* loaded from: classes3.dex */
public abstract class e23 {
    public static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(up0 up0Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        boolean z6;
        long a2 = up0Var.a();
        long j = -1;
        int i2 = (a2 > (-1L) ? 1 : (a2 == (-1L) ? 0 : -1));
        long j2 = 4096;
        if (i2 != 0 && a2 <= 4096) {
            j2 = a2;
        }
        int i3 = (int) j2;
        xb2 xb2Var = new xb2(64);
        boolean z7 = false;
        int i4 = 0;
        boolean z8 = false;
        while (i4 < i3) {
            xb2Var.c(8);
            if (!up0Var.b(xb2Var.a, z7 ? 1 : 0, 8, true)) {
                break;
            }
            long l = xb2Var.l();
            int a3 = xb2Var.a();
            if (l == 1) {
                up0Var.a(xb2Var.a, 8, 8);
                xb2Var.d(16);
                i = 16;
                l = xb2Var.g();
            } else {
                if (l == 0) {
                    long a4 = up0Var.a();
                    if (a4 != j) {
                        l = (a4 - up0Var.e()) + 8;
                    }
                }
                i = 8;
            }
            long j3 = i;
            if (l < j3) {
                return z7;
            }
            i4 += i;
            if (a3 == 1836019574) {
                i3 += (int) l;
                if (i2 != 0 && i3 > a2) {
                    i3 = (int) a2;
                }
            } else {
                if (a3 == 1836019558 || a3 == 1836475768) {
                    z3 = z7 ? 1 : 0;
                    z4 = true;
                    z5 = true;
                    break;
                }
                int i5 = i2;
                if ((i4 + l) - j3 >= i3) {
                    z3 = false;
                    z4 = true;
                    break;
                }
                int i6 = (int) (l - j3);
                i4 += i6;
                if (a3 != 1718909296) {
                    z6 = false;
                    z8 = z8;
                    if (i6 != 0) {
                        up0Var.b(i6);
                        z8 = z8;
                    }
                } else {
                    if (i6 < 8) {
                        return false;
                    }
                    xb2Var.c(i6);
                    up0Var.a(xb2Var.a, 0, i6);
                    int i7 = i6 / 4;
                    for (int i8 = 0; i8 < i7; i8++) {
                        if (i8 != 1) {
                            int a5 = xb2Var.a();
                            if ((a5 >>> 8) != 3368816 && (a5 != 1751476579 || !z2)) {
                                int[] iArr = a;
                                for (int i9 = 0; i9 < 29; i9++) {
                                    if (iArr[i9] != a5) {
                                    }
                                }
                            }
                            z8 = true;
                            break;
                        }
                        xb2Var.e(xb2Var.b + 4);
                    }
                    z6 = false;
                    z8 = z8;
                    if (!z8) {
                        return false;
                    }
                }
                z7 = z6;
                i2 = i5;
            }
            j = -1;
            z8 = z8;
        }
        z3 = z7 ? 1 : 0;
        z4 = true;
        z5 = z3;
        return (z8 && z == z5) ? z4 : z3;
    }
}

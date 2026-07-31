package yads;

/* loaded from: classes3.dex */
public abstract class qt {
    public static void a(long j, xb2 xb2Var, c83[] c83VarArr) {
        int i;
        while (true) {
            if (xb2Var.c - xb2Var.b <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (xb2Var.c - xb2Var.b == 0) {
                    i = -1;
                    break;
                }
                int k = xb2Var.k();
                i2 += k;
                if (k != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            while (true) {
                if (xb2Var.c - xb2Var.b == 0) {
                    i3 = -1;
                    break;
                }
                int k2 = xb2Var.k();
                i3 += k2;
                if (k2 != 255) {
                    break;
                }
            }
            int i4 = xb2Var.b;
            int i5 = i4 + i3;
            if (i3 == -1 || i3 > xb2Var.c - i4) {
                gh1.d("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i5 = xb2Var.c;
            } else if (i == 4 && i3 >= 8) {
                int k3 = xb2Var.k();
                int p = xb2Var.p();
                int a = p == 49 ? xb2Var.a() : 0;
                int k4 = xb2Var.k();
                if (p == 47) {
                    xb2Var.e(xb2Var.b + 1);
                }
                boolean z = k3 == 181 && (p == 49 || p == 47) && k4 == 3;
                if (p == 49) {
                    z &= a == 1195456820;
                }
                if (z) {
                    b(j, xb2Var, c83VarArr);
                }
            }
            xb2Var.e(i5);
        }
    }

    public static void b(long j, xb2 xb2Var, c83[] c83VarArr) {
        int k = xb2Var.k();
        if ((k & 64) != 0) {
            xb2Var.e(xb2Var.b + 1);
            int i = (k & 31) * 3;
            int i2 = xb2Var.b;
            for (c83 c83Var : c83VarArr) {
                xb2Var.e(i2);
                c83Var.a(i, xb2Var);
                if (j != -9223372036854775807L) {
                    c83Var.a(j, 1, i, 0, null);
                }
            }
        }
    }
}

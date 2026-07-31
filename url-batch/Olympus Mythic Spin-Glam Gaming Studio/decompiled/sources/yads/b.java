package yads;

/* loaded from: classes4.dex */
public abstract class b {
    public static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static a a(wb2 wb2Var, boolean z) {
        int i;
        int i2;
        int a2 = wb2Var.a(5);
        if (a2 == 31) {
            a2 = wb2Var.a(6) + 32;
        }
        int a3 = wb2Var.a(4);
        if (a3 == 15) {
            i = wb2Var.a(24);
        } else {
            if (a3 >= 13) {
                throw new cc2(null, null, true, 1);
            }
            i = a[a3];
        }
        int a4 = wb2Var.a(4);
        String a5 = gg2.a(a2, "mp4a.40.");
        if (a2 == 5 || a2 == 29) {
            int a6 = wb2Var.a(4);
            if (a6 == 15) {
                i2 = wb2Var.a(24);
            } else {
                if (a6 >= 13) {
                    throw new cc2(null, null, true, 1);
                }
                i2 = a[a6];
            }
            i = i2;
            int a7 = wb2Var.a(5);
            if (a7 == 31) {
                a7 = wb2Var.a(6) + 32;
            }
            a2 = a7;
            if (a2 == 22) {
                a4 = wb2Var.a(4);
            }
        }
        if (z) {
            if (a2 != 6 && a2 != 7 && a2 != 17 && a2 != 1 && a2 != 2 && a2 != 3 && a2 != 4) {
                switch (a2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw cc2.a("Unsupported audio object type: " + a2);
                }
            }
            if (wb2Var.e()) {
                gh1.d("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (wb2Var.e()) {
                wb2Var.c(14);
            }
            boolean e = wb2Var.e();
            if (a4 == 0) {
                throw new UnsupportedOperationException();
            }
            if (a2 == 6 || a2 == 20) {
                wb2Var.c(3);
            }
            if (e) {
                if (a2 == 22) {
                    wb2Var.c(16);
                }
                if (a2 == 17 || a2 == 19 || a2 == 20 || a2 == 23) {
                    wb2Var.c(3);
                }
                wb2Var.c(1);
            }
            switch (a2) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int a8 = wb2Var.a(2);
                    if (a8 == 2 || a8 == 3) {
                        throw cc2.a("Unsupported epConfig: " + a8);
                    }
            }
        }
        int i3 = b[a4];
        if (i3 != -1) {
            return new a(i, i3, a5);
        }
        throw new cc2(null, null, true, 1);
    }
}

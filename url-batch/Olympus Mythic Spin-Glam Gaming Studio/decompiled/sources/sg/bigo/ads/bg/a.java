package sg.bigo.ads.bg;

import sg.bigo.ads.common.utils.r;

/* loaded from: classes14.dex */
public final class a {
    private static final int[] a = {1, 3, 4, 2, 7, 9, 10};
    private static final int[] b = {2, 7, 9, 10};

    /* JADX WARN: Removed duplicated region for block: B:17:0x007e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        if (b.d() != 1) {
            return true;
        }
        String b2 = b.b();
        if (!r.a((CharSequence) b2)) {
            if (b2.length() >= 11) {
                for (int i : a) {
                    if (b2.charAt(i - 1) != '0') {
                    }
                }
            }
            z3 = false;
            if (!z) {
                String e = b.e();
                if (!r.a((CharSequence) e)) {
                    if (e.length() >= 11) {
                        for (int i2 : b) {
                            if (e.charAt(i2 - 1) != '0') {
                            }
                        }
                    }
                    z4 = false;
                    if (z2) {
                        String c = b.c();
                        if (!r.a((CharSequence) c) && c.length() >= 1488 && c.charAt(1487) == '0') {
                            z5 = false;
                            return !z3 && z4 && z5;
                        }
                    }
                    z5 = true;
                    if (z3) {
                    }
                }
            }
            z4 = true;
            if (z2) {
            }
            z5 = true;
            if (z3) {
            }
        }
        z3 = true;
        if (!z) {
        }
        z4 = true;
        if (z2) {
        }
        z5 = true;
        if (z3) {
        }
    }
}

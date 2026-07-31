package yads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class dn3 {
    public static boolean a(int i, xb2 xb2Var, boolean z) {
        if (xb2Var.c - xb2Var.b < 7) {
            if (z) {
                return false;
            }
            throw new cc2("too short header: " + (xb2Var.c - xb2Var.b), null, true, 1);
        }
        if (xb2Var.k() != i) {
            if (z) {
                return false;
            }
            throw new cc2("expected header type " + Integer.toHexString(i), null, true, 1);
        }
        if (xb2Var.k() == 118 && xb2Var.k() == 111 && xb2Var.k() == 114 && xb2Var.k() == 98 && xb2Var.k() == 105 && xb2Var.k() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw new cc2("expected characters 'vorbis'", null, true, 1);
    }

    public static cn3 a(xb2 xb2Var) {
        a(1, xb2Var, false);
        int c = xb2Var.c();
        if (c >= 0) {
            int k = xb2Var.k();
            int c2 = xb2Var.c();
            if (c2 >= 0) {
                int c3 = xb2Var.c();
                int i = c3 <= 0 ? -1 : c3;
                int c4 = xb2Var.c();
                int i2 = c4 <= 0 ? -1 : c4;
                xb2Var.c();
                int k2 = xb2Var.k();
                int pow = (int) Math.pow(2.0d, k2 & 15);
                int pow2 = (int) Math.pow(2.0d, (k2 & 240) >> 4);
                xb2Var.k();
                return new cn3(k, c2, i, i2, pow, pow2, Arrays.copyOf(xb2Var.a, xb2Var.c));
            }
            throw new IllegalStateException(gg2.a(c2, "Top bit not zero: "));
        }
        throw new IllegalStateException(gg2.a(c, "Top bit not zero: "));
    }

    public static an3 a(xb2 xb2Var, boolean z, boolean z2) {
        if (z) {
            a(3, xb2Var, false);
        }
        xb2Var.a((int) xb2Var.e(), zt.c);
        long e = xb2Var.e();
        String[] strArr = new String[(int) e];
        for (int i = 0; i < e; i++) {
            strArr[i] = xb2Var.a((int) xb2Var.e(), zt.c);
        }
        if (z2 && (xb2Var.k() & 1) == 0) {
            throw new cc2("framing bit expected to be set", null, true, 1);
        }
        return new an3(strArr);
    }

    public static ht1 a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = sb3.a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                gh1.d("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    xb2 xb2Var = new xb2(Base64.decode(split[1], 0));
                    int a = xb2Var.a();
                    String a2 = xb2Var.a(xb2Var.a(), zt.a);
                    String a3 = xb2Var.a(xb2Var.a(), zt.c);
                    int a4 = xb2Var.a();
                    int a5 = xb2Var.a();
                    int a6 = xb2Var.a();
                    int a7 = xb2Var.a();
                    int a8 = xb2Var.a();
                    byte[] bArr = new byte[a8];
                    xb2Var.a(bArr, 0, a8);
                    arrayList.add(new md2(a, a2, a3, a4, a5, a6, a7, bArr));
                } catch (RuntimeException e) {
                    gh1.d("VorbisUtil", gh1.a("Failed to parse vorbis picture", e));
                }
            } else {
                arrayList.add(new wm3(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ht1(arrayList);
    }
}

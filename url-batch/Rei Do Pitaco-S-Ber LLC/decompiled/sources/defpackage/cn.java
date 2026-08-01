package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class cn {
    public static final r8 a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;

    static {
        r8 r8Var = r8.i;
        a = tg.l("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        c = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            binaryString.getClass();
            String replace = z60.f("%8s", binaryString).replace(' ', '0');
            replace.getClass();
            strArr[i] = replace;
        }
        d = strArr;
        String[] strArr2 = c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = strArr2[i2] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = c;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            strArr3[i6 | 8] = strArr3[i5] + '|' + strArr3[i4] + "|PADDED";
        }
        int length = c.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = c;
            if (strArr4[i7] == null) {
                strArr4[i7] = d[i7];
            }
        }
    }

    public static String a(boolean z, int i, int i2, int i3, int i4) {
        String str;
        String str2;
        String[] strArr = b;
        String f = i3 < strArr.length ? strArr[i3] : z60.f("0x%02x", Integer.valueOf(i3));
        if (i4 == 0) {
            str = "";
        } else {
            String[] strArr2 = d;
            if (i3 != 2 && i3 != 3) {
                if (i3 == 4 || i3 == 6) {
                    str = i4 == 1 ? "ACK" : strArr2[i4];
                } else if (i3 != 7 && i3 != 8) {
                    String[] strArr3 = c;
                    if (i4 < strArr3.length) {
                        str2 = strArr3[i4];
                        str2.getClass();
                    } else {
                        str2 = strArr2[i4];
                    }
                    str = (i3 != 5 || (i4 & 4) == 0) ? (i3 != 0 || (i4 & 32) == 0) ? str2 : u30.j0(str2, "PRIORITY", "COMPRESSED") : u30.j0(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr2[i4];
        }
        return z60.f("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), f, str);
    }
}

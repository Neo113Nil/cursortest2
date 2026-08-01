package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class u30 extends t30 {
    public static boolean h0(String str, String str2) {
        str.getClass();
        return str.endsWith(str2);
    }

    public static boolean i0(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static String j0(String str, String str2, String str3) {
        str.getClass();
        int o0 = m30.o0(str, str2, 0, false);
        if (o0 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, o0);
            sb.append(str3);
            i2 = o0 + length;
            if (o0 >= str.length()) {
                break;
            }
            o0 = m30.o0(str, str2, o0 + i, false);
        } while (o0 > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }

    public static boolean k0(String str, String str2, int i, boolean z) {
        str.getClass();
        if (!z) {
            return str.startsWith(str2, i);
        }
        int length = str2.length();
        return !z ? str.regionMatches(i, str2, 0, length) : str.regionMatches(z, i, str2, 0, length);
    }

    public static boolean l0(String str, String str2, boolean z) {
        str.getClass();
        if (!z) {
            return str.startsWith(str2);
        }
        int length = str2.length();
        return !z ? str.regionMatches(0, str2, 0, length) : str.regionMatches(z, 0, str2, 0, length);
    }
}

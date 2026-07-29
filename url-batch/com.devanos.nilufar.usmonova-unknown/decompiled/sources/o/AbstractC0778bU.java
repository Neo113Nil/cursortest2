package o;

/* renamed from: o.bU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0778bU extends AbstractC0712aU {
    public static boolean A(int i, String str, String str2, boolean z) {
        AbstractC0048Bt.n(str, "<this>");
        return !z ? str.startsWith(str2, i) : x(i, 0, str2.length(), str, str2, z);
    }

    public static boolean B(String str, String str2, boolean z) {
        AbstractC0048Bt.n(str, "<this>");
        AbstractC0048Bt.n(str2, "prefix");
        return !z ? str.startsWith(str2) : x(0, 0, str2.length(), str, str2, z);
    }

    public static Integer C(String str) {
        boolean z;
        int i;
        int i2;
        AbstractC0868ct.k(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        int i4 = -2147483647;
        if (AbstractC0048Bt.t(charAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i4 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i = 0;
        }
        int i5 = -59652323;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if ((i3 < i5 && (i5 != -59652323 || i3 < (i5 = i4 / 10))) || (i2 = i3 * 10) < i4 + digit) {
                return null;
            }
            i3 = i2 - digit;
            i++;
        }
        return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }

    public static boolean v(String str, String str2, boolean z) {
        AbstractC0048Bt.n(str, "<this>");
        return !z ? str.endsWith(str2) : x(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    public static boolean w(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final boolean x(int i, int i2, int i3, String str, String str2, boolean z) {
        AbstractC0048Bt.n(str, "<this>");
        AbstractC0048Bt.n(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static String y(String str, char c, char c2) {
        AbstractC0048Bt.n(str, "<this>");
        String replace = str.replace(c, c2);
        AbstractC0048Bt.m(replace, "replace(...)");
        return replace;
    }

    public static String z(String str, String str2, String str3) {
        AbstractC0048Bt.n(str, "<this>");
        int G = UT.G(str, str2, 0, false);
        if (G < 0) {
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
            sb.append((CharSequence) str, i2, G);
            sb.append(str3);
            i2 = G + length;
            if (G >= str.length()) {
                break;
            }
            G = UT.G(str, str2, G + i, false);
        } while (G > 0);
        sb.append((CharSequence) str, i2, str.length());
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "toString(...)");
        return sb2;
    }
}

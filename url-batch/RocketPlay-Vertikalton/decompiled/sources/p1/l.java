package p1;

/* loaded from: classes.dex */
public abstract class l extends k {
    public static boolean E(String str, String str2) {
        i1.f.e(str, "<this>");
        i1.f.e(str2, "suffix");
        return str.endsWith(str2);
    }

    public static boolean F(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final boolean G(int i, int i2, int i3, String str, String str2, boolean z2) {
        i1.f.e(str, "<this>");
        i1.f.e(str2, "other");
        return !z2 ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z2, i, str2, i2, i3);
    }

    public static String H(String str, String str2, String str3) {
        i1.f.e(str, "<this>");
        int N2 = d.N(str, str2, 0, false);
        if (N2 < 0) {
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
            sb.append((CharSequence) str, i2, N2);
            sb.append(str3);
            i2 = N2 + length;
            if (N2 >= str.length()) {
                break;
            }
            N2 = d.N(str, str2, N2 + i, false);
        } while (N2 > 0);
        sb.append((CharSequence) str, i2, str.length());
        String sb2 = sb.toString();
        i1.f.d(sb2, "toString(...)");
        return sb2;
    }

    public static boolean I(String str, String str2, int i, boolean z2) {
        i1.f.e(str, "<this>");
        return !z2 ? str.startsWith(str2, i) : G(i, 0, str2.length(), str, str2, z2);
    }

    public static boolean J(String str, String str2, boolean z2) {
        i1.f.e(str, "<this>");
        i1.f.e(str2, "prefix");
        return !z2 ? str.startsWith(str2) : G(0, 0, str2.length(), str, str2, z2);
    }
}

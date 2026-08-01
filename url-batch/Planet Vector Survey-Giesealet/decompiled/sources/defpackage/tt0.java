package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class tt0 extends st0 {
    public static boolean t(StringBuilder sb, String str) {
        return u(sb, str, 0, false) >= 0;
    }

    public static final int u(CharSequence charSequence, String str, int i, boolean z) {
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        int i2 = i < 0 ? 0 : i;
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        ez ezVar = new ez(i2, length, 1);
        boolean z2 = charSequence instanceof String;
        int i3 = ezVar.e;
        if (z2) {
            if (i2 <= i3) {
                int i4 = i2;
                while (true) {
                    String str2 = (String) charSequence;
                    int length3 = str.length();
                    if (!(!z ? str.regionMatches(0, str2, i4, length3) : str.regionMatches(z, 0, str2, i4, length3))) {
                        if (i4 == i3) {
                            break;
                        }
                        i4++;
                    } else {
                        return i4;
                    }
                }
            }
        } else if (i2 <= i3) {
            int i5 = i2;
            while (!x(str, 0, charSequence, i5, str.length(), z)) {
                if (i5 != i3) {
                    i5++;
                }
            }
            return i5;
        }
        return -1;
    }

    public static int v(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (cArr[0] != charSequence.charAt(i)) {
            if (i == length) {
                return -1;
            }
            i++;
        }
        return i;
    }

    public static boolean w(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean x(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        int i4;
        char upperCase;
        char upperCase2;
        if (i2 >= 0 && i >= 0 && i <= charSequence.length() - i3 && i2 <= charSequence2.length() - i3) {
            for (0; i4 < i3; i4 + 1) {
                char charAt = charSequence.charAt(i + i4);
                char charAt2 = charSequence2.charAt(i2 + i4);
                i4 = (charAt == charAt2 || (z && ((upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(charAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) ? i4 + 1 : 0;
            }
            return true;
        }
        return false;
    }

    public static String y(String str, String str2, String str3) {
        int u = u(str, str2, 0, false);
        if (u < 0) {
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
            sb.append((CharSequence) str, i2, u);
            sb.append(str3);
            i2 = u + length;
            if (u >= str.length()) {
                break;
            }
            u = u(str, str2, u + i, false);
        } while (u > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }

    public static String z(String str, String str2) {
        int u = u(str, str2, 0, false);
        return u == -1 ? str : str.substring(str2.length() + u, str.length());
    }
}

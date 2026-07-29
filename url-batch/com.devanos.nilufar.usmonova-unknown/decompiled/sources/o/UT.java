package o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class UT extends AbstractC0778bU {
    public static boolean D(CharSequence charSequence, char c) {
        AbstractC0048Bt.n(charSequence, "<this>");
        return H(charSequence, c, 0, 2) >= 0;
    }

    public static boolean E(CharSequence charSequence, String str) {
        AbstractC0048Bt.n(charSequence, "<this>");
        AbstractC0048Bt.n(str, "other");
        return G(charSequence, str, 0, false) >= 0;
    }

    public static int F(CharSequence charSequence) {
        AbstractC0048Bt.n(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int G(CharSequence charSequence, String str, int i, boolean z) {
        AbstractC0048Bt.n(charSequence, "<this>");
        AbstractC0048Bt.n(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        C1197ht c1197ht = new C1197ht(i, length, 1);
        boolean z2 = charSequence instanceof String;
        int i2 = c1197ht.j;
        int i3 = c1197ht.i;
        int i4 = c1197ht.h;
        if (z2 && (str instanceof String)) {
            if ((i2 <= 0 || i4 > i3) && (i2 >= 0 || i3 > i4)) {
                return -1;
            }
            int i5 = i4;
            while (true) {
                String str2 = str;
                boolean z3 = z;
                if (AbstractC0778bU.x(0, i5, str.length(), str2, (String) charSequence, z3)) {
                    return i5;
                }
                if (i5 == i3) {
                    return -1;
                }
                i5 += i2;
                str = str2;
                z = z3;
            }
        } else {
            if ((i2 <= 0 || i4 > i3) && (i2 >= 0 || i3 > i4)) {
                return -1;
            }
            while (true) {
                int length3 = str.length();
                AbstractC0048Bt.n(str, "<this>");
                AbstractC0048Bt.n(charSequence, "other");
                boolean z4 = false;
                if (i4 >= 0 && str.length() - length3 >= 0 && i4 <= charSequence.length() - length3) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length3) {
                            z4 = true;
                            break;
                        }
                        if (!AbstractC0868ct.t(str.charAt(0 + i6), charSequence.charAt(i4 + i6), z)) {
                            break;
                        }
                        i6++;
                    }
                }
                if (z4) {
                    return i4;
                }
                if (i4 == i3) {
                    return -1;
                }
                i4 += i2;
            }
        }
    }

    public static int H(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        AbstractC0048Bt.n(charSequence, "<this>");
        return !(charSequence instanceof String) ? I(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static final int I(CharSequence charSequence, char[] cArr, int i, boolean z) {
        AbstractC0048Bt.n(charSequence, "<this>");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(P6.q0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int F = F(charSequence);
        if (i > F) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (AbstractC0868ct.t(c, charAt, z)) {
                    return i;
                }
            }
            if (i == F) {
                return -1;
            }
            i++;
        }
    }

    public static boolean J(CharSequence charSequence) {
        AbstractC0048Bt.n(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!AbstractC0868ct.G(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int K(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = F(str);
        }
        AbstractC0048Bt.n(str, "<this>");
        return str.lastIndexOf(c, i);
    }

    public static int L(String str, String str2) {
        int F = F(str);
        AbstractC0048Bt.n(str, "<this>");
        return str.lastIndexOf(str2, F);
    }

    public static String M(String str, String str2) {
        AbstractC0048Bt.n(str, "<this>");
        if (!AbstractC0778bU.B(str, str2, false)) {
            return str;
        }
        String substring = str.substring(str2.length());
        AbstractC0048Bt.m(substring, "substring(...)");
        return substring;
    }

    public static List N(String str, char[] cArr) {
        AbstractC0048Bt.n(str, "<this>");
        if (cArr.length != 1) {
            C0987eh<C1197ht> c0987eh = new C0987eh(str, new C1759qP(1, cArr));
            ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(new S6(2, c0987eh)));
            for (C1197ht c1197ht : c0987eh) {
                AbstractC0048Bt.n(c1197ht, "range");
                arrayList.add(str.subSequence(c1197ht.h, c1197ht.i + 1).toString());
            }
            return arrayList;
        }
        String valueOf = String.valueOf(cArr[0]);
        int G = G(str, valueOf, 0, false);
        if (G == -1) {
            return AbstractC0868ct.J(str.toString());
        }
        ArrayList arrayList2 = new ArrayList(10);
        int i = 0;
        do {
            arrayList2.add(str.subSequence(i, G).toString());
            i = valueOf.length() + G;
            G = G(str, valueOf, i, false);
        } while (G != -1);
        arrayList2.add(str.subSequence(i, str.length()).toString());
        return arrayList2;
    }

    public static String O(String str, String str2, String str3) {
        AbstractC0048Bt.n(str2, "delimiter");
        int G = G(str, str2, 0, false);
        if (G == -1) {
            return str3;
        }
        String substring = str.substring(str2.length() + G, str.length());
        AbstractC0048Bt.m(substring, "substring(...)");
        return substring;
    }

    public static String P(String str) {
        int H = H(str, '$', 0, 6);
        if (H == -1) {
            return str;
        }
        String substring = str.substring(H + 1, str.length());
        AbstractC0048Bt.m(substring, "substring(...)");
        return substring;
    }

    public static String Q(String str, char c, String str2) {
        AbstractC0048Bt.n(str, "<this>");
        AbstractC0048Bt.n(str2, "missingDelimiterValue");
        int K = K(str, c, 0, 6);
        if (K == -1) {
            return str2;
        }
        String substring = str.substring(K + 1, str.length());
        AbstractC0048Bt.m(substring, "substring(...)");
        return substring;
    }

    public static String R(String str, String str2) {
        AbstractC0048Bt.n(str, "<this>");
        AbstractC0048Bt.n(str, "missingDelimiterValue");
        int G = G(str, str2, 0, false);
        if (G == -1) {
            return str;
        }
        String substring = str.substring(0, G);
        AbstractC0048Bt.m(substring, "substring(...)");
        return substring;
    }

    public static String S(int i, String str) {
        AbstractC0048Bt.n(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1888sN.h(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String substring = str.substring(0, i);
        AbstractC0048Bt.m(substring, "substring(...)");
        return substring;
    }

    public static CharSequence T(String str) {
        AbstractC0048Bt.n(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean G = AbstractC0868ct.G(str.charAt(!z ? i : length));
            if (z) {
                if (!G) {
                    break;
                }
                length--;
            } else if (G) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }
}

package p1;

import E1.AbstractC0001b;
import a1.AbstractC0067d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class d extends l {
    public static boolean K(CharSequence charSequence, char c2) {
        i1.f.e(charSequence, "<this>");
        return P(charSequence, c2, 0, false, 2) >= 0;
    }

    public static boolean L(CharSequence charSequence, CharSequence charSequence2) {
        i1.f.e(charSequence, "<this>");
        if (charSequence2 instanceof String) {
            if (Q(charSequence, (String) charSequence2, 0, false, 2) < 0) {
                return false;
            }
        } else if (O(charSequence, charSequence2, 0, charSequence.length(), false, false) < 0) {
            return false;
        }
        return true;
    }

    public static final int M(CharSequence charSequence) {
        i1.f.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int N(CharSequence charSequence, String str, int i, boolean z2) {
        i1.f.e(charSequence, "<this>");
        i1.f.e(str, "string");
        return (z2 || !(charSequence instanceof String)) ? O(charSequence, str, i, charSequence.length(), z2, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int O(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z2, boolean z3) {
        m1.a aVar;
        if (z3) {
            int M2 = M(charSequence);
            if (i > M2) {
                i = M2;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            aVar = new m1.a(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            aVar = new m1.c(i, i2, 1);
        }
        boolean z4 = charSequence instanceof String;
        int i3 = aVar.f3559c;
        int i4 = aVar.f3558b;
        int i5 = aVar.f3557a;
        if (z4 && (charSequence2 instanceof String)) {
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (!l.G(0, i5, ((String) charSequence2).length(), (String) charSequence2, (String) charSequence, z2)) {
                    if (i5 != i4) {
                        i5 += i3;
                    }
                }
                return i5;
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            while (!U(charSequence2, 0, charSequence, i5, charSequence2.length(), z2)) {
                if (i5 != i4) {
                    i5 += i3;
                }
            }
            return i5;
        }
        return -1;
    }

    public static int P(CharSequence charSequence, char c2, int i, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        i1.f.e(charSequence, "<this>");
        return (z2 || !(charSequence instanceof String)) ? R(charSequence, new char[]{c2}, i, z2) : ((String) charSequence).indexOf(c2, i);
    }

    public static /* synthetic */ int Q(CharSequence charSequence, String str, int i, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return N(charSequence, str, i, z2);
    }

    public static final int R(CharSequence charSequence, char[] cArr, int i, boolean z2) {
        i1.f.e(charSequence, "<this>");
        if (!z2 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int M2 = M(charSequence);
        if (i > M2) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c2 : cArr) {
                if (AbstractC0067d.g(c2, charAt, z2)) {
                    return i;
                }
            }
            if (i == M2) {
                return -1;
            }
            i++;
        }
    }

    public static boolean S(String str) {
        i1.f.e(str, "<this>");
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static int T(String str, char c2, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = M(str);
        }
        i1.f.e(str, "<this>");
        return str.lastIndexOf(c2, i);
    }

    public static final boolean U(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z2) {
        i1.f.e(charSequence, "<this>");
        i1.f.e(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!AbstractC0067d.g(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z2)) {
                return false;
            }
        }
        return true;
    }

    public static String V(String str, String str2) {
        if (!l.J(str, str2, false)) {
            return str;
        }
        String substring = str.substring(str2.length());
        i1.f.d(substring, "substring(...)");
        return substring;
    }

    public static final void W(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0001b.f("Limit must be non-negative, but was ", i).toString());
        }
    }

    public static List X(String str, char[] cArr) {
        i1.f.e(str, "<this>");
        boolean z2 = false;
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            W(0);
            int N2 = N(str, valueOf, 0, false);
            if (N2 == -1) {
                return F1.l.T(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int i = 0;
            do {
                arrayList.add(str.subSequence(i, N2).toString());
                i = valueOf.length() + N2;
                N2 = N(str, valueOf, i, false);
            } while (N2 != -1);
            arrayList.add(str.subSequence(i, str.length()).toString());
            return arrayList;
        }
        W(0);
        o1.i iVar = new o1.i(new c(str, 0, 0, new m(cArr, z2, 0)));
        ArrayList arrayList2 = new ArrayList(W0.l.t0(iVar));
        Iterator it = iVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList2;
            }
            m1.c cVar = (m1.c) bVar.next();
            i1.f.e(cVar, "range");
            arrayList2.add(str.subSequence(cVar.f3557a, cVar.f3558b + 1).toString());
        }
    }

    public static String Y(String str) {
        i1.f.e(str, "<this>");
        i1.f.e(str, "missingDelimiterValue");
        int T2 = T(str, '.', 0, 6);
        if (T2 == -1) {
            return str;
        }
        String substring = str.substring(T2 + 1, str.length());
        i1.f.d(substring, "substring(...)");
        return substring;
    }

    public static String Z(String str, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String substring = str.substring(0, i);
        i1.f.d(substring, "substring(...)");
        return substring;
    }

    public static CharSequence a0(String str) {
        i1.f.e(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z2 = false;
        while (i <= length) {
            char charAt = str.charAt(!z2 ? i : length);
            boolean z3 = Character.isWhitespace(charAt) || Character.isSpaceChar(charAt);
            if (z2) {
                if (!z3) {
                    break;
                }
                length--;
            } else if (z3) {
                i++;
            } else {
                z2 = true;
            }
        }
        return str.subSequence(i, length + 1);
    }
}

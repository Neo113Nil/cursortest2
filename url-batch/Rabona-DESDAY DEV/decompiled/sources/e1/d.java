package e1;

import X.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class d extends l {
    public static boolean j0(CharSequence charSequence, char c2) {
        X0.d.e(charSequence, "<this>");
        return n0(charSequence, c2, 0, false, 2) >= 0;
    }

    public static boolean k0(CharSequence charSequence, String str) {
        X0.d.e(charSequence, "<this>");
        return o0(charSequence, str, 0, false, 2) >= 0;
    }

    public static final int l0(CharSequence charSequence) {
        X0.d.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* JADX WARN: Incorrect condition in loop: B:20:0x004c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m0(CharSequence charSequence, String str, int i, boolean z2) {
        X0.d.e(charSequence, "<this>");
        X0.d.e(str, "string");
        if (!z2 && (charSequence instanceof String)) {
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
        b1.c cVar = new b1.c(i, length, 1);
        boolean z3 = charSequence instanceof String;
        int i2 = cVar.f1509c;
        int i3 = cVar.f1508b;
        if (!z3) {
            if ((i2 > 0 && i <= i3) || (i2 < 0 && i3 <= i)) {
                while (!s0(str, 0, charSequence, i, str.length(), z2)) {
                    if (i != i3) {
                        i += i2;
                    }
                }
                return i;
            }
            return -1;
        }
        if ((i2 > 0 && i <= i3) || (i2 < 0 && i3 <= i)) {
            while (!l.f0(0, r4, str.length(), str, (String) charSequence, z2)) {
                if (i != i3) {
                    i += i2;
                }
            }
            return i;
        }
        return -1;
    }

    public static int n0(CharSequence charSequence, char c2, int i, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        X0.d.e(charSequence, "<this>");
        return (z2 || !(charSequence instanceof String)) ? p0(charSequence, new char[]{c2}, i, z2) : ((String) charSequence).indexOf(c2, i);
    }

    public static /* synthetic */ int o0(CharSequence charSequence, String str, int i, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return m0(charSequence, str, i, z2);
    }

    public static final int p0(CharSequence charSequence, char[] cArr, int i, boolean z2) {
        X0.d.e(charSequence, "<this>");
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
        int l02 = l0(charSequence);
        if (i > l02) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c2 : cArr) {
                if (q1.d.x(c2, charAt, z2)) {
                    return i;
                }
            }
            if (i == l02) {
                return -1;
            }
            i++;
        }
    }

    public static boolean q0(String str) {
        X0.d.e(str, "<this>");
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static int r0(String str, char c2, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = l0(str);
        }
        X0.d.e(str, "<this>");
        return str.lastIndexOf(c2, i);
    }

    public static final boolean s0(String str, int i, CharSequence charSequence, int i2, int i3, boolean z2) {
        X0.d.e(str, "<this>");
        X0.d.e(charSequence, "other");
        if (i2 < 0 || i < 0 || i > str.length() - i3 || i2 > charSequence.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!q1.d.x(str.charAt(i + i4), charSequence.charAt(i2 + i4), z2)) {
                return false;
            }
        }
        return true;
    }

    public static String t0(String str, String str2) {
        if (!l.i0(str, str2, false)) {
            return str;
        }
        String substring = str.substring(str2.length());
        X0.d.d(substring, "substring(...)");
        return substring;
    }

    public static final void u0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(V.d("Limit must be non-negative, but was ", i).toString());
        }
    }

    public static List v0(String str, char[] cArr) {
        X0.d.e(str, "<this>");
        boolean z2 = false;
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            u0(0);
            int m02 = m0(str, valueOf, 0, false);
            if (m02 == -1) {
                return q1.d.X(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int i = 0;
            do {
                arrayList.add(str.subSequence(i, m02).toString());
                i = valueOf.length() + m02;
                m02 = m0(str, valueOf, i, false);
            } while (m02 != -1);
            arrayList.add(str.subSequence(i, str.length()).toString());
            return arrayList;
        }
        u0(0);
        d1.f fVar = new d1.f(new c(str, 0, 0, new m(cArr, z2, 0)));
        ArrayList arrayList2 = new ArrayList(Q0.j.w0(fVar));
        Iterator it = fVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList2;
            }
            b1.c cVar = (b1.c) bVar.next();
            X0.d.e(cVar, "range");
            arrayList2.add(str.subSequence(cVar.f1507a, cVar.f1508b + 1).toString());
        }
    }

    public static String w0(String str) {
        X0.d.e(str, "<this>");
        X0.d.e(str, "missingDelimiterValue");
        int r02 = r0(str, '.', 0, 6);
        if (r02 == -1) {
            return str;
        }
        String substring = str.substring(r02 + 1, str.length());
        X0.d.d(substring, "substring(...)");
        return substring;
    }

    public static String x0(String str, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String substring = str.substring(0, i);
        X0.d.d(substring, "substring(...)");
        return substring;
    }

    public static CharSequence y0(String str) {
        X0.d.e(str, "<this>");
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

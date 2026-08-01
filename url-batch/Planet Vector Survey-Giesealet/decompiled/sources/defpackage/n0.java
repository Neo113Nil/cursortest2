package defpackage;

import java.text.BreakIterator;
import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class n0 extends m0 {
    public static n0 e;
    public static n0 f;
    public static n0 g;
    public static final qk0 h = qk0.e;
    public static final qk0 i = qk0.d;
    public final /* synthetic */ int c;
    public Object d;

    public /* synthetic */ n0(int i2) {
        this.c = i2;
    }

    @Override // defpackage.m0
    public final int[] a(int i2) {
        int i3;
        switch (this.c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i2 >= length) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        nz.f0("impl");
                        throw null;
                    }
                    boolean isBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (isBoundary) {
                        if (breakIterator2 == null) {
                            nz.f0("impl");
                            throw null;
                        }
                        int following = breakIterator2.following(i2);
                        if (following == -1) {
                            return null;
                        }
                        return b(i2, following);
                    }
                    if (breakIterator2 == null) {
                        nz.f0("impl");
                        throw null;
                    }
                    i2 = breakIterator2.following(i2);
                } while (i2 != -1);
                return null;
            case 1:
                if (c().length() <= 0 || i2 >= c().length()) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                while (!h(i2) && (!h(i2) || (i2 != 0 && h(i2 - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        nz.f0("impl");
                        throw null;
                    }
                    i2 = breakIterator3.following(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    nz.f0("impl");
                    throw null;
                }
                int following2 = breakIterator4.following(i2);
                if (following2 == -1 || !g(following2)) {
                    return null;
                }
                return b(i2, following2);
            default:
                if (c().length() <= 0 || i2 >= c().length()) {
                    return null;
                }
                sv0 sv0Var = (sv0) this.d;
                qk0 qk0Var = h;
                if (i2 < 0) {
                    if (sv0Var == null) {
                        nz.f0("layoutResult");
                        throw null;
                    }
                    i3 = sv0Var.a(0);
                } else {
                    if (sv0Var == null) {
                        nz.f0("layoutResult");
                        throw null;
                    }
                    int a = sv0Var.a(i2);
                    i3 = e(a, qk0Var) == i2 ? a : a + 1;
                }
                sv0 sv0Var2 = (sv0) this.d;
                if (sv0Var2 == null) {
                    nz.f0("layoutResult");
                    throw null;
                }
                if (i3 >= sv0Var2.b.b) {
                    return null;
                }
                return b(e(i3, qk0Var), e(i3, i) + 1);
        }
    }

    @Override // defpackage.m0
    public final int[] d(int i2) {
        int i3;
        switch (this.c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length) {
                    i2 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        nz.f0("impl");
                        throw null;
                    }
                    boolean isBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (isBoundary) {
                        if (breakIterator2 == null) {
                            nz.f0("impl");
                            throw null;
                        }
                        int preceding = breakIterator2.preceding(i2);
                        if (preceding == -1) {
                            return null;
                        }
                        return b(preceding, i2);
                    }
                    if (breakIterator2 == null) {
                        nz.f0("impl");
                        throw null;
                    }
                    i2 = breakIterator2.preceding(i2);
                } while (i2 != -1);
                return null;
            case 1:
                int length2 = c().length();
                if (length2 <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length2) {
                    i2 = length2;
                }
                while (i2 > 0 && !h(i2 - 1) && !g(i2)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        nz.f0("impl");
                        throw null;
                    }
                    i2 = breakIterator3.preceding(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    nz.f0("impl");
                    throw null;
                }
                int preceding2 = breakIterator4.preceding(i2);
                if (preceding2 == -1 || !h(preceding2)) {
                    return null;
                }
                if (preceding2 == 0 || !h(preceding2 - 1)) {
                    return b(preceding2, i2);
                }
                return null;
            default:
                if (c().length() <= 0 || i2 <= 0) {
                    return null;
                }
                int length3 = c().length();
                sv0 sv0Var = (sv0) this.d;
                qk0 qk0Var = i;
                if (i2 > length3) {
                    if (sv0Var == null) {
                        nz.f0("layoutResult");
                        throw null;
                    }
                    i3 = sv0Var.a(c().length());
                } else {
                    if (sv0Var == null) {
                        nz.f0("layoutResult");
                        throw null;
                    }
                    int a = sv0Var.a(i2);
                    i3 = e(a, qk0Var) + 1 == i2 ? a : a - 1;
                }
                if (i3 < 0) {
                    return null;
                }
                return b(e(i3, h), e(i3, qk0Var) + 1);
        }
    }

    public int e(int i2, qk0 qk0Var) {
        sv0 sv0Var = (sv0) this.d;
        if (sv0Var == null) {
            nz.f0("layoutResult");
            throw null;
        }
        int c = sv0Var.c(i2);
        sv0 sv0Var2 = (sv0) this.d;
        if (sv0Var2 == null) {
            nz.f0("layoutResult");
            throw null;
        }
        qk0 e2 = sv0Var2.e(c);
        sv0 sv0Var3 = (sv0) this.d;
        if (qk0Var != e2) {
            if (sv0Var3 != null) {
                return sv0Var3.c(i2);
            }
            nz.f0("layoutResult");
            throw null;
        }
        if (sv0Var3 == null) {
            nz.f0("layoutResult");
            throw null;
        }
        j60 j60Var = sv0Var3.b;
        j60Var.b(i2);
        ArrayList arrayList = (ArrayList) j60Var.e;
        a5 a5Var = ((rd0) arrayList.get(nk.s(arrayList, i2))).a;
        return (a5Var.d.e(i2 - r4.d) + r4.b) - 1;
    }

    public void f(String str) {
        switch (this.c) {
            case 0:
                this.a = str;
                BreakIterator breakIterator = (BreakIterator) this.d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    nz.f0("impl");
                    throw null;
                }
            default:
                this.a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    nz.f0("impl");
                    throw null;
                }
        }
    }

    public boolean g(int i2) {
        if (i2 <= 0 || !h(i2 - 1)) {
            return false;
        }
        return i2 == c().length() || !h(i2);
    }

    public boolean h(int i2) {
        if (i2 < 0 || i2 >= c().length()) {
            return false;
        }
        return Character.isLetterOrDigit(c().codePointAt(i2));
    }
}

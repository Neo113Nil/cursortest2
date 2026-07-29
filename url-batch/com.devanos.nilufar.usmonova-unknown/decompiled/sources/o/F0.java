package o;

import java.text.BreakIterator;

/* loaded from: classes.dex */
public final class F0 extends E0 {
    public static F0 e;
    public static F0 f;
    public final /* synthetic */ int c;
    public BreakIterator d;

    @Override // o.E0
    public final int[] e(int i) {
        switch (this.c) {
            case 0:
                int length = i().length();
                if (length <= 0 || i >= length) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                do {
                    BreakIterator breakIterator = this.d;
                    if (breakIterator == null) {
                        AbstractC0048Bt.i0("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i)) {
                        BreakIterator breakIterator2 = this.d;
                        if (breakIterator2 == null) {
                            AbstractC0048Bt.i0("impl");
                            throw null;
                        }
                        int following = breakIterator2.following(i);
                        if (following == -1) {
                            return null;
                        }
                        return h(i, following);
                    }
                    BreakIterator breakIterator3 = this.d;
                    if (breakIterator3 == null) {
                        AbstractC0048Bt.i0("impl");
                        throw null;
                    }
                    i = breakIterator3.following(i);
                } while (i != -1);
                return null;
            default:
                if (i().length() <= 0 || i >= i().length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!o(i) && (!o(i) || (i != 0 && o(i - 1)))) {
                    BreakIterator breakIterator4 = this.d;
                    if (breakIterator4 == null) {
                        AbstractC0048Bt.i0("impl");
                        throw null;
                    }
                    i = breakIterator4.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.d;
                if (breakIterator5 == null) {
                    AbstractC0048Bt.i0("impl");
                    throw null;
                }
                int following2 = breakIterator5.following(i);
                if (following2 == -1 || !n(following2)) {
                    return null;
                }
                return h(i, following2);
        }
    }

    @Override // o.E0
    public final int[] k(int i) {
        switch (this.c) {
            case 0:
                int length = i().length();
                if (length <= 0 || i <= 0) {
                    return null;
                }
                if (i > length) {
                    i = length;
                }
                do {
                    BreakIterator breakIterator = this.d;
                    if (breakIterator == null) {
                        AbstractC0048Bt.i0("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i)) {
                        BreakIterator breakIterator2 = this.d;
                        if (breakIterator2 == null) {
                            AbstractC0048Bt.i0("impl");
                            throw null;
                        }
                        int preceding = breakIterator2.preceding(i);
                        if (preceding == -1) {
                            return null;
                        }
                        return h(preceding, i);
                    }
                    BreakIterator breakIterator3 = this.d;
                    if (breakIterator3 == null) {
                        AbstractC0048Bt.i0("impl");
                        throw null;
                    }
                    i = breakIterator3.preceding(i);
                } while (i != -1);
                return null;
            default:
                int length2 = i().length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !o(i - 1) && !n(i)) {
                    BreakIterator breakIterator4 = this.d;
                    if (breakIterator4 == null) {
                        AbstractC0048Bt.i0("impl");
                        throw null;
                    }
                    i = breakIterator4.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.d;
                if (breakIterator5 == null) {
                    AbstractC0048Bt.i0("impl");
                    throw null;
                }
                int preceding2 = breakIterator5.preceding(i);
                if (preceding2 == -1 || !o(preceding2)) {
                    return null;
                }
                if (preceding2 == 0 || !o(preceding2 - 1)) {
                    return h(preceding2, i);
                }
                return null;
        }
    }

    public final void m(String str) {
        switch (this.c) {
            case 0:
                this.a = str;
                BreakIterator breakIterator = this.d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    AbstractC0048Bt.i0("impl");
                    throw null;
                }
            default:
                this.a = str;
                BreakIterator breakIterator2 = this.d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    AbstractC0048Bt.i0("impl");
                    throw null;
                }
        }
    }

    public boolean n(int i) {
        if (i <= 0 || !o(i - 1)) {
            return false;
        }
        return i == i().length() || !o(i);
    }

    public boolean o(int i) {
        if (i < 0 || i >= i().length()) {
            return false;
        }
        return Character.isLetterOrDigit(i().codePointAt(i));
    }
}

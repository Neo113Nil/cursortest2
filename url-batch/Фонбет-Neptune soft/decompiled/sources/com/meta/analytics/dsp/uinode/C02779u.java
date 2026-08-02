package com.meta.analytics.dsp.uinode;

import android.util.Pair;

/* renamed from: com.facebook.ads.redexgen.X.9u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02779u {
    public static String[] A0C = {"Lb1", "HAO", "yCHPPE9w0w81YCKuxFE6L9DmrxkJ2tU0", "DWgdxvM8Y7BV8jWWEqdgbbwmU3UKZQmt", "Bgm", "OOw1FrSehBTCipzYy8xUBx5", "Tcr4i3yvYCwS9F", "vvoyvovICPFY35FJOKkJE7b"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C02759s A04;
    public C02759s A05;
    public C02759s A06;
    public AH A07;
    public Object A08;
    public boolean A09;
    public final AF A0A = new AF();
    public final AG A0B = new AG();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private C02769t A02(int i, long j, long j2) {
        C0385Eo c0385Eo = new C0385Eo(i, j2);
        this.A07.A09(c0385Eo.A02, this.A0A);
        int A04 = this.A0A.A04(j);
        long A09 = A04 == -1 ? Long.MIN_VALUE : this.A0A.A09(A04);
        boolean A0A = A0A(c0385Eo, A09);
        return new C02769t(c0385Eo, j, A09, -9223372036854775807L, A09 == Long.MIN_VALUE ? this.A0A.A07() : A09, A0A, A0B(c0385Eo, A0A));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private C02769t A03(C02759s c02759s, long j) {
        long j2;
        C02769t c02769t = c02759s.A02;
        if (c02769t.A06) {
            int A03 = this.A07.A03(c02769t.A04.A02, this.A0A, this.A0B, this.A01, this.A09);
            if (A03 == -1) {
                return null;
            }
            int i = this.A07.A0A(A03, this.A0A, true).A00;
            Object obj = this.A0A.A03;
            long j3 = c02769t.A04.A03;
            if (this.A07.A0B(i, this.A0B).A00 == A03) {
                Pair<Integer, Long> A08 = this.A07.A08(this.A0B, this.A0A, i, -9223372036854775807L, Math.max(0L, (c02759s.A07() + c02769t.A01) - j));
                if (A08 == null) {
                    return null;
                }
                A03 = ((Integer) A08.first).intValue();
                j2 = ((Long) A08.second).longValue();
                if (c02759s.A01 == null || !c02759s.A01.A09.equals(obj)) {
                    j3 = this.A02;
                    this.A02 = j3 + 1;
                } else {
                    j3 = c02759s.A01.A02.A04.A03;
                    String[] strArr = A0C;
                    if (strArr[5].length() == strArr[7].length()) {
                        String[] strArr2 = A0C;
                        strArr2[4] = "1Mi";
                        strArr2[1] = "4wM";
                    }
                }
            } else {
                j2 = 0;
            }
            return A06(A07(A03, j2, j3), j2, j2);
        }
        C0385Eo c0385Eo = c02769t.A04;
        this.A07.A09(c0385Eo.A02, this.A0A);
        if (c0385Eo.A01()) {
            int i2 = c0385Eo.A00;
            int A01 = this.A0A.A01(i2);
            if (A01 == -1) {
                return null;
            }
            int A032 = this.A0A.A03(i2, c0385Eo.A01);
            if (A032 >= A01) {
                return A02(c0385Eo.A02, c02769t.A00, c0385Eo.A03);
            }
            if (this.A0A.A0E(i2, A032)) {
                return A01(c0385Eo.A02, i2, A032, c02769t.A00, c0385Eo.A03);
            }
            return null;
        }
        long j4 = c02769t.A02;
        String[] strArr3 = A0C;
        if (strArr3[6].length() == strArr3[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr4 = A0C;
        strArr4[4] = "Mkh";
        strArr4[1] = "LRN";
        if (j4 != Long.MIN_VALUE) {
            int A05 = this.A0A.A05(c02769t.A02);
            if (A05 == -1) {
                return A02(c0385Eo.A02, c02769t.A02, c0385Eo.A03);
            }
            int A02 = this.A0A.A02(A05);
            if (this.A0A.A0E(A05, A02)) {
                return A01(c0385Eo.A02, A05, A02, c02769t.A02, c0385Eo.A03);
            }
            return null;
        }
        int A00 = this.A0A.A00();
        if (A00 == 0) {
            return null;
        }
        int i3 = A00 - 1;
        if (this.A0A.A09(i3) == Long.MIN_VALUE) {
            AF af = this.A0A;
            if (A0C[3].charAt(17) == 'q') {
                String[] strArr5 = A0C;
                strArr5[6] = "v4RqMCCMyohjhj";
                strArr5[0] = "VaJ";
                if (!af.A0D(i3)) {
                    int A022 = this.A0A.A02(i3);
                    if (!this.A0A.A0E(i3, A022)) {
                        String[] strArr6 = A0C;
                        if (strArr6[6].length() == strArr6[0].length()) {
                            return null;
                        }
                        A0C[2] = "nHRVyYi6CwR1mKhXGjDN4SEBRB6Sc1lP";
                        return null;
                    }
                    long A07 = this.A0A.A07();
                    int i4 = c0385Eo.A02;
                    String[] strArr7 = A0C;
                    if (strArr7[5].length() != strArr7[7].length()) {
                        throw new RuntimeException();
                    }
                    A0C[2] = "rKR9SUNE0wWlvttO7fw3rD4zdQIUaCm2";
                    return A01(i4, i3, A022, A07, c0385Eo.A03);
                }
            }
        }
        if (A0C[2].charAt(9) != 'w') {
            return null;
        }
        String[] strArr8 = A0C;
        strArr8[6] = "OaXxy4ZAPPYV9k";
        strArr8[0] = "tU4";
        return null;
        throw new RuntimeException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private C02769t A04(C02769t c02769t, C0385Eo c0385Eo) {
        long j = c02769t.A03;
        long j2 = c02769t.A02;
        boolean A0A = A0A(c0385Eo, j2);
        boolean A0B = A0B(c0385Eo, A0A);
        this.A07.A09(c0385Eo.A02, this.A0A);
        return new C02769t(c0385Eo, j, j2, c02769t.A00, c0385Eo.A01() ? this.A0A.A0A(c0385Eo.A00, c0385Eo.A01) : j2 == Long.MIN_VALUE ? this.A0A.A07() : j2, A0A, A0B);
    }

    private long A00(int i) {
        int oldFrontPeriodIndex;
        Object obj = this.A07.A0A(i, this.A0A, true).A03;
        int holderWindowIndex = this.A0A.A00;
        Object obj2 = this.A08;
        if (obj2 != null && (oldFrontPeriodIndex = this.A07.A04(obj2)) != -1 && this.A07.A09(oldFrontPeriodIndex, this.A0A).A00 == holderWindowIndex) {
            return this.A03;
        }
        for (C02759s A0E = A0E(); A0E != null; A0E = A0E.A01) {
            Object periodUid = A0E.A09;
            if (periodUid.equals(obj)) {
                return A0E.A02.A04.A03;
            }
        }
        for (C02759s A0E2 = A0E(); A0E2 != null; A0E2 = A0E2.A01) {
            AH ah = this.A07;
            Object periodUid2 = A0E2.A09;
            int A04 = ah.A04(periodUid2);
            if (A04 != -1 && this.A07.A09(A04, this.A0A).A00 == holderWindowIndex) {
                return A0E2.A02.A04.A03;
            }
        }
        long j = this.A02;
        this.A02 = 1 + j;
        return j;
    }

    private C02769t A01(int i, int i2, int i3, long j, long j2) {
        long j3;
        C0385Eo c0385Eo = new C0385Eo(i, i2, i3, j2);
        boolean A0A = A0A(c0385Eo, Long.MIN_VALUE);
        boolean A0B = A0B(c0385Eo, A0A);
        long A0A2 = this.A07.A09(c0385Eo.A02, this.A0A).A0A(c0385Eo.A00, c0385Eo.A01);
        if (i3 == this.A0A.A02(i2)) {
            j3 = this.A0A.A06();
        } else {
            j3 = 0;
        }
        return new C02769t(c0385Eo, j3, Long.MIN_VALUE, j, A0A2, A0A, A0B);
    }

    private C02769t A05(C02799w c02799w) {
        return A06(c02799w.A04, c02799w.A01, c02799w.A02);
    }

    private C02769t A06(C0385Eo c0385Eo, long j, long j2) {
        this.A07.A09(c0385Eo.A02, this.A0A);
        if (c0385Eo.A01()) {
            if (!this.A0A.A0E(c0385Eo.A00, c0385Eo.A01)) {
                return null;
            }
            return A01(c0385Eo.A02, c0385Eo.A00, c0385Eo.A01, j, c0385Eo.A03);
        }
        return A02(c0385Eo.A02, j2, c0385Eo.A03);
    }

    private C0385Eo A07(int i, long j, long j2) {
        this.A07.A09(i, this.A0A);
        int A05 = this.A0A.A05(j);
        if (A05 == -1) {
            return new C0385Eo(i, j2);
        }
        return new C0385Eo(i, A05, this.A0A.A02(A05), j2);
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x001e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A08() {
        C02759s A0E = A0E();
        if (A0E == null) {
            return true;
        }
        while (true) {
            int A03 = this.A07.A03(A0E.A02.A04.A02, this.A0A, this.A0B, this.A01, this.A09);
            while (lastValidPeriodHolder != null && !A0E.A02.A06) {
                A0E = A0E.A01;
            }
            if (A03 == -1) {
                break;
            }
            C02759s lastValidPeriodHolder = A0E.A01;
            if (lastValidPeriodHolder == null) {
                break;
            }
            C02759s lastValidPeriodHolder2 = A0E.A01;
            int i = lastValidPeriodHolder2.A02.A04.A02;
            if (A0C[3].charAt(17) != 'q') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[4] = "04e";
            strArr[1] = "fTm";
            if (i != A03) {
                break;
            }
            A0E = A0E.A01;
        }
        boolean readingPeriodRemoved = A0S(A0E);
        A0E.A02 = A04(A0E.A02, A0E.A02.A04);
        return (readingPeriodRemoved && A0P()) ? false : true;
    }

    private boolean A09(C02759s c02759s, C02769t c02769t) {
        C02769t c02769t2 = c02759s.A02;
        return c02769t2.A03 == c02769t.A03 && c02769t2.A02 == c02769t.A02 && c02769t2.A04.equals(c02769t.A04);
    }

    private boolean A0A(C0385Eo c0385Eo, long j) {
        int adGroupCount = this.A07.A09(c0385Eo.A02, this.A0A).A00();
        if (adGroupCount == 0) {
            return true;
        }
        int i = adGroupCount - 1;
        boolean A01 = c0385Eo.A01();
        if (this.A0A.A09(i) != Long.MIN_VALUE) {
            return !A01 && j == Long.MIN_VALUE;
        }
        int postrollAdCount = this.A0A.A01(i);
        if (A0C[3].charAt(17) != 'q') {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[4] = "dZB";
        strArr[1] = "bbK";
        if (postrollAdCount == -1) {
            return false;
        }
        if (((A01 && c0385Eo.A00 == i && c0385Eo.A01 == postrollAdCount + (-1)) ? 1 : 0) == 0) {
            return !A01 && this.A0A.A02(i) == postrollAdCount;
        }
        return true;
    }

    private boolean A0B(C0385Eo c0385Eo, boolean z) {
        return !this.A07.A0B(this.A07.A09(c0385Eo.A02, this.A0A).A00, this.A0B).A08 && this.A07.A0F(c0385Eo.A02, this.A0A, this.A0B, this.A01, this.A09) && z;
    }

    public final C02759s A0C() {
        C02759s c02759s = this.A05;
        if (c02759s != null) {
            if (c02759s == this.A06) {
                this.A06 = c02759s.A01;
            }
            this.A05.A0D();
            int i = this.A00 - 1;
            this.A00 = i;
            if (i == 0) {
                this.A04 = null;
                this.A08 = this.A05.A09;
                this.A03 = this.A05.A02.A04.A03;
            }
            C02759s c02759s2 = this.A05.A01;
            if (A0C[3].charAt(17) != 'q') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[5] = "umGBE5C5CuHWhY73AVgogVf";
            strArr[7] = "vM8t2ZsrAby17UFg4572Zd2";
            this.A05 = c02759s2;
        } else {
            C02759s c02759s3 = this.A04;
            this.A05 = c02759s3;
            this.A06 = c02759s3;
        }
        return this.A05;
    }

    public final C02759s A0D() {
        C02759s c02759s = this.A06;
        AbstractC0445Ha.A04((c02759s == null || c02759s.A01 == null) ? false : true);
        C02759s c02759s2 = this.A06.A01;
        this.A06 = c02759s2;
        return c02759s2;
    }

    public final C02759s A0E() {
        return A0P() ? this.A05 : this.A04;
    }

    public final C02759s A0F() {
        return this.A04;
    }

    public final C02759s A0G() {
        return this.A05;
    }

    public final C02759s A0H() {
        return this.A06;
    }

    public final C02769t A0I(long j, C02799w c02799w) {
        C02759s c02759s = this.A04;
        if (c02759s == null) {
            return A05(c02799w);
        }
        return A03(c02759s, j);
    }

    public final C02769t A0J(C02769t c02769t, int i) {
        return A04(c02769t, c02769t.A04.A00(i));
    }

    public final WP A0K(AA[] aaArr, AbstractC0429Gj abstractC0429Gj, InterfaceC0432Gm interfaceC0432Gm, InterfaceC0387Eq interfaceC0387Eq, Object obj, C02769t c02769t) {
        long A07;
        C02759s c02759s = this.A04;
        if (c02759s != null) {
            A07 = c02759s.A07() + this.A04.A02.A01;
            String[] strArr = A0C;
            if (strArr[6].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[5] = "XFCrwzIN7SxWEMf0fznSlHt";
            strArr2[7] = "zDOSpelqL3O1zvPqWZMR4dG";
        } else {
            A07 = c02769t.A03;
        }
        C02759s c02759s2 = new C02759s(aaArr, A07, abstractC0429Gj, interfaceC0432Gm, interfaceC0387Eq, obj, c02769t);
        if (this.A04 != null) {
            AbstractC0445Ha.A04(A0P());
            this.A04.A01 = c02759s2;
        }
        this.A08 = null;
        this.A04 = c02759s2;
        this.A00++;
        return c02759s2.A08;
    }

    public final C0385Eo A0L(int i, long j) {
        return A07(i, j, A00(i));
    }

    public final void A0M(long j) {
        C02759s c02759s = this.A04;
        if (c02759s != null) {
            c02759s.A0G(j);
        }
    }

    public final void A0N(AH ah) {
        this.A07 = ah;
    }

    public final void A0O(boolean z) {
        C02759s A0E = A0E();
        if (A0E != null) {
            this.A08 = z ? A0E.A09 : null;
            this.A03 = A0E.A02.A04.A03;
            A0E.A0D();
            A0S(A0E);
        } else if (!z) {
            this.A08 = null;
        }
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A00 = 0;
    }

    public final boolean A0P() {
        return this.A05 != null;
    }

    public final boolean A0Q() {
        C02759s c02759s = this.A04;
        return c02759s == null || (!c02759s.A02.A05 && this.A04.A0H() && this.A04.A02.A01 != -9223372036854775807L && this.A00 < 100);
    }

    public final boolean A0R(int i) {
        this.A01 = i;
        return A08();
    }

    public final boolean A0S(C02759s c02759s) {
        AbstractC0445Ha.A04(c02759s != null);
        boolean z = false;
        String[] strArr = A0C;
        if (strArr[4].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[4] = "VEc";
        strArr2[1] = "0t0";
        this.A04 = c02759s;
        while (c02759s.A01 != null) {
            c02759s = c02759s.A01;
            if (c02759s == this.A06) {
                this.A06 = this.A05;
                z = true;
            }
            c02759s.A0D();
            this.A00--;
        }
        this.A04.A01 = null;
        return z;
    }

    public final boolean A0T(WP wp) {
        C02759s c02759s = this.A04;
        return c02759s != null && c02759s.A08 == wp;
    }

    public final boolean A0U(C0385Eo c0385Eo, long j) {
        int i = c0385Eo.A02;
        C02759s periodHolder = null;
        for (C02759s A0E = A0E(); A0E != null; A0E = A0E.A01) {
            if (periodHolder == null) {
                C02769t periodInfo = A0E.A02;
                if (A0C[3].charAt(17) != 'q') {
                    throw new RuntimeException();
                }
                String[] strArr = A0C;
                strArr[6] = "pn8srZEQfSJzxw";
                strArr[0] = "zNd";
                A0E.A02 = A0J(periodInfo, i);
            } else {
                if (i == -1 || !A0E.A09.equals(this.A07.A0A(i, this.A0A, true).A03)) {
                    return true ^ A0S(periodHolder);
                }
                C02769t A03 = A03(periodHolder, j);
                if (A03 == null) {
                    return true ^ A0S(periodHolder);
                }
                A0E.A02 = A0J(A0E.A02, i);
                if (!A09(A0E, A03)) {
                    boolean A0S = A0S(periodHolder);
                    String[] strArr2 = A0C;
                    String str = strArr2[4];
                    String str2 = strArr2[1];
                    int length = str.length();
                    int periodIndex = str2.length();
                    if (length != periodIndex) {
                        return true ^ A0S;
                    }
                    String[] strArr3 = A0C;
                    strArr3[5] = "009NTdXku0rfOoGLKxDbxOM";
                    strArr3[7] = "1WlPwvG5U3NzzyaZC20RJwC";
                    return true ^ A0S;
                }
            }
            if (A0E.A02.A06) {
                i = this.A07.A03(i, this.A0A, this.A0B, this.A01, this.A09);
            }
            periodHolder = A0E;
        }
        return true;
    }

    public final boolean A0V(boolean z) {
        this.A09 = z;
        return A08();
    }
}

package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentTransaction;
import com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Zo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0915Zo extends AbstractC01554o implements AnonymousClass50 {
    public static byte[] A0F;
    public static String[] A0G = {"VKH6HNPW", "5SG7ZkmA1SrYT5HpW6e3lHPIEdQjCnoY", "GUFAcNFlkHbDslOxTlAKu2zM5da70L8W", "8EarDdUd0wjX", "ogiAdIZLqFL2ODTGKcli7xbzAuQZVFku", "k0c9canuweazyFazM74f3pFcokchiBr", "yJQv9VjGutzUoxdr6", "vBYUiSK7FkagYmvZS"};
    public int A00;
    public int A01;
    public int A02;
    public LinearLayoutManager$SavedState A03;
    public C4Y A04;
    public boolean A05;
    public int A06;
    public C4T A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final C4R A0D;
    public final C4S A0E;

    public static String A0T(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A0V() {
        A0F = new byte[]{Ascii.RS, Ascii.EM, 1, Ascii.SYN, Ascii.ESC, Ascii.RS, 19, 87, Ascii.CAN, 5, Ascii.RS, Ascii.DC2, Ascii.EM, 3, Ascii.SYN, 3, Ascii.RS, Ascii.CAN, Ascii.EM, 77};
    }

    static {
        A0V();
    }

    public C0915Zo(Context context) {
        this(context, 1, false);
    }

    public C0915Zo(Context context, int i, boolean z) {
        this.A0A = false;
        this.A05 = false;
        this.A0C = false;
        this.A0B = true;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A03 = null;
        this.A0D = new C4R(this);
        this.A0E = new C4S();
        this.A06 = 2;
        A2A(i);
        A0h(z);
        A1R(true);
    }

    private final int A04(int i, C01624w c01624w, AnonymousClass53 anonymousClass53) {
        if (A0W() == 0 || i == 0) {
            return 0;
        }
        this.A07.A0B = true;
        A29();
        int absDy = i > 0 ? 1 : -1;
        int consumed = Math.abs(i);
        A0Y(absDy, consumed, true, anonymousClass53);
        int i2 = this.A07.A07;
        int layoutDirection = A08(c01624w, this.A07, anonymousClass53, false);
        int i3 = i2 + layoutDirection;
        if (i3 < 0) {
            return 0;
        }
        int absDy2 = consumed > i3 ? absDy * i3 : i;
        int layoutDirection2 = -absDy2;
        this.A04.A0J(layoutDirection2);
        this.A07.A04 = absDy2;
        return absDy2;
    }

    private int A05(int i, C01624w c01624w, AnonymousClass53 anonymousClass53, boolean z) {
        int gap = this.A04.A07() - i;
        if (gap > 0) {
            int i2 = -A04(-gap, c01624w, anonymousClass53);
            int i3 = i + i2;
            if (z) {
                int gap2 = this.A04.A07();
                if (A0G[0].length() == 7) {
                    throw new RuntimeException();
                }
                A0G[0] = "DiKLRwr5Jced9h1IWYQQBSe";
                int gap3 = gap2 - i3;
                if (gap3 > 0) {
                    this.A04.A0J(gap3);
                    return gap3 + i2;
                }
            }
            return i2;
        }
        return 0;
    }

    private int A06(int i, C01624w c01624w, AnonymousClass53 anonymousClass53, boolean z) {
        int A0A;
        int gap = i - this.A04.A0A();
        if (gap > 0) {
            int i2 = -A04(gap, c01624w, anonymousClass53);
            int i3 = i + i2;
            if (z && (A0A = i3 - this.A04.A0A()) > 0) {
                this.A04.A0J(-A0A);
                return i2 - A0A;
            }
            return i2;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r0 = r11.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        return r6 - r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int A08(C01624w c01624w, C4T c4t, AnonymousClass53 anonymousClass53, boolean z) {
        int i = c4t.A00;
        int start = c4t.A07;
        if (start != Integer.MIN_VALUE) {
            int start2 = c4t.A00;
            if (start2 < 0) {
                int i2 = c4t.A07;
                int start3 = c4t.A00;
                c4t.A07 = i2 + start3;
            }
            A0e(c01624w, c4t);
        }
        int i3 = c4t.A00;
        int start4 = c4t.A02;
        int i4 = i3 + start4;
        C4S layoutChunkResult = this.A0E;
        while (true) {
            if ((!c4t.A09 && i4 <= 0) || !c4t.A05(anonymousClass53)) {
                break;
            }
            layoutChunkResult.A00();
            A2D(c01624w, anonymousClass53, c4t, layoutChunkResult);
            if (layoutChunkResult.A01) {
                break;
            }
            int i5 = c4t.A06;
            int remainingSpace = layoutChunkResult.A00;
            int start5 = c4t.A05;
            c4t.A06 = i5 + (remainingSpace * start5);
            if (!layoutChunkResult.A03 || this.A07.A08 != null || !anonymousClass53.A07()) {
                int remainingSpace2 = c4t.A00;
                int start6 = layoutChunkResult.A00;
                c4t.A00 = remainingSpace2 - start6;
                int start7 = layoutChunkResult.A00;
                i4 -= start7;
            }
            int start8 = c4t.A07;
            if (start8 != Integer.MIN_VALUE) {
                int remainingSpace3 = c4t.A07;
                int start9 = layoutChunkResult.A00;
                c4t.A07 = remainingSpace3 + start9;
                int start10 = c4t.A00;
                if (start10 < 0) {
                    int i6 = c4t.A07;
                    int i7 = c4t.A00;
                    int remainingSpace4 = A0G[0].length();
                    if (remainingSpace4 == 7) {
                        break;
                    }
                    A0G[5] = "4Yaap7YPoeEmBfNVznjneaOXF1T3Chf";
                    c4t.A07 = i6 + i7;
                }
                A0e(c01624w, c4t);
            }
            if (z) {
                boolean z2 = layoutChunkResult.A02;
                int remainingSpace5 = A0G[0].length();
                if (remainingSpace5 == 7) {
                    break;
                }
                A0G[1] = "BoRZmQ3r1kYFEVrzuprqJgVQBsgHE2ov";
                if (z2) {
                    break;
                }
            }
        }
        throw new RuntimeException();
    }

    private int A09(AnonymousClass53 anonymousClass53) {
        if (A0W() != 0) {
            A29();
            return AnonymousClass57.A00(anonymousClass53, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B);
        }
        if (A0G[5].length() != 31) {
            throw new RuntimeException();
        }
        A0G[5] = "JS1EmTokFkofHdCiZDqGUekHou375gK";
        return 0;
    }

    private int A0A(AnonymousClass53 anonymousClass53) {
        if (A0W() == 0) {
            return 0;
        }
        A29();
        return AnonymousClass57.A02(anonymousClass53, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B, this.A05);
    }

    private int A0B(AnonymousClass53 anonymousClass53) {
        if (A0W() != 0) {
            A29();
            return AnonymousClass57.A01(anonymousClass53, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B);
        }
        String[] strArr = A0G;
        if (strArr[2].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[2] = "SnDsIEYZVkVP365fclIsQ2wSHS1GnuqA";
        strArr2[4] = "cd1sjhoNq3y2dBxKlbos6To2J3BafTHs";
        return 0;
    }

    private final int A0C(AnonymousClass53 anonymousClass53) {
        if (anonymousClass53.A06()) {
            return this.A04.A0B();
        }
        return 0;
    }

    private View A0D() {
        return A0H(0, A0W());
    }

    private View A0E() {
        return A0H(A0W() - 1, -1);
    }

    private View A0F() {
        return A0t(this.A05 ? 0 : A0W() - 1);
    }

    private View A0G() {
        return A0t(this.A05 ? A0W() - 1 : 0);
    }

    private final View A0H(int i, int i2) {
        int next;
        int acceptableBoundsFlag;
        int preferredBoundsFlag;
        A29();
        if (i2 > i) {
            next = 1;
        } else {
            next = i2 < i ? -1 : 0;
        }
        if (next == 0) {
            View A0t = A0t(i);
            String[] strArr = A0G;
            String str = strArr[6];
            String str2 = strArr[7];
            int length = str.length();
            int next2 = str2.length();
            if (length != next2) {
                throw new RuntimeException();
            }
            A0G[5] = "tEP4S10y6AtQbDA9ff3H424KLTnX0k7";
            return A0t;
        }
        int preferredBoundsFlag2 = this.A04.A0F(A0t(i));
        int next3 = this.A04.A0A();
        if (preferredBoundsFlag2 < next3) {
            acceptableBoundsFlag = 16644;
            preferredBoundsFlag = 16388;
        } else {
            acceptableBoundsFlag = 4161;
            preferredBoundsFlag = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        }
        int next4 = this.A00;
        if (next4 == 0) {
            return super.A04.A00(i, i2, acceptableBoundsFlag, preferredBoundsFlag);
        }
        return super.A05.A00(i, i2, acceptableBoundsFlag, preferredBoundsFlag);
    }

    private final View A0J(int i, int i2, boolean z, boolean z2) {
        int i3;
        A29();
        int i4 = 0;
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (z2) {
            i4 = 320;
        }
        int i5 = this.A00;
        int acceptableBoundsFlag = A0G[1].charAt(30);
        if (acceptableBoundsFlag != 111) {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[2] = "NnwW0AnvRBQDKBAe7Vp9NN4SqY6y39Zg";
        strArr[4] = "snWQRfIRwdJNOSPMdDWVpUmegwlUrdsl";
        if (i5 == 0) {
            return super.A04.A00(i, i2, i3, i4);
        }
        return super.A05.A00(i, i2, i3, i4);
    }

    private View A0K(C01624w c01624w, AnonymousClass53 anonymousClass53) {
        return A28(c01624w, anonymousClass53, 0, A0W(), anonymousClass53.A03());
    }

    private View A0L(C01624w c01624w, AnonymousClass53 anonymousClass53) {
        return A28(c01624w, anonymousClass53, A0W() - 1, -1, anonymousClass53.A03());
    }

    private View A0M(C01624w c01624w, AnonymousClass53 anonymousClass53) {
        return this.A05 ? A0D() : A0E();
    }

    private View A0N(C01624w c01624w, AnonymousClass53 anonymousClass53) {
        return this.A05 ? A0E() : A0D();
    }

    private View A0O(C01624w c01624w, AnonymousClass53 anonymousClass53) {
        return this.A05 ? A0K(c01624w, anonymousClass53) : A0L(c01624w, anonymousClass53);
    }

    private View A0P(C01624w c01624w, AnonymousClass53 anonymousClass53) {
        return this.A05 ? A0L(c01624w, anonymousClass53) : A0K(c01624w, anonymousClass53);
    }

    private View A0Q(boolean z, boolean z2) {
        if (this.A05) {
            return A0J(0, A0W(), z, z2);
        }
        return A0J(A0W() - 1, -1, z, z2);
    }

    private View A0R(boolean z, boolean z2) {
        if (this.A05) {
            return A0J(A0W() - 1, -1, z, z2);
        }
        return A0J(0, A0W(), z, z2);
    }

    private final C4T A0S() {
        return new C4T();
    }

    private void A0U() {
        if (this.A00 == 1 || !A2F()) {
            this.A05 = this.A0A;
            return;
        }
        boolean z = !this.A0A;
        String[] strArr = A0G;
        if (strArr[2].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[6] = "rvopS3hSB7itRsuyG";
        strArr2[7] = "9RTUShXs4ZXrU4n03";
        this.A05 = z;
    }

    private void A0W(int i, int i2) {
        this.A07.A00 = this.A04.A07() - i2;
        this.A07.A03 = this.A05 ? -1 : 1;
        this.A07.A01 = i;
        this.A07.A05 = 1;
        this.A07.A06 = i2;
        this.A07.A07 = Integer.MIN_VALUE;
    }

    private void A0X(int i, int i2) {
        this.A07.A00 = i2 - this.A04.A0A();
        this.A07.A01 = i;
        this.A07.A03 = this.A05 ? 1 : -1;
        this.A07.A05 = -1;
        this.A07.A06 = i2;
        this.A07.A07 = Integer.MIN_VALUE;
    }

    private void A0Y(int i, int i2, boolean z, AnonymousClass53 anonymousClass53) {
        int A0A;
        this.A07.A09 = A0i();
        this.A07.A02 = A0C(anonymousClass53);
        this.A07.A05 = i;
        if (i == 1) {
            this.A07.A02 += this.A04.A08();
            View A0F2 = A0F();
            C4T c4t = this.A07;
            if (!this.A05) {
                r4 = 1;
            }
            c4t.A03 = r4;
            this.A07.A01 = A0p(A0F2) + this.A07.A03;
            this.A07.A06 = this.A04.A0C(A0F2);
            A0A = this.A04.A0C(A0F2) - this.A04.A07();
        } else {
            View A0G2 = A0G();
            this.A07.A02 += this.A04.A0A();
            this.A07.A03 = this.A05 ? 1 : -1;
            this.A07.A01 = A0p(A0G2) + this.A07.A03;
            this.A07.A06 = this.A04.A0F(A0G2);
            A0A = (-this.A04.A0F(A0G2)) + this.A04.A0A();
        }
        this.A07.A00 = i2;
        if (z) {
            C4T c4t2 = this.A07;
            int scrollingOffset = c4t2.A00;
            c4t2.A00 = scrollingOffset - A0A;
        }
        this.A07.A07 = A0A;
        if (A0G[0].length() == 7) {
            throw new RuntimeException();
        }
        A0G[1] = "rmKnvh8FAT7bzRdUkYGsCRYa1fX1DRoz";
    }

    private void A0Z(C4R c4r) {
        A0W(c4r.A01, c4r.A00);
    }

    private void A0a(C4R c4r) {
        A0X(c4r.A01, c4r.A00);
    }

    private void A0b(C01624w c01624w, int i) {
        int A0W = A0W();
        if (i < 0) {
            return;
        }
        int A06 = this.A04.A06() - i;
        if (this.A05) {
            for (int i2 = 0; i2 < A0W; i2++) {
                View A0t = A0t(i2);
                int childCount = this.A04.A0F(A0t);
                if (childCount >= A06) {
                    int childCount2 = this.A04.A0H(A0t);
                    if (childCount2 >= A06) {
                    }
                }
                A0d(c01624w, 0, i2);
                return;
            }
            return;
        }
        for (int i3 = A0W - 1; i3 >= 0; i3--) {
            View A0t2 = A0t(i3);
            int childCount3 = this.A04.A0F(A0t2);
            if (childCount3 >= A06) {
                int childCount4 = this.A04.A0H(A0t2);
                if (childCount4 >= A06) {
                }
            }
            int childCount5 = A0W - 1;
            A0d(c01624w, childCount5, i3);
            return;
        }
    }

    private void A0c(C01624w c01624w, int i) {
        if (i < 0) {
            return;
        }
        String[] strArr = A0G;
        if (strArr[2].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        A0G[0] = "66";
        int A0W = A0W();
        if (this.A05) {
            for (int i2 = A0W - 1; i2 >= 0; i2--) {
                View A0t = A0t(i2);
                int limit = this.A04.A0C(A0t);
                if (limit <= i) {
                    C4Y c4y = this.A04;
                    String[] strArr2 = A0G;
                    String str = strArr2[6];
                    String str2 = strArr2[7];
                    int childCount = str.length();
                    int limit2 = str2.length();
                    if (childCount != limit2) {
                        int limit3 = c4y.A0G(A0t);
                        if (limit3 <= i) {
                        }
                    } else {
                        A0G[3] = "uDZbJl3GZvnd0";
                        int limit4 = c4y.A0G(A0t);
                        if (limit4 <= i) {
                        }
                    }
                }
                int limit5 = A0W - 1;
                A0d(c01624w, limit5, i2);
                return;
            }
            return;
        }
        for (int i3 = 0; i3 < A0W; i3++) {
            View A0t2 = A0t(i3);
            int A0C = this.A04.A0C(A0t2);
            int childCount2 = A0G[3].length();
            if (childCount2 == 28) {
                throw new RuntimeException();
            }
            A0G[1] = "ET87P0AumYMcjI6vylu4qFXoEmTHeXod";
            if (A0C <= i) {
                int limit6 = this.A04.A0G(A0t2);
                if (limit6 <= i) {
                }
            }
            A0d(c01624w, 0, i3);
            return;
        }
    }

    private void A0d(C01624w c01624w, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 > i) {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                A14(i3, c01624w);
            }
            return;
        }
        while (i > i2) {
            A14(i, c01624w);
            i--;
        }
    }

    private void A0e(C01624w c01624w, C4T c4t) {
        if (!c4t.A0B || c4t.A09) {
            return;
        }
        int i = c4t.A05;
        String[] strArr = A0G;
        if (strArr[6].length() == strArr[7].length()) {
            String[] strArr2 = A0G;
            strArr2[2] = "M7iaeQoExhHh03f7x1XNzmreS2Lq1zJK";
            strArr2[4] = "3weclwG7n9RXAySrMV3Jn51LrKgutG4n";
            if (i == -1) {
                int i2 = c4t.A07;
                if (A0G[1].charAt(30) == 'o') {
                    A0G[3] = "CiNTyTfZO3PW6tP";
                    A0b(c01624w, i2);
                    return;
                }
            } else {
                A0c(c01624w, c4t.A07);
                return;
            }
        }
        throw new RuntimeException();
    }

    private void A0f(C01624w c01624w, AnonymousClass53 anonymousClass53, int scrapExtraEnd, int scrapExtraEnd2) {
        if (!anonymousClass53.A08() || A0W() == 0 || anonymousClass53.A07() || !A22()) {
            return;
        }
        int i = 0;
        int scrapExtraStart = 0;
        List<AnonymousClass56> A0J = c01624w.A0J();
        int i2 = A0J.size();
        int A0p = A0p(A0t(0));
        for (int scrapSize = 0; scrapSize < i2; scrapSize++) {
            AnonymousClass56 anonymousClass56 = A0J.get(scrapSize);
            if (!anonymousClass56.A0a()) {
                int direction = 1;
                if ((anonymousClass56.A0I() < A0p) != this.A05) {
                    direction = -1;
                }
                if (direction == -1) {
                    i += this.A04.A0D(anonymousClass56.A0H);
                } else {
                    scrapExtraStart += this.A04.A0D(anonymousClass56.A0H);
                }
            }
        }
        this.A07.A08 = A0J;
        if (i > 0) {
            A0X(A0p(A0G()), scrapExtraEnd);
            this.A07.A02 = i;
            this.A07.A00 = 0;
            this.A07.A04();
            A08(c01624w, this.A07, anonymousClass53, false);
        }
        if (scrapExtraStart > 0) {
            A0W(A0p(A0F()), scrapExtraEnd2);
            this.A07.A02 = scrapExtraStart;
            this.A07.A00 = 0;
            this.A07.A04();
            A08(c01624w, this.A07, anonymousClass53, false);
        }
        this.A07.A08 = null;
    }

    private void A0g(C01624w c01624w, AnonymousClass53 anonymousClass53, C4R c4r) {
        if (A0k(anonymousClass53, c4r)) {
            return;
        }
        boolean A0j = A0j(c01624w, anonymousClass53, c4r);
        String[] strArr = A0G;
        if (strArr[2].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        A0G[3] = "XDJ2jDWhUW9a7iN";
        if (A0j) {
            return;
        }
        c4r.A02();
        c4r.A01 = this.A0C ? anonymousClass53.A03() - 1 : 0;
    }

    private final void A0h(boolean z) {
        A1y(null);
        if (z == this.A0A) {
            return;
        }
        this.A0A = z;
        A0y();
    }

    private final boolean A0i() {
        return this.A04.A09() == 0 && this.A04.A06() == 0;
    }

    private boolean A0j(C01624w c01624w, AnonymousClass53 anonymousClass53, C4R c4r) {
        View A0P;
        int A0A;
        if (A0W() == 0) {
            return false;
        }
        View A0s = A0s();
        if (A0s != null && c4r.A06(A0s, anonymousClass53)) {
            c4r.A05(A0s);
            return true;
        }
        if (this.A08 != this.A0C) {
            return false;
        }
        if (c4r.A02) {
            A0P = A0O(c01624w, anonymousClass53);
        } else {
            A0P = A0P(c01624w, anonymousClass53);
        }
        if (A0P == null) {
            return false;
        }
        c4r.A04(A0P);
        if (!anonymousClass53.A07() && A22()) {
            if (this.A04.A0F(A0P) >= this.A04.A07() || this.A04.A0C(A0P) < this.A04.A0A()) {
                if (c4r.A02) {
                    A0A = this.A04.A07();
                } else {
                    A0A = this.A04.A0A();
                }
                c4r.A00 = A0A;
            }
        }
        return true;
    }

    private boolean A0k(AnonymousClass53 anonymousClass53, C4R c4r) {
        int i;
        int startGap;
        if (anonymousClass53.A07() || (i = this.A01) == -1) {
            return false;
        }
        if (i < 0 || i >= anonymousClass53.A03()) {
            this.A01 = -1;
            this.A02 = Integer.MIN_VALUE;
            return false;
        }
        c4r.A01 = this.A01;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState == null || !linearLayoutManager$SavedState.A01()) {
            if (this.A02 == Integer.MIN_VALUE) {
                View A1m = A1m(this.A01);
                if (A1m != null) {
                    if (this.A04.A0D(A1m) > this.A04.A0B()) {
                        c4r.A02();
                        return true;
                    }
                    if (this.A04.A0F(A1m) - this.A04.A0A() < 0) {
                        c4r.A00 = this.A04.A0A();
                        c4r.A02 = false;
                        return true;
                    }
                    int endGap = this.A04.A07() - this.A04.A0C(A1m);
                    if (endGap < 0) {
                        c4r.A00 = this.A04.A07();
                        c4r.A02 = true;
                        return true;
                    }
                    if (c4r.A02) {
                        int startGap2 = this.A04.A0C(A1m);
                        C4Y c4y = this.A04;
                        String[] strArr = A0G;
                        String str = strArr[2];
                        String str2 = strArr[4];
                        int endGap2 = str.charAt(4);
                        if (endGap2 == str2.charAt(4)) {
                            throw new RuntimeException();
                        }
                        A0G[3] = "ZbIhQvVoqDIGDPkO0OlvW9zioDplzu";
                        startGap = startGap2 + c4y.A05();
                    } else {
                        startGap = this.A04.A0F(A1m);
                    }
                    c4r.A00 = startGap;
                } else {
                    if (A0W() > 0) {
                        View child = A0t(0);
                        boolean z = this.A01 < A0p(child);
                        boolean z2 = this.A05;
                        if (A0G[1].charAt(30) != 'o') {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0G;
                        strArr2[2] = "1tNDA9T9nSDYektAgKE77gOe81bMFJSk";
                        strArr2[4] = "TZYqXNdWGZVKxzfIQyf7YZEk7yb7IRTm";
                        c4r.A02 = z == z2;
                    }
                    c4r.A02();
                }
                return true;
            }
            c4r.A02 = this.A05;
            if (this.A05) {
                c4r.A00 = this.A04.A07() - this.A02;
            } else {
                c4r.A00 = this.A04.A0A() + this.A02;
            }
            return true;
        }
        c4r.A02 = this.A03.A02;
        if (c4r.A02) {
            c4r.A00 = this.A04.A07() - this.A03.A00;
        } else {
            c4r.A00 = this.A04.A0A() + this.A03.A00;
        }
        return true;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01554o
    public int A1d(int i, C01624w c01624w, AnonymousClass53 anonymousClass53) {
        if (this.A00 == 1) {
            return 0;
        }
        return A04(i, c01624w, anonymousClass53);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01554o
    public int A1e(int i, C01624w c01624w, AnonymousClass53 anonymousClass53) {
        if (this.A00 == 0) {
            return 0;
        }
        int A04 = A04(i, c01624w, anonymousClass53);
        String[] strArr = A0G;
        if (strArr[6].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A0G[3] = "CDnF1shpb";
        return A04;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01554o
    public final int A1f(AnonymousClass53 anonymousClass53) {
        return A09(anonymousClass53);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01554o
    public final int A1g(AnonymousClass53 anonymousClass53) {
        return A0A(anonymousClass53);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01554o
    public final int A1h(AnonymousClass53 anonymousClass53) {
        return A0B(anonymousClass53);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01554o
    public final int A1i(AnonymousClass53 anonymousClass53) {
        return A09(anonymousClass53);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01554o
    public final int A1j(AnonymousClass53 anonymousClass53) {
        return A0A(anonymousClass53);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01554o
    public final int A1k(AnonymousClass53 anonymousClass53) {
        return A0B(anonymousClass53);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01554o
    public final Parcelable A1l() {
        if (this.A03 != null) {
            return new WrappedParcelable(new LinearLayoutManager$SavedState(this.A03));
        }
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = new LinearLayoutManager$SavedState();
        if (A0W() > 0) {
            A29();
            boolean didLayoutFromEnd = this.A08 ^ this.A05;
            linearLayoutManager$SavedState.A02 = didLayoutFromEnd;
            if (didLayoutFromEnd) {
                View refChild = A0F();
                linearLayoutManager$SavedState.A00 = this.A04.A07() - this.A04.A0C(refChild);
                linearLayoutManager$SavedState.A01 = A0p(refChild);
            } else {
                View A0G2 = A0G();
                linearLayoutManager$SavedState.A01 = A0p(A0G2);
                linearLayoutManager$SavedState.A00 = this.A04.A0F(A0G2) - this.A04.A0A();
            }
        } else {
            linearLayoutManager$SavedState.A00();
        }
        return new WrappedParcelable(linearLayoutManager$SavedState);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01554o
    public final View A1m(int i) {
        int firstChild = A0W();
        if (firstChild == 0) {
            return null;
        }
        int childCount = i - A0p(A0t(0));
        if (childCount >= 0 && childCount < firstChild) {
            View A0t = A0t(childCount);
            if (A0p(A0t) == i) {
                return A0t;
            }
        }
        return super.A1m(i);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01554o
    public View A1n(View view, int i, C01624w c01624w, AnonymousClass53 anonymousClass53) {
        int A27;
        View A0M;
        View nextCandidate;
        A0U();
        if (A0W() == 0 || (A27 = A27(i)) == Integer.MIN_VALUE) {
            return null;
        }
        A29();
        A29();
        int layoutDir = this.A04.A0B();
        A0Y(A27, (int) (layoutDir * 0.33333334f), false, anonymousClass53);
        this.A07.A07 = Integer.MIN_VALUE;
        this.A07.A0B = false;
        A08(c01624w, this.A07, anonymousClass53, true);
        if (A27 == -1) {
            A0M = A0N(c01624w, anonymousClass53);
        } else {
            A0M = A0M(c01624w, anonymousClass53);
        }
        if (A27 == -1) {
            nextCandidate = A0G();
        } else {
            nextCandidate = A0F();
        }
        boolean hasFocusable = nextCandidate.hasFocusable();
        if (A0G[0].length() == 7) {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[2] = "JGtMOr7ZHjmwUVfbInfaZmEhr0nxGN38";
        strArr[4] = "jCrgpf8bwQbyd1C9u6FfAt5OnK6gBhSa";
        if (hasFocusable) {
            if (A0M == null) {
                return null;
            }
            return nextCandidate;
        }
        return A0M;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01554o
    public C01564p A1o() {
        return new C01564p(-2, -2);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01554o
    public void A1p(int i) {
        this.A01 = i;
        this.A02 = Integer.MIN_VALUE;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null) {
            linearLayoutManager$SavedState.A00();
        }
        A0y();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01554o
    public final void A1q(int i, int i2, AnonymousClass53 anonymousClass53, InterfaceC01534m interfaceC01534m) {
        if (this.A00 != 0) {
            i = i2;
        }
        int delta = A0W();
        if (delta == 0 || i == 0) {
            return;
        }
        A29();
        int i3 = i > 0 ? 1 : -1;
        int delta2 = Math.abs(i);
        A0Y(i3, delta2, true, anonymousClass53);
        A2E(anonymousClass53, this.A07, interfaceC01534m);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01554o
    public final void A1r(int i, InterfaceC01534m interfaceC01534m) {
        boolean z;
        int direction;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null && linearLayoutManager$SavedState.A01()) {
            z = this.A03.A02;
            direction = this.A03.A01;
        } else {
            A0U();
            z = this.A05;
            int i2 = this.A01;
            String[] strArr = A0G;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A0G[1] = "j12HxmlCdcFNOCf90EDMVBFIs8rsuaoM";
            if (i2 == -1) {
                direction = z ? i - 1 : 0;
            } else {
                direction = this.A01;
            }
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.A06 && direction >= 0 && direction < i; i4++) {
            interfaceC01534m.A3S(direction, 0);
            direction += i3;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01554o
    public final void A1s(Parcelable parcelable) {
        if (!(parcelable instanceof WrappedParcelable)) {
            return;
        }
        ClassLoader classLoader = getClass().getClassLoader();
        if (A0G[1].charAt(30) == 'o') {
            A0G[1] = "tHEWx5U9TGfOm0s3U2zrO5nR7UMaVIoI";
            if (classLoader == null) {
                return;
            }
            if (A0G[5].length() == 31) {
                A0G[3] = "tm";
                Parcelable state = ((WrappedParcelable) parcelable).unwrap(classLoader);
                if (state instanceof LinearLayoutManager$SavedState) {
                    this.A03 = (LinearLayoutManager$SavedState) state;
                    A0y();
                    return;
                }
                return;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01554o
    public final void A1t(AccessibilityEvent accessibilityEvent) {
        super.A1t(accessibilityEvent);
        if (A0W() > 0) {
            accessibilityEvent.setFromIndex(A24());
            int A25 = A25();
            if (A0G[3].length() == 28) {
                throw new RuntimeException();
            }
            A0G[3] = "9E5bhv9RVKulu";
            accessibilityEvent.setToIndex(A25);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a6, code lost:
    
        if (r3 != (-1)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ac, code lost:
    
        if (r9.A02 == Integer.MIN_VALUE) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ae, code lost:
    
        r1 = A1m(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
    
        if (r1 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        if (r9.A05 == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        r3 = r9.A04.A07() - r9.A04.A0C(r1);
        r2 = com.meta.analytics.dsp.uinode.C0915Zo.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d6, code lost:
    
        if (r2[2].charAt(4) == r2[4].charAt(4)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d8, code lost:
    
        com.meta.analytics.dsp.uinode.C0915Zo.A0G[5] = "r3FnQil1r32czyLALUutLd0XCkxYZ4G";
        r3 = r3 - r9.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e2, code lost:
    
        if (r3 <= 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e4, code lost:
    
        r4 = r4 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0208, code lost:
    
        r5 = r5 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x020b, code lost:
    
        r2 = com.meta.analytics.dsp.uinode.C0915Zo.A0G;
        r2[2] = "sdmiyO1ExKOYMO2wbr6XNnW0K6t4WoaH";
        r2[4] = "ty9AfnxQn4ghzZPCSImQPyrccPhuEwJu";
        r3 = r3 - r9.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x021c, code lost:
    
        r3 = r9.A02 - (r9.A04.A0F(r1) - r9.A04.A0A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x023a, code lost:
    
        if (r3 != (-1)) goto L33;
     */
    @Override // com.meta.analytics.dsp.uinode.AbstractC01554o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A1u(C01624w c01624w, AnonymousClass53 anonymousClass53) {
        int i;
        int extra;
        int fixOffset;
        int startOffset = -1;
        if ((this.A03 != null || this.A01 != -1) && anonymousClass53.A03() == 0) {
            A1I(c01624w);
            return;
        }
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null && linearLayoutManager$SavedState.A01()) {
            this.A01 = this.A03.A01;
        }
        A29();
        this.A07.A0B = false;
        A0U();
        View A0s = A0s();
        if (!this.A0D.A03 || this.A01 != -1 || this.A03 != null) {
            this.A0D.A03();
            this.A0D.A02 = this.A05 ^ this.A0C;
            A0g(c01624w, anonymousClass53, this.A0D);
            C4R c4r = this.A0D;
            if (A0G[3].length() == 28) {
                throw new RuntimeException();
            }
            A0G[0] = "pP9DXN24lJAGcvrzmJLzNvbz";
            c4r.A03 = true;
        } else if (A0s != null && (this.A04.A0F(A0s) >= this.A04.A07() || this.A04.A0C(A0s) <= this.A04.A0A())) {
            this.A0D.A05(A0s);
        }
        int extraForEnd = A0C(anonymousClass53);
        if (this.A07.A04 >= 0) {
            i = 0;
        } else {
            i = extraForEnd;
            extraForEnd = 0;
        }
        int A0A = i + this.A04.A0A();
        int extraForEnd2 = extraForEnd + this.A04.A08();
        if (anonymousClass53.A07()) {
            int extra2 = this.A01;
            String[] strArr = A0G;
            if (strArr[6].length() != strArr[7].length()) {
                A0G[1] = "HnPzY03honFOjhYT25K5WFAFMhFIclok";
            } else {
                String[] strArr2 = A0G;
                strArr2[2] = "wwbDuuRcKwQkcLvBFtW9wuMbOUuGYFzY";
                strArr2[4] = "YequbpJjhMyIl9uyXvP2gytASLo9xZ7L";
            }
        }
        if (this.A0D.A02) {
            if (this.A05) {
                startOffset = 1;
            }
        } else if (!this.A05) {
            startOffset = 1;
        }
        A2C(c01624w, anonymousClass53, this.A0D, startOffset);
        A1H(c01624w);
        this.A07.A09 = A0i();
        this.A07.A0A = anonymousClass53.A07();
        if (this.A0D.A02) {
            A0a(this.A0D);
            this.A07.A02 = A0A;
            A08(c01624w, this.A07, anonymousClass53, false);
            fixOffset = this.A07.A06;
            int i2 = this.A07.A01;
            if (this.A07.A00 > 0) {
                extraForEnd2 += this.A07.A00;
            }
            A0Z(this.A0D);
            this.A07.A02 = extraForEnd2;
            this.A07.A01 += this.A07.A03;
            A08(c01624w, this.A07, anonymousClass53, false);
            extra = this.A07.A06;
            if (this.A07.A00 > 0) {
                int i3 = this.A07.A00;
                A0X(i2, fixOffset);
                this.A07.A02 = i3;
                A08(c01624w, this.A07, anonymousClass53, false);
                fixOffset = this.A07.A06;
            }
        } else {
            A0Z(this.A0D);
            this.A07.A02 = extraForEnd2;
            A08(c01624w, this.A07, anonymousClass53, false);
            extra = this.A07.A06;
            int fixOffset2 = this.A07.A01;
            if (this.A07.A00 > 0) {
                A0A += this.A07.A00;
            }
            A0a(this.A0D);
            this.A07.A02 = A0A;
            this.A07.A01 += this.A07.A03;
            A08(c01624w, this.A07, anonymousClass53, false);
            fixOffset = this.A07.A06;
            if (this.A07.A00 > 0) {
                int i4 = this.A07.A00;
                A0W(fixOffset2, extra);
                this.A07.A02 = i4;
                A08(c01624w, this.A07, anonymousClass53, false);
                extra = this.A07.A06;
            }
        }
        if (A0W() > 0) {
            if (this.A05 ^ this.A0C) {
                int A05 = A05(extra, c01624w, anonymousClass53, true);
                int fixOffset3 = fixOffset + A05;
                int extra3 = extra + A05;
                int A06 = A06(fixOffset3, c01624w, anonymousClass53, false);
                fixOffset = fixOffset3 + A06;
                extra = extra3 + A06;
            } else {
                int A062 = A06(fixOffset, c01624w, anonymousClass53, true);
                int fixOffset4 = fixOffset + A062;
                int extra4 = extra + A062;
                int A052 = A05(extra4, c01624w, anonymousClass53, false);
                fixOffset = fixOffset4 + A052;
                extra = extra4 + A052;
            }
        }
        A0f(c01624w, anonymousClass53, fixOffset, extra);
        if (!anonymousClass53.A07()) {
            this.A04.A0I();
        } else {
            this.A0D.A03();
        }
        this.A08 = this.A0C;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01554o
    public void A1v(AnonymousClass53 anonymousClass53) {
        super.A1v(anonymousClass53);
        this.A03 = null;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A0D.A03();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01554o
    public final void A1w(C0372Eb c0372Eb, C01624w c01624w) {
        super.A1w(c0372Eb, c01624w);
        if (this.A09) {
            A1I(c01624w);
            c01624w.A0P();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01554o
    public void A1x(C0372Eb c0372Eb, AnonymousClass53 anonymousClass53, int i) {
        C0914Zn linearSmoothScroller = new C0914Zn(c0372Eb.getContext());
        linearSmoothScroller.A0A(i);
        A1L(linearSmoothScroller);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01554o
    public final void A1y(String str) {
        if (this.A03 == null) {
            super.A1y(str);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01554o
    public final boolean A1z() {
        if (A0Y() != 1073741824 && A0i() != 1073741824) {
            boolean A1S = A1S();
            if (A0G[0].length() == 7) {
                throw new RuntimeException();
            }
            A0G[0] = "ZYU5Lu8KJdo1W8";
            if (A1S) {
                return true;
            }
        }
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01554o
    public final boolean A20() {
        return this.A00 == 0;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01554o
    public final boolean A21() {
        return this.A00 == 1;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01554o
    public boolean A22() {
        return this.A03 == null && this.A08 == this.A0C;
    }

    public final int A23() {
        View child = A0J(0, A0W(), true, false);
        if (child == null) {
            return -1;
        }
        return A0p(child);
    }

    public final int A24() {
        View child = A0J(0, A0W(), false, true);
        if (child == null) {
            return -1;
        }
        return A0p(child);
    }

    public final int A25() {
        View child = A0J(A0W() - 1, -1, false, true);
        if (child == null) {
            return -1;
        }
        return A0p(child);
    }

    public final int A26() {
        return this.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0061, code lost:
    
        if (r4 == 1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
    
        if (A2F() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006b, code lost:
    
        if (r4 == 1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A27(int i) {
        switch (i) {
            case 1:
                int i2 = this.A00;
                String[] strArr = A0G;
                if (strArr[6].length() == strArr[7].length()) {
                    A0G[3] = "tdW2fzf";
                    break;
                }
                break;
            case 2:
                return (this.A00 != 1 && A2F()) ? -1 : 1;
            case 17:
                if (this.A00 == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            case 33:
                if (this.A00 == 1) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            case 66:
                return this.A00 == 0 ? 1 : Integer.MIN_VALUE;
            case 130:
                int i3 = this.A00;
                if (A0G[1].charAt(30) != 'o') {
                    throw new RuntimeException();
                }
                A0G[3] = "6DQtaB3lJkGKNvmH8s9QQc68TsOBLDE";
                return i3 == 1 ? 1 : Integer.MIN_VALUE;
            default:
                return Integer.MIN_VALUE;
        }
    }

    public View A28(C01624w c01624w, AnonymousClass53 anonymousClass53, int i, int i2, int i3) {
        A29();
        View view = null;
        View view2 = null;
        int A0A = this.A04.A0A();
        int boundsEnd = this.A04.A07();
        int boundsStart = i2 > i ? 1 : -1;
        while (i != i2) {
            View outOfBoundsMatch = A0t(i);
            int A0p = A0p(outOfBoundsMatch);
            if (A0p >= 0 && A0p < i3) {
                if (((C01564p) outOfBoundsMatch.getLayoutParams()).A02()) {
                    if (view == null) {
                        view = outOfBoundsMatch;
                    }
                } else if (this.A04.A0F(outOfBoundsMatch) >= boundsEnd || this.A04.A0C(outOfBoundsMatch) < A0A) {
                    if (view2 == null) {
                        view2 = outOfBoundsMatch;
                    }
                } else {
                    return outOfBoundsMatch;
                }
            }
            i += boundsStart;
        }
        return view2 != null ? view2 : view;
    }

    public final void A29() {
        if (this.A07 == null) {
            this.A07 = A0S();
        }
        if (this.A04 == null) {
            this.A04 = C4Y.A02(this, this.A00);
        }
    }

    public final void A2A(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(A0T(0, 20, 1) + i);
        }
        if (A0G[1].charAt(30) != 'o') {
            throw new RuntimeException();
        }
        A0G[1] = "wMuOUB68W5cmyVCUMue198JFnL9Wkeot";
        A1y(null);
        if (i == this.A00) {
            return;
        }
        this.A00 = i;
        this.A04 = null;
        A0y();
    }

    public final void A2B(int i, int i2) {
        this.A01 = i;
        this.A02 = i2;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null) {
            linearLayoutManager$SavedState.A00();
        }
        A0y();
        if (A0G[1].charAt(30) != 'o') {
            throw new RuntimeException();
        }
        A0G[3] = "tDl3kZGUKMTs";
    }

    public void A2C(C01624w c01624w, AnonymousClass53 anonymousClass53, C4R c4r, int i) {
    }

    public void A2D(C01624w c01624w, AnonymousClass53 anonymousClass53, C4T c4t, C4S c4s) {
        int A0g;
        int right;
        int i;
        int i2;
        View A03 = c4t.A03(c01624w);
        if (A03 == null) {
            c4s.A01 = true;
            return;
        }
        C01564p c01564p = (C01564p) A03.getLayoutParams();
        if (c4t.A08 == null) {
            if (this.A05 == (c4t.A05 == -1)) {
                A17(A03);
            } else {
                A19(A03, 0);
            }
        } else {
            boolean z = this.A05;
            int bottom = c4t.A05;
            if (z == (bottom == -1)) {
                A16(A03);
            } else {
                A18(A03, 0);
            }
        }
        A1A(A03, 0, 0);
        c4s.A00 = this.A04.A0D(A03);
        if (this.A00 == 1) {
            if (A2F()) {
                i2 = A0h() - A0f();
                i = i2 - this.A04.A0E(A03);
            } else {
                i = A0e();
                i2 = this.A04.A0E(A03) + i;
            }
            if (c4t.A05 == -1) {
                right = c4t.A06;
                A0g = c4t.A06 - c4s.A00;
            } else {
                A0g = c4t.A06;
                right = c4t.A06 + c4s.A00;
            }
        } else {
            A0g = A0g();
            right = this.A04.A0E(A03) + A0g;
            int bottom2 = c4t.A05;
            if (bottom2 == -1) {
                i2 = c4t.A06;
                int i3 = c4t.A06;
                int bottom3 = c4s.A00;
                i = i3 - bottom3;
            } else {
                i = c4t.A06;
                int i4 = c4t.A06;
                int bottom4 = c4s.A00;
                i2 = i4 + bottom4;
            }
        }
        A1B(A03, i, A0g, i2, right);
        if (c01564p.A02() || c01564p.A01()) {
            c4s.A03 = true;
        }
        c4s.A02 = A03.hasFocusable();
    }

    public void A2E(AnonymousClass53 anonymousClass53, C4T c4t, InterfaceC01534m interfaceC01534m) {
        int i = c4t.A01;
        if (i >= 0) {
            int pos = anonymousClass53.A03();
            if (i < pos) {
                int pos2 = c4t.A07;
                interfaceC01534m.A3S(i, Math.max(0, pos2));
            }
        }
    }

    public final boolean A2F() {
        return A0a() == 1;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass50
    public final PointF A4O(int i) {
        if (A0W() == 0) {
            return null;
        }
        int i2 = (i < A0p(A0t(0))) != this.A05 ? -1 : 1;
        int i3 = this.A00;
        int firstChildPos = A0G[0].length();
        if (firstChildPos == 7) {
            throw new RuntimeException();
        }
        A0G[5] = "5EjIyJt0kzQOvAP28HqeuGPqaebz9kN";
        if (i3 == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }
}

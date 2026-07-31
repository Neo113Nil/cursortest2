package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.nF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3591nF extends AbstractC2252Eh<C3591nF> {
    public static String[] A0H = {"VuHjt8oOpq8N7C214wGoSA1AvoAEOrJ7", "uFvhlxS5lUy9ksGg6O4Xt3y9x", "z2gekC5V6p56SAeTbAO0jRL35", "AJl44cd0wjf7yp80NhOEfrZac9uQkeAm", "fvb2kSFN69PWkoJ4Ln26XpHSuOzso8Xv", "xYIwGH1EqCgaa9qjZOqbWgZcWwFFG4Ev", "iW7gA0b6LPVcA0KpSRoleRmfzjbkINez", "mxsnKoNumrVzSuMZZmY48wO5LDc3OokM"};
    public final int A00;
    public final int A01;
    public final int A02;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public final int A03;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final C21369i A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public C3591nF(int i, C3741pg c3741pg, int i2, C21369i c21369i, int i3, String str, int i4, boolean z) {
        super(i, c3741pg, i2);
        int requiredAdaptiveSupport;
        int A00;
        int A07;
        this.A09 = c21369i;
        if (c21369i.A07) {
            requiredAdaptiveSupport = 24;
        } else {
            requiredAdaptiveSupport = 16;
        }
        this.A0A = c21369i.A06 && (i4 & requiredAdaptiveSupport) != 0;
        this.A0C = z && (super.A02.A0L == -1 || super.A02.A0L <= ((C3737pc) c21369i).A06) && ((super.A02.A0A == -1 || super.A02.A0A <= ((C3737pc) c21369i).A05) && ((super.A02.A01 == -1.0f || super.A02.A01 <= ((float) ((C3737pc) c21369i).A04)) && (super.A02.A05 == -1 || super.A02.A05 <= ((C3737pc) c21369i).A03)));
        this.A0D = z && (super.A02.A0L == -1 || super.A02.A0L >= ((C3737pc) c21369i).A0A) && ((super.A02.A0A == -1 || super.A02.A0A >= ((C3737pc) c21369i).A09) && ((super.A02.A01 == -1.0f || super.A02.A01 >= ((float) ((C3737pc) c21369i).A08)) && (super.A02.A05 == -1 || super.A02.A05 >= ((C3737pc) c21369i).A07)));
        this.A0E = C21359h.A0S(i3, false);
        int bestLanguageIndex = 0;
        int i5 = Integer.MAX_VALUE;
        int i6 = 0;
        while (true) {
            if (i6 >= c21369i.A0L.size()) {
                break;
            }
            int A02 = C21359h.A02(super.A02, c21369i.A0L.get(i6), false);
            if (A02 > 0) {
                i5 = i6;
                bestLanguageIndex = A02;
                break;
            }
            i6++;
        }
        this.A03 = i5;
        this.A04 = bestLanguageIndex;
        this.A00 = super.A02.A05;
        this.A02 = super.A02.A06();
        A00 = C21359h.A00(super.A02.A0E, ((C3737pc) c21369i).A0D);
        this.A06 = A00;
        this.A0B = super.A02.A0E == 0 || (super.A02.A0E & 1) != 0;
        this.A07 = C21359h.A02(super.A02, str, C21359h.A0K(str) == null);
        int i7 = Integer.MAX_VALUE;
        int i8 = 0;
        while (true) {
            if (i8 < c21369i.A0M.size()) {
                if (super.A02.A0W != null && super.A02.A0W.equals(c21369i.A0M.get(i8))) {
                    i7 = i8;
                    break;
                }
                i8++;
            } else {
                break;
            }
        }
        this.A05 = i7;
        this.A0G = AbstractC20907i.A02(i3) == 128;
        this.A0F = AbstractC20907i.A04(i3) == 64;
        A07 = C21359h.A07(super.A02.A0W);
        this.A01 = A07;
        this.A08 = A00(i3, requiredAdaptiveSupport);
    }

    private int A00(int i, int i2) {
        if ((super.A02.A0E & 16384) != 0 || !C21359h.A0S(i, this.A09.A0B)) {
            return 0;
        }
        if (!this.A0C && !this.A09.A0C) {
            return 0;
        }
        if (C21359h.A0S(i, false) && this.A0D && this.A0C && super.A02.A05 != -1 && !this.A09.A0N && !this.A09.A0O && (i & i2) != 0) {
            return 2;
        }
        return 1;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public static int A01(C3591nF c3591nF, C3591nF c3591nF2) {
        AbstractC3630ns A09 = AbstractC3630ns.A01().A09(c3591nF.A0E, c3591nF2.A0E).A08(Integer.valueOf(c3591nF.A03), Integer.valueOf(c3591nF2.A03), AbstractC3780qK.A03().A06()).A06(c3591nF.A04, c3591nF2.A04).A06(c3591nF.A06, c3591nF2.A06).A09(c3591nF.A0B, c3591nF2.A0B).A06(c3591nF.A07, c3591nF2.A07).A09(c3591nF.A0C, c3591nF2.A0C).A09(c3591nF.A0D, c3591nF2.A0D).A08(Integer.valueOf(c3591nF.A05), Integer.valueOf(c3591nF2.A05), AbstractC3780qK.A03().A06()).A09(c3591nF.A0G, c3591nF2.A0G).A09(c3591nF.A0F, c3591nF2.A0F);
        if (c3591nF.A0G && c3591nF.A0F) {
            int i = c3591nF.A01;
            int i2 = c3591nF2.A01;
            if (A0H[4].charAt(7) == 'c') {
                throw new RuntimeException();
            }
            A0H[4] = "L7q4oO3o2NLjefqLZehpujqtxzeKbA5O";
            A09 = A09.A06(i, i2);
        }
        int A05 = A09.A05();
        if (A0H[7].charAt(14) != 'M') {
            return A05;
        }
        A0H[0] = "TVm4CsN40i91TfwfawYUT3UYECpWhhhJ";
        return A05;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qK != com.google.common.collect.Ordering<java.lang.Integer> */
    public static int A02(C3591nF c3591nF, C3591nF c3591nF2) {
        AbstractC3780qK abstractC3780qK;
        AbstractC3780qK A06;
        AbstractC3780qK abstractC3780qK2;
        AbstractC3780qK abstractC3780qK3;
        if (!c3591nF.A0C || !c3591nF.A0E) {
            abstractC3780qK = C21359h.A09;
            A06 = abstractC3780qK.A06();
        } else {
            A06 = C21359h.A09;
        }
        AbstractC3630ns A01 = AbstractC3630ns.A01();
        Integer valueOf = Integer.valueOf(c3591nF.A00);
        Integer valueOf2 = Integer.valueOf(c3591nF2.A00);
        boolean z = c3591nF.A09.A0O;
        String[] strArr = A0H;
        if (strArr[6].charAt(5) == strArr[5].charAt(5)) {
            throw new RuntimeException();
        }
        A0H[4] = "07GlML0JAKsk4TXVd5GQtUxHkz6E2kCF";
        if (z) {
            abstractC3780qK3 = C21359h.A09;
            abstractC3780qK2 = abstractC3780qK3.A06();
        } else {
            abstractC3780qK2 = C21359h.A0A;
        }
        return A01.A08(valueOf, valueOf2, abstractC3780qK2).A08(Integer.valueOf(c3591nF.A02), Integer.valueOf(c3591nF2.A02), A06).A08(Integer.valueOf(c3591nF.A00), Integer.valueOf(c3591nF2.A00), A06).A05();
    }

    public static int A05(List<C3591nF> list, List<C3591nF> list2) {
        return AbstractC3630ns.A01().A08((C3591nF) Collections.max(list, new Comparator() { // from class: com.facebook.ads.redexgen.X.Ei
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A01;
                A01 = C3591nF.A01((C3591nF) obj, (C3591nF) obj2);
                return A01;
            }
        }), (C3591nF) Collections.max(list2, new Comparator() { // from class: com.facebook.ads.redexgen.X.Ei
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A01;
                A01 = C3591nF.A01((C3591nF) obj, (C3591nF) obj2);
                return A01;
            }
        }), new Comparator() { // from class: com.facebook.ads.redexgen.X.Ei
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A01;
                A01 = C3591nF.A01((C3591nF) obj, (C3591nF) obj2);
                return A01;
            }
        }).A06(list.size(), list2.size()).A08((C3591nF) Collections.max(list, new Comparator() { // from class: com.facebook.ads.redexgen.X.Ej
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A02;
                A02 = C3591nF.A02((C3591nF) obj, (C3591nF) obj2);
                return A02;
            }
        }), (C3591nF) Collections.max(list2, new Comparator() { // from class: com.facebook.ads.redexgen.X.Ej
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A02;
                A02 = C3591nF.A02((C3591nF) obj, (C3591nF) obj2);
                return A02;
            }
        }), new Comparator() { // from class: com.facebook.ads.redexgen.X.Ej
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A02;
                A02 = C3591nF.A02((C3591nF) obj, (C3591nF) obj2);
                return A02;
            }
        }).A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$VideoTrackInfo> */
    public static BP<C3591nF> A06(int pixelCount, C3741pg c3741pg, C21369i c21369i, int[] iArr, String str, int i) {
        int A03;
        A03 = C21359h.A03(c3741pg, ((C3737pc) c21369i).A0F, ((C3737pc) c21369i).A0E, c21369i.A0Q);
        C2K A01 = BP.A01();
        int i2 = 0;
        while (true) {
            int i3 = c3741pg.A01;
            String[] strArr = A0H;
            if (strArr[1].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0H;
            strArr2[6] = "2BgCu4KRvJ20zb7ljNDccj45OL5WeAVY";
            strArr2[5] = "2mW0v3SSZTDHEKi4uYotr9FneqRXRzcE";
            if (i2 < i3) {
                int A06 = c3741pg.A08(i2).A06();
                A01.A04(new C3591nF(pixelCount, c3741pg, i2, c21369i, iArr[i2], str, i, A03 == Integer.MAX_VALUE || (A06 != -1 && A06 <= A03)));
                i2++;
            } else {
                return A01.A05();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2252Eh
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C3591nF c3591nF) {
        if (this.A0A || C5C.A1E(super.A02.A0W, ((AbstractC2252Eh) c3591nF).A02.A0W)) {
            if (!this.A09.A05) {
                if (this.A0G == c3591nF.A0G) {
                    boolean z = this.A0F;
                    if (A0H[7].charAt(14) != 'M') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0H;
                    strArr[1] = "O482IHGDjbokfcz29RQKjL9l7";
                    strArr[2] = "cI8rqKrS6U71hTMAagWNF9taj";
                    if (z == c3591nF.A0F) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2252Eh
    public final int A08() {
        return this.A08;
    }
}

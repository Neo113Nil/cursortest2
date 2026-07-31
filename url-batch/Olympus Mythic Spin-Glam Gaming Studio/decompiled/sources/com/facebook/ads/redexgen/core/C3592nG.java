package com.facebook.ads.redexgen.core;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.nG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3592nG extends AbstractC2252Eh<C3592nG> implements Comparable<C3592nG> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A01(List<C3592nG> list, List<C3592nG> list2) {
        return list.get(0).compareTo(list2.get(0));
    }

    public C3592nG(int i, C3741pg c3741pg, int i2, C21369i c21369i, int i3, String str) {
        super(i, c3741pg, i2);
        List<String> list;
        int A00;
        int i4 = 0;
        this.A08 = C21359h.A0S(i3, false);
        int i5 = super.A02.A0H & (~((C3737pc) c21369i).A00);
        this.A06 = (i5 & 1) != 0;
        this.A07 = (i5 & 2) != 0;
        int i6 = Integer.MAX_VALUE;
        int bestLanguageScore = 0;
        if (c21369i.A0K.isEmpty()) {
            list = MetaExoPlayerCustomizedCollections.A03("");
        } else {
            list = c21369i.A0K;
        }
        int bestLanguageIndex = 0;
        while (true) {
            if (bestLanguageIndex >= list.size()) {
                break;
            }
            int A02 = C21359h.A02(super.A02, list.get(bestLanguageIndex), c21369i.A0P);
            if (A02 > 0) {
                i6 = bestLanguageIndex;
                bestLanguageScore = A02;
                break;
            }
            bestLanguageIndex++;
        }
        this.A00 = i6;
        this.A01 = bestLanguageScore;
        A00 = C21359h.A00(super.A02.A0E, ((C3737pc) c21369i).A0C);
        this.A02 = A00;
        this.A05 = (super.A02.A0E & 1088) != 0;
        this.A03 = C21359h.A02(super.A02, str, C21359h.A0K(str) == null);
        boolean z = this.A01 > 0 || (c21369i.A0K.isEmpty() && this.A02 > 0) || this.A06 || (this.A07 && this.A03 > 0);
        if (C21359h.A0S(i3, c21369i.A0B) && z) {
            i4 = 1;
        }
        this.A04 = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3592nG c3592nG) {
        AbstractC3630ns A06 = AbstractC3630ns.A01().A09(this.A08, c3592nG.A08).A08(Integer.valueOf(this.A00), Integer.valueOf(c3592nG.A00), AbstractC3780qK.A03().A06()).A06(this.A01, c3592nG.A01).A06(this.A02, c3592nG.A02).A09(this.A06, c3592nG.A06).A08(Boolean.valueOf(this.A07), Boolean.valueOf(c3592nG.A07), this.A01 == 0 ? AbstractC3780qK.A03() : AbstractC3780qK.A03().A06()).A06(this.A03, c3592nG.A03);
        if (this.A02 == 0) {
            A06 = A06.A0A(this.A05, c3592nG.A05);
        }
        return A06.A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TextTrackInfo> */
    public static BP<C3592nG> A02(int i, C3741pg c3741pg, C21369i c21369i, int[] iArr, String str) {
        C2K A01 = BP.A01();
        for (int i2 = 0; i2 < c3741pg.A01; i2++) {
            A01.A04(new C3592nG(i, c3741pg, i2, c21369i, iArr[i2], str));
        }
        return A01.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2252Eh
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C3592nG c3592nG) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2252Eh
    public final int A08() {
        return this.A04;
    }
}

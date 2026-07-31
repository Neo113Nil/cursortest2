package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.jH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3368jH implements InterfaceC2495Nt {
    public static String[] A07 = {"LaTcnwnUfzgLTffZJQ1IPucRbglpEgMo", "12hOZJfgSqwHBnuTqXHxpHxEQ0NbZO7A", "Dr9pHE3G5odEHWCsCqxBSNpdFpwa86Mh", "MDWd5GjifHIGoqp8wS2KmhLcZ8", "Ozio236b3SA3ZtX", "C3UkekSSOdUqAnfYGByVev7l4a4YpLBv", "Q070rE4WAmrDPncHn0R1JG2tySYrh7TO", ""};
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC3383jd A01;
    public final /* synthetic */ C3377jT A02;
    public final /* synthetic */ InterfaceC2495Nt A03;
    public final /* synthetic */ C2496Nu A04;
    public final /* synthetic */ C3218gi A05;
    public final /* synthetic */ EnumSet A06;

    public C3368jH(C2496Nu c2496Nu, C3218gi c3218gi, AbstractC3383jd abstractC3383jd, C3377jT c3377jT, int i, InterfaceC2495Nt interfaceC2495Nt, EnumSet enumSet) {
        this.A04 = c2496Nu;
        this.A05 = c3218gi;
        this.A01 = abstractC3383jd;
        this.A02 = c3377jT;
        this.A00 = i;
        this.A03 = interfaceC2495Nt;
        this.A06 = enumSet;
    }

    private final void A00() {
        if (this.A00 + 1 < this.A02.A23()) {
            this.A04.A0A(this.A05, this.A06, this.A02, this.A02.A27(this.A00 + 1), this.A00 + 1, this.A03);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2495Nt
    public final void ACo(AdError adError) {
        if (this.A00 == 0) {
            this.A03.ACo(adError);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2495Nt
    public final void ACp() {
        this.A05.A01().AJE(this.A01.A2E(), this.A02.A28());
        if (this.A00 == this.A02.A25()) {
            InterfaceC2495Nt interfaceC2495Nt = this.A03;
            String[] strArr = A07;
            if (strArr[5].charAt(13) != strArr[6].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "Mfrds6r17BKRZSfVfcuH4MZ0YR";
            strArr2[4] = "cdrsota1fCopt7F";
            interfaceC2495Nt.ACp();
        }
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2495Nt
    public final void AHY() {
        if (this.A00 == 0) {
            this.A03.AHY();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2495Nt
    public final void AKX() {
        if (this.A00 == 0) {
            this.A03.AKX();
        }
    }
}

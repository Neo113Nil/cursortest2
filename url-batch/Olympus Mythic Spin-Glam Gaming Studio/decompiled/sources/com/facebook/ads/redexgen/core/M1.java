package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network/classes2.dex */
public final class M1 extends AbstractC2566Qq<C2286Fq> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC2759Yh A03;
    public C3163fp A04;
    public String A05;
    public List<C3056e5> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC3383jd A08;
    public final C2624Sx A09;
    public final C3218gi A0A;
    public final VA A0B;
    public final UK A0C;
    public final Y2 A0D;
    public final C6X A0E;
    public final DZ A0F;

    public M1(C3218gi c3218gi, List<C3056e5> list, AbstractC3383jd abstractC3383jd, VA va, UK uk, InterfaceC2759Yh interfaceC2759Yh, String str, C6X c6x, DZ dz) {
        this.A0A = c3218gi;
        this.A0B = va;
        this.A0C = uk;
        this.A09 = uk.A14();
        this.A04 = uk.A1G();
        this.A0D = uk.A1E();
        this.A03 = interfaceC2759Yh;
        this.A08 = abstractC3383jd;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c6x;
        this.A0F = dz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2566Qq
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C2286Fq A0F(ViewGroup viewGroup, int i) {
        return new C2286Fq(AbstractC2898bW.A00(new C2934c6(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0R(this.A0F).A0N(this.A0C).A0U(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2566Qq
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(C2286Fq c2286Fq, int i) {
        C3056e5 c3056e5 = this.A06.get(i);
        c2286Fq.A0q(this.A04);
        c2286Fq.A0p(c3056e5, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2566Qq
    public final int A0B() {
        return this.A06.size();
    }

    public final void A0O(int i, int i2, int i3) {
        boolean needsUpdate = i != this.A00;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        if (needsUpdate) {
            A0G();
        }
    }

    public final void A0P(C3163fp c3163fp) {
        this.A04 = c3163fp;
    }
}

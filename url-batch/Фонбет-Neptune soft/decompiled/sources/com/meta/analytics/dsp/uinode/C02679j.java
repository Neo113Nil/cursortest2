package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.9j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02679j implements Comparable<C02679j> {
    public int A00;
    public long A01;
    public Object A02;
    public final A8 A03;

    public C02679j(A8 a8) {
        this.A03 = a8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C02679j c02679j) {
        Object obj = this.A02;
        if ((obj == null) != (c02679j.A02 == null)) {
            return obj != null ? -1 : 1;
        }
        if (obj == null) {
            return 0;
        }
        int i = this.A00 - c02679j.A00;
        if (i != 0) {
            return i;
        }
        int comparePeriodIndex = IF.A07(this.A01, c02679j.A01);
        return comparePeriodIndex;
    }

    public final void A01(int i, long j, Object obj) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
    }
}

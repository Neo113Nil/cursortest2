package com.meta.analytics.dsp.uinode;

import androidx.work.WorkRequest;

/* loaded from: assets/audience_network.dex */
public class XK implements C1 {
    public final /* synthetic */ XJ A00;

    public XK(XJ xj) {
        this.A00 = xj;
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final long A6r() {
        AbstractC0346Co abstractC0346Co;
        long j;
        abstractC0346Co = this.A00.A0B;
        j = this.A00.A07;
        return abstractC0346Co.A03(j);
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final C0 A7t(long granule) {
        AbstractC0346Co abstractC0346Co;
        long j;
        long A00;
        long j2;
        if (granule == 0) {
            j2 = this.A00.A09;
            return new C0(new C2(0L, j2));
        }
        abstractC0346Co = this.A00.A0B;
        long A04 = abstractC0346Co.A04(granule);
        XJ xj = this.A00;
        j = xj.A09;
        A00 = xj.A00(j, A04, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
        return new C0(new C2(granule, A00));
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final boolean A9I() {
        return true;
    }
}

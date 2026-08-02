package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import com.facebook.ads.AdError;

/* loaded from: assets/audience_network.dex */
public final class W1 implements InterfaceC0435Gp, HG<Object> {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public final Handler A06;
    public final InterfaceC0434Go A07;
    public final InterfaceC0448Hd A08;
    public final IA A09;

    public W1() {
        this(null, null, 1000000L, AdError.SERVER_ERROR_CODE, InterfaceC0448Hd.A00);
    }

    public W1(Handler handler, InterfaceC0434Go interfaceC0434Go, long j, int i, InterfaceC0448Hd interfaceC0448Hd) {
        this.A06 = handler;
        this.A07 = interfaceC0434Go;
        this.A09 = new IA(i);
        this.A08 = interfaceC0448Hd;
        this.A01 = j;
    }

    private void A01(int i, long j, long j2) {
        Handler handler = this.A06;
        if (handler != null && this.A07 != null) {
            handler.post(new Gz(this, i, j, j2));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0435Gp
    public final synchronized long A67() {
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.HG
    public final synchronized void AB1(Object obj, int i) {
        this.A02 += i;
    }

    @Override // com.meta.analytics.dsp.uinode.HG
    public final synchronized void ADO(Object obj) {
        AbstractC0445Ha.A04(this.A00 > 0);
        long nowMs = this.A08.A5T();
        int i = (int) (nowMs - this.A03);
        this.A05 += i;
        long j = this.A04;
        long j2 = this.A02;
        this.A04 = j + j2;
        if (i > 0) {
            this.A09.A03((int) Math.sqrt(j2), (8000 * j2) / i);
            if (this.A05 >= 2000 || this.A04 >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                this.A01 = (long) this.A09.A02(0.5f);
            }
        }
        A01(i, this.A02, this.A01);
        int sampleElapsedTimeMs = this.A00 - 1;
        this.A00 = sampleElapsedTimeMs;
        if (sampleElapsedTimeMs > 0) {
            this.A03 = nowMs;
        }
        this.A02 = 0L;
    }

    @Override // com.meta.analytics.dsp.uinode.HG
    public final synchronized void ADP(Object obj, C0444Gy c0444Gy) {
        if (this.A00 == 0) {
            this.A03 = this.A08.A5T();
        }
        this.A00++;
    }
}

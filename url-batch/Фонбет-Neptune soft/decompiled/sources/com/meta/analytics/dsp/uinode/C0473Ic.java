package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Ic, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0473Ic {
    public final Handler A00;
    public final InterfaceC0474Id A01;

    public C0473Ic(Handler handler, InterfaceC0474Id interfaceC0474Id) {
        this.A00 = interfaceC0474Id != null ? (Handler) AbstractC0445Ha.A01(handler) : null;
        this.A01 = interfaceC0474Id;
    }

    public final void A01(int i, int i2, int i3, float f) {
        if (this.A01 != null) {
            this.A00.post(new IZ(this, i, i2, i3, f));
        }
    }

    public final void A02(int i, long j) {
        if (this.A01 != null) {
            this.A00.post(new IY(this, i, j));
        }
    }

    public final void A03(Surface surface) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0471Ia(this, surface));
        }
    }

    public final void A04(Format format) {
        if (this.A01 != null) {
            this.A00.post(new IX(this, format));
        }
    }

    public final void A05(BC bc) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0472Ib(this, bc));
        }
    }

    public final void A06(BC bc) {
        if (this.A01 != null) {
            this.A00.post(new IV(this, bc));
        }
    }

    public final void A07(String str, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new IW(this, str, j, j2));
        }
    }
}

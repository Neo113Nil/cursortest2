package com.meta.analytics.dsp.uinode;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public class H4 extends IOException {
    public final int A00;
    public final C0444Gy A01;

    public H4(IOException iOException, C0444Gy c0444Gy, int i) {
        super(iOException);
        this.A01 = c0444Gy;
        this.A00 = i;
    }

    public H4(String str, C0444Gy c0444Gy, int i) {
        super(str);
        this.A01 = c0444Gy;
        this.A00 = i;
    }

    public H4(String str, IOException iOException, C0444Gy c0444Gy, int i) {
        super(str, iOException);
        this.A01 = c0444Gy;
        this.A00 = i;
    }
}

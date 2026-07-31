package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: assets/audience_network/classes2.dex */
public final class JD extends FrameLayout implements InterfaceC2760Yi {
    public static String[] A03 = {"wtXzJScKRPxajxCcdRbPmb0KadlxC", "7nKoFE8ui8VEpuvPlBMmVCUEP2sqkB6T", "33CWdOtYDTa7rzeiAlLBu", "lc", "strpzcWL7DajPBiGDWIDQH24h3nkF6Q8", "KD2NqWHNK6oFw2qGkV253wUFP2DdgfCk", "fVTYPEGDbO1sEyo8c0rX1ThQbYeRG1Ca", "mBAzb1XhvrptTGzmv2edBpTADNq"};
    public String A00;
    public final InterfaceC2759Yh A01;
    public final C3002dC A02;

    public JD(C3218gi c3218gi, InterfaceC2759Yh interfaceC2759Yh, C3002dC c3002dC, String str) {
        super(c3218gi);
        this.A02 = c3002dC;
        this.A01 = interfaceC2759Yh;
        this.A00 = str;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2760Yi
    public final void AAu(Intent intent, Bundle bundle, C2580Re c2580Re) {
        C3002dC.A0B().incrementAndGet();
        this.A02.A0V();
        YB.A0J(this.A02.A0O());
        addView(this.A02.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A01.A45(this, new RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2760Yi
    public final void AFA(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2760Yi
    public final void AFi(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2760Yi
    public final void AIv(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2760Yi
    public String getCurrentClientToken() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2760Yi
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2760Yi
    public final void onDestroy() {
        this.A02.A0U();
        if (this.A02.A0N() != null) {
            this.A02.A0N().AE2();
        }
        AtomicInteger A0B = C3002dC.A0B();
        String[] strArr = A03;
        if (strArr[7].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[7] = "U60adJ6O15pnx6aeoiW8dFURNXF";
        strArr2[0] = "aGZEm4xR2YGCAhvP8isAV9os5hRSz";
        A0B.decrementAndGet();
    }

    public void setListener(InterfaceC2759Yh interfaceC2759Yh) {
    }
}

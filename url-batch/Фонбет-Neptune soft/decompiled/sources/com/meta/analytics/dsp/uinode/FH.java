package com.meta.analytics.dsp.uinode;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public final class FH extends AbstractC0777Ub<C0967ag> {
    public static String[] A00 = {"ByMq6MLqhjUJsdWB3RBIp", "zuOr3", "msyHKBX3wHVeYE5obxbctQprcgEzI02t", "I3sOgeRwcNYGF4oixOV5Q17", "dcB", "ibtCqc8qysdz0E5AMIDmPhuL1XZA", "mNtKCg4kzaH6sXUtb2oDuqx2", "ObFvkEusatMYzjWaq72f4FkWXHrQjerH"};

    public FH(C0967ag c0967ag) {
        super(c0967ag);
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        C0889Yn c0889Yn;
        Handler handler;
        Runnable runnable;
        C0967ag A07 = A07();
        if (A07 == null) {
            return;
        }
        c0889Yn = A07.A08;
        String[] strArr = A00;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A00[5] = "SiVLKh";
        if (M5.A02(c0889Yn)) {
            A07.A07();
            return;
        }
        handler = A07.A05;
        runnable = A07.A0C;
        handler.postDelayed(runnable, 5000L);
    }
}

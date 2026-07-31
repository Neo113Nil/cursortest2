package io.bidmachine;

import android.content.Context;
import io.bidmachine.analytics.BidMachineAnalytics;
import io.bidmachine.internal.C6011f;
import io.bidmachine.protobuf.InitResponse;

/* loaded from: classes5.dex */
class i {
    i() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context) {
        try {
            BidMachineAnalytics.initialize(context);
        } catch (Throwable unused) {
        }
    }

    void a(Context context, String str, InitResponse initResponse, String str2) {
        C6011f.a(context, str, initResponse, str2);
    }
}

package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.adjust.sdk.Constants;

/* loaded from: classes10.dex */
public final class Fg extends ResultReceiver {
    public final C5699tg a;

    public Fg(Handler handler, C5699tg c5699tg) {
        super(handler);
        this.a = c5699tg;
    }

    public static void a(ResultReceiver resultReceiver, C5751vg c5751vg) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray(Constants.REFERRER, c5751vg == null ? null : c5751vg.a());
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            C5751vg c5751vg = null;
            try {
                byte[] byteArray = bundle.getByteArray(Constants.REFERRER);
                if (byteArray != null && byteArray.length != 0) {
                    c5751vg = new C5751vg(byteArray);
                }
            } catch (Throwable unused) {
            }
            this.a.a(c5751vg);
        }
    }
}

package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: classes9.dex */
public final class T6 extends ResultReceiver {
    public final S6 a;

    public T6(Handler handler, S6 s6) {
        super(handler);
        this.a = s6;
    }

    public static void a(ResultReceiver resultReceiver, C5427j4 c5427j4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            c5427j4.b(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.a.a(i, bundle);
    }

    public static void a(ResultReceiver resultReceiver, EnumC5213am enumC5213am, C5427j4 c5427j4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("startup_error_key_code", enumC5213am.a);
            c5427j4.b(bundle);
            resultReceiver.send(2, bundle);
        }
    }
}

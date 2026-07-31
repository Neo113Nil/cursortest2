package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CallSuper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes15.dex */
public class zzgbp extends Handler {
    public zzgbp() {
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        zza(message);
    }

    @CallSuper
    protected void zza(Message message) {
        super.dispatchMessage(message);
    }

    public zzgbp(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}

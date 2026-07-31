package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzfno implements Runnable {
    zzfno() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = zzfnr.zzc;
        if (handler != null) {
            handler2 = zzfnr.zzc;
            runnable = zzfnr.zzk;
            handler2.post(runnable);
            handler3 = zzfnr.zzc;
            runnable2 = zzfnr.zzl;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}

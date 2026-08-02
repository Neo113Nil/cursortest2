package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfmf implements Runnable {
    zzfmf() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = zzfmi.zzc;
        if (handler != null) {
            handler2 = zzfmi.zzc;
            runnable = zzfmi.zzd;
            handler2.post(runnable);
            handler3 = zzfmi.zzc;
            runnable2 = zzfmi.zze;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}

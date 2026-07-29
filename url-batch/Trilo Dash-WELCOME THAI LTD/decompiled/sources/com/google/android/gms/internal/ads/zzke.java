package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzke extends BroadcastReceiver {
    final /* synthetic */ zzkf zza;

    /* synthetic */ zzke(zzkf zzkfVar, zzkd zzkdVar) {
        this.zza = zzkfVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Handler handler;
        final zzkf zzkfVar = this.zza;
        handler = zzkfVar.zzb;
        handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkc
            @Override // java.lang.Runnable
            public final void run() {
                zzkf.this.zzh();
            }
        });
    }
}

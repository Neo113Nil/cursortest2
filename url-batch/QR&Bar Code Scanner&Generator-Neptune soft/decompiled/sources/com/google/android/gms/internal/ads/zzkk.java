package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzkk extends BroadcastReceiver {
    final /* synthetic */ zzkl zza;

    /* synthetic */ zzkk(zzkl zzklVar, zzkj zzkjVar) {
        this.zza = zzklVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Handler handler;
        final zzkl zzklVar = this.zza;
        handler = zzklVar.zzb;
        handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzki
            @Override // java.lang.Runnable
            public final void run() {
                zzkl.this.zzh();
            }
        });
    }
}

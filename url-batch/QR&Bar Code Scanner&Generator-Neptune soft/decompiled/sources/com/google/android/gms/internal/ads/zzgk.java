package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgk extends BroadcastReceiver implements Runnable {
    final /* synthetic */ zzgm zza;
    private final zzgl zzb;
    private final Handler zzc;

    public zzgk(zzgm zzgmVar, Handler handler, zzgl zzglVar) {
        this.zza = zzgmVar;
        this.zzc = handler;
        this.zzb = zzglVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.zzc.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}

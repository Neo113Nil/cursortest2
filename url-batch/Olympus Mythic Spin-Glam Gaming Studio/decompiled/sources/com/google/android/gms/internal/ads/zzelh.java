package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
final class zzelh extends TimerTask {
    final /* synthetic */ AlertDialog zza;
    final /* synthetic */ Timer zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.overlay.zzm zzc;

    zzelh(zzelp zzelpVar, AlertDialog alertDialog, Timer timer, com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza = alertDialog;
        this.zzb = timer;
        this.zzc = zzmVar;
        Objects.requireNonNull(zzelpVar);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zza.dismiss();
        this.zzb.cancel();
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzc;
        if (zzmVar != null) {
            zzmVar.zza();
        }
    }
}

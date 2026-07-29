package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzcgn implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcgv zzb;

    zzcgn(zzcgv zzcgvVar, MediaPlayer mediaPlayer) {
        this.zzb = zzcgvVar;
        this.zza = mediaPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcgw zzcgwVar;
        zzcgw zzcgwVar2;
        zzcgv.zzl(this.zzb, this.zza);
        zzcgv zzcgvVar = this.zzb;
        zzcgwVar = zzcgvVar.zzq;
        if (zzcgwVar != null) {
            zzcgwVar2 = zzcgvVar.zzq;
            zzcgwVar2.zzf();
        }
    }
}

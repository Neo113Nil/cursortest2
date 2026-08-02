package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzchu implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcic zzb;

    zzchu(zzcic zzcicVar, MediaPlayer mediaPlayer) {
        this.zzb = zzcicVar;
        this.zza = mediaPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcid zzcidVar;
        zzcid zzcidVar2;
        zzcic.zzl(this.zzb, this.zza);
        zzcic zzcicVar = this.zzb;
        zzcidVar = zzcicVar.zzr;
        if (zzcidVar != null) {
            zzcidVar2 = zzcicVar.zzr;
            zzcidVar2.zzf();
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzcfr extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzcfv zza;

    zzcfr(zzcfv zzcfvVar) {
        Objects.requireNonNull(zzcfvVar);
        this.zza = zzcfvVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        zzcfv zzcfvVar = this.zza;
        zzbjj zzbjjVar = new zzbjj(zzcfvVar.zzA(), zzcfvVar.zzB().afmaVersion);
        synchronized (zzcfvVar.zzz()) {
            try {
                com.google.android.gms.ads.internal.zzt.zzm();
                zzbjm.zza(zzcfvVar.zzC(), zzbjjVar);
            } catch (IllegalArgumentException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot config CSI reporter.", e);
            }
        }
    }
}

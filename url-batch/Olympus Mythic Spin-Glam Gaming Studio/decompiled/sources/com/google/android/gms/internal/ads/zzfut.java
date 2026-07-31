package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
final class zzfut implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzdx zzb;
    final /* synthetic */ zzfvd zzc;

    zzfut(zzfvd zzfvdVar, long j, com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        this.zza = j;
        this.zzb = zzdxVar;
        Objects.requireNonNull(zzfvdVar);
        this.zzc = zzfvdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String zzV;
        zzfvd zzfvdVar = this.zzc;
        if (zzfvdVar.zzN() != null) {
            long j = this.zza;
            zzV = zzfvd.zzV(this.zzb);
            int zzs = zzfvdVar.zzs();
            int zzt = zzfvdVar.zzt();
            String zzM = zzfvdVar.zzM();
            zzfvdVar.zzN().zzi(j, zzV, zzfvdVar.zzP(), zzs, zzt, zzM);
        }
    }
}

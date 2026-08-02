package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcdu {
    private final Clock zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzceu zzc;

    zzcdu(Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzceu zzceuVar) {
        this.zza = clock;
        this.zzb = zzgVar;
        this.zzc = zzceuVar;
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzao)).booleanValue()) {
            this.zzc.zzt();
        }
    }

    public final void zzb(int i, long j) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzan)).booleanValue()) {
            return;
        }
        if (j - this.zzb.zzf() < 0) {
            com.google.android.gms.ads.internal.util.zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzao)).booleanValue()) {
            this.zzb.zzK(i);
            this.zzb.zzL(j);
        } else {
            this.zzb.zzK(-1);
            this.zzb.zzL(j);
        }
        zza();
    }
}

package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
final class zzamo {
    public final zzamw zza;
    public final zzamz zzb;
    public final zzaht zzc;

    @Nullable
    public final zzahu zzd;
    public int zze;

    @Nullable
    private zzv zzf;

    public zzamo(zzamw zzamwVar, zzamz zzamzVar, zzaht zzahtVar) {
        this.zza = zzamwVar;
        this.zzb = zzamzVar;
        this.zzc = zzahtVar;
        this.zzd = "audio/true-hd".equals(zzamwVar.zzg.zzp) ? new zzahu() : null;
    }

    final /* synthetic */ zzv zza() {
        return this.zzf;
    }

    final /* synthetic */ void zzb(zzv zzvVar) {
        this.zzf = zzvVar;
    }
}

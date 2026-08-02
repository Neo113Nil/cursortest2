package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzlb extends zztw {
    private final zzcb zzc;

    zzlb(zzlc zzlcVar, zzcc zzccVar) {
        super(zzccVar);
        this.zzc = new zzcb();
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzcc
    public final zzca zzd(int i, zzca zzcaVar, boolean z) {
        zzca zzd = this.zzb.zzd(i, zzcaVar, z);
        if (this.zzb.zze(zzd.zzc, this.zzc, 0L).zzb()) {
            Object obj = zzcaVar.zza;
            Object obj2 = zzcaVar.zzb;
            int i2 = zzcaVar.zzc;
            long j = zzcaVar.zzd;
            long j2 = zzcaVar.zze;
            zzd.zzl(obj, obj2, i2, j, 0L, zzb.zza, true);
        } else {
            zzd.zzf = true;
        }
        return zzd;
    }
}

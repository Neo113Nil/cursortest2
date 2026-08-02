package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfad implements zzfgk {
    private final zzfaz zza;

    public zzfad(zzfaz zzfazVar) {
        this.zza = zzfazVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgk
    public final zzfzp zza(zzfgl zzfglVar) {
        zzfae zzfaeVar = (zzfae) zzfglVar;
        return ((zzfaa) this.zza).zzb(zzfaeVar.zzb, zzfaeVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfgk
    public final void zzb(zzffz zzffzVar) {
        zzffzVar.zza = ((zzfaa) this.zza).zza();
    }
}

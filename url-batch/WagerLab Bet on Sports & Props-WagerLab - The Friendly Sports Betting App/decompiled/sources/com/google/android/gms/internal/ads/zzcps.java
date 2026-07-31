package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzcps implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzcps(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        this.zza = zzhqgVar2;
        this.zzb = zzhqgVar3;
    }

    public static zzcps zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        return new zzcps(zzhqgVar, zzhqgVar2, zzhqgVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        boolean booleanValue = Boolean.valueOf(zzcpq.zza()).booleanValue();
        Object zzb = ((zzehd) this.zza).zzb();
        Object zzb2 = ((zzejc) this.zzb).zzb();
        if (true != booleanValue) {
            zzb = zzb2;
        }
        return (zzedz) zzb;
    }
}

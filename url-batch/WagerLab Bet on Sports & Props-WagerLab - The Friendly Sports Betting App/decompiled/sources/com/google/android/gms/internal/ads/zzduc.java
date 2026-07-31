package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzduc implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzduc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzduc zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzduc(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdub((zzdue) this.zza.zzb(), ((zzdua) this.zzb).zzb());
    }
}

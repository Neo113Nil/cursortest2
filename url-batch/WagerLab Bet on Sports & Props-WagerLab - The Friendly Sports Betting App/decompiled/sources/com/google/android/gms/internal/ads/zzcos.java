package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzcos implements zzhpx {
    private final zzcor zza;
    private final zzhqg zzb;

    private zzcos(zzcor zzcorVar, zzhqg zzhqgVar) {
        this.zza = zzcorVar;
        this.zzb = zzhqgVar;
    }

    public static zzcos zza(zzcor zzcorVar, zzhqg zzhqgVar) {
        return new zzcos(zzcorVar, zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return this.zza.zze(((zzhqj) this.zzb).zzb());
    }
}

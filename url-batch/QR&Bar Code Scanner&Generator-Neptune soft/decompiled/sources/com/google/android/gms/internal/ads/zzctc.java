package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzctc implements zzgxi {
    private final zzgxv zza;
    private final zzgxv zzb;

    public zzctc(zzgxv zzgxvVar, zzgxv zzgxvVar2) {
        this.zza = zzgxvVar;
        this.zzb = zzgxvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* synthetic */ Object zzb() {
        zzbuz zzbuzVar = new zzbuz();
        String str = (String) this.zzb.zzb();
        return ((Boolean) zzbkt.zza.zze()).booleanValue() ? new zzbuy(zzbuzVar, str) : new zzcgu(str);
    }
}

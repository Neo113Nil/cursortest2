package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdxg implements zzgxi {
    private final zzgxv zza;
    private final zzgxv zzb;
    private final zzgxv zzc;

    public zzdxg(zzgxv zzgxvVar, zzgxv zzgxvVar2, zzgxv zzgxvVar3) {
        this.zza = zzgxvVar;
        this.zzb = zzgxvVar2;
        this.zzc = zzgxvVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdxt zzdxtVar = (zzdxt) this.zza.zzb();
        zzfzq zzfzqVar = zzchc.zza;
        zzgxq.zzb(zzfzqVar);
        return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhs)).booleanValue() ? new zzdkg((zzefb) this.zzc.zzb(), zzfzqVar) : new zzdkg(zzdxtVar, zzfzqVar);
    }
}

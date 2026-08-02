package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdui implements zzgxi {
    private final zzgxv zza;
    private final zzgxv zzb;
    private final zzgxv zzc;

    public zzdui(zzgxv zzgxvVar, zzgxv zzgxvVar2, zzgxv zzgxvVar3) {
        this.zza = zzgxvVar;
        this.zzb = zzgxvVar2;
        this.zzc = zzgxvVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* synthetic */ Object zzb() {
        zzgxv zzgxvVar = this.zza;
        zzgxv zzgxvVar2 = this.zzb;
        int i = ((zzdcr) this.zzc).zza().zzo.zza;
        int i2 = i - 1;
        if (i != 0) {
            return i2 != 0 ? ((zzemc) zzgxvVar2).zzb() : ((zzemc) zzgxvVar).zzb();
        }
        throw null;
    }
}

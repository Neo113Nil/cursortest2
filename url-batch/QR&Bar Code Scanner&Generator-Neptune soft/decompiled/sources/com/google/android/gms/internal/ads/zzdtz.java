package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdtz implements zzbqk {
    private final zzdeh zza;
    private final zzcce zzb;
    private final String zzc;
    private final String zzd;

    public zzdtz(zzdeh zzdehVar, zzfdk zzfdkVar) {
        this.zza = zzdehVar;
        this.zzb = zzfdkVar.zzm;
        this.zzc = zzfdkVar.zzk;
        this.zzd = zzfdkVar.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    @ParametersAreNonnullByDefault
    public final void zza(zzcce zzcceVar) {
        int i;
        String str;
        zzcce zzcceVar2 = this.zzb;
        if (zzcceVar2 != null) {
            zzcceVar = zzcceVar2;
        }
        if (zzcceVar != null) {
            str = zzcceVar.zza;
            i = zzcceVar.zzb;
        } else {
            i = 1;
            str = "";
        }
        this.zza.zzd(new zzcbp(str, i), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zzb() {
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zzc() {
        this.zza.zzf();
    }
}

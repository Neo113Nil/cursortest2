package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdlq implements zzgxi {
    private final zzdlk zza;
    private final zzgxv zzb;
    private final zzgxv zzc;
    private final zzgxv zzd;
    private final zzgxv zze;

    public zzdlq(zzdlk zzdlkVar, zzgxv zzgxvVar, zzgxv zzgxvVar2, zzgxv zzgxvVar3, zzgxv zzgxvVar4) {
        this.zza = zzdlkVar;
        this.zzb = zzgxvVar;
        this.zzc = zzgxvVar2;
        this.zzd = zzgxvVar3;
        this.zze = zzgxvVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zzb.zzb();
        final zzcgv zza = ((zzcpc) this.zzc).zza();
        final zzfdk zza2 = ((zzczu) this.zzd).zza();
        final zzfef zza3 = ((zzdcr) this.zze).zza();
        return new zzdkg(new zzdeo() { // from class: com.google.android.gms.internal.ads.zzdlj
            @Override // com.google.android.gms.internal.ads.zzdeo
            public final void zzn() {
                com.google.android.gms.ads.internal.zzt.zzs().zzn(context, zza.zza, zza2.zzD.toString(), zza3.zzf);
            }
        }, zzchc.zzf);
    }
}

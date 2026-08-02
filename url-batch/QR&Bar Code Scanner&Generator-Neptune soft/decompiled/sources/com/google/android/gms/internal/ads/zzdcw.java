package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdcw implements zzgxi {
    private final zzdcv zza;
    private final zzgxv zzb;
    private final zzgxv zzc;
    private final zzgxv zzd;
    private final zzgxv zze;

    public zzdcw(zzdcv zzdcvVar, zzgxv zzgxvVar, zzgxv zzgxvVar2, zzgxv zzgxvVar3, zzgxv zzgxvVar4) {
        this.zza = zzdcvVar;
        this.zzb = zzgxvVar;
        this.zzc = zzgxvVar2;
        this.zzd = zzgxvVar3;
        this.zze = zzgxvVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.zzb.zzb();
        zzcgv zza = ((zzcpc) this.zzc).zza();
        zzfdk zza2 = ((zzczu) this.zzd).zza();
        zzcdm zzcdmVar = new zzcdm();
        if (zza2.zzB != null) {
            return new zzcdl(context, zza, zza2.zzB, zza2.zzt.zzb, zzcdmVar, null);
        }
        return null;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdcn implements zzgxi {
    private final zzdcm zza;
    private final zzgxv zzb;

    public zzdcn(zzdcm zzdcmVar, zzgxv zzgxvVar) {
        this.zza = zzdcmVar;
        this.zzb = zzgxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = this.zza.zza(((zzcos) this.zzb).zza());
        zzgxq.zzb(zza);
        return zza;
    }
}

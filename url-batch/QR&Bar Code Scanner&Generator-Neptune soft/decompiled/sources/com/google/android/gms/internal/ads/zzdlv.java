package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdlv implements zzgxi {
    private final zzdlk zza;
    private final zzgxv zzb;

    public zzdlv(zzdlk zzdlkVar, zzgxv zzgxvVar) {
        this.zza = zzdlkVar;
        this.zzb = zzgxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzf = this.zza.zzf((zzdca) this.zzb.zzb());
        zzgxq.zzb(zzf);
        return zzf;
    }
}

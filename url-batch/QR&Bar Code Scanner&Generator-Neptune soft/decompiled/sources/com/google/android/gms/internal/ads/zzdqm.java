package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdqm implements zzddu {
    private final zzdoq zza;
    private final zzdov zzb;

    public zzdqm(zzdoq zzdoqVar, zzdov zzdovVar) {
        this.zza = zzdoqVar;
        this.zzb = zzdovVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zzl() {
        zzdoq zzdoqVar = this.zza;
        if (zzdoqVar.zzu() == null) {
            return;
        }
        zzcmp zzq = zzdoqVar.zzq();
        zzcmp zzr = zzdoqVar.zzr();
        if (zzq == null) {
            zzq = zzr == null ? null : zzr;
        }
        if (!this.zzb.zzd() || zzq == null) {
            return;
        }
        zzq.zzd("onSdkImpression", new ArrayMap());
    }
}

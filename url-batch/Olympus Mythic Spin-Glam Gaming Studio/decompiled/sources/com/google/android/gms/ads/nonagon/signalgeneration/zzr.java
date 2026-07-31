package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzdmi;
import com.google.android.gms.internal.ads.zzeae;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzr implements zzdmi {
    private final zzeae zza;
    private final zzq zzb;
    private final String zzc;

    @VisibleForTesting
    public zzr(zzeae zzeaeVar, zzq zzqVar, String str) {
        this.zza = zzeaeVar;
        this.zzb = zzqVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdmi
    public final void zzd(@Nullable zzbc zzbcVar) {
        if (zzbcVar == null) {
            return;
        }
        this.zzb.zza(this.zzc, zzbcVar.zzb, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdmi
    public final void zze(@Nullable String str) {
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzeuh implements zzeup {
    final /* synthetic */ zzeui zza;

    zzeuh(zzeui zzeuiVar) {
        Objects.requireNonNull(zzeuiVar);
        this.zza = zzeuiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final void zza() {
        zzeui zzeuiVar = this.zza;
        synchronized (zzeuiVar) {
            zzeuiVar.zzM(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeui zzeuiVar = this.zza;
        zzdmx zzdmxVar = (zzdmx) obj;
        synchronized (zzeuiVar) {
            zzeuiVar.zzM(zzdmxVar);
            zzeuiVar.zzL().zzj();
        }
    }
}

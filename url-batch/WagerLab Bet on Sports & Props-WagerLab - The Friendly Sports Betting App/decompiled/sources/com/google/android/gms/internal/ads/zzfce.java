package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzfce implements zzelx {
    final /* synthetic */ zzfcg zza;

    zzfce(zzfcg zzfcgVar) {
        Objects.requireNonNull(zzfcgVar);
        this.zza = zzfcgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final void zza() {
        zzfcg zzfcgVar = this.zza;
        synchronized (zzfcgVar) {
            zzfcgVar.zzx(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfcg zzfcgVar = this.zza;
        zzdom zzdomVar = (zzdom) obj;
        synchronized (zzfcgVar) {
            zzfcgVar.zzx(zzdomVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdX)).booleanValue()) {
                zzdomVar.zzh().zza = zzfcgVar.zzv();
            }
            zzfcgVar.zzw().zzj();
        }
    }
}

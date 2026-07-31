package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzfkg extends com.google.android.gms.ads.internal.client.zzbm {
    final /* synthetic */ zzgpm zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzbx zzb;
    final /* synthetic */ zzfkh zzc;

    zzfkg(zzfkh zzfkhVar, zzgpm zzgpmVar, com.google.android.gms.ads.internal.client.zzbx zzbxVar) {
        this.zza = zzgpmVar;
        this.zzb = zzbxVar;
        Objects.requireNonNull(zzfkhVar);
        this.zzc = zzfkhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzb() {
        Objects.requireNonNull(this.zzc);
        zzfjy.zza(this.zzb, this.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        String adError = zzeVar.zzb().toString();
        zzfkh zzfkhVar = this.zzc;
        String str = zzfkhVar.zze.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(adError).length() + 57 + String.valueOf(str).length());
        sb.append("Failed to load interstitial ad with error: ");
        sb.append(adError);
        sb.append(" for ad unit: ");
        sb.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        Objects.requireNonNull(zzfkhVar);
        zzfkhVar.zzv(zzeVar);
    }
}

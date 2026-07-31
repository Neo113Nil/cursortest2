package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzfkd extends zzbad {
    final /* synthetic */ zzgpm zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzft zzb;
    final /* synthetic */ zzfke zzc;

    zzfkd(zzfke zzfkeVar, zzgpm zzgpmVar, com.google.android.gms.ads.internal.client.zzft zzftVar) {
        this.zza = zzgpmVar;
        this.zzb = zzftVar;
        Objects.requireNonNull(zzfkeVar);
        this.zzc = zzfkeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final void zzb(zzbab zzbabVar) {
        Objects.requireNonNull(this.zzc);
        zzfjy.zza(zzbabVar, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final void zzc(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        String adError = zzeVar.zzb().toString();
        String str = this.zzb.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(adError).length() + 60 + String.valueOf(str).length());
        sb.append("Failed to load app open ad with error parcel: ");
        sb.append(adError);
        sb.append(" for ad unit: ");
        sb.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        zzfke zzfkeVar = this.zzc;
        Objects.requireNonNull(zzfkeVar);
        zzfkeVar.zzv(zzeVar);
    }
}

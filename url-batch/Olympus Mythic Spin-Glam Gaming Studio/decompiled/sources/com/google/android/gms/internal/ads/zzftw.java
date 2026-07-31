package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final class zzftw extends zzbhb {

    @Nullable
    private zzftr zza;

    @Nullable
    private String zzb;

    zzftw(zzftr zzftrVar, String str) {
        this.zza = zzftrVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zza(zzbgz zzbgzVar) {
        zzftr zzftrVar = this.zza;
        if (zzftrVar == null) {
            return;
        }
        zzftrVar.zza(zzbgzVar);
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzb(int i) {
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzftr zzftrVar = this.zza;
        if (zzftrVar == null) {
            return;
        }
        String obj = zzeVar.zzb().toString();
        String str = this.zzb;
        StringBuilder sb = new StringBuilder(obj.length() + 60 + String.valueOf(str).length());
        sb.append("Failed to load app open ad with error parcel: ");
        sb.append(obj);
        sb.append(" for ad unit: ");
        sb.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        ((zzfuq) zzftrVar).zza.zzI(zzeVar);
        this.zza = null;
        this.zzb = null;
    }
}

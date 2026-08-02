package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfjg implements zzdjx, zzddq, zzdkb {
    private final zzfju zza;
    private final zzfjj zzb;

    zzfjg(Context context, zzfju zzfjuVar) {
        this.zza = zzfjuVar;
        this.zzb = zzfji.zza(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzdkb
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkb
    public final void zzb() {
        if (((Boolean) zzbkl.zzd.zze()).booleanValue()) {
            zzfju zzfjuVar = this.zza;
            zzfjj zzfjjVar = this.zzb;
            zzfjjVar.zze(true);
            zzfjuVar.zza(zzfjjVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjx
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjx
    public final void zzg() {
        if (((Boolean) zzbkl.zzd.zze()).booleanValue()) {
            this.zzb.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbkl.zzd.zze()).booleanValue()) {
            zzfju zzfjuVar = this.zza;
            zzfjj zzfjjVar = this.zzb;
            zzfjjVar.zze(false);
            zzfjuVar.zza(zzfjjVar);
        }
    }
}

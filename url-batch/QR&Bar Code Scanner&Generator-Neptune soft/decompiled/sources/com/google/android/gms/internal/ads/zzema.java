package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzema implements zzdej {
    boolean zza = false;
    final /* synthetic */ zzehf zzb;
    final /* synthetic */ zzchh zzc;
    final /* synthetic */ zzemb zzd;

    zzema(zzemb zzembVar, zzehf zzehfVar, zzchh zzchhVar) {
        this.zzd = zzembVar;
        this.zzb = zzehfVar;
        this.zzc = zzchhVar;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeB)).booleanValue()) {
            i = 3;
        }
        this.zzc.zze(new zzehg(i, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final synchronized void zza(int i) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i, zzemb.zze(this.zzb.zza, i), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final synchronized void zzc(int i, String str) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        if (str == null) {
            str = zzemb.zze(this.zzb.zza, i);
        }
        zze(new com.google.android.gms.ads.internal.client.zze(i, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final synchronized void zzd() {
        this.zzc.zzd(null);
    }
}

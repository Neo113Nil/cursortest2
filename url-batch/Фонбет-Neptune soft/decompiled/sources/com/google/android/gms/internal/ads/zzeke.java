package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzeke implements zzcxz {
    boolean zza = false;
    final /* synthetic */ zzeew zzb;
    final /* synthetic */ zzbzt zzc;

    zzeke(zzekf zzekfVar, zzeew zzeewVar, zzbzt zzbztVar) {
        this.zzb = zzeewVar;
        this.zzc = zzbztVar;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzeQ)).booleanValue()) {
            i = 3;
        }
        this.zzc.zzd(new zzeex(i, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcxz
    public final synchronized void zza(int i) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i, zzekf.zze(this.zzb.zza, i), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcxz
    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcxz
    public final synchronized void zzc(int i, String str) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        if (str == null) {
            str = zzekf.zze(this.zzb.zza, i);
        }
        zze(new com.google.android.gms.ads.internal.client.zze(i, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcxz
    public final synchronized void zzd() {
        this.zzc.zzc(null);
    }
}

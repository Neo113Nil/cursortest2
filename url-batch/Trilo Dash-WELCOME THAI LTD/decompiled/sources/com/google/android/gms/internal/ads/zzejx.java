package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzejx implements zzddb {
    boolean zza = false;
    final /* synthetic */ zzefb zzb;
    final /* synthetic */ zzcga zzc;
    final /* synthetic */ zzejy zzd;

    zzejx(zzejy zzejyVar, zzefb zzefbVar, zzcga zzcgaVar) {
        this.zzd = zzejyVar;
        this.zzb = zzefbVar;
        this.zzc = zzcgaVar;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzeu)).booleanValue()) {
            i = 3;
        }
        this.zzc.zze(new zzefc(i, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final synchronized void zza(int i) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i, zzejy.zze(this.zzb.zza, i), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final synchronized void zzc(int i, String str) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        if (str == null) {
            str = zzejy.zze(this.zzb.zza, i);
        }
        zze(new com.google.android.gms.ads.internal.client.zze(i, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final synchronized void zzd() {
        this.zzc.zzd(null);
    }
}

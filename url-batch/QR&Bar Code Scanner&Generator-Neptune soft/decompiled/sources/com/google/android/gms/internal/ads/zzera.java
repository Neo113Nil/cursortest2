package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzera implements zzeve {
    private static final Object zza = new Object();
    private final String zzb;
    private final String zzc;
    private final zzdar zzd;
    private final zzffk zze;
    private final zzfef zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzg = com.google.android.gms.ads.internal.zzt.zzo().zzh();
    private final zzdxl zzh;

    public zzera(String str, String str2, zzdar zzdarVar, zzffk zzffkVar, zzfef zzfefVar, zzdxl zzdxlVar) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzdarVar;
        this.zze = zzffkVar;
        this.zzf = zzfefVar;
        this.zzh = zzdxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgD)).booleanValue()) {
            this.zzh.zza().put("seq_num", this.zzb);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeH)).booleanValue()) {
            this.zzd.zzg(this.zzf.zzd);
            bundle.putAll(this.zze.zzb());
        }
        return zzfzg.zzi(new zzevd() { // from class: com.google.android.gms.internal.ads.zzeqz
            @Override // com.google.android.gms.internal.ads.zzevd
            public final void zzf(Object obj) {
                zzera.this.zzc(bundle, (Bundle) obj);
            }
        });
    }

    final /* synthetic */ void zzc(Bundle bundle, Bundle bundle2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeH)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeG)).booleanValue()) {
                synchronized (zza) {
                    this.zzd.zzg(this.zzf.zzd);
                    bundle2.putBundle("quality_signals", this.zze.zzb());
                }
            } else {
                this.zzd.zzg(this.zzf.zzd);
                bundle2.putBundle("quality_signals", this.zze.zzb());
            }
        }
        bundle2.putString("seq_num", this.zzb);
        if (this.zzg.zzP()) {
            return;
        }
        bundle2.putString("session_id", this.zzc);
    }
}

package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzemh implements com.google.android.gms.ads.internal.zzf {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzdcy zzb;
    private final zzdds zzc;
    private final zzdkp zzd;
    private final zzdki zze;
    private final zzcvk zzf;

    zzemh(zzdcy zzdcyVar, zzdds zzddsVar, zzdkp zzdkpVar, zzdki zzdkiVar, zzcvk zzcvkVar) {
        this.zzb = zzdcyVar;
        this.zzc = zzddsVar;
        this.zzd = zzdkpVar;
        this.zze = zzdkiVar;
        this.zzf = zzcvkVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzl();
            this.zze.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}

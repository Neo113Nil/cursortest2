package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzckt extends com.google.android.gms.ads.internal.util.zzb {
    final zzciy zza;
    final zzclb zzb;
    private final String zzc;
    private final String[] zzd;

    zzckt(zzciy zzciyVar, zzclb zzclbVar, String str, String[] strArr) {
        this.zza = zzciyVar;
        this.zzb = zzclbVar;
        this.zzc = str;
        this.zzd = strArr;
        com.google.android.gms.ads.internal.zzt.zzy().zzb(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.zzb.zzr(this.zzc, this.zzd);
        } finally {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcks(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final zzfzp zzb() {
        return (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbK)).booleanValue() && (this.zzb instanceof zzclk)) ? zzchc.zze.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzckr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzckt.this.zzd();
            }
        }) : super.zzb();
    }

    final /* synthetic */ Boolean zzd() throws Exception {
        return Boolean.valueOf(this.zzb.zzs(this.zzc, this.zzd, this));
    }

    public final String zze() {
        return this.zzc;
    }
}

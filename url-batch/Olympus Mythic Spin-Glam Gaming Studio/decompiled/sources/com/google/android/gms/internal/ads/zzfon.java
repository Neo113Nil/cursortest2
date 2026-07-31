package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzfon {
    private final zzfof zza;
    private final ListenableFuture zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfon(final zzfnl zzfnlVar, final zzfoe zzfoeVar, final zzfof zzfofVar) {
        this.zza = zzfofVar;
        this.zzb = zzhcy.zzh(zzhcy.zzj(zzfoeVar.zza(zzfofVar), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzfom
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzfon.this.zzc(zzfoeVar, zzfnlVar, zzfofVar, (zzfnu) obj);
            }
        }, zzfofVar.zza()), Exception.class, new zzhcg() { // from class: com.google.android.gms.internal.ads.zzfok
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzfon.this.zzd(zzfoeVar, (Exception) obj);
            }
        }, zzfofVar.zza());
    }

    public final synchronized void zza(zzhcv zzhcvVar) {
        zzfof zzfofVar = this.zza;
        zzhcy.zzr(zzhcy.zzj(this.zzb, zzfol.zza, zzfofVar.zza()), zzhcvVar, zzfofVar.zza());
    }

    public final synchronized ListenableFuture zzb(zzfof zzfofVar) {
        if (!this.zzd && !this.zzc) {
            zzfof zzfofVar2 = this.zza;
            if (zzfofVar2.zzb() != null && zzfofVar.zzb() != null && zzfofVar2.zzb().equals(zzfofVar.zzb())) {
                this.zzc = true;
                return this.zzb;
            }
        }
        return null;
    }

    final /* synthetic */ ListenableFuture zzc(zzfoe zzfoeVar, zzfnl zzfnlVar, zzfof zzfofVar, zzfnu zzfnuVar) {
        ListenableFuture zza;
        synchronized (this) {
            try {
                this.zzd = true;
                zzfoeVar.zzb(zzfnuVar);
                if (this.zzc) {
                    zza = zzhcy.zza(new zzfod(zzfnuVar, zzfofVar));
                } else {
                    zzfnlVar.zzb(zzfofVar.zzb(), zzfnuVar);
                    zza = zzhcy.zza(null);
                }
            } finally {
            }
        }
        return zza;
    }

    final /* synthetic */ ListenableFuture zzd(zzfoe zzfoeVar, Exception exc) {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }
}

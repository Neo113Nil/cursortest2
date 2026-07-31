package com.google.android.gms.internal.ads;

import androidx.collection.SieveCacheKt;
import androidx.media3.common.C;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzaba {
    private final zzaau zza;
    private final zzaav zzf;
    private long zzk;
    private final zzzu zzl;
    private final zzaas zzb = new zzaas();
    private final zzek zzc = new zzek(10);
    private final zzek zzd = new zzek(10);
    private final zzdu zze = new zzdu(16);
    private long zzg = C.TIME_UNSET;
    private zzbu zzj = zzbu.zza;
    private long zzh = C.TIME_UNSET;
    private long zzi = C.TIME_UNSET;

    public zzaba(zzzu zzzuVar, zzaau zzaauVar, zzaav zzaavVar) {
        this.zzl = zzzuVar;
        this.zza = zzaauVar;
        this.zzf = zzaavVar;
    }

    private static Object zzh(zzek zzekVar) {
        zzghc.zza(zzekVar.zzc() > 0);
        while (zzekVar.zzc() > 1) {
            zzekVar.zzd();
        }
        Object zzd = zzekVar.zzd();
        zzd.getClass();
        return zzd;
    }

    public final void zza() {
        this.zze.zze();
        this.zzg = C.TIME_UNSET;
        this.zzh = C.TIME_UNSET;
        this.zzi = C.TIME_UNSET;
        zzek zzekVar = this.zzd;
        if (zzekVar.zzc() > 0) {
            this.zzk = ((Long) zzh(zzekVar)).longValue();
        }
        zzek zzekVar2 = this.zzc;
        if (zzekVar2.zzc() > 0) {
            zzekVar2.zza(0L, (zzbu) zzh(zzekVar2));
        }
    }

    public final void zzb(long j, long j2) throws zzhz {
        while (true) {
            zzdu zzduVar = this.zze;
            if (zzduVar.zzd()) {
                return;
            }
            zzek zzekVar = this.zzd;
            long zzc = zzduVar.zzc();
            Long l = (Long) zzekVar.zze(zzc);
            if (l != null && l.longValue() != this.zzk) {
                this.zzk = l.longValue();
                this.zza.zza(2);
            }
            zzaau zzaauVar = this.zza;
            long j3 = this.zzk;
            zzaas zzaasVar = this.zzb;
            int zzk = zzaauVar.zzk(zzc, j, j2, j3, false, false, zzaasVar);
            if (zzk != 5 && zzk != 4) {
                this.zzf.zza(zzc, zzaasVar.zza());
            }
            if (zzk == 0 || zzk == 1) {
                this.zzh = zzc;
                long zzb = zzduVar.zzb();
                zzbu zzbuVar = (zzbu) this.zzc.zze(zzb);
                if (zzbuVar != null && !zzbuVar.equals(zzbu.zza) && !zzbuVar.equals(this.zzj)) {
                    this.zzj = zzbuVar;
                    this.zzl.zza(zzbuVar);
                }
                this.zzl.zzb(zzk == 0 ? System.nanoTime() : zzaasVar.zzb(), zzb, zzaauVar.zzf());
            } else if (zzk == 2 || zzk == 3) {
                this.zzh = zzc;
                zzduVar.zzb();
                final zzzu zzzuVar = this.zzl;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzzs
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzzu.this.zza.zzB().zzc();
                    }
                };
                zzzv zzzvVar = zzzuVar.zza;
                zzzvVar.zzC().execute(runnable);
                ((zzabp) zzzvVar.zzz().remove()).zzb();
            } else if (zzk != 4) {
                return;
            } else {
                this.zzh = zzc;
            }
        }
    }

    public final void zzc(int i, int i2) {
        long j = this.zzg;
        this.zzc.zza(j == C.TIME_UNSET ? 0L : j + 1, new zzbu(i, i2, 1.0f));
    }

    public final void zzd(int i, long j) {
        if (this.zze.zzd()) {
            this.zza.zza(i);
            this.zzk = j;
        } else {
            zzek zzekVar = this.zzd;
            long j2 = this.zzg;
            zzekVar.zza(j2 == C.TIME_UNSET ? SieveCacheKt.NodeMetaMask : j2 + 1, Long.valueOf(j));
        }
    }

    public final void zze(long j) {
        this.zze.zza(j);
        this.zzg = j;
        this.zzi = C.TIME_UNSET;
    }

    public final void zzf() {
        long j = this.zzg;
        if (j == C.TIME_UNSET) {
            j = Long.MIN_VALUE;
            this.zzg = Long.MIN_VALUE;
            this.zzh = Long.MIN_VALUE;
        }
        this.zzi = j;
    }

    public final boolean zzg() {
        long j = this.zzi;
        return j != C.TIME_UNSET && this.zzh == j;
    }
}

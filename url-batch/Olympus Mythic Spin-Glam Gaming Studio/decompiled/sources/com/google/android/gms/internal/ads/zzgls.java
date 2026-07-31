package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzgls {
    private final zzgpx zza;
    private final zzgni zzb;
    private final zzgnz zzc;
    private final zzgrh zzd;
    private final zzgfo zze;
    private final boolean zzf;
    private final long zzg;
    private final long zzh;

    zzgls(zzgpx zzgpxVar, zzgni zzgniVar, zzgnz zzgnzVar, zzgrh zzgrhVar, zzgfo zzgfoVar, boolean z, long j, long j2) {
        this.zza = zzgpxVar;
        this.zzb = zzgniVar;
        this.zzc = zzgnzVar;
        this.zzd = zzgrhVar;
        this.zze = zzgfoVar;
        this.zzf = z;
        this.zzg = j;
        this.zzh = j2;
    }

    private final ListenableFuture zzh(final int i) {
        zzhcq zzhcqVar = (zzhcq) zzhcy.zzg((zzhcq) zzhcy.zzg((zzhcq) zzhcy.zzg((zzhcq) zzhcy.zzk((zzhcq) zzhcy.zzj((zzhcq) zzhcy.zzk(zzhcq.zzw(this.zzb.zza()), new zzgub() { // from class: com.google.android.gms.internal.ads.zzglj
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                zzggr zzggrVar = (zzggr) obj;
                zzgls.this.zzd(zzggrVar);
                return zzggrVar;
            }
        }, zzhdp.zza()), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzglk
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgls.this.zze((zzggr) obj);
            }
        }, zzhdp.zza()), zzgll.zza, zzhdp.zza()), zzgle.class, zzglm.zza, zzhdp.zza()), zzglf.class, zzgln.zza, zzhdp.zza()), zzgld.class, new zzgub() { // from class: com.google.android.gms.internal.ads.zzglo
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                return zzgls.this.zzf(i, (zzgld) obj);
            }
        }, zzhdp.zza());
        this.zzd.zze(1002, zzhcqVar);
        return zzhcqVar;
    }

    final void zza(long j) {
        if (j > 0) {
            this.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzglq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgls.this.zzb();
                }
            }, j);
        } else {
            zzb();
        }
    }

    final ListenableFuture zzb() {
        zzhcq zzhcqVar = (zzhcq) zzhcy.zzg(zzhcq.zzw(this.zzc.zzb()), Throwable.class, zzglh.zza, zzhdp.zza());
        final zzgpx zzgpxVar = this.zza;
        Objects.requireNonNull(zzgpxVar);
        return (zzhcq) zzhcy.zzj((zzhcq) zzhcy.zzk(zzhcqVar, new zzgub() { // from class: com.google.android.gms.internal.ads.zzglg
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                return new Boolean(zzgpx.this.zza((zzggt) obj));
            }
        }, zzhdp.zza()), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzgli
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgls.this.zzc((Boolean) obj);
            }
        }, zzhdp.zza());
    }

    final /* synthetic */ ListenableFuture zzc(Boolean bool) {
        if (bool.booleanValue()) {
            return zzh(0);
        }
        this.zzd.zzb(1003);
        return zzhcy.zza(zzglr.RESULT_NOOP_LOCAL_PROGRAM_STILL_VALID);
    }

    final /* synthetic */ zzggr zzd(zzggr zzggrVar) {
        int zzj = zzggrVar.zzj() - 1;
        if (zzj == 1 || zzj == 2) {
            return zzggrVar;
        }
        if (zzj == 3) {
            zzgrh zzgrhVar = this.zzd;
            int zzj2 = zzggrVar.zzj() - 1;
            StringBuilder sb = new StringBuilder(String.valueOf(zzj2).length());
            sb.append(zzj2);
            zzgrhVar.zzc(1004, sb.toString());
            throw new zzglf(zzggrVar.zzj() - 1);
        }
        if (zzj != 12) {
            zzgrh zzgrhVar2 = this.zzd;
            int zzj3 = zzggrVar.zzj() - 1;
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzj3).length());
            sb2.append(zzj3);
            zzgrhVar2.zzc(1005, sb2.toString());
            throw new zzgle(zzggrVar.zzj() - 1);
        }
        zzgrh zzgrhVar3 = this.zzd;
        int zzj4 = zzggrVar.zzj() - 1;
        StringBuilder sb3 = new StringBuilder(String.valueOf(zzj4).length());
        sb3.append(zzj4);
        zzgrhVar3.zzc(1005, sb3.toString());
        throw new zzgld(zzggrVar.zzj() - 1);
    }

    final /* synthetic */ ListenableFuture zze(zzggr zzggrVar) {
        if (zzggrVar.zzj() == 2) {
            return this.zzc.zzd(zzggrVar.zza(), zzggrVar.zzb().zzA());
        }
        if (zzggrVar.zzj() == 3) {
            return this.zzc.zzc(zzggrVar.zza(), zzggrVar.zzc().zzA(), zzggrVar.zzb().zzA());
        }
        throw new AssertionError("Unreachable");
    }

    final /* synthetic */ zzglr zzf(final int i, zzgld zzgldVar) {
        if (this.zzf && i < this.zzg) {
            this.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzglp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgls.this.zzg(i);
                }
            }, this.zzh * ((long) Math.pow(2.0d, i)));
        }
        return zzglr.RESULT_FAILURE_FETCHER_HTTP_RUNTIME_EXCEPTION;
    }

    final /* synthetic */ void zzg(int i) {
        zzh(i + 1);
    }
}

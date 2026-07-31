package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzgce implements zzgbx {
    private final Context zza;
    private final zzhpr zzb;
    private final zzgcg zzc;
    private final zzgea zzd;
    private final ExecutorService zze;
    private final zzgbm zzf;
    private final zzfoh zzg;

    zzgce(Context context, zzhpr zzhprVar, zzgcg zzgcgVar, zzgea zzgeaVar, ExecutorService executorService, zzgbm zzgbmVar, zzfoh zzfohVar) {
        this.zza = context;
        this.zzb = zzhprVar;
        this.zzc = zzgcgVar;
        this.zzd = zzgeaVar;
        this.zze = executorService;
        this.zzf = zzgbmVar;
        this.zzg = zzfohVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfwk zzf(int i) {
        zzfwj zzd = zzfwk.zzd();
        zzd.zzd(i);
        return (zzfwk) zzd.zzbu();
    }

    @Override // com.google.android.gms.internal.ads.zzgbx
    public final ListenableFuture zza() {
        final zzhpr zzhprVar = this.zzb;
        Objects.requireNonNull(zzhprVar);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzgbz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzhpr.this.zzb();
            }
        };
        ExecutorService executorService = this.zze;
        zzgol zzgolVar = (zzgol) zzgot.zzg((zzgol) zzgot.zzk((zzgol) zzgot.zzj((zzgol) zzgot.zzk(zzgol.zzw(zzgot.zzd(callable, executorService)), new zzggr() { // from class: com.google.android.gms.internal.ads.zzgcd
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                zzgce.this.zzb((zzaxq) obj);
                return new Integer(0);
            }
        }, zzgpk.zza()), new zzgob() { // from class: com.google.android.gms.internal.ads.zzgca
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgce.this.zzc((Integer) obj);
            }
        }, zzgpk.zza()), new zzggr() { // from class: com.google.android.gms.internal.ads.zzgcb
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                return zzgce.this.zzd((zzfwm) obj);
            }
        }, executorService), zzgby.class, zzgcc.zza, zzgpk.zza());
        this.zzd.zze(15202, zzgolVar);
        return zzgolVar;
    }

    final /* synthetic */ int zzb(zzaxq zzaxqVar) {
        if (zzfpe.zza(zzaxqVar)) {
            return 0;
        }
        this.zzd.zzc(15204, zzaxqVar.name());
        throw new zzgby(null);
    }

    final /* synthetic */ ListenableFuture zzc(Integer num) {
        return this.zzc.zza();
    }

    final /* synthetic */ zzfwk zzd(zzfwm zzfwmVar) {
        String zza = zzfwmVar.zza().zza();
        String zzb = zzfwmVar.zza().zzb();
        zzgdy zza2 = this.zzd.zza(15203);
        try {
            zza2.zza();
            zzfpv zza3 = zzfoq.zza(this.zza, 1, (zzaxq) this.zzb.zzb(), zza, zzb, "1", this.zzg);
            zza2.zzc();
            int i = 2;
            if (zza3.zzc == 2) {
                this.zzd.zzb(15208);
                return zzf(4);
            }
            byte[] bArr = zza3.zzb;
            if (bArr == null || bArr.length == 0) {
                this.zzd.zzb(5010);
                return zzf(8);
            }
            try {
                zzaxs zze = zzaxs.zze(bArr, zzhhr.zzb());
                if (zze.zza().zza().isEmpty() || zze.zza().zzb().isEmpty() || zze.zzc().zzv().length == 0) {
                    this.zzd.zzb(15207);
                } else {
                    if (zzfwmVar.equals(zzfwm.zzd()) || !TextUtils.equals(zzfwmVar.zza().zza(), zze.zza().zza()) || !TextUtils.equals(zzfwmVar.zza().zzb(), zze.zza().zzb())) {
                        int i2 = zza3.zzc;
                        if (i2 == 4) {
                            if (!this.zzf.zza(zze.zzb().zzv())) {
                                this.zzd.zzb(15206);
                                return zzf(12);
                            }
                            i2 = 4;
                        }
                        zzfwj zzd = zzfwk.zzd();
                        if (i2 == 2) {
                            i = 4;
                        } else if (i2 != 3) {
                            i = i2 != 4 ? i2 != 6 ? 1 : 5 : 3;
                        }
                        zzd.zzd(i);
                        zzfwl zzc = zzfwm.zzc();
                        zzc.zza(zze.zza());
                        zzc.zzb((zzaxq) this.zzb.zzb());
                        zzd.zza((zzfwm) zzc.zzbu());
                        zzd.zzc(zze.zzb());
                        zzd.zzb(zze.zzc());
                        return (zzfwk) zzd.zzbu();
                    }
                    this.zzd.zzb(15209);
                }
                return zzf(11);
            } catch (zzhiw e) {
                this.zzd.zzd(15205, e);
                return zzf(9);
            } catch (NullPointerException unused) {
                this.zzd.zzb(15210);
                return zzf(10);
            }
        } catch (Throwable th) {
            try {
                zza2.zzb(th);
                throw th;
            } catch (Throwable th2) {
                zza2.zzc();
                throw th2;
            }
        }
    }
}

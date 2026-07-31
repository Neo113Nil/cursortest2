package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzgof implements zzgoa {
    private final zzgfw zza;
    private final zzgfw zzb;
    private final zzgfw zzc;
    private final zzgfw zzd;
    private final zzinq zze;
    private final zzinq zzf;
    private final File zzg;
    private final ExecutorService zzh;
    private final zzgrh zzi;

    zzgof(zzgfw zzgfwVar, zzgfw zzgfwVar2, zzinq zzinqVar, zzgfw zzgfwVar3, zzgfw zzgfwVar4, zzinq zzinqVar2, File file, ExecutorService executorService, zzgrh zzgrhVar) {
        this.zza = zzgfwVar;
        this.zzc = zzgfwVar2;
        this.zze = zzinqVar;
        this.zzb = zzgfwVar3;
        this.zzd = zzgfwVar4;
        this.zzf = zzinqVar2;
        this.zzg = file;
        this.zzh = executorService;
        this.zzi = zzgrhVar;
    }

    private final ListenableFuture zzj(byte[] bArr) {
        ListenableFuture zzc = this.zzd.zzc(bArr);
        this.zzi.zze(15305, zzc);
        return zzc;
    }

    private final ListenableFuture zzk(zzggt zzggtVar) {
        ListenableFuture zzc = this.zzb.zzc(zzggtVar);
        this.zzi.zze(15303, zzc);
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ListenableFuture zza() {
        return zzhcy.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgoe
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new Boolean(zzgof.this.zzf());
            }
        }, this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ListenableFuture zzb() {
        ListenableFuture zzb = this.zza.zzb();
        this.zzi.zze(15302, zzb);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ListenableFuture zzc(final zzggt zzggtVar, byte[] bArr, byte[] bArr2) {
        ListenableFuture zzc = ((zzgfw) this.zzf.zzb()).zzc(bArr);
        this.zzi.zze(15307, zzc);
        return (zzhcq) zzhcy.zzj(zzhcq.zzw(zzhcy.zzl(zzc, zzj(bArr2))), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzgod
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgof.this.zzi(zzggtVar, (List) obj);
            }
        }, zzhdp.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ListenableFuture zzd(final zzggt zzggtVar, byte[] bArr) {
        return (zzhcq) zzhcy.zzj(zzhcq.zzw(zzj(bArr)), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzgoc
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgof.this.zzh(zzggtVar, (Void) obj);
            }
        }, zzhdp.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgoa
    public final ListenableFuture zze() {
        zzhcq zzhcqVar = (zzhcq) zzhcy.zzk(zzhcq.zzw(this.zza.zzb()), new zzgub() { // from class: com.google.android.gms.internal.ads.zzgob
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                return zzgof.this.zzg((zzggt) obj);
            }
        }, zzhdp.zza());
        this.zzi.zze(15314, zzhcqVar);
        return zzhcqVar;
    }

    final /* synthetic */ boolean zzf() {
        try {
            zzgfw zzgfwVar = this.zzb;
            File zza = zzgfwVar.zza();
            if (zza.exists()) {
                File zza2 = ((zzgfw) this.zzf.zzb()).zza();
                File zza3 = ((zzgfw) this.zze.zzb()).zza();
                try {
                    if (zza2.exists()) {
                        File parentFile = zza3.getParentFile();
                        if (parentFile != null) {
                            zzfzt.zze(parentFile);
                        }
                        zzhat.zzb(zza3);
                        zzhat.zzc(zza2, zza3);
                    }
                    File zza4 = this.zzd.zza();
                    File zza5 = this.zzc.zza();
                    try {
                        if (zza4.exists()) {
                            zzhat.zzb(zza5);
                            zzhat.zzc(zza4, zza5);
                        }
                        File zza6 = this.zza.zza();
                        try {
                            if (zza.exists()) {
                                zzhat.zzb(zza6);
                                zzhat.zzc(zza, zza6);
                            }
                            this.zzb.zza().delete();
                            ((zzgfw) this.zzf.zzb()).zza().delete();
                            this.zzd.zza().delete();
                            return true;
                        } catch (IOException | SecurityException e) {
                            this.zzi.zzd(15313, e);
                            zzgfwVar = this.zzb;
                        }
                    } catch (IOException | SecurityException e2) {
                        this.zzi.zzd(15312, e2);
                        zzgfwVar = this.zzb;
                    }
                } catch (IOException e3) {
                    e = e3;
                    this.zzi.zzd(15311, e);
                    zzgfwVar = this.zzb;
                    zzgfwVar.zza().delete();
                    ((zzgfw) this.zzf.zzb()).zza().delete();
                    this.zzd.zza().delete();
                    return false;
                } catch (SecurityException e4) {
                    e = e4;
                    this.zzi.zzd(15311, e);
                    zzgfwVar = this.zzb;
                    zzgfwVar.zza().delete();
                    ((zzgfw) this.zzf.zzb()).zza().delete();
                    this.zzd.zza().delete();
                    return false;
                }
            }
            zzgfwVar.zza().delete();
            ((zzgfw) this.zzf.zzb()).zza().delete();
            this.zzd.zza().delete();
            return false;
        } catch (Throwable th) {
            this.zzb.zza().delete();
            ((zzgfw) this.zzf.zzb()).zza().delete();
            this.zzd.zza().delete();
            throw th;
        }
    }

    final /* synthetic */ zzfzr zzg(zzggt zzggtVar) {
        if (zzggtVar == null || zzggtVar.equals(zzggt.zzh())) {
            return null;
        }
        zzber zza = zzggtVar.zza();
        File zza2 = ((zzgfw) this.zze.zzb()).zza();
        zzgfw zzgfwVar = this.zzc;
        return new zzfzr(zza, zza2, zzgfwVar.zza(), this.zzg);
    }

    final /* synthetic */ ListenableFuture zzh(zzggt zzggtVar, Void r2) {
        return zzk(zzggtVar);
    }

    final /* synthetic */ ListenableFuture zzi(zzggt zzggtVar, List list) {
        return zzk(zzggtVar);
    }
}

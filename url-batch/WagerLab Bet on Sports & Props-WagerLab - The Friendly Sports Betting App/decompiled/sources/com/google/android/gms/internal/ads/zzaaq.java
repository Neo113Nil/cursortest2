package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.common.C;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzaaq implements zzbs {
    private final Context zza;
    private final zzbr zzb;
    private final SparseArray zzc;
    private final boolean zzd;
    private final zzabr zze;
    private final zzdb zzf;
    private final CopyOnWriteArraySet zzg;
    private final long zzh;
    private final zzaav zzi;
    private zzek zzj = new zzek(10);
    private zzu zzk;
    private zzdl zzl;
    private Pair zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private long zzq;
    private int zzr;

    /* synthetic */ zzaaq(zzaai zzaaiVar, byte[] bArr) {
        this.zza = zzaaiVar.zze();
        zzbr zzg = zzaaiVar.zzg();
        zzg.getClass();
        this.zzb = zzg;
        this.zzc = new SparseArray();
        zzgjz.zzi();
        this.zzd = zzaaiVar.zzh();
        zzdb zzi = zzaaiVar.zzi();
        this.zzf = zzi;
        this.zzh = zzaaiVar.zzj() != C.TIME_UNSET ? -zzaaiVar.zzj() : -9223372036854775807L;
        zzaav zzk = zzaaiVar.zzk();
        this.zzi = zzk;
        this.zze = new zzzv(zzaaiVar.zzf(), zzk, zzi);
        new zzaah(this);
        this.zzg = new CopyOnWriteArraySet();
        this.zzk = new zzs().zzM();
        this.zzp = C.TIME_UNSET;
        this.zzq = C.TIME_UNSET;
        this.zzr = -1;
        this.zzo = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zzh zzC(zzh zzhVar) {
        return (zzhVar == null || !zzhVar.zzf()) ? zzh.zza : zzhVar;
    }

    final /* synthetic */ void zzA(long j) {
        this.zzq = j;
    }

    public final void zza(int i) {
        this.zzr = 1;
    }

    public final zzabr zzb(int i) {
        SparseArray sparseArray = this.zzc;
        if (zzeo.zza(sparseArray, 0)) {
            return (zzabr) sparseArray.get(0);
        }
        zzaak zzaakVar = new zzaak(this, this.zza, 0);
        this.zzg.add(zzaakVar);
        sparseArray.put(0, zzaakVar);
        return zzaakVar;
    }

    public final void zzc(Surface surface, zzeg zzegVar) {
        Pair pair = this.zzm;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzeg) this.zzm.second).equals(zzegVar)) {
            return;
        }
        this.zzm = Pair.create(surface, zzegVar);
        zzegVar.zza();
        zzegVar.zzb();
    }

    public final void zzd() {
        zzeg zzegVar = zzeg.zza;
        zzegVar.zza();
        zzegVar.zzb();
        this.zzm = null;
    }

    public final void zze() {
        this.zze.zza();
    }

    public final void zzf() {
        this.zze.zzb();
    }

    public final void zzg() {
        if (this.zzo == 2) {
            return;
        }
        zzdl zzdlVar = this.zzl;
        if (zzdlVar != null) {
            zzdlVar.zzl(null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    final /* synthetic */ void zzh() {
        this.zzn--;
    }

    final /* synthetic */ boolean zzi(zzu zzuVar, int i) {
        zzghc.zzh(this.zzo == 0);
        zzh zzC = zzC(zzuVar.zzE);
        try {
            int i2 = zzC.zzd;
            try {
                if (i2 == 7) {
                    if (Build.VERSION.SDK_INT < 34 && zzdj.zzd()) {
                        zzg zzd = zzC.zzd();
                        zzd.zzc(6);
                        zzC = zzd.zzg();
                        zzh zzhVar = zzC;
                        zzdb zzdbVar = this.zzf;
                        Looper myLooper = Looper.myLooper();
                        myLooper.getClass();
                        this.zzl = zzdbVar.zzd(myLooper, null);
                        zzbr zzbrVar = this.zzb;
                        Context context = this.zza;
                        zzk zzkVar = zzk.zzb;
                        final zzdl zzdlVar = this.zzl;
                        Objects.requireNonNull(zzdlVar);
                        zzbrVar.zza(context, zzhVar, zzkVar, this, new Executor() { // from class: com.google.android.gms.internal.ads.zzaaj
                            @Override // java.util.concurrent.Executor
                            public final /* synthetic */ void execute(Runnable runnable) {
                                zzdl.this.zzm(runnable);
                            }
                        }, 0L, false);
                        throw null;
                    }
                    i2 = 7;
                }
                if (!zzdj.zzc(i2) && Build.VERSION.SDK_INT >= 29) {
                    Object[] objArr = {Integer.valueOf(i2)};
                    String str = zzeo.zza;
                    zzds.zzc("PlaybackVidGraphWrapper", String.format(Locale.US, "Color transfer %d is not supported. Falling back to OpenGl tone mapping.", objArr));
                    zzC = zzh.zza;
                    zzh zzhVar2 = zzC;
                    zzdb zzdbVar2 = this.zzf;
                    Looper myLooper2 = Looper.myLooper();
                    myLooper2.getClass();
                    this.zzl = zzdbVar2.zzd(myLooper2, null);
                    zzbr zzbrVar2 = this.zzb;
                    Context context2 = this.zza;
                    zzk zzkVar2 = zzk.zzb;
                    final zzdl zzdlVar2 = this.zzl;
                    Objects.requireNonNull(zzdlVar2);
                    zzbrVar2.zza(context2, zzhVar2, zzkVar2, this, new Executor() { // from class: com.google.android.gms.internal.ads.zzaaj
                        @Override // java.util.concurrent.Executor
                        public final /* synthetic */ void execute(Runnable runnable) {
                            zzdl.this.zzm(runnable);
                        }
                    }, 0L, false);
                    throw null;
                }
                zzbr zzbrVar22 = this.zzb;
                Context context22 = this.zza;
                zzk zzkVar22 = zzk.zzb;
                final zzdl zzdlVar22 = this.zzl;
                Objects.requireNonNull(zzdlVar22);
                zzbrVar22.zza(context22, zzhVar2, zzkVar22, this, new Executor() { // from class: com.google.android.gms.internal.ads.zzaaj
                    @Override // java.util.concurrent.Executor
                    public final /* synthetic */ void execute(Runnable runnable) {
                        zzdl.this.zzm(runnable);
                    }
                }, 0L, false);
                throw null;
            } catch (zzbn e) {
                throw new zzabq(e, zzuVar);
            }
            if (i2 == 2 || i2 == 10) {
                zzC = zzh.zza;
            }
            zzh zzhVar22 = zzC;
            zzdb zzdbVar22 = this.zzf;
            Looper myLooper22 = Looper.myLooper();
            myLooper22.getClass();
            this.zzl = zzdbVar22.zzd(myLooper22, null);
        } catch (zzdi e2) {
            throw new zzabq(e2, zzuVar);
        }
    }

    final /* synthetic */ boolean zzj(boolean z) {
        return this.zze.zzh(false);
    }

    final /* synthetic */ void zzk() {
        this.zze.zzi();
    }

    final /* synthetic */ void zzl(long j, long j2) {
        this.zze.zzv(j, j2);
    }

    final /* synthetic */ void zzm(boolean z) {
        if (this.zzo == 1) {
            this.zzn++;
            zzabr zzabrVar = this.zze;
            zzabrVar.zzg(z);
            while (this.zzj.zzc() > 1) {
                this.zzj.zzd();
            }
            if (this.zzj.zzc() == 1) {
                zzaap zzaapVar = (zzaap) this.zzj.zzd();
                zzaapVar.getClass();
                zzabrVar.zzs(1, this.zzk, zzaapVar.zza, zzaapVar.zzb, zzgjz.zzi());
            }
            this.zzp = C.TIME_UNSET;
            this.zzq = C.TIME_UNSET;
            zzdl zzdlVar = this.zzl;
            zzdlVar.getClass();
            zzdlVar.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaal
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzaaq.this.zzh();
                }
            });
        }
    }

    final /* synthetic */ void zzn(boolean z) {
        this.zze.zzw(z);
    }

    final /* synthetic */ void zzo() {
        this.zze.zzt();
    }

    final /* synthetic */ void zzp(zzaar zzaarVar) {
        this.zze.zzl(zzaarVar);
    }

    final /* synthetic */ void zzq(float f) {
        this.zzi.zzc(f);
        this.zze.zzm(f);
    }

    final /* synthetic */ void zzr(int i) {
        this.zze.zzr(i);
    }

    final /* synthetic */ boolean zzs() {
        int i = this.zzr;
        return i != -1 && i == 0;
    }

    final /* synthetic */ boolean zzt() {
        return this.zzd;
    }

    final /* synthetic */ long zzu() {
        return this.zzh;
    }

    final /* synthetic */ zzaav zzv() {
        return this.zzi;
    }

    final /* synthetic */ zzek zzw() {
        return this.zzj;
    }

    final /* synthetic */ void zzx(zzek zzekVar) {
        this.zzj = zzekVar;
    }

    final /* synthetic */ long zzy() {
        return this.zzp;
    }

    final /* synthetic */ long zzz() {
        return this.zzq;
    }
}

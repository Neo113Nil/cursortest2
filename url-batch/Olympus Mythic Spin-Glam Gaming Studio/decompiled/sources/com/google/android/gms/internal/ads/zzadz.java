package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@RestrictTo
/* loaded from: classes8.dex */
public final class zzadz implements zzbt {
    private final Context zza;
    private final zzbs zzb;
    private final SparseArray zzc;
    private final boolean zzd;
    private final zzafd zze;
    private final zzdp zzf;
    private final CopyOnWriteArraySet zzg;
    private final long zzh;
    private final zzaee zzi;
    private zzfi zzj = new zzfi(10);
    private zzv zzk;
    private zzea zzl;

    @Nullable
    private Pair zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private long zzq;
    private int zzr;

    /* JADX INFO: Access modifiers changed from: private */
    public static final zzi zzC(@Nullable zzi zziVar) {
        return (zziVar == null || !zziVar.zzf()) ? zzi.zza : zziVar;
    }

    final /* synthetic */ void zzA(long j) {
        this.zzq = j;
    }

    public final void zza(int i) {
        this.zzr = 1;
    }

    public final zzafd zzb(int i) {
        SparseArray sparseArray = this.zzc;
        if (zzfm.zza(sparseArray, 0)) {
            return (zzafd) sparseArray.get(0);
        }
        zzadt zzadtVar = new zzadt(this, this.zza, 0);
        this.zzg.add(zzadtVar);
        sparseArray.put(0, zzadtVar);
        return zzadtVar;
    }

    public final void zzc(Surface surface, zzev zzevVar) {
        Pair pair = this.zzm;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzev) this.zzm.second).equals(zzevVar)) {
            return;
        }
        this.zzm = Pair.create(surface, zzevVar);
        zzevVar.zza();
        zzevVar.zzb();
    }

    public final void zzd() {
        zzev zzevVar = zzev.zza;
        zzevVar.zza();
        zzevVar.zzb();
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
        zzea zzeaVar = this.zzl;
        if (zzeaVar != null) {
            zzeaVar.zzl(null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    final /* synthetic */ void zzh() {
        this.zzn--;
    }

    final /* synthetic */ boolean zzi(zzv zzvVar, int i) {
        zzguk.zzi(this.zzo == 0);
        zzi zzC = zzC(zzvVar.zzG);
        try {
            int i2 = zzC.zzd;
            try {
                if (i2 == 7) {
                    if (Build.VERSION.SDK_INT < 34 && zzdy.zzd()) {
                        zzh zzd = zzC.zzd();
                        zzd.zzc(6);
                        zzC = zzd.zzg();
                        zzi zziVar = zzC;
                        zzdp zzdpVar = this.zzf;
                        Looper myLooper = Looper.myLooper();
                        myLooper.getClass();
                        final zzea zzd2 = zzdpVar.zzd(myLooper, null);
                        this.zzl = zzd2;
                        zzbs zzbsVar = this.zzb;
                        Context context = this.zza;
                        zzl zzlVar = zzl.zzb;
                        Objects.requireNonNull(zzd2);
                        zzbsVar.zza(context, zziVar, zzlVar, this, new Executor() { // from class: com.google.android.gms.internal.ads.zzads
                            @Override // java.util.concurrent.Executor
                            public final /* synthetic */ void execute(Runnable runnable) {
                                zzea.this.zzm(runnable);
                            }
                        }, 0L, false);
                        throw null;
                    }
                    i2 = 7;
                }
                if (!zzdy.zzc(i2) && Build.VERSION.SDK_INT >= 29) {
                    Object[] objArr = {Integer.valueOf(i2)};
                    String str = zzfm.zza;
                    zzeh.zzc("PlaybackVidGraphWrapper", String.format(Locale.US, "Color transfer %d is not supported. Falling back to OpenGl tone mapping.", objArr));
                    zzC = zzi.zza;
                    zzi zziVar2 = zzC;
                    zzdp zzdpVar2 = this.zzf;
                    Looper myLooper2 = Looper.myLooper();
                    myLooper2.getClass();
                    final zzea zzd22 = zzdpVar2.zzd(myLooper2, null);
                    this.zzl = zzd22;
                    zzbs zzbsVar2 = this.zzb;
                    Context context2 = this.zza;
                    zzl zzlVar2 = zzl.zzb;
                    Objects.requireNonNull(zzd22);
                    zzbsVar2.zza(context2, zziVar2, zzlVar2, this, new Executor() { // from class: com.google.android.gms.internal.ads.zzads
                        @Override // java.util.concurrent.Executor
                        public final /* synthetic */ void execute(Runnable runnable) {
                            zzea.this.zzm(runnable);
                        }
                    }, 0L, false);
                    throw null;
                }
                zzbs zzbsVar22 = this.zzb;
                Context context22 = this.zza;
                zzl zzlVar22 = zzl.zzb;
                Objects.requireNonNull(zzd22);
                zzbsVar22.zza(context22, zziVar2, zzlVar22, this, new Executor() { // from class: com.google.android.gms.internal.ads.zzads
                    @Override // java.util.concurrent.Executor
                    public final /* synthetic */ void execute(Runnable runnable) {
                        zzea.this.zzm(runnable);
                    }
                }, 0L, false);
                throw null;
            } catch (zzbo e) {
                throw new zzafc(e, zzvVar);
            }
            if (i2 == 2 || i2 == 10) {
                zzC = zzi.zza;
            }
            zzi zziVar22 = zzC;
            zzdp zzdpVar22 = this.zzf;
            Looper myLooper22 = Looper.myLooper();
            myLooper22.getClass();
            final zzea zzd222 = zzdpVar22.zzd(myLooper22, null);
            this.zzl = zzd222;
        } catch (zzdx e2) {
            throw new zzafc(e2, zzvVar);
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
            zzafd zzafdVar = this.zze;
            zzafdVar.zzg(z);
            while (this.zzj.zzc() > 1) {
                this.zzj.zzd();
            }
            if (this.zzj.zzc() == 1) {
                zzady zzadyVar = (zzady) this.zzj.zzd();
                zzadyVar.getClass();
                zzafdVar.zzs(1, this.zzk, zzadyVar.zza, zzadyVar.zzb, zzgxm.zzi());
            }
            this.zzp = -9223372036854775807L;
            if (z) {
                this.zzq = -9223372036854775807L;
            }
            zzea zzeaVar = this.zzl;
            zzeaVar.getClass();
            zzeaVar.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzadz.this.zzh();
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

    final /* synthetic */ void zzp(zzaea zzaeaVar) {
        this.zze.zzl(zzaeaVar);
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

    final /* synthetic */ zzaee zzv() {
        return this.zzi;
    }

    final /* synthetic */ zzfi zzw() {
        return this.zzj;
    }

    final /* synthetic */ void zzx(zzfi zzfiVar) {
        this.zzj = zzfiVar;
    }

    final /* synthetic */ long zzy() {
        return this.zzp;
    }

    final /* synthetic */ long zzz() {
        return this.zzq;
    }

    /* synthetic */ zzadz(zzadr zzadrVar, byte[] bArr) {
        this.zza = zzadrVar.zze();
        zzbs zzg = zzadrVar.zzg();
        zzg.getClass();
        this.zzb = zzg;
        this.zzc = new SparseArray();
        zzgxm.zzi();
        this.zzd = zzadrVar.zzh();
        zzdp zzi = zzadrVar.zzi();
        this.zzf = zzi;
        this.zzh = -zzadrVar.zzj();
        zzaee zzk = zzadrVar.zzk();
        this.zzi = zzk;
        this.zze = new zzadc(zzadrVar.zzf(), zzk, zzi);
        new zzadq(this);
        this.zzg = new CopyOnWriteArraySet();
        this.zzk = new zzt().zzQ();
        this.zzp = -9223372036854775807L;
        this.zzq = -9223372036854775807L;
        this.zzr = -1;
        this.zzo = 0;
    }
}

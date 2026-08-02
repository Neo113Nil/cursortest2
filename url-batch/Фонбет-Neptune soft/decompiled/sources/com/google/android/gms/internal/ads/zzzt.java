package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzzt implements zzabd, zzco {
    private static final Executor zza = new Executor() { // from class: com.google.android.gms.internal.ads.zzzd
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
        }
    };
    private final Context zzb;
    private final zzzr zzc;
    private final zzaah zzd;
    private final zzaam zze;
    private final zzbx zzf;
    private final CopyOnWriteArraySet zzg;
    private zzdj zzh;
    private zzaf zzi;
    private zzaae zzj;
    private zzdt zzk;
    private Pair zzl;
    private int zzm;
    private int zzn;

    /* synthetic */ zzzt(zzzg zzzgVar, zzzs zzzsVar) {
        Context context;
        zzaah zzaahVar;
        zzbx zzbxVar;
        context = zzzgVar.zza;
        this.zzb = context;
        zzzr zzzrVar = new zzzr(this, context);
        this.zzc = zzzrVar;
        zzaahVar = zzzgVar.zzb;
        this.zzd = zzaahVar;
        this.zze = new zzaam(new zzzi(this, null), zzaahVar);
        zzbxVar = zzzgVar.zzd;
        zzdi.zzb(zzbxVar);
        this.zzf = zzbxVar;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.zzg = copyOnWriteArraySet;
        this.zzn = 0;
        copyOnWriteArraySet.add(zzzrVar);
    }

    static /* bridge */ /* synthetic */ zzcn zzd(zzzt zzztVar, zzaf zzafVar, zzdj zzdjVar) {
        zzdi.zzf(zzztVar.zzn == 0);
        zzztVar.zzh = zzdjVar;
        Looper myLooper = Looper.myLooper();
        zzdi.zzb(myLooper);
        zzztVar.zzk = zzdjVar.zzb(myLooper, null);
        zzo zzw = zzw(zzafVar.zzy);
        if (zzw.zzd == 7 && zzet.zza < 34) {
            zzm zzc = zzw.zzc();
            zzc.zzd(6);
            zzw = zzc.zzg();
        }
        zzo zzoVar = zzw;
        try {
            zzbx zzbxVar = zzztVar.zzf;
            Context context = zzztVar.zzb;
            zzr zzrVar = zzr.zza;
            final zzdt zzdtVar = zzztVar.zzk;
            Objects.requireNonNull(zzdtVar);
            zzbxVar.zza(context, zzoVar, zzrVar, zzztVar, new Executor() { // from class: com.google.android.gms.internal.ads.zzze
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    zzdt.this.zzh(runnable);
                }
            }, zzfxr.zzm(), 0L);
            Pair pair = zzztVar.zzl;
            if (pair == null) {
                throw null;
            }
            zzel zzelVar = (zzel) zzztVar.zzl.second;
            zzelVar.zzb();
            zzelVar.zza();
            throw null;
        } catch (zzcl e) {
            throw new zzabb(e, zzafVar);
        }
    }

    public static /* synthetic */ void zzl(zzzt zzztVar) {
        int i = zzztVar.zzm - 1;
        zzztVar.zzm = i;
        if (i > 0) {
            return;
        }
        if (i < 0) {
            throw new IllegalStateException(String.valueOf(i));
        }
        zzztVar.zze.zza();
    }

    static /* bridge */ /* synthetic */ void zzn(final zzzt zzztVar) {
        if (zzztVar.zzn == 1) {
            zzztVar.zzm++;
            zzztVar.zze.zza();
            zzdt zzdtVar = zzztVar.zzk;
            zzdi.zzb(zzdtVar);
            zzdtVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzf
                @Override // java.lang.Runnable
                public final void run() {
                    zzzt.zzl(zzzt.this);
                }
            });
        }
    }

    static /* bridge */ /* synthetic */ boolean zzv(zzzt zzztVar, long j) {
        return zzztVar.zzm == 0 && zzztVar.zze.zze(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzo zzw(zzo zzoVar) {
        return (zzoVar == null || !zzoVar.zzf()) ? zzo.zza : zzoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabd
    public final zzaah zzh() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzabd
    public final zzabc zzi() {
        return this.zzc;
    }

    public final void zzr() {
        zzel.zza.zzb();
        zzel.zza.zza();
        this.zzl = null;
    }

    public final void zzs() {
        if (this.zzn == 2) {
            return;
        }
        zzdt zzdtVar = this.zzk;
        if (zzdtVar != null) {
            zzdtVar.zze(null);
        }
        this.zzl = null;
        this.zzn = 2;
    }

    public final void zzt(long j, long j2) throws zzhw {
        if (this.zzm == 0) {
            this.zze.zzc(j, j2);
        }
    }

    public final void zzu(Surface surface, zzel zzelVar) {
        Pair pair = this.zzl;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzel) this.zzl.second).equals(zzelVar)) {
            return;
        }
        this.zzl = Pair.create(surface, zzelVar);
    }
}

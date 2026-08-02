package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaam {
    private final zzaah zza;
    private zzcp zzf;
    private long zzh;
    private final zzzi zzj;
    private final zzaaf zzb = new zzaaf();
    private final zzeq zzc = new zzeq(10);
    private final zzeq zzd = new zzeq(10);
    private final zzec zze = new zzec(16);
    private zzcp zzg = zzcp.zza;
    private long zzi = -9223372036854775807L;

    public zzaam(zzzi zzziVar, zzaah zzaahVar) {
        this.zzj = zzziVar;
        this.zza = zzaahVar;
    }

    private static Object zzf(zzeq zzeqVar) {
        zzdi.zzd(zzeqVar.zza() > 0);
        while (zzeqVar.zza() > 1) {
            zzeqVar.zzb();
        }
        Object zzb = zzeqVar.zzb();
        zzb.getClass();
        return zzb;
    }

    public final void zza() {
        this.zze.zzc();
        this.zzi = -9223372036854775807L;
        zzeq zzeqVar = this.zzd;
        if (zzeqVar.zza() > 0) {
            Long l = (Long) zzf(zzeqVar);
            l.longValue();
            this.zzd.zzd(0L, l);
        }
        if (this.zzf != null) {
            this.zzc.zze();
            return;
        }
        zzeq zzeqVar2 = this.zzc;
        if (zzeqVar2.zza() > 0) {
            this.zzf = (zzcp) zzf(zzeqVar2);
        }
    }

    public final void zzb(long j, long j2) {
        this.zzd.zzd(j, Long.valueOf(j2));
    }

    public final void zzc(long j, long j2) throws zzhw {
        zzaae zzaaeVar;
        zzaf zzafVar;
        zzaae zzaaeVar2;
        zzdj zzdjVar;
        Pair pair;
        CopyOnWriteArraySet copyOnWriteArraySet;
        CopyOnWriteArraySet copyOnWriteArraySet2;
        CopyOnWriteArraySet copyOnWriteArraySet3;
        zzec zzecVar = this.zze;
        if (zzecVar.zzd()) {
            return;
        }
        zzeq zzeqVar = this.zzd;
        long zza = zzecVar.zza();
        Long l = (Long) zzeqVar.zzc(zza);
        if (l != null && l.longValue() != this.zzh) {
            this.zzh = l.longValue();
            this.zza.zzf();
        }
        int zza2 = this.zza.zza(zza, j, j2, this.zzh, false, this.zzb);
        if (zza2 != 0 && zza2 != 1) {
            if (zza2 == 2 || zza2 == 3 || zza2 == 4) {
                this.zzi = zza;
                this.zze.zzb();
                zzzi zzziVar = this.zzj;
                copyOnWriteArraySet3 = zzziVar.zza.zzg;
                Iterator it = copyOnWriteArraySet3.iterator();
                while (it.hasNext()) {
                    ((zzzj) it.next()).zzb(zzziVar.zza);
                }
                zzdi.zzb(null);
                throw null;
            }
            return;
        }
        this.zzi = zza;
        long zzb = this.zze.zzb();
        Long.valueOf(zzb).getClass();
        zzcp zzcpVar = (zzcp) this.zzc.zzc(zzb);
        if (zzcpVar != null && !zzcpVar.equals(zzcp.zza) && !zzcpVar.equals(this.zzg)) {
            this.zzg = zzcpVar;
            zzzi zzziVar2 = this.zzj;
            zzad zzadVar = new zzad();
            zzadVar.zzac(zzcpVar.zzb);
            zzadVar.zzI(zzcpVar.zzc);
            zzadVar.zzX("video/raw");
            zzziVar2.zza.zzi = zzadVar.zzad();
            copyOnWriteArraySet2 = zzziVar2.zza.zzg;
            Iterator it2 = copyOnWriteArraySet2.iterator();
            while (it2.hasNext()) {
                ((zzzj) it2.next()).zzc(zzziVar2.zza, zzcpVar);
            }
        }
        zzzi zzziVar3 = this.zzj;
        long j3 = this.zzh;
        if (this.zza.zzo()) {
            zzzt zzztVar = zzziVar3.zza;
            pair = zzztVar.zzl;
            if (pair != null) {
                copyOnWriteArraySet = zzztVar.zzg;
                Iterator it3 = copyOnWriteArraySet.iterator();
                while (it3.hasNext()) {
                    ((zzzj) it3.next()).zza(zzziVar3.zza);
                }
            }
        }
        zzzt zzztVar2 = zzziVar3.zza;
        zzaaeVar = zzztVar2.zzj;
        if (zzaaeVar != null) {
            zzafVar = zzztVar2.zzi;
            zzaf zzad = zzafVar == null ? new zzad().zzad() : zzztVar2.zzi;
            zzzt zzztVar3 = zzziVar3.zza;
            zzaaeVar2 = zzztVar3.zzj;
            zzdjVar = zzztVar3.zzh;
            zzdi.zzb(zzdjVar);
            zzaaeVar2.zza(zzb - j3, System.nanoTime(), zzad, null);
        }
        zzdi.zzb(null);
        throw null;
    }

    public final void zzd(float f) {
        zzdi.zzd(f > 0.0f);
        this.zza.zzm(f);
    }

    public final boolean zze(long j) {
        long j2 = this.zzi;
        return j2 != -9223372036854775807L && j2 >= j;
    }
}

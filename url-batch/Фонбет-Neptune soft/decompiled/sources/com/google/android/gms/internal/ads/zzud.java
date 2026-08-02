package com.google.android.gms.internal.ads;

import android.util.Pair;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzud extends zzwk {
    private final boolean zzb;
    private final zzcb zzc;
    private final zzca zzd;
    private zzub zze;
    private zzua zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzud(zzuk zzukVar, boolean z) {
        super(zzukVar);
        boolean z2;
        if (z) {
            zzukVar.zzv();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new zzcb();
        this.zzd = new zzca();
        zzukVar.zzM();
        this.zze = zzub.zzq(zzukVar.zzJ());
    }

    private final Object zzK(Object obj) {
        Object obj2;
        Object obj3;
        obj2 = this.zze.zze;
        if (obj2 == null || !obj.equals(zzub.zzc)) {
            return obj;
        }
        obj3 = this.zze.zze;
        return obj3;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private final boolean zzL(long j) {
        zzua zzuaVar = this.zzf;
        int zza = this.zze.zza(zzuaVar.zza.zza);
        if (zza == -1) {
            return false;
        }
        zzub zzubVar = this.zze;
        zzca zzcaVar = this.zzd;
        zzubVar.zzd(zza, zzcaVar, false);
        long j2 = zzcaVar.zzd;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        zzuaVar.zzs(j);
        return true;
    }

    public final zzcc zzC() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    protected final zzui zzD(zzui zzuiVar) {
        Object obj;
        Object obj2;
        obj = this.zze.zze;
        Object obj3 = zzuiVar.zza;
        if (obj != null) {
            obj2 = this.zze.zze;
            if (obj2.equals(obj3)) {
                obj3 = zzub.zzc;
            }
        }
        return zzuiVar.zza(obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    @Override // com.google.android.gms.internal.ads.zzwk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzE(zzcc zzccVar) {
        long j;
        zzua zzuaVar;
        zzui zzuiVar = null;
        if (this.zzh) {
            this.zze = this.zze.zzp(zzccVar);
            zzua zzuaVar2 = this.zzf;
            if (zzuaVar2 != null) {
                zzL(zzuaVar2.zzn());
            }
        } else if (zzccVar.zzo()) {
            this.zze = this.zzi ? this.zze.zzp(zzccVar) : zzub.zzr(zzccVar, zzcb.zza, zzub.zzc);
        } else {
            zzccVar.zze(0, this.zzc, 0L);
            Object obj = this.zzc.zzb;
            zzua zzuaVar3 = this.zzf;
            if (zzuaVar3 != null) {
                long zzq = zzuaVar3.zzq();
                this.zze.zzn(zzuaVar3.zza.zza, this.zzd);
                this.zze.zze(0, this.zzc, 0L);
                if (zzq != 0) {
                    j = zzq;
                    Pair zzl = zzccVar.zzl(this.zzc, this.zzd, 0, j);
                    Object obj2 = zzl.first;
                    long longValue = ((Long) zzl.second).longValue();
                    this.zze = !this.zzi ? this.zze.zzp(zzccVar) : zzub.zzr(zzccVar, obj, obj2);
                    zzuaVar = this.zzf;
                    if (zzuaVar != null && zzL(longValue)) {
                        zzui zzuiVar2 = zzuaVar.zza;
                        zzuiVar = zzuiVar2.zza(zzK(zzuiVar2.zza));
                    }
                }
            }
            j = 0;
            Pair zzl2 = zzccVar.zzl(this.zzc, this.zzd, 0, j);
            Object obj22 = zzl2.first;
            long longValue2 = ((Long) zzl2.second).longValue();
            this.zze = !this.zzi ? this.zze.zzp(zzccVar) : zzub.zzr(zzccVar, obj, obj22);
            zzuaVar = this.zzf;
            if (zzuaVar != null) {
                zzui zzuiVar22 = zzuaVar.zza;
                zzuiVar = zzuiVar22.zza(zzK(zzuiVar22.zza));
            }
        }
        this.zzi = true;
        this.zzh = true;
        zzo(this.zze);
        if (zzuiVar != null) {
            zzua zzuaVar4 = this.zzf;
            zzuaVar4.getClass();
            zzuaVar4.zzr(zzuiVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final void zzF() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzB(null, ((zzwk) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzwk, com.google.android.gms.internal.ads.zzuk
    public final void zzG(zzug zzugVar) {
        ((zzua) zzugVar).zzt();
        if (zzugVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwk, com.google.android.gms.internal.ads.zzuk
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final zzua zzI(zzui zzuiVar, zzyk zzykVar, long j) {
        zzua zzuaVar = new zzua(zzuiVar, zzykVar, j);
        zzuaVar.zzu(this.zza);
        if (this.zzh) {
            zzuaVar.zzr(zzuiVar.zza(zzK(zzuiVar.zza)));
        } else {
            this.zzf = zzuaVar;
            if (!this.zzg) {
                this.zzg = true;
                zzB(null, ((zzwk) this).zza);
            }
        }
        return zzuaVar;
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzth
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzth, com.google.android.gms.internal.ads.zzuk
    public final void zzt(zzbc zzbcVar) {
        if (this.zzi) {
            this.zze = this.zze.zzp(new zzwg(this.zze.zzb, zzbcVar));
        } else {
            this.zze = zzub.zzq(zzbcVar);
        }
        this.zza.zzt(zzbcVar);
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzuk
    public final void zzz() {
    }
}

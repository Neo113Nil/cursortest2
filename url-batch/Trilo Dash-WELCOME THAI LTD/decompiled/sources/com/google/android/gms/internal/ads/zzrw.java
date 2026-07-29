package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzrw extends zzrk {
    private final zzsd zza;
    private final boolean zzb;
    private final zzch zzc;
    private final zzcf zzd;
    private zzru zze;
    private zzrt zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzrw(zzsd zzsdVar, boolean z) {
        boolean z2;
        this.zza = zzsdVar;
        if (z) {
            zzsdVar.zzu();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new zzch();
        this.zzd = new zzcf();
        zzsdVar.zzG();
        this.zze = zzru.zzq(zzsdVar.zzz());
    }

    private final Object zzE(Object obj) {
        Object obj2;
        Object obj3;
        obj2 = this.zze.zzf;
        if (obj2 == null || !obj.equals(zzru.zzd)) {
            return obj;
        }
        obj3 = this.zze.zzf;
        return obj3;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private final void zzF(long j) {
        zzrt zzrtVar = this.zzf;
        int zza = this.zze.zza(zzrtVar.zza.zza);
        if (zza == -1) {
            return;
        }
        zzru zzruVar = this.zze;
        zzcf zzcfVar = this.zzd;
        zzruVar.zzd(zza, zzcfVar, false);
        long j2 = zzcfVar.zze;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        zzrtVar.zzs(j);
    }

    public final zzci zzA() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzB(zzrz zzrzVar) {
        ((zzrt) zzrzVar).zzt();
        if (zzrzVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    /* renamed from: zzC, reason: merged with bridge method [inline-methods] */
    public final zzrt zzD(zzsb zzsbVar, zzvw zzvwVar, long j) {
        zzrt zzrtVar = new zzrt(zzsbVar, zzvwVar, j, null);
        zzrtVar.zzu(this.zza);
        if (this.zzh) {
            zzrtVar.zzr(zzsbVar.zzc(zzE(zzsbVar.zza)));
        } else {
            this.zzf = zzrtVar;
            if (!this.zzg) {
                this.zzg = true;
                zzy(null, this.zza);
            }
        }
        return zzrtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrk, com.google.android.gms.internal.ads.zzrc
    public final void zzn(zzft zzftVar) {
        super.zzn(zzftVar);
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzy(null, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzrk, com.google.android.gms.internal.ads.zzrc
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzrk
    protected final /* bridge */ /* synthetic */ zzsb zzv(Object obj, zzsb zzsbVar) {
        Object obj2;
        Object obj3;
        Object obj4 = zzsbVar.zza;
        obj2 = this.zze.zzf;
        if (obj2 != null) {
            obj3 = this.zze.zzf;
            if (obj3.equals(obj4)) {
                obj4 = zzru.zzd;
            }
        }
        return zzsbVar.zzc(obj4);
    }

    @Override // com.google.android.gms.internal.ads.zzrk, com.google.android.gms.internal.ads.zzsd
    public final void zzw() {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    @Override // com.google.android.gms.internal.ads.zzrk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final /* bridge */ /* synthetic */ void zzx(Object obj, zzsd zzsdVar, zzci zzciVar) {
        long j;
        zzrt zzrtVar;
        zzsb zzsbVar = null;
        if (this.zzh) {
            this.zze = this.zze.zzp(zzciVar);
            zzrt zzrtVar2 = this.zzf;
            if (zzrtVar2 != null) {
                zzF(zzrtVar2.zzn());
            }
        } else if (zzciVar.zzo()) {
            this.zze = this.zzi ? this.zze.zzp(zzciVar) : zzru.zzr(zzciVar, zzch.zza, zzru.zzd);
        } else {
            zzciVar.zze(0, this.zzc, 0L);
            Object obj2 = this.zzc.zzc;
            zzrt zzrtVar3 = this.zzf;
            if (zzrtVar3 != null) {
                long zzq = zzrtVar3.zzq();
                this.zze.zzn(zzrtVar3.zza.zza, this.zzd);
                this.zze.zze(0, this.zzc, 0L);
                if (zzq != 0) {
                    j = zzq;
                    Pair zzl = zzciVar.zzl(this.zzc, this.zzd, 0, j);
                    Object obj3 = zzl.first;
                    long longValue = ((Long) zzl.second).longValue();
                    this.zze = !this.zzi ? this.zze.zzp(zzciVar) : zzru.zzr(zzciVar, obj2, obj3);
                    zzrtVar = this.zzf;
                    if (zzrtVar != null) {
                        zzF(longValue);
                        zzsb zzsbVar2 = zzrtVar.zza;
                        zzsbVar = zzsbVar2.zzc(zzE(zzsbVar2.zza));
                    }
                }
            }
            j = 0;
            Pair zzl2 = zzciVar.zzl(this.zzc, this.zzd, 0, j);
            Object obj32 = zzl2.first;
            long longValue2 = ((Long) zzl2.second).longValue();
            this.zze = !this.zzi ? this.zze.zzp(zzciVar) : zzru.zzr(zzciVar, obj2, obj32);
            zzrtVar = this.zzf;
            if (zzrtVar != null) {
            }
        }
        this.zzi = true;
        this.zzh = true;
        zzo(this.zze);
        if (zzsbVar != null) {
            zzrt zzrtVar4 = this.zzf;
            Objects.requireNonNull(zzrtVar4);
            zzrtVar4.zzr(zzsbVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final zzbb zzz() {
        return this.zza.zzz();
    }
}

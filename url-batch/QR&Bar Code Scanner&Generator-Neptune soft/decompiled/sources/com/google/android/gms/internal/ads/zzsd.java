package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzsd extends zzrr {
    private final zzsk zza;
    private final boolean zzb;
    private final zzcm zzc;
    private final zzck zzd;
    private zzsb zze;
    private zzsa zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzsd(zzsk zzskVar, boolean z) {
        boolean z2;
        this.zza = zzskVar;
        if (z) {
            zzskVar.zzu();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new zzcm();
        this.zzd = new zzck();
        zzskVar.zzG();
        this.zze = zzsb.zzq(zzskVar.zzz());
    }

    private final Object zzE(Object obj) {
        Object obj2;
        Object obj3;
        obj2 = this.zze.zzf;
        if (obj2 == null || !obj.equals(zzsb.zzd)) {
            return obj;
        }
        obj3 = this.zze.zzf;
        return obj3;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private final void zzF(long j) {
        zzsa zzsaVar = this.zzf;
        int zza = this.zze.zza(zzsaVar.zza.zza);
        if (zza == -1) {
            return;
        }
        zzsb zzsbVar = this.zze;
        zzck zzckVar = this.zzd;
        zzsbVar.zzd(zza, zzckVar, false);
        long j2 = zzckVar.zze;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        zzsaVar.zzs(j);
    }

    public final zzcn zzA() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzB(zzsg zzsgVar) {
        ((zzsa) zzsgVar).zzt();
        if (zzsgVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    /* renamed from: zzC, reason: merged with bridge method [inline-methods] */
    public final zzsa zzD(zzsi zzsiVar, zzwi zzwiVar, long j) {
        zzsa zzsaVar = new zzsa(zzsiVar, zzwiVar, j, null);
        zzsaVar.zzu(this.zza);
        if (this.zzh) {
            zzsaVar.zzr(zzsiVar.zzc(zzE(zzsiVar.zza)));
        } else {
            this.zzf = zzsaVar;
            if (!this.zzg) {
                this.zzg = true;
                zzy(null, this.zza);
            }
        }
        return zzsaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrr, com.google.android.gms.internal.ads.zzrj
    public final void zzn(zzfz zzfzVar) {
        super.zzn(zzfzVar);
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzy(null, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzrr, com.google.android.gms.internal.ads.zzrj
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzrr
    protected final /* bridge */ /* synthetic */ zzsi zzv(Object obj, zzsi zzsiVar) {
        Object obj2;
        Object obj3;
        Object obj4 = zzsiVar.zza;
        obj2 = this.zze.zzf;
        if (obj2 != null) {
            obj3 = this.zze.zzf;
            if (obj3.equals(obj4)) {
                obj4 = zzsb.zzd;
            }
        }
        return zzsiVar.zzc(obj4);
    }

    @Override // com.google.android.gms.internal.ads.zzrr, com.google.android.gms.internal.ads.zzsk
    public final void zzw() {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    @Override // com.google.android.gms.internal.ads.zzrr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final /* bridge */ /* synthetic */ void zzx(Object obj, zzsk zzskVar, zzcn zzcnVar) {
        long j;
        zzsa zzsaVar;
        zzsi zzsiVar = null;
        if (this.zzh) {
            this.zze = this.zze.zzp(zzcnVar);
            zzsa zzsaVar2 = this.zzf;
            if (zzsaVar2 != null) {
                zzF(zzsaVar2.zzn());
            }
        } else if (zzcnVar.zzo()) {
            this.zze = this.zzi ? this.zze.zzp(zzcnVar) : zzsb.zzr(zzcnVar, zzcm.zza, zzsb.zzd);
        } else {
            zzcnVar.zze(0, this.zzc, 0L);
            Object obj2 = this.zzc.zzc;
            zzsa zzsaVar3 = this.zzf;
            if (zzsaVar3 != null) {
                long zzq = zzsaVar3.zzq();
                this.zze.zzn(zzsaVar3.zza.zza, this.zzd);
                this.zze.zze(0, this.zzc, 0L);
                if (zzq != 0) {
                    j = zzq;
                    Pair zzl = zzcnVar.zzl(this.zzc, this.zzd, 0, j);
                    Object obj3 = zzl.first;
                    long longValue = ((Long) zzl.second).longValue();
                    this.zze = !this.zzi ? this.zze.zzp(zzcnVar) : zzsb.zzr(zzcnVar, obj2, obj3);
                    zzsaVar = this.zzf;
                    if (zzsaVar != null) {
                        zzF(longValue);
                        zzsi zzsiVar2 = zzsaVar.zza;
                        zzsiVar = zzsiVar2.zzc(zzE(zzsiVar2.zza));
                    }
                }
            }
            j = 0;
            Pair zzl2 = zzcnVar.zzl(this.zzc, this.zzd, 0, j);
            Object obj32 = zzl2.first;
            long longValue2 = ((Long) zzl2.second).longValue();
            this.zze = !this.zzi ? this.zze.zzp(zzcnVar) : zzsb.zzr(zzcnVar, obj2, obj32);
            zzsaVar = this.zzf;
            if (zzsaVar != null) {
            }
        }
        this.zzi = true;
        this.zzh = true;
        zzo(this.zze);
        if (zzsiVar != null) {
            zzsa zzsaVar4 = this.zzf;
            Objects.requireNonNull(zzsaVar4);
            zzsaVar4.zzr(zzsiVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final zzbg zzz() {
        return this.zza.zzz();
    }
}

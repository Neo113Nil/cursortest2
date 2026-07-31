package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.media3.common.C;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzuk extends zzws {
    private final boolean zzb;
    private final zzbd zzc;
    private final zzbc zzd;
    private zzui zze;
    private zzuh zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzuk(zzur zzurVar, boolean z) {
        super(zzurVar);
        boolean z2;
        if (z) {
            zzurVar.zzI();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new zzbd();
        this.zzd = new zzbc();
        zzurVar.zzH();
        this.zze = zzui.zzp(zzurVar.zzJ());
    }

    private final Object zzK(Object obj) {
        return (this.zze.zzs() == null || !obj.equals(zzui.zzc)) ? obj : this.zze.zzs();
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private final boolean zzL(long j) {
        zzuh zzuhVar = this.zzf;
        int zze = this.zze.zze(zzuhVar.zza.zza);
        if (zze == -1) {
            return false;
        }
        zzui zzuiVar = this.zze;
        zzbc zzbcVar = this.zzd;
        zzuiVar.zzd(zze, zzbcVar, false);
        long j2 = zzbcVar.zzd;
        if (j2 != C.TIME_UNSET && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        zzuhVar.zzo(j);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzA(zzaj zzajVar) {
        if (this.zzi) {
            this.zze = this.zze.zzr(new zzwo(this.zze.zzb, zzajVar));
        } else {
            this.zze = zzui.zzp(zzajVar);
        }
        this.zza.zzA(zzajVar);
    }

    @Override // com.google.android.gms.internal.ads.zzws
    public final void zzB() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzv(null, ((zzws) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzws, com.google.android.gms.internal.ads.zzur
    public final void zzC(zzun zzunVar) {
        ((zzuh) zzunVar).zzu();
        if (zzunVar == this.zzf) {
            this.zzf = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r6 != 0) goto L20;
     */
    @Override // com.google.android.gms.internal.ads.zzws
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzD(zzbe zzbeVar) {
        long j;
        zzup zzupVar = null;
        if (this.zzh) {
            this.zze = this.zze.zzr(zzbeVar);
            zzuh zzuhVar = this.zzf;
            if (zzuhVar != null) {
                zzL(zzuhVar.zzq());
            }
        } else if (zzbeVar.zzg()) {
            this.zze = this.zzi ? this.zze.zzr(zzbeVar) : zzui.zzq(zzbeVar, zzbd.zza, zzui.zzc);
        } else {
            zzbd zzbdVar = this.zzc;
            zzbeVar.zzb(0, zzbdVar, 0L);
            Object obj = zzbdVar.zzb;
            zzuh zzuhVar2 = this.zzf;
            if (zzuhVar2 != null) {
                j = zzuhVar2.zza();
                this.zze.zzo(zzuhVar2.zza.zza, this.zzd);
                this.zze.zzb(0, zzbdVar, 0L);
            }
            j = 0;
            Pair zzm = zzbeVar.zzm(zzbdVar, this.zzd, 0, j);
            Object obj2 = zzm.first;
            long longValue = ((Long) zzm.second).longValue();
            this.zze = this.zzi ? this.zze.zzr(zzbeVar) : zzui.zzq(zzbeVar, obj, obj2);
            zzuh zzuhVar3 = this.zzf;
            if (zzuhVar3 != null && zzL(longValue)) {
                zzup zzupVar2 = zzuhVar3.zza;
                zzupVar = zzupVar2.zza(zzK(zzupVar2.zza));
            }
        }
        this.zzi = true;
        this.zzh = true;
        zze(this.zze);
        if (zzupVar != null) {
            zzuh zzuhVar4 = this.zzf;
            zzuhVar4.getClass();
            zzuhVar4.zzt(zzupVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzws
    protected final zzup zzE(zzup zzupVar) {
        Object zzs = this.zze.zzs();
        Object obj = zzupVar.zza;
        if (zzs != null && this.zze.zzs().equals(obj)) {
            obj = zzui.zzc;
        }
        return zzupVar.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzws, com.google.android.gms.internal.ads.zzur
    /* renamed from: zzF, reason: merged with bridge method [inline-methods] */
    public final zzuh zzG(zzup zzupVar, zzyv zzyvVar, long j) {
        zzuh zzuhVar = new zzuh(zzupVar, zzyvVar, j);
        zzuhVar.zzr(this.zza);
        if (this.zzh) {
            zzuhVar.zzt(zzupVar.zza(zzK(zzupVar.zza)));
            return zzuhVar;
        }
        this.zzf = zzuhVar;
        if (!this.zzg) {
            this.zzg = true;
            zzv(null, ((zzws) this).zza);
        }
        return zzuhVar;
    }

    @Override // com.google.android.gms.internal.ads.zztx, com.google.android.gms.internal.ads.zzto
    public final void zzd() {
        this.zzh = false;
        this.zzg = false;
        super.zzd();
    }

    public final zzbe zzz() {
        return this.zze;
    }
}

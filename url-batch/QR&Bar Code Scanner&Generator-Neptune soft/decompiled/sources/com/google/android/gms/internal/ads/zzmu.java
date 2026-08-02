package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzmu {
    final /* synthetic */ zzmv zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzsi zze;
    private boolean zzf;
    private boolean zzg;

    public zzmu(zzmv zzmvVar, String str, int i, zzsi zzsiVar) {
        this.zza = zzmvVar;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zzsiVar == null ? -1L : zzsiVar.zzd;
        if (zzsiVar == null || !zzsiVar.zzb()) {
            return;
        }
        this.zze = zzsiVar;
    }

    public final void zzg(int i, zzsi zzsiVar) {
        if (this.zzd == -1 && i == this.zzc && zzsiVar != null) {
            this.zzd = zzsiVar.zzd;
        }
    }

    public final boolean zzj(int i, zzsi zzsiVar) {
        if (zzsiVar == null) {
            return i == this.zzc;
        }
        zzsi zzsiVar2 = this.zze;
        return zzsiVar2 == null ? !zzsiVar.zzb() && zzsiVar.zzd == this.zzd : zzsiVar.zzd == zzsiVar2.zzd && zzsiVar.zzb == zzsiVar2.zzb && zzsiVar.zzc == zzsiVar2.zzc;
    }

    public final boolean zzk(zzkp zzkpVar) {
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        zzsi zzsiVar = zzkpVar.zzd;
        if (zzsiVar == null) {
            return this.zzc != zzkpVar.zzc;
        }
        if (zzsiVar.zzd > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        int zza = zzkpVar.zzb.zza(zzsiVar.zza);
        int zza2 = zzkpVar.zzb.zza(this.zze.zza);
        zzsi zzsiVar2 = zzkpVar.zzd;
        if (zzsiVar2.zzd < this.zze.zzd || zza < zza2) {
            return false;
        }
        if (zza > zza2) {
            return true;
        }
        if (!zzsiVar2.zzb()) {
            int i = zzkpVar.zzd.zze;
            return i == -1 || i > this.zze.zzb;
        }
        zzsi zzsiVar3 = zzkpVar.zzd;
        int i2 = zzsiVar3.zzb;
        int i3 = zzsiVar3.zzc;
        zzsi zzsiVar4 = this.zze;
        int i4 = zzsiVar4.zzb;
        return i2 > i4 || (i2 == i4 && i3 > zzsiVar4.zzc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.zzc()) goto L15;
     */
    /* JADX WARN: Incorrect condition in loop: B:19:0x002e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzl(zzcn zzcnVar, zzcn zzcnVar2) {
        zzcm zzcmVar;
        zzcm zzcmVar2;
        zzcm zzcmVar3;
        zzck zzckVar;
        int i = this.zzc;
        if (i < zzcnVar.zzc()) {
            zzcmVar = this.zza.zzc;
            zzcnVar.zze(i, zzcmVar, 0L);
            zzcmVar2 = this.zza.zzc;
            for (int i2 = zzcmVar2.zzo; i2 <= zzcmVar3.zzp; i2++) {
                int zza = zzcnVar2.zza(zzcnVar.zzf(i2));
                if (zza != -1) {
                    zzckVar = this.zza.zzd;
                    i = zzcnVar2.zzd(zza, zzckVar, false).zzd;
                    break;
                }
            }
            i = -1;
        }
        this.zzc = i;
        if (i == -1) {
            return false;
        }
        zzsi zzsiVar = this.zze;
        return zzsiVar == null || zzcnVar2.zza(zzsiVar.zza) != -1;
    }
}

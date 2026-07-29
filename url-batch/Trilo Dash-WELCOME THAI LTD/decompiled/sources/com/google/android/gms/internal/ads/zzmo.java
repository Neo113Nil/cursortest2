package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzmo {
    final /* synthetic */ zzmp zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzsb zze;
    private boolean zzf;
    private boolean zzg;

    public zzmo(zzmp zzmpVar, String str, int i, zzsb zzsbVar) {
        this.zza = zzmpVar;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zzsbVar == null ? -1L : zzsbVar.zzd;
        if (zzsbVar == null || !zzsbVar.zzb()) {
            return;
        }
        this.zze = zzsbVar;
    }

    public final void zzg(int i, zzsb zzsbVar) {
        if (this.zzd == -1 && i == this.zzc && zzsbVar != null) {
            this.zzd = zzsbVar.zzd;
        }
    }

    public final boolean zzj(int i, zzsb zzsbVar) {
        if (zzsbVar == null) {
            return i == this.zzc;
        }
        zzsb zzsbVar2 = this.zze;
        return zzsbVar2 == null ? !zzsbVar.zzb() && zzsbVar.zzd == this.zzd : zzsbVar.zzd == zzsbVar2.zzd && zzsbVar.zzb == zzsbVar2.zzb && zzsbVar.zzc == zzsbVar2.zzc;
    }

    public final boolean zzk(zzkj zzkjVar) {
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        zzsb zzsbVar = zzkjVar.zzd;
        if (zzsbVar == null) {
            return this.zzc != zzkjVar.zzc;
        }
        if (zzsbVar.zzd > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        int zza = zzkjVar.zzb.zza(zzsbVar.zza);
        int zza2 = zzkjVar.zzb.zza(this.zze.zza);
        zzsb zzsbVar2 = zzkjVar.zzd;
        if (zzsbVar2.zzd < this.zze.zzd || zza < zza2) {
            return false;
        }
        if (zza > zza2) {
            return true;
        }
        if (!zzsbVar2.zzb()) {
            int i = zzkjVar.zzd.zze;
            return i == -1 || i > this.zze.zzb;
        }
        zzsb zzsbVar3 = zzkjVar.zzd;
        int i2 = zzsbVar3.zzb;
        int i3 = zzsbVar3.zzc;
        zzsb zzsbVar4 = this.zze;
        int i4 = zzsbVar4.zzb;
        return i2 > i4 || (i2 == i4 && i3 > zzsbVar4.zzc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.zzc()) goto L15;
     */
    /* JADX WARN: Incorrect condition in loop: B:19:0x002e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzl(zzci zzciVar, zzci zzciVar2) {
        zzch zzchVar;
        zzch zzchVar2;
        zzch zzchVar3;
        zzcf zzcfVar;
        int i = this.zzc;
        if (i < zzciVar.zzc()) {
            zzchVar = this.zza.zzc;
            zzciVar.zze(i, zzchVar, 0L);
            zzchVar2 = this.zza.zzc;
            for (int i2 = zzchVar2.zzo; i2 <= zzchVar3.zzp; i2++) {
                int zza = zzciVar2.zza(zzciVar.zzf(i2));
                if (zza != -1) {
                    zzcfVar = this.zza.zzd;
                    i = zzciVar2.zzd(zza, zzcfVar, false).zzd;
                    break;
                }
            }
            i = -1;
        }
        this.zzc = i;
        if (i == -1) {
            return false;
        }
        zzsb zzsbVar = this.zze;
        return zzsbVar == null || zzciVar2.zza(zzsbVar.zza) != -1;
    }
}

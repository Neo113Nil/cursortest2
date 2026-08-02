package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzok {
    private final zzng[] zza;
    private final zzpc zzb;
    private final zzpe zzc;

    public zzok(zzng... zzngVarArr) {
        zzpc zzpcVar = new zzpc();
        zzpe zzpeVar = new zzpe();
        zzng[] zzngVarArr2 = {zzpcVar, zzpeVar};
        this.zza = zzngVarArr2;
        System.arraycopy(zzngVarArr, 0, zzngVarArr2, 0, 0);
        this.zzb = zzpcVar;
        this.zzc = zzpeVar;
    }

    public final long zza(long j) {
        return this.zzc.zzi(j);
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzby zzc(zzby zzbyVar) {
        this.zzc.zzk(zzbyVar.zzc);
        this.zzc.zzj(zzbyVar.zzd);
        return zzbyVar;
    }

    public final boolean zzd(boolean z) {
        this.zzb.zzp(z);
        return z;
    }

    public final zzng[] zze() {
        return this.zza;
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzwa {
    public final int zza;
    public final zzkc[] zzb;
    public final zzvt[] zzc;
    public final zzcy zzd;
    public final Object zze;

    public zzwa(zzkc[] zzkcVarArr, zzvt[] zzvtVarArr, zzcy zzcyVar, Object obj) {
        this.zzb = zzkcVarArr;
        this.zzc = (zzvt[]) zzvtVarArr.clone();
        this.zzd = zzcyVar;
        this.zze = obj;
        this.zza = zzkcVarArr.length;
    }

    public final boolean zza(zzwa zzwaVar, int i) {
        return zzwaVar != null && zzen.zzT(this.zzb[i], zzwaVar.zzb[i]) && zzen.zzT(this.zzc[i], zzwaVar.zzc[i]);
    }

    public final boolean zzb(int i) {
        return this.zzb[i] != null;
    }
}

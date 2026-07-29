package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzvo {
    public final int zza;
    public final zzjw[] zzb;
    public final zzvh[] zzc;
    public final zzct zzd;
    public final Object zze;

    public zzvo(zzjw[] zzjwVarArr, zzvh[] zzvhVarArr, zzct zzctVar, Object obj) {
        this.zzb = zzjwVarArr;
        this.zzc = (zzvh[]) zzvhVarArr.clone();
        this.zzd = zzctVar;
        this.zze = obj;
        this.zza = zzjwVarArr.length;
    }

    public final boolean zza(zzvo zzvoVar, int i) {
        return zzvoVar != null && zzeg.zzS(this.zzb[i], zzvoVar.zzb[i]) && zzeg.zzS(this.zzc[i], zzvoVar.zzc[i]);
    }

    public final boolean zzb(int i) {
        return this.zzb[i] != null;
    }
}

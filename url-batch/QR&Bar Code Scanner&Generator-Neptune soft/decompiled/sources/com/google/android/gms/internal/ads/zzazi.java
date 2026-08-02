package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzazi {
    public final zzayt zza;
    public final zzazf zzb;
    public final Object zzc;
    public final zzatd[] zzd;

    public zzazi(zzayt zzaytVar, zzazf zzazfVar, Object obj, zzatd[] zzatdVarArr) {
        this.zza = zzaytVar;
        this.zzb = zzazfVar;
        this.zzc = obj;
        this.zzd = zzatdVarArr;
    }

    public final boolean zza(zzazi zzaziVar, int i) {
        return zzaziVar != null && zzbar.zzo(this.zzb.zza(i), zzaziVar.zzb.zza(i)) && zzbar.zzo(this.zzd[i], zzaziVar.zzd[i]);
    }
}

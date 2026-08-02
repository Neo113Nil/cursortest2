package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
abstract class zzvn {
    public final int zza;
    public final zzcp zzb;
    public final int zzc;
    public final zzaf zzd;

    public zzvn(int i, zzcp zzcpVar, int i2) {
        this.zza = i;
        this.zzb = zzcpVar;
        this.zzc = i2;
        this.zzd = zzcpVar.zzb(i2);
    }

    public abstract int zzb();

    public abstract boolean zzc(zzvn zzvnVar);
}

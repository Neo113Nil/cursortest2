package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzvz {
    private zzvy zza;
    private zzwh zzb;

    public void zzh() {
        this.zza = null;
        this.zzb = null;
    }

    public void zzi(zzk zzkVar) {
        throw null;
    }

    public boolean zzl() {
        throw null;
    }

    public abstract zzwa zzn(zzkb[] zzkbVarArr, zzuh zzuhVar, zzsi zzsiVar, zzcn zzcnVar) throws zzha;

    public abstract void zzo(Object obj);

    protected final zzwh zzp() {
        zzwh zzwhVar = this.zzb;
        zzdd.zzb(zzwhVar);
        return zzwhVar;
    }

    public final void zzq(zzvy zzvyVar, zzwh zzwhVar) {
        this.zza = zzvyVar;
        this.zzb = zzwhVar;
    }

    protected final void zzr() {
        zzvy zzvyVar = this.zza;
        if (zzvyVar != null) {
            zzvyVar.zzj();
        }
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzehd implements zzehc {
    public final zzehc zza;
    private final zzfsm zzb;

    public zzehd(zzehc zzehcVar, zzfsm zzfsmVar) {
        this.zza = zzehcVar;
        this.zzb = zzfsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehc
    public final zzfzp zza(zzfdw zzfdwVar, zzfdk zzfdkVar) {
        return zzfzg.zzm(this.zza.zza(zzfdwVar, zzfdkVar), this.zzb, zzchc.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzehc
    public final boolean zzb(zzfdw zzfdwVar, zzfdk zzfdkVar) {
        return this.zza.zzb(zzfdwVar, zzfdkVar);
    }
}

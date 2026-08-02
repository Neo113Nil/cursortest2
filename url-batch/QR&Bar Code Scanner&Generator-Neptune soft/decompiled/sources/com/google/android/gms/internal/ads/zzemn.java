package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzemn implements zzehc {
    private final zzbjx zza;
    private final zzfzq zzb;
    private final zzfih zzc;
    private final zzemw zzd;

    public zzemn(zzfih zzfihVar, zzfzq zzfzqVar, zzbjx zzbjxVar, zzemw zzemwVar, byte[] bArr) {
        this.zzc = zzfihVar;
        this.zzb = zzfzqVar;
        this.zza = zzbjxVar;
        this.zzd = zzemwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehc
    public final zzfzp zza(zzfdw zzfdwVar, zzfdk zzfdkVar) {
        zzchh zzchhVar = new zzchh();
        zzems zzemsVar = new zzems();
        zzemsVar.zzd(new zzemm(this, zzchhVar, zzfdwVar, zzfdkVar, zzemsVar));
        zzfdp zzfdpVar = zzfdkVar.zzt;
        final zzbjs zzbjsVar = new zzbjs(zzemsVar, zzfdpVar.zzb, zzfdpVar.zza);
        zzfih zzfihVar = this.zzc;
        return zzfhr.zzd(new zzfhl() { // from class: com.google.android.gms.internal.ads.zzeml
            @Override // com.google.android.gms.internal.ads.zzfhl
            public final void zza() {
                zzemn.this.zzc(zzbjsVar);
            }
        }, this.zzb, zzfib.CUSTOM_RENDER_SYN, zzfihVar).zzb(zzfib.CUSTOM_RENDER_ACK).zzd(zzchhVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzehc
    public final boolean zzb(zzfdw zzfdwVar, zzfdk zzfdkVar) {
        zzfdp zzfdpVar;
        return (this.zza == null || (zzfdpVar = zzfdkVar.zzt) == null || zzfdpVar.zza == null) ? false : true;
    }

    final /* synthetic */ void zzc(zzbjs zzbjsVar) throws Exception {
        this.zza.zze(zzbjsVar);
    }
}

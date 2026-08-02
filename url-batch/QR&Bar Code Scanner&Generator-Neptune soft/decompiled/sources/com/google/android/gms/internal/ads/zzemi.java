package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzemi implements zzehc {
    private final Context zza;
    private final zzcxz zzb;
    private final zzbjx zzc;
    private final zzfzq zzd;
    private final zzfih zze;

    public zzemi(Context context, zzcxz zzcxzVar, zzfih zzfihVar, zzfzq zzfzqVar, zzbjx zzbjxVar) {
        this.zza = context;
        this.zzb = zzcxzVar;
        this.zze = zzfihVar;
        this.zzd = zzfzqVar;
        this.zzc = zzbjxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehc
    public final zzfzp zza(zzfdw zzfdwVar, zzfdk zzfdkVar) {
        zzcxd zza = this.zzb.zza(new zzczt(zzfdwVar, zzfdkVar, null), new zzemg(this, new View(this.zza), null, new zzczc() { // from class: com.google.android.gms.internal.ads.zzeme
            @Override // com.google.android.gms.internal.ads.zzczc
            public final com.google.android.gms.ads.internal.client.zzdk zza() {
                return null;
            }
        }, (zzfdl) zzfdkVar.zzv.get(0)));
        zzemh zzk = zza.zzk();
        zzfdp zzfdpVar = zzfdkVar.zzt;
        final zzbjs zzbjsVar = new zzbjs(zzk, zzfdpVar.zzb, zzfdpVar.zza);
        zzfih zzfihVar = this.zze;
        return zzfhr.zzd(new zzfhl() { // from class: com.google.android.gms.internal.ads.zzemf
            @Override // com.google.android.gms.internal.ads.zzfhl
            public final void zza() {
                zzemi.this.zzc(zzbjsVar);
            }
        }, this.zzd, zzfib.CUSTOM_RENDER_SYN, zzfihVar).zzb(zzfib.CUSTOM_RENDER_ACK).zzd(zzfzg.zzi(zza.zza())).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzehc
    public final boolean zzb(zzfdw zzfdwVar, zzfdk zzfdkVar) {
        zzfdp zzfdpVar;
        return (this.zzc == null || (zzfdpVar = zzfdkVar.zzt) == null || zzfdpVar.zza == null) ? false : true;
    }

    final /* synthetic */ void zzc(zzbjs zzbjsVar) throws Exception {
        this.zzc.zze(zzbjsVar);
    }
}

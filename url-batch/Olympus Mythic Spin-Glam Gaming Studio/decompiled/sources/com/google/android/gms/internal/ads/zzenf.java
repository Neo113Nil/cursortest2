package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzenf implements zzemw {
    private final Context zza;
    private final zzcvr zzb;
    private final Executor zzc;

    zzenf(Context context, zzcvr zzcvrVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcvrVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void zza(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzfmd {
        zzfmu zzfmuVar = (zzfmu) zzemtVar.zzb;
        zzflw zzflwVar = zzfloVar.zza.zza;
        String jSONObject = zzfldVar.zzv.toString();
        zzfmuVar.zzy(this.zza, zzflwVar.zzd, jSONObject, (zzbwa) zzemtVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final /* bridge */ /* synthetic */ Object zzb(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzfmd, zzeqf {
        zzcvo zzf = this.zzb.zzf(new zzczb(zzfloVar, zzfldVar, zzemtVar.zza), new zzdnb(new zzene(this, zzemtVar, zzfldVar), null), new zzcvp(zzfldVar.zzaa));
        zzf.zza().zzq(new zzctr((zzfmu) zzemtVar.zzb), this.zzc);
        ((zzeof) zzemtVar.zzc).zzb(zzf.zzf());
        return zzf.zzh();
    }
}

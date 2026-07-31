package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzeeo implements zzeef {
    private final Context zza;
    private final zzcny zzb;
    private final Executor zzc;

    zzeeo(Context context, zzcny zzcnyVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcnyVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final void zza(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj {
        zzfea zzfeaVar = (zzfea) zzeecVar.zzb;
        zzfdc zzfdcVar = zzfcuVar.zza.zza;
        String jSONObject = zzfcjVar.zzv.toString();
        zzfeaVar.zzy(this.zza, zzfdcVar.zzd, jSONObject, (zzbpd) zzeecVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final /* bridge */ /* synthetic */ Object zzb(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj, zzeho {
        zzcnv zzf = this.zzb.zzf(new zzcri(zzfcuVar, zzfcjVar, zzeecVar.zza), new zzdfe(new zzeen(this, zzeecVar, zzfcjVar), null), new zzcnw(zzfcjVar.zzaa));
        zzf.zza().zzq(new zzcly((zzfea) zzeecVar.zzb), this.zzc);
        ((zzefo) zzeecVar.zzc).zzc(zzf.zzf());
        return zzf.zzh();
    }
}

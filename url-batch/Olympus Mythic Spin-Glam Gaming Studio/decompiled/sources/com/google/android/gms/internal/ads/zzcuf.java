package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzcuf implements zzdds {
    private final zzflg zza;
    private final zzflo zzb;
    private final zzfta zzc;
    private final zzfte zzd;

    public zzcuf(zzflo zzfloVar, zzfte zzfteVar, zzfta zzftaVar) {
        this.zzb = zzfloVar;
        this.zzd = zzfteVar;
        this.zzc = zzftaVar;
        this.zza = zzfloVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        List list = this.zza.zza;
        this.zzd.zza(this.zzc.zza(this.zzb, null, list), null);
    }
}

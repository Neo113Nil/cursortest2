package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzeqt implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;
    private final zzhqg zzd;

    private zzeqt(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
        this.zzd = zzhqgVar4;
    }

    public static zzeqt zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        return new zzeqt(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzetb zzetbVar;
        zzesa zzb = ((zzesc) this.zza).zzb();
        zzepd zzepdVar = (zzepd) this.zzb.zzb();
        List list = (List) this.zzc.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzd.zzb();
        if (list.contains("60")) {
            zzetbVar = new zzetb(zzepdVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznF)).intValue(), scheduledExecutorService);
        } else {
            zzetbVar = new zzetb(zzb, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznF)).intValue(), scheduledExecutorService);
        }
        return zzetbVar;
    }
}

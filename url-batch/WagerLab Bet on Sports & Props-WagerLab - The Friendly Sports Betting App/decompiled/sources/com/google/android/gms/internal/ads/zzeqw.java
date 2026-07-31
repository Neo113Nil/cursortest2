package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzeqw implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzeqw(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzeqw zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzeqw(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzetb(((zzesn) this.zza).zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznp)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}

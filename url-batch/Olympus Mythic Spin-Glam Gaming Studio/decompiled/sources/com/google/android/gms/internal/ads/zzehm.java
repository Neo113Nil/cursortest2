package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzehm implements zzeho {
    private final Map zza;
    private final zzhdi zzb;
    private final zzdgt zzc;

    public zzehm(Map map, zzhdi zzhdiVar, zzdgt zzdgtVar) {
        this.zza = map;
        this.zzb = zzhdiVar;
        this.zzc = zzdgtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeho
    public final ListenableFuture zza(final zzcbv zzcbvVar) {
        this.zzc.zzdP(zzcbvVar);
        ListenableFuture zzc = zzhcy.zzc(new zzefb(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjD)).split(StringUtils.COMMA)) {
            final zziol zziolVar = (zziol) this.zza.get(str.trim());
            if (zziolVar != null) {
                zzc = zzhcy.zzh(zzc, zzefb.class, new zzhcg() { // from class: com.google.android.gms.internal.ads.zzehl
                    @Override // com.google.android.gms.internal.ads.zzhcg
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        return ((zzeho) zziol.this.zzb()).zza(zzcbvVar);
                    }
                }, this.zzb);
            }
        }
        zzhcy.zzr(zzc, new zzehk(this), zzcgj.zzh);
        return zzc;
    }

    final /* synthetic */ zzdgt zzb() {
        return this.zzc;
    }
}

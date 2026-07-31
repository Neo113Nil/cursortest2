package com.google.android.gms.internal.ads;

import com.amazon.a.a.o.b.f;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdzh implements zzdzj {
    private final Map zza;
    private final zzgpd zzb;
    private final zzcyw zzc;

    public zzdzh(Map map, zzgpd zzgpdVar, zzcyw zzcywVar) {
        this.zza = map;
        this.zzb = zzgpdVar;
        this.zzc = zzcywVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdzj
    public final ListenableFuture zza(final zzbuv zzbuvVar) {
        this.zzc.zzdT(zzbuvVar);
        ListenableFuture zzc = zzgot.zzc(new zzdwz(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziW)).split(f.f598a)) {
            final zzhqm zzhqmVar = (zzhqm) this.zza.get(str.trim());
            if (zzhqmVar != null) {
                zzc = zzgot.zzh(zzc, zzdwz.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdzg
                    @Override // com.google.android.gms.internal.ads.zzgob
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        return ((zzdzj) zzhqm.this.zzb()).zza(zzbuvVar);
                    }
                }, this.zzb);
            }
        }
        zzgot.zzq(zzc, new zzdzf(this), zzbzh.zzg);
        return zzc;
    }

    final /* synthetic */ zzcyw zzb() {
        return this.zzc;
    }
}

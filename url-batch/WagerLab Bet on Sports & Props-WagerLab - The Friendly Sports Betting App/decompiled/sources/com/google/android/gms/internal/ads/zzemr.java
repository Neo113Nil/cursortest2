package com.google.android.gms.internal.ads;

import com.amazon.a.a.o.b.f;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzemr implements zzeup {
    private final zzgpd zza;
    private final zzfdc zzb;
    private final int zzc;

    zzemr(zzgpd zzgpdVar, zzfdc zzfdcVar, zzfds zzfdsVar, int i) {
        this.zza = zzgpdVar;
        this.zzb = zzfdcVar;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzemq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzemr.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 5;
    }

    final /* synthetic */ zzems zzc() {
        List asList;
        String str = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhv)).booleanValue()) {
            zzfdc zzfdcVar = this.zzb;
            if (this.zzc != 2) {
                String zzc = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfdcVar.zzd);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhx)).booleanValue()) {
                    asList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhy)).split(f.f598a));
                } else {
                    asList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhw)).split(f.f598a));
                }
                if (asList.contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(zzc))) {
                    str = zzfds.zza();
                }
            }
        }
        return new zzems(str);
    }
}

package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzevj implements zzfdi {
    private final zzhdi zza;
    private final zzflw zzb;

    zzevj(zzhdi zzhdiVar, zzflw zzflwVar, zzfmm zzfmmVar) {
        this.zza = zzhdiVar;
        this.zzb = zzflwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzevi
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzevj.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 5;
    }

    final /* synthetic */ zzevk zzc() {
        List asList;
        String str = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzie)).booleanValue()) {
            String zzc = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(this.zzb.zzd);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzig)).booleanValue()) {
                asList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzih)).split(StringUtils.COMMA));
            } else {
                asList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzif)).split(StringUtils.COMMA));
            }
            if (asList.contains(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(zzc))) {
                str = zzfmm.zza();
            }
        }
        return new zzevk(str);
    }
}

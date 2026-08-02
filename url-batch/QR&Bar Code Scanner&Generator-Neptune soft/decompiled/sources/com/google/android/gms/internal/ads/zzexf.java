package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzexf implements zzeve {
    final ScheduledExecutorService zza;
    final Context zzb;
    final zzbzg zzc;

    public zzexf(zzbzg zzbzgVar, ScheduledExecutorService scheduledExecutorService, Context context, byte[] bArr) {
        this.zzc = zzbzgVar;
        this.zza = scheduledExecutorService;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        return zzfzg.zzm(zzfzg.zzo(zzfzg.zzi(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdj)).longValue(), TimeUnit.MILLISECONDS, this.zza), new zzfsm() { // from class: com.google.android.gms.internal.ads.zzexe
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                return new zzexg((Bundle) obj);
            }
        }, zzchc.zza);
    }
}

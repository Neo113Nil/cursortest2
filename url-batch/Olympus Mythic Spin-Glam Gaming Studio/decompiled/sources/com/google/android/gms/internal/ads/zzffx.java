package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzffx implements zzfdi {
    private final zzcfv zza;
    private final boolean zzb;
    private final ScheduledExecutorService zzc;
    private final zzhdi zzd;
    private final int zze;

    zzffx(zzcfv zzcfvVar, boolean z, zzcfl zzcflVar, zzhdi zzhdiVar, String str, ScheduledExecutorService scheduledExecutorService, int i) {
        this.zza = zzcfvVar;
        this.zzb = z;
        this.zzd = zzhdiVar;
        this.zzc = scheduledExecutorService;
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzid)).booleanValue() && this.zzb) {
            return zzhcy.zza(new zzffy(null));
        }
        if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzif)).split(StringUtils.COMMA)).contains(String.valueOf(this.zze))) {
            return zzhcy.zza(new zzffy(null));
        }
        ListenableFuture zza = zzhcy.zza(null);
        zzhdi zzhdiVar = this.zzd;
        return zzhcy.zzg(zzhcy.zzi(zzhcy.zzk(zza, zzffw.zza, zzhdiVar), ((Long) zzblw.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzgub() { // from class: com.google.android.gms.internal.ads.zzffv
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                return zzffx.this.zzc((Exception) obj);
            }
        }, zzhdiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 50;
    }

    final /* synthetic */ zzffy zzc(Exception exc) {
        this.zza.zzh(exc, "TrustlessTokenSignal");
        return new zzffy(null);
    }
}

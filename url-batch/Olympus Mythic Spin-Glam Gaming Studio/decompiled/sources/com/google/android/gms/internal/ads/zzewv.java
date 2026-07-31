package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzewv implements zzfdi {

    @VisibleForTesting
    final zzcfv zza;

    @VisibleForTesting
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzhdi zzd;
    private final Context zze;

    zzewv(Context context, zzcfv zzcfvVar, ScheduledExecutorService scheduledExecutorService, zzhdi zzhdiVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzea)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzcfvVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzhdiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdW)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeb)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdX)).booleanValue()) {
                    return zzhcy.zzk(zzgdv.zza(this.zzb.getAppSetIdInfo(), null), zzewu.zza, zzcgj.zzh);
                }
                Task<AppSetIdInfo> zzb = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzea)).booleanValue() ? zzfnb.zzb(this.zze) : this.zzb.getAppSetIdInfo();
                if (zzb == null) {
                    return zzhcy.zza(new zzeww(null, -1));
                }
                ListenableFuture zzj = zzhcy.zzj(zzgdv.zza(zzb, null), zzews.zza, zzcgj.zzh);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdY)).booleanValue()) {
                    zzj = zzhcy.zzi(zzj, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdZ)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzhcy.zzg(zzj, Exception.class, new zzgub() { // from class: com.google.android.gms.internal.ads.zzewt
                    @Override // com.google.android.gms.internal.ads.zzgub
                    public final /* synthetic */ Object apply(Object obj) {
                        zzewv.this.zza.zzh((Exception) obj, "AppSetIdInfoSignal");
                        return new zzeww(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzhcy.zza(new zzeww(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 11;
    }
}

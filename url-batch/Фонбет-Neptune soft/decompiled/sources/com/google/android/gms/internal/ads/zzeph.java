package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeph implements zzevo {
    final zzbze zza;
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzgcu zzd;
    private final Context zze;

    zzeph(Context context, zzbze zzbzeVar, ScheduledExecutorService scheduledExecutorService, zzgcu zzgcuVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzcA)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzbzeVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgcuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final ListenableFuture zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzcw)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzcB)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzcx)).booleanValue()) {
                    return zzgcj.zzm(zzfsf.zza(this.zzb.getAppSetIdInfo(), null), new zzful() { // from class: com.google.android.gms.internal.ads.zzepe
                        @Override // com.google.android.gms.internal.ads.zzful
                        public final Object apply(Object obj) {
                            AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                            return new zzepi(appSetIdInfo.getId(), appSetIdInfo.getScope());
                        }
                    }, zzbzo.zzf);
                }
                Task<AppSetIdInfo> zza = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzcA)).booleanValue() ? zzfgl.zza(this.zze) : this.zzb.getAppSetIdInfo();
                if (zza == null) {
                    return zzgcj.zzh(new zzepi(null, -1));
                }
                ListenableFuture zzn = zzgcj.zzn(zzfsf.zza(zza, null), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzepf
                    @Override // com.google.android.gms.internal.ads.zzgbq
                    public final ListenableFuture zza(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        return appSetIdInfo == null ? zzgcj.zzh(new zzepi(null, -1)) : zzgcj.zzh(new zzepi(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                    }
                }, zzbzo.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzcy)).booleanValue()) {
                    zzn = zzgcj.zzo(zzn, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzcz)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzgcj.zze(zzn, Exception.class, new zzful() { // from class: com.google.android.gms.internal.ads.zzepg
                    @Override // com.google.android.gms.internal.ads.zzful
                    public final Object apply(Object obj) {
                        zzeph.this.zza.zzw((Exception) obj, "AppSetIdInfoSignal");
                        return new zzepi(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzgcj.zzh(new zzepi(null, -1));
    }
}

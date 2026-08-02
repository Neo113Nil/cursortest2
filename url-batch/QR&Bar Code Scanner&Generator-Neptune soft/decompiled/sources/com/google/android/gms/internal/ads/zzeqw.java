package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeqw implements zzeve {
    final zzcfy zza;
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzfzq zzd;
    private final Context zze;

    zzeqw(Context context, zzcfy zzcfyVar, ScheduledExecutorService scheduledExecutorService, zzfzq zzfzqVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcq)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzcfyVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfzqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcm)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcr)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcn)).booleanValue()) {
                    return zzfzg.zzm(zzfqc.zza(this.zzb.getAppSetIdInfo()), new zzfsm() { // from class: com.google.android.gms.internal.ads.zzeqt
                        @Override // com.google.android.gms.internal.ads.zzfsm
                        public final Object apply(Object obj) {
                            AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                            return new zzeqx(appSetIdInfo.getId(), appSetIdInfo.getScope());
                        }
                    }, zzchc.zzf);
                }
                Task<AppSetIdInfo> zza = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcq)).booleanValue() ? zzffh.zza(this.zze) : this.zzb.getAppSetIdInfo();
                if (zza == null) {
                    return zzfzg.zzi(new zzeqx(null, -1));
                }
                zzfzp zzn = zzfzg.zzn(zzfqc.zza(zza), new zzfyn() { // from class: com.google.android.gms.internal.ads.zzequ
                    @Override // com.google.android.gms.internal.ads.zzfyn
                    public final zzfzp zza(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        return appSetIdInfo == null ? zzfzg.zzi(new zzeqx(null, -1)) : zzfzg.zzi(new zzeqx(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                    }
                }, zzchc.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzco)).booleanValue()) {
                    zzn = zzfzg.zzo(zzn, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcp)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzfzg.zzf(zzn, Exception.class, new zzfsm() { // from class: com.google.android.gms.internal.ads.zzeqv
                    @Override // com.google.android.gms.internal.ads.zzfsm
                    public final Object apply(Object obj) {
                        zzeqw.this.zza.zzt((Exception) obj, "AppSetIdInfoSignal");
                        return new zzeqx(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzfzg.zzi(new zzeqx(null, -1));
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzewh implements zzeve {
    private final zzcfy zza;
    private final String zzb;
    private final ScheduledExecutorService zzc;
    private final zzfzq zzd;
    private final zzbds zze;

    zzewh(String str, zzbds zzbdsVar, zzcfy zzcfyVar, ScheduledExecutorService scheduledExecutorService, zzfzq zzfzqVar, byte[] bArr) {
        this.zzb = str;
        this.zze = zzbdsVar;
        this.zza = zzcfyVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfzqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcm)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcr)).booleanValue()) {
                zzfzp zzn = zzfzg.zzn(zzfqc.zza(Tasks.forResult(null)), new zzfyn() { // from class: com.google.android.gms.internal.ads.zzewf
                    @Override // com.google.android.gms.internal.ads.zzfyn
                    public final zzfzp zza(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        return appSetIdInfo == null ? zzfzg.zzi(new zzewi(null, -1)) : zzfzg.zzi(new zzewi(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                    }
                }, this.zzd);
                if (((Boolean) zzbkh.zza.zze()).booleanValue()) {
                    zzn = zzfzg.zzo(zzn, ((Long) zzbkh.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzfzg.zzf(zzn, Exception.class, new zzfsm() { // from class: com.google.android.gms.internal.ads.zzewg
                    @Override // com.google.android.gms.internal.ads.zzfsm
                    public final Object apply(Object obj) {
                        return zzewh.this.zzc((Exception) obj);
                    }
                }, this.zzd);
            }
        }
        return zzfzg.zzi(new zzewi(null, -1));
    }

    final /* synthetic */ zzewi zzc(Exception exc) {
        this.zza.zzt(exc, "AppSetIdInfoGmscoreSignal");
        return new zzewi(null, -1);
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
final class zzdyg implements zzfuw {
    final /* synthetic */ zzdyi zza;

    zzdyg(zzdyi zzdyiVar) {
        this.zza = zzdyiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        long j;
        zzcga zzcgaVar;
        synchronized (this) {
            this.zza.zzc = true;
            zzdyi zzdyiVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
            j = this.zza.zzd;
            zzdyiVar.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (elapsedRealtime - j));
            zzcgaVar = this.zza.zze;
            zzcgaVar.zze(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        long j;
        Executor executor;
        final String str = (String) obj;
        synchronized (this) {
            this.zza.zzc = true;
            zzdyi zzdyiVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
            j = this.zza.zzd;
            zzdyiVar.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (elapsedRealtime - j));
            executor = this.zza.zzi;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyf
                @Override // java.lang.Runnable
                public final void run() {
                    zzdyg zzdygVar = zzdyg.this;
                    zzdyi.zzj(zzdygVar.zza, str);
                }
            });
        }
    }
}

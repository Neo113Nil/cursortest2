package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzdzq implements zzfzc {
    final /* synthetic */ zzdzs zza;

    zzdzq(zzdzs zzdzsVar) {
        this.zza = zzdzsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final void zza(Throwable th) {
        long j;
        zzchh zzchhVar;
        synchronized (this) {
            this.zza.zzc = true;
            zzdzs zzdzsVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
            j = this.zza.zzd;
            zzdzsVar.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (elapsedRealtime - j));
            zzchhVar = this.zza.zze;
            zzchhVar.zze(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        long j;
        Executor executor;
        final String str = (String) obj;
        synchronized (this) {
            this.zza.zzc = true;
            zzdzs zzdzsVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
            j = this.zza.zzd;
            zzdzsVar.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (elapsedRealtime - j));
            executor = this.zza.zzi;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzp
                @Override // java.lang.Runnable
                public final void run() {
                    zzdzq zzdzqVar = zzdzq.this;
                    zzdzs.zzj(zzdzqVar.zza, str);
                }
            });
        }
    }
}

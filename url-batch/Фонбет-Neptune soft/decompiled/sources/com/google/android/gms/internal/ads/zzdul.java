package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzdul implements zzgcf {
    final /* synthetic */ zzdun zza;

    zzdul(zzdun zzdunVar) {
        this.zza = zzdunVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th) {
        long j;
        zzbzt zzbztVar;
        synchronized (this) {
            this.zza.zzc = true;
            zzdun zzdunVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
            j = this.zza.zzd;
            zzdunVar.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (elapsedRealtime - j));
            zzbztVar = this.zza.zze;
            zzbztVar.zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        long j;
        Executor executor;
        final String str = (String) obj;
        synchronized (this) {
            this.zza.zzc = true;
            zzdun zzdunVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
            j = this.zza.zzd;
            zzdunVar.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (elapsedRealtime - j));
            executor = this.zza.zzi;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduk
                @Override // java.lang.Runnable
                public final void run() {
                    zzdun.zzj(zzdul.this.zza, str);
                }
            });
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
final class zzeck implements zzhcv {
    final /* synthetic */ zzecu zza;

    zzeck(zzecu zzecuVar) {
        Objects.requireNonNull(zzecuVar);
        this.zza = zzecuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        synchronized (this) {
            zzecu zzecuVar = this.zza;
            zzecuVar.zzn(true);
            zzecuVar.zzm("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzecuVar.zzo()));
            zzecuVar.zzp().zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            zzecu zzecuVar = this.zza;
            zzecuVar.zzn(true);
            zzecuVar.zzm("com.google.android.gms.ads.MobileAds", true, "", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzecuVar.zzo()));
            zzecuVar.zzq().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeck.this.zza.zzl(str);
                }
            });
        }
    }
}

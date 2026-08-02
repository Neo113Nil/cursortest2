package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzebb extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ zzebe zzb;

    zzebb(zzebe zzebeVar, String str) {
        this.zzb = zzebeVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzi;
        zzebe zzebeVar = this.zzb;
        zzi = zzebe.zzi(loadAdError);
        zzebeVar.zzj(zzi, this.zza);
    }
}

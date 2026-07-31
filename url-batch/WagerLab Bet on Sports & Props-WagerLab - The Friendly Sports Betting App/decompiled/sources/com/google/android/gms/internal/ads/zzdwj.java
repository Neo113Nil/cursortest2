package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzdwj extends AdListener {
    final /* synthetic */ zzdwp zza;

    zzdwj(zzdwp zzdwpVar) {
        Objects.requireNonNull(zzdwpVar);
        this.zza = zzdwpVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzm;
        zzdwp zzdwpVar = this.zza;
        zzm = zzdwp.zzm(loadAdError);
        zzdwpVar.zzg(zzm);
    }
}

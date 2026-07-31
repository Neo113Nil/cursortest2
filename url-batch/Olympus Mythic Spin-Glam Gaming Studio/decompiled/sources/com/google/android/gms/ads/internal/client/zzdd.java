package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.MuteThisAdListener;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes8.dex */
public final class zzdd extends zzdb {
    private final MuteThisAdListener zza;

    public zzdd(MuteThisAdListener muteThisAdListener) {
        this.zza = muteThisAdListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdc
    public final void zze() {
        this.zza.onAdMuted();
    }
}

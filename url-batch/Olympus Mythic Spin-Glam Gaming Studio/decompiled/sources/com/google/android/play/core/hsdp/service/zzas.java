package com.google.android.play.core.hsdp.service;

import android.os.Bundle;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkService;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes11.dex */
abstract class zzas implements HsdpDeepLinkService.HsdpDeepLinkServiceListener {
    private final HsdpDeepLinkService.HsdpDeepLinkServiceListener zza;

    zzas(HsdpDeepLinkService.HsdpDeepLinkServiceListener hsdpDeepLinkServiceListener) {
        this.zza = hsdpDeepLinkServiceListener;
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public void onDismissed(Bundle bundle) {
        this.zza.onDismissed(bundle);
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public void onError(Bundle bundle) {
        this.zza.onError(bundle);
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public void onShown(Bundle bundle) {
        this.zza.onShown(bundle);
    }
}

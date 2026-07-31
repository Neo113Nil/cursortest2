package com.google.android.gms.ads.internal.client.hsdp;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkService;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes14.dex */
final class zzb implements HsdpDeepLinkService.HsdpDeepLinkServiceListener {
    final /* synthetic */ IHsdpServiceCallback zza;

    zzb(HsdpDeepLinkServiceWrapper hsdpDeepLinkServiceWrapper, IHsdpServiceCallback iHsdpServiceCallback) {
        this.zza = iHsdpServiceCallback;
        Objects.requireNonNull(hsdpDeepLinkServiceWrapper);
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public final void onAffordanceEnded() {
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public final void onAffordanceStarted() {
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public final void onDeepLinkStarted() {
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public final void onDismissed(Bundle bundle) {
        IHsdpServiceCallback iHsdpServiceCallback = this.zza;
        if (iHsdpServiceCallback != null) {
            try {
                iHsdpServiceCallback.onDismissed(bundle);
            } catch (RemoteException e) {
                zzo.zzg("RemoteException in onDismissed", e);
            }
        }
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public final void onError(Bundle bundle) {
        IHsdpServiceCallback iHsdpServiceCallback = this.zza;
        if (iHsdpServiceCallback != null) {
            try {
                iHsdpServiceCallback.onError(bundle);
            } catch (RemoteException e) {
                zzo.zzg("RemoteException in onError", e);
            }
        }
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public final void onShown(Bundle bundle) {
        IHsdpServiceCallback iHsdpServiceCallback = this.zza;
        if (iHsdpServiceCallback != null) {
            try {
                iHsdpServiceCallback.onShown(bundle);
            } catch (RemoteException e) {
                zzo.zzg("RemoteException in onShown", e);
            }
        }
    }
}

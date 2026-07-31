package com.google.android.gms.ads.internal.client.hsdp;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkService;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes14.dex */
final class zza implements HsdpDeepLinkService.HsdpPrewarmListener {
    final /* synthetic */ IHsdpPrewarmServiceCallback zza;

    zza(HsdpDeepLinkServiceWrapper hsdpDeepLinkServiceWrapper, IHsdpPrewarmServiceCallback iHsdpPrewarmServiceCallback) {
        this.zza = iHsdpPrewarmServiceCallback;
        Objects.requireNonNull(hsdpDeepLinkServiceWrapper);
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpPrewarmListener
    public final void onCompleted(Bundle bundle) {
        IHsdpPrewarmServiceCallback iHsdpPrewarmServiceCallback = this.zza;
        if (iHsdpPrewarmServiceCallback != null) {
            try {
                iHsdpPrewarmServiceCallback.onPrewarmCompleted(bundle);
            } catch (RemoteException e) {
                zzo.zzg("RemoteException in HsdpPrewarmListener.onCompleted", e);
            }
        }
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpPrewarmListener
    public final void onError(Bundle bundle) {
        IHsdpPrewarmServiceCallback iHsdpPrewarmServiceCallback = this.zza;
        if (iHsdpPrewarmServiceCallback != null) {
            try {
                iHsdpPrewarmServiceCallback.onError(bundle);
            } catch (RemoteException e) {
                zzo.zzg("RemoteException in HsdpPrewarmListener.onError", e);
            }
        }
    }
}

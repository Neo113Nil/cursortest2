package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzfks implements OnAdMetadataChangedListener {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzdn zza;
    final /* synthetic */ zzfku zzb;

    zzfks(zzfku zzfkuVar, com.google.android.gms.ads.internal.client.zzdn zzdnVar) {
        this.zza = zzdnVar;
        Objects.requireNonNull(zzfkuVar);
        this.zzb = zzfkuVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        if (this.zzb.zzv() != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}

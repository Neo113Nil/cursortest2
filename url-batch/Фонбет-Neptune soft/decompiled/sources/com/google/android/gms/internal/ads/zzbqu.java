package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbqu implements MediationAdLoadCallback {
    final /* synthetic */ zzbqf zza;
    final /* synthetic */ zzbos zzb;

    zzbqu(zzbqy zzbqyVar, zzbqf zzbqfVar, zzbos zzbosVar) {
        this.zza = zzbqfVar;
        this.zzb = zzbosVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.zza.zzf(adError.zza());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        UnifiedNativeAdMapper unifiedNativeAdMapper = (UnifiedNativeAdMapper) obj;
        if (unifiedNativeAdMapper != null) {
            try {
                this.zza.zzg(new zzbpt(unifiedNativeAdMapper));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
            }
            return new zzbqz(this.zzb);
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.zza.zze("Adapter returned null.");
            return null;
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}

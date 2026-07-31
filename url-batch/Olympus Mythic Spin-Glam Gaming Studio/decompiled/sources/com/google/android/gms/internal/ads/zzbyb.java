package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes4.dex */
final class zzbyb implements MediationAdLoadCallback {
    final /* synthetic */ zzbxn zza;
    final /* synthetic */ zzbwa zzb;

    zzbyb(zzbyg zzbygVar, zzbxn zzbxnVar, zzbwa zzbwaVar) {
        this.zza = zzbxnVar;
        this.zzb = zzbwaVar;
        Objects.requireNonNull(zzbygVar);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.zza.zzg(adError.zza());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    @Nullable
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        NativeAdMapper nativeAdMapper = (NativeAdMapper) obj;
        if (nativeAdMapper != null) {
            try {
                this.zza.zze(new zzbwz(nativeAdMapper));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            }
            return new zzbyh(this.zzb);
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.zza.zzf("Adapter returned null.");
            return null;
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
            return null;
        }
    }
}

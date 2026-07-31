package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzbzh implements NativeCustomFormatAd {
    private final zzbnm zza;

    @Nullable
    private NativeCustomFormatAd.DisplayOpenMeasurement zzb;

    @VisibleForTesting
    public zzbzh(zzbnm zzbnmVar) {
        this.zza = zzbnmVar;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void destroy() {
        try {
            this.zza.zzl();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    @Nullable
    public final List<String> getAvailableAssetNames() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    @Nullable
    public final String getCustomFormatId() {
        try {
            return this.zza.zzh();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    @Nullable
    public final NativeCustomFormatAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.zzb == null) {
                zzbnm zzbnmVar = this.zza;
                if (zzbnmVar.zzo()) {
                    this.zzb = new zzbzb(zzbnmVar);
                }
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    @Nullable
    public final NativeAd.Image getImage(String str) {
        try {
            zzbmv zzf = this.zza.zzf(str);
            if (zzf != null) {
                return new zzbzc(zzf);
            }
            return null;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    @Nullable
    public final MediaContent getMediaContent() {
        try {
            zzbnm zzbnmVar = this.zza;
            if (zzbnmVar.zzs() != null) {
                return new com.google.android.gms.ads.internal.client.zzfb(zzbnmVar.zzs(), zzbnmVar);
            }
            return null;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    @Nullable
    public final CharSequence getText(String str) {
        try {
            return this.zza.zze(str);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void performClick(String str) {
        try {
            this.zza.zzi(str);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void recordImpression() {
        try {
            this.zza.zzj();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzbgv extends AppOpenAd {

    @Nullable
    FullScreenContentCallback zza;
    private final zzbgz zzb;
    private final AtomicReference zzc;
    private final zzbgw zzd;

    @Nullable
    private OnPaidEventListener zze;
    private final AtomicLong zzf;

    public zzbgv(zzbgz zzbgzVar) {
        this.zzd = new zzbgw();
        this.zzf = new AtomicLong();
        this.zzb = zzbgzVar;
        this.zzc = new AtomicReference();
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final String getAdUnitId() {
        String str;
        String str2;
        AtomicReference atomicReference = this.zzc;
        if (atomicReference.get() != null) {
            return (String) atomicReference.get();
        }
        synchronized (this) {
            try {
                str = this.zzb.zzj();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                str = null;
            }
            if (str == null) {
                this.zzc.set("");
            } else {
                this.zzc.set(str);
            }
            str2 = (String) this.zzc.get();
        }
        return str2;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    @Nullable
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    @Nullable
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final long getPlacementId() {
        long j;
        AtomicLong atomicLong = this.zzf;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    long zzk = this.zzb.zzk();
                    AtomicLong atomicLong2 = this.zzf;
                    atomicLong2.set(zzk);
                    j = atomicLong2.get();
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                    return 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    @NonNull
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVar;
        try {
            zzdxVar = this.zzb.zzg();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            zzdxVar = null;
        }
        return ResponseInfo.zzc(zzdxVar);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setFullScreenContentCallback(@Nullable FullScreenContentCallback fullScreenContentCallback) {
        this.zza = fullScreenContentCallback;
        this.zzd.zza(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setImmersiveMode(boolean z) {
        try {
            this.zzb.zzh(z);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener) {
        this.zze = onPaidEventListener;
        try {
            this.zzb.zzi(new com.google.android.gms.ads.internal.client.zzfo(onPaidEventListener));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setPlacementId(long j) {
        try {
            this.zzb.zzl(j);
            this.zzf.set(j);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void show(@NonNull Activity activity) {
        try {
            this.zzb.zzf(ObjectWrapper.wrap(activity), this.zzd);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public zzbgv(zzbgz zzbgzVar, String str) {
        this.zzd = new zzbgw();
        this.zzf = new AtomicLong();
        this.zzb = zzbgzVar;
        this.zzc = new AtomicReference(str);
    }
}

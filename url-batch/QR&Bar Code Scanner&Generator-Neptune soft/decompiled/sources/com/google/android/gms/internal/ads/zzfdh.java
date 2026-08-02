package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfdh extends zzcbu {
    private final zzfcx zza;
    private final zzfcn zzb;
    private final zzfdx zzc;
    private zzduc zzd;
    private boolean zze = false;

    public zzfdh(zzfcx zzfcxVar, zzfcn zzfcnVar, zzfdx zzfdxVar) {
        this.zza = zzfcxVar;
        this.zzb = zzfcnVar;
        this.zzc = zzfdxVar;
    }

    private final synchronized boolean zzy() {
        boolean z;
        zzduc zzducVar = this.zzd;
        if (zzducVar != null) {
            z = zzducVar.zze() ? false : true;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final Bundle zzb() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzduc zzducVar = this.zzd;
        return zzducVar != null ? zzducVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final synchronized com.google.android.gms.ads.internal.client.zzdh zzc() throws RemoteException {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfQ)).booleanValue()) {
            return null;
        }
        zzduc zzducVar = this.zzd;
        if (zzducVar == null) {
            return null;
        }
        return zzducVar.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final synchronized String zzd() throws RemoteException {
        zzduc zzducVar = this.zzd;
        if (zzducVar == null || zzducVar.zzl() == null) {
            return null;
        }
        return zzducVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zze() throws RemoteException {
        zzf(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzb(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzm().zza(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final synchronized void zzg(zzcbz zzcbzVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        String str = zzcbzVar.zzb;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzey);
        if (str2 != null && str != null) {
            try {
                if (Pattern.matches(str2, str)) {
                    return;
                }
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "NonagonUtil.isPatternMatched");
            }
        }
        if (zzy()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeA)).booleanValue()) {
                return;
            }
        }
        zzfcp zzfcpVar = new zzfcp(null);
        this.zzd = null;
        this.zza.zzj(1);
        this.zza.zzb(zzcbzVar.zza, zzcbzVar.zzb, zzfcpVar, new zzfdf(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzh() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzb(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzj() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzc(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzl(com.google.android.gms.ads.internal.client.zzbw zzbwVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzbwVar == null) {
            this.zzb.zzb(null);
        } else {
            this.zzb.zzb(new zzfdg(this, zzbwVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final synchronized void zzm(String str) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final synchronized void zzn(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzo(zzcby zzcbyVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzf(zzcbyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final synchronized void zzp(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final synchronized void zzq() throws RemoteException {
        zzr(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final synchronized void zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (this.zzd != null) {
            Activity activity = null;
            if (iObjectWrapper != null) {
                Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
                if (unwrap instanceof Activity) {
                    activity = (Activity) unwrap;
                }
            }
            this.zzd.zzh(this.zze, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final boolean zzs() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final boolean zzt() {
        zzduc zzducVar = this.zzd;
        return zzducVar != null && zzducVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzu(zzcbt zzcbtVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzh(zzcbtVar);
    }
}

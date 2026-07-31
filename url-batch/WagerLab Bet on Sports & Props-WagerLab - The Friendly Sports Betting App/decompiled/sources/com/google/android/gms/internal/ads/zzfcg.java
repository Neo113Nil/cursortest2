package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfcg extends zzbvj {
    private final zzfbw zza;
    private final zzfbn zzb;
    private final zzfcv zzc;
    private zzdom zzd;
    private boolean zze = false;

    public zzfcg(zzfbw zzfbwVar, zzfbn zzfbnVar, zzfcv zzfcvVar) {
        this.zza = zzfbwVar;
        this.zzb = zzfbnVar;
        this.zzc = zzfcvVar;
    }

    private final synchronized boolean zzy() {
        zzdom zzdomVar = this.zzd;
        if (zzdomVar != null) {
            if (!zzdomVar.zze()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbci.zzfX)).booleanValue() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (java.util.regex.Pattern.matches(r1, r0) != false) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzbvk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzb(zzbvo zzbvoVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        String str = zzbvoVar.zzb;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfV);
        if (str2 != null && str != null) {
            try {
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "NonagonUtil.isPatternMatched");
            }
        }
        if (zzy()) {
        }
        zzfbp zzfbpVar = new zzfbp(null);
        this.zzd = null;
        zzfbw zzfbwVar = this.zza;
        zzfbwVar.zzj(1);
        zzfbwVar.zza(zzbvoVar.zza, zzbvoVar.zzb, zzfbpVar, new zzfce(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final synchronized void zzc() throws RemoteException {
        zzp(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzd(zzbvn zzbvnVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzn(zzbvnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final boolean zze() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzf() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzg() {
        zzj(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzh() throws RemoteException {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zza(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zzb(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzk(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzl().zzc(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final synchronized String zzl() throws RemoteException {
        zzdom zzdomVar = this.zzd;
        if (zzdomVar == null || zzdomVar.zzn() == null) {
            return null;
        }
        return zzdomVar.zzn().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final synchronized void zzm(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzn(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzcbVar == null) {
            this.zzb.zzk(null);
        } else {
            this.zzb.zzk(new zzfcf(this, zzcbVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final Bundle zzo() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdom zzdomVar = this.zzd;
        return zzdomVar != null ? zzdomVar.zzg() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final synchronized void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (this.zzd != null) {
            Activity activity = null;
            if (iObjectWrapper != null) {
                Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
                if (unwrap instanceof Activity) {
                    activity = (Activity) unwrap;
                }
            }
            this.zzd.zza(this.zze, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final synchronized void zzq(String str) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final synchronized void zzr(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final boolean zzs() {
        zzdom zzdomVar = this.zzd;
        return zzdomVar != null && zzdomVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final synchronized com.google.android.gms.ads.internal.client.zzea zzt() throws RemoteException {
        zzdom zzdomVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhg)).booleanValue() && (zzdomVar = this.zzd) != null) {
            return zzdomVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzu(zzbvi zzbviVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzp(zzbviVar);
    }

    final /* synthetic */ zzfcv zzv() {
        return this.zzc;
    }

    final /* synthetic */ zzdom zzw() {
        return this.zzd;
    }

    final /* synthetic */ void zzx(zzdom zzdomVar) {
        this.zzd = zzdomVar;
    }
}

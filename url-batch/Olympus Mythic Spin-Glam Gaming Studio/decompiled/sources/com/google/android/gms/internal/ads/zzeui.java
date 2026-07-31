package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzeui extends com.google.android.gms.ads.internal.client.zzbt {
    private final com.google.android.gms.ads.internal.client.zzr zza;
    private final Context zzb;
    private final zzfjg zzc;
    private final String zzd;
    private final VersionInfoParcel zze;
    private final zzeua zzf;
    private final zzfkh zzg;
    private final zzbbd zzh;
    private final zzeaj zzi;

    @Nullable
    private zzdmx zzj;
    private boolean zzk;

    public zzeui(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzfjg zzfjgVar, zzeua zzeuaVar, zzfkh zzfkhVar, VersionInfoParcel versionInfoParcel, zzbbd zzbbdVar, zzeaj zzeajVar) {
        this.zza = zzrVar;
        this.zzd = str;
        this.zzb = context;
        this.zzc = zzfjgVar;
        this.zzf = zzeuaVar;
        this.zzg = zzfkhVar;
        this.zze = versionInfoParcel;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbv)).booleanValue() || Build.VERSION.SDK_INT < 35) {
            this.zzk = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbu)).booleanValue();
        } else {
            this.zzk = true;
        }
        this.zzh = zzbbdVar;
        this.zzi = zzeajVar;
    }

    private final synchronized boolean zzN() {
        zzdmx zzdmxVar = this.zzj;
        if (zzdmxVar != null) {
            if (!zzdmxVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzA() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB(zzccn zzccnVar) {
        this.zzg.zzn(zzccnVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzea zzE() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(com.google.android.gms.ads.internal.client.zzee zzeeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(com.google.android.gms.ads.internal.client.zzx zzxVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzbhc zzbhcVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzJ(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzk = z;
    }

    public final void zzK(zzfua zzfuaVar) {
        this.zzf.zzn(zzfuaVar);
    }

    final /* synthetic */ zzdmx zzL() {
        return this.zzj;
    }

    final /* synthetic */ void zzM(zzdmx zzdmxVar) {
        this.zzj = zzdmxVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdqVar.zzf()) {
                this.zzi.zzb();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzf.zzp(zzdqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) throws RemoteException {
        this.zzf.zzq(zzbkVar);
        zzd(zzmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzQ(IObjectWrapper iObjectWrapper) {
        if (this.zzj == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Interstitial can not be shown before loaded.");
            this.zzf.zzj(zzfmy.zzd(9, null, null));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdL)).booleanValue()) {
                this.zzh.zzb().zzi(new Throwable().getStackTrace());
            }
            this.zzj.zza(this.zzk, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzf.zzr(zzcsVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzS(long j) {
        zzdmx zzdmxVar = this.zzj;
        if (zzdmxVar == null || zzdmxVar.zzo() == null) {
            return;
        }
        zzdmxVar.zzo().zzb(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized long zzT() {
        zzdmx zzdmxVar = this.zzj;
        if (zzdmxVar == null || zzdmxVar.zzo() == null) {
            return 0L;
        }
        return zzdmxVar.zzo().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zza() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzb() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzdmx zzdmxVar = this.zzj;
        if (zzdmxVar != null) {
            zzdmxVar.zzl().zzc(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzc() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzN();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzd(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        boolean z;
        try {
            if (!zzmVar.zzb()) {
                if (((Boolean) zzblf.zzi.zze()).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmO)).booleanValue()) {
                        z = true;
                        if (this.zze.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmP)).intValue() || !z) {
                            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                        }
                    }
                }
                z = false;
                if (this.zze.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmP)).intValue()) {
                }
                Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            Context context = this.zzb;
            if (com.google.android.gms.ads.internal.util.zzs.zzK(context) && zzmVar.zzs == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
                zzeua zzeuaVar = this.zzf;
                if (zzeuaVar != null) {
                    zzeuaVar.zzdJ(zzfmy.zzd(4, null, null));
                }
            } else if (!zzN()) {
                zzfmt.zzb(context, zzmVar.zzf);
                this.zzj = null;
                return this.zzc.zza(zzmVar, this.zzd, new zzfiz(this.zza), new zzeuh(this));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzdU(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzo(zzclVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zze() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        zzdmx zzdmxVar = this.zzj;
        if (zzdmxVar != null) {
            zzdmxVar.zzl().zza(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzf() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        zzdmx zzdmxVar = this.zzj;
        if (zzdmxVar != null) {
            zzdmxVar.zzl().zzb(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzf.zzl(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzj() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzk() {
        Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
        if (this.zzj == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Interstitial can not be shown before loaded.");
            this.zzf.zzj(zzfmy.zzd(9, null, null));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdL)).booleanValue()) {
                this.zzh.zzb().zzi(new Throwable().getStackTrace());
            }
            this.zzj.zza(this.zzk, null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzr zzm() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzn(com.google.android.gms.ads.internal.client.zzr zzrVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(zzcac zzcacVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(zzcaf zzcafVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final synchronized String zzq() {
        zzdmx zzdmxVar = this.zzj;
        if (zzdmxVar == null || zzdmxVar.zzn() == null) {
            return null;
        }
        return zzdmxVar.zzn().zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final synchronized String zzr() {
        zzdmx zzdmxVar = this.zzj;
        if (zzdmxVar == null || zzdmxVar.zzn() == null) {
            return null;
        }
        return zzdmxVar.zzn().zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzdx zzs() {
        zzdmx zzdmxVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhO)).booleanValue() && (zzdmxVar = this.zzj) != null) {
            return zzdmxVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzt() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcl zzu() {
        return this.zzf.zzk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzv() {
        return this.zzf.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzw(zzbkb zzbkbVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzc.zzc(zzbkbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzz() {
        return false;
    }
}

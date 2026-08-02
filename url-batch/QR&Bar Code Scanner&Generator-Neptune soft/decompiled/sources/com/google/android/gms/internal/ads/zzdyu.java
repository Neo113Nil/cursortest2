package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdyu {
    private final zzbqr zza;

    zzdyu(zzbqr zzbqrVar) {
        this.zza = zzbqrVar;
    }

    private final void zzs(zzdyt zzdytVar) throws RemoteException {
        String zza = zzdyt.zza(zzdytVar);
        com.google.android.gms.ads.internal.util.zze.zzi("Dispatching AFMA event on publisher webview: ".concat(zza));
        this.zza.zzb(zza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdyt("initialize", null));
    }

    public final void zzb(long j) throws RemoteException {
        zzdyt zzdytVar = new zzdyt("interstitial", null);
        zzdytVar.zza = Long.valueOf(j);
        zzdytVar.zzc = "onAdClicked";
        this.zza.zzb(zzdyt.zza(zzdytVar));
    }

    public final void zzc(long j) throws RemoteException {
        zzdyt zzdytVar = new zzdyt("interstitial", null);
        zzdytVar.zza = Long.valueOf(j);
        zzdytVar.zzc = "onAdClosed";
        zzs(zzdytVar);
    }

    public final void zzd(long j, int i) throws RemoteException {
        zzdyt zzdytVar = new zzdyt("interstitial", null);
        zzdytVar.zza = Long.valueOf(j);
        zzdytVar.zzc = "onAdFailedToLoad";
        zzdytVar.zzd = Integer.valueOf(i);
        zzs(zzdytVar);
    }

    public final void zze(long j) throws RemoteException {
        zzdyt zzdytVar = new zzdyt("interstitial", null);
        zzdytVar.zza = Long.valueOf(j);
        zzdytVar.zzc = "onAdLoaded";
        zzs(zzdytVar);
    }

    public final void zzf(long j) throws RemoteException {
        zzdyt zzdytVar = new zzdyt("interstitial", null);
        zzdytVar.zza = Long.valueOf(j);
        zzdytVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdytVar);
    }

    public final void zzg(long j) throws RemoteException {
        zzdyt zzdytVar = new zzdyt("interstitial", null);
        zzdytVar.zza = Long.valueOf(j);
        zzdytVar.zzc = "onAdOpened";
        zzs(zzdytVar);
    }

    public final void zzh(long j) throws RemoteException {
        zzdyt zzdytVar = new zzdyt("creation", null);
        zzdytVar.zza = Long.valueOf(j);
        zzdytVar.zzc = "nativeObjectCreated";
        zzs(zzdytVar);
    }

    public final void zzi(long j) throws RemoteException {
        zzdyt zzdytVar = new zzdyt("creation", null);
        zzdytVar.zza = Long.valueOf(j);
        zzdytVar.zzc = "nativeObjectNotCreated";
        zzs(zzdytVar);
    }

    public final void zzj(long j) throws RemoteException {
        zzdyt zzdytVar = new zzdyt("rewarded", null);
        zzdytVar.zza = Long.valueOf(j);
        zzdytVar.zzc = "onAdClicked";
        zzs(zzdytVar);
    }

    public final void zzk(long j) throws RemoteException {
        zzdyt zzdytVar = new zzdyt("rewarded", null);
        zzdytVar.zza = Long.valueOf(j);
        zzdytVar.zzc = "onRewardedAdClosed";
        zzs(zzdytVar);
    }

    public final void zzl(long j, zzcci zzcciVar) throws RemoteException {
        zzdyt zzdytVar = new zzdyt("rewarded", null);
        zzdytVar.zza = Long.valueOf(j);
        zzdytVar.zzc = "onUserEarnedReward";
        zzdytVar.zze = zzcciVar.zzf();
        zzdytVar.zzf = Integer.valueOf(zzcciVar.zze());
        zzs(zzdytVar);
    }

    public final void zzm(long j, int i) throws RemoteException {
        zzdyt zzdytVar = new zzdyt("rewarded", null);
        zzdytVar.zza = Long.valueOf(j);
        zzdytVar.zzc = "onRewardedAdFailedToLoad";
        zzdytVar.zzd = Integer.valueOf(i);
        zzs(zzdytVar);
    }

    public final void zzn(long j, int i) throws RemoteException {
        zzdyt zzdytVar = new zzdyt("rewarded", null);
        zzdytVar.zza = Long.valueOf(j);
        zzdytVar.zzc = "onRewardedAdFailedToShow";
        zzdytVar.zzd = Integer.valueOf(i);
        zzs(zzdytVar);
    }

    public final void zzo(long j) throws RemoteException {
        zzdyt zzdytVar = new zzdyt("rewarded", null);
        zzdytVar.zza = Long.valueOf(j);
        zzdytVar.zzc = "onAdImpression";
        zzs(zzdytVar);
    }

    public final void zzp(long j) throws RemoteException {
        zzdyt zzdytVar = new zzdyt("rewarded", null);
        zzdytVar.zza = Long.valueOf(j);
        zzdytVar.zzc = "onRewardedAdLoaded";
        zzs(zzdytVar);
    }

    public final void zzq(long j) throws RemoteException {
        zzdyt zzdytVar = new zzdyt("rewarded", null);
        zzdytVar.zza = Long.valueOf(j);
        zzdytVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdytVar);
    }

    public final void zzr(long j) throws RemoteException {
        zzdyt zzdytVar = new zzdyt("rewarded", null);
        zzdytVar.zza = Long.valueOf(j);
        zzdytVar.zzc = "onRewardedAdOpened";
        zzs(zzdytVar);
    }
}

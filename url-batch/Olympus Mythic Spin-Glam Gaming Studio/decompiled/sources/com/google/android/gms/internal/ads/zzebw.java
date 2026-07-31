package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.ironsource.Zf;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzebw {
    private final zzbri zza;

    zzebw(zzbri zzbriVar) {
        this.zza = zzbriVar;
    }

    private final void zzs(zzebv zzebvVar) throws RemoteException {
        String zza = zzebvVar.zza();
        String concat = "Dispatching AFMA event on publisher webview: ".concat(zza);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(concat);
        this.zza.zza(zza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzebv("initialize", null));
    }

    public final void zzb(long j) throws RemoteException {
        zzebv zzebvVar = new zzebv("creation", null);
        zzebvVar.zzb(Long.valueOf(j));
        zzebvVar.zzc("nativeObjectCreated");
        zzs(zzebvVar);
    }

    public final void zzc(long j) throws RemoteException {
        zzebv zzebvVar = new zzebv("creation", null);
        zzebvVar.zzb(Long.valueOf(j));
        zzebvVar.zzc("nativeObjectNotCreated");
        zzs(zzebvVar);
    }

    public final void zzd(long j) throws RemoteException {
        zzebv zzebvVar = new zzebv("interstitial", null);
        zzebvVar.zzb(Long.valueOf(j));
        zzebvVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzebvVar);
    }

    public final void zze(long j) throws RemoteException {
        zzebv zzebvVar = new zzebv("interstitial", null);
        zzebvVar.zzb(Long.valueOf(j));
        zzebvVar.zzc(Zf.j);
        zzs(zzebvVar);
    }

    public final void zzf(long j, int i) throws RemoteException {
        zzebv zzebvVar = new zzebv("interstitial", null);
        zzebvVar.zzb(Long.valueOf(j));
        zzebvVar.zzc("onAdFailedToLoad");
        zzebvVar.zzd(Integer.valueOf(i));
        zzs(zzebvVar);
    }

    public final void zzg(long j) throws RemoteException {
        zzebv zzebvVar = new zzebv("interstitial", null);
        zzebvVar.zzb(Long.valueOf(j));
        zzebvVar.zzc(Zf.c);
        zzs(zzebvVar);
    }

    public final void zzh(long j) throws RemoteException {
        zzebv zzebvVar = new zzebv("interstitial", null);
        zzebvVar.zzb(Long.valueOf(j));
        zzebvVar.zzc(Zf.f);
        this.zza.zza(zzebvVar.zza());
    }

    public final void zzi(long j) throws RemoteException {
        zzebv zzebvVar = new zzebv("interstitial", null);
        zzebvVar.zzb(Long.valueOf(j));
        zzebvVar.zzc(Zf.g);
        zzs(zzebvVar);
    }

    public final void zzj(long j) throws RemoteException {
        zzebv zzebvVar = new zzebv("rewarded", null);
        zzebvVar.zzb(Long.valueOf(j));
        zzebvVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzebvVar);
    }

    public final void zzk(long j) throws RemoteException {
        zzebv zzebvVar = new zzebv("rewarded", null);
        zzebvVar.zzb(Long.valueOf(j));
        zzebvVar.zzc("onRewardedAdLoaded");
        zzs(zzebvVar);
    }

    public final void zzl(long j, int i) throws RemoteException {
        zzebv zzebvVar = new zzebv("rewarded", null);
        zzebvVar.zzb(Long.valueOf(j));
        zzebvVar.zzc("onRewardedAdFailedToLoad");
        zzebvVar.zzd(Integer.valueOf(i));
        zzs(zzebvVar);
    }

    public final void zzm(long j) throws RemoteException {
        zzebv zzebvVar = new zzebv("rewarded", null);
        zzebvVar.zzb(Long.valueOf(j));
        zzebvVar.zzc("onRewardedAdOpened");
        zzs(zzebvVar);
    }

    public final void zzn(long j, int i) throws RemoteException {
        zzebv zzebvVar = new zzebv("rewarded", null);
        zzebvVar.zzb(Long.valueOf(j));
        zzebvVar.zzc("onRewardedAdFailedToShow");
        zzebvVar.zzd(Integer.valueOf(i));
        zzs(zzebvVar);
    }

    public final void zzo(long j) throws RemoteException {
        zzebv zzebvVar = new zzebv("rewarded", null);
        zzebvVar.zzb(Long.valueOf(j));
        zzebvVar.zzc("onRewardedAdClosed");
        zzs(zzebvVar);
    }

    public final void zzp(long j, zzccx zzccxVar) throws RemoteException {
        zzebv zzebvVar = new zzebv("rewarded", null);
        zzebvVar.zzb(Long.valueOf(j));
        zzebvVar.zzc("onUserEarnedReward");
        zzebvVar.zze(zzccxVar.zze());
        zzebvVar.zzf(Integer.valueOf(zzccxVar.zzf()));
        zzs(zzebvVar);
    }

    public final void zzq(long j) throws RemoteException {
        zzebv zzebvVar = new zzebv("rewarded", null);
        zzebvVar.zzb(Long.valueOf(j));
        zzebvVar.zzc("onAdImpression");
        zzs(zzebvVar);
    }

    public final void zzr(long j) throws RemoteException {
        zzebv zzebvVar = new zzebv("rewarded", null);
        zzebvVar.zzb(Long.valueOf(j));
        zzebvVar.zzc(Zf.f);
        zzs(zzebvVar);
    }
}

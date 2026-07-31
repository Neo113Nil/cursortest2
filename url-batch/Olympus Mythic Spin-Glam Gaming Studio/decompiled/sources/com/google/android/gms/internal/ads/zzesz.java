package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
public final class zzesz extends com.google.android.gms.ads.internal.client.zzbt {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzbh zzb;
    private final zzflw zzc;
    private final zzcwd zzd;
    private final ViewGroup zze;
    private final zzeaj zzf;

    public zzesz(Context context, @Nullable com.google.android.gms.ads.internal.client.zzbh zzbhVar, zzflw zzflwVar, zzcwd zzcwdVar, zzeaj zzeajVar) {
        this.zza = context;
        this.zzb = zzbhVar;
        this.zzc = zzflwVar;
        this.zzd = zzcwdVar;
        this.zzf = zzeajVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View zza = zzcwdVar.zza();
        com.google.android.gms.ads.internal.zzt.zzc();
        frameLayout.addView(zza, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzm().zzc);
        frameLayout.setMinimumWidth(zzm().zzf);
        this.zze = frameLayout;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzA() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB(zzccn zzccnVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzea zzE() throws RemoteException {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(com.google.android.gms.ads.internal.client.zzfw zzfwVar) throws RemoteException {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(com.google.android.gms.ads.internal.client.zzee zzeeVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(com.google.android.gms.ads.internal.client.zzx zzxVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzbhc zzbhcVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznk)).booleanValue()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        zzeua zzeuaVar = this.zzc.zzc;
        if (zzeuaVar != null) {
            try {
                if (!zzdqVar.zzf()) {
                    this.zzf.zzb();
                }
            } catch (RemoteException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e);
            }
            zzeuaVar.zzp(zzdqVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(long j) {
        zzcwd zzcwdVar = this.zzd;
        if (zzcwdVar.zzo() != null) {
            zzcwdVar.zzo().zzb(j);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final long zzT() {
        zzcwd zzcwdVar = this.zzd;
        if (zzcwdVar == null || zzcwdVar.zzo() == null) {
            return 0L;
        }
        return zzcwdVar.zzo().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX(com.google.android.gms.ads.internal.client.zzcp zzcpVar) throws RemoteException {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zza() throws RemoteException {
        return ObjectWrapper.wrap(this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzb() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzc() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzd(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzdU(com.google.android.gms.ads.internal.client.zzcl zzclVar) throws RemoteException {
        zzeua zzeuaVar = this.zzc.zzc;
        if (zzeuaVar != null) {
            zzeuaVar.zzo(zzclVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zze() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzl().zza(null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzf() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzl().zzb(null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg(com.google.android.gms.ads.internal.client.zzbh zzbhVar) throws RemoteException {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(com.google.android.gms.ads.internal.client.zzby zzbyVar) throws RemoteException {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzj() throws RemoteException {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzk() throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl() throws RemoteException {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzr zzm() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        return zzfmc.zza(this.zza, Collections.singletonList(this.zzd.zze()));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzn(com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        zzcwd zzcwdVar = this.zzd;
        if (zzcwdVar != null) {
            zzcwdVar.zzb(this.zze, zzrVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(zzcac zzcacVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(zzcaf zzcafVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final String zzq() throws RemoteException {
        zzcwd zzcwdVar = this.zzd;
        if (zzcwdVar.zzn() != null) {
            return zzcwdVar.zzn().zze();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final String zzr() throws RemoteException {
        zzcwd zzcwdVar = this.zzd;
        if (zzcwdVar.zzn() != null) {
            return zzcwdVar.zzn().zze();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzdx zzs() {
        return this.zzd.zzn();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzt() throws RemoteException {
        return this.zzc.zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcl zzu() throws RemoteException {
        return this.zzc.zzo;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzv() throws RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzw(zzbkb zzbkbVar) throws RemoteException {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx(com.google.android.gms.ads.internal.client.zzbe zzbeVar) throws RemoteException {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(boolean z) throws RemoteException {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzz() throws RemoteException {
        zzcwd zzcwdVar = this.zzd;
        return zzcwdVar != null && zzcwdVar.zzs();
    }
}

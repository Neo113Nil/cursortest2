package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzelq extends com.google.android.gms.ads.internal.client.zzbt implements zzczc {
    private final Context zza;
    private final zzfax zzb;
    private final String zzc;
    private final zzemk zzd;
    private com.google.android.gms.ads.internal.client.zzq zze;
    private final zzffe zzf;
    private final VersionInfoParcel zzg;
    private final zzdsk zzh;
    private zzcpk zzi;

    public zzelq(Context context, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzfax zzfaxVar, zzemk zzemkVar, VersionInfoParcel versionInfoParcel, zzdsk zzdskVar) {
        this.zza = context;
        this.zzb = zzfaxVar;
        this.zze = zzqVar;
        this.zzc = str;
        this.zzd = zzemkVar;
        this.zzf = zzfaxVar.zzg();
        this.zzg = versionInfoParcel;
        this.zzh = zzdskVar;
        zzfaxVar.zzp(this);
    }

    private final synchronized void zzf(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzf.zzs(zzqVar);
        this.zzf.zzy(this.zze.zzn);
    }

    private final synchronized boolean zzh(com.google.android.gms.ads.internal.client.zzl zzlVar) throws RemoteException {
        if (zzm()) {
            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        if (!com.google.android.gms.ads.internal.util.zzt.zzH(this.zza) || zzlVar.zzs != null) {
            zzfgd.zza(this.zza, zzlVar.zzf);
            return this.zzb.zzb(zzlVar, this.zzc, null, new zzelp(this));
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to load the ad because app ID is missing.");
        zzemk zzemkVar = this.zzd;
        if (zzemkVar != null) {
            zzemkVar.zzdB(zzfgi.zzd(4, null, null));
        }
        return false;
    }

    private final boolean zzm() {
        boolean z;
        if (((Boolean) zzbdq.zzf.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkl)).booleanValue()) {
                z = true;
                return this.zzg.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkm)).intValue() || !z;
            }
        }
        z = false;
        if (this.zzg.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkm)).intValue()) {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzA() {
        Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        zzcpk zzcpkVar = this.zzi;
        if (zzcpkVar != null) {
            zzcpkVar.zzh();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r3.zzg.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbbw.zzkn)).intValue()) goto L9;
     */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzB() {
        if (((Boolean) zzbdq.zzh.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkh)).booleanValue()) {
            }
        }
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        zzcpk zzcpkVar = this.zzi;
        if (zzcpkVar != null) {
            zzcpkVar.zzn().zzc(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        if (zzm()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzo(zzbeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        if (zzm()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zzj(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.zzf.zzs(zzqVar);
        this.zze = zzqVar;
        zzcpk zzcpkVar = this.zzi;
        if (zzcpkVar != null) {
            zzcpkVar.zzi(this.zzb.zzc(), zzqVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        if (zzm()) {
            Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzm(zzcbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzazs zzazsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(com.google.android.gms.ads.internal.client.zzci zzciVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(com.google.android.gms.ads.internal.client.zzdu zzduVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzL(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(zzbsw zzbswVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzN(boolean z) {
        if (zzm()) {
            Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        }
        this.zzf.zzB(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzO(zzbcr zzbcrVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zzq(zzbcrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        if (zzm()) {
            Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!zzdgVar.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzd.zzl(zzdgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(zzbsz zzbszVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzbvt zzbvtVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzU(com.google.android.gms.ads.internal.client.zzfk zzfkVar) {
        if (zzm()) {
            Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
        }
        this.zzf.zzI(zzfkVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzY() {
        zzcpk zzcpkVar = this.zzi;
        if (zzcpkVar != null) {
            if (zzcpkVar.zzs()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzZ() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzczc
    public final synchronized void zza() {
        if (!this.zzb.zzt()) {
            this.zzb.zzm();
            return;
        }
        com.google.android.gms.ads.internal.client.zzq zzh = this.zzf.zzh();
        zzcpk zzcpkVar = this.zzi;
        if (zzcpkVar != null && zzcpkVar.zzg() != null && this.zzf.zzT()) {
            zzh = zzffm.zza(this.zza, Collections.singletonList(this.zzi.zzg()));
        }
        zzf(zzh);
        this.zzf.zzx(true);
        try {
            zzh(this.zzf.zzf());
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to refresh the banner ad.");
        }
        this.zzf.zzx(false);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzaa() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzab(com.google.android.gms.ads.internal.client.zzl zzlVar) throws RemoteException {
        zzf(this.zze);
        return zzh(zzlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzac(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzV(zzcfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzczc
    public final synchronized void zzb() throws ExecutionException, InterruptedException {
        if (this.zzb.zzt()) {
            this.zzb.zzr();
        } else {
            this.zzb.zzn();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzq zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        zzcpk zzcpkVar = this.zzi;
        if (zzcpkVar != null) {
            return zzffm.zza(this.zza, Collections.singletonList(zzcpkVar.zzf()));
        }
        return this.zzf.zzh();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzi() {
        return this.zzd.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcb zzj() {
        return this.zzd.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzdn zzk() {
        zzcpk zzcpkVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgc)).booleanValue() && (zzcpkVar = this.zzi) != null) {
            return zzcpkVar.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzdq zzl() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        zzcpk zzcpkVar = this.zzi;
        if (zzcpkVar == null) {
            return null;
        }
        return zzcpkVar.zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzn() {
        if (zzm()) {
            Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        }
        return ObjectWrapper.wrap(this.zzb.zzc());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzs() {
        zzcpk zzcpkVar = this.zzi;
        if (zzcpkVar == null || zzcpkVar.zzm() == null) {
            return null;
        }
        return zzcpkVar.zzm().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzt() {
        zzcpk zzcpkVar = this.zzi;
        if (zzcpkVar == null || zzcpkVar.zzm() == null) {
            return null;
        }
        return zzcpkVar.zzm().zzg();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r3.zzg.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbbw.zzkn)).intValue()) goto L9;
     */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzx() {
        if (((Boolean) zzbdq.zze.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzki)).booleanValue()) {
            }
        }
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzcpk zzcpkVar = this.zzi;
        if (zzcpkVar != null) {
            zzcpkVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r3.zzg.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbbw.zzkn)).intValue()) goto L9;
     */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzz() {
        if (((Boolean) zzbdq.zzg.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkj)).booleanValue()) {
            }
        }
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        zzcpk zzcpkVar = this.zzi;
        if (zzcpkVar != null) {
            zzcpkVar.zzn().zzb(null);
        }
    }
}

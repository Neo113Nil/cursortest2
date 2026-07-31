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

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzekn extends com.google.android.gms.ads.internal.client.zzbw implements zzcyo {
    private final Context zza;
    private final zzeyx zzb;
    private final String zzc;
    private final zzeli zzd;
    private com.google.android.gms.ads.internal.client.zzr zze;
    private final zzfdb zzf;
    private final VersionInfoParcel zzg;
    private final zzdsm zzh;
    private zzcok zzi;

    public zzekn(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzeyx zzeyxVar, zzeli zzeliVar, VersionInfoParcel versionInfoParcel, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzb = zzeyxVar;
        this.zze = zzrVar;
        this.zzc = str;
        this.zzd = zzeliVar;
        this.zzf = zzeyxVar.zzg();
        this.zzg = versionInfoParcel;
        this.zzh = zzdsmVar;
        zzeyxVar.zzi(this);
    }

    private final synchronized void zzO(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzfdb zzfdbVar = this.zzf;
        zzfdbVar.zzc(zzrVar);
        zzfdbVar.zze(this.zze.zzn);
    }

    private final synchronized boolean zzV(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        if (zzW()) {
            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zza;
        if (!com.google.android.gms.ads.internal.util.zzs.zzL(context) || zzmVar.zzs != null) {
            zzfdz.zzb(context, zzmVar.zzf);
            return this.zzb.zza(zzmVar, this.zzc, null, new zzekm(this));
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
        zzeli zzeliVar = this.zzd;
        if (zzeliVar != null) {
            zzeliVar.zzdN(zzfee.zzd(4, null, null));
        }
        return false;
    }

    private final boolean zzW() {
        boolean z;
        if (((Boolean) zzbeg.zzf.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlX)).booleanValue()) {
                z = true;
                return this.zzg.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlY)).intValue() || !z;
            }
        }
        z = false;
        if (this.zzg.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlY)).intValue()) {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean zzA() {
        zzcok zzcokVar = this.zzi;
        if (zzcokVar != null) {
            if (zzcokVar.zzs()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean zzB() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzC(zzbvn zzbvnVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzD(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzE(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized com.google.android.gms.ads.internal.client.zzed zzF() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        zzcok zzcokVar = this.zzi;
        if (zzcokVar == null) {
            return null;
        }
        return zzcokVar.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzG(com.google.android.gms.ads.internal.client.zzga zzgaVar) {
        if (zzW()) {
            Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
        }
        this.zzf.zzi(zzgaVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzH(com.google.android.gms.ads.internal.client.zzeh zzehVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzI(com.google.android.gms.ads.internal.client.zzx zzxVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzJ(zzbae zzbaeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzK(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final synchronized void zzL() throws ExecutionException, InterruptedException {
        zzeyx zzeyxVar = this.zzb;
        if (zzeyxVar.zzh()) {
            zzeyxVar.zzc();
        } else {
            zzeyxVar.zzk();
        }
    }

    final /* synthetic */ zzcok zzM() {
        return this.zzi;
    }

    final /* synthetic */ void zzN(zzcok zzcokVar) {
        this.zzi = zzcokVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzP(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        if (zzW()) {
            Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!zzdtVar.zzf()) {
                this.zzh.zzb();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzd.zzo(zzdtVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzQ(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbn zzbnVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzR(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzS(com.google.android.gms.ads.internal.client.zzcv zzcvVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzT(long j) {
        this.zzf.zzx(j);
        zzcok zzcokVar = this.zzi;
        if (zzcokVar == null || zzcokVar.zzo() == null) {
            return;
        }
        zzcokVar.zzo().zzb(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzY(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzX(zzcsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final synchronized void zza() {
        if (!this.zzb.zzh()) {
            this.zzb.zzj();
            return;
        }
        zzfdb zzfdbVar = this.zzf;
        com.google.android.gms.ads.internal.client.zzr zzf = zzfdbVar.zzf();
        if (this.zzi != null && zzfdbVar.zzB()) {
            zzf = zzfdi.zza(this.zza, Collections.singletonList(this.zzi.zzf()));
        }
        zzO(zzf);
        zzfdbVar.zzd(true);
        try {
            zzV(zzfdbVar.zzb());
        } catch (RemoteException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to refresh the banner ad.");
        }
        this.zzf.zzd(false);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final IObjectWrapper zzb() {
        if (zzW()) {
            Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        }
        return ObjectWrapper.wrap(this.zzb.zzd());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r3.zzg.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbci.zzlZ)).intValue()) goto L9;
     */
    @Override // com.google.android.gms.ads.internal.client.zzbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzc() {
        if (((Boolean) zzbeg.zze.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlU)).booleanValue()) {
            }
        }
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzcok zzcokVar = this.zzi;
        if (zzcokVar != null) {
            zzcokVar.zzd();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzdW(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        if (zzW()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zzl(zzbkVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean zze(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        zzO(this.zze);
        return zzV(zzmVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r3.zzg.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbci.zzlZ)).intValue()) goto L9;
     */
    @Override // com.google.android.gms.ads.internal.client.zzbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzf() {
        if (((Boolean) zzbeg.zzg.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlV)).booleanValue()) {
            }
        }
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        zzcok zzcokVar = this.zzi;
        if (zzcokVar != null) {
            zzcokVar.zzl().zza(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r3.zzg.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbci.zzlZ)).intValue()) goto L9;
     */
    @Override // com.google.android.gms.ads.internal.client.zzbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzg() {
        if (((Boolean) zzbeg.zzh.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlT)).booleanValue()) {
            }
        }
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        zzcok zzcokVar = this.zzi;
        if (zzcokVar != null) {
            zzcokVar.zzl().zzb(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzi(com.google.android.gms.ads.internal.client.zzco zzcoVar) {
        if (zzW()) {
            Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzn(zzcoVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzj(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final Bundle zzk() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzl() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzm() {
        Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        zzcok zzcokVar = this.zzi;
        if (zzcokVar != null) {
            zzcokVar.zzi();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized com.google.android.gms.ads.internal.client.zzr zzn() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        zzcok zzcokVar = this.zzi;
        if (zzcokVar != null) {
            return zzfdi.zza(this.zza, Collections.singletonList(zzcokVar.zze()));
        }
        return this.zzf.zzf();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzo(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.zzf.zzc(zzrVar);
        this.zze = zzrVar;
        zzcok zzcokVar = this.zzi;
        if (zzcokVar != null) {
            zzcokVar.zzb(this.zzb.zzd(), zzrVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzp(zzbtf zzbtfVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzq(zzbti zzbtiVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized String zzr() {
        zzcok zzcokVar = this.zzi;
        if (zzcokVar == null || zzcokVar.zzn() == null) {
            return null;
        }
        return zzcokVar.zzn().zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized String zzs() {
        zzcok zzcokVar = this.zzi;
        if (zzcokVar == null || zzcokVar.zzn() == null) {
            return null;
        }
        return zzcokVar.zzn().zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized com.google.android.gms.ads.internal.client.zzea zzt() {
        zzcok zzcokVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhg)).booleanValue() && (zzcokVar = this.zzi) != null) {
            return zzcokVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized String zzu() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzco zzv() {
        return this.zzd.zzk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzbk zzw() {
        return this.zzd.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzx(zzbdd zzbddVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zze(zzbddVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzy(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        if (zzW()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzf(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzz(boolean z) {
        if (zzW()) {
            Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        }
        this.zzf.zzk(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized long zzU() {
        zzcok zzcokVar = this.zzi;
        if (zzcokVar == null || zzcokVar.zzo() == null) {
            return this.zzf.zzw();
        }
        return zzcokVar.zzo().zza();
    }
}

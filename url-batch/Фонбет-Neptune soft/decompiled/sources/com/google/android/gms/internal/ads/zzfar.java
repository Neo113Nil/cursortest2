package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfar extends com.google.android.gms.ads.internal.client.zzbt implements com.google.android.gms.ads.internal.overlay.zzp, zzazj {
    protected zzcpe zza;
    private final zzcgj zzb;
    private final Context zzc;
    private final String zze;
    private final zzfal zzf;
    private final zzfaj zzg;
    private final VersionInfoParcel zzh;
    private final zzdsk zzi;
    private zzcor zzk;
    private AtomicBoolean zzd = new AtomicBoolean();
    private long zzj = -1;

    public zzfar(zzcgj zzcgjVar, Context context, String str, zzfal zzfalVar, zzfaj zzfajVar, VersionInfoParcel versionInfoParcel, zzdsk zzdskVar) {
        this.zzb = zzcgjVar;
        this.zzc = context;
        this.zze = str;
        this.zzf = zzfalVar;
        this.zzg = zzfajVar;
        this.zzh = versionInfoParcel;
        this.zzi = zzdskVar;
        zzfajVar.zzm(this);
    }

    private final synchronized void zzq(int i) {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzg.zzj();
            zzcor zzcorVar = this.zzk;
            if (zzcorVar != null) {
                com.google.android.gms.ads.internal.zzu.zzb().zze(zzcorVar);
            }
            if (this.zza != null) {
                long j = -1;
                if (this.zzj != -1) {
                    j = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzj;
                }
                this.zza.zze(j, i);
            }
            zzx();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzazs zzazsVar) {
        this.zzg.zzo(zzazsVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzf.zzl(zzwVar);
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
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzO(zzbcr zzbcrVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
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
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzZ() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzazj
    public final void zza() {
        zzq(3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzaa() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c A[Catch: all -> 0x0087, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0010, B:8:0x0025, B:11:0x0042, B:13:0x004d, B:16:0x0052, B:20:0x0064, B:24:0x006c, B:27:0x003d), top: B:2:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean zzab(com.google.android.gms.ads.internal.client.zzl zzlVar) throws RemoteException {
        boolean z;
        if (((Boolean) zzbdq.zzd.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkl)).booleanValue()) {
                z = true;
                if (this.zzh.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkm)).intValue() || !z) {
                    Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                }
                com.google.android.gms.ads.internal.zzu.zzp();
                if (com.google.android.gms.ads.internal.util.zzt.zzH(this.zzc) && zzlVar.zzs == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to load the ad because app ID is missing.");
                    this.zzg.zzdB(zzfgi.zzd(4, null, null));
                    return false;
                }
                if (!zzZ()) {
                    return false;
                }
                this.zzd = new AtomicBoolean();
                return this.zzf.zzb(zzlVar, this.zze, new zzfap(this), new zzfaq(this));
            }
        }
        z = false;
        if (this.zzh.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkm)).intValue()) {
        }
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        com.google.android.gms.ads.internal.zzu.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzH(this.zzc)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to load the ad because app ID is missing.");
            this.zzg.zzdB(zzfgi.zzd(4, null, null));
            return false;
        }
        if (!zzZ()) {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzac(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdr() {
        if (this.zza != null) {
            this.zzj = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
            int zza = this.zza.zza();
            if (zza > 0) {
                zzcor zzcorVar = new zzcor(this.zzb.zzC(), com.google.android.gms.ads.internal.zzu.zzB());
                this.zzk = zzcorVar;
                zzcorVar.zzd(zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzfao
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfar.this.zzp();
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdt() {
        zzcpe zzcpeVar = this.zza;
        if (zzcpeVar != null) {
            zzcpeVar.zze(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzj, 1);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzq zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzi() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcb zzj() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzdn zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzdq zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzn() {
        return null;
    }

    final /* synthetic */ void zzo() {
        zzq(5);
    }

    public final void zzp() {
        this.zzb.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfan
            @Override // java.lang.Runnable
            public final void run() {
                zzfar.this.zzo();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzcpe zzcpeVar = this.zza;
        if (zzcpeVar != null) {
            zzcpeVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            zzq(2);
            return;
        }
        if (i2 == 1) {
            zzq(4);
        } else if (i2 != 2) {
            zzq(6);
        } else {
            zzq(3);
        }
    }
}

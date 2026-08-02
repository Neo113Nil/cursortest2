package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfdb extends zzcck {
    private final zzfcx zza;
    private final zzfcn zzb;
    private final String zzc;
    private final zzfdx zzd;
    private final Context zze;
    private final zzcgv zzf;
    private zzduc zzg;
    private boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzaA)).booleanValue();

    public zzfdb(String str, zzfcx zzfcxVar, Context context, zzfcn zzfcnVar, zzfdx zzfdxVar, zzcgv zzcgvVar) {
        this.zzc = str;
        this.zza = zzfcxVar;
        this.zzb = zzfcnVar;
        this.zzd = zzfdxVar;
        this.zze = context;
        this.zzf = zzcgvVar;
    }

    private final synchronized void zzu(com.google.android.gms.ads.internal.client.zzl zzlVar, zzccs zzccsVar, int i) throws RemoteException {
        boolean z = false;
        if (((Boolean) zzbkq.zzl.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zziM)).booleanValue()) {
                z = true;
            }
        }
        if (this.zzf.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zziN)).intValue() || !z) {
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        }
        this.zzb.zze(zzccsVar);
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(this.zze) && zzlVar.zzs == null) {
            com.google.android.gms.ads.internal.util.zze.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zza(zzffe.zzd(4, null, null));
            return;
        }
        if (this.zzg != null) {
            return;
        }
        zzfcp zzfcpVar = new zzfcp(null);
        this.zza.zzj(i);
        this.zza.zzb(zzlVar, this.zzc, zzfcpVar, new zzfda(this));
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final Bundle zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzduc zzducVar = this.zzg;
        return zzducVar != null ? zzducVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final com.google.android.gms.ads.internal.client.zzdh zzc() {
        zzduc zzducVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfQ)).booleanValue() && (zzducVar = this.zzg) != null) {
            return zzducVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final zzcci zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzduc zzducVar = this.zzg;
        if (zzducVar != null) {
            return zzducVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final synchronized String zze() throws RemoteException {
        zzduc zzducVar = this.zzg;
        if (zzducVar == null || zzducVar.zzl() == null) {
            return null;
        }
        return zzducVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final synchronized void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzccs zzccsVar) throws RemoteException {
        zzu(zzlVar, zzccsVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzccs zzccsVar) throws RemoteException {
        zzu(zzlVar, zzccsVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final synchronized void zzh(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzh = z;
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzi(com.google.android.gms.ads.internal.client.zzdb zzdbVar) {
        if (zzdbVar == null) {
            this.zzb.zzb(null);
        } else {
            this.zzb.zzb(new zzfcz(this, zzdbVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzj(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        this.zzb.zzc(zzdeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzk(zzcco zzccoVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzd(zzccoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final synchronized void zzl(zzccz zzcczVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzfdx zzfdxVar = this.zzd;
        zzfdxVar.zza = zzcczVar.zza;
        zzfdxVar.zzb = zzcczVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final synchronized void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzn(iObjectWrapper, this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final synchronized void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzg == null) {
            com.google.android.gms.ads.internal.util.zze.zzj("Rewarded can not be shown before loaded");
            this.zzb.zzk(zzffe.zzd(9, null, null));
        } else {
            this.zzg.zzh(z, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final boolean zzo() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzduc zzducVar = this.zzg;
        return (zzducVar == null || zzducVar.zzf()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzp(zzcct zzcctVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzi(zzcctVar);
    }
}

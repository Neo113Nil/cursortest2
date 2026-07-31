package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzeul {
    private final zzeuq zza;
    private final String zzb;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzdx zzc;

    public zzeul(zzeuq zzeuqVar, String str) {
        this.zza = zzeuqVar;
        this.zzb = str;
    }

    public final synchronized boolean zza() throws RemoteException {
        return this.zza.zzb();
    }

    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, int i) throws RemoteException {
        this.zzc = null;
        zzeur zzeurVar = new zzeur(i);
        zzeuk zzeukVar = new zzeuk(this);
        this.zza.zza(zzmVar, this.zzb, zzeurVar, zzeukVar);
    }

    @Nullable
    public final synchronized String zzc() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVar;
        try {
            zzdxVar = this.zzc;
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzdxVar != null ? zzdxVar.zze() : null;
    }

    @Nullable
    public final synchronized String zzd() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVar;
        try {
            zzdxVar = this.zzc;
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzdxVar != null ? zzdxVar.zze() : null;
    }

    final /* synthetic */ void zze(com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        this.zzc = zzdxVar;
    }
}

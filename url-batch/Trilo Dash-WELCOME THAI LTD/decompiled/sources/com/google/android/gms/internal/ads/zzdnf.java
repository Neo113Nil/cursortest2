package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdnf extends com.google.android.gms.ads.internal.client.zzdj {
    private final Object zza = new Object();

    @Nullable
    private final com.google.android.gms.ads.internal.client.zzdk zzb;

    @Nullable
    private final zzbuo zzc;

    public zzdnf(@Nullable com.google.android.gms.ads.internal.client.zzdk zzdkVar, @Nullable zzbuo zzbuoVar) {
        this.zzb = zzdkVar;
        this.zzc = zzbuoVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zzf() throws RemoteException {
        zzbuo zzbuoVar = this.zzc;
        if (zzbuoVar != null) {
            return zzbuoVar.zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zzg() throws RemoteException {
        zzbuo zzbuoVar = this.zzc;
        if (zzbuoVar != null) {
            return zzbuoVar.zzh();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzdn zzi() throws RemoteException {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzdk zzdkVar = this.zzb;
            if (zzdkVar == null) {
                return null;
            }
            return zzdkVar.zzi();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzj(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzm(@Nullable com.google.android.gms.ads.internal.client.zzdn zzdnVar) throws RemoteException {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzdk zzdkVar = this.zzb;
            if (zzdkVar != null) {
                zzdkVar.zzm(zzdnVar);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzq() throws RemoteException {
        throw new RemoteException();
    }
}

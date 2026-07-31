package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzdqq extends com.google.android.gms.ads.internal.client.zzdz {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.client.zzea zzb;
    private final zzbwj zzc;

    public zzdqq(com.google.android.gms.ads.internal.client.zzea zzeaVar, zzbwj zzbwjVar) {
        this.zzb = zzeaVar;
        this.zzc = zzbwjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzf() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzg(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final int zzi() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzj() throws RemoteException {
        zzbwj zzbwjVar = this.zzc;
        if (zzbwjVar != null) {
            return zzbwjVar.zzA();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzk() throws RemoteException {
        zzbwj zzbwjVar = this.zzc;
        if (zzbwjVar != null) {
            return zzbwjVar.zzB();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzl(com.google.android.gms.ads.internal.client.zzed zzedVar) throws RemoteException {
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.client.zzea zzeaVar = this.zzb;
                if (zzeaVar != null) {
                    zzeaVar.zzl(zzedVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzm() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final com.google.android.gms.ads.internal.client.zzed zzo() throws RemoteException {
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.client.zzea zzeaVar = this.zzb;
                if (zzeaVar == null) {
                    return null;
                }
                return zzeaVar.zzo();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzq() throws RemoteException {
        throw new RemoteException();
    }
}

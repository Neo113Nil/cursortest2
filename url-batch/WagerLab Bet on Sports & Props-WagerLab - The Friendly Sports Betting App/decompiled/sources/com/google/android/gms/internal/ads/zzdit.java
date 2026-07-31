package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdit extends com.google.android.gms.ads.internal.client.zzec {
    private final Object zza = new Object();

    @Nullable
    private final com.google.android.gms.ads.internal.client.zzed zzb;

    @Nullable
    private final zzbpm zzc;

    public zzdit(@Nullable com.google.android.gms.ads.internal.client.zzed zzedVar, @Nullable zzbpm zzbpmVar) {
        this.zzb = zzedVar;
        this.zzc = zzbpmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzf() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzg(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final int zzi() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzj() throws RemoteException {
        zzbpm zzbpmVar = this.zzc;
        if (zzbpmVar != null) {
            return zzbpmVar.zzA();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzk() throws RemoteException {
        zzbpm zzbpmVar = this.zzc;
        if (zzbpmVar != null) {
            return zzbpmVar.zzB();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzl(@Nullable com.google.android.gms.ads.internal.client.zzeg zzegVar) throws RemoteException {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzed zzedVar = this.zzb;
            if (zzedVar != null) {
                zzedVar.zzl(zzegVar);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzm() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzeg zzo() throws RemoteException {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzed zzedVar = this.zzb;
            if (zzedVar == null) {
                return null;
            }
            return zzedVar.zzo();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzq() throws RemoteException {
        throw new RemoteException();
    }
}

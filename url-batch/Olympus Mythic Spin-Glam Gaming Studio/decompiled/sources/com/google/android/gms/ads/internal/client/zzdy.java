package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbew;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzdy extends zzbeu implements zzea {
    zzdy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zze() throws RemoteException {
        zzdb(1, zzcZ());
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzf() throws RemoteException {
        zzdb(2, zzcZ());
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzg(boolean z) throws RemoteException {
        Parcel zzcZ = zzcZ();
        int i = zzbew.zza;
        zzcZ.writeInt(z ? 1 : 0);
        zzdb(3, zzcZ);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzh() throws RemoteException {
        Parcel zzda = zzda(4, zzcZ());
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final int zzi() throws RemoteException {
        Parcel zzda = zzda(5, zzcZ());
        int readInt = zzda.readInt();
        zzda.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzj() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzk() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzl(zzed zzedVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzedVar);
        zzdb(8, zzcZ);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzm() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzn() throws RemoteException {
        Parcel zzda = zzda(10, zzcZ());
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final zzed zzo() throws RemoteException {
        zzed zzebVar;
        Parcel zzda = zzda(11, zzcZ());
        IBinder readStrongBinder = zzda.readStrongBinder();
        if (readStrongBinder == null) {
            zzebVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            zzebVar = queryLocalInterface instanceof zzed ? (zzed) queryLocalInterface : new zzeb(readStrongBinder);
        }
        zzda.recycle();
        return zzebVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzp() throws RemoteException {
        Parcel zzda = zzda(12, zzcZ());
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzq() throws RemoteException {
        zzdb(13, zzcZ());
    }
}

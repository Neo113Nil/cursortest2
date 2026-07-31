package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes4.dex */
public final class zzdy extends zzaxz implements zzea {
    zzdy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final String zze() throws RemoteException {
        Parcel zzde = zzde(1, zza());
        String readString = zzde.readString();
        zzde.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final String zzf() throws RemoteException {
        Parcel zzde = zzde(2, zza());
        String readString = zzde.readString();
        zzde.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final List zzg() throws RemoteException {
        Parcel zzde = zzde(3, zza());
        ArrayList createTypedArrayList = zzde.createTypedArrayList(zzv.CREATOR);
        zzde.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final zzv zzh() throws RemoteException {
        Parcel zzde = zzde(4, zza());
        zzv zzvVar = (zzv) zzayb.zzb(zzde, zzv.CREATOR);
        zzde.recycle();
        return zzvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final Bundle zzi() throws RemoteException {
        Parcel zzde = zzde(5, zza());
        Bundle bundle = (Bundle) zzayb.zzb(zzde, Bundle.CREATOR);
        zzde.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final String zzj() throws RemoteException {
        Parcel zzde = zzde(6, zza());
        String readString = zzde.readString();
        zzde.recycle();
        return readString;
    }
}

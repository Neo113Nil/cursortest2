package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbew;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzdv extends zzbeu implements zzdx {
    zzdv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zze() throws RemoteException {
        Parcel zzda = zzda(1, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zzf() throws RemoteException {
        Parcel zzda = zzda(2, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final List zzg() throws RemoteException {
        Parcel zzda = zzda(3, zzcZ());
        ArrayList createTypedArrayList = zzda.createTypedArrayList(zzv.CREATOR);
        zzda.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final zzv zzh() throws RemoteException {
        Parcel zzda = zzda(4, zzcZ());
        zzv zzvVar = (zzv) zzbew.zzb(zzda, zzv.CREATOR);
        zzda.recycle();
        return zzvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final Bundle zzi() throws RemoteException {
        Parcel zzda = zzda(5, zzcZ());
        Bundle bundle = (Bundle) zzbew.zzb(zzda, Bundle.CREATOR);
        zzda.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zzj() throws RemoteException {
        Parcel zzda = zzda(6, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }
}

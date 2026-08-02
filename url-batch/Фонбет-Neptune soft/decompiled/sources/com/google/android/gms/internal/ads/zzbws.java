package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbws {
    public static final zzbwg zza(Context context, String str, zzbom zzbomVar) {
        try {
            IBinder zze = ((zzbwk) com.google.android.gms.ads.internal.util.client.zzq.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.internal.ads.zzbwr
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.ads.internal.util.client.zzo
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return queryLocalInterface instanceof zzbwk ? (zzbwk) queryLocalInterface : new zzbwk(obj);
                }
            })).zze(ObjectWrapper.wrap(context), str, zzbomVar, 242402000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof zzbwg ? (zzbwg) queryLocalInterface : new zzbwe(zze);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzp e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzccx {
    public static final zzccl zza(Context context, String str, zzbvk zzbvkVar) {
        try {
            IBinder zze = ((zzccp) zzcgt.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new zzcgr() { // from class: com.google.android.gms.internal.ads.zzccw
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcgr
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return queryLocalInterface instanceof zzccp ? (zzccp) queryLocalInterface : new zzccp(obj);
                }
            })).zze(ObjectWrapper.wrap(context), str, zzbvkVar, 223104000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof zzccl ? (zzccl) queryLocalInterface : new zzccj(zze);
        } catch (RemoteException | zzcgs e) {
            zzcgp.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}

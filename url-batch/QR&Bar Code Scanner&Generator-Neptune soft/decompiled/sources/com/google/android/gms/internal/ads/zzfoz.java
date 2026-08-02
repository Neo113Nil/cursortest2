package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfoz {
    final zzfpc zza;
    final boolean zzb;

    private zzfoz(zzfpc zzfpcVar) {
        this.zza = zzfpcVar;
        this.zzb = zzfpcVar != null;
    }

    public static zzfoz zzb(Context context, String str, String str2) {
        zzfpc zzfpaVar;
        try {
            try {
                try {
                    IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (instantiate == null) {
                        zzfpaVar = null;
                    } else {
                        IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfpaVar = queryLocalInterface instanceof zzfpc ? (zzfpc) queryLocalInterface : new zzfpa(instantiate);
                    }
                    zzfpaVar.zze(ObjectWrapper.wrap(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfoz(zzfpaVar);
                } catch (Exception e) {
                    throw new zzfob(e);
                }
            } catch (Exception e2) {
                throw new zzfob(e2);
            }
        } catch (RemoteException | zzfob | NullPointerException | SecurityException unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new zzfoz(new zzfpd());
        }
    }

    public static zzfoz zzc() {
        zzfpd zzfpdVar = new zzfpd();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfoz(zzfpdVar);
    }

    public final zzfoy zza(byte[] bArr) {
        return new zzfoy(this, bArr, null);
    }
}

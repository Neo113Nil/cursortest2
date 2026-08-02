package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfqj {
    final zzfqm zza;
    final boolean zzb;

    private zzfqj(zzfqm zzfqmVar) {
        this.zza = zzfqmVar;
        this.zzb = zzfqmVar != null;
    }

    public static zzfqj zzb(Context context, String str, String str2) {
        zzfqm zzfqkVar;
        try {
            try {
                try {
                    IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (instantiate == null) {
                        zzfqkVar = null;
                    } else {
                        IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfqkVar = queryLocalInterface instanceof zzfqm ? (zzfqm) queryLocalInterface : new zzfqk(instantiate);
                    }
                    zzfqkVar.zze(ObjectWrapper.wrap(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfqj(zzfqkVar);
                } catch (Exception e) {
                    throw new zzfpl(e);
                }
            } catch (Exception e2) {
                throw new zzfpl(e2);
            }
        } catch (RemoteException | zzfpl | NullPointerException | SecurityException unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new zzfqj(new zzfqn());
        }
    }

    public static zzfqj zzc() {
        zzfqn zzfqnVar = new zzfqn();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfqj(zzfqnVar);
    }

    public final zzfqi zza(byte[] bArr) {
        return new zzfqi(this, bArr, null);
    }
}

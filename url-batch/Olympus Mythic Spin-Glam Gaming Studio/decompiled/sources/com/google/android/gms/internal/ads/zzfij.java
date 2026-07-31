package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzfij {
    public static void zza(AtomicReference atomicReference, zzfii zzfiiVar) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            zzfiiVar.zza(obj);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }
}

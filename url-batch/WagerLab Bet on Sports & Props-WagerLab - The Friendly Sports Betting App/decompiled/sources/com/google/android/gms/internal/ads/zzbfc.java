package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzbfc {
    private final Context zza;

    public zzbfc(Context context) {
        this.zza = context;
    }

    public final void zza(zzbtz zzbtzVar) {
        try {
            ((zzbfd) com.google.android.gms.ads.internal.util.client.zzs.zza(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", zzbfb.zza)).zze(zzbtzVar);
        } catch (RemoteException e) {
            String message = e.getMessage();
            String.valueOf(message);
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(message)));
        } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
            String message2 = e2.getMessage();
            String.valueOf(message2);
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(message2)));
        }
    }
}

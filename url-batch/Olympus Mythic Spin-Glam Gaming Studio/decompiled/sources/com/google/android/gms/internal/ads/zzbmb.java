package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzbmb {
    private final Context zza;

    public zzbmb(Context context) {
        this.zza = context;
    }

    public final void zza(zzcaw zzcawVar) {
        try {
            ((zzbmc) com.google.android.gms.ads.internal.util.client.zzs.zza(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", zzbma.zza)).zze(zzcawVar);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e.getMessage())));
        } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e2.getMessage())));
        }
    }
}

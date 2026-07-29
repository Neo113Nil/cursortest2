package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbyl {
    private static zzcdz zza;
    private final Context zzb;
    private final AdFormat zzc;
    private final com.google.android.gms.ads.internal.client.zzdr zzd;

    public zzbyl(Context context, AdFormat adFormat, com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        this.zzb = context;
        this.zzc = adFormat;
        this.zzd = zzdrVar;
    }

    public static zzcdz zza(Context context) {
        zzcdz zzcdzVar;
        synchronized (zzbyl.class) {
            if (zza == null) {
                zza = com.google.android.gms.ads.internal.client.zzaw.zza().zzq(context, new zzbtw());
            }
            zzcdzVar = zza;
        }
        return zzcdzVar;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzcdz zza2 = zza(this.zzb);
        if (zza2 == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        IObjectWrapper wrap = ObjectWrapper.wrap(this.zzb);
        com.google.android.gms.ads.internal.client.zzdr zzdrVar = this.zzd;
        try {
            zza2.zze(wrap, new zzced(null, this.zzc.name(), null, zzdrVar == null ? new com.google.android.gms.ads.internal.client.zzm().zza() : com.google.android.gms.ads.internal.client.zzp.zza.zza(this.zzb, zzdrVar)), new zzbyk(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}

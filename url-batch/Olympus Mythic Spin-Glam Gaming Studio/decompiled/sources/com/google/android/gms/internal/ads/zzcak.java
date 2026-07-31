package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzcak {
    private static zzcfe zze;
    private final Context zza;
    private final AdFormat zzb;

    @Nullable
    private final com.google.android.gms.ads.internal.client.zzeh zzc;

    @Nullable
    private final String zzd;

    public zzcak(Context context, AdFormat adFormat, @Nullable com.google.android.gms.ads.internal.client.zzeh zzehVar, @Nullable String str) {
        this.zza = context;
        this.zzb = adFormat;
        this.zzc = zzehVar;
        this.zzd = str;
    }

    @Nullable
    public static zzcfe zza(Context context) {
        zzcfe zzcfeVar;
        synchronized (zzcak.class) {
            try {
                if (zze == null) {
                    zze = com.google.android.gms.ads.internal.client.zzay.zzb().zzi(context, new zzbvq());
                }
                zzcfeVar = zze;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzcfeVar;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.client.zzm zza;
        long currentTimeMillis = System.currentTimeMillis();
        Context context = this.zza;
        zzcfe zza2 = zza(context);
        if (zza2 == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        com.google.android.gms.ads.internal.client.zzeh zzehVar = this.zzc;
        if (zzehVar == null) {
            com.google.android.gms.ads.internal.client.zzn zznVar = new com.google.android.gms.ads.internal.client.zzn();
            zznVar.zzi(currentTimeMillis);
            zza = zznVar.zza();
        } else {
            zzehVar.zzp(currentTimeMillis);
            zza = com.google.android.gms.ads.internal.client.zzq.zza.zza(context, zzehVar);
        }
        try {
            zza2.zze(wrap, new zzcfi(this.zzd, this.zzb.name(), null, zza), new zzcaj(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}

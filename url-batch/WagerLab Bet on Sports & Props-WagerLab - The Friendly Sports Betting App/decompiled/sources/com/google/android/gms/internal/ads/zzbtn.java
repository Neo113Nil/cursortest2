package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzbtn {
    private static zzbye zze;
    private final Context zza;
    private final AdFormat zzb;
    private final com.google.android.gms.ads.internal.client.zzek zzc;
    private final String zzd;

    public zzbtn(Context context, AdFormat adFormat, com.google.android.gms.ads.internal.client.zzek zzekVar, String str) {
        this.zza = context;
        this.zzb = adFormat;
        this.zzc = zzekVar;
        this.zzd = str;
    }

    public static zzbye zza(Context context) {
        zzbye zzbyeVar;
        synchronized (zzbtn.class) {
            if (zze == null) {
                zze = com.google.android.gms.ads.internal.client.zzbb.zzb().zzj(context, new zzbot());
            }
            zzbyeVar = zze;
        }
        return zzbyeVar;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.client.zzm zza;
        long currentTimeMillis = System.currentTimeMillis();
        Context context = this.zza;
        zzbye zza2 = zza(context);
        if (zza2 == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        com.google.android.gms.ads.internal.client.zzek zzekVar = this.zzc;
        if (zzekVar == null) {
            com.google.android.gms.ads.internal.client.zzn zznVar = new com.google.android.gms.ads.internal.client.zzn();
            zznVar.zzi(currentTimeMillis);
            zza = zznVar.zza();
        } else {
            zzekVar.zzp(currentTimeMillis);
            zza = com.google.android.gms.ads.internal.client.zzq.zza.zza(context, zzekVar);
        }
        try {
            zza2.zze(wrap, new zzbyi(this.zzd, this.zzb.name(), null, zza, 0, null), new zzbtm(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}

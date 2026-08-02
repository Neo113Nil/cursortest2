package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzem;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbdq;
import com.google.android.gms.internal.ads.zzbte;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public class QueryInfo {
    private final zzem zza;

    public QueryInfo(zzem zzemVar) {
        this.zza = zzemVar;
    }

    public static void generate(Context context, AdFormat adFormat, AdRequest adRequest, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zza(context, adFormat, adRequest, null, queryInfoGenerationCallback);
    }

    private static void zza(final Context context, final AdFormat adFormat, final AdRequest adRequest, final String str, final QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzbbw.zza(context);
        if (((Boolean) zzbdq.zzj.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zza(zzbbw.zzkl)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.query.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdRequest adRequest2 = adRequest;
                        zzdx zza = adRequest2 == null ? null : adRequest2.zza();
                        new zzbte(context, adFormat, zza, str).zzb(queryInfoGenerationCallback);
                    }
                });
                return;
            }
        }
        new zzbte(context, adFormat, adRequest == null ? null : adRequest.zza(), str).zzb(queryInfoGenerationCallback);
    }

    public String getQuery() {
        return this.zza.zzb();
    }

    public Bundle getQueryBundle() {
        return this.zza.zza();
    }

    public String getRequestId() {
        return this.zza.zzc();
    }

    public static void generate(Context context, AdFormat adFormat, AdRequest adRequest, String str, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        zza(context, adFormat, adRequest, str, queryInfoGenerationCallback);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzevh {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfju zzd;
    private final zzdxq zze;

    public zzevh(Context context, Executor executor, Set set, zzfju zzfjuVar, zzdxq zzdxqVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfjuVar;
        this.zze = zzdxqVar;
    }

    public final zzfzp zza(final Object obj) {
        zzfjj zza = zzfji.zza(this.zza, 8);
        zza.zzf();
        final ArrayList arrayList = new ArrayList(this.zzb.size());
        for (final zzeve zzeveVar : this.zzb) {
            zzfzp zzb = zzeveVar.zzb();
            zzb.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzevf
                @Override // java.lang.Runnable
                public final void run() {
                    zzevh.this.zzb(zzeveVar);
                }
            }, zzchc.zzf);
            arrayList.add(zzb);
        }
        zzfzp zza2 = zzfzg.zzc(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzevg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list = arrayList;
                Object obj2 = obj;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzevd zzevdVar = (zzevd) ((zzfzp) it.next()).get();
                    if (zzevdVar != null) {
                        zzevdVar.zzf(obj2);
                    }
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfjw.zza()) {
            zzfjt.zza(zza2, this.zzd, zza);
        }
        return zza2;
    }

    final /* synthetic */ void zzb(zzeve zzeveVar) {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        if (((Boolean) zzbkv.zza.zze()).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal runtime (ms) : " + zzftm.zzc(zzeveVar.getClass().getCanonicalName()) + " = " + elapsedRealtime);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbO)).booleanValue()) {
            zzdxp zza = this.zze.zza();
            zza.zzb("action", "lat_ms");
            zza.zzb("lat_grp", "sig_lat_grp");
            zza.zzb("lat_id", String.valueOf(zzeveVar.zza()));
            zza.zzb("clat_ms", String.valueOf(elapsedRealtime));
            zza.zzh();
        }
    }
}

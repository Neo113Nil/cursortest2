package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public class zzdxx {
    protected final Executor zzc;
    protected final zzcgu zzd;
    private final zzfjb zzf;
    protected final String zza = (String) zzbkm.zzb.zze();
    protected final Map zzb = new HashMap();
    protected final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbL)).booleanValue();
    private final boolean zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbO)).booleanValue();
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzge)).booleanValue();

    protected zzdxx(Executor executor, zzcgu zzcguVar, zzfjb zzfjbVar) {
        this.zzc = executor;
        this.zzd = zzcguVar;
        this.zzf = zzfjbVar;
    }

    private final void zza(Map map, boolean z) {
        if (map.isEmpty()) {
            com.google.android.gms.ads.internal.util.zze.zze("Empty paramMap.");
            return;
        }
        final String zza = this.zzf.zza(map);
        com.google.android.gms.ads.internal.util.zze.zza(zza);
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
        if (this.zze) {
            if (!z || this.zzg) {
                if (!parseBoolean || this.zzh) {
                    this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxw
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdxx zzdxxVar = zzdxx.this;
                            zzdxxVar.zzd.zza(zza);
                        }
                    });
                }
            }
        }
    }

    protected final String zzb(Map map) {
        return this.zzf.zza(map);
    }

    public final ConcurrentHashMap zzc() {
        return new ConcurrentHashMap(this.zzb);
    }

    public final void zzd(Map map) {
        zza(map, true);
    }

    public final void zze(Map map) {
        zza(map, false);
    }
}

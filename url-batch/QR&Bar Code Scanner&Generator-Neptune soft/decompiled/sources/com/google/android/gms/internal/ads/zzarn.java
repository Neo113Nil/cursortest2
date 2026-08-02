package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzarn extends zzarq {
    private final View zzi;

    public zzarn(zzaqe zzaqeVar, String str, String str2, zzamk zzamkVar, int i, int i2, View view) {
        super(zzaqeVar, "xcWDoPM3ZfO4P10VSUmZKRTMvsXPXnglJL31bwAJBgJGdSUy2IQG17s4MILOncV2", "9rXsTdb/WXYONX554dN5CJ2eqpcy9gFPMPi8uAjaHTA=", zzamkVar, i, 57);
        this.zzi = view;
    }

    @Override // com.google.android.gms.internal.ads.zzarq
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcD);
            Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zziC);
            zzaqi zzaqiVar = new zzaqi((String) this.zzf.invoke(null, this.zzi, this.zzb.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzamy zza = zzamz.zza();
            zza.zzb(zzaqiVar.zza.longValue());
            zza.zzd(zzaqiVar.zzb.longValue());
            zza.zze(zzaqiVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zza.zzc(zzaqiVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zza.zza(zzaqiVar.zzd.longValue());
            }
            this.zze.zzY((zzamz) zza.zzam());
        }
    }
}

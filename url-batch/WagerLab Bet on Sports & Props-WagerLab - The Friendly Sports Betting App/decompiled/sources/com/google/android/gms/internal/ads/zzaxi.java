package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzaxi extends zzaxl {
    private final View zzh;

    public zzaxi(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i, int i2, View view) {
        super(zzavxVar, "UGogIgDf9q+IGA3QKHqW/91b9ZzRTVJqtfmUoLBkD310fwrDg1hJZvDQk8/WK1MH", "sEqRe1gPhw/PwjhUj/qVAEUjKSVJDrXHsmrE44pcjTE=", zzarwVar, i, 57);
        this.zzh = view;
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        View view = this.zzh;
        if (view != null) {
            Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdP);
            Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlM);
            zzawb zzawbVar = new zzawb((String) this.zze.invoke(null, view, this.zza.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzasr zza = zzass.zza();
            zza.zzb(zzawbVar.zza.longValue());
            zza.zzc(zzawbVar.zzb.longValue());
            zza.zzd(zzawbVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zza.zza(zzawbVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zza.zze(zzawbVar.zzd.longValue());
            }
            this.zzd.zzM((zzass) zza.zzbu());
        }
    }
}

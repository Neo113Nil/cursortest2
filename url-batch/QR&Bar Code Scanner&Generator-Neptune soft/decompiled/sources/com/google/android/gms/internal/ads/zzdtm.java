package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzdtm implements zzbpu {
    final /* synthetic */ zzdtn zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzbpu zzd;

    /* synthetic */ zzdtm(zzdtn zzdtnVar, WeakReference weakReference, String str, zzbpu zzbpuVar, zzdtl zzdtlVar) {
        this.zza = zzdtnVar;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbpuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zzk(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}

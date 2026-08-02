package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzdnn implements zzbpu {
    private final WeakReference zza;

    /* synthetic */ zzdnn(zzdnq zzdnqVar, zzdnm zzdnmVar) {
        this.zza = new WeakReference(zzdnqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zza(Object obj, Map map) {
        zzdcy zzdcyVar;
        zzdkl zzdklVar;
        zzdnq zzdnqVar = (zzdnq) this.zza.get();
        if (zzdnqVar == null) {
            return;
        }
        zzdcyVar = zzdnqVar.zzh;
        zzdcyVar.onAdClicked();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zziw)).booleanValue()) {
            zzdklVar = zzdnqVar.zzi;
            zzdklVar.zzq();
        }
    }
}

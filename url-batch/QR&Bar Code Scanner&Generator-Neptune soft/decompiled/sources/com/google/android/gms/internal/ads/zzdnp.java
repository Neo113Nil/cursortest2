package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzdnp implements zzbpu {
    private final WeakReference zza;

    /* synthetic */ zzdnp(zzdnq zzdnqVar, zzdno zzdnoVar) {
        this.zza = new WeakReference(zzdnqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zza(Object obj, Map map) {
        zzdds zzddsVar;
        zzdnq zzdnqVar = (zzdnq) this.zza.get();
        if (zzdnqVar == null) {
            return;
        }
        zzddsVar = zzdnqVar.zzg;
        zzddsVar.zza();
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzcen extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzcer zza;

    zzcen(zzcer zzcerVar) {
        this.zza = zzcerVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        Context context;
        zzcfo zzcfoVar;
        Object obj;
        zzbid zzbidVar;
        zzcer zzcerVar = this.zza;
        context = zzcerVar.zze;
        zzcfoVar = zzcerVar.zzf;
        zzbib zzbibVar = new zzbib(context, zzcfoVar.zza);
        obj = this.zza.zza;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.zzt.zze();
                zzbidVar = this.zza.zzg;
                zzbie.zza(zzbidVar, zzbibVar);
            } catch (IllegalArgumentException e) {
                com.google.android.gms.ads.internal.util.zze.zzk("Cannot config CSI reporter.", e);
            }
        }
    }
}

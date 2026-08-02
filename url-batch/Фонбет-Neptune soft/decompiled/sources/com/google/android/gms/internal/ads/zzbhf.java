package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbhf extends zzbgg {
    final /* synthetic */ zzbhi zza;

    /* synthetic */ zzbhf(zzbhi zzbhiVar, zzbhe zzbheVar) {
        this.zza = zzbhiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgh
    public final void zze(zzbfx zzbfxVar, String str) {
        com.google.android.gms.ads.formats.zzf zzfVar;
        com.google.android.gms.ads.formats.zzf zzfVar2;
        zzbfy zzf;
        zzbhi zzbhiVar = this.zza;
        zzfVar = zzbhiVar.zzb;
        if (zzfVar == null) {
            return;
        }
        zzfVar2 = zzbhiVar.zzb;
        zzf = zzbhiVar.zzf(zzbfxVar);
        zzfVar2.zzb(zzf, str);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbza extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzbze zza;

    zzbza(zzbze zzbzeVar) {
        this.zza = zzbzeVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        Context context;
        VersionInfoParcel versionInfoParcel;
        Object obj;
        zzbcb zzbcbVar;
        zzbze zzbzeVar = this.zza;
        context = zzbzeVar.zze;
        versionInfoParcel = zzbzeVar.zzf;
        zzbbz zzbbzVar = new zzbbz(context, versionInfoParcel.afmaVersion);
        obj = this.zza.zza;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.zzu.zze();
                zzbcbVar = this.zza.zzh;
                zzbcc.zza(zzbcbVar, zzbbzVar);
            } catch (IllegalArgumentException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot config CSI reporter.", e);
            }
        }
    }
}

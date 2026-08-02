package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbpl implements zzbpu {
    zzbpl() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcmp zzcmpVar = (zzcmp) obj;
        if (zzcmpVar.zzL() != null) {
            zzcmpVar.zzL().zza();
        }
        com.google.android.gms.ads.internal.overlay.zzl zzN = zzcmpVar.zzN();
        if (zzN != null) {
            zzN.zzb();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzl zzO = zzcmpVar.zzO();
        if (zzO != null) {
            zzO.zzb();
        } else {
            com.google.android.gms.ads.internal.util.zze.zzj("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}

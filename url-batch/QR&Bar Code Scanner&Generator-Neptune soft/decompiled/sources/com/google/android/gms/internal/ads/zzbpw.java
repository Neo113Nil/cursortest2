package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbpw implements zzbpu {
    private final zzbpx zza;

    public zzbpw(zzbpx zzbpxVar, byte[] bArr) {
        this.zza = zzbpxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcmp zzcmpVar = (zzcmp) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            com.google.android.gms.ads.internal.util.zze.zzh("Fail to parse float", e);
        }
        this.zza.zzc(equals);
        this.zza.zzb(equals2, f);
        zzcmpVar.zzav(equals);
    }
}

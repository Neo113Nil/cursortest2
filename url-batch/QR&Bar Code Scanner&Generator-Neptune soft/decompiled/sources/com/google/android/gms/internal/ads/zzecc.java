package com.google.android.gms.internal.ads;

import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzecc implements zzgxi {
    public static zzecc zza() {
        zzecc zzeccVar;
        zzeccVar = zzecb.zza;
        return zzeccVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* synthetic */ Object zzb() {
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzgxq.zzb(uuid);
        return uuid;
    }
}

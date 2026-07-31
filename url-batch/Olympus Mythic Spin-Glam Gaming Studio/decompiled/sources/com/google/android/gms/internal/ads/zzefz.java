package com.google.android.gms.internal.ads;

import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes12.dex */
public final class zzefz implements zzinw {
    public static zzefz zza() {
        return zzefy.zza;
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        com.google.android.gms.ads.internal.zzt.zzc();
        String uuid = UUID.randomUUID().toString();
        zzioe.zzb(uuid);
        return uuid;
    }
}

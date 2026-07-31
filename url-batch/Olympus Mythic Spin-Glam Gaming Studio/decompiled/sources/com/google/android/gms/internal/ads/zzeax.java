package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzeax implements zzinw {
    private final zziof zza;

    private zzeax(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzeax zza(zziof zziofVar) {
        return new zzeax(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeaw((Clock) this.zza.zzb());
    }
}

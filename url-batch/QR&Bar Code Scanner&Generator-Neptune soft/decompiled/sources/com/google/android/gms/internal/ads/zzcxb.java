package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcxb implements zzgxi {
    private final zzgxv zza;
    private final zzgxv zzb;

    public zzcxb(zzgxv zzgxvVar, zzgxv zzgxvVar2) {
        this.zza = zzgxvVar;
        this.zzb = zzgxvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdfp zzb() {
        return new zzdfp((ScheduledExecutorService) this.zza.zzb(), (Clock) this.zzb.zzb());
    }
}

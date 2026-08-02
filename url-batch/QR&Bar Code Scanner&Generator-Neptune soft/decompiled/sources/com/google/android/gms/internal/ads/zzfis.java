package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfis implements zzgxi {
    private final zzgxv zza;
    private final zzgxv zzb;
    private final zzgxv zzc;

    public zzfis(zzgxv zzgxvVar, zzgxv zzgxvVar2, zzgxv zzgxvVar3) {
        this.zza = zzgxvVar;
        this.zzb = zzgxvVar2;
        this.zzc = zzgxvVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgxc zza = zzgxh.zza(this.zza);
        zzgxc zza2 = zzgxh.zza(this.zzb);
        Object zzfiuVar = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzht)).booleanValue() ? new zzfiu((zzfir) zza.zzb(), (ScheduledExecutorService) this.zzc.zzb()) : (zzfir) zza2.zzb();
        zzgxq.zzb(zzfiuVar);
        return zzfiuVar;
    }
}

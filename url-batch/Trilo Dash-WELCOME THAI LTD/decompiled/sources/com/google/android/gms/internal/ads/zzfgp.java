package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfgp implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;

    public zzfgp(zzgqh zzgqhVar, zzgqh zzgqhVar2, zzgqh zzgqhVar3) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
        this.zzc = zzgqhVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgpo zza = zzgpt.zza(this.zza);
        zzgpo zza2 = zzgpt.zza(this.zzb);
        Object zzfgrVar = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhg)).booleanValue() ? new zzfgr((zzfgo) zza.zzb(), (ScheduledExecutorService) this.zzc.zzb()) : (zzfgo) zza2.zzb();
        zzgqc.zzb(zzfgrVar);
        return zzfgrVar;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzfjh implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;
    private final zziof zzd;
    private final zziof zze;

    private zzfjh(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
        this.zzd = zziofVar4;
        this.zze = zziofVar5;
    }

    public static zzfjh zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6) {
        return new zzfjh(zziofVar, zziofVar2, zziofVar3, zziofVar4, zziofVar5, zziofVar6);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfjg((Context) this.zza.zzb(), (Executor) this.zzb.zzb(), (zzcob) this.zzc.zzb(), (zzeua) this.zzd.zzb(), (zzfkh) this.zze.zzb(), new zzflv());
    }
}

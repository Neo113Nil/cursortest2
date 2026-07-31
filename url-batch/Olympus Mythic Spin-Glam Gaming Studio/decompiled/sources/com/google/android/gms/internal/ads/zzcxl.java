package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzcxl implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzcxl(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar2;
        this.zzb = zziofVar3;
    }

    public static zzcxl zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzcxl(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return true == Boolean.valueOf(zzcxj.zza()).booleanValue() ? ((zzepu) this.zza).zzb() : ((zzert) this.zzb).zzb();
    }
}

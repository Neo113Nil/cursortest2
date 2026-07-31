package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzeve implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzeve(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        this.zza = zziofVar2;
        this.zzb = zziofVar3;
        this.zzc = zziofVar4;
    }

    public static zzeve zzc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        return new zzeve(zziofVar, zziofVar2, zziofVar3, zziofVar4);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzevc zzb() {
        return new zzevc(zzfoy.zzc(), ((zzcok) this.zza).zza(), ((zzddg) this.zzb).zza(), ((zzcwb) this.zzc).zza());
    }
}

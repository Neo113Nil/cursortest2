package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
public final class zzewf implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzewf(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        this.zza = zziofVar2;
        this.zzb = zziofVar3;
        this.zzc = zziofVar4;
    }

    public static zzewf zzc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        return new zzewf(zziofVar, zziofVar2, zziofVar3, zziofVar4);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzewa zzb() {
        return new zzewa(zzfoy.zzc(), (zzdya) this.zza.zzb(), (zzecu) this.zzb.zzb(), (zzewc) this.zzc.zzb());
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzevv implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;
    private final zziof zzd;

    private zzevv(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
        this.zzd = zziofVar4;
    }

    public static zzevv zzc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        return new zzevv(zziofVar, zziofVar2, zziofVar3, zziofVar4);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzevt zzb() {
        return new zzevt((zzexw) this.zza.zzb(), ((zzddg) this.zzb).zza(), ((zzcok) this.zzc).zza(), (zzcfv) this.zzd.zzb());
    }
}

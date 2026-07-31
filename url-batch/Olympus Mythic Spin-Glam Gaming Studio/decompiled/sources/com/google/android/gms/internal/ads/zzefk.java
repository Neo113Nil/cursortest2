package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes12.dex */
public final class zzefk implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzefk(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        this.zza = zziofVar3;
        this.zzb = zziofVar4;
    }

    public static zzefk zzc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        return new zzefk(zziofVar, zziofVar2, zziofVar3, zziofVar4);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzefj zzb() {
        return new zzefj(zzfpe.zzc(), zzfoy.zzc(), ((zzefx) this.zza).zzb(), zzinv.zzc(this.zzb));
    }
}

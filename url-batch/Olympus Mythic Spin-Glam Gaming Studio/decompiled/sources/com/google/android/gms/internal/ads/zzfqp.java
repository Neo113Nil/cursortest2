package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzfqp implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzfqp(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzfqp zza(zziof zziofVar, zziof zziofVar2) {
        return new zzfqp(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfqo(((zzcok) this.zza).zza(), (zzfrg) this.zzb.zzb());
    }
}

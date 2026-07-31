package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzfft implements zzinw {
    private final zzffn zza;

    private zzfft(zzffn zzffnVar) {
        this.zza = zzffnVar;
    }

    public static zzfft zzc(zzffn zzffnVar) {
        return new zzfft(zzffnVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Integer zzb() {
        return Integer.valueOf(this.zza.zzi());
    }
}

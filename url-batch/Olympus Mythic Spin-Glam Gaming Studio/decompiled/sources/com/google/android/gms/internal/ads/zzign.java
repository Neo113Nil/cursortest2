package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes6.dex */
final class zzign {
    private static final zzigu zzb = new zzigl();
    private final zzigu zza;

    public zzign() {
        zziff zza = zziff.zza();
        int i = zzidv.zza;
        this.zza = new zzigm(zza, zzb);
    }

    public final zziho zza(Class cls) {
        int i = zzihp.zza;
        if (!zzifm.class.isAssignableFrom(cls)) {
            int i2 = zzidv.zza;
        }
        int i3 = zzidv.zza;
        zzigt zzc = this.zza.zzc(cls);
        if (zzc.zza()) {
            return zziha.zzh(zzihp.zzE(), zziez.zza(), zzc.zzb());
        }
        return zzigz.zzm(cls, zzc, zzihd.zza(), zzigj.zza(), zzihp.zzE(), zzc.zzc() + (-1) != 1 ? zziez.zza() : null, zzigs.zza());
    }
}

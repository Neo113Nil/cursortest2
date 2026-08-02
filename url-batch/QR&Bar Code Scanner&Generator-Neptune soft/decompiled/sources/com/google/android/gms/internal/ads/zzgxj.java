package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgxj implements zzgxi, zzgxc {
    private static final zzgxj zza = new zzgxj(null);
    private final Object zzb;

    private zzgxj(Object obj) {
        this.zzb = obj;
    }

    public static zzgxi zza(Object obj) {
        zzgxq.zza(obj, "instance cannot be null");
        return new zzgxj(obj);
    }

    public static zzgxi zzc(Object obj) {
        return obj == null ? zza : new zzgxj(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final Object zzb() {
        return this.zzb;
    }
}

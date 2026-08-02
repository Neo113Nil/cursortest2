package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzebz implements zzgxi {
    private final zzgxv zza;

    public zzebz(zzgxv zzgxvVar) {
        this.zza = zzgxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String packageName = ((zzcos) this.zza).zza().getPackageName();
        zzgxq.zzb(packageName);
        return packageName;
    }
}

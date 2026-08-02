package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcyh implements zzgxi {
    private final zzgxv zza;

    public zzcyh(zzgxv zzgxvVar) {
        this.zza = zzgxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        boolean z = true;
        if (((zzdcr) this.zza).zza().zza() == null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeF)).booleanValue()) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}

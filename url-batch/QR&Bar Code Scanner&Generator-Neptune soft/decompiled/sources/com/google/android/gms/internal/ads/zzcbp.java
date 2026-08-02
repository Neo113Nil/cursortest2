package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcbp extends zzcbr {
    private final String zza;
    private final int zzb;

    public zzcbp(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzcbp)) {
            zzcbp zzcbpVar = (zzcbp) obj;
            if (Objects.equal(this.zza, zzcbpVar.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzcbpVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final String zzc() {
        return this.zza;
    }
}

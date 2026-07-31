package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzw {
    public final String zza;
    public final String zzb;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzw(String str, String str2) {
        this.zza = zzeo.zzh(str);
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzw zzwVar = (zzw) obj;
            if (Objects.equals(this.zza, zzwVar.zza) && Objects.equals(this.zzb, zzwVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() * 31;
        String str = this.zza;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}

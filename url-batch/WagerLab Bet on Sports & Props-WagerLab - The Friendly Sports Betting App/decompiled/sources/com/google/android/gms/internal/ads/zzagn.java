package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzagn extends zzagh {
    public final String zza;
    public final String zzb;

    public zzagn(String str, String str2, String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzagn zzagnVar = (zzagn) obj;
            if (this.zzf.equals(zzagnVar.zzf) && Objects.equals(this.zza, zzagnVar.zza) && Objects.equals(this.zzb, zzagnVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        return (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.zzb.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 6 + str2.length());
        sb.append(str);
        sb.append(": url=");
        sb.append(str2);
        return sb.toString();
    }
}

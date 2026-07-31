package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.X3;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzahi {
    public final zzahl zza;
    public final zzahl zzb;

    public zzahi(zzahl zzahlVar, zzahl zzahlVar2) {
        this.zza = zzahlVar;
        this.zzb = zzahlVar2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahi.class == obj.getClass()) {
            zzahi zzahiVar = (zzahi) obj;
            if (this.zza.equals(zzahiVar.zza) && this.zzb.equals(zzahiVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        zzahl zzahlVar = this.zza;
        zzahl zzahlVar2 = this.zzb;
        String obj = zzahlVar.toString();
        String concat = zzahlVar.equals(zzahlVar2) ? "" : ", ".concat(zzahlVar2.toString());
        StringBuilder sb = new StringBuilder(obj.length() + 1 + concat.length() + 1);
        sb.append(X3.j.d);
        sb.append(obj);
        sb.append(concat);
        sb.append(X3.j.e);
        return sb.toString();
    }
}

package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzght {
    private final zzghm zza;
    private final List zzb;

    @Nullable
    private final Integer zzc;

    /* synthetic */ zzght(zzghm zzghmVar, List list, Integer num, zzghs zzghsVar) {
        this.zza = zzghmVar;
        this.zzb = list;
        this.zzc = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzght)) {
            return false;
        }
        zzght zzghtVar = (zzght) obj;
        if (this.zza.equals(zzghtVar.zza) && this.zzb.equals(zzghtVar.zzb)) {
            Integer num = this.zzc;
            Integer num2 = zzghtVar.zzc;
            if (num == num2) {
                return true;
            }
            if (num != null && num.equals(num2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.zza, this.zzb, this.zzc);
    }
}

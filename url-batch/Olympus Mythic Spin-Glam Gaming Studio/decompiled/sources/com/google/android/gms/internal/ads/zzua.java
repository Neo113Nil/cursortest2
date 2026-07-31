package com.google.android.gms.internal.ads;

import android.os.Build;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzua {

    @VisibleForTesting
    public static final zzgxw zza;

    static {
        zza = Build.VERSION.SDK_INT < 32 ? zzgxw.zzl(12, 252, 6396, 4) : zzgxw.zzn(12, 252, 6396, 4, 3145980, 82172, 737532, 9126140, 33904892, 202070268, 744444, 67108860, 743676, 3152124, 88316, 81980, 205215996, 3890172);
    }

    public static int zza(zzql zzqlVar) {
        int zzb = zzb(zzqlVar.zze());
        if (zzb != 0) {
            return zzb;
        }
        int zzb2 = zzb(zzqlVar.zzd());
        if (zzb2 != 0) {
            return zzb2;
        }
        return 12;
    }

    private static int zzb(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            if (zza.contains(num)) {
                return intValue;
            }
        }
        return 0;
    }
}

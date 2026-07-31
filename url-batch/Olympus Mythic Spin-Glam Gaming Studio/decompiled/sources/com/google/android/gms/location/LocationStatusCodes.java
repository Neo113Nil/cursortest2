package com.google.android.gms.location;

import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@Deprecated
/* loaded from: classes5.dex */
public final class LocationStatusCodes {
    private LocationStatusCodes() {
    }

    public static int zza(int i) {
        if ((i < 0 || i > 1) && (i < 1000 || i >= 1006)) {
            return 1;
        }
        return i;
    }

    public static Status zzb(int i) {
        if (i == 1) {
            i = 13;
        }
        return new Status(i);
    }
}

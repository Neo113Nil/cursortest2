package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzah {
    public static final zzah zza = new zzah(new zzag());
    public final Uri zzb = null;
    public final String zzc = null;
    public final Bundle zzd = null;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    private zzah(zzag zzagVar) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzah)) {
            return false;
        }
        zzah zzahVar = (zzah) obj;
        Uri uri = zzahVar.zzb;
        if (Objects.equals(null, null)) {
            String str = zzahVar.zzc;
            if (Objects.equals(null, null)) {
                Bundle bundle = zzahVar.zzd;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }
}

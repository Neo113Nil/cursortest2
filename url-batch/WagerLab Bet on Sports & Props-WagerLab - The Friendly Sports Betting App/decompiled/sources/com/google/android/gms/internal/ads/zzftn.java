package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzftn extends zzftl {
    private static zzftn zzd;

    private zzftn(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzftn zzh(Context context) {
        zzftn zzftnVar;
        synchronized (zzftn.class) {
            if (zzd == null) {
                zzd = new zzftn(context);
            }
            zzftnVar = zzd;
        }
        return zzftnVar;
    }

    public final zzfti zzi(long j, boolean z) throws IOException {
        synchronized (zzftn.class) {
            if (this.zzc.zzc()) {
                return zza(null, null, j, z);
            }
            return new zzfti();
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzftn.class) {
            if (zzg(false)) {
                zzc(false);
            }
        }
    }
}

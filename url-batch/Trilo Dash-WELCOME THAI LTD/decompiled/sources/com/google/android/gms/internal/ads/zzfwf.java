package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfwf {
    private final OutputStream zza;

    private zzfwf(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzfwf zzb(OutputStream outputStream) {
        return new zzfwf(outputStream);
    }

    public final void zza(zzgfu zzgfuVar) throws IOException {
        try {
            zzgfuVar.zzat(this.zza);
        } finally {
            this.zza.close();
        }
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgam {
    private final OutputStream zza;

    private zzgam(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzgam zzb(OutputStream outputStream) {
        return new zzgam(outputStream);
    }

    public final void zza(zzgmk zzgmkVar) throws IOException {
        try {
            zzgmkVar.zzaw(this.zza);
        } finally {
            this.zza.close();
        }
    }
}

package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
final class zzauk implements zzaun {
    final /* synthetic */ File zza;

    zzauk(zzauo zzauoVar, File file) {
        this.zza = file;
        Objects.requireNonNull(zzauoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final File zza() {
        return this.zza;
    }
}

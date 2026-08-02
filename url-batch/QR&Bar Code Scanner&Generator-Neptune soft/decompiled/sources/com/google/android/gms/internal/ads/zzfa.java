package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfa {
    private Uri zza;
    private final int zzb = 1;
    private Map zzc = Collections.emptyMap();
    private long zzd;
    private int zze;

    public final zzfa zza(int i) {
        this.zze = 6;
        return this;
    }

    public final zzfa zzb(Map map) {
        this.zzc = map;
        return this;
    }

    public final zzfa zzc(long j) {
        this.zzd = j;
        return this;
    }

    public final zzfa zzd(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzfc zze() {
        if (this.zza != null) {
            return new zzfc(this.zza, this.zzc, this.zzd, this.zze);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}

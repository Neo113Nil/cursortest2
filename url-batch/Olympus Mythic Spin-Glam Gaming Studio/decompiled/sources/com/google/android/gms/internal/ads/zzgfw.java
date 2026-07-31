package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public abstract class zzgfw {
    protected final File zza;

    public zzgfw(File file) {
        this.zza = file;
    }

    public final File zza() {
        return this.zza;
    }

    public abstract ListenableFuture zzb();

    public abstract ListenableFuture zzc(Object obj);
}

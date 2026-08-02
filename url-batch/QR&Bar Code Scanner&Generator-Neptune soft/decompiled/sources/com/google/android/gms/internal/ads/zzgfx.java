package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgfx {
    private static final zzgfx zza = new zzgfx();
    private static final zzgfw zzb = new zzgfw(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzgfx zza() {
        return zza;
    }

    public final zzgho zzb() {
        zzgho zzghoVar = (zzgho) this.zzc.get();
        return zzghoVar == null ? zzb : zzghoVar;
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzawc implements Runnable {
    final /* synthetic */ zzawe zza;

    zzawc(zzawe zzaweVar) {
        Objects.requireNonNull(zzaweVar);
        this.zza = zzaweVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzd();
    }
}

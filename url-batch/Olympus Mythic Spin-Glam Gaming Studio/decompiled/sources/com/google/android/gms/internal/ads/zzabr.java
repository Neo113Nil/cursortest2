package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
final class zzabr {
    private final Handler zza;
    private final zzabt zzb;
    private boolean zzc;

    public zzabr(Handler handler, zzabt zzabtVar) {
        this.zza = handler;
        this.zzb = zzabtVar;
    }

    public final void zza() {
        this.zzc = true;
    }

    final /* synthetic */ Handler zzb() {
        return this.zza;
    }

    final /* synthetic */ zzabt zzc() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzd() {
        return this.zzc;
    }
}

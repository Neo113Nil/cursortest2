package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaxu implements Runnable {
    final /* synthetic */ IOException zza;
    final /* synthetic */ zzaxy zzb;

    zzaxu(zzaxy zzaxyVar, IOException iOException) {
        this.zzb = zzaxyVar;
        this.zza = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaxz zzaxzVar;
        zzaxzVar = this.zzb.zze;
        zzaxzVar.zzi(this.zza);
    }
}

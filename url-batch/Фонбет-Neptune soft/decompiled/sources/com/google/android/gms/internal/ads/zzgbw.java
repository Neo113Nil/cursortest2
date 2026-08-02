package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgbw extends zzgbi {

    @CheckForNull
    private zzgbv zza;

    zzgbw(zzfxm zzfxmVar, boolean z, Executor executor, Callable callable) {
        super(zzfxmVar, z, false);
        this.zza = new zzgbu(this, callable, executor);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgbi
    final void zzf(int i, @CheckForNull Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    protected final void zzq() {
        zzgbv zzgbvVar = this.zza;
        if (zzgbvVar != null) {
            zzgbvVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbi
    final void zzu() {
        zzgbv zzgbvVar = this.zza;
        if (zzgbvVar != null) {
            zzgbvVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbi
    final void zzy(int i) {
        super.zzy(i);
        if (i == 1) {
            this.zza = null;
        }
    }
}

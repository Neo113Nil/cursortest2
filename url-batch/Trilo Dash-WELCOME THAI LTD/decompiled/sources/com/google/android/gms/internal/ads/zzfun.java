package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
final class zzfun extends zzfua {

    @CheckForNull
    private zzfum zza;

    zzfun(zzfrc zzfrcVar, boolean z, Executor executor, Callable callable) {
        super(zzfrcVar, z, false);
        this.zza = new zzful(this, callable, executor);
        zzw();
    }

    static /* synthetic */ zzfum zzG(zzfun zzfunVar, zzfum zzfumVar) {
        zzfunVar.zza = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfua
    final void zzg(int i, @CheckForNull Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    protected final void zzr() {
        zzfum zzfumVar = this.zza;
        if (zzfumVar != null) {
            zzfumVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfua
    final void zzv() {
        zzfum zzfumVar = this.zza;
        if (zzfumVar != null) {
            zzfumVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfua
    final void zzz(int i) {
        super.zzz(i);
        if (i == 1) {
            this.zza = null;
        }
    }
}

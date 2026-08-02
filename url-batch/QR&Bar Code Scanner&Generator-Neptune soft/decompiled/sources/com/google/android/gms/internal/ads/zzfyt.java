package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfyt extends zzfyg {

    @CheckForNull
    private zzfys zza;

    zzfyt(zzfvi zzfviVar, boolean z, Executor executor, Callable callable) {
        super(zzfviVar, z, false);
        this.zza = new zzfyr(this, callable, executor);
        zzw();
    }

    static /* synthetic */ zzfys zzG(zzfyt zzfytVar, zzfys zzfysVar) {
        zzfytVar.zza = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfyg
    final void zzg(int i, @CheckForNull Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    protected final void zzr() {
        zzfys zzfysVar = this.zza;
        if (zzfysVar != null) {
            zzfysVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyg
    final void zzv() {
        zzfys zzfysVar = this.zza;
        if (zzfysVar != null) {
            zzfysVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyg
    final void zzz(int i) {
        super.zzz(i);
        if (i == 1) {
            this.zza = null;
        }
    }
}

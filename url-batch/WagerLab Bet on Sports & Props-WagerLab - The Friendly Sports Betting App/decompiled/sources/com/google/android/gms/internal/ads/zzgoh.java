package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzgoh extends zzgnv {
    private zzgog zza;

    zzgoh(zzgjv zzgjvVar, boolean z, Executor executor, Callable callable) {
        super(zzgjvVar, z, false);
        this.zza = new zzgof(this, callable, executor);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgnv
    final void zzA(int i) {
        super.zzA(i);
        if (i == 1) {
            this.zza = null;
        }
    }

    final /* synthetic */ void zzD(zzgog zzgogVar) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    protected final void zzi() {
        zzgog zzgogVar = this.zza;
        if (zzgogVar != null) {
            zzgogVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnv
    final void zzw(int i, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzgnv
    final void zzx() {
        zzgog zzgogVar = this.zza;
        if (zzgogVar != null) {
            zzgogVar.zze();
        }
    }
}

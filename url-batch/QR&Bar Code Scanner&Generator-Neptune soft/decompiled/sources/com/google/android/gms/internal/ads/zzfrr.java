package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfrr extends zzfro {
    final /* synthetic */ zzfro zza;
    final /* synthetic */ zzfry zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfrr(zzfry zzfryVar, TaskCompletionSource taskCompletionSource, zzfro zzfroVar) {
        super(taskCompletionSource);
        this.zzb = zzfryVar;
        this.zza = zzfroVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfro
    public final void zza() {
        zzfry.zzm(this.zzb, this.zza);
    }
}

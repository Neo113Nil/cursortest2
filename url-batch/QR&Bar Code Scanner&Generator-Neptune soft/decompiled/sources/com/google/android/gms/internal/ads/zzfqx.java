package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfqx extends zzfro {
    final /* synthetic */ zzfqr zza;
    final /* synthetic */ zzfrf zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzfra zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfqx(zzfra zzfraVar, TaskCompletionSource taskCompletionSource, zzfqr zzfqrVar, zzfrf zzfrfVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzd = zzfraVar;
        this.zza = zzfqrVar;
        this.zzb = zzfrfVar;
        this.zzc = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfrk] */
    @Override // com.google.android.gms.internal.ads.zzfro
    protected final void zza() {
        zzfrn zzfrnVar;
        String str;
        String str2;
        try {
            ?? zze = this.zzd.zza.zze();
            zzfqr zzfqrVar = this.zza;
            str2 = this.zzd.zzd;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfqrVar.zzb());
            bundle.putString("callerPackage", str2);
            bundle.putString("appId", zzfqrVar.zza());
            zze.zze(bundle, new zzfqz(this.zzd, this.zzb));
        } catch (RemoteException e) {
            zzfrnVar = zzfra.zzb;
            str = this.zzd.zzd;
            zzfrnVar.zzc(e, "dismiss overlay display from: %s", str);
            this.zzc.trySetException(new RuntimeException(e));
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfqy extends zzfro {
    final /* synthetic */ zzfrh zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzfrf zzc;
    final /* synthetic */ TaskCompletionSource zzd;
    final /* synthetic */ zzfra zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfqy(zzfra zzfraVar, TaskCompletionSource taskCompletionSource, zzfrh zzfrhVar, int i, zzfrf zzfrfVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zze = zzfraVar;
        this.zza = zzfrhVar;
        this.zzb = i;
        this.zzc = zzfrfVar;
        this.zzd = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfrk] */
    @Override // com.google.android.gms.internal.ads.zzfro
    protected final void zza() {
        zzfrn zzfrnVar;
        String str;
        String str2;
        try {
            ?? zze = this.zze.zza.zze();
            zzfrh zzfrhVar = this.zza;
            str2 = this.zze.zzd;
            int i = this.zzb;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfrhVar.zzb());
            bundle.putInt("displayMode", i);
            bundle.putString("callerPackage", str2);
            bundle.putString("appId", zzfrhVar.zza());
            zze.zzg(bundle, new zzfqz(this.zze, this.zzc));
        } catch (RemoteException e) {
            zzfrnVar = zzfra.zzb;
            str = this.zze.zzd;
            zzfrnVar.zzc(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(this.zzb), str);
            this.zzd.trySetException(new RuntimeException(e));
        }
    }
}

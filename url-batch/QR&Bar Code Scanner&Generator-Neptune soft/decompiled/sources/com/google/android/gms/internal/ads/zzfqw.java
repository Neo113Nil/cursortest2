package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfqw extends zzfro {
    final /* synthetic */ zzfrc zza;
    final /* synthetic */ zzfrf zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzfra zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfqw(zzfra zzfraVar, TaskCompletionSource taskCompletionSource, zzfrc zzfrcVar, zzfrf zzfrfVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzd = zzfraVar;
        this.zza = zzfrcVar;
        this.zzb = zzfrfVar;
        this.zzc = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfrk] */
    @Override // com.google.android.gms.internal.ads.zzfro
    protected final void zza() {
        zzfrn zzfrnVar;
        String str;
        String str2;
        String str3;
        try {
            ?? zze = this.zzd.zza.zze();
            zzfra zzfraVar = this.zzd;
            str2 = zzfraVar.zzd;
            zzfrc zzfrcVar = this.zza;
            str3 = zzfraVar.zzd;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", zzfrcVar.zze());
            bundle.putString("adFieldEnifd", zzfrcVar.zzf());
            bundle.putInt("layoutGravity", zzfrcVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzfrcVar.zza());
            bundle.putInt("displayMode", 0);
            bundle.putInt("windowWidthPx", zzfrcVar.zzd());
            bundle.putBoolean("stableSessionToken", false);
            bundle.putString("callerPackage", str3);
            if (zzfrcVar.zzg() != null) {
                bundle.putString("appId", zzfrcVar.zzg());
            }
            zze.zzf(str2, bundle, new zzfqz(this.zzd, this.zzb));
        } catch (RemoteException e) {
            zzfrnVar = zzfra.zzb;
            str = this.zzd.zzd;
            zzfrnVar.zzc(e, "show overlay display from: %s", str);
            this.zzc.trySetException(new RuntimeException(e));
        }
    }
}

package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.zzca;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes2.dex */
final class zzar extends com.google.android.play.core.internal.zzah {
    final /* synthetic */ com.google.android.play.core.tasks.zzi zza;
    final /* synthetic */ zzbc zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzar(zzbc zzbcVar, com.google.android.play.core.tasks.zzi zziVar, com.google.android.play.core.tasks.zzi zziVar2) {
        super(zziVar);
        this.zzb = zzbcVar;
        this.zza = zziVar2;
    }

    @Override // com.google.android.play.core.internal.zzah
    protected final void zza() {
        com.google.android.play.core.internal.zzag zzagVar;
        String str;
        try {
            zzca zzcaVar = (zzca) this.zzb.zza.zze();
            zzbc zzbcVar = this.zzb;
            str = zzbcVar.zzd;
            zzcaVar.zzi(str, new zzaz(zzbcVar, this.zza));
        } catch (RemoteException e) {
            zzagVar = zzbc.zzb;
            zzagVar.zzc(e, "getSessionStates", new Object[0]);
            this.zza.zzd(new RuntimeException(e));
        }
    }
}

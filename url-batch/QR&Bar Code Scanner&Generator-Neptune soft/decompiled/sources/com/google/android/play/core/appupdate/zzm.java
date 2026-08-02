package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.zzag;
import com.google.android.play.core.internal.zzah;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes2.dex */
final class zzm extends zzah {
    final /* synthetic */ com.google.android.play.core.tasks.zzi zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzq zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzm(zzq zzqVar, com.google.android.play.core.tasks.zzi zziVar, com.google.android.play.core.tasks.zzi zziVar2, String str) {
        super(zziVar);
        this.zzc = zzqVar;
        this.zza = zziVar2;
        this.zzb = str;
    }

    @Override // com.google.android.play.core.internal.zzah
    protected final void zza() {
        zzag zzagVar;
        String str;
        Bundle zzi;
        try {
            com.google.android.play.core.internal.zzp zzpVar = (com.google.android.play.core.internal.zzp) this.zzc.zza.zze();
            str = this.zzc.zzd;
            zzi = zzq.zzi();
            zzpVar.zzc(str, zzi, new zzo(this.zzc, this.zza));
        } catch (RemoteException e) {
            zzagVar = zzq.zzb;
            zzagVar.zzc(e, "completeUpdate(%s)", this.zzb);
            this.zza.zzd(new RuntimeException(e));
        }
    }
}

package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.zzca;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes2.dex */
final class zzao extends com.google.android.play.core.internal.zzah {
    final /* synthetic */ List zza;
    final /* synthetic */ com.google.android.play.core.tasks.zzi zzb;
    final /* synthetic */ zzbc zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzao(zzbc zzbcVar, com.google.android.play.core.tasks.zzi zziVar, List list, com.google.android.play.core.tasks.zzi zziVar2) {
        super(zziVar);
        this.zzc = zzbcVar;
        this.zza = list;
        this.zzb = zziVar2;
    }

    @Override // com.google.android.play.core.internal.zzah
    protected final void zza() {
        com.google.android.play.core.internal.zzag zzagVar;
        String str;
        try {
            zzca zzcaVar = (zzca) this.zzc.zza.zze();
            str = this.zzc.zzd;
            zzcaVar.zze(str, zzbc.zzl(this.zza), zzbc.zza(), new zzav(this.zzc, this.zzb));
        } catch (RemoteException e) {
            zzagVar = zzbc.zzb;
            zzagVar.zzc(e, "deferredLanguageInstall(%s)", this.zza);
            this.zzb.zzd(new RuntimeException(e));
        }
    }
}

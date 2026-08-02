package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.common.PlayCoreVersion;
import com.google.android.play.core.internal.zzac;
import com.google.android.play.core.internal.zzag;
import com.google.android.play.core.internal.zzah;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes2.dex */
final class zzf extends zzah {
    final /* synthetic */ com.google.android.play.core.tasks.zzi zza;
    final /* synthetic */ zzi zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzf(zzi zziVar, com.google.android.play.core.tasks.zzi zziVar2, com.google.android.play.core.tasks.zzi zziVar3) {
        super(zziVar2);
        this.zzb = zziVar;
        this.zza = zziVar3;
    }

    @Override // com.google.android.play.core.internal.zzah
    protected final void zza() {
        zzag zzagVar;
        String str;
        String str2;
        String str3;
        try {
            zzac zzacVar = (zzac) this.zzb.zza.zze();
            str2 = this.zzb.zzc;
            Bundle zza = PlayCoreVersion.zza("review");
            zzi zziVar = this.zzb;
            com.google.android.play.core.tasks.zzi zziVar2 = this.zza;
            str3 = zziVar.zzc;
            zzacVar.zzc(str2, zza, new zzh(zziVar, zziVar2, str3));
        } catch (RemoteException e) {
            zzagVar = zzi.zzb;
            str = this.zzb.zzc;
            zzagVar.zzc(e, "error requesting in-app review for %s", str);
            this.zza.zzd(new RuntimeException(e));
        }
    }
}

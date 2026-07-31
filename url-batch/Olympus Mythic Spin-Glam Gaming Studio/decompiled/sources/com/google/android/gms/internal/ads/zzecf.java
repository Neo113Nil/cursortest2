package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
final class zzecf extends zzcdg {
    final /* synthetic */ zzech zza;

    zzecf(zzech zzechVar) {
        Objects.requireNonNull(zzechVar);
        this.zza = zzechVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zze() throws RemoteException {
        zzech zzechVar = this.zza;
        zzechVar.zze().zzk(zzechVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zzf(int i) throws RemoteException {
        zzech zzechVar = this.zza;
        zzechVar.zze().zzl(zzechVar.zzd(), i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzech zzechVar = this.zza;
        zzechVar.zze().zzl(zzechVar.zzd(), zzeVar.zza);
    }
}

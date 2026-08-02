package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbks implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbzt zza;
    final /* synthetic */ zzbku zzb;

    zzbks(zzbku zzbkuVar, zzbzt zzbztVar) {
        this.zza = zzbztVar;
        this.zzb = zzbkuVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbkh zzbkhVar;
        try {
            zzbzt zzbztVar = this.zza;
            zzbkhVar = this.zzb.zza;
            zzbztVar.zzc(zzbkhVar.zzp());
        } catch (DeadObjectException e) {
            this.zza.zzd(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zza.zzd(new RuntimeException("onConnectionSuspended: " + i));
    }
}

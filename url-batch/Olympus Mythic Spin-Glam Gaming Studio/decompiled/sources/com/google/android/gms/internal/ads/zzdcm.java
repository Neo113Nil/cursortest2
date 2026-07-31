package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
final class zzdcm extends IHsdpPrewarmServiceCallback.Stub {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzdcn zzc;

    zzdcm(zzdcn zzdcnVar, String str, long j) {
        this.zza = str;
        this.zzb = j;
        Objects.requireNonNull(zzdcnVar);
        this.zzc = zzdcnVar;
    }

    @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback
    public final void onError(Bundle bundle) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoE)).booleanValue()) {
            this.zzc.zzd(this.zza, this.zzb, "0", bundle);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback
    public final void onPrewarmCompleted(Bundle bundle) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoE)).booleanValue()) {
            this.zzc.zzd(this.zza, this.zzb, "1", bundle);
        }
    }
}

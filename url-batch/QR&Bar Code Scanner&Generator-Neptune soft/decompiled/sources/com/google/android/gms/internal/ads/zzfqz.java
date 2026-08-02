package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfqz extends zzfrl {
    final /* synthetic */ zzfra zza;
    private final zzfrf zzb;

    zzfqz(zzfra zzfraVar, zzfrf zzfrfVar) {
        this.zza = zzfraVar;
        this.zzb = zzfrfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzfrd zzc = zzfre.zzc();
        zzc.zzb(i);
        if (string != null) {
            zzc.zza(string);
        }
        this.zzb.zza(zzc.zzc());
        if (i == 8157) {
            this.zza.zzc();
        }
    }
}

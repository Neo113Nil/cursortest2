package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzetb implements zzevd {
    public final zzfdj zza;

    public zzetb(zzfdj zzfdjVar) {
        this.zza = zzfdjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevd
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfdj zzfdjVar = this.zza;
        if (zzfdjVar != null) {
            bundle.putBoolean("render_in_browser", zzfdjVar.zzd());
            bundle.putBoolean("disable_ml", this.zza.zzc());
        }
    }
}

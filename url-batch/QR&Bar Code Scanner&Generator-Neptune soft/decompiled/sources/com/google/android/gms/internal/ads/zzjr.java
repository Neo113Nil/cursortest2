package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzjr implements zzjn {
    public final zzsd zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzjr(zzsk zzskVar, boolean z) {
        this.zza = new zzsd(zzskVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzjn
    public final zzcn zza() {
        return this.zza.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzjn
    public final Object zzb() {
        return this.zzb;
    }

    public final void zzc(int i) {
        this.zzd = i;
        this.zze = false;
        this.zzc.clear();
    }
}

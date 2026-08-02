package com.google.android.gms.internal.ads;

import android.os.IBinder;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfru extends zzfro {
    final /* synthetic */ IBinder zza;
    final /* synthetic */ zzfrx zzb;

    zzfru(zzfrx zzfrxVar, IBinder iBinder) {
        this.zzb = zzfrxVar;
        this.zza = iBinder;
    }

    @Override // com.google.android.gms.internal.ads.zzfro
    public final void zza() {
        List list;
        List list2;
        this.zzb.zza.zzn = zzfrj.zzb(this.zza);
        zzfry.zzn(this.zzb.zza);
        this.zzb.zza.zzh = false;
        list = this.zzb.zza.zze;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = this.zzb.zza.zze;
        list2.clear();
    }
}

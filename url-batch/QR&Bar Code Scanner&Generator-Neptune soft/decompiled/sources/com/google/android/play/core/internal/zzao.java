package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes2.dex */
final class zzao extends zzah {
    final /* synthetic */ IBinder zza;
    final /* synthetic */ zzar zzb;

    zzao(zzar zzarVar, IBinder iBinder) {
        this.zzb = zzarVar;
        this.zza = iBinder;
    }

    @Override // com.google.android.play.core.internal.zzah
    public final void zza() {
        zzan zzanVar;
        List list;
        List list2;
        zzas zzasVar = this.zzb.zza;
        zzanVar = zzasVar.zzj;
        zzasVar.zzo = (IInterface) zzanVar.zza(this.zza);
        zzas.zzo(this.zzb.zza);
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

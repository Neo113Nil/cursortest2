package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbql;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
final class zzed extends zzbql {
    final /* synthetic */ zzee zza;

    /* synthetic */ zzed(zzee zzeeVar, zzec zzecVar) {
        this.zza = zzeeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqm
    public final void zzb(List list) throws RemoteException {
        InitializationStatus zzA;
        ArrayList arrayList;
        ArrayList arrayList2;
        this.zza.zze = false;
        this.zza.zzf = true;
        zzee zzeeVar = this.zza;
        zzA = zzee.zzA(list);
        arrayList = zzee.zzf().zzb;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((OnInitializationCompleteListener) arrayList.get(i)).onInitializationComplete(zzA);
        }
        arrayList2 = zzee.zzf().zzb;
        arrayList2.clear();
    }
}

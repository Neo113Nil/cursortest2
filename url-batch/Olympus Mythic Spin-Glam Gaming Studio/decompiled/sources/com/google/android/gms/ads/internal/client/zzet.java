package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbsn;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes13.dex */
final class zzet extends zzbsn {
    final /* synthetic */ zzeu zza;

    /* synthetic */ zzet(zzeu zzeuVar, byte[] bArr) {
        Objects.requireNonNull(zzeuVar);
        this.zza = zzeuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zza(List list) throws RemoteException {
        int i;
        ArrayList arrayList;
        InitializationStatus zzB;
        zzeu zzeuVar = this.zza;
        synchronized (zzeuVar.zzw()) {
            zzeuVar.zzy(false);
            zzeuVar.zzz(true);
            arrayList = new ArrayList(zzeuVar.zzx());
            zzeuVar.zzx().clear();
        }
        zzB = zzeu.zzB(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((OnInitializationCompleteListener) arrayList.get(i)).onInitializationComplete(zzB);
        }
    }
}

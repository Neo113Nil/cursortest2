package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzblq;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes4.dex */
final class zzew extends zzblq {
    final /* synthetic */ zzex zza;

    /* synthetic */ zzew(zzex zzexVar, byte[] bArr) {
        Objects.requireNonNull(zzexVar);
        this.zza = zzexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final void zzb(List list) throws RemoteException {
        int i;
        ArrayList arrayList;
        InitializationStatus zzA;
        zzex zzexVar = this.zza;
        synchronized (zzexVar.zzv()) {
            zzexVar.zzx(false);
            zzexVar.zzy(true);
            arrayList = new ArrayList(zzexVar.zzw());
            zzexVar.zzw().clear();
        }
        zzA = zzex.zzA(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((OnInitializationCompleteListener) arrayList.get(i)).onInitializationComplete(zzA);
        }
    }
}

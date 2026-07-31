package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* loaded from: classes.dex */
final class zaw implements zabx {
    final /* synthetic */ zaz zaa;

    /* synthetic */ zaw(zaz zazVar, zay zayVar) {
        this.zaa = zazVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabx
    public final void zaa(@NonNull ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        lock = this.zaa.zam;
        lock.lock();
        try {
            this.zaa.zaj = connectionResult;
            zaz.zap(this.zaa);
        } finally {
            lock2 = this.zaa.zam;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabx
    public final void zab(@Nullable Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.zaa.zam;
        lock.lock();
        try {
            zaz.zao(this.zaa, bundle);
            this.zaa.zaj = ConnectionResult.RESULT_SUCCESS;
            zaz.zap(this.zaa);
        } finally {
            lock2 = this.zaa.zam;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabx
    public final void zac(int i, boolean z) {
        Lock lock;
        Lock lock2;
        boolean z2;
        Lock lock3;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        zabg zabgVar;
        lock = this.zaa.zam;
        lock.lock();
        try {
            zaz zazVar = this.zaa;
            z2 = zazVar.zal;
            if (!z2) {
                connectionResult = zazVar.zak;
                if (connectionResult != null) {
                    connectionResult2 = zazVar.zak;
                    if (connectionResult2.isSuccess()) {
                        this.zaa.zal = true;
                        zabgVar = this.zaa.zae;
                        zabgVar.onConnectionSuspended(i);
                        lock3 = this.zaa.zam;
                        lock3.unlock();
                    }
                }
            }
            this.zaa.zal = false;
            zaz.zan(this.zaa, i, z);
            lock3 = this.zaa.zam;
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = this.zaa.zam;
            lock2.unlock();
            throw th;
        }
    }
}

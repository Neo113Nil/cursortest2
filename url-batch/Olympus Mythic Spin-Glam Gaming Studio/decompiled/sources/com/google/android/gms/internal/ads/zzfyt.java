package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final class zzfyt implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    private final zzfzk zza;
    private final zzfze zzb;
    private final Object zzc = new Object();
    private boolean zzd = false;
    private boolean zze = false;

    zzfyt(@NonNull Context context, @NonNull Looper looper, @NonNull zzfze zzfzeVar) {
        this.zzb = zzfzeVar;
        this.zza = new zzfzk(context, looper, this, this, 12800000);
    }

    private final void zzb() {
        synchronized (this.zzc) {
            try {
                zzfzk zzfzkVar = this.zza;
                if (!zzfzkVar.isConnected()) {
                    if (zzfzkVar.isConnecting()) {
                    }
                    Binder.flushPendingCommands();
                }
                zzfzkVar.disconnect();
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        synchronized (this.zzc) {
            try {
                if (this.zze) {
                    return;
                }
                this.zze = true;
                try {
                    this.zza.zzp().zzf(new zzfzi(this.zzb.zzaN()));
                } catch (Exception unused) {
                } catch (Throwable th) {
                    zzb();
                    throw th;
                }
                zzb();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }

    final void zza() {
        synchronized (this.zzc) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    this.zza.checkAvailabilityAndConnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

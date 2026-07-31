package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzfos implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    private final zzfpj zza;
    private final zzfpd zzb;
    private final Object zzc = new Object();
    private boolean zzd = false;
    private boolean zze = false;

    zzfos(Context context, Looper looper, zzfpd zzfpdVar) {
        this.zzb = zzfpdVar;
        this.zza = new zzfpj(context, looper, this, this, 12800000);
    }

    private final void zzb() {
        synchronized (this.zzc) {
            zzfpj zzfpjVar = this.zza;
            if (zzfpjVar.isConnected() || zzfpjVar.isConnecting()) {
                zzfpjVar.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            this.zze = true;
            try {
                this.zza.zzp().zzf(new zzfph(this.zzb.zzaN()));
            } catch (Exception unused) {
            } catch (Throwable th) {
                zzb();
                throw th;
            }
            zzb();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }

    final void zza() {
        synchronized (this.zzc) {
            if (!this.zzd) {
                this.zzd = true;
                this.zza.checkAvailabilityAndConnect();
            }
        }
    }
}

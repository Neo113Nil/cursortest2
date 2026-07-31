package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@VisibleForTesting
/* loaded from: classes14.dex */
final class zzfyo implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    @VisibleForTesting
    protected final zzfzk zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;

    public zzfyo(Context context, String str, String str2) {
        this.zzb = str;
        this.zzc = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzfzk zzfzkVar = new zzfzk(context, handlerThread.getLooper(), this, this, 9200000);
        this.zza = zzfzkVar;
        this.zzd = new LinkedBlockingQueue();
        zzfzkVar.checkAvailabilityAndConnect();
    }

    @VisibleForTesting
    static zzaza zzc() {
        zzaya zzj = zzaza.zzj();
        zzj.zzl(32768L);
        return (zzaza) zzj.zzbu();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfzp zzd = zzd();
        if (zzd != null) {
            try {
                try {
                    this.zzd.put(zzd.zze(new zzfzl(this.zzb, this.zzc)).zza());
                } catch (Throwable unused) {
                    this.zzd.put(zzc());
                }
            } catch (InterruptedException unused2) {
            } catch (Throwable th) {
                zzb();
                this.zze.quit();
                throw th;
            }
            zzb();
            this.zze.quit();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.zzd.put(zzc());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            this.zzd.put(zzc());
        } catch (InterruptedException unused) {
        }
    }

    public final zzaza zza(int i) {
        zzaza zzazaVar;
        try {
            zzazaVar = (zzaza) this.zzd.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzazaVar = null;
        }
        return zzazaVar == null ? zzc() : zzazaVar;
    }

    public final void zzb() {
        zzfzk zzfzkVar = this.zza;
        if (zzfzkVar != null) {
            if (zzfzkVar.isConnected() || zzfzkVar.isConnecting()) {
                zzfzkVar.disconnect();
            }
        }
    }

    protected final zzfzp zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}

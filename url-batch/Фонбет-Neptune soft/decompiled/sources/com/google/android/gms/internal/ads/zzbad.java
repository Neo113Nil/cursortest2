package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbad {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzazz(this);
    private final Object zzc = new Object();
    private zzbag zzd;
    private Context zze;
    private zzbaj zzf;

    static /* bridge */ /* synthetic */ void zzh(zzbad zzbadVar) {
        synchronized (zzbadVar.zzc) {
            zzbag zzbagVar = zzbadVar.zzd;
            if (zzbagVar == null) {
                return;
            }
            if (zzbagVar.isConnected() || zzbadVar.zzd.isConnecting()) {
                zzbadVar.zzd.disconnect();
            }
            zzbadVar.zzd = null;
            zzbadVar.zzf = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl() {
        synchronized (this.zzc) {
            if (this.zze != null && this.zzd == null) {
                zzbag zzd = zzd(new zzbab(this), new zzbac(this));
                this.zzd = zzd;
                zzd.checkAvailabilityAndConnect();
            }
        }
    }

    public final long zza(zzbah zzbahVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return -2L;
            }
            if (this.zzd.zzp()) {
                try {
                    return this.zzf.zze(zzbahVar);
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to call into cache service.", e);
                }
            }
            return -2L;
        }
    }

    public final zzbae zzb(zzbah zzbahVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzbae();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzg(zzbahVar);
                }
                return this.zzf.zzf(zzbahVar);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to call into cache service.", e);
                return new zzbae();
            }
        }
    }

    protected final synchronized zzbag zzd(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzbag(this.zze, com.google.android.gms.ads.internal.zzu.zzt().zzb(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    public final void zzi(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            if (this.zze != null) {
                return;
            }
            this.zze = context.getApplicationContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdM)).booleanValue()) {
                zzl();
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdL)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzu.zzb().zzc(new zzbaa(this));
                }
            }
        }
    }

    public final void zzj() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdN)).booleanValue()) {
            synchronized (this.zzc) {
                zzl();
                ScheduledFuture scheduledFuture = this.zza;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.zza = zzbzo.zzd.schedule(this.zzb, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdO)).longValue(), TimeUnit.MILLISECONDS);
            }
        }
    }
}

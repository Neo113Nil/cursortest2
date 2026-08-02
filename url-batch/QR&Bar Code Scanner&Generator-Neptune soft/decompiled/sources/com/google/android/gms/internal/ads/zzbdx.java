package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbdx {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzbdt(this);
    private final Object zzc = new Object();
    private zzbea zzd;
    private Context zze;
    private zzbed zzf;

    static /* bridge */ /* synthetic */ void zzh(zzbdx zzbdxVar) {
        synchronized (zzbdxVar.zzc) {
            zzbea zzbeaVar = zzbdxVar.zzd;
            if (zzbeaVar == null) {
                return;
            }
            if (zzbeaVar.isConnected() || zzbdxVar.zzd.isConnecting()) {
                zzbdxVar.zzd.disconnect();
            }
            zzbdxVar.zzd = null;
            zzbdxVar.zzf = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl() {
        synchronized (this.zzc) {
            if (this.zze != null && this.zzd == null) {
                zzbea zzd = zzd(new zzbdv(this), new zzbdw(this));
                this.zzd = zzd;
                zzd.checkAvailabilityAndConnect();
            }
        }
    }

    public final long zza(zzbeb zzbebVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return -2L;
            }
            if (this.zzd.zzp()) {
                try {
                    return this.zzf.zze(zzbebVar);
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.zze.zzh("Unable to call into cache service.", e);
                }
            }
            return -2L;
        }
    }

    public final zzbdy zzb(zzbeb zzbebVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzbdy();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzg(zzbebVar);
                }
                return this.zzf.zzf(zzbebVar);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzh("Unable to call into cache service.", e);
                return new zzbdy();
            }
        }
    }

    protected final synchronized zzbea zzd(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzbea(this.zze, com.google.android.gms.ads.internal.zzt.zzt().zzb(), baseConnectionCallbacks, baseOnConnectionFailedListener);
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
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdp)).booleanValue()) {
                zzl();
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdo)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzb().zzc(new zzbdu(this));
                }
            }
        }
    }

    public final void zzj() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdq)).booleanValue()) {
            synchronized (this.zzc) {
                zzl();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzds)).booleanValue()) {
                    ScheduledFuture scheduledFuture = this.zza;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.zza = zzchc.zzd.schedule(this.zzb, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdr)).longValue(), TimeUnit.MILLISECONDS);
                } else {
                    com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(this.zzb);
                    com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(this.zzb, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdr)).longValue());
                }
            }
        }
    }
}

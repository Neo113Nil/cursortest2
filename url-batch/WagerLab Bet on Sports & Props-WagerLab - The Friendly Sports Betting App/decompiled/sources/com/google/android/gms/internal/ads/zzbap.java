package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzbap {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzbal(this);
    private final Object zzc = new Object();
    private zzbas zzd;
    private Context zze;
    private zzbav zzf;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final void zzf() {
        synchronized (this.zzc) {
            if (this.zze != null && this.zzd == null) {
                zzbas zze = zze(new zzban(this), new zzbao(this));
                this.zzd = zze;
                zze.checkAvailabilityAndConnect();
            }
        }
    }

    public final void zza(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            if (this.zze != null) {
                return;
            }
            this.zze = context.getApplicationContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeJ)).booleanValue()) {
                zzf();
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeI)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzbam(this));
                }
            }
        }
    }

    public final void zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeK)).booleanValue()) {
            synchronized (this.zzc) {
                zzf();
                ScheduledFuture scheduledFuture = this.zza;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.zza = zzbzh.zzd.schedule(this.zzb, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeL)).longValue(), TimeUnit.MILLISECONDS);
            }
        }
    }

    public final zzbaq zzc(zzbat zzbatVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzbaq();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzf(zzbatVar);
                }
                return this.zzf.zze(zzbatVar);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call into cache service.", e);
                return new zzbaq();
            }
        }
    }

    public final long zzd(zzbat zzbatVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return -2L;
            }
            if (this.zzd.zzp()) {
                try {
                    return this.zzf.zzg(zzbatVar);
                } catch (RemoteException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call into cache service.", e);
                }
            }
            return -2L;
        }
    }

    protected final synchronized zzbas zze(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzbas(this.zze, com.google.android.gms.ads.internal.zzt.zzs().zza(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    final /* synthetic */ void zzg() {
        synchronized (this.zzc) {
            zzbas zzbasVar = this.zzd;
            if (zzbasVar == null) {
                return;
            }
            if (zzbasVar.isConnected() || this.zzd.isConnecting()) {
                this.zzd.disconnect();
            }
            this.zzd = null;
            this.zzf = null;
            Binder.flushPendingCommands();
        }
    }

    final /* synthetic */ Object zzh() {
        return this.zzc;
    }

    final /* synthetic */ zzbas zzi() {
        return this.zzd;
    }

    final /* synthetic */ void zzj(zzbas zzbasVar) {
        this.zzd = null;
    }

    final /* synthetic */ void zzk(zzbav zzbavVar) {
        this.zzf = zzbavVar;
    }
}

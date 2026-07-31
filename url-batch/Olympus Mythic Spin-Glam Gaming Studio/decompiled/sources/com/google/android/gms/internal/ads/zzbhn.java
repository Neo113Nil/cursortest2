package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzbhn {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzbhj(this);
    private final Object zzc = new Object();

    @Nullable
    private zzbhq zzd;

    @Nullable
    private Context zze;

    @Nullable
    private zzbht zzf;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final void zzf() {
        synchronized (this.zzc) {
            try {
                if (this.zze != null && this.zzd == null) {
                    zzbhq zze = zze(new zzbhl(this), new zzbhm(this));
                    this.zzd = zze;
                    zze.checkAvailabilityAndConnect();
                }
            } finally {
            }
        }
    }

    public final void zza(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            try {
                if (this.zze != null) {
                    return;
                }
                this.zze = context.getApplicationContext();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfo)).booleanValue()) {
                    zzf();
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfn)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzbhk(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfp)).booleanValue()) {
            synchronized (this.zzc) {
                try {
                    zzf();
                    ScheduledFuture scheduledFuture = this.zza;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.zza = zzcgj.zzd.schedule(this.zzb, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfq)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final zzbho zzc(zzbhr zzbhrVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzbho();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzf(zzbhrVar);
                }
                return this.zzf.zze(zzbhrVar);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call into cache service.", e);
                return new zzbho();
            }
        }
    }

    public final long zzd(zzbhr zzbhrVar) {
        synchronized (this.zzc) {
            try {
                if (this.zzf == null) {
                    return -2L;
                }
                if (this.zzd.zzp()) {
                    try {
                        return this.zzf.zzg(zzbhrVar);
                    } catch (RemoteException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call into cache service.", e);
                    }
                }
                return -2L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    protected final synchronized zzbhq zze(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzbhq(this.zze, com.google.android.gms.ads.internal.zzt.zzs().zza(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    final /* synthetic */ void zzg() {
        synchronized (this.zzc) {
            try {
                zzbhq zzbhqVar = this.zzd;
                if (zzbhqVar == null) {
                    return;
                }
                if (zzbhqVar.isConnected() || this.zzd.isConnecting()) {
                    this.zzd.disconnect();
                }
                this.zzd = null;
                this.zzf = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ Object zzh() {
        return this.zzc;
    }

    final /* synthetic */ zzbhq zzi() {
        return this.zzd;
    }

    final /* synthetic */ void zzj(zzbhq zzbhqVar) {
        this.zzd = null;
    }

    final /* synthetic */ void zzk(zzbht zzbhtVar) {
        this.zzf = zzbhtVar;
    }
}

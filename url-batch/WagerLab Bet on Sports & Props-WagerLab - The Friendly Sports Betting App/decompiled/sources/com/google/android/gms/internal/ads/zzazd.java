package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes5.dex */
public final class zzazd {
    private final Object zza = new Object();
    private zzazb zzb = null;
    private boolean zzc = false;

    public final void zza(Context context) {
        synchronized (this.zza) {
            if (!this.zzc) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Can not cast Context to Application");
                } else {
                    if (this.zzb == null) {
                        this.zzb = new zzazb();
                    }
                    this.zzb.zza(application, context);
                    this.zzc = true;
                }
            }
        }
    }

    public final void zzb(zzazc zzazcVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new zzazb();
            }
            this.zzb.zzb(zzazcVar);
        }
    }

    public final Activity zzd() {
        synchronized (this.zza) {
            zzazb zzazbVar = this.zzb;
            if (zzazbVar == null) {
                return null;
            }
            return zzazbVar.zzd();
        }
    }

    public final Context zze() {
        synchronized (this.zza) {
            zzazb zzazbVar = this.zzb;
            if (zzazbVar == null) {
                return null;
            }
            return zzazbVar.zze();
        }
    }

    public final boolean zzf() {
        synchronized (this.zza) {
            zzazb zzazbVar = this.zzb;
            if (zzazbVar == null) {
                return false;
            }
            return zzazbVar.zzg().get();
        }
    }

    public final void zzg(zzdpu zzdpuVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new zzazb();
            }
            this.zzb.zzj(zzdpuVar);
        }
    }

    public final void zzc(zzazc zzazcVar) {
        synchronized (this.zza) {
            zzazb zzazbVar = this.zzb;
            if (zzazbVar == null) {
                return;
            }
            zzazbVar.zzc(zzazcVar);
        }
    }
}

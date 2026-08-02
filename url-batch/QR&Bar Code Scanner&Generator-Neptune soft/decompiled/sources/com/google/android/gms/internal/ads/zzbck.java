package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbck {
    private final Object zza = new Object();
    private zzbci zzb = null;
    private boolean zzc = false;

    public final Activity zza() {
        synchronized (this.zza) {
            zzbci zzbciVar = this.zzb;
            if (zzbciVar == null) {
                return null;
            }
            return zzbciVar.zza();
        }
    }

    public final Context zzb() {
        synchronized (this.zza) {
            zzbci zzbciVar = this.zzb;
            if (zzbciVar == null) {
                return null;
            }
            return zzbciVar.zzb();
        }
    }

    public final void zzc(zzbcj zzbcjVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new zzbci();
            }
            this.zzb.zzf(zzbcjVar);
        }
    }

    public final void zzd(Context context) {
        synchronized (this.zza) {
            if (!this.zzc) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    com.google.android.gms.ads.internal.util.zze.zzj("Can not cast Context to Application");
                    return;
                }
                if (this.zzb == null) {
                    this.zzb = new zzbci();
                }
                this.zzb.zzg(application, context);
                this.zzc = true;
            }
        }
    }

    public final void zze(zzbcj zzbcjVar) {
        synchronized (this.zza) {
            zzbci zzbciVar = this.zzb;
            if (zzbciVar == null) {
                return;
            }
            zzbciVar.zzh(zzbcjVar);
        }
    }
}

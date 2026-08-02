package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeda extends zzecu {
    private String zzg;
    private int zzh = 1;

    zzeda(Context context) {
        this.zzf = new zzcan(context, com.google.android.gms.ads.internal.zzt.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.zzecu, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        com.google.android.gms.ads.internal.util.zze.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zze(new zzedj(1));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    try {
                        int i = this.zzh;
                        if (i == 2) {
                            this.zzf.zzp().zze(this.zze, new zzect(this));
                        } else if (i == 3) {
                            this.zzf.zzp().zzh(this.zzg, new zzect(this));
                        } else {
                            this.zza.zze(new zzedj(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zze(new zzedj(1));
                    }
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    this.zza.zze(new zzedj(1));
                }
            }
        }
    }

    public final zzfzp zzb(zzcbc zzcbcVar) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 2) {
                return zzfzg.zzh(new zzedj(2));
            }
            if (this.zzc) {
                return this.zza;
            }
            this.zzh = 2;
            this.zzc = true;
            this.zze = zzcbcVar;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecz
                @Override // java.lang.Runnable
                public final void run() {
                    zzeda.this.zza();
                }
            }, zzchc.zzf);
            return this.zza;
        }
    }

    public final zzfzp zzc(String str) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 3) {
                return zzfzg.zzh(new zzedj(2));
            }
            if (this.zzc) {
                return this.zza;
            }
            this.zzh = 3;
            this.zzc = true;
            this.zzg = str;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecy
                @Override // java.lang.Runnable
                public final void run() {
                    zzeda.this.zza();
                }
            }, zzchc.zzf);
            return this.zza;
        }
    }
}

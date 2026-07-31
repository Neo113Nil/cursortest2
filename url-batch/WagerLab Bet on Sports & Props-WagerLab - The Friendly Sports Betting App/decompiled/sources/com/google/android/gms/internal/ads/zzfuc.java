package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfuc {
    private final zzfvx zza;
    private final zzfwv zzb;
    private final zzgcx zzc;
    private final zzgea zzd;
    private final long zze;
    private final zzhpr zzf;
    private final long zzg;
    private final long zzh = System.currentTimeMillis();
    private final boolean zzi;
    private final long zzj;

    zzfuc(zzfvx zzfvxVar, zzfwv zzfwvVar, zzgcx zzgcxVar, zzgea zzgeaVar, zzhpr zzhprVar, zzfui zzfuiVar) {
        this.zza = zzfvxVar;
        this.zzb = zzfwvVar;
        this.zzc = zzgcxVar;
        this.zzd = zzgeaVar;
        this.zze = zzfuiVar.zzh();
        this.zzf = zzhprVar;
        this.zzg = zzfuiVar.zzg();
        this.zzi = zzfuiVar.zzq();
        this.zzj = zzfuiVar.zzp();
    }

    public final ListenableFuture zza() {
        return this.zza.zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String zzb(Context context) {
        String zza;
        boolean z = false;
        if (this.zzi) {
            if (System.currentTimeMillis() - this.zzh <= this.zzj) {
                z = true;
            }
        }
        zzgdy zza2 = this.zzd.zza(3);
        try {
            try {
                try {
                    zza2.zza();
                    zza = (String) zzgot.zzj(this.zza.zzb(), new zzftz(this, context), zzgpk.zza()).get(z ? this.zzg : this.zze, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    zza2.zzb(e);
                    zza = "";
                } catch (ExecutionException e2) {
                    e = e2;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    zza2.zzb(e);
                    zza = Integer.toString(3);
                }
            } catch (TimeoutException e3) {
                zza2.zzb(e3);
                zza = z ? ((zzfzx) this.zzf.zzb()).zza(true, this.zzh) : Integer.toString(17);
            } catch (Throwable th) {
                zza2.zzb(th);
                throw th;
            }
            zza2.zzc();
            return zza;
        } catch (Throwable th2) {
            zza2.zzc();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String zzc(Context context, String str, View view, Activity activity) {
        String num;
        zzgdy zza = this.zzd.zza(4);
        try {
            try {
                zza.zza();
            } finally {
                zza.zzc();
            }
        } catch (InterruptedException e) {
            e = e;
        } catch (ExecutionException e2) {
            e = e2;
        } catch (TimeoutException e3) {
            e = e3;
        } catch (Throwable th) {
            th = th;
        }
        try {
            num = (String) zzgot.zzj(this.zza.zzb(), new zzfua(this, context, null, view, activity), zzgpk.zza()).get(this.zze, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e4) {
            e = e4;
            Thread.currentThread().interrupt();
            zza.zzb(e);
            num = "";
            return num;
        } catch (ExecutionException e5) {
            e = e5;
            ExecutionException executionException = e;
            Throwable cause = executionException.getCause();
            if (cause != null) {
                executionException = cause;
            }
            zza.zzb(executionException);
            num = Integer.toString(3);
            return num;
        } catch (TimeoutException e6) {
            e = e6;
            zza.zzb(e);
            num = Integer.toString(17);
            return num;
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            zza.zzb(th3);
            throw th3;
        }
        return num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String zzd(Context context, String str, View view, Activity activity) {
        String num;
        zzgdy zza = this.zzd.zza(5);
        try {
            try {
                zza.zza();
            } finally {
                zza.zzc();
            }
        } catch (InterruptedException e) {
            e = e;
        } catch (ExecutionException e2) {
            e = e2;
        } catch (TimeoutException e3) {
            e = e3;
        } catch (Throwable th) {
            th = th;
        }
        try {
            num = (String) zzgot.zzj(this.zza.zzb(), new zzfub(this, context, str, view, null), zzgpk.zza()).get(this.zze, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e4) {
            e = e4;
            Thread.currentThread().interrupt();
            zza.zzb(e);
            num = "";
            return num;
        } catch (ExecutionException e5) {
            e = e5;
            ExecutionException executionException = e;
            Throwable cause = executionException.getCause();
            if (cause != null) {
                executionException = cause;
            }
            zza.zzb(executionException);
            num = Integer.toString(3);
            return num;
        } catch (TimeoutException e6) {
            e = e6;
            zza.zzb(e);
            num = Integer.toString(17);
            return num;
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            zza.zzb(th3);
            throw th3;
        }
        return num;
    }

    public final void zze(List list) {
        this.zzc.zza(list);
    }

    public final void zzf(InputEvent inputEvent) {
        this.zzb.zze(inputEvent);
    }

    final /* synthetic */ zzfwv zzg() {
        return this.zzb;
    }

    public final int zzh() {
        return this.zzb.zzh();
    }
}

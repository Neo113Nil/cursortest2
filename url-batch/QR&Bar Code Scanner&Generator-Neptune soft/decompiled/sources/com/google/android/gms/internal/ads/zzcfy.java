package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzcfy {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.util.zzj zzb;
    private final zzcgc zzc;
    private boolean zzd;
    private Context zze;
    private zzcgv zzf;
    private zzbjh zzg;
    private Boolean zzh;
    private final AtomicInteger zzi;
    private final zzcfx zzj;
    private final Object zzk;
    private zzfzp zzl;
    private final AtomicBoolean zzm;

    public zzcfy() {
        com.google.android.gms.ads.internal.util.zzj zzjVar = new com.google.android.gms.ads.internal.util.zzj();
        this.zzb = zzjVar;
        this.zzc = new zzcgc(com.google.android.gms.ads.internal.client.zzaw.zzd(), zzjVar);
        this.zzd = false;
        this.zzg = null;
        this.zzh = null;
        this.zzi = new AtomicInteger(0);
        this.zzj = new zzcfx(null);
        this.zzk = new Object();
        this.zzm = new AtomicBoolean();
    }

    public final int zza() {
        return this.zzi.get();
    }

    public final Context zzc() {
        return this.zze;
    }

    public final Resources zzd() {
        if (this.zzf.zzd) {
            return this.zze.getResources();
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zziy)).booleanValue()) {
                return zzcgt.zza(this.zze).getResources();
            }
            zzcgt.zza(this.zze).getResources();
            return null;
        } catch (zzcgs e) {
            com.google.android.gms.ads.internal.util.zze.zzk("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final zzbjh zzf() {
        zzbjh zzbjhVar;
        synchronized (this.zza) {
            zzbjhVar = this.zzg;
        }
        return zzbjhVar;
    }

    public final zzcgc zzg() {
        return this.zzc;
    }

    public final com.google.android.gms.ads.internal.util.zzg zzh() {
        com.google.android.gms.ads.internal.util.zzj zzjVar;
        synchronized (this.zza) {
            zzjVar = this.zzb;
        }
        return zzjVar;
    }

    public final zzfzp zzj() {
        if (this.zze != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcl)).booleanValue()) {
                synchronized (this.zzk) {
                    zzfzp zzfzpVar = this.zzl;
                    if (zzfzpVar != null) {
                        return zzfzpVar;
                    }
                    zzfzp zzb = zzchc.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcft
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return zzcfy.this.zzm();
                        }
                    });
                    this.zzl = zzb;
                    return zzb;
                }
            }
        }
        return zzfzg.zzi(new ArrayList());
    }

    public final Boolean zzk() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzh;
        }
        return bool;
    }

    final /* synthetic */ ArrayList zzm() throws Exception {
        Context zza = zzcbq.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(zza).getPackageInfo(zza.getApplicationInfo().packageName, 4096);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                for (int i = 0; i < packageInfo.requestedPermissions.length; i++) {
                    if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(packageInfo.requestedPermissions[i]);
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final void zzo() {
        this.zzj.zza();
    }

    public final void zzp() {
        this.zzi.decrementAndGet();
    }

    public final void zzq() {
        this.zzi.incrementAndGet();
    }

    public final void zzr(Context context, zzcgv zzcgvVar) {
        zzbjh zzbjhVar;
        synchronized (this.zza) {
            if (!this.zzd) {
                this.zze = context.getApplicationContext();
                this.zzf = zzcgvVar;
                com.google.android.gms.ads.internal.zzt.zzb().zzc(this.zzc);
                this.zzb.zzr(this.zze);
                zzcaf.zzb(this.zze, this.zzf);
                com.google.android.gms.ads.internal.zzt.zze();
                if (((Boolean) zzbkm.zzc.zze()).booleanValue()) {
                    zzbjhVar = new zzbjh();
                } else {
                    com.google.android.gms.ads.internal.util.zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    zzbjhVar = null;
                }
                this.zzg = zzbjhVar;
                if (zzbjhVar != null) {
                    zzchf.zza(new zzcfu(this).zzb(), "AppState.registerCsiReporter");
                }
                if (PlatformVersion.isAtLeastO()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhl)).booleanValue()) {
                        ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzcfv(this));
                    }
                }
                this.zzd = true;
                zzj();
            }
        }
        com.google.android.gms.ads.internal.zzt.zzp().zzc(context, zzcgvVar.zza);
    }

    public final void zzs(Throwable th, String str) {
        zzcaf.zzb(this.zze, this.zzf).zze(th, str, ((Double) zzbla.zzg.zze()).floatValue());
    }

    public final void zzt(Throwable th, String str) {
        zzcaf.zzb(this.zze, this.zzf).zzd(th, str);
    }

    public final void zzu(Boolean bool) {
        synchronized (this.zza) {
            this.zzh = bool;
        }
    }

    public final boolean zzv(Context context) {
        if (PlatformVersion.isAtLeastO()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhl)).booleanValue()) {
                return this.zzm.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}

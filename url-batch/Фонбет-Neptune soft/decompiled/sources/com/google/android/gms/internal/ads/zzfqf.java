package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.facebook.ads.AdError;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfqf {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfqg zzc;
    private final zzfoh zzd;
    private final zzfoc zze;
    private zzfpu zzf;
    private final Object zzg = new Object();

    public zzfqf(Context context, zzfqg zzfqgVar, zzfoh zzfohVar, zzfoc zzfocVar) {
        this.zzb = context;
        this.zzc = zzfqgVar;
        this.zzd = zzfohVar;
        this.zze = zzfocVar;
    }

    private final synchronized Class zzd(zzfpv zzfpvVar) throws zzfqe {
        String zzk = zzfpvVar.zza().zzk();
        HashMap hashMap = zza;
        Class cls = (Class) hashMap.get(zzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.zze.zza(zzfpvVar.zzc())) {
                throw new zzfqe(2026, "VM did not pass signature verification");
            }
            try {
                File zzb = zzfpvVar.zzb();
                if (!zzb.exists()) {
                    zzb.mkdirs();
                }
                Class loadClass = new DexClassLoader(zzfpvVar.zzc().getAbsolutePath(), zzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                hashMap.put(zzk, loadClass);
                return loadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                throw new zzfqe(AdError.REMOTE_ADS_SERVICE_ERROR, e);
            }
        } catch (GeneralSecurityException e2) {
            throw new zzfqe(2026, e2);
        }
    }

    public final zzfok zza() {
        zzfpu zzfpuVar;
        synchronized (this.zzg) {
            zzfpuVar = this.zzf;
        }
        return zzfpuVar;
    }

    public final zzfpv zzb() {
        synchronized (this.zzg) {
            zzfpu zzfpuVar = this.zzf;
            if (zzfpuVar == null) {
                return null;
            }
            return zzfpuVar.zzf();
        }
    }

    public final boolean zzc(zzfpv zzfpvVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfpu zzfpuVar = new zzfpu(zzd(zzfpvVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfpvVar.zze(), null, new Bundle(), 2), zzfpvVar, this.zzc, this.zzd);
                if (!zzfpuVar.zzh()) {
                    throw new zzfqe(4000, "init failed");
                }
                int zze = zzfpuVar.zze();
                if (zze != 0) {
                    throw new zzfqe(4001, "ci: " + zze);
                }
                synchronized (this.zzg) {
                    zzfpu zzfpuVar2 = this.zzf;
                    if (zzfpuVar2 != null) {
                        try {
                            zzfpuVar2.zzg();
                        } catch (zzfqe e) {
                            this.zzd.zzc(e.zza(), -1L, e);
                        }
                    }
                    this.zzf = zzfpuVar;
                }
                this.zzd.zzd(PathInterpolatorCompat.MAX_NUM_POINTS, System.currentTimeMillis() - currentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new zzfqe(AdError.INTERNAL_ERROR_2004, e2);
            }
        } catch (zzfqe e3) {
            this.zzd.zzc(e3.zza(), System.currentTimeMillis() - currentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        }
    }
}

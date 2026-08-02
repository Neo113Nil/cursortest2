package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfov {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfow zzc;
    private final zzfmx zzd;
    private final zzfms zze;
    private zzfok zzf;
    private final Object zzg = new Object();

    public zzfov(Context context, zzfow zzfowVar, zzfmx zzfmxVar, zzfms zzfmsVar) {
        this.zzb = context;
        this.zzc = zzfowVar;
        this.zzd = zzfmxVar;
        this.zze = zzfmsVar;
    }

    private final synchronized Class zzd(zzfol zzfolVar) throws zzfou {
        String zzk = zzfolVar.zza().zzk();
        HashMap hashMap = zza;
        Class cls = (Class) hashMap.get(zzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.zze.zza(zzfolVar.zzc())) {
                throw new zzfou(2026, "VM did not pass signature verification");
            }
            try {
                File zzb = zzfolVar.zzb();
                if (!zzb.exists()) {
                    zzb.mkdirs();
                }
                Class loadClass = new DexClassLoader(zzfolVar.zzc().getAbsolutePath(), zzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                hashMap.put(zzk, loadClass);
                return loadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                throw new zzfou(2008, e);
            }
        } catch (GeneralSecurityException e2) {
            throw new zzfou(2026, e2);
        }
    }

    public final zzfna zza() {
        zzfok zzfokVar;
        synchronized (this.zzg) {
            zzfokVar = this.zzf;
        }
        return zzfokVar;
    }

    public final zzfol zzb() {
        synchronized (this.zzg) {
            zzfok zzfokVar = this.zzf;
            if (zzfokVar == null) {
                return null;
            }
            return zzfokVar.zzf();
        }
    }

    public final boolean zzc(zzfol zzfolVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfok zzfokVar = new zzfok(zzd(zzfolVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfolVar.zze(), null, new Bundle(), 2), zzfolVar, this.zzc, this.zzd);
                if (!zzfokVar.zzh()) {
                    throw new zzfou(4000, "init failed");
                }
                int zze = zzfokVar.zze();
                if (zze != 0) {
                    throw new zzfou(4001, "ci: " + zze);
                }
                synchronized (this.zzg) {
                    zzfok zzfokVar2 = this.zzf;
                    if (zzfokVar2 != null) {
                        try {
                            zzfokVar2.zzg();
                        } catch (zzfou e) {
                            this.zzd.zzc(e.zza(), -1L, e);
                        }
                    }
                    this.zzf = zzfokVar;
                }
                this.zzd.zzd(PathInterpolatorCompat.MAX_NUM_POINTS, System.currentTimeMillis() - currentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new zzfou(2004, e2);
            }
        } catch (zzfou e3) {
            this.zzd.zzc(e3.zza(), System.currentTimeMillis() - currentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfmq {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfmr zzc;
    private final zzfks zzd;
    private final zzfkn zze;
    private zzfmf zzf;
    private final Object zzg = new Object();

    public zzfmq(Context context, zzfmr zzfmrVar, zzfks zzfksVar, zzfkn zzfknVar) {
        this.zzb = context;
        this.zzc = zzfmrVar;
        this.zzd = zzfksVar;
        this.zze = zzfknVar;
    }

    private final synchronized Class zzd(zzfmg zzfmgVar) throws zzfmp {
        String zzk = zzfmgVar.zza().zzk();
        HashMap hashMap = zza;
        Class cls = (Class) hashMap.get(zzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.zze.zza(zzfmgVar.zzc())) {
                throw new zzfmp(2026, "VM did not pass signature verification");
            }
            try {
                File zzb = zzfmgVar.zzb();
                if (!zzb.exists()) {
                    zzb.mkdirs();
                }
                Class loadClass = new DexClassLoader(zzfmgVar.zzc().getAbsolutePath(), zzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                hashMap.put(zzk, loadClass);
                return loadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                throw new zzfmp(2008, e);
            }
        } catch (GeneralSecurityException e2) {
            throw new zzfmp(2026, e2);
        }
    }

    public final zzfkv zza() {
        zzfmf zzfmfVar;
        synchronized (this.zzg) {
            zzfmfVar = this.zzf;
        }
        return zzfmfVar;
    }

    public final zzfmg zzb() {
        synchronized (this.zzg) {
            zzfmf zzfmfVar = this.zzf;
            if (zzfmfVar == null) {
                return null;
            }
            return zzfmfVar.zzf();
        }
    }

    public final boolean zzc(zzfmg zzfmgVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfmf zzfmfVar = new zzfmf(zzd(zzfmgVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfmgVar.zze(), null, new Bundle(), 2), zzfmgVar, this.zzc, this.zzd);
                if (!zzfmfVar.zzh()) {
                    throw new zzfmp(4000, "init failed");
                }
                int zze = zzfmfVar.zze();
                if (zze != 0) {
                    throw new zzfmp(4001, "ci: " + zze);
                }
                synchronized (this.zzg) {
                    zzfmf zzfmfVar2 = this.zzf;
                    if (zzfmfVar2 != null) {
                        try {
                            zzfmfVar2.zzg();
                        } catch (zzfmp e) {
                            this.zzd.zzc(e.zza(), -1L, e);
                        }
                    }
                    this.zzf = zzfmfVar;
                }
                this.zzd.zzd(PathInterpolatorCompat.MAX_NUM_POINTS, System.currentTimeMillis() - currentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new zzfmp(2004, e2);
            }
        } catch (zzfmp e3) {
            this.zzd.zzc(e3.zza(), System.currentTimeMillis() - currentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        }
    }
}

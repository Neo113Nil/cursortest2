package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.media3.common.PlaybackException;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfqa {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfqb zzc;
    private final zzfoh zzd;
    private final zzfoc zze;
    private final boolean zzf;
    private zzfpp zzg;
    private final Object zzh = new Object();

    public zzfqa(Context context, zzfqb zzfqbVar, zzfoh zzfohVar, zzfoc zzfocVar, boolean z) {
        this.zzb = context;
        this.zzc = zzfqbVar;
        this.zzd = zzfohVar;
        this.zze = zzfocVar;
        this.zzf = z;
    }

    private final synchronized Class zzd(zzfpq zzfpqVar) throws zzfpz {
        if (zzfpqVar.zza() == null) {
            throw new zzfpz(4010, "mc");
        }
        String zza2 = zzfpqVar.zza().zza();
        HashMap hashMap = zza;
        Class cls = (Class) hashMap.get(zza2);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.zze.zza(zzfpqVar.zzb())) {
                throw new zzfpz(2026, "VM did not pass signature verification");
            }
            try {
                File zzc = zzfpqVar.zzc();
                if (!zzc.exists()) {
                    zzc.mkdirs();
                }
                Class loadClass = new DexClassLoader(zzfpqVar.zzb().getAbsolutePath(), zzc.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                hashMap.put(zza2, loadClass);
                return loadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                throw new zzfpz(2008, e);
            }
        } catch (GeneralSecurityException e2) {
            throw new zzfpz(2026, e2);
        }
    }

    public final boolean zza(zzfpq zzfpqVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfpp zzfppVar = new zzfpp(zzd(zzfpqVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfpqVar.zzd(), null, new Bundle(), 2), zzfpqVar, this.zzc, this.zzd, this.zzf);
                if (!zzfppVar.zzf()) {
                    throw new zzfpz(4000, "init failed");
                }
                int zzh = zzfppVar.zzh();
                if (zzh != 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(zzh).length() + 4);
                    sb.append("ci: ");
                    sb.append(zzh);
                    throw new zzfpz(PlaybackException.ERROR_CODE_DECODER_INIT_FAILED, sb.toString());
                }
                synchronized (this.zzh) {
                    zzfpp zzfppVar2 = this.zzg;
                    if (zzfppVar2 != null) {
                        try {
                            zzfppVar2.zzg();
                        } catch (zzfpz e) {
                            this.zzd.zzc(e.zza(), -1L, e);
                        }
                    }
                    this.zzg = zzfppVar;
                }
                this.zzd.zzb(3000, System.currentTimeMillis() - currentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new zzfpz(PlaybackException.ERROR_CODE_IO_BAD_HTTP_STATUS, e2);
            }
        } catch (zzfpz e3) {
            this.zzd.zzc(e3.zza(), System.currentTimeMillis() - currentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        }
    }

    public final zzfok zzb() {
        zzfpp zzfppVar;
        synchronized (this.zzh) {
            zzfppVar = this.zzg;
        }
        return zzfppVar;
    }

    public final zzfpq zzc() {
        synchronized (this.zzh) {
            zzfpp zzfppVar = this.zzg;
            if (zzfppVar == null) {
                return null;
            }
            return zzfppVar.zze();
        }
    }
}

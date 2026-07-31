package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzfzz {
    private static final Object zzf = new Object();
    private final Context zza;
    private final SharedPreferences zzb;
    private final String zzc;
    private final zzfzg zzd;
    private boolean zze;

    public zzfzz(@NonNull Context context, @NonNull zzbei zzbeiVar, @NonNull zzfzg zzfzgVar, boolean z) {
        this.zze = false;
        this.zza = context;
        this.zzc = Integer.toString(zzbeiVar.zza());
        this.zzb = context.getSharedPreferences("pcvmspf", 0);
        this.zzd = zzfzgVar;
        this.zze = z;
    }

    private final File zze(@NonNull String str) {
        return new File(new File(this.zza.getDir("pccache", 0), this.zzc), str);
    }

    private final String zzf() {
        return "FBAMTD".concat(String.valueOf(this.zzc));
    }

    private final String zzg() {
        return "LATMTD".concat(String.valueOf(this.zzc));
    }

    private static String zzh(@NonNull zzbek zzbekVar) {
        zzbeq zzi = zzber.zzi();
        zzi.zza(zzbekVar.zza().zza());
        zzi.zzb(zzbekVar.zza().zzb());
        zzi.zzd(zzbekVar.zza().zzd());
        zzi.zze(zzbekVar.zza().zze());
        zzi.zzc(zzbekVar.zza().zzc());
        return Hex.bytesToStringLowercase(((zzber) zzi.zzbu()).zzaN());
    }

    private final void zzi(int i, long j) {
        this.zzd.zza(i, j);
    }

    private final void zzj(int i, long j, String str) {
        this.zzd.zzb(i, j, str);
    }

    @Nullable
    private final zzber zzk(int i) {
        String string = i == 1 ? this.zzb.getString(zzg(), null) : this.zzb.getString(zzf(), null);
        if (string == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byte[] stringToBytes = Hex.stringToBytes(string);
            zziei zzieiVar = zziei.zza;
            return zzber.zzh(zziei.zzt(stringToBytes, 0, stringToBytes.length), this.zze ? zziew.zzb() : zziew.zzc());
        } catch (zzige unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, currentTimeMillis);
            return null;
        }
    }

    public final boolean zza(@NonNull zzbek zzbekVar, @Nullable zzfzy zzfzyVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            try {
                zzber zzk = zzk(1);
                String zza = zzbekVar.zza().zza();
                if (zzk != null && zzk.zza().equals(zza)) {
                    zzi(4014, currentTimeMillis);
                    return false;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                File zze = zze(zza);
                if (zze.exists()) {
                    String str = true != zze.isDirectory() ? "0" : "1";
                    String str2 = true != zze.isFile() ? "0" : "1";
                    StringBuilder sb = new StringBuilder(7);
                    sb.append("d:");
                    sb.append(str);
                    sb.append(",f:");
                    sb.append(str2);
                    zzj(4023, currentTimeMillis2, sb.toString());
                    zzi(4015, currentTimeMillis2);
                } else if (!zze.mkdirs()) {
                    zzj(4024, currentTimeMillis2, "cw:".concat(true != zze.canWrite() ? "0" : "1"));
                    zzi(4015, currentTimeMillis2);
                    return false;
                }
                File zze2 = zze(zza);
                File file = new File(zze2, "pcam.jar");
                File file2 = new File(zze2, "pcbc");
                if (!zzfzt.zzb(file, zzbekVar.zzb().zzA())) {
                    zzi(4016, currentTimeMillis);
                    return false;
                }
                if (!zzfzt.zzb(file2, zzbekVar.zzc().zzA())) {
                    zzi(4017, currentTimeMillis);
                    return false;
                }
                if (zzfzyVar != null && !zzfzyVar.zza(file)) {
                    zzi(4018, currentTimeMillis);
                    zzfzt.zze(zze2);
                    return false;
                }
                String zzh = zzh(zzbekVar);
                long currentTimeMillis3 = System.currentTimeMillis();
                SharedPreferences sharedPreferences = this.zzb;
                String string = sharedPreferences.getString(zzg(), null);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(zzg(), zzh);
                if (string != null) {
                    edit.putString(zzf(), string);
                }
                if (!edit.commit()) {
                    zzi(4019, currentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                zzber zzk2 = zzk(1);
                if (zzk2 != null) {
                    hashSet.add(zzk2.zza());
                }
                zzber zzk3 = zzk(2);
                if (zzk3 != null) {
                    hashSet.add(zzk3.zza());
                }
                for (File file3 : new File(this.zza.getDir("pccache", 0), this.zzc).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        zzfzt.zze(file3);
                    }
                }
                zzi(5014, currentTimeMillis);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzb(@NonNull zzbek zzbekVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            try {
                if (!zzfzt.zzb(new File(zze(zzbekVar.zza().zza()), "pcbc"), zzbekVar.zzc().zzA())) {
                    zzi(4020, currentTimeMillis);
                    return false;
                }
                String zzh = zzh(zzbekVar);
                SharedPreferences.Editor edit = this.zzb.edit();
                edit.putString(zzg(), zzh);
                boolean commit = edit.commit();
                if (commit) {
                    zzi(5015, currentTimeMillis);
                } else {
                    zzi(4021, currentTimeMillis);
                }
                return commit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public final zzfzr zzc(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            try {
                zzber zzk = zzk(1);
                if (zzk == null) {
                    zzi(4022, currentTimeMillis);
                    return null;
                }
                File zze = zze(zzk.zza());
                File file = new File(zze, "pcam.jar");
                if (!file.exists()) {
                    file = new File(zze, "pcam");
                }
                File file2 = new File(zze, "pcbc");
                File file3 = new File(zze, "pcopt");
                zzi(5016, currentTimeMillis);
                return new zzfzr(zzk, file, file2, file3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzd(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            try {
                zzber zzk = zzk(1);
                if (zzk == null) {
                    zzi(4025, currentTimeMillis);
                    return false;
                }
                File zze = zze(zzk.zza());
                if (!new File(zze, "pcam.jar").exists()) {
                    zzi(4026, currentTimeMillis);
                    return false;
                }
                if (new File(zze, "pcbc").exists()) {
                    zzi(5019, currentTimeMillis);
                    return true;
                }
                zzi(4027, currentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

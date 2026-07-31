package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfpr {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final zzaxq zzd;

    public zzfpr(Context context, zzaxq zzaxqVar) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfps.zzd(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfps.zzd(dir2, true);
        this.zza = dir2;
        this.zzd = zzaxqVar;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd.zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        int zza = this.zzd.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 6);
        sb.append("FBAMTD");
        sb.append(zza);
        return sb.toString();
    }

    private final String zzf() {
        int zza = this.zzd.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 6);
        sb.append("LATMTD");
        sb.append(zza);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(zzaxs zzaxsVar, zzfpx zzfpxVar) {
        boolean z;
        zzaxw zzc;
        zzaxw zzc2;
        String zza = zzaxsVar.zza().zza();
        byte[] zzv = zzaxsVar.zzb().zzv();
        byte[] zzv2 = zzaxsVar.zzc().zzv();
        if (!TextUtils.isEmpty(zza) && zzv2 != null && zzv2.length != 0) {
            File file = this.zza;
            zzfps.zze(file);
            file.mkdirs();
            zzfps.zzc(zza, file).mkdirs();
            File zza2 = zzfps.zza(zza, "pcam.jar", file);
            if ((zzv == null || zzv.length <= 0 || zzfps.zzb(zza2, zzv)) && zzfps.zzb(zzfps.zza(zza, "pcbc", file), zzv2)) {
                File zza3 = zzfps.zza(zzaxsVar.zza().zza(), "pcam.jar", file);
                if (zza3.exists() && zzfpxVar != null && !zzfpxVar.zza(zza3)) {
                    return false;
                }
                String zza4 = zzaxsVar.zza().zza();
                if (!TextUtils.isEmpty(zza4)) {
                    File zza5 = zzfps.zza(zza4, "pcam.jar", file);
                    File zza6 = zzfps.zza(zza4, "pcbc", file);
                    File zza7 = zzfps.zza(zza4, "pcam.jar", zzd());
                    File zza8 = zzfps.zza(zza4, "pcbc", zzd());
                    if ((!zza5.exists() || zza5.renameTo(zza7)) && zza6.exists() && zza6.renameTo(zza8)) {
                        zzaxv zzi = zzaxw.zzi();
                        zzi.zza(zzaxsVar.zza().zza());
                        zzi.zzb(zzaxsVar.zza().zzb());
                        zzi.zzd(zzaxsVar.zza().zzd());
                        zzi.zze(zzaxsVar.zza().zze());
                        zzi.zzc(zzaxsVar.zza().zzc());
                        zzaxw zzaxwVar = (zzaxw) zzi.zzbu();
                        zzaxw zzc3 = zzc(1);
                        SharedPreferences.Editor edit = this.zzc.edit();
                        if (zzc3 != null && !zzaxwVar.zza().equals(zzc3.zza())) {
                            edit.putString(zze(), Hex.bytesToStringLowercase(zzc3.zzaN()));
                        }
                        edit.putString(zzf(), Hex.bytesToStringLowercase(zzaxwVar.zzaN()));
                        if (edit.commit()) {
                            z = true;
                            HashSet hashSet = new HashSet();
                            zzc = zzc(1);
                            if (zzc != null) {
                                hashSet.add(zzc.zza());
                            }
                            zzc2 = zzc(2);
                            if (zzc2 != null) {
                                hashSet.add(zzc2.zza());
                            }
                            for (File file2 : zzd().listFiles()) {
                                String name = file2.getName();
                                if (!hashSet.contains(name)) {
                                    zzfps.zze(zzfps.zzc(name, zzd()));
                                }
                            }
                            return z;
                        }
                    }
                }
                z = false;
                HashSet hashSet2 = new HashSet();
                zzc = zzc(1);
                if (zzc != null) {
                }
                zzc2 = zzc(2);
                if (zzc2 != null) {
                }
                while (r4 < r1) {
                }
                return z;
            }
        }
        return false;
    }

    public final zzfpq zzb(int i) {
        zzaxw zzc = zzc(1);
        if (zzc == null) {
            return null;
        }
        String zza = zzc.zza();
        File zza2 = zzfps.zza(zza, "pcam.jar", zzd());
        if (!zza2.exists()) {
            zza2 = zzfps.zza(zza, "pcam", zzd());
        }
        return new zzfpq(zzc, zza2, zzfps.zza(zza, "pcbc", zzd()), zzfps.zza(zza, "pcopt", zzd()));
    }

    final zzaxw zzc(int i) {
        String string = i == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] stringToBytes = Hex.stringToBytes(string);
            zzhhb zzhhbVar = zzhhb.zzb;
            zzaxw zzg = zzaxw.zzg(zzhhb.zzr(stringToBytes, 0, stringToBytes.length));
            String zza = zzg.zza();
            File zza2 = zzfps.zza(zza, "pcam.jar", zzd());
            if (!zza2.exists()) {
                zza2 = zzfps.zza(zza, "pcam", zzd());
            }
            File zza3 = zzfps.zza(zza, "pcbc", zzd());
            if (zza2.exists()) {
                if (zza3.exists()) {
                    return zzg;
                }
            }
        } catch (zzhiw unused) {
        }
        return null;
    }
}

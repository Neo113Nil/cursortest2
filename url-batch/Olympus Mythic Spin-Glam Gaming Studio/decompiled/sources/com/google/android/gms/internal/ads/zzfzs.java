package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzfzs {

    @VisibleForTesting
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final zzbei zzd;

    public zzfzs(@NonNull Context context, zzbei zzbeiVar) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfzt.zzd(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfzt.zzd(dir2, true);
        this.zza = dir2;
        this.zzd = zzbeiVar;
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

    /* JADX WARN: Removed duplicated region for block: B:23:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(@NonNull zzbek zzbekVar, @Nullable zzfzy zzfzyVar) {
        boolean z;
        zzber zzc;
        zzber zzc2;
        String zza = zzbekVar.zza().zza();
        byte[] zzA = zzbekVar.zzb().zzA();
        byte[] zzA2 = zzbekVar.zzc().zzA();
        if (!TextUtils.isEmpty(zza) && zzA2.length != 0) {
            File file = this.zza;
            zzfzt.zze(file);
            file.mkdirs();
            zzfzt.zzc(zza, file).mkdirs();
            File zza2 = zzfzt.zza(zza, "pcam.jar", file);
            if ((zzA.length <= 0 || zzfzt.zzb(zza2, zzA)) && zzfzt.zzb(zzfzt.zza(zza, "pcbc", file), zzA2)) {
                File zza3 = zzfzt.zza(zzbekVar.zza().zza(), "pcam.jar", file);
                if (zza3.exists() && zzfzyVar != null && !zzfzyVar.zza(zza3)) {
                    return false;
                }
                String zza4 = zzbekVar.zza().zza();
                if (!TextUtils.isEmpty(zza4)) {
                    File zza5 = zzfzt.zza(zza4, "pcam.jar", file);
                    File zza6 = zzfzt.zza(zza4, "pcbc", file);
                    File zza7 = zzfzt.zza(zza4, "pcam.jar", zzd());
                    File zza8 = zzfzt.zza(zza4, "pcbc", zzd());
                    if ((!zza5.exists() || zza5.renameTo(zza7)) && zza6.exists() && zza6.renameTo(zza8)) {
                        zzbeq zzi = zzber.zzi();
                        zzi.zza(zzbekVar.zza().zza());
                        zzi.zzb(zzbekVar.zza().zzb());
                        zzi.zzd(zzbekVar.zza().zzd());
                        zzi.zze(zzbekVar.zza().zze());
                        zzi.zzc(zzbekVar.zza().zzc());
                        zzber zzberVar = (zzber) zzi.zzbu();
                        zzber zzc3 = zzc(1);
                        SharedPreferences.Editor edit = this.zzc.edit();
                        if (zzc3 != null && !zzberVar.zza().equals(zzc3.zza())) {
                            edit.putString(zze(), Hex.bytesToStringLowercase(zzc3.zzaN()));
                        }
                        edit.putString(zzf(), Hex.bytesToStringLowercase(zzberVar.zzaN()));
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
                                    zzfzt.zze(zzfzt.zzc(name, zzd()));
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

    @Nullable
    public final zzfzr zzb(int i) {
        zzber zzc = zzc(1);
        if (zzc == null) {
            return null;
        }
        String zza = zzc.zza();
        File zza2 = zzfzt.zza(zza, "pcam.jar", zzd());
        if (!zza2.exists()) {
            zza2 = zzfzt.zza(zza, "pcam", zzd());
        }
        return new zzfzr(zzc, zza2, zzfzt.zza(zza, "pcbc", zzd()), zzfzt.zza(zza, "pcopt", zzd()));
    }

    @Nullable
    @VisibleForTesting
    final zzber zzc(int i) {
        String string = i == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] stringToBytes = Hex.stringToBytes(string);
            zziei zzieiVar = zziei.zza;
            zzber zzg = zzber.zzg(zziei.zzt(stringToBytes, 0, stringToBytes.length));
            String zza = zzg.zza();
            File zza2 = zzfzt.zza(zza, "pcam.jar", zzd());
            if (!zza2.exists()) {
                zza2 = zzfzt.zza(zza, "pcam", zzd());
            }
            File zza3 = zzfzt.zza(zza, "pcbc", zzd());
            if (zza2.exists()) {
                if (zza3.exists()) {
                    return zzg;
                }
            }
        } catch (zzige unused) {
        }
        return null;
    }
}

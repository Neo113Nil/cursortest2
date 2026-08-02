package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfom {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzfom(Context context, int i) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfon.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfon.zza(dir2, true);
        this.zza = dir2;
        this.zzd = i;
    }

    static String zza(zzary zzaryVar) {
        return Hex.bytesToStringLowercase(zzaryVar.zzat().zzE());
    }

    private final File zze() {
        File file = new File(this.zzb, Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zzf() {
        int i = this.zzd;
        StringBuilder sb = new StringBuilder();
        sb.append("FBAMTD");
        sb.append(i - 1);
        return sb.toString();
    }

    private final String zzg() {
        int i = this.zzd;
        StringBuilder sb = new StringBuilder();
        sb.append("LATMTD");
        sb.append(i - 1);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(zzarv zzarvVar, zzfos zzfosVar) {
        boolean z;
        zzary zzc;
        zzary zzc2;
        String zzk = zzarvVar.zzd().zzk();
        byte[] zzE = zzarvVar.zzf().zzE();
        byte[] zzE2 = zzarvVar.zze().zzE();
        if (!TextUtils.isEmpty(zzk) && zzE2 != null && zzE2.length != 0) {
            zzfon.zzd(this.zza);
            this.zza.mkdirs();
            zzfon.zzc(zzk, this.zza).mkdirs();
            File zzb = zzfon.zzb(zzk, "pcam.jar", this.zza);
            if ((zzE == null || zzE.length <= 0 || zzfon.zze(zzb, zzE)) && zzfon.zze(zzfon.zzb(zzk, "pcbc", this.zza), zzE2)) {
                File zzb2 = zzfon.zzb(zzarvVar.zzd().zzk(), "pcam.jar", this.zza);
                if (zzb2.exists() && zzfosVar != null && !zzfosVar.zza(zzb2)) {
                    return false;
                }
                String zzk2 = zzarvVar.zzd().zzk();
                if (!TextUtils.isEmpty(zzk2)) {
                    File zzb3 = zzfon.zzb(zzk2, "pcam.jar", this.zza);
                    File zzb4 = zzfon.zzb(zzk2, "pcbc", this.zza);
                    File zzb5 = zzfon.zzb(zzk2, "pcam.jar", zze());
                    File zzb6 = zzfon.zzb(zzk2, "pcbc", zze());
                    if ((!zzb3.exists() || zzb3.renameTo(zzb5)) && zzb4.exists() && zzb4.renameTo(zzb6)) {
                        zzarx zze = zzary.zze();
                        zze.zze(zzarvVar.zzd().zzk());
                        zze.zza(zzarvVar.zzd().zzj());
                        zze.zzb(zzarvVar.zzd().zza());
                        zze.zzd(zzarvVar.zzd().zzd());
                        zze.zzc(zzarvVar.zzd().zzc());
                        zzary zzaryVar = (zzary) zze.zzam();
                        zzary zzc3 = zzc(1);
                        SharedPreferences.Editor edit = this.zzc.edit();
                        if (zzc3 != null && !zzaryVar.zzk().equals(zzc3.zzk())) {
                            edit.putString(zzf(), zza(zzc3));
                        }
                        edit.putString(zzg(), zza(zzaryVar));
                        if (edit.commit()) {
                            z = true;
                            HashSet hashSet = new HashSet();
                            zzc = zzc(1);
                            if (zzc != null) {
                                hashSet.add(zzc.zzk());
                            }
                            zzc2 = zzc(2);
                            if (zzc2 != null) {
                                hashSet.add(zzc2.zzk());
                            }
                            for (File file : zze().listFiles()) {
                                String name = file.getName();
                                if (!hashSet.contains(name)) {
                                    zzfon.zzd(zzfon.zzc(name, zze()));
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

    final zzary zzc(int i) {
        String string = i == 1 ? this.zzc.getString(zzg(), null) : this.zzc.getString(zzf(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            zzary zzh = zzary.zzh(zzgpw.zzv(Hex.stringToBytes(string)));
            String zzk = zzh.zzk();
            File zzb = zzfon.zzb(zzk, "pcam.jar", zze());
            if (!zzb.exists()) {
                zzb = zzfon.zzb(zzk, "pcam", zze());
            }
            File zzb2 = zzfon.zzb(zzk, "pcbc", zze());
            if (zzb.exists()) {
                if (zzb2.exists()) {
                    return zzh;
                }
            }
        } catch (zzgrq unused) {
        }
        return null;
    }

    public final zzfol zzd(int i) {
        zzary zzc = zzc(1);
        if (zzc == null) {
            return null;
        }
        String zzk = zzc.zzk();
        File zzb = zzfon.zzb(zzk, "pcam.jar", zze());
        if (!zzb.exists()) {
            zzb = zzfon.zzb(zzk, "pcam", zze());
        }
        return new zzfol(zzc, zzb, zzfon.zzb(zzk, "pcbc", zze()), zzfon.zzb(zzk, "pcopt", zze()));
    }
}

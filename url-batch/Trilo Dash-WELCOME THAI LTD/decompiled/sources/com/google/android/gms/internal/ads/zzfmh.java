package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfmh {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzfmh(Context context, int i) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfmi.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfmi.zza(dir2, true);
        this.zza = dir2;
        this.zzd = i;
    }

    static String zza(zzaqu zzaquVar) {
        return Hex.bytesToStringLowercase(zzaquVar.zzaq().zzE());
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
    public final boolean zzb(zzaqr zzaqrVar, zzfmn zzfmnVar) {
        boolean z;
        zzaqu zzc;
        zzaqu zzc2;
        String zzk = zzaqrVar.zzd().zzk();
        byte[] zzE = zzaqrVar.zzf().zzE();
        byte[] zzE2 = zzaqrVar.zze().zzE();
        if (!TextUtils.isEmpty(zzk) && zzE2 != null && zzE2.length != 0) {
            zzfmi.zzd(this.zza);
            this.zza.mkdirs();
            zzfmi.zzc(zzk, this.zza).mkdirs();
            File zzb = zzfmi.zzb(zzk, "pcam.jar", this.zza);
            if ((zzE == null || zzE.length <= 0 || zzfmi.zze(zzb, zzE)) && zzfmi.zze(zzfmi.zzb(zzk, "pcbc", this.zza), zzE2)) {
                File zzb2 = zzfmi.zzb(zzaqrVar.zzd().zzk(), "pcam.jar", this.zza);
                if (zzb2.exists() && zzfmnVar != null && !zzfmnVar.zza(zzb2)) {
                    return false;
                }
                String zzk2 = zzaqrVar.zzd().zzk();
                if (!TextUtils.isEmpty(zzk2)) {
                    File zzb3 = zzfmi.zzb(zzk2, "pcam.jar", this.zza);
                    File zzb4 = zzfmi.zzb(zzk2, "pcbc", this.zza);
                    File zzb5 = zzfmi.zzb(zzk2, "pcam.jar", zze());
                    File zzb6 = zzfmi.zzb(zzk2, "pcbc", zze());
                    if ((!zzb3.exists() || zzb3.renameTo(zzb5)) && zzb4.exists() && zzb4.renameTo(zzb6)) {
                        zzaqt zze = zzaqu.zze();
                        zze.zze(zzaqrVar.zzd().zzk());
                        zze.zza(zzaqrVar.zzd().zzj());
                        zze.zzb(zzaqrVar.zzd().zza());
                        zze.zzd(zzaqrVar.zzd().zzd());
                        zze.zzc(zzaqrVar.zzd().zzc());
                        zzaqu zzaquVar = (zzaqu) zze.zzaj();
                        zzaqu zzc3 = zzc(1);
                        SharedPreferences.Editor edit = this.zzc.edit();
                        if (zzc3 != null && !zzaquVar.zzk().equals(zzc3.zzk())) {
                            edit.putString(zzf(), zza(zzc3));
                        }
                        edit.putString(zzg(), zza(zzaquVar));
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
                                    zzfmi.zzd(zzfmi.zzc(name, zze()));
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

    final zzaqu zzc(int i) {
        String string = i == 1 ? this.zzc.getString(zzg(), null) : this.zzc.getString(zzf(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            zzaqu zzh = zzaqu.zzh(zzgjg.zzv(Hex.stringToBytes(string)));
            String zzk = zzh.zzk();
            File zzb = zzfmi.zzb(zzk, "pcam.jar", zze());
            if (!zzb.exists()) {
                zzb = zzfmi.zzb(zzk, "pcam", zze());
            }
            File zzb2 = zzfmi.zzb(zzk, "pcbc", zze());
            if (zzb.exists()) {
                if (zzb2.exists()) {
                    return zzh;
                }
            }
        } catch (zzgla unused) {
        }
        return null;
    }

    public final zzfmg zzd(int i) {
        zzaqu zzc = zzc(1);
        if (zzc == null) {
            return null;
        }
        String zzk = zzc.zzk();
        File zzb = zzfmi.zzb(zzk, "pcam.jar", zze());
        if (!zzb.exists()) {
            zzb = zzfmi.zzb(zzk, "pcam", zze());
        }
        return new zzfmg(zzc, zzb, zzfmi.zzb(zzk, "pcbc", zze()), zzfmi.zzb(zzk, "pcopt", zze()));
    }
}

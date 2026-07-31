package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes.dex */
public final class zzafl {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;

    private zzafl(int i, String str, int i2, int i3, int i4) {
        this.zza = i;
        this.zze = str;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f0, code lost:
    
        if (r5.zzj(1) > 0) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021f A[Catch: RuntimeException -> 0x0039, TryCatch #0 {RuntimeException -> 0x0039, blocks: (B:3:0x0009, B:6:0x001b, B:9:0x003c, B:13:0x0062, B:16:0x0086, B:18:0x00cc, B:20:0x00db, B:22:0x00e5, B:24:0x0110, B:26:0x0116, B:28:0x012a, B:30:0x0133, B:32:0x013b, B:34:0x014f, B:36:0x015c, B:38:0x0170, B:40:0x0176, B:42:0x018a, B:44:0x0190, B:46:0x01a4, B:48:0x01ac, B:50:0x01b8, B:52:0x01bb, B:55:0x01bd, B:57:0x01d3, B:58:0x01d9, B:60:0x01e2, B:61:0x01e5, B:64:0x01f2, B:66:0x01f8, B:68:0x01fd, B:69:0x0200, B:72:0x020b, B:73:0x0212, B:76:0x0219, B:78:0x021f, B:80:0x022e, B:87:0x0251, B:90:0x025c, B:94:0x024d, B:99:0x01ec), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022e A[Catch: RuntimeException -> 0x0039, TryCatch #0 {RuntimeException -> 0x0039, blocks: (B:3:0x0009, B:6:0x001b, B:9:0x003c, B:13:0x0062, B:16:0x0086, B:18:0x00cc, B:20:0x00db, B:22:0x00e5, B:24:0x0110, B:26:0x0116, B:28:0x012a, B:30:0x0133, B:32:0x013b, B:34:0x014f, B:36:0x015c, B:38:0x0170, B:40:0x0176, B:42:0x018a, B:44:0x0190, B:46:0x01a4, B:48:0x01ac, B:50:0x01b8, B:52:0x01bb, B:55:0x01bd, B:57:0x01d3, B:58:0x01d9, B:60:0x01e2, B:61:0x01e5, B:64:0x01f2, B:66:0x01f8, B:68:0x01fd, B:69:0x0200, B:72:0x020b, B:73:0x0212, B:76:0x0219, B:78:0x021f, B:80:0x022e, B:87:0x0251, B:90:0x025c, B:94:0x024d, B:99:0x01ec), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x025a  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzafl zza(byte[] bArr) throws zzat {
        int i;
        int i2;
        int zzj;
        try {
            zzet zzetVar = new zzet(bArr, bArr.length);
            zzetVar.zzg();
            int zzj2 = zzetVar.zzj(7);
            if (zzj2 != 1) {
                StringBuilder sb = new StringBuilder(String.valueOf(zzj2).length() + 26);
                sb.append("Unsupported av1C version: ");
                sb.append(zzj2);
                zzeh.zzc("Av1Config", sb.toString());
                return null;
            }
            int zzj3 = zzetVar.zzj(3);
            int zzj4 = zzetVar.zzj(5);
            boolean zzi = zzetVar.zzi();
            int i3 = zzetVar.zzi() ? true != zzetVar.zzi() ? 10 : 12 : 8;
            zzetVar.zzh(13);
            Object[] objArr = {Integer.valueOf(zzj4)};
            String str = zzfm.zza;
            Locale locale = Locale.US;
            String format = String.format(locale, "%02d", objArr);
            String str2 = true != zzi ? "M" : "H";
            String format2 = String.format(locale, "%02d", Integer.valueOf(i3));
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzj3).length() + 6 + format.length() + 2 + format2.length());
            sb2.append("av01.");
            sb2.append(zzj3);
            sb2.append(".");
            sb2.append(format);
            sb2.append(str2);
            sb2.append(".");
            sb2.append(format2);
            String sb3 = sb2.toString();
            if (zzetVar.zzc() <= 0) {
                return new zzafl(i3, sb3, -1, -1, -1);
            }
            zzetVar.zzg();
            int zzj5 = zzetVar.zzj(4);
            if (zzj5 != 1) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(zzj5).length() + 22);
                sb4.append("Unsupported obu_type: ");
                sb4.append(zzj5);
                zzeh.zzb("Av1Config", sb4.toString());
                return new zzafl(i3, sb3, -1, -1, -1);
            }
            if (zzetVar.zzi()) {
                zzeh.zzb("Av1Config", "Unsupported obu_extension_flag");
                return new zzafl(i3, sb3, -1, -1, -1);
            }
            boolean zzi2 = zzetVar.zzi();
            zzetVar.zzg();
            if (zzi2 && zzetVar.zzj(8) > 127) {
                zzeh.zzb("Av1Config", "Excessive obu_size");
                return new zzafl(i3, sb3, -1, -1, -1);
            }
            int zzj6 = zzetVar.zzj(3);
            zzetVar.zzg();
            if (zzetVar.zzi()) {
                zzeh.zzb("Av1Config", "Unsupported reduced_still_picture_header");
                return new zzafl(i3, sb3, -1, -1, -1);
            }
            if (zzetVar.zzi()) {
                zzeh.zzb("Av1Config", "Unsupported timing_info_present_flag");
                return new zzafl(i3, sb3, -1, -1, -1);
            }
            if (zzetVar.zzi()) {
                zzeh.zzb("Av1Config", "Unsupported initial_display_delay_present_flag");
                return new zzafl(i3, sb3, -1, -1, -1);
            }
            int zzj7 = zzetVar.zzj(5);
            boolean z = false;
            for (int i4 = 0; i4 <= zzj7; i4++) {
                zzetVar.zzh(12);
                if (zzetVar.zzj(5) > 7) {
                    zzetVar.zzg();
                }
            }
            int zzj8 = zzetVar.zzj(4);
            int zzj9 = zzetVar.zzj(4);
            zzetVar.zzh(zzj8 + 1);
            zzetVar.zzh(zzj9 + 1);
            if (zzetVar.zzi()) {
                i = 7;
                zzetVar.zzh(7);
            } else {
                i = 7;
            }
            zzetVar.zzh(i);
            boolean zzi3 = zzetVar.zzi();
            if (zzi3) {
                zzetVar.zzh(2);
            }
            if (!zzetVar.zzi()) {
            }
            if (!zzetVar.zzi()) {
                zzetVar.zzh(1);
            }
            if (zzi3) {
                zzetVar.zzh(3);
            }
            zzetVar.zzh(3);
            boolean zzi4 = zzetVar.zzi();
            if (zzj6 == 2) {
                if (zzi4) {
                    zzetVar.zzg();
                }
            } else if (zzj6 == 1) {
                if (zzetVar.zzi()) {
                    return new zzafl(i3, sb3, -1, -1, -1);
                }
                int zzj10 = zzetVar.zzj(8);
                int zzj11 = zzetVar.zzj(8);
                int zzj12 = zzetVar.zzj(8);
                if (!z && zzj10 == 1) {
                    if (zzj11 == 13) {
                        if (zzj12 == 0) {
                            zzj10 = 1;
                            zzj = 1;
                            i2 = 13;
                            return new zzafl(i3, sb3, zzi.zzb(zzj10), zzj == 1 ? 1 : 2, zzi.zzc(i2));
                        }
                        zzj10 = 1;
                        i2 = 13;
                        zzj = zzetVar.zzj(1);
                        return new zzafl(i3, sb3, zzi.zzb(zzj10), zzj == 1 ? 1 : 2, zzi.zzc(i2));
                    }
                    zzj10 = 1;
                }
                i2 = zzj11;
                zzj = zzetVar.zzj(1);
                return new zzafl(i3, sb3, zzi.zzb(zzj10), zzj == 1 ? 1 : 2, zzi.zzc(i2));
            }
            if (zzetVar.zzi()) {
                z = true;
            }
            if (zzetVar.zzi()) {
            }
        } catch (RuntimeException e) {
            throw zzat.zzb("Error parsing AV1 config", e);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.InputDeviceCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.facebook.soloader.Elf64;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdc {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C"};
    private static final Pattern zzd = Pattern.compile("^\\D?(\\d+)$");

    public static String zza(byte[] bArr) {
        zzef zzefVar = new zzef(bArr);
        if (!zzh(zzefVar, 31)) {
            return null;
        }
        zzefVar.zzk(4);
        int zzs = zzefVar.zzs();
        int zzs2 = zzefVar.zzs();
        if (!zzh(zzefVar, 0)) {
            return null;
        }
        zzefVar.zzQ();
        String zzK = zzefVar.zzK(4, StandardCharsets.UTF_8);
        if (zzK.equals("mp4a")) {
            zzefVar.zzQ();
            zzefVar.zzk(2);
            zzee zzeeVar = new zzee();
            zzeeVar.zza(zzefVar);
            int zzj = zzeeVar.zzj(5);
            if (zzj == 31) {
                zzj = zzeeVar.zzj(6) + 32;
            }
            StringBuilder sb = new StringBuilder(zzK.length() + 4 + String.valueOf(zzj).length());
            sb.append(zzK);
            sb.append(".40.");
            sb.append(zzj);
            zzK = sb.toString();
        }
        Object[] objArr = {Integer.valueOf(zzs), Integer.valueOf(zzs2), zzK};
        String str = zzeo.zza;
        return String.format(Locale.US, "iamf.%03X.%03X.%s", objArr);
    }

    public static String zzb(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String zzc(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        int i5;
        Object[] objArr = {zzc[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(true != z ? 'L' : 'H'), Integer.valueOf(i4)};
        String str = zzeo.zza;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i6 = 6;
        while (true) {
            if (i6 <= 0) {
                break;
            }
            int i7 = i6 - 1;
            if (iArr[i7] != 0) {
                break;
            }
            i6 = i7;
        }
        for (i5 = 0; i5 < i6; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static String zzd(byte[] bArr) {
        int length = bArr.length;
        zzghc.zzd(length >= 17, "Invalid APV CSD length: %s", length);
        byte b = bArr[0];
        zzghc.zzd(b == 1, "Invalid APV CSD version: %s", b);
        Object[] objArr = {Integer.valueOf(bArr[5]), Integer.valueOf(bArr[6]), Integer.valueOf(bArr[7])};
        String str = zzeo.zza;
        return String.format(Locale.US, "apv1.apvf%d.apvl%d.apvb%d", objArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair zze(zzu zzuVar) {
        char c;
        int i;
        int parseInt;
        int parseInt2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Integer num;
        Integer num2;
        String str = zzuVar.zzk;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        int i7 = 16;
        int i8 = 8;
        int i9 = 3;
        int i10 = 2;
        if (!MimeTypes.VIDEO_DOLBY_VISION.equals(zzuVar.zzo)) {
            int i11 = 0;
            String str2 = split[0];
            char c2 = 65535;
            switch (str2.hashCode()) {
                case 2986313:
                    if (str2.equals("ac-4")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 3001066:
                    if (str2.equals("apv1")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 3004662:
                    if (str2.equals("av01")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3006243:
                    if (str2.equals("avc1")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3006244:
                    if (str2.equals("avc2")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3199032:
                    if (str2.equals("hev1")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3214780:
                    if (str2.equals("hvc1")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3224753:
                    if (str2.equals("iamf")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 3356560:
                    if (str2.equals("mp4a")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 3475740:
                    if (str2.equals("s263")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3624515:
                    if (str2.equals("vp09")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    String str3 = zzuVar.zzk;
                    Pair pair = new Pair(1, 1);
                    if (split.length < 3) {
                        String.valueOf(str3);
                        zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: ".concat(String.valueOf(str3)));
                        return pair;
                    }
                    try {
                        return new Pair(Integer.valueOf(Integer.parseInt(split[1])), Integer.valueOf(Integer.parseInt(split[2])));
                    } catch (NumberFormatException unused) {
                        String.valueOf(str3);
                        zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: ".concat(String.valueOf(str3)));
                        return pair;
                    }
                case 1:
                case 2:
                    String str4 = zzuVar.zzk;
                    int length = split.length;
                    if (length >= 2) {
                        try {
                            if (split[1].length() == 6) {
                                parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                                i = 4;
                                parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                            } else {
                                i = 4;
                                if (length < 3) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 37);
                                    sb.append("Ignoring malformed AVC codec string: ");
                                    sb.append(str4);
                                    zzds.zzc("CodecSpecificDataUtil", sb.toString());
                                    return null;
                                }
                                parseInt = Integer.parseInt(split[1]);
                                parseInt2 = Integer.parseInt(split[2]);
                            }
                            if (parseInt == 66) {
                                i10 = 1;
                            } else if (parseInt != 77) {
                                i10 = parseInt != 88 ? parseInt != 100 ? parseInt != 110 ? parseInt != 122 ? parseInt != 244 ? -1 : 64 : 32 : 16 : 8 : i;
                            }
                            if (i10 == -1) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(parseInt).length() + 21);
                                sb2.append("Unknown AVC profile: ");
                                sb2.append(parseInt);
                                zzds.zzc("CodecSpecificDataUtil", sb2.toString());
                                return null;
                            }
                            switch (parseInt2) {
                                case 10:
                                    i2 = 1;
                                    break;
                                case 11:
                                    i2 = i;
                                    break;
                                case 12:
                                    i2 = 8;
                                    break;
                                case 13:
                                    i2 = 16;
                                    break;
                                default:
                                    switch (parseInt2) {
                                        case 20:
                                            i2 = 32;
                                            break;
                                        case 21:
                                            i2 = 64;
                                            break;
                                        case 22:
                                            i2 = 128;
                                            break;
                                        default:
                                            switch (parseInt2) {
                                                case 30:
                                                    i2 = 256;
                                                    break;
                                                case 31:
                                                    i2 = 512;
                                                    break;
                                                case 32:
                                                    i2 = 1024;
                                                    break;
                                                default:
                                                    switch (parseInt2) {
                                                        case 40:
                                                            i2 = 2048;
                                                            break;
                                                        case 41:
                                                            i2 = 4096;
                                                            break;
                                                        case 42:
                                                            i2 = 8192;
                                                            break;
                                                        default:
                                                            switch (parseInt2) {
                                                                case 50:
                                                                    i2 = 16384;
                                                                    break;
                                                                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                                                    i2 = 32768;
                                                                    break;
                                                                case 52:
                                                                    i2 = 65536;
                                                                    break;
                                                                default:
                                                                    i2 = -1;
                                                                    break;
                                                            }
                                                    }
                                            }
                                    }
                            }
                            if (i2 != -1) {
                                return new Pair(Integer.valueOf(i10), Integer.valueOf(i2));
                            }
                            StringBuilder sb3 = new StringBuilder(String.valueOf(parseInt2).length() + 19);
                            sb3.append("Unknown AVC level: ");
                            sb3.append(parseInt2);
                            zzds.zzc("CodecSpecificDataUtil", sb3.toString());
                            return null;
                        } catch (NumberFormatException unused2) {
                            String.valueOf(str4);
                            zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str4)));
                            break;
                        }
                    } else {
                        String.valueOf(str4);
                        zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str4)));
                        return null;
                    }
                case 3:
                    String str5 = zzuVar.zzk;
                    if (split.length >= 3) {
                        try {
                            int parseInt3 = Integer.parseInt(split[1]);
                            int parseInt4 = Integer.parseInt(split[2]);
                            int i12 = parseInt3 != 0 ? parseInt3 != 1 ? parseInt3 != 2 ? parseInt3 != 3 ? -1 : 8 : 4 : 2 : 1;
                            if (i12 == -1) {
                                StringBuilder sb4 = new StringBuilder(String.valueOf(parseInt3).length() + 21);
                                sb4.append("Unknown VP9 profile: ");
                                sb4.append(parseInt3);
                                zzds.zzc("CodecSpecificDataUtil", sb4.toString());
                                return null;
                            }
                            if (parseInt4 == 10) {
                                i10 = 1;
                            } else if (parseInt4 != 11) {
                                if (parseInt4 == 20) {
                                    i10 = 4;
                                } else if (parseInt4 == 21) {
                                    i10 = 8;
                                } else if (parseInt4 == 30) {
                                    i10 = 16;
                                } else if (parseInt4 == 31) {
                                    i10 = 32;
                                } else if (parseInt4 == 40) {
                                    i10 = 64;
                                } else if (parseInt4 == 41) {
                                    i10 = 128;
                                } else if (parseInt4 == 50) {
                                    i10 = 256;
                                } else if (parseInt4 != 51) {
                                    switch (parseInt4) {
                                        case 60:
                                            i10 = 2048;
                                            break;
                                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                            i10 = 4096;
                                            break;
                                        case Elf64.Ehdr.E_SHSTRNDX /* 62 */:
                                            i10 = 8192;
                                            break;
                                        default:
                                            i10 = -1;
                                            break;
                                    }
                                } else {
                                    i10 = 512;
                                }
                            }
                            if (i10 != -1) {
                                return new Pair(Integer.valueOf(i12), Integer.valueOf(i10));
                            }
                            StringBuilder sb5 = new StringBuilder(String.valueOf(parseInt4).length() + 19);
                            sb5.append("Unknown VP9 level: ");
                            sb5.append(parseInt4);
                            zzds.zzc("CodecSpecificDataUtil", sb5.toString());
                            return null;
                        } catch (NumberFormatException unused3) {
                            String.valueOf(str5);
                            zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str5)));
                            break;
                        }
                    } else {
                        String.valueOf(str5);
                        zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str5)));
                        return null;
                    }
                case 4:
                case 5:
                    return zzf(zzuVar.zzk, split, zzuVar.zzE);
                case 6:
                    String str6 = zzuVar.zzk;
                    zzh zzhVar = zzuVar.zzE;
                    if (split.length >= 4) {
                        try {
                            int parseInt5 = Integer.parseInt(split[1]);
                            int parseInt6 = Integer.parseInt(split[2].substring(0, 2));
                            int parseInt7 = Integer.parseInt(split[3]);
                            if (parseInt5 != 0) {
                                StringBuilder sb6 = new StringBuilder(String.valueOf(parseInt5).length() + 21);
                                sb6.append("Unknown AV1 profile: ");
                                sb6.append(parseInt5);
                                zzds.zzc("CodecSpecificDataUtil", sb6.toString());
                                return null;
                            }
                            if (parseInt7 == 8) {
                                i3 = 1;
                            } else {
                                if (parseInt7 != 10) {
                                    StringBuilder sb7 = new StringBuilder(String.valueOf(parseInt7).length() + 23);
                                    sb7.append("Unknown AV1 bit depth: ");
                                    sb7.append(parseInt7);
                                    zzds.zzc("CodecSpecificDataUtil", sb7.toString());
                                    return null;
                                }
                                i3 = (zzhVar == null || !(zzhVar.zze != null || (i4 = zzhVar.zzd) == 7 || i4 == 6)) ? 2 : 4096;
                            }
                            switch (parseInt6) {
                                case 0:
                                    i10 = 1;
                                    break;
                                case 1:
                                    break;
                                case 2:
                                    i10 = 4;
                                    break;
                                case 3:
                                    i10 = 8;
                                    break;
                                case 4:
                                    i10 = 16;
                                    break;
                                case 5:
                                    i10 = 32;
                                    break;
                                case 6:
                                    i10 = 64;
                                    break;
                                case 7:
                                    i10 = 128;
                                    break;
                                case 8:
                                    i10 = 256;
                                    break;
                                case 9:
                                    i10 = 512;
                                    break;
                                case 10:
                                    i10 = 1024;
                                    break;
                                case 11:
                                    i10 = 2048;
                                    break;
                                case 12:
                                    i10 = 4096;
                                    break;
                                case 13:
                                    i10 = 8192;
                                    break;
                                case 14:
                                    i10 = 16384;
                                    break;
                                case 15:
                                    i10 = 32768;
                                    break;
                                case 16:
                                    i10 = 65536;
                                    break;
                                case 17:
                                    i10 = 131072;
                                    break;
                                case 18:
                                    i10 = 262144;
                                    break;
                                case 19:
                                    i10 = 524288;
                                    break;
                                case 20:
                                    i10 = 1048576;
                                    break;
                                case 21:
                                    i10 = 2097152;
                                    break;
                                case 22:
                                    i10 = 4194304;
                                    break;
                                case 23:
                                    i10 = 8388608;
                                    break;
                                default:
                                    i10 = -1;
                                    break;
                            }
                            if (i10 != -1) {
                                return new Pair(Integer.valueOf(i3), Integer.valueOf(i10));
                            }
                            StringBuilder sb8 = new StringBuilder(String.valueOf(parseInt6).length() + 19);
                            sb8.append("Unknown AV1 level: ");
                            sb8.append(parseInt6);
                            zzds.zzc("CodecSpecificDataUtil", sb8.toString());
                            return null;
                        } catch (NumberFormatException unused4) {
                            String.valueOf(str6);
                            zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str6)));
                            break;
                        }
                    } else {
                        String.valueOf(str6);
                        zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str6)));
                        return null;
                    }
                    break;
                case 7:
                    String str7 = zzuVar.zzk;
                    if (split.length >= 4) {
                        try {
                            int parseInt8 = Integer.parseInt(split[1].substring(4));
                            int parseInt9 = Integer.parseInt(split[2].substring(4));
                            int parseInt10 = Integer.parseInt(split[3].substring(4));
                            if (parseInt8 == 33) {
                                i5 = 1;
                            } else {
                                if (parseInt8 != 44) {
                                    StringBuilder sb9 = new StringBuilder(String.valueOf(parseInt8).length() + 30);
                                    sb9.append("Ignoring invalid APV profile: ");
                                    sb9.append(parseInt8);
                                    zzds.zzc("CodecSpecificDataUtil", sb9.toString());
                                    return null;
                                }
                                i5 = 8192;
                            }
                            int i13 = parseInt9 / 30;
                            int i14 = i13 + i13;
                            if (parseInt9 % 30 == 0) {
                                i14--;
                            }
                            return new Pair(Integer.valueOf(i5), Integer.valueOf((1 << parseInt10) | (256 << (i14 - 1))));
                        } catch (NumberFormatException e) {
                            String.valueOf(str7);
                            zzds.zzd("CodecSpecificDataUtil", "Ignoring malformed APV codec string: ".concat(String.valueOf(str7)), e);
                            break;
                        }
                    } else {
                        String.valueOf(str7);
                        zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed APV codec string: ".concat(String.valueOf(str7)));
                        return null;
                    }
                case '\b':
                    String str8 = zzuVar.zzk;
                    if (split.length == 3) {
                        try {
                            if (MimeTypes.AUDIO_AAC.equals(zzar.zzf(Integer.parseInt(split[1], 16)))) {
                                int parseInt11 = Integer.parseInt(split[2]);
                                if (parseInt11 == 17) {
                                    i9 = 17;
                                } else if (parseInt11 == 20) {
                                    i9 = 20;
                                } else if (parseInt11 == 23) {
                                    i9 = 23;
                                } else if (parseInt11 == 29) {
                                    i9 = 29;
                                } else if (parseInt11 == 39) {
                                    i9 = 39;
                                } else if (parseInt11 != 42) {
                                    switch (parseInt11) {
                                        case 1:
                                            i9 = 1;
                                            break;
                                        case 2:
                                            i9 = 2;
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            i9 = 4;
                                            break;
                                        case 5:
                                            i9 = 5;
                                            break;
                                        case 6:
                                            i9 = 6;
                                            break;
                                        default:
                                            i9 = -1;
                                            break;
                                    }
                                } else {
                                    i9 = 42;
                                }
                                if (i9 != -1) {
                                    return new Pair(Integer.valueOf(i9), 0);
                                }
                            }
                            return null;
                        } catch (NumberFormatException unused5) {
                            String.valueOf(str8);
                            zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str8)));
                            break;
                        }
                    } else {
                        String.valueOf(str8);
                        zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str8)));
                        return null;
                    }
                case '\t':
                    String str9 = zzuVar.zzk;
                    if (split.length == 4) {
                        try {
                            int parseInt12 = Integer.parseInt(split[1]);
                            int parseInt13 = Integer.parseInt(split[2]);
                            int parseInt14 = Integer.parseInt(split[3]);
                            if (parseInt12 != 0) {
                                if (parseInt12 != 1) {
                                    if (parseInt12 == 2) {
                                        if (parseInt13 == 1) {
                                            i6 = AnalyticsListener.EVENT_DRM_KEYS_REMOVED;
                                            i11 = 1;
                                        } else if (parseInt13 == 2) {
                                            i6 = AnalyticsListener.EVENT_PLAYER_RELEASED;
                                            i11 = 2;
                                        }
                                    }
                                    i11 = parseInt13;
                                    i6 = -1;
                                } else if (parseInt13 == 0) {
                                    i6 = InputDeviceCompat.SOURCE_DPAD;
                                } else {
                                    if (parseInt13 == 1) {
                                        i6 = 514;
                                        i11 = 1;
                                    }
                                    i11 = parseInt13;
                                    i6 = -1;
                                }
                                if (i6 == -1) {
                                    StringBuilder sb10 = new StringBuilder(String.valueOf(parseInt12).length() + 23 + String.valueOf(i11).length());
                                    sb10.append("Unknown AC-4 profile: ");
                                    sb10.append(parseInt12);
                                    sb10.append(".");
                                    sb10.append(i11);
                                    zzds.zzc("CodecSpecificDataUtil", sb10.toString());
                                    return null;
                                }
                                if (parseInt14 == 0) {
                                    i7 = 1;
                                } else if (parseInt14 == 1) {
                                    i7 = 2;
                                } else if (parseInt14 == 2) {
                                    i7 = 4;
                                } else if (parseInt14 == 3) {
                                    i7 = 8;
                                } else if (parseInt14 != 4) {
                                    i7 = -1;
                                }
                                if (i7 != -1) {
                                    return new Pair(Integer.valueOf(i6), Integer.valueOf(i7));
                                }
                                StringBuilder sb11 = new StringBuilder(String.valueOf(parseInt14).length() + 20);
                                sb11.append("Unknown AC-4 level: ");
                                sb11.append(parseInt14);
                                zzds.zzc("CodecSpecificDataUtil", sb11.toString());
                                return null;
                            }
                            if (parseInt13 == 0) {
                                i6 = 257;
                                if (i6 == -1) {
                                }
                            }
                            i11 = parseInt13;
                            i6 = -1;
                            if (i6 == -1) {
                            }
                        } catch (NumberFormatException unused6) {
                            String.valueOf(str9);
                            zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: ".concat(String.valueOf(str9)));
                            break;
                        }
                    } else {
                        String.valueOf(str9);
                        zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: ".concat(String.valueOf(str9)));
                        return null;
                    }
                case '\n':
                    if (split.length >= 4) {
                        try {
                            int parseInt15 = 1 << (Integer.parseInt(split[1]) + 16);
                            String str10 = split[3];
                            switch (str10.hashCode()) {
                                case 2464863:
                                    if (str10.equals("Opus")) {
                                        c2 = 0;
                                        break;
                                    }
                                    break;
                                case 3114792:
                                    if (str10.equals("fLaC")) {
                                        c2 = 2;
                                        break;
                                    }
                                    break;
                                case 3238865:
                                    if (str10.equals("ipcm")) {
                                        c2 = 3;
                                        break;
                                    }
                                    break;
                                case 3356560:
                                    if (str10.equals("mp4a")) {
                                        c2 = 1;
                                        break;
                                    }
                                    break;
                            }
                            if (c2 == 0) {
                                i8 = 1;
                            } else if (c2 == 1) {
                                i8 = 2;
                            } else if (c2 == 2) {
                                i8 = 4;
                            } else if (c2 != 3) {
                                String.valueOf(str10);
                                zzds.zzc("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: ".concat(String.valueOf(str10)));
                                return null;
                            }
                            return new Pair(Integer.valueOf(parseInt15 | 16777216 | i8), 0);
                        } catch (NumberFormatException e2) {
                            String str11 = split[1];
                            String.valueOf(str11);
                            zzds.zzd("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: ".concat(String.valueOf(str11)), e2);
                            break;
                        }
                    } else {
                        zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed IAMF codec string: ".concat(str));
                        return null;
                    }
                default:
                    return null;
            }
            return null;
        }
        if (split.length < 3) {
            zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
            return null;
        }
        Matcher matcher = zzd.matcher(split[1]);
        if (!matcher.matches()) {
            zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
            return null;
        }
        String group = matcher.group(1);
        if (group != null) {
            int hashCode = group.hashCode();
            if (hashCode != 1567) {
                switch (hashCode) {
                    case 1536:
                        if (group.equals("00")) {
                            num = 1;
                            break;
                        }
                        break;
                    case 1537:
                        if (group.equals("01")) {
                            num = 2;
                            break;
                        }
                        break;
                    case 1538:
                        if (group.equals("02")) {
                            num = 4;
                            break;
                        }
                        break;
                    case 1539:
                        if (group.equals("03")) {
                            num = 8;
                            break;
                        }
                        break;
                    case 1540:
                        if (group.equals("04")) {
                            num = 16;
                            break;
                        }
                        break;
                    case 1541:
                        if (group.equals("05")) {
                            num = 32;
                            break;
                        }
                        break;
                    case 1542:
                        if (group.equals("06")) {
                            num = 64;
                            break;
                        }
                        break;
                    case 1543:
                        if (group.equals("07")) {
                            num = 128;
                            break;
                        }
                        break;
                    case 1544:
                        if (group.equals("08")) {
                            num = 256;
                            break;
                        }
                        break;
                    case 1545:
                        if (group.equals("09")) {
                            num = 512;
                            break;
                        }
                        break;
                }
                if (num == null) {
                    String.valueOf(group);
                    zzds.zzc("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: ".concat(String.valueOf(group)));
                    return null;
                }
                String str12 = split[2];
                if (str12 != null) {
                    int hashCode2 = str12.hashCode();
                    switch (hashCode2) {
                        case 1537:
                            if (str12.equals("01")) {
                                num2 = 1;
                                break;
                            }
                            break;
                        case 1538:
                            if (str12.equals("02")) {
                                num2 = 2;
                                break;
                            }
                            break;
                        case 1539:
                            if (str12.equals("03")) {
                                num2 = 4;
                                break;
                            }
                            break;
                        case 1540:
                            if (str12.equals("04")) {
                                num2 = 8;
                                break;
                            }
                            break;
                        case 1541:
                            if (str12.equals("05")) {
                                num2 = 16;
                                break;
                            }
                            break;
                        case 1542:
                            if (str12.equals("06")) {
                                num2 = 32;
                                break;
                            }
                            break;
                        case 1543:
                            if (str12.equals("07")) {
                                num2 = 64;
                                break;
                            }
                            break;
                        case 1544:
                            if (str12.equals("08")) {
                                num2 = 128;
                                break;
                            }
                            break;
                        case 1545:
                            if (str12.equals("09")) {
                                num2 = 256;
                                break;
                            }
                            break;
                        default:
                            switch (hashCode2) {
                                case 1567:
                                    if (str12.equals("10")) {
                                        num2 = 512;
                                        break;
                                    }
                                    break;
                                case 1568:
                                    if (str12.equals("11")) {
                                        num2 = 1024;
                                        break;
                                    }
                                    break;
                                case 1569:
                                    if (str12.equals("12")) {
                                        num2 = 2048;
                                        break;
                                    }
                                    break;
                                case 1570:
                                    if (str12.equals("13")) {
                                        num2 = 4096;
                                        break;
                                    }
                                    break;
                            }
                    }
                    if (num2 == null) {
                        return new Pair(num, num2);
                    }
                    String.valueOf(str12);
                    zzds.zzc("CodecSpecificDataUtil", "Unknown Dolby Vision level string: ".concat(String.valueOf(str12)));
                    return null;
                }
                num2 = null;
                if (num2 == null) {
                }
            } else if (group.equals("10")) {
                num = 1024;
                if (num == null) {
                }
            }
        }
        num = null;
        if (num == null) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c4, code lost:
    
        if (r11.equals("L123") != false) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair zzf(String str, String[] strArr, zzh zzhVar) {
        int i;
        Integer num;
        if (strArr.length < 4) {
            String.valueOf(str);
            zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        Matcher matcher = zzd.matcher(strArr[1]);
        if (!matcher.matches()) {
            String.valueOf(str);
            zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        String group = matcher.group(1);
        char c = 6;
        if ("1".equals(group)) {
            i = 1;
        } else if (ExifInterface.GPS_MEASUREMENT_2D.equals(group)) {
            i = (zzhVar == null || zzhVar.zzd != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(group)) {
                String.valueOf(group);
                zzds.zzc("CodecSpecificDataUtil", "Unknown HEVC profile string: ".concat(String.valueOf(group)));
                return null;
            }
            i = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2.hashCode()) {
                case 70821:
                    if (str2.equals("H30")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 70914:
                    if (str2.equals("H60")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 70917:
                    if (str2.equals("H63")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 71007:
                    if (str2.equals("H90")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 71010:
                    if (str2.equals("H93")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 74665:
                    if (str2.equals("L30")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 74758:
                    if (str2.equals("L60")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 74761:
                    if (str2.equals("L63")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 74851:
                    if (str2.equals("L90")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 74854:
                    if (str2.equals("L93")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 2193639:
                    if (str2.equals("H120")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 2193642:
                    if (str2.equals("H123")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 2193732:
                    if (str2.equals("H150")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 2193735:
                    if (str2.equals("H153")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 2193738:
                    if (str2.equals("H156")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 2193825:
                    if (str2.equals("H180")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case 2193828:
                    if (str2.equals("H183")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 2193831:
                    if (str2.equals("H186")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case 2312803:
                    if (str2.equals("L120")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 2312806:
                    break;
                case 2312896:
                    if (str2.equals("L150")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 2312899:
                    if (str2.equals("L153")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 2312902:
                    if (str2.equals("L156")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 2312989:
                    if (str2.equals("L180")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 2312992:
                    if (str2.equals("L183")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 2312995:
                    if (str2.equals("L186")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    num = 1;
                    break;
                case 1:
                    num = 4;
                    break;
                case 2:
                    num = 16;
                    break;
                case 3:
                    num = 64;
                    break;
                case 4:
                    num = 256;
                    break;
                case 5:
                    num = 1024;
                    break;
                case 6:
                    num = 4096;
                    break;
                case 7:
                    num = 16384;
                    break;
                case '\b':
                    num = 65536;
                    break;
                case '\t':
                    num = 262144;
                    break;
                case '\n':
                    num = 1048576;
                    break;
                case 11:
                    num = 4194304;
                    break;
                case '\f':
                    num = 16777216;
                    break;
                case '\r':
                    num = 2;
                    break;
                case 14:
                    num = 8;
                    break;
                case 15:
                    num = 32;
                    break;
                case 16:
                    num = 128;
                    break;
                case 17:
                    num = 512;
                    break;
                case 18:
                    num = 2048;
                    break;
                case 19:
                    num = 8192;
                    break;
                case 20:
                    num = 32768;
                    break;
                case 21:
                    num = 131072;
                    break;
                case 22:
                    num = 524288;
                    break;
                case 23:
                    num = 2097152;
                    break;
                case 24:
                    num = 8388608;
                    break;
                case 25:
                    num = 33554432;
                    break;
            }
            if (num == null) {
                return new Pair(Integer.valueOf(i), num);
            }
            String.valueOf(str2);
            zzds.zzc("CodecSpecificDataUtil", "Unknown HEVC level string: ".concat(String.valueOf(str2)));
            return null;
        }
        num = null;
        if (num == null) {
        }
    }

    public static byte[] zzg(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2 + 4];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }

    private static boolean zzh(zzef zzefVar, int i) {
        if ((zzefVar.zzs() >> 3) != i) {
            return false;
        }
        zzefVar.zzQ();
        return true;
    }
}

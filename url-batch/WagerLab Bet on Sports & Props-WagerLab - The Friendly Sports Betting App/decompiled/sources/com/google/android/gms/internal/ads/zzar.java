package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.ts.TsExtractor;
import com.amazon.a.a.o.b.f;
import com.google.android.gms.location.LocationRequest;
import io.ably.lib.util.Log;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzar {
    public static final /* synthetic */ int zza = 0;
    private static final ArrayList zzb = new ArrayList();
    private static final Pattern zzc = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean zza(String str) {
        return MimeTypes.BASE_TYPE_AUDIO.equals(zzk(str));
    }

    public static boolean zzb(String str) {
        return "video".equals(zzk(str));
    }

    public static boolean zzc(String str) {
        return "image".equals(zzk(str)) || MimeTypes.APPLICATION_EXTERNALLY_LOADED_IMAGE.equals(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean zzd(String str, String str2) {
        char c;
        zzaq zzj;
        int zza2;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -432837260:
                if (str.equals(MimeTypes.AUDIO_MPEG_L1)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -432837259:
                if (str.equals(MimeTypes.AUDIO_MPEG_L2)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals(MimeTypes.AUDIO_AAC)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals(MimeTypes.AUDIO_AC3)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 187094639:
                if (str.equals(MimeTypes.AUDIO_RAW)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1504619009:
                if (str.equals(MimeTypes.AUDIO_FLAC)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (str.equals(MimeTypes.AUDIO_MPEG)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1903231877:
                if (str.equals(MimeTypes.AUDIO_ALAW)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1903589369:
                if (str.equals(MimeTypes.AUDIO_MLAW)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case '\n':
                if (str2 != null && (zzj = zzj(str2)) != null && (zza2 = zzj.zza()) != 0 && zza2 != 16) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0202 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zze(String str, String str2) {
        String str3;
        zzaq zzj;
        String str4 = null;
        if (str != null) {
            String str5 = zzeo.zza;
            String[] split = TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
            StringBuilder sb = new StringBuilder();
            for (String str6 : split) {
                if (str6 != null) {
                    String zza2 = zzggj.zza(str6.trim());
                    if (zza2.startsWith("avc1") || zza2.startsWith("avc3")) {
                        str3 = MimeTypes.VIDEO_H264;
                    } else if (zza2.startsWith("hev1") || zza2.startsWith("hvc1")) {
                        str3 = MimeTypes.VIDEO_H265;
                    } else if (zza2.startsWith("dvav") || zza2.startsWith("dva1") || zza2.startsWith("dvhe") || zza2.startsWith("dvh1")) {
                        str3 = MimeTypes.VIDEO_DOLBY_VISION;
                    } else if (zza2.startsWith("av01")) {
                        str3 = MimeTypes.VIDEO_AV1;
                    } else if (zza2.startsWith("vp9") || zza2.startsWith("vp09")) {
                        str3 = MimeTypes.VIDEO_VP9;
                    } else if (zza2.startsWith("vp8") || zza2.startsWith("vp08")) {
                        str3 = MimeTypes.VIDEO_VP8;
                    } else if (zza2.startsWith("mp4a")) {
                        str3 = (!zza2.startsWith("mp4a.") || (zzj = zzj(zza2)) == null) ? null : zzf(zzj.zza);
                        if (str3 == null) {
                            str3 = MimeTypes.AUDIO_AAC;
                        }
                    } else if (zza2.startsWith("mha1")) {
                        str3 = MimeTypes.AUDIO_MPEGH_MHA1;
                    } else if (zza2.startsWith("mhm1")) {
                        str3 = MimeTypes.AUDIO_MPEGH_MHM1;
                    } else if (zza2.startsWith("ac-3") || zza2.startsWith("dac3")) {
                        str3 = MimeTypes.AUDIO_AC3;
                    } else if (zza2.startsWith("ec-3") || zza2.startsWith("dec3")) {
                        str3 = MimeTypes.AUDIO_E_AC3;
                    } else if (zza2.startsWith(MimeTypes.CODEC_E_AC3_JOC)) {
                        str3 = MimeTypes.AUDIO_E_AC3_JOC;
                    } else if (zza2.startsWith("ac-4") || zza2.startsWith("dac4")) {
                        str3 = MimeTypes.AUDIO_AC4;
                    } else if (zza2.startsWith("dtsc")) {
                        str3 = MimeTypes.AUDIO_DTS;
                    } else if (zza2.startsWith("dtse")) {
                        str3 = MimeTypes.AUDIO_DTS_EXPRESS;
                    } else if (zza2.startsWith("dtsh") || zza2.startsWith("dtsl")) {
                        str3 = MimeTypes.AUDIO_DTS_HD;
                    } else if (zza2.startsWith("dtsx")) {
                        str3 = MimeTypes.AUDIO_DTS_X;
                    } else if (zza2.startsWith("opus")) {
                        str3 = MimeTypes.AUDIO_OPUS;
                    } else if (zza2.startsWith("vorbis")) {
                        str3 = MimeTypes.AUDIO_VORBIS;
                    } else if (zza2.startsWith("flac")) {
                        str3 = MimeTypes.AUDIO_FLAC;
                    } else if (zza2.startsWith("stpp")) {
                        str3 = MimeTypes.APPLICATION_TTML;
                    } else if (zza2.startsWith("wvtt")) {
                        str3 = MimeTypes.TEXT_VTT;
                    } else if (zza2.contains("cea708")) {
                        str3 = MimeTypes.APPLICATION_CEA708;
                    } else if (zza2.contains("eia608") || zza2.contains("cea608")) {
                        str3 = MimeTypes.APPLICATION_CEA608;
                    } else {
                        ArrayList arrayList = zzb;
                        int size = arrayList.size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            zzap zzapVar = (zzap) arrayList.get(i);
                            String str7 = zzapVar.zzb;
                            if (zza2.startsWith(null)) {
                                String str8 = zzapVar.zza;
                                break;
                            }
                            i++;
                        }
                    }
                    if (str2.equals(str3)) {
                        if (sb.length() > 0) {
                            sb.append(f.f598a);
                        }
                        sb.append(str6);
                    }
                }
                str3 = null;
                if (str2.equals(str3)) {
                }
            }
            if (sb.length() > 0) {
                str4 = sb.toString();
            }
        }
        return str4 != null;
    }

    public static String zzf(int i) {
        if (i == 32) {
            return MimeTypes.VIDEO_MP4V;
        }
        if (i == 33) {
            return MimeTypes.VIDEO_H264;
        }
        if (i == 35) {
            return MimeTypes.VIDEO_H265;
        }
        if (i == 64) {
            return MimeTypes.AUDIO_AAC;
        }
        if (i == 163) {
            return MimeTypes.VIDEO_VC1;
        }
        if (i == 177) {
            return MimeTypes.VIDEO_VP9;
        }
        if (i == 221) {
            return MimeTypes.AUDIO_VORBIS;
        }
        if (i == 165) {
            return MimeTypes.AUDIO_AC3;
        }
        if (i == 166) {
            return MimeTypes.AUDIO_E_AC3;
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case Log.NONE /* 99 */:
            case 100:
            case 101:
                return MimeTypes.VIDEO_MPEG2;
            case 102:
            case 103:
            case 104:
                return MimeTypes.AUDIO_AAC;
            case LocationRequest.PRIORITY_NO_POWER /* 105 */:
            case 107:
                return MimeTypes.AUDIO_MPEG;
            case 106:
                return MimeTypes.VIDEO_MPEG;
            case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR /* 108 */:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                        return MimeTypes.AUDIO_DTS;
                    case 170:
                    case 171:
                        return MimeTypes.AUDIO_DTS_HD;
                    case 173:
                        return MimeTypes.AUDIO_OPUS;
                    case 174:
                        return MimeTypes.AUDIO_AC4;
                    default:
                        return null;
                }
        }
    }

    public static int zzg(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (zza(str)) {
            return 1;
        }
        if (zzb(str)) {
            return 2;
        }
        if ("text".equals(zzk(str)) || MimeTypes.APPLICATION_MEDIA3_CUES.equals(str) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_RAWCC.equals(str) || MimeTypes.APPLICATION_VOBSUB.equals(str) || MimeTypes.APPLICATION_PGS.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str)) {
            return 3;
        }
        if (zzc(str)) {
            return 4;
        }
        if (MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str) || MimeTypes.APPLICATION_ICY.equals(str) || MimeTypes.APPLICATION_AIT.equals(str)) {
            return 5;
        }
        if (MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) {
            return 6;
        }
        ArrayList arrayList = zzb;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zzap zzapVar = (zzap) arrayList.get(i);
            String str2 = zzapVar.zza;
            if (str.equals(null)) {
                int i2 = zzapVar.zzc;
                return 0;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int zzh(String str, String str2) {
        char c;
        zzaq zzj;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1365340241:
                if (str.equals(MimeTypes.AUDIO_DTS_EXPRESS)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1095064472:
                if (str.equals(MimeTypes.AUDIO_DTS)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals(MimeTypes.AUDIO_AAC)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals(MimeTypes.AUDIO_AC3)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 187078297:
                if (str.equals(MimeTypes.AUDIO_AC4)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 550520934:
                if (str.equals(MimeTypes.AUDIO_DTS_X)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (str.equals(MimeTypes.AUDIO_MPEG)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1504891608:
                if (str.equals(MimeTypes.AUDIO_OPUS)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1505942594:
                if (str.equals(MimeTypes.AUDIO_DTS_HD)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1556697186:
                if (str.equals(MimeTypes.AUDIO_TRUEHD)) {
                    c = '\n';
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
                return 9;
            case 1:
                if (str2 == null || (zzj = zzj(str2)) == null) {
                    return 0;
                }
                return zzj.zza();
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 18;
            case 5:
                return 17;
            case 6:
                return 7;
            case 7:
            case '\b':
                return 8;
            case '\t':
                return 30;
            case '\n':
                return 14;
            case 11:
                return 20;
            default:
                return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String zzi(String str) {
        char c;
        if (str == null) {
            return null;
        }
        String zza2 = zzggj.zza(str);
        switch (zza2.hashCode()) {
            case -1833600100:
                if (zza2.equals("video/x-mvhevc")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1007807498:
                if (zza2.equals("audio/x-flac")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -979095690:
                if (zza2.equals("application/x-mpegurl")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -586683234:
                if (zza2.equals("audio/x-wav")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -432836268:
                if (zza2.equals("audio/mpeg-l1")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -432836267:
                if (zza2.equals("audio/mpeg-l2")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 187090231:
                if (zza2.equals("audio/mp3")) {
                    c = 2;
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
                return MimeTypes.VIDEO_MV_HEVC;
            case 1:
                return MimeTypes.AUDIO_FLAC;
            case 2:
                return MimeTypes.AUDIO_MPEG;
            case 3:
                return MimeTypes.AUDIO_WAV;
            case 4:
                return MimeTypes.APPLICATION_M3U8;
            case 5:
                return MimeTypes.AUDIO_MPEG_L1;
            case 6:
                return MimeTypes.AUDIO_MPEG_L2;
            default:
                return zza2;
        }
    }

    static zzaq zzj(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new zzaq(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static String zzk(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}

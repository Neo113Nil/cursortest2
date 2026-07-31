package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes.dex */
public final class zzagd implements zzagn {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final zzagc zzc = new zzagc(zzaga.zza);
    private static final zzagc zzd = new zzagc(zzafz.zza);

    @Nullable
    private zzgxm zze;
    private final zzanx zzf = new zzans();

    @Override // com.google.android.gms.internal.ads.zzagn
    public final synchronized zzagh[] zza() {
        return zzb(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01fb A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x001f, B:13:0x01fb, B:14:0x01fe, B:19:0x03b2, B:20:0x03b5, B:22:0x03ba, B:25:0x03c0, B:27:0x03c3, B:31:0x03c6, B:36:0x0207, B:38:0x020f, B:40:0x021a, B:43:0x0226, B:45:0x022e, B:47:0x0239, B:50:0x0244, B:53:0x024f, B:56:0x025a, B:58:0x0262, B:60:0x026a, B:62:0x0276, B:64:0x0284, B:66:0x028f, B:69:0x029a, B:71:0x02a2, B:73:0x02b0, B:75:0x02be, B:77:0x02d0, B:79:0x02de, B:81:0x02ea, B:83:0x02f2, B:85:0x02fa, B:87:0x0302, B:89:0x030e, B:91:0x0316, B:93:0x0327, B:95:0x032f, B:97:0x033a, B:99:0x0342, B:101:0x034e, B:103:0x0356, B:105:0x0360, B:108:0x036a, B:111:0x0375, B:114:0x0380, B:116:0x0388, B:118:0x0393, B:120:0x039b, B:122:0x03a5, B:138:0x004a, B:139:0x0052, B:142:0x01c2, B:165:0x0057, B:168:0x0063, B:171:0x006f, B:174:0x007b, B:177:0x0087, B:180:0x0092, B:183:0x009e, B:186:0x00a9, B:189:0x00b4, B:192:0x00c0, B:195:0x00cc, B:198:0x00d8, B:201:0x00e3, B:204:0x00ee, B:207:0x00f9, B:210:0x0105, B:213:0x0110, B:216:0x011b, B:219:0x0127, B:222:0x0133, B:225:0x013f, B:228:0x014b, B:231:0x0157, B:234:0x0163, B:237:0x016e, B:240:0x0179, B:243:0x0184, B:246:0x018f, B:249:0x0199, B:252:0x01a3, B:255:0x01ad, B:258:0x01b7), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x03b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x03ba A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x001f, B:13:0x01fb, B:14:0x01fe, B:19:0x03b2, B:20:0x03b5, B:22:0x03ba, B:25:0x03c0, B:27:0x03c3, B:31:0x03c6, B:36:0x0207, B:38:0x020f, B:40:0x021a, B:43:0x0226, B:45:0x022e, B:47:0x0239, B:50:0x0244, B:53:0x024f, B:56:0x025a, B:58:0x0262, B:60:0x026a, B:62:0x0276, B:64:0x0284, B:66:0x028f, B:69:0x029a, B:71:0x02a2, B:73:0x02b0, B:75:0x02be, B:77:0x02d0, B:79:0x02de, B:81:0x02ea, B:83:0x02f2, B:85:0x02fa, B:87:0x0302, B:89:0x030e, B:91:0x0316, B:93:0x0327, B:95:0x032f, B:97:0x033a, B:99:0x0342, B:101:0x034e, B:103:0x0356, B:105:0x0360, B:108:0x036a, B:111:0x0375, B:114:0x0380, B:116:0x0388, B:118:0x0393, B:120:0x039b, B:122:0x03a5, B:138:0x004a, B:139:0x0052, B:142:0x01c2, B:165:0x0057, B:168:0x0063, B:171:0x006f, B:174:0x007b, B:177:0x0087, B:180:0x0092, B:183:0x009e, B:186:0x00a9, B:189:0x00b4, B:192:0x00c0, B:195:0x00cc, B:198:0x00d8, B:201:0x00e3, B:204:0x00ee, B:207:0x00f9, B:210:0x0105, B:213:0x0110, B:216:0x011b, B:219:0x0127, B:222:0x0133, B:225:0x013f, B:228:0x014b, B:231:0x0157, B:234:0x0163, B:237:0x016e, B:240:0x0179, B:243:0x0184, B:246:0x018f, B:249:0x0199, B:252:0x01a3, B:255:0x01ad, B:258:0x01b7), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0207 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x001f, B:13:0x01fb, B:14:0x01fe, B:19:0x03b2, B:20:0x03b5, B:22:0x03ba, B:25:0x03c0, B:27:0x03c3, B:31:0x03c6, B:36:0x0207, B:38:0x020f, B:40:0x021a, B:43:0x0226, B:45:0x022e, B:47:0x0239, B:50:0x0244, B:53:0x024f, B:56:0x025a, B:58:0x0262, B:60:0x026a, B:62:0x0276, B:64:0x0284, B:66:0x028f, B:69:0x029a, B:71:0x02a2, B:73:0x02b0, B:75:0x02be, B:77:0x02d0, B:79:0x02de, B:81:0x02ea, B:83:0x02f2, B:85:0x02fa, B:87:0x0302, B:89:0x030e, B:91:0x0316, B:93:0x0327, B:95:0x032f, B:97:0x033a, B:99:0x0342, B:101:0x034e, B:103:0x0356, B:105:0x0360, B:108:0x036a, B:111:0x0375, B:114:0x0380, B:116:0x0388, B:118:0x0393, B:120:0x039b, B:122:0x03a5, B:138:0x004a, B:139:0x0052, B:142:0x01c2, B:165:0x0057, B:168:0x0063, B:171:0x006f, B:174:0x007b, B:177:0x0087, B:180:0x0092, B:183:0x009e, B:186:0x00a9, B:189:0x00b4, B:192:0x00c0, B:195:0x00cc, B:198:0x00d8, B:201:0x00e3, B:204:0x00ee, B:207:0x00f9, B:210:0x0105, B:213:0x0110, B:216:0x011b, B:219:0x0127, B:222:0x0133, B:225:0x013f, B:228:0x014b, B:231:0x0157, B:234:0x0163, B:237:0x016e, B:240:0x0179, B:243:0x0184, B:246:0x018f, B:249:0x0199, B:252:0x01a3, B:255:0x01ad, B:258:0x01b7), top: B:3:0x0003 }] */
    @Override // com.google.android.gms.internal.ads.zzagn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized zzagh[] zzb(Uri uri, Map map) {
        ArrayList arrayList;
        char c;
        int i;
        String lastPathSegment;
        int i2;
        int i3;
        try {
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            String str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
            if (str != null) {
                String zzh = zzas.zzh(str);
                switch (zzh.hashCode()) {
                    case -2123537834:
                        if (zzh.equals("audio/eac3-joc")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1662384011:
                        if (zzh.equals("video/mp2p")) {
                            c = 20;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1662384007:
                        if (zzh.equals("video/mp2t")) {
                            c = 21;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1662095187:
                        if (zzh.equals("video/webm")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1606874997:
                        if (zzh.equals("audio/amr-wb")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1487656890:
                        if (zzh.equals("image/avif")) {
                            c = 31;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1487464693:
                        if (zzh.equals("image/heic")) {
                            c = 30;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1487464690:
                        if (zzh.equals("image/heif")) {
                            c = 29;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1487394660:
                        if (zzh.equals("image/jpeg")) {
                            c = 24;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1487018032:
                        if (zzh.equals("image/webp")) {
                            c = 27;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1248337486:
                        if (zzh.equals("application/mp4")) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1079884372:
                        if (zzh.equals("video/x-msvideo")) {
                            c = 25;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1004728940:
                        if (zzh.equals("text/vtt")) {
                            c = 23;
                            break;
                        }
                        c = 65535;
                        break;
                    case -879272239:
                        if (zzh.equals("image/bmp")) {
                            c = 28;
                            break;
                        }
                        c = 65535;
                        break;
                    case -879258763:
                        if (zzh.equals("image/png")) {
                            c = 26;
                            break;
                        }
                        c = 65535;
                        break;
                    case -387023398:
                        if (zzh.equals("audio/x-matroska")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case -43467528:
                        if (zzh.equals("application/webm")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case 13915911:
                        if (zzh.equals("video/x-flv")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 187078296:
                        if (zzh.equals("audio/ac3")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 187078297:
                        if (zzh.equals("audio/ac4")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 187078669:
                        if (zzh.equals("audio/amr")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 187090232:
                        if (zzh.equals("audio/mp4")) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case 187091926:
                        if (zzh.equals("audio/ogg")) {
                            c = 19;
                            break;
                        }
                        c = 65535;
                        break;
                    case 187099443:
                        if (zzh.equals("audio/wav")) {
                            c = 22;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1331848029:
                        if (zzh.equals("video/mp4")) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1503095341:
                        if (zzh.equals("audio/3gpp")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1504578661:
                        if (zzh.equals("audio/eac3")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1504619009:
                        if (zzh.equals("audio/flac")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1504824762:
                        if (zzh.equals("audio/midi")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1504831518:
                        if (zzh.equals("audio/mpeg")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1505118770:
                        if (zzh.equals("audio/webm")) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2039520277:
                        if (zzh.equals("video/x-matroska")) {
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
                    case 1:
                    case 2:
                        i = 0;
                        break;
                    case 3:
                        i = 1;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        i = 3;
                        break;
                    case 7:
                        i = 4;
                        break;
                    case '\b':
                        i = 5;
                        break;
                    case '\t':
                        i = 15;
                        break;
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                    case 14:
                        i = 6;
                        break;
                    case 15:
                        i = 7;
                        break;
                    case 16:
                    case 17:
                    case 18:
                        i = 8;
                        break;
                    case 19:
                        i = 9;
                        break;
                    case 20:
                        i = 10;
                        break;
                    case 21:
                        i = 11;
                        break;
                    case 22:
                        i = 12;
                        break;
                    case 23:
                        i = 13;
                        break;
                    case 24:
                        i = 14;
                        break;
                    case 25:
                        i = 16;
                        break;
                    case 26:
                        i = 17;
                        break;
                    case 27:
                        i = 18;
                        break;
                    case 28:
                        i = 19;
                        break;
                    case 29:
                    case 30:
                        i = 20;
                        break;
                    case 31:
                        i = 21;
                        break;
                }
                if (i != -1) {
                    zzc(i, arrayList);
                }
                lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
                        i2 = 0;
                    } else if (lastPathSegment.endsWith(".ac4")) {
                        i2 = 1;
                    } else if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
                        i2 = 2;
                    } else if (lastPathSegment.endsWith(".amr")) {
                        i2 = 3;
                    } else if (lastPathSegment.endsWith(".flac")) {
                        i2 = 4;
                    } else if (lastPathSegment.endsWith(".flv")) {
                        i2 = 5;
                    } else if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
                        i2 = 15;
                    } else if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
                        i2 = 6;
                    } else if (lastPathSegment.endsWith(".mp3")) {
                        i2 = 7;
                    } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                        i2 = 8;
                    } else if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
                        i2 = 9;
                    } else if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
                        i2 = 10;
                    } else if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                        i2 = 11;
                    } else if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
                        i2 = 12;
                    } else if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
                        i2 = 13;
                    } else if (lastPathSegment.endsWith(BrandSafetyUtils.a) || lastPathSegment.endsWith(".jpeg")) {
                        i2 = 14;
                    } else if (lastPathSegment.endsWith(".avi")) {
                        i2 = 16;
                    } else if (lastPathSegment.endsWith(".png")) {
                        i2 = 17;
                    } else if (lastPathSegment.endsWith(".webp")) {
                        i2 = 18;
                    } else if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
                        i2 = 19;
                    } else if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
                        i2 = 20;
                    } else if (lastPathSegment.endsWith(".avif")) {
                        i2 = 21;
                    }
                    if (i2 != -1 && i2 != i) {
                        zzc(i2, arrayList);
                    }
                    int[] iArr = zzb;
                    for (i3 = 0; i3 < 21; i3++) {
                        int i4 = iArr[i3];
                        if (i4 != i && i4 != i2) {
                            zzc(i4, arrayList);
                        }
                    }
                }
                i2 = -1;
                if (i2 != -1) {
                    zzc(i2, arrayList);
                }
                int[] iArr2 = zzb;
                while (i3 < 21) {
                }
            }
            i = -1;
            if (i != -1) {
            }
            lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
            }
            i2 = -1;
            if (i2 != -1) {
            }
            int[] iArr22 = zzb;
            while (i3 < 21) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return (zzagh[]) arrayList.toArray(new zzagh[0]);
    }

    private final void zzc(int i, List list) {
        switch (i) {
            case 0:
                list.add(new zzapw());
                break;
            case 1:
                list.add(new zzapz());
                break;
            case 2:
                list.add(new zzaqc(0));
                break;
            case 3:
                list.add(new zzahy(0));
                break;
            case 4:
                zzagh zza2 = zzc.zza(0);
                if (zza2 == null) {
                    list.add(new zzaip(0));
                    break;
                } else {
                    list.add(zza2);
                    break;
                }
            case 5:
                list.add(new zzais());
                break;
            case 6:
                list.add(new zzakt(this.zzf, 0));
                break;
            case 7:
                list.add(new zzalb(0));
                break;
            case 8:
                zzanx zzanxVar = this.zzf;
                list.add(new zzamd(zzanxVar, 704, null, null, zzgxm.zzi(), null));
                list.add(new zzamp(zzanxVar, 160));
                break;
            case 9:
                list.add(new zzang());
                break;
            case 10:
                list.add(new zzarg());
                break;
            case 11:
                if (this.zze == null) {
                    this.zze = zzgxm.zzi();
                }
                list.add(new zzarr(1, 0, this.zzf, new zzfj(0L), new zzaqe(0, this.zze), 112800));
                break;
            case 12:
                list.add(new zzase());
                break;
            case 14:
                list.add(new zzaja(0));
                break;
            case 15:
                zzagh zza3 = zzd.zza(new Object[0]);
                if (zza3 != null) {
                    list.add(zza3);
                    break;
                }
                break;
            case 16:
                list.add(new zzaic(0, this.zzf));
                break;
            case 17:
                list.add(new zzanq());
                break;
            case 18:
                list.add(new zzasj());
                break;
            case 19:
                list.add(new zzaik());
                break;
            case 20:
                list.add(new zzaiy(0));
                break;
            case 21:
                list.add(new zzaij());
                break;
        }
    }
}

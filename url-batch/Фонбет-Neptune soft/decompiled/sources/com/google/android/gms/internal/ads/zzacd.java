package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.common.net.HttpHeaders;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzacd implements zzacp {
    private static final int[] zza = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final zzacc zzb = new zzacc(new zzacb() { // from class: com.google.android.gms.internal.ads.zzabz
        @Override // com.google.android.gms.internal.ads.zzacb
        public final Constructor zza() {
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzack.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });
    private static final zzacc zzc = new zzacc(new zzacb() { // from class: com.google.android.gms.internal.ads.zzaca
        @Override // com.google.android.gms.internal.ads.zzacb
        public final Constructor zza() {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(zzack.class).getConstructor(new Class[0]);
        }
    });
    private zzfxr zzd;
    private final zzajy zze = new zzajt();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0203 A[Catch: all -> 0x042c, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x0203, B:15:0x0206, B:20:0x03ce, B:21:0x03d1, B:23:0x03d6, B:26:0x03dc, B:28:0x03df, B:32:0x03e2, B:33:0x03e9, B:35:0x03ef, B:37:0x03fd, B:39:0x0405, B:41:0x040d, B:43:0x0415, B:45:0x041d, B:46:0x0425, B:53:0x020f, B:55:0x0217, B:58:0x0221, B:61:0x022c, B:63:0x0234, B:66:0x023e, B:69:0x0249, B:72:0x0254, B:75:0x025f, B:77:0x0267, B:79:0x026f, B:82:0x0279, B:84:0x0287, B:87:0x0291, B:90:0x029c, B:92:0x02a4, B:94:0x02b2, B:96:0x02c0, B:99:0x02d0, B:101:0x02de, B:104:0x02e8, B:106:0x02f0, B:108:0x02f8, B:110:0x0300, B:113:0x030a, B:115:0x0312, B:118:0x0322, B:120:0x032a, B:123:0x0334, B:125:0x033c, B:128:0x0346, B:130:0x034e, B:133:0x0357, B:136:0x0363, B:139:0x036f, B:142:0x037a, B:144:0x0382, B:147:0x038b, B:149:0x0393, B:152:0x039c, B:168:0x0048, B:169:0x0050, B:172:0x01c5, B:195:0x0055, B:198:0x0061, B:201:0x006d, B:204:0x0079, B:207:0x0085, B:210:0x0090, B:213:0x009b, B:216:0x00a6, B:219:0x00b2, B:222:0x00be, B:225:0x00ca, B:228:0x00d6, B:231:0x00e1, B:234:0x00ec, B:237:0x00f7, B:240:0x0103, B:243:0x010f, B:246:0x011b, B:249:0x0127, B:252:0x0133, B:255:0x013f, B:258:0x014b, B:261:0x0157, B:264:0x0163, B:267:0x016e, B:270:0x0179, B:273:0x0184, B:276:0x018f, B:279:0x0199, B:282:0x01a4, B:285:0x01af, B:288:0x01ba), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0048 A[Catch: all -> 0x042c, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x0203, B:15:0x0206, B:20:0x03ce, B:21:0x03d1, B:23:0x03d6, B:26:0x03dc, B:28:0x03df, B:32:0x03e2, B:33:0x03e9, B:35:0x03ef, B:37:0x03fd, B:39:0x0405, B:41:0x040d, B:43:0x0415, B:45:0x041d, B:46:0x0425, B:53:0x020f, B:55:0x0217, B:58:0x0221, B:61:0x022c, B:63:0x0234, B:66:0x023e, B:69:0x0249, B:72:0x0254, B:75:0x025f, B:77:0x0267, B:79:0x026f, B:82:0x0279, B:84:0x0287, B:87:0x0291, B:90:0x029c, B:92:0x02a4, B:94:0x02b2, B:96:0x02c0, B:99:0x02d0, B:101:0x02de, B:104:0x02e8, B:106:0x02f0, B:108:0x02f8, B:110:0x0300, B:113:0x030a, B:115:0x0312, B:118:0x0322, B:120:0x032a, B:123:0x0334, B:125:0x033c, B:128:0x0346, B:130:0x034e, B:133:0x0357, B:136:0x0363, B:139:0x036f, B:142:0x037a, B:144:0x0382, B:147:0x038b, B:149:0x0393, B:152:0x039c, B:168:0x0048, B:169:0x0050, B:172:0x01c5, B:195:0x0055, B:198:0x0061, B:201:0x006d, B:204:0x0079, B:207:0x0085, B:210:0x0090, B:213:0x009b, B:216:0x00a6, B:219:0x00b2, B:222:0x00be, B:225:0x00ca, B:228:0x00d6, B:231:0x00e1, B:234:0x00ec, B:237:0x00f7, B:240:0x0103, B:243:0x010f, B:246:0x011b, B:249:0x0127, B:252:0x0133, B:255:0x013f, B:258:0x014b, B:261:0x0157, B:264:0x0163, B:267:0x016e, B:270:0x0179, B:273:0x0184, B:276:0x018f, B:279:0x0199, B:282:0x01a4, B:285:0x01af, B:288:0x01ba), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x03cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03d6 A[Catch: all -> 0x042c, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x0203, B:15:0x0206, B:20:0x03ce, B:21:0x03d1, B:23:0x03d6, B:26:0x03dc, B:28:0x03df, B:32:0x03e2, B:33:0x03e9, B:35:0x03ef, B:37:0x03fd, B:39:0x0405, B:41:0x040d, B:43:0x0415, B:45:0x041d, B:46:0x0425, B:53:0x020f, B:55:0x0217, B:58:0x0221, B:61:0x022c, B:63:0x0234, B:66:0x023e, B:69:0x0249, B:72:0x0254, B:75:0x025f, B:77:0x0267, B:79:0x026f, B:82:0x0279, B:84:0x0287, B:87:0x0291, B:90:0x029c, B:92:0x02a4, B:94:0x02b2, B:96:0x02c0, B:99:0x02d0, B:101:0x02de, B:104:0x02e8, B:106:0x02f0, B:108:0x02f8, B:110:0x0300, B:113:0x030a, B:115:0x0312, B:118:0x0322, B:120:0x032a, B:123:0x0334, B:125:0x033c, B:128:0x0346, B:130:0x034e, B:133:0x0357, B:136:0x0363, B:139:0x036f, B:142:0x037a, B:144:0x0382, B:147:0x038b, B:149:0x0393, B:152:0x039c, B:168:0x0048, B:169:0x0050, B:172:0x01c5, B:195:0x0055, B:198:0x0061, B:201:0x006d, B:204:0x0079, B:207:0x0085, B:210:0x0090, B:213:0x009b, B:216:0x00a6, B:219:0x00b2, B:222:0x00be, B:225:0x00ca, B:228:0x00d6, B:231:0x00e1, B:234:0x00ec, B:237:0x00f7, B:240:0x0103, B:243:0x010f, B:246:0x011b, B:249:0x0127, B:252:0x0133, B:255:0x013f, B:258:0x014b, B:261:0x0157, B:264:0x0163, B:267:0x016e, B:270:0x0179, B:273:0x0184, B:276:0x018f, B:279:0x0199, B:282:0x01a4, B:285:0x01af, B:288:0x01ba), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x03ef A[Catch: all -> 0x042c, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x0203, B:15:0x0206, B:20:0x03ce, B:21:0x03d1, B:23:0x03d6, B:26:0x03dc, B:28:0x03df, B:32:0x03e2, B:33:0x03e9, B:35:0x03ef, B:37:0x03fd, B:39:0x0405, B:41:0x040d, B:43:0x0415, B:45:0x041d, B:46:0x0425, B:53:0x020f, B:55:0x0217, B:58:0x0221, B:61:0x022c, B:63:0x0234, B:66:0x023e, B:69:0x0249, B:72:0x0254, B:75:0x025f, B:77:0x0267, B:79:0x026f, B:82:0x0279, B:84:0x0287, B:87:0x0291, B:90:0x029c, B:92:0x02a4, B:94:0x02b2, B:96:0x02c0, B:99:0x02d0, B:101:0x02de, B:104:0x02e8, B:106:0x02f0, B:108:0x02f8, B:110:0x0300, B:113:0x030a, B:115:0x0312, B:118:0x0322, B:120:0x032a, B:123:0x0334, B:125:0x033c, B:128:0x0346, B:130:0x034e, B:133:0x0357, B:136:0x0363, B:139:0x036f, B:142:0x037a, B:144:0x0382, B:147:0x038b, B:149:0x0393, B:152:0x039c, B:168:0x0048, B:169:0x0050, B:172:0x01c5, B:195:0x0055, B:198:0x0061, B:201:0x006d, B:204:0x0079, B:207:0x0085, B:210:0x0090, B:213:0x009b, B:216:0x00a6, B:219:0x00b2, B:222:0x00be, B:225:0x00ca, B:228:0x00d6, B:231:0x00e1, B:234:0x00ec, B:237:0x00f7, B:240:0x0103, B:243:0x010f, B:246:0x011b, B:249:0x0127, B:252:0x0133, B:255:0x013f, B:258:0x014b, B:261:0x0157, B:264:0x0163, B:267:0x016e, B:270:0x0179, B:273:0x0184, B:276:0x018f, B:279:0x0199, B:282:0x01a4, B:285:0x01af, B:288:0x01ba), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x020f A[Catch: all -> 0x042c, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x0203, B:15:0x0206, B:20:0x03ce, B:21:0x03d1, B:23:0x03d6, B:26:0x03dc, B:28:0x03df, B:32:0x03e2, B:33:0x03e9, B:35:0x03ef, B:37:0x03fd, B:39:0x0405, B:41:0x040d, B:43:0x0415, B:45:0x041d, B:46:0x0425, B:53:0x020f, B:55:0x0217, B:58:0x0221, B:61:0x022c, B:63:0x0234, B:66:0x023e, B:69:0x0249, B:72:0x0254, B:75:0x025f, B:77:0x0267, B:79:0x026f, B:82:0x0279, B:84:0x0287, B:87:0x0291, B:90:0x029c, B:92:0x02a4, B:94:0x02b2, B:96:0x02c0, B:99:0x02d0, B:101:0x02de, B:104:0x02e8, B:106:0x02f0, B:108:0x02f8, B:110:0x0300, B:113:0x030a, B:115:0x0312, B:118:0x0322, B:120:0x032a, B:123:0x0334, B:125:0x033c, B:128:0x0346, B:130:0x034e, B:133:0x0357, B:136:0x0363, B:139:0x036f, B:142:0x037a, B:144:0x0382, B:147:0x038b, B:149:0x0393, B:152:0x039c, B:168:0x0048, B:169:0x0050, B:172:0x01c5, B:195:0x0055, B:198:0x0061, B:201:0x006d, B:204:0x0079, B:207:0x0085, B:210:0x0090, B:213:0x009b, B:216:0x00a6, B:219:0x00b2, B:222:0x00be, B:225:0x00ca, B:228:0x00d6, B:231:0x00e1, B:234:0x00ec, B:237:0x00f7, B:240:0x0103, B:243:0x010f, B:246:0x011b, B:249:0x0127, B:252:0x0133, B:255:0x013f, B:258:0x014b, B:261:0x0157, B:264:0x0163, B:267:0x016e, B:270:0x0179, B:273:0x0184, B:276:0x018f, B:279:0x0199, B:282:0x01a4, B:285:0x01af, B:288:0x01ba), top: B:3:0x0003 }] */
    @Override // com.google.android.gms.internal.ads.zzacp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized zzack[] zza(Uri uri, Map map) {
        String str;
        char c;
        int i;
        String lastPathSegment;
        int i2;
        int i3;
        zzack[] zzackVarArr;
        int i4;
        ArrayList arrayList = new ArrayList(21);
        List list = (List) map.get(HttpHeaders.CONTENT_TYPE);
        if (list != null && !list.isEmpty()) {
            str = (String) list.get(0);
            if (str != null) {
                String zze = zzbn.zze(str);
                switch (zze.hashCode()) {
                    case -2123537834:
                        if (zze.equals("audio/eac3-joc")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1662384011:
                        if (zze.equals("video/mp2p")) {
                            c = 20;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1662384007:
                        if (zze.equals("video/mp2t")) {
                            c = 21;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1662095187:
                        if (zze.equals("video/webm")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1606874997:
                        if (zze.equals("audio/amr-wb")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1487656890:
                        if (zze.equals("image/avif")) {
                            c = 31;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1487464693:
                        if (zze.equals("image/heic")) {
                            c = 30;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1487464690:
                        if (zze.equals("image/heif")) {
                            c = 29;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1487394660:
                        if (zze.equals("image/jpeg")) {
                            c = 24;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1487018032:
                        if (zze.equals("image/webp")) {
                            c = 27;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1248337486:
                        if (zze.equals("application/mp4")) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1079884372:
                        if (zze.equals("video/x-msvideo")) {
                            c = 25;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1004728940:
                        if (zze.equals("text/vtt")) {
                            c = 23;
                            break;
                        }
                        c = 65535;
                        break;
                    case -879272239:
                        if (zze.equals("image/bmp")) {
                            c = 28;
                            break;
                        }
                        c = 65535;
                        break;
                    case -879258763:
                        if (zze.equals("image/png")) {
                            c = 26;
                            break;
                        }
                        c = 65535;
                        break;
                    case -387023398:
                        if (zze.equals("audio/x-matroska")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case -43467528:
                        if (zze.equals("application/webm")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case 13915911:
                        if (zze.equals("video/x-flv")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 187078296:
                        if (zze.equals("audio/ac3")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 187078297:
                        if (zze.equals("audio/ac4")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 187078669:
                        if (zze.equals("audio/amr")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 187090232:
                        if (zze.equals("audio/mp4")) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case 187091926:
                        if (zze.equals("audio/ogg")) {
                            c = 19;
                            break;
                        }
                        c = 65535;
                        break;
                    case 187099443:
                        if (zze.equals("audio/wav")) {
                            c = 22;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1331848029:
                        if (zze.equals("video/mp4")) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1503095341:
                        if (zze.equals("audio/3gpp")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1504578661:
                        if (zze.equals("audio/eac3")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1504619009:
                        if (zze.equals("audio/flac")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1504824762:
                        if (zze.equals("audio/midi")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1504831518:
                        if (zze.equals("audio/mpeg")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1505118770:
                        if (zze.equals("audio/webm")) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2039520277:
                        if (zze.equals("video/x-matroska")) {
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
                    zzb(i, arrayList);
                }
                lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
                        if (lastPathSegment.endsWith(".ac4")) {
                            i2 = 1;
                        } else {
                            if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                                if (lastPathSegment.endsWith(".amr")) {
                                    i2 = 3;
                                } else if (lastPathSegment.endsWith(".flac")) {
                                    i2 = 4;
                                } else if (lastPathSegment.endsWith(".flv")) {
                                    i2 = 5;
                                } else {
                                    if (!lastPathSegment.endsWith(".mid") && !lastPathSegment.endsWith(".midi") && !lastPathSegment.endsWith(".smf")) {
                                        if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                                            if (lastPathSegment.endsWith(".mp3")) {
                                                i2 = 7;
                                            } else {
                                                if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                                                    if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                                                        if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                                            if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                                                if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                                                    if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                                                        if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
                                                                            if (lastPathSegment.endsWith(".avi")) {
                                                                                i2 = 16;
                                                                            } else if (lastPathSegment.endsWith(".png")) {
                                                                                i2 = 17;
                                                                            } else if (lastPathSegment.endsWith(".webp")) {
                                                                                i2 = 18;
                                                                            } else {
                                                                                if (!lastPathSegment.endsWith(".bmp") && !lastPathSegment.endsWith(".dib")) {
                                                                                    if (!lastPathSegment.endsWith(".heic") && !lastPathSegment.endsWith(".heif")) {
                                                                                        if (lastPathSegment.endsWith(".avif")) {
                                                                                            i2 = 21;
                                                                                        }
                                                                                    }
                                                                                    i2 = 20;
                                                                                }
                                                                                i2 = 19;
                                                                            }
                                                                        }
                                                                        i2 = 14;
                                                                    }
                                                                    i2 = 13;
                                                                }
                                                                i2 = 12;
                                                            }
                                                            i2 = 11;
                                                        }
                                                        i2 = 10;
                                                    }
                                                    i2 = 9;
                                                }
                                                i2 = 8;
                                            }
                                        }
                                        i2 = 6;
                                    }
                                    i2 = 15;
                                }
                            }
                            i2 = 2;
                        }
                        if (i2 != -1 && i2 != i) {
                            zzb(i2, arrayList);
                        }
                        int[] iArr = zza;
                        for (i3 = 0; i3 < 21; i3++) {
                            int i5 = iArr[i3];
                            if (i5 != i && i5 != i2) {
                                zzb(i5, arrayList);
                            }
                        }
                        zzackVarArr = new zzack[arrayList.size()];
                        for (i4 = 0; i4 < arrayList.size(); i4++) {
                            zzack zzackVar = (zzack) arrayList.get(i4);
                            if (!(zzackVar.zzc() instanceof zzail) && !(zzackVar.zzc() instanceof zzaiq) && !(zzackVar.zzc() instanceof zzano) && !(zzackVar.zzc() instanceof zzaeb) && !(zzackVar.zzc() instanceof zzahj)) {
                                zzackVar = new zzakb(zzackVar, this.zze);
                            }
                            zzackVarArr[i4] = zzackVar;
                        }
                    }
                    i2 = 0;
                    if (i2 != -1) {
                        zzb(i2, arrayList);
                    }
                    int[] iArr2 = zza;
                    while (i3 < 21) {
                    }
                    zzackVarArr = new zzack[arrayList.size()];
                    while (i4 < arrayList.size()) {
                    }
                }
                i2 = -1;
                if (i2 != -1) {
                }
                int[] iArr22 = zza;
                while (i3 < 21) {
                }
                zzackVarArr = new zzack[arrayList.size()];
                while (i4 < arrayList.size()) {
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
            int[] iArr222 = zza;
            while (i3 < 21) {
            }
            zzackVarArr = new zzack[arrayList.size()];
            while (i4 < arrayList.size()) {
            }
        }
        str = null;
        if (str != null) {
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
        int[] iArr2222 = zza;
        while (i3 < 21) {
        }
        zzackVarArr = new zzack[arrayList.size()];
        while (i4 < arrayList.size()) {
        }
        return zzackVarArr;
    }

    private final void zzb(int i, List list) {
        switch (i) {
            case 0:
                list.add(new zzalw());
                break;
            case 1:
                list.add(new zzaly());
                break;
            case 2:
                list.add(new zzama(0));
                break;
            case 3:
                list.add(new zzadw(0));
                break;
            case 4:
                zzack zza2 = zzb.zza(0);
                if (zza2 == null) {
                    list.add(new zzaeo(0));
                    break;
                } else {
                    list.add(zza2);
                    break;
                }
            case 5:
                list.add(new zzaeq());
                break;
            case 6:
                list.add(new zzahj(this.zze, 0));
                break;
            case 7:
                list.add(new zzahp(0));
                break;
            case 8:
                list.add(new zzail(this.zze, 0, null, null, zzfxr.zzm(), null));
                list.add(new zzaiq(this.zze, 0));
                break;
            case 9:
                list.add(new zzajg());
                break;
            case 10:
                list.add(new zzanf());
                break;
            case 11:
                if (this.zzd == null) {
                    this.zzd = zzfxr.zzm();
                }
                list.add(new zzano(1, 0, this.zze, new zzer(0L), new zzamc(0, this.zzd), 112800));
                break;
            case 12:
                list.add(new zzanz());
                break;
            case 14:
                list.add(new zzaew(0));
                break;
            case 15:
                zzack zza3 = zzc.zza(new Object[0]);
                if (zza3 != null) {
                    list.add(zza3);
                    break;
                }
                break;
            case 16:
                list.add(new zzaeb(0, this.zze));
                break;
            case 17:
                list.add(new zzajr());
                break;
            case 18:
                list.add(new zzaoe());
                break;
            case 19:
                list.add(new zzaej());
                break;
            case 20:
                list.add(new zzaev());
                break;
            case 21:
                list.add(new zzaei());
                break;
        }
    }
}

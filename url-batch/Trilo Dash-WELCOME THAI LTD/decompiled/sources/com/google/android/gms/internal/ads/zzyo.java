package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzyo implements zzyz {
    private static final int[] zza = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};
    private static final zzyn zzc = new zzyn();

    @Override // com.google.android.gms.internal.ads.zzyz
    public final synchronized zzys[] zza() {
        return zzb(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x02d0, code lost:
    
        if (r15 == r3) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x02d2, code lost:
    
        zzc(r15, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0181 A[Catch: all -> 0x02f4, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:13:0x0181, B:14:0x0184, B:19:0x02d2, B:20:0x02d5, B:22:0x02da, B:25:0x02e0, B:27:0x02e3, B:31:0x02e6, B:36:0x018d, B:38:0x0195, B:41:0x019f, B:44:0x01aa, B:46:0x01b2, B:49:0x01bc, B:52:0x01c7, B:55:0x01d2, B:58:0x01dd, B:60:0x01eb, B:63:0x01f5, B:66:0x0200, B:68:0x0208, B:70:0x0216, B:72:0x0224, B:75:0x0234, B:77:0x0242, B:80:0x024c, B:82:0x0254, B:84:0x025c, B:86:0x0264, B:89:0x026e, B:91:0x0276, B:94:0x0285, B:96:0x028d, B:99:0x0296, B:101:0x029e, B:104:0x02a7, B:106:0x02af, B:117:0x003b, B:118:0x0043, B:121:0x0158, B:137:0x0048, B:140:0x0054, B:143:0x0060, B:146:0x006c, B:149:0x0077, B:152:0x0082, B:155:0x008d, B:158:0x0099, B:161:0x00a5, B:164:0x00b1, B:167:0x00bd, B:170:0x00c8, B:173:0x00d3, B:176:0x00de, B:179:0x00ea, B:182:0x00f6, B:185:0x0101, B:188:0x010c, B:191:0x0117, B:194:0x0122, B:197:0x012c, B:200:0x0137, B:203:0x0142, B:206:0x014d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02da A[Catch: all -> 0x02f4, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:13:0x0181, B:14:0x0184, B:19:0x02d2, B:20:0x02d5, B:22:0x02da, B:25:0x02e0, B:27:0x02e3, B:31:0x02e6, B:36:0x018d, B:38:0x0195, B:41:0x019f, B:44:0x01aa, B:46:0x01b2, B:49:0x01bc, B:52:0x01c7, B:55:0x01d2, B:58:0x01dd, B:60:0x01eb, B:63:0x01f5, B:66:0x0200, B:68:0x0208, B:70:0x0216, B:72:0x0224, B:75:0x0234, B:77:0x0242, B:80:0x024c, B:82:0x0254, B:84:0x025c, B:86:0x0264, B:89:0x026e, B:91:0x0276, B:94:0x0285, B:96:0x028d, B:99:0x0296, B:101:0x029e, B:104:0x02a7, B:106:0x02af, B:117:0x003b, B:118:0x0043, B:121:0x0158, B:137:0x0048, B:140:0x0054, B:143:0x0060, B:146:0x006c, B:149:0x0077, B:152:0x0082, B:155:0x008d, B:158:0x0099, B:161:0x00a5, B:164:0x00b1, B:167:0x00bd, B:170:0x00c8, B:173:0x00d3, B:176:0x00de, B:179:0x00ea, B:182:0x00f6, B:185:0x0101, B:188:0x010c, B:191:0x0117, B:194:0x0122, B:197:0x012c, B:200:0x0137, B:203:0x0142, B:206:0x014d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x018d A[Catch: all -> 0x02f4, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:13:0x0181, B:14:0x0184, B:19:0x02d2, B:20:0x02d5, B:22:0x02da, B:25:0x02e0, B:27:0x02e3, B:31:0x02e6, B:36:0x018d, B:38:0x0195, B:41:0x019f, B:44:0x01aa, B:46:0x01b2, B:49:0x01bc, B:52:0x01c7, B:55:0x01d2, B:58:0x01dd, B:60:0x01eb, B:63:0x01f5, B:66:0x0200, B:68:0x0208, B:70:0x0216, B:72:0x0224, B:75:0x0234, B:77:0x0242, B:80:0x024c, B:82:0x0254, B:84:0x025c, B:86:0x0264, B:89:0x026e, B:91:0x0276, B:94:0x0285, B:96:0x028d, B:99:0x0296, B:101:0x029e, B:104:0x02a7, B:106:0x02af, B:117:0x003b, B:118:0x0043, B:121:0x0158, B:137:0x0048, B:140:0x0054, B:143:0x0060, B:146:0x006c, B:149:0x0077, B:152:0x0082, B:155:0x008d, B:158:0x0099, B:161:0x00a5, B:164:0x00b1, B:167:0x00bd, B:170:0x00c8, B:173:0x00d3, B:176:0x00de, B:179:0x00ea, B:182:0x00f6, B:185:0x0101, B:188:0x010c, B:191:0x0117, B:194:0x0122, B:197:0x012c, B:200:0x0137, B:203:0x0142, B:206:0x014d), top: B:2:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzyz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized zzys[] zzb(Uri uri, Map map) {
        ArrayList arrayList;
        char c;
        int i;
        String lastPathSegment;
        int i2;
        arrayList = new ArrayList(14);
        List list = (List) map.get("Content-Type");
        String str = null;
        if (list != null && !list.isEmpty()) {
            str = (String) list.get(0);
        }
        int i3 = 10;
        if (str != null) {
            String zze = zzbo.zze(str);
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
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case -1662384007:
                    if (zze.equals("video/mp2t")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case -1662095187:
                    if (zze.equals("video/webm")) {
                        c = 11;
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
                case -1487394660:
                    if (zze.equals("image/jpeg")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case -1248337486:
                    if (zze.equals("application/mp4")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case -1004728940:
                    if (zze.equals("text/vtt")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case -387023398:
                    if (zze.equals("audio/x-matroska")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -43467528:
                    if (zze.equals("application/webm")) {
                        c = '\r';
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
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 187091926:
                    if (zze.equals("audio/ogg")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 187099443:
                    if (zze.equals("audio/wav")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 1331848029:
                    if (zze.equals("video/mp4")) {
                        c = 15;
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
                case 1504831518:
                    if (zze.equals("audio/mpeg")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 1505118770:
                    if (zze.equals("audio/webm")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 2039520277:
                    if (zze.equals("video/x-matroska")) {
                        c = '\t';
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
                case '\n':
                case 11:
                case '\f':
                case '\r':
                    i = 6;
                    break;
                case 14:
                    i = 7;
                    break;
                case 15:
                case 16:
                case 17:
                    i = 8;
                    break;
                case 18:
                    i = 9;
                    break;
                case 19:
                    i = 10;
                    break;
                case 20:
                    i = 11;
                    break;
                case 21:
                    i = 12;
                    break;
                case 22:
                    i = 13;
                    break;
                case 23:
                    i = 14;
                    break;
            }
            if (i != -1) {
                zzc(i, arrayList);
            }
            lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
                    if (lastPathSegment.endsWith(".ac4")) {
                        i3 = 1;
                    } else {
                        if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                            if (lastPathSegment.endsWith(".amr")) {
                                i3 = 3;
                            } else if (lastPathSegment.endsWith(".flac")) {
                                i3 = 4;
                            } else if (lastPathSegment.endsWith(".flv")) {
                                i3 = 5;
                            } else {
                                if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                                    if (lastPathSegment.endsWith(".mp3")) {
                                        i3 = 7;
                                    } else {
                                        if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                                            if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                                                if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                                    if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                                        if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                                            if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                                                if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
                                                                    i3 = 14;
                                                                }
                                                            }
                                                            i3 = 13;
                                                        }
                                                        i3 = 12;
                                                    }
                                                    i3 = 11;
                                                }
                                            }
                                            i3 = 9;
                                        }
                                        i3 = 8;
                                    }
                                }
                                i3 = 6;
                            }
                        }
                        i3 = 2;
                    }
                    int[] iArr = zza;
                    for (i2 = 0; i2 < 14; i2++) {
                        int i4 = iArr[i2];
                        if (i4 != i && i4 != i3) {
                            zzc(i4, arrayList);
                        }
                    }
                }
                i3 = 0;
                int[] iArr2 = zza;
                while (i2 < 14) {
                }
            }
            i3 = -1;
            int[] iArr22 = zza;
            while (i2 < 14) {
            }
        }
        i = -1;
        if (i != -1) {
        }
        lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
        }
        i3 = -1;
        int[] iArr222 = zza;
        while (i2 < 14) {
        }
        return (zzys[]) arrayList.toArray(new zzys[arrayList.size()]);
    }

    private static final void zzc(int i, List list) {
        switch (i) {
            case 0:
                list.add(new zzafp());
                break;
            case 1:
                list.add(new zzafs());
                break;
            case 2:
                list.add(new zzafv(0));
                break;
            case 3:
                list.add(new zzaah(0));
                break;
            case 4:
                zzys zza2 = zzc.zza(0);
                if (zza2 == null) {
                    list.add(new zzaan(0));
                    break;
                } else {
                    list.add(zza2);
                    break;
                }
            case 5:
                list.add(new zzaaq());
                break;
            case 6:
                list.add(new zzadh(0));
                break;
            case 7:
                list.add(new zzadp(0));
                break;
            case 8:
                list.add(new zzaej(0, null));
                list.add(new zzaeo(0));
                break;
            case 9:
                list.add(new zzafd());
                break;
            case 10:
                list.add(new zzagy());
                break;
            case 11:
                list.add(new zzahi(1, 0, 112800));
                break;
            case 12:
                list.add(new zzahu());
                break;
            case 14:
                list.add(new zzaav());
                break;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzzd implements zzzp {
    private static final int[] zza = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    private static final zzzc zzc = new zzzc(new zzzb() { // from class: com.google.android.gms.internal.ads.zzyz
        @Override // com.google.android.gms.internal.ads.zzzb
        public final Constructor zza() {
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzzi.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });
    private static final zzzc zzd = new zzzc(new zzzb() { // from class: com.google.android.gms.internal.ads.zzza
        @Override // com.google.android.gms.internal.ads.zzzb
        public final Constructor zza() {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(zzzi.class).getConstructor(new Class[0]);
        }
    });

    private static final void zzc(int i, List list) {
        switch (i) {
            case 0:
                list.add(new zzagr());
                break;
            case 1:
                list.add(new zzagu());
                break;
            case 2:
                list.add(new zzagx(0));
                break;
            case 3:
                list.add(new zzaax(0));
                break;
            case 4:
                zzzi zza2 = zzc.zza(0);
                if (zza2 == null) {
                    list.add(new zzabo(0));
                    break;
                } else {
                    list.add(zza2);
                    break;
                }
            case 5:
                list.add(new zzabr());
                break;
            case 6:
                list.add(new zzaei(0));
                break;
            case 7:
                list.add(new zzaeq(0));
                break;
            case 8:
                list.add(new zzafl(0, null));
                list.add(new zzafq(0));
                break;
            case 9:
                list.add(new zzagf());
                break;
            case 10:
                list.add(new zzaia());
                break;
            case 11:
                list.add(new zzaik(1, 0, 112800));
                break;
            case 12:
                list.add(new zzaiw());
                break;
            case 14:
                list.add(new zzabw());
                break;
            case 15:
                zzzi zza3 = zzd.zza(new Object[0]);
                if (zza3 != null) {
                    list.add(zza3);
                    break;
                }
                break;
            case 16:
                list.add(new zzabc());
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzp
    public final synchronized zzzi[] zza() {
        return zzb(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0309, code lost:
    
        if (r9 == r3) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x030b, code lost:
    
        zzc(r9, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0197 A[Catch: all -> 0x032d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:13:0x0197, B:14:0x019a, B:19:0x030b, B:20:0x030e, B:22:0x0313, B:25:0x0319, B:27:0x031c, B:31:0x031f, B:36:0x01a3, B:38:0x01ab, B:41:0x01b5, B:44:0x01c0, B:46:0x01c8, B:49:0x01d2, B:52:0x01dd, B:55:0x01e8, B:58:0x01f3, B:60:0x01fb, B:62:0x0203, B:65:0x020d, B:67:0x021b, B:70:0x0225, B:73:0x0230, B:75:0x0238, B:77:0x0246, B:79:0x0254, B:82:0x0264, B:84:0x0272, B:87:0x027c, B:89:0x0284, B:91:0x028c, B:93:0x0294, B:96:0x029d, B:98:0x02a5, B:101:0x02b4, B:103:0x02bc, B:106:0x02c5, B:108:0x02cd, B:111:0x02d6, B:113:0x02de, B:116:0x02e7, B:129:0x003f, B:130:0x0047, B:133:0x016e, B:151:0x004c, B:154:0x0058, B:157:0x0063, B:160:0x006f, B:163:0x007a, B:166:0x0085, B:169:0x0090, B:172:0x009b, B:175:0x00a6, B:178:0x00b2, B:181:0x00be, B:184:0x00ca, B:187:0x00d5, B:190:0x00e0, B:193:0x00eb, B:196:0x00f7, B:199:0x0102, B:202:0x010d, B:205:0x0118, B:208:0x0123, B:211:0x012e, B:214:0x0139, B:217:0x0143, B:220:0x014d, B:223:0x0158, B:226:0x0163), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0313 A[Catch: all -> 0x032d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:13:0x0197, B:14:0x019a, B:19:0x030b, B:20:0x030e, B:22:0x0313, B:25:0x0319, B:27:0x031c, B:31:0x031f, B:36:0x01a3, B:38:0x01ab, B:41:0x01b5, B:44:0x01c0, B:46:0x01c8, B:49:0x01d2, B:52:0x01dd, B:55:0x01e8, B:58:0x01f3, B:60:0x01fb, B:62:0x0203, B:65:0x020d, B:67:0x021b, B:70:0x0225, B:73:0x0230, B:75:0x0238, B:77:0x0246, B:79:0x0254, B:82:0x0264, B:84:0x0272, B:87:0x027c, B:89:0x0284, B:91:0x028c, B:93:0x0294, B:96:0x029d, B:98:0x02a5, B:101:0x02b4, B:103:0x02bc, B:106:0x02c5, B:108:0x02cd, B:111:0x02d6, B:113:0x02de, B:116:0x02e7, B:129:0x003f, B:130:0x0047, B:133:0x016e, B:151:0x004c, B:154:0x0058, B:157:0x0063, B:160:0x006f, B:163:0x007a, B:166:0x0085, B:169:0x0090, B:172:0x009b, B:175:0x00a6, B:178:0x00b2, B:181:0x00be, B:184:0x00ca, B:187:0x00d5, B:190:0x00e0, B:193:0x00eb, B:196:0x00f7, B:199:0x0102, B:202:0x010d, B:205:0x0118, B:208:0x0123, B:211:0x012e, B:214:0x0139, B:217:0x0143, B:220:0x014d, B:223:0x0158, B:226:0x0163), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a3 A[Catch: all -> 0x032d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:13:0x0197, B:14:0x019a, B:19:0x030b, B:20:0x030e, B:22:0x0313, B:25:0x0319, B:27:0x031c, B:31:0x031f, B:36:0x01a3, B:38:0x01ab, B:41:0x01b5, B:44:0x01c0, B:46:0x01c8, B:49:0x01d2, B:52:0x01dd, B:55:0x01e8, B:58:0x01f3, B:60:0x01fb, B:62:0x0203, B:65:0x020d, B:67:0x021b, B:70:0x0225, B:73:0x0230, B:75:0x0238, B:77:0x0246, B:79:0x0254, B:82:0x0264, B:84:0x0272, B:87:0x027c, B:89:0x0284, B:91:0x028c, B:93:0x0294, B:96:0x029d, B:98:0x02a5, B:101:0x02b4, B:103:0x02bc, B:106:0x02c5, B:108:0x02cd, B:111:0x02d6, B:113:0x02de, B:116:0x02e7, B:129:0x003f, B:130:0x0047, B:133:0x016e, B:151:0x004c, B:154:0x0058, B:157:0x0063, B:160:0x006f, B:163:0x007a, B:166:0x0085, B:169:0x0090, B:172:0x009b, B:175:0x00a6, B:178:0x00b2, B:181:0x00be, B:184:0x00ca, B:187:0x00d5, B:190:0x00e0, B:193:0x00eb, B:196:0x00f7, B:199:0x0102, B:202:0x010d, B:205:0x0118, B:208:0x0123, B:211:0x012e, B:214:0x0139, B:217:0x0143, B:220:0x014d, B:223:0x0158, B:226:0x0163), top: B:2:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzzp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized zzzi[] zzb(Uri uri, Map map) {
        ArrayList arrayList;
        char c;
        int i;
        String lastPathSegment;
        int i2;
        arrayList = new ArrayList(16);
        List list = (List) map.get("Content-Type");
        String str = null;
        if (list != null && !list.isEmpty()) {
            str = (String) list.get(0);
        }
        int i3 = 14;
        if (str != null) {
            String zze = zzbt.zze(str);
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
                case -1487394660:
                    if (zze.equals("image/jpeg")) {
                        c = 24;
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
                                if (!lastPathSegment.endsWith(".mid") && !lastPathSegment.endsWith(".midi") && !lastPathSegment.endsWith(".smf")) {
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
                                                                    if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
                                                                        if (lastPathSegment.endsWith(".avi")) {
                                                                            i3 = 16;
                                                                        }
                                                                    }
                                                                }
                                                                i3 = 13;
                                                            }
                                                            i3 = 12;
                                                        }
                                                        i3 = 11;
                                                    }
                                                    i3 = 10;
                                                }
                                                i3 = 9;
                                            }
                                            i3 = 8;
                                        }
                                    }
                                    i3 = 6;
                                }
                                i3 = 15;
                            }
                        }
                        i3 = 2;
                    }
                    int[] iArr = zza;
                    for (i2 = 0; i2 < 16; i2++) {
                        int i4 = iArr[i2];
                        if (i4 != i && i4 != i3) {
                            zzc(i4, arrayList);
                        }
                    }
                }
                i3 = 0;
                int[] iArr2 = zza;
                while (i2 < 16) {
                }
            }
            i3 = -1;
            int[] iArr22 = zza;
            while (i2 < 16) {
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
        while (i2 < 16) {
        }
        return (zzzi[]) arrayList.toArray(new zzzi[arrayList.size()]);
    }
}

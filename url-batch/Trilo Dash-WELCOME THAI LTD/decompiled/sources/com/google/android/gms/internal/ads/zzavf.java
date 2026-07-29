package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzavf {
    private static final int zza = zzazn.zzg("nam");
    private static final int zzb = zzazn.zzg("trk");
    private static final int zzc = zzazn.zzg("cmt");
    private static final int zzd = zzazn.zzg("day");
    private static final int zze = zzazn.zzg("ART");
    private static final int zzf = zzazn.zzg("too");
    private static final int zzg = zzazn.zzg("alb");
    private static final int zzh = zzazn.zzg("com");
    private static final int zzi = zzazn.zzg("wrt");
    private static final int zzj = zzazn.zzg("lyr");
    private static final int zzk = zzazn.zzg("gen");
    private static final int zzl = zzazn.zzg("covr");
    private static final int zzm = zzazn.zzg("gnre");
    private static final int zzn = zzazn.zzg("grp");
    private static final int zzo = zzazn.zzg("disk");
    private static final int zzp = zzazn.zzg("trkn");
    private static final int zzq = zzazn.zzg("tmpo");
    private static final int zzr = zzazn.zzg("cpil");
    private static final int zzs = zzazn.zzg("aART");
    private static final int zzt = zzazn.zzg("sonm");
    private static final int zzu = zzazn.zzg("soal");
    private static final int zzv = zzazn.zzg("soar");
    private static final int zzw = zzazn.zzg("soaa");
    private static final int zzx = zzazn.zzg("soco");
    private static final int zzy = zzazn.zzg("rtng");
    private static final int zzz = zzazn.zzg("pgap");
    private static final int zzA = zzazn.zzg("sosn");
    private static final int zzB = zzazn.zzg("tvsh");
    private static final int zzC = zzazn.zzg("----");
    private static final String[] zzD = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035 A[Catch: all -> 0x01d3, TryCatch #0 {all -> 0x01d3, blocks: (B:4:0x001c, B:6:0x0021, B:8:0x0027, B:10:0x002e, B:12:0x0035, B:16:0x003c, B:18:0x0045, B:20:0x0049, B:23:0x0053, B:25:0x0057, B:28:0x0061, B:30:0x0067, B:33:0x0071, B:35:0x0075, B:38:0x007f, B:40:0x0084, B:42:0x0090, B:46:0x00ab, B:49:0x00c0, B:53:0x00d2, B:54:0x00db, B:56:0x00df, B:59:0x00e9, B:61:0x00ed, B:64:0x00f7, B:66:0x00fb, B:69:0x0105, B:71:0x0109, B:74:0x0113, B:76:0x0117, B:79:0x0121, B:81:0x0125, B:84:0x012f, B:86:0x0133, B:89:0x013d, B:91:0x0141, B:94:0x014b, B:96:0x014f, B:99:0x0159, B:101:0x015d, B:104:0x0167, B:107:0x016f, B:109:0x0175, B:128:0x0188, B:112:0x018f, B:125:0x0193, B:115:0x019a, B:120:0x01a3, B:131:0x01a9, B:133:0x01b1, B:137:0x01bc, B:140:0x0280, B:144:0x01da, B:146:0x01de, B:148:0x01ea, B:151:0x01fb, B:152:0x020c, B:154:0x0210, B:157:0x0216, B:159:0x021a, B:162:0x0220, B:164:0x0224, B:167:0x022e, B:169:0x0232, B:172:0x023c, B:174:0x0240, B:177:0x024a, B:179:0x024e, B:182:0x0258, B:184:0x025c, B:187:0x0266, B:189:0x026a, B:192:0x0272, B:194:0x0276, B:197:0x029c, B:200:0x02a6), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c A[Catch: all -> 0x01d3, TRY_LEAVE, TryCatch #0 {all -> 0x01d3, blocks: (B:4:0x001c, B:6:0x0021, B:8:0x0027, B:10:0x002e, B:12:0x0035, B:16:0x003c, B:18:0x0045, B:20:0x0049, B:23:0x0053, B:25:0x0057, B:28:0x0061, B:30:0x0067, B:33:0x0071, B:35:0x0075, B:38:0x007f, B:40:0x0084, B:42:0x0090, B:46:0x00ab, B:49:0x00c0, B:53:0x00d2, B:54:0x00db, B:56:0x00df, B:59:0x00e9, B:61:0x00ed, B:64:0x00f7, B:66:0x00fb, B:69:0x0105, B:71:0x0109, B:74:0x0113, B:76:0x0117, B:79:0x0121, B:81:0x0125, B:84:0x012f, B:86:0x0133, B:89:0x013d, B:91:0x0141, B:94:0x014b, B:96:0x014f, B:99:0x0159, B:101:0x015d, B:104:0x0167, B:107:0x016f, B:109:0x0175, B:128:0x0188, B:112:0x018f, B:125:0x0193, B:115:0x019a, B:120:0x01a3, B:131:0x01a9, B:133:0x01b1, B:137:0x01bc, B:140:0x0280, B:144:0x01da, B:146:0x01de, B:148:0x01ea, B:151:0x01fb, B:152:0x020c, B:154:0x0210, B:157:0x0216, B:159:0x021a, B:162:0x0220, B:164:0x0224, B:167:0x022e, B:169:0x0232, B:172:0x023c, B:174:0x0240, B:177:0x024a, B:179:0x024e, B:182:0x0258, B:184:0x025c, B:187:0x0266, B:189:0x026a, B:192:0x0272, B:194:0x0276, B:197:0x029c, B:200:0x02a6), top: B:2:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzawc zza(zzazg zzazgVar) {
        String str;
        String str2;
        int zzc2 = zzazgVar.zzc() + zzazgVar.zze();
        int zze2 = zzazgVar.zze();
        zzawj zzawjVar = null;
        try {
            if (((zze2 >> 24) & 255) == 169) {
                int i = 16777215 & zze2;
                if (i == zzc) {
                    int zze3 = zzazgVar.zze();
                    if (zzazgVar.zze() == zzaus.zzaH) {
                        zzazgVar.zzw(8);
                        String zzo2 = zzazgVar.zzo(zze3 - 16);
                        zzawjVar = new zzawh("und", zzo2, zzo2);
                    } else {
                        Log.w("MetadataUtil", "Failed to parse comment attribute: ".concat(zzaus.zzg(zze2)));
                    }
                    return zzawjVar;
                }
                if (i != zza && i != zzb) {
                    if (i != zzh && i != zzi) {
                        if (i == zzd) {
                            return zze(zze2, "TDRC", zzazgVar);
                        }
                        if (i == zze) {
                            return zze(zze2, "TPE1", zzazgVar);
                        }
                        if (i == zzf) {
                            return zze(zze2, "TSSE", zzazgVar);
                        }
                        if (i == zzg) {
                            return zze(zze2, "TALB", zzazgVar);
                        }
                        if (i == zzj) {
                            return zze(zze2, "USLT", zzazgVar);
                        }
                        if (i == zzk) {
                            return zze(zze2, "TCON", zzazgVar);
                        }
                        if (i == zzn) {
                            return zze(zze2, "TIT1", zzazgVar);
                        }
                    }
                    return zze(zze2, "TCOM", zzazgVar);
                }
                return zze(zze2, "TIT2", zzazgVar);
            }
            if (zze2 == zzm) {
                int zzb2 = zzb(zzazgVar);
                if (zzb2 > 0) {
                    String[] strArr = zzD;
                    int length = strArr.length;
                    if (zzb2 <= 148) {
                        str2 = strArr[zzb2 - 1];
                        if (str2 == null) {
                            zzawjVar = new zzawl("TCON", null, str2);
                        } else {
                            Log.w("MetadataUtil", "Failed to parse standard genre code");
                        }
                        return zzawjVar;
                    }
                }
                str2 = null;
                if (str2 == null) {
                }
                return zzawjVar;
            }
            if (zze2 == zzo) {
                return zzd(zze2, "TPOS", zzazgVar);
            }
            if (zze2 == zzp) {
                return zzd(zze2, "TRCK", zzazgVar);
            }
            if (zze2 == zzq) {
                return zzc(zze2, "TBPM", zzazgVar, true, false);
            }
            if (zze2 == zzr) {
                return zzc(zze2, "TCMP", zzazgVar, true, true);
            }
            if (zze2 == zzl) {
                int zze4 = zzazgVar.zze();
                if (zzazgVar.zze() == zzaus.zzaH) {
                    int zze5 = zzaus.zze(zzazgVar.zze());
                    if (zze5 == 13) {
                        str = "image/jpeg";
                    } else if (zze5 == 14) {
                        str = "image/png";
                        zze5 = 14;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        Log.w("MetadataUtil", "Unrecognized cover art flags: " + zze5);
                    } else {
                        zzazgVar.zzw(4);
                        int i2 = zze4 - 16;
                        byte[] bArr = new byte[i2];
                        zzazgVar.zzq(bArr, 0, i2);
                        zzawjVar = new zzawf(str, null, 3, bArr);
                    }
                } else {
                    Log.w("MetadataUtil", "Failed to parse cover art attribute");
                }
                return zzawjVar;
            }
            if (zze2 == zzs) {
                return zze(zze2, "TPE2", zzazgVar);
            }
            if (zze2 == zzt) {
                return zze(zze2, "TSOT", zzazgVar);
            }
            if (zze2 == zzu) {
                return zze(zze2, "TSO2", zzazgVar);
            }
            if (zze2 == zzv) {
                return zze(zze2, "TSOA", zzazgVar);
            }
            if (zze2 == zzw) {
                return zze(zze2, "TSOP", zzazgVar);
            }
            if (zze2 == zzx) {
                return zze(zze2, "TSOC", zzazgVar);
            }
            if (zze2 == zzy) {
                return zzc(zze2, "ITUNESADVISORY", zzazgVar, false, false);
            }
            if (zze2 == zzz) {
                return zzc(zze2, "ITUNESGAPLESS", zzazgVar, false, true);
            }
            if (zze2 == zzA) {
                return zze(zze2, "TVSHOWSORT", zzazgVar);
            }
            if (zze2 == zzB) {
                return zze(zze2, "TVSHOW", zzazgVar);
            }
            if (zze2 == zzC) {
                String str3 = null;
                String str4 = null;
                int i3 = -1;
                int i4 = -1;
                while (zzazgVar.zzc() < zzc2) {
                    int zzc3 = zzazgVar.zzc();
                    int zze6 = zzazgVar.zze();
                    int zze7 = zzazgVar.zze();
                    zzazgVar.zzw(4);
                    if (zze7 == zzaus.zzaF) {
                        str3 = zzazgVar.zzo(zze6 - 12);
                    } else if (zze7 == zzaus.zzaG) {
                        str4 = zzazgVar.zzo(zze6 - 12);
                    } else {
                        int i5 = zzaus.zzaH;
                        if (zze7 == i5) {
                            i4 = zze6;
                        }
                        if (zze7 == i5) {
                            i3 = zzc3;
                        }
                        zzazgVar.zzw(zze6 - 12);
                    }
                }
                if ("com.apple.iTunes".equals(str3) && "iTunSMPB".equals(str4) && i3 != -1) {
                    zzazgVar.zzv(i3);
                    zzazgVar.zzw(16);
                    zzawjVar = new zzawh("und", str4, zzazgVar.zzo(i4 - 16));
                }
                return zzawjVar;
            }
            Log.d("MetadataUtil", "Skipped unknown metadata entry: " + zzaus.zzg(zze2));
            return null;
        } finally {
            zzazgVar.zzv(zzc2);
        }
    }

    private static int zzb(zzazg zzazgVar) {
        zzazgVar.zzw(4);
        if (zzazgVar.zze() == zzaus.zzaH) {
            zzazgVar.zzw(8);
            return zzazgVar.zzg();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static zzawj zzc(int i, String str, zzazg zzazgVar, boolean z, boolean z2) {
        int zzb2 = zzb(zzazgVar);
        if (z2) {
            zzb2 = Math.min(1, zzb2);
        }
        if (zzb2 >= 0) {
            return z ? new zzawl(str, null, Integer.toString(zzb2)) : new zzawh("und", str, Integer.toString(zzb2));
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzaus.zzg(i)));
        return null;
    }

    private static zzawl zzd(int i, String str, zzazg zzazgVar) {
        int zze2 = zzazgVar.zze();
        if (zzazgVar.zze() == zzaus.zzaH && zze2 >= 22) {
            zzazgVar.zzw(10);
            int zzj2 = zzazgVar.zzj();
            if (zzj2 > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(zzj2);
                String sb2 = sb.toString();
                int zzj3 = zzazgVar.zzj();
                if (zzj3 > 0) {
                    sb2 = sb2 + "/" + zzj3;
                }
                return new zzawl(str, null, sb2);
            }
        }
        Log.w("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzaus.zzg(i)));
        return null;
    }

    private static zzawl zze(int i, String str, zzazg zzazgVar) {
        int zze2 = zzazgVar.zze();
        if (zzazgVar.zze() == zzaus.zzaH) {
            zzazgVar.zzw(8);
            return new zzawl(str, null, zzazgVar.zzo(zze2 - 16));
        }
        Log.w("MetadataUtil", "Failed to parse text attribute: ".concat(zzaus.zzg(i)));
        return null;
    }
}

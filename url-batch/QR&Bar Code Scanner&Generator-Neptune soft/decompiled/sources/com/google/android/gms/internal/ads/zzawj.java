package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzawj {
    private static final int zza = zzbar.zzg("nam");
    private static final int zzb = zzbar.zzg("trk");
    private static final int zzc = zzbar.zzg("cmt");
    private static final int zzd = zzbar.zzg("day");
    private static final int zze = zzbar.zzg("ART");
    private static final int zzf = zzbar.zzg("too");
    private static final int zzg = zzbar.zzg("alb");
    private static final int zzh = zzbar.zzg("com");
    private static final int zzi = zzbar.zzg("wrt");
    private static final int zzj = zzbar.zzg("lyr");
    private static final int zzk = zzbar.zzg("gen");
    private static final int zzl = zzbar.zzg("covr");
    private static final int zzm = zzbar.zzg("gnre");
    private static final int zzn = zzbar.zzg("grp");
    private static final int zzo = zzbar.zzg("disk");
    private static final int zzp = zzbar.zzg("trkn");
    private static final int zzq = zzbar.zzg("tmpo");
    private static final int zzr = zzbar.zzg("cpil");
    private static final int zzs = zzbar.zzg("aART");
    private static final int zzt = zzbar.zzg("sonm");
    private static final int zzu = zzbar.zzg("soal");
    private static final int zzv = zzbar.zzg("soar");
    private static final int zzw = zzbar.zzg("soaa");
    private static final int zzx = zzbar.zzg("soco");
    private static final int zzy = zzbar.zzg("rtng");
    private static final int zzz = zzbar.zzg("pgap");
    private static final int zzA = zzbar.zzg("sosn");
    private static final int zzB = zzbar.zzg("tvsh");
    private static final int zzC = zzbar.zzg("----");
    private static final String[] zzD = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035 A[Catch: all -> 0x01d2, TryCatch #0 {all -> 0x01d2, blocks: (B:4:0x001c, B:6:0x0021, B:8:0x0027, B:10:0x002e, B:12:0x0035, B:16:0x003c, B:18:0x0045, B:20:0x0049, B:23:0x0053, B:25:0x0057, B:28:0x0061, B:30:0x0067, B:33:0x0071, B:35:0x0075, B:38:0x007f, B:40:0x0084, B:42:0x0090, B:46:0x00aa, B:49:0x00bf, B:53:0x00d1, B:54:0x00da, B:56:0x00de, B:59:0x00e8, B:61:0x00ec, B:64:0x00f6, B:66:0x00fa, B:69:0x0104, B:71:0x0108, B:74:0x0112, B:76:0x0116, B:79:0x0120, B:81:0x0124, B:84:0x012e, B:86:0x0132, B:89:0x013c, B:91:0x0140, B:94:0x014a, B:96:0x014e, B:99:0x0158, B:101:0x015c, B:104:0x0166, B:107:0x016e, B:109:0x0174, B:128:0x0187, B:112:0x018e, B:125:0x0192, B:115:0x0199, B:120:0x01a2, B:131:0x01a8, B:133:0x01b0, B:137:0x01bb, B:140:0x027f, B:144:0x01d9, B:146:0x01dd, B:148:0x01e9, B:151:0x01fa, B:152:0x020b, B:154:0x020f, B:157:0x0215, B:159:0x0219, B:162:0x021f, B:164:0x0223, B:167:0x022d, B:169:0x0231, B:172:0x023b, B:174:0x023f, B:177:0x0249, B:179:0x024d, B:182:0x0257, B:184:0x025b, B:187:0x0265, B:189:0x0269, B:192:0x0271, B:194:0x0275, B:197:0x029b, B:200:0x02a5), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c A[Catch: all -> 0x01d2, TRY_LEAVE, TryCatch #0 {all -> 0x01d2, blocks: (B:4:0x001c, B:6:0x0021, B:8:0x0027, B:10:0x002e, B:12:0x0035, B:16:0x003c, B:18:0x0045, B:20:0x0049, B:23:0x0053, B:25:0x0057, B:28:0x0061, B:30:0x0067, B:33:0x0071, B:35:0x0075, B:38:0x007f, B:40:0x0084, B:42:0x0090, B:46:0x00aa, B:49:0x00bf, B:53:0x00d1, B:54:0x00da, B:56:0x00de, B:59:0x00e8, B:61:0x00ec, B:64:0x00f6, B:66:0x00fa, B:69:0x0104, B:71:0x0108, B:74:0x0112, B:76:0x0116, B:79:0x0120, B:81:0x0124, B:84:0x012e, B:86:0x0132, B:89:0x013c, B:91:0x0140, B:94:0x014a, B:96:0x014e, B:99:0x0158, B:101:0x015c, B:104:0x0166, B:107:0x016e, B:109:0x0174, B:128:0x0187, B:112:0x018e, B:125:0x0192, B:115:0x0199, B:120:0x01a2, B:131:0x01a8, B:133:0x01b0, B:137:0x01bb, B:140:0x027f, B:144:0x01d9, B:146:0x01dd, B:148:0x01e9, B:151:0x01fa, B:152:0x020b, B:154:0x020f, B:157:0x0215, B:159:0x0219, B:162:0x021f, B:164:0x0223, B:167:0x022d, B:169:0x0231, B:172:0x023b, B:174:0x023f, B:177:0x0249, B:179:0x024d, B:182:0x0257, B:184:0x025b, B:187:0x0265, B:189:0x0269, B:192:0x0271, B:194:0x0275, B:197:0x029b, B:200:0x02a5), top: B:2:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzaxg zza(zzbak zzbakVar) {
        String str;
        String str2;
        int zzc2 = zzbakVar.zzc() + zzbakVar.zze();
        int zze2 = zzbakVar.zze();
        zzaxg zzaxgVar = null;
        try {
            if (((zze2 >> 24) & 255) == 169) {
                int i = 16777215 & zze2;
                if (i == zzc) {
                    int zze3 = zzbakVar.zze();
                    if (zzbakVar.zze() == zzavw.zzaH) {
                        zzbakVar.zzw(8);
                        String zzo2 = zzbakVar.zzo(zze3 - 16);
                        zzaxgVar = new zzaxl("und", zzo2, zzo2);
                    } else {
                        Log.w("MetadataUtil", "Failed to parse comment attribute: ".concat(zzavw.zzg(zze2)));
                    }
                    return zzaxgVar;
                }
                if (i != zza && i != zzb) {
                    if (i != zzh && i != zzi) {
                        if (i == zzd) {
                            return zze(zze2, "TDRC", zzbakVar);
                        }
                        if (i == zze) {
                            return zze(zze2, "TPE1", zzbakVar);
                        }
                        if (i == zzf) {
                            return zze(zze2, "TSSE", zzbakVar);
                        }
                        if (i == zzg) {
                            return zze(zze2, "TALB", zzbakVar);
                        }
                        if (i == zzj) {
                            return zze(zze2, "USLT", zzbakVar);
                        }
                        if (i == zzk) {
                            return zze(zze2, "TCON", zzbakVar);
                        }
                        if (i == zzn) {
                            return zze(zze2, "TIT1", zzbakVar);
                        }
                    }
                    return zze(zze2, "TCOM", zzbakVar);
                }
                return zze(zze2, "TIT2", zzbakVar);
            }
            if (zze2 == zzm) {
                int zzb2 = zzb(zzbakVar);
                if (zzb2 > 0) {
                    String[] strArr = zzD;
                    int length = strArr.length;
                    if (zzb2 <= 148) {
                        str2 = strArr[zzb2 - 1];
                        if (str2 == null) {
                            zzaxgVar = new zzaxp("TCON", null, str2);
                        } else {
                            Log.w("MetadataUtil", "Failed to parse standard genre code");
                        }
                        return zzaxgVar;
                    }
                }
                str2 = null;
                if (str2 == null) {
                }
                return zzaxgVar;
            }
            if (zze2 == zzo) {
                return zzd(zze2, "TPOS", zzbakVar);
            }
            if (zze2 == zzp) {
                return zzd(zze2, "TRCK", zzbakVar);
            }
            if (zze2 == zzq) {
                return zzc(zze2, "TBPM", zzbakVar, true, false);
            }
            if (zze2 == zzr) {
                return zzc(zze2, "TCMP", zzbakVar, true, true);
            }
            if (zze2 == zzl) {
                int zze4 = zzbakVar.zze();
                if (zzbakVar.zze() == zzavw.zzaH) {
                    int zze5 = zzavw.zze(zzbakVar.zze());
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
                        zzbakVar.zzw(4);
                        int i2 = zze4 - 16;
                        byte[] bArr = new byte[i2];
                        zzbakVar.zzq(bArr, 0, i2);
                        zzaxgVar = new zzaxj(str, null, 3, bArr);
                    }
                } else {
                    Log.w("MetadataUtil", "Failed to parse cover art attribute");
                }
                return zzaxgVar;
            }
            if (zze2 == zzs) {
                return zze(zze2, "TPE2", zzbakVar);
            }
            if (zze2 == zzt) {
                return zze(zze2, "TSOT", zzbakVar);
            }
            if (zze2 == zzu) {
                return zze(zze2, "TSO2", zzbakVar);
            }
            if (zze2 == zzv) {
                return zze(zze2, "TSOA", zzbakVar);
            }
            if (zze2 == zzw) {
                return zze(zze2, "TSOP", zzbakVar);
            }
            if (zze2 == zzx) {
                return zze(zze2, "TSOC", zzbakVar);
            }
            if (zze2 == zzy) {
                return zzc(zze2, "ITUNESADVISORY", zzbakVar, false, false);
            }
            if (zze2 == zzz) {
                return zzc(zze2, "ITUNESGAPLESS", zzbakVar, false, true);
            }
            if (zze2 == zzA) {
                return zze(zze2, "TVSHOWSORT", zzbakVar);
            }
            if (zze2 == zzB) {
                return zze(zze2, "TVSHOW", zzbakVar);
            }
            if (zze2 == zzC) {
                String str3 = null;
                String str4 = null;
                int i3 = -1;
                int i4 = -1;
                while (zzbakVar.zzc() < zzc2) {
                    int zzc3 = zzbakVar.zzc();
                    int zze6 = zzbakVar.zze();
                    int zze7 = zzbakVar.zze();
                    zzbakVar.zzw(4);
                    if (zze7 == zzavw.zzaF) {
                        str3 = zzbakVar.zzo(zze6 - 12);
                    } else if (zze7 == zzavw.zzaG) {
                        str4 = zzbakVar.zzo(zze6 - 12);
                    } else {
                        int i5 = zzavw.zzaH;
                        if (zze7 == i5) {
                            i4 = zze6;
                        }
                        if (zze7 == i5) {
                            i3 = zzc3;
                        }
                        zzbakVar.zzw(zze6 - 12);
                    }
                }
                if ("com.apple.iTunes".equals(str3) && "iTunSMPB".equals(str4) && i3 != -1) {
                    zzbakVar.zzv(i3);
                    zzbakVar.zzw(16);
                    zzaxgVar = new zzaxl("und", str4, zzbakVar.zzo(i4 - 16));
                }
                return zzaxgVar;
            }
            Log.d("MetadataUtil", "Skipped unknown metadata entry: " + zzavw.zzg(zze2));
            return null;
        } finally {
            zzbakVar.zzv(zzc2);
        }
    }

    private static int zzb(zzbak zzbakVar) {
        zzbakVar.zzw(4);
        if (zzbakVar.zze() == zzavw.zzaH) {
            zzbakVar.zzw(8);
            return zzbakVar.zzg();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static zzaxn zzc(int i, String str, zzbak zzbakVar, boolean z, boolean z2) {
        int zzb2 = zzb(zzbakVar);
        if (z2) {
            zzb2 = Math.min(1, zzb2);
        }
        if (zzb2 >= 0) {
            return z ? new zzaxp(str, null, Integer.toString(zzb2)) : new zzaxl("und", str, Integer.toString(zzb2));
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzavw.zzg(i)));
        return null;
    }

    private static zzaxp zzd(int i, String str, zzbak zzbakVar) {
        int zze2 = zzbakVar.zze();
        if (zzbakVar.zze() == zzavw.zzaH && zze2 >= 22) {
            zzbakVar.zzw(10);
            int zzj2 = zzbakVar.zzj();
            if (zzj2 > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(zzj2);
                String sb2 = sb.toString();
                int zzj3 = zzbakVar.zzj();
                if (zzj3 > 0) {
                    sb2 = sb2 + "/" + zzj3;
                }
                return new zzaxp(str, null, sb2);
            }
        }
        Log.w("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzavw.zzg(i)));
        return null;
    }

    private static zzaxp zze(int i, String str, zzbak zzbakVar) {
        int zze2 = zzbakVar.zze();
        if (zzbakVar.zze() == zzavw.zzaH) {
            zzbakVar.zzw(8);
            return new zzaxp(str, null, zzbakVar.zzo(zze2 - 16));
        }
        Log.w("MetadataUtil", "Failed to parse text attribute: ".concat(zzavw.zzg(i)));
        return null;
    }
}

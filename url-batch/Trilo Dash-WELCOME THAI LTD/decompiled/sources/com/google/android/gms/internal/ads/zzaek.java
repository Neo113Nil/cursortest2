package com.google.android.gms.internal.ads;

import android.util.Log;
import androidx.core.view.ViewCompat;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzaek {
    static final String[] zza = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final /* synthetic */ int zzb = 0;

    public static zzbk zza(zzdy zzdyVar) {
        String str;
        int zzc = zzdyVar.zzc() + zzdyVar.zze();
        int zze = zzdyVar.zze();
        int i = (zze >> 24) & 255;
        zzbk zzbkVar = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = zze & ViewCompat.MEASURED_SIZE_MASK;
                if (i2 == 6516084) {
                    int zze2 = zzdyVar.zze();
                    if (zzdyVar.zze() == 1684108385) {
                        zzdyVar.zzG(8);
                        String zzw = zzdyVar.zzw(zze2 - 16);
                        zzbkVar = new zzabv("und", zzw, zzw);
                    } else {
                        Log.w("MetadataUtil", "Failed to parse comment attribute: ".concat(zzadw.zzf(zze)));
                    }
                    return zzbkVar;
                }
                if (i2 == 7233901 || i2 == 7631467) {
                    return zze(zze, "TIT2", zzdyVar);
                }
                if (i2 == 6516589 || i2 == 7828084) {
                    return zze(zze, "TCOM", zzdyVar);
                }
                if (i2 == 6578553) {
                    return zze(zze, "TDRC", zzdyVar);
                }
                if (i2 == 4280916) {
                    return zze(zze, "TPE1", zzdyVar);
                }
                if (i2 == 7630703) {
                    return zze(zze, "TSSE", zzdyVar);
                }
                if (i2 == 6384738) {
                    return zze(zze, "TALB", zzdyVar);
                }
                if (i2 == 7108978) {
                    return zze(zze, "USLT", zzdyVar);
                }
                if (i2 == 6776174) {
                    return zze(zze, "TCON", zzdyVar);
                }
                if (i2 == 6779504) {
                    return zze(zze, "TIT1", zzdyVar);
                }
            } else {
                if (zze == 1735291493) {
                    int zzb2 = zzb(zzdyVar);
                    String str2 = (zzb2 <= 0 || zzb2 > 192) ? null : zza[zzb2 - 1];
                    if (str2 != null) {
                        zzbkVar = new zzack("TCON", null, str2);
                    } else {
                        Log.w("MetadataUtil", "Failed to parse standard genre code");
                    }
                    return zzbkVar;
                }
                if (zze == 1684632427) {
                    return zzd(1684632427, "TPOS", zzdyVar);
                }
                if (zze == 1953655662) {
                    return zzd(1953655662, "TRCK", zzdyVar);
                }
                if (zze == 1953329263) {
                    return zzc(1953329263, "TBPM", zzdyVar, true, false);
                }
                if (zze == 1668311404) {
                    return zzc(1668311404, "TCMP", zzdyVar, true, true);
                }
                if (zze == 1668249202) {
                    int zze3 = zzdyVar.zze();
                    if (zzdyVar.zze() == 1684108385) {
                        int zze4 = zzdyVar.zze() & ViewCompat.MEASURED_SIZE_MASK;
                        if (zze4 == 13) {
                            str = "image/jpeg";
                        } else if (zze4 == 14) {
                            str = "image/png";
                            zze4 = 14;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            Log.w("MetadataUtil", "Unrecognized cover art flags: " + zze4);
                        } else {
                            zzdyVar.zzG(4);
                            int i3 = zze3 - 16;
                            byte[] bArr = new byte[i3];
                            zzdyVar.zzB(bArr, 0, i3);
                            zzbkVar = new zzabn(str, null, 3, bArr);
                        }
                    } else {
                        Log.w("MetadataUtil", "Failed to parse cover art attribute");
                    }
                    return zzbkVar;
                }
                if (zze == 1631670868) {
                    return zze(1631670868, "TPE2", zzdyVar);
                }
                if (zze == 1936682605) {
                    return zze(1936682605, "TSOT", zzdyVar);
                }
                if (zze == 1936679276) {
                    return zze(1936679276, "TSO2", zzdyVar);
                }
                if (zze == 1936679282) {
                    return zze(1936679282, "TSOA", zzdyVar);
                }
                if (zze == 1936679265) {
                    return zze(1936679265, "TSOP", zzdyVar);
                }
                if (zze == 1936679791) {
                    return zze(1936679791, "TSOC", zzdyVar);
                }
                if (zze == 1920233063) {
                    return zzc(1920233063, "ITUNESADVISORY", zzdyVar, false, false);
                }
                if (zze == 1885823344) {
                    return zzc(1885823344, "ITUNESGAPLESS", zzdyVar, false, true);
                }
                if (zze == 1936683886) {
                    return zze(1936683886, "TVSHOWSORT", zzdyVar);
                }
                if (zze == 1953919848) {
                    return zze(1953919848, "TVSHOW", zzdyVar);
                }
                if (zze == 757935405) {
                    String str3 = null;
                    String str4 = null;
                    int i4 = -1;
                    int i5 = -1;
                    while (zzdyVar.zzc() < zzc) {
                        int zzc2 = zzdyVar.zzc();
                        int zze5 = zzdyVar.zze();
                        int zze6 = zzdyVar.zze();
                        zzdyVar.zzG(4);
                        if (zze6 == 1835360622) {
                            str3 = zzdyVar.zzw(zze5 - 12);
                        } else if (zze6 == 1851878757) {
                            str4 = zzdyVar.zzw(zze5 - 12);
                        } else {
                            if (zze6 == 1684108385) {
                                i5 = zze5;
                            }
                            if (zze6 == 1684108385) {
                                i4 = zzc2;
                            }
                            zzdyVar.zzG(zze5 - 12);
                        }
                    }
                    if (str3 != null && str4 != null && i4 != -1) {
                        zzdyVar.zzF(i4);
                        zzdyVar.zzG(16);
                        zzbkVar = new zzace(str3, str4, zzdyVar.zzw(i5 - 16));
                    }
                    return zzbkVar;
                }
            }
            Log.d("MetadataUtil", "Skipped unknown metadata entry: " + zzadw.zzf(zze));
            return null;
        } finally {
            zzdyVar.zzF(zzc);
        }
    }

    private static int zzb(zzdy zzdyVar) {
        zzdyVar.zzG(4);
        if (zzdyVar.zze() == 1684108385) {
            zzdyVar.zzG(8);
            return zzdyVar.zzk();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static zzacc zzc(int i, String str, zzdy zzdyVar, boolean z, boolean z2) {
        int zzb2 = zzb(zzdyVar);
        if (z2) {
            zzb2 = Math.min(1, zzb2);
        }
        if (zzb2 >= 0) {
            return z ? new zzack(str, null, Integer.toString(zzb2)) : new zzabv("und", str, Integer.toString(zzb2));
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzadw.zzf(i)));
        return null;
    }

    private static zzack zzd(int i, String str, zzdy zzdyVar) {
        int zze = zzdyVar.zze();
        if (zzdyVar.zze() == 1684108385 && zze >= 22) {
            zzdyVar.zzG(10);
            int zzo = zzdyVar.zzo();
            if (zzo > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(zzo);
                String sb2 = sb.toString();
                int zzo2 = zzdyVar.zzo();
                if (zzo2 > 0) {
                    sb2 = sb2 + "/" + zzo2;
                }
                return new zzack(str, null, sb2);
            }
        }
        Log.w("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzadw.zzf(i)));
        return null;
    }

    private static zzack zze(int i, String str, zzdy zzdyVar) {
        int zze = zzdyVar.zze();
        if (zzdyVar.zze() == 1684108385) {
            zzdyVar.zzG(8);
            return new zzack(str, null, zzdyVar.zzw(zze - 16));
        }
        Log.w("MetadataUtil", "Failed to parse text attribute: ".concat(zzadw.zzf(i)));
        return null;
    }
}

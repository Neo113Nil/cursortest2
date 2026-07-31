package yads;

/* loaded from: classes6.dex */
public abstract class lt1 {
    public static final String[] a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static z11 a(int i, String str, xb2 xb2Var, boolean z, boolean z2) {
        int i2;
        xb2Var.e(xb2Var.b + 4);
        if (xb2Var.a() == 1684108385) {
            xb2Var.e(xb2Var.b + 8);
            i2 = xb2Var.k();
        } else {
            gh1.d("MetadataUtil", "Failed to parse uint8 attribute value");
            i2 = -1;
        }
        if (z2) {
            i2 = Math.min(1, i2);
        }
        if (i2 >= 0) {
            return z ? new l63(str, null, Integer.toString(i2)) : new ix("und", str, Integer.toString(i2));
        }
        gh1.d("MetadataUtil", "Failed to parse uint8 attribute: " + yi.a(i));
        return null;
    }

    public static nb1 b(int i, xb2 xb2Var) {
        String str = null;
        String str2 = null;
        int i2 = -1;
        int i3 = -1;
        while (true) {
            int i4 = xb2Var.b;
            if (i4 >= i) {
                break;
            }
            int a2 = xb2Var.a();
            int a3 = xb2Var.a();
            xb2Var.e(xb2Var.b + 4);
            if (a3 == 1835360622) {
                str = xb2Var.b(a2 - 12);
            } else if (a3 == 1851878757) {
                str2 = xb2Var.b(a2 - 12);
            } else {
                if (a3 == 1684108385) {
                    i2 = i4;
                    i3 = a2;
                }
                xb2Var.e(xb2Var.b + (a2 - 12));
            }
        }
        if (str == null || str2 == null || i2 == -1) {
            return null;
        }
        xb2Var.e(i2);
        xb2Var.e(xb2Var.b + 16);
        return new nb1(str, str2, xb2Var.b(i3 - 16));
    }

    public static l63 b(int i, String str, xb2 xb2Var) {
        int a2 = xb2Var.a();
        if (xb2Var.a() == 1684108385) {
            xb2Var.e(xb2Var.b + 8);
            return new l63(str, null, xb2Var.b(a2 - 16));
        }
        gh1.d("MetadataUtil", "Failed to parse text attribute: " + yi.a(i));
        return null;
    }

    public static ix a(int i, xb2 xb2Var) {
        int a2 = xb2Var.a();
        if (xb2Var.a() == 1684108385) {
            xb2Var.e(xb2Var.b + 8);
            String b = xb2Var.b(a2 - 16);
            return new ix("und", b, b);
        }
        gh1.d("MetadataUtil", "Failed to parse comment attribute: " + yi.a(i));
        return null;
    }

    public static l63 a(int i, String str, xb2 xb2Var) {
        int a2 = xb2Var.a();
        if (xb2Var.a() == 1684108385 && a2 >= 22) {
            xb2Var.e(xb2Var.b + 10);
            int p = xb2Var.p();
            if (p > 0) {
                String a3 = gg2.a(p, "");
                int p2 = xb2Var.p();
                if (p2 > 0) {
                    a3 = a3 + "/" + p2;
                }
                return new l63(str, null, a3);
            }
        }
        gh1.d("MetadataUtil", "Failed to parse index/count attribute: " + yi.a(i));
        return null;
    }

    public static se a(xb2 xb2Var) {
        String str;
        int a2 = xb2Var.a();
        if (xb2Var.a() == 1684108385) {
            int a3 = xb2Var.a() & 16777215;
            if (a3 == 13) {
                str = "image/jpeg";
            } else {
                str = a3 == 14 ? "image/png" : null;
            }
            if (str == null) {
                mf1.a(a3, "Unrecognized cover art flags: ", "MetadataUtil");
                return null;
            }
            xb2Var.e(xb2Var.b + 4);
            int i = a2 - 16;
            byte[] bArr = new byte[i];
            xb2Var.a(bArr, 0, i);
            return new se(str, null, 3, bArr);
        }
        gh1.d("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }
}

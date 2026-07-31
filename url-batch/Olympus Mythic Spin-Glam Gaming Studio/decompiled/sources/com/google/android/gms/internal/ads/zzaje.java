package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzaje {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
    
        if (r7 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0085, code lost:
    
        r7 = -9223372036854775807L;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzajd zza(String str) throws IOException {
        long j;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            if (!zzfv.zzb(newPullParser, "x:xmpmeta")) {
                throw zzat.zzb("Couldn't find xmp metadata", null);
            }
            zzgxm zzi = zzgxm.zzi();
            long j2 = -9223372036854775807L;
            do {
                newPullParser.next();
                if (zzfv.zzb(newPullParser, "rdf:Description")) {
                    String[] strArr = zza;
                    int i = 0;
                    for (int i2 = 0; i2 < 4; i2++) {
                        String zzc2 = zzfv.zzc(newPullParser, strArr[i2]);
                        if (zzc2 != null) {
                            if (Integer.parseInt(zzc2) != 1) {
                                return null;
                            }
                            String[] strArr2 = zzb;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= 4) {
                                    break;
                                }
                                String zzc3 = zzfv.zzc(newPullParser, strArr2[i3]);
                                if (zzc3 != null) {
                                    j = Long.parseLong(zzc3);
                                } else {
                                    i3++;
                                }
                            }
                            String[] strArr3 = zzc;
                            while (true) {
                                if (i >= 2) {
                                    zzi = zzgxm.zzi();
                                    break;
                                }
                                String zzc4 = zzfv.zzc(newPullParser, strArr3[i]);
                                if (zzc4 != null) {
                                    zzi = zzgxm.zzk(new zzajc("image/jpeg", "Primary", 0L, 0L), new zzajc("video/mp4", "MotionPhoto", Long.parseLong(zzc4), 0L));
                                    break;
                                }
                                i++;
                            }
                            j2 = j;
                        }
                    }
                    return null;
                }
                if (zzfv.zzb(newPullParser, "Container:Directory")) {
                    zzi = zzc(newPullParser, "Container", "Item");
                } else if (zzfv.zzb(newPullParser, "GContainer:Directory")) {
                    zzi = zzc(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!zzfv.zza(newPullParser, "x:xmpmeta"));
            if (zzi.isEmpty()) {
                return null;
            }
            return new zzajd(j2, zzi);
        } catch (zzat | NumberFormatException | XmlPullParserException unused) {
            zzeh.zzc("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    public static boolean zzb(@Nullable String str) {
        if (str == null) {
            return false;
        }
        String[] strArr = zza;
        for (int i = 0; i < 4; i++) {
            if (str.contains(String.valueOf(strArr[i]).concat("=\"1\""))) {
                return true;
            }
        }
        return false;
    }

    private static zzgxm zzc(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        int i = zzgxm.zzd;
        zzgxj zzgxjVar = new zzgxj();
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (zzfv.zzb(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String zzc2 = zzfv.zzc(xmlPullParser, concat2);
                String zzc3 = zzfv.zzc(xmlPullParser, concat3);
                String zzc4 = zzfv.zzc(xmlPullParser, concat4);
                String zzc5 = zzfv.zzc(xmlPullParser, concat5);
                if (zzc2 == null || zzc3 == null) {
                    return zzgxm.zzi();
                }
                zzgxjVar.zzf(new zzajc(zzc2, zzc3, zzc4 != null ? Long.parseLong(zzc4) : 0L, zzc5 != null ? Long.parseLong(zzc5) : 0L));
            }
        } while (!zzfv.zza(xmlPullParser, str.concat(":Directory")));
        return zzgxjVar.zzi();
    }
}

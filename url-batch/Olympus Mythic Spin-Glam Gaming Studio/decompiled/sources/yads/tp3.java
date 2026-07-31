package yads;

import java.io.StringReader;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes4.dex */
public abstract class tp3 {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r8 == (-1)) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static tv1 a(String str) {
        long j;
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!sp3.c(newPullParser, "x:xmpmeta")) {
            throw new cc2("Couldn't find xmp metadata", null, true, 1);
        }
        i41 i41Var = l41.c;
        um2 um2Var = um2.f;
        long j2 = -9223372036854775807L;
        loop0: do {
            newPullParser.next();
            if (sp3.c(newPullParser, "rdf:Description")) {
                String[] strArr = a;
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= 4) {
                        break loop0;
                    }
                    String a2 = sp3.a(newPullParser, strArr[i2]);
                    if (a2 == null) {
                        i2++;
                    } else if (Integer.parseInt(a2) == 1) {
                        String[] strArr2 = b;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= 4) {
                                break;
                            }
                            String a3 = sp3.a(newPullParser, strArr2[i3]);
                            if (a3 != null) {
                                j = Long.parseLong(a3);
                            } else {
                                i3++;
                            }
                        }
                        j = -9223372036854775807L;
                        String[] strArr3 = c;
                        while (true) {
                            if (i >= 2) {
                                i41 i41Var2 = l41.c;
                                um2Var = um2.f;
                                break;
                            }
                            String a4 = sp3.a(newPullParser, strArr3[i]);
                            if (a4 != null) {
                                um2Var = l41.a(new sv1("image/jpeg", 0L, 0L), new sv1("video/mp4", Long.parseLong(a4), 0L));
                                break;
                            }
                            i++;
                        }
                        j2 = j;
                    }
                }
                return null;
            }
            if (sp3.c(newPullParser, "Container:Directory")) {
                um2Var = a(newPullParser, "Container", "Item");
            } else if (sp3.c(newPullParser, "GContainer:Directory")) {
                um2Var = a(newPullParser, "GContainer", "GContainerItem");
            }
        } while (!sp3.b(newPullParser, "x:xmpmeta"));
        if (um2Var.isEmpty()) {
            return null;
        }
        return new tv1(j2, um2Var);
    }

    public static um2 a(XmlPullParser xmlPullParser, String str, String str2) {
        i41 i41Var = l41.c;
        dx.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        int i = 0;
        do {
            xmlPullParser.next();
            if (sp3.c(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String a2 = sp3.a(xmlPullParser, concat3);
                String a3 = sp3.a(xmlPullParser, concat4);
                String a4 = sp3.a(xmlPullParser, concat5);
                String a5 = sp3.a(xmlPullParser, concat6);
                if (a2 != null && a3 != null) {
                    sv1 sv1Var = new sv1(a2, a4 != null ? Long.parseLong(a4) : 0L, a5 != null ? Long.parseLong(a5) : 0L);
                    int i2 = i + 1;
                    if (objArr.length < i2) {
                        objArr = Arrays.copyOf(objArr, e41.a(objArr.length, i2));
                    }
                    objArr[i] = sv1Var;
                    i = i2;
                } else {
                    return um2.f;
                }
            }
        } while (!sp3.b(xmlPullParser, concat2));
        return l41.b(i, objArr);
    }
}

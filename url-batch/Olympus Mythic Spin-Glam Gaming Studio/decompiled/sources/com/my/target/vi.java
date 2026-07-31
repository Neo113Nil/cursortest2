package com.my.target;

import android.text.TextUtils;
import android.util.Xml;
import com.ironsource.X3;
import com.my.target.common.models.ImageData;
import com.my.target.hk;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes9.dex */
public final class vi {
    private static final String[] o = {"video/mp4", "application/vnd.apple.mpegurl", "application/x-mpegurl"};
    private final n a;
    private final y b;
    private final ArrayList c = new ArrayList();
    private final ArrayList d = new ArrayList();
    private final ArrayList e = new ArrayList();
    private final ArrayList f = new ArrayList();
    private final ArrayList g = new ArrayList();
    private boolean h;
    private String i;
    private String j;
    private ue k;
    private y l;
    private String m;
    private de n;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a {
        public final String a;
        public e b;
        public String c;
        public String d;

        public a(String str) {
            this.a = str;
        }

        public void a(String str) {
            if (TextUtils.isEmpty(str)) {
                mi.b("VastParser: Error: VAST adChoices declared but it's content is empty");
                return;
            }
            if (this.b != null) {
                mi.b("VastParser: Error: VAST adChoices declared but it's content is empty for creativeId = " + this.a);
                return;
            }
            try {
                this.b = ui.a().a(new JSONObject(str));
                mi.a("VastParser: Parsed adChoices for creative (id = " + this.a + ")");
            } catch (JSONException e) {
                mi.b("VastParser: VAST adChoices json error: " + e.getMessage());
                this.b = null;
            }
        }

        public void b(String str) {
            if (TextUtils.isEmpty(str)) {
                mi.b("VastParser: Error: VAST adDisclaimer declared but it's content is empty");
                return;
            }
            if (this.c == null) {
                this.c = str;
                return;
            }
            mi.b("VastParser: Error: VAST duplicate adDisclaimer for creativeId = " + this.a);
        }

        public void c(String str) {
            if (TextUtils.isEmpty(str)) {
                mi.b("VastParser: Error: VAST ageRestrictions declared but it's content is empty");
                return;
            }
            if (this.d == null) {
                this.d = str;
                return;
            }
            mi.b("VastParser: Error: VAST duplicate ageRestrictions for creativeId = " + this.a);
        }
    }

    private vi(n nVar, y yVar) {
        this.a = nVar;
        this.b = yVar;
        this.n = yVar.x();
    }

    public static vi a(n nVar, y yVar) {
        return new vi(nVar, yVar);
    }

    private void e(XmlPullParser xmlPullParser) {
        while (j(xmlPullParser) == 2) {
            if (f(xmlPullParser) == 2) {
                if (VastTagName.EXTENSION.equals(xmlPullParser.getName())) {
                    d(xmlPullParser);
                } else {
                    l(xmlPullParser);
                }
            }
        }
    }

    private static int f(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.getEventType();
        } catch (Throwable th) {
            mi.a("VastParser: Error - " + th.getMessage());
            return Integer.MIN_VALUE;
        }
    }

    private void g(XmlPullParser xmlPullParser) {
        String k = k(xmlPullParser);
        if (TextUtils.isEmpty(k)) {
            return;
        }
        this.c.add(rh.a("playbackStarted", k, false));
        mi.a("VastParser: Impression tracker url for wrapper - " + k);
    }

    private void h(XmlPullParser xmlPullParser) {
        while (j(xmlPullParser) == 2) {
            if (f(xmlPullParser) == 2) {
                String name = xmlPullParser.getName();
                if ("Impression".equals(name)) {
                    g(xmlPullParser);
                } else if ("Creatives".equals(name)) {
                    c(xmlPullParser);
                } else if (VastTagName.EXTENSIONS.equals(name)) {
                    e(xmlPullParser);
                } else if ("AdVerifications".equals(name)) {
                    b(xmlPullParser);
                } else {
                    l(xmlPullParser);
                }
            }
        }
        b();
    }

    private static int i(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.next();
        } catch (Throwable th) {
            mi.a("VastParser: Error - " + th.getMessage());
            return Integer.MIN_VALUE;
        }
    }

    private static int j(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.nextTag();
        } catch (Throwable th) {
            mi.a("VastParser: Error - " + th.getMessage());
            return Integer.MIN_VALUE;
        }
    }

    private static void l(XmlPullParser xmlPullParser) {
        if (f(xmlPullParser) != 2) {
            return;
        }
        int i = 1;
        while (i != 0) {
            int i2 = i(xmlPullParser);
            if (i2 == 2) {
                i++;
            } else if (i2 == 3) {
                i--;
            }
        }
    }

    private void m(XmlPullParser xmlPullParser) {
        while (j(xmlPullParser) == 2) {
            if (f(xmlPullParser) == 2 && "Ad".equals(xmlPullParser.getName())) {
                a(xmlPullParser);
            }
        }
    }

    private void n(XmlPullParser xmlPullParser) {
        String a2 = a(VastAttributes.VENDOR, xmlPullParser);
        String str = null;
        String str2 = null;
        while (j(xmlPullParser) == 2) {
            if (f(xmlPullParser) == 2) {
                String name = xmlPullParser.getName();
                if (VastTagName.JAVA_SCRIPT_RESOURCE.equals(name)) {
                    str = k(xmlPullParser);
                } else if (VastTagName.VERIFICATION_PARAMETERS.equals(name)) {
                    str2 = k(xmlPullParser);
                } else {
                    l(xmlPullParser);
                }
            }
        }
        if (str == null) {
            return;
        }
        if (this.n == null) {
            this.n = de.a(null, null);
        }
        this.n.c.add((TextUtils.isEmpty(a2) || TextUtils.isEmpty(str2)) ? xi.a(str) : xi.a(str, a2, str2));
    }

    float b(String str) {
        long j;
        try {
            if (str.contains(".")) {
                int indexOf = str.indexOf(".");
                j = Long.parseLong(str.substring(indexOf + 1));
                if (j > 1000) {
                    return -1.0f;
                }
                str = str.substring(0, indexOf);
            } else {
                j = 0;
            }
            String[] split = str.split(":", 3);
            long parseInt = Integer.parseInt(split[0]);
            long parseInt2 = Integer.parseInt(split[1]);
            long parseInt3 = Integer.parseInt(split[2]);
            if (parseInt >= 24 || parseInt2 >= 60 || parseInt3 >= 60) {
                return -1.0f;
            }
            return (((j + (parseInt3 * 1000)) + (parseInt2 * 60000)) + (parseInt * 3600000)) / 1000.0f;
        } catch (Throwable unused) {
            return -1.0f;
        }
    }

    public ArrayList c() {
        return this.g;
    }

    public y d() {
        return this.l;
    }

    private static String a(String str, XmlPullParser xmlPullParser) {
        return xmlPullParser.getAttributeValue(null, str);
    }

    private void d(XmlPullParser xmlPullParser) {
        String a2 = a("type", xmlPullParser);
        if ("linkTxt".equals(a2)) {
            String k = k(xmlPullParser);
            this.i = ti.a(k);
            mi.a("VastParser: VAST linkTxt raw text: " + k);
        } else if ("erid".equals(a2)) {
            this.m = ti.a(k(xmlPullParser));
            mi.a("VastParser: ERID text: " + this.m);
        } else if ("yandex_ad_info".equals(a2)) {
            hk d = d(k(xmlPullParser));
            if (d != null) {
                this.j = d.b().c;
                List list = d.a().a;
                if (list != null && !list.isEmpty()) {
                    this.k = ue.a(d.b().a, ImageData.newImageData(((hk.a.C1683a) list.get(0)).a, ((hk.a.C1683a) list.get(0)).b, ((hk.a.C1683a) list.get(0)).c));
                }
            }
            mi.a("VastParser: VAST yandex_ad_info additional text: " + this.j);
            mi.a("VastParser: VAST yandex_ad_info postView: " + this.k);
        }
        l(xmlPullParser);
    }

    private static String k(XmlPullParser xmlPullParser) {
        String str;
        if (i(xmlPullParser) == 4) {
            str = xmlPullParser.getText();
            j(xmlPullParser);
        } else {
            mi.a("VastParser: No text - " + xmlPullParser.getName());
            str = "";
        }
        return str.trim();
    }

    public void c(String str) {
        XmlPullParser newPullParser = Xml.newPullParser();
        try {
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            newPullParser.setInput(new StringReader(str));
            a();
            for (int f = f(newPullParser); f != 1 && f != Integer.MIN_VALUE; f = i(newPullParser)) {
                if (f == 2 && VastTagName.VAST.equalsIgnoreCase(newPullParser.getName())) {
                    m(newPullParser);
                }
            }
        } catch (Throwable th) {
            mi.a("VastParser: Unable to parse VAST - " + th.getMessage());
        }
    }

    private static String a(String str) {
        return str.replaceAll("&amp;", X3.j.c).replaceAll("&lt;", "<").replaceAll("&gt;", ">").trim();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void a(eb ebVar, String str) {
        float f;
        if (str != null) {
            if (str.contains("%")) {
                int parseInt = Integer.parseInt(str.substring(0, str.length() - 1));
                mi.a("VastParser: Linear skipoffset is " + str + " [%]");
                f = (ebVar.t() / 100.0f) * ((float) parseInt);
            } else if (str.contains(":")) {
                try {
                    f = b(str);
                } catch (Throwable unused) {
                    mi.d("VastParser: Failed to convert ISO time skipoffset string " + str + " with banner id " + ebVar.x());
                }
            }
            if (f <= 0.0f) {
                ebVar.c(f);
                return;
            }
            return;
        }
        f = -1.0f;
        if (f <= 0.0f) {
        }
    }

    private void e(XmlPullParser xmlPullParser, eb ebVar) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        while (j(xmlPullParser) == 2) {
            if (f(xmlPullParser) == 2) {
                if ("MediaFile".equals(xmlPullParser.getName())) {
                    String a2 = a("type", xmlPullParser);
                    String a3 = a(VastAttributes.BITRATE, xmlPullParser);
                    String a4 = a("width", xmlPullParser);
                    String a5 = a("height", xmlPullParser);
                    String a6 = a(k(xmlPullParser));
                    dj djVar = null;
                    if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(a6)) {
                        String[] strArr = o;
                        int length = strArr.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                break;
                            }
                            if (strArr[i4].equals(a2)) {
                                if (a4 != null) {
                                    try {
                                        i = Integer.parseInt(a4);
                                    } catch (Throwable unused) {
                                        i = 0;
                                        i2 = 0;
                                    }
                                } else {
                                    i = 0;
                                }
                                if (a5 != null) {
                                    try {
                                        i2 = Integer.parseInt(a5);
                                    } catch (Throwable unused2) {
                                        i2 = 0;
                                    }
                                } else {
                                    i2 = 0;
                                }
                                if (a3 != null) {
                                    try {
                                        i3 = Integer.parseInt(a3);
                                    } catch (Throwable unused3) {
                                    }
                                }
                                if (i > 0 && i2 > 0) {
                                    djVar = dj.a(a6, i, i2, null);
                                    djVar.a(i3);
                                }
                            } else {
                                i4++;
                            }
                        }
                    }
                    if (djVar == null) {
                        mi.a("VastParser: Skipping unsupported VAST file (mimeType=" + a2 + ",width=" + a4 + ",height=" + a5 + ",url=" + a6);
                    } else {
                        arrayList.add(djVar);
                    }
                } else {
                    l(xmlPullParser);
                }
            }
        }
        ebVar.a(dj.a(arrayList, this.a.l()));
    }

    private void b() {
        for (int i = 0; i < this.g.size(); i++) {
            eb ebVar = (eb) this.g.get(i);
            th H = ebVar.H();
            H.a(this.b.m(), ebVar.t());
            String q = this.b.q();
            if (TextUtils.isEmpty(q)) {
                q = this.i;
            }
            ebVar.g(q);
            String t = this.b.t();
            if (TextUtils.isEmpty(t)) {
                t = this.m;
            }
            ebVar.F(t);
            String p = this.b.p();
            if (TextUtils.isEmpty(p)) {
                p = this.j;
            }
            ebVar.e(p);
            ue D = this.b.D();
            if (D == null) {
                D = this.k;
            }
            ebVar.a(D);
            ArrayList arrayList = this.e;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                xe xeVar = (xe) obj;
                a(xeVar.g(), xeVar.c(), ebVar);
            }
            H.a((List) this.d);
            ArrayList arrayList2 = this.f;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                ebVar.a((c3) obj2);
            }
            if (i == 0) {
                H.a((List) this.c);
                ArrayList arrayList3 = this.f;
                int size3 = arrayList3.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj3 = arrayList3.get(i4);
                    i4++;
                    ((c3) obj3).H().a(this.b.m());
                }
            }
            ebVar.a(this.n);
        }
    }

    private void c(XmlPullParser xmlPullParser) {
        while (j(xmlPullParser) == 2) {
            if (f(xmlPullParser) == 2) {
                if ("Creative".equals(xmlPullParser.getName())) {
                    a(xmlPullParser, a("id", xmlPullParser));
                } else {
                    l(xmlPullParser);
                }
            }
        }
    }

    private void a() {
        ArrayList v = this.b.v();
        if (v != null) {
            this.c.addAll(v);
        }
        ArrayList o2 = this.b.o();
        if (o2 != null) {
            this.f.addAll(o2);
        }
    }

    private void c(XmlPullParser xmlPullParser, eb ebVar) {
        if (!"instreamads".equals(this.a.i()) && !"fullscreen".equals(this.a.i()) && !"rewarded".equals(this.a.i())) {
            if ("instreamaudioads".equals(this.a.i())) {
                a(xmlPullParser, ebVar);
                return;
            }
            return;
        }
        e(xmlPullParser, ebVar);
    }

    private void a(XmlPullParser xmlPullParser) {
        while (j(xmlPullParser) == 2) {
            if (f(xmlPullParser) == 2) {
                String name = xmlPullParser.getName();
                if ("Wrapper".equals(name)) {
                    this.h = true;
                    mi.a("VastParser: VAST file contains wrapped ad information");
                    int E = this.b.E();
                    if (E < 5) {
                        a(xmlPullParser, E);
                    } else {
                        mi.a("VastParser: Got VAST wrapper, but max redirects limit exceeded");
                        l(xmlPullParser);
                    }
                } else if ("InLine".equals(name)) {
                    this.h = false;
                    mi.a("VastParser: VAST file contains inline ad information.");
                    h(xmlPullParser);
                } else {
                    l(xmlPullParser);
                }
            }
        }
    }

    private void d(XmlPullParser xmlPullParser, eb ebVar) {
        while (j(xmlPullParser) == 2) {
            if (f(xmlPullParser) == 2) {
                String name = xmlPullParser.getName();
                if ("ClickThrough".equals(name)) {
                    if (ebVar != null) {
                        String k = k(xmlPullParser);
                        if (!TextUtils.isEmpty(k)) {
                            ebVar.x(a(k));
                        }
                    }
                } else if ("ClickTracking".equals(name)) {
                    String k2 = k(xmlPullParser);
                    if (!TextUtils.isEmpty(k2)) {
                        this.d.add(rh.a("click", k2, false));
                    }
                } else {
                    l(xmlPullParser);
                }
            }
        }
    }

    private void a(XmlPullParser xmlPullParser, int i) {
        String str = null;
        while (j(xmlPullParser) == 2) {
            if (f(xmlPullParser) == 2) {
                String name = xmlPullParser.getName();
                if ("Impression".equals(name)) {
                    g(xmlPullParser);
                } else if ("Creatives".equals(name)) {
                    c(xmlPullParser);
                } else if (VastTagName.EXTENSIONS.equals(name)) {
                    e(xmlPullParser);
                } else if ("VASTAdTagURI".equals(name)) {
                    str = k(xmlPullParser);
                } else if ("AdVerifications".equals(name)) {
                    b(xmlPullParser);
                } else {
                    l(xmlPullParser);
                }
            }
        }
        if (str != null) {
            String q = this.b.q();
            String p = this.b.p();
            ue D = this.b.D();
            y b = y.b(str);
            this.l = b;
            b.e(i + 1);
            this.l.c(this.c);
            this.l.a(this.n);
            y yVar = this.l;
            if (TextUtils.isEmpty(q)) {
                q = this.i;
            }
            yVar.e(q);
            y yVar2 = this.l;
            if (TextUtils.isEmpty(p)) {
                p = this.j;
            }
            yVar2.d(p);
            y yVar3 = this.l;
            if (D == null) {
                D = this.k;
            }
            yVar3.a(D);
            this.l.b(this.f);
            this.l.b(this.b.d());
            this.l.c(this.b.f());
            this.l.e(this.b.h());
            this.l.f(this.b.i());
            this.l.g(this.b.j());
            this.l.j(this.b.r());
            this.l.l(this.b.z());
            this.l.a(this.b.e());
            this.l.d(this.b.g());
            this.l.a(this.b.a());
            this.l.c(this.b.b());
            th m = this.l.m();
            m.a((List) this.d);
            m.a(this.e);
            m.a(this.b.m(), -1.0f);
            this.b.a(this.l);
            return;
        }
        mi.a("VastParser: Got VAST wrapper, but no vastAdTagUri");
    }

    private void b(XmlPullParser xmlPullParser, String str, String str2) {
        while (j(xmlPullParser) == 2) {
            a(xmlPullParser, str, str2);
        }
    }

    private void b(XmlPullParser xmlPullParser) {
        while (j(xmlPullParser) == 2) {
            if (f(xmlPullParser) == 2) {
                if (VastTagName.VERIFICATION.equals(xmlPullParser.getName())) {
                    n(xmlPullParser);
                } else {
                    l(xmlPullParser);
                }
            }
        }
    }

    private hk d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            hk a2 = wi.a().a(new JSONObject(str));
            mi.a("VastParser: Parsed yandex_ad_info: " + a2);
            return a2;
        } catch (JSONException e) {
            mi.a("VastParser: Failed to parse yandex_ad_info: " + e);
            return null;
        }
    }

    private boolean b(XmlPullParser xmlPullParser, eb ebVar) {
        float f;
        try {
            f = b(k(xmlPullParser));
        } catch (Throwable unused) {
            f = 0.0f;
        }
        if (f <= 0.0f) {
            return false;
        }
        ebVar.a(f);
        return true;
    }

    private void b(String str, String str2, b bVar) {
        if (bVar != null) {
            bVar.H().a(rh.a(str, str2, false));
        } else {
            this.d.add(rh.a(str, str2, false));
        }
    }

    private void a(XmlPullParser xmlPullParser, a aVar) {
        while (j(xmlPullParser) == 2) {
            if (f(xmlPullParser) == 2) {
                if ("CreativeExtension".equals(xmlPullParser.getName())) {
                    a(xmlPullParser, a("type", xmlPullParser), aVar);
                } else {
                    l(xmlPullParser);
                }
            }
        }
    }

    private void a(XmlPullParser xmlPullParser, String str, a aVar) {
        if ("adChoices".equals(str)) {
            mi.a("VastParser: Found adChoices for creative (id = " + aVar.a + ")");
            aVar.a(a(k(xmlPullParser)));
            return;
        }
        if ("adDisclaimer".equals(str)) {
            mi.a("VastParser: Found adDisclaimer for creative (id = " + aVar.a + ")");
            aVar.b(k(xmlPullParser));
            return;
        }
        if ("adAgeRestriction".equals(str)) {
            mi.a("VastParser: Found adAgeRestrictions for creative (id = " + aVar.a + ")");
            aVar.c(k(xmlPullParser));
            return;
        }
        l(xmlPullParser);
    }

    private void a(XmlPullParser xmlPullParser, String str) {
        final a aVar = new a(str);
        boolean z = false;
        int i = 0;
        while (j(xmlPullParser) == 2) {
            if (f(xmlPullParser) == 2) {
                String name = xmlPullParser.getName();
                if ("CreativeExtensions".equals(name)) {
                    a(xmlPullParser, aVar);
                } else {
                    eb ebVar = null;
                    String str2 = null;
                    if ("Linear".equals(name)) {
                        if (!this.h) {
                            ebVar = eb.a(w0.d, null);
                            ebVar.n(str != null ? str : "");
                        }
                        a(xmlPullParser, ebVar, a(VastAttributes.SKIP_OFFSET, xmlPullParser));
                        if (ebVar != null) {
                            if (ebVar.t() > 0.0f) {
                                if (ebVar.A0() != null) {
                                    this.g.add(ebVar);
                                    z = true;
                                } else {
                                    mi.b("VastParser: Error: VAST has no valid mediaData with banner id " + ebVar.x());
                                }
                            } else {
                                mi.b("VastParser: Error: VAST has no valid Duration with banner id " + ebVar.x());
                            }
                        }
                    } else if (name != null && name.equals("CompanionAds")) {
                        String a2 = a("required", xmlPullParser);
                        if (a2 == null || "all".equals(a2) || "any".equals(a2) || "none".equals(a2)) {
                            str2 = a2;
                        } else {
                            mi.b("VastParser: Error: Wrong companion required attribute: " + a2 + "with banner id " + str);
                        }
                        int size = this.f.size();
                        b(xmlPullParser, str, str2);
                        i = this.f.size() - size;
                        mi.a("VastParser: parsed " + i + " companion banners");
                    } else {
                        l(xmlPullParser);
                    }
                }
            }
        }
        a(z, i, new g3() { // from class: com.my.target.vi$$ExternalSyntheticLambda0
            @Override // com.my.target.g3
            public final void accept(Object obj) {
                vi.this.a(aVar, (b) obj);
            }
        });
    }

    private void a(boolean z, int i, g3 g3Var) {
        if (z) {
            g3Var.accept((eb) this.g.get(r1.size() - 1));
        } else {
            for (int size = this.f.size() - i; size < this.f.size(); size++) {
                g3Var.accept((c3) this.f.get(size));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar, a aVar) {
        e eVar = aVar.b;
        if (eVar != null) {
            bVar.a(eVar);
        }
        String str = aVar.c;
        if (str != null) {
            bVar.j(str);
        }
        String str2 = aVar.d;
        if (str2 != null) {
            bVar.b(str2);
        }
    }

    private void a(XmlPullParser xmlPullParser, String str, String str2) {
        if (f(xmlPullParser) != 2) {
            return;
        }
        String name = xmlPullParser.getName();
        if (name != null && name.equals("Companion")) {
            String a2 = a("width", xmlPullParser);
            String a3 = a("height", xmlPullParser);
            String a4 = a("id", xmlPullParser);
            c3 h0 = c3.h0();
            if (a4 == null) {
                a4 = "";
            }
            h0.n(a4);
            try {
                h0.d(Integer.parseInt(a2));
                h0.b(Integer.parseInt(a3));
            } catch (Throwable unused) {
                mi.b("VastParser: Error: Unable  to convert required companion attributes, width = " + a2 + " height = " + a3);
            }
            h0.E(str2);
            String a5 = a(VastAttributes.ASSET_WIDTH, xmlPullParser);
            String a6 = a(VastAttributes.ASSET_HEIGHT, xmlPullParser);
            try {
                if (!TextUtils.isEmpty(a5)) {
                    h0.f(Integer.parseInt(a5));
                }
                if (!TextUtils.isEmpty(a6)) {
                    h0.e(Integer.parseInt(a6));
                }
            } catch (Throwable th) {
                mi.a("VastParser: Wrong VAST asset dimensions - " + th.getMessage());
            }
            String a7 = a(VastAttributes.EXPANDED_WIDTH, xmlPullParser);
            String a8 = a(VastAttributes.EXPANDED_HEIGHT, xmlPullParser);
            try {
                if (!TextUtils.isEmpty(a7)) {
                    h0.h(Integer.parseInt(a7));
                }
                if (!TextUtils.isEmpty(a8)) {
                    h0.g(Integer.parseInt(a8));
                }
            } catch (Throwable th2) {
                mi.a("VastParser: Wrong VAST expanded dimensions " + th2.getMessage());
            }
            h0.A(a(VastAttributes.AD_SLOT_ID, xmlPullParser));
            h0.B(a(VastAttributes.API_FRAMEWORK, xmlPullParser));
            this.f.add(h0);
            while (j(xmlPullParser) == 2) {
                String name2 = xmlPullParser.getName();
                if ("StaticResource".equals(name2)) {
                    h0.F(ti.a(k(xmlPullParser)));
                } else if ("HTMLResource".equals(name2)) {
                    h0.C(ti.a(k(xmlPullParser)));
                } else if ("IFrameResource".equals(name2)) {
                    h0.D(ti.a(k(xmlPullParser)));
                } else if ("CompanionClickThrough".equals(name2)) {
                    String k = k(xmlPullParser);
                    if (!TextUtils.isEmpty(k)) {
                        h0.x(a(k));
                    }
                } else if ("CompanionClickTracking".equals(name2)) {
                    String k2 = k(xmlPullParser);
                    if (!TextUtils.isEmpty(k2)) {
                        h0.H().a(rh.a("click", k2, false));
                    }
                } else if ("TrackingEvents".equals(name2)) {
                    a(xmlPullParser, (b) h0, true);
                } else {
                    l(xmlPullParser);
                }
            }
            return;
        }
        l(xmlPullParser);
    }

    private void a(XmlPullParser xmlPullParser, eb ebVar) {
        int parseInt;
        while (j(xmlPullParser) == 2) {
            if (f(xmlPullParser) == 2) {
                if ("MediaFile".equals(xmlPullParser.getName())) {
                    String a2 = a("type", xmlPullParser);
                    String a3 = a(VastAttributes.BITRATE, xmlPullParser);
                    String a4 = a(k(xmlPullParser));
                    q0 q0Var = null;
                    if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(a4) && a2.toLowerCase(Locale.ROOT).trim().startsWith("audio")) {
                        if (a3 != null) {
                            try {
                                parseInt = Integer.parseInt(a3);
                            } catch (Throwable unused) {
                            }
                            q0Var = q0.a(a4, null);
                            q0Var.a(parseInt);
                        }
                        parseInt = 0;
                        q0Var = q0.a(a4, null);
                        q0Var.a(parseInt);
                    }
                    if (q0Var == null) {
                        mi.a("VastParser: Skipping unsupported VAST file (mimetype=" + a2 + ",url=" + a4);
                    } else {
                        ebVar.a(q0Var);
                    }
                } else {
                    l(xmlPullParser);
                }
            }
        }
    }

    private void a(XmlPullParser xmlPullParser, b bVar, boolean z) {
        while (j(xmlPullParser) == 2) {
            if (f(xmlPullParser) == 2) {
                if ("Tracking".equals(xmlPullParser.getName())) {
                    String a2 = a("event", xmlPullParser);
                    String a3 = a("offset", xmlPullParser);
                    if (a2 != null) {
                        if ("progress".equals(a2) && !TextUtils.isEmpty(a3)) {
                            if (a3.endsWith("%")) {
                                try {
                                    a(Integer.parseInt(a3.replace("%", "")), k(xmlPullParser), bVar);
                                } catch (Throwable unused) {
                                    mi.a("VastParser: Unable to parse progress stat with value " + a3);
                                }
                            } else {
                                a(a3, k(xmlPullParser), bVar);
                            }
                        } else {
                            a(a2, k(xmlPullParser), bVar, z);
                        }
                    }
                    mi.a("VastParser: Added VAST tracking \"" + a2 + "\"");
                } else {
                    l(xmlPullParser);
                }
            }
        }
    }

    private void a(String str, String str2, b bVar) {
        float f;
        try {
            f = b(str);
        } catch (Throwable unused) {
            f = -1.0f;
        }
        if (f >= 0.0f) {
            xe b = xe.b(str2);
            b.b(f);
            if (bVar != null) {
                bVar.H().a(b);
                return;
            } else {
                this.d.add(b);
                return;
            }
        }
        mi.a("VastParser: Unable to parse progress stat with value " + str);
    }

    private void a(float f, String str, b bVar) {
        xe b = xe.b(str);
        if (bVar != null && bVar.t() > 0.0f) {
            b.b(bVar.t() * (f / 100.0f));
            bVar.H().a(b);
        } else {
            b.a(f);
            this.e.add(b);
        }
    }

    private void a(String str, String str2, b bVar, boolean z) {
        if ("start".equalsIgnoreCase(str)) {
            b(z ? "show" : "playbackStarted", str2, bVar);
            return;
        }
        if ("firstQuartile".equalsIgnoreCase(str)) {
            a(25.0f, str2, bVar);
            return;
        }
        if ("midpoint".equalsIgnoreCase(str)) {
            a(50.0f, str2, bVar);
            return;
        }
        if ("thirdQuartile".equalsIgnoreCase(str)) {
            a(75.0f, str2, bVar);
            return;
        }
        if ("complete".equalsIgnoreCase(str)) {
            a(100.0f, str2, bVar);
            return;
        }
        if ("creativeView".equalsIgnoreCase(str)) {
            b(z ? "show" : "playbackStarted", str2, bVar);
            return;
        }
        if ("mute".equalsIgnoreCase(str)) {
            b("volumeOff", str2, bVar);
            return;
        }
        if ("unmute".equalsIgnoreCase(str)) {
            b("volumeOn", str2, bVar);
            return;
        }
        if ("pause".equalsIgnoreCase(str)) {
            b("playbackPaused", str2, bVar);
            return;
        }
        if ("resume".equalsIgnoreCase(str)) {
            b("playbackResumed", str2, bVar);
            return;
        }
        if ("fullscreen".equalsIgnoreCase(str)) {
            b("fullscreenOn", str2, bVar);
            return;
        }
        if ("exitFullscreen".equalsIgnoreCase(str)) {
            b("fullscreenOff", str2, bVar);
            return;
        }
        if ("skip".equalsIgnoreCase(str)) {
            b("closedByUser", str2, bVar);
            return;
        }
        if ("error".equalsIgnoreCase(str)) {
            b("error", str2, bVar);
            return;
        }
        if ("ClickTracking".equalsIgnoreCase(str)) {
            b("click", str2, bVar);
        } else if ("close".equalsIgnoreCase(str)) {
            b("closedByUser", str2, bVar);
        } else if ("closeLinear".equalsIgnoreCase(str)) {
            b("closedByUser", str2, bVar);
        }
    }

    private void a(XmlPullParser xmlPullParser, eb ebVar, String str) {
        while (j(xmlPullParser) == 2) {
            String name = xmlPullParser.getName();
            if (f(xmlPullParser) == 2) {
                if ("Duration".equals(name)) {
                    if (ebVar == null) {
                        continue;
                    } else if (!b(xmlPullParser, ebVar)) {
                        return;
                    } else {
                        a(ebVar, str);
                    }
                } else if ("TrackingEvents".equals(name)) {
                    a(xmlPullParser, (b) ebVar, false);
                } else if ("MediaFiles".equals(name)) {
                    if (ebVar == null) {
                        continue;
                    } else {
                        c(xmlPullParser, ebVar);
                        if (ebVar.A0() == null) {
                            mi.a("VastParser: Unable to find valid mediafile!");
                            return;
                        }
                    }
                } else if ("VideoClicks".equals(name)) {
                    d(xmlPullParser, ebVar);
                } else {
                    l(xmlPullParser);
                }
            }
        }
    }
}

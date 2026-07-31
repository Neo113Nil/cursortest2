package io.bidmachine.iab.vast.tags;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes13.dex */
public class AdContentTag extends VastXmlTag {
    private AdSystemTag c;
    private List d;
    private List e;
    private List f;
    private List g;

    AdContentTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    private ExtensionTag f(XmlPullParser xmlPullParser) {
        ExtensionTag extensionTag;
        xmlPullParser.require(2, null, VastTagName.EXTENSION);
        String a = new ExtensionTag(xmlPullParser).a("type");
        if (VastXmlTag.a(a, "appodeal")) {
            extensionTag = new AppodealExtensionTag(xmlPullParser);
        } else if (VastXmlTag.a(a, "AdVerifications")) {
            ExtensionTag extensionTag2 = null;
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (VastXmlTag.a(xmlPullParser.getName(), "AdVerifications")) {
                        extensionTag2 = new AdVerificationsExtensionTag(xmlPullParser);
                    } else {
                        VastXmlTag.d(xmlPullParser);
                    }
                }
            }
            extensionTag = extensionTag2;
        } else {
            VastXmlTag.d(xmlPullParser);
            extensionTag = null;
        }
        xmlPullParser.require(3, null, VastTagName.EXTENSION);
        return extensionTag;
    }

    void a(AdSystemTag adSystemTag) {
        this.c = adSystemTag;
    }

    void b(List list) {
        this.e = list;
    }

    List e(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, "Creatives");
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (VastXmlTag.a(xmlPullParser.getName(), "Creative")) {
                    arrayList.add(new CreativeTag(xmlPullParser));
                } else {
                    VastXmlTag.d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "Creatives");
        return arrayList;
    }

    List g(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, VastTagName.EXTENSIONS);
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (VastXmlTag.a(xmlPullParser.getName(), VastTagName.EXTENSION)) {
                    ExtensionTag f = f(xmlPullParser);
                    if (f != null) {
                        arrayList.add(f);
                    }
                } else {
                    VastXmlTag.d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, VastTagName.EXTENSIONS);
        return arrayList;
    }

    @Nullable
    public List<CreativeTag> getCreativeTagList() {
        return this.d;
    }

    @Nullable
    public List<String> getErrorUrlList() {
        return this.g;
    }

    @Nullable
    public List<ExtensionTag> getExtensionTagList() {
        return this.e;
    }

    @Nullable
    public List<String> getImpressionUrlList() {
        return this.f;
    }

    void l(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.g == null) {
            this.g = new ArrayList();
        }
        this.g.add(str);
    }

    void m(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.f.add(str);
    }

    void a(List list) {
        this.d = list;
    }
}

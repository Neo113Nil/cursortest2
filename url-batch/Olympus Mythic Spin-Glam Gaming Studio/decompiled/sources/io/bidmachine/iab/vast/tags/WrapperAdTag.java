package io.bidmachine.iab.vast.tags;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public class WrapperAdTag extends AdContentTag {
    private static final String[] i = {VastAttributes.FOLLOW_ADDITIONAL_WRAPPERS, VastAttributes.ALLOW_MULTIPLE_ADS, VastAttributes.FALLBACK_ON_NO_AD};
    private String h;

    public WrapperAdTag(@NonNull XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        xmlPullParser.require(2, null, "Wrapper");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (VastXmlTag.a(name, "Creatives")) {
                    a(e(xmlPullParser));
                } else if (VastXmlTag.a(name, VastTagName.EXTENSIONS)) {
                    b(g(xmlPullParser));
                } else if (VastXmlTag.a(name, "Impression")) {
                    m(VastXmlTag.c(xmlPullParser));
                } else if (VastXmlTag.a(name, "Error")) {
                    l(VastXmlTag.c(xmlPullParser));
                } else if (VastXmlTag.a(name, "AdSystem")) {
                    a(new AdSystemTag(xmlPullParser));
                } else if (VastXmlTag.a(name, "VASTAdTagURI")) {
                    n(VastXmlTag.c(xmlPullParser));
                } else {
                    VastXmlTag.d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "Wrapper");
    }

    private void n(String str) {
        this.h = str;
    }

    @Override // io.bidmachine.iab.vast.tags.VastXmlTag
    @NonNull
    public String[] getSupportedAttributes() {
        return i;
    }

    @Nullable
    public String getVastAdTagUri() {
        return this.h;
    }
}

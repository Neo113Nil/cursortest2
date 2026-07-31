package io.bidmachine.iab.vast.tags;

import androidx.annotation.NonNull;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes4.dex */
public class TrackingTag extends VastXmlTag {
    private static final String[] c = {"event"};

    TrackingTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    @Override // io.bidmachine.iab.vast.tags.VastXmlTag
    @NonNull
    public String[] getSupportedAttributes() {
        return c;
    }
}

package io.bidmachine.iab.vast.tags;

import androidx.annotation.NonNull;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public class ExtensionTag extends VastXmlTag {
    private static final String[] c = {"type"};

    ExtensionTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    @Override // io.bidmachine.iab.vast.tags.VastXmlTag
    @NonNull
    public String[] getSupportedAttributes() {
        return c;
    }
}

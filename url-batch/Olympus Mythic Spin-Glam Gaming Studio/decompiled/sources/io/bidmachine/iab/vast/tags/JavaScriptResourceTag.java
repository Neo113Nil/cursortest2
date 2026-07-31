package io.bidmachine.iab.vast.tags;

import androidx.annotation.NonNull;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes4.dex */
public class JavaScriptResourceTag extends VastXmlTag {
    private static final String[] c = {VastAttributes.API_FRAMEWORK};

    JavaScriptResourceTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    @Override // io.bidmachine.iab.vast.tags.VastXmlTag
    @NonNull
    public String[] getSupportedAttributes() {
        return c;
    }

    @Override // io.bidmachine.iab.vast.tags.VastXmlTag
    public boolean isTextSupported() {
        return true;
    }
}

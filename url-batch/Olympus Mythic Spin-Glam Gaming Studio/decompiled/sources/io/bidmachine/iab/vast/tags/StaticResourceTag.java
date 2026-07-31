package io.bidmachine.iab.vast.tags;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes10.dex */
public class StaticResourceTag extends VastXmlTag {
    private static final String[] c = {"creativeType"};

    StaticResourceTag(XmlPullParser xmlPullParser) {
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

    @Override // io.bidmachine.iab.vast.tags.VastXmlTag
    public boolean isValidTag() {
        String a = a("creativeType");
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        return a.matches("image/.*(?i)(gif|jpeg|jpg|bmp|png)");
    }
}

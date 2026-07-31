package net.pubnative.lite.sdk.vpaid.models.vast;

import android.text.TextUtils;
import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Text;

/* loaded from: classes6.dex */
public class AdParameters {

    @Text
    private String text;

    @Attribute
    private String xmlEncoded;

    public String getText() {
        return TextUtils.isEmpty(this.text) ? "" : this.text.trim();
    }

    public String getXmlEncoded() {
        return this.xmlEncoded;
    }
}

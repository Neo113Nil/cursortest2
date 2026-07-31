package com.smaato.sdk.ng.vpaid.models.vast;

import android.text.TextUtils;
import com.smaato.sdk.ng.vpaid.xml.Attribute;
import com.smaato.sdk.ng.vpaid.xml.Text;

/* loaded from: classes3.dex */
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

package com.smaato.sdk.ng.vpaid.models.vast;

import android.text.TextUtils;
import com.smaato.sdk.ng.vpaid.xml.Attribute;
import com.smaato.sdk.ng.vpaid.xml.Text;

/* loaded from: classes4.dex */
public class ClosedCaptionFile {

    @Attribute
    private String language;

    @Text
    private String text;

    @Attribute
    private String type;

    public String getText() {
        return TextUtils.isEmpty(this.text) ? "" : this.text.trim();
    }

    public String isLanguage() {
        return this.language;
    }

    public String isType() {
        return this.type;
    }
}

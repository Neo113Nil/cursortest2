package com.smaato.sdk.ng.vpaid.models.vast;

import android.text.TextUtils;
import com.smaato.sdk.ng.vpaid.xml.Attribute;
import com.smaato.sdk.ng.vpaid.xml.Text;

/* loaded from: classes4.dex */
public class UniversalAdId {

    @Attribute
    private String idRegistry;

    @Attribute
    private String idValue;

    @Text
    private String text;

    public String getIdRegistry() {
        return this.idRegistry;
    }

    public String getIdValue() {
        return this.idValue;
    }

    public String getText() {
        return TextUtils.isEmpty(this.text) ? "" : this.text.trim();
    }
}

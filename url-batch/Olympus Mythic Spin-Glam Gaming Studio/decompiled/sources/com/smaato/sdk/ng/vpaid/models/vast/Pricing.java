package com.smaato.sdk.ng.vpaid.models.vast;

import android.text.TextUtils;
import com.smaato.sdk.ng.vpaid.xml.Attribute;
import com.smaato.sdk.ng.vpaid.xml.Text;

/* loaded from: classes3.dex */
public class Pricing {

    @Attribute
    private String currency;

    @Attribute
    private String model;

    @Text
    private String text;

    public String getCurrency() {
        return this.currency;
    }

    public String getModel() {
        return this.model;
    }

    public String getText() {
        return TextUtils.isEmpty(this.text) ? "" : this.text.trim();
    }
}

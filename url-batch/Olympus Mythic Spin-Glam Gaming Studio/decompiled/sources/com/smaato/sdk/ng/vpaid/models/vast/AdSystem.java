package com.smaato.sdk.ng.vpaid.models.vast;

import android.text.TextUtils;
import com.smaato.sdk.ng.vpaid.xml.Attribute;
import com.smaato.sdk.ng.vpaid.xml.Text;

/* loaded from: classes4.dex */
public class AdSystem {

    @Text
    private String text;

    @Attribute
    private String version;

    public String getText() {
        return TextUtils.isEmpty(this.text) ? "" : this.text.trim();
    }

    public String getVersion() {
        return this.version;
    }
}

package com.smaato.sdk.ng.vpaid.models.vast;

import android.text.TextUtils;
import com.smaato.sdk.ng.vpaid.xml.Attribute;
import com.smaato.sdk.ng.vpaid.xml.Text;

/* loaded from: classes4.dex */
public class JavaScriptResource {

    @Attribute
    private String apiFramework;

    @Attribute
    private String browserOptional;

    @Text
    private String text;

    public String getApiFramework() {
        return this.apiFramework;
    }

    public String getText() {
        return TextUtils.isEmpty(this.text) ? "" : this.text.trim();
    }

    public String isBrowserOptional() {
        return this.browserOptional;
    }
}

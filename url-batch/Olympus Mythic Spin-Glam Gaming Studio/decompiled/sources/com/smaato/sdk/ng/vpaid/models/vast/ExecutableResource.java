package com.smaato.sdk.ng.vpaid.models.vast;

import android.text.TextUtils;
import com.smaato.sdk.ng.vpaid.xml.Attribute;
import com.smaato.sdk.ng.vpaid.xml.Text;

/* loaded from: classes4.dex */
public class ExecutableResource {

    @Attribute
    private String apiFramework;

    @Text
    private String text;

    @Attribute
    private String type;

    public String getApiFramework() {
        return this.apiFramework;
    }

    public String getText() {
        return TextUtils.isEmpty(this.text) ? "" : this.text.trim();
    }

    public String getType() {
        return this.type;
    }
}

package com.smaato.sdk.ng.vpaid.models.vast;

import android.text.TextUtils;
import com.smaato.sdk.ng.vpaid.xml.Attribute;
import com.smaato.sdk.ng.vpaid.xml.Text;

/* loaded from: classes5.dex */
public class Tracking {

    @Attribute
    private String event;

    @Attribute
    private String offset;

    @Text
    private String text;

    public String getEvent() {
        return TextUtils.isEmpty(this.event) ? "" : this.event;
    }

    public String getOffset() {
        return this.offset;
    }

    public String getText() {
        return TextUtils.isEmpty(this.text) ? "" : this.text.trim();
    }
}

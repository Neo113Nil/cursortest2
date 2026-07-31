package com.smaato.sdk.ng.vpaid.models.vast;

import android.text.TextUtils;
import com.smaato.sdk.ng.vpaid.xml.Attribute;
import com.smaato.sdk.ng.vpaid.xml.Text;

/* loaded from: classes14.dex */
public class NonLinearClickTracking {

    @Attribute
    private String id;

    @Text
    private String text;

    public String getId() {
        return this.id;
    }

    public String getText() {
        return TextUtils.isEmpty(this.text) ? "" : this.text.trim();
    }
}

package com.smaato.sdk.ng.vpaid.models.vast;

import android.text.TextUtils;
import com.smaato.sdk.ng.vpaid.xml.Attribute;
import com.smaato.sdk.ng.vpaid.xml.Tag;
import com.smaato.sdk.ng.vpaid.xml.Text;

/* loaded from: classes12.dex */
public class CreativeExtension {

    @Text
    private String text;

    @Attribute
    private String type;

    @Tag
    private VerveCTAButton verveCTAButton;

    public String getText() {
        return TextUtils.isEmpty(this.text) ? "" : this.text.trim();
    }

    public String getType() {
        return this.type;
    }

    public VerveCTAButton getVerveCTAButton() {
        return this.verveCTAButton;
    }
}

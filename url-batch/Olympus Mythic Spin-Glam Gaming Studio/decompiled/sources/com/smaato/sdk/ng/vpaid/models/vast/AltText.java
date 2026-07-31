package com.smaato.sdk.ng.vpaid.models.vast;

import android.text.TextUtils;
import com.smaato.sdk.ng.vpaid.xml.Text;

/* loaded from: classes3.dex */
public class AltText {

    @Text
    private String text;

    public String getText() {
        return TextUtils.isEmpty(this.text) ? "" : this.text.trim();
    }
}

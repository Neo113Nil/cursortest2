package com.smaato.sdk.ng.vpaid.models.vast;

import android.text.TextUtils;
import com.smaato.sdk.ng.vpaid.xml.Text;

/* loaded from: classes12.dex */
public class Duration {

    @Text
    private String text;

    public String getText() {
        return !TextUtils.isEmpty(this.text) ? this.text.trim() : "00:00:10";
    }
}

package com.smaato.sdk.ng.vpaid.models.vast;

import android.text.TextUtils;
import com.smaato.sdk.ng.vpaid.xml.Attribute;
import com.smaato.sdk.ng.vpaid.xml.Text;

/* loaded from: classes6.dex */
public class BlockedAdCategories {

    @Attribute
    private String authority;

    @Text
    private String text;

    public String getAuthority() {
        return this.authority;
    }

    public String getText() {
        return TextUtils.isEmpty(this.text) ? "" : this.text.trim();
    }
}

package com.smaato.sdk.ng.vpaid.models.vast;

import com.smaato.sdk.ng.vpaid.xml.Attribute;
import com.smaato.sdk.ng.vpaid.xml.Tag;

/* loaded from: classes5.dex */
public class Extension {

    @Tag
    private AdVerifications adVerifications;

    @Attribute
    private String type;

    public AdVerifications getAdVerifications() {
        return this.adVerifications;
    }

    public String getType() {
        return this.type;
    }
}

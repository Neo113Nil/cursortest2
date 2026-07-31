package com.smaato.sdk.ng.vpaid.models.vast;

import com.smaato.sdk.ng.vpaid.xml.Attribute;
import com.smaato.sdk.ng.vpaid.xml.Tag;
import java.util.List;

/* loaded from: classes3.dex */
public class CompanionAds {

    @Tag("Companion")
    private List<Companion> companions;

    @Attribute
    private String required;

    public List<Companion> getCompanions() {
        return this.companions;
    }

    public String getRequired() {
        return this.required;
    }
}

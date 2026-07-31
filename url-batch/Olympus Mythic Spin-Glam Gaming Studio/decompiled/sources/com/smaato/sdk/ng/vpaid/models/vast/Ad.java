package com.smaato.sdk.ng.vpaid.models.vast;

import com.smaato.sdk.ng.vpaid.xml.Attribute;
import com.smaato.sdk.ng.vpaid.xml.Tag;

/* loaded from: classes4.dex */
public class Ad {

    @Attribute
    private String adType;

    @Attribute
    private String conditionalAd;

    @Attribute
    private String id;

    @Tag
    private InLine inLine;

    @Attribute
    private String sequence;

    @Tag
    private Wrapper wrapper;

    public String getAdType() {
        return this.adType;
    }

    public String getConditionalAd() {
        return this.conditionalAd;
    }

    public String getId() {
        return this.id;
    }

    public InLine getInLine() {
        return this.inLine;
    }

    public String getSequence() {
        return this.sequence;
    }

    public Wrapper getWrapper() {
        return this.wrapper;
    }
}

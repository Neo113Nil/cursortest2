package com.smaato.sdk.ng.vpaid.models.vast;

import com.smaato.sdk.ng.vpaid.xml.Attribute;
import com.smaato.sdk.ng.vpaid.xml.Tag;
import java.util.List;

/* loaded from: classes6.dex */
public class Vast {

    @Tag("Ad")
    private List<Ad> ads;

    @Tag("Error")
    private List<Error> errors;

    @Tag
    private Status status;

    @Attribute
    private String version;

    public List<Ad> getAds() {
        return this.ads;
    }

    public List<Error> getErrors() {
        return this.errors;
    }

    public Status getStatus() {
        return this.status;
    }

    public String getVersion() {
        return this.version;
    }
}

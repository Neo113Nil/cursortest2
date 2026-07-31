package net.pubnative.lite.sdk.vpaid.models.vast;

import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* loaded from: classes3.dex */
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

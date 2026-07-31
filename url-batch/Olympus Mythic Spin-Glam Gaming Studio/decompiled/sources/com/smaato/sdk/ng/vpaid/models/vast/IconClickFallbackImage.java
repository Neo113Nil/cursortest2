package com.smaato.sdk.ng.vpaid.models.vast;

import com.smaato.sdk.ng.vpaid.xml.Attribute;
import com.smaato.sdk.ng.vpaid.xml.Tag;
import java.util.List;

/* loaded from: classes5.dex */
public class IconClickFallbackImage {

    @Tag
    private AltText altText;

    @Attribute
    private String height;

    @Tag("StaticResource")
    private List<StaticResource> staticResources;

    @Attribute
    private String width;

    public AltText getAltText() {
        return this.altText;
    }

    public String getHeight() {
        return this.height;
    }

    public List<StaticResource> getStaticResources() {
        return this.staticResources;
    }

    public String getWidth() {
        return this.width;
    }
}

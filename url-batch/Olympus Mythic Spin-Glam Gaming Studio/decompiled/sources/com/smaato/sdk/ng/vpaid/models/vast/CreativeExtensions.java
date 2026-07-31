package com.smaato.sdk.ng.vpaid.models.vast;

import com.smaato.sdk.ng.vpaid.xml.Tag;
import java.util.List;

/* loaded from: classes5.dex */
public class CreativeExtensions {

    @Tag("CreativeExtension")
    private List<CreativeExtension> creativeExtensions;

    public List<CreativeExtension> getCreativeExtensions() {
        return this.creativeExtensions;
    }
}

package com.smaato.sdk.ng.vpaid.models.vast;

import com.smaato.sdk.ng.vpaid.xml.Tag;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;

/* loaded from: classes4.dex */
public class Extensions {

    @Tag(VastTagName.EXTENSION)
    private List<Extension> extensionList;

    public List<Extension> getExtensions() {
        return this.extensionList;
    }
}

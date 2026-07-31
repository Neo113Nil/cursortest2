package com.smaato.sdk.ng.vpaid.models.vast;

import com.smaato.sdk.ng.vpaid.xml.Tag;
import java.util.List;

/* loaded from: classes14.dex */
public class Creatives {

    @Tag("Creative")
    private List<Creative> creatives;

    public List<Creative> getCreatives() {
        return this.creatives;
    }
}

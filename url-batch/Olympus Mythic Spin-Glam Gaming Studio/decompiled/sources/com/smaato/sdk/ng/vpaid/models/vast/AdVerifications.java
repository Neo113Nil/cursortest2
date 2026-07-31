package com.smaato.sdk.ng.vpaid.models.vast;

import com.smaato.sdk.ng.vpaid.xml.Tag;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;

/* loaded from: classes5.dex */
public class AdVerifications {

    @Tag(VastTagName.VERIFICATION)
    private List<Verification> verificationList;

    public List<Verification> getVerificationList() {
        return this.verificationList;
    }
}

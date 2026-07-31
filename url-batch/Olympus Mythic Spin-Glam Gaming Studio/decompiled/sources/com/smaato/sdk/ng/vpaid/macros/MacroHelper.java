package com.smaato.sdk.ng.vpaid.macros;

import android.text.TextUtils;

/* loaded from: classes14.dex */
public class MacroHelper {
    private final GenericMacros a = new GenericMacros();
    private final AdBreakMacros b = new AdBreakMacros();
    private final ClientMacros c = new ClientMacros();
    private final PublisherMacros d = new PublisherMacros();
    private final CapabilitiesMacros e = new CapabilitiesMacros();
    private final PlayerStateMacros f = new PlayerStateMacros();
    private final ClickMacros g = new ClickMacros();
    private final ErrorMacros h = new ErrorMacros();
    private final VerificationMacros i = new VerificationMacros();
    private final RegulationMacros j = new RegulationMacros();

    public String processUrl(String str) {
        return processUrl(str, "");
    }

    public String processUrl(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return this.j.processUrl(this.i.processUrl(this.h.processUrl(this.g.processUrl(this.f.processUrl(this.e.processUrl(this.d.processUrl(this.c.processUrl(this.b.processUrl(this.a.processUrl(str))))))), str2)));
    }
}

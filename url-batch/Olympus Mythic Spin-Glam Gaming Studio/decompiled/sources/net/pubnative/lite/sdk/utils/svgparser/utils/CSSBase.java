package net.pubnative.lite.sdk.utils.svgparser.utils;

import net.pubnative.lite.sdk.utils.svgparser.utils.CSSParser;

/* loaded from: classes3.dex */
public class CSSBase {
    protected CSSParser.Ruleset cssRuleset;

    protected CSSBase(String str) {
        this.cssRuleset = new CSSParser(CSSParser.Source.RenderOptions, null).parse(str);
    }
}

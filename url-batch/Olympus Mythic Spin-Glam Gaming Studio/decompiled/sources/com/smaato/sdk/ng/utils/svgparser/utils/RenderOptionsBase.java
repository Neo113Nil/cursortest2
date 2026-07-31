package com.smaato.sdk.ng.utils.svgparser.utils;

import com.smaato.sdk.ng.utils.svgparser.CSS;
import com.smaato.sdk.ng.utils.svgparser.PreserveAspectRatio;
import com.smaato.sdk.ng.utils.svgparser.utils.CSSParser;
import com.smaato.sdk.ng.utils.svgparser.utils.SVGBase;

/* loaded from: classes12.dex */
public class RenderOptionsBase {
    String a;
    CSSParser.Ruleset b;
    PreserveAspectRatio c;
    String d;
    SVGBase.C5109b e;
    String f;
    SVGBase.C5109b g;

    public RenderOptionsBase() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public static RenderOptionsBase create() {
        return new RenderOptionsBase();
    }

    public RenderOptionsBase css(CSS css) {
        this.b = css.a;
        this.a = null;
        return this;
    }

    public boolean hasCss() {
        String str = this.a;
        return (str != null && str.trim().length() > 0) || this.b != null;
    }

    public boolean hasPreserveAspectRatio() {
        return this.c != null;
    }

    public boolean hasTarget() {
        return this.d != null;
    }

    public boolean hasView() {
        return this.f != null;
    }

    public boolean hasViewBox() {
        return this.e != null;
    }

    public boolean hasViewPort() {
        return this.g != null;
    }

    public RenderOptionsBase preserveAspectRatio(PreserveAspectRatio preserveAspectRatio) {
        this.c = preserveAspectRatio;
        return this;
    }

    public RenderOptionsBase target(String str) {
        this.d = str;
        return this;
    }

    public RenderOptionsBase view(String str) {
        this.f = str;
        return this;
    }

    public RenderOptionsBase viewBox(float f, float f2, float f3, float f4) {
        this.e = new SVGBase.C5109b(f, f2, f3, f4);
        return this;
    }

    public RenderOptionsBase viewPort(float f, float f2, float f3, float f4) {
        this.g = new SVGBase.C5109b(f, f2, f3, f4);
        return this;
    }

    public RenderOptionsBase css(String str) {
        this.a = str;
        this.b = null;
        return this;
    }

    public RenderOptionsBase(RenderOptionsBase renderOptionsBase) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        if (renderOptionsBase == null) {
            return;
        }
        this.a = renderOptionsBase.a;
        this.b = renderOptionsBase.b;
        this.c = renderOptionsBase.c;
        this.e = renderOptionsBase.e;
        this.f = renderOptionsBase.f;
        this.g = renderOptionsBase.g;
        this.d = renderOptionsBase.d;
    }
}

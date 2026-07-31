package com.smaato.sdk.ng.utils.svgparser;

import com.smaato.sdk.ng.utils.svgparser.utils.RenderOptionsBase;

/* loaded from: classes13.dex */
public class RenderOptions extends RenderOptionsBase {
    public static RenderOptions create() {
        return new RenderOptions();
    }

    @Override // com.smaato.sdk.ng.utils.svgparser.utils.RenderOptionsBase
    public boolean hasCss() {
        return super.hasCss();
    }

    @Override // com.smaato.sdk.ng.utils.svgparser.utils.RenderOptionsBase
    public boolean hasPreserveAspectRatio() {
        return super.hasPreserveAspectRatio();
    }

    @Override // com.smaato.sdk.ng.utils.svgparser.utils.RenderOptionsBase
    public boolean hasTarget() {
        return super.hasTarget();
    }

    @Override // com.smaato.sdk.ng.utils.svgparser.utils.RenderOptionsBase
    public boolean hasView() {
        return super.hasView();
    }

    @Override // com.smaato.sdk.ng.utils.svgparser.utils.RenderOptionsBase
    public boolean hasViewBox() {
        return super.hasViewBox();
    }

    @Override // com.smaato.sdk.ng.utils.svgparser.utils.RenderOptionsBase
    public boolean hasViewPort() {
        return super.hasViewPort();
    }

    @Override // com.smaato.sdk.ng.utils.svgparser.utils.RenderOptionsBase
    public RenderOptions preserveAspectRatio(PreserveAspectRatio preserveAspectRatio) {
        return (RenderOptions) super.preserveAspectRatio(preserveAspectRatio);
    }

    @Override // com.smaato.sdk.ng.utils.svgparser.utils.RenderOptionsBase
    public RenderOptions target(String str) {
        return (RenderOptions) super.target(str);
    }

    @Override // com.smaato.sdk.ng.utils.svgparser.utils.RenderOptionsBase
    public RenderOptions view(String str) {
        return (RenderOptions) super.view(str);
    }

    @Override // com.smaato.sdk.ng.utils.svgparser.utils.RenderOptionsBase
    public RenderOptions viewBox(float f, float f2, float f3, float f4) {
        return (RenderOptions) super.viewBox(f, f2, f3, f4);
    }

    @Override // com.smaato.sdk.ng.utils.svgparser.utils.RenderOptionsBase
    public RenderOptions viewPort(float f, float f2, float f3, float f4) {
        return (RenderOptions) super.viewPort(f, f2, f3, f4);
    }

    @Override // com.smaato.sdk.ng.utils.svgparser.utils.RenderOptionsBase
    public RenderOptions css(String str) {
        return (RenderOptions) super.css(str);
    }

    @Override // com.smaato.sdk.ng.utils.svgparser.utils.RenderOptionsBase
    public RenderOptions css(CSS css) {
        return (RenderOptions) super.css(css);
    }
}

package com.smaato.sdk.ng.utils.svgparser;

import android.graphics.Picture;
import com.smaato.sdk.ng.utils.svgparser.utils.SVGBase;
import java.io.InputStream;

/* loaded from: classes8.dex */
public class SVG {
    private SVGBase a;

    SVG(SVGBase sVGBase) {
        this.a = sVGBase;
    }

    public static SVG getFromInputStream(InputStream inputStream) throws SVGParseException {
        return new SVG(SVGBase.getFromInputStream(inputStream));
    }

    public static SVG getFromString(String str) throws SVGParseException {
        return new SVG(SVGBase.getFromString(str));
    }

    public Picture renderToPicture() {
        return this.a.renderToPicture(null);
    }

    public Picture renderToPicture(int i, int i2) {
        return renderToPicture(i, i2, null);
    }

    public Picture renderToPicture(int i, int i2, RenderOptions renderOptions) {
        return this.a.renderToPicture(i, i2, renderOptions);
    }
}

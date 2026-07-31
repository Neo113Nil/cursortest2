package com.smaato.sdk.ng.utils.svgparser.utils;

import com.smaato.sdk.ng.utils.svgparser.SVGExternalFileResolver;
import com.smaato.sdk.ng.utils.svgparser.SVGParseException;
import java.io.InputStream;

/* loaded from: classes4.dex */
interface c {
    SVGBase a(InputStream inputStream) throws SVGParseException;

    c a(SVGExternalFileResolver sVGExternalFileResolver);
}

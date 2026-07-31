package net.pubnative.lite.sdk.utils.svgparser.utils;

import java.io.InputStream;
import net.pubnative.lite.sdk.utils.svgparser.SVGExternalFileResolver;

/* loaded from: classes5.dex */
interface SVGParser {
    SVGBase parseStream(InputStream inputStream);

    SVGParser setExternalFileResolver(SVGExternalFileResolver sVGExternalFileResolver);

    SVGParser setInternalEntitiesEnabled(boolean z);
}

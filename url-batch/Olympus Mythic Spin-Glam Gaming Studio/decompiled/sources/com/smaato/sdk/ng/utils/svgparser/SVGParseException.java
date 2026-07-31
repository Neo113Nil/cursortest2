package com.smaato.sdk.ng.utils.svgparser;

import org.xml.sax.SAXException;

/* loaded from: classes5.dex */
public class SVGParseException extends SAXException {
    public SVGParseException(String str) {
        super(str);
    }

    public SVGParseException(String str, Exception exc) {
        super(str, exc);
    }
}

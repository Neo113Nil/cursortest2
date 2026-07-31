package com.smaato.sdk.ng.views.shape.path.parser;

import com.ironsource.X3;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes6.dex */
class d {
    static final String a(String str) {
        return str.replaceAll("\"", "&quot;").replaceAll("'", "&apos").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll(X3.j.c, "&amp;");
    }

    static final String a(String str, XmlPullParser xmlPullParser) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    static final Float a(String str, XmlPullParser xmlPullParser, float f, float f2, float f3) {
        float f4;
        String a = a(str, xmlPullParser);
        if (a == null) {
            return null;
        }
        if (a.endsWith("px")) {
            return Float.valueOf(Float.parseFloat(a.substring(0, a.length() - 2)));
        }
        if (a.endsWith("pt")) {
            return Float.valueOf((Float.parseFloat(a.substring(0, a.length() - 2)) * f) / 72.0f);
        }
        if (a.endsWith("pc")) {
            return Float.valueOf((Float.parseFloat(a.substring(0, a.length() - 2)) * f) / 6.0f);
        }
        if (a.endsWith("cm")) {
            return Float.valueOf((Float.parseFloat(a.substring(0, a.length() - 2)) * f) / 2.54f);
        }
        if (a.endsWith("mm")) {
            return Float.valueOf((Float.parseFloat(a.substring(0, a.length() - 2)) * f) / 254.0f);
        }
        if (a.endsWith("in")) {
            return Float.valueOf(Float.parseFloat(a.substring(0, a.length() - 2)) * f);
        }
        if (a.endsWith("%")) {
            Float valueOf = Float.valueOf(a.substring(0, a.length() - 1));
            if (str.contains(VastAttributes.HORIZONTAL_POSITION) || str.equals("width")) {
                f4 = f2 / 100.0f;
            } else {
                f4 = (str.contains(VastAttributes.VERTICAL_POSITION) || str.equals("height")) ? f3 / 100.0f : (f3 + f2) / 2.0f;
            }
            return Float.valueOf(valueOf.floatValue() * f4);
        }
        return Float.valueOf(a);
    }
}

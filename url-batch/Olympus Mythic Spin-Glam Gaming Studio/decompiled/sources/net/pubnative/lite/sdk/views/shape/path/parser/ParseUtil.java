package net.pubnative.lite.sdk.views.shape.path.parser;

import com.ironsource.X3;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes5.dex */
class ParseUtil {
    ParseUtil() {
    }

    static final Float convertUnits(String str, XmlPullParser xmlPullParser, float f, float f2, float f3) {
        String stringAttr = getStringAttr(str, xmlPullParser);
        if (stringAttr == null) {
            return null;
        }
        if (stringAttr.endsWith("px")) {
            return Float.valueOf(Float.parseFloat(stringAttr.substring(0, stringAttr.length() - 2)));
        }
        if (stringAttr.endsWith("pt")) {
            return Float.valueOf((Float.parseFloat(stringAttr.substring(0, stringAttr.length() - 2)) * f) / 72.0f);
        }
        if (stringAttr.endsWith("pc")) {
            return Float.valueOf((Float.parseFloat(stringAttr.substring(0, stringAttr.length() - 2)) * f) / 6.0f);
        }
        if (stringAttr.endsWith("cm")) {
            return Float.valueOf((Float.parseFloat(stringAttr.substring(0, stringAttr.length() - 2)) * f) / 2.54f);
        }
        if (stringAttr.endsWith("mm")) {
            return Float.valueOf((Float.parseFloat(stringAttr.substring(0, stringAttr.length() - 2)) * f) / 254.0f);
        }
        if (stringAttr.endsWith("in")) {
            return Float.valueOf(Float.parseFloat(stringAttr.substring(0, stringAttr.length() - 2)) * f);
        }
        if (!stringAttr.endsWith("%")) {
            return Float.valueOf(stringAttr);
        }
        return Float.valueOf(Float.valueOf(stringAttr.substring(0, stringAttr.length() - 1)).floatValue() * ((str.contains(VastAttributes.HORIZONTAL_POSITION) || str.equals("width")) ? f2 / 100.0f : (str.contains(VastAttributes.VERTICAL_POSITION) || str.equals("height")) ? f3 / 100.0f : (f3 + f2) / 2.0f));
    }

    static final String escape(String str) {
        return str.replaceAll("\"", "&quot;").replaceAll("'", "&apos").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll(X3.j.c, "&amp;");
    }

    static final String getStringAttr(String str, XmlPullParser xmlPullParser) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
}

package com.smaato.sdk.ng.views.shape.path.parser;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.smaato.sdk.ng.NextGen;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes6.dex */
class c {
    final ArrayList<Float> a;
    private final int b;

    private c(ArrayList<Float> arrayList, int i) {
        this.a = arrayList;
        this.b = i;
    }

    static final c a(String str, XmlPullParser xmlPullParser) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return a(xmlPullParser.getAttributeValue(i));
            }
        }
        return null;
    }

    static c a(String str) {
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = false;
        for (int i2 = 1; i2 < length; i2++) {
            if (z) {
                z = false;
            } else {
                char charAt = str.charAt(i2);
                switch (charAt) {
                    case '\t':
                    case '\n':
                    case ' ':
                    case ',':
                        String substring = str.substring(i, i2);
                        if (substring.trim().length() > 0) {
                            arrayList.add(Float.valueOf(Float.parseFloat(substring)));
                            if (charAt == '-') {
                                i = i2;
                                break;
                            } else {
                                i = i2 + 1;
                                z = true;
                                break;
                            }
                        } else {
                            i++;
                            break;
                        }
                    case ')':
                    case 'A':
                    case 'C':
                    case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                    case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                    case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                    case 'Q':
                    case 'S':
                    case 'T':
                    case 'V':
                    case 'Z':
                    case 'a':
                    case 'c':
                    case 'h':
                    case 'l':
                    case 'm':
                    case 'q':
                    case 's':
                    case 't':
                    case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                    case INVALID_ADS_ENDPOINT_VALUE:
                        String substring2 = str.substring(i, i2);
                        if (substring2.trim().length() > 0) {
                            arrayList.add(Float.valueOf(Float.parseFloat(substring2)));
                        }
                        return new c(arrayList, i2);
                }
            }
        }
        String substring3 = str.substring(i);
        if (substring3.length() > 0) {
            try {
                arrayList.add(Float.valueOf(Float.parseFloat(substring3)));
            } catch (NumberFormatException e) {
                NextGen.reportException((Exception) e);
            }
            i = str.length();
        }
        return new c(arrayList, i);
    }
}

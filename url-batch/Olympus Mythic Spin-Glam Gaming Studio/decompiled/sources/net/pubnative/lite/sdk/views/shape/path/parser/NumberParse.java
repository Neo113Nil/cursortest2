package net.pubnative.lite.sdk.views.shape.path.parser;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import java.util.ArrayList;
import net.pubnative.lite.sdk.HyBid;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes4.dex */
class NumberParse {
    private final int nextCmd;
    final ArrayList<Float> numbers;

    private NumberParse(ArrayList<Float> arrayList, int i) {
        this.numbers = arrayList;
        this.nextCmd = i;
    }

    static final NumberParse getNumberParseAttr(String str, XmlPullParser xmlPullParser) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return parseNumbers(xmlPullParser.getAttributeValue(i));
            }
        }
        return null;
    }

    static NumberParse parseNumbers(String str) {
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
                        return new NumberParse(arrayList, i2);
                }
            }
        }
        String substring3 = str.substring(i);
        if (substring3.length() > 0) {
            try {
                arrayList.add(Float.valueOf(Float.parseFloat(substring3)));
            } catch (NumberFormatException e) {
                HyBid.reportException((Exception) e);
            }
            i = str.length();
        }
        return new NumberParse(arrayList, i);
    }

    public int getNextCmd() {
        return this.nextCmd;
    }

    public float getNumber(int i) {
        return this.numbers.get(i).floatValue();
    }
}

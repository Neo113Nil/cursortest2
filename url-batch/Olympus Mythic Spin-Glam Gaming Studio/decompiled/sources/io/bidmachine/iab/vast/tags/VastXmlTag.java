package io.bidmachine.iab.vast.tags;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.utils.IabElementStyle;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.iab.vast.VastLog;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class VastXmlTag implements Serializable {
    private String a;
    private HashMap b;

    public VastXmlTag() {
    }

    static String c(XmlPullParser xmlPullParser) {
        if (xmlPullParser.next() != 4) {
            return null;
        }
        String text = xmlPullParser.getText();
        if (!TextUtils.isEmpty(text)) {
            text = text.trim();
        }
        xmlPullParser.nextTag();
        return text;
    }

    private boolean d(String str) {
        for (String str2 : getSupportedAttributes()) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    static int e(String str) {
        if (str == null) {
            return -1;
        }
        int indexOf = str.indexOf(".");
        if (indexOf > 0) {
            str = str.substring(0, indexOf);
        }
        String[] split = str.split(":");
        if (split.length <= 2) {
            return -1;
        }
        try {
            return (Integer.parseInt(split[0]) * 3600) + (Integer.parseInt(split[1]) * 60) + Integer.parseInt(split[2]);
        } catch (Exception e) {
            VastLog.e("VastXmlTag", e);
            return -1;
        }
    }

    static int f(String str) {
        if (str == null) {
            return -1;
        }
        String[] split = str.split(":");
        if (split.length <= 1) {
            return -1;
        }
        try {
            return (Integer.parseInt(split[0]) * 60) + Integer.parseInt(split[1]);
        } catch (Exception e) {
            VastLog.e("VastXmlTag", e);
            return -1;
        }
    }

    static Integer g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        if (lowerCase.equals("portrait")) {
            return 1;
        }
        return !lowerCase.equals("landscape") ? null : 2;
    }

    static Integer h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        switch (lowerCase) {
            case "center":
                return 1;
            case "left":
                return 3;
            case "right":
                return 5;
            default:
                return null;
        }
    }

    static Integer i(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        switch (lowerCase) {
            case "bottom":
                return 80;
            case "center":
                return 16;
            case "top":
                return 48;
            default:
                return null;
        }
    }

    static boolean j(String str) {
        return str != null && (str.equalsIgnoreCase("false") || str.equalsIgnoreCase("0"));
    }

    static boolean k(String str) {
        return str != null && (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("1"));
    }

    protected void a(XmlPullParser xmlPullParser) {
    }

    final int b(String str) {
        String a = a(str);
        if (TextUtils.isEmpty(a)) {
            VastLog.d("VastXmlTag", "Error parse attribute value - %s, by name - %s", a, str);
            return -1;
        }
        try {
            return Integer.parseInt(a);
        } catch (Exception unused) {
            VastLog.e("VastXmlTag", "Error parse attribute value - %s, by name - %s", a, str);
            return -1;
        }
    }

    public final boolean getBooleanAttributeValueByName(@NonNull String str, boolean z) {
        String a = a(str);
        if (k(a)) {
            return true;
        }
        if (j(a)) {
            return false;
        }
        return z;
    }

    @NonNull
    public String[] getSupportedAttributes() {
        return new String[0];
    }

    @Nullable
    public final String getText() {
        return this.a;
    }

    public boolean isTextSupported() {
        return false;
    }

    public boolean isValidTag() {
        return true;
    }

    public void parse(@NonNull XmlPullParser xmlPullParser) {
        a(a(this, xmlPullParser));
        if (isTextSupported()) {
            setText(c(xmlPullParser));
        }
        a(xmlPullParser);
    }

    public final void setText(@Nullable String str) {
        this.a = str;
    }

    public VastXmlTag(@NonNull XmlPullParser xmlPullParser) {
        parse(xmlPullParser);
    }

    private void a(HashMap hashMap) {
        this.b = hashMap;
    }

    final String a(String str) {
        HashMap hashMap = this.b;
        if (hashMap != null) {
            return (String) hashMap.get(str);
        }
        return null;
    }

    static void d(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    private static HashMap a(VastXmlTag vastXmlTag, XmlPullParser xmlPullParser) {
        if (xmlPullParser.getAttributeCount() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (vastXmlTag.d(xmlPullParser.getAttributeName(i))) {
                hashMap.put(xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
            }
        }
        return hashMap;
    }

    static Integer c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Exception e) {
            VastLog.e("VastXmlTag", e.getMessage(), new Object[0]);
            return null;
        }
    }

    static boolean b(XmlPullParser xmlPullParser) {
        return k(c(xmlPullParser));
    }

    static boolean a(String str, String str2) {
        return str != null && str.equalsIgnoreCase(str2);
    }

    static void a(XmlPullParser xmlPullParser, IabElementStyle iabElementStyle) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            if (!TextUtils.isEmpty(attributeValue)) {
                try {
                    if (VastAttributes.STROKE_COLOR.equals(attributeName)) {
                        iabElementStyle.setStrokeColor(c(attributeValue));
                    } else if ("fill".equals(attributeName)) {
                        iabElementStyle.setFillColor(c(attributeValue));
                    } else if (VastAttributes.OUTLINED.equals(attributeName)) {
                        iabElementStyle.setOutlined(Boolean.valueOf(k(attributeValue)));
                    } else if (VastAttributes.VISIBLE.equals(attributeName)) {
                        iabElementStyle.setVisible(Boolean.valueOf(k(attributeValue)));
                    } else if (VastAttributes.HORIZONTAL_POSITION.equals(attributeName)) {
                        iabElementStyle.setHorizontalPosition(h(attributeValue));
                    } else if (VastAttributes.VERTICAL_POSITION.equals(attributeName)) {
                        iabElementStyle.setVerticalPosition(i(attributeValue));
                    } else if ("style".equals(attributeName)) {
                        iabElementStyle.setStyle(attributeValue);
                    } else if (VastAttributes.OPACITY.equals(attributeName)) {
                        iabElementStyle.setOpacity(Float.valueOf(Float.parseFloat(attributeValue)));
                    } else if (VastAttributes.HIDE_AFTER.equals(attributeName)) {
                        iabElementStyle.setHideAfter(Float.valueOf(Float.parseFloat(attributeValue)));
                    } else if (VastAttributes.PADDING.equals(attributeName)) {
                        iabElementStyle.setPadding(attributeValue);
                    } else if (VastAttributes.MARGIN.equals(attributeName)) {
                        iabElementStyle.setMargin(attributeValue);
                    } else if (VastAttributes.STROKE_WIDTH.equals(attributeName)) {
                        iabElementStyle.setStrokeWidth(Utils.convertCssSizeToPx(attributeValue));
                    } else if ("width".equals(attributeName)) {
                        iabElementStyle.setWidth(Utils.convertCssSizeToPx(attributeValue));
                    } else if ("height".equals(attributeName)) {
                        iabElementStyle.setHeight(Utils.convertCssSizeToPx(attributeValue));
                    } else if (VastAttributes.FONT_STYLE.equals(attributeName)) {
                        iabElementStyle.setFontStyle(Integer.valueOf(Integer.parseInt(attributeValue)));
                    } else if (VastAttributes.FONT_SIZE.equals(attributeName)) {
                        iabElementStyle.setFontSize(Utils.convertCssSizeToPx(attributeValue));
                    }
                } catch (Throwable th) {
                    VastLog.e("VastXmlTag", th);
                }
            }
        }
        try {
            iabElementStyle.setContent(c(xmlPullParser));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            xmlPullParser.require(3, null, xmlPullParser.getName());
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}

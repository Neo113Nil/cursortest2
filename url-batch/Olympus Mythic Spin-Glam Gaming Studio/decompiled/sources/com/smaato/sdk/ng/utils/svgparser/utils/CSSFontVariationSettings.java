package com.smaato.sdk.ng.utils.svgparser.utils;

import com.adjust.sdk.Constants;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public class CSSFontVariationSettings {
    static final Float b = Float.valueOf(1.0f);
    static final Float c = Float.valueOf(-14.0f);
    private final HashMap<String, Float> a;

    private static class a {
        String a;
        Float b;

        public a(String str, Float f) {
            this.a = str;
            this.b = f;
        }
    }

    public CSSFontVariationSettings() {
        this.a = new HashMap<>();
    }

    static CSSFontVariationSettings a(String str) {
        CSSFontVariationSettings cSSFontVariationSettings = new CSSFontVariationSettings();
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        if (textScanner.consume(Constants.NORMAL)) {
            return null;
        }
        while (!textScanner.empty()) {
            a a2 = a(textScanner);
            if (a2 == null) {
                return null;
            }
            cSSFontVariationSettings.a.put(a2.a, a2.b);
            textScanner.skipCommaWhitespace();
        }
        return cSSFontVariationSettings;
    }

    public void addSetting(String str, float f) {
        this.a.put(str, Float.valueOf(f));
    }

    public void applySettings(CSSFontVariationSettings cSSFontVariationSettings) {
        if (cSSFontVariationSettings == null) {
            return;
        }
        this.a.putAll(cSSFontVariationSettings.a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Float> entry : this.a.entrySet()) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append("'");
            sb.append(entry.getKey());
            sb.append("' ");
            sb.append(new DecimalFormat("#.##").format(entry.getValue()));
        }
        return sb.toString();
    }

    public CSSFontVariationSettings(CSSFontVariationSettings cSSFontVariationSettings) {
        this.a = new HashMap<>(cSSFontVariationSettings.a);
    }

    private static a a(TextScanner textScanner) {
        textScanner.skipWhitespace();
        String nextQuotedString = textScanner.nextQuotedString();
        if (nextQuotedString == null || nextQuotedString.length() != 4) {
            return null;
        }
        textScanner.skipWhitespace();
        if (textScanner.empty()) {
            return null;
        }
        return new a(nextQuotedString, Float.valueOf(textScanner.nextFloat()));
    }
}

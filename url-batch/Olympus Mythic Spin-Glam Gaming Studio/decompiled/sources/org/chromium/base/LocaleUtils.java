package org.chromium.base;

import android.os.LocaleList;
import android.text.TextUtils;
import internal.org.jni_zero.CalledByNative;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Locale;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;

/* loaded from: classes3.dex */
public class LocaleUtils {
    public static String getUpdatedLanguageForChromium(String str) {
        str.hashCode();
        switch (str) {
            case "in":
                return "id";
            case "iw":
                return "he";
            case "ji":
                return "yi";
            case "jw":
                return "jv";
            case "tl":
                return "fil";
            case "gom":
                return "kok";
            default:
                return str;
        }
    }

    public static Locale getUpdatedLocaleForChromium(Locale locale) {
        String language = locale.getLanguage();
        String updatedLanguageForChromium = getUpdatedLanguageForChromium(language);
        return updatedLanguageForChromium.equals(language) ? locale : new Locale.Builder().setLocale(locale).setLanguage(updatedLanguageForChromium).build();
    }

    public static String toLanguageTag(Locale locale) {
        String updatedLanguageForChromium = getUpdatedLanguageForChromium(locale.getLanguage());
        String country = locale.getCountry();
        if (updatedLanguageForChromium.equals(SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE_NO) && country.equals("NO") && locale.getVariant().equals("NY")) {
            return "nn-NO";
        }
        if (country.isEmpty()) {
            return updatedLanguageForChromium;
        }
        return updatedLanguageForChromium + "-" + country;
    }

    public static String toLanguageTags(LocaleList localeList) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < localeList.size(); i++) {
            arrayList.add(toLanguageTag(getUpdatedLocaleForChromium(localeList.get(i))));
        }
        return TextUtils.join(StringUtils.COMMA, arrayList);
    }

    @CalledByNative
    public static String getDefaultLocaleString() {
        return toLanguageTag(Locale.getDefault());
    }

    @CalledByNative
    public static String getDefaultLocaleListString() {
        return toLanguageTags(LocaleList.getDefault());
    }

    @CalledByNative
    public static String getDefaultCountryCode() {
        String switchValue = CommandLine.getInstance().getSwitchValue("default-country-code");
        return switchValue != null ? switchValue : Locale.getDefault().getCountry();
    }
}

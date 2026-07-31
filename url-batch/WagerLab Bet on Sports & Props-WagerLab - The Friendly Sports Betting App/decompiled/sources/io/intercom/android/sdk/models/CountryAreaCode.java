package io.intercom.android.sdk.models;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class CountryAreaCode {
    public static final CountryAreaCode UNKNOWN = new Builder().build();
    private List<String> areaCodes;
    private String code;
    private String dialCode;
    private String emoji;
    private int priority;

    CountryAreaCode(Builder builder) {
        this.code = builder.code == null ? "" : builder.code;
        this.dialCode = builder.dialCode != null ? builder.dialCode : "";
        this.emoji = builder.emoji == null ? "🌎" : builder.emoji;
        this.priority = builder.priority == null ? 0 : builder.priority.intValue();
        this.areaCodes = new ArrayList();
        if (builder.areaCodes != null) {
            for (String str : builder.areaCodes) {
                if (str != null) {
                    this.areaCodes.add(str);
                }
            }
        }
    }

    public String getCode() {
        return this.code;
    }

    public String getDialCode() {
        return this.dialCode;
    }

    public String getEmoji() {
        return this.emoji;
    }

    public int getPriority() {
        return this.priority;
    }

    public List<String> getAreaCodes() {
        return this.areaCodes;
    }

    public static final class Builder {
        List<String> areaCodes;
        String code;
        String dialCode;
        String emoji;
        Integer priority;

        public CountryAreaCode build() {
            return new CountryAreaCode(this);
        }
    }
}

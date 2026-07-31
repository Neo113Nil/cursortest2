package com.smaato.sdk.ng.utils.sdkmanager;

import android.text.TextUtils;
import com.smaato.sdk.ng.models.IntegrationType;
import java.util.Locale;

/* loaded from: classes13.dex */
public class DisplayManager {
    private final String a;
    private final String b;
    private final Boolean c;

    public static class Builder {
        private Boolean a = Boolean.FALSE;
        private String b;
        private String c;

        public DisplayManager build() {
            return new DisplayManager(this);
        }

        public Builder setDisplayManagerName(String str) {
            this.b = str;
            return this;
        }

        public Builder setDisplayManagerVersion(String str) {
            this.c = str;
            return this;
        }

        public Builder setIsWrapped(Boolean bool) {
            this.a = bool;
            return this;
        }
    }

    private DisplayManager(Builder builder) {
        this.a = builder.b;
        this.b = builder.c;
        this.c = builder.a;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getDisplayManagerName() {
        return this.a;
    }

    public String getDisplayManagerVersion() {
        return getDisplayManagerVersion(IntegrationType.IN_APP_BIDDING);
    }

    public String getDisplayManagerVersion(IntegrationType integrationType) {
        return getDisplayManagerVersion(null, integrationType);
    }

    public String getDisplayManagerVersion(String str, IntegrationType integrationType) {
        String str2;
        if (this.c.booleanValue()) {
            if (!TextUtils.isEmpty(this.b)) {
                return this.b;
            }
            return String.format("%s_%s", "sdk", "23.1.0");
        }
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = String.format(Locale.ENGLISH, "_%s", str);
        }
        return String.format(Locale.ENGLISH, "%s_%s%s_%s", "sdkandroid", integrationType.getCode(), str2, "23.1.0");
    }
}

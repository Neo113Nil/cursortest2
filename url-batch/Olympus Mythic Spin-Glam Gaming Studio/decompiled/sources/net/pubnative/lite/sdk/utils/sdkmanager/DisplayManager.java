package net.pubnative.lite.sdk.utils.sdkmanager;

import android.text.TextUtils;
import java.util.Locale;
import net.pubnative.lite.sdk.models.IntegrationType;

/* loaded from: classes12.dex */
public class DisplayManager {
    private static final String DISPLAY_MANAGER_ENGINE = "sdkandroid";
    private final String displayManagerName;
    private final String displayManagerVer;
    private final Boolean isWrapped;

    public static class Builder {
        private String displayManagerName;
        private String displayManagerVer;
        private Boolean isWrapped = Boolean.FALSE;

        public DisplayManager build() {
            return new DisplayManager(this);
        }

        public Builder setDisplayManagerName(String str) {
            this.displayManagerName = str;
            return this;
        }

        public Builder setDisplayManagerVersion(String str) {
            this.displayManagerVer = str;
            return this;
        }

        public Builder setIsWrapped(Boolean bool) {
            this.isWrapped = bool;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getDisplayManagerName() {
        return this.displayManagerName;
    }

    public String getDisplayManagerVersion() {
        return getDisplayManagerVersion(IntegrationType.IN_APP_BIDDING);
    }

    private DisplayManager(Builder builder) {
        this.displayManagerName = builder.displayManagerName;
        this.displayManagerVer = builder.displayManagerVer;
        this.isWrapped = builder.isWrapped;
    }

    public String getDisplayManagerVersion(IntegrationType integrationType) {
        return getDisplayManagerVersion(null, integrationType);
    }

    public String getDisplayManagerVersion(String str, IntegrationType integrationType) {
        String str2;
        if (this.isWrapped.booleanValue()) {
            if (!TextUtils.isEmpty(this.displayManagerVer)) {
                return this.displayManagerVer;
            }
            return String.format("%s_%s", "sdk", "3.8.2");
        }
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = String.format(Locale.ENGLISH, "_%s", str);
        }
        return String.format(Locale.ENGLISH, "%s_%s%s_%s", DISPLAY_MANAGER_ENGINE, integrationType.getCode(), str2, "3.8.2");
    }
}

package com.my.target.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes13.dex */
public final class MyTargetConfig {
    public final boolean isTrackingEnvironmentEnabled;
    public final boolean isTrackingLocationEnabled;

    @Nullable
    public final String[] testDevices;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static final class Builder {
        boolean a = true;
        boolean b = false;
        String[] c;

        @NonNull
        public MyTargetConfig build() {
            return new MyTargetConfig(this.a, this.b, this.c);
        }

        @NonNull
        public Builder from(@NonNull MyTargetConfig myTargetConfig) {
            this.b = myTargetConfig.isTrackingLocationEnabled;
            this.a = myTargetConfig.isTrackingEnvironmentEnabled;
            this.c = myTargetConfig.testDevices;
            return this;
        }

        @NonNull
        public Builder withTestDevices(@Nullable String... strArr) {
            this.c = strArr;
            return this;
        }

        @NonNull
        public Builder withTrackingEnvironment(boolean z) {
            this.a = z;
            return this;
        }

        @NonNull
        public Builder withTrackingLocation(boolean z) {
            this.b = z;
            return this;
        }
    }

    MyTargetConfig(boolean z, boolean z2, String[] strArr) {
        this.isTrackingEnvironmentEnabled = z;
        this.isTrackingLocationEnabled = z2;
        this.testDevices = strArr;
    }
}

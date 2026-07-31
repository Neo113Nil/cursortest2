package com.smaato.sdk.ng.contentinfo;

import java.io.Serializable;

/* loaded from: classes9.dex */
public class AdFeedbackData implements Serializable {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;

    public static class Builder {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;
        private String j;
        private String k;
        private String l;

        public AdFeedbackData build() {
            return new AdFeedbackData(this);
        }

        public Builder setAdFormat(String str) {
            this.j = str;
            return this;
        }

        public Builder setAppToken(String str) {
            this.a = str;
            return this;
        }

        public Builder setAppVersion(String str) {
            this.d = str;
            return this;
        }

        public Builder setAudioState(String str) {
            this.c = str;
            return this;
        }

        public Builder setCreative(String str) {
            this.l = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.f = str;
            return this;
        }

        public Builder setDeviceInfo(String str) {
            this.e = str;
            return this;
        }

        public Builder setHasEndCard(String str) {
            this.k = str;
            return this;
        }

        public Builder setImpressionBeacon(String str) {
            this.g = str;
            return this;
        }

        public Builder setIntegrationType(String str) {
            this.i = str;
            return this;
        }

        public Builder setSdkVersion(String str) {
            this.h = str;
            return this;
        }

        public Builder setZoneId(String str) {
            this.b = str;
            return this;
        }
    }

    private AdFeedbackData(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.f;
        this.g = builder.g;
        this.h = builder.h;
        this.i = builder.i;
        this.j = builder.j;
        this.k = builder.k;
        this.l = builder.l;
    }

    public String getAdFormat() {
        return this.j;
    }

    public String getAppToken() {
        return this.a;
    }

    public String getAppVersion() {
        return this.d;
    }

    public String getAudioState() {
        return this.c;
    }

    public String getCreative() {
        return this.l;
    }

    public String getCreativeId() {
        return this.f;
    }

    public String getDeviceInfo() {
        return this.e;
    }

    public String getHasEndCard() {
        return this.k;
    }

    public String getImpressionBeacon() {
        return this.g;
    }

    public String getIntegrationType() {
        return this.i;
    }

    public String getSdkVersion() {
        return this.h;
    }

    public String getZoneId() {
        return this.b;
    }
}

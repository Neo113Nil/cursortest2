package com.smaato.sdk.ng.vpaid.vast;

/* loaded from: classes10.dex */
public class VastUrlParameters {
    final String a;
    final String b;
    final String c;
    final String d;
    final String e;
    final String f;
    final String g;
    final String h;
    final String i;
    final String j;
    final String k;

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

        public Builder advertisingId(String str) {
            this.a = str;
            return this;
        }

        public VastUrlParameters build() {
            return new VastUrlParameters(this);
        }

        public Builder bundleId(String str) {
            this.b = str;
            return this;
        }

        public Builder deviceHeight(String str) {
            this.h = str;
            return this;
        }

        public Builder deviceWidth(String str) {
            this.g = str;
            return this;
        }

        public Builder dnt(String str) {
            this.c = str;
            return this;
        }

        public Builder gdpr(String str) {
            this.i = str;
            return this;
        }

        public Builder gdprConsent(String str) {
            this.j = str;
            return this;
        }

        public Builder latitude(String str) {
            this.d = str;
            return this;
        }

        public Builder longitude(String str) {
            this.e = str;
            return this;
        }

        public Builder usPrivacy(String str) {
            this.k = str;
            return this;
        }

        public Builder userAgent(String str) {
            this.f = str;
            return this;
        }
    }

    private VastUrlParameters(Builder builder) {
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
    }
}

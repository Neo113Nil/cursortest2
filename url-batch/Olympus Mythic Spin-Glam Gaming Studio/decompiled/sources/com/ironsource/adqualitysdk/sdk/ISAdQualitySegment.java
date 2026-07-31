package com.ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.AbstractC0580;
import com.ironsource.adqualitysdk.sdk.i.AbstractC1246;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

@Deprecated
/* loaded from: classes5.dex */
public class ISAdQualitySegment {

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final HashMap f74;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final double f75;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final long f76;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final AtomicBoolean f77;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final int f78;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String f79;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final int f80;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f81;

    @Deprecated
    public static class Builder {

        /* renamed from: ｋ, reason: contains not printable characters */
        public String f87;

        /* renamed from: ﾒ, reason: contains not printable characters */
        public String f89;

        /* renamed from: ﾇ, reason: contains not printable characters */
        public int f88 = -1;

        /* renamed from: ﻛ, reason: contains not printable characters */
        public int f86 = -1;

        /* renamed from: ﻐ, reason: contains not printable characters */
        public AtomicBoolean f85 = null;

        /* renamed from: ﻏ, reason: contains not printable characters */
        public long f84 = 0;

        /* renamed from: ﺙ, reason: contains not printable characters */
        public double f83 = -1.0d;

        /* renamed from: ﱡ, reason: contains not printable characters */
        public final HashMap f82 = new HashMap();

        @Deprecated
        public Builder() {
        }

        @Deprecated
        public ISAdQualitySegment build() {
            return new ISAdQualitySegment(this.f89, this.f88, this.f87, this.f86, this.f85, this.f83, this.f84, new HashMap(this.f82));
        }

        @Deprecated
        public Builder setAge(int i) {
            if (i == 0) {
                return this;
            }
            if (i < 1 || i > 199) {
                AbstractC0580.m4074("ISAdQualitySegment Builder", "setAge( " + i + " ) age must be between 1-199");
            } else {
                this.f88 = i;
            }
            return this;
        }

        @Deprecated
        public Builder setCustomData(String str, String str2) {
            if (TextUtils.isEmpty(str2)) {
                return this;
            }
            try {
                if (this.f82.size() < 5) {
                    boolean z = false;
                    if (TextUtils.isEmpty(str) ? false : str.matches(StringFog.decrypt("nhfAN4w8fO3wYZhH3Fk=\n", "wEyhGvZ9Ubc=\n"))) {
                        if (!TextUtils.isEmpty(str2)) {
                            z = str2.matches(StringFog.decrypt("nhfAN4w8fO3wYZhH3Fk=\n", "wEyhGvZ9Ubc=\n"));
                        }
                        if (z && AbstractC1246.m4509(str, 32) && AbstractC1246.m4509(str2, 32)) {
                            this.f82.put("sgct_" + str, str2);
                        }
                    }
                    AbstractC0580.m4074("ISAdQualitySegment Builder", "setCustomData( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length");
                } else {
                    AbstractC0580.m4074("ISAdQualitySegment Builder", "setCustomData( " + str + " , " + str2 + " ) limited to 5 custom values. Ignoring custom value.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return this;
        }

        @Deprecated
        public Builder setGender(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            Locale locale = Locale.ENGLISH;
            if (str.toLowerCase(locale).equals(IronSourceConstants.a.b) || str.toLowerCase(locale).equals(IronSourceConstants.a.c)) {
                this.f87 = str.toLowerCase(locale);
            } else {
                AbstractC0580.m4074("ISAdQualitySegment Builder", "setGender( " + str + " ) is invalid");
            }
            return this;
        }

        @Deprecated
        public Builder setInAppPurchasesTotal(double d) {
            if (d < 0.0d || d >= 999999.99d) {
                AbstractC0580.m4074("ISAdQualitySegment Builder", "setIAPTotal( " + d + " ) iapt must be between 0-999999.99");
            } else {
                this.f83 = Math.floor(d * 100.0d) / 100.0d;
            }
            return this;
        }

        @Deprecated
        public Builder setIsPaying(boolean z) {
            if (this.f85 == null) {
                this.f85 = new AtomicBoolean();
            }
            this.f85.set(z);
            return this;
        }

        @Deprecated
        public Builder setLevel(int i) {
            if (i == 0) {
                return this;
            }
            if (i <= 0 || i >= 999999) {
                AbstractC0580.m4074("ISAdQualitySegment Builder", "setLevel( " + i + " ) level must be between 1-999999");
            } else {
                this.f86 = i;
            }
            return this;
        }

        @Deprecated
        public Builder setSegmentName(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if ((TextUtils.isEmpty(str) ? false : str.matches(StringFog.decrypt("nhfAN4w8fO3wYZhH3Fk=\n", "wEyhGvZ9Ubc=\n"))) && AbstractC1246.m4509(str, 32)) {
                this.f89 = str;
            } else {
                AbstractC0580.m4074("ISAdQualitySegment Builder", "setSegmentName( " + str + " ) segment name must be alphanumeric and 1-32 in length");
            }
            return this;
        }

        @Deprecated
        public Builder setUserCreationDate(long j) {
            if (j == 0) {
                return this;
            }
            if (j > 0) {
                this.f84 = j;
            } else {
                AbstractC0580.m4074("ISAdQualitySegment Builder", "setUserCreationDate( " + j + " ) is an invalid timestamp");
            }
            return this;
        }
    }

    public ISAdQualitySegment(String str, int i, String str2, int i2, AtomicBoolean atomicBoolean, double d, long j, HashMap hashMap) {
        this.f81 = str;
        this.f80 = i;
        this.f79 = str2;
        this.f78 = i2;
        this.f77 = atomicBoolean;
        this.f75 = d;
        this.f76 = j;
        this.f74 = hashMap;
    }

    @Deprecated
    public int getAge() {
        return this.f80;
    }

    @Deprecated
    public Map<String, String> getCustomData() {
        return this.f74;
    }

    @Deprecated
    public String getGender() {
        return this.f79;
    }

    @Deprecated
    public double getInAppPurchasesTotal() {
        return this.f75;
    }

    @Deprecated
    public AtomicBoolean getIsPaying() {
        return this.f77;
    }

    @Deprecated
    public int getLevel() {
        return this.f78;
    }

    @Deprecated
    public String getName() {
        return this.f81;
    }

    @Deprecated
    public long getUserCreationDate() {
        return this.f76;
    }
}

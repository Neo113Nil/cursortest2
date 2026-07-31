package com.ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.AbstractC0580;
import com.ironsource.adqualitysdk.sdk.i.AbstractC0588;
import com.ironsource.adqualitysdk.sdk.i.AbstractC1246;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes8.dex */
public class ISAdQualityConfig {

    /* renamed from: ﮌ, reason: contains not printable characters */
    public final HashMap f36;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final ISAdQualityDeviceIdType f37;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final boolean f38;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final boolean f39;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final String f40;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final ISAdQualityLogLevel f41;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final HashSet f42;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final boolean f43;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final boolean f44;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean f45;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f46;

    public ISAdQualityConfig(String str, boolean z, boolean z2, boolean z3, ISAdQualityLogLevel iSAdQualityLogLevel, HashSet hashSet, String str2, boolean z4, boolean z5, ISAdQualityDeviceIdType iSAdQualityDeviceIdType, HashMap hashMap) {
        this.f46 = str;
        this.f45 = z;
        this.f44 = z2;
        this.f43 = z3;
        this.f41 = iSAdQualityLogLevel;
        this.f42 = hashSet;
        this.f40 = str2;
        this.f39 = z4;
        this.f38 = z5;
        this.f37 = iSAdQualityDeviceIdType;
        this.f36 = hashMap;
    }

    @Deprecated
    public static ISAdQualityConfig merge(ISAdQualityConfig iSAdQualityConfig, ISAdQualityConfig iSAdQualityConfig2) {
        Builder builder = new Builder();
        if (iSAdQualityConfig.f45) {
            builder.setUserId(iSAdQualityConfig.f46);
        } else if (iSAdQualityConfig2.f45) {
            builder.setUserId(iSAdQualityConfig2.f46);
        }
        if (iSAdQualityConfig.f43) {
            builder.setTestMode(iSAdQualityConfig.f44);
        } else if (iSAdQualityConfig2.f43) {
            builder.setTestMode(iSAdQualityConfig2.f44);
        }
        if (iSAdQualityConfig.f38) {
            builder.setCoppa(iSAdQualityConfig.f39);
        } else if (iSAdQualityConfig2.f38) {
            builder.setCoppa(iSAdQualityConfig2.f39);
        }
        ISAdQualityLogLevel iSAdQualityLogLevel = iSAdQualityConfig.f41;
        if (iSAdQualityLogLevel == null) {
            iSAdQualityLogLevel = iSAdQualityConfig2.f41;
        }
        builder.setLogLevel(iSAdQualityLogLevel);
        Iterator it = iSAdQualityConfig.f42.iterator();
        while (it.hasNext()) {
            builder.addAdQualityInitListener((ISAdQualityInitListener) it.next());
        }
        Iterator it2 = iSAdQualityConfig2.f42.iterator();
        while (it2.hasNext()) {
            builder.addAdQualityInitListener((ISAdQualityInitListener) it2.next());
        }
        String str = iSAdQualityConfig.f40;
        if (str != null) {
            builder.setInitializationSource(str);
        } else {
            String str2 = iSAdQualityConfig2.f40;
            if (str2 != null) {
                builder.setInitializationSource(str2);
            }
        }
        ISAdQualityDeviceIdType iSAdQualityDeviceIdType = iSAdQualityConfig.f37;
        if (iSAdQualityDeviceIdType == null) {
            iSAdQualityDeviceIdType = iSAdQualityConfig2.f37;
        }
        builder.setDeviceIdType(iSAdQualityDeviceIdType);
        HashMap hashMap = new HashMap(iSAdQualityConfig2.f36);
        hashMap.putAll(iSAdQualityConfig.f36);
        for (Map.Entry entry : hashMap.entrySet()) {
            builder.setMetaData((String) entry.getKey(), (String) entry.getValue());
        }
        return builder.build();
    }

    @Deprecated
    public Set<ISAdQualityInitListener> getAdQualityInitListeners() {
        return this.f42;
    }

    @Deprecated
    public boolean getCoppa() {
        return this.f39;
    }

    @Deprecated
    public ISAdQualityDeviceIdType getDeviceIdType() {
        return this.f37;
    }

    @Deprecated
    public String getInitializationSource() {
        return this.f40;
    }

    @Deprecated
    public ISAdQualityLogLevel getLogLevel() {
        return this.f41;
    }

    @Deprecated
    public Map<String, String> getMetaData() {
        return this.f36;
    }

    @Deprecated
    public String getUserId() {
        return this.f46;
    }

    @Deprecated
    public boolean isTestMode() {
        return this.f44;
    }

    @Deprecated
    public boolean isUserIdSet() {
        return this.f45;
    }

    @Deprecated
    public static class Builder {

        /* renamed from: ﾒ, reason: contains not printable characters */
        public String f57 = null;

        /* renamed from: ﾇ, reason: contains not printable characters */
        public boolean f56 = false;

        /* renamed from: ｋ, reason: contains not printable characters */
        public boolean f55 = false;

        /* renamed from: ﻛ, reason: contains not printable characters */
        public boolean f54 = false;

        /* renamed from: ﻐ, reason: contains not printable characters */
        public ISAdQualityLogLevel f53 = ISAdQualityLogLevel.INFO;

        /* renamed from: ﻏ, reason: contains not printable characters */
        public final HashSet f52 = new HashSet();

        /* renamed from: ﺙ, reason: contains not printable characters */
        public String f51 = null;

        /* renamed from: ﱡ, reason: contains not printable characters */
        public boolean f50 = false;

        /* renamed from: ﱟ, reason: contains not printable characters */
        public boolean f49 = false;

        /* renamed from: ﮐ, reason: contains not printable characters */
        public ISAdQualityDeviceIdType f48 = ISAdQualityDeviceIdType.NONE;

        /* renamed from: ﮌ, reason: contains not printable characters */
        public final HashMap f47 = new HashMap();

        @Deprecated
        public Builder() {
        }

        @Deprecated
        public Builder addAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f52.add(iSAdQualityInitListener);
            return this;
        }

        @Deprecated
        public ISAdQualityConfig build() {
            return new ISAdQualityConfig(this.f57, this.f56, this.f55, this.f54, this.f53, this.f52, this.f51, this.f50, this.f49, this.f48, this.f47);
        }

        @Deprecated
        public Builder removeAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f52.remove(iSAdQualityInitListener);
            return this;
        }

        @Deprecated
        public Builder setAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            return addAdQualityInitListener(iSAdQualityInitListener);
        }

        @Deprecated
        public Builder setCoppa(boolean z) {
            this.f50 = z;
            this.f49 = true;
            return this;
        }

        @Deprecated
        public Builder setDeviceIdType(ISAdQualityDeviceIdType iSAdQualityDeviceIdType) {
            this.f48 = iSAdQualityDeviceIdType;
            return this;
        }

        @Deprecated
        public Builder setInitializationSource(String str) {
            if (AbstractC1246.m4509(str, 20)) {
                this.f51 = str;
            } else {
                AbstractC0580.m4074("ISAdQualityConfig", "setInitializationSource( " + str + " ) init source must have length of 1-20");
            }
            return this;
        }

        @Deprecated
        public Builder setLogLevel(ISAdQualityLogLevel iSAdQualityLogLevel) {
            this.f53 = iSAdQualityLogLevel;
            return this;
        }

        @Deprecated
        public Builder setMetaData(JSONObject jSONObject) {
            if (jSONObject != null) {
                for (int i = 0; i < jSONObject.names().length(); i++) {
                    try {
                        String string = jSONObject.names().getString(i);
                        Object opt = jSONObject.opt(string);
                        if (opt instanceof String) {
                            setMetaData(string, (String) opt);
                        } else {
                            AbstractC0580.m4074("ISAdQualityConfig", "setMetaData( " + string + " , " + opt + " ) value must be a string");
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return this;
        }

        @Deprecated
        public Builder setTestMode(boolean z) {
            this.f55 = z;
            this.f54 = true;
            return this;
        }

        @Deprecated
        public Builder setUserId(String str) {
            this.f57 = str;
            this.f56 = true;
            return this;
        }

        @Deprecated
        public Builder setMetaData(String str, String str2) {
            if (TextUtils.isEmpty(str2)) {
                return this;
            }
            if (!AbstractC0588.f974.contains(str)) {
                if (AbstractC0588.m4086(this.f47, str)) {
                    AbstractC0580.m4074("ISAdQualityConfig", "setMetaData( " + str + " , " + str2 + " ) limited to 5 meta data values. Ignoring meta data value.");
                    return this;
                }
                if (!AbstractC1246.m4509(str, 64) || !AbstractC1246.m4509(str2, 64)) {
                    AbstractC0580.m4074("ISAdQualityConfig", "setMetaData( " + str + " , " + str2 + " ) the length of both the key and the value should be between 1 and 64 characters.");
                    return this;
                }
            }
            this.f47.put(str, str2);
            return this;
        }
    }
}

package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﯿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1230 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final ArrayList f3229;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f3230;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Class f3231;

    public C1230(Object obj, String str, ArrayList arrayList) {
        if (obj instanceof Class) {
            this.f3231 = (Class) obj;
        } else {
            this.f3231 = obj.getClass();
        }
        this.f3230 = str;
        this.f3229 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1230.class != obj.getClass()) {
            return false;
        }
        C1230 c1230 = (C1230) obj;
        if (this.f3231.equals(c1230.f3231) && this.f3230.equals(c1230.f3230)) {
            return this.f3229.equals(c1230.f3229);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3229.hashCode() + ((this.f3230.hashCode() + (this.f3231.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return StringFog.decrypt("NajUNeMxOSEepM40+DwSKgM=\n", "eM2gXYxVfUQ=\n") + StringFog.decrypt("u25DVNTY1VK6QFJNjA==\n", "1iEhPrG7oRE=\n") + this.f3231 + StringFog.decrypt("ZyePgl4B2tovSYOiXkiV\n", "Swfizzt1srU=\n") + this.f3230 + '\'' + StringFog.decrypt("GSEP7/W1a19UchHL9O8=\n", "NQFirofSKDM=\n") + this.f3229 + '}';
    }
}

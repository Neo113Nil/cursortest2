package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;

/* renamed from: io.appmetrica.analytics.impl.g5, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C5351g5 {
    public final String a;
    public final String b;

    public C5351g5(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @NonNull
    public final String a() {
        return ApiKeyUtils.createPartialApiKey(this.b);
    }

    @Nullable
    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public boolean d() {
        return false;
    }

    public String e() {
        return this.a + "_" + ApiKeyUtils.createPartialApiKey(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5351g5 c5351g5 = (C5351g5) obj;
        String str = this.a;
        if (str == null ? c5351g5.a != null : !str.equals(c5351g5.a)) {
            return false;
        }
        String str2 = this.b;
        String str3 = c5351g5.b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.a + "_" + this.b;
    }
}

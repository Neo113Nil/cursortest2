package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.services.H;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes6.dex */
public final class n {
    public static final int d = 0;

    @Nullable
    public final H a;

    @Nullable
    public final String b;

    @Nullable
    public final String c;

    public n() {
        this(null, null, null, 7, null);
    }

    @Nullable
    public final H a() {
        return this.a;
    }

    @Nullable
    public final String b() {
        return this.b;
    }

    @Nullable
    public final String c() {
        return this.c;
    }

    @Nullable
    public final String d() {
        return this.c;
    }

    @Nullable
    public final String e() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.a == nVar.a && Intrinsics.areEqual(this.b, nVar.b) && Intrinsics.areEqual(this.c, nVar.c);
    }

    @Nullable
    public final H f() {
        return this.a;
    }

    public int hashCode() {
        H h = this.a;
        int hashCode = (h == null ? 0 : h.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DeviceSignalInfo(orientation=" + this.a + ", locale=" + this.b + ", keyboardLocale=" + this.c + ')';
    }

    public n(@Nullable H h, @Nullable String str, @Nullable String str2) {
        this.a = h;
        this.b = str;
        this.c = str2;
    }

    @NotNull
    public final n a(@Nullable H h, @Nullable String str, @Nullable String str2) {
        return new n(h, str, str2);
    }

    public static /* synthetic */ n a(n nVar, H h, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            h = nVar.a;
        }
        if ((i & 2) != 0) {
            str = nVar.b;
        }
        if ((i & 4) != 0) {
            str2 = nVar.c;
        }
        return nVar.a(h, str, str2);
    }

    public /* synthetic */ n(H h, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : h, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}

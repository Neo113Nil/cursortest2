package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.we, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4957we {

    @NotNull
    private final String a;

    @Nullable
    private final String b;

    @NotNull
    private final List<IronSource.a> c;

    public C4957we(@NotNull String appKey, @Nullable String str, @NotNull List<IronSource.a> legacyAdFormats) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
        this.a = appKey;
        this.b = str;
        this.c = legacyAdFormats;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @Nullable
    public final String b() {
        return this.b;
    }

    @NotNull
    public final List<IronSource.a> c() {
        return this.c;
    }

    @NotNull
    public final String d() {
        return this.a;
    }

    @NotNull
    public final List<IronSource.a> e() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4957we)) {
            return false;
        }
        C4957we c4957we = (C4957we) obj;
        return Intrinsics.areEqual(this.a, c4957we.a) && Intrinsics.areEqual(this.b, c4957we.b) && Intrinsics.areEqual(this.c, c4957we.c);
    }

    @Nullable
    public final String f() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    @NotNull
    public String toString() {
        return "SdkInitRequest(appKey=" + this.a + ", userId=" + this.b + ", legacyAdFormats=" + this.c + ")";
    }

    @NotNull
    public final C4957we a(@NotNull String appKey, @Nullable String str, @NotNull List<IronSource.a> legacyAdFormats) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
        return new C4957we(appKey, str, legacyAdFormats);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4957we a(C4957we c4957we, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4957we.a;
        }
        if ((i & 2) != 0) {
            str2 = c4957we.b;
        }
        if ((i & 4) != 0) {
            list = c4957we.c;
        }
        return c4957we.a(str, str2, list);
    }

    public final void a(@NotNull List<? extends IronSource.a> adFormats) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.c.clear();
        this.c.addAll(adFormats);
    }

    public /* synthetic */ C4957we(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, list);
    }
}

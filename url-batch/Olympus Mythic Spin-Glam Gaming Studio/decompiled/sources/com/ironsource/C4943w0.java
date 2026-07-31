package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.w0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4943w0 {

    @Nullable
    private final String a;

    @NotNull
    private final List<NetworkSettings> b;

    @NotNull
    private final C4770ma c;

    /* JADX WARN: Multi-variable type inference failed */
    public C4943w0(@Nullable String str, @NotNull List<? extends NetworkSettings> providerList, @NotNull C4770ma publisherDataHolder) {
        Intrinsics.checkNotNullParameter(providerList, "providerList");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.a = str;
        this.b = providerList;
        this.c = publisherDataHolder;
    }

    @Nullable
    public final String a() {
        return this.a;
    }

    @NotNull
    public final List<NetworkSettings> b() {
        return this.b;
    }

    @NotNull
    public final C4770ma c() {
        return this.c;
    }

    @NotNull
    public final List<NetworkSettings> d() {
        return this.b;
    }

    @NotNull
    public final C4770ma e() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4943w0)) {
            return false;
        }
        C4943w0 c4943w0 = (C4943w0) obj;
        return Intrinsics.areEqual(this.a, c4943w0.a) && Intrinsics.areEqual(this.b, c4943w0.b) && Intrinsics.areEqual(this.c, c4943w0.c);
    }

    @Nullable
    public final String f() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdUnitCommonData(userId=" + this.a + ", providerList=" + this.b + ", publisherDataHolder=" + this.c + ")";
    }

    @NotNull
    public final C4943w0 a(@Nullable String str, @NotNull List<? extends NetworkSettings> providerList, @NotNull C4770ma publisherDataHolder) {
        Intrinsics.checkNotNullParameter(providerList, "providerList");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        return new C4943w0(str, providerList, publisherDataHolder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4943w0 a(C4943w0 c4943w0, String str, List list, C4770ma c4770ma, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4943w0.a;
        }
        if ((i & 2) != 0) {
            list = c4943w0.b;
        }
        if ((i & 4) != 0) {
            c4770ma = c4943w0.c;
        }
        return c4943w0.a(str, list, c4770ma);
    }
}

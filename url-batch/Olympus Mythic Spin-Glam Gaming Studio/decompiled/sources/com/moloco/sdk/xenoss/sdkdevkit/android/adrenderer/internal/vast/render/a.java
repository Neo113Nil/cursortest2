package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5060i;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes14.dex */
public final class a {
    public static final int f = 8;

    @NotNull
    public final f a;

    @Nullable
    public final c b;

    @NotNull
    public final List<String> c;

    @NotNull
    public final List<String> d;

    @Nullable
    public final C5060i e;

    public a(@NotNull f linear, @Nullable c cVar, @NotNull List<String> impressionTracking, @NotNull List<String> errorTracking, @Nullable C5060i c5060i) {
        Intrinsics.checkNotNullParameter(linear, "linear");
        Intrinsics.checkNotNullParameter(impressionTracking, "impressionTracking");
        Intrinsics.checkNotNullParameter(errorTracking, "errorTracking");
        this.a = linear;
        this.b = cVar;
        this.c = impressionTracking;
        this.d = errorTracking;
        this.e = c5060i;
    }

    @NotNull
    public final f a() {
        return this.a;
    }

    @Nullable
    public final c b() {
        return this.b;
    }

    @NotNull
    public final List<String> c() {
        return this.c;
    }

    @NotNull
    public final List<String> d() {
        return this.d;
    }

    @Nullable
    public final C5060i e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c) && Intrinsics.areEqual(this.d, aVar.d) && Intrinsics.areEqual(this.e, aVar.e);
    }

    @Nullable
    public final c f() {
        return this.b;
    }

    @Nullable
    public final C5060i g() {
        return this.e;
    }

    @NotNull
    public final List<String> h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        c cVar = this.b;
        int hashCode2 = (((((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        C5060i c5060i = this.e;
        return hashCode2 + (c5060i != null ? c5060i.hashCode() : 0);
    }

    @NotNull
    public final List<String> i() {
        return this.c;
    }

    @NotNull
    public final f j() {
        return this.a;
    }

    @NotNull
    public String toString() {
        return "Ad(linear=" + this.a + ", companion=" + this.b + ", impressionTracking=" + this.c + ", errorTracking=" + this.d + ", dec=" + this.e + ')';
    }

    @NotNull
    public final a a(@NotNull f linear, @Nullable c cVar, @NotNull List<String> impressionTracking, @NotNull List<String> errorTracking, @Nullable C5060i c5060i) {
        Intrinsics.checkNotNullParameter(linear, "linear");
        Intrinsics.checkNotNullParameter(impressionTracking, "impressionTracking");
        Intrinsics.checkNotNullParameter(errorTracking, "errorTracking");
        return new a(linear, cVar, impressionTracking, errorTracking, c5060i);
    }

    public static /* synthetic */ a a(a aVar, f fVar, c cVar, List list, List list2, C5060i c5060i, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = aVar.a;
        }
        if ((i & 2) != 0) {
            cVar = aVar.b;
        }
        c cVar2 = cVar;
        if ((i & 4) != 0) {
            list = aVar.c;
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = aVar.d;
        }
        List list4 = list2;
        if ((i & 16) != 0) {
            c5060i = aVar.e;
        }
        return aVar.a(fVar, cVar2, list3, list4, c5060i);
    }

    public /* synthetic */ a(f fVar, c cVar, List list, List list2, C5060i c5060i, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, cVar, list, list2, (i & 16) != 0 ? null : c5060i);
    }
}

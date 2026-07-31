package com.moloco.sdk.internal.publisher.nativead.model;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.publisher.nativead.model.b;
import com.moloco.sdk.internal.publisher.nativead.model.c;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes5.dex */
public final class d {
    public static final int g = 8;

    @NotNull
    public final Map<Integer, c.a> a;

    @NotNull
    public final Map<Integer, c.b> b;

    @NotNull
    public final Map<Integer, c.C1550c> c;

    @NotNull
    public final Map<Integer, c.d> d;

    @NotNull
    public final List<Pair<b.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>> e;

    @NotNull
    public final Lazy f;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull Map<Integer, c.a> data, @NotNull Map<Integer, c.b> images, @NotNull Map<Integer, c.C1550c> titles, @NotNull Map<Integer, c.d> videos, @NotNull List<? extends Pair<? extends b.a, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>> failedAssets) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(titles, "titles");
        Intrinsics.checkNotNullParameter(videos, "videos");
        Intrinsics.checkNotNullParameter(failedAssets, "failedAssets");
        this.a = data;
        this.b = images;
        this.c = titles;
        this.d = videos;
        this.e = failedAssets;
        this.f = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.publisher.nativead.model.d$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return d.a(d.this);
            }
        });
    }

    public final Map<Integer, c.a> a() {
        return this.a;
    }

    public final Map<Integer, c.b> b() {
        return this.b;
    }

    public final Map<Integer, c.C1550c> c() {
        return this.c;
    }

    public final Map<Integer, c.d> d() {
        return this.d;
    }

    public final List<Pair<b.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>> e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.a, dVar.a) && Intrinsics.areEqual(this.b, dVar.b) && Intrinsics.areEqual(this.c, dVar.c) && Intrinsics.areEqual(this.d, dVar.d) && Intrinsics.areEqual(this.e, dVar.e);
    }

    public final Map<Integer, c> f() {
        return (Map) this.f.getValue();
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    @NotNull
    public String toString() {
        return "PreparedNativeAssets(data=" + this.a + ", images=" + this.b + ", titles=" + this.c + ", videos=" + this.d + ", failedAssets=" + this.e + ')';
    }

    @NotNull
    public final d a(@NotNull Map<Integer, c.a> data, @NotNull Map<Integer, c.b> images, @NotNull Map<Integer, c.C1550c> titles, @NotNull Map<Integer, c.d> videos, @NotNull List<? extends Pair<? extends b.a, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>> failedAssets) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(titles, "titles");
        Intrinsics.checkNotNullParameter(videos, "videos");
        Intrinsics.checkNotNullParameter(failedAssets, "failedAssets");
        return new d(data, images, titles, videos, failedAssets);
    }

    @Nullable
    public final Uri b(int i) {
        c.b bVar = this.b.get(Integer.valueOf(i));
        if (bVar != null) {
            return bVar.d();
        }
        return null;
    }

    @Nullable
    public final String c(int i) {
        c.C1550c c1550c = this.c.get(Integer.valueOf(i));
        if (c1550c != null) {
            return c1550c.d();
        }
        return null;
    }

    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a d(int i) {
        c.d dVar = this.d.get(Integer.valueOf(i));
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public static /* synthetic */ d a(d dVar, Map map, Map map2, Map map3, Map map4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            map = dVar.a;
        }
        if ((i & 2) != 0) {
            map2 = dVar.b;
        }
        Map map5 = map2;
        if ((i & 4) != 0) {
            map3 = dVar.c;
        }
        Map map6 = map3;
        if ((i & 8) != 0) {
            map4 = dVar.d;
        }
        Map map7 = map4;
        if ((i & 16) != 0) {
            list = dVar.e;
        }
        return dVar.a(map, map5, map6, map7, list);
    }

    public static final Map a(d dVar) {
        return MapsKt.plus(MapsKt.plus(MapsKt.plus(dVar.a, dVar.b), dVar.c), dVar.d);
    }

    @Nullable
    public final String a(int i) {
        c.a aVar = this.a.get(Integer.valueOf(i));
        if (aVar != null) {
            return aVar.d();
        }
        return null;
    }
}

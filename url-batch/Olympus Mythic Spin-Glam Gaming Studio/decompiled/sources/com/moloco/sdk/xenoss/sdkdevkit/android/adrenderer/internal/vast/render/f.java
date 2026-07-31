package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes14.dex */
public final class f {
    public static final int h = 8;

    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r a;

    @NotNull
    public final File b;

    @Nullable
    public final Integer c;

    @NotNull
    public final String d;

    @Nullable
    public final String e;

    @NotNull
    public final h f;

    @Nullable
    public final e g;

    public f(@Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r rVar, @NotNull File localMediaResource, @Nullable Integer num, @NotNull String networkMediaResource, @Nullable String str, @NotNull h tracking, @Nullable e eVar) {
        Intrinsics.checkNotNullParameter(localMediaResource, "localMediaResource");
        Intrinsics.checkNotNullParameter(networkMediaResource, "networkMediaResource");
        Intrinsics.checkNotNullParameter(tracking, "tracking");
        this.a = rVar;
        this.b = localMediaResource;
        this.c = num;
        this.d = networkMediaResource;
        this.e = str;
        this.f = tracking;
        this.g = eVar;
    }

    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r a() {
        return this.a;
    }

    @NotNull
    public final File b() {
        return this.b;
    }

    @Nullable
    public final Integer c() {
        return this.c;
    }

    @NotNull
    public final String d() {
        return this.d;
    }

    @Nullable
    public final String e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.a, fVar.a) && Intrinsics.areEqual(this.b, fVar.b) && Intrinsics.areEqual(this.c, fVar.c) && Intrinsics.areEqual(this.d, fVar.d) && Intrinsics.areEqual(this.e, fVar.e) && Intrinsics.areEqual(this.f, fVar.f) && Intrinsics.areEqual(this.g, fVar.g);
    }

    @NotNull
    public final h f() {
        return this.f;
    }

    @Nullable
    public final e g() {
        return this.g;
    }

    @Nullable
    public final String h() {
        return this.e;
    }

    public int hashCode() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r rVar = this.a;
        int hashCode = (((rVar == null ? 0 : rVar.hashCode()) * 31) + this.b.hashCode()) * 31;
        Integer num = this.c;
        int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.d.hashCode()) * 31;
        String str = this.e;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.f.hashCode()) * 31;
        e eVar = this.g;
        return hashCode3 + (eVar != null ? eVar.hashCode() : 0);
    }

    @Nullable
    public final e i() {
        return this.g;
    }

    @NotNull
    public final File j() {
        return this.b;
    }

    @Nullable
    public final Integer k() {
        return this.c;
    }

    @NotNull
    public final String l() {
        return this.d;
    }

    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r m() {
        return this.a;
    }

    @NotNull
    public final h n() {
        return this.f;
    }

    @NotNull
    public String toString() {
        return "Linear(skipOffset=" + this.a + ", localMediaResource=" + this.b + ", localMediaResourceBitrate=" + this.c + ", networkMediaResource=" + this.d + ", clickThroughUrl=" + this.e + ", tracking=" + this.f + ", icon=" + this.g + ')';
    }

    @NotNull
    public final f a(@Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r rVar, @NotNull File localMediaResource, @Nullable Integer num, @NotNull String networkMediaResource, @Nullable String str, @NotNull h tracking, @Nullable e eVar) {
        Intrinsics.checkNotNullParameter(localMediaResource, "localMediaResource");
        Intrinsics.checkNotNullParameter(networkMediaResource, "networkMediaResource");
        Intrinsics.checkNotNullParameter(tracking, "tracking");
        return new f(rVar, localMediaResource, num, networkMediaResource, str, tracking, eVar);
    }

    public static /* synthetic */ f a(f fVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r rVar, File file, Integer num, String str, String str2, h hVar, e eVar, int i, Object obj) {
        if ((i & 1) != 0) {
            rVar = fVar.a;
        }
        if ((i & 2) != 0) {
            file = fVar.b;
        }
        File file2 = file;
        if ((i & 4) != 0) {
            num = fVar.c;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str = fVar.d;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = fVar.e;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            hVar = fVar.f;
        }
        h hVar2 = hVar;
        if ((i & 64) != 0) {
            eVar = fVar.g;
        }
        return fVar.a(rVar, file2, num2, str3, str4, hVar2, eVar);
    }
}

package com.unity3d.mediation;

import com.unity3d.mediation.LevelPlay;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes15.dex */
public final class LevelPlayInitRequest {

    @NotNull
    private final String a;

    @Nullable
    private final String b;

    @NotNull
    private final List<LevelPlay.AdFormat> c;

    public static final class Builder {

        @NotNull
        private final String a;

        @Nullable
        private String b;

        public Builder(@NotNull String appKey) {
            Intrinsics.checkNotNullParameter(appKey, "appKey");
            this.a = appKey;
        }

        @NotNull
        public final LevelPlayInitRequest build() {
            return new LevelPlayInitRequest(this.a, this.b, null, 4, null);
        }

        @NotNull
        public final String getAppKey() {
            return this.a;
        }

        @NotNull
        public final Builder withUserId(@NotNull String userId) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            this.b = userId;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LevelPlayInitRequest(String str, String str2, List<? extends LevelPlay.AdFormat> list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    @NotNull
    public final String getAppKey() {
        return this.a;
    }

    @NotNull
    public final List<LevelPlay.AdFormat> getLegacyAdFormats() {
        return this.c;
    }

    @Nullable
    public final String getUserId() {
        return this.b;
    }

    /* synthetic */ LevelPlayInitRequest(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }
}

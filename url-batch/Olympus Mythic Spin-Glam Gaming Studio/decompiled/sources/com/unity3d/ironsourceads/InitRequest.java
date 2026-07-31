package com.unity3d.ironsourceads;

import com.unity3d.ironsourceads.IronSourceAds;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public final class InitRequest {

    @NotNull
    private final String a;

    @NotNull
    private final List<IronSourceAds.AdFormat> b;

    @NotNull
    private final LogLevel c;

    public static final class Builder {

        @NotNull
        private final String a;

        @Nullable
        private List<? extends IronSourceAds.AdFormat> b;

        @Nullable
        private LogLevel c;

        public Builder(@NotNull String appKey) {
            Intrinsics.checkNotNullParameter(appKey, "appKey");
            this.a = appKey;
        }

        @NotNull
        public final InitRequest build() {
            String str = this.a;
            List<? extends IronSourceAds.AdFormat> list = this.b;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            LogLevel logLevel = this.c;
            if (logLevel == null) {
                logLevel = LogLevel.NONE;
            }
            return new InitRequest(str, list, logLevel, null);
        }

        @NotNull
        public final String getAppKey() {
            return this.a;
        }

        @NotNull
        public final Builder withLegacyAdFormats(@NotNull List<? extends IronSourceAds.AdFormat> legacyAdFormats) {
            Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
            this.b = legacyAdFormats;
            return this;
        }

        @NotNull
        public final Builder withLogLevel(@NotNull LogLevel logLevel) {
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            this.c = logLevel;
            return this;
        }
    }

    public /* synthetic */ InitRequest(String str, List list, LogLevel logLevel, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, logLevel);
    }

    @NotNull
    public final String getAppKey() {
        return this.a;
    }

    @NotNull
    public final List<IronSourceAds.AdFormat> getLegacyAdFormats() {
        return this.b;
    }

    @NotNull
    public final LogLevel getLogLevel() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InitRequest(String str, List<? extends IronSourceAds.AdFormat> list, LogLevel logLevel) {
        this.a = str;
        this.b = list;
        this.c = logLevel;
    }
}

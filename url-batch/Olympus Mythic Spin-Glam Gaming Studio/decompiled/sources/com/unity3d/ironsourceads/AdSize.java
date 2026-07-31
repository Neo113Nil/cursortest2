package com.unity3d.ironsourceads;

import com.ironsource.mediationsdk.j;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
public final class AdSize {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int a;
    private final int b;

    @NotNull
    private final String c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AdSize banner() {
            return new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, "BANNER", null);
        }

        @NotNull
        public final AdSize large() {
            return new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 90, j.b, null);
        }

        @NotNull
        public final AdSize leaderboard() {
            return new AdSize(728, 90, j.d, null);
        }

        @NotNull
        public final AdSize mediumRectangle() {
            return new AdSize(300, POBCommonConstants.DEFAULT_MIN_BITRATE, "MEDIUM_RECTANGLE", null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ AdSize(int i, int i2, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str);
    }

    @NotNull
    public static final AdSize banner() {
        return Companion.banner();
    }

    @NotNull
    public static final AdSize large() {
        return Companion.large();
    }

    @NotNull
    public static final AdSize leaderboard() {
        return Companion.leaderboard();
    }

    @NotNull
    public static final AdSize mediumRectangle() {
        return Companion.mediumRectangle();
    }

    public final int getHeight() {
        return this.b;
    }

    @NotNull
    public final String getSizeDescription() {
        return this.c;
    }

    public final int getWidth() {
        return this.a;
    }

    private AdSize(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }
}

package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.adjust.sdk.Constants;
import com.moloco.sdk.internal.MolocoLogger;
import com.pubmatic.sdk.common.POBCommonConstants;
import io.bidmachine.util.network.NetworkUtils;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes8.dex */
public final class d implements c {

    @NotNull
    public static final a b = new a(null);
    public static final int c = 8;

    @NotNull
    public static final String d = "BundleExtractor";

    @NotNull
    public final Regex a = new Regex("^[a-z][a-z0-9]*(\\.[a-z][a-z0-9]*)+$");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c
    public boolean a(@NotNull String bundleId) {
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        return this.a.matches(bundleId);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c
    @Nullable
    public String b(@NotNull String url) {
        String str;
        String str2;
        String queryParameter;
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Uri parse = Uri.parse(url);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
            String scheme = parse.getScheme();
            if (scheme != null) {
                str = scheme.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            String host = parse.getHost();
            if (host != null) {
                str2 = host.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
            } else {
                str2 = null;
            }
            if (Intrinsics.areEqual(str, NetworkUtils.PROTOCOL_MARKET)) {
                queryParameter = parse.getQueryParameter("id");
            } else {
                if (str2 == null || !StringsKt.contains$default((CharSequence) str2, (CharSequence) POBCommonConstants.PLAY_STORE_DOMAIN, false, 2, (Object) null)) {
                    return null;
                }
                queryParameter = parse.getQueryParameter("id");
            }
            return queryParameter;
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, d, "Failed to parse URL for bundle ID", e, false, 8, null);
            return null;
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c
    public boolean c(@Nullable String str) {
        String str2;
        String str3;
        if (str == null) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
            String scheme = parse.getScheme();
            if (scheme != null) {
                str2 = scheme.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
            } else {
                str2 = null;
            }
            String host = parse.getHost();
            if (host != null) {
                str3 = host.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str3, "toLowerCase(...)");
            } else {
                str3 = null;
            }
            if (!Intrinsics.areEqual(str2, NetworkUtils.PROTOCOL_MARKET)) {
                if (str3 == null) {
                    return false;
                }
                if (!StringsKt.contains$default((CharSequence) str3, (CharSequence) POBCommonConstants.PLAY_STORE_DOMAIN, false, 2, (Object) null)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "Xenoss", "Failed to parse URL for store validation", e, false, 8, null);
            return false;
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c
    @Nullable
    public String d(@NotNull String url) {
        String str;
        String str2;
        String queryParameter;
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Uri parse = Uri.parse(url);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
            String scheme = parse.getScheme();
            if (scheme != null) {
                str = scheme.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            String host = parse.getHost();
            if (host != null) {
                str2 = host.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
            } else {
                str2 = null;
            }
            if (Intrinsics.areEqual(str, NetworkUtils.PROTOCOL_MARKET)) {
                queryParameter = parse.getQueryParameter(Constants.REFERRER);
            } else {
                if (str2 == null || !StringsKt.contains$default((CharSequence) str2, (CharSequence) POBCommonConstants.PLAY_STORE_DOMAIN, false, 2, (Object) null)) {
                    return null;
                }
                queryParameter = parse.getQueryParameter(Constants.REFERRER);
            }
            return queryParameter;
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, d, "Failed to parse URL for referrer", e, false, 8, null);
            return null;
        }
    }
}

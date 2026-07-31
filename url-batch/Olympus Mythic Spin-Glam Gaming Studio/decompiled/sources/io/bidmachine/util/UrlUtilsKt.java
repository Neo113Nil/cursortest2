package io.bidmachine.util;

import android.net.Uri;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UrlUtils.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u001a\f\u0010\u0007\u001a\u00020\b*\u0004\u0018\u00010\u0003\u001a\n\u0010\t\u001a\u00020\u0003*\u00020\u0006\u001a\f\u0010\n\u001a\u0004\u0018\u00010\u0003*\u00020\u0006\u001a#\u0010\u000b\u001a\u00020\u0003*\u00020\u00032\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\r\"\u00020\u0006¢\u0006\u0002\u0010\u000e\u001a\u0018\u0010\u000b\u001a\u00020\u0003*\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u000f"}, d2 = {"appendQueryParametersFrom", "Landroid/net/Uri$Builder;", "fromUri", "Landroid/net/Uri;", "ignoreQueryParameters", "", "", "isHttp", "", "parseUri", "parseUriSafely", "removeQueryParameters", "parameterNames", "", "(Landroid/net/Uri;[Ljava/lang/String;)Landroid/net/Uri;", "bidmachine-android-sdk_bd_3_7_1"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes15.dex */
public final class UrlUtilsKt {
    @Nullable
    public static final Uri parseUriSafely(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return parseUri(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @NotNull
    public static final Uri parseUri(@NotNull String str) {
        Uri validUri;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Uri parse = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
        String scheme = parse.getScheme();
        if ((scheme == null || scheme.length() == 0) && !StringsKt.startsWith$default(str, "/", false, 2, (Object) null) && (validUri = Utils.getValidUri(str)) != null) {
            String scheme2 = validUri.getScheme();
            if (scheme2 == null || scheme2.length() <= 0) {
                String uri = validUri.toString();
                Intrinsics.checkNotNullExpressionValue(uri, "newUri.toString()");
                if (StringsKt.startsWith$default(uri, "/", false, 2, (Object) null)) {
                }
            }
            return validUri;
        }
        return parse;
    }

    public static final boolean isHttp(@Nullable Uri uri) {
        return uri != null && (Intrinsics.areEqual(uri.getScheme(), "http") || Intrinsics.areEqual(uri.getScheme(), "https"));
    }

    @NotNull
    public static final Uri removeQueryParameters(@NotNull Uri uri, @NotNull String... parameterNames) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(parameterNames, "parameterNames");
        return parameterNames.length == 0 ? uri : removeQueryParameters(uri, ArraysKt.toSet(parameterNames));
    }

    @NotNull
    public static final Uri removeQueryParameters(@NotNull Uri uri, @NotNull Collection<String> parameterNames) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(parameterNames, "parameterNames");
        if (parameterNames.isEmpty()) {
            return uri;
        }
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        Intrinsics.checkNotNullExpressionValue(clearQuery, "buildUpon()\n        .clearQuery()");
        Uri build = appendQueryParametersFrom(clearQuery, uri, parameterNames).build();
        Intrinsics.checkNotNullExpressionValue(build, "buildUpon()\n        .cle…       )\n        .build()");
        return build;
    }

    public static /* synthetic */ Uri.Builder appendQueryParametersFrom$default(Uri.Builder builder, Uri uri, Collection collection, int i, Object obj) {
        if ((i & 2) != 0) {
            collection = CollectionsKt.emptyList();
        }
        return appendQueryParametersFrom(builder, uri, collection);
    }

    @NotNull
    public static final Uri.Builder appendQueryParametersFrom(@NotNull Uri.Builder builder, @NotNull Uri fromUri, @NotNull Collection<String> ignoreQueryParameters) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(fromUri, "fromUri");
        Intrinsics.checkNotNullParameter(ignoreQueryParameters, "ignoreQueryParameters");
        for (String str : fromUri.getQueryParameterNames()) {
            if (!ignoreQueryParameters.contains(str)) {
                Iterator<String> it = fromUri.getQueryParameters(str).iterator();
                while (it.hasNext()) {
                    builder.appendQueryParameter(str, it.next());
                }
            }
        }
        return builder;
    }
}

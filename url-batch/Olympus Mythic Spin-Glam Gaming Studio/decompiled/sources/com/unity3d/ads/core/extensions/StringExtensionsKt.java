package com.unity3d.ads.core.extensions;

import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StringExtensions.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0001\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"getSHA256Hash", "", "guessMimeType", "VERSION_REGEX", "Lkotlin/text/Regex;", "compareVersion", "", "other", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StringExtensionsKt {

    @NotNull
    private static final Regex VERSION_REGEX = new Regex("[0-9.]+");

    @NotNull
    public static final String getSHA256Hash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String hex = ByteString.of(Arrays.copyOf(bytes, bytes.length)).sha256().hex();
        Intrinsics.checkNotNullExpressionValue(hex, "hex(...)");
        return hex;
    }

    @Nullable
    public static final String guessMimeType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return URLConnection.guessContentTypeFromName(str);
    }

    public static final int compareVersion(@NotNull String str, @NotNull String other) {
        Integer intOrNull;
        Integer intOrNull2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (str.length() == 0 || other.length() == 0) {
            return -1;
        }
        String removePrefix = StringsKt.removePrefix(StringsKt.removePrefix(str, "v"), "V");
        String removePrefix2 = StringsKt.removePrefix(StringsKt.removePrefix(other, "v"), "V");
        Regex regex = VERSION_REGEX;
        if (!regex.matches(removePrefix) || !regex.matches(removePrefix2) || StringsKt.contains$default((CharSequence) removePrefix, (CharSequence) "..", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) removePrefix2, (CharSequence) "..", false, 2, (Object) null)) {
            return -1;
        }
        List split$default = StringsKt.split$default((CharSequence) removePrefix, new String[]{"."}, false, 0, 6, (Object) null);
        List split$default2 = StringsKt.split$default((CharSequence) removePrefix2, new String[]{"."}, false, 0, 6, (Object) null);
        int max = Math.max(split$default.size(), split$default2.size());
        for (int i = 0; i < max; i++) {
            String str2 = (String) CollectionsKt.getOrNull(split$default, i);
            int intValue = (str2 == null || (intOrNull2 = StringsKt.toIntOrNull(str2)) == null) ? 0 : intOrNull2.intValue();
            String str3 = (String) CollectionsKt.getOrNull(split$default2, i);
            int intValue2 = (str3 == null || (intOrNull = StringsKt.toIntOrNull(str3)) == null) ? 0 : intOrNull.intValue();
            if (intValue != intValue2) {
                return Intrinsics.compare(intValue, intValue2);
            }
        }
        return 0;
    }
}

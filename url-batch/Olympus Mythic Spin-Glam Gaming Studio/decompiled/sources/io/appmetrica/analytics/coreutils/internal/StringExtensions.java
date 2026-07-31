package io.appmetrica.analytics.coreutils.internal;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0002J\u0012\u0010\u0003\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"Lio/appmetrica/analytics/coreutils/internal/StringExtensions;", "", "", "replaceFirstCharWithTitleCase", "Ljava/util/Locale;", CommonUrlParts.LOCALE, "core-utils_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class StringExtensions {

    @NotNull
    public static final StringExtensions INSTANCE = new StringExtensions();

    private StringExtensions() {
    }

    @NotNull
    public final String replaceFirstCharWithTitleCase(@NotNull String str) {
        return replaceFirstCharWithTitleCase(str, Locale.US);
    }

    @NotNull
    public final String replaceFirstCharWithTitleCase(@NotNull String str, @NotNull Locale locale) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        sb.append((Object) (Character.isLowerCase(charAt) ? CharsKt.titlecase(charAt, locale) : String.valueOf(charAt)));
        sb.append(str.substring(1));
        return sb.toString();
    }
}

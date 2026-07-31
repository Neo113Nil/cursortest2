package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class x {

    @NotNull
    public static final String a = "START_MUTED";

    @NotNull
    public static final String b = "CLOSE_DELAY_SECONDS";

    @NotNull
    public static final String c = "DEC_DELAY_SECONDS";

    @NotNull
    public static final String d = "SKIP_DELAY_SECONDS";

    @NotNull
    public static final String e = "SKIP_ENABLED";

    @NotNull
    public static final String f = "AUTO_STORE_ON_SKIP";

    @NotNull
    public static final String g = "AUTO_STORE_ON_COMPLETE";

    @NotNull
    public static final String h = "ANDROID_INLINE_ENABLED";

    @NotNull
    public static final String i = "ANDROID_INLINE_URL";

    @NotNull
    public static final String j = "BUNDLE_ID";

    @NotNull
    public static final String k = "ANDROID_AUTOINLINE_ENABLED";

    @NotNull
    public static final String l = "ANDROID_AUTOINLINE_EVENTLINK";

    @NotNull
    public static final String m = "ANDROID_AUTOINLINE_SKIP";

    @NotNull
    public static final String n = "ANDROID_AUTOINLINE_CLICKTHROUGH";

    @NotNull
    public static final String o = "ANDROID_AUTOINLINE_FORCE_FULLSCREEN";

    public static final void a(@NotNull Intent intent, int i2) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(b, i2);
    }

    public static final void b(@NotNull Intent intent, int i2) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(c, i2);
    }

    public static final void c(@NotNull Intent intent, int i2) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(d, i2);
    }

    public static final void d(@NotNull Intent intent, boolean z) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(h, z);
    }

    public static final void e(@NotNull Intent intent, boolean z) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(g, z);
    }

    public static final void f(@NotNull Intent intent, boolean z) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(f, z);
    }

    public static final void g(@NotNull Intent intent, boolean z) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(a, z);
    }

    public static final boolean h(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra(g, false);
    }

    public static final boolean i(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra(f, false);
    }

    @Nullable
    public static final String j(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getStringExtra(j);
    }

    public static final int k(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getIntExtra(b, 0);
    }

    public static final int l(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getIntExtra(c, 0);
    }

    @Nullable
    public static final Boolean m(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (intent.hasExtra(e)) {
            return Boolean.valueOf(intent.getBooleanExtra(e, false));
        }
        return null;
    }

    public static final int n(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getIntExtra(d, 0);
    }

    public static final boolean o(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra(a, true);
    }

    public static final void a(@NotNull Intent intent, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (bool != null) {
            intent.putExtra(e, bool.booleanValue());
        }
    }

    public static final boolean b(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra(k, false);
    }

    public static final void c(@NotNull Intent intent, @NotNull String value) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        intent.putExtra(i, value);
    }

    public static final void d(@NotNull Intent intent, @NotNull String value) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        intent.putExtra(j, value);
    }

    public static final boolean e(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra(m, false);
    }

    public static final boolean f(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra(h, false);
    }

    @Nullable
    public static final String g(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getStringExtra(i);
    }

    public static final void a(@NotNull Intent intent, boolean z) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(k, z);
    }

    public static final void b(@NotNull Intent intent, @NotNull String value) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        intent.putExtra(l, value);
    }

    @Nullable
    public static final String c(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getStringExtra(l);
    }

    public static final boolean d(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra(o, false);
    }

    @Nullable
    public static final String a(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getStringExtra(n);
    }

    public static final void b(@NotNull Intent intent, boolean z) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(o, z);
    }

    public static final void c(@NotNull Intent intent, boolean z) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(m, z);
    }

    public static final void a(@NotNull Intent intent, @NotNull String value) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        intent.putExtra(n, value);
    }
}

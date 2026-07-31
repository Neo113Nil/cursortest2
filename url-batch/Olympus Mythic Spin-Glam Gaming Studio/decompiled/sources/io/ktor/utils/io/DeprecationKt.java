package io.ktor.utils.io;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Source;
import kotlinx.io.Utf8Kt;

/* compiled from: Deprecation.kt */
/* loaded from: classes15.dex */
public abstract class DeprecationKt {
    public static final String readText(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return Utf8Kt.readString(source);
    }
}

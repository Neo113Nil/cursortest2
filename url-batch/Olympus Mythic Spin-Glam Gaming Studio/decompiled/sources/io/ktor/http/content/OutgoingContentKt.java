package io.ktor.http.content;

import io.ktor.http.content.OutgoingContent;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OutgoingContent.kt */
/* loaded from: classes6.dex */
public abstract class OutgoingContentKt {
    public static final boolean isEmpty(OutgoingContent outgoingContent) {
        Intrinsics.checkNotNullParameter(outgoingContent, "<this>");
        return outgoingContent instanceof OutgoingContent.NoContent;
    }
}

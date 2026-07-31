package io.ktor.http;

import kotlin.text.StringsKt;

/* compiled from: HttpHeaders.kt */
/* loaded from: classes15.dex */
public abstract class HttpHeadersKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isDelimiter(char c) {
        return StringsKt.contains$default((CharSequence) "\"(),/:;<=>?@[\\]{}", c, false, 2, (Object) null);
    }
}

package io.ktor.util;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Text.kt */
/* loaded from: classes3.dex */
public final class CaseInsensitiveString {
    private final String content;
    private final int hash;

    public CaseInsensitiveString(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
        int length = content.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i * 31) + Character.toLowerCase(content.charAt(i2));
        }
        this.hash = i;
    }

    public final String getContent() {
        return this.content;
    }

    public boolean equals(Object obj) {
        String str;
        CaseInsensitiveString caseInsensitiveString = obj instanceof CaseInsensitiveString ? (CaseInsensitiveString) obj : null;
        return (caseInsensitiveString == null || (str = caseInsensitiveString.content) == null || !StringsKt.equals(str, this.content, true)) ? false : true;
    }

    public int hashCode() {
        return this.hash;
    }

    public String toString() {
        return this.content;
    }
}

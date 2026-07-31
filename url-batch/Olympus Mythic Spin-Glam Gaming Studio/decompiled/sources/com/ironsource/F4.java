package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
public final class F4 implements Ue<String> {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    public F4(@NotNull String encryptedResponse, @NotNull String descriptionKey) {
        Intrinsics.checkNotNullParameter(encryptedResponse, "encryptedResponse");
        Intrinsics.checkNotNullParameter(descriptionKey, "descriptionKey");
        this.a = encryptedResponse;
        this.b = descriptionKey;
    }

    @Override // com.ironsource.Ue
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a() {
        String value = J9.b(this.b, this.a);
        if (value == null || value.length() == 0) {
            throw new IllegalArgumentException("Decryption failed");
        }
        Intrinsics.checkNotNullExpressionValue(value, "value");
        return value;
    }
}

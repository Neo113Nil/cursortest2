package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public final class Fa implements InterfaceC5408ia {
    public final C5278d9 a = new C5278d9();

    @NotNull
    public final C5770w9[] a(@Nullable byte[] bArr) {
        int i = 0;
        if (bArr == null) {
            return new C5770w9[0];
        }
        Map<String, byte[]> model = this.a.toModel(bArr);
        C5770w9[] c5770w9Arr = new C5770w9[model.size()];
        for (Object obj : model.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Map.Entry entry = (Map.Entry) obj;
            C5770w9 c5770w9 = new C5770w9();
            c5770w9.a = ((String) entry.getKey()).getBytes(Charsets.UTF_8);
            c5770w9.b = (byte[]) entry.getValue();
            c5770w9Arr[i] = c5770w9;
            i = i2;
        }
        return c5770w9Arr;
    }
}

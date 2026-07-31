package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.df, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5284df implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5429j6[] fromModel(@NotNull Map<String, String> map) {
        int size = map.size();
        C5429j6[] c5429j6Arr = new C5429j6[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            c5429j6Arr[i2] = new C5429j6();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            C5429j6 c5429j6 = c5429j6Arr[i];
            String key = entry.getKey();
            Charset charset = Charsets.UTF_8;
            c5429j6.a = key.getBytes(charset);
            c5429j6Arr[i].b = entry.getValue().getBytes(charset);
            i++;
        }
        return c5429j6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @NotNull
    public final Map<String, String> a(@NotNull C5429j6[] c5429j6Arr) {
        throw new UnsupportedOperationException();
    }
}

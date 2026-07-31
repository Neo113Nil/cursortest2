package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* loaded from: classes8.dex */
public final class Ne implements Converter {
    public final Va a;

    public Ne() {
        this(new Va(20480, 100, 1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi fromModel(@NonNull Map<String, String> map) {
        C5318eo a = this.a.a(map);
        E8 e8 = new E8();
        e8.b = ((E4) a.b).b;
        Map map2 = (Map) a.a;
        if (map2 != null) {
            e8.a = new D8[map2.size()];
            int i = 0;
            for (Map.Entry entry : map2.entrySet()) {
                e8.a[i] = new D8();
                e8.a[i].a = StringUtils.getUTF8Bytes((String) entry.getKey());
                e8.a[i].b = StringUtils.getUTF8Bytes((String) entry.getValue());
                i++;
            }
        }
        InterfaceC5634r3 interfaceC5634r3 = a.b;
        int i2 = ((E4) interfaceC5634r3).a;
        return new Qi(e8, interfaceC5634r3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @VisibleForTesting
    public Ne(@NonNull Va va) {
        this.a = va;
    }

    @NonNull
    public final Map<String, String> a(@NonNull Qi qi) {
        throw new UnsupportedOperationException();
    }
}

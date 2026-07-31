package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.dg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5285dg implements Converter {
    public final Ra a;

    public C5285dg() {
        this(new Ra(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi fromModel(@NonNull List<String> list) {
        C5318eo a = this.a.a((List<Object>) list);
        List list2 = (List) a.a;
        H8[] h8Arr = new H8[0];
        if (list2 != null) {
            h8Arr = new H8[list2.size()];
            for (int i = 0; i < list2.size(); i++) {
                H8 h8 = new H8();
                h8Arr[i] = h8;
                h8.a = StringUtils.getUTF8Bytes((String) list2.get(i));
            }
        }
        a.b.getBytesTruncated();
        return new Qi(h8Arr, a.b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @VisibleForTesting
    public C5285dg(@NonNull Ra ra) {
        this.a = ra;
    }

    @NonNull
    public final List<String> a(@NonNull Qi qi) {
        throw new UnsupportedOperationException();
    }
}

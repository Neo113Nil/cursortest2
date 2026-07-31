package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.d9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5278d9 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(@NotNull Map<String, byte[]> map) {
        C5329f9 c5329f9 = new C5329f9();
        C5303e9[] c5303e9Arr = new C5303e9[map.size()];
        int i = 0;
        for (Object obj : map.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Map.Entry entry = (Map.Entry) obj;
            C5303e9 c5303e9 = new C5303e9();
            c5303e9.a = (String) entry.getKey();
            c5303e9.b = (byte[]) entry.getValue();
            c5303e9Arr[i] = c5303e9;
            i = i2;
        }
        c5329f9.a = c5303e9Arr;
        return MessageNano.toByteArray(c5329f9);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(@NotNull byte[] bArr) {
        C5303e9[] c5303e9Arr = ((C5329f9) MessageNano.mergeFrom(new C5329f9(), bArr)).a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(c5303e9Arr.length), 16));
        for (C5303e9 c5303e9 : c5303e9Arr) {
            Pair pair = TuplesKt.to(c5303e9.a, c5303e9.b);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}

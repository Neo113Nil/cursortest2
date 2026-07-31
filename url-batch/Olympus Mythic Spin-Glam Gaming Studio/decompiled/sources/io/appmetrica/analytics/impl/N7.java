package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.Pair;
import kotlin.TuplesKt;

/* loaded from: classes10.dex */
public final class N7 implements ProtobufConverter {
    @NonNull
    public final BigDecimal a(@NonNull C5847z8 c5847z8) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5847z8 fromModel(@NonNull BigDecimal bigDecimal) {
        BigInteger bigInteger = P7.a;
        int i = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(P7.a) <= 0 && unscaledValue.compareTo(P7.b) >= 0) {
                Pair pair = TuplesKt.to(Long.valueOf(unscaledValue.longValue()), Integer.valueOf(i));
                O7 o7 = new O7(((Number) pair.getFirst()).longValue(), ((Number) pair.getSecond()).intValue());
                C5847z8 c5847z8 = new C5847z8();
                c5847z8.a = o7.a;
                c5847z8.b = o7.b;
                return c5847z8;
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            i++;
        }
    }
}

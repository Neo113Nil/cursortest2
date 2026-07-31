package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes11.dex */
public final class Jf implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(@NonNull EnumC5483l8 enumC5483l8) {
        int ordinal = enumC5483l8.ordinal();
        if (ordinal == 1) {
            return 1;
        }
        if (ordinal != 2) {
            return ordinal != 3 ? 0 : 2;
        }
        return 3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final EnumC5483l8 toModel(@NonNull Integer num) {
        int intValue = num.intValue();
        if (intValue == 1) {
            return EnumC5483l8.d;
        }
        if (intValue == 2) {
            return EnumC5483l8.f;
        }
        if (intValue != 3) {
            return EnumC5483l8.c;
        }
        return EnumC5483l8.e;
    }
}

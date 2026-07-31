package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes10.dex */
public final class I2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5400i2 fromModel(@NonNull K2 k2) {
        C5400i2 c5400i2 = new C5400i2();
        J2 j2 = k2.a;
        if (j2 != null) {
            int ordinal = j2.ordinal();
            if (ordinal == 0) {
                c5400i2.a = 6;
            } else if (ordinal == 1) {
                c5400i2.a = 1;
            } else if (ordinal == 2) {
                c5400i2.a = 2;
            } else if (ordinal == 3) {
                c5400i2.a = 3;
            } else if (ordinal == 4) {
                c5400i2.a = 4;
            } else if (ordinal != 5) {
                c5400i2.a = 0;
            } else {
                c5400i2.a = 5;
            }
        }
        Boolean bool = k2.b;
        if (bool != null) {
            if (bool.booleanValue()) {
                c5400i2.b = 1;
            } else {
                c5400i2.b = 0;
            }
        }
        return c5400i2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final K2 toModel(@NonNull C5400i2 c5400i2) {
        J2 j2;
        Boolean bool = null;
        switch (c5400i2.a) {
            case 1:
                j2 = J2.ACTIVE;
                break;
            case 2:
                j2 = J2.WORKING_SET;
                break;
            case 3:
                j2 = J2.FREQUENT;
                break;
            case 4:
                j2 = J2.RARE;
                break;
            case 5:
                j2 = J2.RESTRICTED;
                break;
            case 6:
                j2 = J2.EXEMPTED;
                break;
            default:
                j2 = null;
                break;
        }
        int i = c5400i2.b;
        if (i == 0) {
            bool = Boolean.FALSE;
        } else if (i == 1) {
            bool = Boolean.TRUE;
        }
        return new K2(j2, bool);
    }
}

package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.c9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC5252c9 {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);

    public final int a;

    EnumC5252c9(int i) {
        this.a = i;
    }

    public static EnumC5252c9 a(Integer num) {
        if (num != null) {
            for (EnumC5252c9 enumC5252c9 : values()) {
                if (enumC5252c9.a == num.intValue()) {
                    return enumC5252c9;
                }
            }
        }
        return NONE;
    }
}

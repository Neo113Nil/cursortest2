package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.InterfaceC5785wo;

/* loaded from: classes5.dex */
public class UserProfileUpdate<T extends InterfaceC5785wo> {
    private final InterfaceC5785wo a;

    UserProfileUpdate(InterfaceC5785wo interfaceC5785wo) {
        this.a = interfaceC5785wo;
    }

    @NonNull
    public T getUserProfileUpdatePatcher() {
        return (T) this.a;
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider;
import io.appmetrica.analytics.coreapi.internal.crypto.Encrypter;
import io.appmetrica.analytics.coreutils.internal.encryption.AESRSAEncrypter;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class H6 implements CryptoProvider {
    public final AESRSAEncrypter a = new AESRSAEncrypter();

    @Override // io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider
    @NotNull
    public final Encrypter getAesRsaEncrypter() {
        return this.a;
    }
}

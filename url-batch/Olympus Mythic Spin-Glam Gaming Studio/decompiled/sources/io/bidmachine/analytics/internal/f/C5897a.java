package io.bidmachine.analytics.internal.f;

import java.security.KeyPairGenerator;
import java.security.spec.ECGenParameterSpec;

/* renamed from: io.bidmachine.analytics.internal.f.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5897a implements InterfaceC5898b {
    private final KeyPairGenerator a;

    public C5897a() {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
        keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));
        this.a = keyPairGenerator;
    }

    @Override // io.bidmachine.analytics.internal.f.InterfaceC5898b
    public KeyPairGenerator b() {
        return this.a;
    }
}

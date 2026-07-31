package io.bidmachine.analytics.internal.f;

import java.security.KeyPair;
import java.security.KeyPairGenerator;

/* renamed from: io.bidmachine.analytics.internal.f.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5898b {
    default KeyPair a() {
        return b().generateKeyPair();
    }

    KeyPairGenerator b();
}

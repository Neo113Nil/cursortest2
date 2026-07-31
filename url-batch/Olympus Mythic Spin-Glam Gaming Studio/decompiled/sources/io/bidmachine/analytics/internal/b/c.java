package io.bidmachine.analytics.internal.b;

import java.security.SecureRandom;

/* loaded from: classes3.dex */
public final class c {
    public static final c a = new c();
    private static final ThreadLocal b = new a();

    public static final class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public SecureRandom initialValue() {
            return c.a.a();
        }
    }

    private c() {
    }

    private final SecureRandom b() {
        SecureRandom secureRandom = (SecureRandom) b.get();
        return secureRandom == null ? a() : secureRandom;
    }

    public final byte[] a(int i) {
        byte[] bArr = new byte[i];
        a.b().nextBytes(bArr);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SecureRandom a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}

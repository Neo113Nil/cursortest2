package io.bidmachine.analytics.internal.c;

import io.bidmachine.analytics.internal.b.c;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.bidmachine.analytics.internal.c.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5894a implements b {
    public static final C1733a b = new C1733a(null);
    private final String a = "AES";

    /* renamed from: io.bidmachine.analytics.internal.c.a$a, reason: collision with other inner class name */
    public static final class C1733a {
        public /* synthetic */ C1733a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1733a() {
        }
    }

    @Override // io.bidmachine.analytics.internal.c.b
    public byte[] a(Key key, byte[] bArr) {
        byte[] a = c.a.a(12);
        byte[] doFinal = a(1, key, a).doFinal(bArr);
        byte[] bArr2 = new byte[doFinal.length + 12];
        ArraysKt.copyInto(a, bArr2, 0, 0, 12);
        ArraysKt.copyInto(doFinal, bArr2, 12, 0, doFinal.length);
        return bArr2;
    }

    @Override // io.bidmachine.analytics.internal.c.b
    public String getName() {
        return this.a;
    }

    private final Cipher a(int i, Key key, byte[] bArr) {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(i, key, gCMParameterSpec);
        return cipher;
    }
}

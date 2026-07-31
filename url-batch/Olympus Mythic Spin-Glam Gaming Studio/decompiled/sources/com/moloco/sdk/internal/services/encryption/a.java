package com.moloco.sdk.internal.services.encryption;

import androidx.annotation.VisibleForTesting;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
public interface a {

    @NotNull
    public static final C1556a a = C1556a.a;

    /* renamed from: com.moloco.sdk.internal.services.encryption.a$a, reason: collision with other inner class name */
    public static final class C1556a {
        public static final /* synthetic */ C1556a a = new C1556a();

        @NotNull
        public final a a() {
            return new com.moloco.sdk.internal.services.encryption.b();
        }
    }

    public static final class b {
        @VisibleForTesting
        public static /* synthetic */ void a() {
        }

        @VisibleForTesting
        public static /* synthetic */ void b() {
        }
    }

    @NotNull
    String a(@NotNull byte[] bArr, @NotNull byte[] bArr2);

    @NotNull
    IvParameterSpec a();

    @NotNull
    byte[] a(@NotNull String str);

    @NotNull
    byte[] a(@NotNull byte[] bArr);

    @NotNull
    byte[] a(@NotNull byte[] bArr, @NotNull String str);

    @NotNull
    String b(@NotNull byte[] bArr);

    @NotNull
    SecretKeySpec b();

    @NotNull
    byte[] b(@NotNull byte[] bArr, @NotNull String str);
}

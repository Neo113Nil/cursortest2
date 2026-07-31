package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* renamed from: io.appmetrica.analytics.impl.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5216b implements InterfaceC5200a9 {
    public final AESEncrypter a;

    public C5216b() {
        this(new C5190a(Ka.k().g()));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5200a9
    @NonNull
    public final S8 a(@NonNull C5326f6 c5326f6) {
        byte[] encrypt;
        String encodeToString;
        String value = c5326f6.getValue();
        if (!TextUtils.isEmpty(value)) {
            try {
                encrypt = this.a.encrypt(value.getBytes("UTF-8"));
            } catch (Throwable unused) {
            }
            if (encrypt != null) {
                encodeToString = Base64.encodeToString(encrypt, 0);
                c5326f6.setValue(encodeToString);
                return new S8(c5326f6, EnumC5252c9.AES_VALUE_ENCRYPTION);
            }
        }
        encodeToString = null;
        c5326f6.setValue(encodeToString);
        return new S8(c5326f6, EnumC5252c9.AES_VALUE_ENCRYPTION);
    }

    public C5216b(C5190a c5190a) {
        this(new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c5190a.b(), c5190a.a()));
    }

    public C5216b(AESEncrypter aESEncrypter) {
        this.a = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5200a9
    @NonNull
    public final byte[] a(@Nullable byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr == null || bArr.length <= 0) {
            return bArr2;
        }
        try {
            return this.a.decrypt(Base64.decode(bArr, 0));
        } catch (Throwable unused) {
            return bArr2;
        }
    }

    @NonNull
    public final EnumC5252c9 a() {
        return EnumC5252c9.AES_VALUE_ENCRYPTION;
    }
}

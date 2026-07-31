package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* renamed from: io.appmetrica.analytics.impl.bn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5240bn extends AbstractC5420in {
    @Override // io.appmetrica.analytics.impl.AbstractC5420in
    public final IBinaryDataHelper a(Context context) {
        return Ka.I.B().b(context);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5420in
    public final IBinaryDataHelper b(Context context) {
        IBinaryDataHelper a;
        Pk B = Ka.I.B();
        synchronized (B) {
            a = B.a(context);
        }
        return a;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5420in
    public final ProtobufStateStorage a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArr;
        byte[] bArr2;
        C5477l2 c5477l2 = new C5477l2();
        try {
            bArr = AbstractC5409ib.a(context.getPackageName());
        } catch (Throwable unused) {
            bArr = new byte[16];
        }
        try {
            bArr2 = AbstractC5409ib.a(new StringBuilder(context.getPackageName()).reverse().toString());
        } catch (Throwable unused2) {
            bArr2 = new byte[16];
        }
        return new C5388hg("app_permissions_state", iBinaryDataHelper, new T8(c5477l2, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArr, bArr2)), new C5374h2(new I2()));
    }
}

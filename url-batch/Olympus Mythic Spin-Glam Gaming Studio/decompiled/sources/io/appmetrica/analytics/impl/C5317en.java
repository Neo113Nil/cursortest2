package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* renamed from: io.appmetrica.analytics.impl.en, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5317en extends AbstractC5420in {
    public final /* synthetic */ String a;
    public final /* synthetic */ ProtobufStateSerializer b;
    public final /* synthetic */ ProtobufConverter c;

    public C5317en(String str, ProtobufStateSerializer protobufStateSerializer, ProtobufConverter protobufConverter) {
        this.a = str;
        this.b = protobufStateSerializer;
        this.c = protobufConverter;
    }

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
        String str = this.a;
        ProtobufStateSerializer protobufStateSerializer = this.b;
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
        return new C5388hg(str, iBinaryDataHelper, new T8(protobufStateSerializer, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArr, bArr2)), this.c);
    }
}

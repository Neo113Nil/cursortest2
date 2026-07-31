package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.t7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5690t7 implements Converter {
    public final C5664s7 a;

    /* JADX WARN: Multi-variable type inference failed */
    public C5690t7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final byte[] a(@NotNull C5716u7 c5716u7) {
        return MessageNano.toByteArray(this.a.fromModel(c5716u7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.a.fromModel((C5716u7) obj));
    }

    public C5690t7(@NotNull C5664s7 c5664s7) {
        this.a = c5664s7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r2 == null) goto L5;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C5716u7 toModel(@Nullable byte[] bArr) {
        D7 d7;
        if (bArr != null) {
            try {
                d7 = (D7) MessageNano.mergeFrom(new D7(), bArr);
            } catch (InvalidProtocolBufferNanoException unused) {
                d7 = new D7();
            }
        }
        d7 = new D7();
        return this.a.toModel(d7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C5690t7(C5664s7 c5664s7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c5664s7);
        if ((i & 1) != 0) {
            c5664s7 = new C5664s7(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }
}

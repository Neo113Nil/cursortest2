package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public final class H7 implements Converter {
    public final G7 a;

    /* JADX WARN: Multi-variable type inference failed */
    public H7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final byte[] a(@NotNull I7 i7) {
        return MessageNano.toByteArray(this.a.fromModel(i7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.a.fromModel((I7) obj));
    }

    public H7(@NotNull G7 g7) {
        this.a = g7;
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
    public final I7 toModel(@Nullable byte[] bArr) {
        F7 f7;
        if (bArr != null) {
            try {
                f7 = (F7) MessageNano.mergeFrom(new F7(), bArr);
            } catch (InvalidProtocolBufferNanoException unused) {
                f7 = new F7();
            }
        }
        f7 = new F7();
        return this.a.toModel(f7);
    }

    public /* synthetic */ H7(G7 g7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new G7(null, 1, null) : g7);
    }
}

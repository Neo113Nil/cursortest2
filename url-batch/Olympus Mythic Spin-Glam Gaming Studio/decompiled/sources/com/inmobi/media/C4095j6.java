package com.inmobi.media;

import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* renamed from: com.inmobi.media.j6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4095j6 implements InterfaceC3892bf {
    public final EnumC4069i6 a;
    public final ByteString b;

    public C4095j6(String url, EnumC4069i6 errorCode) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.a = errorCode;
        this.b = ByteString.EMPTY;
    }

    @Override // com.inmobi.media.InterfaceC3892bf
    public final Object a() {
        return null;
    }

    @Override // com.inmobi.media.InterfaceC3892bf
    public final We b() {
        return new We(0L, MapsKt.emptyMap(), 0, "");
    }

    @Override // com.inmobi.media.InterfaceC3892bf
    public final int c() {
        return this.a.a;
    }

    @Override // com.inmobi.media.InterfaceC3892bf
    public final ByteString d() {
        return this.b;
    }

    @Override // com.inmobi.media.InterfaceC3892bf
    public final String e() {
        return this.a.name();
    }
}

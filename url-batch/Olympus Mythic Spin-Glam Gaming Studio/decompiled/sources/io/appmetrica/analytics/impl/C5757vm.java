package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.vm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5757vm {
    public final ProtobufStateStorage a;
    public final Oo b;

    public C5757vm(ProtobufStateStorage protobufStateStorage, Oo oo) {
        this.a = protobufStateStorage;
        this.b = oo;
    }

    public C5757vm(Context context) {
        this(((AbstractC5420in) C5369gn.a(Am.class)).create(context), Ka.k().D().a());
    }
}

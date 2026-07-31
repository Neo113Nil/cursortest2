package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes6.dex */
public final class Ca implements ProtobufConverter {
    public final He a;

    public Ca() {
        this(new C5445jm());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Im fromModel(@NonNull C4 c4) {
        Im im = new Im();
        im.b = c4.b;
        im.a = c4.a;
        im.c = c4.c;
        im.d = c4.d;
        im.e = c4.e;
        im.f = this.a.a(c4.f);
        return im;
    }

    public Ca(C5445jm c5445jm) {
        this.a = c5445jm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4 toModel(@NonNull Im im) {
        A4 a4 = new A4();
        a4.d = im.d;
        a4.c = im.c;
        a4.b = im.b;
        a4.a = im.a;
        a4.e = im.e;
        a4.f = this.a.a(im.f);
        return new C4(a4);
    }
}

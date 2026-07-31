package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.b9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5226b9 {
    public final Yc a;
    public final Yc b;

    public C5226b9() {
        this(new C5561o8(), new C5356ga(), new C5216b());
    }

    public C5226b9(C5561o8 c5561o8, C5356ga c5356ga, C5216b c5216b) {
        Yc yc = new Yc(c5561o8);
        this.a = yc;
        yc.a(EnumC5252c9.NONE, c5561o8);
        yc.a(EnumC5252c9.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, c5356ga);
        yc.a(EnumC5252c9.AES_VALUE_ENCRYPTION, c5216b);
        this.b = new Yc(c5561o8);
    }
}

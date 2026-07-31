package com.facebook.ads.redexgen.core;

import android.database.Cursor;

/* renamed from: com.facebook.ads.redexgen.X.o4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3641o4 implements InterfaceC2184Bo {
    public final Cursor A00;

    public final /* synthetic */ boolean A01() {
        return AbstractC2183Bn.A00(this);
    }

    public C3641o4(Cursor cursor) {
        this.A00 = cursor;
    }

    public final C2180Bk A00() {
        C2180Bk A01;
        A01 = C9w.A01(this.A00);
        return A01;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A00.close();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2184Bo
    public final int getPosition() {
        return this.A00.getPosition();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2184Bo
    public final boolean moveToPosition(int i) {
        return this.A00.moveToPosition(i);
    }
}

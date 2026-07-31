package com.inmobi.media;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: com.inmobi.media.ek, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3977ek extends ByteArrayOutputStream {
    public final /* synthetic */ C4004fk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3977ek(C4004fk c4004fk, int i) {
        super(i);
        this.a = c4004fk;
    }

    @Override // java.io.ByteArrayOutputStream
    public final synchronized String toString() {
        int i;
        i = ((ByteArrayOutputStream) this).count;
        if (i > 0) {
            int i2 = i - 1;
            if (((ByteArrayOutputStream) this).buf[i2] == 13) {
                i = i2;
            }
        }
        try {
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
        return new String(((ByteArrayOutputStream) this).buf, 0, i, this.a.b.name());
    }
}

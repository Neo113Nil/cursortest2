package o;

import java.io.IOException;

/* renamed from: o.Xb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0601Xb extends IOException {
    public C0601Xb(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}

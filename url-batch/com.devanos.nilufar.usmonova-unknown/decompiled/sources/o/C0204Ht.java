package o;

import java.io.IOException;

/* renamed from: o.Ht, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0204Ht extends IOException {
    public E h;

    public C0204Ht(String str) {
        super(str);
        this.h = null;
    }

    public static C0204Ht a() {
        return new C0204Ht("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}

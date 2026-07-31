package io.ktor.utils.io;

/* compiled from: CloseToken.kt */
/* loaded from: classes3.dex */
public abstract class CloseTokenKt {
    private static final CloseToken CLOSED = new CloseToken(null);

    public static final CloseToken getCLOSED() {
        return CLOSED;
    }
}

package yads;

import java.io.IOException;

/* loaded from: classes15.dex */
public final class fg1 extends IOException {
    public fg1(Throwable th) {
        super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
    }
}

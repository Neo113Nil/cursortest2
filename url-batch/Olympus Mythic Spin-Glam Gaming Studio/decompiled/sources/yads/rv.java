package yads;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class rv extends IOException {
    public rv(int i) {
        super("Illegal clipping: ".concat(i != 0 ? i != 1 ? i != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count"));
    }
}

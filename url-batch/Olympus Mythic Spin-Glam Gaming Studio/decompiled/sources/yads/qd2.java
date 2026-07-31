package yads;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class qd2 implements q30 {
    public static final qd2 a = new qd2();

    static {
        new p30() { // from class: yads.qd2$$ExternalSyntheticLambda0
            @Override // yads.p30
            public final q30 a() {
                return new qd2();
            }
        };
    }

    @Override // yads.q30
    public final void a(h93 h93Var) {
    }

    @Override // yads.n30
    public final int c(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // yads.q30
    public final void close() {
    }

    @Override // yads.q30
    public final Uri d() {
        return null;
    }

    @Override // yads.q30
    public final long a(v30 v30Var) {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }
}

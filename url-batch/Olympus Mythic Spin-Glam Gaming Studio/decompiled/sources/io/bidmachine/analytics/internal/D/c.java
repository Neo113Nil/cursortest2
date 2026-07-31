package io.bidmachine.analytics.internal.D;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.BytesValue;
import io.bidmachine.analytics.internal.C.a;
import io.bidmachine.analytics.internal.I.g;
import io.bidmachine.analytics.internal.g.C5903e;
import java.io.File;
import java.io.FileInputStream;
import kotlin.io.CloseableKt;

/* loaded from: classes6.dex */
public final class c implements a.InterfaceC1722a {
    private final File a;

    public c(File file) {
        this.a = file;
    }

    @Override // io.bidmachine.analytics.internal.C.a.InterfaceC1722a
    public BytesValue a(C5903e.a aVar) {
        if (!(aVar instanceof C5903e.a.C1734a)) {
            throw new IllegalStateException("Check failed.");
        }
        BytesValue.Builder newBuilder = BytesValue.newBuilder();
        FileInputStream fileInputStream = new FileInputStream(new File(this.a, g.b(((C5903e.a.C1734a) aVar).a())));
        try {
            ByteString readFrom = ByteString.readFrom(fileInputStream);
            CloseableKt.closeFinally(fileInputStream, null);
            return newBuilder.setValue(readFrom).build();
        } finally {
        }
    }
}

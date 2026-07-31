package io.bidmachine.analytics.internal.D;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.BytesValue;
import io.bidmachine.analytics.internal.C.a;
import io.bidmachine.analytics.internal.g.C5903e;
import io.bidmachine.analytics.internal.u.g;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import kotlin.text.Charsets;

/* loaded from: classes6.dex */
public final class e implements a.InterfaceC1722a {
    private final g a;

    public e(g gVar) {
        this.a = gVar;
    }

    @Override // io.bidmachine.analytics.internal.C.a.InterfaceC1722a
    public BytesValue a(C5903e.a aVar) {
        io.bidmachine.analytics.internal.u.a a = this.a.a();
        if (a == null) {
            throw new FileNotFoundException("No data received yet");
        }
        if (a.f()) {
            throw new FileNotFoundException("Empty data");
        }
        return BytesValue.newBuilder().setValue(ByteString.readFrom(new ByteArrayInputStream(a.toString().getBytes(Charsets.UTF_8)))).build();
    }
}

package io.bidmachine.analytics.internal.D;

import com.explorestack.protobuf.BytesValue;
import io.bidmachine.analytics.internal.C.a;
import io.bidmachine.analytics.internal.g.C5903e;
import io.bidmachine.analytics.internal.t.a;
import io.bidmachine.protobuf.sdk.OSLog;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.text.Charsets;

/* loaded from: classes6.dex */
public final class d implements a.InterfaceC1722a {
    private final io.bidmachine.analytics.internal.t.e a;
    private final io.bidmachine.analytics.internal.t.a b = new io.bidmachine.analytics.internal.t.a();

    public d(io.bidmachine.analytics.internal.t.e eVar) {
        this.a = eVar;
    }

    @Override // io.bidmachine.analytics.internal.C.a.InterfaceC1722a
    public BytesValue a(C5903e.a aVar) {
        if (!(aVar instanceof C5903e.a.C1734a)) {
            throw new IllegalStateException("Check failed.");
        }
        ArrayList arrayList = new ArrayList();
        InputStream a = this.a.a(((C5903e.a.C1734a) aVar).a());
        if (a != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(a, Charsets.UTF_8), 8192);
            try {
                Iterator it = TextStreamsKt.lineSequence(bufferedReader).iterator();
                while (it.hasNext()) {
                    a.b a2 = this.b.a((String) it.next());
                    if (a2 != null) {
                        arrayList.add(OSLog.Record.newBuilder().setTimestamp(io.bidmachine.analytics.internal.I.d.a(a2.d())).setTag(a2.c()).setLevel(a2.a()).setMessage(a2.b()).setSource("").build());
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(bufferedReader, null);
            } finally {
            }
        }
        if (arrayList.isEmpty()) {
            throw new FileNotFoundException("No records found");
        }
        return BytesValue.newBuilder().setValue(OSLog.newBuilder().addAllRecords(arrayList).build().toByteString()).build();
    }
}

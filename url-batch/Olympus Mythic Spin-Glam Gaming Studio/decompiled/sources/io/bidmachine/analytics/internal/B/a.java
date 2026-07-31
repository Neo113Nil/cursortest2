package io.bidmachine.analytics.internal.B;

import com.explorestack.protobuf.Struct;
import io.bidmachine.analytics.internal.A.b;
import io.bidmachine.analytics.internal.A.c;
import io.bidmachine.analytics.internal.I.d;
import io.bidmachine.analytics.internal.I.f;
import io.bidmachine.analytics.internal.g.C5902d;
import io.bidmachine.analytics.internal.g.h;
import io.bidmachine.protobuf.sdk.Error;
import io.bidmachine.protobuf.sdk.Event;
import io.bidmachine.protobuf.sdk.Monitor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class a extends io.bidmachine.analytics.internal.A.a {
    private final String f;
    private final Struct g;
    private final List h;

    public /* synthetic */ a(String str, String str2, Struct struct, List list, f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, struct, list, (i & 16) != 0 ? f.g.a() : fVar);
    }

    @Override // io.bidmachine.analytics.internal.A.a
    public byte[] b() {
        try {
            Result.Companion companion = Result.INSTANCE;
            Monitor.Builder name = Monitor.newBuilder().setName(this.f);
            List<C5902d> list = this.h;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (C5902d c5902d : list) {
                Monitor.Record.Builder timestamp = Monitor.Record.newBuilder().setFields(d.a(c5902d.a())).setTimestamp(d.a(c5902d.f()));
                h b = c5902d.b();
                if (b != null) {
                    timestamp.setError(Error.newBuilder().setName(b.a()).setError(Error.Data.newBuilder().setCode(b.a(b.c()).getNumber()).setDescription(b.b()).build()).build());
                }
                arrayList.add(timestamp.build());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                name.addRecords((Monitor.Record) it.next());
            }
            return Event.newBuilder().setMonitor(name.build()).setExtrasPrivate(this.g).build().toByteArray();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th));
            return null;
        }
    }

    @Override // io.bidmachine.analytics.internal.A.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a a() {
        return this;
    }

    public a(String str, String str2, Struct struct, List list, f fVar) {
        super(c.Post, str, fVar, null, 8, null);
        this.f = str2;
        this.g = struct;
        this.h = list;
    }
}

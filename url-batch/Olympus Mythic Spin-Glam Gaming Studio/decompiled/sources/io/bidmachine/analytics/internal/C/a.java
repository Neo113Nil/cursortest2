package io.bidmachine.analytics.internal.C;

import com.explorestack.protobuf.BytesValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Timestamp;
import io.bidmachine.analytics.internal.A.b;
import io.bidmachine.analytics.internal.A.c;
import io.bidmachine.analytics.internal.I.d;
import io.bidmachine.analytics.internal.I.f;
import io.bidmachine.analytics.internal.I.g;
import io.bidmachine.analytics.internal.g.C5900b;
import io.bidmachine.analytics.internal.g.C5903e;
import io.bidmachine.analytics.internal.g.h;
import io.bidmachine.protobuf.sdk.Error;
import io.bidmachine.protobuf.sdk.Event;
import io.bidmachine.protobuf.sdk.Reader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class a extends io.bidmachine.analytics.internal.A.a {
    private final String f;
    private final Struct g;
    private final List h;
    private final InterfaceC1722a i;

    /* renamed from: io.bidmachine.analytics.internal.C.a$a, reason: collision with other inner class name */
    public interface InterfaceC1722a {
        BytesValue a(C5903e.a aVar);
    }

    public /* synthetic */ a(String str, String str2, Struct struct, List list, InterfaceC1722a interfaceC1722a, f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, struct, list, interfaceC1722a, (i & 32) != 0 ? f.g.a() : fVar);
    }

    @Override // io.bidmachine.analytics.internal.A.a
    public byte[] b() {
        Object next;
        Timestamp a;
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Reader.Builder name = Reader.newBuilder().setName(this.f);
            List<C5903e> list = this.h;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (C5903e c5903e : list) {
                Reader.Record.Builder rule = Reader.Record.newBuilder().setRule(a(c5903e.e()));
                h b = c5903e.b();
                if (b == null) {
                    try {
                        Result.Companion companion2 = Result.INSTANCE;
                        m8023constructorimpl = Result.m8023constructorimpl(rule.setRawData(this.i.a(c5903e.e())));
                    } catch (Throwable th) {
                        Result.Companion companion3 = Result.INSTANCE;
                        m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
                    if (m8026exceptionOrNullimpl != null) {
                        b = new h(this.f, m8026exceptionOrNullimpl instanceof C5900b ? true : m8026exceptionOrNullimpl instanceof FileNotFoundException ? h.a.READER_NO_CONTENT : m8026exceptionOrNullimpl instanceof SecurityException ? h.a.READER_NO_ACCESS : h.a.READER_INVALID, g.a(m8026exceptionOrNullimpl));
                    }
                }
                if (b != null) {
                    rule.setError(Error.newBuilder().setName(b.a()).setError(Error.Data.newBuilder().setCode(b.a(b.c()).getNumber()).setDescription(b.b()).build()).build());
                }
                arrayList.add(rule.build());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                name.addRecords((Reader.Record) it.next());
            }
            Iterator it2 = this.h.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    long f = ((C5903e) next).f();
                    do {
                        Object next2 = it2.next();
                        long f2 = ((C5903e) next2).f();
                        if (f < f2) {
                            next = next2;
                            f = f2;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            C5903e c5903e2 = (C5903e) next;
            if (c5903e2 != null && (a = d.a(c5903e2.f())) != null) {
                name.setTimestamp(a);
            }
            return Event.newBuilder().setReader(name.build()).setExtrasPrivate(this.g).build().toByteArray();
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th2));
            return null;
        }
    }

    @Override // io.bidmachine.analytics.internal.A.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a a() {
        return this;
    }

    private final Reader.Rule.Builder a(C5903e.a aVar) {
        Reader.Rule.Builder newBuilder = Reader.Rule.newBuilder();
        if (aVar instanceof C5903e.a.C1734a) {
            C5903e.a.C1734a c1734a = (C5903e.a.C1734a) aVar;
            newBuilder.setGeneralRule(Reader.Rule.GeneralRule.newBuilder().setTag(d.c(c1734a.b())).setPath(d.c(c1734a.a())).build());
        } else if (aVar instanceof C5903e.a.b) {
            C5903e.a.b bVar = (C5903e.a.b) aVar;
            Reader.Rule.PurRule.Builder shouldReport = Reader.Rule.PurRule.newBuilder().setTag(d.c(bVar.d())).setPath(d.c(bVar.a())).setShouldReport(d.a(bVar.c()));
            String b = bVar.b();
            if (b != null) {
                shouldReport.setQuery(d.c(b));
            }
            newBuilder.setPurRule(shouldReport.build());
        }
        return newBuilder;
    }

    public a(String str, String str2, Struct struct, List list, InterfaceC1722a interfaceC1722a, f fVar) {
        super(c.Post, str, fVar, null, 8, null);
        this.f = str2;
        this.g = struct;
        this.h = list;
        this.i = interfaceC1722a;
    }
}

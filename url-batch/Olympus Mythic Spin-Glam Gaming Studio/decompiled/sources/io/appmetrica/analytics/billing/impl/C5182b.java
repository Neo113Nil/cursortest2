package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.billing.impl.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5182b implements ProtobufConverter {
    public final i a;

    /* JADX WARN: Multi-variable type inference failed */
    public C5182b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d fromModel(@NotNull C5181a c5181a) {
        d dVar = new d();
        List list = c5181a.a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.a.fromModel((BillingInfo) it.next()));
        }
        dVar.a = (c[]) arrayList.toArray(new c[0]);
        dVar.b = c5181a.b;
        return dVar;
    }

    public C5182b(@NotNull i iVar) {
        this.a = iVar;
    }

    public /* synthetic */ C5182b(i iVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new i() : iVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5181a toModel(@NotNull d dVar) {
        c[] cVarArr = dVar.a;
        ArrayList arrayList = new ArrayList(cVarArr.length);
        for (c cVar : cVarArr) {
            arrayList.add(this.a.toModel(cVar));
        }
        return new C5181a(arrayList, dVar.b);
    }
}

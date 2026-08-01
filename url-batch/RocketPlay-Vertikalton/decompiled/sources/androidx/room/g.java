package androidx.room;

import E1.AbstractC0001b;
import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2056a;

    /* renamed from: b, reason: collision with root package name */
    public final A1.d f2057b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2058c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final e0.d f2059e;

    /* renamed from: f, reason: collision with root package name */
    public final e0.d f2060f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2061g;
    public final LinkedHashSet h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2062j;

    public g(Context context, M0.e eVar, A1.d dVar, ArrayList arrayList, int i, e0.d dVar2, e0.d dVar3, boolean z2, LinkedHashSet linkedHashSet, ArrayList arrayList2, ArrayList arrayList3) {
        i1.f.e(dVar, "migrationContainer");
        AbstractC0001b.j("journalMode", i);
        i1.f.e(dVar2, "queryExecutor");
        i1.f.e(dVar3, "transactionExecutor");
        i1.f.e(arrayList2, "typeConverters");
        i1.f.e(arrayList3, "autoMigrationSpecs");
        this.f2056a = context;
        this.f2057b = dVar;
        this.f2058c = arrayList;
        this.d = i;
        this.f2059e = dVar2;
        this.f2060f = dVar3;
        this.f2061g = z2;
        this.h = linkedHashSet;
        this.i = arrayList2;
        this.f2062j = arrayList3;
    }
}

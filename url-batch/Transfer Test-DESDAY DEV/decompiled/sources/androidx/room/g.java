package androidx.room;

import Y.V;
import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1677a;

    /* renamed from: b, reason: collision with root package name */
    public final A0.h f1678b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1679c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final e0.d f1680e;

    /* renamed from: f, reason: collision with root package name */
    public final e0.d f1681f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1682g;
    public final boolean h;
    public final LinkedHashSet i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f1683j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f1684k;

    public g(Context context, O0.e eVar, A0.h hVar, ArrayList arrayList, int i, e0.d dVar, e0.d dVar2, boolean z2, boolean z3, LinkedHashSet linkedHashSet, ArrayList arrayList2, ArrayList arrayList3) {
        g1.f.e(hVar, "migrationContainer");
        V.h("journalMode", i);
        g1.f.e(dVar, "queryExecutor");
        g1.f.e(dVar2, "transactionExecutor");
        g1.f.e(arrayList2, "typeConverters");
        g1.f.e(arrayList3, "autoMigrationSpecs");
        this.f1677a = context;
        this.f1678b = hVar;
        this.f1679c = arrayList;
        this.d = i;
        this.f1680e = dVar;
        this.f1681f = dVar2;
        this.f1682g = z2;
        this.h = z3;
        this.i = linkedHashSet;
        this.f1683j = arrayList2;
        this.f1684k = arrayList3;
    }
}

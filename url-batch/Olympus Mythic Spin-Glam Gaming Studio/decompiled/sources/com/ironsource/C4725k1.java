package com.ironsource;

import com.ironsource.InterfaceC4818p4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.ironsource.k1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C4725k1 implements InterfaceC4868s1 {

    @NotNull
    private final InterfaceC4779n1 a;

    @NotNull
    private final C7 b;

    @NotNull
    private final Jb<Integer, Integer> c;

    @NotNull
    private final InterfaceC4818p4 d;

    @NotNull
    private List<InterfaceC4815p1> e;

    public C4725k1(@NotNull InterfaceC4779n1 eventBaseData, @NotNull C7 eventsManager, @NotNull Jb<Integer, Integer> eventsMapper, @NotNull InterfaceC4818p4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
        Intrinsics.checkNotNullParameter(eventsManager, "eventsManager");
        Intrinsics.checkNotNullParameter(eventsMapper, "eventsMapper");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = eventBaseData;
        this.b = eventsManager;
        this.c = eventsMapper;
        this.d = currentTimeProvider;
        this.e = new ArrayList();
    }

    public final void a(@NotNull List<InterfaceC4815p1> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.e = list;
    }

    @NotNull
    public final List<InterfaceC4815p1> b() {
        return this.e;
    }

    private final JSONObject b(List<? extends InterfaceC4815p1> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends InterfaceC4815p1> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(linkedHashMap);
        }
        return new JSONObject(linkedHashMap);
    }

    @Override // com.ironsource.InterfaceC4868s1
    public void a(int i, @NotNull List<InterfaceC4815p1> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "arrayList");
        try {
            Iterator<T> it = this.a.a().iterator();
            while (it.hasNext()) {
                arrayList.add((InterfaceC4815p1) it.next());
            }
            Iterator<InterfaceC4815p1> it2 = this.e.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            this.b.a(new C4966x5(this.c.a(Integer.valueOf(i)).intValue(), this.d.a(), b(arrayList)));
        } catch (Exception e) {
            C4782n4.d().a(e);
            System.out.println((Object) ("LogRemote | Exception: " + e.getMessage()));
        }
    }

    public /* synthetic */ C4725k1(InterfaceC4779n1 interfaceC4779n1, C7 c7, Jb jb, InterfaceC4818p4 interfaceC4818p4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC4779n1, c7, jb, (i & 8) != 0 ? new InterfaceC4818p4.a() : interfaceC4818p4);
    }

    @Override // com.ironsource.InterfaceC4868s1
    public void a() {
        this.e.clear();
    }

    @Override // com.ironsource.InterfaceC4868s1
    public void a(@NotNull InterfaceC4815p1... analyticsEventEntity) {
        Intrinsics.checkNotNullParameter(analyticsEventEntity, "analyticsEventEntity");
        for (InterfaceC4815p1 interfaceC4815p1 : analyticsEventEntity) {
            this.e.add(interfaceC4815p1);
        }
    }
}

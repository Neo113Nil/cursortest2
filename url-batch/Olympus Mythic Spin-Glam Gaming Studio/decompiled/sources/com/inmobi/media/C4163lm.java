package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.inmobi.media.lm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4163lm {
    public final AtomicInteger a;
    public final Zc b;
    public final C4137km c;

    public C4163lm(Jl vastBeaconData, C3903c0 adLifecycleData, Fn responseBeaconData) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(vastBeaconData, "vastBeaconData");
        Intrinsics.checkNotNullParameter(adLifecycleData, "adLifecycleData");
        Intrinsics.checkNotNullParameter(responseBeaconData, "responseBeaconData");
        this.a = new AtomicInteger(0);
        this.b = new Zc(adLifecycleData, vastBeaconData.a, vastBeaconData.b, 24);
        ArrayList arrayList = vastBeaconData.d;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Je je = (Je) next;
            if (!(je instanceof W5)) {
                String type = je.b;
                Intrinsics.checkNotNullParameter(type, "type");
                if (!Intrinsics.areEqual(type, "Impression") && !Intrinsics.areEqual(type, "click")) {
                    arrayList2.add(next);
                }
            }
        }
        ArrayList arrayList3 = vastBeaconData.d;
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (next2 instanceof W5) {
                arrayList4.add(next2);
            }
        }
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            W5 w5 = (W5) it3.next();
            int i3 = vastBeaconData.c;
            Intrinsics.checkNotNullParameter(w5, "<this>");
            if (StringsKt.endsWith$default(w5.c, "%", false, 2, (Object) null)) {
                try {
                    i = Integer.parseInt(StringsKt.dropLast(w5.c, 1));
                } catch (Exception unused) {
                    i = 0;
                }
                i2 = (i3 * i) / 100;
            } else {
                i2 = AbstractC4085im.a(w5.c);
            }
            arrayList5.add(new U5(w5.a, i2));
        }
        this.c = new C4137km(this.b, new C4190mm(responseBeaconData, arrayList2, arrayList5));
    }
}

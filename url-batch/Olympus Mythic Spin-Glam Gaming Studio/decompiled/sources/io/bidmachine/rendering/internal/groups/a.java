package io.bidmachine.rendering.internal.groups;

import com.ironsource.X3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes8.dex */
public final class a implements b {
    private final List a;
    private final HashSet b;

    public a(List initial) {
        Intrinsics.checkNotNullParameter(initial, "initial");
        this.a = initial;
        this.b = new HashSet(initial);
    }

    private final void b(String str) {
        if (this.b.contains(str)) {
            return;
        }
        this.b.add(str);
    }

    private final void c(String str) {
        if (StringsKt.startsWith$default(str, X3.j.c, false, 2, (Object) null)) {
            String substring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            b(substring);
        } else if (StringsKt.startsWith$default(str, "!", false, 2, (Object) null)) {
            String substring2 = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
            e(substring2);
        }
    }

    private final void e(String str) {
        if (Intrinsics.areEqual(str, "default")) {
            return;
        }
        this.b.remove(str);
    }

    @Override // io.bidmachine.rendering.internal.groups.b
    public boolean a(List stateGroups) {
        boolean z;
        Intrinsics.checkNotNullParameter(stateGroups, "stateGroups");
        synchronized (this.b) {
            if (!stateGroups.isEmpty()) {
                if (!stateGroups.isEmpty()) {
                    Iterator it = stateGroups.iterator();
                    while (it.hasNext()) {
                        if (d((String) it.next())) {
                        }
                    }
                }
                z = false;
            }
            z = true;
        }
        return z;
    }

    public boolean d(String stateGroup) {
        boolean z;
        Intrinsics.checkNotNullParameter(stateGroup, "stateGroup");
        synchronized (this.b) {
            if (!Intrinsics.areEqual(stateGroup, "default")) {
                z = this.b.contains(stateGroup);
            }
        }
        return z;
    }

    @Override // io.bidmachine.rendering.internal.groups.b
    public void a(String stateGroups) {
        Intrinsics.checkNotNullParameter(stateGroups, "stateGroups");
        synchronized (this.b) {
            try {
                List split$default = StringsKt.split$default((CharSequence) stateGroups, new String[]{" "}, false, 0, 6, (Object) null);
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(split$default, 10));
                Iterator it = split$default.iterator();
                while (it.hasNext()) {
                    arrayList.add(StringsKt.trim((String) it.next()).toString());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!StringsKt.isBlank((String) obj)) {
                        arrayList2.add(obj);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    c((String) it2.next());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

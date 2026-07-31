package yads;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes13.dex */
public abstract class rb2 {
    public static ArrayList a(View view) {
        ArrayList arrayList = new ArrayList();
        tl3 tl3Var = hl3.a;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        View view2 = view;
        while (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int indexOfChild = viewGroup.indexOfChild(view2) + 1; indexOfChild < childCount; indexOfChild++) {
                arrayList.addAll(b(viewGroup.getChildAt(indexOfChild)));
            }
            ViewParent parent2 = viewGroup.getParent();
            ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            view2 = viewGroup;
            viewGroup = viewGroup2;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (view.getZ() <= ((View) next).getZ()) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public static List b(View view) {
        List createListBuilder = CollectionsKt.createListBuilder();
        if (!hl3.b(view)) {
            if (!(view instanceof ViewGroup)) {
                createListBuilder.add(view);
            } else if (hl3.c(view)) {
                createListBuilder.add(view);
            } else {
                ViewGroup viewGroup = (ViewGroup) view;
                List createListBuilder2 = CollectionsKt.createListBuilder();
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    createListBuilder2.addAll(b(viewGroup.getChildAt(i)));
                }
                createListBuilder.addAll(CollectionsKt.build(createListBuilder2));
            }
        }
        return CollectionsKt.build(createListBuilder);
    }
}

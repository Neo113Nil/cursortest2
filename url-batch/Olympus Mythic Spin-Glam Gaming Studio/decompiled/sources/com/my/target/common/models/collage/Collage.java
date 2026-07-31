package com.my.target.common.models.collage;

import androidx.annotation.NonNull;
import com.my.target.c7;
import com.my.target.d7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes10.dex */
public class Collage {

    @NonNull
    public final List<CollageItem> collageItems;

    Collage(List list) {
        this.collageItems = list;
    }

    public static Collage a(c7 c7Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c7Var.a().iterator();
        while (it.hasNext()) {
            arrayList.add(CollageItem.a((d7) it.next()));
        }
        return new Collage(arrayList);
    }

    public String toString() {
        return "Collage{collageItems=" + this.collageItems + '}';
    }
}

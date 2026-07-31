package com.ogury.ad.internal;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ra {
    public final wi a;
    public final vg b;
    public final List c;

    public ra() {
        wi rectHelper = new wi();
        Configuration configuration = Resources.getSystem().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "getConfiguration(...)");
        vg screenRotationAdjustment = new vg(configuration);
        Intrinsics.checkNotNullParameter(rectHelper, "rectHelper");
        Intrinsics.checkNotNullParameter(screenRotationAdjustment, "screenRotationAdjustment");
        this.a = rectHelper;
        this.b = screenRotationAdjustment;
        this.c = CollectionsKt.listOf((Object[]) new pa[]{new i8(), new d3(), screenRotationAdjustment, new f3(1.0f)});
    }

    public final rg a(ViewGroup viewGroup, Rect rect) {
        this.a.getClass();
        Rect containerRect = wi.a(viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(containerRect, "containerRect");
        if (containerRect.height() <= viewGroup.getRootView().getHeight() * 0.4f) {
            return null;
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((pa) it.next()).a(rect, containerRect);
        }
        vg vgVar = this.b;
        vgVar.getClass();
        Intrinsics.checkNotNullParameter(rect, "adLayoutRect");
        vgVar.c = new Rect(rect);
        rect.offset(-containerRect.left, -containerRect.top);
        Intrinsics.checkNotNullParameter(rect, "rect");
        int i = rect.left;
        int i2 = rect.top;
        int width = rect.width();
        int height = rect.height();
        rg rgVar = new rg();
        rgVar.a = false;
        rgVar.d = i;
        rgVar.e = i2;
        rgVar.b = width;
        rgVar.c = height;
        return rgVar;
    }
}

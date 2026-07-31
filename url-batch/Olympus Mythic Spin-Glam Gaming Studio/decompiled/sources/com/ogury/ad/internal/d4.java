package com.ogury.ad.internal;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes10.dex */
public final class d4 extends Lambda implements Function0 {
    public final /* synthetic */ f4 a;
    public final /* synthetic */ y7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(f4 f4Var, y7 y7Var) {
        super(0);
        this.a = f4Var;
        this.b = y7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        f4 f4Var = this.a;
        y7 webView = this.b;
        Intrinsics.checkNotNullExpressionValue(webView, "$child");
        try {
            d dVar = new d();
            View rootView = f4Var.a.getRootView();
            Intrinsics.checkNotNull(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup root = (ViewGroup) rootView;
            f4Var.b.getClass();
            Rect a = wi.a((View) webView);
            wi wiVar = f4Var.b;
            ViewGroup viewGroup = f4Var.a;
            wiVar.getClass();
            Rect screenRect = wi.b(viewGroup);
            a.bottom = a.top + webView.getMeasuredHeight();
            a.right = a.left + webView.getMeasuredWidth();
            if (a.intersect(screenRect)) {
                f4Var.d.getClass();
                Intrinsics.checkNotNullParameter(root, "root");
                Intrinsics.checkNotNullParameter(webView, "webView");
                ArrayList arrayList = new ArrayList();
                hi.a(root, arrayList);
                ArrayList a2 = f4Var.c.a(arrayList.subList(arrayList.indexOf(webView) + 1, arrayList.size()), a);
                f4Var.c.getClass();
                int a3 = vi.a(a, a2);
                int measuredWidth = webView.getMeasuredWidth() * webView.getMeasuredHeight();
                Intrinsics.checkNotNullParameter(a, "<this>");
                int height = measuredWidth - (a.height() * a.width());
                int i = 0;
                if (height < 0) {
                    height = 0;
                }
                float f = measuredWidth;
                if (measuredWidth != 0) {
                    dVar.c = 100.0f - (((a3 + height) * 100.0f) / f);
                } else {
                    dVar.c = 0.0f;
                }
                if (dVar.c != 0.0f) {
                    Intrinsics.checkNotNullParameter(a2, "<this>");
                    Intrinsics.checkNotNullParameter(screenRect, "containerRect");
                    int size = a2.size();
                    while (i < size) {
                        Object obj = a2.get(i);
                        i++;
                        Rect rect = (Rect) obj;
                        Intrinsics.checkNotNullParameter(rect, "<this>");
                        Intrinsics.checkNotNullParameter(screenRect, "screenRect");
                        rect.offset(-screenRect.left, -screenRect.top);
                    }
                    Intrinsics.checkNotNullParameter(a, "<this>");
                    Intrinsics.checkNotNullParameter(screenRect, "screenRect");
                    a.offset(-screenRect.left, -screenRect.top);
                    Intrinsics.checkNotNullParameter(a2, "<set-?>");
                    dVar.b = a2;
                    dVar.a = a;
                    return dVar;
                }
            }
            return dVar;
        } catch (Throwable th) {
            Logger.INSTANCE.e(LogTag.INTERNAL, SourceTag.ADS, "getAdExposure failed", th);
            return new d();
        }
    }
}

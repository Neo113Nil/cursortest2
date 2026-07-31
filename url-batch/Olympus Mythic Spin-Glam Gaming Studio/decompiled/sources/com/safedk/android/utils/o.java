package com.safedk.android.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class o {
    public static Activity a(View view) {
        if (view == null) {
            return null;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public static List<View> b(View view) {
        if (!(view instanceof ViewGroup)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            arrayList2.addAll(b(viewGroup.getChildAt(i)));
        }
        return arrayList2;
    }

    public static Activity a(com.safedk.android.analytics.brandsafety.o oVar) {
        if (oVar.ak) {
            return com.safedk.android.internal.b.getInstance().getForegroundActivity();
        }
        if (oVar.aq != null && oVar.aq.get() != null) {
            return oVar.aq.get();
        }
        return null;
    }
}

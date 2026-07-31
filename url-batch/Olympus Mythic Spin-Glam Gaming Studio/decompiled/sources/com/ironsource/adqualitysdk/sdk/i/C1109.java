package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ⁱ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1109 extends AbstractC1100 {
    static {
        StringFog.decrypt("xE+o47q5QNf1Q7nVmJxK2OJJqMuoh1HM\n", "oyrcot7uJbU=\n");
        StringFog.decrypt("OE7EIlSUoT0iVPAnVA==\n", "UT2SSzHj91Q=\n");
        StringFog.decrypt("nKAcpcrlRA==\n", "+8Vo86OAM9Y=\n");
        StringFog.decrypt("7TIvxEmutgfkIw3uQ7c=\n", "ildbhybAwmI=\n");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m4403(ArrayList arrayList) {
        View view = (View) AbstractC1100.m4401(arrayList, 0, View.class);
        Rect rect = AbstractC1240.f3245;
        view.getHitRect(rect);
        return view.getGlobalVisibleRect(rect);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static View m4404(ArrayList arrayList) {
        View view = (View) AbstractC1100.m4401(arrayList, 0, View.class);
        Class cls = (Class) AbstractC1100.m4401(arrayList, 1, Class.class);
        boolean booleanValue = ((Boolean) AbstractC1100.m4401(arrayList, 2, Boolean.class)).booleanValue();
        Rect rect = AbstractC1240.f3245;
        ArrayList arrayList2 = new ArrayList();
        AbstractC1240.m4489(view, cls, null, true, booleanValue, null, null, arrayList2);
        if (arrayList2.isEmpty()) {
            return null;
        }
        return (View) arrayList2.get(0);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static View m4405(ArrayList arrayList) {
        Activity activity = (Activity) AbstractC1100.m4401(arrayList, 0, Activity.class);
        Rect rect = AbstractC1240.f3245;
        return activity.findViewById(R.id.content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0065  */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.List] */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static WebView m4406(ArrayList arrayList) {
        int i;
        ArrayList arrayList2;
        String str;
        Activity activity = (Activity) AbstractC1100.m4401(arrayList, 0, Activity.class);
        ArrayList arrayList3 = new ArrayList();
        if (arrayList.size() > 1) {
            int intValue = ((Integer) AbstractC1100.m4401(arrayList, 1, Integer.class)).intValue();
            if (arrayList.size() > 2) {
                String str2 = (String) AbstractC1100.m4401(arrayList, 2, String.class);
                arrayList2 = arrayList.size() > 3 ? (List) AbstractC1100.m4401(arrayList, 3, List.class) : arrayList3;
                str = str2;
                i = intValue;
                Rect rect = AbstractC1240.f3245;
                ArrayList arrayList4 = new ArrayList();
                AbstractC1240.m4492(activity, WebView.class, i, str, true, false, null, arrayList2, arrayList4);
                return (WebView) (arrayList4.size() > 0 ? (View) arrayList4.get(0) : null);
            }
            arrayList2 = arrayList3;
            i = intValue;
        } else {
            i = -1;
            arrayList2 = arrayList3;
        }
        str = null;
        Rect rect2 = AbstractC1240.f3245;
        ArrayList arrayList42 = new ArrayList();
        AbstractC1240.m4492(activity, WebView.class, i, str, true, false, null, arrayList2, arrayList42);
        return (WebView) (arrayList42.size() > 0 ? (View) arrayList42.get(0) : null);
    }
}

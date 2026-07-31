package com.ironsource;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.cg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4597cg {

    @NotNull
    public static final C4597cg a = new C4597cg();

    @NotNull
    private static final String b = ",";

    @NotNull
    private static final String c = "[";

    @NotNull
    private static final String d = "]";
    private static final int e = 118;

    private C4597cg() {
    }

    @NotNull
    public final List<Object> a(@NotNull Object... items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return CollectionsKt.listOf(Arrays.copyOf(items, items.length));
    }

    @NotNull
    public final String b(@NotNull List<? extends Object> methodArgs) {
        Intrinsics.checkNotNullParameter(methodArgs, "methodArgs");
        String str = new String();
        for (Object obj : methodArgs) {
            str = ((Object) (((Object) str) + (obj instanceof List ? a.a((List<?>) obj) : a.a(obj)))) + ",";
        }
        return StringsKt.removeSuffix(str, ",");
    }

    private final String a(List<?> list) {
        Iterator<?> it = list.iterator();
        String str = "[";
        while (it.hasNext()) {
            str = ((Object) str) + a.a(it.next()) + ",";
        }
        return ((Object) StringsKt.removeSuffix(str, ",")) + "]";
    }

    private final String a(Object obj) {
        if (obj instanceof String) {
            return "'" + obj + "'";
        }
        return String.valueOf(obj);
    }

    @NotNull
    public final AdInfo a(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        Intrinsics.checkNotNullParameter(levelPlayAdInfo, "<this>");
        return new AdInfo(new W8(levelPlayAdInfo), null);
    }

    @NotNull
    public final IronSourceError a(@NotNull LevelPlayAdError levelPlayAdError) {
        Intrinsics.checkNotNullParameter(levelPlayAdError, "<this>");
        return new IronSourceError(levelPlayAdError.getErrorCode(), levelPlayAdError.getErrorMessage());
    }

    @NotNull
    public final ViewGroup.LayoutParams a(@Nullable Context context) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        layoutParams.bottomMargin = a(context, 118);
        return layoutParams;
    }

    private final int a(Context context, int i) {
        Resources resources;
        DisplayMetrics displayMetrics;
        return (int) (i * ((context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0.0f : displayMetrics.density));
    }
}

package com.ogury.ad.internal;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class l3 {
    public static final void a(ArrayList arrayList, FragmentManager fragmentManager) {
        List<Fragment> fragments = fragmentManager.getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        for (Fragment fragment : fragments) {
            if (fragment.getUserVisibleHint() && fragment.isResumed() && !fragment.isHidden()) {
                Intrinsics.checkNotNull(fragment);
                arrayList.add(fragment);
                FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                a(arrayList, childFragmentManager);
            }
        }
    }
}

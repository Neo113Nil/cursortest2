package com.ogury.ad.internal;

import android.app.Activity;
import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class wa implements xa {
    public final ia a;
    public final ta b;
    public FragmentActivity c;
    public final Application d;
    public final ua e;
    public final FragmentManager.OnBackStackChangedListener f;
    public final va g;

    public wa(Activity activity, ia adLayoutController, ta overlayFragmentFilter, sh topActivityMonitor) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adLayoutController, "adLayoutController");
        Intrinsics.checkNotNullParameter(overlayFragmentFilter, "overlayFragmentFilter");
        Intrinsics.checkNotNullParameter(topActivityMonitor, "topActivityMonitor");
        this.a = adLayoutController;
        this.b = overlayFragmentFilter;
        this.c = (FragmentActivity) activity;
        this.d = activity.getApplication();
        this.e = new ua(this);
        this.f = new FragmentManager.OnBackStackChangedListener() { // from class: com.ogury.ad.internal.wa$$ExternalSyntheticLambda0
            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public final void onBackStackChanged() {
                wa.a(wa.this);
            }
        };
        this.g = new va(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0082, code lost:
    
        r11.a.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0087, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        ArrayList fragments = new ArrayList();
        l3.a(fragments, fragmentManager);
        ta taVar = this.b;
        Intrinsics.checkNotNullParameter(fragments, "fragments");
        int size = fragments.size();
        int i = 0;
        loop0: while (true) {
            if (i < size) {
                Object obj = fragments.get(i);
                i++;
                String a = gb.a(obj);
                ArrayList arrayList = taVar.a.b;
                if (!arrayList.isEmpty()) {
                    int size2 = arrayList.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        if (Intrinsics.areEqual((String) obj2, a)) {
                            break loop0;
                        }
                    }
                }
            } else {
                int size3 = fragments.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj3 = fragments.get(i3);
                    i3++;
                    String a2 = gb.a(obj3);
                    ArrayList arrayList2 = taVar.a.a;
                    if (!arrayList2.isEmpty()) {
                        int size4 = arrayList2.size();
                        int i4 = 0;
                        while (i4 < size4) {
                            Object obj4 = arrayList2.get(i4);
                            i4++;
                            if (StringsKt.startsWith$default(a2, (String) obj4, false, 2, (Object) null)) {
                                this.a.a(this.c);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.ogury.ad.internal.xa
    public final void b() {
        this.d.unregisterActivityLifecycleCallbacks(this.g);
        FragmentActivity fragmentActivity = this.c;
        fragmentActivity.getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(this.e);
        fragmentActivity.getSupportFragmentManager().removeOnBackStackChangedListener(this.f);
        this.a.a();
    }

    @Override // com.ogury.ad.internal.xa
    public final void c() {
        this.d.registerActivityLifecycleCallbacks(this.g);
    }

    @Override // com.ogury.ad.internal.xa
    public final void a() {
        Activity activity = (Activity) sh.b.get();
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity == null) {
            fragmentActivity = this.c;
        }
        this.c = fragmentActivity;
        fragmentActivity.getSupportFragmentManager().registerFragmentLifecycleCallbacks(this.e, true);
        fragmentActivity.getSupportFragmentManager().addOnBackStackChangedListener(this.f);
        FragmentManager supportFragmentManager = this.c.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        a(supportFragmentManager);
    }

    public static final void a(wa this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentManager supportFragmentManager = this$0.c.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        this$0.a(supportFragmentManager);
    }
}

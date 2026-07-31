package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: classes13.dex */
public final class S3 {
    public final CoroutineScope a;
    public final C3933d4 b;
    public final C4493y9 c;
    public final MutableSharedFlow d;
    public Job e;
    public View f;
    public Ll g;
    public Mj h;
    public X3 i;
    public final C3907c4 j;

    public S3(Context context, CoroutineScope coroutineScope, C3933d4 companionTelemetryHelper, C4493y9 c4493y9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(companionTelemetryHelper, "companionTelemetryHelper");
        this.a = coroutineScope;
        this.b = companionTelemetryHelper;
        this.c = c4493y9;
        this.d = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.i = U3.a;
        this.j = new C3907c4(context, c4493y9);
    }

    public final void a(ArrayList companionAds) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(companionAds, "companionAds");
        if (companionAds.isEmpty()) {
            return;
        }
        if (!Intrinsics.areEqual(this.i, U3.a)) {
            Objects.toString(this.i);
            return;
        }
        Map a = Hk.a(this.b.a);
        C4425vk c4425vk = C4425vk.a;
        C4425vk.b("CompanionAdAvailable", a, EnumC4530zk.a);
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new R3(this, companionAds, null), 3, null);
        this.e = launch$default;
    }

    public final void b() {
        View view = this.f;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.S3$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/S3$$ExternalSyntheticLambda0;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.i, view2);
                    safedk_S3$$ExternalSyntheticLambda0_onClick_00748e5eea0e8b963cddda75c6bf241a(view2);
                }

                public void safedk_S3$$ExternalSyntheticLambda0_onClick_00748e5eea0e8b963cddda75c6bf241a(View p0) {
                    S3.a(S3.this, p0);
                }
            });
        }
    }

    public static final void a(S3 s3, View view) {
        Ll ll = s3.g;
        if (ll != null) {
            List plus = CollectionsKt.plus((Collection) ll.b, (Iterable) ll.c);
            ArrayList arrayList = new ArrayList();
            for (Object obj : plus) {
                if (Intrinsics.areEqual(((Je) obj).b, "click")) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Je) it.next()).a);
            }
            X4.a(s3.d, s3.a, new Y3(arrayList2));
        }
    }

    public final void a() {
        ViewParent parent;
        C4493y9 c4493y9 = this.c;
        if (c4493y9 != null) {
            c4493y9.a("CompanionAdManager", "destroy");
        }
        Mj mj = this.h;
        if (mj != null) {
            Picasso picasso = C4027gg.a;
            C4027gg.b(mj.a).cancelTag(mj.c);
        }
        P6.a(this.e);
        View view = this.f;
        if (view != null && (parent = view.getParent()) != null) {
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.f);
            }
        }
        this.e = null;
        this.h = null;
        this.f = null;
        this.i = U3.a;
    }
}

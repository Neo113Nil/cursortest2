package com.inmobi.media;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class Lm extends SuspendLambda implements Function2 {
    public final /* synthetic */ Nm a;
    public final /* synthetic */ S3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lm(Nm nm, S3 s3, Continuation continuation) {
        super(2, continuation);
        this.a = nm;
        this.b = s3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Lm(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Lm(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C4493y9 c4493y9 = this.a.e;
        if (c4493y9 != null) {
            c4493y9.a("VideoExperienceManager", "Companion Ad Rendered");
        }
        ViewGroup viewGroup = this.a.j;
        ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
        FrameLayout parentView = parent instanceof FrameLayout ? (FrameLayout) parent : null;
        if (parentView != null) {
            parentView.removeAllViews();
        }
        Nm nm = this.a;
        nm.j = null;
        InterfaceC4311rc interfaceC4311rc = nm.h;
        if (interfaceC4311rc == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
            interfaceC4311rc = null;
        }
        ((C4025ge) interfaceC4311rc).a();
        if (parentView == null) {
            return null;
        }
        S3 s3 = this.b;
        s3.getClass();
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        if (!Intrinsics.areEqual(s3.i, T3.a)) {
            X3 x3 = s3.i;
            throw new Q3(!Intrinsics.areEqual(x3, U3.a) ? !Intrinsics.areEqual(x3, W3.a) ? Intrinsics.areEqual(x3, V3.a) ? "Companion ad failed to load" : "Companion ad view is not available" : "Companion ad is still loading" : "Companion ad has not started loading");
        }
        C4493y9 c4493y92 = s3.c;
        if (c4493y92 != null) {
            c4493y92.a("CompanionAdManager", "renderCompanionView");
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        parentView.addView(s3.f, layoutParams);
        s3.b();
        Ll ll = s3.g;
        if (ll != null) {
            List plus = CollectionsKt.plus((Collection) ll.b, (Iterable) ll.c);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : plus) {
                if (Intrinsics.areEqual(((Je) obj2).b, "creativeView")) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Je) it.next()).a);
            }
            Map a = Hk.a(s3.b.a);
            C4425vk c4425vk = C4425vk.a;
            C4425vk.b("CompanionAdRendered", a, EnumC4530zk.a);
            X4.a(s3.d, s3.a, new C3959e4(arrayList2));
        }
        return Unit.INSTANCE;
    }
}

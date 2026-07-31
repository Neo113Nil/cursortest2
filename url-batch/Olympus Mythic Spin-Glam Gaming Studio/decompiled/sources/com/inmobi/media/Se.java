package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.ads.nativeAd.MediaView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;

/* loaded from: classes13.dex */
public final class Se {
    public final CoroutineScope a;
    public final Tn b;
    public final Pe c;
    public final AtomicBoolean d;
    public final ArrayList e;

    public Se(CoroutineScope coroutineScope, Tn viewabilityModel) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(viewabilityModel, "viewabilityModel");
        this.a = coroutineScope;
        this.b = viewabilityModel;
        this.d = new AtomicBoolean(false);
        this.e = new ArrayList();
        Te te = new Te(new Vn(viewabilityModel.a, viewabilityModel.c), new Vn(viewabilityModel.b, viewabilityModel.d));
        ViewGroup parentView = viewabilityModel.e.a.getParentView();
        ImageView iconView = viewabilityModel.e.a.getIconView();
        C4106jh c4106jh = viewabilityModel.e;
        MediaView mediaView = c4106jh.b;
        Intrinsics.checkNotNullParameter(c4106jh, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        MediaView mediaView2 = c4106jh.b;
        if (mediaView2 != null) {
            linkedHashSet.add(mediaView2);
        }
        View view = c4106jh.c;
        if (view != null) {
            linkedHashSet.add(view);
        }
        View ctaView = c4106jh.a.getCtaView();
        if (ctaView != null) {
            linkedHashSet.add(ctaView);
        }
        ImageView iconView2 = c4106jh.a.getIconView();
        if (iconView2 != null) {
            linkedHashSet.add(iconView2);
        }
        View titleView = c4106jh.a.getTitleView();
        if (titleView != null) {
            linkedHashSet.add(titleView);
        }
        View descriptionView = c4106jh.a.getDescriptionView();
        if (descriptionView != null) {
            linkedHashSet.add(descriptionView);
        }
        View ratingView = c4106jh.a.getRatingView();
        if (ratingView != null) {
            linkedHashSet.add(ratingView);
        }
        View advertiserView = c4106jh.a.getAdvertiserView();
        if (advertiserView != null) {
            linkedHashSet.add(advertiserView);
        }
        linkedHashSet.addAll(c4106jh.a.getExtraViews$media_release());
        this.c = new Pe(parentView, iconView, mediaView, CollectionsKt.toList(linkedHashSet), te);
    }

    public static final Unit b(Se se, boolean z) {
        se.c.e.b.b = z;
        return Unit.INSTANCE;
    }

    public final void a() {
        if (this.d.getAndSet(true)) {
            return;
        }
        ViewGroup parentView = this.b.e.a.getParentView();
        a(this.b.e.a.getIconView(), parentView, this.b.a, new Function1() { // from class: com.inmobi.media.Se$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Se.a(Se.this, ((Boolean) obj).booleanValue());
            }
        });
        Tn tn = this.b;
        a(tn.e.b, parentView, tn.b, new Function1() { // from class: com.inmobi.media.Se$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Se.b(Se.this, ((Boolean) obj).booleanValue());
            }
        });
    }

    public final void b() {
        if (this.d.getAndSet(false)) {
            ArrayList arrayList = this.e;
            Intrinsics.checkNotNullParameter(arrayList, "<this>");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                P6.a((Job) it.next());
            }
            arrayList.clear();
            this.e.clear();
        }
    }

    public static final Unit a(Se se, boolean z) {
        se.c.e.a.b = z;
        return Unit.INSTANCE;
    }

    public final void a(View view, ViewGroup parentView, boolean z, Function1 function1) {
        Job launch$default;
        if (view == null || !z) {
            return;
        }
        CoroutineScope coroutineScope = this.a;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new Re(FlowKt.stateIn(FlowKt.flowOn(FlowKt.callbackFlow(new Sn(view, parentView, null)), Dispatchers.getMain()), coroutineScope, SharingStarted.Companion.getLazily(), Boolean.valueOf(Un.b(view, parentView))), null, function1), 3, null);
        this.e.add(launch$default);
    }
}

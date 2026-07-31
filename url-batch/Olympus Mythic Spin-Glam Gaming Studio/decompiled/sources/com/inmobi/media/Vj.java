package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes12.dex */
public final class Vj extends AbstractC4223o2 {
    public final CoroutineScope b;
    public final Wj c;
    public final MutableSharedFlow d;
    public final C4493y9 e;
    public final String f;
    public final C3897bk g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vj(Context context, CoroutineScope coroutineScope, Wj staticExperienceModel, MutableSharedFlow mediaEventFlow, C4493y9 c4493y9) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(staticExperienceModel, "staticExperienceModel");
        Intrinsics.checkNotNullParameter(mediaEventFlow, "mediaEventFlow");
        this.b = coroutineScope;
        this.c = staticExperienceModel;
        this.d = mediaEventFlow;
        this.e = c4493y9;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        this.f = "Static-Image-" + uuid;
        int i = C3897bk.b;
        Intrinsics.checkNotNullParameter(context, "context");
        this.g = new C3897bk(context);
    }

    @Override // com.inmobi.media.AbstractC4223o2
    public final void a(MutableStateFlow windowFlow) {
        Intrinsics.checkNotNullParameter(windowFlow, "windowFlow");
    }

    @Override // com.inmobi.media.AbstractC4223o2
    public final void b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.inmobi.media.Vj] */
    @Override // com.inmobi.media.AbstractC4223o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        Qj qj;
        int i;
        C4493y9 c4493y9;
        if (continuationImpl instanceof Qj) {
            qj = (Qj) continuationImpl;
            int i2 = qj.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qj.c = i2 - Integer.MIN_VALUE;
                Object obj = qj.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = qj.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4493y9 c4493y92 = this.e;
                    if (c4493y92 != null) {
                        c4493y92.a("StaticExperienceManager", "load Called - imageAssets count: " + this.c.a.size());
                    }
                    Map a = Hk.a(this.c.b.a);
                    C4425vk c4425vk = C4425vk.a;
                    C4425vk.b("MainImageLoadStarted", a, EnumC4530zk.a);
                    List images = this.c.a;
                    Intrinsics.checkNotNullParameter(images, "images");
                    ArrayList images2 = new ArrayList();
                    for (Object obj2 : images) {
                        Image image = (Image) obj2;
                        if (URLUtil.isHttpUrl(image.getUrl()) || URLUtil.isHttpsUrl(image.getUrl())) {
                            images2.add(obj2);
                        }
                    }
                    if (images2.isEmpty()) {
                        C4493y9 c4493y93 = this.e;
                        if (c4493y93 != null) {
                            c4493y93.a("StaticExperienceManager", "Sanitized Images Empty - no valid images to load");
                        }
                        Map mutableMap = MapsKt.toMutableMap(Hk.a(this.c.b.a));
                        mutableMap.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2351);
                        C4425vk c4425vk2 = C4425vk.a;
                        C4425vk.b("MainImageLoadFailure", mutableMap, EnumC4530zk.a);
                        throw new C4285qc();
                    }
                    Intrinsics.checkNotNullParameter(images2, "images");
                    int size = images2.size();
                    ArrayList arrayList = images2;
                    if (size > 1) {
                        int a2 = G5.a();
                        int ordinal = G4.a().ordinal();
                        arrayList = ordinal != 2 ? ordinal != 3 ? CollectionsKt.sortedWith(images2, new Zj()) : a2 > 720 ? CollectionsKt.sortedWith(images2, new C3871ak()) : CollectionsKt.sortedWith(images2, new Xj(a2)) : CollectionsKt.sortedWith(images2, new Yj(a2));
                    }
                    C3897bk c3897bk = this.g;
                    qj.c = 1;
                    if (a(arrayList, c3897bk, qj) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                c4493y9 = this.e;
                if (c4493y9 != null) {
                    c4493y9.a("StaticExperienceManager", "Static Load Success");
                }
                Map a3 = Hk.a(this.c.b.a);
                C4425vk c4425vk3 = C4425vk.a;
                C4425vk.b("MainImageLoadSuccess", a3, EnumC4530zk.a);
                return Unit.INSTANCE;
            }
        }
        qj = new Qj(this, continuationImpl);
        Object obj3 = qj.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = qj.c;
        if (i != 0) {
        }
        c4493y9 = this.e;
        if (c4493y9 != null) {
        }
        Map a32 = Hk.a(this.c.b.a);
        C4425vk c4425vk32 = C4425vk.a;
        C4425vk.b("MainImageLoadSuccess", a32, EnumC4530zk.a);
        return Unit.INSTANCE;
    }

    @Override // com.inmobi.media.AbstractC4223o2
    public final Object a(FrameLayout frameLayout, C4470xc c4470xc) {
        Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new Pj(this, frameLayout, null), c4470xc);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    @Override // com.inmobi.media.AbstractC4223o2
    public final void a() {
        ViewParent parent = this.g.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        Picasso picasso = C4027gg.a;
        C4027gg.b(this.a).cancelTag(this.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00af, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r12, r13, r8) != r9) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, ImageView imageView, ContinuationImpl continuationImpl) {
        Rj rj;
        int i;
        Ref$BooleanRef ref$BooleanRef;
        List list2;
        ImageView imageView2;
        if (continuationImpl instanceof Rj) {
            rj = (Rj) continuationImpl;
            int i2 = rj.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rj.f = i2 - Integer.MIN_VALUE;
                Rj rj2 = rj;
                Object obj = rj2.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = rj2.f;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4493y9 c4493y9 = this.e;
                    if (c4493y9 != null) {
                        c4493y9.a("StaticExperienceManager", "loadImagesIntoImageView - attempting to load " + list.size() + " images");
                    }
                    Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    Tj tj = new Tj(this, null);
                    rj2.a = list;
                    rj2.b = imageView;
                    rj2.c = ref$BooleanRef2;
                    rj2.f = 1;
                    Object withContext = BuildersKt.withContext(main, tj, rj2);
                    if (withContext != coroutine_suspended) {
                        ref$BooleanRef = ref$BooleanRef2;
                        obj = withContext;
                        list2 = list;
                        imageView2 = imageView;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                Ref$BooleanRef ref$BooleanRef3 = rj2.c;
                ImageView imageView3 = rj2.b;
                List list3 = rj2.a;
                ResultKt.throwOnFailure(obj);
                imageView2 = imageView3;
                ref$BooleanRef = ref$BooleanRef3;
                list2 = list3;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                Sj sj = new Sj(list2, this, ref$BooleanRef, imageView2, (Bitmap.Config) obj, null);
                rj2.a = null;
                rj2.b = null;
                rj2.c = null;
                rj2.f = 2;
            }
        }
        rj = new Rj(this, continuationImpl);
        Rj rj22 = rj;
        Object obj2 = rj22.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = rj22.f;
        if (i != 0) {
        }
        CoroutineDispatcher io22 = Dispatchers.getIO();
        Sj sj2 = new Sj(list2, this, ref$BooleanRef, imageView2, (Bitmap.Config) obj2, null);
        rj22.a = null;
        rj22.b = null;
        rj22.c = null;
        rj22.f = 2;
    }

    public final void a(ImageView imageView, final Image image) {
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.Vj$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/Vj$$ExternalSyntheticLambda0;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.i, view);
                safedk_Vj$$ExternalSyntheticLambda0_onClick_11fef60d9cacb3257f62477355bfc019(view);
            }

            public void safedk_Vj$$ExternalSyntheticLambda0_onClick_11fef60d9cacb3257f62477355bfc019(View p0) {
                Vj.a(Vj.this, image, p0);
            }
        });
    }

    public static final void a(Vj vj, Image image, View view) {
        C4493y9 c4493y9 = vj.e;
        if (c4493y9 != null) {
            c4493y9.a("StaticExperienceManager", "Static Click Event");
        }
        BuildersKt__Builders_commonKt.launch$default(vj.b, null, null, new Uj(image, vj, null), 3, null);
    }
}

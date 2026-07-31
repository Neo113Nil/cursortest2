package com.inmobi.media;

import android.view.View;
import android.widget.ImageView;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.lh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4158lh {
    public static void a(C4106jh publisherNativeViewData, final Function1 onClick) {
        Intrinsics.checkNotNullParameter(publisherNativeViewData, "publisherNativeViewData");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        publisherNativeViewData.a.getParentView().setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.lh$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/lh$$ExternalSyntheticLambda0;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.i, view);
                safedk_lh$$ExternalSyntheticLambda0_onClick_2b53dfbd109263dedc706aa5eb72eddb(view);
            }

            public void safedk_lh$$ExternalSyntheticLambda0_onClick_2b53dfbd109263dedc706aa5eb72eddb(View p0) {
                C4158lh.a(Function1.this, p0);
            }
        });
        View titleView = publisherNativeViewData.a.getTitleView();
        if (titleView != null) {
            titleView.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.lh$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/lh$$ExternalSyntheticLambda1;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.i, view);
                    safedk_lh$$ExternalSyntheticLambda1_onClick_880453e73a5848e7ddc36225b0983947(view);
                }

                public void safedk_lh$$ExternalSyntheticLambda1_onClick_880453e73a5848e7ddc36225b0983947(View p0) {
                    C4158lh.b(Function1.this, p0);
                }
            });
        }
        View descriptionView = publisherNativeViewData.a.getDescriptionView();
        if (descriptionView != null) {
            descriptionView.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.lh$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/lh$$ExternalSyntheticLambda2;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.i, view);
                    safedk_lh$$ExternalSyntheticLambda2_onClick_50000cb982a71834bdfd0e0535bd41e7(view);
                }

                public void safedk_lh$$ExternalSyntheticLambda2_onClick_50000cb982a71834bdfd0e0535bd41e7(View p0) {
                    C4158lh.c(Function1.this, p0);
                }
            });
        }
        ImageView iconView = publisherNativeViewData.a.getIconView();
        if (iconView != null) {
            iconView.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.lh$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/lh$$ExternalSyntheticLambda3;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.i, view);
                    safedk_lh$$ExternalSyntheticLambda3_onClick_54b3d87762d634c21fde1944e98df724(view);
                }

                public void safedk_lh$$ExternalSyntheticLambda3_onClick_54b3d87762d634c21fde1944e98df724(View p0) {
                    C4158lh.d(Function1.this, p0);
                }
            });
        }
        View ctaView = publisherNativeViewData.a.getCtaView();
        if (ctaView != null) {
            ctaView.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.lh$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/lh$$ExternalSyntheticLambda4;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.i, view);
                    safedk_lh$$ExternalSyntheticLambda4_onClick_113607f8968afd1dc6173bbf9383afbe(view);
                }

                public void safedk_lh$$ExternalSyntheticLambda4_onClick_113607f8968afd1dc6173bbf9383afbe(View p0) {
                    C4158lh.e(Function1.this, p0);
                }
            });
        }
        View advertiserView = publisherNativeViewData.a.getAdvertiserView();
        if (advertiserView != null) {
            advertiserView.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.lh$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/lh$$ExternalSyntheticLambda5;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.i, view);
                    safedk_lh$$ExternalSyntheticLambda5_onClick_4bcad892ba369bea6ee8052cb1a8ea47(view);
                }

                public void safedk_lh$$ExternalSyntheticLambda5_onClick_4bcad892ba369bea6ee8052cb1a8ea47(View p0) {
                    C4158lh.f(Function1.this, p0);
                }
            });
        }
        View ratingView = publisherNativeViewData.a.getRatingView();
        if (ratingView != null) {
            ratingView.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.lh$$ExternalSyntheticLambda6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/lh$$ExternalSyntheticLambda6;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.i, view);
                    safedk_lh$$ExternalSyntheticLambda6_onClick_18782cc2b2f6dba7cddc2b223ae53264(view);
                }

                public void safedk_lh$$ExternalSyntheticLambda6_onClick_18782cc2b2f6dba7cddc2b223ae53264(View p0) {
                    C4158lh.g(Function1.this, p0);
                }
            });
        }
        View view = publisherNativeViewData.c;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.lh$$ExternalSyntheticLambda7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/lh$$ExternalSyntheticLambda7;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.i, view2);
                    safedk_lh$$ExternalSyntheticLambda7_onClick_8e572b4425e820ce6c1fc9636db02ee3(view2);
                }

                public void safedk_lh$$ExternalSyntheticLambda7_onClick_8e572b4425e820ce6c1fc9636db02ee3(View p0) {
                    C4158lh.h(Function1.this, p0);
                }
            });
        }
    }

    public static final void b(Function1 function1, View view) {
        function1.invoke((short) 3);
    }

    public static final void c(Function1 function1, View view) {
        function1.invoke((short) 4);
    }

    public static final void d(Function1 function1, View view) {
        function1.invoke((short) 5);
    }

    public static final void e(Function1 function1, View view) {
        function1.invoke((short) 6);
    }

    public static final void f(Function1 function1, View view) {
        function1.invoke((short) 9);
    }

    public static final void g(Function1 function1, View view) {
        function1.invoke((short) 8);
    }

    public static final void h(Function1 function1, View view) {
        function1.invoke((short) 7);
    }

    public static final void a(Function1 function1, View view) {
        function1.invoke((short) 2);
    }
}

package com.my.target;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.util.SizeF;
import com.my.target.common.CustomParams;
import com.my.target.internal.api.internalnativead.ExternalNavigationRouter;
import com.my.target.internal.api.internalnativead.InternalNativeAdComposeController;
import com.my.target.internal.api.internalnativead.models.InternalNativeBanner;
import com.my.target.internal.api.internalnativead.models.adchoices.InternalNativeAdMenuAction;
import com.my.target.internal.api.internalnativead.webform.InternalWebFormClient;
import com.my.target.l2;
import com.my.target.m2;
import com.my.target.pj;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class o7 implements InternalNativeAdComposeController {
    private final j7 a;
    private final InternalNativeBanner b;
    private final f3 c;
    private final n7 d;
    private final InternalNativeAdComposeController.Listener e;
    private ExternalNavigationRouter f;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a extends pj.a {
        final /* synthetic */ InternalNativeAdComposeController.Listener a;

        a(InternalNativeAdComposeController.Listener listener) {
            this.a = listener;
        }

        @Override // com.my.target.pj.a
        public void a(boolean z) {
            mi.b("InternalNativeAdComposeControllerImpl", "Banner visibility is " + z);
        }

        @Override // com.my.target.pj.a
        public void b() {
            InternalNativeAdComposeController.Listener listener = this.a;
            if (listener != null) {
                listener.onBannerShow(o7.this.b);
            }
        }

        @Override // com.my.target.pj.a
        public void a() {
            InternalNativeAdComposeController.Listener listener = this.a;
            if (listener != null) {
                listener.onImpressionTracked(o7.this.b);
            }
        }
    }

    private o7(InternalNativeBanner internalNativeBanner, InternalNativeAdComposeController.Listener listener) {
        this.b = internalNativeBanner;
        j7 a2 = ((v7) internalNativeBanner).a();
        this.a = a2;
        this.e = listener;
        CustomParams h = a2.Y().h();
        this.d = n7.a(h, this.f, (InternalWebFormClient) null, new m2(h), "InternalNativeAdComposeControllerImpl");
        f3 a3 = f3.a(a2.P(), a2.H(), true, null);
        this.c = a3;
        a3.a(new a(listener));
    }

    public static o7 a(InternalNativeBanner internalNativeBanner, InternalNativeAdComposeController.Listener listener) {
        return new o7(internalNativeBanner, listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void c(int i) {
        InternalNativeAdComposeController.Listener listener = this.e;
        if (listener != null) {
            listener.onClickTracked(this.b, i);
        }
    }

    public InternalNativeBanner getBanner() {
        return this.b;
    }

    public void handleAdChoiceClick(InternalNativeAdMenuAction internalNativeAdMenuAction, Context context) {
        if (internalNativeAdMenuAction instanceof s7) {
            s7 s7Var = (s7) internalNativeAdMenuAction;
            String c = s7Var.c();
            if (!TextUtils.isEmpty(c)) {
                wh.a(c);
            }
            if ("copy".equals(s7Var.getType())) {
                String b = s7Var.b();
                if (b != null) {
                    ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copied id", b));
                    return;
                }
                return;
            }
            String a2 = s7Var.a();
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            a7.a(a2, context);
        }
    }

    public void handleClick(final int i, Context context) {
        int i2;
        mi.b("InternalNativeAdComposeControllerImpl", "Handling a click target id: " + i);
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
                i2 = 1;
                break;
            case 6:
                i2 = 2;
                break;
            case 12:
            default:
                mi.c("InternalNativeAdComposeControllerImpl", "Unknown click target: " + i);
                return;
        }
        int i3 = i2;
        o2 a2 = a(i);
        if (this.a.e().b()) {
            this.d.a(this.a, a2, new m2.a() { // from class: com.my.target.o7$$ExternalSyntheticLambda0
                @Override // com.my.target.m2.a
                public final void c() {
                    o7.this.b(i);
                }
            }, context);
        } else {
            this.d.a(this.a, new l2.c() { // from class: com.my.target.o7$$ExternalSyntheticLambda1
                @Override // com.my.target.l2.c
                public final void c() {
                    o7.this.c(i);
                }
            }, i3, a2, context);
        }
    }

    public void handleVisibilityChanged(Context context, SizeF sizeF, SizeF sizeF2) {
        this.c.a(this.a, new b7(context, sizeF, sizeF2));
    }

    public void setExternalNavigationRouter(ExternalNavigationRouter externalNavigationRouter) {
        this.f = externalNavigationRouter;
        this.d.a(externalNavigationRouter);
    }

    private o2 a(int i) {
        n2 a2;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
                a2 = p2.a(i);
                break;
            case 12:
            default:
                mi.b("InternalNativeAdComposeControllerImpl", "Unknown click target: " + i);
                a2 = r2.a("Unknown ClickTarget: " + i);
                break;
        }
        o2 a3 = s2.a(a2);
        if (a3 != null) {
            a3.a(true);
        }
        return a3;
    }
}

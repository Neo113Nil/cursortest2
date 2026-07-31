package yads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.monetization.ads.mediation.nativeads.MediatedNativeAd;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdAssets;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class wp1 {
    public static np1 a(Context context, MediatedNativeAd mediatedNativeAd) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        np1 np1Var = new np1(context);
        MediatedNativeAdAssets mediatedNativeAdAssets = mediatedNativeAd.getMediatedNativeAdAssets();
        np1Var.u = mediatedNativeAdAssets.getFeedback() != null;
        np1Var.v = mediatedNativeAdAssets.getWarning() != null;
        np1Var.w = mediatedNativeAdAssets.getDomain() != null;
        np1Var.y = (mediatedNativeAdAssets.getBody() == null && mediatedNativeAdAssets.getAge() == null) ? false : true;
        np1Var.e.setVisibility(np1Var.u ? 0 : 8);
        np1Var.g.setVisibility(np1Var.v ? 0 : 8);
        np1Var.i.setVisibility(np1Var.w ? 0 : 8);
        boolean z = np1Var.y;
        np1Var.k.setVisibility((z && z) ? 0 : 8);
        boolean z2 = np1Var.w && !(mediatedNativeAdAssets.getIcon() == null && mediatedNativeAdAssets.getFavicon() == null);
        np1Var.x = z2;
        np1Var.h.setVisibility(z2 ? 0 : 8);
        if (mediatedNativeAdAssets.getSponsored() != null) {
            np1Var.d.setVisibility(0);
            np1Var.d.setText(StringsKt.equals(mediatedNativeAdAssets.getSponsored(), "advertisement", true) ? "Ad" : mediatedNativeAdAssets.getSponsored());
        } else {
            np1Var.d.setVisibility(8);
        }
        np1Var.j.setText(mediatedNativeAdAssets.getTitle());
        np1Var.i.setText(mediatedNativeAdAssets.getDomain());
        np1Var.g.setText(mediatedNativeAdAssets.getWarning());
        np1Var.f.setText(mediatedNativeAdAssets.getCallToAction());
        StringBuilder sb = new StringBuilder();
        if (mediatedNativeAdAssets.getAge() != null) {
            sb.append(mediatedNativeAdAssets.getAge());
        }
        if (mediatedNativeAdAssets.getBody() != null) {
            if (mediatedNativeAdAssets.getAge() != null) {
                sb.append("•");
            }
            sb.append(mediatedNativeAdAssets.getBody());
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        if (mediatedNativeAdAssets.getBody() == null && mediatedNativeAdAssets.getAge() == null) {
            np1Var.k.setText("");
            np1Var.y = false;
        } else {
            np1Var.k.setText(sb2);
            np1Var.y = true;
        }
        boolean z3 = np1Var.y;
        np1Var.k.setVisibility((z3 && z3) ? 0 : 8);
        MediatedNativeAdImage image = mediatedNativeAdAssets.getImage();
        Drawable drawable4 = null;
        if (image == null || (drawable = image.getDrawable()) == null) {
            MediatedNativeAdImage icon = mediatedNativeAdAssets.getIcon();
            drawable = icon != null ? icon.getDrawable() : null;
            if (drawable == null) {
                MediatedNativeAdImage favicon = mediatedNativeAdAssets.getFavicon();
                drawable = favicon != null ? favicon.getDrawable() : null;
            }
        }
        np1Var.c.setImageDrawable(drawable);
        if (drawable != null) {
            np1Var.c.setVisibility(0);
        } else {
            np1Var.c.setVisibility(8);
        }
        MediatedNativeAdImage icon2 = mediatedNativeAdAssets.getIcon();
        if (icon2 == null || (drawable3 = icon2.getDrawable()) == null) {
            MediatedNativeAdImage favicon2 = mediatedNativeAdAssets.getFavicon();
            if (favicon2 != null) {
                drawable4 = favicon2.getDrawable();
            }
        } else {
            drawable4 = drawable3;
        }
        if (drawable4 == null || !np1Var.w) {
            np1Var.x = false;
            np1Var.h.setVisibility(8);
        } else {
            np1Var.h.setImageDrawable(drawable4);
            np1Var.x = true;
            np1Var.h.setVisibility(0);
        }
        MediatedNativeAdImage feedback = mediatedNativeAdAssets.getFeedback();
        if (feedback != null && (drawable2 = feedback.getDrawable()) != null) {
            np1Var.e.setImageDrawable(drawable2);
        }
        np1Var.requestLayout();
        op1 op1Var = new op1(np1Var);
        if (np1Var.isAttachedToWindow()) {
            mediatedNativeAd.bindNativeAd(op1Var);
        } else {
            np1Var.addOnAttachStateChangeListener(new vp1(np1Var, mediatedNativeAd, op1Var));
        }
        return np1Var;
    }
}

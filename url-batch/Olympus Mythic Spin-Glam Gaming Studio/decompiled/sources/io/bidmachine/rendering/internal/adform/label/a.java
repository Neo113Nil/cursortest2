package io.bidmachine.rendering.internal.adform.label;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import io.bidmachine.rendering.Repository;
import io.bidmachine.rendering.internal.adform.c;
import io.bidmachine.rendering.internal.event.b;
import io.bidmachine.rendering.internal.v;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.model.AppearanceParams;
import io.bidmachine.rendering.model.Border;
import io.bidmachine.rendering.model.FontStyleType;
import io.bidmachine.util.UtilsKt;
import io.bidmachine.util.gradient.GradientDrawable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class a extends io.bidmachine.rendering.internal.adform.a {
    public static final C1781a t = new C1781a(null);
    private final TextView s;

    /* renamed from: io.bidmachine.rendering.internal.adform.label.a$a, reason: collision with other inner class name */
    public static final class C1781a {
        public /* synthetic */ C1781a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1781a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Object assetsHolder, Repository repository, AdElementParams adElementParams, c adFormListener, b eventCallback, io.bidmachine.rendering.internal.detector.brokencreative.a aVar) {
        super(context, assetsHolder, repository, adElementParams, adFormListener, eventCallback, aVar);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(adElementParams, "adElementParams");
        Intrinsics.checkNotNullParameter(adFormListener, "adFormListener");
        Intrinsics.checkNotNullParameter(eventCallback, "eventCallback");
        this.s = new TextView(context);
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    protected void a(View view, v vVar) {
        Intrinsics.checkNotNullParameter(view, "view");
        int cornerRadiusPxOrDefault$default = AppearanceParams.getCornerRadiusPxOrDefault$default(r(), s(), 0, 2, null);
        Border border = r().getBorder(s());
        if (vVar != null) {
            vVar.a(t(), this.s, (r16 & 4) != 0 ? null : Integer.valueOf(cornerRadiusPxOrDefault$default), (r16 & 8) != 0 ? null : border, (r16 & 16) != 0, (r16 & 32) != 0 ? null : null);
            return;
        }
        TextView textView = this.s;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(AppearanceParams.getBackgroundOrDefault$default(r(), 0, 1, null));
        gradientDrawable.setCornerRadius(cornerRadiusPxOrDefault$default);
        if (border != null) {
            GradientDrawable.setStroke$default(gradientDrawable, border.getStrokeWidthPx(), border.getStrokeColor(), 0.0f, 0.0f, 12, (Object) null);
            this.s.setPadding(border.getStrokeWidthPx(), border.getStrokeWidthPx() - UtilsKt.dpToPx(s(), 2.0f), border.getStrokeWidthPx(), border.getStrokeWidthPx() + UtilsKt.dpToPx(s(), 2.0f));
        }
        textView.setBackground(gradientDrawable);
    }

    @Override // io.bidmachine.rendering.internal.b
    public void b() {
        this.s.setText(g().getText());
        Integer strokeColor = r().getStrokeColor();
        if (strokeColor != null) {
            this.s.setTextColor(strokeColor.intValue());
        }
        Float fontSize = r().getFontSize();
        if (fontSize != null && fontSize.floatValue() > 0.0f) {
            this.s.setTextSize(1, fontSize.floatValue());
        }
        FontStyleType fontStyleType = r().getFontStyleType();
        if (fontStyleType != null) {
            this.s.setTypeface(Typeface.create(Typeface.DEFAULT, fontStyleType.getTypeface()));
        }
        Integer textMaxLines = r().getTextMaxLines();
        if (textMaxLines != null && textMaxLines.intValue() > 0) {
            this.s.setMaxLines(textMaxLines.intValue());
        }
        if (r().getTextLineSpacingPx(s()) != null) {
            this.s.setLineSpacing(r0.intValue(), 1.0f);
        }
        this.s.setGravity(r().getTextHorizontalGravity().getValue() | 16);
        Integer shadowColor = r().getShadowColor();
        if (shadowColor != null) {
            int intValue = shadowColor.intValue();
            float dpToPx = UtilsKt.dpToPx(s(), 1.0f);
            this.s.setShadowLayer(UtilsKt.dpToPx(s(), 1.0f), dpToPx, dpToPx, intValue);
        }
        this.s.setIncludeFontPadding(false);
        q().b(this);
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    public View v() {
        return this.s;
    }
}

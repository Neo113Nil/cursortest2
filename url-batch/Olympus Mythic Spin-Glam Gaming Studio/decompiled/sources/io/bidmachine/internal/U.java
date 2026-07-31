package io.bidmachine.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import io.bidmachine.util.gradient.GradientDrawable;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class U {
    public static final U a = new U();

    private U() {
    }

    public static final C6017l a(Context context, C6016k disclaimerData, View baseAutoSizeView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(disclaimerData, "disclaimerData");
        Intrinsics.checkNotNullParameter(baseAutoSizeView, "baseAutoSizeView");
        C6017l c6017l = new C6017l(context.getApplicationContext());
        String b = disclaimerData.b();
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String upperCase = b.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        c6017l.setText(upperCase);
        c6017l.setPadding(0, 0, 0, 0);
        c6017l.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, Color.argb(150, 0, 0, 0)}));
        c6017l.setTextColor(-1);
        c6017l.setLetterSpacing(0.0f);
        c6017l.setLineSpacing(0.0f, 1.0f);
        c6017l.setIncludeFontPadding(false);
        try {
            c6017l.setTypeface(Typeface.create("sans-serif-light", 0));
            Unit unit = Unit.INSTANCE;
        } catch (Throwable unused) {
        }
        c6017l.a(baseAutoSizeView, disclaimerData.a());
        return c6017l;
    }
}

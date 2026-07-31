package com.yandex.div.internal.util;

import android.widget.TextView;
import com.yandex.div.core.annotations.InternalApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextViews.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"textString", "", "Landroid/widget/TextView;", "getTextString$annotations", "(Landroid/widget/TextView;)V", "getTextString", "(Landroid/widget/TextView;)Ljava/lang/String;", "utils_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TextViewsKt {
    @InternalApi
    public static /* synthetic */ void getTextString$annotations(TextView textView) {
    }

    @NotNull
    public static final String getTextString(@NotNull TextView textView) {
        return textView.getText().toString();
    }
}

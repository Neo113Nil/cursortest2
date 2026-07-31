package io.intercom.android.sdk.m5.utils;

import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextFieldSaver.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/intercom/android/sdk/m5/utils/TextFieldSaver;", "", "<init>", "()V", "textFieldValueSaver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/input/TextFieldValue;", "getTextFieldValueSaver", "()Landroidx/compose/runtime/saveable/Saver;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TextFieldSaver {
    public static final TextFieldSaver INSTANCE = new TextFieldSaver();
    private static final Saver<TextFieldValue, ?> textFieldValueSaver = ListSaverKt.listSaver(new Function2() { // from class: io.intercom.android.sdk.m5.utils.TextFieldSaver$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            List textFieldValueSaver$lambda$0;
            textFieldValueSaver$lambda$0 = TextFieldSaver.textFieldValueSaver$lambda$0((SaverScope) obj, (TextFieldValue) obj2);
            return textFieldValueSaver$lambda$0;
        }
    }, new Function1() { // from class: io.intercom.android.sdk.m5.utils.TextFieldSaver$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            TextFieldValue textFieldValueSaver$lambda$1;
            textFieldValueSaver$lambda$1 = TextFieldSaver.textFieldValueSaver$lambda$1((List) obj);
            return textFieldValueSaver$lambda$1;
        }
    });
    public static final int $stable = 8;

    private TextFieldSaver() {
    }

    public final Saver<TextFieldValue, ?> getTextFieldValueSaver() {
        return textFieldValueSaver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List textFieldValueSaver$lambda$0(SaverScope listSaver, TextFieldValue it) {
        Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
        Intrinsics.checkNotNullParameter(it, "it");
        String text = it.getText();
        Integer valueOf = Integer.valueOf(TextRange.m7835getStartimpl(it.getSelection()));
        Integer valueOf2 = Integer.valueOf(TextRange.m7830getEndimpl(it.getSelection()));
        TextRange composition = it.getComposition();
        Integer valueOf3 = Integer.valueOf(composition != null ? TextRange.m7835getStartimpl(composition.getPackedValue()) : -1);
        TextRange composition2 = it.getComposition();
        return CollectionsKt.listOf(text, valueOf, valueOf2, valueOf3, Integer.valueOf(composition2 != null ? TextRange.m7830getEndimpl(composition2.getPackedValue()) : -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue textFieldValueSaver$lambda$1(List it) {
        TextRange textRange;
        Intrinsics.checkNotNullParameter(it, "it");
        Object obj = it.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = it.get(1);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj2).intValue();
        Object obj3 = it.get(2);
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
        long TextRange = TextRangeKt.TextRange(intValue, ((Integer) obj3).intValue());
        Object obj4 = it.get(3);
        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
        if (((Integer) obj4).intValue() >= 0) {
            Object obj5 = it.get(3);
            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Int");
            int intValue2 = ((Integer) obj5).intValue();
            Object obj6 = it.get(4);
            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Int");
            textRange = TextRange.m7823boximpl(TextRangeKt.TextRange(intValue2, ((Integer) obj6).intValue()));
        } else {
            textRange = null;
        }
        return new TextFieldValue(str, TextRange, textRange, (DefaultConstructorMarker) null);
    }
}

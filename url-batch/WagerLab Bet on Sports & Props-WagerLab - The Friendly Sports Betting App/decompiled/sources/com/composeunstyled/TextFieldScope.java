package com.composeunstyled;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.text.style.TextAlign;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextField.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R)\u0010\u0004\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\b\u0007X\u0080\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u00168@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u001d8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0015\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010%\u001a\u00020$2\u0006\u0010\r\u001a\u00020$8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0015\u001a\u0004\b&\u0010 \"\u0004\b'\u0010\"R+\u0010)\u001a\u00020$2\u0006\u0010\r\u001a\u00020$8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u0015\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R+\u0010-\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u00168@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\u0015\u001a\u0004\b.\u0010\u0019\"\u0004\b/\u0010\u001bR+\u00101\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u00168@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010\u0015\u001a\u0004\b2\u0010\u0019\"\u0004\b3\u0010\u001b¨\u00065"}, d2 = {"Lcom/composeunstyled/TextFieldScope;", "", "<init>", "()V", "innerTextField", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "getInnerTextField$core_release", "()Lkotlin/jvm/functions/Function2;", "setInnerTextField$core_release", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "<set-?>", "", "text", "getText$core_release", "()Ljava/lang/String;", "setText$core_release", "(Ljava/lang/String;)V", "text$delegate", "Landroidx/compose/runtime/MutableState;", "", "editable", "getEditable$core_release", "()Z", "setEditable$core_release", "(Z)V", "editable$delegate", "Landroidx/compose/ui/text/style/TextAlign;", "textAlignment", "getTextAlignment-e0LSkKk$core_release", "()I", "setTextAlignment-aXe7zB0$core_release", "(I)V", "textAlignment$delegate", "", "minLines", "getMinLines$core_release", "setMinLines$core_release", "minLines$delegate", "maxLines", "getMaxLines$core_release", "setMaxLines$core_release", "maxLines$delegate", "isLeadingFocused", "isLeadingFocused$core_release", "setLeadingFocused$core_release", "isLeadingFocused$delegate", "isTrailingFocused", "isTrailingFocused$core_release", "setTrailingFocused$core_release", "isTrailingFocused$delegate", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextFieldScope {
    public static final int $stable = 8;
    private Function2<? super Composer, ? super Integer, Unit> innerTextField;

    /* renamed from: text$delegate, reason: from kotlin metadata */
    private final MutableState text = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* renamed from: editable$delegate, reason: from kotlin metadata */
    private final MutableState editable = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);

    /* renamed from: textAlignment$delegate, reason: from kotlin metadata */
    private final MutableState textAlignment = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextAlign.m8250boximpl(TextAlign.INSTANCE.m8263getUnspecifiede0LSkKk()), null, 2, null);

    /* renamed from: minLines$delegate, reason: from kotlin metadata */
    private final MutableState minLines = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1, null, 2, null);

    /* renamed from: maxLines$delegate, reason: from kotlin metadata */
    private final MutableState maxLines = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.MAX_VALUE, null, 2, null);

    /* renamed from: isLeadingFocused$delegate, reason: from kotlin metadata */
    private final MutableState isLeadingFocused = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* renamed from: isTrailingFocused$delegate, reason: from kotlin metadata */
    private final MutableState isTrailingFocused = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    public final Function2<Composer, Integer, Unit> getInnerTextField$core_release() {
        return this.innerTextField;
    }

    public final void setInnerTextField$core_release(Function2<? super Composer, ? super Integer, Unit> function2) {
        this.innerTextField = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getText$core_release() {
        return (String) this.text.getValue();
    }

    public final void setText$core_release(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEditable$core_release() {
        return ((Boolean) this.editable.getValue()).booleanValue();
    }

    public final void setEditable$core_release(boolean z) {
        this.editable.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getTextAlignment-e0LSkKk$core_release, reason: not valid java name */
    public final int m9553getTextAlignmente0LSkKk$core_release() {
        return ((TextAlign) this.textAlignment.getValue()).getValue();
    }

    /* renamed from: setTextAlignment-aXe7zB0$core_release, reason: not valid java name */
    public final void m9554setTextAlignmentaXe7zB0$core_release(int i) {
        this.textAlignment.setValue(TextAlign.m8250boximpl(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getMinLines$core_release() {
        return ((Number) this.minLines.getValue()).intValue();
    }

    public final void setMinLines$core_release(int i) {
        this.minLines.setValue(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getMaxLines$core_release() {
        return ((Number) this.maxLines.getValue()).intValue();
    }

    public final void setMaxLines$core_release(int i) {
        this.maxLines.setValue(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isLeadingFocused$core_release() {
        return ((Boolean) this.isLeadingFocused.getValue()).booleanValue();
    }

    public final void setLeadingFocused$core_release(boolean z) {
        this.isLeadingFocused.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isTrailingFocused$core_release() {
        return ((Boolean) this.isTrailingFocused.getValue()).booleanValue();
    }

    public final void setTrailingFocused$core_release(boolean z) {
        this.isTrailingFocused.setValue(Boolean.valueOf(z));
    }
}

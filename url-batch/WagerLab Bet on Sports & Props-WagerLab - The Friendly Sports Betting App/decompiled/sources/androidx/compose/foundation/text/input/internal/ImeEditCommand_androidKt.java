package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* compiled from: ImeEditCommand.android.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0000\u001a8\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f\u0018\u00010\fH\u0000\u001a\u001c\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0000\u001a\f\u0010\u0014\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u001c\u0010\u0015\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0000\u001a\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u001a$\u0010\u001b\u001a\u00020\u0001*\u00020\u001c2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001dH\u0001\u001a\u001c\u0010\u001e\u001a\u00020\u0001*\u00020\u001c2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0001¨\u0006\u001f"}, d2 = {"commitText", "", "Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;", "text", "", "newCursorPosition", "", "setComposingRegion", "start", "end", "setComposingText", "annotations", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroidx/compose/foundation/text/input/PlacedAnnotation;", "deleteSurroundingText", "lengthBeforeCursor", "lengthAfterCursor", "deleteSurroundingTextInCodePoints", "finishComposingText", "setSelection", "isSurrogatePair", "", "high", "", "low", "imeReplace", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "", "imeDelete", "foundation_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImeEditCommand_androidKt {
    public static final void commitText(ImeEditCommandScope imeEditCommandScope, final String str, final int i) {
        imeEditCommandScope.edit(new Function1() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit commitText$lambda$0;
                commitText$lambda$0 = ImeEditCommand_androidKt.commitText$lambda$0(str, i, (TextFieldBuffer) obj);
                return commitText$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit commitText$lambda$0(String str, int i, TextFieldBuffer textFieldBuffer) {
        TextRange composition = textFieldBuffer.getComposition();
        if (composition != null) {
            imeReplace(textFieldBuffer, TextRange.m7835getStartimpl(composition.getPackedValue()), TextRange.m7830getEndimpl(composition.getPackedValue()), str);
        } else {
            imeReplace(textFieldBuffer, TextRange.m7835getStartimpl(textFieldBuffer.getSelectionInChars()), TextRange.m7830getEndimpl(textFieldBuffer.getSelectionInChars()), str);
        }
        textFieldBuffer.m1435setSelection5zctL8(TextRangeKt.TextRange(RangesKt.coerceIn(i > 0 ? (r0 + i) - 1 : (TextRange.m7835getStartimpl(textFieldBuffer.getSelectionInChars()) + i) - str.length(), 0, textFieldBuffer.getLength())));
        return Unit.INSTANCE;
    }

    public static final void setComposingRegion(ImeEditCommandScope imeEditCommandScope, final int i, final int i2) {
        imeEditCommandScope.edit(new Function1() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit composingRegion$lambda$1;
                composingRegion$lambda$1 = ImeEditCommand_androidKt.setComposingRegion$lambda$1(i, i2, (TextFieldBuffer) obj);
                return composingRegion$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setComposingRegion$lambda$1(int i, int i2, TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.hasComposition$foundation_release()) {
            textFieldBuffer.commitComposition$foundation_release();
        }
        int coerceIn = RangesKt.coerceIn(i, 0, textFieldBuffer.getLength());
        int coerceIn2 = RangesKt.coerceIn(i2, 0, textFieldBuffer.getLength());
        if (coerceIn != coerceIn2) {
            if (coerceIn < coerceIn2) {
                TextFieldBuffer.setComposition$foundation_release$default(textFieldBuffer, coerceIn, coerceIn2, null, 4, null);
            } else {
                TextFieldBuffer.setComposition$foundation_release$default(textFieldBuffer, coerceIn2, coerceIn, null, 4, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void setComposingText$default(ImeEditCommandScope imeEditCommandScope, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            list = null;
        }
        setComposingText(imeEditCommandScope, str, i, list);
    }

    public static final void setComposingText(ImeEditCommandScope imeEditCommandScope, final String str, final int i, final List<AnnotatedString.Range<AnnotatedString.Annotation>> list) {
        imeEditCommandScope.edit(new Function1() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit composingText$lambda$2;
                composingText$lambda$2 = ImeEditCommand_androidKt.setComposingText$lambda$2(str, list, i, (TextFieldBuffer) obj);
                return composingText$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setComposingText$lambda$2(String str, List list, int i, TextFieldBuffer textFieldBuffer) {
        TextRange composition = textFieldBuffer.getComposition();
        if (composition != null) {
            String str2 = str;
            imeReplace(textFieldBuffer, TextRange.m7835getStartimpl(composition.getPackedValue()), TextRange.m7830getEndimpl(composition.getPackedValue()), str2);
            if (str2.length() > 0) {
                textFieldBuffer.setComposition$foundation_release(TextRange.m7835getStartimpl(composition.getPackedValue()), TextRange.m7835getStartimpl(composition.getPackedValue()) + str.length(), list);
            }
        } else {
            int m7835getStartimpl = TextRange.m7835getStartimpl(textFieldBuffer.getSelectionInChars());
            String str3 = str;
            imeReplace(textFieldBuffer, m7835getStartimpl, TextRange.m7830getEndimpl(textFieldBuffer.getSelectionInChars()), str3);
            if (str3.length() > 0) {
                textFieldBuffer.setComposition$foundation_release(m7835getStartimpl, str.length() + m7835getStartimpl, list);
            }
        }
        textFieldBuffer.m1435setSelection5zctL8(TextRangeKt.TextRange(RangesKt.coerceIn(i > 0 ? (r5 + i) - 1 : (TextRange.m7835getStartimpl(textFieldBuffer.getSelectionInChars()) + i) - str.length(), 0, textFieldBuffer.getLength())));
        return Unit.INSTANCE;
    }

    public static final void deleteSurroundingText(ImeEditCommandScope imeEditCommandScope, final int i, final int i2) {
        imeEditCommandScope.edit(new Function1() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit deleteSurroundingText$lambda$6;
                deleteSurroundingText$lambda$6 = ImeEditCommand_androidKt.deleteSurroundingText$lambda$6(i, i2, (TextFieldBuffer) obj);
                return deleteSurroundingText$lambda$6;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteSurroundingText$lambda$6(int i, int i2, TextFieldBuffer textFieldBuffer) {
        if (!(i >= 0 && i2 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
        }
        int m7830getEndimpl = TextRange.m7830getEndimpl(textFieldBuffer.getSelectionInChars());
        int i3 = m7830getEndimpl + i2;
        if (((i2 ^ i3) & (m7830getEndimpl ^ i3)) < 0) {
            i3 = textFieldBuffer.getLength();
        }
        imeDelete(textFieldBuffer, TextRange.m7830getEndimpl(textFieldBuffer.getSelectionInChars()), Math.min(i3, textFieldBuffer.getLength()));
        int m7835getStartimpl = TextRange.m7835getStartimpl(textFieldBuffer.getSelectionInChars());
        int i4 = m7835getStartimpl - i;
        if (((i ^ m7835getStartimpl) & (m7835getStartimpl ^ i4)) < 0) {
            i4 = 0;
        }
        imeDelete(textFieldBuffer, Math.max(0, i4), TextRange.m7835getStartimpl(textFieldBuffer.getSelectionInChars()));
        return Unit.INSTANCE;
    }

    public static final void deleteSurroundingTextInCodePoints(ImeEditCommandScope imeEditCommandScope, final int i, final int i2) {
        imeEditCommandScope.edit(new Function1() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit deleteSurroundingTextInCodePoints$lambda$8;
                deleteSurroundingTextInCodePoints$lambda$8 = ImeEditCommand_androidKt.deleteSurroundingTextInCodePoints$lambda$8(i, i2, (TextFieldBuffer) obj);
                return deleteSurroundingTextInCodePoints$lambda$8;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteSurroundingTextInCodePoints$lambda$8(int i, int i2, TextFieldBuffer textFieldBuffer) {
        int i3 = 0;
        if (!(i >= 0 && i2 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 < i) {
                int i6 = i5 + 1;
                if (TextRange.m7835getStartimpl(textFieldBuffer.getSelectionInChars()) > i6) {
                    i5 = isSurrogatePair(textFieldBuffer.asCharSequence().charAt((TextRange.m7835getStartimpl(textFieldBuffer.getSelectionInChars()) - i6) - 1), textFieldBuffer.asCharSequence().charAt(TextRange.m7835getStartimpl(textFieldBuffer.getSelectionInChars()) - i6)) ? i5 + 2 : i6;
                    i4++;
                } else {
                    i5 = TextRange.m7835getStartimpl(textFieldBuffer.getSelectionInChars());
                    break;
                }
            } else {
                break;
            }
        }
        int i7 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int i8 = i7 + 1;
            if (TextRange.m7830getEndimpl(textFieldBuffer.getSelectionInChars()) + i8 < textFieldBuffer.getLength()) {
                i7 = isSurrogatePair(textFieldBuffer.asCharSequence().charAt((TextRange.m7830getEndimpl(textFieldBuffer.getSelectionInChars()) + i8) - 1), textFieldBuffer.asCharSequence().charAt(TextRange.m7830getEndimpl(textFieldBuffer.getSelectionInChars()) + i8)) ? i7 + 2 : i8;
                i3++;
            } else {
                i7 = textFieldBuffer.getLength() - TextRange.m7830getEndimpl(textFieldBuffer.getSelectionInChars());
                break;
            }
        }
        imeDelete(textFieldBuffer, TextRange.m7830getEndimpl(textFieldBuffer.getSelectionInChars()), TextRange.m7830getEndimpl(textFieldBuffer.getSelectionInChars()) + i7);
        imeDelete(textFieldBuffer, TextRange.m7835getStartimpl(textFieldBuffer.getSelectionInChars()) - i5, TextRange.m7835getStartimpl(textFieldBuffer.getSelectionInChars()));
        return Unit.INSTANCE;
    }

    public static final void finishComposingText(ImeEditCommandScope imeEditCommandScope) {
        imeEditCommandScope.edit(new Function1() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit finishComposingText$lambda$9;
                finishComposingText$lambda$9 = ImeEditCommand_androidKt.finishComposingText$lambda$9((TextFieldBuffer) obj);
                return finishComposingText$lambda$9;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit finishComposingText$lambda$9(TextFieldBuffer textFieldBuffer) {
        textFieldBuffer.commitComposition$foundation_release();
        return Unit.INSTANCE;
    }

    public static final void setSelection(final ImeEditCommandScope imeEditCommandScope, final int i, final int i2) {
        imeEditCommandScope.edit(new Function1() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit selection$lambda$10;
                selection$lambda$10 = ImeEditCommand_androidKt.setSelection$lambda$10(ImeEditCommandScope.this, i, i2, (TextFieldBuffer) obj);
                return selection$lambda$10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSelection$lambda$10(ImeEditCommandScope imeEditCommandScope, int i, int i2, TextFieldBuffer textFieldBuffer) {
        long mo1474mapToTransformedGEjPoXI = imeEditCommandScope.mo1474mapToTransformedGEjPoXI(TextRangeKt.TextRange(0, textFieldBuffer.getLength()));
        int m7833getMinimpl = TextRange.m7833getMinimpl(mo1474mapToTransformedGEjPoXI);
        int m7832getMaximpl = TextRange.m7832getMaximpl(mo1474mapToTransformedGEjPoXI);
        if (i < m7833getMinimpl) {
            i = m7833getMinimpl;
        }
        if (i <= m7832getMaximpl) {
            m7832getMaximpl = i;
        }
        int m7833getMinimpl2 = TextRange.m7833getMinimpl(mo1474mapToTransformedGEjPoXI);
        int m7832getMaximpl2 = TextRange.m7832getMaximpl(mo1474mapToTransformedGEjPoXI);
        if (i2 < m7833getMinimpl2) {
            i2 = m7833getMinimpl2;
        }
        if (i2 <= m7832getMaximpl2) {
            m7832getMaximpl2 = i2;
        }
        textFieldBuffer.m1435setSelection5zctL8(imeEditCommandScope.mo1473mapFromTransformedGEjPoXI(TextRangeKt.TextRange(m7832getMaximpl, m7832getMaximpl2)));
        return Unit.INSTANCE;
    }

    private static final boolean isSurrogatePair(char c, char c2) {
        return Character.isHighSurrogate(c) && Character.isLowSurrogate(c2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r8 == r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        r6.commitComposition$foundation_release();
        r6.clearHighlight$foundation_release();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void imeReplace(TextFieldBuffer textFieldBuffer, int i, int i2, CharSequence charSequence) {
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        int i3 = 0;
        int i4 = min;
        while (i4 < max && i3 < charSequence.length() && charSequence.charAt(i3) == textFieldBuffer.asCharSequence().charAt(i4)) {
            i3++;
            i4++;
        }
        int length = charSequence.length();
        while (max > i4 && length > i3 && charSequence.charAt(length - 1) == textFieldBuffer.asCharSequence().charAt(max - 1)) {
            length--;
            max--;
        }
        textFieldBuffer.replace(i4, max, charSequence.subSequence(i3, length));
        textFieldBuffer.m1435setSelection5zctL8(TextRangeKt.TextRange(min + charSequence.length()));
    }

    public static final void imeDelete(TextFieldBuffer textFieldBuffer, int i, int i2) {
        TextRange composition = textFieldBuffer.getComposition();
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        TextFieldBufferKt.delete(textFieldBuffer, min, max);
        if (composition != null) {
            composition.getPackedValue();
            long m1439adjustTextRangevJH6DeI = TextFieldBufferKt.m1439adjustTextRangevJH6DeI(composition.getPackedValue(), min, max, 0);
            if (TextRange.m7829getCollapsedimpl(m1439adjustTextRangevJH6DeI)) {
                textFieldBuffer.commitComposition$foundation_release();
            } else {
                TextFieldBuffer.setComposition$foundation_release$default(textFieldBuffer, TextRange.m7833getMinimpl(m1439adjustTextRangevJH6DeI), TextRange.m7832getMaximpl(m1439adjustTextRangevJH6DeI), null, 4, null);
            }
        }
    }
}

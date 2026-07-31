package androidx.compose.ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.android.SpannedExtensions_androidKt;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.style.IndentationFixSpan;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;

/* compiled from: AndroidParagraph.android.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0005\u001a\u0017\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u0005\u001a\u0017\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0005\u001a\u0017\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0005\u001a\u0014\u0010\u0016\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001aH\u0002\u001a\f\u0010\u001e\u001a\u00020\u001f*\u00020\u001fH\u0002\u001a\u0013\u0010 \u001a\u00020\u0001*\u00020!H\u0002¢\u0006\u0004\b\"\u0010\u0005¨\u0006#"}, d2 = {"toLayoutAlign", "", "align", "Landroidx/compose/ui/text/style/TextAlign;", "toLayoutAlign-aXe7zB0", "(I)I", "toLayoutHyphenationFrequency", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "toLayoutHyphenationFrequency--3fSNIE", "toLayoutBreakStrategy", "breakStrategy", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "toLayoutBreakStrategy-xImikfE", "toLayoutLineBreakStyle", "lineBreakStrictness", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "toLayoutLineBreakStyle-hpcqdu8", "toLayoutLineBreakWordStyle", "lineBreakWordStyle", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "toLayoutLineBreakWordStyle-wPN0Rpw", "numberOfLinesThatFitMaxHeight", "Landroidx/compose/ui/text/android/TextLayout;", ViewProps.MAX_HEIGHT, "shouldAttachIndentationFixSpan", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "ellipsis", "attachIndentationFixSpan", "", "toLayoutTextGranularity", "Landroidx/compose/ui/text/TextGranularity;", "toLayoutTextGranularity-duNsdkg", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AndroidParagraph_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutAlign-aXe7zB0, reason: not valid java name */
    public static final int m7641toLayoutAlignaXe7zB0(int i) {
        if (TextAlign.m8253equalsimpl0(i, TextAlign.INSTANCE.m8260getLefte0LSkKk())) {
            return 3;
        }
        if (TextAlign.m8253equalsimpl0(i, TextAlign.INSTANCE.m8261getRighte0LSkKk())) {
            return 4;
        }
        if (TextAlign.m8253equalsimpl0(i, TextAlign.INSTANCE.m8257getCentere0LSkKk())) {
            return 2;
        }
        return (!TextAlign.m8253equalsimpl0(i, TextAlign.INSTANCE.m8262getStarte0LSkKk()) && TextAlign.m8253equalsimpl0(i, TextAlign.INSTANCE.m8258getEnde0LSkKk())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutHyphenationFrequency--3fSNIE, reason: not valid java name */
    public static final int m7643toLayoutHyphenationFrequency3fSNIE(int i) {
        if (Hyphens.m8151equalsimpl0(i, Hyphens.INSTANCE.m8155getAutovmbZdU8())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        Hyphens.m8151equalsimpl0(i, Hyphens.INSTANCE.m8156getNonevmbZdU8());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutBreakStrategy-xImikfE, reason: not valid java name */
    public static final int m7642toLayoutBreakStrategyxImikfE(int i) {
        if (LineBreak.Strategy.m8182equalsimpl0(i, LineBreak.Strategy.INSTANCE.m8188getSimplefcGXIks())) {
            return 0;
        }
        if (LineBreak.Strategy.m8182equalsimpl0(i, LineBreak.Strategy.INSTANCE.m8187getHighQualityfcGXIks())) {
            return 1;
        }
        return LineBreak.Strategy.m8182equalsimpl0(i, LineBreak.Strategy.INSTANCE.m8186getBalancedfcGXIks()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakStyle-hpcqdu8, reason: not valid java name */
    public static final int m7644toLayoutLineBreakStylehpcqdu8(int i) {
        if (LineBreak.Strictness.m8193equalsimpl0(i, LineBreak.Strictness.INSTANCE.m8197getDefaultusljTpc())) {
            return 0;
        }
        if (LineBreak.Strictness.m8193equalsimpl0(i, LineBreak.Strictness.INSTANCE.m8198getLooseusljTpc())) {
            return 1;
        }
        if (LineBreak.Strictness.m8193equalsimpl0(i, LineBreak.Strictness.INSTANCE.m8199getNormalusljTpc())) {
            return 2;
        }
        return LineBreak.Strictness.m8193equalsimpl0(i, LineBreak.Strictness.INSTANCE.m8200getStrictusljTpc()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakWordStyle-wPN0Rpw, reason: not valid java name */
    public static final int m7645toLayoutLineBreakWordStylewPN0Rpw(int i) {
        return (!LineBreak.WordBreak.m8205equalsimpl0(i, LineBreak.WordBreak.INSTANCE.m8209getDefaultjp8hJ3c()) && LineBreak.WordBreak.m8205equalsimpl0(i, LineBreak.WordBreak.INSTANCE.m8210getPhrasejp8hJ3c())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int numberOfLinesThatFitMaxHeight(TextLayout textLayout, int i) {
        int lineCount = textLayout.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            if (textLayout.getLineBottom(i2) > i) {
                return i2;
            }
        }
        return textLayout.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldAttachIndentationFixSpan(TextStyle textStyle, boolean z) {
        return (!z || TextUnit.m8592equalsimpl0(textStyle.m7871getLetterSpacingXSAIIZE(), TextUnitKt.getSp(0)) || TextUnit.m8592equalsimpl0(textStyle.m7871getLetterSpacingXSAIIZE(), TextUnit.INSTANCE.m8606getUnspecifiedXSAIIZE()) || TextAlign.m8253equalsimpl0(textStyle.m7876getTextAligne0LSkKk(), TextAlign.INSTANCE.m8263getUnspecifiede0LSkKk()) || TextAlign.m8253equalsimpl0(textStyle.m7876getTextAligne0LSkKk(), TextAlign.INSTANCE.m8262getStarte0LSkKk()) || TextAlign.m8253equalsimpl0(textStyle.m7876getTextAligne0LSkKk(), TextAlign.INSTANCE.m8259getJustifye0LSkKk())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence attachIndentationFixSpan(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        SpannableString spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannableString == null) {
            spannableString = new SpannableString(charSequence);
        }
        if (!SpannedExtensions_androidKt.hasSpan(spannableString, IndentationFixSpan.class)) {
            SpannableExtensions_androidKt.setSpan(spannableString, new IndentationFixSpan(), spannableString.length() - 1, spannableString.length() - 1);
        }
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutTextGranularity-duNsdkg, reason: not valid java name */
    public static final int m7646toLayoutTextGranularityduNsdkg(int i) {
        return (!TextGranularity.m7793equalsimpl0(i, TextGranularity.INSTANCE.m7797getCharacterDRrd7Zo()) && TextGranularity.m7793equalsimpl0(i, TextGranularity.INSTANCE.m7798getWordDRrd7Zo())) ? 1 : 0;
    }
}

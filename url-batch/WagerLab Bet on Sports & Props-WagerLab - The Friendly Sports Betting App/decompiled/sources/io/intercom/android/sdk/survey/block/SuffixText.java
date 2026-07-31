package io.intercom.android.sdk.survey.block;

import androidx.compose.ui.graphics.Color;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextBlock.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0019\u001a\u00020\u001aH×\u0001J\t\u0010\u001b\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u00020\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/survey/block/SuffixText;", "", "text", "", "ttsText", "color", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getText", "()Ljava/lang/String;", "getTtsText", "getColor-0d7_KjU", "()J", "J", "component1", "component2", "component3", "component3-0d7_KjU", "copy", "copy-mxwnekA", "(Ljava/lang/String;Ljava/lang/String;J)Lio/intercom/android/sdk/survey/block/SuffixText;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SuffixText {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final SuffixText NO_SUFFIX = new SuffixText("", "", Color.INSTANCE.m5683getBlack0d7_KjU(), null);
    private final long color;
    private final String text;
    private final String ttsText;

    public /* synthetic */ SuffixText(String str, String str2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j);
    }

    /* renamed from: copy-mxwnekA$default, reason: not valid java name */
    public static /* synthetic */ SuffixText m11737copymxwnekA$default(SuffixText suffixText, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = suffixText.text;
        }
        if ((i & 2) != 0) {
            str2 = suffixText.ttsText;
        }
        if ((i & 4) != 0) {
            j = suffixText.color;
        }
        return suffixText.m11739copymxwnekA(str, str2, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTtsText() {
        return this.ttsText;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: copy-mxwnekA, reason: not valid java name */
    public final SuffixText m11739copymxwnekA(String text, String ttsText, long color) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(ttsText, "ttsText");
        return new SuffixText(text, ttsText, color, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuffixText)) {
            return false;
        }
        SuffixText suffixText = (SuffixText) other;
        return Intrinsics.areEqual(this.text, suffixText.text) && Intrinsics.areEqual(this.ttsText, suffixText.ttsText) && Color.m5658equalsimpl0(this.color, suffixText.color);
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + this.ttsText.hashCode()) * 31) + Color.m5664hashCodeimpl(this.color);
    }

    public String toString() {
        return "SuffixText(text=" + this.text + ", ttsText=" + this.ttsText + ", color=" + ((Object) Color.m5665toStringimpl(this.color)) + ')';
    }

    private SuffixText(String text, String ttsText, long j) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(ttsText, "ttsText");
        this.text = text;
        this.ttsText = ttsText;
        this.color = j;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTtsText() {
        return this.ttsText;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m11740getColor0d7_KjU() {
        return this.color;
    }

    /* compiled from: TextBlock.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/survey/block/SuffixText$Companion;", "", "<init>", "()V", "NO_SUFFIX", "Lio/intercom/android/sdk/survey/block/SuffixText;", "getNO_SUFFIX", "()Lio/intercom/android/sdk/survey/block/SuffixText;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SuffixText getNO_SUFFIX() {
            return SuffixText.NO_SUFFIX;
        }
    }
}

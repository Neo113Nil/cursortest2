package io.intercom.android.sdk.survey;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: SurveyViewModel.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lio/intercom/android/sdk/survey/ProgressBarState;", "", "isVisible", "", "progress", "", "<init>", "(ZF)V", "()Z", "getProgress", "()F", "component1", "component2", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ProgressBarState {
    public static final int $stable = 0;
    private final boolean isVisible;
    private final float progress;

    public ProgressBarState() {
        this(false, 0.0f, 3, null);
    }

    public static /* synthetic */ ProgressBarState copy$default(ProgressBarState progressBarState, boolean z, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            z = progressBarState.isVisible;
        }
        if ((i & 2) != 0) {
            f = progressBarState.progress;
        }
        return progressBarState.copy(z, f);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    /* renamed from: component2, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    public final ProgressBarState copy(boolean isVisible, float progress) {
        return new ProgressBarState(isVisible, progress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressBarState)) {
            return false;
        }
        ProgressBarState progressBarState = (ProgressBarState) other;
        return this.isVisible == progressBarState.isVisible && Float.compare(this.progress, progressBarState.progress) == 0;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isVisible) * 31) + Float.hashCode(this.progress);
    }

    public String toString() {
        return "ProgressBarState(isVisible=" + this.isVisible + ", progress=" + this.progress + ')';
    }

    public ProgressBarState(boolean z, float f) {
        this.isVisible = z;
        this.progress = f;
    }

    public /* synthetic */ ProgressBarState(boolean z, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0.0f : f);
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final float getProgress() {
        return this.progress;
    }
}

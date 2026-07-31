package com.mobilefuse.sdk.state.mute;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdMutedState.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/mobilefuse/sdk/state/mute/AdMutedState;", "", "muted", "", "source", "Lcom/mobilefuse/sdk/state/mute/AdMutedStateSource;", "(ZLcom/mobilefuse/sdk/state/mute/AdMutedStateSource;)V", "getMuted", "()Z", "getSource", "()Lcom/mobilefuse/sdk/state/mute/AdMutedStateSource;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes13.dex */
public final /* data */ class AdMutedState {
    private final boolean muted;

    @NotNull
    private final AdMutedStateSource source;

    /* JADX WARN: Multi-variable type inference failed */
    public AdMutedState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AdMutedState copy$default(AdMutedState adMutedState, boolean z, AdMutedStateSource adMutedStateSource, int i, Object obj) {
        if ((i & 1) != 0) {
            z = adMutedState.muted;
        }
        if ((i & 2) != 0) {
            adMutedStateSource = adMutedState.source;
        }
        return adMutedState.copy(z, adMutedStateSource);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getMuted() {
        return this.muted;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AdMutedStateSource getSource() {
        return this.source;
    }

    @NotNull
    public final AdMutedState copy(boolean muted, @NotNull AdMutedStateSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new AdMutedState(muted, source);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdMutedState)) {
            return false;
        }
        AdMutedState adMutedState = (AdMutedState) other;
        return this.muted == adMutedState.muted && Intrinsics.areEqual(this.source, adMutedState.source);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.muted;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        AdMutedStateSource adMutedStateSource = this.source;
        return i + (adMutedStateSource != null ? adMutedStateSource.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdMutedState(muted=" + this.muted + ", source=" + this.source + ")";
    }

    public AdMutedState(boolean z, @NotNull AdMutedStateSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.muted = z;
        this.source = source;
    }

    public /* synthetic */ AdMutedState(boolean z, AdMutedStateSource adMutedStateSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? AdMutedStateSource.APP_USER : adMutedStateSource);
    }

    public final boolean getMuted() {
        return this.muted;
    }

    @NotNull
    public final AdMutedStateSource getSource() {
        return this.source;
    }
}

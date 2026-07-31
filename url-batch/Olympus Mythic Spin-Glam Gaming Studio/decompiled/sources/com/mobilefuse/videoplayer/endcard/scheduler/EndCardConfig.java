package com.mobilefuse.videoplayer.endcard.scheduler;

import com.mobilefuse.sdk.CloseConfigResponse;
import com.mobilefuse.videoplayer.model.VastCompanion;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EndCardConfig.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000fHÆ\u0003Ja\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010&\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006,"}, d2 = {"Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardConfig;", "", "companion", "Lcom/mobilefuse/videoplayer/model/VastCompanion;", "isClosable", "", "closeButtonDelaySeconds", "", "isThumbnailSize", "autoCloseAllowed", "Lkotlin/Function0;", "autoCloseDelayMillis", "", "allowClickthroughWithoutTap", "closeConfigResponse", "Lcom/mobilefuse/sdk/CloseConfigResponse;", "(Lcom/mobilefuse/videoplayer/model/VastCompanion;ZFZLkotlin/jvm/functions/Function0;JZLcom/mobilefuse/sdk/CloseConfigResponse;)V", "getAllowClickthroughWithoutTap", "()Z", "getAutoCloseAllowed", "()Lkotlin/jvm/functions/Function0;", "getAutoCloseDelayMillis", "()J", "getCloseButtonDelaySeconds", "()F", "getCloseConfigResponse", "()Lcom/mobilefuse/sdk/CloseConfigResponse;", "getCompanion", "()Lcom/mobilefuse/videoplayer/model/VastCompanion;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes6.dex */
public final /* data */ class EndCardConfig {
    private final boolean allowClickthroughWithoutTap;

    @NotNull
    private final Function0 autoCloseAllowed;
    private final long autoCloseDelayMillis;
    private final float closeButtonDelaySeconds;

    @Nullable
    private final CloseConfigResponse closeConfigResponse;

    @NotNull
    private final VastCompanion companion;
    private final boolean isClosable;
    private final boolean isThumbnailSize;

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final VastCompanion getCompanion() {
        return this.companion;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsClosable() {
        return this.isClosable;
    }

    /* renamed from: component3, reason: from getter */
    public final float getCloseButtonDelaySeconds() {
        return this.closeButtonDelaySeconds;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsThumbnailSize() {
        return this.isThumbnailSize;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Function0 getAutoCloseAllowed() {
        return this.autoCloseAllowed;
    }

    /* renamed from: component6, reason: from getter */
    public final long getAutoCloseDelayMillis() {
        return this.autoCloseDelayMillis;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getAllowClickthroughWithoutTap() {
        return this.allowClickthroughWithoutTap;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final CloseConfigResponse getCloseConfigResponse() {
        return this.closeConfigResponse;
    }

    @NotNull
    public final EndCardConfig copy(@NotNull VastCompanion companion, boolean isClosable, float closeButtonDelaySeconds, boolean isThumbnailSize, @NotNull Function0 autoCloseAllowed, long autoCloseDelayMillis, boolean allowClickthroughWithoutTap, @Nullable CloseConfigResponse closeConfigResponse) {
        Intrinsics.checkNotNullParameter(companion, "companion");
        Intrinsics.checkNotNullParameter(autoCloseAllowed, "autoCloseAllowed");
        return new EndCardConfig(companion, isClosable, closeButtonDelaySeconds, isThumbnailSize, autoCloseAllowed, autoCloseDelayMillis, allowClickthroughWithoutTap, closeConfigResponse);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EndCardConfig)) {
            return false;
        }
        EndCardConfig endCardConfig = (EndCardConfig) other;
        return Intrinsics.areEqual(this.companion, endCardConfig.companion) && this.isClosable == endCardConfig.isClosable && Float.compare(this.closeButtonDelaySeconds, endCardConfig.closeButtonDelaySeconds) == 0 && this.isThumbnailSize == endCardConfig.isThumbnailSize && Intrinsics.areEqual(this.autoCloseAllowed, endCardConfig.autoCloseAllowed) && this.autoCloseDelayMillis == endCardConfig.autoCloseDelayMillis && this.allowClickthroughWithoutTap == endCardConfig.allowClickthroughWithoutTap && Intrinsics.areEqual(this.closeConfigResponse, endCardConfig.closeConfigResponse);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        VastCompanion vastCompanion = this.companion;
        int hashCode = (vastCompanion != null ? vastCompanion.hashCode() : 0) * 31;
        boolean z = this.isClosable;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((hashCode + i) * 31) + Float.hashCode(this.closeButtonDelaySeconds)) * 31;
        boolean z2 = this.isThumbnailSize;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode2 + i2) * 31;
        Function0 function0 = this.autoCloseAllowed;
        int hashCode3 = (((i3 + (function0 != null ? function0.hashCode() : 0)) * 31) + Long.hashCode(this.autoCloseDelayMillis)) * 31;
        boolean z3 = this.allowClickthroughWithoutTap;
        int i4 = (hashCode3 + (z3 ? 1 : z3 ? 1 : 0)) * 31;
        CloseConfigResponse closeConfigResponse = this.closeConfigResponse;
        return i4 + (closeConfigResponse != null ? closeConfigResponse.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EndCardConfig(companion=" + this.companion + ", isClosable=" + this.isClosable + ", closeButtonDelaySeconds=" + this.closeButtonDelaySeconds + ", isThumbnailSize=" + this.isThumbnailSize + ", autoCloseAllowed=" + this.autoCloseAllowed + ", autoCloseDelayMillis=" + this.autoCloseDelayMillis + ", allowClickthroughWithoutTap=" + this.allowClickthroughWithoutTap + ", closeConfigResponse=" + this.closeConfigResponse + ")";
    }

    public EndCardConfig(@NotNull VastCompanion companion, boolean z, float f, boolean z2, @NotNull Function0 autoCloseAllowed, long j, boolean z3, @Nullable CloseConfigResponse closeConfigResponse) {
        Intrinsics.checkNotNullParameter(companion, "companion");
        Intrinsics.checkNotNullParameter(autoCloseAllowed, "autoCloseAllowed");
        this.companion = companion;
        this.isClosable = z;
        this.closeButtonDelaySeconds = f;
        this.isThumbnailSize = z2;
        this.autoCloseAllowed = autoCloseAllowed;
        this.autoCloseDelayMillis = j;
        this.allowClickthroughWithoutTap = z3;
        this.closeConfigResponse = closeConfigResponse;
    }

    @NotNull
    public final VastCompanion getCompanion() {
        return this.companion;
    }

    public final boolean isClosable() {
        return this.isClosable;
    }

    public final float getCloseButtonDelaySeconds() {
        return this.closeButtonDelaySeconds;
    }

    public final boolean isThumbnailSize() {
        return this.isThumbnailSize;
    }

    @NotNull
    public final Function0 getAutoCloseAllowed() {
        return this.autoCloseAllowed;
    }

    public final long getAutoCloseDelayMillis() {
        return this.autoCloseDelayMillis;
    }

    public /* synthetic */ EndCardConfig(VastCompanion vastCompanion, boolean z, float f, boolean z2, Function0 function0, long j, boolean z3, CloseConfigResponse closeConfigResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(vastCompanion, z, f, z2, function0, j, (i & 64) != 0 ? false : z3, closeConfigResponse);
    }

    public final boolean getAllowClickthroughWithoutTap() {
        return this.allowClickthroughWithoutTap;
    }

    @Nullable
    public final CloseConfigResponse getCloseConfigResponse() {
        return this.closeConfigResponse;
    }
}

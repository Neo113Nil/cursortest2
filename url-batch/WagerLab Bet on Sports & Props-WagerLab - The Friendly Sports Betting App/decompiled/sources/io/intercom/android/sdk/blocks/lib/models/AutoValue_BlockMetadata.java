package io.intercom.android.sdk.blocks.lib.models;

import io.intercom.android.sdk.models.carousel.Appearance;

/* loaded from: classes8.dex */
final class AutoValue_BlockMetadata extends BlockMetadata {
    private final Appearance appearance;
    private final boolean firstObject;
    private final boolean lastObject;

    AutoValue_BlockMetadata(boolean z, boolean z2, Appearance appearance) {
        this.firstObject = z;
        this.lastObject = z2;
        if (appearance == null) {
            throw new NullPointerException("Null appearance");
        }
        this.appearance = appearance;
    }

    @Override // io.intercom.android.sdk.blocks.lib.models.BlockMetadata
    public boolean isFirstObject() {
        return this.firstObject;
    }

    @Override // io.intercom.android.sdk.blocks.lib.models.BlockMetadata
    public boolean isLastObject() {
        return this.lastObject;
    }

    @Override // io.intercom.android.sdk.blocks.lib.models.BlockMetadata
    public Appearance getAppearance() {
        return this.appearance;
    }

    public String toString() {
        return "BlockMetadata{firstObject=" + this.firstObject + ", lastObject=" + this.lastObject + ", appearance=" + this.appearance + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BlockMetadata) {
            BlockMetadata blockMetadata = (BlockMetadata) obj;
            if (this.firstObject == blockMetadata.isFirstObject() && this.lastObject == blockMetadata.isLastObject() && this.appearance.equals(blockMetadata.getAppearance())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((this.firstObject ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.lastObject ? 1231 : 1237)) * 1000003) ^ this.appearance.hashCode();
    }
}

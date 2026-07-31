package io.bidmachine.rendering.model;

import io.bidmachine.rendering.model.MediaSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lio/bidmachine/rendering/model/Base64MediaSource;", "Lio/bidmachine/rendering/model/MediaSource;", "", "base64", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lio/bidmachine/rendering/model/Base64MediaSource;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "getBase64", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Base64MediaSource extends MediaSource {

    /* renamed from: b, reason: from kotlin metadata and from toString */
    private final String base64;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Base64MediaSource(@NotNull String base64) {
        super(MediaSource.DeliveryType.PRELOAD, null);
        Intrinsics.checkNotNullParameter(base64, "base64");
        this.base64 = base64;
    }

    public static /* synthetic */ Base64MediaSource copy$default(Base64MediaSource base64MediaSource, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = base64MediaSource.base64;
        }
        return base64MediaSource.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBase64() {
        return this.base64;
    }

    @NotNull
    public final Base64MediaSource copy(@NotNull String base64) {
        Intrinsics.checkNotNullParameter(base64, "base64");
        return new Base64MediaSource(base64);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Base64MediaSource) && Intrinsics.areEqual(this.base64, ((Base64MediaSource) other).base64);
    }

    @NotNull
    public final String getBase64() {
        return this.base64;
    }

    public int hashCode() {
        return this.base64.hashCode();
    }

    @NotNull
    public String toString() {
        return "Base64MediaSource(base64=" + this.base64 + ')';
    }
}

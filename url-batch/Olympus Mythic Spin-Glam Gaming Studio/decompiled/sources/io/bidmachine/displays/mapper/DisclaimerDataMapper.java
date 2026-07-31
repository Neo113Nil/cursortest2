package io.bidmachine.displays.mapper;

import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.internal.C6016k;
import io.bidmachine.util.UtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/bidmachine/displays/mapper/DisclaimerDataMapper;", "", "<init>", "()V", "Lcom/explorestack/protobuf/adcom/Ad$Display$Native$Asset;", "asset", "Lio/bidmachine/internal/k;", "map", "(Lcom/explorestack/protobuf/adcom/Ad$Display$Native$Asset;)Lio/bidmachine/internal/k;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class DisclaimerDataMapper {
    @Nullable
    public final C6016k map(@NotNull Ad.Display.Native.Asset asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        try {
            if (!asset.hasDisclaimer()) {
                return null;
            }
            Ad.Display.Native.Asset.DisclaimerAsset disclaimer = asset.getDisclaimer();
            String text = disclaimer.getText();
            Intrinsics.checkNotNullExpressionValue(text, "it.text");
            return new C6016k(text, UtilsKt.toRatio$default((Number) Integer.valueOf(disclaimer.getPercent()), 100.0f, 0.0f, 2, (Object) null));
        } catch (Throwable unused) {
            return null;
        }
    }
}

package io.bidmachine.displays.mapper;

import com.explorestack.protobuf.adcom.NativeAssetPosition;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/bidmachine/displays/mapper/PositionDataMapper;", "", "()V", "map", "Lio/bidmachine/PositionData;", "data", "Lcom/explorestack/protobuf/adcom/NativeAssetPosition;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class PositionDataMapper {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NativeAssetPosition.values().length];
            try {
                iArr[NativeAssetPosition.ASSET_POSITION_TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NativeAssetPosition.ASSET_POSITION_TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NativeAssetPosition.ASSET_POSITION_BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NativeAssetPosition.ASSET_POSITION_BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:17:0x0026
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @org.jetbrains.annotations.Nullable
    public final io.bidmachine.PositionData map(@org.jetbrains.annotations.NotNull com.explorestack.protobuf.adcom.NativeAssetPosition r2) {
        /*
            r1 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int[] r0 = io.bidmachine.displays.mapper.PositionDataMapper.WhenMappings.$EnumSwitchMapping$0     // Catch: java.lang.Throwable -> L26
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L26
            r2 = r0[r2]     // Catch: java.lang.Throwable -> L26
            r0 = 1
            if (r2 == r0) goto L23
            r0 = 2
            if (r2 == r0) goto L20
            r0 = 3
            if (r2 == r0) goto L1d
            r0 = 4
            if (r2 == r0) goto L1a
            goto L26
        L1a:
            io.bidmachine.PositionData r2 = io.bidmachine.PositionData.BottomRight     // Catch: java.lang.Throwable -> L26
            goto L27
        L1d:
            io.bidmachine.PositionData r2 = io.bidmachine.PositionData.BottomLeft     // Catch: java.lang.Throwable -> L26
            goto L27
        L20:
            io.bidmachine.PositionData r2 = io.bidmachine.PositionData.TopRight     // Catch: java.lang.Throwable -> L26
            goto L27
        L23:
            io.bidmachine.PositionData r2 = io.bidmachine.PositionData.TopLeft     // Catch: java.lang.Throwable -> L26
            goto L27
        L26:
            r2 = 0
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.displays.mapper.PositionDataMapper.map(com.explorestack.protobuf.adcom.NativeAssetPosition):io.bidmachine.PositionData");
    }
}

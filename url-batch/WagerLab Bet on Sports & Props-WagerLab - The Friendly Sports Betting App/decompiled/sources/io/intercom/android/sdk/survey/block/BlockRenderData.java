package io.intercom.android.sdk.survey.block;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.reactcommunity.rndatetimepicker.Common;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlockRenderData.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0007J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\b\u0017J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003JB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÇ\u0001¢\u0006\u0002\b\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010 \u001a\u00020!H×\u0001J\t\u0010\"\u001a\u00020#H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006$"}, d2 = {"Lio/intercom/android/sdk/survey/block/BlockRenderData;", "", "block", "Lio/intercom/android/sdk/blocks/lib/models/Block;", Common.TEXT_COLOR, "Landroidx/compose/ui/graphics/Color;", "headingTextStyle", "Lio/intercom/android/sdk/survey/block/BlockRenderTextStyle;", "subHeadingTextStyle", "paragraphTextStyle", "<init>", "(Lio/intercom/android/sdk/blocks/lib/models/Block;Landroidx/compose/ui/graphics/Color;Lio/intercom/android/sdk/survey/block/BlockRenderTextStyle;Lio/intercom/android/sdk/survey/block/BlockRenderTextStyle;Lio/intercom/android/sdk/survey/block/BlockRenderTextStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBlock", "()Lio/intercom/android/sdk/blocks/lib/models/Block;", "getTextColor-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "getHeadingTextStyle", "()Lio/intercom/android/sdk/survey/block/BlockRenderTextStyle;", "getSubHeadingTextStyle", "getParagraphTextStyle", "getTextStyle", "component1", "component2", "component2-QN2ZGVo", "component3", "component4", "component5", "copy", "copy-ZLcQsz0", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class BlockRenderData {
    public static final int $stable = 8;
    private final Block block;
    private final BlockRenderTextStyle headingTextStyle;
    private final BlockRenderTextStyle paragraphTextStyle;
    private final BlockRenderTextStyle subHeadingTextStyle;
    private final Color textColor;

    /* compiled from: BlockRenderData.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockType.values().length];
            try {
                iArr[BlockType.HEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockType.SUBHEADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlockType.PARAGRAPH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ BlockRenderData(Block block, Color color, BlockRenderTextStyle blockRenderTextStyle, BlockRenderTextStyle blockRenderTextStyle2, BlockRenderTextStyle blockRenderTextStyle3, DefaultConstructorMarker defaultConstructorMarker) {
        this(block, color, blockRenderTextStyle, blockRenderTextStyle2, blockRenderTextStyle3);
    }

    /* renamed from: copy-ZLcQsz0$default, reason: not valid java name */
    public static /* synthetic */ BlockRenderData m11697copyZLcQsz0$default(BlockRenderData blockRenderData, Block block, Color color, BlockRenderTextStyle blockRenderTextStyle, BlockRenderTextStyle blockRenderTextStyle2, BlockRenderTextStyle blockRenderTextStyle3, int i, Object obj) {
        if ((i & 1) != 0) {
            block = blockRenderData.block;
        }
        if ((i & 2) != 0) {
            color = blockRenderData.textColor;
        }
        if ((i & 4) != 0) {
            blockRenderTextStyle = blockRenderData.headingTextStyle;
        }
        if ((i & 8) != 0) {
            blockRenderTextStyle2 = blockRenderData.subHeadingTextStyle;
        }
        if ((i & 16) != 0) {
            blockRenderTextStyle3 = blockRenderData.paragraphTextStyle;
        }
        BlockRenderTextStyle blockRenderTextStyle4 = blockRenderTextStyle3;
        BlockRenderTextStyle blockRenderTextStyle5 = blockRenderTextStyle;
        return blockRenderData.m11699copyZLcQsz0(block, color, blockRenderTextStyle5, blockRenderTextStyle2, blockRenderTextStyle4);
    }

    /* renamed from: component1, reason: from getter */
    public final Block getBlock() {
        return this.block;
    }

    /* renamed from: component2-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getTextColor() {
        return this.textColor;
    }

    /* renamed from: component3, reason: from getter */
    public final BlockRenderTextStyle getHeadingTextStyle() {
        return this.headingTextStyle;
    }

    /* renamed from: component4, reason: from getter */
    public final BlockRenderTextStyle getSubHeadingTextStyle() {
        return this.subHeadingTextStyle;
    }

    /* renamed from: component5, reason: from getter */
    public final BlockRenderTextStyle getParagraphTextStyle() {
        return this.paragraphTextStyle;
    }

    /* renamed from: copy-ZLcQsz0, reason: not valid java name */
    public final BlockRenderData m11699copyZLcQsz0(Block block, Color textColor, BlockRenderTextStyle headingTextStyle, BlockRenderTextStyle subHeadingTextStyle, BlockRenderTextStyle paragraphTextStyle) {
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(headingTextStyle, "headingTextStyle");
        Intrinsics.checkNotNullParameter(subHeadingTextStyle, "subHeadingTextStyle");
        Intrinsics.checkNotNullParameter(paragraphTextStyle, "paragraphTextStyle");
        return new BlockRenderData(block, textColor, headingTextStyle, subHeadingTextStyle, paragraphTextStyle, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockRenderData)) {
            return false;
        }
        BlockRenderData blockRenderData = (BlockRenderData) other;
        return Intrinsics.areEqual(this.block, blockRenderData.block) && Intrinsics.areEqual(this.textColor, blockRenderData.textColor) && Intrinsics.areEqual(this.headingTextStyle, blockRenderData.headingTextStyle) && Intrinsics.areEqual(this.subHeadingTextStyle, blockRenderData.subHeadingTextStyle) && Intrinsics.areEqual(this.paragraphTextStyle, blockRenderData.paragraphTextStyle);
    }

    public int hashCode() {
        int hashCode = this.block.hashCode() * 31;
        Color color = this.textColor;
        return ((((((hashCode + (color == null ? 0 : Color.m5664hashCodeimpl(color.m5667unboximpl()))) * 31) + this.headingTextStyle.hashCode()) * 31) + this.subHeadingTextStyle.hashCode()) * 31) + this.paragraphTextStyle.hashCode();
    }

    public String toString() {
        return "BlockRenderData(block=" + this.block + ", textColor=" + this.textColor + ", headingTextStyle=" + this.headingTextStyle + ", subHeadingTextStyle=" + this.subHeadingTextStyle + ", paragraphTextStyle=" + this.paragraphTextStyle + ')';
    }

    private BlockRenderData(Block block, Color color, BlockRenderTextStyle headingTextStyle, BlockRenderTextStyle subHeadingTextStyle, BlockRenderTextStyle paragraphTextStyle) {
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(headingTextStyle, "headingTextStyle");
        Intrinsics.checkNotNullParameter(subHeadingTextStyle, "subHeadingTextStyle");
        Intrinsics.checkNotNullParameter(paragraphTextStyle, "paragraphTextStyle");
        this.block = block;
        this.textColor = color;
        this.headingTextStyle = headingTextStyle;
        this.subHeadingTextStyle = subHeadingTextStyle;
        this.paragraphTextStyle = paragraphTextStyle;
    }

    public final Block getBlock() {
        return this.block;
    }

    /* renamed from: getTextColor-QN2ZGVo, reason: not valid java name */
    public final Color m11700getTextColorQN2ZGVo() {
        return this.textColor;
    }

    public /* synthetic */ BlockRenderData(Block block, Color color, BlockRenderTextStyle blockRenderTextStyle, BlockRenderTextStyle blockRenderTextStyle2, BlockRenderTextStyle blockRenderTextStyle3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(block, (i & 2) != 0 ? null : color, (i & 4) != 0 ? new BlockRenderTextStyle(TextUnitKt.getSp(48), FontWeight.INSTANCE.getBold(), TextUnitKt.getSp(56), null, null, null, 56, null) : blockRenderTextStyle, (i & 8) != 0 ? new BlockRenderTextStyle(TextUnitKt.getSp(36), FontWeight.INSTANCE.getSemiBold(), TextUnitKt.getSp(44), null, null, null, 56, null) : blockRenderTextStyle2, (i & 16) != 0 ? BlockRenderTextStyle.INSTANCE.getParagraphDefault() : blockRenderTextStyle3, null);
    }

    public final BlockRenderTextStyle getHeadingTextStyle() {
        return this.headingTextStyle;
    }

    public final BlockRenderTextStyle getSubHeadingTextStyle() {
        return this.subHeadingTextStyle;
    }

    public final BlockRenderTextStyle getParagraphTextStyle() {
        return this.paragraphTextStyle;
    }

    public final BlockRenderTextStyle getTextStyle() {
        BlockType type = this.block.getType();
        int i = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return this.headingTextStyle;
        }
        if (i == 2) {
            return this.subHeadingTextStyle;
        }
        if (i == 3) {
            return this.paragraphTextStyle;
        }
        return BlockRenderTextStyle.INSTANCE.getParagraphDefault();
    }
}

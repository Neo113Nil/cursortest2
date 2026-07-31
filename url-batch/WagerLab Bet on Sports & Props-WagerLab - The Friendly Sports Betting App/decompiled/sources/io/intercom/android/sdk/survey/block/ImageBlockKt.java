package io.intercom.android.sdk.survey.block;

import android.net.Uri;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import coil.compose.AsyncImagePainter;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.blocks.lib.models.Block;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageBlock.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\u001aK\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\"\u0018\u0010\r\u001a\u00020\t*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002"}, d2 = {"ImageBlock", "", "block", "Lio/intercom/android/sdk/blocks/lib/models/Block;", "modifier", "Landroidx/compose/ui/Modifier;", ViewProps.ON_CLICK, "Lkotlin/Function1;", "shouldLoadPreviewUrl", "", "renderType", "Lio/intercom/android/sdk/survey/block/ImageRenderType;", "(Lio/intercom/android/sdk/blocks/lib/models/Block;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;ZLio/intercom/android/sdk/survey/block/ImageRenderType;Landroidx/compose/runtime/Composer;II)V", "hasUri", "getHasUri", "(Lio/intercom/android/sdk/blocks/lib/models/Block;)Z", "intercom-sdk-base_release", "state", "Lcoil/compose/AsyncImagePainter$State;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ImageBlockKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ImageBlock$lambda$3(Block block, Modifier modifier, Function1 function1, boolean z, ImageRenderType imageRenderType, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(block, "$block");
        ImageBlock(block, modifier, function1, z, imageRenderType, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void ImageBlock(final Block block, Modifier modifier, Function1<? super Block, Unit> function1, boolean z, ImageRenderType imageRenderType, Composer composer, final int i, final int i2) {
        Uri parse;
        String previewUrl;
        Intrinsics.checkNotNullParameter(block, "block");
        Composer startRestartGroup = composer.startRestartGroup(-762701011);
        Modifier.Companion companion = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        Function1<? super Block, Unit> function12 = (i2 & 4) != 0 ? null : function1;
        boolean z2 = false;
        boolean z3 = (i2 & 8) != 0 ? false : z;
        ImageRenderType imageRenderType2 = (i2 & 16) != 0 ? ImageRenderType.CROPPED : imageRenderType;
        if (!getHasUri(block) && z3 && (previewUrl = block.getPreviewUrl()) != null && previewUrl.length() != 0) {
            z2 = true;
        }
        if (getHasUri(block)) {
            parse = block.getLocalUri();
        } else if (z2) {
            parse = Uri.parse(block.getPreviewUrl());
        } else {
            String url = block.getUrl();
            if (url == null) {
                url = "";
            }
            parse = Uri.parse(url);
        }
        String path = parse.getPath();
        startRestartGroup.startReplaceGroup(2072019078);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AsyncImagePainter.State.Empty.INSTANCE, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceGroup();
        final Modifier modifier2 = companion;
        ImageBlockKt$ImageBlock$1 imageBlockKt$ImageBlock$1 = new ImageBlockKt$ImageBlock$1(block, imageRenderType2, path, parse, modifier2, (MutableState) rememberedValue, function12);
        final Function1<? super Block, Unit> function13 = function12;
        final ImageRenderType imageRenderType3 = imageRenderType2;
        BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.rememberComposableLambda(-179054825, true, imageBlockKt$ImageBlock$1, startRestartGroup, 54), startRestartGroup, ((i >> 3) & 14) | 3072, 6);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final boolean z4 = z3;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.block.ImageBlockKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ImageBlock$lambda$3;
                    ImageBlock$lambda$3 = ImageBlockKt.ImageBlock$lambda$3(Block.this, modifier2, function13, z4, imageRenderType3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ImageBlock$lambda$3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AsyncImagePainter.State ImageBlock$lambda$1(MutableState<AsyncImagePainter.State> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHasUri(Block block) {
        return (block.getLocalUri() == null || Intrinsics.areEqual(block.getLocalUri(), Uri.EMPTY)) ? false : true;
    }
}

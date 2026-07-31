package expo.modules.devmenu.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BindingView.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class BindingView$1$1$1$1$1 extends AdaptedFunctionReference implements Function1<DevMenuAction, Unit> {
    BindingView$1$1$1$1$1(Object obj) {
        super(1, obj, DevMenuViewModel.class, "onAction", "onAction(Lexpo/modules/devmenu/compose/DevMenuAction;)Lkotlin/Unit;", 8);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DevMenuAction devMenuAction) {
        invoke2(devMenuAction);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DevMenuAction p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((DevMenuViewModel) this.receiver).onAction(p0);
    }
}

package kotlin.reflect.jvm.internal.impl.resolve;

import defpackage.FloatingActionButtonContentKt$FloatingActionButtonContent$4$$ExternalSyntheticLambda1;
import defpackage.FloatingActionButtonContentKt$FloatingActionButtonContent$4$1$1$1$1;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* compiled from: overridingUtils.kt */
/* loaded from: classes8.dex */
public final class OverridingUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <H> Collection<H> selectMostSpecificInEachOverridableGroup(Collection<? extends H> collection, Function1<? super H, ? extends CallableDescriptor> descriptorByHandle) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        SmartSet create = SmartSet.Companion.create();
        while (true) {
            LinkedList linkedList2 = linkedList;
            if (!linkedList2.isEmpty()) {
                Object first = CollectionsKt.first((List<? extends Object>) linkedList);
                final SmartSet create2 = SmartSet.Companion.create();
                Collection<FloatingActionButtonContentKt$FloatingActionButtonContent$4$$ExternalSyntheticLambda1> extractMembersOverridableInBothWays = OverridingUtil.extractMembersOverridableInBothWays(first, linkedList2, descriptorByHandle, new Function1(create2) { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt$$Lambda$1
                    private final SmartSet arg$0;

                    {
                        this.arg$0 = create2;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Object invoke(Object obj) {
                        Unit selectMostSpecificInEachOverridableGroup$lambda$2;
                        selectMostSpecificInEachOverridableGroup$lambda$2 = OverridingUtilsKt.selectMostSpecificInEachOverridableGroup$lambda$2(this.arg$0, obj);
                        return selectMostSpecificInEachOverridableGroup$lambda$2;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(extractMembersOverridableInBothWays, "extractMembersOverridableInBothWays(...)");
                if (extractMembersOverridableInBothWays.size() == 1 && create2.isEmpty()) {
                    Object single = CollectionsKt.single(extractMembersOverridableInBothWays);
                    Intrinsics.checkNotNullExpressionValue(single, "single(...)");
                    create.add(single);
                } else {
                    FloatingActionButtonContentKt$FloatingActionButtonContent$4$1$1$1$1 floatingActionButtonContentKt$FloatingActionButtonContent$4$1$1$1$1 = (Object) OverridingUtil.selectMostSpecificMember(extractMembersOverridableInBothWays, descriptorByHandle);
                    CallableDescriptor invoke = descriptorByHandle.invoke(floatingActionButtonContentKt$FloatingActionButtonContent$4$1$1$1$1);
                    for (FloatingActionButtonContentKt$FloatingActionButtonContent$4$$ExternalSyntheticLambda1 floatingActionButtonContentKt$FloatingActionButtonContent$4$$ExternalSyntheticLambda1 : extractMembersOverridableInBothWays) {
                        Intrinsics.checkNotNull(floatingActionButtonContentKt$FloatingActionButtonContent$4$$ExternalSyntheticLambda1);
                        if (!OverridingUtil.isMoreSpecific(invoke, descriptorByHandle.invoke(floatingActionButtonContentKt$FloatingActionButtonContent$4$$ExternalSyntheticLambda1))) {
                            create2.add(floatingActionButtonContentKt$FloatingActionButtonContent$4$$ExternalSyntheticLambda1);
                        }
                    }
                    SmartSet smartSet = create2;
                    if (!smartSet.isEmpty()) {
                        create.addAll(smartSet);
                    }
                    create.add(floatingActionButtonContentKt$FloatingActionButtonContent$4$1$1$1$1);
                }
            } else {
                return create;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectMostSpecificInEachOverridableGroup$lambda$2(SmartSet smartSet, Object obj) {
        Intrinsics.checkNotNull(obj);
        smartSet.add(obj);
        return Unit.INSTANCE;
    }
}

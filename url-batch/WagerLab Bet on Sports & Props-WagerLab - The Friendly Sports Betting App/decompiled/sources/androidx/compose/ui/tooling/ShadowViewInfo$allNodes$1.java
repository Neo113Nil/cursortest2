package androidx.compose.ui.tooling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

/* compiled from: ShadowViewInfo.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Landroidx/compose/ui/tooling/ShadowViewInfo;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.tooling.ShadowViewInfo$allNodes$1", f = "ShadowViewInfo.android.kt", i = {0, 1}, l = {43, 44}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence"}, s = {"L$0", "L$0"})
/* loaded from: classes2.dex */
final class ShadowViewInfo$allNodes$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super ShadowViewInfo>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ShadowViewInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShadowViewInfo$allNodes$1(ShadowViewInfo shadowViewInfo, Continuation<? super ShadowViewInfo$allNodes$1> continuation) {
        super(2, continuation);
        this.this$0 = shadowViewInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShadowViewInfo$allNodes$1 shadowViewInfo$allNodes$1 = new ShadowViewInfo$allNodes$1(this.this$0, continuation);
        shadowViewInfo$allNodes$1.L$0 = obj;
        return shadowViewInfo$allNodes$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super ShadowViewInfo> sequenceScope, Continuation<? super Unit> continuation) {
        return ((ShadowViewInfo$allNodes$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        if (r1.yield(r5.this$0, r5) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0079  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SequenceScope sequenceScope;
        SequenceScope sequenceScope2;
        Iterator it;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.L$0;
            this.L$0 = sequenceScope;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$1;
                sequenceScope2 = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                while (it.hasNext()) {
                    ShadowViewInfo shadowViewInfo = (ShadowViewInfo) it.next();
                    this.L$0 = sequenceScope2;
                    this.L$1 = it;
                    this.label = 2;
                    if (sequenceScope2.yield(shadowViewInfo, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            sequenceScope = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        List<ShadowViewInfo> children = this.this$0.getChildren();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = children.iterator();
        while (it2.hasNext()) {
            CollectionsKt.addAll(arrayList, ((ShadowViewInfo) it2.next()).getAllNodes());
        }
        Iterator it3 = arrayList.iterator();
        sequenceScope2 = sequenceScope;
        it = it3;
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }
}

package yads;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes14.dex */
public final class q42 extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ u42 c;
    public final /* synthetic */ dz1 d;
    public final /* synthetic */ ri2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q42(u42 u42Var, dz1 dz1Var, ri2 ri2Var, Continuation continuation) {
        super(2, continuation);
        this.c = u42Var;
        this.d = dz1Var;
        this.e = ri2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new q42(this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q42) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0111 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        Object m8023constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            m42 m42Var = this.c.a;
            dz1 dz1Var = this.d;
            ri2 ri2Var = this.e;
            this.b = 1;
            j31 j31Var = (j31) m42Var.g.invoke(ri2Var);
            c41 c41Var = m42Var.f;
            c41Var.getClass();
            t8 t8Var = dz1Var.b;
            s12 s12Var = dz1Var.a;
            List list = s12Var.a;
            x31 x31Var = c41Var.a;
            x31Var.getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(linkedHashSet, x31Var.a(((ry1) it.next()).b));
            }
            c41Var.a.getClass();
            List list2 = s12Var.f;
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                Iterable iterable = ((ri0) it2.next()).d;
                if (iterable == null) {
                    iterable = CollectionsKt.emptyList();
                }
                CollectionsKt.addAll(linkedHashSet2, iterable);
            }
            Set plus = SetsKt.plus((Set) linkedHashSet, (Iterable) linkedHashSet2);
            p72 p72Var = c41Var.b;
            p72Var.getClass();
            Set set = SequencesKt.toSet(SequencesKt.mapNotNull(SequencesKt.mapNotNull(SequencesKt.flatMapIterable(CollectionsKt.asSequence(s12Var.a), new m72(p72Var)), n72.b), o72.b));
            Set plus2 = SetsKt.plus(plus, (Iterable) set);
            if (!t8Var.B) {
                plus = null;
            }
            if (plus == null) {
                plus = SetsKt.emptySet();
            }
            Set plus3 = SetsKt.plus(set, (Iterable) plus);
            HashSet hashSet = new HashSet();
            for (Object obj2 : plus3) {
                if (((q31) obj2).f) {
                    hashSet.add(obj2);
                }
            }
            Set minus = SetsKt.minus(plus2, (Iterable) hashSet);
            j31Var.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : plus2) {
                if (((q31) obj3).g != null && (!StringsKt.isBlank(r13))) {
                    arrayList.add(obj3);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                q31 q31Var = (q31) it3.next();
                ri2 ri2Var2 = j31Var.a;
                ri2Var2.getClass();
                String str = q31Var.g;
                qi2 qi2Var = str != null ? new qi2(str, new j03(q31Var.a, q31Var.b)) : null;
                if ((qi2Var != null ? (Bitmap) ri2Var2.c.get(qi2Var) : null) == null && j31Var.a.a(q31Var) == null) {
                    i31 i31Var = j31Var.b;
                    i31Var.getClass();
                    String str2 = q31Var.g;
                    if (str2 != null) {
                        i31Var.a.getClass();
                        Bitmap a = xi2.a(str2);
                        if (a != null) {
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                m8023constructorimpl = Result.m8023constructorimpl(i31Var.b.a(a, q31Var));
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.INSTANCE;
                                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                            }
                            if (Result.m8028isFailureimpl(m8023constructorimpl)) {
                                m8023constructorimpl = null;
                            }
                            bitmap = (Bitmap) m8023constructorimpl;
                        } else {
                            bitmap = null;
                        }
                        if (bitmap != null) {
                            i31Var.c.getClass();
                            try {
                                bitmap = aq.a(bitmap, 1.0d);
                            } catch (Throwable unused) {
                            }
                            if (bitmap == null) {
                                ri2 ri2Var3 = j31Var.a;
                                ri2Var3.getClass();
                                String str3 = q31Var.g;
                                qi2 qi2Var2 = str3 != null ? new qi2(str3, new j03(q31Var.a, q31Var.b)) : null;
                                if (qi2Var2 != null) {
                                    ri2Var3.c.put(qi2Var2, bitmap);
                                }
                            }
                        }
                    }
                    bitmap = null;
                    if (bitmap == null) {
                    }
                }
            }
            String str4 = dz1Var.b.w;
            g42 g42Var = g42.c;
            if (Intrinsics.areEqual(str4, "loading_on_back")) {
                z21 z21Var = m42Var.e;
                z21Var.getClass();
                BuildersKt__Builders_commonKt.launch$default(m42Var.a, null, null, new l42(FlowKt.callbackFlow(new w21(z21Var, minus, null)), ri2Var, null), 3, null);
            }
            Object a2 = m42Var.a(hashSet, ri2Var, dz1Var, this);
            if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                a2 = Unit.INSTANCE;
            }
            if (a2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}

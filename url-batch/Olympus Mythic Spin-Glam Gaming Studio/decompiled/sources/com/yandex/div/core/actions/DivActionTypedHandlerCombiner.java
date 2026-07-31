package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.KLog;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div2.DivActionTyped;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivActionTypedHandlerCombiner.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedHandlerCombiner;", "", "", "Lcom/yandex/div/core/actions/DivActionTypedHandler;", "handlers", "<init>", "(Ljava/util/Set;)V", "", "scopeId", "Lcom/yandex/div2/DivActionTyped;", "action", "Lcom/yandex/div/core/view2/Div2View;", "div2View", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "handleAction", "(Ljava/lang/String;Lcom/yandex/div2/DivActionTyped;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "Ljava/util/Set;", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DivActionTypedHandlerCombiner {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String TAG = "DivTypedActionHandlerCombiner";

    @NotNull
    private final Set<DivActionTypedHandler> handlers;

    public DivActionTypedHandlerCombiner(@NotNull Set<DivActionTypedHandler> set) {
        this.handlers = set;
    }

    public final boolean handleAction(@Nullable String scopeId, @NotNull DivActionTyped action, @NotNull Div2View div2View, @NotNull ExpressionResolver resolver) {
        Object obj;
        Iterator<T> it = this.handlers.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((DivActionTypedHandler) obj).handleAction(scopeId, action, div2View, resolver)) {
                break;
            }
        }
        boolean z = obj != null;
        if (!z) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.DEBUG)) {
                kLog.print(3, TAG, "Unexpected " + action.getClass() + " was not handled");
            }
        }
        return z;
    }

    /* compiled from: DivActionTypedHandlerCombiner.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedHandlerCombiner$Companion;", "", "()V", "TAG", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

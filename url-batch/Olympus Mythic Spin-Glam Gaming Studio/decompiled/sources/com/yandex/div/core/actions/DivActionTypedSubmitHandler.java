package com.yandex.div.core.actions;

import android.net.Uri;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivRequestExecutor;
import com.yandex.div.core.expression.RuntimeStoreProviderKt;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.evaluable.MissingVariableException;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.DivTreeVisitor;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivActionSubmit;
import com.yandex.div2.DivActionTyped;
import com.yandex.div2.DivData;
import com.yandex.div2.DivVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivActionTypedSubmitHandler.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J:\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J*\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedSubmitHandler;", "Lcom/yandex/div/core/actions/DivActionTypedHandler;", "requestExecutor", "Lcom/yandex/div/core/DivRequestExecutor;", "(Lcom/yandex/div/core/DivRequestExecutor;)V", "createBody", "", "container", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "view", "Lcom/yandex/div/core/view2/Div2View;", "createCallback", "Lcom/yandex/div/core/DivRequestExecutor$Callback;", "onSuccessActions", "", "Lcom/yandex/div2/DivAction;", "onFailActions", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "handleAction", "", "scopeId", "action", "Lcom/yandex/div2/DivActionTyped;", "ContainerFinder", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DivActionTypedSubmitHandler implements DivActionTypedHandler {

    @NotNull
    private final DivRequestExecutor requestExecutor;

    public DivActionTypedSubmitHandler(@NotNull DivRequestExecutor divRequestExecutor) {
        this.requestExecutor = divRequestExecutor;
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String scopeId, @NotNull DivActionTyped action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        DivActionSubmit value;
        DivItemBuilderResult findContainer;
        ArrayList arrayList = null;
        DivActionTyped.Submit submit = action instanceof DivActionTyped.Submit ? (DivActionTyped.Submit) action : null;
        if (submit == null || (value = submit.getValue()) == null || (findContainer = new ContainerFinder((String) value.containerId.evaluate(resolver)).findContainer(view)) == null) {
            return false;
        }
        List list = value.request.headers;
        if (list != null) {
            List<DivActionSubmit.Request.Header> list2 = list;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (DivActionSubmit.Request.Header header : list2) {
                arrayList.add(new DivRequestExecutor.Header((String) header.name.evaluate(resolver), (String) header.value.evaluate(resolver)));
            }
        }
        view.addLoadReference(this.requestExecutor.execute(new DivRequestExecutor.Request((Uri) value.request.url.evaluate(resolver), ((DivActionSubmit.Request.Method) value.request.method.evaluate(resolver)).toString(), arrayList, createBody(findContainer, view)), createCallback(value.onSuccessActions, value.onFailActions, view, resolver)), view);
        return true;
    }

    private final String createBody(DivItemBuilderResult container, Div2View view) {
        VariableController variableController;
        List variables = container.getDiv().value().getVariables();
        List list = variables;
        if (list == null || list.isEmpty() || (variableController = UtilsKt.getVariableController(container.getExpressionResolver())) == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        Iterator it = variables.iterator();
        while (it.hasNext()) {
            String name = RuntimeStoreProviderKt.getName((DivVariable) it.next());
            Object obj = variableController.get(name);
            if (obj == null || jSONObject.put(name, obj) == null) {
                DivActionTypedUtilsKt.logError(view, new MissingVariableException(name, null, 2, null));
                Unit unit = Unit.INSTANCE;
            }
        }
        return jSONObject.toString();
    }

    private final DivRequestExecutor.Callback createCallback(final List<DivAction> onSuccessActions, final List<DivAction> onFailActions, final Div2View view, final ExpressionResolver resolver) {
        List<DivAction> list;
        List<DivAction> list2 = onSuccessActions;
        if ((list2 == null || list2.isEmpty()) && ((list = onFailActions) == null || list.isEmpty())) {
            return null;
        }
        return new DivRequestExecutor.Callback() { // from class: com.yandex.div.core.actions.DivActionTypedSubmitHandler$createCallback$1
            @Override // com.yandex.div.core.DivRequestExecutor.Callback
            public void onSuccess() {
                List<DivAction> list3 = onSuccessActions;
                if (list3 != null) {
                    handle(list3);
                }
            }

            @Override // com.yandex.div.core.DivRequestExecutor.Callback
            public void onFail() {
                List<DivAction> list3 = onFailActions;
                if (list3 != null) {
                    handle(list3);
                }
            }

            private final void handle(final List<DivAction> list3) {
                final Div2View div2View = view;
                final ExpressionResolver expressionResolver = resolver;
                div2View.bulkActions$div_release(new Function0() { // from class: com.yandex.div.core.actions.DivActionTypedSubmitHandler$createCallback$1$handle$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        List<DivAction> list4 = list3;
                        Div2View div2View2 = div2View;
                        ExpressionResolver expressionResolver2 = expressionResolver;
                        Iterator<T> it = list4.iterator();
                        while (it.hasNext()) {
                            div2View2.handleAction((DivAction) it.next(), DivActionHandler.DivActionReason.SUBMIT, expressionResolver2);
                        }
                    }
                });
            }
        };
    }

    /* compiled from: DivActionTypedSubmitHandler.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J \u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u0012R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedSubmitHandler$ContainerFinder;", "Lcom/yandex/div/internal/core/DivTreeVisitor;", "", "id", "", "(Ljava/lang/String;)V", "containers", "", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "defaultVisit", "data", "Lcom/yandex/div2/Div;", "context", "Lcom/yandex/div/core/view2/BindingContext;", "path", "Lcom/yandex/div/core/state/DivStatePath;", "findContainer", "view", "Lcom/yandex/div/core/view2/Div2View;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class ContainerFinder extends DivTreeVisitor<Unit> {

        @NotNull
        private final List<DivItemBuilderResult> containers;

        @NotNull
        private final String id;

        public ContainerFinder(@NotNull String str) {
            super(null, 1, null);
            this.id = str;
            this.containers = new ArrayList();
        }

        @Override // com.yandex.div.internal.core.DivTreeVisitor
        public /* bridge */ /* synthetic */ Unit defaultVisit(Div div, BindingContext bindingContext, DivStatePath divStatePath) {
            defaultVisit2(div, bindingContext, divStatePath);
            return Unit.INSTANCE;
        }

        @Nullable
        public final DivItemBuilderResult findContainer(@NotNull Div2View view) {
            DivData divData = view.getDivData();
            if (divData == null) {
                return null;
            }
            for (DivData.State state : divData.states) {
                visit(state.div, view.getBindingContext(), DivStatePath.INSTANCE.fromState$div_release(state));
            }
            if (this.containers.isEmpty()) {
                DivActionTypedUtilsKt.logError(view, new RuntimeException("Error resolving container. Elements that respond to id '" + this.id + "' are not found."));
                return null;
            }
            if (this.containers.size() > 1) {
                DivActionTypedUtilsKt.logError(view, new RuntimeException("Error resolving container. Found multiple elements that respond to id '" + this.id + "'."));
                return null;
            }
            return (DivItemBuilderResult) CollectionsKt.first((List) this.containers);
        }

        /* renamed from: defaultVisit, reason: avoid collision after fix types in other method */
        protected void defaultVisit2(@NotNull Div data, @NotNull BindingContext context, @NotNull DivStatePath path) {
            if (Intrinsics.areEqual(data.value().getId(), this.id)) {
                this.containers.add(DivCollectionExtensionsKt.toItemBuilderResult(data, context.getExpressionResolver()));
            }
        }
    }
}

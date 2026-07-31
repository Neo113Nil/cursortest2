package com.yandex.div.core.view2.errors;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.widget.Toast;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.expression.local.RuntimeStore;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.view2.Binding;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.util.JsonNode;
import com.yandex.div.json.ParsingException;
import com.yandex.div2.DivData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ErrorVisualMonitor.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020&J\u0006\u0010'\u001a\u00020\u0017J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020+H\u0002J\u0016\u0010,\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001eH\u0002J\u0012\u0010/\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020\u0007H\u0002J\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020 02J\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00170\u0015J\u0006\u00104\u001a\u00020\u0017J\u001a\u00105\u001a\u00020\u00102\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015J\u0016\u00107\u001a\u00020\u00172\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000209J&\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00170<2\u0006\u0010=\u001a\u00020-H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b>\u0010?J\b\u0010@\u001a\u00020\u0017H\u0002J\u0016\u0010A\u001a\u00020-2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001eH\u0002R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u001a\u0010\u001bR,\u0010\u001c\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001e\u0012\u0004\u0012\u00020\u00170\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001f\u001a\u00020 *\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006B"}, d2 = {"Lcom/yandex/div/core/view2/errors/ErrorModel;", "", "errorCollectors", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "div2View", "Lcom/yandex/div/core/view2/Div2View;", "visualErrorsEnabled", "", "(Lcom/yandex/div/core/view2/errors/ErrorCollectors;Lcom/yandex/div/core/view2/Div2View;Z)V", "currentErrors", "", "", "currentWarnings", "dataTag", "Lcom/yandex/div/DivDataTag;", "existingSubscription", "Lcom/yandex/div/core/Disposable;", "logcatErrorDumper", "Lcom/yandex/div/core/view2/errors/LogcatErrorDumper;", "observers", "", "Lkotlin/Function1;", "Lcom/yandex/div/core/view2/errors/ErrorViewModel;", "", "value", "state", "setState", "(Lcom/yandex/div/core/view2/errors/ErrorViewModel;)V", "updateOnErrors", "Lkotlin/Function2;", "", "variableController", "Lcom/yandex/div/core/expression/variables/VariableController;", "Lcom/yandex/div/core/expression/ExpressionsRuntime;", "getVariableController", "(Lcom/yandex/div/core/expression/ExpressionsRuntime;)Lcom/yandex/div/core/expression/variables/VariableController;", "bind", "binding", "Lcom/yandex/div/core/view2/Binding;", "copyReportToClipboard", "dumpCardWithContextVariables", "Lorg/json/JSONObject;", "dumpGlobalVariables", "Lorg/json/JSONArray;", "errorsToDetails", "", "errors", "generateReport", "dumpCardContent", "getAllControllers", "", "getErrorHandler", "hideDetails", "observeAndGet", "observer", "onCounterClick", "rootWidth", "", "rootHeight", "pasteToClipBoard", "Lkotlin/Result;", "s", "pasteToClipBoard-IoAF18A", "(Ljava/lang/String;)Ljava/lang/Object;", "showDetails", "warningsToDetails", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ErrorModel {

    @Nullable
    private DivDataTag dataTag;

    @NotNull
    private final Div2View div2View;

    @NotNull
    private final ErrorCollectors errorCollectors;

    @Nullable
    private Disposable existingSubscription;
    private final boolean visualErrorsEnabled;

    @NotNull
    private final Set<Function1> observers = new LinkedHashSet();

    @NotNull
    private final List<Throwable> currentErrors = new ArrayList();

    @NotNull
    private final List<Throwable> currentWarnings = new ArrayList();

    @NotNull
    private final LogcatErrorDumper logcatErrorDumper = new LogcatErrorDumper();

    @NotNull
    private final Function2 updateOnErrors = new Function2() { // from class: com.yandex.div.core.view2.errors.ErrorModel$updateOnErrors$1
        {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((List<? extends Throwable>) obj, (List<? extends Throwable>) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull List<? extends Throwable> list, @NotNull List<? extends Throwable> list2) {
            boolean z;
            List list3;
            List list4;
            ErrorViewModel errorViewModel;
            List list5;
            List list6;
            String errorsToDetails;
            List list7;
            List list8;
            String warningsToDetails;
            LogcatErrorDumper logcatErrorDumper;
            List<? extends Throwable> list9;
            List<? extends Throwable> list10;
            DivDataTag divDataTag;
            z = ErrorModel.this.visualErrorsEnabled;
            if (z) {
                list3 = ErrorModel.this.currentErrors;
                list3.clear();
                List mutableList = CollectionsKt.toMutableList((Collection) list);
                CollectionsKt.reverse(mutableList);
                list3.addAll(mutableList);
                list4 = ErrorModel.this.currentWarnings;
                list4.clear();
                List mutableList2 = CollectionsKt.toMutableList((Collection) list2);
                CollectionsKt.reverse(mutableList2);
                list4.addAll(mutableList2);
                ErrorModel errorModel = ErrorModel.this;
                errorViewModel = errorModel.state;
                list5 = ErrorModel.this.currentErrors;
                int size = list5.size();
                ErrorModel errorModel2 = ErrorModel.this;
                list6 = errorModel2.currentErrors;
                errorsToDetails = errorModel2.errorsToDetails(list6);
                list7 = ErrorModel.this.currentWarnings;
                int size2 = list7.size();
                ErrorModel errorModel3 = ErrorModel.this;
                list8 = errorModel3.currentWarnings;
                warningsToDetails = errorModel3.warningsToDetails(list8);
                errorModel.setState(ErrorViewModel.copy$default(errorViewModel, false, size, size2, errorsToDetails, warningsToDetails, 1, null));
                logcatErrorDumper = ErrorModel.this.logcatErrorDumper;
                list9 = ErrorModel.this.currentErrors;
                list10 = ErrorModel.this.currentWarnings;
                divDataTag = ErrorModel.this.dataTag;
                logcatErrorDumper.logErrors(list9, list10, divDataTag);
            }
        }
    };

    @NotNull
    private ErrorViewModel state = new ErrorViewModel(false, 0, 0, null, null, 31, null);

    public ErrorModel(@NotNull ErrorCollectors errorCollectors, @NotNull Div2View div2View, boolean z) {
        this.errorCollectors = errorCollectors;
        this.div2View = div2View;
        this.visualErrorsEnabled = z;
    }

    public final void bind(@NotNull Binding binding) {
        this.dataTag = binding.getTag();
        Disposable disposable = this.existingSubscription;
        if (disposable != null) {
            disposable.close();
        }
        this.existingSubscription = this.errorCollectors.getOrCreate(binding.getTag(), binding.getData()).observeAndGet(this.updateOnErrors);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String errorsToDetails(List<? extends Throwable> errors) {
        return "Last 25 errors:\n" + CollectionsKt.joinToString$default(CollectionsKt.take(errors, 25), "\n", null, null, 0, null, new Function1() { // from class: com.yandex.div.core.view2.errors.ErrorModel$errorsToDetails$errorsList$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull Throwable th) {
                String fullStackMessage;
                String fullStackMessage2;
                if (th instanceof ParsingException) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(" - ");
                    sb.append(((ParsingException) th).getReason());
                    sb.append(": ");
                    fullStackMessage2 = ErrorVisualMonitorKt.getFullStackMessage(th);
                    sb.append(fullStackMessage2);
                    return sb.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(" - ");
                fullStackMessage = ErrorVisualMonitorKt.getFullStackMessage(th);
                sb2.append(fullStackMessage);
                return sb2.toString();
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String warningsToDetails(List<? extends Throwable> currentWarnings) {
        return "Last 25 warnings:\n" + CollectionsKt.joinToString$default(CollectionsKt.take(currentWarnings, 25), "\n", null, null, 0, null, new Function1() { // from class: com.yandex.div.core.view2.errors.ErrorModel$warningsToDetails$warningsList$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull Throwable th) {
                String fullStackMessage;
                StringBuilder sb = new StringBuilder();
                sb.append(" - ");
                fullStackMessage = ErrorVisualMonitorKt.getFullStackMessage(th);
                sb.append(fullStackMessage);
                return sb.toString();
            }
        }, 30, null);
    }

    @NotNull
    public final Disposable observeAndGet(@NotNull final Function1 observer) {
        this.observers.add(observer);
        observer.invoke(this.state);
        return new Disposable() { // from class: com.yandex.div.core.view2.errors.ErrorModel$$ExternalSyntheticLambda0
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                ErrorModel.observeAndGet$lambda$0(ErrorModel.this, observer);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeAndGet$lambda$0(ErrorModel errorModel, Function1 function1) {
        errorModel.observers.remove(function1);
    }

    private final void showDetails() {
        setState(ErrorViewModel.copy$default(this.state, true, 0, 0, null, null, 30, null));
    }

    public final void hideDetails() {
        setState(ErrorViewModel.copy$default(this.state, false, 0, 0, null, null, 30, null));
    }

    static /* synthetic */ String generateReport$default(ErrorModel errorModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return errorModel.generateReport(z);
    }

    private final String generateReport(boolean dumpCardContent) {
        String fullStackMessage;
        JSONObject jSONObject = new JSONObject();
        if (this.currentErrors.size() > 0) {
            JSONArray jSONArray = new JSONArray();
            for (Throwable th : this.currentErrors) {
                JSONObject jSONObject2 = new JSONObject();
                fullStackMessage = ErrorVisualMonitorKt.getFullStackMessage(th);
                jSONObject2.put("message", fullStackMessage);
                jSONObject2.put("stacktrace", ExceptionsKt.stackTraceToString(th));
                if (th instanceof ParsingException) {
                    ParsingException parsingException = (ParsingException) th;
                    jSONObject2.put("reason", parsingException.getReason());
                    JsonNode source = parsingException.getSource();
                    jSONObject2.put("json_source", source != null ? source.dump() : null);
                    jSONObject2.put("json_summary", parsingException.getJsonSummary());
                }
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("errors", jSONArray);
        }
        if (this.currentWarnings.size() > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (Throwable th2 : this.currentWarnings) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("warning_message", th2.getMessage());
                jSONObject3.put("stacktrace", ExceptionsKt.stackTraceToString(th2));
                jSONArray2.put(jSONObject3);
            }
            jSONObject.put("warnings", jSONArray2);
        }
        if (dumpCardContent) {
            jSONObject.put("card", dumpCardWithContextVariables());
        }
        return jSONObject.toString(4);
    }

    @NotNull
    public final Map<String, VariableController> getAllControllers() {
        RuntimeStore runtimeStore = this.div2View.getRuntimeStore();
        Map<String, ExpressionsRuntime> uniquePathsAndRuntimes = runtimeStore.getUniquePathsAndRuntimes();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("", getVariableController(runtimeStore.getRootRuntime()));
        for (Map.Entry<String, ExpressionsRuntime> entry : uniquePathsAndRuntimes.entrySet()) {
            linkedHashMap.put(entry.getKey(), getVariableController(entry.getValue()));
        }
        return linkedHashMap;
    }

    private final VariableController getVariableController(ExpressionsRuntime expressionsRuntime) {
        return expressionsRuntime.getExpressionResolver().getVariableController();
    }

    @NotNull
    public final Function1 getErrorHandler() {
        return new ErrorModel$getErrorHandler$1(this.div2View);
    }

    public final void onCounterClick(int rootWidth, int rootHeight) {
        int dpToPx = BaseDivViewExtensionsKt.dpToPx(150, this.div2View.getContext().getResources().getDisplayMetrics());
        if (rootWidth < dpToPx || rootHeight < dpToPx) {
            copyReportToClipboard();
        } else {
            showDetails();
        }
    }

    public final void copyReportToClipboard() {
        boolean causedByTransactionTooLargeException;
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m7254pasteToClipBoardIoAF18A(generateReport$default(this, false, 1, null)));
        if (m8026exceptionOrNullimpl != null) {
            causedByTransactionTooLargeException = ErrorVisualMonitorKt.causedByTransactionTooLargeException(m8026exceptionOrNullimpl);
            if (causedByTransactionTooLargeException) {
                m7254pasteToClipBoardIoAF18A(generateReport(false));
            }
        }
    }

    /* renamed from: pasteToClipBoard-IoAF18A, reason: not valid java name */
    private final Object m7254pasteToClipBoardIoAF18A(String s) {
        Div2Context context = this.div2View.getContext();
        Object systemService = context.getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            Assert.fail("Failed to access clipboard manager!");
            Result.Companion companion = Result.INSTANCE;
            return Result.m8023constructorimpl(Unit.INSTANCE);
        }
        try {
            clipboardManager.setPrimaryClip(new ClipData("Error report", new String[]{"text/plain"}, new ClipData.Item(s)));
            Toast.makeText(context, "Errors, DivData and Variables are dumped to clipboard!", 1).show();
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Exception e) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(new RuntimeException("Failed paste report to clipboard!", e)));
        }
    }

    private final JSONObject dumpCardWithContextVariables() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("templates", new JSONObject());
        DivData divData = this.div2View.getDivData();
        jSONObject.put("card", divData != null ? divData.writeToJSON() : null);
        jSONObject.put("variables", dumpGlobalVariables());
        return jSONObject;
    }

    private final JSONArray dumpGlobalVariables() {
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = this.div2View.getDiv2Component().getDivVariableController().captureAllVariables().iterator();
        while (it.hasNext()) {
            jSONArray.put(((Variable) it.next()).writeToJSON());
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(ErrorViewModel errorViewModel) {
        this.state = errorViewModel;
        Iterator<T> it = this.observers.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(errorViewModel);
        }
    }
}

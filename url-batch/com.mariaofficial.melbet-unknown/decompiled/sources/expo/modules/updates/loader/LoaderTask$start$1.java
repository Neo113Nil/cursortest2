package expo.modules.updates.loader;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LoaderTask.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.loader.LoaderTask", f = "LoaderTask.kt", i = {0, 1, 2, 3}, l = {170, 177, 184, 197}, m = ViewProps.START, n = {"shouldCheckForUpdate", "shouldCheckForUpdate", "shouldCheckForUpdate", "e"}, s = {"Z$0", "Z$0", "Z$0", "L$0"})
/* loaded from: classes2.dex */
final class LoaderTask$start$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoaderTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoaderTask$start$1(LoaderTask loaderTask, Continuation<? super LoaderTask$start$1> continuation) {
        super(continuation);
        this.this$0 = loaderTask;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.start(this);
    }
}

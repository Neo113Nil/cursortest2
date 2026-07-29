package expo.modules.updates.loader;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LoaderTask.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.loader.LoaderTask", f = "LoaderTask.kt", i = {}, l = {205}, m = "launchRemoteUpdate", n = {}, s = {})
/* loaded from: classes2.dex */
final class LoaderTask$launchRemoteUpdate$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoaderTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoaderTask$launchRemoteUpdate$1(LoaderTask loaderTask, Continuation<? super LoaderTask$launchRemoteUpdate$1> continuation) {
        super(continuation);
        this.this$0 = loaderTask;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object launchRemoteUpdate;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        launchRemoteUpdate = this.this$0.launchRemoteUpdate(this);
        return launchRemoteUpdate;
    }
}

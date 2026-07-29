package expo.modules.updates.loader;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LoaderTask.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.loader.LoaderTask", f = "LoaderTask.kt", i = {0, 0, 1, 1, 2, 2, 2}, l = {327, 374, 388}, m = "launchRemoteUpdateInBackground", n = {"database", "progressJob", "database", "progressJob", "progressJob", "availableUpdate", "newLauncher"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2"})
/* loaded from: classes2.dex */
final class LoaderTask$launchRemoteUpdateInBackground$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoaderTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoaderTask$launchRemoteUpdateInBackground$1(LoaderTask loaderTask, Continuation<? super LoaderTask$launchRemoteUpdateInBackground$1> continuation) {
        super(continuation);
        this.this$0 = loaderTask;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object launchRemoteUpdateInBackground;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        launchRemoteUpdateInBackground = this.this$0.launchRemoteUpdateInBackground(this);
        return launchRemoteUpdateInBackground;
    }
}

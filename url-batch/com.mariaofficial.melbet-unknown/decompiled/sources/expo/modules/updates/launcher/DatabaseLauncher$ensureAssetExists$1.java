package expo.modules.updates.launcher;

import com.facebook.common.util.UriUtil;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DatabaseLauncher.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.launcher.DatabaseLauncher", f = "DatabaseLauncher.kt", i = {0, 0}, l = {249}, m = "ensureAssetExists", n = {UriUtil.LOCAL_ASSET_SCHEME, "database"}, s = {"L$0", "L$1"})
/* loaded from: classes2.dex */
final class DatabaseLauncher$ensureAssetExists$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DatabaseLauncher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DatabaseLauncher$ensureAssetExists$1(DatabaseLauncher databaseLauncher, Continuation<? super DatabaseLauncher$ensureAssetExists$1> continuation) {
        super(continuation);
        this.this$0 = databaseLauncher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.ensureAssetExists(null, null, null, null, this);
    }
}

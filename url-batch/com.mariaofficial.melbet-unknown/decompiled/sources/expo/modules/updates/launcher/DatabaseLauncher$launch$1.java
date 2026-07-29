package expo.modules.updates.launcher;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;

/* compiled from: DatabaseLauncher.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.launcher.DatabaseLauncher", f = "DatabaseLauncher.kt", i = {0, 1, 1, 1, 1, 2}, l = {EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID, 110, 139}, m = "launch", n = {"database", "database", "launchAsset", "embeddedUpdate", "extraHeaders", "$this$launch_u24lambda_u243"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$1"})
/* loaded from: classes2.dex */
final class DatabaseLauncher$launch$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DatabaseLauncher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DatabaseLauncher$launch$1(DatabaseLauncher databaseLauncher, Continuation<? super DatabaseLauncher$launch$1> continuation) {
        super(continuation);
        this.this$0 = databaseLauncher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.launch(null, this);
    }
}

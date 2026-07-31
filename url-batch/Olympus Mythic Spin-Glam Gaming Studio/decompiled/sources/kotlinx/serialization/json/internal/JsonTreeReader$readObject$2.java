package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JsonTreeReader.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", l = {24}, m = "readObject")
/* loaded from: classes.dex */
final class JsonTreeReader$readObject$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ JsonTreeReader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JsonTreeReader$readObject$2(JsonTreeReader jsonTreeReader, Continuation continuation) {
        super(continuation);
        this.this$0 = jsonTreeReader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object readObject;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        readObject = this.this$0.readObject(null, this);
        return readObject;
    }
}

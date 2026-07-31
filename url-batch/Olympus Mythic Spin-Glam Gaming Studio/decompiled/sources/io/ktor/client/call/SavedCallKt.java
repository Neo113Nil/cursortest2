package io.ktor.client.call;

import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.io.Source;
import kotlinx.io.SourcesKt;

/* compiled from: SavedCall.kt */
/* loaded from: classes10.dex */
public abstract class SavedCallKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object save(HttpClientCall httpClientCall, Continuation continuation) {
        SavedCallKt$save$1 savedCallKt$save$1;
        int i;
        if (continuation instanceof SavedCallKt$save$1) {
            savedCallKt$save$1 = (SavedCallKt$save$1) continuation;
            int i2 = savedCallKt$save$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savedCallKt$save$1.label = i2 - Integer.MIN_VALUE;
                Object obj = savedCallKt$save$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savedCallKt$save$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ByteReadChannel rawContent = httpClientCall.getResponse().getRawContent();
                    savedCallKt$save$1.L$0 = httpClientCall;
                    savedCallKt$save$1.label = 1;
                    obj = ByteReadChannelOperationsKt.readRemaining(rawContent, savedCallKt$save$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    httpClientCall = (HttpClientCall) savedCallKt$save$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return new SavedHttpCall(httpClientCall.getClient(), httpClientCall.getRequest(), httpClientCall.getResponse(), SourcesKt.readByteArray((Source) obj));
            }
        }
        savedCallKt$save$1 = new SavedCallKt$save$1(continuation);
        Object obj2 = savedCallKt$save$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savedCallKt$save$1.label;
        if (i != 0) {
        }
        return new SavedHttpCall(httpClientCall.getClient(), httpClientCall.getRequest(), httpClientCall.getResponse(), SourcesKt.readByteArray((Source) obj2));
    }
}

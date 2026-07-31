package io.ktor.client.engine.android;

import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.jvm.javaio.WritingKt;
import java.io.Closeable;
import java.io.OutputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.io.CloseableKt;

/* compiled from: AndroidClientEngine.kt */
/* loaded from: classes4.dex */
public abstract class AndroidClientEngineKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object writeTo(OutgoingContent outgoingContent, OutputStream outputStream, CoroutineContext coroutineContext, Continuation continuation) {
        AndroidClientEngineKt$writeTo$1 androidClientEngineKt$writeTo$1;
        int i;
        OutputStream outputStream2;
        OutputStream outputStream3;
        try {
            if (continuation instanceof AndroidClientEngineKt$writeTo$1) {
                androidClientEngineKt$writeTo$1 = (AndroidClientEngineKt$writeTo$1) continuation;
                int i2 = androidClientEngineKt$writeTo$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    androidClientEngineKt$writeTo$1.label = i2 - Integer.MIN_VALUE;
                    AndroidClientEngineKt$writeTo$1 androidClientEngineKt$writeTo$12 = androidClientEngineKt$writeTo$1;
                    Object obj = androidClientEngineKt$writeTo$12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = androidClientEngineKt$writeTo$12.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (outgoingContent instanceof OutgoingContent.ByteArrayContent) {
                            outputStream.write(((OutgoingContent.ByteArrayContent) outgoingContent).bytes());
                            Unit unit = Unit.INSTANCE;
                            outputStream3 = outputStream;
                        } else if (outgoingContent instanceof OutgoingContent.ReadChannelContent) {
                            ByteReadChannel readFrom = ((OutgoingContent.ReadChannelContent) outgoingContent).readFrom();
                            androidClientEngineKt$writeTo$12.L$0 = outputStream;
                            androidClientEngineKt$writeTo$12.label = 1;
                            Object copyTo$default = WritingKt.copyTo$default(readFrom, outputStream, 0L, androidClientEngineKt$writeTo$12, 2, null);
                            outputStream2 = outputStream;
                            if (copyTo$default == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Unit unit2 = Unit.INSTANCE;
                            outputStream3 = outputStream2;
                        } else {
                            if (!(outgoingContent instanceof OutgoingContent.NoContent)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Unit unit3 = Unit.INSTANCE;
                            outputStream3 = outputStream;
                        }
                    } else if (i == 1) {
                        ?? r8 = (Closeable) androidClientEngineKt$writeTo$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        outputStream2 = r8;
                        Unit unit22 = Unit.INSTANCE;
                        outputStream3 = outputStream2;
                    } else if (i == 2) {
                        ?? r82 = (Closeable) androidClientEngineKt$writeTo$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        outputStream3 = r82;
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r83 = (Closeable) androidClientEngineKt$writeTo$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        Unit unit4 = Unit.INSTANCE;
                        outputStream3 = r83;
                    }
                    Unit unit5 = Unit.INSTANCE;
                    CloseableKt.closeFinally(outputStream3, null);
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            Unit unit52 = Unit.INSTANCE;
            CloseableKt.closeFinally(outputStream3, null);
            return Unit.INSTANCE;
        } finally {
        }
        androidClientEngineKt$writeTo$1 = new AndroidClientEngineKt$writeTo$1(continuation);
        AndroidClientEngineKt$writeTo$1 androidClientEngineKt$writeTo$122 = androidClientEngineKt$writeTo$1;
        Object obj2 = androidClientEngineKt$writeTo$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidClientEngineKt$writeTo$122.label;
    }
}

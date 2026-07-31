package io.ktor.http.cio;

import com.explorestack.protobuf.openrtb.LossReason;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.http.cio.MultipartEvent;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.CountedByteReadChannel;
import io.ktor.utils.io.CountedByteReadChannelKt;
import io.ktor.utils.io.core.ByteReadPacketKt;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.io.Source;
import kotlinx.io.bytestring.ByteString;

/* compiled from: Multipart.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/ktor/http/cio/MultipartEvent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.http.cio.MultipartKt$parseMultipart$1", f = "Multipart.kt", l = {208, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 229, 236, 248, 249, 256, 256, 259, 261}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class MultipartKt$parseMultipart$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ ByteString $boundaryPrefixed;
    final /* synthetic */ ByteReadChannel $input;
    final /* synthetic */ long $maxPartSize;
    final /* synthetic */ Long $totalLength;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipartKt$parseMultipart$1(ByteReadChannel byteReadChannel, ByteString byteString, long j, Long l, Continuation continuation) {
        super(2, continuation);
        this.$input = byteReadChannel;
        this.$boundaryPrefixed = byteString;
        this.$maxPartSize = j;
        this.$totalLength = l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MultipartKt$parseMultipart$1 multipartKt$parseMultipart$1 = new MultipartKt$parseMultipart$1(this.$input, this.$boundaryPrefixed, this.$maxPartSize, this.$totalLength, continuation);
        multipartKt$parseMultipart$1.L$0 = obj;
        return multipartKt$parseMultipart$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope producerScope, Continuation continuation) {
        return ((MultipartKt$parseMultipart$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0218 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0352 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0311 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0267 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0277 A[Catch: all -> 0x02b9, TRY_LEAVE, TryCatch #3 {all -> 0x02b9, blocks: (B:77:0x0271, B:79:0x0277), top: B:76:0x0271 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0372  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0221 -> B:46:0x01c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x02a1 -> B:43:0x02a8). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ByteString byteString;
        Object readRemaining;
        ProducerScope producerScope;
        ByteString byteString2;
        CountedByteReadChannel countedByteReadChannel;
        long j;
        Source source;
        ByteString byteString3;
        long j2;
        CountedByteReadChannel countedByteReadChannel2;
        ProducerScope producerScope2;
        Object obj2;
        long j3;
        ByteString byteString4;
        CountedByteReadChannel countedByteReadChannel3;
        ProducerScope producerScope3;
        Object obj3;
        long j4;
        ByteString byteString5;
        ProducerScope producerScope4;
        CompletableDeferred completableDeferred;
        CountedByteReadChannel countedByteReadChannel4;
        ByteChannel byteChannel;
        ByteChannel byteChannel2;
        Object obj4;
        CompletableDeferred completableDeferred2;
        ByteString byteString6;
        ProducerScope producerScope5;
        ByteChannel byteChannel3;
        ByteString byteString7;
        long j5;
        CountedByteReadChannel countedByteReadChannel5;
        ProducerScope producerScope6;
        HttpHeadersMap httpHeadersMap;
        long j6;
        ProducerScope producerScope7;
        ByteChannel byteChannel4;
        CountedByteReadChannel countedByteReadChannel6;
        ByteString byteString8;
        Object parsePartBodyImpl;
        CountedByteReadChannel countedByteReadChannel7;
        ByteString byteString9;
        ByteString byteString10;
        ByteString byteString11;
        ProducerScope producerScope8;
        Object readRemaining2;
        Object readPacket;
        MultipartEvent.Epilogue epilogue;
        Source source2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean z = false;
        int i = 1;
        HttpHeadersMap httpHeadersMap2 = null;
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                ProducerScope producerScope9 = (ProducerScope) this.L$0;
                CountedByteReadChannel counted = CountedByteReadChannelKt.counted(this.$input);
                long totalBytesRead = counted.getTotalBytesRead();
                ByteString byteString12 = this.$boundaryPrefixed;
                byteString = MultipartKt.PrefixString;
                ByteString substring$default = ByteString.substring$default(byteString12, byteString.getSize(), 0, 2, null);
                ByteReadChannel channel = ByteWriteChannelOperationsKt.writer$default(producerScope9, null, false, new MultipartKt$parseMultipart$1$preambleData$1(substring$default, counted, null), 3, null).getChannel();
                this.L$0 = producerScope9;
                this.L$1 = counted;
                this.L$2 = substring$default;
                this.J$0 = totalBytesRead;
                this.label = 1;
                readRemaining = ByteReadChannelOperationsKt.readRemaining(channel, this);
                if (readRemaining == coroutine_suspended) {
                    return coroutine_suspended;
                }
                producerScope = producerScope9;
                byteString2 = substring$default;
                countedByteReadChannel = counted;
                j = totalBytesRead;
                source = (Source) readRemaining;
                if (ByteReadPacketKt.getRemaining(source) > 0) {
                    MultipartEvent.Preamble preamble = new MultipartEvent.Preamble(source);
                    this.L$0 = producerScope;
                    this.L$1 = countedByteReadChannel;
                    this.L$2 = byteString2;
                    this.J$0 = j;
                    this.label = 2;
                    if (producerScope.send(preamble, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    long j7 = j;
                    byteString3 = byteString2;
                    j2 = j7;
                    countedByteReadChannel2 = countedByteReadChannel;
                    producerScope2 = producerScope;
                    producerScope = producerScope2;
                    countedByteReadChannel = countedByteReadChannel2;
                    long j8 = j2;
                    byteString2 = byteString3;
                    j = j8;
                }
                if (!countedByteReadChannel.isClosedForRead()) {
                    byteString10 = MultipartKt.PrefixString;
                    this.L$0 = producerScope;
                    this.L$1 = countedByteReadChannel;
                    this.L$2 = byteString2;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.J$0 = j;
                    this.label = 3;
                    obj2 = ByteReadChannelOperationsKt.skipIfFound(countedByteReadChannel, byteString10, this);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!((Boolean) obj2).booleanValue()) {
                        byteString9 = MultipartKt.CrLf;
                        this.L$0 = producerScope;
                        this.L$1 = countedByteReadChannel;
                        this.L$2 = byteString2;
                        this.J$0 = j;
                        this.label = 4;
                        if (ByteReadChannelOperationsKt.skipIfFound(countedByteReadChannel, byteString9, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        long j9 = j;
                        byteString4 = byteString2;
                        j3 = j9;
                        countedByteReadChannel3 = countedByteReadChannel;
                        producerScope3 = producerScope;
                        this.L$0 = producerScope3;
                        this.L$1 = countedByteReadChannel3;
                        this.L$2 = byteString4;
                        this.J$0 = j3;
                        this.label = 5;
                        obj3 = ByteReadChannelOperationsKt.skipIfFound(countedByteReadChannel3, byteString4, this);
                        if (obj3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        long j10 = j3;
                        byteString2 = byteString4;
                        ProducerScope producerScope10 = producerScope3;
                        countedByteReadChannel = countedByteReadChannel3;
                        j = j10;
                        if (!((Boolean) obj3).booleanValue()) {
                            byteChannel = new ByteChannel(z, i, null);
                            CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, i, null);
                            MultipartEvent.MultipartPart multipartPart = new MultipartEvent.MultipartPart(CompletableDeferred$default, byteChannel);
                            this.L$0 = producerScope10;
                            this.L$1 = countedByteReadChannel;
                            this.L$2 = byteString2;
                            this.L$3 = byteChannel;
                            this.L$4 = CompletableDeferred$default;
                            this.J$0 = j;
                            this.label = 6;
                            if (producerScope10.send(multipartPart, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            byteString5 = byteString2;
                            producerScope4 = producerScope10;
                            j4 = j;
                            countedByteReadChannel4 = countedByteReadChannel;
                            completableDeferred = CompletableDeferred$default;
                            try {
                                this.L$0 = producerScope4;
                                this.L$1 = countedByteReadChannel4;
                                this.L$2 = byteString5;
                                this.L$3 = byteChannel;
                                this.L$4 = completableDeferred;
                                this.J$0 = j4;
                                this.label = 7;
                                obj4 = MultipartKt.parsePartHeadersImpl(countedByteReadChannel4, this);
                            } catch (Throwable th) {
                                th = th;
                                byteChannel2 = byteChannel;
                            }
                            if (obj4 != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            try {
                                try {
                                    completableDeferred2 = completableDeferred;
                                    byteString6 = byteString5;
                                    producerScope5 = producerScope4;
                                    byteChannel3 = byteChannel;
                                    if (completableDeferred2.complete(httpHeadersMap)) {
                                        byteChannel4 = byteChannel3;
                                        httpHeadersMap.release();
                                        throw new CancellationException("Multipart processing has been cancelled");
                                    }
                                    try {
                                        ByteString byteString13 = this.$boundaryPrefixed;
                                        long j11 = this.$maxPartSize;
                                        this.L$0 = producerScope7;
                                        this.L$1 = countedByteReadChannel4;
                                        this.L$2 = byteString6;
                                        this.L$3 = byteChannel3;
                                        this.L$4 = completableDeferred2;
                                        this.L$5 = httpHeadersMap;
                                        this.J$0 = j6;
                                        this.label = 8;
                                        parsePartBodyImpl = MultipartKt.parsePartBodyImpl(byteString13, countedByteReadChannel4, byteChannel3, httpHeadersMap, j11, this);
                                        if (parsePartBodyImpl == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        producerScope = producerScope7;
                                        countedByteReadChannel7 = countedByteReadChannel6;
                                        byteChannel2 = byteChannel4;
                                        byteString2 = byteString8;
                                        j = j6;
                                        try {
                                            byteChannel2.close();
                                            countedByteReadChannel = countedByteReadChannel7;
                                            z = false;
                                            i = 1;
                                            if (!countedByteReadChannel.isClosedForRead()) {
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                    countedByteReadChannel6 = countedByteReadChannel4;
                                    byteString8 = byteString6;
                                    byteChannel4 = byteChannel3;
                                    th = th3;
                                } catch (Throwable th4) {
                                    th = th4;
                                    byteChannel2 = byteChannel3;
                                }
                                j6 = j4;
                                producerScope7 = producerScope5;
                            } catch (Throwable th5) {
                                th = th5;
                                byteChannel4 = byteChannel3;
                            }
                            httpHeadersMap = (HttpHeadersMap) obj4;
                            byteChannel2 = byteChannel4;
                            httpHeadersMap2 = httpHeadersMap;
                            completableDeferred = completableDeferred2;
                            if (completableDeferred.completeExceptionally(th) && httpHeadersMap2 != null) {
                                httpHeadersMap2.release();
                            }
                            ByteWriteChannelOperationsKt.close(byteChannel2, th);
                            throw th;
                        }
                        producerScope = producerScope10;
                        if (!countedByteReadChannel.isClosedForRead()) {
                        }
                    }
                }
                byteString7 = MultipartKt.CrLf;
                this.L$0 = producerScope;
                this.L$1 = countedByteReadChannel;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.J$0 = j;
                this.label = 9;
                if (ByteReadChannelOperationsKt.skipIfFound(countedByteReadChannel, byteString7, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j5 = j;
                countedByteReadChannel5 = countedByteReadChannel;
                producerScope6 = producerScope;
                byteString11 = MultipartKt.CrLf;
                this.L$0 = producerScope6;
                this.L$1 = countedByteReadChannel5;
                this.J$0 = j5;
                this.label = 10;
                if (ByteReadChannelOperationsKt.skipIfFound(countedByteReadChannel5, byteString11, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ProducerScope producerScope11 = producerScope6;
                CountedByteReadChannel countedByteReadChannel8 = countedByteReadChannel5;
                long j12 = j5;
                producerScope8 = producerScope11;
                if (this.$totalLength == null) {
                    this.L$0 = producerScope8;
                    this.L$1 = null;
                    this.label = 13;
                    readRemaining2 = ByteReadChannelOperationsKt.readRemaining(countedByteReadChannel8, this);
                    if (readRemaining2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    source2 = (Source) readRemaining2;
                    if (!source2.exhausted()) {
                        MultipartEvent.Epilogue epilogue2 = new MultipartEvent.Epilogue(source2);
                        this.L$0 = null;
                        this.label = 14;
                        if (producerScope8.send(epilogue2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                long longValue = this.$totalLength.longValue() - (countedByteReadChannel8.getTotalBytesRead() - j12);
                if (longValue > 2147483647L) {
                    throw new IOException("Failed to parse multipart: prologue is too long");
                }
                if (longValue > 0) {
                    this.L$0 = producerScope8;
                    this.L$1 = null;
                    this.label = 11;
                    readPacket = ByteReadChannelOperationsKt.readPacket(countedByteReadChannel8, (int) longValue, this);
                    if (readPacket == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    epilogue = new MultipartEvent.Epilogue((Source) readPacket);
                    this.L$0 = null;
                    this.label = 12;
                    if (producerScope8.send(epilogue, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                j = this.J$0;
                byteString2 = (ByteString) this.L$2;
                countedByteReadChannel = (CountedByteReadChannel) this.L$1;
                producerScope = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                readRemaining = obj;
                source = (Source) readRemaining;
                if (ByteReadPacketKt.getRemaining(source) > 0) {
                }
                if (!countedByteReadChannel.isClosedForRead()) {
                }
                byteString7 = MultipartKt.CrLf;
                this.L$0 = producerScope;
                this.L$1 = countedByteReadChannel;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.J$0 = j;
                this.label = 9;
                if (ByteReadChannelOperationsKt.skipIfFound(countedByteReadChannel, byteString7, this) == coroutine_suspended) {
                }
                break;
            case 2:
                j2 = this.J$0;
                byteString3 = (ByteString) this.L$2;
                countedByteReadChannel2 = (CountedByteReadChannel) this.L$1;
                producerScope2 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                producerScope = producerScope2;
                countedByteReadChannel = countedByteReadChannel2;
                long j82 = j2;
                byteString2 = byteString3;
                j = j82;
                if (!countedByteReadChannel.isClosedForRead()) {
                }
                byteString7 = MultipartKt.CrLf;
                this.L$0 = producerScope;
                this.L$1 = countedByteReadChannel;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.J$0 = j;
                this.label = 9;
                if (ByteReadChannelOperationsKt.skipIfFound(countedByteReadChannel, byteString7, this) == coroutine_suspended) {
                }
                break;
            case 3:
                long j13 = this.J$0;
                ByteString byteString14 = (ByteString) this.L$2;
                CountedByteReadChannel countedByteReadChannel9 = (CountedByteReadChannel) this.L$1;
                ProducerScope producerScope12 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                producerScope = producerScope12;
                countedByteReadChannel = countedByteReadChannel9;
                obj2 = obj;
                byteString2 = byteString14;
                j = j13;
                if (!((Boolean) obj2).booleanValue()) {
                }
                byteString7 = MultipartKt.CrLf;
                this.L$0 = producerScope;
                this.L$1 = countedByteReadChannel;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.J$0 = j;
                this.label = 9;
                if (ByteReadChannelOperationsKt.skipIfFound(countedByteReadChannel, byteString7, this) == coroutine_suspended) {
                }
                break;
            case 4:
                j3 = this.J$0;
                byteString4 = (ByteString) this.L$2;
                countedByteReadChannel3 = (CountedByteReadChannel) this.L$1;
                producerScope3 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = producerScope3;
                this.L$1 = countedByteReadChannel3;
                this.L$2 = byteString4;
                this.J$0 = j3;
                this.label = 5;
                obj3 = ByteReadChannelOperationsKt.skipIfFound(countedByteReadChannel3, byteString4, this);
                if (obj3 == coroutine_suspended) {
                }
                long j102 = j3;
                byteString2 = byteString4;
                ProducerScope producerScope102 = producerScope3;
                countedByteReadChannel = countedByteReadChannel3;
                j = j102;
                if (!((Boolean) obj3).booleanValue()) {
                }
                break;
            case 5:
                j3 = this.J$0;
                byteString4 = (ByteString) this.L$2;
                countedByteReadChannel3 = (CountedByteReadChannel) this.L$1;
                producerScope3 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                obj3 = obj;
                long j1022 = j3;
                byteString2 = byteString4;
                ProducerScope producerScope1022 = producerScope3;
                countedByteReadChannel = countedByteReadChannel3;
                j = j1022;
                if (!((Boolean) obj3).booleanValue()) {
                }
                break;
            case 6:
                j4 = this.J$0;
                CompletableDeferred completableDeferred3 = (CompletableDeferred) this.L$4;
                ByteChannel byteChannel5 = (ByteChannel) this.L$3;
                byteString5 = (ByteString) this.L$2;
                CountedByteReadChannel countedByteReadChannel10 = (CountedByteReadChannel) this.L$1;
                producerScope4 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                completableDeferred = completableDeferred3;
                countedByteReadChannel4 = countedByteReadChannel10;
                byteChannel = byteChannel5;
                this.L$0 = producerScope4;
                this.L$1 = countedByteReadChannel4;
                this.L$2 = byteString5;
                this.L$3 = byteChannel;
                this.L$4 = completableDeferred;
                this.J$0 = j4;
                this.label = 7;
                obj4 = MultipartKt.parsePartHeadersImpl(countedByteReadChannel4, this);
                if (obj4 != coroutine_suspended) {
                }
                break;
            case 7:
                j4 = this.J$0;
                completableDeferred = (CompletableDeferred) this.L$4;
                byteChannel2 = (ByteChannel) this.L$3;
                ByteString byteString15 = (ByteString) this.L$2;
                CountedByteReadChannel countedByteReadChannel11 = (CountedByteReadChannel) this.L$1;
                ProducerScope producerScope13 = (ProducerScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    obj4 = obj;
                    completableDeferred2 = completableDeferred;
                    byteString6 = byteString15;
                    countedByteReadChannel4 = countedByteReadChannel11;
                    producerScope5 = producerScope13;
                    byteChannel3 = byteChannel2;
                    j6 = j4;
                    producerScope7 = producerScope5;
                    httpHeadersMap = (HttpHeadersMap) obj4;
                    if (completableDeferred2.complete(httpHeadersMap)) {
                    }
                    th = th3;
                    byteChannel2 = byteChannel4;
                } catch (Throwable th6) {
                    th = th6;
                }
                httpHeadersMap2 = httpHeadersMap;
                completableDeferred = completableDeferred2;
                if (completableDeferred.completeExceptionally(th)) {
                    httpHeadersMap2.release();
                }
                ByteWriteChannelOperationsKt.close(byteChannel2, th);
                throw th;
            case 8:
                long j14 = this.J$0;
                HttpHeadersMap httpHeadersMap3 = (HttpHeadersMap) this.L$5;
                completableDeferred = (CompletableDeferred) this.L$4;
                byteChannel2 = (ByteChannel) this.L$3;
                ByteString byteString16 = (ByteString) this.L$2;
                countedByteReadChannel7 = (CountedByteReadChannel) this.L$1;
                ProducerScope producerScope14 = (ProducerScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    completableDeferred2 = completableDeferred;
                    httpHeadersMap = httpHeadersMap3;
                    j = j14;
                    byteString2 = byteString16;
                    producerScope = producerScope14;
                    byteChannel2.close();
                    countedByteReadChannel = countedByteReadChannel7;
                    z = false;
                    i = 1;
                    if (!countedByteReadChannel.isClosedForRead()) {
                    }
                    byteString7 = MultipartKt.CrLf;
                    this.L$0 = producerScope;
                    this.L$1 = countedByteReadChannel;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.J$0 = j;
                    this.label = 9;
                    if (ByteReadChannelOperationsKt.skipIfFound(countedByteReadChannel, byteString7, this) == coroutine_suspended) {
                    }
                } catch (Throwable th7) {
                    th = th7;
                    httpHeadersMap2 = httpHeadersMap3;
                    break;
                }
                break;
            case 9:
                j5 = this.J$0;
                countedByteReadChannel5 = (CountedByteReadChannel) this.L$1;
                producerScope6 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                byteString11 = MultipartKt.CrLf;
                this.L$0 = producerScope6;
                this.L$1 = countedByteReadChannel5;
                this.J$0 = j5;
                this.label = 10;
                if (ByteReadChannelOperationsKt.skipIfFound(countedByteReadChannel5, byteString11, this) == coroutine_suspended) {
                }
                ProducerScope producerScope112 = producerScope6;
                CountedByteReadChannel countedByteReadChannel82 = countedByteReadChannel5;
                long j122 = j5;
                producerScope8 = producerScope112;
                if (this.$totalLength == null) {
                }
                break;
            case 10:
                j5 = this.J$0;
                countedByteReadChannel5 = (CountedByteReadChannel) this.L$1;
                producerScope6 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                ProducerScope producerScope1122 = producerScope6;
                CountedByteReadChannel countedByteReadChannel822 = countedByteReadChannel5;
                long j1222 = j5;
                producerScope8 = producerScope1122;
                if (this.$totalLength == null) {
                }
                break;
            case 11:
                producerScope8 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                readPacket = obj;
                epilogue = new MultipartEvent.Epilogue((Source) readPacket);
                this.L$0 = null;
                this.label = 12;
                if (producerScope8.send(epilogue, this) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            case 12:
            case 14:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 13:
                producerScope8 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                readRemaining2 = obj;
                source2 = (Source) readRemaining2;
                if (!source2.exhausted()) {
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

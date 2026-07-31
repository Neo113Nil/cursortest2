package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BufferedChannel.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class BufferedChannelKt$createSegmentFunction$1 extends FunctionReferenceImpl implements Function2 {
    public static final BufferedChannelKt$createSegmentFunction$1 INSTANCE = new BufferedChannelKt$createSegmentFunction$1();

    BufferedChannelKt$createSegmentFunction$1() {
        super(2, BufferedChannelKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).longValue(), (ChannelSegment) obj2);
    }

    public final ChannelSegment invoke(long j, ChannelSegment channelSegment) {
        ChannelSegment createSegment;
        createSegment = BufferedChannelKt.createSegment(j, channelSegment);
        return createSegment;
    }
}

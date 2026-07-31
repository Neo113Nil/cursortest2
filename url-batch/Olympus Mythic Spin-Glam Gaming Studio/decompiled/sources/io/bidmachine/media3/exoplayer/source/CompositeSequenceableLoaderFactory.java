package io.bidmachine.media3.exoplayer.source;

import io.bidmachine.media3.common.util.UnstableApi;
import java.util.List;

@UnstableApi
/* loaded from: classes15.dex */
public interface CompositeSequenceableLoaderFactory {
    SequenceableLoader create(List<? extends SequenceableLoader> list, List<List<Integer>> list2);

    @Deprecated
    SequenceableLoader createCompositeSequenceableLoader(SequenceableLoader... sequenceableLoaderArr);

    SequenceableLoader empty();
}

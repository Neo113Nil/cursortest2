package io.bidmachine.media3.exoplayer.video;

import androidx.annotation.Nullable;
import io.bidmachine.media3.container.ObuParser;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
final class Av1SampleDependencyParser {
    private static final int MAX_OBU_COUNT_FOR_PARTIAL_SKIP = 8;

    @Nullable
    private ObuParser.SequenceHeader sequenceHeader;

    Av1SampleDependencyParser() {
    }

    public int sampleLimitAfterSkippingNonReferenceFrame(ByteBuffer byteBuffer, boolean z) {
        List<ObuParser.Obu> split = ObuParser.split(byteBuffer);
        updateSequenceHeaders(split);
        int size = split.size() - 1;
        int i = 0;
        while (size >= 0 && canSkipObu(split.get(size), z)) {
            if (split.get(size).type == 6 || split.get(size).type == 3) {
                i++;
            }
            size--;
        }
        if (i > 1 || size + 1 >= 8) {
            return byteBuffer.limit();
        }
        if (size >= 0) {
            return split.get(size).payload.limit();
        }
        return byteBuffer.position();
    }

    public void queueInputBuffer(ByteBuffer byteBuffer) {
        updateSequenceHeaders(ObuParser.split(byteBuffer));
    }

    public void reset() {
        this.sequenceHeader = null;
    }

    private boolean canSkipObu(ObuParser.Obu obu, boolean z) {
        ObuParser.SequenceHeader sequenceHeader;
        int i = obu.type;
        if (i == 2 || i == 15) {
            return true;
        }
        if (i == 3 && !z) {
            return false;
        }
        if ((i != 6 && i != 3) || (sequenceHeader = this.sequenceHeader) == null) {
            return false;
        }
        ObuParser.FrameHeader parse = ObuParser.FrameHeader.parse(sequenceHeader, obu);
        return (parse == null || parse.isDependedOn()) ? false : true;
    }

    private void updateSequenceHeaders(List<ObuParser.Obu> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).type == 1) {
                this.sequenceHeader = ObuParser.SequenceHeader.parse(list.get(i));
            }
        }
    }
}

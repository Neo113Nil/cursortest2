package io.bidmachine.media3.extractor.metadata.mp4;

import androidx.annotation.Nullable;
import com.google.common.collect.ComparisonChain;
import io.bidmachine.media3.common.Metadata;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.extractor.metadata.mp4.SlowMotionData;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

@UnstableApi
/* loaded from: classes3.dex */
public final class SlowMotionData implements Metadata.Entry {
    public final List<Segment> segments;

    public static final class Segment {
        public static final Comparator<Segment> BY_START_THEN_END_THEN_DIVISOR = new Comparator() { // from class: io.bidmachine.media3.extractor.metadata.mp4.SlowMotionData$Segment$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$static$0;
                lambda$static$0 = SlowMotionData.Segment.lambda$static$0((SlowMotionData.Segment) obj, (SlowMotionData.Segment) obj2);
                return lambda$static$0;
            }
        };
        public final long endTimeMs;
        public final int speedDivisor;
        public final long startTimeMs;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$static$0(Segment segment, Segment segment2) {
            return ComparisonChain.start().compare(segment.startTimeMs, segment2.startTimeMs).compare(segment.endTimeMs, segment2.endTimeMs).compare(segment.speedDivisor, segment2.speedDivisor).result();
        }

        public Segment(long j, long j2, int i) {
            Assertions.checkArgument(j < j2);
            this.startTimeMs = j;
            this.endTimeMs = j2;
            this.speedDivisor = i;
        }

        public String toString() {
            return Util.formatInvariant("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.startTimeMs), Long.valueOf(this.endTimeMs), Integer.valueOf(this.speedDivisor));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Segment.class != obj.getClass()) {
                return false;
            }
            Segment segment = (Segment) obj;
            return this.startTimeMs == segment.startTimeMs && this.endTimeMs == segment.endTimeMs && this.speedDivisor == segment.speedDivisor;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.startTimeMs), Long.valueOf(this.endTimeMs), Integer.valueOf(this.speedDivisor));
        }
    }

    public SlowMotionData(List<Segment> list) {
        this.segments = list;
        Assertions.checkArgument(!doSegmentsOverlap(list));
    }

    public String toString() {
        return "SlowMotion: segments=" + this.segments;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.segments.equals(((SlowMotionData) obj).segments);
    }

    public int hashCode() {
        return this.segments.hashCode();
    }

    private static boolean doSegmentsOverlap(List<Segment> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = list.get(0).endTimeMs;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).startTimeMs < j) {
                return true;
            }
            j = list.get(i).endTimeMs;
        }
        return false;
    }
}

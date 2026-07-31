package io.bidmachine.media3.extractor.ts;

import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.container.ReorderingSeiMessageQueue;
import io.bidmachine.media3.extractor.CeaUtil;
import io.bidmachine.media3.extractor.ExtractorOutput;
import io.bidmachine.media3.extractor.TrackOutput;
import io.bidmachine.media3.extractor.ts.TsPayloadReader;
import java.util.List;

@UnstableApi
/* loaded from: classes14.dex */
public final class SeiReader {
    private final List<Format> closedCaptionFormats;
    private final String containerMimeType;
    private final TrackOutput[] outputs;
    private final ReorderingSeiMessageQueue reorderingSeiMessageQueue = new ReorderingSeiMessageQueue(new ReorderingSeiMessageQueue.SeiConsumer() { // from class: io.bidmachine.media3.extractor.ts.SeiReader$$ExternalSyntheticLambda0
        @Override // io.bidmachine.media3.container.ReorderingSeiMessageQueue.SeiConsumer
        public final void consume(long j, ParsableByteArray parsableByteArray) {
            SeiReader.this.lambda$new$0(j, parsableByteArray);
        }
    });

    public SeiReader(List<Format> list, String str) {
        this.closedCaptionFormats = list;
        this.containerMimeType = str;
        this.outputs = new TrackOutput[list.size()];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(long j, ParsableByteArray parsableByteArray) {
        CeaUtil.consume(j, parsableByteArray, this.outputs);
    }

    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        for (int i = 0; i < this.outputs.length; i++) {
            trackIdGenerator.generateNewId();
            TrackOutput track = extractorOutput.track(trackIdGenerator.getTrackId(), 3);
            Format format = this.closedCaptionFormats.get(i);
            String str = format.sampleMimeType;
            Assertions.checkArgument("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            String str2 = format.id;
            if (str2 == null) {
                str2 = trackIdGenerator.getFormatId();
            }
            track.format(new Format.Builder().setId(str2).setContainerMimeType(this.containerMimeType).setSampleMimeType(str).setSelectionFlags(format.selectionFlags).setLanguage(format.language).setAccessibilityChannel(format.accessibilityChannel).setInitializationData(format.initializationData).build());
            this.outputs[i] = track;
        }
    }

    public void setReorderingQueueSize(int i) {
        this.reorderingSeiMessageQueue.setMaxSize(i);
    }

    public void consume(long j, ParsableByteArray parsableByteArray) {
        this.reorderingSeiMessageQueue.add(j, parsableByteArray);
    }

    public void flush() {
        this.reorderingSeiMessageQueue.flush();
    }

    public void clear() {
        this.reorderingSeiMessageQueue.flush();
    }
}

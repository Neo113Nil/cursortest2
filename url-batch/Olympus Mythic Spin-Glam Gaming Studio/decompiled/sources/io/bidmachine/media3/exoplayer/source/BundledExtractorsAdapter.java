package io.bidmachine.media3.exoplayer.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import io.bidmachine.media3.common.DataReader;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.extractor.DefaultExtractorInput;
import io.bidmachine.media3.extractor.Extractor;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.ExtractorOutput;
import io.bidmachine.media3.extractor.ExtractorsFactory;
import io.bidmachine.media3.extractor.PositionHolder;
import io.bidmachine.media3.extractor.mp3.Mp3Extractor;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@UnstableApi
/* loaded from: classes5.dex */
public final class BundledExtractorsAdapter implements ProgressiveMediaExtractor {

    @Nullable
    private Extractor extractor;

    @Nullable
    private ExtractorInput extractorInput;
    private final ExtractorsFactory extractorsFactory;

    public BundledExtractorsAdapter(ExtractorsFactory extractorsFactory) {
        this.extractorsFactory = extractorsFactory;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        if (r6.getPosition() != r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
    
        if (r6.getPosition() != r11) goto L23;
     */
    @Override // io.bidmachine.media3.exoplayer.source.ProgressiveMediaExtractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void init(DataReader dataReader, Uri uri, Map<String, List<String>> map, long j, long j2, ExtractorOutput extractorOutput) throws IOException {
        DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(dataReader, j, j2);
        this.extractorInput = defaultExtractorInput;
        if (this.extractor != null) {
            return;
        }
        Extractor[] createExtractors = this.extractorsFactory.createExtractors(uri, map);
        ImmutableList.Builder builderWithExpectedSize = ImmutableList.builderWithExpectedSize(createExtractors.length);
        if (createExtractors.length == 1) {
            this.extractor = createExtractors[0];
        } else {
            int length = createExtractors.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Extractor extractor = createExtractors[i];
                try {
                } catch (EOFException unused) {
                    if (this.extractor == null) {
                    }
                } catch (Throwable th) {
                    Assertions.checkState(this.extractor != null || defaultExtractorInput.getPosition() == j);
                    defaultExtractorInput.resetPeekPosition();
                    throw th;
                }
                if (extractor.sniff(defaultExtractorInput)) {
                    this.extractor = extractor;
                    Assertions.checkState(true);
                    defaultExtractorInput.resetPeekPosition();
                    break;
                } else {
                    builderWithExpectedSize.addAll((Iterable) extractor.getSniffFailureDetails());
                    if (this.extractor == null) {
                    }
                    boolean z = true;
                    Assertions.checkState(z);
                    defaultExtractorInput.resetPeekPosition();
                    i++;
                }
            }
            if (this.extractor == null) {
                throw new UnrecognizedInputFormatException("None of the available extractors (" + Joiner.on(", ").join(Lists.transform(ImmutableList.copyOf(createExtractors), new Function() { // from class: io.bidmachine.media3.exoplayer.source.BundledExtractorsAdapter$$ExternalSyntheticLambda0
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        String lambda$init$0;
                        lambda$init$0 = BundledExtractorsAdapter.lambda$init$0((Extractor) obj);
                        return lambda$init$0;
                    }
                })) + ") could read the stream.", (Uri) Assertions.checkNotNull(uri), builderWithExpectedSize.build());
            }
        }
        this.extractor.init(extractorOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$init$0(Extractor extractor) {
        return extractor.getUnderlyingImplementation().getClass().getSimpleName();
    }

    @Override // io.bidmachine.media3.exoplayer.source.ProgressiveMediaExtractor
    public void release() {
        Extractor extractor = this.extractor;
        if (extractor != null) {
            extractor.release();
            this.extractor = null;
        }
        this.extractorInput = null;
    }

    @Override // io.bidmachine.media3.exoplayer.source.ProgressiveMediaExtractor
    public void disableSeekingOnMp3Streams() {
        Extractor extractor = this.extractor;
        if (extractor == null) {
            return;
        }
        Extractor underlyingImplementation = extractor.getUnderlyingImplementation();
        if (underlyingImplementation instanceof Mp3Extractor) {
            ((Mp3Extractor) underlyingImplementation).disableSeeking();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.ProgressiveMediaExtractor
    public long getCurrentInputPosition() {
        ExtractorInput extractorInput = this.extractorInput;
        if (extractorInput != null) {
            return extractorInput.getPosition();
        }
        return -1L;
    }

    @Override // io.bidmachine.media3.exoplayer.source.ProgressiveMediaExtractor
    public void seek(long j, long j2) {
        ((Extractor) Assertions.checkNotNull(this.extractor)).seek(j, j2);
    }

    @Override // io.bidmachine.media3.exoplayer.source.ProgressiveMediaExtractor
    public int read(PositionHolder positionHolder) throws IOException {
        return ((Extractor) Assertions.checkNotNull(this.extractor)).read((ExtractorInput) Assertions.checkNotNull(this.extractorInput), positionHolder);
    }
}

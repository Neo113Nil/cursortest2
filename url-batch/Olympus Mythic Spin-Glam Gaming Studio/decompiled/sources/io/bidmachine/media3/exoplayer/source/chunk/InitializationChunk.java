package io.bidmachine.media3.exoplayer.source.chunk;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.datasource.DataSource;
import io.bidmachine.media3.datasource.DataSourceUtil;
import io.bidmachine.media3.datasource.DataSpec;
import io.bidmachine.media3.datasource.StatsDataSource;
import io.bidmachine.media3.exoplayer.source.chunk.ChunkExtractor;
import io.bidmachine.media3.extractor.ChunkIndex;
import io.bidmachine.media3.extractor.DefaultExtractorInput;
import java.io.IOException;

@UnstableApi
/* loaded from: classes5.dex */
public final class InitializationChunk extends Chunk {
    private final ChunkExtractor chunkExtractor;

    @Nullable
    private ChunkIndex chunkIndex;
    private volatile boolean loadCanceled;
    private long nextLoadPosition;
    private ChunkExtractor.TrackOutputProvider trackOutputProvider;

    public InitializationChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i, @Nullable Object obj, ChunkExtractor chunkExtractor) {
        super(dataSource, dataSpec, 2, format, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.chunkExtractor = chunkExtractor;
    }

    public void init(ChunkExtractor.TrackOutputProvider trackOutputProvider) {
        this.trackOutputProvider = trackOutputProvider;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.Loadable
    public void cancelLoad() {
        this.loadCanceled = true;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.Loadable
    public void load() throws IOException {
        if (this.nextLoadPosition == 0) {
            this.chunkExtractor.init(this.trackOutputProvider, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            DataSpec subrange = this.dataSpec.subrange(this.nextLoadPosition);
            StatsDataSource statsDataSource = this.dataSource;
            DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(statsDataSource, subrange.position, statsDataSource.open(subrange));
            while (!this.loadCanceled && this.chunkExtractor.read(defaultExtractorInput)) {
                try {
                } finally {
                    this.nextLoadPosition = defaultExtractorInput.getPosition() - this.dataSpec.position;
                    this.chunkIndex = this.chunkExtractor.getChunkIndex();
                }
            }
        } finally {
            DataSourceUtil.closeQuietly(this.dataSource);
        }
    }

    @Nullable
    public ChunkIndex getChunkIndex() {
        return this.chunkIndex;
    }
}

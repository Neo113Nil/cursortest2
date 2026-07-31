package io.bidmachine.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.Nullable;
import com.google.common.collect.Sets;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Set;

@UnstableApi
/* loaded from: classes4.dex */
public class FileDescriptorDataSource extends BaseDataSource {
    private static final Set<FileDescriptor> inUseFileDescriptors = Sets.newConcurrentHashSet();
    private long bytesRemaining;
    private final FileDescriptor fileDescriptor;

    @Nullable
    private FileInputStream inputStream;
    private final long length;
    private final long offset;
    private boolean opened;

    @Nullable
    private Uri uri;

    public FileDescriptorDataSource(FileDescriptor fileDescriptor, long j, long j2) {
        super(false);
        this.fileDescriptor = (FileDescriptor) Assertions.checkNotNull(fileDescriptor);
        this.offset = j;
        this.length = j2;
    }

    @Override // io.bidmachine.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws DataSourceException {
        try {
            this.uri = dataSpec.uri;
            transferInitializing(dataSpec);
            if (!inUseFileDescriptors.add(this.fileDescriptor)) {
                throw new DataSourceException(new IllegalStateException("Attempted to re-use an already in-use file descriptor"), -2);
            }
            long j = this.length;
            if (j != -1 && dataSpec.position > j) {
                throw new DataSourceException(2008);
            }
            seekFileDescriptor(this.fileDescriptor, this.offset + dataSpec.position);
            FileInputStream fileInputStream = new FileInputStream(this.fileDescriptor);
            this.inputStream = fileInputStream;
            long j2 = this.length;
            if (j2 == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.bytesRemaining = -1L;
                } else {
                    long position = size - channel.position();
                    this.bytesRemaining = position;
                    if (position < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            } else {
                long j3 = j2 - dataSpec.position;
                this.bytesRemaining = j3;
                if (j3 < 0) {
                    throw new DataSourceException(2008);
                }
            }
            long j4 = dataSpec.length;
            if (j4 != -1) {
                long j5 = this.bytesRemaining;
                if (j5 != -1) {
                    j4 = Math.min(j5, j4);
                }
                this.bytesRemaining = j4;
            }
            this.opened = true;
            transferStarted(dataSpec);
            long j6 = dataSpec.length;
            return j6 != -1 ? j6 : this.bytesRemaining;
        } catch (DataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new DataSourceException(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // io.bidmachine.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) throws DataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesRemaining;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            i2 = (int) Math.min(j, i2);
        }
        try {
            int read = ((FileInputStream) Util.castNonNull(this.inputStream)).read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            long j2 = this.bytesRemaining;
            if (j2 != -1) {
                this.bytesRemaining = j2 - read;
            }
            bytesTransferred(read);
            return read;
        } catch (IOException e) {
            throw new DataSourceException(e, 2000);
        }
    }

    @Override // io.bidmachine.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        return this.uri;
    }

    @Override // io.bidmachine.media3.datasource.DataSource
    public void close() throws DataSourceException {
        this.uri = null;
        inUseFileDescriptors.remove(this.fileDescriptor);
        try {
            try {
                FileInputStream fileInputStream = this.inputStream;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                throw new DataSourceException(e, 2000);
            }
        } finally {
            this.inputStream = null;
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
        }
    }

    private static void seekFileDescriptor(FileDescriptor fileDescriptor, long j) throws DataSourceException {
        try {
            Os.lseek(fileDescriptor, j, OsConstants.SEEK_SET);
        } catch (ErrnoException e) {
            throw new DataSourceException(e, 2000);
        }
    }
}
